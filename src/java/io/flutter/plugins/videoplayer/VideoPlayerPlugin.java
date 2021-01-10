/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 *  android.util.LongSparseArray
 *  io.flutter.embedding.engine.FlutterEngine
 *  io.flutter.embedding.engine.plugins.FlutterPlugin
 *  io.flutter.embedding.engine.plugins.FlutterPlugin$FlutterPluginBinding
 *  io.flutter.plugin.common.BinaryMessenger
 *  io.flutter.plugin.common.EventChannel
 *  io.flutter.plugin.common.PluginRegistry
 *  io.flutter.plugin.common.PluginRegistry$Registrar
 *  io.flutter.plugin.common.PluginRegistry$ViewDestroyListener
 *  io.flutter.plugins.videoplayer.Messages
 *  io.flutter.plugins.videoplayer.Messages$CreateMessage
 *  io.flutter.plugins.videoplayer.Messages$LoopingMessage
 *  io.flutter.plugins.videoplayer.Messages$MixWithOthersMessage
 *  io.flutter.plugins.videoplayer.Messages$PositionMessage
 *  io.flutter.plugins.videoplayer.Messages$TextureMessage
 *  io.flutter.plugins.videoplayer.Messages$VideoPlayerApi
 *  io.flutter.plugins.videoplayer.Messages$VolumeMessage
 *  io.flutter.plugins.videoplayer.VideoPlayer
 *  io.flutter.plugins.videoplayer.VideoPlayerOptions
 *  io.flutter.plugins.videoplayer.VideoPlayerPlugin$FlutterState
 *  io.flutter.plugins.videoplayer.VideoPlayerPlugin$KeyForAssetAndPackageName
 *  io.flutter.plugins.videoplayer.VideoPlayerPlugin$KeyForAssetFn
 *  io.flutter.view.FlutterNativeView
 *  io.flutter.view.TextureRegistry
 *  io.flutter.view.TextureRegistry$SurfaceTextureEntry
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package io.flutter.plugins.videoplayer;

import android.content.Context;
import android.util.Log;
import android.util.LongSparseArray;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.videoplayer.Messages;
import io.flutter.plugins.videoplayer.VideoPlayer;
import io.flutter.plugins.videoplayer.VideoPlayerOptions;
import io.flutter.plugins.videoplayer.VideoPlayerPlugin;
import io.flutter.plugins.videoplayer.a;
import io.flutter.plugins.videoplayer.b;
import io.flutter.plugins.videoplayer.c;
import io.flutter.plugins.videoplayer.d;
import io.flutter.plugins.videoplayer.e;
import io.flutter.view.FlutterNativeView;
import io.flutter.view.TextureRegistry;

/*
 * Exception performing whole class analysis.
 * Exception performing whole class analysis ignored.
 */
