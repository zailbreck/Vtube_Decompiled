/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  java.lang.Object
 *  java.lang.UnsupportedOperationException
 *  tv.danmaku.ijk.media.player.IMediaPlayer
 *  tv.danmaku.ijk.media.player.IMediaPlayer$OnBufferingUpdateListener
 *  tv.danmaku.ijk.media.player.IMediaPlayer$OnCompletionListener
 *  tv.danmaku.ijk.media.player.IMediaPlayer$OnErrorListener
 *  tv.danmaku.ijk.media.player.IMediaPlayer$OnInfoListener
 *  tv.danmaku.ijk.media.player.IMediaPlayer$OnPreparedListener
 *  tv.danmaku.ijk.media.player.IMediaPlayer$OnSeekCompleteListener
 *  tv.danmaku.ijk.media.player.IMediaPlayer$OnSnapShotListener
 *  tv.danmaku.ijk.media.player.IMediaPlayer$OnTimedTextListener
 *  tv.danmaku.ijk.media.player.IMediaPlayer$OnVideoSizeChangedListener
 *  tv.danmaku.ijk.media.player.IjkTimedText
 *  tv.danmaku.ijk.media.player.misc.IMediaDataSource
 */
package tv.danmaku.ijk.media.player;

import android.graphics.Bitmap;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkTimedText;
import tv.danmaku.ijk.media.player.misc.IMediaDataSource;

public abstract class AbstractMediaPlayer
implements IMediaPlayer {
    public IMediaPlayer.OnBufferingUpdateListener mOnBufferingUpdateListener;
    public IMediaPlayer.OnCompletionListener mOnCompletionListener;
    public IMediaPlayer.OnErrorListener mOnErrorListener;
    public IMediaPlayer.OnInfoListener mOnInfoListener;
    public IMediaPlayer.OnPreparedListener mOnPreparedListener;
    public IMediaPlayer.OnSeekCompleteListener mOnSeekCompleteListener;
    public IMediaPlayer.OnSnapShotListener mOnSnapShotListener;
    public IMediaPlayer.OnTimedTextListener mOnTimedTextListener;
    public IMediaPlayer.OnVideoSizeChangedListener mOnVideoSizeChangedListener;

    public final void notifyOnBufferingUpdate(int n2) {
        IMediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener = this.mOnBufferingUpdateListener;
        if (onBufferingUpdateListener != null) {
            onBufferingUpdateListener.onBufferingUpdate((IMediaPlayer)this, n2);
        }
    }

    public final void notifyOnCompletion() {
        IMediaPlayer.OnCompletionListener onCompletionListener = this.mOnCompletionListener;
        if (onCompletionListener != null) {
            onCompletionListener.onCompletion((IMediaPlayer)this);
        }
    }

    public final boolean notifyOnError(int n2, int n3) {
        IMediaPlayer.OnErrorListener onErrorListener = this.mOnErrorListener;
        return onErrorListener != null && onErrorListener.onError((IMediaPlayer)this, n2, n3);
    }

    public final boolean notifyOnInfo(int n2, int n3) {
        IMediaPlayer.OnInfoListener onInfoListener = this.mOnInfoListener;
        return onInfoListener != null && onInfoListener.onInfo((IMediaPlayer)this, n2, n3);
    }

    public final void notifyOnPrepared() {
        IMediaPlayer.OnPreparedListener onPreparedListener = this.mOnPreparedListener;
        if (onPreparedListener != null) {
            onPreparedListener.onPrepared((IMediaPlayer)this);
        }
    }

    public final void notifyOnSeekComplete() {
        IMediaPlayer.OnSeekCompleteListener onSeekCompleteListener = this.mOnSeekCompleteListener;
        if (onSeekCompleteListener != null) {
            onSeekCompleteListener.onSeekComplete((IMediaPlayer)this);
        }
    }

    public final void notifyOnTimedText(IjkTimedText ijkTimedText) {
        IMediaPlayer.OnTimedTextListener onTimedTextListener = this.mOnTimedTextListener;
        if (onTimedTextListener != null) {
            onTimedTextListener.onTimedText((IMediaPlayer)this, ijkTimedText);
        }
    }

    public final void notifyOnVideoSizeChanged(int n2, int n3, int n4, int n5) {
        IMediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener = this.mOnVideoSizeChangedListener;
        if (onVideoSizeChangedListener != null) {
            onVideoSizeChangedListener.onVideoSizeChanged((IMediaPlayer)this, n2, n3, n4, n5);
        }
    }

    public final void notifySnapShot(Bitmap bitmap, int n2, int n3) {
        IMediaPlayer.OnSnapShotListener onSnapShotListener = this.mOnSnapShotListener;
        if (onSnapShotListener != null) {
            onSnapShotListener.onSnapShot((IMediaPlayer)this, bitmap, n2, n3);
        }
    }

    public void resetListeners() {
        this.mOnPreparedListener = null;
        this.mOnBufferingUpdateListener = null;
        this.mOnCompletionListener = null;
        this.mOnSeekCompleteListener = null;
        this.mOnVideoSizeChangedListener = null;
        this.mOnSnapShotListener = null;
        this.mOnErrorListener = null;
        this.mOnInfoListener = null;
        this.mOnTimedTextListener = null;
    }

    public void setDataSource(IMediaDataSource iMediaDataSource) {
        throw new UnsupportedOperationException();
    }

    public final void setOnBufferingUpdateListener(IMediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener) {
        this.mOnBufferingUpdateListener = onBufferingUpdateListener;
    }

    public final void setOnCompletionListener(IMediaPlayer.OnCompletionListener onCompletionListener) {
        this.mOnCompletionListener = onCompletionListener;
    }

    public final void setOnErrorListener(IMediaPlayer.OnErrorListener onErrorListener) {
        this.mOnErrorListener = onErrorListener;
    }

    public final void setOnInfoListener(IMediaPlayer.OnInfoListener onInfoListener) {
        this.mOnInfoListener = onInfoListener;
    }

    public final void setOnPreparedListener(IMediaPlayer.OnPreparedListener onPreparedListener) {
        this.mOnPreparedListener = onPreparedListener;
    }

    public final void setOnSeekCompleteListener(IMediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
        this.mOnSeekCompleteListener = onSeekCompleteListener;
    }

    public final void setOnSnapShotListener(IMediaPlayer.OnSnapShotListener onSnapShotListener) {
        this.mOnSnapShotListener = onSnapShotListener;
    }

    public final void setOnTimedTextListener(IMediaPlayer.OnTimedTextListener onTimedTextListener) {
        this.mOnTimedTextListener = onTimedTextListener;
    }

    public final void setOnVideoSizeChangedListener(IMediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        this.mOnVideoSizeChangedListener = onVideoSizeChangedListener;
    }
}

