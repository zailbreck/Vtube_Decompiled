/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  tv.danmaku.ijk.media.player.IjkMediaMeta
 *  tv.danmaku.ijk.media.player.IjkMediaMeta$IjkStreamMeta
 *  tv.danmaku.ijk.media.player.misc.IMediaFormat
 *  tv.danmaku.ijk.media.player.misc.ITrackInfo
 */
package tv.danmaku.ijk.media.player.misc;

import android.text.TextUtils;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import tv.danmaku.ijk.media.player.misc.IMediaFormat;
import tv.danmaku.ijk.media.player.misc.ITrackInfo;
import tv.danmaku.ijk.media.player.misc.IjkMediaFormat;

public class IjkTrackInfo
implements ITrackInfo {
    public IjkMediaMeta.IjkStreamMeta mStreamMeta;
    public int mTrackType = 0;

    public IjkTrackInfo(IjkMediaMeta.IjkStreamMeta ijkStreamMeta) {
        this.mStreamMeta = ijkStreamMeta;
    }

    public IMediaFormat getFormat() {
        return new IjkMediaFormat(this.mStreamMeta);
    }

    /*
     * Enabled aggressive block sorting
     */
    public String getInfoInline() {
        String string;
        StringBuilder stringBuilder = new StringBuilder(128);
        int n2 = this.mTrackType;
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    string = n2 != 4 ? "UNKNOWN" : "SUBTITLE";
                } else {
                    stringBuilder.append("TIMEDTEXT");
                    stringBuilder.append(", ");
                    string = this.mStreamMeta.mLanguage;
                }
            } else {
                stringBuilder.append("AUDIO");
                stringBuilder.append(", ");
                stringBuilder.append(this.mStreamMeta.getCodecShortNameInline());
                stringBuilder.append(", ");
                stringBuilder.append(this.mStreamMeta.getBitrateInline());
                stringBuilder.append(", ");
                string = this.mStreamMeta.getSampleRateInline();
            }
        } else {
            stringBuilder.append("VIDEO");
            stringBuilder.append(", ");
            stringBuilder.append(this.mStreamMeta.getCodecShortNameInline());
            stringBuilder.append(", ");
            stringBuilder.append(this.mStreamMeta.getBitrateInline());
            stringBuilder.append(", ");
            string = this.mStreamMeta.getResolutionInline();
        }
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    public String getLanguage() {
        IjkMediaMeta.IjkStreamMeta ijkStreamMeta = this.mStreamMeta;
        if (ijkStreamMeta != null && !TextUtils.isEmpty((CharSequence)ijkStreamMeta.mLanguage)) {
            return this.mStreamMeta.mLanguage;
        }
        return "und";
    }

    public int getTrackType() {
        return this.mTrackType;
    }

    public void setMediaMeta(IjkMediaMeta.IjkStreamMeta ijkStreamMeta) {
        this.mStreamMeta = ijkStreamMeta;
    }

    public void setTrackType(int n2) {
        this.mTrackType = n2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(IjkTrackInfo.class.getSimpleName());
        stringBuilder.append('{');
        stringBuilder.append(this.getInfoInline());
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

