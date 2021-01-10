/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  io.flutter.plugin.common.BasicMessageChannel
 *  io.flutter.plugin.common.BasicMessageChannel$MessageHandler
 *  io.flutter.plugin.common.BasicMessageChannel$Reply
 *  io.flutter.plugins.videoplayer.Messages
 *  io.flutter.plugins.videoplayer.Messages$PositionMessage
 *  io.flutter.plugins.videoplayer.Messages$TextureMessage
 *  io.flutter.plugins.videoplayer.Messages$VideoPlayerApi
 *  java.lang.Exception
 *  java.lang.Object
 *  java.util.HashMap
 */
package io.flutter.plugins.videoplayer;

import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugins.videoplayer.Messages;
import java.util.HashMap;

final class Messages$VideoPlayerApi$7
implements BasicMessageChannel.MessageHandler<Object> {
    final /* synthetic */ Messages.VideoPlayerApi val$api;

    Messages$VideoPlayerApi$7(Messages.VideoPlayerApi videoPlayerApi) {
        this.val$api = videoPlayerApi;
    }

    public void onMessage(Object object, BasicMessageChannel.Reply<Object> reply) {
        Messages.TextureMessage textureMessage = Messages.TextureMessage.fromMap((HashMap)((HashMap)object));
        HashMap hashMap = new HashMap();
        try {
            hashMap.put((Object)"result", (Object)this.val$api.position(textureMessage).toMap());
        }
        catch (Exception exception) {
            hashMap.put((Object)"error", (Object)Messages.access$000((Exception)exception));
        }
        reply.reply((Object)hashMap);
    }
}

