/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.Cursor
 *  android.database.SQLException
 *  android.database.sqlite.SQLiteDatabase
 *  android.text.TextUtils
 *  f.f.a.e.c.a
 *  f.f.a.e.d.b
 *  f.f.a.e.d.g
 *  f.f.a.e.e.a
 *  f.f.a.e.e.a$a
 *  f.f.a.e.e.a$b
 *  f.f.a.e.f.h
 *  f.f.a.f.a
 *  f.f.a.f.c
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  org.json.JSONArray
 */
package f.f.a.e.d;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import f.f.a.e.d.b;
import f.f.a.e.d.g;
import f.f.a.e.e.a;
import f.f.a.e.f.h;
import f.f.a.f.a;
import f.f.a.f.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

public class e
extends b<f.f.a.m.a> {
    private static final String c = "f.f.a.e.d.e";
    private static e d;

    protected e(g g2) {
        super(g2);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private long a(f.f.a.e.e.a a2, String string, String string2, int n2) {
        block12 : {
            void var15_5 = this;
            // MONITORENTER : var15_5
            if (a2 == null) {
                // MONITOREXIT : var15_5
                return 0L;
            }
            SQLiteDatabase sQLiteDatabase = this.b();
            if (sQLiteDatabase != null) break block12;
            // MONITOREXIT : var15_5
            return -1L;
        }
        ContentValues contentValues = new ContentValues();
        if (a2.H0() != null && a2.H0().size() > 0) {
            JSONArray jSONArray = new JSONArray();
            Iterator iterator = a2.H0().iterator();
            while (iterator.hasNext()) {
                jSONArray.put((Object)((String)iterator.next()));
            }
            contentValues.put("pv_urls", jSONArray.toString());
        }
        contentValues.put("id", a2.e());
        if (TextUtils.isEmpty((CharSequence)string)) {
            string = "";
        }
        contentValues.put("placement_id", string);
        contentValues.put("unitid", string2);
        contentValues.put("tab", Integer.valueOf((int)a2.V0()));
        contentValues.put("package_name", a2.g());
        contentValues.put("app_name", a2.c());
        contentValues.put("app_desc", a2.b());
        contentValues.put("app_size", a2.i());
        contentValues.put("image_size", a2.W());
        contentValues.put("icon_url", a2.d());
        contentValues.put("image_url", a2.f());
        contentValues.put("impression_url", a2.Y());
        contentValues.put("notice_url", a2.u0());
        contentValues.put("download_url", a2.F());
        contentValues.put("wtick", Integer.valueOf((int)a2.g1()));
        contentValues.put("deeplink_url", a2.I());
        contentValues.put("only_impression", a2.B0());
        contentValues.put("ts", Long.valueOf((long)a2.j()));
        contentValues.put("template", Integer.valueOf((int)a2.W0()));
        contentValues.put("click_mode", a2.G());
        contentValues.put("landing_type", a2.k0());
        contentValues.put("link_type", Integer.valueOf((int)a2.l0()));
        contentValues.put("star", Double.valueOf((double)a2.h()));
        contentValues.put("cti", Integer.valueOf((int)a2.D()));
        contentValues.put("cpti", Integer.valueOf((int)a2.G0()));
        contentValues.put("preclick", Boolean.valueOf((boolean)a2.n1()));
        contentValues.put("level", Integer.valueOf((int)a2.A()));
        contentValues.put("adSource", Integer.valueOf((int)a2.k()));
        contentValues.put("ad_call", a2.a());
        contentValues.put("fc_a", Integer.valueOf((int)a2.M()));
        contentValues.put("fc_b", Integer.valueOf((int)a2.N()));
        contentValues.put("ad_url_list", a2.p());
        contentValues.put("video_url", a2.d1());
        contentValues.put("video_size", Integer.valueOf((int)a2.c1()));
        contentValues.put("video_length", Integer.valueOf((int)a2.Z0()));
        contentValues.put("video_resolution", a2.b1());
        contentValues.put("endcard_click_result", Integer.valueOf((int)a2.K()));
        contentValues.put("watch_mile", Integer.valueOf((int)a2.f1()));
        contentValues.put("advImp", a2.s());
        contentValues.put("bty", Integer.valueOf((int)a2.z()));
        contentValues.put("t_imp", Integer.valueOf((int)a2.T0()));
        contentValues.put("guidelines", a2.R());
        contentValues.put("offer_type", Integer.valueOf((int)a2.z0()));
        contentValues.put("html_url", a2.T());
        contentValues.put("end_screen_url", a2.J());
        contentValues.put("reward_amount", Integer.valueOf((int)a2.O0()));
        contentValues.put("reward_name", a2.P0());
        contentValues.put("reward_play_status", Integer.valueOf((int)a2.Q0()));
        contentValues.put("adv_id", a2.r());
        contentValues.put("ttc_ct2", Integer.valueOf((int)(1000 * a2.X0())));
        contentValues.put("ttc_type", Integer.valueOf((int)a2.Y0()));
        contentValues.put("retarget", Integer.valueOf((int)a2.N0()));
        contentValues.put("native_ad_tracking", a2.t0());
        contentValues.put("playable_ads_without_video", Integer.valueOf((int)a2.D0()));
        contentValues.put("endcard_url", a2.i1());
        contentValues.put("video_end_type", Integer.valueOf((int)a2.e1()));
        contentValues.put("loopback", a2.o0());
        contentValues.put("md5_file", a2.a1());
        contentValues.put("nv_t2", Integer.valueOf((int)a2.w0()));
        contentValues.put("gif_url", a2.Q());
        if (a2.R0() != null) {
            contentValues.put("reward_teamplate", a2.R0().a());
        }
        contentValues.put("c_coi", Integer.valueOf((int)a2.E()));
        contentValues.put("c_ua", Integer.valueOf((int)a2.h1()));
        contentValues.put("imp_ua", Integer.valueOf((int)a2.X()));
        contentValues.put("jm_pd", Integer.valueOf((int)a2.e0()));
        contentValues.put("is_deleted", Integer.valueOf((int)a2.c0()));
        contentValues.put("is_click", Integer.valueOf((int)a2.b0()));
        contentValues.put("is_add_sucesful", Integer.valueOf((int)a2.a0()));
        contentValues.put("short_ctime", String.valueOf((long)System.currentTimeMillis()));
        contentValues.put("ia_icon", a2.g0());
        contentValues.put("ia_url", a2.j0());
        contentValues.put("ia_rst", Integer.valueOf((int)a2.i0()));
        contentValues.put("ia_ori", Integer.valueOf((int)a2.h0()));
        contentValues.put("ad_type", Integer.valueOf((int)a2.m()));
        contentValues.put("ia_ext1", a2.U());
        contentValues.put("ia_ext2", a2.V());
        contentValues.put("is_download_zip", Integer.valueOf((int)a2.d0()));
        contentValues.put("ia_cache", a2.Z());
        contentValues.put("gh_id", a2.O());
        contentValues.put("gh_path", a2.P());
        contentValues.put("bind_id", a2.y());
        contentValues.put("oc_time", Integer.valueOf((int)a2.x0()));
        contentValues.put("oc_type", Integer.valueOf((int)a2.y0()));
        contentValues.put("t_list", a2.U0());
        a.a a3 = a2.q();
        if (a3 != null) {
            contentValues.put("adchoice", a3.c());
            contentValues.put("adchoice_size_height", Integer.valueOf((int)a3.b()));
            contentValues.put("adchoice_size_width", Integer.valueOf((int)a3.a()));
        }
        contentValues.put("plct", Long.valueOf((long)a2.E0()));
        contentValues.put("plctb", Long.valueOf((long)a2.F0()));
        contentValues.put("ad_html", a2.l());
        contentValues.put("ad_zip", a2.o());
        contentValues.put("banner_url", a2.w());
        contentValues.put("banner_html", a2.v());
        contentValues.put("creative_id", Long.valueOf((long)a2.H()));
        contentValues.put("is_bid_campaign", Boolean.valueOf((boolean)a2.k1()));
        contentValues.put("bid_token", a2.x());
        contentValues.put("mraid", a2.r0());
        contentValues.put("is_mraid_campaign", Boolean.valueOf((boolean)a2.m1()));
        contentValues.put("omid", a2.A0());
        contentValues.put("mof_tplid", Integer.valueOf((int)a2.q0()));
        contentValues.put("ready_rate", Integer.valueOf((int)a2.J0()));
        contentValues.put("ext_data", a2.L());
        contentValues.put("nscpt", Integer.valueOf((int)a2.v0()));
        contentValues.put("mof_template_url", a2.p0());
        contentValues.put("req_ext_data", a2.K0());
        contentValues.put("readyState", Integer.valueOf((int)a2.I0()));
        contentValues.put("request_id", a2.L0());
        contentValues.put("load_timeout", Integer.valueOf((int)a2.m0()));
        long l2 = this.b().insert("campaign", null, contentValues);
        // MONITOREXIT : var15_5
        return l2;
        catch (Exception exception) {
            h.d((String)"CampaignDao", (String)exception.getLocalizedMessage());
            // MONITOREXIT : var15_5
            return -1L;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static e a(g g2) {
        if (d != null) return d;
        Class<e> class_ = e.class;
        synchronized (e.class) {
            if (d != null) return d;
            d = new e(g2);
            // ** MonitorExit[var2_1] (shouldn't be in output)
            return d;
        }
    }

    /*
     * Exception decompiling
     */
    private f.f.a.e.e.a a(Cursor var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl46.1 : ALOAD_2 : trying to set 1 previously set to 0
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
     * Exception decompiling
     */
    private List<f.f.a.e.e.a> e(String var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [4[TRYBLOCK]], but top level block is 19[UNCONDITIONALDOLOOP]
        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:432)
        // org.benf.cfr.reader.b.a.a.j.d(Op04StructuredStatement.java:484)
        // org.benf.cfr.reader.b.a.a.i.a(Op03SimpleStatement.java:607)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:692)
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
    public final int a(String string, long l2) {
        void var12_3 = this;
        synchronized (var12_3) {
            block5 : {
                try {
                    boolean bl;
                    a a2 = c.b().a(f.f.a.e.c.a.i().f());
                    if (a2 == null) {
                        a2 = c.b().a();
                    }
                    long l3 = 1000L * a2.d();
                    this.a(l3, string);
                    List<f.f.a.e.e.a> list = this.a(string, 0, 0, 1, false);
                    if (list == null) return -1;
                    if (list.isEmpty()) break block5;
                    Iterator iterator = list.iterator();
                    do {
                        if (!iterator.hasNext()) return 1;
                    } while (bl = ((f.f.a.e.e.a)iterator.next()).a(l2, l3));
                }
                catch (Exception exception) {
                    return 0;
                }
                return 0;
            }
            return -1;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final long a(f.f.a.e.e.a a2, String string, int n2) {
        String string2;
        block14 : {
            void var33_4 = this;
            // MONITORENTER : var33_4
            if (a2 == null) {
                long l2 = 0L;
                // MONITOREXIT : var33_4
                return l2;
            }
            SQLiteDatabase sQLiteDatabase = this.b();
            if (sQLiteDatabase != null) break block14;
            // MONITOREXIT : var33_4
            return -1L;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("id", a2.e());
        if (a2.H0() != null && a2.H0().size() > 0) {
            JSONArray jSONArray = new JSONArray();
            Iterator iterator = a2.H0().iterator();
            while (iterator.hasNext()) {
                jSONArray.put((Object)((String)iterator.next()));
            }
            contentValues.put("pv_urls", jSONArray.toString());
        }
        contentValues.put("unitid", string);
        contentValues.put("request_id", a2.L0());
        contentValues.put("tab", Integer.valueOf((int)a2.V0()));
        contentValues.put("package_name", a2.g());
        contentValues.put("app_name", a2.c());
        contentValues.put("app_desc", a2.b());
        contentValues.put("app_size", a2.i());
        contentValues.put("image_size", a2.W());
        contentValues.put("icon_url", a2.d());
        contentValues.put("image_url", a2.f());
        contentValues.put("impression_url", a2.Y());
        contentValues.put("notice_url", a2.u0());
        contentValues.put("download_url", a2.F());
        contentValues.put("wtick", Integer.valueOf((int)a2.g1()));
        contentValues.put("deeplink_url", a2.I());
        contentValues.put("only_impression", a2.B0());
        contentValues.put("ts", Long.valueOf((long)a2.j()));
        contentValues.put("template", Integer.valueOf((int)a2.W0()));
        contentValues.put("click_mode", a2.G());
        contentValues.put("landing_type", a2.k0());
        contentValues.put("link_type", Integer.valueOf((int)a2.l0()));
        contentValues.put("star", Double.valueOf((double)a2.h()));
        contentValues.put("cti", Integer.valueOf((int)a2.D()));
        contentValues.put("cpti", Integer.valueOf((int)a2.G0()));
        contentValues.put("preclick", Boolean.valueOf((boolean)a2.n1()));
        contentValues.put("level", Integer.valueOf((int)a2.A()));
        contentValues.put("adSource", Integer.valueOf((int)a2.k()));
        contentValues.put("ad_call", a2.a());
        contentValues.put("fc_a", Integer.valueOf((int)a2.M()));
        contentValues.put("fc_b", Integer.valueOf((int)a2.N()));
        contentValues.put("ad_url_list", a2.p());
        contentValues.put("video_url", a2.d1());
        contentValues.put("video_size", Integer.valueOf((int)a2.c1()));
        contentValues.put("video_length", Integer.valueOf((int)a2.Z0()));
        contentValues.put("video_resolution", a2.b1());
        contentValues.put("endcard_click_result", Integer.valueOf((int)a2.K()));
        contentValues.put("watch_mile", Integer.valueOf((int)a2.f1()));
        contentValues.put("advImp", a2.s());
        contentValues.put("bty", Integer.valueOf((int)a2.z()));
        contentValues.put("t_imp", Integer.valueOf((int)a2.T0()));
        contentValues.put("guidelines", a2.R());
        contentValues.put("offer_type", Integer.valueOf((int)a2.z0()));
        contentValues.put("html_url", a2.T());
        contentValues.put("end_screen_url", a2.J());
        contentValues.put("reward_amount", Integer.valueOf((int)a2.O0()));
        contentValues.put("reward_name", a2.P0());
        contentValues.put("reward_play_status", Integer.valueOf((int)a2.Q0()));
        contentValues.put("adv_id", a2.r());
        contentValues.put("ttc_ct2", Integer.valueOf((int)(1000 * a2.X0())));
        contentValues.put("ttc_type", Integer.valueOf((int)a2.Y0()));
        contentValues.put("retarget", Integer.valueOf((int)a2.N0()));
        contentValues.put("native_ad_tracking", a2.t0());
        contentValues.put("playable_ads_without_video", Integer.valueOf((int)a2.D0()));
        contentValues.put("endcard_url", a2.i1());
        contentValues.put("video_end_type", Integer.valueOf((int)a2.e1()));
        contentValues.put("loopback", a2.o0());
        contentValues.put("md5_file", a2.a1());
        contentValues.put("nv_t2", Integer.valueOf((int)a2.w0()));
        contentValues.put("gif_url", a2.Q());
        if (a2.R0() != null) {
            contentValues.put("reward_teamplate", a2.R0().a());
        }
        contentValues.put("c_coi", Integer.valueOf((int)a2.E()));
        contentValues.put("c_ua", Integer.valueOf((int)a2.h1()));
        contentValues.put("imp_ua", Integer.valueOf((int)a2.X()));
        contentValues.put("jm_pd", Integer.valueOf((int)a2.e0()));
        contentValues.put("is_deleted", Integer.valueOf((int)a2.c0()));
        contentValues.put("is_click", Integer.valueOf((int)a2.b0()));
        contentValues.put("is_add_sucesful", Integer.valueOf((int)a2.a0()));
        contentValues.put("short_ctime", String.valueOf((long)System.currentTimeMillis()));
        contentValues.put("ia_icon", a2.g0());
        contentValues.put("ia_url", a2.j0());
        contentValues.put("ia_rst", Integer.valueOf((int)a2.i0()));
        contentValues.put("ia_ori", Integer.valueOf((int)a2.h0()));
        contentValues.put("ad_type", Integer.valueOf((int)a2.m()));
        contentValues.put("ia_ext1", a2.U());
        contentValues.put("ia_ext2", a2.V());
        contentValues.put("is_download_zip", Integer.valueOf((int)a2.d0()));
        contentValues.put("ia_cache", a2.Z());
        contentValues.put("gh_id", a2.O());
        contentValues.put("gh_path", a2.P());
        contentValues.put("bind_id", a2.y());
        contentValues.put("oc_time", Integer.valueOf((int)a2.x0()));
        contentValues.put("oc_type", Integer.valueOf((int)a2.y0()));
        contentValues.put("t_list", a2.U0());
        a.a a3 = a2.q();
        if (a3 != null) {
            contentValues.put("adchoice", a3.c());
            contentValues.put("adchoice_size_height", Integer.valueOf((int)a3.b()));
            contentValues.put("adchoice_size_width", Integer.valueOf((int)a3.a()));
        }
        contentValues.put("plct", Long.valueOf((long)a2.E0()));
        contentValues.put("plctb", Long.valueOf((long)a2.F0()));
        contentValues.put("ad_html", a2.l());
        contentValues.put("ad_zip", a2.o());
        contentValues.put("banner_url", a2.w());
        contentValues.put("banner_html", a2.v());
        contentValues.put("creative_id", Long.valueOf((long)a2.H()));
        contentValues.put("is_bid_campaign", Boolean.valueOf((boolean)a2.k1()));
        contentValues.put("bid_token", a2.x());
        contentValues.put("mraid", a2.r0());
        contentValues.put("is_mraid_campaign", Boolean.valueOf((boolean)a2.m1()));
        contentValues.put("omid", a2.A0());
        contentValues.put("mof_tplid", Integer.valueOf((int)a2.q0()));
        contentValues.put("ready_rate", Integer.valueOf((int)a2.J0()));
        contentValues.put("ext_data", a2.L());
        contentValues.put("nscpt", Integer.valueOf((int)a2.v0()));
        contentValues.put("mof_template_url", a2.p0());
        contentValues.put("req_ext_data", a2.K0());
        contentValues.put("readyState", Integer.valueOf((int)a2.I0()));
        contentValues.put("load_timeout", Integer.valueOf((int)a2.m0()));
        contentValues.put("placement_id", a2.C0());
        if (!this.a(a2.e(), a2.V0(), string, n2, a2.k(), a2.k1())) {
            long l3 = this.b().insert("campaign", null, contentValues);
            // MONITOREXIT : var33_4
            return l3;
        }
        if (a2.k1()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("unitid = ");
            stringBuilder.append(string);
            stringBuilder.append(" AND ");
            stringBuilder.append("is_bid_campaign");
            stringBuilder.append(" = 1");
            string2 = stringBuilder.toString();
            return this.b().update("campaign", contentValues, string2, null);
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("id = ");
            stringBuilder.append(a2.e());
            stringBuilder.append(" AND ");
            stringBuilder.append("unitid");
            stringBuilder.append(" = ");
            stringBuilder.append(string);
            stringBuilder.append(" AND ");
            stringBuilder.append("is_bid_campaign");
            stringBuilder.append(" = 0");
            string2 = stringBuilder.toString();
        }
        return this.b().update("campaign", contentValues, string2, null);
        catch (Exception exception) {
            h.d((String)"CampaignDao", (String)exception.getLocalizedMessage());
            // MONITOREXIT : var33_4
            return -1L;
        }
    }

    /*
     * Exception decompiling
     */
    public final List<f.f.a.e.e.a> a(String var1, int var2_2) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[TRYBLOCK]], but top level block is 14[UNCONDITIONALDOLOOP]
        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:432)
        // org.benf.cfr.reader.b.a.a.j.d(Op04StructuredStatement.java:484)
        // org.benf.cfr.reader.b.a.a.i.a(Op03SimpleStatement.java:607)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:692)
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

    public final List<f.f.a.e.e.a> a(String string, int n2, int n3, int n4) {
        String string2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" WHERE unitid = '");
        stringBuilder.append(string);
        stringBuilder.append("' AND ");
        stringBuilder.append("level");
        stringBuilder.append(" = ");
        stringBuilder.append(n3);
        stringBuilder.append(" AND ");
        stringBuilder.append("adSource");
        stringBuilder.append(" = ");
        stringBuilder.append(n4);
        String string3 = stringBuilder.toString();
        if (n2 > 0) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(" LIMIT ");
            stringBuilder2.append(n2);
            string2 = stringBuilder2.toString();
        } else {
            string2 = "";
        }
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("SELECT * FROM campaign");
        stringBuilder3.append(string3);
        stringBuilder3.append(string2);
        return e.super.e(stringBuilder3.toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List<f.f.a.e.e.a> a(String string, int n2, int n3, int n4, boolean bl) {
        e e2 = this;
        synchronized (e2) {
            StringBuilder stringBuilder;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(" WHERE unitid = '");
            stringBuilder2.append(string);
            stringBuilder2.append("' AND ");
            stringBuilder2.append("level");
            stringBuilder2.append(" = ");
            stringBuilder2.append(n3);
            stringBuilder2.append(" AND ");
            stringBuilder2.append("adSource");
            stringBuilder2.append(" = ");
            stringBuilder2.append(n4);
            String string2 = stringBuilder2.toString();
            if (bl) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append(" AND is_bid_campaign = 1");
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append(" AND is_bid_campaign = 0");
            }
            String string3 = stringBuilder.toString();
            String string4 = "";
            if (n2 > 0) {
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append(" LIMIT ");
                stringBuilder3.append(n2);
                string4 = stringBuilder3.toString();
            }
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append("SELECT * FROM campaign");
            stringBuilder4.append(string3);
            stringBuilder4.append(string4);
            return this.e(stringBuilder4.toString());
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a(long l2, String string) {
        void var27_3 = this;
        // MONITORENTER : var27_3
        long l3 = System.currentTimeMillis();
        long l4 = l3 - l2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(plctb>0 and (plctb* 1000+ts)<");
        stringBuilder.append(l3);
        stringBuilder.append(") or (");
        stringBuilder.append("plctb");
        stringBuilder.append("<=");
        stringBuilder.append(0);
        stringBuilder.append(" and ");
        stringBuilder.append("ts");
        stringBuilder.append("<");
        stringBuilder.append(l4);
        stringBuilder.append(") and ");
        stringBuilder.append("unitid");
        stringBuilder.append("=?");
        String string2 = stringBuilder.toString();
        String[] arrstring = new String[]{string};
        if (this.b() == null) return;
        {
            this.b().delete("campaign", string2, arrstring);
            return;
        }
        catch (Exception exception) {
            h.d((String)c, (String)exception.getMessage());
        }
        // MONITOREXIT : var27_3
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void a(String string) {
        void var15_2 = this;
        synchronized (var15_2) {
            block8 : {
                boolean bl = TextUtils.isEmpty((CharSequence)string);
                if (!bl) break block8;
                return;
            }
            try {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("unitid");
                stringBuilder.append(" = '");
                stringBuilder.append(string);
                stringBuilder.append("' AND ");
                stringBuilder.append("readyState");
                stringBuilder.append(" = ");
                stringBuilder.append(2);
                SQLiteDatabase sQLiteDatabase = this.b();
                if (sQLiteDatabase == null) return;
                sQLiteDatabase.delete("campaign", stringBuilder.toString(), null);
                return;
            }
            catch (Exception exception) {
                h.d((String)"CampaignDao", (String)exception.getLocalizedMessage());
                return;
            }
            finally {
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a(String var1, int var2_3, boolean var3_2) {
        block5 : {
            block6 : {
                var19_4 = this;
                // MONITORENTER : var19_4
                if (!var3_2) ** GOTO lbl14
                var12_5 = new StringBuilder();
                var12_5.append("placement_id = ");
                var12_5.append(var1);
                var12_5.append(" AND ");
                var12_5.append("ad_type");
                var12_5.append(" = ");
                var12_5.append(var2_3);
                var9_6 = var12_5.toString();
                break block6;
lbl14: // 1 sources:
                var4_7 = new StringBuilder();
                var4_7.append("ad_type = ");
                var4_7.append(var2_3);
                var9_6 = var4_7.toString();
            }
            var10_8 = this.b();
            if (var10_8 != null) break block5;
            // MONITOREXIT : var19_4
            return;
        }
        try {
            this.b().delete("campaign", var9_6, null);
            return;
        }
        catch (Exception var6_9) {
            h.d((String)"CampaignDao", (String)var6_9.getLocalizedMessage());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(String string, ContentValues contentValues) {
        void var6_3 = this;
        synchronized (var6_3) {
            try {
                try {
                    this.b().update("campaign", contentValues, "id = ?", new String[]{string});
                }
                catch (Exception exception) {
                    h.d((String)"CampaignDao", (String)exception.getLocalizedMessage());
                }
                return;
            }
            catch (Throwable throwable2) {}
            throw throwable2;
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a(String string, String string2) {
        block6 : {
            void var17_3 = this;
            // MONITORENTER : var17_3
            SQLiteDatabase sQLiteDatabase = this.b();
            if (sQLiteDatabase != null) break block6;
            // MONITOREXIT : var17_3
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("id = '");
        stringBuilder.append(string);
        stringBuilder.append("' AND ");
        stringBuilder.append("request_id");
        stringBuilder.append(" = '");
        stringBuilder.append(string2);
        stringBuilder.append("'");
        String string3 = stringBuilder.toString();
        ContentValues contentValues = new ContentValues();
        contentValues.put("readyState", Integer.valueOf((int)2));
        this.b().update("campaign", contentValues, string3, null);
        return;
        catch (Exception exception) {
            h.d((String)"CampaignDao", (String)exception.getLocalizedMessage());
        }
        // MONITOREXIT : var17_3
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a(String string, String string2, boolean bl, String string3) {
        String string4;
        block6 : {
            void var28_5 = this;
            // MONITORENTER : var28_5
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("id = '");
            stringBuilder.append(string);
            stringBuilder.append("' AND ");
            stringBuilder.append("unitid");
            stringBuilder.append(" = ");
            stringBuilder.append(string2);
            stringBuilder.append(" AND ");
            stringBuilder.append("is_bid_campaign");
            stringBuilder.append(" = ");
            String string5 = bl ? "1" : "0";
            stringBuilder.append(string5);
            stringBuilder.append(" AND ");
            stringBuilder.append("request_id");
            stringBuilder.append(" = '");
            stringBuilder.append(string3);
            stringBuilder.append("'");
            string4 = stringBuilder.toString();
            SQLiteDatabase sQLiteDatabase = this.b();
            if (sQLiteDatabase != null) break block6;
            // MONITOREXIT : var28_5
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("readyState", Integer.valueOf((int)2));
        this.b().update("campaign", contentValues, string4, null);
        return;
        catch (Exception exception) {
            h.d((String)"CampaignDao", (String)exception.getLocalizedMessage());
        }
        // MONITOREXIT : var28_5
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(String string, List<f.f.a.e.e.a> list) {
        void var29_3 = this;
        synchronized (var29_3) {
            if (list != null && list.size() > 0) {
                for (f.f.a.e.e.a a2 : list) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("readyState", Integer.valueOf((int)2));
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("id = '");
                    stringBuilder.append(a2.e());
                    stringBuilder.append("' AND ");
                    stringBuilder.append("unitid");
                    stringBuilder.append(" = ");
                    stringBuilder.append(string);
                    stringBuilder.append(" AND ");
                    stringBuilder.append("request_id");
                    stringBuilder.append(" = '");
                    stringBuilder.append(a2.L0());
                    stringBuilder.append("'");
                    String string2 = stringBuilder.toString();
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(string2);
                    stringBuilder2.append(" AND is_bid_campaign = ");
                    int n2 = a2.k1() ? 1 : 0;
                    stringBuilder2.append(n2);
                    String string3 = stringBuilder2.toString();
                    try {
                        SQLiteDatabase sQLiteDatabase = this.b();
                        if (sQLiteDatabase == null) continue;
                        sQLiteDatabase.update("campaign", contentValues, string3, null);
                    }
                    catch (SQLException sQLException) {
                        h.d((String)"CampaignDao", (String)sQLException.getLocalizedMessage());
                    }
                }
            }
            return;
        }
    }

    /*
     * Exception decompiling
     */
    public final void a(String var1, List<f.f.a.e.e.a> var2, String var3, int var4) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl109.1 : ALOAD : trying to set 1 previously set to 0
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
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(String var1_1, List<f.f.a.e.e.a> var2_4, List<f.f.a.e.e.a> var3_3, boolean var4) {
        var57_5 = this;
        synchronized (var57_5) {
            block17 : {
                var6_6 = this.b();
                if (var6_6 != null) break block17;
                return;
            }
            if (var2_4 == null) ** GOTO lbl49
            if (var2_4.size() <= 0) ** GOTO lbl49
            ** for (var30_10 : var2_4)
lbl13: // 1 sources:
            ** GOTO lbl49
lbl-1000: // 1 sources:
            {
                try {
                    var31_12 = new ContentValues();
                    var31_12.put("readyState", Integer.valueOf((int)0));
                    var33_9 = new StringBuilder();
                    var33_9.append("unitid = '");
                    var33_9.append(var1_1);
                    var33_9.append("' AND ");
                    var33_9.append("id");
                    var33_9.append(" = '");
                    var33_9.append(var30_10.e());
                    var33_9.append("' AND ");
                    var33_9.append("request_id");
                    var33_9.append(" = '");
                    var33_9.append(var30_10.L0());
                    var33_9.append("'");
                    var45_8 = var33_9.toString();
                    if (var4) {
                        var46_13 = new StringBuilder();
                        var46_13.append(var45_8);
                        var46_13.append(" AND ");
                        var46_13.append("is_bid_campaign");
                        var46_13.append(" = 1");
                    } else {
                        var46_13 = new StringBuilder();
                        var46_13.append(var45_8);
                        var46_13.append(" AND ");
                        var46_13.append("is_bid_campaign");
                        var46_13.append(" = 0");
                    }
                    var51_14 = var46_13.toString();
                    this.b().update("campaign", var31_12, var51_14, null);
                }
                catch (Exception var32_11) {
                    try {
                        h.d((String)"CampaignDao", (String)var32_11.getLocalizedMessage());
                        continue;
lbl49: // 3 sources:
                        if (var3_3 == null) return;
                        if (var3_3.size() <= 0) return;
                        var7_15 = var3_3.iterator();
                        while (var7_15.hasNext() != false) {
                            var8_16 = (f.f.a.e.e.a)var7_15.next();
                            try {
                                if (var8_16.m0() != 0) continue;
                                var12_20 = new StringBuilder();
                                var12_20.append("unitid");
                                var12_20.append(" = '");
                                var12_20.append(var1_1);
                                var12_20.append("' AND ");
                                var12_20.append("id");
                                var12_20.append(" = '");
                                var12_20.append(var8_16.e());
                                var12_20.append("' AND ");
                                var12_20.append("request_id");
                                var12_20.append(" = '");
                                var12_20.append(var8_16.L0());
                                var12_20.append("'");
                                var25_19 = var4 != false ? " AND is_bid_campaign = 1" : " AND is_bid_campaign = 0";
                                var12_20.append(var25_19);
                                var27_17 = new ContentValues();
                                var27_17.put("readyState", Integer.valueOf((int)2));
                                this.b().update("campaign", var27_17, var12_20.toString(), null);
                            }
                            catch (SQLException var9_18) {
                                h.d((String)"CampaignDao", (String)var9_18.getLocalizedMessage());
                            }
                        }
                        return;
                    }
                    catch (Exception var10_21) {}
                    break;
lbl81: // 1 sources:
                    ** break;
                }
            }
            h.d((String)"CampaignDao", (String)var10_21.getLocalizedMessage());
            {
                catch (Throwable var11_22) {}
                return;
                ** try [egrp 6[TRYBLOCK] [33 : 603->610)] { 
lbl86: // 1 sources:
                throw var11_22;
            }
lbl87: // 2 sources:
            catch (Throwable var5_23) {
                throw var5_23;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(String string, List<f.f.a.e.e.a> list, boolean bl) {
        void var26_4 = this;
        synchronized (var26_4) {
            if (list != null && list.size() > 0) {
                for (f.f.a.e.e.a a2 : list) {
                    try {
                        if (a2.m0() != 0) continue;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("unitid");
                        stringBuilder.append(" = '");
                        stringBuilder.append(string);
                        stringBuilder.append("' AND ");
                        stringBuilder.append("id");
                        stringBuilder.append(" = '");
                        stringBuilder.append(a2.e());
                        stringBuilder.append("' AND ");
                        stringBuilder.append("request_id");
                        stringBuilder.append(" = '");
                        stringBuilder.append(a2.L0());
                        stringBuilder.append("'");
                        String string2 = bl ? " AND is_bid_campaign = 1" : " AND is_bid_campaign = 0";
                        stringBuilder.append(string2);
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("readyState", Integer.valueOf((int)2));
                        SQLiteDatabase sQLiteDatabase = this.b();
                        if (sQLiteDatabase == null) continue;
                        sQLiteDatabase.update("campaign", contentValues, stringBuilder.toString(), null);
                    }
                    catch (SQLException sQLException) {
                        h.d((String)"CampaignDao", (String)sQLException.getLocalizedMessage());
                    }
                }
            }
            return;
        }
    }

    public final void a(List<f.f.a.e.e.a> list, String string, String string2, int n2) {
        void var10_5 = this;
        synchronized (var10_5) {
            block6 : {
                if (list != null) {
                    block7 : {
                        if (list.size() == 0) break block6;
                        SQLiteDatabase sQLiteDatabase = this.b();
                        if (sQLiteDatabase != null) break block7;
                        return;
                    }
                    Iterator iterator = list.iterator();
                    while (iterator.hasNext()) {
                        e.super.a((f.f.a.e.e.a)iterator.next(), string, string2, n2);
                    }
                    return;
                }
            }
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean a(String var1_4, int var2_6, String var3_2, int var4_3, int var5_1, boolean var6_5) {
        block4 : {
            block5 : {
                var41_7 = this;
                // MONITORENTER : var41_7
                if (!var6_5) ** GOTO lbl14
                var7_8 = new StringBuilder();
                var7_8.append("SELECT id FROM campaign WHERE ");
                var7_8.append("unitid = ");
                var7_8.append(var3_2);
                var7_8.append(" AND ");
                var7_8.append("is_bid_campaign");
                var7_8.append(" = 1");
                var15_9 = var7_8.toString();
                break block5;
lbl14: // 1 sources:
                var18_10 = new StringBuilder();
                var18_10.append("SELECT id FROM campaign WHERE ");
                var18_10.append("id='");
                var18_10.append(var1_4);
                var18_10.append("' AND ");
                var18_10.append("tab");
                var18_10.append("=");
                var18_10.append(var2_6);
                var18_10.append(" AND ");
                var18_10.append("unitid");
                var18_10.append(" = '");
                var18_10.append(var3_2);
                var18_10.append("' AND ");
                var18_10.append("level");
                var18_10.append(" = ");
                var18_10.append(var4_3);
                var18_10.append(" AND ");
                var18_10.append("adSource");
                var18_10.append(" = ");
                var18_10.append(var5_1);
                var18_10.append(" AND ");
                var18_10.append("is_bid_campaign");
                var18_10.append(" = 0");
                var15_9 = var18_10.toString();
            }
            var16_11 = this.a().rawQuery(var15_9, null);
            if (var16_11 == null || var16_11.getCount() <= 0) break block4;
            var16_11.close();
            var17_12 = true;
            // MONITOREXIT : var41_7
            return var17_12;
        }
        if (var16_11 == null) return false;
        var16_11.close();
        return false;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final f.f.a.e.e.a b(String var1, String var2_2) {
        block9 : {
            block8 : {
                var3_3 = null;
                var4_4 = new StringBuilder();
                var4_4.append("SELECT * FROM campaign where unitid ='");
                var4_4.append(var2_2);
                var4_4.append("' and ");
                var4_4.append("id");
                var4_4.append(" = '");
                var4_4.append(var1);
                var4_4.append("'");
                var15_5 = var4_4.toString();
                var16_6 = this.a().rawQuery(var15_5, null);
                var17_7 = null;
                if (var16_6 == null) break block8;
                try {
                    var19_8 = var16_6.getCount();
                    var17_7 = null;
                    if (var19_8 <= 0) break block8;
                    while (var16_6.moveToNext()) {
                        var17_7 = e.super.a(var16_6);
                    }
                }
                catch (Throwable var7_9) {
                    var3_3 = var16_6;
                    break block9;
                }
                catch (Exception var5_12) {
                    var18_15 = var17_7;
                    var3_3 = var16_6;
                    var6_16 = var18_15;
                    ** GOTO lbl-1000
                }
            }
            if (var16_6 == null) return var17_7;
            var16_6.close();
            return var17_7;
            catch (Throwable var7_10) {
                break block9;
            }
            catch (Exception var5_13) {
                var6_16 = null;
            }
lbl-1000: // 2 sources:
            {
                h.d((String)"CampaignDao", (String)var5_14.getLocalizedMessage());
                if (var3_3 == null) return var6_16;
            }
            var3_3.close();
            return var6_16;
        }
        if (var3_3 == null) throw var7_11;
        var3_3.close();
        throw var7_11;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final List<f.f.a.e.e.a> b(String string) {
        void var15_2 = this;
        synchronized (var15_2) {
            try {
                StringBuilder stringBuilder = new StringBuilder("SELECT * FROM ");
                stringBuilder.append("campaign");
                stringBuilder.append(" WHERE ");
                stringBuilder.append("unitid");
                stringBuilder.append(" = '");
                stringBuilder.append(string);
                stringBuilder.append("' AND ");
                stringBuilder.append("readyState");
                stringBuilder.append(" = ");
                stringBuilder.append(2);
                Cursor cursor = this.a().rawQuery(stringBuilder.toString(), null);
                if (cursor != null && cursor.getCount() > 0) {
                    ArrayList arrayList = new ArrayList();
                    while (cursor.moveToNext()) {
                        arrayList.add((Object)e.super.a(cursor));
                    }
                    if (cursor != null) {
                        cursor.close();
                    }
                    return arrayList;
                }
                if (cursor != null) {
                    cursor.close();
                }
                return null;
            }
            catch (Exception exception) {}
            finally {
                return null;
            }
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final List<f.f.a.e.e.a> b(String var1, int var2_3, boolean var3_2) {
        block14 : {
            block13 : {
                block12 : {
                    block11 : {
                        block15 : {
                            var4_4 = null;
                            if (!var3_2) ** GOTO lbl13
                            var21_5 = new StringBuilder();
                            var21_5.append("placement_id = ");
                            var21_5.append(var1);
                            var21_5.append(" AND ");
                            var21_5.append("ad_type");
                            var21_5.append(" = ");
                            var21_5.append(var2_3);
                            var11_6 = var21_5.toString();
                            break block15;
lbl13: // 1 sources:
                            var5_7 = new StringBuilder();
                            var5_7.append("ad_type = ");
                            var5_7.append(var2_3);
                            var11_6 = var5_7.toString();
                        }
                        var12_8 = new StringBuilder();
                        var12_8.append("SELECT * FROM campaign WHERE ");
                        var12_8.append(var11_6);
                        var15_9 = var12_8.toString();
                        var16_10 = this.a().rawQuery(var15_9, null);
                        if (var16_10 == null) break block11;
                        try {
                            if (var16_10.getCount() <= 0) break block11;
                            var8_11 = new ArrayList();
                            try {
                                while (var16_10.moveToNext()) {
                                    var8_11.add((Object)e.super.a(var16_10));
                                }
                                break block12;
                            }
                            catch (Exception var19_12) {
                                var4_4 = var16_10;
                                var7_13 = var19_12;
                                break block13;
                            }
                        }
                        catch (Throwable var18_15) {
                            var4_4 = var16_10;
                            var6_16 = var18_15;
                            break block14;
                        }
                        catch (Exception var17_18) {
                            var4_4 = var16_10;
                            var7_13 = var17_18;
                            var8_11 = null;
                            break block13;
                        }
                    }
                    var8_11 = null;
                }
                if (var16_10 == null) return var8_11;
                var16_10.close();
                return var8_11;
                catch (Exception var7_14) {
                    var8_11 = null;
                }
            }
            try {
                h.d((String)"CampaignDao", (String)var7_13.getLocalizedMessage());
                if (var4_4 == null) return var8_11;
            }
            catch (Throwable var6_17) {
                // empty catch block
            }
            var4_4.close();
            return var8_11;
        }
        if (var4_4 == null) throw var6_16;
        var4_4.close();
        throw var6_16;
    }

    public final void b(String string, List<f.f.a.e.e.a> list) {
        void var22_3 = this;
        synchronized (var22_3) {
            if (list != null) {
                if (list.size() > 0) {
                    for (f.f.a.e.e.a a2 : list) {
                        SQLiteDatabase sQLiteDatabase;
                        ContentValues contentValues;
                        try {
                            contentValues = new ContentValues();
                            contentValues.put("readyState", Integer.valueOf((int)0));
                            sQLiteDatabase = this.b();
                            if (sQLiteDatabase == null) continue;
                        }
                        catch (Exception exception) {
                            h.d((String)"CampaignDao", (String)exception.getLocalizedMessage());
                            continue;
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("unitid = '");
                        stringBuilder.append(string);
                        stringBuilder.append("' AND ");
                        stringBuilder.append("id");
                        stringBuilder.append(" = '");
                        stringBuilder.append(a2.e());
                        stringBuilder.append("' AND ");
                        stringBuilder.append("request_id");
                        stringBuilder.append(" = '");
                        stringBuilder.append(a2.L0());
                        stringBuilder.append("'");
                        sQLiteDatabase.update("campaign", contentValues, stringBuilder.toString(), null);
                    }
                }
            }
            return;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final List<f.f.a.e.e.a> c(String var1, String var2_2) {
        block13 : {
            block12 : {
                block11 : {
                    var3_3 = null;
                    var4_4 = new StringBuilder();
                    var4_4.append("SELECT * FROM campaign where bid_token ='");
                    var4_4.append(var2_2);
                    var4_4.append("' and ");
                    var4_4.append("unitid");
                    var4_4.append(" ='");
                    var4_4.append(var1);
                    var4_4.append("'");
                    var15_5 = var4_4.toString();
                    var16_6 = this.a().rawQuery(var15_5, null);
                    if (var16_6 == null) break block11;
                    try {
                        if (var16_6.getCount() <= 0) break block11;
                        var6_7 = new ArrayList();
                        try {
                            while (var16_6.moveToNext()) {
                                var6_7.add((Object)e.super.a(var16_6));
                            }
                            break block12;
                        }
                        catch (Exception var18_8) {
                            var3_3 = var16_6;
                            var5_9 = var18_8;
                            ** GOTO lbl-1000
                        }
                    }
                    catch (Throwable var7_11) {
                        var3_3 = var16_6;
                        break block13;
                    }
                    catch (Exception var17_14) {
                        var3_3 = var16_6;
                        var5_9 = var17_14;
                        var6_7 = null;
                        ** GOTO lbl-1000
                    }
                }
                var6_7 = null;
            }
            if (var16_6 == null) return var6_7;
            var16_6.close();
            return var6_7;
            catch (Throwable var7_12) {
                break block13;
            }
            catch (Exception var5_10) {
                var6_7 = null;
            }
lbl-1000: // 3 sources:
            {
                h.d((String)"CampaignDao", (String)var5_9.getLocalizedMessage());
                if (var3_3 == null) return var6_7;
            }
            var3_3.close();
            return var6_7;
        }
        if (var3_3 == null) throw var7_13;
        var3_3.close();
        throw var7_13;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void c(String string) {
        String string2;
        block6 : {
            void var16_2 = this;
            // MONITORENTER : var16_2
            long l2 = System.currentTimeMillis() - 604800000L;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("unitid = ");
            stringBuilder.append(string);
            stringBuilder.append(" AND ");
            stringBuilder.append("short_ctime");
            stringBuilder.append("<");
            stringBuilder.append(l2);
            string2 = stringBuilder.toString();
            SQLiteDatabase sQLiteDatabase = this.b();
            if (sQLiteDatabase != null) break block6;
            // MONITOREXIT : var16_2
            return;
        }
        this.b().delete("campaign", string2, null);
        return;
        catch (Exception exception) {
            h.d((String)"CampaignDao", (String)exception.getLocalizedMessage());
        }
        // MONITOREXIT : var16_2
    }

    /*
     * Exception decompiling
     */
    public final String d(String var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl478 : ALOAD_2 : trying to set 0 previously set to 1
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
    public final void d(String string, String string2) {
        void var18_3 = this;
        synchronized (var18_3) {
            try {
                try {
                    if (TextUtils.isEmpty((CharSequence)string2) || TextUtils.isEmpty((CharSequence)string)) {
                        return;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("unitid = '");
                    stringBuilder.append(string);
                    stringBuilder.append("' AND ");
                    stringBuilder.append("bid_token");
                    stringBuilder.append(" != '");
                    stringBuilder.append(string2);
                    stringBuilder.append("' AND ");
                    stringBuilder.append("bid_token");
                    stringBuilder.append(" IS NOT NULL");
                    String string3 = stringBuilder.toString();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("readyState", Integer.valueOf((int)2));
                    this.b().update("campaign", contentValues, string3, null);
                }
                catch (Exception exception) {
                    h.d((String)"CampaignDao", (String)exception.getLocalizedMessage());
                }
                return;
            }
            catch (Throwable throwable2) {}
            throw throwable2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e(String string, String string2) {
        void var18_3 = this;
        synchronized (var18_3) {
            try {
                try {
                    if (TextUtils.isEmpty((CharSequence)string2) || TextUtils.isEmpty((CharSequence)string)) {
                        return;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("unitid = '");
                    stringBuilder.append(string);
                    stringBuilder.append("' AND ");
                    stringBuilder.append("bid_token");
                    stringBuilder.append(" = '");
                    stringBuilder.append(string2);
                    stringBuilder.append("' AND ");
                    stringBuilder.append("bid_token");
                    stringBuilder.append(" IS NOT NULL");
                    String string3 = stringBuilder.toString();
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("readyState", Integer.valueOf((int)2));
                    this.b().update("campaign", contentValues, string3, null);
                }
                catch (Exception exception) {
                    h.d((String)"CampaignDao", (String)exception.getLocalizedMessage());
                }
                return;
            }
            catch (Throwable throwable2) {}
            throw throwable2;
        }
    }
}

