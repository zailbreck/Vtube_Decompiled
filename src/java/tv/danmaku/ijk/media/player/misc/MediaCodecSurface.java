/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.SurfaceTexture
 *  android.view.Surface
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package tv.danmaku.ijk.media.player.misc;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import tv.danmaku.ijk.media.player.annotations.CalledByNative;
import tv.danmaku.ijk.media.player.pragma.DebugLog;

public class MediaCodecSurface {
    public boolean mAttached = false;
    public boolean mReleased = false;
    public Surface mSurface = new Surface(this.mSurfaceTexture);
    public SurfaceTexture mSurfaceTexture = new SurfaceTexture(0);

    public MediaCodecSurface() {
        this.mSurfaceTexture.detachFromGLContext();
    }

    @CalledByNative
    public void attachToGLContext(int n2, int n3, int n4) {
        if (!this.mReleased) {
            if (this.mAttached) {
                return;
            }
            this.mAttached = true;
            this.mSurfaceTexture.attachToGLContext(n2);
        }
    }

    @CalledByNative
    public void detachFromGLContext() {
        if (this.mAttached) {
            this.mSurfaceTexture.detachFromGLContext();
            this.mAttached = false;
        }
    }

    @CalledByNative
    public Surface getSurface() {
        if (this.mReleased) {
            return null;
        }
        return this.mSurface;
    }

    @CalledByNative
    public SurfaceTexture getSurfaceTexture() {
        if (this.mReleased) {
            return null;
        }
        return this.mSurfaceTexture;
    }

    @CalledByNative
    public void release() {
        Surface surface;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("release(),");
        stringBuilder.append(this.mReleased);
        DebugLog.d("MediaCodecSurface", stringBuilder.toString());
        this.mReleased = true;
        SurfaceTexture surfaceTexture = this.mSurfaceTexture;
        if (surfaceTexture != null) {
            surfaceTexture.release();
            this.mSurfaceTexture = null;
        }
        if ((surface = this.mSurface) != null) {
            surface.release();
            this.mSurface = null;
        }
    }

    @CalledByNative
    public void updateTexImage(float[] arrf) {
        if (!this.mReleased) {
            if (!this.mAttached) {
                return;
            }
            this.mSurfaceTexture.updateTexImage();
            this.mSurfaceTexture.getTransformMatrix(arrf);
        }
    }
}

