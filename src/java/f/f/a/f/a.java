/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package f.f.a.f;

import android.content.Context;
import android.text.TextUtils;
import f.f.a.e.f.n;
import f.f.a.f.c;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class a {
    private int A = 86400;
    private int B = 30;
    private int C = 5;
    private int D = 0;
    private int E = 0;
    private List<Integer> F = new ArrayList();
    private long G;
    private long H;
    private int I;
    private int J;
    private String K = "";
    private String L = "";
    private String M = "";
    private String N = "";
    private String O = "";
    private Map<String, a> P;
    private String Q;
    private int R = 0;
    private boolean S = false;
    private int T = 120;
    private ArrayList<Integer> U;
    private String a;
    private long b;
    private int c;
    private long d = 86400L;
    private int e;
    private boolean f;
    private Map<String, String> g;
    private boolean h;
    private boolean i;
    private int j;
    private int k;
    private int l;
    private long m;
    private int n;
    private int o;
    private int p;
    private int q;
    private String r;
    private String s;
    private int t;
    private int u = 1;
    private int v = 1;
    private int w = 1;
    private int x = 0;
    private int y = 2;
    private String z;

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean O() {
        a a2 = c.b().a(f.f.a.e.c.a.i().f());
        if (a2 == null) return true;
        try {
            return a2.f;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return true;
    }

    /*
     * Exception decompiling
     */
    public static String a(Context var0, String var1) {
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

    /*
     * Exception decompiling
     */
    public static a g(String var0) {
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Map<String, a> h(String string) {
        try {
            if (TextUtils.isEmpty((CharSequence)string)) {
                return null;
            }
            HashMap hashMap = new HashMap();
            JSONObject jSONObject = new JSONObject(string);
            Iterator iterator = jSONObject.keys();
            do {
                if (!iterator.hasNext()) {
                    return hashMap;
                }
                String string2 = (String)iterator.next();
                a a2 = new a();
                JSONObject jSONObject2 = jSONObject.optJSONObject(string2);
                if (jSONObject2 != null) {
                    a2.a(jSONObject2);
                }
                hashMap.put((Object)string2, (Object)a2);
            } while (true);
        }
        catch (Exception exception) {
            if (!f.f.a.a.a) return null;
            {
                exception.printStackTrace();
                return null;
            }
        }
        catch (JSONException jSONException) {
            if (!f.f.a.a.a) return null;
            jSONException.printStackTrace();
        }
        return null;
    }

    public final int A() {
        return this.T;
    }

    public final void A(int n2) {
    }

    public final ArrayList<Integer> B() {
        return this.U;
    }

    public final void B(int n2) {
    }

    public final int C() {
        return this.A;
    }

    public final void C(int n2) {
    }

    public final int D() {
        return this.y;
    }

    public final void D(int n2) {
    }

    public final String E() {
        return this.z;
    }

    public final void E(int n2) {
        this.q = n2;
    }

    public final int F() {
        return this.u;
    }

    public final void F(int n2) {
    }

    public final int G() {
        return this.v;
    }

    public final void G(int n2) {
    }

    public final int H() {
        return this.w;
    }

    public final void H(int n2) {
        this.p = n2;
    }

    public final int I() {
        return this.x;
    }

    public final void I(int n2) {
    }

    public final int J() {
        return this.t;
    }

    public final void J(int n2) {
        this.n = n2;
    }

    public final String K() {
        return this.s;
    }

    public final int L() {
        return this.q;
    }

    public final String M() {
        return this.r;
    }

    public final int N() {
        return this.p;
    }

    public final int a() {
        return this.l;
    }

    public final void a(int n2) {
    }

    public final void a(long l2) {
    }

    public final void a(String string) {
    }

    public final void a(boolean bl) {
        this.i = bl;
    }

    public final int b() {
        return this.o;
    }

    public final void b(int n2) {
    }

    public final void b(long l2) {
        this.m = l2;
    }

    public final void b(String string) {
        this.s = string;
    }

    public final void b(boolean bl) {
        this.h = bl;
    }

    public final int c() {
        return this.n;
    }

    public final void c(int n2) {
    }

    public final void c(long l2) {
    }

    public final void c(String string) {
    }

    public final void c(boolean bl) {
        this.f = bl;
    }

    public final long d() {
        return this.m;
    }

    public final void d(int n2) {
    }

    public final void d(long l2) {
        this.G = l2;
    }

    public final void d(String string) {
        this.r = string;
    }

    public final void d(boolean bl) {
    }

    public final int e() {
        return this.I;
    }

    public final void e(int n2) {
        this.I = n2;
    }

    public final void e(long l2) {
        this.H = l2;
    }

    public final void e(String string) {
        this.a = string;
    }

    public final void e(boolean bl) {
        this.S = bl;
    }

    public final int f() {
        return this.J;
    }

    public final void f(int n2) {
        this.J = n2;
    }

    public final void f(long l2) {
    }

    public final void f(String string) {
    }

    public final long g() {
        return 1000L * this.G;
    }

    public final void g(int n2) {
        this.c = n2;
    }

    public final void g(long l2) {
    }

    public final long h() {
        return 1000L * this.H;
    }

    public final void h(int n2) {
        this.e = n2;
    }

    public final void h(long l2) {
        this.b = l2;
    }

    public final void i(int n2) {
        this.R = n2;
    }

    public final boolean i() {
        return this.i;
    }

    public final void j(int n2) {
        this.T = n2;
    }

    public final boolean j() {
        return this.h;
    }

    public final int k() {
        return this.c;
    }

    public final void k(int n2) {
    }

    public final int l() {
        return this.j;
    }

    public final void l(int n2) {
    }

    public final int m() {
        return this.k;
    }

    public final void m(int n2) {
    }

    public final String n() {
        return this.K;
    }

    public final boolean n(int n2) {
        return this.F.contains((Object)n2);
    }

    public final String o() {
        return this.L;
    }

    public final void o(int n2) {
        this.A = n2;
    }

    public final String p() {
        return this.M;
    }

    public final void p(int n2) {
        this.y = n2;
    }

    public final String q() {
        return this.N;
    }

    public final void q(int n2) {
        this.u = n2;
    }

    public final void r() {
        String string = Locale.getDefault().getLanguage();
        boolean bl = TextUtils.isEmpty((CharSequence)this.K);
        boolean bl2 = true;
        boolean bl3 = !bl && !TextUtils.isEmpty((CharSequence)this.L) && !TextUtils.isEmpty((CharSequence)this.M) && !TextUtils.isEmpty((CharSequence)this.N);
        if (!bl3) {
            if (!TextUtils.isEmpty((CharSequence)string) && string.equals((Object)"zh")) {
                this.K = "\u786e\u8ba4\u5173\u95ed\uff1f";
                this.L = "\u5173\u95ed\u540e\u60a8\u5c06\u4e0d\u4f1a\u83b7\u5f97\u4efb\u4f55\u5956\u52b1\u5662~ ";
                this.M = "\u786e\u8ba4\u5173\u95ed";
                this.N = "\u7ee7\u7eed\u89c2\u770b";
            } else {
                this.K = "Confirm to close? ";
                this.L = "You will not be rewarded after closing the window";
                this.M = "Close it";
                this.N = "Continue";
            }
        }
        if (TextUtils.isEmpty((CharSequence)this.K) || TextUtils.isEmpty((CharSequence)this.L) || TextUtils.isEmpty((CharSequence)this.M) || TextUtils.isEmpty((CharSequence)this.O)) {
            bl2 = false;
        }
        if (!bl2) {
            if (!TextUtils.isEmpty((CharSequence)string) && string.equals((Object)"zh")) {
                this.K = "\u786e\u8ba4\u5173\u95ed\uff1f";
                this.L = "\u5173\u95ed\u540e\u60a8\u5c06\u4e0d\u4f1a\u83b7\u5f97\u4efb\u4f55\u5956\u52b1\u5662~ ";
                this.M = "\u786e\u8ba4\u5173\u95ed";
                this.O = "\u7ee7\u7eed\u8bd5\u73a9";
                return;
            }
            this.K = "Confirm to close? ";
            this.L = "You will not be rewarded after closing the window";
            this.M = "Close it";
            this.O = "Continue";
        }
    }

    public final void r(int n2) {
        this.v = n2;
    }

    public final Map<String, a> s() {
        return this.P;
    }

    public final void s(int n2) {
        this.w = n2;
    }

    public final int t() {
        return this.B;
    }

    public final void t(int n2) {
        this.x = n2;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("cc=");
        stringBuilder.append(this.a);
        stringBuilder.append(" upal=");
        stringBuilder.append(this.b);
        stringBuilder.append(" cfc=");
        stringBuilder.append(this.c);
        stringBuilder.append(" getpf=");
        stringBuilder.append(this.d);
        stringBuilder.append(" uplc=");
        stringBuilder.append(this.e);
        stringBuilder.append(" rurl=");
        stringBuilder.append(this.h);
        return stringBuilder.toString();
    }

    public final int u() {
        return this.C;
    }

    public final void u(int n2) {
    }

    public final int v() {
        return this.D;
    }

    public final void v(int n2) {
    }

    public final int w() {
        return this.E;
    }

    public final void w(int n2) {
        this.t = n2;
    }

    public final String x() {
        return this.Q;
    }

    public final void x(int n2) {
    }

    public final int y() {
        return this.R;
    }

    public final void y(int n2) {
    }

    public final void z(int n2) {
    }

    public final boolean z() {
        return this.S;
    }

    public static final class a {
        private List<String> a;
        private List<String> b;
        private List<String> c;
        private List<String> d;

        public final List<String> a() {
            return this.a;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        public final void a(JSONObject jSONObject) {
            try {
                JSONArray jSONArray;
                JSONArray jSONArray2;
                JSONArray jSONArray3;
                JSONArray jSONArray4 = jSONObject.optJSONArray("x");
                if (jSONArray4 != null) {
                    this.a = n.a(jSONArray4);
                }
                if ((jSONArray = jSONObject.optJSONArray("y")) != null) {
                    this.b = n.a(jSONArray);
                }
                if ((jSONArray2 = jSONObject.optJSONArray("width")) != null) {
                    this.c = n.a(jSONArray2);
                }
                if ((jSONArray3 = jSONObject.optJSONArray("height")) == null) return;
                this.d = n.a(jSONArray3);
                return;
            }
            catch (Exception exception) {
                if (!f.f.a.a.a) return;
                exception.printStackTrace();
            }
        }

        public final List<String> b() {
            return this.b;
        }

        public final List<String> c() {
            return this.c;
        }

        public final List<String> d() {
            return this.d;
        }
    }

}

