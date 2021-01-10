/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.SurfaceTexture
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.Surface
 *  com.google.android.exoplayer2.Format
 *  com.google.android.exoplayer2.a1.i
 *  com.google.android.exoplayer2.a1.i$b
 *  com.google.android.exoplayer2.d1.e
 *  com.google.android.exoplayer2.d1.j
 *  com.google.android.exoplayer2.g1.h0
 *  com.google.android.exoplayer2.g1.m
 *  com.google.android.exoplayer2.g1.m$a
 *  com.google.android.exoplayer2.g1.t
 *  com.google.android.exoplayer2.g1.v
 *  com.google.android.exoplayer2.h1.i0
 *  com.google.android.exoplayer2.m0
 *  com.google.android.exoplayer2.m0$c
 *  com.google.android.exoplayer2.source.dash.DashMediaSource
 *  com.google.android.exoplayer2.source.dash.DashMediaSource$Factory
 *  com.google.android.exoplayer2.source.dash.c
 *  com.google.android.exoplayer2.source.dash.c$a
 *  com.google.android.exoplayer2.source.dash.h
 *  com.google.android.exoplayer2.source.dash.h$a
 *  com.google.android.exoplayer2.source.hls.HlsMediaSource
 *  com.google.android.exoplayer2.source.hls.HlsMediaSource$Factory
 *  com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource
 *  com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource$Factory
 *  com.google.android.exoplayer2.source.smoothstreaming.b
 *  com.google.android.exoplayer2.source.smoothstreaming.b$a
 *  com.google.android.exoplayer2.source.smoothstreaming.c
 *  com.google.android.exoplayer2.source.smoothstreaming.c$a
 *  com.google.android.exoplayer2.source.u
 *  com.google.android.exoplayer2.source.u$b
 *  com.google.android.exoplayer2.source.x
 *  com.google.android.exoplayer2.trackselection.DefaultTrackSelector
 *  com.google.android.exoplayer2.trackselection.h
 *  com.google.android.exoplayer2.w0
 *  com.google.android.exoplayer2.z
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 *  java.util.Collections
 *  java.util.HashMap
 */
package io.flutter.plugins.videoplayer;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.os.Build;
import android.view.Surface;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.a1.i;
import com.google.android.exoplayer2.d1.e;
import com.google.android.exoplayer2.d1.j;
import com.google.android.exoplayer2.g1.h0;
import com.google.android.exoplayer2.g1.m;
import com.google.android.exoplayer2.g1.t;
import com.google.android.exoplayer2.g1.v;
import com.google.android.exoplayer2.h1.i0;
import com.google.android.exoplayer2.m0;
import com.google.android.exoplayer2.source.dash.DashMediaSource;
import com.google.android.exoplayer2.source.dash.c;
import com.google.android.exoplayer2.source.dash.h;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.SsMediaSource;
import com.google.android.exoplayer2.source.smoothstreaming.b;
import com.google.android.exoplayer2.source.smoothstreaming.c;
import com.google.android.exoplayer2.source.u;
import com.google.android.exoplayer2.source.x;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.w0;
import com.google.android.exoplayer2.z;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugins.videoplayer.QueuingEventSink;
import io.flutter.plugins.videoplayer.VideoPlayer;
import io.flutter.plugins.videoplayer.VideoPlayerOptions;
import io.flutter.view.TextureRegistry;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

final class VideoPlayer {
    private static final String FORMAT_DASH = "dash";
    private static final String FORMAT_HLS = "hls";
    private static final String FORMAT_OTHER = "other";
    private static final String FORMAT_SS = "ss";
    private final EventChannel eventChannel;
    private QueuingEventSink eventSink = new QueuingEventSink();
    private w0 exoPlayer;
    private boolean isInitialized = false;
    private final VideoPlayerOptions options;
    private Surface surface;
    private final TextureRegistry.SurfaceTextureEntry textureEntry;

    VideoPlayer(Context context, EventChannel eventChannel, TextureRegistry.SurfaceTextureEntry surfaceTextureEntry, String string2, String string3, VideoPlayerOptions videoPlayerOptions) {
        this.eventChannel = eventChannel;
        this.textureEntry = surfaceTextureEntry;
        this.options = videoPlayerOptions;
        this.exoPlayer = z.a((Context)context, (com.google.android.exoplayer2.trackselection.h)new DefaultTrackSelector());
        Uri uri = Uri.parse((String)string2);
        Object object = VideoPlayer.isHTTP(uri) ? new v("ExoPlayer", null, 8000, 8000, true) : new t(context, "ExoPlayer");
        x x2 = this.buildMediaSource(uri, (m.a)object, string3, context);
        this.exoPlayer.a(x2);
        this.setupVideoPlayer(eventChannel, surfaceTextureEntry);
    }

    static /* synthetic */ QueuingEventSink access$000(VideoPlayer videoPlayer) {
        return videoPlayer.eventSink;
    }

