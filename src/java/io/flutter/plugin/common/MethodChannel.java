/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.nio.ByteBuffer
 */
package io.flutter.plugin.common;

import android.util.Log;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.FlutterException;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodCodec;
import io.flutter.plugin.common.StandardMethodCodec;
import java.nio.ByteBuffer;

public final class MethodChannel {
    private static final String TAG = "MethodChannel#";
    private final MethodCodec codec;
    private final BinaryMessenger messenger;
    private final String name;

    public MethodChannel(BinaryMessenger binaryMessenger, String string2) {
        super(binaryMessenger, string2, StandardMethodCodec.INSTANCE);
    }

    public MethodChannel(BinaryMessenger binaryMessenger, String string2, MethodCodec methodCodec) {
        this.messenger = binaryMessenger;
        this.name = string2;
        this.codec = methodCodec;
    }

    public void invokeMethod(String string2, Object object) {
        this.invokeMethod(string2, object, null);
    }

    public void invokeMethod(String string2, Object object, Result result) {
        BinaryMessenger binaryMessenger = this.messenger;
        String string3 = this.name;
        ByteBuffer byteBuffer = this.codec.encodeMethodCall(new MethodCall(string2, object));
        BinaryMessenger.BinaryReply binaryReply = result == null ? null : new BinaryMessenger.BinaryReply(result){
            private final Result callback;
            {
                this.callback = result;
            }

            /*
             * Unable to fully structure code
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Lifted jumps to return sites
             */
            @Override
            public void reply(ByteBuffer var1) {
                block4 : {
                    if (var1 != null) ** GOTO lbl6
                    try {
                        this.callback.notImplemented();
                        return;
lbl6: // 2 sources:
                        this.callback.success(MethodChannel.access$000(MethodChannel.this).decodeEnvelope(var1));
                        return;
                    }
                    catch (RuntimeException var3_2) {
                        break block4;
                    }
                    catch (FlutterException var2_3) {
                        this.callback.error(var2_3.code, var2_3.getMessage(), var2_3.details);
                        return;
                    }
                }
                var4_4 = new StringBuilder();
                var4_4.append("MethodChannel#");
                var4_4.append(MethodChannel.access$100(MethodChannel.this));
                Log.e((String)var4_4.toString(), (String)"Failed to handle method call result", (Throwable)var3_2);
            }
        };
        binaryMessenger.send(string3, byteBuffer, binaryReply);
    }

    public void resizeChannelBuffer(int n2) {
        BasicMessageChannel.resizeChannelBuffer(this.messenger, this.name, n2);
    }

    public void setMethodCallHandler(MethodCallHandler methodCallHandler) {
        BinaryMessenger binaryMessenger = this.messenger;
        String string2 = this.name;
        BinaryMessenger.BinaryMessageHandler binaryMessageHandler = methodCallHandler == null ? null : new BinaryMessenger.BinaryMessageHandler(methodCallHandler){
            private final MethodCallHandler handler;
            {
                this.handler = methodCallHandler;
            }

            @Override
            public void onMessage(ByteBuffer byteBuffer, final BinaryMessenger.BinaryReply binaryReply) {
                MethodCall methodCall = MethodChannel.this.codec.decodeMethodCall(byteBuffer);
                try {
                    this.handler.onMethodCall(methodCall, new Result(){

                        @Override
                        public void error(String string2, String string3, Object object) {
                            binaryReply.reply(MethodChannel.this.codec.encodeErrorEnvelope(string2, string3, object));
                        }

                        @Override
                        public void notImplemented() {
                            binaryReply.reply(null);
                        }

                        @Override
                        public void success(Object object) {
                            binaryReply.reply(MethodChannel.this.codec.encodeSuccessEnvelope(object));
                        }
                    });
                    return;
                }
                catch (RuntimeException runtimeException) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(MethodChannel.TAG);
                    stringBuilder.append(MethodChannel.this.name);
                    Log.e((String)stringBuilder.toString(), (String)"Failed to handle method call", (Throwable)runtimeException);
                    binaryReply.reply(MethodChannel.this.codec.encodeErrorEnvelope("error", runtimeException.getMessage(), null));
                    return;
                }
            }

        };
        binaryMessenger.setMessageHandler(string2, binaryMessageHandler);
    }

    public static interface MethodCallHandler {
        public void onMethodCall(MethodCall var1, Result var2);
    }

    public static interface Result {
        public void error(String var1, String var2, Object var3);

        public void notImplemented();

        public void success(Object var1);
    }

}

