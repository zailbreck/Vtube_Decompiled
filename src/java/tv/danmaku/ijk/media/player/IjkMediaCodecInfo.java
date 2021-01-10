/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.media.MediaCodecInfo
 *  android.media.MediaCodecInfo$CodecCapabilities
 *  android.media.MediaCodecInfo$CodecProfileLevel
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Comparator
 *  java.util.Locale
 *  java.util.Map
 *  java.util.TreeMap
 */
package tv.danmaku.ijk.media.player;

import android.annotation.TargetApi;
import android.media.MediaCodecInfo;
import android.os.Build;
import java.util.Comparator;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import tv.danmaku.ijk.media.player.pragma.DebugLog;

public class IjkMediaCodecInfo {
    public static final int RANK_ACCEPTABLE = 700;
    public static final int RANK_LAST_CHANCE = 600;
    public static final int RANK_MAX = 1000;
    public static final int RANK_NON_STANDARD = 100;
    public static final int RANK_NO_SENSE = 0;
    public static final int RANK_SECURE = 300;
    public static final int RANK_SOFTWARE = 200;
    public static final int RANK_TESTED = 800;
    public static final String TAG = "IjkMediaCodecInfo";
    public static Map<String, Integer> sKnownCodecList;
    public MediaCodecInfo mCodecInfo;
    public String mMimeType;
    public int mRank = 0;

    public static Map<String, Integer> getKnownCodecList() {
        Class<IjkMediaCodecInfo> class_ = IjkMediaCodecInfo.class;
        synchronized (IjkMediaCodecInfo.class) {
            TreeMap treeMap;
            block4 : {
                Map<String, Integer> map = sKnownCodecList;
                if (map == null) break block4;
                return map;
            }
            sKnownCodecList = treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            treeMap.put((Object)"OMX.Nvidia.h264.decode", (Object)800);
            sKnownCodecList.put((Object)"OMX.Nvidia.h264.decode.secure", (Object)300);
            sKnownCodecList.put((Object)"OMX.Intel.hw_vd.h264", (Object)801);
            sKnownCodecList.put((Object)"OMX.Intel.VideoDecoder.AVC", (Object)800);
            sKnownCodecList.put((Object)"OMX.qcom.video.decoder.avc", (Object)800);
            sKnownCodecList.put((Object)"OMX.ittiam.video.decoder.avc", (Object)0);
            sKnownCodecList.put((Object)"OMX.SEC.avc.dec", (Object)800);
            sKnownCodecList.put((Object)"OMX.SEC.AVC.Decoder", (Object)799);
            sKnownCodecList.put((Object)"OMX.SEC.avcdec", (Object)798);
            sKnownCodecList.put((Object)"OMX.SEC.avc.sw.dec", (Object)200);
            sKnownCodecList.put((Object)"OMX.Exynos.avc.dec", (Object)800);
            sKnownCodecList.put((Object)"OMX.Exynos.AVC.Decoder", (Object)799);
            sKnownCodecList.put((Object)"OMX.k3.video.decoder.avc", (Object)800);
            sKnownCodecList.put((Object)"OMX.IMG.MSVDX.Decoder.AVC", (Object)800);
            sKnownCodecList.put((Object)"OMX.TI.DUCATI1.VIDEO.DECODER", (Object)800);
            sKnownCodecList.put((Object)"OMX.rk.video_decoder.avc", (Object)800);
            sKnownCodecList.put((Object)"OMX.amlogic.avc.decoder.awesome", (Object)800);
            sKnownCodecList.put((Object)"OMX.MARVELL.VIDEO.HW.CODA7542DECODER", (Object)800);
            sKnownCodecList.put((Object)"OMX.MARVELL.VIDEO.H264DECODER", (Object)200);
            sKnownCodecList.remove((Object)"OMX.Action.Video.Decoder");
            sKnownCodecList.remove((Object)"OMX.allwinner.video.decoder.avc");
            sKnownCodecList.remove((Object)"OMX.BRCM.vc4.decoder.avc");
            sKnownCodecList.remove((Object)"OMX.brcm.video.h264.hw.decoder");
            sKnownCodecList.remove((Object)"OMX.brcm.video.h264.decoder");
            sKnownCodecList.remove((Object)"OMX.cosmo.video.decoder.avc");
            sKnownCodecList.remove((Object)"OMX.duos.h264.decoder");
            sKnownCodecList.remove((Object)"OMX.hantro.81x0.video.decoder");
            sKnownCodecList.remove((Object)"OMX.hantro.G1.video.decoder");
            sKnownCodecList.remove((Object)"OMX.hisi.video.decoder");
            sKnownCodecList.remove((Object)"OMX.LG.decoder.video.avc");
            sKnownCodecList.remove((Object)"OMX.MS.AVC.Decoder");
            sKnownCodecList.remove((Object)"OMX.RENESAS.VIDEO.DECODER.H264");
            sKnownCodecList.remove((Object)"OMX.RTK.video.decoder");
            sKnownCodecList.remove((Object)"OMX.sprd.h264.decoder");
            sKnownCodecList.remove((Object)"OMX.ST.VFM.H264Dec");
            sKnownCodecList.remove((Object)"OMX.vpu.video_decoder.avc");
            sKnownCodecList.remove((Object)"OMX.WMT.decoder.avc");
            sKnownCodecList.remove((Object)"OMX.bluestacks.hw.decoder");
            sKnownCodecList.put((Object)"OMX.google.h264.decoder", (Object)200);
            sKnownCodecList.put((Object)"OMX.google.h264.lc.decoder", (Object)200);
            sKnownCodecList.put((Object)"OMX.k3.ffmpeg.decoder", (Object)200);
            sKnownCodecList.put((Object)"OMX.ffmpeg.video.decoder", (Object)200);
            sKnownCodecList.put((Object)"OMX.sprd.soft.h264.decoder", (Object)200);
            Map<String, Integer> map = sKnownCodecList;
            // ** MonitorExit[var47] (shouldn't be in output)
            return map;
        }
    }

