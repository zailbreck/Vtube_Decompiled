/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.SurfaceTexture
 *  java.lang.Object
 */
package io.flutter.view;

import android.graphics.SurfaceTexture;

public interface TextureRegistry {
    public SurfaceTextureEntry createSurfaceTexture();

    public static interface SurfaceTextureEntry {
        public long id();

        public void release();

        public SurfaceTexture surfaceTexture();
    }

}

