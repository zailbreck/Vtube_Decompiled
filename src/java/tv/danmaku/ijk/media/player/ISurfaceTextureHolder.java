/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.SurfaceTexture
 *  java.lang.Object
 */
package tv.danmaku.ijk.media.player;

import android.graphics.SurfaceTexture;
import tv.danmaku.ijk.media.player.ISurfaceTextureHost;

public interface ISurfaceTextureHolder {
    public SurfaceTexture getSurfaceTexture();

    public void setSurfaceTexture(SurfaceTexture var1);

    public void setSurfaceTextureHost(ISurfaceTextureHost var1);
}

