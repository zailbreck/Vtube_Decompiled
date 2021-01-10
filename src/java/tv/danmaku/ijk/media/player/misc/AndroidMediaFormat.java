/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.media.MediaFormat
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  tv.danmaku.ijk.media.player.misc.IMediaFormat
 */
package tv.danmaku.ijk.media.player.misc;

import android.annotation.TargetApi;
import android.media.MediaFormat;
import tv.danmaku.ijk.media.player.misc.IMediaFormat;

public class AndroidMediaFormat
implements IMediaFormat {
    public final MediaFormat mMediaFormat;

    public AndroidMediaFormat(MediaFormat mediaFormat) {
        this.mMediaFormat = mediaFormat;
    }

    @TargetApi(value=16)
    public int getInteger(String string) {
        MediaFormat mediaFormat = this.mMediaFormat;
        if (mediaFormat == null) {
            return 0;
        }
        return mediaFormat.getInteger(string);
    }

    @TargetApi(value=16)
    public String getString(String string) {
        MediaFormat mediaFormat = this.mMediaFormat;
        if (mediaFormat == null) {
            return null;
        }
        return mediaFormat.getString(string);
    }

    @TargetApi(value=16)
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append(AndroidMediaFormat.class.getName());
        stringBuilder.append('{');
        MediaFormat mediaFormat = this.mMediaFormat;
        String string = mediaFormat != null ? mediaFormat.toString() : "null";
        stringBuilder.append(string);
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

