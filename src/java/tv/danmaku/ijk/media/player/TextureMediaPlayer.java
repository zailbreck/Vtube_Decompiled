/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.graphics.SurfaceTexture
 *  android.view.Surface
 *  android.view.SurfaceHolder
 *  tv.danmaku.ijk.media.player.IMediaPlayer
 *  tv.danmaku.ijk.media.player.ISurfaceTextureHolder
 *  tv.danmaku.ijk.media.player.ISurfaceTextureHost
 */
package tv.danmaku.ijk.media.player;

import android.annotation.TargetApi;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.SurfaceHolder;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.ISurfaceTextureHolder;
import tv.danmaku.ijk.media.player.ISurfaceTextureHost;
import tv.danmaku.ijk.media.player.MediaPlayerProxy;

@TargetApi(value=14)
public class TextureMediaPlayer
extends MediaPlayerProxy
implements IMediaPlayer,
ISurfaceTextureHolder {
    public SurfaceTexture mSurfaceTexture;
    public ISurfaceTextureHost mSurfaceTextureHost;

    public TextureMediaPlayer(IMediaPlayer iMediaPlayer) {
        super(iMediaPlayer);
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.mSurfaceTexture;
    }

    @Override
    public void release() {
        super.release();
        this.releaseSurfaceTexture();
    }

    public void releaseSurfaceTexture() {
        SurfaceTexture surfaceTexture = this.mSurfaceTexture;
        if (surfaceTexture != null) {
            ISurfaceTextureHost iSurfaceTextureHost = this.mSurfaceTextureHost;
            if (iSurfaceTextureHost != null) {
                iSurfaceTextureHost.releaseSurfaceTexture(surfaceTexture);
            } else {
                surfaceTexture.release();
            }
            this.mSurfaceTexture = null;
        }
    }

    @Override
    public void reset() {
        super.reset();
        this.releaseSurfaceTexture();
    }

    @Override
    public void setDisplay(SurfaceHolder surfaceHolder) {
        if (this.mSurfaceTexture == null) {
            super.setDisplay(surfaceHolder);
        }
    }

    @Override
    public void setSurface(Surface surface) {
        if (this.mSurfaceTexture == null) {
            super.setSurface(surface);
        }
    }

    public void setSurfaceTexture(SurfaceTexture surfaceTexture) {
        if (this.mSurfaceTexture == surfaceTexture) {
            return;
        }
        this.releaseSurfaceTexture();
        this.mSurfaceTexture = surfaceTexture;
        if (surfaceTexture == null) {
            super.setSurface(null);
            return;
        }
        super.setSurface(new Surface(surfaceTexture));
    }

    public void setSurfaceTextureHost(ISurfaceTextureHost iSurfaceTextureHost) {
        this.mSurfaceTextureHost = iSurfaceTextureHost;
    }
}

