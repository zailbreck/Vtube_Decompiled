/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  androidx.fragment.app.Fragment
 *  androidx.fragment.app.b
 *  io.flutter.view.FlutterMain
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.annotation.Annotation
 *  java.lang.reflect.Constructor
 */
package io.flutter.embedding.android;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.b;
import io.flutter.Log;
import io.flutter.embedding.android.FlutterActivityAndFragmentDelegate;
import io.flutter.embedding.android.FlutterEngineConfigurator;
import io.flutter.embedding.android.FlutterEngineProvider;
import io.flutter.embedding.android.FlutterFragment;
import io.flutter.embedding.android.FlutterSurfaceView;
import io.flutter.embedding.android.FlutterTextureView;
import io.flutter.embedding.android.RenderMode;
import io.flutter.embedding.android.SplashScreen;
import io.flutter.embedding.android.SplashScreenProvider;
import io.flutter.embedding.android.TransparencyMode;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.FlutterShellArgs;
import io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
import io.flutter.embedding.engine.systemchannels.PlatformChannel;
import io.flutter.plugin.platform.PlatformPlugin;
import io.flutter.view.FlutterMain;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

public class FlutterFragment
extends Fragment
implements FlutterActivityAndFragmentDelegate.Host {
    protected static final String ARG_APP_BUNDLE_PATH = "app_bundle_path";
    protected static final String ARG_CACHED_ENGINE_ID = "cached_engine_id";
    protected static final String ARG_DART_ENTRYPOINT = "dart_entrypoint";
    protected static final String ARG_DESTROY_ENGINE_WITH_FRAGMENT = "destroy_engine_with_fragment";
    protected static final String ARG_FLUTTERVIEW_RENDER_MODE = "flutterview_render_mode";
    protected static final String ARG_FLUTTERVIEW_TRANSPARENCY_MODE = "flutterview_transparency_mode";
    protected static final String ARG_FLUTTER_INITIALIZATION_ARGS = "initialization_args";
    protected static final String ARG_INITIAL_ROUTE = "initial_route";
    protected static final String ARG_SHOULD_ATTACH_ENGINE_TO_ACTIVITY = "should_attach_engine_to_activity";
    private static final String TAG = "FlutterFragment";
    FlutterActivityAndFragmentDelegate delegate;

    public FlutterFragment() {
        this.setArguments(new Bundle());
    }

    public static FlutterFragment createDefault() {
        return new Object(){
            private String appBundlePath;
            private String dartEntrypoint;
            private final Class<? extends FlutterFragment> fragmentClass;
            private String initialRoute;
            private RenderMode renderMode;
            private FlutterShellArgs shellArgs;
            private boolean shouldAttachEngineToActivity;
            private TransparencyMode transparencyMode;
            {
                this.dartEntrypoint = "main";
                this.initialRoute = "/";
                this.appBundlePath = null;
                this.shellArgs = null;
                this.renderMode = RenderMode.surface;
                this.transparencyMode = TransparencyMode.transparent;
                this.shouldAttachEngineToActivity = true;
                this.fragmentClass = FlutterFragment.class;
            }
            {
                this.dartEntrypoint = "main";
                this.initialRoute = "/";
                this.appBundlePath = null;
                this.shellArgs = null;
                this.renderMode = RenderMode.surface;
                this.transparencyMode = TransparencyMode.transparent;
                this.shouldAttachEngineToActivity = true;
                this.fragmentClass = class_;
            }

            public NewEngineFragmentBuilder appBundlePath(String string) {
                this.appBundlePath = string;
                return this;
            }

            public <T extends FlutterFragment> T build() {
                block4 : {
                    FlutterFragment flutterFragment;
                    try {
                        flutterFragment = (FlutterFragment)this.fragmentClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        if (flutterFragment == null) break block4;
                    }
                    catch (Exception exception) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Could not instantiate FlutterFragment subclass (");
                        stringBuilder.append(this.fragmentClass.getName());
                        stringBuilder.append(")");
                        throw new RuntimeException(stringBuilder.toString(), (Throwable)exception);
                    }
                    flutterFragment.setArguments(this.createArgs());
                    return (T)flutterFragment;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("The FlutterFragment subclass sent in the constructor (");
                stringBuilder.append(this.fragmentClass.getCanonicalName());
                stringBuilder.append(") does not match the expected return type.");
                throw new RuntimeException(stringBuilder.toString());
            }

            protected Bundle createArgs() {
                RenderMode renderMode;
                Bundle bundle = new Bundle();
                bundle.putString(FlutterFragment.ARG_INITIAL_ROUTE, this.initialRoute);
                bundle.putString(FlutterFragment.ARG_APP_BUNDLE_PATH, this.appBundlePath);
                bundle.putString(FlutterFragment.ARG_DART_ENTRYPOINT, this.dartEntrypoint);
                FlutterShellArgs flutterShellArgs = this.shellArgs;
                if (flutterShellArgs != null) {
                    bundle.putStringArray(FlutterFragment.ARG_FLUTTER_INITIALIZATION_ARGS, flutterShellArgs.toArray());
                }
                if ((renderMode = this.renderMode) == null) {
                    renderMode = RenderMode.surface;
                }
                bundle.putString(FlutterFragment.ARG_FLUTTERVIEW_RENDER_MODE, renderMode.name());
                TransparencyMode transparencyMode = this.transparencyMode;
                if (transparencyMode == null) {
                    transparencyMode = TransparencyMode.transparent;
                }
                bundle.putString(FlutterFragment.ARG_FLUTTERVIEW_TRANSPARENCY_MODE, transparencyMode.name());
                bundle.putBoolean(FlutterFragment.ARG_SHOULD_ATTACH_ENGINE_TO_ACTIVITY, this.shouldAttachEngineToActivity);
                bundle.putBoolean(FlutterFragment.ARG_DESTROY_ENGINE_WITH_FRAGMENT, true);
                return bundle;
            }

            public NewEngineFragmentBuilder dartEntrypoint(String string) {
                this.dartEntrypoint = string;
                return this;
            }

            public NewEngineFragmentBuilder flutterShellArgs(FlutterShellArgs flutterShellArgs) {
                this.shellArgs = flutterShellArgs;
                return this;
            }

            public NewEngineFragmentBuilder initialRoute(String string) {
                this.initialRoute = string;
                return this;
            }

            public NewEngineFragmentBuilder renderMode(RenderMode renderMode) {
                this.renderMode = renderMode;
                return this;
            }

            public NewEngineFragmentBuilder shouldAttachEngineToActivity(boolean bl) {
                this.shouldAttachEngineToActivity = bl;
                return this;
            }

            public NewEngineFragmentBuilder transparencyMode(TransparencyMode transparencyMode) {
                this.transparencyMode = transparencyMode;
                return this;
            }
        }.build();
    }

    public static CachedEngineFragmentBuilder withCachedEngine(String string) {
        return new Object(string, null){
            private boolean destroyEngineWithFragment;
            private final String engineId;
            private final Class<? extends FlutterFragment> fragmentClass;
            private RenderMode renderMode;
            private boolean shouldAttachEngineToActivity;
            private TransparencyMode transparencyMode;
            {
                this.destroyEngineWithFragment = false;
                this.renderMode = RenderMode.surface;
                this.transparencyMode = TransparencyMode.transparent;
                this.shouldAttachEngineToActivity = true;
                this.fragmentClass = class_;
                this.engineId = string;
            }

            public <T extends FlutterFragment> T build() {
                block4 : {
                    FlutterFragment flutterFragment;
                    try {
                        flutterFragment = (FlutterFragment)this.fragmentClass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        if (flutterFragment == null) break block4;
                    }
                    catch (Exception exception) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Could not instantiate FlutterFragment subclass (");
                        stringBuilder.append(this.fragmentClass.getName());
                        stringBuilder.append(")");
                        throw new RuntimeException(stringBuilder.toString(), (Throwable)exception);
                    }
                    flutterFragment.setArguments(this.createArgs());
                    return (T)flutterFragment;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("The FlutterFragment subclass sent in the constructor (");
                stringBuilder.append(this.fragmentClass.getCanonicalName());
                stringBuilder.append(") does not match the expected return type.");
                throw new RuntimeException(stringBuilder.toString());
            }

            protected Bundle createArgs() {
                Bundle bundle = new Bundle();
                bundle.putString(FlutterFragment.ARG_CACHED_ENGINE_ID, this.engineId);
                bundle.putBoolean(FlutterFragment.ARG_DESTROY_ENGINE_WITH_FRAGMENT, this.destroyEngineWithFragment);
                RenderMode renderMode = this.renderMode;
                if (renderMode == null) {
                    renderMode = RenderMode.surface;
                }
                bundle.putString(FlutterFragment.ARG_FLUTTERVIEW_RENDER_MODE, renderMode.name());
                TransparencyMode transparencyMode = this.transparencyMode;
                if (transparencyMode == null) {
                    transparencyMode = TransparencyMode.transparent;
                }
                bundle.putString(FlutterFragment.ARG_FLUTTERVIEW_TRANSPARENCY_MODE, transparencyMode.name());
                bundle.putBoolean(FlutterFragment.ARG_SHOULD_ATTACH_ENGINE_TO_ACTIVITY, this.shouldAttachEngineToActivity);
                return bundle;
            }

            public CachedEngineFragmentBuilder destroyEngineWithFragment(boolean bl) {
                this.destroyEngineWithFragment = bl;
                return this;
            }

            public CachedEngineFragmentBuilder renderMode(RenderMode renderMode) {
                this.renderMode = renderMode;
                return this;
            }

            public CachedEngineFragmentBuilder shouldAttachEngineToActivity(boolean bl) {
                this.shouldAttachEngineToActivity = bl;
                return this;
            }

            public CachedEngineFragmentBuilder transparencyMode(TransparencyMode transparencyMode) {
                this.transparencyMode = transparencyMode;
                return this;
            }
        };
    }

    public static NewEngineFragmentBuilder withNewEngine() {
        return new /* invalid duplicate definition of identical inner class */;
    }

    @Override
    public void cleanUpFlutterEngine(FlutterEngine flutterEngine) {
        b b2 = this.getActivity();
        if (b2 instanceof FlutterEngineConfigurator) {
            ((FlutterEngineConfigurator)b2).cleanUpFlutterEngine(flutterEngine);
        }
    }

    @Override
    public void configureFlutterEngine(FlutterEngine flutterEngine) {
        b b2 = this.getActivity();
        if (b2 instanceof FlutterEngineConfigurator) {
            ((FlutterEngineConfigurator)b2).configureFlutterEngine(flutterEngine);
        }
    }

    @Override
    public String getAppBundlePath() {
        return this.getArguments().getString(ARG_APP_BUNDLE_PATH, FlutterMain.findAppBundlePath());
    }

    @Override
    public String getCachedEngineId() {
        return this.getArguments().getString(ARG_CACHED_ENGINE_ID, null);
    }

    @Override
    public String getDartEntrypointFunctionName() {
        return this.getArguments().getString(ARG_DART_ENTRYPOINT, "main");
    }

    public FlutterEngine getFlutterEngine() {
        return this.delegate.getFlutterEngine();
    }

    @Override
    public FlutterShellArgs getFlutterShellArgs() {
        String[] arrstring = this.getArguments().getStringArray(ARG_FLUTTER_INITIALIZATION_ARGS);
        if (arrstring == null) {
            arrstring = new String[]{};
        }
        return new FlutterShellArgs(arrstring);
    }

    @Override
    public String getInitialRoute() {
        return this.getArguments().getString(ARG_INITIAL_ROUTE);
    }

    @Override
    public RenderMode getRenderMode() {
        return RenderMode.valueOf(this.getArguments().getString(ARG_FLUTTERVIEW_RENDER_MODE, RenderMode.surface.name()));
    }

    @Override
    public TransparencyMode getTransparencyMode() {
        return TransparencyMode.valueOf(this.getArguments().getString(ARG_FLUTTERVIEW_TRANSPARENCY_MODE, TransparencyMode.transparent.name()));
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.delegate.onActivityCreated(bundle);
    }

    public void onActivityResult(int n2, int n3, Intent intent) {
        this.delegate.onActivityResult(n2, n3, intent);
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        this.delegate = new FlutterActivityAndFragmentDelegate(this);
        this.delegate.onAttach(context);
    }

    @ActivityCallThrough
    public void onBackPressed() {
        this.delegate.onBackPressed();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.delegate.onCreateView(layoutInflater, viewGroup, bundle);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.delegate.onDestroyView();
    }

    public void onDetach() {
        super.onDetach();
        this.delegate.onDetach();
        this.delegate.release();
        this.delegate = null;
    }

    @Override
    public void onFlutterSurfaceViewCreated(FlutterSurfaceView flutterSurfaceView) {
    }

    @Override
    public void onFlutterTextureViewCreated(FlutterTextureView flutterTextureView) {
    }

    @Override
    public void onFlutterUiDisplayed() {
        b b2 = this.getActivity();
        if (b2 instanceof FlutterUiDisplayListener) {
            ((FlutterUiDisplayListener)b2).onFlutterUiDisplayed();
        }
    }

    @Override
    public void onFlutterUiNoLongerDisplayed() {
        b b2 = this.getActivity();
        if (b2 instanceof FlutterUiDisplayListener) {
            ((FlutterUiDisplayListener)b2).onFlutterUiNoLongerDisplayed();
        }
    }

    public void onLowMemory() {
        super.onLowMemory();
        this.delegate.onLowMemory();
    }

    @ActivityCallThrough
    public void onNewIntent(Intent intent) {
        this.delegate.onNewIntent(intent);
    }

    public void onPause() {
        super.onPause();
        this.delegate.onPause();
    }

    @ActivityCallThrough
    public void onPostResume() {
        this.delegate.onPostResume();
    }

    @ActivityCallThrough
    public void onRequestPermissionsResult(int n2, String[] arrstring, int[] arrn) {
        this.delegate.onRequestPermissionsResult(n2, arrstring, arrn);
    }

    public void onResume() {
        super.onResume();
        this.delegate.onResume();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.delegate.onSaveInstanceState(bundle);
    }

    public void onStart() {
        super.onStart();
        this.delegate.onStart();
    }

    public void onStop() {
        super.onStop();
        this.delegate.onStop();
    }

    @ActivityCallThrough
    public void onTrimMemory(int n2) {
        this.delegate.onTrimMemory(n2);
    }

    @ActivityCallThrough
    public void onUserLeaveHint() {
        this.delegate.onUserLeaveHint();
    }

    @Override
    public FlutterEngine provideFlutterEngine(Context context) {
        b b2 = this.getActivity();
        if (b2 instanceof FlutterEngineProvider) {
            Log.v(TAG, "Deferring to attached Activity to provide a FlutterEngine.");
            return ((FlutterEngineProvider)b2).provideFlutterEngine(this.getContext());
        }
        return null;
    }

    @Override
    public PlatformPlugin providePlatformPlugin(Activity activity, FlutterEngine flutterEngine) {
        if (activity != null) {
            return new PlatformPlugin((Activity)this.getActivity(), flutterEngine.getPlatformChannel());
        }
        return null;
    }

    @Override
    public SplashScreen provideSplashScreen() {
        b b2 = this.getActivity();
        if (b2 instanceof SplashScreenProvider) {
            return ((SplashScreenProvider)b2).provideSplashScreen();
        }
        return null;
    }

    void setDelegate(FlutterActivityAndFragmentDelegate flutterActivityAndFragmentDelegate) {
        this.delegate = flutterActivityAndFragmentDelegate;
    }

    @Override
    public boolean shouldAttachEngineToActivity() {
        return this.getArguments().getBoolean(ARG_SHOULD_ATTACH_ENGINE_TO_ACTIVITY);
    }

    @Override
    public boolean shouldDestroyEngineWithHost() {
        boolean bl = this.getArguments().getBoolean(ARG_DESTROY_ENGINE_WITH_FRAGMENT, false);
        if (this.getCachedEngineId() == null) {
            if (this.delegate.isFlutterEngineFromHost()) {
                return bl;
            }
            bl = this.getArguments().getBoolean(ARG_DESTROY_ENGINE_WITH_FRAGMENT, true);
        }
        return bl;
    }

}

