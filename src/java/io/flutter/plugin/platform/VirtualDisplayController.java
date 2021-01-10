/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.SurfaceTexture
 *  android.hardware.display.DisplayManager
 *  android.hardware.display.VirtualDisplay
 *  android.util.DisplayMetrics
 *  android.view.Display
 *  android.view.Surface
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.View$OnFocusChangeListener
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnDrawListener
 *  io.flutter.view.TextureRegistry
 *  io.flutter.view.TextureRegistry$SurfaceTextureEntry
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.SurfaceTexture;
import android.hardware.display.DisplayManager;
import android.hardware.display.VirtualDisplay;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.Surface;
import android.view.View;
import android.view.ViewTreeObserver;
import io.flutter.plugin.platform.AccessibilityEventsDelegate;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;
import io.flutter.plugin.platform.SingleViewPresentation;
import io.flutter.view.TextureRegistry;

@TargetApi(value=20)
class VirtualDisplayController {
    private final AccessibilityEventsDelegate accessibilityEventsDelegate;
    private final Context context;
    private final int densityDpi;
    private final View.OnFocusChangeListener focusChangeListener;
    SingleViewPresentation presentation;
    private Surface surface;
    private final TextureRegistry.SurfaceTextureEntry textureEntry;
    private VirtualDisplay virtualDisplay;

    private VirtualDisplayController(Context context, AccessibilityEventsDelegate accessibilityEventsDelegate, VirtualDisplay virtualDisplay, PlatformViewFactory platformViewFactory, Surface surface, TextureRegistry.SurfaceTextureEntry surfaceTextureEntry, View.OnFocusChangeListener onFocusChangeListener, int n2, Object object) {
        SingleViewPresentation singleViewPresentation;
        this.context = context;
        this.accessibilityEventsDelegate = accessibilityEventsDelegate;
        this.textureEntry = surfaceTextureEntry;
        this.focusChangeListener = onFocusChangeListener;
        this.surface = surface;
        this.virtualDisplay = virtualDisplay;
        this.densityDpi = context.getResources().getDisplayMetrics().densityDpi;
        this.presentation = singleViewPresentation = new SingleViewPresentation(context, this.virtualDisplay.getDisplay(), platformViewFactory, accessibilityEventsDelegate, n2, object, onFocusChangeListener);
        this.presentation.show();
    }

    public static VirtualDisplayController create(Context context, AccessibilityEventsDelegate accessibilityEventsDelegate, PlatformViewFactory platformViewFactory, TextureRegistry.SurfaceTextureEntry surfaceTextureEntry, int n2, int n3, int n4, Object object, View.OnFocusChangeListener onFocusChangeListener) {
        surfaceTextureEntry.surfaceTexture().setDefaultBufferSize(n2, n3);
        Surface surface = new Surface(surfaceTextureEntry.surfaceTexture());
        VirtualDisplay virtualDisplay = ((DisplayManager)context.getSystemService("display")).createVirtualDisplay("flutter-vd", n2, n3, context.getResources().getDisplayMetrics().densityDpi, surface, 0);
        if (virtualDisplay == null) {
            return null;
        }
        VirtualDisplayController virtualDisplayController = new VirtualDisplayController(context, accessibilityEventsDelegate, virtualDisplay, platformViewFactory, surface, surfaceTextureEntry, onFocusChangeListener, n4, object);
        return virtualDisplayController;
    }

    public void dispose() {
        PlatformView platformView = this.presentation.getView();
        this.presentation.cancel();
        this.presentation.detachState();
        platformView.dispose();
        this.virtualDisplay.release();
        this.textureEntry.release();
    }

    public View getView() {
        SingleViewPresentation singleViewPresentation = this.presentation;
        if (singleViewPresentation == null) {
            return null;
        }
        return singleViewPresentation.getView().getView();
    }

    void onFlutterViewAttached(View view) {
        SingleViewPresentation singleViewPresentation = this.presentation;
        if (singleViewPresentation != null) {
            if (singleViewPresentation.getView() == null) {
                return;
            }
            this.presentation.getView().onFlutterViewAttached(view);
        }
    }

    void onFlutterViewDetached() {
        SingleViewPresentation singleViewPresentation = this.presentation;
        if (singleViewPresentation != null) {
            if (singleViewPresentation.getView() == null) {
                return;
            }
            this.presentation.getView().onFlutterViewDetached();
        }
    }

    void onInputConnectionLocked() {
        SingleViewPresentation singleViewPresentation = this.presentation;
        if (singleViewPresentation != null) {
            if (singleViewPresentation.getView() == null) {
                return;
            }
            this.presentation.getView().onInputConnectionLocked();
        }
    }

    void onInputConnectionUnlocked() {
        SingleViewPresentation singleViewPresentation = this.presentation;
        if (singleViewPresentation != null) {
            if (singleViewPresentation.getView() == null) {
                return;
            }
            this.presentation.getView().onInputConnectionUnlocked();
        }
    }

    public void resize(int n2, int n3, final Runnable runnable) {
        boolean bl = this.getView().isFocused();
        SingleViewPresentation.PresentationState presentationState = this.presentation.detachState();
        this.virtualDisplay.setSurface(null);
        this.virtualDisplay.release();
        this.textureEntry.surfaceTexture().setDefaultBufferSize(n2, n3);
        this.virtualDisplay = ((DisplayManager)this.context.getSystemService("display")).createVirtualDisplay("flutter-vd", n2, n3, this.densityDpi, this.surface, 0);
        final View view = this.getView();
        view.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener(){

            public void onViewAttachedToWindow(View view2) {
                OneTimeOnDrawListener.schedule(view, new Runnable(){

                    public void run() {
                        1 var1_1 = 1.this;
                        var1_1.view.postDelayed(var1_1.runnable, 128L);
                    }
                });
                view.removeOnAttachStateChangeListener((View.OnAttachStateChangeListener)this);
            }

            public void onViewDetachedFromWindow(View view2) {
            }

        });
        SingleViewPresentation singleViewPresentation = new SingleViewPresentation(this.context, this.virtualDisplay.getDisplay(), this.accessibilityEventsDelegate, presentationState, this.focusChangeListener, bl);
        singleViewPresentation.show();
        this.presentation.cancel();
        this.presentation = singleViewPresentation;
    }

    @TargetApi(value=16)
    static class OneTimeOnDrawListener
    implements ViewTreeObserver.OnDrawListener {
        Runnable mOnDrawRunnable;
        final View mView;

        OneTimeOnDrawListener(View view, Runnable runnable) {
            this.mView = view;
            this.mOnDrawRunnable = runnable;
        }

        static void schedule(View view, Runnable runnable) {
            OneTimeOnDrawListener oneTimeOnDrawListener = new OneTimeOnDrawListener(view, runnable);
            view.getViewTreeObserver().addOnDrawListener((ViewTreeObserver.OnDrawListener)oneTimeOnDrawListener);
        }

        public void onDraw() {
            Runnable runnable = this.mOnDrawRunnable;
            if (runnable == null) {
                return;
            }
            runnable.run();
            this.mOnDrawRunnable = null;
            this.mView.post(new Runnable(){

                public void run() {
                    OneTimeOnDrawListener.this.mView.getViewTreeObserver().removeOnDrawListener((ViewTreeObserver.OnDrawListener)OneTimeOnDrawListener.this);
                }
            });
        }

    }

}

