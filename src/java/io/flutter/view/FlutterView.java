/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.annotation.TargetApi
 *  android.app.Activity
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.Insets
 *  android.graphics.Rect
 *  android.graphics.SurfaceTexture
 *  android.graphics.SurfaceTexture$OnFrameAvailableListener
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.LocaleList
 *  android.text.format.DateFormat
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.util.Log
 *  android.view.Display
 *  android.view.KeyEvent
 *  android.view.MotionEvent
 *  android.view.SurfaceHolder
 *  android.view.SurfaceHolder$Callback
 *  android.view.SurfaceView
 *  android.view.View
 *  android.view.WindowInsets
 *  android.view.WindowManager
 *  android.view.accessibility.AccessibilityManager
 *  android.view.accessibility.AccessibilityNodeProvider
 *  android.view.inputmethod.EditorInfo
 *  android.view.inputmethod.InputConnection
 *  android.view.inputmethod.InputMethodManager
 *  io.flutter.view.AccessibilityBridge
 *  io.flutter.view.AccessibilityBridge$OnAccessibilityChangeListener
 *  io.flutter.view.FlutterMain
 *  io.flutter.view.FlutterRunArguments
 *  io.flutter.view.FlutterView$2
 *  io.flutter.view.FlutterView$FirstFrameListener
 *  io.flutter.view.FlutterView$SurfaceTextureRegistryEntry$1
 *  io.flutter.view.FlutterView$ViewportMetrics
 *  io.flutter.view.FlutterView$ZeroSides
 *  io.flutter.view.TextureRegistry
 *  io.flutter.view.TextureRegistry$SurfaceTextureEntry
 *  java.lang.AssertionError
 *  java.lang.Deprecated
 *  java.lang.Double
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.ByteBuffer
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 *  java.util.concurrent.atomic.AtomicLong
 */
package io.flutter.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Insets;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.LocaleList;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Display;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import io.flutter.app.FlutterPluginRegistry;
import io.flutter.embedding.android.AndroidKeyProcessor;
import io.flutter.embedding.android.AndroidTouchProcessor;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.systemchannels.AccessibilityChannel;
import io.flutter.embedding.engine.systemchannels.KeyEventChannel;
import io.flutter.embedding.engine.systemchannels.LifecycleChannel;
import io.flutter.embedding.engine.systemchannels.LocalizationChannel;
import io.flutter.embedding.engine.systemchannels.NavigationChannel;
import io.flutter.embedding.engine.systemchannels.PlatformChannel;
import io.flutter.embedding.engine.systemchannels.SettingsChannel;
import io.flutter.embedding.engine.systemchannels.SystemChannel;
import io.flutter.plugin.common.ActivityLifecycleListener;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.editing.TextInputPlugin;
import io.flutter.plugin.platform.PlatformPlugin;
import io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate;
import io.flutter.plugin.platform.PlatformViewsController;
import io.flutter.view.AccessibilityBridge;
import io.flutter.view.FlutterMain;
import io.flutter.view.FlutterNativeView;
import io.flutter.view.FlutterRunArguments;
import io.flutter.view.FlutterView;
import io.flutter.view.TextureRegistry;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicLong;

/*
 * Exception performing whole class analysis.
 */
