/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.graphics.Bitmap
 *  android.graphics.SurfaceTexture
 *  android.graphics.SurfaceTexture$OnFrameAvailableListener
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.view.Surface
 *  io.flutter.Log
 *  io.flutter.embedding.engine.FlutterJNI
 *  io.flutter.embedding.engine.renderer.FlutterRenderer$SurfaceTextureRegistryEntry$1
 *  io.flutter.embedding.engine.renderer.FlutterRenderer$ViewportMetrics
 *  io.flutter.embedding.engine.renderer.FlutterUiDisplayListener
 *  io.flutter.view.TextureRegistry
 *  io.flutter.view.TextureRegistry$SurfaceTextureEntry
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.ByteBuffer
 *  java.util.concurrent.atomic.AtomicLong
 */
package io.flutter.embedding.engine.renderer;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.view.Surface;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
import io.flutter.view.TextureRegistry;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicLong;

@TargetApi(value=16)
public class FlutterRenderer
implements TextureRegistry {
    private static final String TAG = "FlutterRenderer";
    private final FlutterJNI flutterJNI;
    private final FlutterUiDisplayListener flutterUiDisplayListener;
    private boolean isDisplayingFlutterUi = false;
    private final AtomicLong nextTextureId = new AtomicLong(0L);
    private Surface surface;

    public FlutterRenderer(FlutterJNI flutterJNI) {
        this.flutterUiDisplayListener = new FlutterUiDisplayListener(){

            public void onFlutterUiDisplayed() {
                FlutterRenderer.this.isDisplayingFlutterUi = true;
            }

            public void onFlutterUiNoLongerDisplayed() {
                FlutterRenderer.this.isDisplayingFlutterUi = false;
            }
        };
        this.flutterJNI = flutterJNI;
        this.flutterJNI.addIsDisplayingFlutterUiListener(this.flutterUiDisplayListener);
    }

    static /* synthetic */ void access$300(FlutterRenderer flutterRenderer, long l2) {
        flutterRenderer.markTextureFrameAvailable(l2);
    }

    private void markTextureFrameAvailable(long l2) {
        this.flutterJNI.markTextureFrameAvailable(l2);
    }

    private void registerTexture(long l2, SurfaceTexture surfaceTexture) {
        this.flutterJNI.registerTexture(l2, surfaceTexture);
    }

    private void unregisterTexture(long l2) {
        this.flutterJNI.unregisterTexture(l2);
    }

    public void addIsDisplayingFlutterUiListener(FlutterUiDisplayListener flutterUiDisplayListener) {
        this.flutterJNI.addIsDisplayingFlutterUiListener(flutterUiDisplayListener);
        if (this.isDisplayingFlutterUi) {
            flutterUiDisplayListener.onFlutterUiDisplayed();
        }
    }

    public TextureRegistry.SurfaceTextureEntry createSurfaceTexture() {
        Log.v((String)TAG, (String)"Creating a SurfaceTexture.");
        SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.detachFromGLContext();
        SurfaceTextureRegistryEntry surfaceTextureRegistryEntry = new SurfaceTextureRegistryEntry(this.nextTextureId.getAndIncrement(), surfaceTexture);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("New SurfaceTexture ID: ");
        stringBuilder.append(surfaceTextureRegistryEntry.id());
        Log.v((String)TAG, (String)stringBuilder.toString());
        this.registerTexture(surfaceTextureRegistryEntry.id(), surfaceTexture);
        return surfaceTextureRegistryEntry;
    }

    public void dispatchPointerDataPacket(ByteBuffer byteBuffer, int n2) {
        this.flutterJNI.dispatchPointerDataPacket(byteBuffer, n2);
    }

    public void dispatchSemanticsAction(int n2, int n3, ByteBuffer byteBuffer, int n4) {
        this.flutterJNI.dispatchSemanticsAction(n2, n3, byteBuffer, n4);
    }

    public Bitmap getBitmap() {
        return this.flutterJNI.getBitmap();
    }

    public boolean isDisplayingFlutterUi() {
        return this.isDisplayingFlutterUi;
    }

    public boolean isSoftwareRenderingEnabled() {
        return this.flutterJNI.nativeGetIsSoftwareRenderingEnabled();
    }

    public void removeIsDisplayingFlutterUiListener(FlutterUiDisplayListener flutterUiDisplayListener) {
        this.flutterJNI.removeIsDisplayingFlutterUiListener(flutterUiDisplayListener);
    }

    public void setAccessibilityFeatures(int n2) {
        this.flutterJNI.setAccessibilityFeatures(n2);
    }

    public void setSemanticsEnabled(boolean bl) {
        this.flutterJNI.setSemanticsEnabled(bl);
    }

    public void setViewportMetrics(ViewportMetrics viewportMetrics) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Setting viewport metrics\nSize: ");
        stringBuilder.append(viewportMetrics.width);
        stringBuilder.append(" x ");
        stringBuilder.append(viewportMetrics.height);
        stringBuilder.append("\nPadding - L: ");
        stringBuilder.append(viewportMetrics.paddingLeft);
        stringBuilder.append(", T: ");
        stringBuilder.append(viewportMetrics.paddingTop);
        stringBuilder.append(", R: ");
        stringBuilder.append(viewportMetrics.paddingRight);
        stringBuilder.append(", B: ");
        stringBuilder.append(viewportMetrics.paddingBottom);
        stringBuilder.append("\nInsets - L: ");
        stringBuilder.append(viewportMetrics.viewInsetLeft);
        stringBuilder.append(", T: ");
        stringBuilder.append(viewportMetrics.viewInsetTop);
        stringBuilder.append(", R: ");
        stringBuilder.append(viewportMetrics.viewInsetRight);
        stringBuilder.append(", B: ");
        stringBuilder.append(viewportMetrics.viewInsetBottom);
        stringBuilder.append("\nSystem Gesture Insets - L: ");
        stringBuilder.append(viewportMetrics.systemGestureInsetLeft);
        stringBuilder.append(", T: ");
        stringBuilder.append(viewportMetrics.systemGestureInsetTop);
        stringBuilder.append(", R: ");
        stringBuilder.append(viewportMetrics.systemGestureInsetRight);
        stringBuilder.append(", B: ");
        stringBuilder.append(viewportMetrics.viewInsetBottom);
        Log.v((String)TAG, (String)stringBuilder.toString());
        this.flutterJNI.setViewportMetrics(viewportMetrics.devicePixelRatio, viewportMetrics.width, viewportMetrics.height, viewportMetrics.paddingTop, viewportMetrics.paddingRight, viewportMetrics.paddingBottom, viewportMetrics.paddingLeft, viewportMetrics.viewInsetTop, viewportMetrics.viewInsetRight, viewportMetrics.viewInsetBottom, viewportMetrics.viewInsetLeft, viewportMetrics.systemGestureInsetTop, viewportMetrics.systemGestureInsetRight, viewportMetrics.systemGestureInsetBottom, viewportMetrics.systemGestureInsetLeft);
    }

    public void startRenderingToSurface(Surface surface) {
        if (this.surface != null) {
            this.stopRenderingToSurface();
        }
        this.surface = surface;
        this.flutterJNI.onSurfaceCreated(surface);
    }

    public void stopRenderingToSurface() {
        this.flutterJNI.onSurfaceDestroyed();
        this.surface = null;
        if (this.isDisplayingFlutterUi) {
            this.flutterUiDisplayListener.onFlutterUiNoLongerDisplayed();
        }
        this.isDisplayingFlutterUi = false;
    }

    public void surfaceChanged(int n2, int n3) {
        this.flutterJNI.onSurfaceChanged(n2, n3);
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

        static /* synthetic */ boolean access$100(SurfaceTextureRegistryEntry surfaceTextureRegistryEntry) {
            return surfaceTextureRegistryEntry.released;
        }

        static /* synthetic */ long access$200(SurfaceTextureRegistryEntry surfaceTextureRegistryEntry) {
            return surfaceTextureRegistryEntry.id;
        }

        public long id() {
            return this.id;
        }

        public void release() {
            if (this.released) {
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Releasing a SurfaceTexture (");
            stringBuilder.append(this.id);
            stringBuilder.append(").");
            Log.v((String)FlutterRenderer.TAG, (String)stringBuilder.toString());
            this.surfaceTexture.release();
            FlutterRenderer.this.unregisterTexture(this.id);
            this.released = true;
        }

        public SurfaceTexture surfaceTexture() {
            return this.surfaceTexture;
        }
    }

}

