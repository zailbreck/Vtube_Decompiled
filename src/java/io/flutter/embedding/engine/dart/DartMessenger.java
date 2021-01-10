/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  io.flutter.Log
 *  io.flutter.embedding.engine.FlutterJNI
 *  io.flutter.embedding.engine.dart.PlatformMessageHandler
 *  io.flutter.plugin.common.BinaryMessenger
 *  io.flutter.plugin.common.BinaryMessenger$BinaryMessageHandler
 *  io.flutter.plugin.common.BinaryMessenger$BinaryReply
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.nio.ByteBuffer
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.concurrent.atomic.AtomicBoolean
 */
package io.flutter.embedding.engine.dart;

import io.flutter.Log;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.dart.PlatformMessageHandler;
import io.flutter.plugin.common.BinaryMessenger;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

class DartMessenger
implements BinaryMessenger,
PlatformMessageHandler {
    private static final String TAG = "DartMessenger";
    private final FlutterJNI flutterJNI;
    private final Map<String, BinaryMessenger.BinaryMessageHandler> messageHandlers;
    private int nextReplyId = 1;
    private final Map<Integer, BinaryMessenger.BinaryReply> pendingReplies;

    DartMessenger(FlutterJNI flutterJNI) {
        this.flutterJNI = flutterJNI;
        this.messageHandlers = new HashMap();
        this.pendingReplies = new HashMap();
    }

    public int getPendingChannelResponseCount() {
        return this.pendingReplies.size();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void handleMessageFromDart(String string, byte[] arrby, int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Received message from Dart over channel '");
        stringBuilder.append(string);
        stringBuilder.append("'");
        Log.v((String)TAG, (String)stringBuilder.toString());
        BinaryMessenger.BinaryMessageHandler binaryMessageHandler = (BinaryMessenger.BinaryMessageHandler)this.messageHandlers.get((Object)string);
        if (binaryMessageHandler != null) {
            try {
                Log.v((String)TAG, (String)"Deferring to registered handler to process message.");
                ByteBuffer byteBuffer = arrby == null ? null : ByteBuffer.wrap((byte[])arrby);
                binaryMessageHandler.onMessage(byteBuffer, (BinaryMessenger.BinaryReply)new Reply(this.flutterJNI, n2));
                return;
            }
            catch (Exception exception) {
                Log.e((String)TAG, (String)"Uncaught exception in binary message listener", (Throwable)exception);
            }
        } else {
            Log.v((String)TAG, (String)"No registered handler for message. Responding to Dart with empty reply message.");
        }
        this.flutterJNI.invokePlatformMessageEmptyResponseCallback(n2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void handlePlatformMessageResponse(int n2, byte[] arrby) {
        Log.v((String)TAG, (String)"Received message reply from Dart.");
        BinaryMessenger.BinaryReply binaryReply = (BinaryMessenger.BinaryReply)this.pendingReplies.remove((Object)n2);
        if (binaryReply != null) {
            try {
                Log.v((String)TAG, (String)"Invoking registered callback for reply from Dart.");
                ByteBuffer byteBuffer = arrby == null ? null : ByteBuffer.wrap((byte[])arrby);
                binaryReply.reply(byteBuffer);
                return;
            }
            catch (Exception exception) {
                Log.e((String)TAG, (String)"Uncaught exception in binary message reply handler", (Throwable)exception);
            }
        }
    }

    public void send(String string, ByteBuffer byteBuffer) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Sending message over channel '");
        stringBuilder.append(string);
        stringBuilder.append("'");
        Log.v((String)TAG, (String)stringBuilder.toString());
        this.send(string, byteBuffer, null);
    }

    public void send(String string, ByteBuffer byteBuffer, BinaryMessenger.BinaryReply binaryReply) {
        int n2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Sending message with callback over channel '");
        stringBuilder.append(string);
        stringBuilder.append("'");
        Log.v((String)TAG, (String)stringBuilder.toString());
        if (binaryReply != null) {
            n2 = this.nextReplyId;
            this.nextReplyId = n2 + 1;
            this.pendingReplies.put((Object)n2, (Object)binaryReply);
        } else {
            n2 = 0;
        }
        if (byteBuffer == null) {
            this.flutterJNI.dispatchEmptyPlatformMessage(string, n2);
            return;
        }
        this.flutterJNI.dispatchPlatformMessage(string, byteBuffer, byteBuffer.position(), n2);
    }

    public void setMessageHandler(String string, BinaryMessenger.BinaryMessageHandler binaryMessageHandler) {
        if (binaryMessageHandler == null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Removing handler for channel '");
            stringBuilder.append(string);
            stringBuilder.append("'");
            Log.v((String)TAG, (String)stringBuilder.toString());
            this.messageHandlers.remove((Object)string);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Setting handler for channel '");
        stringBuilder.append(string);
        stringBuilder.append("'");
        Log.v((String)TAG, (String)stringBuilder.toString());
        this.messageHandlers.put((Object)string, (Object)binaryMessageHandler);
    }

    private static class Reply
    implements BinaryMessenger.BinaryReply {
        private final AtomicBoolean done = new AtomicBoolean(false);
        private final FlutterJNI flutterJNI;
        private final int replyId;

        Reply(FlutterJNI flutterJNI, int n2) {
            this.flutterJNI = flutterJNI;
            this.replyId = n2;
        }

        public void reply(ByteBuffer byteBuffer) {
            if (!this.done.getAndSet(true)) {
                if (byteBuffer == null) {
                    this.flutterJNI.invokePlatformMessageEmptyResponseCallback(this.replyId);
                    return;
                }
                this.flutterJNI.invokePlatformMessageResponseCallback(this.replyId, byteBuffer, byteBuffer.position());
                return;
            }
            throw new IllegalStateException("Reply already submitted");
        }
    }

}