public class VideoPlayerPlugin
implements FlutterPlugin,
Messages.VideoPlayerApi {
    private static final String TAG = "VideoPlayerPlugin";
    private FlutterState flutterState;
    private VideoPlayerOptions options;
    private final LongSparseArray<VideoPlayer> videoPlayers;

    public VideoPlayerPlugin() {
        this.videoPlayers = new LongSparseArray();
        this.options = new VideoPlayerOptions();
    }

    private VideoPlayerPlugin(PluginRegistry.Registrar registrar) {
        FlutterState flutterState;
        this.videoPlayers = new LongSparseArray();
        this.options = new VideoPlayerOptions();
        Context context = registrar.context();
        BinaryMessenger binaryMessenger = registrar.messenger();
        registrar.getClass();
        c c2 = new c(registrar);
        registrar.getClass();
        this.flutterState = flutterState = new /* Unavailable Anonymous Inner Class!! */;
        this.flutterState.startListening((VideoPlayerPlugin)this, registrar.messenger());
    }

    static /* synthetic */ boolean a(VideoPlayerPlugin videoPlayerPlugin, FlutterNativeView flutterNativeView) {
        videoPlayerPlugin.onDestroy();
        return false;
    }

    private void disposeAllPlayers() {
        for (int i2 = 0; i2 < this.videoPlayers.size(); ++i2) {
            ((VideoPlayer)this.videoPlayers.valueAt(i2)).dispose();
        }
        this.videoPlayers.clear();
    }

    private void onDestroy() {
        this.disposeAllPlayers();
    }

    public static void registerWith(PluginRegistry.Registrar registrar) {
        registrar.addViewDestroyListener((PluginRegistry.ViewDestroyListener)new d(new VideoPlayerPlugin(registrar)));
    }

    public Messages.TextureMessage create(Messages.CreateMessage createMessage) {
        VideoPlayer videoPlayer;
        TextureRegistry.SurfaceTextureEntry surfaceTextureEntry = FlutterState.access$000(this.flutterState).createSurfaceTexture();
        BinaryMessenger binaryMessenger = FlutterState.access$100(this.flutterState);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("flutter.io/videoPlayer/videoEvents");
        stringBuilder.append(surfaceTextureEntry.id());
        EventChannel eventChannel = new EventChannel(binaryMessenger, stringBuilder.toString());
        if (createMessage.getAsset() != null) {
            String string = createMessage.getPackageName() != null ? FlutterState.access$200(this.flutterState).get(createMessage.getAsset(), createMessage.getPackageName()) : FlutterState.access$300(this.flutterState).get(createMessage.getAsset());
            Context context = FlutterState.access$400(this.flutterState);
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("asset:///");
            stringBuilder2.append(string);
            String string2 = stringBuilder2.toString();
            VideoPlayerOptions videoPlayerOptions = this.options;
            videoPlayer = new VideoPlayer(context, eventChannel, surfaceTextureEntry, string2, null, videoPlayerOptions);
        } else {
            Context context = FlutterState.access$400(this.flutterState);
            String string = createMessage.getUri();
            String string3 = createMessage.getFormatHint();
            VideoPlayerOptions videoPlayerOptions = this.options;
            videoPlayer = new VideoPlayer(context, eventChannel, surfaceTextureEntry, string, string3, videoPlayerOptions);
        }
        this.videoPlayers.put(surfaceTextureEntry.id(), (Object)videoPlayer);
        Messages.TextureMessage textureMessage = new Messages.TextureMessage();
        textureMessage.setTextureId(Long.valueOf((long)surfaceTextureEntry.id()));
        return textureMessage;
    }

    public void dispose(Messages.TextureMessage textureMessage) {
        ((VideoPlayer)this.videoPlayers.get(textureMessage.getTextureId().longValue())).dispose();
        this.videoPlayers.remove(textureMessage.getTextureId().longValue());
    }

    public void initialize() {
        this.disposeAllPlayers();
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        FlutterState flutterState;
        this.flutterState = flutterState = new /* Unavailable Anonymous Inner Class!! */;
        this.flutterState.startListening((VideoPlayerPlugin)this, flutterPluginBinding.getBinaryMessenger());
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        if (this.flutterState == null) {
            Log.wtf((String)"VideoPlayerPlugin", (String)"Detached from the engine before registering to it.");
        }
        this.flutterState.stopListening(flutterPluginBinding.getBinaryMessenger());
        this.flutterState = null;
    }

    public void pause(Messages.TextureMessage textureMessage) {
        ((VideoPlayer)this.videoPlayers.get(textureMessage.getTextureId().longValue())).pause();
    }

    public void play(Messages.TextureMessage textureMessage) {
        ((VideoPlayer)this.videoPlayers.get(textureMessage.getTextureId().longValue())).play();
    }

    public Messages.PositionMessage position(Messages.TextureMessage textureMessage) {
        VideoPlayer videoPlayer = (VideoPlayer)this.videoPlayers.get(textureMessage.getTextureId().longValue());
        Messages.PositionMessage positionMessage = new Messages.PositionMessage();
        positionMessage.setPosition(Long.valueOf((long)videoPlayer.getPosition()));
        videoPlayer.sendBufferingUpdate();
        return positionMessage;
    }

    public void seekTo(Messages.PositionMessage positionMessage) {
        ((VideoPlayer)this.videoPlayers.get(positionMessage.getTextureId().longValue())).seekTo(positionMessage.getPosition().intValue());
    }

    public void setLooping(Messages.LoopingMessage loopingMessage) {
        ((VideoPlayer)this.videoPlayers.get(loopingMessage.getTextureId().longValue())).setLooping(loopingMessage.getIsLooping().booleanValue());
    }

    public void setMixWithOthers(Messages.MixWithOthersMessage mixWithOthersMessage) {
        this.options.mixWithOthers = mixWithOthersMessage.getMixWithOthers();
    }

    public void setVolume(Messages.VolumeMessage volumeMessage) {
        ((VideoPlayer)this.videoPlayers.get(volumeMessage.getTextureId().longValue())).setVolume(volumeMessage.getVolume().doubleValue());
    }
}

