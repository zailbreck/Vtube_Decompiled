/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$CompressFormat
 *  android.graphics.SurfaceTexture
 *  android.net.Uri
 *  android.text.TextUtils
 *  android.util.Log
 *  android.view.Surface
 *  f.c.a.a
 *  f.c.a.g
 *  io.flutter.plugin.common.BinaryMessenger
 *  io.flutter.plugin.common.EventChannel
 *  io.flutter.plugin.common.EventChannel$EventSink
 *  io.flutter.plugin.common.EventChannel$StreamHandler
 *  io.flutter.plugin.common.MethodCall
 *  io.flutter.plugin.common.MethodChannel
 *  io.flutter.plugin.common.MethodChannel$MethodCallHandler
 *  io.flutter.plugin.common.MethodChannel$Result
 *  io.flutter.view.TextureRegistry
 *  io.flutter.view.TextureRegistry$SurfaceTextureEntry
 *  java.io.ByteArrayOutputStream
 *  java.io.File
 *  java.io.FileNotFoundException
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.CharSequence
 *  java.lang.Double
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Set
 *  java.util.concurrent.atomic.AtomicInteger
 *  tv.danmaku.ijk.media.player.IMediaPlayer
 *  tv.danmaku.ijk.media.player.IMediaPlayer$OnSnapShotListener
 *  tv.danmaku.ijk.media.player.IjkEventListener
 *  tv.danmaku.ijk.media.player.IjkMediaPlayer
 *  tv.danmaku.ijk.media.player.misc.IMediaDataSource
 */
package f.c.a;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.Surface;
import f.c.a.f;
import f.c.a.g;
import f.c.a.h;
import f.c.a.i;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.view.TextureRegistry;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkEventListener;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import tv.danmaku.ijk.media.player.misc.IMediaDataSource;

