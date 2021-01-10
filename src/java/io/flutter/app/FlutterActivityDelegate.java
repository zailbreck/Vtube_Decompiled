/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ActivityInfo
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.content.res.Resources$NotFoundException
 *  android.content.res.Resources$Theme
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.util.TypedValue
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 *  android.view.WindowManager
 *  android.view.WindowManager$LayoutParams
 *  io.flutter.util.Preconditions
 *  io.flutter.view.FlutterMain
 *  io.flutter.view.FlutterRunArguments
 *  io.flutter.view.FlutterView$FirstFrameListener
 *  io.flutter.view.FlutterView$Provider
 *  java.lang.Boolean
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 */
package io.flutter.app;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import io.flutter.app.FlutterActivityDelegate;
import io.flutter.app.FlutterActivityEvents;
import io.flutter.app.FlutterApplication;
import io.flutter.app.FlutterPluginRegistry;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.util.Preconditions;
import io.flutter.view.FlutterMain;
import io.flutter.view.FlutterNativeView;
import io.flutter.view.FlutterRunArguments;
import io.flutter.view.FlutterView;
import java.util.ArrayList;

public final class FlutterActivityDelegate
implements FlutterActivityEvents,
FlutterView.Provider,
PluginRegistry {
    private static final String SPLASH_SCREEN_META_DATA_KEY = "io.flutter.app.android.SplashScreenUntilFirstFrame";
    private static final String TAG = "FlutterActivityDelegate";
    private static final WindowManager.LayoutParams matchParent = new WindowManager.LayoutParams(-1, -1);
    private final Activity activity;
    private FlutterView flutterView;
    private View launchView;
    private final ViewFactory viewFactory;

    public FlutterActivityDelegate(Activity activity, ViewFactory viewFactory) {
        this.activity = (Activity)Preconditions.checkNotNull((Object)activity);
        this.viewFactory = Preconditions.checkNotNull((Object)viewFactory);
    }

    static /* synthetic */ View access$000(FlutterActivityDelegate flutterActivityDelegate) {
        return flutterActivityDelegate.launchView;
    }

    static /* synthetic */ View access$002(FlutterActivityDelegate flutterActivityDelegate, View view) {
        flutterActivityDelegate.launchView = view;
        return view;
    }

    static /* synthetic */ FlutterView access$100(FlutterActivityDelegate flutterActivityDelegate) {
        return flutterActivityDelegate.flutterView;
    }

    private void addLaunchView() {
        View view = this.launchView;
        if (view == null) {
            return;
        }
        this.activity.addContentView(view, (ViewGroup.LayoutParams)matchParent);
        this.flutterView.addFirstFrameListener(new FlutterView.FirstFrameListener(this){
            final /* synthetic */ FlutterActivityDelegate this$0;
            {
                this.this$0 = flutterActivityDelegate;
            }

            public void onFirstFrame() {
                FlutterActivityDelegate.access$000(this.this$0).animate().alpha(0.0f).setListener((android.animation.Animator$AnimatorListener)new android.animation.AnimatorListenerAdapter(this){
                    final /* synthetic */ 1 this$1;
                    {
                        this.this$1 = var1;
                    }

                    public void onAnimationEnd(android.animation.Animator animator) {
                        ((ViewGroup)FlutterActivityDelegate.access$000(this.this$1.this$0).getParent()).removeView(FlutterActivityDelegate.access$000(this.this$1.this$0));
                        FlutterActivityDelegate.access$002(this.this$1.this$0, null);
                    }
                });
                FlutterActivityDelegate.access$100(this.this$0).removeFirstFrameListener(this);
            }
        });
        this.activity.setTheme(16973833);
    }

    private View createLaunchView() {
        if (!this.showSplashScreenUntilFirstFrame().booleanValue()) {
            return null;
        }
        Drawable drawable = this.getLaunchScreenDrawableFromActivityTheme();
        if (drawable == null) {
            return null;
        }
        View view = new View((Context)this.activity);
        view.setLayoutParams((ViewGroup.LayoutParams)matchParent);
        view.setBackground(drawable);
        return view;
    }

    private static String[] getArgsFromIntent(Intent intent) {
        int n2;
        ArrayList arrayList = new ArrayList();
        if (intent.getBooleanExtra("trace-startup", false)) {
            arrayList.add((Object)"--trace-startup");
        }
        if (intent.getBooleanExtra("start-paused", false)) {
            arrayList.add((Object)"--start-paused");
        }
        if (intent.getBooleanExtra("disable-service-auth-codes", false)) {
            arrayList.add((Object)"--disable-service-auth-codes");
        }
        if (intent.getBooleanExtra("use-test-fonts", false)) {
            arrayList.add((Object)"--use-test-fonts");
        }
        if (intent.getBooleanExtra("enable-dart-profiling", false)) {
            arrayList.add((Object)"--enable-dart-profiling");
        }
        if (intent.getBooleanExtra("enable-software-rendering", false)) {
            arrayList.add((Object)"--enable-software-rendering");
        }
        if (intent.getBooleanExtra("skia-deterministic-rendering", false)) {
            arrayList.add((Object)"--skia-deterministic-rendering");
        }
        if (intent.getBooleanExtra("trace-skia", false)) {
            arrayList.add((Object)"--trace-skia");
        }
        if (intent.getBooleanExtra("trace-systrace", false)) {
            arrayList.add((Object)"--trace-systrace");
        }
        if (intent.getBooleanExtra("dump-skp-on-shader-compilation", false)) {
            arrayList.add((Object)"--dump-skp-on-shader-compilation");
        }
        if (intent.getBooleanExtra("cache-sksl", false)) {
            arrayList.add((Object)"--cache-sksl");
        }
        if (intent.getBooleanExtra("verbose-logging", false)) {
            arrayList.add((Object)"--verbose-logging");
        }
        if ((n2 = intent.getIntExtra("observatory-port", 0)) > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("--observatory-port=");
            stringBuilder.append(Integer.toString((int)n2));
            arrayList.add((Object)stringBuilder.toString());
        }
        if (intent.getBooleanExtra("disable-service-auth-codes", false)) {
            arrayList.add((Object)"--disable-service-auth-codes");
        }
        if (intent.getBooleanExtra("endless-trace-buffer", false)) {
            arrayList.add((Object)"--endless-trace-buffer");
        }
        if (intent.hasExtra("dart-flags")) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("--dart-flags=");
            stringBuilder.append(intent.getStringExtra("dart-flags"));
            arrayList.add((Object)stringBuilder.toString());
        }
        if (!arrayList.isEmpty()) {
            return (String[])arrayList.toArray((Object[])new String[arrayList.size()]);
        }
        return null;
    }

    private Drawable getLaunchScreenDrawableFromActivityTheme() {
        TypedValue typedValue = new TypedValue();
        if (!this.activity.getTheme().resolveAttribute(16842836, typedValue, true)) {
            return null;
        }
        if (typedValue.resourceId == 0) {
            return null;
        }
        try {
            Drawable drawable = this.activity.getResources().getDrawable(typedValue.resourceId);
            return drawable;
        }
        catch (Resources.NotFoundException notFoundException) {
            Log.e((String)TAG, (String)"Referenced launch screen windowBackground resource does not exist");
            return null;
        }
    }

    private boolean isDebuggable() {
        return (2 & this.activity.getApplicationInfo().flags) != 0;
    }

    private boolean loadIntent(Intent intent) {
        if ("android.intent.action.RUN".equals((Object)intent.getAction())) {
            String string = intent.getStringExtra("route");
            String string2 = intent.getDataString();
            if (string2 == null) {
                string2 = FlutterMain.findAppBundlePath();
            }
            if (string != null) {
                this.flutterView.setInitialRoute(string);
            }
            FlutterActivityDelegate.super.runBundle(string2);
            return true;
        }
        return false;
    }

    private void runBundle(String string) {
        if (!this.flutterView.getFlutterNativeView().isApplicationRunning()) {
            FlutterRunArguments flutterRunArguments = new FlutterRunArguments();
            flutterRunArguments.bundlePath = string;
            flutterRunArguments.entrypoint = "main";
            this.flutterView.runFromBundle(flutterRunArguments);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Boolean showSplashScreenUntilFirstFrame() {
        try {
            Bundle bundle = this.activity.getPackageManager().getActivityInfo((ComponentName)this.activity.getComponentName(), (int)129).metaData;
            boolean bl = bundle != null && bundle.getBoolean(SPLASH_SCREEN_META_DATA_KEY);
            return bl;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return false;
        }
    }

    public FlutterView getFlutterView() {
        return this.flutterView;
    }

    @Override
    public boolean hasPlugin(String string) {
        return this.flutterView.getPluginRegistry().hasPlugin(string);
    }

    @Override
    public boolean onActivityResult(int n2, int n3, Intent intent) {
        return this.flutterView.getPluginRegistry().onActivityResult(n2, n3, intent);
    }

    @Override
    public boolean onBackPressed() {
        FlutterView flutterView = this.flutterView;
        if (flutterView != null) {
            flutterView.popRoute();
            return true;
        }
        return false;
    }

    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override
    public void onCreate(Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.activity.getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(1073741824);
            window.getDecorView().setSystemUiVisibility(1280);
        }
        String[] arrstring = FlutterActivityDelegate.getArgsFromIntent(this.activity.getIntent());
        FlutterMain.ensureInitializationComplete((Context)this.activity.getApplicationContext(), (String[])arrstring);
        this.flutterView = this.viewFactory.createFlutterView((Context)this.activity);
        if (this.flutterView == null) {
            FlutterNativeView flutterNativeView = this.viewFactory.createFlutterNativeView();
            this.flutterView = new FlutterView((Context)this.activity, null, flutterNativeView);
            this.flutterView.setLayoutParams((ViewGroup.LayoutParams)matchParent);
            this.activity.setContentView((View)this.flutterView);
            this.launchView = FlutterActivityDelegate.super.createLaunchView();
            if (this.launchView != null) {
                FlutterActivityDelegate.super.addLaunchView();
            }
        }
        if (FlutterActivityDelegate.super.loadIntent(this.activity.getIntent())) {
            return;
        }
        String string = FlutterMain.findAppBundlePath();
        if (string != null) {
            FlutterActivityDelegate.super.runBundle(string);
        }
    }

    @Override
    public void onDestroy() {
        FlutterApplication flutterApplication;
        FlutterView flutterView;
        Application application = (Application)this.activity.getApplicationContext();
        if (application instanceof FlutterApplication && this.activity.equals((Object)(flutterApplication = (FlutterApplication)application).getCurrentActivity())) {
            flutterApplication.setCurrentActivity(null);
        }
        if ((flutterView = this.flutterView) != null) {
            if (!flutterView.getPluginRegistry().onViewDestroy(this.flutterView.getFlutterNativeView()) && !this.viewFactory.retainFlutterNativeView()) {
                this.flutterView.destroy();
                return;
            }
            this.flutterView.detach();
        }
    }

    public void onLowMemory() {
        this.flutterView.onMemoryPressure();
    }

    @Override
    public void onNewIntent(Intent intent) {
        if (!FlutterActivityDelegate.super.isDebuggable() || !FlutterActivityDelegate.super.loadIntent(intent)) {
            this.flutterView.getPluginRegistry().onNewIntent(intent);
        }
    }

    @Override
    public void onPause() {
        FlutterView flutterView;
        FlutterApplication flutterApplication;
        Application application = (Application)this.activity.getApplicationContext();
        if (application instanceof FlutterApplication && this.activity.equals((Object)(flutterApplication = (FlutterApplication)application).getCurrentActivity())) {
            flutterApplication.setCurrentActivity(null);
        }
        if ((flutterView = this.flutterView) != null) {
            flutterView.onPause();
        }
    }

    @Override
    public void onPostResume() {
        FlutterView flutterView = this.flutterView;
        if (flutterView != null) {
            flutterView.onPostResume();
        }
    }

    @Override
    public boolean onRequestPermissionsResult(int n2, String[] arrstring, int[] arrn) {
        return this.flutterView.getPluginRegistry().onRequestPermissionsResult(n2, arrstring, arrn);
    }

    @Override
    public void onResume() {
        Application application = (Application)this.activity.getApplicationContext();
        if (application instanceof FlutterApplication) {
            ((FlutterApplication)application).setCurrentActivity(this.activity);
        }
    }

    @Override
    public void onStart() {
        FlutterView flutterView = this.flutterView;
        if (flutterView != null) {
            flutterView.onStart();
        }
    }

    @Override
    public void onStop() {
        this.flutterView.onStop();
    }

    public void onTrimMemory(int n2) {
        if (n2 == 10) {
            this.flutterView.onMemoryPressure();
        }
    }

    @Override
    public void onUserLeaveHint() {
        this.flutterView.getPluginRegistry().onUserLeaveHint();
    }

    @Override
    public PluginRegistry.Registrar registrarFor(String string) {
        return this.flutterView.getPluginRegistry().registrarFor(string);
    }

    @Override
    public <T> T valuePublishedByPlugin(String string) {
        return this.flutterView.getPluginRegistry().valuePublishedByPlugin(string);
    }

}

