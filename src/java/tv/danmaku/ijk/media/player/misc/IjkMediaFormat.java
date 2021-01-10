/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 *  java.util.Locale
 *  java.util.Map
 *  tv.danmaku.ijk.media.player.IjkMediaMeta
 *  tv.danmaku.ijk.media.player.IjkMediaMeta$IjkStreamMeta
 *  tv.danmaku.ijk.media.player.misc.IMediaFormat
 *  tv.danmaku.ijk.media.player.misc.IjkMediaFormat$Formatter
 */
package tv.danmaku.ijk.media.player.misc;

import android.annotation.TargetApi;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import tv.danmaku.ijk.media.player.misc.IMediaFormat;
import tv.danmaku.ijk.media.player.misc.IjkMediaFormat;

public class IjkMediaFormat
implements IMediaFormat {
    public static final String CODEC_NAME_H264 = "h264";
    public static final String KEY_IJK_BIT_RATE_UI = "ijk-bit-rate-ui";
    public static final String KEY_IJK_CHANNEL_UI = "ijk-channel-ui";
    public static final String KEY_IJK_CODEC_LONG_NAME_UI = "ijk-codec-long-name-ui";
    public static final String KEY_IJK_CODEC_NAME_UI = "ijk-codec-name-ui";
    public static final String KEY_IJK_CODEC_PIXEL_FORMAT_UI = "ijk-pixel-format-ui";
    public static final String KEY_IJK_CODEC_PROFILE_LEVEL_UI = "ijk-profile-level-ui";
    public static final String KEY_IJK_FRAME_RATE_UI = "ijk-frame-rate-ui";
    public static final String KEY_IJK_RESOLUTION_UI = "ijk-resolution-ui";
    public static final String KEY_IJK_SAMPLE_RATE_UI = "ijk-sample-rate-ui";
    public static final Map<String, Formatter> sFormatterMap = new HashMap();
    public final IjkMediaMeta.IjkStreamMeta mMediaFormat;

    public IjkMediaFormat(IjkMediaMeta.IjkStreamMeta ijkStreamMeta) {
        sFormatterMap.put((Object)KEY_IJK_CODEC_LONG_NAME_UI, (Object)new Formatter(){

            public String doFormat(IjkMediaFormat ijkMediaFormat) {
                return IjkMediaFormat.this.mMediaFormat.getString("codec_long_name");
            }
        });
        sFormatterMap.put((Object)KEY_IJK_CODEC_NAME_UI, (Object)new Formatter(){

            public String doFormat(IjkMediaFormat ijkMediaFormat) {
                return IjkMediaFormat.this.mMediaFormat.getString("codec_name");
            }
        });
        sFormatterMap.put((Object)KEY_IJK_BIT_RATE_UI, (Object)new Formatter(){

            public String doFormat(IjkMediaFormat ijkMediaFormat) {
                int n2 = ijkMediaFormat.getInteger("bitrate");
                if (n2 <= 0) {
                    return null;
                }
                if (n2 < 1000) {
                    Locale locale = Locale.US;
                    Object[] arrobject = new Object[]{n2};
                    return String.format((Locale)locale, (String)"%d bit/s", (Object[])arrobject);
                }
                Locale locale = Locale.US;
                Object[] arrobject = new Object[]{n2 / 1000};
                return String.format((Locale)locale, (String)"%d kb/s", (Object[])arrobject);
            }
        });
        sFormatterMap.put((Object)KEY_IJK_CODEC_PROFILE_LEVEL_UI, (Object)new Formatter(){

            public String doFormat(IjkMediaFormat ijkMediaFormat) {
                String string;
                switch (ijkMediaFormat.getInteger("codec_profile_id")) {
                    default: {
                        return null;
                    }
                    case 2292: {
                        string = "High 4:4:4 Intra";
                        break;
                    }
                    case 2170: {
                        string = "High 4:2:2 Intra";
                        break;
                    }
                    case 2158: {
                        string = "High 10 Intra";
                        break;
                    }
                    case 578: {
                        string = "Constrained Baseline";
                        break;
                    }
                    case 244: {
                        string = "High 4:4:4 Predictive";
                        break;
                    }
                    case 144: {
                        string = "High 4:4:4";
                        break;
                    }
                    case 122: {
                        string = "High 4:2:2";
                        break;
                    }
                    case 110: {
                        string = "High 10";
                        break;
                    }
                    case 100: {
                        string = "High";
                        break;
                    }
                    case 88: {
                        string = "Extended";
                        break;
                    }
                    case 77: {
                        string = "Main";
                        break;
                    }
                    case 66: {
                        string = "Baseline";
                        break;
                    }
                    case 44: {
                        string = "CAVLC 4:4:4";
                    }
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                String string2 = ijkMediaFormat.getString("codec_name");
                if (!TextUtils.isEmpty((CharSequence)string2) && string2.equalsIgnoreCase(IjkMediaFormat.CODEC_NAME_H264)) {
                    int n2 = ijkMediaFormat.getInteger("codec_level");
                    if (n2 < 10) {
                        return stringBuilder.toString();
                    }
                    stringBuilder.append(" Profile Level ");
                    stringBuilder.append(n2 / 10 % 10);
                    int n3 = n2 % 10;
                    if (n3 != 0) {
                        stringBuilder.append(".");
                        stringBuilder.append(n3);
                    }
                }
                return stringBuilder.toString();
            }
        });
        sFormatterMap.put((Object)KEY_IJK_CODEC_PIXEL_FORMAT_UI, (Object)new Formatter(){

            public String doFormat(IjkMediaFormat ijkMediaFormat) {
                return ijkMediaFormat.getString("codec_pixel_format");
            }
        });
        sFormatterMap.put((Object)KEY_IJK_RESOLUTION_UI, (Object)new Formatter(){

            public String doFormat(IjkMediaFormat ijkMediaFormat) {
                int n2 = ijkMediaFormat.getInteger("width");
                int n3 = ijkMediaFormat.getInteger("height");
                int n4 = ijkMediaFormat.getInteger("sar_num");
                int n5 = ijkMediaFormat.getInteger("sar_den");
                if (n2 > 0 && n3 > 0) {
                    if (n4 > 0 && n5 > 0) {
                        Locale locale = Locale.US;
                        Object[] arrobject = new Object[]{n2, n3, n4, n5};
                        return String.format((Locale)locale, (String)"%d x %d [SAR %d:%d]", (Object[])arrobject);
                    }
                    Locale locale = Locale.US;
                    Object[] arrobject = new Object[]{n2, n3};
                    return String.format((Locale)locale, (String)"%d x %d", (Object[])arrobject);
                }
                return null;
            }
        });
        sFormatterMap.put((Object)KEY_IJK_FRAME_RATE_UI, (Object)new Formatter(){

            public String doFormat(IjkMediaFormat ijkMediaFormat) {
                int n2 = ijkMediaFormat.getInteger("fps_num");
                int n3 = ijkMediaFormat.getInteger("fps_den");
                if (n2 > 0 && n3 > 0) {
                    return String.valueOf((float)((float)n2 / (float)n3));
                }
                return null;
            }
        });
        sFormatterMap.put((Object)KEY_IJK_SAMPLE_RATE_UI, (Object)new Formatter(){

            public String doFormat(IjkMediaFormat ijkMediaFormat) {
                int n2 = ijkMediaFormat.getInteger("sample_rate");
                if (n2 <= 0) {
                    return null;
                }
                Locale locale = Locale.US;
                Object[] arrobject = new Object[]{n2};
                return String.format((Locale)locale, (String)"%d Hz", (Object[])arrobject);
            }
        });
        sFormatterMap.put((Object)KEY_IJK_CHANNEL_UI, (Object)new Formatter(){

            public String doFormat(IjkMediaFormat ijkMediaFormat) {
                int n2 = ijkMediaFormat.getInteger("channel_layout");
                if (n2 <= 0) {
                    return null;
                }
                long l2 = n2;
                if (l2 == 4L) {
                    return "mono";
                }
                if (l2 == 3L) {
                    return "stereo";
                }
                Locale locale = Locale.US;
                Object[] arrobject = new Object[]{n2};
                return String.format((Locale)locale, (String)"%x", (Object[])arrobject);
            }
        });
        this.mMediaFormat = ijkStreamMeta;
    }

    @TargetApi(value=16)
    public int getInteger(String string) {
        IjkMediaMeta.IjkStreamMeta ijkStreamMeta = this.mMediaFormat;
        if (ijkStreamMeta == null) {
            return 0;
        }
        return ijkStreamMeta.getInt(string);
    }

    public String getString(String string) {
        if (this.mMediaFormat == null) {
            return null;
        }
        if (sFormatterMap.containsKey((Object)string)) {
            return (sFormatterMap.get((Object)string)).format((IjkMediaFormat)this);
        }
        return this.mMediaFormat.getString(string);
    }

}

