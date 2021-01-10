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
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
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
import tv.danmaku.ijk.media.player.IjkTimedText;
import tv.danmaku.ijk.media.player.MediaInfo;
import tv.danmaku.ijk.media.player.misc.IMediaDataSource;
import tv.danmaku.ijk.media.player.misc.ITrackInfo;

public interface IMediaPlayer {
    public static final int MEDIA_ERROR_IO = -1004;
    public static final int MEDIA_ERROR_MALFORMED = -1007;
    public static final int MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK = 200;
    public static final int MEDIA_ERROR_SERVER_DIED = 100;
    public static final int MEDIA_ERROR_SNAP_SHOT = -480;
    public static final int MEDIA_ERROR_TIMED_OUT = -110;
    public static final int MEDIA_ERROR_UNKNOWN = 1;
    public static final int MEDIA_ERROR_UNSUPPORTED = -1010;
    public static final int MEDIA_INFO_AUDIO_DECODED_START = 10003;
    public static final int MEDIA_INFO_AUDIO_RENDERING_START = 10002;
    public static final int MEDIA_INFO_AUDIO_SEEK_RENDERING_START = 10009;
    public static final int MEDIA_INFO_BAD_INTERLEAVING = 800;
    public static final int MEDIA_INFO_BUFFERING_END = 702;
    public static final int MEDIA_INFO_BUFFERING_START = 701;
    public static final int MEDIA_INFO_COMPONENT_OPEN = 10007;
    public static final int MEDIA_INFO_FIND_STREAM_INFO = 10006;
    public static final int MEDIA_INFO_MEDIA_ACCURATE_SEEK_COMPLETE = 10100;
    public static final int MEDIA_INFO_METADATA_UPDATE = 802;
    public static final int MEDIA_INFO_NETWORK_BANDWIDTH = 703;
    public static final int MEDIA_INFO_NOT_SEEKABLE = 801;
    public static final int MEDIA_INFO_OPEN_INPUT = 10005;
    public static final int MEDIA_INFO_STARTED_AS_NEXT = 2;
    public static final int MEDIA_INFO_SUBTITLE_TIMED_OUT = 902;
    public static final int MEDIA_INFO_TIMED_TEXT_ERROR = 900;
    public static final int MEDIA_INFO_UNKNOWN = 1;
    public static final int MEDIA_INFO_UNSUPPORTED_SUBTITLE = 901;
    public static final int MEDIA_INFO_VIDEO_DECODED_START = 10004;
    public static final int MEDIA_INFO_VIDEO_RENDERING_START = 3;
    public static final int MEDIA_INFO_VIDEO_ROTATION_CHANGED = 10001;
    public static final int MEDIA_INFO_VIDEO_SEEK_RENDERING_START = 10008;
    public static final int MEDIA_INFO_VIDEO_TRACK_LAGGING = 700;

    public int getAudioSessionId();

    public long getCurrentPosition();

    public String getDataSource();

    public long getDuration();

    public MediaInfo getMediaInfo();

    public ITrackInfo[] getTrackInfo();

    public int getVideoHeight();

    public int getVideoSarDen();

    public int getVideoSarNum();

    public int getVideoWidth();

    public boolean isLooping();

    @Deprecated
    public boolean isPlayable();

    public boolean isPlaying();

    public void pause();

    public void prepareAsync();

    public void release();

    public void reset();

    public void seekTo(long var1);

    public void setAudioStreamType(int var1);

    public void setDataSource(Context var1, Uri var2);

    @TargetApi(value=14)
    public void setDataSource(Context var1, Uri var2, Map<String, String> var3);

    public void setDataSource(FileDescriptor var1);

    public void setDataSource(String var1);

    public void setDataSource(IMediaDataSource var1);

    public void setDisplay(SurfaceHolder var1);

    @Deprecated
    public void setKeepInBackground(boolean var1);

    @Deprecated
    public void setLogEnabled(boolean var1);

    public void setLooping(boolean var1);

    public void setOnBufferingUpdateListener(OnBufferingUpdateListener var1);

    public void setOnCompletionListener(OnCompletionListener var1);

    public void setOnErrorListener(OnErrorListener var1);

    public void setOnInfoListener(OnInfoListener var1);

    public void setOnPreparedListener(OnPreparedListener var1);

    public void setOnSeekCompleteListener(OnSeekCompleteListener var1);

    public void setOnSnapShotListener(OnSnapShotListener var1);

    public void setOnTimedTextListener(OnTimedTextListener var1);

    public void setOnVideoSizeChangedListener(OnVideoSizeChangedListener var1);

    public void setScreenOnWhilePlaying(boolean var1);

    public void setSurface(Surface var1);

    public void setVolume(float var1, float var2);

    @Deprecated
    public void setWakeMode(Context var1, int var2);

    public void snapShot();

    public void start();

    public void stop();

    public static interface OnBufferingUpdateListener {
        public void onBufferingUpdate(IMediaPlayer var1, int var2);
    }

    public static interface OnCompletionListener {
        public void onCompletion(IMediaPlayer var1);
    }

    public static interface OnErrorListener {
        public boolean onError(IMediaPlayer var1, int var2, int var3);
    }

    public static interface OnInfoListener {
        public boolean onInfo(IMediaPlayer var1, int var2, int var3);
    }

    public static interface OnPreparedListener {
        public void onPrepared(IMediaPlayer var1);
    }

    public static interface OnSeekCompleteListener {
        public void onSeekComplete(IMediaPlayer var1);
    }

    public static interface OnSnapShotListener {
        public void onSnapShot(IMediaPlayer var1, Bitmap var2, int var3, int var4);
    }

    public static interface OnTimedTextListener {
        public void onTimedText(IMediaPlayer var1, IjkTimedText var2);
    }

    public static interface OnVideoSizeChangedListener {
        public void onVideoSizeChanged(IMediaPlayer var1, int var2, int var3, int var4, int var5);
    }

}

