/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.net.Uri
 *  android.view.Surface
 *  android.view.SurfaceHolder
 *  java.io.FileDescriptor
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
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
 *  tv.danmaku.ijk.media.player.MediaInfo
 *  tv.danmaku.ijk.media.player.misc.IMediaDataSource
 *  tv.danmaku.ijk.media.player.misc.ITrackInfo
 */
package tv.danmaku.ijk.media.player;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.io.FileDescriptor;
import java.util.Map;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkTimedText;
import tv.danmaku.ijk.media.player.MediaInfo;
import tv.danmaku.ijk.media.player.misc.IMediaDataSource;
import tv.danmaku.ijk.media.player.misc.ITrackInfo;

public class MediaPlayerProxy
implements IMediaPlayer {
    public final IMediaPlayer mBackEndMediaPlayer;

    public MediaPlayerProxy(IMediaPlayer iMediaPlayer) {
        this.mBackEndMediaPlayer = iMediaPlayer;
    }

    public int getAudioSessionId() {
        return this.mBackEndMediaPlayer.getAudioSessionId();
    }

    public long getCurrentPosition() {
        return this.mBackEndMediaPlayer.getCurrentPosition();
    }

    public String getDataSource() {
        return this.mBackEndMediaPlayer.getDataSource();
    }

    public long getDuration() {
        return this.mBackEndMediaPlayer.getDuration();
    }

    public IMediaPlayer getInternalMediaPlayer() {
        return this.mBackEndMediaPlayer;
    }

    public MediaInfo getMediaInfo() {
        return this.mBackEndMediaPlayer.getMediaInfo();
    }

    public ITrackInfo[] getTrackInfo() {
        return this.mBackEndMediaPlayer.getTrackInfo();
    }

    public int getVideoHeight() {
        return this.mBackEndMediaPlayer.getVideoHeight();
    }

    public int getVideoSarDen() {
        return this.mBackEndMediaPlayer.getVideoSarDen();
    }

    public int getVideoSarNum() {
        return this.mBackEndMediaPlayer.getVideoSarNum();
    }

    public int getVideoWidth() {
        return this.mBackEndMediaPlayer.getVideoWidth();
    }

    public boolean isLooping() {
        return this.mBackEndMediaPlayer.isLooping();
    }

    public boolean isPlayable() {
        return false;
    }

    public boolean isPlaying() {
        return this.mBackEndMediaPlayer.isPlaying();
    }

    public void pause() {
        this.mBackEndMediaPlayer.pause();
    }

    public void prepareAsync() {
        this.mBackEndMediaPlayer.prepareAsync();
    }

    public void release() {
        this.mBackEndMediaPlayer.release();
    }

    public void reset() {
        this.mBackEndMediaPlayer.reset();
    }

    public void seekTo(long l2) {
        this.mBackEndMediaPlayer.seekTo(l2);
    }

    public void setAudioStreamType(int n2) {
        this.mBackEndMediaPlayer.setAudioStreamType(n2);
    }

    public void setDataSource(Context context, Uri uri) {
        this.mBackEndMediaPlayer.setDataSource(context, uri);
    }

    @TargetApi(value=14)
    public void setDataSource(Context context, Uri uri, Map<String, String> map) {
        this.mBackEndMediaPlayer.setDataSource(context, uri, map);
    }

    public void setDataSource(FileDescriptor fileDescriptor) {
        this.mBackEndMediaPlayer.setDataSource(fileDescriptor);
    }

    public void setDataSource(String string) {
        this.mBackEndMediaPlayer.setDataSource(string);
    }

    public void setDataSource(IMediaDataSource iMediaDataSource) {
        this.mBackEndMediaPlayer.setDataSource(iMediaDataSource);
    }

    public void setDisplay(SurfaceHolder surfaceHolder) {
        this.mBackEndMediaPlayer.setDisplay(surfaceHolder);
    }

    public void setKeepInBackground(boolean bl) {
        this.mBackEndMediaPlayer.setKeepInBackground(bl);
    }

    public void setLogEnabled(boolean bl) {
    }

    public void setLooping(boolean bl) {
        this.mBackEndMediaPlayer.setLooping(bl);
    }

    public void setOnBufferingUpdateListener(final IMediaPlayer.OnBufferingUpdateListener onBufferingUpdateListener) {
        if (onBufferingUpdateListener != null) {
            this.mBackEndMediaPlayer.setOnBufferingUpdateListener(new IMediaPlayer.OnBufferingUpdateListener(){

                public void onBufferingUpdate(IMediaPlayer iMediaPlayer, int n2) {
                    onBufferingUpdateListener.onBufferingUpdate((IMediaPlayer)MediaPlayerProxy.this, n2);
                }
            });
            return;
        }
        this.mBackEndMediaPlayer.setOnBufferingUpdateListener(null);
    }

    public void setOnCompletionListener(final IMediaPlayer.OnCompletionListener onCompletionListener) {
        if (onCompletionListener != null) {
            this.mBackEndMediaPlayer.setOnCompletionListener(new IMediaPlayer.OnCompletionListener(){

                public void onCompletion(IMediaPlayer iMediaPlayer) {
                    onCompletionListener.onCompletion((IMediaPlayer)MediaPlayerProxy.this);
                }
            });
            return;
        }
        this.mBackEndMediaPlayer.setOnCompletionListener(null);
    }

    public void setOnErrorListener(final IMediaPlayer.OnErrorListener onErrorListener) {
        if (onErrorListener != null) {
            this.mBackEndMediaPlayer.setOnErrorListener(new IMediaPlayer.OnErrorListener(){

                public boolean onError(IMediaPlayer iMediaPlayer, int n2, int n3) {
                    return onErrorListener.onError((IMediaPlayer)MediaPlayerProxy.this, n2, n3);
                }
            });
            return;
        }
        this.mBackEndMediaPlayer.setOnErrorListener(null);
    }

    public void setOnInfoListener(final IMediaPlayer.OnInfoListener onInfoListener) {
        if (onInfoListener != null) {
            this.mBackEndMediaPlayer.setOnInfoListener(new IMediaPlayer.OnInfoListener(){

                public boolean onInfo(IMediaPlayer iMediaPlayer, int n2, int n3) {
                    return onInfoListener.onInfo((IMediaPlayer)MediaPlayerProxy.this, n2, n3);
                }
            });
            return;
        }
        this.mBackEndMediaPlayer.setOnInfoListener(null);
    }

    public void setOnPreparedListener(final IMediaPlayer.OnPreparedListener onPreparedListener) {
        if (onPreparedListener != null) {
            this.mBackEndMediaPlayer.setOnPreparedListener(new IMediaPlayer.OnPreparedListener(){

                public void onPrepared(IMediaPlayer iMediaPlayer) {
                    onPreparedListener.onPrepared((IMediaPlayer)MediaPlayerProxy.this);
                }
            });
            return;
        }
        this.mBackEndMediaPlayer.setOnPreparedListener(null);
    }

    public void setOnSeekCompleteListener(final IMediaPlayer.OnSeekCompleteListener onSeekCompleteListener) {
        if (onSeekCompleteListener != null) {
            this.mBackEndMediaPlayer.setOnSeekCompleteListener(new IMediaPlayer.OnSeekCompleteListener(){

                public void onSeekComplete(IMediaPlayer iMediaPlayer) {
                    onSeekCompleteListener.onSeekComplete((IMediaPlayer)MediaPlayerProxy.this);
                }
            });
            return;
        }
        this.mBackEndMediaPlayer.setOnSeekCompleteListener(null);
    }

    public void setOnSnapShotListener(final IMediaPlayer.OnSnapShotListener onSnapShotListener) {
        if (onSnapShotListener != null) {
            this.mBackEndMediaPlayer.setOnSnapShotListener(new IMediaPlayer.OnSnapShotListener(){

                public void onSnapShot(IMediaPlayer iMediaPlayer, Bitmap bitmap, int n2, int n3) {
                    onSnapShotListener.onSnapShot((IMediaPlayer)MediaPlayerProxy.this, bitmap, n2, n3);
                }
            });
            return;
        }
        this.mBackEndMediaPlayer.setOnSnapShotListener(null);
    }

    public void setOnTimedTextListener(final IMediaPlayer.OnTimedTextListener onTimedTextListener) {
        if (onTimedTextListener != null) {
            this.mBackEndMediaPlayer.setOnTimedTextListener(new IMediaPlayer.OnTimedTextListener(){

                public void onTimedText(IMediaPlayer iMediaPlayer, IjkTimedText ijkTimedText) {
                    onTimedTextListener.onTimedText((IMediaPlayer)MediaPlayerProxy.this, ijkTimedText);
                }
            });
            return;
        }
        this.mBackEndMediaPlayer.setOnTimedTextListener(null);
    }

    public void setOnVideoSizeChangedListener(final IMediaPlayer.OnVideoSizeChangedListener onVideoSizeChangedListener) {
        if (onVideoSizeChangedListener != null) {
            this.mBackEndMediaPlayer.setOnVideoSizeChangedListener(new IMediaPlayer.OnVideoSizeChangedListener(){

                public void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int n2, int n3, int n4, int n5) {
                    onVideoSizeChangedListener.onVideoSizeChanged((IMediaPlayer)MediaPlayerProxy.this, n2, n3, n4, n5);
                }
            });
            return;
        }
        this.mBackEndMediaPlayer.setOnVideoSizeChangedListener(null);
    }

    public void setScreenOnWhilePlaying(boolean bl) {
        this.mBackEndMediaPlayer.setScreenOnWhilePlaying(bl);
    }

    @TargetApi(value=14)
    public void setSurface(Surface surface) {
        this.mBackEndMediaPlayer.setSurface(surface);
    }

    public void setVolume(float f2, float f3) {
        this.mBackEndMediaPlayer.setVolume(f2, f3);
    }

    public void setWakeMode(Context context, int n2) {
        this.mBackEndMediaPlayer.setWakeMode(context, n2);
    }

    public void snapShot() {
        this.mBackEndMediaPlayer.snapShot();
    }

    public void start() {
        this.mBackEndMediaPlayer.start();
    }

    public void stop() {
        this.mBackEndMediaPlayer.stop();
    }

}

