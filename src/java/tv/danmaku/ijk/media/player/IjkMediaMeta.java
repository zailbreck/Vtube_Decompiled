/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Locale
 */
package tv.danmaku.ijk.media.player;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Locale;

public class IjkMediaMeta {
    public static final long AV_CH_BACK_CENTER = 256L;
    public static final long AV_CH_BACK_LEFT = 16L;
    public static final long AV_CH_BACK_RIGHT = 32L;
    public static final long AV_CH_FRONT_CENTER = 4L;
    public static final long AV_CH_FRONT_LEFT = 1L;
    public static final long AV_CH_FRONT_LEFT_OF_CENTER = 64L;
    public static final long AV_CH_FRONT_RIGHT = 2L;
    public static final long AV_CH_FRONT_RIGHT_OF_CENTER = 128L;
    public static final long AV_CH_LAYOUT_2POINT1 = 11L;
    public static final long AV_CH_LAYOUT_2_1 = 259L;
    public static final long AV_CH_LAYOUT_2_2 = 1539L;
    public static final long AV_CH_LAYOUT_3POINT1 = 15L;
    public static final long AV_CH_LAYOUT_4POINT0 = 263L;
    public static final long AV_CH_LAYOUT_4POINT1 = 271L;
    public static final long AV_CH_LAYOUT_5POINT0 = 1543L;
    public static final long AV_CH_LAYOUT_5POINT0_BACK = 55L;
    public static final long AV_CH_LAYOUT_5POINT1 = 1551L;
    public static final long AV_CH_LAYOUT_5POINT1_BACK = 63L;
    public static final long AV_CH_LAYOUT_6POINT0 = 1799L;
    public static final long AV_CH_LAYOUT_6POINT0_FRONT = 1731L;
    public static final long AV_CH_LAYOUT_6POINT1 = 1807L;
    public static final long AV_CH_LAYOUT_6POINT1_BACK = 319L;
    public static final long AV_CH_LAYOUT_6POINT1_FRONT = 1739L;
    public static final long AV_CH_LAYOUT_7POINT0 = 1591L;
    public static final long AV_CH_LAYOUT_7POINT0_FRONT = 1735L;
    public static final long AV_CH_LAYOUT_7POINT1 = 1599L;
    public static final long AV_CH_LAYOUT_7POINT1_WIDE = 1743L;
    public static final long AV_CH_LAYOUT_7POINT1_WIDE_BACK = 255L;
    public static final long AV_CH_LAYOUT_HEXAGONAL = 311L;
    public static final long AV_CH_LAYOUT_MONO = 4L;
    public static final long AV_CH_LAYOUT_OCTAGONAL = 1847L;
    public static final long AV_CH_LAYOUT_QUAD = 51L;
    public static final long AV_CH_LAYOUT_STEREO = 3L;
    public static final long AV_CH_LAYOUT_STEREO_DOWNMIX = 0x60000000L;
    public static final long AV_CH_LAYOUT_SURROUND = 7L;
    public static final long AV_CH_LOW_FREQUENCY = 8L;
    public static final long AV_CH_LOW_FREQUENCY_2 = 0x800000000L;
    public static final long AV_CH_SIDE_LEFT = 512L;
    public static final long AV_CH_SIDE_RIGHT = 1024L;
    public static final long AV_CH_STEREO_LEFT = 0x20000000L;
    public static final long AV_CH_STEREO_RIGHT = 0x40000000L;
    public static final long AV_CH_SURROUND_DIRECT_LEFT = 0x200000000L;
    public static final long AV_CH_SURROUND_DIRECT_RIGHT = 0x400000000L;
    public static final long AV_CH_TOP_BACK_CENTER = 65536L;
    public static final long AV_CH_TOP_BACK_LEFT = 32768L;
    public static final long AV_CH_TOP_BACK_RIGHT = 131072L;
    public static final long AV_CH_TOP_CENTER = 2048L;
    public static final long AV_CH_TOP_FRONT_CENTER = 8192L;
    public static final long AV_CH_TOP_FRONT_LEFT = 4096L;
    public static final long AV_CH_TOP_FRONT_RIGHT = 16384L;
    public static final long AV_CH_WIDE_LEFT = 0x80000000L;
    public static final long AV_CH_WIDE_RIGHT = 0x100000000L;
    public static final int FF_PROFILE_H264_BASELINE = 66;
    public static final int FF_PROFILE_H264_CAVLC_444 = 44;
    public static final int FF_PROFILE_H264_CONSTRAINED = 512;
    public static final int FF_PROFILE_H264_CONSTRAINED_BASELINE = 578;
    public static final int FF_PROFILE_H264_EXTENDED = 88;
    public static final int FF_PROFILE_H264_HIGH = 100;
    public static final int FF_PROFILE_H264_HIGH_10 = 110;
    public static final int FF_PROFILE_H264_HIGH_10_INTRA = 2158;
    public static final int FF_PROFILE_H264_HIGH_422 = 122;
    public static final int FF_PROFILE_H264_HIGH_422_INTRA = 2170;
    public static final int FF_PROFILE_H264_HIGH_444 = 144;
    public static final int FF_PROFILE_H264_HIGH_444_INTRA = 2292;
    public static final int FF_PROFILE_H264_HIGH_444_PREDICTIVE = 244;
    public static final int FF_PROFILE_H264_INTRA = 2048;
    public static final int FF_PROFILE_H264_MAIN = 77;
    public static final String IJKM_KEY_AUDIO_STREAM = "audio";
    public static final String IJKM_KEY_BITRATE = "bitrate";
    public static final String IJKM_KEY_CHANNEL_LAYOUT = "channel_layout";
    public static final String IJKM_KEY_CODEC_LEVEL = "codec_level";
    public static final String IJKM_KEY_CODEC_LONG_NAME = "codec_long_name";
    public static final String IJKM_KEY_CODEC_NAME = "codec_name";
    public static final String IJKM_KEY_CODEC_PIXEL_FORMAT = "codec_pixel_format";
    public static final String IJKM_KEY_CODEC_PROFILE = "codec_profile";
    public static final String IJKM_KEY_CODEC_PROFILE_ID = "codec_profile_id";
    public static final String IJKM_KEY_DURATION_US = "duration_us";
    public static final String IJKM_KEY_FORMAT = "format";
    public static final String IJKM_KEY_FPS_DEN = "fps_den";
    public static final String IJKM_KEY_FPS_NUM = "fps_num";
    public static final String IJKM_KEY_HEIGHT = "height";
    public static final String IJKM_KEY_LANGUAGE = "language";
    public static final String IJKM_KEY_SAMPLE_RATE = "sample_rate";
    public static final String IJKM_KEY_SAR_DEN = "sar_den";
    public static final String IJKM_KEY_SAR_NUM = "sar_num";
    public static final String IJKM_KEY_START_US = "start_us";
    public static final String IJKM_KEY_STREAMS = "streams";
    public static final String IJKM_KEY_TBR_DEN = "tbr_den";
    public static final String IJKM_KEY_TBR_NUM = "tbr_num";
    public static final String IJKM_KEY_TIMEDTEXT_STREAM = "timedtext";
    public static final String IJKM_KEY_TYPE = "type";
    public static final String IJKM_KEY_VIDEO_STREAM = "video";
    public static final String IJKM_KEY_WIDTH = "width";
    public static final String IJKM_VAL_TYPE__AUDIO = "audio";
    public static final String IJKM_VAL_TYPE__TIMEDTEXT = "timedtext";
    public static final String IJKM_VAL_TYPE__UNKNOWN = "unknown";
    public static final String IJKM_VAL_TYPE__VIDEO = "video";
    public IjkStreamMeta mAudioStream;
    public long mBitrate;
    public long mDurationUS;
    public String mFormat;
    public Bundle mMediaMeta;
    public long mStartUS;
    public final ArrayList<IjkStreamMeta> mStreams = new ArrayList();
    public IjkStreamMeta mVideoStream;

