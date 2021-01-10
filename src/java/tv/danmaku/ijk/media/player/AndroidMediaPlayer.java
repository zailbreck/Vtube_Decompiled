/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.media.MediaDataSource
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnBufferingUpdateListener
 *  android.media.MediaPlayer$OnCompletionListener
 *  android.media.MediaPlayer$OnErrorListener
 *  android.media.MediaPlayer$OnInfoListener
 *  android.media.MediaPlayer$OnPreparedListener
 *  android.media.MediaPlayer$OnSeekCompleteListener
 *  android.media.MediaPlayer$OnTimedTextListener
 *  android.media.MediaPlayer$OnVideoSizeChangedListener
 *  android.net.Uri
 *  android.text.TextUtils
 *  android.view.Surface
 *  android.view.SurfaceHolder
 *  java.io.FileDescriptor
 *  java.io.IOException
 *  java.lang.CharSequence
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Map
 *  tv.danmaku.ijk.media.player.AndroidMediaPlayer$AndroidMediaPlayerListenerHolder
 *  tv.danmaku.ijk.media.player.AndroidMediaPlayer$MediaDataSourceProxy
 *  tv.danmaku.ijk.media.player.MediaInfo
 *  tv.danmaku.ijk.media.player.misc.IMediaDataSource
 *  tv.danmaku.ijk.media.player.misc.ITrackInfo
 *  tv.danmaku.ijk.media.player.pragma.DebugLog
 */
package tv.danmaku.ijk.media.player;

import android.annotation.TargetApi;
import android.content.Context;
import android.media.MediaDataSource;
import android.media.MediaPlayer;
import android.net.Uri;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.Map;
import tv.danmaku.ijk.media.player.AbstractMediaPlayer;
import tv.danmaku.ijk.media.player.AndroidMediaPlayer;
import tv.danmaku.ijk.media.player.MediaInfo;
import tv.danmaku.ijk.media.player.misc.AndroidTrackInfo;
import tv.danmaku.ijk.media.player.misc.IMediaDataSource;
import tv.danmaku.ijk.media.player.misc.ITrackInfo;
import tv.danmaku.ijk.media.player.pragma.DebugLog;

/*
 * Exception performing whole class analysis.
 */