public class FlutterView
extends SurfaceView
implements BinaryMessenger,
TextureRegistry {
    private static final String TAG = "FlutterView";
    private final AndroidKeyProcessor androidKeyProcessor;
    private final AndroidTouchProcessor androidTouchProcessor;
    private final DartExecutor dartExecutor;
    private boolean didRenderFirstFrame;
    private final FlutterRenderer flutterRenderer;
    private final KeyEventChannel keyEventChannel;
    private final LifecycleChannel lifecycleChannel;
    private final LocalizationChannel localizationChannel;
    private AccessibilityBridge mAccessibilityNodeProvider;
    private final List<ActivityLifecycleListener> mActivityLifecycleListeners;
    private final List<FirstFrameListener> mFirstFrameListeners;
    private final InputMethodManager mImm;
    private boolean mIsSoftwareRenderingEnabled;
    private final ViewportMetrics mMetrics;
    private FlutterNativeView mNativeView;
    private final SurfaceHolder.Callback mSurfaceCallback;
    private final TextInputPlugin mTextInputPlugin;
    private final NavigationChannel navigationChannel;
    private final AtomicLong nextTextureId;
    private final AccessibilityBridge.OnAccessibilityChangeListener onAccessibilityChangeListener;
    private final PlatformChannel platformChannel;
    private final SettingsChannel settingsChannel;
    private final SystemChannel systemChannel;

    public FlutterView(Context context) {
        super(context, null);
    }

    public FlutterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, null);
    }

    public FlutterView(Context context, AttributeSet attributeSet, FlutterNativeView flutterNativeView) {
        super(context, attributeSet);
        this.nextTextureId = new AtomicLong(0L);
        this.mIsSoftwareRenderingEnabled = false;
        this.didRenderFirstFrame = false;
        this.onAccessibilityChangeListener = new AccessibilityBridge.OnAccessibilityChangeListener(){

            public void onAccessibilityChanged(boolean bl, boolean bl2) {
                FlutterView.this.resetWillNotDraw(bl, bl2);
            }
        };
        Activity activity = FlutterView.getActivity(this.getContext());
        if (activity != null) {
            if (flutterNativeView == null) {
                flutterNativeView = new FlutterNativeView(activity.getApplicationContext());
            }
            this.mNativeView = flutterNativeView;
            this.dartExecutor = this.mNativeView.getDartExecutor();
            this.flutterRenderer = new FlutterRenderer(this.mNativeView.getFlutterJNI());
            this.mIsSoftwareRenderingEnabled = this.mNativeView.getFlutterJNI().nativeGetIsSoftwareRenderingEnabled();
            this.mMetrics = new /* Unavailable Anonymous Inner Class!! */;
            this.mMetrics.devicePixelRatio = context.getResources().getDisplayMetrics().density;
            this.setFocusable(true);
            this.setFocusableInTouchMode(true);
            this.mNativeView.attachViewAndActivity((FlutterView)this, activity);
            this.mSurfaceCallback = new 2((FlutterView)this);
            this.getHolder().addCallback(this.mSurfaceCallback);
            this.mActivityLifecycleListeners = new ArrayList();
            this.mFirstFrameListeners = new ArrayList();
            this.navigationChannel = new NavigationChannel(this.dartExecutor);
            this.keyEventChannel = new KeyEventChannel(this.dartExecutor);
            this.lifecycleChannel = new LifecycleChannel(this.dartExecutor);
            this.localizationChannel = new LocalizationChannel(this.dartExecutor);
            this.platformChannel = new PlatformChannel(this.dartExecutor);
            this.systemChannel = new SystemChannel(this.dartExecutor);
            this.settingsChannel = new SettingsChannel(this.dartExecutor);
            this.addActivityLifecycleListener(new ActivityLifecycleListener(new PlatformPlugin(activity, this.platformChannel)){
                final /* synthetic */ PlatformPlugin val$platformPlugin;
                {
                    this.val$platformPlugin = platformPlugin;
                }

                @Override
                public void onPostResume() {
                    this.val$platformPlugin.updateSystemUiOverlays();
                }
            });
            this.mImm = (InputMethodManager)this.getContext().getSystemService("input_method");
            PlatformViewsController platformViewsController = this.mNativeView.getPluginRegistry().getPlatformViewsController();
            this.mTextInputPlugin = new TextInputPlugin((View)this, this.dartExecutor, platformViewsController);
            this.androidKeyProcessor = new AndroidKeyProcessor(this.keyEventChannel, this.mTextInputPlugin);
            this.androidTouchProcessor = new AndroidTouchProcessor(this.flutterRenderer);
            this.mNativeView.getPluginRegistry().getPlatformViewsController().attachTextInputPlugin(this.mTextInputPlugin);
            FlutterView.super.sendLocalesToDart(this.getResources().getConfiguration());
            FlutterView.super.sendUserPlatformSettingsToDart();
            return;
        }
        throw new IllegalArgumentException("Bad context");
    }

    private static Activity getActivity(Context context) {
        if (context == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity)context;
        }
        if (context instanceof ContextWrapper) {
            return FlutterView.getActivity(((ContextWrapper)context).getBaseContext());
        }
        return null;
    }

    private boolean isAttached() {
        FlutterNativeView flutterNativeView = this.mNativeView;
        return flutterNativeView != null && flutterNativeView.isAttached();
    }

    private void postRun() {
    }

    private void preRun() {
        this.resetAccessibilityTree();
    }

    private void resetWillNotDraw(boolean bl, boolean bl2) {
        boolean bl3 = this.mIsSoftwareRenderingEnabled;
        boolean bl4 = false;
        if (!bl3) {
            bl4 = false;
            if (!bl) {
                bl4 = false;
                if (!bl2) {
                    bl4 = true;
                }
            }
        }
        this.setWillNotDraw(bl4);
    }

    private void sendLocalesToDart(Configuration configuration) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 24) {
            LocaleList localeList = configuration.getLocales();
            int n2 = localeList.size();
            for (int i2 = 0; i2 < n2; ++i2) {
                arrayList.add((Object)localeList.get(i2));
            }
        } else {
            arrayList.add((Object)configuration.locale);
        }
        this.localizationChannel.sendLocales((List<Locale>)arrayList);
    }

    private void sendUserPlatformSettingsToDart() {
        boolean bl = (48 & this.getResources().getConfiguration().uiMode) == 32;
        SettingsChannel.PlatformBrightness platformBrightness = bl ? SettingsChannel.PlatformBrightness.dark : SettingsChannel.PlatformBrightness.light;
        this.settingsChannel.startMessage().setTextScaleFactor(this.getResources().getConfiguration().fontScale).setUse24HourFormat(DateFormat.is24HourFormat((Context)this.getContext())).setPlatformBrightness(platformBrightness).send();
    }

    private void updateViewportMetrics() {
        if (!this.isAttached()) {
            return;
        }
        FlutterJNI flutterJNI = this.mNativeView.getFlutterJNI();
        ViewportMetrics viewportMetrics = this.mMetrics;
        flutterJNI.setViewportMetrics(viewportMetrics.devicePixelRatio, viewportMetrics.physicalWidth, viewportMetrics.physicalHeight, viewportMetrics.physicalPaddingTop, viewportMetrics.physicalPaddingRight, viewportMetrics.physicalPaddingBottom, viewportMetrics.physicalPaddingLeft, viewportMetrics.physicalViewInsetTop, viewportMetrics.physicalViewInsetRight, viewportMetrics.physicalViewInsetBottom, viewportMetrics.physicalViewInsetLeft, viewportMetrics.systemGestureInsetTop, viewportMetrics.systemGestureInsetRight, viewportMetrics.systemGestureInsetBottom, viewportMetrics.systemGestureInsetLeft);
    }

    public void addActivityLifecycleListener(ActivityLifecycleListener activityLifecycleListener) {
        this.mActivityLifecycleListeners.add((Object)activityLifecycleListener);
    }

    public void addFirstFrameListener(FirstFrameListener firstFrameListener) {
        this.mFirstFrameListeners.add((Object)firstFrameListener);
    }

    void assertAttached() {
        if (this.isAttached()) {
            return;
        }
        throw new AssertionError((Object)"Platform view is not attached");
    }

    @TargetApi(value=20)
    int calculateBottomKeyboardInset(WindowInsets windowInsets) {
        int n2 = this.getRootView().getHeight();
        double d2 = windowInsets.getSystemWindowInsetBottom();
        double d3 = n2;
        Double.isNaN((double)d3);
        if (d2 < d3 * 0.18) {
            return 0;
        }
        return windowInsets.getSystemWindowInsetBottom();
    }

    ZeroSides calculateShouldZeroSides() {
        Activity activity = (Activity)this.getContext();
        int n2 = activity.getResources().getConfiguration().orientation;
        int n3 = activity.getWindowManager().getDefaultDisplay().getRotation();
        if (n2 == 2) {
            if (n3 == 1) {
                return ZeroSides.RIGHT;
            }
            if (n3 == 3) {
                if (Build.VERSION.SDK_INT >= 23) {
                    return ZeroSides.LEFT;
                }
                return ZeroSides.RIGHT;
            }
            if (n3 == 0 || n3 == 2) {
                return ZeroSides.BOTH;
            }
        }
        return ZeroSides.NONE;
    }

    public boolean checkInputConnectionProxy(View view) {
        return this.mNativeView.getPluginRegistry().getPlatformViewsController().checkInputConnectionProxy(view);
    }

    public TextureRegistry.SurfaceTextureEntry createSurfaceTexture() {
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.detachFromGLContext();
        SurfaceTextureRegistryEntry surfaceTextureRegistryEntry = new SurfaceTextureRegistryEntry(this.nextTextureId.getAndIncrement(), surfaceTexture);
        this.mNativeView.getFlutterJNI().registerTexture(surfaceTextureRegistryEntry.id(), surfaceTexture);
        return surfaceTextureRegistryEntry;
    }

    public void destroy() {
        if (!this.isAttached()) {
            return;
        }
        this.getHolder().removeCallback(this.mSurfaceCallback);
        this.mNativeView.destroy();
        this.mNativeView = null;
    }

    public FlutterNativeView detach() {
        if (!this.isAttached()) {
            return null;
        }
        this.getHolder().removeCallback(this.mSurfaceCallback);
        this.mNativeView.detachFromFlutterView();
        FlutterNativeView flutterNativeView = this.mNativeView;
        this.mNativeView = null;
        return flutterNativeView;
    }

    public void disableTransparentBackground() {
        this.setZOrderOnTop(false);
        this.getHolder().setFormat(-1);
    }

    @Deprecated
    public void enableTransparentBackground() {
        Log.w((String)TAG, (String)"FlutterView in the v1 embedding is always a SurfaceView and will cover accessibility highlights when transparent. Consider migrating to the v2 Android embedding. https://github.com/flutter/flutter/wiki/Upgrading-pre-1.12-Android-projects");
        this.setZOrderOnTop(true);
        this.getHolder().setFormat(-2);
    }

    protected boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT <= 19) {
            ViewportMetrics viewportMetrics = this.mMetrics;
            viewportMetrics.physicalPaddingTop = rect.top;
            viewportMetrics.physicalPaddingRight = rect.right;
            viewportMetrics.physicalPaddingBottom = 0;
            viewportMetrics.physicalPaddingLeft = rect.left;
            viewportMetrics.physicalViewInsetTop = 0;
            viewportMetrics.physicalViewInsetRight = 0;
            viewportMetrics.physicalViewInsetBottom = rect.bottom;
            viewportMetrics.physicalViewInsetLeft = 0;
            FlutterView.super.updateViewportMetrics();
            return true;
        }
        return super.fitSystemWindows(rect);
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        AccessibilityBridge accessibilityBridge = this.mAccessibilityNodeProvider;
        if (accessibilityBridge != null && accessibilityBridge.isAccessibilityEnabled()) {
            return this.mAccessibilityNodeProvider;
        }
        return null;
    }

    public Bitmap getBitmap() {
        this.assertAttached();
        return this.mNativeView.getFlutterJNI().getBitmap();
    }

    public DartExecutor getDartExecutor() {
        return this.dartExecutor;
    }

    float getDevicePixelRatio() {
        return this.mMetrics.devicePixelRatio;
    }

    public FlutterNativeView getFlutterNativeView() {
        return this.mNativeView;
    }

    public String getLookupKeyForAsset(String string) {
        return FlutterMain.getLookupKeyForAsset((String)string);
    }

    public String getLookupKeyForAsset(String string, String string2) {
        return FlutterMain.getLookupKeyForAsset((String)string, (String)string2);
    }

    public FlutterPluginRegistry getPluginRegistry() {
        return this.mNativeView.getPluginRegistry();
    }

    public boolean hasRenderedFirstFrame() {
        return this.didRenderFirstFrame;
    }

    @SuppressLint(value={"InlinedApi", "NewApi"})
    @TargetApi(value=20)
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        int n2 = 4 & this.getWindowSystemUiVisibility();
        boolean bl = true;
        boolean bl2 = n2 != 0;
        if ((2 & this.getWindowSystemUiVisibility()) == 0) {
            bl = false;
        }
        ZeroSides zeroSides = ZeroSides.NONE;
        if (bl) {
            zeroSides = this.calculateShouldZeroSides();
        }
        ViewportMetrics viewportMetrics = this.mMetrics;
        int n3 = bl2 ? 0 : windowInsets.getSystemWindowInsetTop();
        viewportMetrics.physicalPaddingTop = n3;
        ViewportMetrics viewportMetrics2 = this.mMetrics;
        int n4 = zeroSides != ZeroSides.RIGHT && zeroSides != ZeroSides.BOTH ? windowInsets.getSystemWindowInsetRight() : 0;
        viewportMetrics2.physicalPaddingRight = n4;
        ViewportMetrics viewportMetrics3 = this.mMetrics;
        viewportMetrics3.physicalPaddingBottom = 0;
        int n5 = zeroSides != ZeroSides.LEFT && zeroSides != ZeroSides.BOTH ? windowInsets.getSystemWindowInsetLeft() : 0;
        viewportMetrics3.physicalPaddingLeft = n5;
        ViewportMetrics viewportMetrics4 = this.mMetrics;
        viewportMetrics4.physicalViewInsetTop = 0;
        viewportMetrics4.physicalViewInsetRight = 0;
        int n6 = bl ? this.calculateBottomKeyboardInset(windowInsets) : windowInsets.getSystemWindowInsetBottom();
        viewportMetrics4.physicalViewInsetBottom = n6;
        this.mMetrics.physicalViewInsetLeft = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            Insets insets = windowInsets.getSystemGestureInsets();
            ViewportMetrics viewportMetrics5 = this.mMetrics;
            viewportMetrics5.systemGestureInsetTop = insets.top;
            viewportMetrics5.systemGestureInsetRight = insets.right;
            viewportMetrics5.systemGestureInsetBottom = insets.bottom;
            viewportMetrics5.systemGestureInsetLeft = insets.left;
        }
        FlutterView.super.updateViewportMetrics();
        return super.onApplyWindowInsets(windowInsets);
    }

    protected void onAttachedToWindow() {
        AccessibilityBridge accessibilityBridge;
        super.onAttachedToWindow();
        PlatformViewsController platformViewsController = this.getPluginRegistry().getPlatformViewsController();
        this.mAccessibilityNodeProvider = accessibilityBridge = new AccessibilityBridge((View)this, new AccessibilityChannel(this.dartExecutor, this.getFlutterNativeView().getFlutterJNI()), (AccessibilityManager)this.getContext().getSystemService("accessibility"), this.getContext().getContentResolver(), (PlatformViewsAccessibilityDelegate)platformViewsController);
        this.mAccessibilityNodeProvider.setOnAccessibilityChangeListener(this.onAccessibilityChangeListener);
        this.resetWillNotDraw(this.mAccessibilityNodeProvider.isAccessibilityEnabled(), this.mAccessibilityNodeProvider.isTouchExplorationEnabled());
    }

    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        FlutterView.super.sendLocalesToDart(configuration);
        FlutterView.super.sendUserPlatformSettingsToDart();
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.mTextInputPlugin.createInputConnection((View)this, editorInfo);
    }

    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.mAccessibilityNodeProvider.release();
        this.mAccessibilityNodeProvider = null;
    }

    public void onFirstFrame() {
        this.didRenderFirstFrame = true;
        Iterator iterator = new ArrayList(this.mFirstFrameListeners).iterator();
        while (iterator.hasNext()) {
            (iterator.next()).onFirstFrame();
        }
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        boolean bl = FlutterView.super.isAttached() && this.androidTouchProcessor.onGenericMotionEvent(motionEvent);
        if (bl) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (!FlutterView.super.isAttached()) {
            return super.onHoverEvent(motionEvent);
        }
        return this.mAccessibilityNodeProvider.onAccessibilityHoverEvent(motionEvent);
    }

    public boolean onKeyDown(int n2, KeyEvent keyEvent) {
        if (!FlutterView.super.isAttached()) {
            return super.onKeyDown(n2, keyEvent);
        }
        this.androidKeyProcessor.onKeyDown(keyEvent);
        return super.onKeyDown(n2, keyEvent);
    }

    public boolean onKeyUp(int n2, KeyEvent keyEvent) {
        if (!FlutterView.super.isAttached()) {
            return super.onKeyUp(n2, keyEvent);
        }
        this.androidKeyProcessor.onKeyUp(keyEvent);
        return super.onKeyUp(n2, keyEvent);
    }

    public void onMemoryPressure() {
        this.systemChannel.sendMemoryPressureWarning();
    }

    public void onPause() {
        this.lifecycleChannel.appIsInactive();
    }

    public void onPostResume() {
        Iterator iterator = this.mActivityLifecycleListeners.iterator();
        while (iterator.hasNext()) {
            ((ActivityLifecycleListener)iterator.next()).onPostResume();
        }
        this.lifecycleChannel.appIsResumed();
    }

    protected void onSizeChanged(int n2, int n3, int n4, int n5) {
        ViewportMetrics viewportMetrics = this.mMetrics;
        viewportMetrics.physicalWidth = n2;
        viewportMetrics.physicalHeight = n3;
        FlutterView.super.updateViewportMetrics();
        super.onSizeChanged(n2, n3, n4, n5);
    }

    public void onStart() {
        this.lifecycleChannel.appIsInactive();
    }

    public void onStop() {
        this.lifecycleChannel.appIsPaused();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!FlutterView.super.isAttached()) {
            return super.onTouchEvent(motionEvent);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.requestUnbufferedDispatch(motionEvent);
        }
        return this.androidTouchProcessor.onTouchEvent(motionEvent);
    }

    public void popRoute() {
        this.navigationChannel.popRoute();
    }

    public void pushRoute(String string) {
        this.navigationChannel.pushRoute(string);
    }

    public void removeFirstFrameListener(FirstFrameListener firstFrameListener) {
        this.mFirstFrameListeners.remove((Object)firstFrameListener);
    }

    void resetAccessibilityTree() {
        AccessibilityBridge accessibilityBridge = this.mAccessibilityNodeProvider;
        if (accessibilityBridge != null) {
            accessibilityBridge.reset();
        }
    }

    public void runFromBundle(FlutterRunArguments flutterRunArguments) {
        this.assertAttached();
        FlutterView.super.preRun();
        this.mNativeView.runFromBundle(flutterRunArguments);
        FlutterView.super.postRun();
    }

    @Override
    public void send(String string, ByteBuffer byteBuffer) {
        this.send(string, byteBuffer, null);
    }

    @Override
    public void send(String string, ByteBuffer byteBuffer, BinaryMessenger.BinaryReply binaryReply) {
        if (!FlutterView.super.isAttached()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("FlutterView.send called on a detached view, channel=");
            stringBuilder.append(string);
            Log.d((String)TAG, (String)stringBuilder.toString());
            return;
        }
        this.mNativeView.send(string, byteBuffer, binaryReply);
    }

    public void setInitialRoute(String string) {
        this.navigationChannel.setInitialRoute(string);
    }

    @Override
    public void setMessageHandler(String string, BinaryMessenger.BinaryMessageHandler binaryMessageHandler) {
        this.mNativeView.setMessageHandler(string, binaryMessageHandler);
    }

    final class SurfaceTextureRegistryEntry
    implements TextureRegistry.SurfaceTextureEntry {
        private final long id;
        private SurfaceTexture.OnFrameAvailableListener onFrameListener;
        private boolean released;
        private final SurfaceTexture surfaceTexture;

        SurfaceTextureRegistryEntry(long l2, SurfaceTexture surfaceTexture) {
            this.onFrameListener = new 1((SurfaceTextureRegistryEntry)this);
            this.id = l2;
            this.surfaceTexture = surfaceTexture;
            if (Build.VERSION.SDK_INT >= 21) {
                this.surfaceTexture.setOnFrameAvailableListener(this.onFrameListener, new Handler());
                return;
            }
            this.surfaceTexture.setOnFrameAvailableListener(this.onFrameListener);
        }

        static /* synthetic */ boolean access$200(SurfaceTextureRegistryEntry surfaceTextureRegistryEntry) {
            return surfaceTextureRegistryEntry.released;
        }

        static /* synthetic */ long access$300(SurfaceTextureRegistryEntry surfaceTextureRegistryEntry) {
            return surfaceTextureRegistryEntry.id;
        }

        public long id() {
            return this.id;
        }

        public void release() {
            if (this.released) {
                return;
            }
            this.released = true;
            this.surfaceTexture.setOnFrameAvailableListener(null);
            this.surfaceTexture.release();
            FlutterView.this.mNativeView.getFlutterJNI().unregisterTexture(this.id);
        }

        public SurfaceTexture surfaceTexture() {
            return this.surfaceTexture;
        }
    }

}

