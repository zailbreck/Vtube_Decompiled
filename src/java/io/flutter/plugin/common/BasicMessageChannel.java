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
 *  java.nio.charset.Charset
 *  java.util.Locale
 */
package io.flutter.plugin.common;

import android.util.Log;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Locale;

public final class BasicMessageChannel<T> {
    public static final String CHANNEL_BUFFERS_CHANNEL = "dev.flutter/channel-buffers";
    private static final String TAG = "BasicMessageChannel#";
    private final MessageCodec<T> codec;
    private final BinaryMessenger messenger;
    private final String name;

    public BasicMessageChannel(BinaryMessenger binaryMessenger, String string2, MessageCodec<T> messageCodec) {
        this.messenger = binaryMessenger;
        this.name = string2;
        this.codec = messageCodec;
    }

    static void resizeChannelBuffer(BinaryMessenger binaryMessenger, String string2, int n2) {
        Charset charset = Charset.forName((String)"UTF-8");
        Locale locale = Locale.US;
        Object[] arrobject = new Object[]{string2, n2};
        binaryMessenger.send(CHANNEL_BUFFERS_CHANNEL, ByteBuffer.wrap((byte[])String.format((Locale)locale, (String)"resize\r%s\r%d", (Object[])arrobject).getBytes(charset)));
    }

    public void resizeChannelBuffer(int n2) {
        BasicMessageChannel.resizeChannelBuffer(this.messenger, this.name, n2);
    }

    public void send(T t2) {
        this.send(t2, null);
    }

    public void send(T t2, Reply<T> reply) {
        BinaryMessenger binaryMessenger = this.messenger;
        String string2 = this.name;
        ByteBuffer byteBuffer = this.codec.encodeMessage(t2);
        BinaryMessenger.BinaryReply binaryReply = reply == null ? null : new BinaryMessenger.BinaryReply((BasicMessageChannel)this, reply, null){
            private final Reply<T> callback;
            final /* synthetic */ BasicMessageChannel this$0;
            {
                this.this$0 = basicMessageChannel;
                this.callback = reply;
            }

            @Override
            public void reply(ByteBuffer byteBuffer) {
                try {
                    this.callback.reply(this.this$0.codec.decodeMessage(byteBuffer));
                    return;
                }
                catch (RuntimeException runtimeException) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(BasicMessageChannel.TAG);
                    stringBuilder.append(this.this$0.name);
                    Log.e((String)stringBuilder.toString(), (String)"Failed to handle message reply", (Throwable)runtimeException);
                    return;
                }
            }
        };
        binaryMessenger.send(string2, byteBuffer, binaryReply);
    }

    public void setMessageHandler(MessageHandler<T> messageHandler) {
        BinaryMessenger binaryMessenger = this.messenger;
        String string2 = this.name;
        BinaryMessenger.BinaryMessageHandler binaryMessageHandler = messageHandler == null ? null : new BinaryMessenger.BinaryMessageHandler((BasicMessageChannel)this, messageHandler, null){
            private final MessageHandler<T> handler;
            final /* synthetic */ BasicMessageChannel this$0;
            {
                this.this$0 = basicMessageChannel;
                this.handler = messageHandler;
            }

            @Override
            public void onMessage(ByteBuffer byteBuffer, final BinaryMessenger.BinaryReply binaryReply) {
                try {
                    this.handler.onMessage(this.this$0.codec.decodeMessage(byteBuffer), new Reply<T>(){

                        @Override
                        public void reply(T t2) {
                            binaryReply.reply(IncomingMessageHandler.this.this$0.codec.encodeMessage(t2));
                        }
                    });
                    return;
                }
                catch (RuntimeException runtimeException) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(BasicMessageChannel.TAG);
                    stringBuilder.append(this.this$0.name);
                    Log.e((String)stringBuilder.toString(), (String)"Failed to handle message", (Throwable)runtimeException);
                    binaryReply.reply(null);
                    return;
                }
            }

        };
        binaryMessenger.setMessageHandler(string2, binaryMessageHandler);
    }

    public static interface MessageHandler<T> {
        public void onMessage(T var1, Reply<T> var2);
    }

    public static interface Reply<T> {
        public void reply(T var1);
    }

}

