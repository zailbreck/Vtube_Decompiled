/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  io.flutter.plugin.common.BasicMessageChannel
 *  io.flutter.plugin.common.BasicMessageChannel$MessageHandler
 *  io.flutter.plugin.common.BasicMessageChannel$Reply
 *  io.flutter.plugins.videoplayer.Messages
 *  io.flutter.plugins.videoplayer.Messages$MixWithOthersMessage
 *  io.flutter.plugins.videoplayer.Messages$VideoPlayerApi
 *  java.lang.Exception
 *  java.lang.Object
 *  java.util.HashMap
 */
package io.flutter.plugins.videoplayer;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.videoplayer.Messages;
import java.util.HashMap;

final class Messages$VideoPlayerApi$10
implements BasicMessageChannel.MessageHandler<Object> {
    final /* synthetic */ Messages.VideoPlayerApi val$api;

    Messages$VideoPlayerApi$10(Messages.VideoPlayerApi videoPlayerApi) {
        this.val$api = videoPlayerApi;
    }

    public void onMessage(Object object, BasicMessageChannel.Reply<Object> reply) {
        Messages.MixWithOthersMessage mixWithOthersMessage = Messages.MixWithOthersMessage.fromMap((HashMap)((HashMap)object));
        HashMap hashMap = new HashMap();
        try {
            this.val$api.setMixWithOthers(mixWithOthersMessage);
            hashMap.put((Object)"result", null);
        }
        catch (Exception exception) {
            hashMap.put((Object)"error", (Object)Messages.access$000((Exception)exception));
        }
        reply.reply((Object)hashMap);
    }
}