    public static IjkMediaMeta parse(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        IjkMediaMeta ijkMediaMeta = new IjkMediaMeta();
        ijkMediaMeta.mMediaMeta = bundle;
        ijkMediaMeta.mFormat = ijkMediaMeta.getString(IJKM_KEY_FORMAT);
        ijkMediaMeta.mDurationUS = ijkMediaMeta.getLong(IJKM_KEY_DURATION_US);
        ijkMediaMeta.mStartUS = ijkMediaMeta.getLong(IJKM_KEY_START_US);
        ijkMediaMeta.mBitrate = ijkMediaMeta.getLong(IJKM_KEY_BITRATE);
        int n2 = -1;
        int n3 = ijkMediaMeta.getInt("video", n2);
        int n4 = ijkMediaMeta.getInt("audio", n2);
        ijkMediaMeta.getInt("timedtext", n2);
        ArrayList<Bundle> arrayList = ijkMediaMeta.getParcelableArrayList(IJKM_KEY_STREAMS);
        if (arrayList == null) {
            return ijkMediaMeta;
        }
        for (Bundle bundle2 : arrayList) {
            ++n2;
            if (bundle2 == null) continue;
            IjkStreamMeta ijkStreamMeta = new IjkStreamMeta(n2);
            ijkStreamMeta.mMeta = bundle2;
            ijkStreamMeta.mType = ijkStreamMeta.getString(IJKM_KEY_TYPE);
            ijkStreamMeta.mLanguage = ijkStreamMeta.getString(IJKM_KEY_LANGUAGE);
            if (TextUtils.isEmpty((CharSequence)ijkStreamMeta.mType)) continue;
            ijkStreamMeta.mCodecName = ijkStreamMeta.getString(IJKM_KEY_CODEC_NAME);
            ijkStreamMeta.mCodecProfile = ijkStreamMeta.getString(IJKM_KEY_CODEC_PROFILE);
            ijkStreamMeta.mCodecLongName = ijkStreamMeta.getString(IJKM_KEY_CODEC_LONG_NAME);
            ijkStreamMeta.mBitrate = ijkStreamMeta.getInt(IJKM_KEY_BITRATE);
            if (ijkStreamMeta.mType.equalsIgnoreCase("video")) {
                ijkStreamMeta.mWidth = ijkStreamMeta.getInt(IJKM_KEY_WIDTH);
                ijkStreamMeta.mHeight = ijkStreamMeta.getInt(IJKM_KEY_HEIGHT);
                ijkStreamMeta.mFpsNum = ijkStreamMeta.getInt(IJKM_KEY_FPS_NUM);
                ijkStreamMeta.mFpsDen = ijkStreamMeta.getInt(IJKM_KEY_FPS_DEN);
                ijkStreamMeta.mTbrNum = ijkStreamMeta.getInt(IJKM_KEY_TBR_NUM);
                ijkStreamMeta.mTbrDen = ijkStreamMeta.getInt(IJKM_KEY_TBR_DEN);
                ijkStreamMeta.mSarNum = ijkStreamMeta.getInt(IJKM_KEY_SAR_NUM);
                ijkStreamMeta.mSarDen = ijkStreamMeta.getInt(IJKM_KEY_SAR_DEN);
                if (n3 == n2) {
                    ijkMediaMeta.mVideoStream = ijkStreamMeta;
                }
            } else if (ijkStreamMeta.mType.equalsIgnoreCase("audio")) {
                ijkStreamMeta.mSampleRate = ijkStreamMeta.getInt(IJKM_KEY_SAMPLE_RATE);
                ijkStreamMeta.mChannelLayout = ijkStreamMeta.getLong(IJKM_KEY_CHANNEL_LAYOUT);
                if (n4 == n2) {
                    ijkMediaMeta.mAudioStream = ijkStreamMeta;
                }
            }
            ijkMediaMeta.mStreams.add((Object)ijkStreamMeta);
        }
        return ijkMediaMeta;
    }