public class b
implements MethodChannel.MethodCallHandler,
IjkEventListener,
IMediaPlayer.OnSnapShotListener {
    private static final AtomicInteger q = new AtomicInteger(0);
    private final int b;
    private final IjkMediaPlayer c;
    private final f.c.a.a d;
    private final EventChannel e;
    private final MethodChannel f;
    private final h g = new h();
    private final g h = new g();
    private int i;
    private int j = -1;
    private int k = 0;
    private int l = 0;
    private TextureRegistry.SurfaceTextureEntry m;
    private SurfaceTexture n;
    private Surface o;
    private final boolean p;

    b(f.c.a.a a2, boolean bl) {
        this.d = a2;
        this.b = q.incrementAndGet();
        this.i = 0;
        this.p = bl;
        if (bl) {
            this.c = null;
            this.e = null;
            this.f = null;
            return;
        }
        this.c = new IjkMediaPlayer();
        this.c.addIjkEventListener((IjkEventListener)this);
        this.c.setOption(4, "enable-position-notify", 1L);
        this.c.setOption(4, "start-on-prepared", 0L);
        BinaryMessenger binaryMessenger = this.d.messenger();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("befovy.com/fijkplayer/");
        stringBuilder.append(this.b);
        this.f = new MethodChannel(binaryMessenger, stringBuilder.toString());
        this.f.setMethodCallHandler((MethodChannel.MethodCallHandler)this);
        this.c.setOnSnapShotListener((IMediaPlayer.OnSnapShotListener)this);
        BinaryMessenger binaryMessenger2 = this.d.messenger();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("befovy.com/fijkplayer/event/");
        stringBuilder2.append(this.b);
        this.e = new EventChannel(binaryMessenger2, stringBuilder2.toString());
        this.e.setStreamHandler(new EventChannel.StreamHandler(){

            public void onCancel(Object object) {
                b.this.g.a(null);
            }

            public void onListen(Object object, EventChannel.EventSink eventSink) {
                b.this.g.a(eventSink);
            }
        });
    }

    private void a(int n2, int n3) {
        if (n2 == 4 && n3 != 4) {
            this.d.a(1);
            if (this.h.a("request-audio-focus", 0) == 1) {
                this.d.b(true);
            }
            if (this.h.a("request-screen-on", 0) == 1) {
                this.d.a(true);
            }
        } else if (n2 != 4 && n3 == 4) {
            this.d.a(-1);
            if (this.h.a("release-audio-focus", 0) == 1) {
                this.d.b(false);
            }
            if (this.h.a("request-screen-on", 0) == 1) {
                this.d.a(false);
            }
        }
        if (b.super.a(n2) && !b.super.a(n3)) {
            this.d.b(1);
            return;
        }
        if (!b.super.a(n2) && b.super.a(n3)) {
            this.d.b(-1);
        }
    }

    private void a(int n2, int n3, int n4, Object object) {
        block15 : {
            block9 : {
                HashMap hashMap;
                block17 : {
                    String string;
                    Object object2;
                    block16 : {
                        block10 : {
                            block19 : {
                                Integer n5;
                                block20 : {
                                    block18 : {
                                        block11 : {
                                            block12 : {
                                                block13 : {
                                                    block14 : {
                                                        hashMap = new HashMap();
                                                        if (n2 == 100) break block9;
                                                        if (n2 == 200) break block10;
                                                        if (n2 == 400) break block11;
                                                        if (n2 == 510) break block12;
                                                        if (n2 == 600) break block13;
                                                        if (n2 == 700) break block14;
                                                        block0 : switch (n2) {
                                                            default: {
                                                                switch (n2) {
                                                                    default: {
                                                                        return;
                                                                    }
                                                                    case 502: {
                                                                        hashMap.put((Object)"event", (Object)"buffering");
                                                                        hashMap.put((Object)"head", (Object)n3);
                                                                        object2 = n4;
                                                                        string = "percent";
                                                                        break block0;
                                                                    }
                                                                    case 500: 
                                                                    case 501: 
                                                                }
                                                                hashMap.put((Object)"event", (Object)"freeze");
                                                                boolean bl = n2 == 500;
                                                                object2 = bl;
                                                                string = "value";
                                                                break;
                                                            }
                                                            case 404: {
                                                                int n6;
                                                                hashMap.put((Object)"event", (Object)"rotate");
                                                                hashMap.put((Object)"degree", (Object)n3);
                                                                this.j = n3;
                                                                this.g.success((Object)hashMap);
                                                                int n7 = this.k;
                                                                if (n7 > 0 && (n6 = this.l) > 0) {
                                                                    b.super.a(400, n7, n6, null);
                                                                    return;
                                                                }
                                                                break block15;
                                                            }
                                                            case 402: 
                                                            case 403: {
                                                                hashMap.put((Object)"event", (Object)"rendering_start");
                                                                object2 = n2 == 402 ? "video" : "audio";
                                                                string = "type";
                                                                break;
                                                            }
                                                        }
                                                        break block16;
                                                    }
                                                    this.i = n3;
                                                    hashMap.put((Object)"event", (Object)"state_change");
                                                    hashMap.put((Object)"new", (Object)n3);
                                                    hashMap.put((Object)"old", (Object)n4);
                                                    b.super.a(n3, n4);
                                                    break block17;
                                                }
                                                hashMap.put((Object)"event", (Object)"seek_complete");
                                                hashMap.put((Object)"pos", (Object)n3);
                                                object2 = n4;
                                                string = "err";
                                                break block16;
                                            }
                                            hashMap.put((Object)"event", (Object)"pos");
                                            hashMap.put((Object)"pos", (Object)n3);
                                            break block17;
                                        }
                                        hashMap.put((Object)"event", (Object)"size_changed");
                                        int n8 = this.j;
                                        if (n8 == 0 || n8 == 180) break block18;
                                        if (n8 != 90 && n8 != 270) break block19;
                                        hashMap.put((Object)"width", (Object)n4);
                                        n5 = n3;
                                        break block20;
                                    }
                                    hashMap.put((Object)"width", (Object)n3);
                                    n5 = n4;
                                }
                                hashMap.put((Object)"height", (Object)n5);
                                this.g.success((Object)hashMap);
                            }
                            this.k = n3;
                            this.l = n4;
                            return;
                        }
                        hashMap.put((Object)"event", (Object)"prepared");
                        object2 = this.c.getDuration();
                        string = "duration";
                    }
                    hashMap.put((Object)string, object2);
                }
                this.g.success((Object)hashMap);
                return;
            }
            this.g.error(String.valueOf((int)n3), object.toString(), n4);
        }
    }

    private void a(Object object) {
        if (object instanceof Map) {
            Map map = (Map)object;
            for (Object object2 : map.keySet()) {
                Object object3 = map.get(object2);
                if (!(object2 instanceof Integer) || !(object3 instanceof Map)) continue;
                int n2 = (Integer)object2;
                Map map2 = (Map)object3;
                for (Object object4 : map2.keySet()) {
                    Object object5 = map2.get(object4);
                    boolean bl = object4 instanceof String;
                    if (bl && n2 != 0) {
                        String string = (String)object4;
                        if (object5 instanceof Integer) {
                            this.c.setOption(n2, string, (long)((Integer)object5).intValue());
                            continue;
                        }
                        if (!(object5 instanceof String)) continue;
                        this.c.setOption(n2, string, (String)object5);
                        continue;
                    }
                    if (!bl) continue;
                    String string = (String)object4;
                    if (object5 instanceof Integer) {
                        this.h.a(string, (Integer)object5);
                        continue;
                    }
                    if (!(object5 instanceof String)) continue;
                    this.h.a(string, (String)object5);
                }
            }
        }
    }

    private boolean a(int n2) {
        return n2 == 4 || n2 == 5 || n2 == 6 || n2 == 3;
        {
        }
    }

    int a() {
        return this.b;
    }

    void b() {
        TextureRegistry.SurfaceTextureEntry surfaceTextureEntry;
        SurfaceTexture surfaceTexture;
        Surface surface;
        if (!this.p) {
            this.a(700, 9, this.i, null);
            this.c.release();
        }
        if ((surfaceTextureEntry = this.m) != null) {
            surfaceTextureEntry.release();
            this.m = null;
        }
        if ((surfaceTexture = this.n) != null) {
            surfaceTexture.release();
            this.n = null;
        }
        if ((surface = this.o) != null) {
            surface.release();
            this.o = null;
        }
        if (!this.p) {
            this.f.setMethodCallHandler(null);
            this.e.setStreamHandler(null);
        }
    }

    void c() {
        if (this.p) {
            return;
        }
        if (this.h.a("enable-snapshot", 0) > 0) {
            this.c.setAmcGlesRender();
            this.c.setOption(4, "overlay-format", "fcc-_es2");
        }
    }

    long d() {
        TextureRegistry.SurfaceTextureEntry surfaceTextureEntry;
        this.c();
        if (this.m == null) {
            TextureRegistry.SurfaceTextureEntry surfaceTextureEntry2;
            this.m = surfaceTextureEntry2 = this.d.a();
            if (surfaceTextureEntry2 != null) {
                this.n = surfaceTextureEntry2.surfaceTexture();
                this.o = new Surface(this.n);
            }
            if (!this.p) {
                this.c.setSurface(this.o);
            }
        }
        if ((surfaceTextureEntry = this.m) != null) {
            return surfaceTextureEntry.id();
        }
        Log.e((String)"FIJKPLAYER", (String)"setup surface, null SurfaceTextureEntry");
        return 0L;
    }

    public void onEvent(IjkMediaPlayer ijkMediaPlayer, int n2, int n3, int n4, Object object) {
        if (n2 != 100 && n2 != 200 && n2 != 400 && n2 != 510 && n2 != 600 && n2 != 700) {
            switch (n2) {
                default: {
                    switch (n2) {
                        default: {
                            return;
                        }
                        case 500: 
                        case 501: 
                        case 502: 
                    }
                }
                case 402: 
                case 403: 
                case 404: 
            }
        }
        this.a(n2, n3, n4, object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        block50 : {
            long l2;
            int n2;
            block58 : {
                long l3;
                block48 : {
                    block57 : {
                        block56 : {
                            int n3;
                            block53 : {
                                block55 : {
                                    block54 : {
                                        block52 : {
                                            block51 : {
                                                block49 : {
                                                    block47 : {
                                                        if (!methodCall.method.equals((Object)"setupSurface")) break block47;
                                                        l3 = this.d();
                                                        break block48;
                                                    }
                                                    boolean bl = methodCall.method.equals((Object)"setOption");
                                                    l2 = 0L;
                                                    if (!bl) break block49;
                                                    Integer n4 = (Integer)methodCall.argument("cat");
                                                    String string = (String)methodCall.argument("key");
                                                    if (methodCall.hasArgument("long")) {
                                                        Integer n5 = (Integer)methodCall.argument("long");
                                                        if (n4 != null && n4 != 0) {
                                                            IjkMediaPlayer ijkMediaPlayer = this.c;
                                                            int n6 = n4;
                                                            if (n5 != null) {
                                                                l2 = n5.longValue();
                                                            }
                                                            ijkMediaPlayer.setOption(n6, string, l2);
                                                        } else if (n4 != null) {
                                                            this.h.a(string, n5);
                                                        }
                                                    } else if (methodCall.hasArgument("str")) {
                                                        String string2 = (String)methodCall.argument("str");
                                                        if (n4 != null && n4 != 0) {
                                                            this.c.setOption(n4.intValue(), string, string2);
                                                        } else if (n4 != null) {
                                                            this.h.a(string, string2);
                                                        }
                                                    } else {
                                                        Log.w((String)"FIJKPLAYER", (String)"error arguments for setOptions");
                                                    }
                                                    break block50;
                                                }
                                                if (!methodCall.method.equals((Object)"applyOptions")) break block51;
                                                b.super.a(methodCall.arguments);
                                                break block50;
                                            }
                                            boolean bl = methodCall.method.equals((Object)"setDataSource");
                                            n2 = 1;
                                            if (bl) {
                                                String string;
                                                String string3;
                                                Uri uri = Uri.parse((String)((String)methodCall.argument("url")));
                                                boolean bl2 = "asset".equals((Object)uri.getScheme());
                                                String string4 = "";
                                                boolean bl3 = false;
                                                if (bl2) {
                                                    String string5 = uri.getHost();
                                                    String string6 = uri.getPath() != null ? uri.getPath().substring(n2) : string4;
                                                    String string7 = this.d.lookupKeyForAsset(string6, string5);
                                                    if (!TextUtils.isEmpty((CharSequence)string7)) {
                                                        uri = Uri.parse((String)string7);
                                                    }
                                                    bl3 = true;
                                                }
                                                try {
                                                    Context context = this.d.context();
                                                    if (bl3 && context != null) {
                                                        AssetManager assetManager = context.getAssets();
                                                        if (uri.getPath() != null) {
                                                            string4 = uri.getPath();
                                                        }
                                                        InputStream inputStream = assetManager.open(string4, n2);
                                                        this.c.setDataSource((IMediaDataSource)new i(inputStream));
                                                    } else if (context != null) {
                                                        if (!TextUtils.isEmpty((CharSequence)uri.getScheme()) && !"file".equals((Object)uri.getScheme())) {
                                                            this.c.setDataSource(this.d.context(), uri);
                                                        } else {
                                                            if (uri.getPath() != null) {
                                                                string4 = uri.getPath();
                                                            }
                                                            f f2 = new f(new File(string4));
                                                            this.c.setDataSource((IMediaDataSource)f2);
                                                        }
                                                    } else {
                                                        Log.e((String)"FIJKPLAYER", (String)"context null, can't setDataSource");
                                                    }
                                                    b.super.a(700, n2, -1, null);
                                                    if (context == null) {
                                                        b.super.a(700, 8, -1, null);
                                                    }
                                                    result.success(null);
                                                    return;
                                                }
                                                catch (IOException iOException) {
                                                    StringBuilder stringBuilder = new StringBuilder();
                                                    stringBuilder.append("Local IOException:");
                                                    stringBuilder.append(iOException.getMessage());
                                                    string = stringBuilder.toString();
                                                    string3 = "-1162824012";
                                                }
                                                catch (FileNotFoundException fileNotFoundException) {
                                                    StringBuilder stringBuilder = new StringBuilder();
                                                    stringBuilder.append("Local File not found:");
                                                    stringBuilder.append(fileNotFoundException.getMessage());
                                                    string = stringBuilder.toString();
                                                    string3 = "-875574348";
                                                }
                                                result.error(string3, string, null);
                                                return;
                                            }
                                            if (!methodCall.method.equals((Object)"prepareAsync")) break block52;
                                            this.c();
                                            this.c.prepareAsync();
                                            n3 = 2;
                                            break block53;
                                        }
                                        if (!methodCall.method.equals((Object)"start")) break block54;
                                        this.c.start();
                                        break block50;
                                    }
                                    if (!methodCall.method.equals((Object)"pause")) break block55;
                                    this.c.pause();
                                    break block50;
                                }
                                if (!methodCall.method.equals((Object)"stop")) break block56;
                                this.c.stop();
                                n3 = 7;
                            }
                            b.super.a(700, n3, -1, null);
                            break block50;
                        }
                        if (!methodCall.method.equals((Object)"reset")) break block57;
                        this.c.reset();
                        b.super.a(700, 0, -1, null);
                        break block50;
                    }
                    if (!methodCall.method.equals((Object)"getCurrentPosition")) break block58;
                    l3 = this.c.getCurrentPosition();
                }
                result.success((Object)l3);
                return;
            }
            boolean bl = methodCall.method.equals((Object)"setVolume");
            float f3 = 1.0f;
            if (bl) {
                Double d2 = (Double)methodCall.argument("volume");
                if (d2 != null) {
                    f3 = d2.floatValue();
                }
                this.c.setVolume(f3, f3);
            } else if (methodCall.method.equals((Object)"seekTo")) {
                Integer n7 = (Integer)methodCall.argument("msec");
                if (this.i == 6) {
                    b.super.a(700, 5, -1, null);
                }
                IjkMediaPlayer ijkMediaPlayer = this.c;
                if (n7 != null) {
                    l2 = n7.longValue();
                }
                ijkMediaPlayer.seekTo(l2);
            } else if (methodCall.method.equals((Object)"setLoop")) {
                Integer n8 = (Integer)methodCall.argument("loop");
                IjkMediaPlayer ijkMediaPlayer = this.c;
                if (n8 != null) {
                    n2 = n8;
                }
                ijkMediaPlayer.setLoopCount(n2);
            } else if (methodCall.method.equals((Object)"setSpeed")) {
                Double d3 = (Double)methodCall.argument("speed");
                IjkMediaPlayer ijkMediaPlayer = this.c;
                if (d3 != null) {
                    f3 = d3.floatValue();
                }
                ijkMediaPlayer.setSpeed(f3);
            } else {
                if (!methodCall.method.equals((Object)"snapshot")) {
                    result.notImplemented();
                    return;
                }
                if (this.h.a("enable-snapshot", 0) > 0) {
                    this.c.snapShot();
                } else {
                    this.f.invokeMethod("_onSnapshot", (Object)"not support");
                }
            }
        }
        result.success(null);
    }

    public void onSnapShot(IMediaPlayer iMediaPlayer, Bitmap bitmap, int n2, int n3) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bitmap.compress(Bitmap.CompressFormat.JPEG, 100, (OutputStream)byteArrayOutputStream);
        bitmap.recycle();
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"data", (Object)byteArrayOutputStream.toByteArray());
        hashMap.put((Object)"w", (Object)n2);
        hashMap.put((Object)"h", (Object)n3);
        this.f.invokeMethod("_onSnapshot", (Object)hashMap);
    }

}

