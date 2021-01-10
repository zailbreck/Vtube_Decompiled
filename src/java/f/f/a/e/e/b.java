/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  f.f.a.e.b.b
 *  f.f.a.e.c.a
 *  f.f.a.e.c.b.b
 *  f.f.a.e.e.a
 *  f.f.a.e.f.d
 *  f.f.a.e.f.h
 *  f.f.a.m.c
 *  f.f.a.p.a
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.List
 *  org.json.JSONObject
 */
package f.f.a.e.e;

import android.content.Context;
import android.os.Build;
import f.f.a.e.e.a;
import f.f.a.e.f.d;
import f.f.a.e.f.h;
import f.f.a.m.c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

public class b
implements f.f.a.p.a,
Serializable {
    private static final String m = b.class.getSimpleName();
    private String b;
    private int c;
    private String d;
    private int e;
    private String f;
    private int g;
    public ArrayList<a> h;
    private List<c> i;
    private StringBuffer j = new StringBuffer();
    private HashMap<String, String> k;
    private int l;

    public static b a(JSONObject jSONObject) {
        return b.a(jSONObject, "");
    }

    /*
     * Exception decompiling
     */
    public static b a(JSONObject var0, String var1) {
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

    private Object a(Object object) {
        if (object == null) {
            object = "";
        }
        return object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public String a() {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        block4 : {
            block3 : {
                StringBuffer stringBuffer = this.j;
                if (stringBuffer != null && stringBuffer.length() > 0) {
                    return this.j.toString();
                }
                try {
                    string3 = d.s();
                    string4 = d.l((Context)f.f.a.e.c.a.i().e());
                    string2 = d.k((Context)f.f.a.e.c.a.i().e());
                    boolean bl = f.f.a.e.c.b.b.b().a("authority_general_data");
                    if (!bl) break block3;
                    string5 = String.valueOf((int)d.z((Context)f.f.a.e.c.a.i().e()));
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(d.u((Context)f.f.a.e.c.a.i().e()));
                    stringBuilder.append("x");
                    stringBuilder.append(d.v((Context)f.f.a.e.c.a.i().e()));
                    string = stringBuilder.toString();
                    break block4;
                }
                catch (Throwable throwable) {
                    h.b((String)m, (String)throwable.getMessage(), (Throwable)throwable);
                    return this.j.toString();
                }
            }
            string = string5 = "";
        }
        StringBuffer stringBuffer = this.j;
        stringBuffer.append(this.b());
        stringBuffer.append("|");
        stringBuffer.append(this.a((Object)"1"));
        stringBuffer.append("|");
        stringBuffer.append(this.a((Object)Build.VERSION.RELEASE));
        stringBuffer.append("|");
        stringBuffer.append(this.a((Object)"MAL_10.5.01"));
        stringBuffer.append("|");
        stringBuffer.append(this.a((Object)d.m()));
        stringBuffer.append("|");
        stringBuffer.append(this.a((Object)string));
        stringBuffer.append("|");
        stringBuffer.append(this.a((Object)d.p((Context)f.f.a.e.c.a.i().e())));
        stringBuffer.append("|");
        stringBuffer.append(this.a((Object)d.o((Context)f.f.a.e.c.a.i().e())));
        stringBuffer.append("|");
        stringBuffer.append(this.a((Object)string5));
        stringBuffer.append("|");
        stringBuffer.append(this.a((Object)string2));
        stringBuffer.append(this.a((Object)string4));
        stringBuffer.append("|");
        stringBuffer.append(this.a((Object)d.i((Context)f.f.a.e.c.a.i().e())));
        stringBuffer.append("|");
        stringBuffer.append(this.a((Object)d.q((Context)f.f.a.e.c.a.i().e())));
        stringBuffer.append("|");
        stringBuffer.append(this.a((Object)d.m((Context)f.f.a.e.c.a.i().e())));
        stringBuffer.append("|");
        stringBuffer.append(this.a((Object)string3));
        stringBuffer.append("|");
        stringBuffer.append(this.a((Object)""));
        stringBuffer.append("|");
        stringBuffer.append(this.a((Object)d.n()));
        stringBuffer.append("|");
        stringBuffer.append(this.a((Object)""));
        stringBuffer.append("|");
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(f.f.a.e.b.b.k);
        stringBuilder.append(",");
        stringBuilder.append(f.f.a.e.b.b.l);
        stringBuffer.append(this.a((Object)stringBuilder.toString()));
        this.j = stringBuffer;
        return this.j.toString();
    }

    public void a(int n2) {
        this.g = n2;
    }

    public void a(String string) {
    }

    public void a(ArrayList<a> arrayList) {
        this.h = arrayList;
    }

    public void a(HashMap<String, String> hashMap) {
        this.k = hashMap;
    }

    public void a(List<c> list) {
        this.i = list;
    }

    public int b() {
        return this.g;
    }

    public void b(int n2) {
        this.e = n2;
    }

    public void b(String string) {
    }

    public ArrayList<a> c() {
        return this.h;
    }

    public void c(int n2) {
        this.c = n2;
    }

    public void c(String string) {
    }

    public String d() {
        return this.b;
    }

    public void d(int n2) {
        this.l = n2;
    }

    public void d(String string) {
        this.b = string;
    }

    public int e() {
        return this.e;
    }

    public void e(int n2) {
    }

    public void e(String string) {
        this.d = string;
    }

    public int f() {
        return this.c;
    }

    public void f(String string) {
    }

    public String g() {
        return this.d;
    }

    public void g(String string) {
    }

    public int h() {
        return this.l;
    }

    public void h(String string) {
        this.f = string;
    }

    public List<c> i() {
        return this.i;
    }

    public void i(String string) {
    }

    public HashMap<String, String> j() {
        return this.k;
    }

    public String k() {
        return this.f;
    }
}