    public String getDurationInline() {
        long l2 = (5000L + this.mDurationUS) / 1000000L;
        long l3 = l2 / 60L;
        long l4 = l2 % 60L;
        long l5 = l3 / 60L;
        long l6 = l3 % 60L;
        Locale locale = Locale.US;
        Object[] arrobject = new Object[]{l5, l6, l4};
        return String.format((Locale)locale, (String)"%02d:%02d:%02d", (Object[])arrobject);
    }

    public int getInt(String string2) {
        return this.getInt(string2, 0);
    }

    public int getInt(String string2, int n2) {
        String string3 = this.getString(string2);
        if (TextUtils.isEmpty((CharSequence)string3)) {
            return n2;
        }
        try {
            int n3 = Integer.parseInt((String)string3);
            return n3;
        }
        catch (NumberFormatException numberFormatException) {
            return n2;
        }
    }

    public long getLong(String string2) {
        return this.getLong(string2, 0L);
    }

    public long getLong(String string2, long l2) {
        String string3 = this.getString(string2);
        if (TextUtils.isEmpty((CharSequence)string3)) {
            return l2;
        }
        try {
            long l3 = Long.parseLong((String)string3);
            return l3;
        }
        catch (NumberFormatException numberFormatException) {
            return l2;
        }
    }

