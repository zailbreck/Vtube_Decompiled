/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.media.MediaFormat
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$TrackInfo
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  tv.danmaku.ijk.media.player.misc.IMediaFormat
 *  tv.danmaku.ijk.media.player.misc.ITrackInfo
 */
package tv.danmaku.ijk.media.player.misc;

import android.annotation.TargetApi;
import android.media.MediaFormat;
import android.media.MediaPlayer;
import android.os.Build;
import tv.danmaku.ijk.media.player.misc.AndroidMediaFormat;
import tv.danmaku.ijk.media.player.misc.IMediaFormat;
import tv.danmaku.ijk.media.player.misc.ITrackInfo;

public class AndroidTrackInfo
implements ITrackInfo {
    public final MediaPlayer.TrackInfo mTrackInfo;

    public AndroidTrackInfo(MediaPlayer.TrackInfo trackInfo) {
        this.mTrackInfo = trackInfo;
    }

    public static AndroidTrackInfo[] fromMediaPlayer(MediaPlayer mediaPlayer) {
        if (Build.VERSION.SDK_INT >= 16) {
            return AndroidTrackInfo.fromTrackInfo(mediaPlayer.getTrackInfo());
        }
        return null;
    }

    public static AndroidTrackInfo[] fromTrackInfo(MediaPlayer.TrackInfo[] arrtrackInfo) {
        if (arrtrackInfo == null) {
            return null;
        }
        AndroidTrackInfo[] arrandroidTrackInfo = new AndroidTrackInfo[arrtrackInfo.length];
        for (int i2 = 0; i2 < arrtrackInfo.length; ++i2) {
            arrandroidTrackInfo[i2] = new AndroidTrackInfo(arrtrackInfo[i2]);
        }
        return arrandroidTrackInfo;
    }

    @TargetApi(value=19)
    public IMediaFormat getFormat() {
        MediaPlayer.TrackInfo trackInfo = this.mTrackInfo;
        if (trackInfo == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 19) {
            return null;
        }
        MediaFormat mediaFormat = trackInfo.getFormat();
        if (mediaFormat == null) {
            return null;
        }
        return new AndroidMediaFormat(mediaFormat);
    }

    @TargetApi(value=16)
    public String getInfoInline() {
        MediaPlayer.TrackInfo trackInfo = this.mTrackInfo;
        if (trackInfo != null) {
            return trackInfo.toString();
        }
        return "null";
    }

    @TargetApi(value=16)
    public String getLanguage() {
        MediaPlayer.TrackInfo trackInfo = this.mTrackInfo;
        if (trackInfo == null) {
            return "und";
        }
        return trackInfo.getLanguage();
    }

    @TargetApi(value=16)
    public int getTrackType() {
        MediaPlayer.TrackInfo trackInfo = this.mTrackInfo;
        if (trackInfo == null) {
            return 0;
        }
        return trackInfo.getTrackType();
    }

    @TargetApi(value=16)
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append(AndroidTrackInfo.class.getSimpleName());
        stringBuilder.append('{');
        MediaPlayer.TrackInfo trackInfo = this.mTrackInfo;
        String string = trackInfo != null ? trackInfo.toString() : "null";
        stringBuilder.append(string);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

