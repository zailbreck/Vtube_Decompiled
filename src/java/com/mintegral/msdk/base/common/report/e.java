/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  java.io.UnsupportedEncodingException
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuffer
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.URLEncoder
 */
package com.mintegral.msdk.base.common.report;

import android.content.Context;
import android.text.TextUtils;
import com.mintegral.msdk.base.common.report.d;
import com.mintegral.msdk.base.common.report.e;
import com.mintegral.msdk.base.common.report.e$b;
import com.mintegral.msdk.base.common.report.e$c;
import f.f.a.e.b.h.g;
import f.f.a.e.b.h.k.c;
import f.f.a.e.e.l;
import f.f.a.e.f.h;
import f.f.a.h.b;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class e {
    public static final String a = "e";

    /*
     * Exception decompiling
     */
    public static c a(Context var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl160 : NEW : trying to set 1 previously set to 0
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
    public static c a(Context var0, l var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl34 : ALOAD_2 : trying to set 1 previously set to 0
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

    public static c a(Context context, String string) {
        c c2 = e.a(context);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(f.f.a.e.c.a.i().f());
        stringBuilder.append("");
        c2.a("app_id", stringBuilder.toString());
        if (!TextUtils.isEmpty((CharSequence)string)) {
            try {
                c2.a("data", URLEncoder.encode((String)string, (String)"utf-8"));
                return c2;
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                unsupportedEncodingException.printStackTrace();
            }
        }
        return c2;
    }

    public static c a(String string, Context context) {
        c c2 = e.a(context);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(f.f.a.e.c.a.i().f());
        stringBuilder.append("");
        c2.a("app_id", stringBuilder.toString());
        if (!TextUtils.isEmpty((CharSequence)string)) {
            try {
                c2.a("data", URLEncoder.encode((String)string, (String)"utf-8"));
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                unsupportedEncodingException.printStackTrace();
            }
        }
        c2.a("m_sdk", "msdk");
        return c2;
    }

    public static c a(String string, Context context, String string2) {
        c c2 = e.a(context);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(f.f.a.e.c.a.i().f());
        stringBuilder.append("");
        c2.a("app_id", stringBuilder.toString());
        c2.a("unit_id", string2);
        if (!TextUtils.isEmpty((CharSequence)string)) {
            try {
                c2.a("data", URLEncoder.encode((String)string, (String)"utf-8"));
            }
            catch (UnsupportedEncodingException unsupportedEncodingException) {
                unsupportedEncodingException.printStackTrace();
            }
        }
        c2.a("m_sdk", "msdk");
        return c2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(Context context, f.f.a.e.e.a a2, int n2, int n3) {
        try {
            f.f.a.f.a a3;
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append("key=2000056&");
            if (a2 != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("cid=");
                stringBuilder.append(a2.e());
                stringBuilder.append("&");
                stringBuffer.append(stringBuilder.toString());
            }
            if ((a3 = f.f.a.f.c.b().a(f.f.a.e.c.a.i().f())) == null) {
                a3 = f.f.a.f.c.b().a();
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("unit_id=");
            stringBuilder.append(a3.E());
            stringBuilder.append("&");
            stringBuffer.append(stringBuilder.toString());
            String string = f.f.a.e.f.d.s();
            if (!TextUtils.isEmpty((CharSequence)string)) {
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("gaid=");
                stringBuilder2.append(string);
                stringBuilder2.append("&");
                stringBuffer.append(stringBuilder2.toString());
            }
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("action_type=");
            stringBuilder3.append(n2);
            stringBuilder3.append("&");
            stringBuffer.append(stringBuilder3.toString());
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append("jm_a=");
            stringBuilder4.append(b.a(context).c());
            stringBuilder4.append("&");
            stringBuffer.append(stringBuilder4.toString());
            StringBuilder stringBuilder5 = new StringBuilder();
            stringBuilder5.append("jm_n=");
            stringBuilder5.append(b.a(context).a());
            stringBuilder5.append("&");
            stringBuffer.append(stringBuilder5.toString());
            if (a2 != null) {
                StringBuilder stringBuilder6 = new StringBuilder();
                stringBuilder6.append("rid_n=");
                stringBuilder6.append(a2.M0());
                stringBuilder6.append("&");
                stringBuffer.append(stringBuilder6.toString());
            }
            StringBuilder stringBuilder7 = new StringBuilder();
            stringBuilder7.append("result_type=");
            stringBuilder7.append(n3);
            stringBuffer.append(stringBuilder7.toString());
            if (com.mintegral.msdk.base.common.report.a.b().a()) {
                com.mintegral.msdk.base.common.report.a.b().a(stringBuffer.toString());
                return;
            }
            new d(context).b(stringBuffer.toString());
            return;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return;
        }
    }

    public static void a(Context context, f.f.a.e.e.a a2, String string, String string2, int n2) {
        if (context != null && a2 != null) {
            try {
                if (!TextUtils.isEmpty((CharSequence)string2)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000074&");
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("network_type=");
                    stringBuilder.append(f.f.a.e.f.d.z(context));
                    stringBuilder.append("&");
                    stringBuffer.append(stringBuilder.toString());
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("unit_id=");
                    stringBuilder2.append(string2);
                    stringBuilder2.append("&");
                    stringBuffer.append(stringBuilder2.toString());
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("cid=");
                    stringBuilder3.append(a2.e());
                    stringBuilder3.append("&");
                    stringBuffer.append(stringBuilder3.toString());
                    StringBuilder stringBuilder4 = new StringBuilder();
                    stringBuilder4.append("type=");
                    stringBuilder4.append(n2);
                    stringBuilder4.append("&");
                    stringBuffer.append(stringBuilder4.toString());
                    StringBuilder stringBuilder5 = new StringBuilder();
                    stringBuilder5.append("rid_n=");
                    stringBuilder5.append(a2.M0());
                    stringBuilder5.append("&");
                    stringBuffer.append(stringBuilder5.toString());
                    StringBuilder stringBuilder6 = new StringBuilder();
                    stringBuilder6.append("url=");
                    stringBuilder6.append(URLEncoder.encode((String)string, (String)"utf-8"));
                    stringBuffer.append(stringBuilder6.toString());
                    if (com.mintegral.msdk.base.common.report.a.b().a()) {
                        com.mintegral.msdk.base.common.report.a.b().a(stringBuffer.toString());
                        return;
                    }
                    e.a(context, stringBuffer.toString(), string2);
                    return;
                }
            }
            catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
    }

    public static void a(Context context, f.f.a.e.e.a a2, String string, String string2, int n2, int n3) {
        if (context != null && a2 != null) {
            try {
                if (!TextUtils.isEmpty((CharSequence)string2)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000075&");
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("network_type=");
                    stringBuilder.append(f.f.a.e.f.d.z(context));
                    stringBuilder.append("&");
                    stringBuffer.append(stringBuilder.toString());
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("unit_id=");
                    stringBuilder2.append(string2);
                    stringBuilder2.append("&");
                    stringBuffer.append(stringBuilder2.toString());
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("cid=");
                    stringBuilder3.append(a2.e());
                    stringBuilder3.append("&");
                    stringBuffer.append(stringBuilder3.toString());
                    StringBuilder stringBuilder4 = new StringBuilder();
                    stringBuilder4.append("type=");
                    stringBuilder4.append(n2);
                    stringBuilder4.append("&");
                    stringBuffer.append(stringBuilder4.toString());
                    StringBuilder stringBuilder5 = new StringBuilder();
                    stringBuilder5.append("rid_n=");
                    stringBuilder5.append(a2.M0());
                    stringBuilder5.append("&");
                    stringBuffer.append(stringBuilder5.toString());
                    StringBuilder stringBuilder6 = new StringBuilder();
                    stringBuilder6.append("statue=");
                    stringBuilder6.append(n3);
                    stringBuilder6.append("&");
                    stringBuffer.append(stringBuilder6.toString());
                    StringBuilder stringBuilder7 = new StringBuilder();
                    stringBuilder7.append("url=");
                    stringBuilder7.append(URLEncoder.encode((String)string, (String)"utf-8"));
                    stringBuffer.append(stringBuilder7.toString());
                    if (com.mintegral.msdk.base.common.report.a.b().a()) {
                        com.mintegral.msdk.base.common.report.a.b().a(stringBuffer.toString());
                        return;
                    }
                    e.a(context, stringBuffer.toString(), string2);
                    return;
                }
            }
            catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
    }

    public static void a(Context context, f.f.a.e.e.a a2, String string, String string2, int n2, String string3) {
        if (context != null && a2 != null) {
            try {
                if (!TextUtils.isEmpty((CharSequence)string2)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000073&");
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("network_type=");
                    stringBuilder.append(f.f.a.e.f.d.z(context));
                    stringBuilder.append("&");
                    stringBuffer.append(stringBuilder.toString());
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("unit_id=");
                    stringBuilder2.append(string2);
                    stringBuilder2.append("&");
                    stringBuffer.append(stringBuilder2.toString());
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("cid=");
                    stringBuilder3.append(a2.e());
                    stringBuilder3.append("&");
                    stringBuffer.append(stringBuilder3.toString());
                    StringBuilder stringBuilder4 = new StringBuilder();
                    stringBuilder4.append("reason=");
                    stringBuilder4.append(string3);
                    stringBuilder4.append("&");
                    stringBuffer.append(stringBuilder4.toString());
                    StringBuilder stringBuilder5 = new StringBuilder();
                    stringBuilder5.append("result=");
                    stringBuilder5.append(n2);
                    stringBuilder5.append("&");
                    stringBuffer.append(stringBuilder5.toString());
                    StringBuilder stringBuilder6 = new StringBuilder();
                    stringBuilder6.append("rid_n=");
                    stringBuilder6.append(a2.M0());
                    stringBuilder6.append("&");
                    stringBuffer.append(stringBuilder6.toString());
                    StringBuilder stringBuilder7 = new StringBuilder();
                    stringBuilder7.append("url=");
                    stringBuilder7.append(URLEncoder.encode((String)string, (String)"utf-8"));
                    stringBuffer.append(stringBuilder7.toString());
                    if (com.mintegral.msdk.base.common.report.a.b().a()) {
                        com.mintegral.msdk.base.common.report.a.b().a(stringBuffer.toString());
                        return;
                    }
                    e.a(context, stringBuffer.toString(), string2);
                    return;
                }
            }
            catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
    }

    private static void a(Context context, String string, String string2) {
        if (context != null && !TextUtils.isEmpty((CharSequence)string) && !TextUtils.isEmpty((CharSequence)string2)) {
            try {
                e$b e$b = new e$b(context);
                c c2 = e.a(string, context, string2);
                e$b.b(0, f.f.a.e.b.h.j.d.a().b, c2, new e$c(){

                    public final void a(String string) {
                        h.d(e.a, string);
                    }

                    public final void b(String string) {
                        h.d(e.a, string);
                    }
                });
                return;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                h.d(a, exception.getMessage());
            }
        }
    }

    public static void a(Context context, String string, String string2, int n2, String string3) {
        if (context != null) {
            try {
                if (!TextUtils.isEmpty((CharSequence)string2)) {
                    StringBuffer stringBuffer = new StringBuffer();
                    stringBuffer.append("key=2000076&");
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("network_type=");
                    stringBuilder.append(f.f.a.e.f.d.z(context));
                    stringBuilder.append("&");
                    stringBuffer.append(stringBuilder.toString());
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("unit_id=");
                    stringBuilder2.append(string2);
                    stringBuilder2.append("&");
                    stringBuffer.append(stringBuilder2.toString());
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("reason=");
                    stringBuilder3.append(string3);
                    stringBuilder3.append("&");
                    stringBuffer.append(stringBuilder3.toString());
                    StringBuilder stringBuilder4 = new StringBuilder();
                    stringBuilder4.append("result=");
                    stringBuilder4.append(n2);
                    stringBuilder4.append("&");
                    stringBuffer.append(stringBuilder4.toString());
                    StringBuilder stringBuilder5 = new StringBuilder();
                    stringBuilder5.append("url=");
                    stringBuilder5.append(URLEncoder.encode((String)string, (String)"utf-8"));
                    stringBuffer.append(stringBuilder5.toString());
                    if (com.mintegral.msdk.base.common.report.a.b().a()) {
                        com.mintegral.msdk.base.common.report.a.b().a(stringBuffer.toString());
                        return;
                    }
                    e.a(context, stringBuffer.toString(), string2);
                    return;
                }
            }
            catch (Throwable throwable) {
                throwable.printStackTrace();
            }
        }
    }
}