    public ArrayList<Bundle> getParcelableArrayList(String string2) {
        return this.mMediaMeta.getParcelableArrayList(string2);
    }

    public String getString(String string2) {
        return this.mMediaMeta.getString(string2);
    }

    public static class IjkStreamMeta {
        public long mBitrate;
        public long mChannelLayout;
        public String mCodecLongName;
        public String mCodecName;
        public String mCodecProfile;
        public int mFpsDen;
        public int mFpsNum;
        public int mHeight;
        public final int mIndex;
        public String mLanguage;
        public Bundle mMeta;
        public int mSampleRate;
        public int mSarDen;
        public int mSarNum;
        public int mTbrDen;
        public int mTbrNum;
        public String mType;
        public int mWidth;

        public IjkStreamMeta(int n2) {
            this.mIndex = n2;
        }

        public String getBitrateInline() {
            long l2 = this.mBitrate;
            if (l2 <= 0L) {
                return "N/A";
            }
            if (l2 < 1000L) {
                Locale locale = Locale.US;
                Object[] arrobject = new Object[]{l2};
                return String.format((Locale)locale, (String)"%d bit/s", (Object[])arrobject);
            }
            Locale locale = Locale.US;
            Object[] arrobject = new Object[]{l2 / 1000L};
            return String.format((Locale)locale, (String)"%d kb/s", (Object[])arrobject);
        }

        public String getChannelLayoutInline() {
            long l2 = this.mChannelLayout;
            if (l2 <= 0L) {
                return "N/A";
            }
            if (l2 == 4L) {
                return "mono";
            }
            if (l2 == 3L) {
                return "stereo";
            }
            Locale locale = Locale.US;
            Object[] arrobject = new Object[]{l2};
            return String.format((Locale)locale, (String)"%x", (Object[])arrobject);
        }

        public String getCodecLongNameInline() {
            if (!TextUtils.isEmpty((CharSequence)this.mCodecLongName)) {
                return this.mCodecLongName;
            }
            if (!TextUtils.isEmpty((CharSequence)this.mCodecName)) {
                return this.mCodecName;
            }
            return "N/A";
        }

        public String getCodecShortNameInline() {
            if (!TextUtils.isEmpty((CharSequence)this.mCodecName)) {
                return this.mCodecName;
            }
            return "N/A";
        }

        public String getFpsInline() {
            int n2;
            int n3 = this.mFpsNum;
            if (n3 > 0 && (n2 = this.mFpsDen) > 0) {
                return String.valueOf((float)((float)n3 / (float)n2));
            }
            return "N/A";
        }

        public int getInt(String string2) {
            return this.getInt(string2, 0);
        }

        public int getInt(String string2, int n2) {
            String string3 = this.getString(string2);
            if (TextUtils.isEmpty((CharSequence)string3)) {
                return n2;
            }
            try {
                int n3 = Integer.parseInt((String)string3);
                return n3;
            }
            catch (NumberFormatException numberFormatException) {
                return n2;
            }
        }

        public long getLong(String string2) {
            return this.getLong(string2, 0L);
        }

        public long getLong(String string2, long l2) {
            String string3 = this.getString(string2);
            if (TextUtils.isEmpty((CharSequence)string3)) {
                return l2;
            }
            try {
                long l3 = Long.parseLong((String)string3);
                return l3;
            }
            catch (NumberFormatException numberFormatException) {
                return l2;
            }
        }

        public String getResolutionInline() {
            int n2 = this.mWidth;
            if (n2 > 0 && this.mHeight > 0) {
                if (this.mSarNum > 0 && this.mSarDen > 0) {
                    Locale locale = Locale.US;
                    Object[] arrobject = new Object[]{n2, this.mHeight, this.mSarNum, this.mSarDen};
                    return String.format((Locale)locale, (String)"%d x %d [SAR %d:%d]", (Object[])arrobject);
                }
                Locale locale = Locale.US;
                Object[] arrobject = new Object[]{this.mWidth, this.mHeight};
                return String.format((Locale)locale, (String)"%d x %d", (Object[])arrobject);
            }
            return "N/A";
        }

        public String getSampleRateInline() {
            int n2 = this.mSampleRate;
            if (n2 <= 0) {
                return "N/A";
            }
            Locale locale = Locale.US;
            Object[] arrobject = new Object[]{n2};
            return String.format((Locale)locale, (String)"%d Hz", (Object[])arrobject);
        }

        public String getString(String string2) {
            return this.mMeta.getString(string2);
        }
    }

}

