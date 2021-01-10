/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.IBinder
 *  android.util.AttributeSet
 *  android.view.Surface
 *  android.view.SurfaceHolder
 *  android.view.SurfaceHolder$Callback
 *  android.view.SurfaceView
 *  io.flutter.Log
 *  io.flutter.embedding.android.FlutterSurfaceView$1
 *  io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
 *  io.flutter.embedding.engine.renderer.RenderSurface
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package io.flutter.embedding.android;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import io.flutter.Log;
import io.flutter.embedding.android.FlutterSurfaceView;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
import io.flutter.embedding.engine.renderer.RenderSurface;

public class FlutterSurfaceView
extends SurfaceView
implements RenderSurface {
    private static final String TAG = "FlutterSurfaceView";
    private FlutterRenderer flutterRenderer;
    private final FlutterUiDisplayListener flutterUiDisplayListener;
    private boolean isAttachedToFlutterRenderer;
    private boolean isSurfaceAvailableForRendering;
    private final boolean renderTransparently;
    private final SurfaceHolder.Callback surfaceCallback;

    public FlutterSurfaceView(Context context) {
        super(context, null, false);
    }

    public FlutterSurfaceView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, false);
    }

    private FlutterSurfaceView(Context context, AttributeSet attributeSet, boolean bl) {
        super(context, attributeSet);
        this.isSurfaceAvailableForRendering = false;
        this.isAttachedToFlutterRenderer = false;
        this.surfaceCallback = new 1((FlutterSurfaceView)this);
        this.flutterUiDisplayListener = new FlutterUiDisplayListener(){

            public void onFlutterUiDisplayed() {
                Log.v((String)FlutterSurfaceView.TAG, (String)"onFlutterUiDisplayed()");
                FlutterSurfaceView.this.setAlpha(1.0f);
                if (FlutterSurfaceView.this.flutterRenderer != null) {
                    FlutterSurfaceView.this.flutterRenderer.removeIsDisplayingFlutterUiListener(this);
                }
            }

            public void onFlutterUiNoLongerDisplayed() {
            }
        };
        this.renderTransparently = bl;
        FlutterSurfaceView.super.init();
    }

    public FlutterSurfaceView(Context context, boolean bl) {
        super(context, null, bl);
    }

    static /* synthetic */ boolean access$002(FlutterSurfaceView flutterSurfaceView, boolean bl) {
        flutterSurfaceView.isSurfaceAvailableForRendering = bl;
        return bl;
    }

    static /* synthetic */ boolean access$100(FlutterSurfaceView flutterSurfaceView) {
        return flutterSurfaceView.isAttachedToFlutterRenderer;
    }

    static /* synthetic */ void access$200(FlutterSurfaceView flutterSurfaceView) {
        flutterSurfaceView.connectSurfaceToRenderer();
    }

    static /* synthetic */ void access$300(FlutterSurfaceView flutterSurfaceView, int n2, int n3) {
        flutterSurfaceView.changeSurfaceSize(n2, n3);
    }

    static /* synthetic */ void access$400(FlutterSurfaceView flutterSurfaceView) {
        flutterSurfaceView.disconnectSurfaceFromRenderer();
    }

    private void changeSurfaceSize(int n2, int n3) {
        if (this.flutterRenderer != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Notifying FlutterRenderer that Android surface size has changed to ");
            stringBuilder.append(n2);
            stringBuilder.append(" x ");
            stringBuilder.append(n3);
            Log.v((String)TAG, (String)stringBuilder.toString());
            this.flutterRenderer.surfaceChanged(n2, n3);
            return;
        }
        throw new IllegalStateException("changeSurfaceSize() should only be called when flutterRenderer is non-null.");
    }

    private void connectSurfaceToRenderer() {
        if (this.flutterRenderer != null && this.getHolder() != null) {
            this.flutterRenderer.startRenderingToSurface(this.getHolder().getSurface());
            return;
        }
        throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getHolder() are non-null.");
    }

    private void disconnectSurfaceFromRenderer() {
        FlutterRenderer flutterRenderer = this.flutterRenderer;
        if (flutterRenderer != null) {
            flutterRenderer.stopRenderingToSurface();
            return;
        }
        throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
    }

    private void init() {
        if (this.renderTransparently) {
            this.getHolder().setFormat(-2);
            this.setZOrderOnTop(true);
        }
        this.getHolder().addCallback(this.surfaceCallback);
        this.setAlpha(0.0f);
    }

    public void attachToRenderer(FlutterRenderer flutterRenderer) {
        Log.v((String)TAG, (String)"Attaching to FlutterRenderer.");
        if (this.flutterRenderer != null) {
            Log.v((String)TAG, (String)"Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.flutterRenderer.stopRenderingToSurface();
            this.flutterRenderer.removeIsDisplayingFlutterUiListener(this.flutterUiDisplayListener);
        }
        this.flutterRenderer = flutterRenderer;
        this.isAttachedToFlutterRenderer = true;
        this.flutterRenderer.addIsDisplayingFlutterUiListener(this.flutterUiDisplayListener);
        if (this.isSurfaceAvailableForRendering) {
            Log.v((String)TAG, (String)"Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            FlutterSurfaceView.super.connectSurfaceToRenderer();
        }
    }

    public void detachFromRenderer() {
        if (this.flutterRenderer != null) {
            if (this.getWindowToken() != null) {
                Log.v((String)TAG, (String)"Disconnecting FlutterRenderer from Android surface.");
                this.disconnectSurfaceFromRenderer();
            }
            this.setAlpha(0.0f);
            this.flutterRenderer.removeIsDisplayingFlutterUiListener(this.flutterUiDisplayListener);
            this.flutterRenderer = null;
            this.isAttachedToFlutterRenderer = false;
            return;
        }
        Log.w((String)TAG, (String)"detachFromRenderer() invoked when no FlutterRenderer was attached.");
    }

    public FlutterRenderer getAttachedRenderer() {
        return this.flutterRenderer;
    }

}