    public static String getLevelName(int n2) {
        if (n2 != 1) {
            if (n2 != 2) {
                switch (n2) {
                    default: {
                        return "0";
                    }
                    case 65536: {
                        return "52";
                    }
                    case 32768: {
                        return "51";
                    }
                    case 16384: {
                        return "5";
                    }
                    case 8192: {
                        return "42";
                    }
                    case 4096: {
                        return "41";
                    }
                    case 2048: {
                        return "4";
                    }
                    case 1024: {
                        return "32";
                    }
                    case 512: {
                        return "31";
                    }
                    case 256: {
                        return "3";
                    }
                    case 128: {
                        return "22";
                    }
                    case 64: {
                        return "21";
                    }
                    case 32: {
                        return "2";
                    }
                    case 16: {
                        return "13";
                    }
                    case 8: {
                        return "12";
                    }
                    case 4: 
                }
                return "11";
            }
            return "1b";
        }
        return "1";
    }

    public static String getProfileLevelName(int n2, int n3) {
        Locale locale = Locale.US;
        Object[] arrobject = new Object[]{IjkMediaCodecInfo.getProfileName(n2), IjkMediaCodecInfo.getLevelName(n3), n2, n3};
        return String.format((Locale)locale, (String)" %s Profile Level %s (%d,%d)", (Object[])arrobject);
    }

    public static String getProfileName(int n2) {
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 4) {
                    if (n2 != 8) {
                        if (n2 != 16) {
                            if (n2 != 32) {
                                if (n2 != 64) {
                                    return "Unknown";
                                }
                                return "High444";
                            }
                            return "High422";
                        }
                        return "High10";
                    }
                    return "High";
                }
                return "Extends";
            }
            return "Main";
        }
        return "Baseline";
    }

    /*
     * Exception decompiling
     */
    @TargetApi(value=16)
    public static IjkMediaCodecInfo setupCandidate(MediaCodecInfo var0, String var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl92.1 : SIPUSH : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1133)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:607)
        // java.lang.Thread.run(Thread.java:761)
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @TargetApi(value=16)
    public void dumpProfileLevels(String string2) {
        int n2;
        int n3;
        block6 : {
            MediaCodecInfo.CodecProfileLevel[] arrcodecProfileLevel;
            int n4;
            block5 : {
                block4 : {
                    if (Build.VERSION.SDK_INT < 16) {
                        return;
                    }
                    try {
                        MediaCodecInfo.CodecCapabilities codecCapabilities = this.mCodecInfo.getCapabilitiesForType(string2);
                        if (codecCapabilities == null || codecCapabilities.profileLevels == null) break block4;
                        arrcodecProfileLevel = codecCapabilities.profileLevels;
                        n4 = arrcodecProfileLevel.length;
                        n2 = 0;
                        n3 = 0;
                        break block5;
                    }
                    catch (Throwable throwable) {
                        DebugLog.i(TAG, "profile-level: exception");
                        return;
                    }
                }
                n2 = 0;
                n3 = 0;
                break block6;
            }
            for (int i2 = 0; i2 < n4; ++i2) {
                MediaCodecInfo.CodecProfileLevel codecProfileLevel = arrcodecProfileLevel[i2];
                if (codecProfileLevel == null) continue;
                n2 = Math.max((int)n2, (int)codecProfileLevel.profile);
                n3 = Math.max((int)n3, (int)codecProfileLevel.level);
            }
        }
        Locale locale = Locale.US;
        Object[] arrobject = new Object[]{IjkMediaCodecInfo.getProfileLevelName(n2, n3)};
        DebugLog.i(TAG, String.format((Locale)locale, (String)"%s", (Object[])arrobject));
    }
}

