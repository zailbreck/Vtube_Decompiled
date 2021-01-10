/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.Activity
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.media.AudioAttributes
 *  android.media.AudioAttributes$Builder
 *  android.media.AudioFocusRequest
 *  android.media.AudioFocusRequest$Builder
 *  android.media.AudioManager
 *  android.media.AudioManager$OnAudioFocusChangeListener
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 *  android.util.Log
 *  android.util.SparseArray
 *  android.view.Window
 *  android.view.WindowManager
 *  android.view.WindowManager$LayoutParams
 *  f.c.a.a
 *  f.c.a.d
 *  f.c.a.e
 *  io.flutter.embedding.engine.plugins.FlutterPlugin
 *  io.flutter.embedding.engine.plugins.FlutterPlugin$FlutterAssets
 *  io.flutter.embedding.engine.plugins.FlutterPlugin$FlutterPluginBinding
 *  io.flutter.embedding.engine.plugins.activity.ActivityAware
 *  io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding
 *  io.flutter.plugin.common.BinaryMessenger
 *  io.flutter.plugin.common.EventChannel
 *  io.flutter.plugin.common.EventChannel$EventSink
 *  io.flutter.plugin.common.EventChannel$StreamHandler
 *  io.flutter.plugin.common.MethodCall
 *  io.flutter.plugin.common.MethodChannel
 *  io.flutter.plugin.common.MethodChannel$MethodCallHandler
 *  io.flutter.plugin.common.MethodChannel$Result
 *  io.flutter.plugin.common.PluginRegistry
 *  io.flutter.plugin.common.PluginRegistry$Registrar
 *  io.flutter.view.TextureRegistry
 *  io.flutter.view.TextureRegistry$SurfaceTextureEntry
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.ref.WeakReference
 *  java.util.HashMap
 *  tv.danmaku.ijk.media.player.IjkMediaPlayer
 */
package f.c.a;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.Window;
import android.view.WindowManager;
import f.c.a.b;
import f.c.a.d;
import f.c.a.e;
import f.c.a.h;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.view.TextureRegistry;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;

