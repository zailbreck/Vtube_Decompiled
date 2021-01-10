/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Log
 *  android.webkit.WebResourceResponse
 *  com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView
 *  j.a0
 *  j.b0
 *  j.e
 *  j.y
 *  j.y$a
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.concurrent.CountDownLatch
 */
package f.g.a.b;

import android.os.Build;
import android.util.Log;
import android.webkit.WebResourceResponse;
import com.pichillilorenzo.flutter_inappwebview.InAppWebView.InAppWebView;
import f.g.a.b.f;
import f.g.a.r;
import io.flutter.plugin.common.MethodChannel;
import j.a0;
import j.b0;
import j.e;
import j.y;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class d {
    protected List<f.g.a.b.a> a = new ArrayList();

    public WebResourceResponse a(InAppWebView inAppWebView, String string2) {
        return this.a(inAppWebView, string2, this.b(string2));
    }

    /*
     * Exception decompiling
     */
    public WebResourceResponse a(InAppWebView var1, String var2, f var3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl58 : ALOAD : trying to set 1 previously set to 0
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

    public WebResourceResponse a(InAppWebView inAppWebView, String string2, String string3) {
        return this.a(inAppWebView, string2, this.a(string3));
    }

    public f a(String string2) {
        f f2 = f.k;
        if (string2.equals((Object)"text/css")) {
            return f.e;
        }
        if (string2.equals((Object)"image/svg+xml")) {
            return f.h;
        }
        if (string2.startsWith("image/")) {
            return f.d;
        }
        if (string2.startsWith("font/")) {
            return f.g;
        }
        if (!(string2.startsWith("audio/") || string2.startsWith("video/") || string2.equals((Object)"application/ogg"))) {
            if (string2.endsWith("javascript")) {
                return f.f;
            }
            if (string2.startsWith("text/")) {
                return f.c;
            }
        } else {
            f2 = f.i;
        }
        return f2;
    }

    public List<f.g.a.b.a> a() {
        return this.a;
    }

    public f b(String string2) {
        f f2 = f.k;
        if (string2.startsWith("http://") || string2.startsWith("https://")) {
            y.a a2 = new y.a();
            a2.b(string2);
            a2.d();
            y y2 = a2.a();
            a0 a02 = null;
            try {
                a02 = r.a().a(y2).execute();
                if (a02.b("content-type") != null) {
                    String[] arrstring = a02.b("content-type").split(";");
                    String string3 = arrstring[0].trim();
                    if (arrstring.length > 1 && arrstring[1].contains((CharSequence)"charset=")) {
                        arrstring[1].replace((CharSequence)"charset=", (CharSequence)"").trim();
                    }
                    a02.a().close();
                    a02.close();
                    f f3 = this.a(string3);
                    return f3;
                }
            }
            catch (Exception exception) {
                if (a02 != null) {
                    a02.a().close();
                    a02.close();
                }
                exception.printStackTrace();
                Log.e((String)"ContentBlockerHandler", (String)exception.getMessage());
            }
        }
        return f2;
    }

}

