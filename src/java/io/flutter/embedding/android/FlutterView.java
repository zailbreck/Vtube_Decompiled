/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.annotation.TargetApi
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.graphics.Insets
 *  android.graphics.Rect
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.LocaleList
 *  android.text.format.DateFormat
 *  android.util.AttributeSet
 *  android.util.DisplayMetrics
 *  android.view.KeyEvent
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.WindowInsets
 *  android.view.accessibility.AccessibilityManager
 *  android.view.accessibility.AccessibilityNodeProvider
 *  android.view.inputmethod.EditorInfo
 *  android.view.inputmethod.InputConnection
 *  android.view.inputmethod.InputMethodManager
 *  android.widget.FrameLayout
 *  io.flutter.view.AccessibilityBridge
 *  io.flutter.view.AccessibilityBridge$OnAccessibilityChangeListener
 *  java.lang.Deprecated
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 *  java.util.Set
 */
package io.flutter.embedding.android;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Insets;
import android.graphics.Rect;
import android.os.Build;
import android.os.LocaleList;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import io.flutter.Log;
import io.flutter.embedding.android.AndroidKeyProcessor;
import io.flutter.embedding.android.AndroidTouchProcessor;
import io.flutter.embedding.android.FlutterSurfaceView;
import io.flutter.embedding.android.FlutterTextureView;
import io.flutter.embedding.android.FlutterView;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
import io.flutter.embedding.engine.renderer.RenderSurface;
import io.flutter.embedding.engine.systemchannels.AccessibilityChannel;
import io.flutter.embedding.engine.systemchannels.KeyEventChannel;
import io.flutter.embedding.engine.systemchannels.LocalizationChannel;
import io.flutter.embedding.engine.systemchannels.SettingsChannel;
import io.flutter.plugin.editing.TextInputPlugin;
import io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate;
import io.flutter.plugin.platform.PlatformViewsController;
import io.flutter.view.AccessibilityBridge;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class FlutterView
extends FrameLayout {
    private static final String TAG = "FlutterView";
    private AccessibilityBridge accessibilityBridge;
    private AndroidKeyProcessor androidKeyProcessor;
    private AndroidTouchProcessor androidTouchProcessor;
    private FlutterEngine flutterEngine;
    private final Set<FlutterEngineAttachmentListener> flutterEngineAttachmentListeners;
    private FlutterSurfaceView flutterSurfaceView;
    private FlutterTextureView flutterTextureView;
    private final FlutterUiDisplayListener flutterUiDisplayListener;
    private final Set<FlutterUiDisplayListener> flutterUiDisplayListeners;
    private boolean isFlutterUiDisplayed;
    private final AccessibilityBridge.OnAccessibilityChangeListener onAccessibilityChangeListener;
    private RenderSurface renderSurface;
    private TextInputPlugin textInputPlugin;
    private final FlutterRenderer.ViewportMetrics viewportMetrics;

    public FlutterView(Context context) {
        super(context, null, new FlutterSurfaceView(context));
    }

    public FlutterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, new FlutterSurfaceView(context));
    }

    private FlutterView(Context context, AttributeSet attributeSet, FlutterSurfaceView flutterSurfaceView) {
        super(context, attributeSet);
        this.flutterUiDisplayListeners = new HashSet();
        this.flutterEngineAttachmentListeners = new HashSet();
        this.viewportMetrics = new Object(){
            public float devicePixelRatio;
            public int height;
            public int paddingBottom;
            public int paddingLeft;
            public int paddingRight;
            public int paddingTop;
            public int systemGestureInsetBottom;
            public int systemGestureInsetLeft;
            public int systemGestureInsetRight;
            public int systemGestureInsetTop;
            public int viewInsetBottom;
            public int viewInsetLeft;
            public int viewInsetRight;
            public int viewInsetTop;
            public int width;
            {
                this.devicePixelRatio = 1.0f;
                this.width = 0;
                this.height = 0;
                this.paddingTop = 0;
                this.paddingRight = 0;
                this.paddingBottom = 0;
                this.paddingLeft = 0;
                this.viewInsetTop = 0;
                this.viewInsetRight = 0;
                this.viewInsetBottom = 0;
                this.viewInsetLeft = 0;
                this.systemGestureInsetTop = 0;
                this.systemGestureInsetRight = 0;
                this.systemGestureInsetBottom = 0;
                this.systemGestureInsetLeft = 0;
            }
        };
        this.onAccessibilityChangeListener = new AccessibilityBridge.OnAccessibilityChangeListener((FlutterView)this){
            final /* synthetic */ FlutterView this$0;
            {
                this.this$0 = flutterView;
            }

            public void onAccessibilityChanged(boolean bl, boolean bl2) {
                FlutterView.access$000(this.this$0, bl, bl2);
            }
        };
        this.flutterUiDisplayListener = new FlutterUiDisplayListener((FlutterView)this){
            final /* synthetic */ FlutterView this$0;
            {
                this.this$0 = flutterView;
            }

            public void onFlutterUiDisplayed() {
                FlutterView.access$102(this.this$0, true);
                Iterator iterator = FlutterView.access$200(this.this$0).iterator();
                while (iterator.hasNext()) {
                    ((FlutterUiDisplayListener)iterator.next()).onFlutterUiDisplayed();
                }
            }

            public void onFlutterUiNoLongerDisplayed() {
                FlutterView.access$102(this.this$0, false);
                Iterator iterator = FlutterView.access$200(this.this$0).iterator();
                while (iterator.hasNext()) {
                    ((FlutterUiDisplayListener)iterator.next()).onFlutterUiNoLongerDisplayed();
                }
            }
        };
        this.flutterSurfaceView = flutterSurfaceView;
        this.renderSurface = flutterSurfaceView;
        FlutterView.super.init();
    }

    private FlutterView(Context context, AttributeSet attributeSet, FlutterTextureView flutterTextureView) {
        super(context, attributeSet);
        this.flutterUiDisplayListeners = new HashSet();
        this.flutterEngineAttachmentListeners = new HashSet();
        this.viewportMetrics = new /* invalid duplicate definition of identical inner class */;
        this.onAccessibilityChangeListener = new /* invalid duplicate definition of identical inner class */;
        this.flutterUiDisplayListener = new /* invalid duplicate definition of identical inner class */;
        this.flutterTextureView = flutterTextureView;
        this.renderSurface = this.flutterSurfaceView;
        FlutterView.super.init();
    }

    public FlutterView(Context context, FlutterSurfaceView flutterSurfaceView) {
        super(context, null, flutterSurfaceView);
    }

    public FlutterView(Context context, FlutterTextureView flutterTextureView) {
        super(context, null, flutterTextureView);
    }

    @Deprecated
    public FlutterView(Context context, RenderMode renderMode) {
        RenderSurface renderSurface;
        super(context, null);
        this.flutterUiDisplayListeners = new HashSet();
        this.flutterEngineAttachmentListeners = new HashSet();
        this.viewportMetrics = new /* invalid duplicate definition of identical inner class */;
        this.onAccessibilityChangeListener = new /* invalid duplicate definition of identical inner class */;
        this.flutterUiDisplayListener = new /* invalid duplicate definition of identical inner class */;
        if (renderMode == RenderMode.surface) {
            renderSurface = this.flutterSurfaceView = new FlutterSurfaceView(context);
        } else {
            this.flutterTextureView = new FlutterTextureView(context);
            renderSurface = this.flutterTextureView;
        }
        this.renderSurface = renderSurface;
        FlutterView.super.init();
    }

    @Deprecated
    public FlutterView(Context context, RenderMode renderMode, TransparencyMode transparencyMode) {
        RenderSurface renderSurface;
        super(context, null);
        this.flutterUiDisplayListeners = new HashSet();
        this.flutterEngineAttachmentListeners = new HashSet();
        this.viewportMetrics = new /* invalid duplicate definition of identical inner class */;
        this.onAccessibilityChangeListener = new /* invalid duplicate definition of identical inner class */;
        this.flutterUiDisplayListener = new /* invalid duplicate definition of identical inner class */;
        if (renderMode == RenderMode.surface) {
            boolean bl = transparencyMode == TransparencyMode.transparent;
            this.flutterSurfaceView = new FlutterSurfaceView(context, bl);
            renderSurface = this.flutterSurfaceView;
        } else {
            renderSurface = this.flutterTextureView = new FlutterTextureView(context);
        }
        this.renderSurface = renderSurface;
        FlutterView.super.init();
    }

    @Deprecated
    public FlutterView(Context context, TransparencyMode transparencyMode) {
        boolean bl = transparencyMode == TransparencyMode.transparent;
        super(context, null, new FlutterSurfaceView(context, bl));
    }

    static /* synthetic */ void access$000(FlutterView flutterView, boolean bl, boolean bl2) {
        flutterView.resetWillNotDraw(bl, bl2);
    }

    static /* synthetic */ boolean access$102(FlutterView flutterView, boolean bl) {
        flutterView.isFlutterUiDisplayed = bl;
        return bl;
    }

    static /* synthetic */ Set access$200(FlutterView flutterView) {
        return flutterView.flutterUiDisplayListeners;
    }

    private void init() {
        RenderSurface renderSurface;
        Log.v(TAG, "Initializing FlutterView");
        if (this.flutterSurfaceView != null) {
            Log.v(TAG, "Internally using a FlutterSurfaceView.");
            renderSurface = this.flutterSurfaceView;
        } else {
            Log.v(TAG, "Internally using a FlutterTextureView.");
            renderSurface = this.flutterTextureView;
        }
        this.addView((View)renderSurface);
        this.setFocusable(true);
        this.setFocusableInTouchMode(true);
    }

    private void resetWillNotDraw(boolean bl, boolean bl2) {
        boolean bl3 = this.flutterEngine.getRenderer().isSoftwareRenderingEnabled();
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

    private void sendLocalesToFlutter(Configuration configuration) {
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
        this.flutterEngine.getLocalizationChannel().sendLocales((List<Locale>)arrayList);
    }

    private void sendViewportMetricsToFlutter() {
        if (!this.isAttachedToFlutterEngine()) {
            Log.w(TAG, "Tried to send viewport metrics from Android to Flutter but this FlutterView was not attached to a FlutterEngine.");
            return;
        }
        this.viewportMetrics.devicePixelRatio = this.getResources().getDisplayMetrics().density;
        this.flutterEngine.getRenderer().setViewportMetrics(this.viewportMetrics);
    }

    public void addFlutterEngineAttachmentListener(FlutterEngineAttachmentListener flutterEngineAttachmentListener) {
        this.flutterEngineAttachmentListeners.add((Object)flutterEngineAttachmentListener);
    }

    public void addOnFirstFrameRenderedListener(FlutterUiDisplayListener flutterUiDisplayListener) {
        this.flutterUiDisplayListeners.add((Object)flutterUiDisplayListener);
    }

    public void attachToFlutterEngine(FlutterEngine flutterEngine) {
        AccessibilityBridge accessibilityBridge;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Attaching to a FlutterEngine: ");
        stringBuilder.append((Object)flutterEngine);
        Log.v(TAG, stringBuilder.toString());
        if (this.isAttachedToFlutterEngine()) {
            if (flutterEngine == this.flutterEngine) {
                Log.v(TAG, "Already attached to this engine. Doing nothing.");
                return;
            }
            Log.v(TAG, "Currently attached to a different engine. Detaching and then attaching to new engine.");
            this.detachFromFlutterEngine();
        }
        this.flutterEngine = flutterEngine;
        FlutterRenderer flutterRenderer = this.flutterEngine.getRenderer();
        this.isFlutterUiDisplayed = flutterRenderer.isDisplayingFlutterUi();
        this.renderSurface.attachToRenderer(flutterRenderer);
        flutterRenderer.addIsDisplayingFlutterUiListener(this.flutterUiDisplayListener);
        this.textInputPlugin = new TextInputPlugin((View)this, this.flutterEngine.getDartExecutor(), this.flutterEngine.getPlatformViewsController());
        this.androidKeyProcessor = new AndroidKeyProcessor(this.flutterEngine.getKeyEventChannel(), this.textInputPlugin);
        this.androidTouchProcessor = new AndroidTouchProcessor(this.flutterEngine.getRenderer());
        this.accessibilityBridge = accessibilityBridge = new AccessibilityBridge((View)this, flutterEngine.getAccessibilityChannel(), (AccessibilityManager)this.getContext().getSystemService("accessibility"), this.getContext().getContentResolver(), (PlatformViewsAccessibilityDelegate)this.flutterEngine.getPlatformViewsController());
        this.accessibilityBridge.setOnAccessibilityChangeListener(this.onAccessibilityChangeListener);
        FlutterView.super.resetWillNotDraw(this.accessibilityBridge.isAccessibilityEnabled(), this.accessibilityBridge.isTouchExplorationEnabled());
        this.flutterEngine.getPlatformViewsController().attachAccessibilityBridge(this.accessibilityBridge);
        this.textInputPlugin.getInputMethodManager().restartInput((View)this);
        this.sendUserSettingsToFlutter();
        FlutterView.super.sendLocalesToFlutter(this.getResources().getConfiguration());
        FlutterView.super.sendViewportMetricsToFlutter();
        flutterEngine.getPlatformViewsController().attachToView((View)this);
        Iterator iterator = this.flutterEngineAttachmentListeners.iterator();
        while (iterator.hasNext()) {
            ((FlutterEngineAttachmentListener)iterator.next()).onFlutterEngineAttachedToFlutterView(flutterEngine);
        }
        if (this.isFlutterUiDisplayed) {
            this.flutterUiDisplayListener.onFlutterUiDisplayed();
        }
    }

    public boolean checkInputConnectionProxy(View view) {
        FlutterEngine flutterEngine = this.flutterEngine;
        if (flutterEngine != null) {
            return flutterEngine.getPlatformViewsController().checkInputConnectionProxy(view);
        }
        return super.checkInputConnectionProxy(view);
    }

    public void detachFromFlutterEngine() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Detaching from a FlutterEngine: ");
        stringBuilder.append((Object)this.flutterEngine);
        Log.v(TAG, stringBuilder.toString());
        if (!this.isAttachedToFlutterEngine()) {
            Log.v(TAG, "Not attached to an engine. Doing nothing.");
            return;
        }
        Iterator iterator = this.flutterEngineAttachmentListeners.iterator();
        while (iterator.hasNext()) {
            ((FlutterEngineAttachmentListener)iterator.next()).onFlutterEngineDetachedFromFlutterView();
        }
        this.flutterEngine.getPlatformViewsController().detachFromView();
        this.flutterEngine.getPlatformViewsController().detachAccessibiltyBridge();
        this.accessibilityBridge.release();
        this.accessibilityBridge = null;
        this.textInputPlugin.getInputMethodManager().restartInput((View)this);
        this.textInputPlugin.destroy();
        FlutterRenderer flutterRenderer = this.flutterEngine.getRenderer();
        this.isFlutterUiDisplayed = false;
        flutterRenderer.removeIsDisplayingFlutterUiListener(this.flutterUiDisplayListener);
        flutterRenderer.stopRenderingToSurface();
        flutterRenderer.setSemanticsEnabled(false);
        this.renderSurface.detachFromRenderer();
        this.flutterEngine = null;
    }

    protected boolean fitSystemWindows(Rect rect) {
        if (Build.VERSION.SDK_INT <= 19) {
            FlutterRenderer.ViewportMetrics viewportMetrics = this.viewportMetrics;
            viewportMetrics.paddingTop = rect.top;
            viewportMetrics.paddingRight = rect.right;
            viewportMetrics.paddingBottom = 0;
            viewportMetrics.paddingLeft = rect.left;
            viewportMetrics.viewInsetTop = 0;
            viewportMetrics.viewInsetRight = 0;
            viewportMetrics.viewInsetBottom = rect.bottom;
            viewportMetrics.viewInsetLeft = 0;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Updating window insets (fitSystemWindows()):\nStatus bar insets: Top: ");
            stringBuilder.append(this.viewportMetrics.paddingTop);
            stringBuilder.append(", Left: ");
            stringBuilder.append(this.viewportMetrics.paddingLeft);
            stringBuilder.append(", Right: ");
            stringBuilder.append(this.viewportMetrics.paddingRight);
            stringBuilder.append("\nKeyboard insets: Bottom: ");
            stringBuilder.append(this.viewportMetrics.viewInsetBottom);
            stringBuilder.append(", Left: ");
            stringBuilder.append(this.viewportMetrics.viewInsetLeft);
            stringBuilder.append(", Right: ");
            stringBuilder.append(this.viewportMetrics.viewInsetRight);
            Log.v(TAG, stringBuilder.toString());
            FlutterView.super.sendViewportMetricsToFlutter();
            return true;
        }
        return super.fitSystemWindows(rect);
    }

    public AccessibilityNodeProvider getAccessibilityNodeProvider() {
        AccessibilityBridge accessibilityBridge = this.accessibilityBridge;
        if (accessibilityBridge != null && accessibilityBridge.isAccessibilityEnabled()) {
            return this.accessibilityBridge;
        }
        return null;
    }

    public FlutterEngine getAttachedFlutterEngine() {
        return this.flutterEngine;
    }

    public boolean hasRenderedFirstFrame() {
        return this.isFlutterUiDisplayed;
    }

    public boolean isAttachedToFlutterEngine() {
        FlutterEngine flutterEngine = this.flutterEngine;
        return flutterEngine != null && flutterEngine.getRenderer() == this.renderSurface.getAttachedRenderer();
    }

    @SuppressLint(value={"InlinedApi", "NewApi"})
    @TargetApi(value=20)
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        WindowInsets windowInsets2 = super.onApplyWindowInsets(windowInsets);
        this.viewportMetrics.paddingTop = windowInsets.getSystemWindowInsetTop();
        this.viewportMetrics.paddingRight = windowInsets.getSystemWindowInsetRight();
        FlutterRenderer.ViewportMetrics viewportMetrics = this.viewportMetrics;
        viewportMetrics.paddingBottom = 0;
        viewportMetrics.paddingLeft = windowInsets.getSystemWindowInsetLeft();
        FlutterRenderer.ViewportMetrics viewportMetrics2 = this.viewportMetrics;
        viewportMetrics2.viewInsetTop = 0;
        viewportMetrics2.viewInsetRight = 0;
        viewportMetrics2.viewInsetBottom = windowInsets.getSystemWindowInsetBottom();
        this.viewportMetrics.viewInsetLeft = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            Insets insets = windowInsets.getSystemGestureInsets();
            FlutterRenderer.ViewportMetrics viewportMetrics3 = this.viewportMetrics;
            viewportMetrics3.systemGestureInsetTop = insets.top;
            viewportMetrics3.systemGestureInsetRight = insets.right;
            viewportMetrics3.systemGestureInsetBottom = insets.bottom;
            viewportMetrics3.systemGestureInsetLeft = insets.left;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Updating window insets (onApplyWindowInsets()):\nStatus bar insets: Top: ");
        stringBuilder.append(this.viewportMetrics.paddingTop);
        stringBuilder.append(", Left: ");
        stringBuilder.append(this.viewportMetrics.paddingLeft);
        stringBuilder.append(", Right: ");
        stringBuilder.append(this.viewportMetrics.paddingRight);
        stringBuilder.append("\nKeyboard insets: Bottom: ");
        stringBuilder.append(this.viewportMetrics.viewInsetBottom);
        stringBuilder.append(", Left: ");
        stringBuilder.append(this.viewportMetrics.viewInsetLeft);
        stringBuilder.append(", Right: ");
        stringBuilder.append(this.viewportMetrics.viewInsetRight);
        stringBuilder.append("System Gesture Insets - Left: ");
        stringBuilder.append(this.viewportMetrics.systemGestureInsetLeft);
        stringBuilder.append(", Top: ");
        stringBuilder.append(this.viewportMetrics.systemGestureInsetTop);
        stringBuilder.append(", Right: ");
        stringBuilder.append(this.viewportMetrics.systemGestureInsetRight);
        stringBuilder.append(", Bottom: ");
        stringBuilder.append(this.viewportMetrics.viewInsetBottom);
        Log.v(TAG, stringBuilder.toString());
        FlutterView.super.sendViewportMetricsToFlutter();
        return windowInsets2;
    }

    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.flutterEngine != null) {
            Log.v(TAG, "Configuration changed. Sending locales and user settings to Flutter.");
            FlutterView.super.sendLocalesToFlutter(configuration);
            this.sendUserSettingsToFlutter();
        }
    }

    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (!this.isAttachedToFlutterEngine()) {
            return super.onCreateInputConnection(editorInfo);
        }
        return this.textInputPlugin.createInputConnection((View)this, editorInfo);
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        boolean bl = this.isAttachedToFlutterEngine() && this.androidTouchProcessor.onGenericMotionEvent(motionEvent);
        if (bl) {
            return true;
        }
        return super.onGenericMotionEvent(motionEvent);
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (!this.isAttachedToFlutterEngine()) {
            return super.onHoverEvent(motionEvent);
        }
        return this.accessibilityBridge.onAccessibilityHoverEvent(motionEvent);
    }

    public boolean onKeyDown(int n2, KeyEvent keyEvent) {
        if (!this.isAttachedToFlutterEngine()) {
            return super.onKeyDown(n2, keyEvent);
        }
        this.androidKeyProcessor.onKeyDown(keyEvent);
        return super.onKeyDown(n2, keyEvent);
    }

    public boolean onKeyUp(int n2, KeyEvent keyEvent) {
        if (!this.isAttachedToFlutterEngine()) {
            return super.onKeyUp(n2, keyEvent);
        }
        this.androidKeyProcessor.onKeyUp(keyEvent);
        return super.onKeyUp(n2, keyEvent);
    }

    protected void onSizeChanged(int n2, int n3, int n4, int n5) {
        super.onSizeChanged(n2, n3, n4, n5);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Size changed. Sending Flutter new viewport metrics. FlutterView was ");
        stringBuilder.append(n4);
        stringBuilder.append(" x ");
        stringBuilder.append(n5);
        stringBuilder.append(", it is now ");
        stringBuilder.append(n2);
        stringBuilder.append(" x ");
        stringBuilder.append(n3);
        Log.v(TAG, stringBuilder.toString());
        FlutterRenderer.ViewportMetrics viewportMetrics = this.viewportMetrics;
        viewportMetrics.width = n2;
        viewportMetrics.height = n3;
        FlutterView.super.sendViewportMetricsToFlutter();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.isAttachedToFlutterEngine()) {
            return super.onTouchEvent(motionEvent);
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.requestUnbufferedDispatch(motionEvent);
        }
        return this.androidTouchProcessor.onTouchEvent(motionEvent);
    }

    public void removeFlutterEngineAttachmentListener(FlutterEngineAttachmentListener flutterEngineAttachmentListener) {
        this.flutterEngineAttachmentListeners.remove((Object)flutterEngineAttachmentListener);
    }

    public void removeOnFirstFrameRenderedListener(FlutterUiDisplayListener flutterUiDisplayListener) {
        this.flutterUiDisplayListeners.remove((Object)flutterUiDisplayListener);
    }

    void sendUserSettingsToFlutter() {
        boolean bl = (48 & this.getResources().getConfiguration().uiMode) == 32;
        SettingsChannel.PlatformBrightness platformBrightness = bl ? SettingsChannel.PlatformBrightness.dark : SettingsChannel.PlatformBrightness.light;
        this.flutterEngine.getSettingsChannel().startMessage().setTextScaleFactor(this.getResources().getConfiguration().fontScale).setUse24HourFormat(DateFormat.is24HourFormat((Context)this.getContext())).setPlatformBrightness(platformBrightness).send();
    }

    public static interface FlutterEngineAttachmentListener {
        public void onFlutterEngineAttachedToFlutterView(FlutterEngine var1);

        public void onFlutterEngineDetachedFromFlutterView();
    }

    @Deprecated
    public static final class RenderMode
    extends Enum<RenderMode> {
        private static final /* synthetic */ RenderMode[] $VALUES;
        public static final /* enum */ RenderMode surface = new RenderMode();
        public static final /* enum */ RenderMode texture = new RenderMode();

        static {
            RenderMode[] arrrenderMode = new RenderMode[]{surface, texture};
            $VALUES = arrrenderMode;
        }

        public static RenderMode valueOf(String string2) {
            return (RenderMode)Enum.valueOf(RenderMode.class, (String)string2);
        }

        public static RenderMode[] values() {
            return (RenderMode[])$VALUES.clone();
        }
    }

    @Deprecated
    public static final class TransparencyMode
    extends Enum<TransparencyMode> {
        private static final /* synthetic */ TransparencyMode[] $VALUES;
        public static final /* enum */ TransparencyMode opaque = new TransparencyMode();
        public static final /* enum */ TransparencyMode transparent = new TransparencyMode();

        static {
            TransparencyMode[] arrtransparencyMode = new TransparencyMode[]{opaque, transparent};
            $VALUES = arrtransparencyMode;
        }

        public static TransparencyMode valueOf(String string2) {
            return (TransparencyMode)Enum.valueOf(TransparencyMode.class, (String)string2);
        }

        public static TransparencyMode[] values() {
            return (TransparencyMode[])$VALUES.clone();
        }
    }

}

