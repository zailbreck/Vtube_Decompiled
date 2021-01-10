/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.SurfaceTexture
 *  android.os.IBinder
 *  android.util.AttributeSet
 *  android.view.Surface
 *  android.view.TextureView
 *  android.view.TextureView$SurfaceTextureListener
 *  io.flutter.Log
 *  io.flutter.embedding.android.FlutterTextureView$1
 *  io.flutter.embedding.engine.renderer.RenderSurface
 *  java.lang.IllegalStateException
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package io.flutter.embedding.android;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import io.flutter.Log;
import io.flutter.embedding.android.FlutterTextureView;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.renderer.RenderSurface;

public class FlutterTextureView
extends TextureView
implements RenderSurface {
    private static final String TAG = "FlutterTextureView";
    private FlutterRenderer flutterRenderer;
    private boolean isAttachedToFlutterRenderer;
    private boolean isSurfaceAvailableForRendering;
    private Surface renderSurface;
    private final TextureView.SurfaceTextureListener surfaceTextureListener;

    public FlutterTextureView(Context context) {
        super(context, null);
    }

    public FlutterTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.isSurfaceAvailableForRendering = false;
        this.isAttachedToFlutterRenderer = false;
        this.surfaceTextureListener = new 1((FlutterTextureView)this);
        FlutterTextureView.super.init();
    }

    static /* synthetic */ boolean access$002(FlutterTextureView flutterTextureView, boolean bl) {
        flutterTextureView.isSurfaceAvailableForRendering = bl;
        return bl;
    }

    static /* synthetic */ boolean access$100(FlutterTextureView flutterTextureView) {
        return flutterTextureView.isAttachedToFlutterRenderer;
    }

    static /* synthetic */ void access$200(FlutterTextureView flutterTextureView) {
        flutterTextureView.connectSurfaceToRenderer();
    }

    static /* synthetic */ void access$300(FlutterTextureView flutterTextureView, int n2, int n3) {
        flutterTextureView.changeSurfaceSize(n2, n3);
    }

    static /* synthetic */ void access$400(FlutterTextureView flutterTextureView) {
        flutterTextureView.disconnectSurfaceFromRenderer();
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
        if (this.flutterRenderer != null && this.getSurfaceTexture() != null) {
            this.renderSurface = new Surface(this.getSurfaceTexture());
            this.flutterRenderer.startRenderingToSurface(this.renderSurface);
            return;
        }
        throw new IllegalStateException("connectSurfaceToRenderer() should only be called when flutterRenderer and getSurfaceTexture() are non-null.");
    }

    private void disconnectSurfaceFromRenderer() {
        FlutterRenderer flutterRenderer = this.flutterRenderer;
        if (flutterRenderer != null) {
            flutterRenderer.stopRenderingToSurface();
            this.renderSurface.release();
            this.renderSurface = null;
            return;
        }
        throw new IllegalStateException("disconnectSurfaceFromRenderer() should only be called when flutterRenderer is non-null.");
    }

    private void init() {
        this.setSurfaceTextureListener(this.surfaceTextureListener);
    }

    public void attachToRenderer(FlutterRenderer flutterRenderer) {
        Log.v((String)TAG, (String)"Attaching to FlutterRenderer.");
        if (this.flutterRenderer != null) {
            Log.v((String)TAG, (String)"Already connected to a FlutterRenderer. Detaching from old one and attaching to new one.");
            this.flutterRenderer.stopRenderingToSurface();
        }
        this.flutterRenderer = flutterRenderer;
        this.isAttachedToFlutterRenderer = true;
        if (this.isSurfaceAvailableForRendering) {
            Log.v((String)TAG, (String)"Surface is available for rendering. Connecting FlutterRenderer to Android surface.");
            FlutterTextureView.super.connectSurfaceToRenderer();
        }
    }

    public void detachFromRenderer() {
        if (this.flutterRenderer != null) {
            if (this.getWindowToken() != null) {
                Log.v((String)TAG, (String)"Disconnecting FlutterRenderer from Android surface.");
                this.disconnectSurfaceFromRenderer();
            }
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

