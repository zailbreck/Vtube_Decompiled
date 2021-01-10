/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.webkit.DownloadListener
 *  android.webkit.WebChromeClient
 *  android.webkit.WebSettings
 *  android.webkit.WebViewClient
 *  f.f.a.k.c.a
 *  f.f.a.k.c.c
 *  f.f.a.k.g.b$a
 *  f.f.a.k.g.d
 *  f.f.a.k.g.f
 *  f.f.a.k.g.h
 *  f.f.a.k.g.m
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package f.f.a.k.g;

import android.content.Context;
import android.os.Handler;
import android.webkit.DownloadListener;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebViewClient;
import f.f.a.k.c.c;
import f.f.a.k.g.b;
import f.f.a.k.g.d;
import f.f.a.k.g.f;
import f.f.a.k.g.h;
import f.f.a.k.g.j;
import f.f.a.k.g.m;
import f.f.a.k.g.n;

public class b
extends f.f.a.k.c.a {
    protected m d;
    protected d e;
    protected h f;
    private Object g;
    private Object h;
    private String i;
    private f j;
    private String k;
    private boolean l = false;

    public b(Context context) {
        super(context);
    }

    static /* synthetic */ boolean a(b b2, boolean bl) {
        b2.l = bl;
        return bl;
    }

    /*
     * Exception decompiling
     */
    private boolean g() {
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

    public Object a(String string) {
        h h2 = this.f;
        if (h2 == null) {
            return null;
        }
        return h2.a(string);
    }

    protected final void a() {
        super.a();
        this.getSettings().setSavePassword(false);
        WebSettings webSettings = this.getSettings();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getSettings().getUserAgentString());
        stringBuilder.append(" WindVane/3.0.2");
        webSettings.setUserAgentString(stringBuilder.toString());
        if (this.d == null) {
            this.d = new m(this);
        }
        this.setWebViewChromeClient(this.d);
        this.c = new n();
        this.setWebViewClient((WebViewClient)this.c);
        if (this.e == null) {
            this.e = new j(this.b);
            this.setJsBridge(this.e);
        }
        this.f = new h(this.b, this);
    }

    public void c() {
        if (!this.l) {
            this.loadUrl("about:blank");
        }
    }

    public boolean d() {
        return this.l;
    }

    public void e() {
        try {
            this.setVisibility(8);
            this.removeAllViews();
            this.setDownloadListener(null);
            this.g = null;
            if (this.g()) {
                this.l = true;
                this.destroy();
                return;
            }
            new Handler().postDelayed((Runnable)new a(this), 5000L);
            return;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return;
        }
    }

    public void f() {
        super.b();
    }

    public String getCampaignId() {
        return this.i;
    }

    public d getJsBridge() {
        return this.e;
    }

    public Object getMraidObject() {
        return this.h;
    }

    public Object getObject() {
        return this.g;
    }

    public String getRid() {
        return this.k;
    }

    public f getWebViewListener() {
        return this.j;
    }

    public void setApiManagerContext(Context context) {
        h h2 = this.f;
        if (h2 != null) {
            h2.a(context);
        }
    }

    public void setApiManagerJSFactory(Object object) {
        h h2 = this.f;
        if (h2 != null) {
            h2.a(object);
        }
    }

    public void setCampaignId(String string) {
        this.i = string;
    }

    public void setJsBridge(d d2) {
        this.e = d2;
        d2.a((b)this);
    }

    public void setMraidObject(Object object) {
        this.h = object;
    }

    public void setObject(Object object) {
        this.g = object;
    }

    public void setRid(String string) {
        this.k = string;
    }

    public void setWebViewChromeClient(m m2) {
        this.d = m2;
        this.setWebChromeClient((WebChromeClient)m2);
    }

    public void setWebViewListener(f f2) {
        c c2;
        this.j = f2;
        m m2 = this.d;
        if (m2 != null) {
            m2.a(f2);
        }
        if ((c2 = this.c) != null) {
            c2.a(f2);
        }
    }
}