public class c
implements MethodChannel.MethodCallHandler,
FlutterPlugin,
ActivityAware,
f.c.a.a,
e,
AudioManager.OnAudioFocusChangeListener {
    private final SparseArray<b> b = new SparseArray();
    private final h c = new h();
    private WeakReference<Activity> d;
    private WeakReference<Context> e;
    private PluginRegistry.Registrar f;
    private FlutterPlugin.FlutterPluginBinding g;
    private int h = 0;
    private int i = 0;
    private int j = 3;
    private float k = 0.0625f;
    private boolean l = false;
    private EventChannel m;
    private Object n;
    private boolean o = false;

    private void a(float f2) {
        Activity activity = c.super.c();
        if (activity != null) {
            if (activity.getWindow() == null) {
                return;
            }
            WindowManager.LayoutParams layoutParams = activity.getWindow().getAttributes();
            layoutParams.screenBrightness = f2;
            activity.getWindow().setAttributes(layoutParams);
        }
    }

    private void a(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.g = flutterPluginBinding;
        this.e = new WeakReference((Object)flutterPluginBinding.getApplicationContext());
        c.super.a(flutterPluginBinding.getBinaryMessenger());
    }

    private void a(BinaryMessenger binaryMessenger) {
        EventChannel eventChannel = this.m;
        if (eventChannel != null) {
            eventChannel.setStreamHandler(null);
            this.c.a(null);
        }
        this.m = new EventChannel(binaryMessenger, "befovy.com/fijk/event");
        this.m.setStreamHandler(new EventChannel.StreamHandler(){

            public void onCancel(Object object) {
                c.this.c.a(null);
            }

            public void onListen(Object object, EventChannel.EventSink eventSink) {
                c.this.c.a(eventSink);
            }
        });
        AudioManager audioManager = c.super.d();
        if (audioManager != null) {
            this.k = Math.max((float)(1.0f / (float)audioManager.getStreamMaxVolume(3)), (float)this.k);
        }
    }

    private float b(float f2) {
        int n2 = c.super.f();
        AudioManager audioManager = c.super.d();
        if (audioManager != null) {
            int n3 = audioManager.getStreamMaxVolume(3);
            float f3 = n3;
            int n4 = Math.max((int)Math.min((int)((int)(f2 * f3)), (int)n3), (int)0);
            audioManager.setStreamVolume(3, n4, n2);
            c.super.i();
            f2 = (float)n4 / f3;
        }
        return f2;
    }

    @TargetApi(value=26)
    private void b() {
        AudioManager audioManager = this.d();
        if (audioManager == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            Object object = this.n;
            if (object != null) {
                audioManager.abandonAudioFocusRequest((AudioFocusRequest)object);
                this.n = null;
            }
        } else {
            audioManager.abandonAudioFocus((AudioManager.OnAudioFocusChangeListener)this);
        }
        this.o = false;
    }

    private float c(float f2) {
        return c.super.b(c.super.j() - f2);
    }

    private Activity c() {
        PluginRegistry.Registrar registrar = this.f;
        if (registrar != null) {
            return registrar.activity();
        }
        WeakReference<Activity> weakReference = this.d;
        if (weakReference != null) {
            return (Activity)weakReference.get();
        }
        return null;
    }

    private float d(float f2) {
        return c.super.b(f2 + c.super.j());
    }

    private AudioManager d() {
        Context context = this.context();
        if (context != null) {
            return (AudioManager)context.getSystemService("audio");
        }
        Log.e((String)"FIJKPLAYER", (String)"context null, can't get AudioManager");
        return null;
    }

    /*
     * Exception decompiling
     */
    private float e() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl45 : FLOAD_2 : trying to set 0 previously set to 1
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1133)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:607)
        // java.lang.Thread.run(Thread.java:761)
        throw new IllegalStateException("Decompilation failed");
    }

    private int f() {
        int n2 = this.j;
        if (n2 == 3) {
            return 1;
        }
        if (n2 == 1 && this.i == 0) {
            return 1;
        }
        return this.j == 0 && this.h == 0;
    }

    private boolean g() {
        Activity activity = this.c();
        boolean bl = false;
        if (activity != null) {
            if (activity.getWindow() == null) {
                return false;
            }
            int n2 = 128 & activity.getWindow().getAttributes().flags;
            bl = false;
            if (n2 != 0) {
                bl = true;
            }
        }
        return bl;
    }

    @TargetApi(value=26)
    private void h() {
        AudioManager audioManager = this.d();
        if (audioManager == null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            AudioAttributes audioAttributes = new AudioAttributes.Builder().setUsage(1).setContentType(3).build();
            AudioFocusRequest audioFocusRequest = new AudioFocusRequest.Builder(1).setAudioAttributes(audioAttributes).setAcceptsDelayedFocusGain(true).setOnAudioFocusChangeListener((AudioManager.OnAudioFocusChangeListener)this).build();
            this.n = audioFocusRequest;
            audioManager.requestAudioFocus(audioFocusRequest);
        } else {
            audioManager.requestAudioFocus((AudioManager.OnAudioFocusChangeListener)this, 3, 1);
        }
        this.o = true;
    }

    private void i() {
        if (this.l) {
            boolean bl;
            int n2 = this.f();
            if ((n2 & (bl = true)) <= 0) {
                bl = false;
            }
            HashMap hashMap = new HashMap();
            hashMap.put((Object)"event", (Object)"volume");
            hashMap.put((Object)"sui", (Object)bl);
            hashMap.put((Object)"vol", (Object)Float.valueOf((float)this.j()));
            this.c.success((Object)hashMap);
        }
    }

    private float j() {
        AudioManager audioManager = this.d();
        if (audioManager != null) {
            float f2 = audioManager.getStreamMaxVolume(3);
            return (float)audioManager.getStreamVolume(3) / f2;
        }
        return 0.0f;
    }

    private float k() {
        this.b(0.0f);
        return 0.0f;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public TextureRegistry.SurfaceTextureEntry a() {
        TextureRegistry textureRegistry;
        FlutterPlugin.FlutterPluginBinding flutterPluginBinding = this.g;
        if (flutterPluginBinding != null) {
            textureRegistry = flutterPluginBinding.getTextureRegistry();
            do {
                return textureRegistry.createSurfaceTexture();
                break;
            } while (true);
        }
        PluginRegistry.Registrar registrar = this.f;
        if (registrar == null) return null;
        textureRegistry = registrar.textures();
        return textureRegistry.createSurfaceTexture();
    }

    public void a(int n2) {
        this.i = n2 + this.i;
    }

    public void a(boolean bl) {
        Activity activity = c.super.c();
        if (activity != null) {
            if (activity.getWindow() == null) {
                return;
            }
            if (bl) {
                activity.getWindow().addFlags(128);
                return;
            }
            activity.getWindow().clearFlags(128);
        }
    }

    public void b(int n2) {
        this.h = n2 + this.h;
    }

    public void b(boolean bl) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("audioFocus ");
        String string = bl ? "request" : "release";
        stringBuilder.append(string);
        stringBuilder.append(" state:");
        stringBuilder.append(this.o);
        Log.i((String)"FIJKPLAYER", (String)stringBuilder.toString());
        if (bl && !this.o) {
            c.super.h();
            return;
        }
        if (this.o) {
            c.super.b();
        }
    }

    public Context context() {
        WeakReference<Context> weakReference = this.e;
        if (weakReference != null) {
            return (Context)weakReference.get();
        }
        return null;
    }

    public String lookupKeyForAsset(String string, String string2) {
        if (this.g != null) {
            if (TextUtils.isEmpty((CharSequence)string2)) {
                return this.g.getFlutterAssets().getAssetFilePathByName(string);
            }
            return this.g.getFlutterAssets().getAssetFilePathByName(string, string2);
        }
        if (this.f != null) {
            if (TextUtils.isEmpty((CharSequence)string2)) {
                return this.f.lookupKeyForAsset(string);
            }
            return this.f.lookupKeyForAsset(string, string2);
        }
        return null;
    }

    public BinaryMessenger messenger() {
        FlutterPlugin.FlutterPluginBinding flutterPluginBinding = this.g;
        if (flutterPluginBinding != null) {
            return flutterPluginBinding.getBinaryMessenger();
        }
        PluginRegistry.Registrar registrar = this.f;
        if (registrar != null) {
            return registrar.messenger();
        }
        return null;
    }

    public void onAttachedToActivity(ActivityPluginBinding activityPluginBinding) {
        this.d = new WeakReference((Object)activityPluginBinding.getActivity());
        if (this.d.get() instanceof d) {
            ((d)this.d.get()).a((e)this);
        }
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "befovy.com/fijk");
        c.super.a(flutterPluginBinding);
        methodChannel.setMethodCallHandler((MethodChannel.MethodCallHandler)this);
        b b2 = new b((f.c.a.a)this, true);
        b2.d();
        b2.b();
        AudioManager audioManager = c.super.d();
        if (audioManager != null) {
            this.k = Math.max((float)(1.0f / (float)audioManager.getStreamMaxVolume(3)), (float)this.k);
        }
    }

    public void onAudioFocusChange(int n2) {
        if (n2 == -2 || n2 == -1) {
            this.o = false;
            this.n = null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onAudioFocusChange: ");
        stringBuilder.append(n2);
        Log.i((String)"FIJKPLAYER", (String)stringBuilder.toString());
    }

    public void onDetachedFromActivity() {
        this.d = null;
    }

    public void onDetachedFromActivityForConfigChanges() {
        this.d = null;
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.e = null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void onMethodCall(MethodCall var1, MethodChannel.Result var2_2) {
        block64 : {
            block63 : {
                var3_3 = var1.method;
                var4_4 = var3_3.hashCode();
                var5_5 = 1;
                switch (var4_4) {
                    default: {
                        break;
                    }
                    case 1995731616: {
                        if (!var3_3.equals((Object)"logLevel")) break;
                        var6_6 = 4;
                        break block63;
                    }
                    case 1741918797: {
                        if (!var3_3.equals((Object)"setOrientationLandscape")) break;
                        var6_6 = 6;
                        break block63;
                    }
                    case 1611994419: {
                        if (!var3_3.equals((Object)"isScreenKeptOn")) break;
                        var6_6 = 9;
                        break block63;
                    }
                    case 1577713133: {
                        if (!var3_3.equals((Object)"setScreenOn")) break;
                        var6_6 = 8;
                        break block63;
                    }
                    case 1557968318: {
                        if (!var3_3.equals((Object)"onUnload")) break;
                        var6_6 = 21;
                        break block63;
                    }
                    case 1442020093: {
                        if (!var3_3.equals((Object)"createPlayer")) break;
                        var6_6 = 2;
                        break block63;
                    }
                    case 1404610057: {
                        if (!var3_3.equals((Object)"releaseAudioFocus")) break;
                        var6_6 = 13;
                        break block63;
                    }
                    case 1385449135: {
                        if (!var3_3.equals((Object)"getPlatformVersion")) break;
                        var6_6 = 0;
                        break block63;
                    }
                    case 1246158090: {
                        if (!var3_3.equals((Object)"volUiMode")) break;
                        var6_6 = 19;
                        break block63;
                    }
                    case 1124545107: {
                        if (!var3_3.equals((Object)"setBrightness")) break;
                        var6_6 = 11;
                        break block63;
                    }
                    case 648162385: {
                        if (!var3_3.equals((Object)"brightness")) break;
                        var6_6 = 10;
                        break block63;
                    }
                    case 600760777: {
                        if (!var3_3.equals((Object)"setOrientationPortrait")) break;
                        var6_6 = 5;
                        break block63;
                    }
                    case 3237136: {
                        if (!var3_3.equals((Object)"init")) break;
                        var6_6 = 1;
                        break block63;
                    }
                    case -461681955: {
                        if (!var3_3.equals((Object)"setOrientationAuto")) break;
                        var6_6 = 7;
                        break block63;
                    }
                    case -606886359: {
                        if (!var3_3.equals((Object)"systemVolume")) break;
                        var6_6 = 17;
                        break block63;
                    }
                    case -1013170331: {
                        if (!var3_3.equals((Object)"onLoad")) break;
                        var6_6 = 20;
                        break block63;
                    }
                    case -1234022968: {
                        if (!var3_3.equals((Object)"releasePlayer")) break;
                        var6_6 = 3;
                        break block63;
                    }
                    case -1504647535: {
                        if (!var3_3.equals((Object)"requestAudioFocus")) break;
                        var6_6 = 12;
                        break block63;
                    }
                    case -1552773037: {
                        if (!var3_3.equals((Object)"volumeMute")) break;
                        var6_6 = 16;
                        break block63;
                    }
                    case -1553046820: {
                        if (!var3_3.equals((Object)"volumeDown")) break;
                        var6_6 = 14;
                        break block63;
                    }
                    case -1869769899: {
                        if (!var3_3.equals((Object)"volumeUp")) break;
                        var6_6 = 15;
                        break block63;
                    }
                    case -2128294168: {
                        if (!var3_3.equals((Object)"volumeSet")) break;
                        var6_6 = 18;
                        break block63;
                    }
                }
                var6_6 = -1;
            }
            switch (var6_6) {
                default: {
                    var38_7 = new StringBuilder();
                    var38_7.append("onMethod Call, name: ");
                    var38_7.append(var1.method);
                    Log.w((String)"FLUTTER", (String)var38_7.toString());
                    var2_2.notImplemented();
                    return;
                }
                case 21: {
                    this.l = false;
                    ** GOTO lbl226
                }
                case 20: {
                    this.l = var5_5;
                    ** GOTO lbl226
                }
                case 19: {
                    var37_8 = (Integer)var1.argument("mode");
                    if (var37_8 != null) {
                        this.j = var37_8;
                    }
                    ** GOTO lbl226
                }
                case 18: {
                    var35_9 = c.super.j();
                    var36_10 = (Double)var1.argument("vol");
                    if (var36_10 != null) {
                        var35_9 = c.super.b(var36_10.floatValue());
                    }
                    var10_11 = Float.valueOf((float)var35_9);
                    break block64;
                }
                case 17: {
                    var29_18 = c.super.j();
                    ** GOTO lbl155
                }
                case 16: {
                    var29_18 = c.super.k();
                    ** GOTO lbl155
                }
                case 15: {
                    var33_19 = this.k;
                    if (var1.hasArgument("step") && (var34_20 = (Double)var1.argument("step")) != null) {
                        var33_19 = var34_20.floatValue();
                    }
                    var29_18 = c.super.d(var33_19);
                    ** GOTO lbl155
                }
                case 14: {
                    var31_21 = this.k;
                    if (var1.hasArgument("step") && (var32_22 = (Double)var1.argument("step")) != null) {
                        var31_21 = var32_22.floatValue();
                    }
                    var29_18 = c.super.c(var31_21);
                    ** GOTO lbl155
                }
                case 13: {
                    this.b(false);
                    ** GOTO lbl226
                }
                case 12: {
                    this.b((boolean)var5_5);
                    ** GOTO lbl226
                }
                case 11: {
                    if (var1.hasArgument("brightness") == false) return;
                    var30_23 = (Double)var1.argument("brightness");
                    if (var30_23 == null) return;
                    c.super.a(var30_23.floatValue());
                    return;
                }
                case 10: {
                    var29_18 = c.super.e();
lbl155: // 5 sources:
                    var10_12 = Float.valueOf((float)var29_18);
                    break block64;
                }
                case 9: {
                    var10_13 = c.super.g();
                    break block64;
                }
                case 8: {
                    var26_24 = var1.hasArgument("on");
                    var27_25 = false;
                    if (var26_24) {
                        var28_26 = (Boolean)var1.argument("on");
                        var27_25 = false;
                        if (var28_26 != null) {
                            var27_25 = var28_26;
                        }
                    }
                    this.a(var27_25);
                    ** GOTO lbl226
                }
                case 7: {
                    var25_27 = c.super.c();
                    if (var25_27 != null) {
                        if (Build.VERSION.SDK_INT >= 18) {
                            var25_27.setRequestedOrientation(13);
                        } else {
                            var25_27.setRequestedOrientation(10);
                        }
                    }
                    ** GOTO lbl226
                }
                case 6: {
                    var23_28 = c.super.c();
                    if (var23_28 == null || var23_28.getResources().getConfiguration().orientation != var5_5) ** GOTO lbl-1000
                    if (Build.VERSION.SDK_INT < 18) ** GOTO lbl184
                    var23_28.setRequestedOrientation(11);
                    ** GOTO lbl196
lbl184: // 1 sources:
                    var24_29 = 6;
                    ** GOTO lbl193
                }
                case 5: {
                    var23_28 = c.super.c();
                    if (var23_28 != null && var23_28.getResources().getConfiguration().orientation == 2) {
                        if (Build.VERSION.SDK_INT >= 18) {
                            var23_28.setRequestedOrientation(12);
                        } else {
                            var24_29 = 7;
lbl193: // 2 sources:
                            var23_28.setRequestedOrientation(var24_29);
                        }
                    } else lbl-1000: // 2 sources:
                    {
                        var5_5 = 0;
                    }
lbl196: // 4 sources:
                    var10_14 = (boolean)var5_5;
                    break block64;
                }
                case 4: {
                    var20_30 = 500;
                    var21_31 = (Integer)var1.argument("level");
                    if (var21_31 != null) {
                        var20_30 = var21_31;
                    }
                    var22_32 = Math.min((int)Math.max((int)(var20_30 / 100), (int)0), (int)8);
                    IjkMediaPlayer.loadLibrariesOnce(null);
                    IjkMediaPlayer.native_setLogLevel((int)var22_32);
                    ** GOTO lbl226
                }
                case 3: {
                    var17_33 = (Integer)var1.argument("pid");
                    var18_34 = var17_33 != null ? var17_33 : -1;
                    var19_35 = (b)this.b.get(var18_34);
                    if (var19_35 != null) {
                        var19_35.b();
                        this.b.delete(var18_34);
                    }
                    ** GOTO lbl226
                }
                case 2: {
                    var15_36 = new b((f.c.a.a)this, false);
                    var16_37 = var15_36.a();
                    this.b.append(var16_37, (Object)var15_36);
                    var10_15 = var16_37;
                    break block64;
                }
                case 1: {
                    var11_38 = new StringBuilder();
                    var11_38.append("call init:");
                    var11_38.append(var1.arguments.toString());
                    Log.i((String)"FLUTTER", (String)var11_38.toString());
lbl226: // 11 sources:
                    var2_2.success(null);
                    return;
                }
                case 0: 
            }
            var7_39 = new StringBuilder();
            var7_39.append("Android ");
            var7_39.append(Build.VERSION.RELEASE);
            var10_16 = var7_39.toString();
        }
        var2_2.success((Object)var10_17);
    }

    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding activityPluginBinding) {
        this.d = new WeakReference((Object)activityPluginBinding.getActivity());
        if (this.d.get() instanceof d) {
            ((d)this.d.get()).a((e)this);
        }
    }

}