public class AndroidMediaPlayer
extends AbstractMediaPlayer {
    public static MediaInfo sMediaInfo;
    public String mDataSource;
    public final Object mInitLock;
    public final AndroidMediaPlayerListenerHolder mInternalListenerAdapter;
    public final MediaPlayer mInternalMediaPlayer;
    public boolean mIsReleased;
    public MediaDataSource mMediaDataSource;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public AndroidMediaPlayer() {
        Object object;
        MediaPlayer mediaPlayer;
        this.mInitLock = object = new Object();
        Object object2 = object;
        synchronized (object2) {
            this.mInternalMediaPlayer = mediaPlayer = new MediaPlayer();
        }
        mediaPlayer.setAudioStreamType(3);
        this.mInternalListenerAdapter = new /* Unavailable Anonymous Inner Class!! */;
        this.attachInternalListeners();
    }

    private void attachInternalListeners() {
        this.mInternalMediaPlayer.setOnPreparedListener((MediaPlayer.OnPreparedListener)this.mInternalListenerAdapter);
        this.mInternalMediaPlayer.setOnBufferingUpdateListener((MediaPlayer.OnBufferingUpdateListener)this.mInternalListenerAdapter);
        this.mInternalMediaPlayer.setOnCompletionListener((MediaPlayer.OnCompletionListener)this.mInternalListenerAdapter);
        this.mInternalMediaPlayer.setOnSeekCompleteListener((MediaPlayer.OnSeekCompleteListener)this.mInternalListenerAdapter);
        this.mInternalMediaPlayer.setOnVideoSizeChangedListener((MediaPlayer.OnVideoSizeChangedListener)this.mInternalListenerAdapter);
        this.mInternalMediaPlayer.setOnErrorListener((MediaPlayer.OnErrorListener)this.mInternalListenerAdapter);
        this.mInternalMediaPlayer.setOnInfoListener((MediaPlayer.OnInfoListener)this.mInternalListenerAdapter);
        this.mInternalMediaPlayer.setOnTimedTextListener((MediaPlayer.OnTimedTextListener)this.mInternalListenerAdapter);
    }

    private void releaseMediaDataSource() {
        MediaDataSource mediaDataSource = this.mMediaDataSource;
        if (mediaDataSource != null) {
            try {
                mediaDataSource.close();
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
            this.mMediaDataSource = null;
        }
    }

    public int getAudioSessionId() {
        return this.mInternalMediaPlayer.getAudioSessionId();
    }

    public long getCurrentPosition() {
        int n2;
        try {
            n2 = this.mInternalMediaPlayer.getCurrentPosition();
        }
        catch (IllegalStateException illegalStateException) {
            DebugLog.printStackTrace((Throwable)illegalStateException);
            return 0L;
        }
        return n2;
    }

    public String getDataSource() {
        return this.mDataSource;
    }

    public long getDuration() {
        int n2;
        try {
            n2 = this.mInternalMediaPlayer.getDuration();
        }
        catch (IllegalStateException illegalStateException) {
            DebugLog.printStackTrace((Throwable)illegalStateException);
            return 0L;
        }
        return n2;
    }

    public MediaPlayer getInternalMediaPlayer() {
        return this.mInternalMediaPlayer;
    }

    public MediaInfo getMediaInfo() {
        if (sMediaInfo == null) {
            MediaInfo mediaInfo = new MediaInfo();
            mediaInfo.mVideoDecoder = "android";
            mediaInfo.mVideoDecoderImpl = "HW";
            mediaInfo.mAudioDecoder = "android";
            mediaInfo.mAudioDecoderImpl = "HW";
            sMediaInfo = mediaInfo;
        }
        return sMediaInfo;
    }

    public ITrackInfo[] getTrackInfo() {
        return AndroidTrackInfo.fromMediaPlayer(this.mInternalMediaPlayer);
    }

    public int getVideoHeight() {
        return this.mInternalMediaPlayer.getVideoHeight();
    }

    public int getVideoSarDen() {
        return 1;
    }

    public int getVideoSarNum() {
        return 1;
    }

    public int getVideoWidth() {
        return this.mInternalMediaPlayer.getVideoWidth();
    }

    public boolean isLooping() {
        return this.mInternalMediaPlayer.isLooping();
    }

    public boolean isPlayable() {
        return true;
    }

    public boolean isPlaying() {
        try {
            boolean bl = this.mInternalMediaPlayer.isPlaying();
            return bl;
        }
        catch (IllegalStateException illegalStateException) {
            DebugLog.printStackTrace((Throwable)illegalStateException);
            return false;
        }
    }

    public void pause() {
        this.mInternalMediaPlayer.pause();
    }

    public void prepareAsync() {
        this.mInternalMediaPlayer.prepareAsync();
    }

    public void release() {
        this.mIsReleased = true;
        this.mInternalMediaPlayer.release();
        this.releaseMediaDataSource();
        this.resetListeners();
        this.attachInternalListeners();
    }

    public void reset() {
        try {
            this.mInternalMediaPlayer.reset();
        }
        catch (IllegalStateException illegalStateException) {
            DebugLog.printStackTrace((Throwable)illegalStateException);
        }
        this.releaseMediaDataSource();
        this.resetListeners();
        this.attachInternalListeners();
    }

    public void seekTo(long l2) {
        this.mInternalMediaPlayer.seekTo((int)l2);
    }

    public void setAudioStreamType(int n2) {
        this.mInternalMediaPlayer.setAudioStreamType(n2);
    }

    public void setDataSource(Context context, Uri uri) {
        this.mInternalMediaPlayer.setDataSource(context, uri);
    }

    @TargetApi(value=14)
    public void setDataSource(Context context, Uri uri, Map<String, String> map) {
        this.mInternalMediaPlayer.setDataSource(context, uri, map);
    }

    public void setDataSource(FileDescriptor fileDescriptor) {
        this.mInternalMediaPlayer.setDataSource(fileDescriptor);
    }

    public void setDataSource(String string) {
        this.mDataSource = string;
        Uri uri = Uri.parse((String)string);
        String string2 = uri.getScheme();
        if (!TextUtils.isEmpty((CharSequence)string2) && string2.equalsIgnoreCase("file")) {
            this.mInternalMediaPlayer.setDataSource(uri.getPath());
            return;
        }
        this.mInternalMediaPlayer.setDataSource(string);
    }

    @TargetApi(value=23)
    @Override
    public void setDataSource(IMediaDataSource iMediaDataSource) {
        AndroidMediaPlayer.super.releaseMediaDataSource();
        MediaDataSourceProxy mediaDataSourceProxy = new /* Unavailable Anonymous Inner Class!! */;
        this.mMediaDataSource = mediaDataSourceProxy;
        this.mInternalMediaPlayer.setDataSource((MediaDataSource)mediaDataSourceProxy);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void setDisplay(SurfaceHolder surfaceHolder) {
        Object object;
        Object object2 = object = this.mInitLock;
        synchronized (object2) {
            if (!this.mIsReleased) {
                this.mInternalMediaPlayer.setDisplay(surfaceHolder);
            }
            return;
        }
    }

    public void setKeepInBackground(boolean bl) {
    }

    public void setLogEnabled(boolean bl) {
    }

    public void setLooping(boolean bl) {
        this.mInternalMediaPlayer.setLooping(bl);
    }

    public void setScreenOnWhilePlaying(boolean bl) {
        this.mInternalMediaPlayer.setScreenOnWhilePlaying(bl);
    }

    @TargetApi(value=14)
    public void setSurface(Surface surface) {
        this.mInternalMediaPlayer.setSurface(surface);
    }

    public void setVolume(float f2, float f3) {
        this.mInternalMediaPlayer.setVolume(f2, f3);
    }

    public void setWakeMode(Context context, int n2) {
        this.mInternalMediaPlayer.setWakeMode(context, n2);
    }

    public void snapShot() {
        this.notifyOnError(-480, -1010);
    }

    public void start() {
        this.mInternalMediaPlayer.start();
    }

    public void stop() {
        this.mInternalMediaPlayer.stop();
    }
}

