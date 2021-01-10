/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  f.f.a.a
 *  f.f.a.e.e.a$a
 *  f.f.a.e.e.a$b
 *  f.f.a.e.e.k
 *  f.f.a.e.f.b
 *  f.f.a.e.f.h
 *  f.f.a.e.f.r
 *  java.io.Serializable
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.net.URL
 *  java.net.URLEncoder
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package f.f.a.e.e;

import android.text.TextUtils;
import f.f.a.e.e.a;
import f.f.a.e.e.k;
import f.f.a.e.f.h;
import f.f.a.e.f.r;
import f.f.a.g.a;
import java.io.Serializable;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class a
extends f.f.a.m.a
implements f.f.a.p.a,
Serializable {
    public static final String m1 = a.class.getSimpleName();
    private int A;
    private String A0;
    private String B;
    private int B0;
    private int C;
    private String C0;
    private String D;
    private int D0;
    private int E;
    private String E0;
    private int F;
    private HashMap<String, String> F0;
    private String G;
    private boolean G0;
    private String H;
    private String H0 = "";
    private int I;
    private String I0;
    private String J;
    private boolean J0;
    private String K;
    private int K0 = 2;
    private String L;
    public String L0 = "";
    private String M;
    private int M0;
    private a N;
    private int N0 = -1;
    private int O = 0;
    private String O0;
    private int P;
    private int P0 = 1;
    private String Q;
    private String Q0;
    private int R = 1;
    private int R0;
    private int S = 1;
    private String S0;
    private int T = 6;
    private int T0 = 0;
    private String U;
    private int U0 = 2;
    private int V = -1;
    private String V0;
    private String W = "";
    private int W0 = 1;
    private String X = "";
    private Map<String, String> X0;
    private String Y = "";
    private String Y0;
    private int Z = 0;
    private k Z0;
    private String a0 = "";
    private String a1;
    private String b0 = "";
    private String b1;
    private String c0 = "";
    private String c1;
    private boolean d0 = false;
    private int d1;
    private int e0;
    private int e1;
    private int f0;
    private int f1;
    private int g0;
    private b g1;
    private String h0;
    private a.a h1;
    private String i0;
    private boolean i1 = false;
    private String j0;
    private String j1 = null;
    private String k0;
    private int k1;
    private int l0;
    private String l1;
    private int m0;
    private int n = 1;
    private int n0;
    private String o = "";
    private String o0 = "";
    private String p = "";
    private int p0;
    private List<String> q;
    private int q0;
    private long r = 0L;
    private String r0;
    private long s = 0L;
    private int s0;
    private String t = "";
    private int t0;
    private String u = "";
    private String u0;
    private long v = 0L;
    private int v0;
    private int w = -1;
    private int w0;
    private int x;
    private String x0;
    private int y;
    private int y0;
    private int z;
    private String z0;

    public static a a(JSONObject jSONObject) {
        if (jSONObject != null) {
            a a2 = new a();
            a2.e(jSONObject.optString("campaignid"));
            a2.g(jSONObject.optString("packageName"));
            a2.c(jSONObject.optString("title"));
            a2.a(jSONObject.optString("cta"));
            a2.b(jSONObject.optString("desc"));
            a2.G(jSONObject.optString("impression_url"));
            a2.f(jSONObject.optString("image_url"));
            a2.d(jSONObject.optLong("plct"));
            a2.e(jSONObject.optLong("plctb"));
            a2.j(jSONObject.optString("ad_html"));
            a2.k(jSONObject.optString("ad_tpl_url"));
            a2.p(jSONObject.optString("banner_url"));
            a2.o(jSONObject.optString("banner_html"));
            a2.c(jSONObject.optInt("creative_id"));
            a2.S(jSONObject.optString(f.f.a.a.j));
            return a2;
        }
        return null;
    }

    /*
     * Exception decompiling
     */
    public static a a(JSONObject var0, String var1, String var2, String var3, boolean var4, f.f.a.e.e.b var5, String var6) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl421 : ALOAD_0 : trying to set 1 previously set to 0
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
    private static String a(f.f.a.e.e.b b2, a a2, String string) {
        if (b2 == null || TextUtils.isEmpty((CharSequence)string)) return string;
        {
            if (a2 == null) {
                return string;
            }
            try {
                HashMap<String, String> hashMap;
                HashMap<String, String> hashMap2 = b2.j();
                if (hashMap2 != null) {
                    hashMap2.entrySet().iterator();
                    for (Map.Entry entry : hashMap2.entrySet()) {
                        String string2 = (String)entry.getKey();
                        String string3 = (String)entry.getValue();
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("\\{");
                        stringBuilder.append(string2);
                        stringBuilder.append("\\}");
                        string = string.replaceAll(stringBuilder.toString(), string3);
                    }
                }
                if ((hashMap = a2.u()) != null) {
                    hashMap.entrySet().iterator();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        String string4 = (String)entry.getKey();
                        String string5 = (String)entry.getValue();
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("\\{");
                        stringBuilder.append(string4);
                        stringBuilder.append("\\}");
                        string = string.replaceAll(stringBuilder.toString(), string5);
                    }
                }
                string = string.replaceAll("\\{c\\}", URLEncoder.encode((String)b2.a(), (String)"utf-8"));
                Matcher matcher = Pattern.compile((String)"=\\{.*?\\}").matcher((CharSequence)string);
                while (matcher.find()) {
                    string = string.replace((CharSequence)matcher.group(0), (CharSequence)"=");
                }
                return string;
            }
            catch (Throwable throwable) {
                h.b((String)m1, (String)throwable.getMessage(), (Throwable)throwable);
            }
        }
        return string;
    }

    /*
     * Exception decompiling
     */
    private static List<Map<Integer, String>> a(JSONArray var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl52 : ALOAD_1 : trying to set 1 previously set to 0
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

    public static JSONObject a(a a2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", (Object)a2.e());
        if (!TextUtils.isEmpty((CharSequence)a2.B())) {
            jSONObject.put("unitId", (Object)a2.B());
        }
        if (!TextUtils.isEmpty((CharSequence)a2.L())) {
            try {
                jSONObject.put("ext_data", (Object)new JSONObject(a2.L()));
            }
            catch (JSONException jSONException) {
                jSONException.printStackTrace();
            }
        }
        if (!TextUtils.isEmpty((CharSequence)a2.K0())) {
            try {
                jSONObject.put("req_ext_data", (Object)new JSONObject(a2.K0()));
            }
            catch (JSONException jSONException) {
                jSONException.printStackTrace();
            }
        }
        if (a2.H0() != null && a2.H0().size() > 0) {
            try {
                JSONArray jSONArray = new JSONArray();
                Iterator iterator = a2.H0().iterator();
                while (iterator.hasNext()) {
                    jSONArray.put((Object)((String)iterator.next()));
                }
                jSONObject.put("pv_urls", (Object)jSONArray);
            }
            catch (JSONException jSONException) {
                jSONException.printStackTrace();
            }
        }
        if (!TextUtils.isEmpty((CharSequence)a2.p0())) {
            jSONObject.put("mof_tplid", a2.q0());
            jSONObject.put("mof_template_url", (Object)a2.p0());
            jSONObject.put("nscpt", a2.v0());
        }
        jSONObject.put("ready_rate", a2.J0());
        jSONObject.put("title", (Object)a2.c());
        jSONObject.put("desc", (Object)a2.b());
        jSONObject.put("package_name", (Object)a2.g());
        jSONObject.put("icon_url", (Object)a2.d());
        jSONObject.put("image_url", (Object)a2.f());
        jSONObject.put("app_size", (Object)a2.i());
        jSONObject.put("image_size", (Object)a2.W());
        jSONObject.put("impression_url", (Object)a2.Y());
        jSONObject.put("click_url", (Object)a2.F());
        jSONObject.put("wtick", a2.g1());
        jSONObject.put("deep_link", (Object)a2.I());
        jSONObject.put("notice_url", (Object)a2.u0());
        jSONObject.put("ttc", a2.n1());
        jSONObject.put("template", a2.W0());
        jSONObject.put("ad_source_id", a2.k());
        jSONObject.put("fca", a2.M());
        jSONObject.put("fcb", a2.N());
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a2.h());
        stringBuilder.append("");
        jSONObject.put("rating", (Object)stringBuilder.toString());
        jSONObject.put("click_mode", (Object)a2.G());
        jSONObject.put("landing_type", (Object)a2.k0());
        jSONObject.put("link_type", a2.l0());
        jSONObject.put("c_ct", a2.D());
        jSONObject.put("ttc_ct", a2.G0());
        jSONObject.put("ctatext", (Object)a2.a());
        jSONObject.put("adv_id", (Object)a2.r());
        jSONObject.put("ttc_type", a2.Y0());
        jSONObject.put("endcard_click_result", a2.K());
        jSONObject.put("ttc_ct2", a2.X0());
        jSONObject.put("retarget_offer", a2.N0());
        jSONObject.put("video_url", (Object)a2.d1());
        jSONObject.put("video_length", a2.Z0());
        jSONObject.put("video_size", a2.c1());
        jSONObject.put("video_resolution", (Object)a2.b1());
        jSONObject.put("watch_mile", a2.f1());
        jSONObject.put("ad_url_list", (Object)a2.p());
        jSONObject.put("only_impression_url", (Object)a2.B0());
        jSONObject.put("ctype", a2.z());
        jSONObject.put("t_imp", a2.T0());
        jSONObject.put("adv_imp", (Object)a2.s());
        jSONObject.put("html_url", (Object)a2.T());
        jSONObject.put("end_screen_url", (Object)a2.J());
        jSONObject.put("guidelines", (Object)a2.R());
        jSONObject.put("offer_type", a2.z0());
        jSONObject.put("reward_amount", a2.O0());
        jSONObject.put("reward_name", (Object)a2.P0());
        jSONObject.put("loopback", (Object)a2.o0());
        jSONObject.put("gif_url", (Object)a2.Q());
        if (r.b((String)a2.t0())) {
            jSONObject.put("ad_tracking", (Object)new JSONObject(a2.t0()));
        }
        jSONObject.put("video_end_type", a2.e1());
        jSONObject.put("endcard_url", (Object)a2.i1());
        jSONObject.put("playable_ads_without_video", a2.D0());
        if (a2 != null && a2.R0() != null && r.b((String)a2.R0().a())) {
            jSONObject.put("rv", (Object)new JSONObject(a2.R0().a()));
        }
        jSONObject.put("md5_file", (Object)a2.a1());
        jSONObject.put("c_toi", a2.E());
        String string = m1;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("camapignJsonObject:");
        stringBuilder2.append(jSONObject.toString());
        h.b((String)string, (String)stringBuilder2.toString());
        jSONObject.put("c_ua", a2.h1());
        jSONObject.put("imp_ua", a2.X());
        jSONObject.put("jm_pd", a2.e0());
        jSONObject.put("ia_icon", (Object)a2.g0());
        jSONObject.put("ia_rst", a2.i0());
        jSONObject.put("ia_url", (Object)a2.j0());
        jSONObject.put("ia_ori", a2.h0());
        jSONObject.put("ad_type", a2.m());
        jSONObject.put("ia_ext1", (Object)a2.U());
        jSONObject.put("ia_ext2", (Object)a2.V());
        jSONObject.put("is_download_zip", a2.d0());
        jSONObject.put("ia_cache", (Object)a2.Z());
        jSONObject.put("gh_id", (Object)a2.O());
        jSONObject.put("gh_path", (Object)f.f.a.e.f.b.a((String)a2.P()));
        jSONObject.put("bind_id", (Object)a2.y());
        jSONObject.put("oc_type", a2.y0());
        jSONObject.put("oc_time", a2.x0());
        jSONObject.put("t_list", (Object)a2.U0());
        a a3 = a2.q();
        if (a3 != null) {
            jSONObject.put("adchoice", (Object)new JSONObject(a3.c()));
        }
        jSONObject.put("plct", a2.E0());
        jSONObject.put("plctb", a2.F0());
        jSONObject.put("omid", (Object)a2.A0());
        jSONObject.put("creative_id", a2.H());
        jSONObject.put("cam_html", (Object)a2.v());
        String string2 = a2.w() != null ? a2.w() : a2.o();
        jSONObject.put("cam_tpl_url", (Object)string2);
        jSONObject.put("mraid", (Object)a2.r0());
        jSONObject.put("mraid_src", (Object)a2.r0());
        jSONObject.put("timestamp", a2.j());
        jSONObject.put("hb", a2.G0);
        jSONObject.put(f.f.a.a.j, (Object)a2.C0());
        return jSONObject;
    }

    /*
     * Exception decompiling
     */
    public static a b(JSONObject var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Underrun type stack
        // org.benf.cfr.reader.b.a.c.e.a(StackSim.java:35)
        // org.benf.cfr.reader.b.b.af.a(OperationFactoryPop.java:20)
        // org.benf.cfr.reader.b.b.e.a(JVMInstr.java:315)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:195)
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

    private static String[] b(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() > 0) {
            String[] arrstring = new String[jSONArray.length()];
            for (int i2 = 0; i2 < jSONArray.length(); ++i2) {
                arrstring[i2] = jSONArray.optString(i2);
            }
            return arrstring;
        }
        return null;
    }

    public static k d0(String string) {
        try {
            if (!TextUtils.isEmpty((CharSequence)string)) {
                JSONObject jSONObject = new JSONObject(string);
                k k2 = new k();
                k2.r(a.b(jSONObject.optJSONArray("impression")));
                k2.g(a.b(jSONObject.optJSONArray("start")));
                k2.h(a.b(jSONObject.optJSONArray("first_quartile")));
                k2.i(a.b(jSONObject.optJSONArray("midpoint")));
                k2.j(a.b(jSONObject.optJSONArray("third_quartile")));
                k2.k(a.b(jSONObject.optJSONArray("complete")));
                k2.a(a.a(jSONObject.optJSONArray("play_percentage")));
                k2.l(a.b(jSONObject.optJSONArray("mute")));
                k2.m(a.b(jSONObject.optJSONArray("unmute")));
                k2.n(a.b(jSONObject.optJSONArray("click")));
                k2.o(a.b(jSONObject.optJSONArray("pause")));
                k2.p(a.b(jSONObject.optJSONArray("resume")));
                k2.q(a.b(jSONObject.optJSONArray("error")));
                k2.s(a.b(jSONObject.optJSONArray("endcard")));
                k2.u(a.b(jSONObject.optJSONArray("close")));
                k2.t(a.b(jSONObject.optJSONArray("endcard_show")));
                k2.v(a.b(jSONObject.optJSONArray("video_click")));
                k2.f(a.b(jSONObject.optJSONArray("impression_t2")));
                k2.c(a.b(jSONObject.optJSONArray("apk_download_start")));
                k2.d(a.b(jSONObject.optJSONArray("apk_download_end")));
                k2.e(a.b(jSONObject.optJSONArray("apk_install")));
                k2.a(a.b(jSONObject.optJSONArray("dropout_track")));
                k2.b(a.b(jSONObject.optJSONArray("plycmpt_track")));
                return k2;
            }
            return null;
        }
        catch (JSONException jSONException) {
            h.d((String)m1, (String)"parse error");
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Map<Integer, String> e0(String string) {
        HashMap hashMap;
        block6 : {
            boolean bl = TextUtils.isEmpty((CharSequence)string);
            hashMap = null;
            if (!bl) {
                void var5_13;
                block7 : {
                    HashMap hashMap2;
                    JSONArray jSONArray;
                    try {
                        jSONArray = new JSONArray(string);
                        int n3 = jSONArray.length();
                        hashMap = null;
                        if (n3 <= 0) break block6;
                        hashMap2 = new HashMap();
                    }
                    catch (Exception exception) {
                        // empty catch block
                        break block7;
                    }
                    try {
                        for (int n2 = 0; n2 < jSONArray.length(); ++n2) {
                            JSONObject jSONObject = jSONArray.optJSONObject(n2);
                            int n4 = jSONObject.optInt("sec");
                            String string2 = jSONObject.optString("url");
                            hashMap2.put((Object)n4, (Object)string2);
                        }
                        return hashMap2;
                    }
                    catch (Exception exception) {
                        hashMap = hashMap2;
                    }
                }
                var5_13.printStackTrace();
            }
        }
        return hashMap;
    }

    /*
     * Exception decompiling
     */
    public static Map<String, String> f0(String var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl49 : ALOAD_1 : trying to set 0 previously set to 1
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

    public int A() {
        return this.n0;
    }

    public void A(int n2) {
        this.O = n2;
    }

    public void A(String string) {
        this.U = string;
    }

    public String A0() {
        return this.j1;
    }

    public String B() {
        return this.b1;
    }

    public void B(int n2) {
        this.y0 = n2;
    }

    public void B(String string) {
        this.x0 = string;
    }

    public String B0() {
        return this.b0;
    }

    public int C() {
        return this.k1;
    }

    public void C(int n2) {
        this.W0 = n2;
    }

    public void C(String string) {
        this.z0 = string;
    }

    public String C0() {
        return this.l1;
    }

    public int D() {
        return this.l0;
    }

    public void D(int n2) {
        this.m0 = n2;
    }

    public void D(String string) {
        this.G = string;
    }

    public int D0() {
        return this.W0;
    }

    public int E() {
        return this.U0;
    }

    public void E(int n2) {
        this.n = n2;
    }

    public void E(String string) {
        this.H = string;
    }

    public long E0() {
        return this.r;
    }

    public String F() {
        return this.Y;
    }

    public void F(int n2) {
        this.N0 = n2;
    }

    public void F(String string) {
        this.c0 = string;
    }

    public long F0() {
        return this.s;
    }

    public String G() {
        return this.h0;
    }

    public void G(int n2) {
        this.f1 = n2;
    }

    public void G(String string) {
        this.W = string;
    }

    public int G0() {
        return this.m0;
    }

    public long H() {
        return this.v;
    }

    public void H(int n2) {
        this.B0 = n2;
    }

    public void H(String string) {
        this.J = string;
    }

    public List<String> H0() {
        return this.q;
    }

    public String I() {
        return this.a0;
    }

    public void I(int n2) {
        this.D0 = n2;
    }

    public void I(String string) {
        this.B = string;
    }

    public int I0() {
        return this.n;
    }

    public String J() {
        return this.A0;
    }

    public void J(int n2) {
    }

    public void J(String string) {
        this.D = string;
    }

    public int J0() {
        return this.N0;
    }

    public int K() {
        return this.M0;
    }

    public void K(int n2) {
        this.w = n2;
    }

    public void K(String string) {
        this.i0 = string;
    }

    public String K0() {
        return this.S0;
    }

    public String L() {
        return this.O0;
    }

    public void L(int n2) {
        this.v0 = n2;
    }

    public void L(String string) {
        this.Y0 = string;
    }

    /*
     * Exception decompiling
     */
    public String L0() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl32.1 : ACONST_NULL : trying to set 1 previously set to 0
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

    public int M() {
        return this.f0;
    }

    public void M(int n2) {
        this.V = n2;
    }

    public void M(String string) {
        this.Q0 = string;
    }

    /*
     * Exception decompiling
     */
    public String M0() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl32.1 : LDC : trying to set 1 previously set to 0
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

    public int N() {
        return this.g0;
    }

    public void N(int n2) {
        this.e0 = n2;
    }

    public void N(String string) {
        this.I0 = string;
    }

    public int N0() {
        return this.f1;
    }

    public String O() {
        return this.K;
    }

    public void O(int n2) {
        this.e1 = n2;
    }

    public void O(String string) {
        this.a1 = string;
    }

    public int O0() {
        return this.B0;
    }

    public String P() {
        return this.L;
    }

    public void P(int n2) {
        this.d1 = n2;
    }

    public void P(String string) {
        this.X = string;
    }

    public String P0() {
        return this.C0;
    }

    public String Q() {
        return this.U;
    }

    public void Q(int n2) {
        this.p0 = n2;
    }

    public void Q(String string) {
        this.j1 = string;
    }

    public int Q0() {
        return this.D0;
    }

    public String R() {
        return this.x0;
    }

    public void R(int n2) {
        this.q0 = n2;
    }

    public void R(String string) {
        this.b0 = string;
    }

    public b R0() {
        return this.g1;
    }

    public String S() {
        if (!TextUtils.isEmpty((CharSequence)this.u0())) {
            try {
                URL uRL = new URL(this.u0());
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(uRL.getProtocol());
                stringBuilder.append("://");
                stringBuilder.append(uRL.getHost());
                String string = stringBuilder.toString();
                return string;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
        return "";
    }

    public void S(int n2) {
        this.K0 = n2;
    }

    public void S(String string) {
        this.l1 = string;
    }

    public int S0() {
        return this.w;
    }

    public String T() {
        return this.z0;
    }

    public void T(int n2) {
        this.s0 = n2;
    }

    public void T(String string) {
        this.S0 = string;
    }

    public int T0() {
        return this.v0;
    }

    public String U() {
        return this.G;
    }

    public void U(int n2) {
        this.Z = n2;
    }

    public void U(String string) {
        this.j0 = string;
    }

    public String U0() {
        return this.Q;
    }

    public String V() {
        return this.H;
    }

    public void V(int n2) {
        this.S = n2;
    }

    public void V(String string) {
        this.k0 = string;
    }

    public int V0() {
        return this.V;
    }

    public String W() {
        return this.c0;
    }

    public void W(String string) {
        this.C0 = string;
    }

    public int W0() {
        return this.e0;
    }

    public int X() {
        return this.R;
    }

    public void X(String string) {
    }

    public int X0() {
        return this.e1;
    }

    public String Y() {
        return this.W;
    }

    public void Y(String string) {
        this.Q = string;
    }

    public int Y0() {
        return this.d1;
    }

    public String Z() {
        return this.J;
    }

    public void Z(String string) {
        this.L0 = string;
    }

    public int Z0() {
        return this.p0;
    }

    public void a(a a2) {
        this.N = a2;
    }

    public void a(b b2) {
        this.g1 = b2;
    }

    public void a(k k2) {
        this.Z0 = k2;
    }

    public void a(a.a a2) {
        this.h1 = a2;
    }

    @Override
    public void a(String string) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            string = this.w0 != 2 ? "learn more" : "install";
        }
        super.a(string);
    }

    public void a(HashMap<String, String> hashMap) {
        this.F0 = hashMap;
    }

    public void a(List<String> list) {
        this.q = list;
    }

    public void a(Map<String, String> map) {
        this.X0 = map;
    }

    public void a(boolean bl) {
        this.i1 = bl;
    }

    public boolean a(long l2, long l3) {
        if (this.b(l2)) {
            return false;
        }
        long l4 = System.currentTimeMillis();
        if (this.F0() > 0L) {
            return this.j() + 1000L * this.F0() >= l4;
        }
        return l3 + this.j() >= l4;
    }

    public int a0() {
        return this.A;
    }

    public void a0(String string) {
        this.r0 = string;
    }

    public String a1() {
        return this.L0;
    }

    public void b(boolean bl) {
        this.G0 = bl;
    }

    public boolean b(long l2) {
        long l3 = System.currentTimeMillis();
        if (this.E0() > 0L) {
            return this.j() + 1000L * this.E0() >= l3;
        }
        return l2 + this.j() >= l3;
    }

    public int b0() {
        return this.z;
    }

    public void b0(String string) {
        this.o0 = string;
    }

    public String b1() {
        return this.r0;
    }

    public void c(long l2) {
        this.v = l2;
    }

    public void c(boolean bl) {
        this.J0 = bl;
    }

    public int c0() {
        return this.y;
    }

    public void c0(String string) {
        this.V0 = string;
    }

    public int c1() {
        return this.q0;
    }

    public void d(int n2) {
        this.F = n2;
    }

    public void d(long l2) {
        this.r = l2;
    }

    public void d(boolean bl) {
        this.d0 = bl;
    }

    public int d0() {
        return this.I;
    }

    public String d1() {
        return this.o0;
    }

    public void e(int n2) {
        this.t0 = n2;
    }

    public void e(long l2) {
        this.s = l2;
    }

    public void e(boolean bl) {
    }

    public int e0() {
        return this.x;
    }

    public int e1() {
        return this.K0;
    }

    public void f(int n2) {
        this.n0 = n2;
    }

    public a.a f0() {
        return this.h1;
    }

    public int f1() {
        return this.s0;
    }

    public void g(int n2) {
        this.k1 = n2;
    }

    public String g0() {
        return this.B;
    }

    public int g1() {
        return this.Z;
    }

    public void h(int n2) {
        this.l0 = n2;
    }

    public int h0() {
        return this.E;
    }

    public int h1() {
        return this.S;
    }

    /*
     * Exception decompiling
     */
    public String i(String var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl146 : ALOAD_1 : trying to set 1 previously set to 0
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

    public void i(int n2) {
        this.U0 = n2;
    }

    public int i0() {
        return this.C;
    }

    public String i1() {
        return this.V0;
    }

    public void j(int n2) {
        this.M0 = n2;
    }

    public void j(String string) {
        this.p = string;
    }

    public String j0() {
        return this.D;
    }

    public boolean j1() {
        return !TextUtils.isEmpty((CharSequence)this.j1) && !TextUtils.isEmpty((CharSequence)f.f.a.a.h);
    }

    public void k(int n2) {
        this.f0 = n2;
    }

    public void k(String string) {
        this.o = string;
    }

    public String k0() {
        return this.i0;
    }

    public boolean k1() {
        return this.G0;
    }

    public String l() {
        return this.p;
    }

    public void l(int n2) {
        this.g0 = n2;
    }

    public void l(String string) {
        this.E0 = string;
    }

    public int l0() {
        return this.w0;
    }

    public boolean l1() {
        return this.i1;
    }

    public int m() {
        return this.F;
    }

    public void m(int n2) {
        this.R = n2;
    }

    public void m(String string) {
        this.c1 = string;
    }

    public int m0() {
        return this.T0;
    }

    public boolean m1() {
        return this.J0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public List<String> n() {
        Exception exception;
        ArrayList arrayList;
        block5 : {
            ArrayList arrayList2;
            JSONArray jSONArray;
            int n2;
            String string = this.p();
            arrayList = null;
            try {
                boolean bl = TextUtils.isEmpty((CharSequence)string);
                arrayList = null;
                if (bl) return arrayList;
                jSONArray = new JSONArray(string);
                arrayList2 = new ArrayList();
                n2 = 0;
            }
            catch (Exception exception2) {
                // empty catch block
                break block5;
            }
            try {
                while (n2 < jSONArray.length()) {
                    arrayList2.add((Object)jSONArray.optString(n2));
                    ++n2;
                }
                return arrayList2;
            }
            catch (Exception exception3) {
                arrayList = arrayList2;
                exception = exception3;
            }
        }
        exception.printStackTrace();
        return arrayList;
    }

    public void n(int n2) {
        this.A = n2;
    }

    public void n(String string) {
        this.u0 = string;
    }

    public Map<String, String> n0() {
        return this.X0;
    }

    public boolean n1() {
        return this.d0;
    }

    public String o() {
        return this.o;
    }

    public void o(int n2) {
        this.z = n2;
    }

    public void o(String string) {
        this.u = string;
    }

    public String o0() {
        return this.Y0;
    }

    public String p() {
        return this.E0;
    }

    public void p(int n2) {
        this.y = n2;
    }

    public void p(String string) {
        this.t = string;
    }

    public String p0() {
        return this.Q0;
    }

    public a q() {
        return this.N;
    }

    public void q(int n2) {
        this.I = n2;
    }

    public void q(String string) {
        this.H0 = string;
    }

    public int q0() {
        return this.R0;
    }

    public String r() {
        return this.c1;
    }

    public void r(int n2) {
        this.x = n2;
    }

    public void r(String string) {
        this.M = string;
    }

    public String r0() {
        return this.I0;
    }

    public String s() {
        return this.u0;
    }

    public void s(int n2) {
        this.E = n2;
    }

    public void s(String string) {
        this.b1 = string;
    }

    public k s0() {
        return this.Z0;
    }

    public Map<Integer, String> t() {
        return this.e0(this.u0);
    }

    public void t(int n2) {
        this.C = n2;
    }

    public void t(String string) {
        this.Y = string;
    }

    public String t0() {
        return this.a1;
    }

    public HashMap<String, String> u() {
        return this.F0;
    }

    public void u(int n2) {
        this.w0 = n2;
    }

    public void u(String string) {
        this.h0 = string;
    }

    public String u0() {
        return this.X;
    }

    public String v() {
        return this.u;
    }

    public void v(int n2) {
        this.T0 = n2;
    }

    public void v(String string) {
        this.a0 = string;
    }

    public int v0() {
        return this.P0;
    }

    public String w() {
        return this.t;
    }

    public void w(int n2) {
        this.R0 = n2;
    }

    public void w(String string) {
        this.A0 = string;
    }

    public int w0() {
        return this.T;
    }

    public String x() {
        return this.H0;
    }

    public void x(int n2) {
        this.P0 = n2;
    }

    public void x(String string) {
        this.O0 = string;
    }

    public int x0() {
        return this.P;
    }

    public String y() {
        return this.M;
    }

    public void y(int n2) {
        this.T = n2;
    }

    public void y(String string) {
        this.K = string;
    }

    public int y0() {
        return this.O;
    }

    public int z() {
        return this.t0;
    }

    public void z(int n2) {
        this.P = n2;
    }

    public void z(String string) {
        this.L = string;
    }

    public int z0() {
        return this.y0;
    }
}

