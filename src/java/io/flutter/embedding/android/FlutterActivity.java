/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ApplicationInfo
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.Window
 *  androidx.lifecycle.e
 *  androidx.lifecycle.e$a
 *  androidx.lifecycle.h
 *  androidx.lifecycle.i
 *  io.flutter.view.FlutterMain
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.reflect.Method
 */
package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.e;
import androidx.lifecycle.h;
import androidx.lifecycle.i;
import io.flutter.Log;
import io.flutter.embedding.android.DrawableSplashScreen;
import io.flutter.embedding.android.FlutterActivityAndFragmentDelegate;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import io.flutter.embedding.android.FlutterSurfaceView;
import io.flutter.embedding.android.FlutterTextureView;
import io.flutter.embedding.android.RenderMode;
import io.flutter.embedding.android.SplashScreen;
import io.flutter.embedding.android.TransparencyMode;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterShellArgs;
import io.flutter.embedding.engine.systemchannels.PlatformChannel;
import io.flutter.plugin.platform.PlatformPlugin;
import io.flutter.view.FlutterMain;
import java.lang.reflect.Method;

public class FlutterActivity
extends Activity
implements FlutterActivityAndFragmentDelegate.Host,
h {
    private static final String TAG = "FlutterActivity";
    protected FlutterActivityAndFragmentDelegate delegate;
    private i lifecycle = new i((h)this);

    private void configureStatusBarForFullscreenFlutterExperience() {
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(1073741824);
            window.getDecorView().setSystemUiVisibility(1280);
        }
    }

    private void configureWindowForTransparency() {
        if (this.getBackgroundMode() == FlutterActivityLaunchConfigs.BackgroundMode.transparent) {
            this.getWindow().setBackgroundDrawable((Drawable)new ColorDrawable(0));
        }
    }

    public static Intent createDefaultIntent(Context context) {
        return FlutterActivity.withNewEngine().build(context);
    }

    private View createFlutterView() {
        return this.delegate.onCreateView(null, null, null);
    }

    /*
     * Exception decompiling
     */
    private Drawable getSplashScreenFromManifest() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Underrun type stack
        // org.benf.cfr.reader.b.a.c.e.a(StackSim.java:35)
        // org.benf.cfr.reader.b.b.af.a(OperationFactoryPop.java:20)
        // org.benf.cfr.reader.b.b.e.a(JVMInstr.java:315)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:195)
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

    private boolean isDebuggable() {
        return (2 & this.getApplicationInfo().flags) != 0;
    }

    private static void registerPlugins(FlutterEngine flutterEngine) {
        try {
            Class.forName((String)"io.flutter.plugins.GeneratedPluginRegistrant").getDeclaredMethod("registerWith", new Class[]{FlutterEngine.class}).invoke(null, new Object[]{flutterEngine});
            return;
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Tried to automatically register plugins with FlutterEngine (");
            stringBuilder.append((Object)flutterEngine);
            stringBuilder.append(") but could not find and invoke the GeneratedPluginRegistrant.");
            Log.w(TAG, stringBuilder.toString());
            return;
        }
    }

    /*
     * Exception decompiling
     */
    private void switchLaunchThemeForNormalTheme() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl31 : RETURN : trying to set 1 previously set to 0
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

    public static CachedEngineIntentBuilder withCachedEngine(String string) {
        return new Object(FlutterActivity.class, string){
            private final Class<? extends FlutterActivity> activityClass;
            private String backgroundMode = FlutterActivityLaunchConfigs.DEFAULT_BACKGROUND_MODE;
            private final String cachedEngineId;
            private boolean destroyEngineWithActivity = false;
            {
                this.activityClass = class_;
                this.cachedEngineId = string;
            }

            public CachedEngineIntentBuilder backgroundMode(FlutterActivityLaunchConfigs.BackgroundMode backgroundMode) {
                this.backgroundMode = backgroundMode.name();
                return this;
            }

            public Intent build(Context context) {
                return new Intent(context, this.activityClass).putExtra("cached_engine_id", this.cachedEngineId).putExtra("destroy_engine_with_activity", this.destroyEngineWithActivity).putExtra("background_mode", this.backgroundMode);
            }

            public CachedEngineIntentBuilder destroyEngineWithActivity(boolean bl) {
                this.destroyEngineWithActivity = bl;
                return this;
            }
        };
    }

    public static NewEngineIntentBuilder withNewEngine() {
        return new Object(FlutterActivity.class){
            private final Class<? extends FlutterActivity> activityClass;
            private String backgroundMode = FlutterActivityLaunchConfigs.DEFAULT_BACKGROUND_MODE;
            private String initialRoute = "/";
            {
                this.activityClass = class_;
            }

            public NewEngineIntentBuilder backgroundMode(FlutterActivityLaunchConfigs.BackgroundMode backgroundMode) {
                this.backgroundMode = backgroundMode.name();
                return this;
            }

            public Intent build(Context context) {
                return new Intent(context, this.activityClass).putExtra("route", this.initialRoute).putExtra("background_mode", this.backgroundMode).putExtra("destroy_engine_with_activity", true);
            }

            public NewEngineIntentBuilder initialRoute(String string) {
                this.initialRoute = string;
                return this;
            }
        };
    }

    @Override
    public void cleanUpFlutterEngine(FlutterEngine flutterEngine) {
    }

    @Override
    public void configureFlutterEngine(FlutterEngine flutterEngine) {
        FlutterActivity.registerPlugins(flutterEngine);
    }

    @Override
    public Activity getActivity() {
        return this;
    }

    @Override
    public String getAppBundlePath() {
        String string;
        if (this.isDebuggable() && "android.intent.action.RUN".equals((Object)this.getIntent().getAction()) && (string = this.getIntent().getDataString()) != null) {
            return string;
        }
        return FlutterMain.findAppBundlePath();
    }

    protected FlutterActivityLaunchConfigs.BackgroundMode getBackgroundMode() {
        if (this.getIntent().hasExtra("background_mode")) {
            return FlutterActivityLaunchConfigs.BackgroundMode.valueOf(this.getIntent().getStringExtra("background_mode"));
        }
        return FlutterActivityLaunchConfigs.BackgroundMode.opaque;
    }

    @Override
    public String getCachedEngineId() {
        return this.getIntent().getStringExtra("cached_engine_id");
    }

    @Override
    public Context getContext() {
        return this;
    }

    /*
     * Exception decompiling
     */
    @Override
    public String getDartEntrypointFunctionName() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Underrun type stack
        // org.benf.cfr.reader.b.a.c.e.a(StackSim.java:35)
        // org.benf.cfr.reader.b.b.af.a(OperationFactoryPop.java:20)
        // org.benf.cfr.reader.b.b.e.a(JVMInstr.java:315)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:195)
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

    protected FlutterEngine getFlutterEngine() {
        return this.delegate.getFlutterEngine();
    }

    @Override
    public FlutterShellArgs getFlutterShellArgs() {
        return FlutterShellArgs.fromIntent(this.getIntent());
    }

    /*
     * Exception decompiling
     */
    @Override
    public String getInitialRoute() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Underrun type stack
        // org.benf.cfr.reader.b.a.c.e.a(StackSim.java:35)
        // org.benf.cfr.reader.b.b.af.a(OperationFactoryPop.java:20)
        // org.benf.cfr.reader.b.b.e.a(JVMInstr.java:315)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:195)
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

    @Override
    public e getLifecycle() {
        return this.lifecycle;
    }

    @Override
    public RenderMode getRenderMode() {
        if (this.getBackgroundMode() == FlutterActivityLaunchConfigs.BackgroundMode.opaque) {
            return RenderMode.surface;
        }
        return RenderMode.texture;
    }

    @Override
    public TransparencyMode getTransparencyMode() {
        if (this.getBackgroundMode() == FlutterActivityLaunchConfigs.BackgroundMode.opaque) {
            return TransparencyMode.opaque;
        }
        return TransparencyMode.transparent;
    }

    protected void onActivityResult(int n2, int n3, Intent intent) {
        this.delegate.onActivityResult(n2, n3, intent);
    }

    public void onBackPressed() {
        this.delegate.onBackPressed();
    }

    protected void onCreate(Bundle bundle) {
        FlutterActivity.super.switchLaunchThemeForNormalTheme();
        super.onCreate(bundle);
        this.lifecycle.a(e.a.ON_CREATE);
        this.delegate = new FlutterActivityAndFragmentDelegate(this);
        this.delegate.onAttach((Context)this);
        this.delegate.onActivityCreated(bundle);
        FlutterActivity.super.configureWindowForTransparency();
        this.setContentView(FlutterActivity.super.createFlutterView());
        FlutterActivity.super.configureStatusBarForFullscreenFlutterExperience();
    }

    protected void onDestroy() {
        super.onDestroy();
        this.delegate.onDestroyView();
        this.delegate.onDetach();
        this.lifecycle.a(e.a.ON_DESTROY);
    }

    @Override
    public void onFlutterSurfaceViewCreated(FlutterSurfaceView flutterSurfaceView) {
    }

    @Override
    public void onFlutterTextureViewCreated(FlutterTextureView flutterTextureView) {
    }

    @Override
    public void onFlutterUiDisplayed() {
        if (Build.VERSION.SDK_INT >= 21) {
            this.reportFullyDrawn();
        }
    }

    @Override
    public void onFlutterUiNoLongerDisplayed() {
    }

    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        this.delegate.onNewIntent(intent);
    }

    protected void onPause() {
        super.onPause();
        this.delegate.onPause();
        this.lifecycle.a(e.a.ON_PAUSE);
    }

    public void onPostResume() {
        super.onPostResume();
        this.delegate.onPostResume();
    }

    public void onRequestPermissionsResult(int n2, String[] arrstring, int[] arrn) {
        this.delegate.onRequestPermissionsResult(n2, arrstring, arrn);
    }

    protected void onResume() {
        super.onResume();
        this.lifecycle.a(e.a.ON_RESUME);
        this.delegate.onResume();
    }

    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.delegate.onSaveInstanceState(bundle);
    }

    protected void onStart() {
        super.onStart();
        this.lifecycle.a(e.a.ON_START);
        this.delegate.onStart();
    }

    protected void onStop() {
        super.onStop();
        this.delegate.onStop();
        this.lifecycle.a(e.a.ON_STOP);
    }

    public void onTrimMemory(int n2) {
        super.onTrimMemory(n2);
        this.delegate.onTrimMemory(n2);
    }

    public void onUserLeaveHint() {
        this.delegate.onUserLeaveHint();
    }

    @Override
    public FlutterEngine provideFlutterEngine(Context context) {
        return null;
    }

    @Override
    public PlatformPlugin providePlatformPlugin(Activity activity, FlutterEngine flutterEngine) {
        if (activity != null) {
            return new PlatformPlugin(this.getActivity(), flutterEngine.getPlatformChannel());
        }
        return null;
    }

    @Override
    public SplashScreen provideSplashScreen() {
        Drawable drawable = this.getSplashScreenFromManifest();
        if (drawable != null) {
            return new DrawableSplashScreen(drawable);
        }
        return null;
    }

    void setDelegate(FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate) {
        this.delegate = flutterActivityAndFragmentDelegate;
    }

    @Override
    public boolean shouldAttachEngineToActivity() {
        return true;
    }

    @Override
    public boolean shouldDestroyEngineWithHost() {
        boolean bl = this.getIntent().getBooleanExtra("destroy_engine_with_activity", false);
        if (this.getCachedEngineId() == null) {
            if (this.delegate.isFlutterEngineFromHost()) {
                return bl;
            }
            bl = this.getIntent().getBooleanExtra("destroy_engine_with_activity", true);
        }
        return bl;
    }

}

