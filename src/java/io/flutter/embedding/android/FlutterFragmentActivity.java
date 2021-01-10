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
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 *  android.widget.FrameLayout
 *  androidx.fragment.app.Fragment
 *  androidx.fragment.app.b
 *  androidx.fragment.app.g
 *  androidx.fragment.app.j
 *  io.flutter.view.FlutterMain
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
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
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.b;
import androidx.fragment.app.g;
import androidx.fragment.app.j;
import io.flutter.Log;
import io.flutter.embedding.android.DrawableSplashScreen;
import io.flutter.embedding.android.FlutterActivityLaunchConfigs;
import io.flutter.embedding.android.FlutterEngineConfigurator;
import io.flutter.embedding.android.FlutterEngineProvider;
import io.flutter.embedding.android.FlutterFragment;
import io.flutter.embedding.android.RenderMode;
import io.flutter.embedding.android.SplashScreen;
import io.flutter.embedding.android.SplashScreenProvider;
import io.flutter.embedding.android.TransparencyMode;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterShellArgs;
import io.flutter.view.FlutterMain;

public class FlutterFragmentActivity
extends b
implements SplashScreenProvider,
FlutterEngineProvider,
FlutterEngineConfigurator {
    private static final int FRAGMENT_CONTAINER_ID = 609893468;
    private static final String TAG = "FlutterFragmentActivity";
    private static final String TAG_FLUTTER_FRAGMENT = "flutter_fragment";
    private FlutterFragment flutterFragment;

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
        return FlutterFragmentActivity.withNewEngine().build(context);
    }

    private View createFragmentContainer() {
        FrameLayout frameLayout = new FrameLayout((Context)this);
        frameLayout.setId(609893468);
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        return frameLayout;
    }

    private void ensureFlutterFragmentCreated() {
        g g2 = this.getSupportFragmentManager();
        this.flutterFragment = (FlutterFragment)g2.a(TAG_FLUTTER_FRAGMENT);
        if (this.flutterFragment == null) {
            this.flutterFragment = this.createFlutterFragment();
            j j2 = g2.a();
            j2.a(609893468, (Fragment)this.flutterFragment, TAG_FLUTTER_FRAGMENT);
            j2.a();
        }
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
        return new Object(FlutterFragmentActivity.class, string){
            private final Class<? extends FlutterFragmentActivity> activityClass;
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
        return new Object(FlutterFragmentActivity.class){
            private final Class<? extends FlutterFragmentActivity> activityClass;
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
    }

    protected FlutterFragment createFlutterFragment() {
        FlutterActivityLaunchConfigs.BackgroundMode backgroundMode = this.getBackgroundMode();
        RenderMode renderMode = backgroundMode == FlutterActivityLaunchConfigs.BackgroundMode.opaque ? RenderMode.surface : RenderMode.texture;
        TransparencyMode transparencyMode = backgroundMode == FlutterActivityLaunchConfigs.BackgroundMode.opaque ? TransparencyMode.opaque : TransparencyMode.transparent;
        if (this.getCachedEngineId() != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Creating FlutterFragment with cached engine:\nCached engine ID: ");
            stringBuilder.append(this.getCachedEngineId());
            stringBuilder.append("\nWill destroy engine when Activity is destroyed: ");
            stringBuilder.append(this.shouldDestroyEngineWithHost());
            stringBuilder.append("\nBackground transparency mode: ");
            stringBuilder.append((Object)backgroundMode);
            stringBuilder.append("\nWill attach FlutterEngine to Activity: ");
            stringBuilder.append(this.shouldAttachEngineToActivity());
            Log.v(TAG, stringBuilder.toString());
            return FlutterFragment.withCachedEngine(this.getCachedEngineId()).renderMode(renderMode).transparencyMode(transparencyMode).shouldAttachEngineToActivity(this.shouldAttachEngineToActivity()).destroyEngineWithFragment(this.shouldDestroyEngineWithHost()).build();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Creating FlutterFragment with new engine:\nBackground transparency mode: ");
        stringBuilder.append((Object)backgroundMode);
        stringBuilder.append("\nDart entrypoint: ");
        stringBuilder.append(this.getDartEntrypointFunctionName());
        stringBuilder.append("\nInitial route: ");
        stringBuilder.append(this.getInitialRoute());
        stringBuilder.append("\nApp bundle path: ");
        stringBuilder.append(this.getAppBundlePath());
        stringBuilder.append("\nWill attach FlutterEngine to Activity: ");
        stringBuilder.append(this.shouldAttachEngineToActivity());
        Log.v(TAG, stringBuilder.toString());
        return FlutterFragment.withNewEngine().dartEntrypoint(this.getDartEntrypointFunctionName()).initialRoute(this.getInitialRoute()).appBundlePath(this.getAppBundlePath()).flutterShellArgs(FlutterShellArgs.fromIntent(this.getIntent())).renderMode(renderMode).transparencyMode(transparencyMode).shouldAttachEngineToActivity(this.shouldAttachEngineToActivity()).build();
    }

    protected String getAppBundlePath() {
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

    protected String getCachedEngineId() {
        return this.getIntent().getStringExtra("cached_engine_id");
    }

    /*
     * Exception decompiling
     */
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
        return this.flutterFragment.getFlutterEngine();
    }

    /*
     * Exception decompiling
     */
    protected String getInitialRoute() {
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

    protected void onActivityResult(int n2, int n3, Intent intent) {
        super.onActivityResult(n2, n3, intent);
        this.flutterFragment.onActivityResult(n2, n3, intent);
    }

    public void onBackPressed() {
        this.flutterFragment.onBackPressed();
    }

    protected void onCreate(Bundle bundle) {
        FlutterFragmentActivity.super.switchLaunchThemeForNormalTheme();
        super.onCreate(bundle);
        FlutterFragmentActivity.super.configureWindowForTransparency();
        this.setContentView(FlutterFragmentActivity.super.createFragmentContainer());
        FlutterFragmentActivity.super.configureStatusBarForFullscreenFlutterExperience();
        FlutterFragmentActivity.super.ensureFlutterFragmentCreated();
    }

    protected void onNewIntent(Intent intent) {
        this.flutterFragment.onNewIntent(intent);
        super.onNewIntent(intent);
    }

    public void onPostResume() {
        super.onPostResume();
        this.flutterFragment.onPostResume();
    }

    public void onRequestPermissionsResult(int n2, String[] arrstring, int[] arrn) {
        super.onRequestPermissionsResult(n2, arrstring, arrn);
        this.flutterFragment.onRequestPermissionsResult(n2, arrstring, arrn);
    }

    public void onTrimMemory(int n2) {
        Activity.super.onTrimMemory(n2);
        this.flutterFragment.onTrimMemory(n2);
    }

    public void onUserLeaveHint() {
        this.flutterFragment.onUserLeaveHint();
    }

    @Override
    public FlutterEngine provideFlutterEngine(Context context) {
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

    protected boolean shouldAttachEngineToActivity() {
        return true;
    }

    public boolean shouldDestroyEngineWithHost() {
        return this.getIntent().getBooleanExtra("destroy_engine_with_activity", false);
    }

}