    static /* synthetic */ boolean access$100(VideoPlayer videoPlayer) {
        return videoPlayer.isInitialized;
    }

    static /* synthetic */ boolean access$102(VideoPlayer videoPlayer, boolean bl) {
        videoPlayer.isInitialized = bl;
        return bl;
    }

    static /* synthetic */ void access$200(VideoPlayer videoPlayer) {
        videoPlayer.sendInitialized();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private x buildMediaSource(Uri var1_2, m.a var2_4, String var3_3, Context var4) {
        block7 : {
            block11 : {
                block8 : {
                    block9 : {
                        block10 : {
                            block6 : {
                                if (var3_3 != null) break block6;
                                var7_5 = i0.c((String)var1_2.getLastPathSegment());
                                break block7;
                            }
                            var5_6 = var3_3.hashCode();
                            if (var5_6 == 3680) break block8;
                            if (var5_6 == 103407) break block9;
                            if (var5_6 == 3075986) break block10;
                            if (var5_6 != 106069776 || !var3_3.equals((Object)"other")) ** GOTO lbl-1000
                            var6_7 = 3;
                            break block11;
                        }
                        if (!var3_3.equals((Object)"dash")) ** GOTO lbl-1000
                        var6_7 = 1;
                        break block11;
                    }
                    if (!var3_3.equals((Object)"hls")) ** GOTO lbl-1000
                    var6_7 = 2;
                    break block11;
                }
                if (var3_3.equals((Object)"ss")) {
                    var6_7 = 0;
                } else lbl-1000: // 4 sources:
                {
                    var6_7 = -1;
                }
            }
            if (var6_7 != 0) {
                var7_5 = 0;
                if (var6_7 != 1) {
                    var7_5 = var6_7 != 2 ? (var6_7 != 3 ? -1 : 3) : 2;
                }
            } else {
                var7_5 = 1;
            }
        }
        if (var7_5 == 0) return new DashMediaSource.Factory((c.a)new h.a(var2_4), (m.a)new t(var4, null, var2_4)).a(var1_2);
        if (var7_5 == 1) return new SsMediaSource.Factory((c.a)new b.a(var2_4), (m.a)new t(var4, null, var2_4)).a(var1_2);
        if (var7_5 == 2) return new HlsMediaSource.Factory(var2_4).a(var1_2);
        if (var7_5 == 3) {
            var8_8 = new u.b(var2_4);
            var8_8.a((j)new e());
            return var8_8.a(var1_2);
        }
        var10_9 = new StringBuilder();
        var10_9.append("Unsupported type: ");
        var10_9.append(var7_5);
        throw new IllegalStateException(var10_9.toString());
    }

    private static boolean isHTTP(Uri uri) {
        boolean bl;
        block4 : {
            block5 : {
                bl = false;
                if (uri == null) break block4;
                if (uri.getScheme() == null) {
                    return false;
                }
                String string2 = uri.getScheme();
                if (string2.equals((Object)"http")) break block5;
                boolean bl2 = string2.equals((Object)"https");
                bl = false;
                if (!bl2) break block4;
            }
            bl = true;
        }
        return bl;
    }

    private void sendInitialized() {
        if (this.isInitialized) {
            HashMap hashMap = new HashMap();
            hashMap.put((Object)"event", (Object)"initialized");
            hashMap.put((Object)"duration", (Object)this.exoPlayer.getDuration());
            if (this.exoPlayer.o() != null) {
                Format format = this.exoPlayer.o();
                int n2 = format.o;
                int n3 = format.p;
                int n4 = format.r;
                if (n4 == 90 || n4 == 270) {
                    n2 = this.exoPlayer.o().p;
                    n3 = this.exoPlayer.o().o;
                }
                hashMap.put((Object)"width", (Object)n2);
                hashMap.put((Object)"height", (Object)n3);
            }
            this.eventSink.success((Object)hashMap);
        }
    }

    private static void setAudioAttributes(w0 w02, boolean bl) {
        if (Build.VERSION.SDK_INT >= 21) {
            i.b b2 = new i.b();
            b2.a(3);
            w02.a(b2.a(), bl ^ true);
            return;
        }
        w02.a(3);
    }

    private void setupVideoPlayer(EventChannel eventChannel, TextureRegistry.SurfaceTextureEntry surfaceTextureEntry) {
        eventChannel.setStreamHandler(new EventChannel.StreamHandler((VideoPlayer)this){
            final /* synthetic */ VideoPlayer this$0;
            {
                this.this$0 = videoPlayer;
            }

            public void onCancel(Object object) {
                VideoPlayer.access$000(this.this$0).setDelegate(null);
            }

            public void onListen(Object object, io.flutter.plugin.common.EventChannel$EventSink eventSink) {
                VideoPlayer.access$000(this.this$0).setDelegate(eventSink);
            }
        });
        this.surface = new Surface(surfaceTextureEntry.surfaceTexture());
        this.exoPlayer.a(this.surface);
        VideoPlayer.setAudioAttributes(this.exoPlayer, this.options.mixWithOthers);
        this.exoPlayer.a(new m0.c((VideoPlayer)this){
            final /* synthetic */ VideoPlayer this$0;
            {
                this.this$0 = videoPlayer;
            }

            public /* synthetic */ void a() {
                com.google.android.exoplayer2.n0.a((m0.c)this);
            }

            public /* synthetic */ void a(boolean bl) {
                com.google.android.exoplayer2.n0.a((m0.c)this, (boolean)bl);
            }

            public /* synthetic */ void b(int n2) {
                com.google.android.exoplayer2.n0.b((m0.c)this, (int)n2);
            }

            public /* synthetic */ void c(int n2) {
                com.google.android.exoplayer2.n0.c((m0.c)this, (int)n2);
            }

            public /* synthetic */ void d(int n2) {
                com.google.android.exoplayer2.n0.a((m0.c)this, (int)n2);
            }

            public /* synthetic */ void onLoadingChanged(boolean bl) {
                com.google.android.exoplayer2.n0.b((m0.c)this, (boolean)bl);
            }

            public /* synthetic */ void onPlaybackParametersChanged(com.google.android.exoplayer2.l0 l02) {
                com.google.android.exoplayer2.n0.a((m0.c)this, (com.google.android.exoplayer2.l0)l02);
            }

            public void onPlayerError(com.google.android.exoplayer2.x x2) {
                if (VideoPlayer.access$000(this.this$0) != null) {
                    QueuingEventSink queuingEventSink = VideoPlayer.access$000(this.this$0);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Video player had error ");
                    stringBuilder.append((Object)x2);
                    queuingEventSink.error("VideoError", stringBuilder.toString(), null);
                }
            }

            public void onPlayerStateChanged(boolean bl, int n2) {
                if (n2 == 2) {
                    this.this$0.sendBufferingUpdate();
                    return;
                }
                if (n2 == 3) {
                    if (!VideoPlayer.access$100(this.this$0)) {
                        VideoPlayer.access$102(this.this$0, true);
                        VideoPlayer.access$200(this.this$0);
                        return;
                    }
                } else if (n2 == 4) {
                    HashMap hashMap = new HashMap();
                    hashMap.put((Object)"event", (Object)"completed");
                    VideoPlayer.access$000(this.this$0).success((Object)hashMap);
                }
            }

            public /* synthetic */ void onTimelineChanged(com.google.android.exoplayer2.x0 x02, int n2) {
                com.google.android.exoplayer2.n0.a((m0.c)this, (com.google.android.exoplayer2.x0)x02, (int)n2);
            }

            @java.lang.Deprecated
            public /* synthetic */ void onTimelineChanged(com.google.android.exoplayer2.x0 x02, Object object, int n2) {
                com.google.android.exoplayer2.n0.a((m0.c)this, (com.google.android.exoplayer2.x0)x02, (Object)object, (int)n2);
            }

            public /* synthetic */ void onTracksChanged(com.google.android.exoplayer2.source.TrackGroupArray trackGroupArray, com.google.android.exoplayer2.trackselection.g g2) {
                com.google.android.exoplayer2.n0.a((m0.c)this, (com.google.android.exoplayer2.source.TrackGroupArray)trackGroupArray, (com.google.android.exoplayer2.trackselection.g)g2);
            }
        });
    }

    void dispose() {
        w0 w02;
        if (this.isInitialized) {
            this.exoPlayer.stop();
        }
        this.textureEntry.release();
        this.eventChannel.setStreamHandler(null);
        Surface surface = this.surface;
        if (surface != null) {
            surface.release();
        }
        if ((w02 = this.exoPlayer) != null) {
            w02.release();
        }
    }

    long getPosition() {
        return this.exoPlayer.getCurrentPosition();
    }

    void pause() {
        this.exoPlayer.a(false);
    }

    void play() {
        this.exoPlayer.a(true);
    }

    void seekTo(int n2) {
        this.exoPlayer.seekTo((long)n2);
    }

    void sendBufferingUpdate() {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"event", (Object)"bufferingUpdate");
        Object[] arrobject = new Number[]{0, this.exoPlayer.n()};
        hashMap.put((Object)"values", (Object)Collections.singletonList((Object)Arrays.asList((Object[])arrobject)));
        this.eventSink.success((Object)hashMap);
    }

    void setLooping(boolean bl) {
        w0 w02 = this.exoPlayer;
        int n2 = bl ? 2 : 0;
        w02.b(n2);
    }

    void setVolume(double d2) {
        float f2 = (float)Math.max((double)0.0, (double)Math.min((double)1.0, (double)d2));
        this.exoPlayer.a(f2);
    }
}

