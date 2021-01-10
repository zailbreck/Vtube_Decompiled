/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package io.flutter.plugins.videoplayer;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugins.videoplayer.Messages;
import io.flutter.plugins.videoplayer.Messages$VideoPlayerApi$1;
import io.flutter.plugins.videoplayer.Messages$VideoPlayerApi$10;
import io.flutter.plugins.videoplayer.Messages$VideoPlayerApi$2;
import io.flutter.plugins.videoplayer.Messages$VideoPlayerApi$3;
import io.flutter.plugins.videoplayer.Messages$VideoPlayerApi$4;
import io.flutter.plugins.videoplayer.Messages$VideoPlayerApi$5;
import io.flutter.plugins.videoplayer.Messages$VideoPlayerApi$6;
import io.flutter.plugins.videoplayer.Messages$VideoPlayerApi$7;
import io.flutter.plugins.videoplayer.Messages$VideoPlayerApi$8;
import io.flutter.plugins.videoplayer.Messages$VideoPlayerApi$9;

public final class f {
    public static void a(BinaryMessenger binaryMessenger, Messages.VideoPlayerApi videoPlayerApi) {
        BasicMessageChannel<Object> basicMessageChannel = new BasicMessageChannel<Object>(binaryMessenger, "dev.flutter.pigeon.VideoPlayerApi.initialize", new StandardMessageCodec());
        if (videoPlayerApi != null) {
            basicMessageChannel.setMessageHandler(new Messages$VideoPlayerApi$1(videoPlayerApi));
        } else {
            basicMessageChannel.setMessageHandler(null);
        }
        BasicMessageChannel<Object> basicMessageChannel2 = new BasicMessageChannel<Object>(binaryMessenger, "dev.flutter.pigeon.VideoPlayerApi.create", new StandardMessageCodec());
        if (videoPlayerApi != null) {
            basicMessageChannel2.setMessageHandler(new Messages$VideoPlayerApi$2(videoPlayerApi));
        } else {
            basicMessageChannel2.setMessageHandler(null);
        }
        BasicMessageChannel<Object> basicMessageChannel3 = new BasicMessageChannel<Object>(binaryMessenger, "dev.flutter.pigeon.VideoPlayerApi.dispose", new StandardMessageCodec());
        if (videoPlayerApi != null) {
            basicMessageChannel3.setMessageHandler(new Messages$VideoPlayerApi$3(videoPlayerApi));
        } else {
            basicMessageChannel3.setMessageHandler(null);
        }
        BasicMessageChannel<Object> basicMessageChannel4 = new BasicMessageChannel<Object>(binaryMessenger, "dev.flutter.pigeon.VideoPlayerApi.setLooping", new StandardMessageCodec());
        if (videoPlayerApi != null) {
            basicMessageChannel4.setMessageHandler(new Messages$VideoPlayerApi$4(videoPlayerApi));
        } else {
            basicMessageChannel4.setMessageHandler(null);
        }
        BasicMessageChannel<Object> basicMessageChannel5 = new BasicMessageChannel<Object>(binaryMessenger, "dev.flutter.pigeon.VideoPlayerApi.setVolume", new StandardMessageCodec());
        if (videoPlayerApi != null) {
            basicMessageChannel5.setMessageHandler(new Messages$VideoPlayerApi$5(videoPlayerApi));
        } else {
            basicMessageChannel5.setMessageHandler(null);
        }
        BasicMessageChannel<Object> basicMessageChannel6 = new BasicMessageChannel<Object>(binaryMessenger, "dev.flutter.pigeon.VideoPlayerApi.play", new StandardMessageCodec());
        if (videoPlayerApi != null) {
            basicMessageChannel6.setMessageHandler(new Messages$VideoPlayerApi$6(videoPlayerApi));
        } else {
            basicMessageChannel6.setMessageHandler(null);
        }
        BasicMessageChannel<Object> basicMessageChannel7 = new BasicMessageChannel<Object>(binaryMessenger, "dev.flutter.pigeon.VideoPlayerApi.position", new StandardMessageCodec());
        if (videoPlayerApi != null) {
            basicMessageChannel7.setMessageHandler(new Messages$VideoPlayerApi$7(videoPlayerApi));
        } else {
            basicMessageChannel7.setMessageHandler(null);
        }
        BasicMessageChannel<Object> basicMessageChannel8 = new BasicMessageChannel<Object>(binaryMessenger, "dev.flutter.pigeon.VideoPlayerApi.seekTo", new StandardMessageCodec());
        if (videoPlayerApi != null) {
            basicMessageChannel8.setMessageHandler(new Messages$VideoPlayerApi$8(videoPlayerApi));
        } else {
            basicMessageChannel8.setMessageHandler(null);
        }
        BasicMessageChannel<Object> basicMessageChannel9 = new BasicMessageChannel<Object>(binaryMessenger, "dev.flutter.pigeon.VideoPlayerApi.pause", new StandardMessageCodec());
        if (videoPlayerApi != null) {
            basicMessageChannel9.setMessageHandler(new Messages$VideoPlayerApi$9(videoPlayerApi));
        } else {
            basicMessageChannel9.setMessageHandler(null);
        }
        BasicMessageChannel<Object> basicMessageChannel10 = new BasicMessageChannel<Object>(binaryMessenger, "dev.flutter.pigeon.VideoPlayerApi.setMixWithOthers", new StandardMessageCodec());
        if (videoPlayerApi != null) {
            basicMessageChannel10.setMessageHandler(new Messages$VideoPlayerApi$10(videoPlayerApi));
            return;
        }
        basicMessageChannel10.setMessageHandler(null);
    }
}

