/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.text.TextUtils
 *  f.f.a.a
 *  f.f.a.e.b.c.c
 *  f.f.a.e.b.c.e
 *  f.f.a.e.f.e
 *  f.f.a.e.f.f
 *  f.f.a.e.f.t
 *  java.io.File
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 */
package f.f.a.s.f;

import android.net.Uri;
import android.text.TextUtils;
import f.f.a.e.b.c.c;
import f.f.a.e.b.c.e;
import f.f.a.e.f.f;
import f.f.a.e.f.t;
import f.f.a.s.f.k;
import java.io.File;
import java.util.List;

public final class l {
    private static String b = "ResourceManager";
    private String a;

    private l() {
        this.a = e.b((c)c.f);
    }

    /* synthetic */ l(k k2) {
    }

    public static l a() {
        return a.a;
    }

    private String a(String string2, String string3, File file) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append("/");
        stringBuilder.append(f.f.a.e.f.a.a(t.a((String)string2)));
        String string4 = f.a((String)string3, (String)stringBuilder.toString());
        if (TextUtils.isEmpty((CharSequence)string4)) {
            string4 = f.b((File)file);
        }
        return string4;
    }

    /*
     * Exception decompiling
     */
    public final String a(String var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl128 : FAKE_TRY : trying to set 1 previously set to 0
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

    public final String a(String string2, byte[] arrby) {
        void var19_3 = this;
        synchronized (var19_3) {
            String string3;
            block15 : {
                String string4;
                block14 : {
                    string4 = "unknow exception ";
                    if (arrby != null) {
                        try {
                            if (arrby.length <= 0) break block14;
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append(this.a);
                            stringBuilder.append("/");
                            stringBuilder.append(f.f.a.e.f.a.a(t.a((String)string2)));
                            stringBuilder.append(".zip");
                            String string5 = stringBuilder.toString();
                            File file = new File(string5);
                            if (f.a((byte[])arrby, (File)file)) {
                                Uri uri = Uri.parse((String)string2);
                                List list = uri.getQueryParameters("nc");
                                if (list != null && list.size() != 0) {
                                    string4 = l.super.a(string2, string5, file);
                                } else {
                                    String string6;
                                    List list2 = uri.getQueryParameters("md5filename");
                                    if (list2 != null && list2.size() > 0 && !TextUtils.isEmpty((CharSequence)(string6 = (String)list2.get(0))) && string6.equals((Object)f.f.a.e.f.e.a((File)file))) {
                                        string4 = l.super.a(string2, string5, file);
                                    }
                                }
                            }
                            if (TextUtils.isEmpty((CharSequence)string4)) break block14;
                            f.b((File)file);
                        }
                        catch (Exception exception) {
                            if (f.f.a.a.a) {
                                exception.printStackTrace();
                            }
                            string3 = exception.getMessage();
                            break block15;
                        }
                    }
                }
                string3 = string4;
            }
            return string3;
            finally {
            }
        }
    }

    private static final class a {
        public static l a = new l(null);
    }

}

