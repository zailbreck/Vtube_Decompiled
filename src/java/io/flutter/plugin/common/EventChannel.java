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
 *  java.util.concurrent.atomic.AtomicBoolean
 *  java.util.concurrent.atomic.AtomicReference
 */
package io.flutter.plugin.common;

import android.util.Log;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodCodec;
import io.flutter.plugin.common.StandardMethodCodec;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

public final class EventChannel {
    private static final String TAG = "EventChannel#";
    private final MethodCodec codec;
    private final BinaryMessenger messenger;
    private final String name;

    public EventChannel(BinaryMessenger binaryMessenger, String string2) {
        super(binaryMessenger, string2, StandardMethodCodec.INSTANCE);
    }

    public EventChannel(BinaryMessenger binaryMessenger, String string2, MethodCodec methodCodec) {
        this.messenger = binaryMessenger;
        this.name = string2;
        this.codec = methodCodec;
    }

    public void setStreamHandler(StreamHandler streamHandler) {
        BinaryMessenger binaryMessenger = this.messenger;
        String string2 = this.name;
        BinaryMessenger.BinaryMessageHandler binaryMessageHandler = streamHandler == null ? null : new BinaryMessenger.BinaryMessageHandler(streamHandler){
            private final AtomicReference<EventSink> activeSink = new AtomicReference(null);
            private final StreamHandler handler;
            {
                this.handler = streamHandler;
            }

            private void onCancel(Object object, BinaryMessenger.BinaryReply binaryReply) {
                ByteBuffer byteBuffer;
                if ((EventSink)this.activeSink.getAndSet(null) != null) {
                    try {
                        this.handler.onCancel(object);
                        binaryReply.reply(EventChannel.this.codec.encodeSuccessEnvelope(null));
                        return;
                    }
                    catch (RuntimeException runtimeException) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(EventChannel.TAG);
                        stringBuilder.append(EventChannel.this.name);
                        Log.e((String)stringBuilder.toString(), (String)"Failed to close event stream", (Throwable)runtimeException);
                        byteBuffer = EventChannel.this.codec.encodeErrorEnvelope("error", runtimeException.getMessage(), null);
                    }
                } else {
                    byteBuffer = EventChannel.this.codec.encodeErrorEnvelope("error", "No active stream to cancel", null);
                }
                binaryReply.reply(byteBuffer);
            }

            private void onListen(Object object, BinaryMessenger.BinaryReply binaryReply) {
                EventSinkImplementation eventSinkImplementation = new EventSinkImplementation(this, null);
                if ((EventSink)this.activeSink.getAndSet((Object)eventSinkImplementation) != null) {
                    try {
                        this.handler.onCancel(null);
                    }
                    catch (RuntimeException runtimeException) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(EventChannel.TAG);
                        stringBuilder.append(EventChannel.this.name);
                        Log.e((String)stringBuilder.toString(), (String)"Failed to close existing event stream", (Throwable)runtimeException);
                    }
                }
                try {
                    this.handler.onListen(object, eventSinkImplementation);
                    binaryReply.reply(EventChannel.this.codec.encodeSuccessEnvelope(null));
                    return;
                }
                catch (RuntimeException runtimeException) {
                    this.activeSink.set(null);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(EventChannel.TAG);
                    stringBuilder.append(EventChannel.this.name);
                    Log.e((String)stringBuilder.toString(), (String)"Failed to open event stream", (Throwable)runtimeException);
                    binaryReply.reply(EventChannel.this.codec.encodeErrorEnvelope("error", runtimeException.getMessage(), null));
                    return;
                }
            }

            @Override
            public void onMessage(ByteBuffer byteBuffer, BinaryMessenger.BinaryReply binaryReply) {
                MethodCall methodCall = EventChannel.this.codec.decodeMethodCall(byteBuffer);
                if (methodCall.method.equals((Object)"listen")) {
                    IncomingStreamRequestHandler.super.onListen(methodCall.arguments, binaryReply);
                    return;
                }
                if (methodCall.method.equals((Object)"cancel")) {
                    IncomingStreamRequestHandler.super.onCancel(methodCall.arguments, binaryReply);
                    return;
                }
                binaryReply.reply(null);
            }

            private final class EventSinkImplementation
            implements EventSink {
                final AtomicBoolean hasEnded;
                final /* synthetic */ IncomingStreamRequestHandler this$1;

                private EventSinkImplementation(IncomingStreamRequestHandler incomingStreamRequestHandler) {
                    this.this$1 = incomingStreamRequestHandler;
                    this.hasEnded = new AtomicBoolean(false);
                }

                /* synthetic */ EventSinkImplementation(IncomingStreamRequestHandler incomingStreamRequestHandler, 1 var2_2) {
                    super(incomingStreamRequestHandler);
                }

                @Override
                public void endOfStream() {
                    if (!this.hasEnded.getAndSet(true)) {
                        if (this.this$1.activeSink.get() != this) {
                            return;
                        }
                        this.this$1.EventChannel.this.messenger.send(this.this$1.EventChannel.this.name, null);
                    }
                }

                @Override
                public void error(String string2, String string3, Object object) {
                    if (!this.hasEnded.get()) {
                        if (this.this$1.activeSink.get() != this) {
                            return;
                        }
                        this.this$1.EventChannel.this.messenger.send(this.this$1.EventChannel.this.name, this.this$1.EventChannel.this.codec.encodeErrorEnvelope(string2, string3, object));
                    }
                }

                @Override
                public void success(Object object) {
                    if (!this.hasEnded.get()) {
                        if (this.this$1.activeSink.get() != this) {
                            return;
                        }
                        this.this$1.EventChannel.this.messenger.send(this.this$1.EventChannel.this.name, this.this$1.EventChannel.this.codec.encodeSuccessEnvelope(object));
                    }
                }
            }

        };
        binaryMessenger.setMessageHandler(string2, binaryMessageHandler);
    }

    public static interface EventSink {
        public void endOfStream();

        public void error(String var1, String var2, Object var3);

        public void success(Object var1);
    }

    public static interface StreamHandler {
        public void onCancel(Object var1);

        public void onListen(Object var1, EventSink var2);
    }

}

