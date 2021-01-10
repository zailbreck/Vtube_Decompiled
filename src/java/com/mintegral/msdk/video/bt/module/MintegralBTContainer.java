/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Configuration
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  android.widget.FrameLayout
 *  com.mintegral.msdk.playercommon.b
 *  com.mintegral.msdk.video.bt.module.MintegralBTContainer$b
 *  com.mintegral.msdk.video.bt.module.b
 *  com.mintegral.msdk.video.bt.module.d
 *  com.mintegral.msdk.video.bt.module.e
 *  com.mintegral.msdk.video.bt.module.f.a
 *  com.mintegral.msdk.video.bt.module.f.b
 *  com.mintegral.msdk.video.bt.module.g.f
 *  f.f.a.e.c.c
 *  f.f.a.e.e.a$b
 *  f.f.a.e.f.h
 *  f.f.a.e.f.o
 *  f.f.a.e.f.r
 *  f.f.a.j.d
 *  f.f.a.j.i
 *  java.io.File
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Collection
 *  java.util.Iterator
 *  java.util.LinkedHashMap
 *  java.util.List
 */
package com.mintegral.msdk.video.bt.module;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.mintegral.msdk.video.bt.module.MTGTempContainer;
import com.mintegral.msdk.video.bt.module.MintegralBTContainer;
import com.mintegral.msdk.video.bt.module.d;
import com.mintegral.msdk.video.bt.module.e;
import com.mintegral.msdk.video.bt.module.f.a;
import com.mintegral.msdk.video.bt.module.g.f;
import f.f.a.e.e.a;
import f.f.a.e.f.h;
import f.f.a.e.f.o;
import f.f.a.e.f.r;
import f.f.a.j.i;
import f.f.a.r.b.k.c;
import java.io.File;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public class MintegralBTContainer
extends f.f.a.r.b.g.a
implements f.f.a.r.b.d {
    private static final String F = MintegralBTContainer.class.getSimpleName();
    private com.mintegral.msdk.video.bt.module.f.b A;
    private String B;
    private String C;
    private String D;
    private List<String> E;
    private FrameLayout q;
    private com.mintegral.msdk.video.bt.module.b r;
    private f.f.a.k.g.b s;
    private LayoutInflater t;
    private Context u;
    private String v;
    private boolean w = false;
    private List<f.f.a.e.e.a> x;
    private a y;
    private f z;

    public MintegralBTContainer(Context context) {
        super(context);
        this.a(context);
    }

    public MintegralBTContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a(context);
    }

    private String a(f.f.a.s.f.a a2) {
        String string = MintegralBTContainer.super.b(a2);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("reward------ ");
        stringBuilder.append(string);
        h.d((String)"VideoCache", (String)stringBuilder.toString());
        boolean bl = string.endsWith(".dltmp");
        String string2 = "";
        if (bl) {
            try {
                i i2 = f.f.a.e.c.c.c().a(this.getContext(), string);
                string2 = i2.b(a2.l().d1());
                i2.a((f.f.a.j.d)new b((MintegralBTContainer)this, a2), a2.l().d1());
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("\u4e0a\u9762");
                stringBuilder2.append(string2);
                stringBuilder2.append("playUrl-->");
                stringBuilder2.append(a2.l().d1());
                stringBuilder2.append("title");
                stringBuilder2.append(a2.l().c());
                stringBuilder2.append(" id-->");
                stringBuilder2.append(a2.l().e());
                h.d((String)"VideoCache", (String)stringBuilder2.toString());
                return string2;
            }
            catch (Throwable throwable) {
                throwable.printStackTrace();
                return string2;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return string2;
            }
        }
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("\u4e0b\u9762");
        stringBuilder3.append(string2);
        h.d((String)"VideoCache", (String)stringBuilder3.toString());
        String string3 = MintegralBTContainer.super.b(a2);
        StringBuilder stringBuilder4 = new StringBuilder();
        stringBuilder4.append("\u4e0b\u9762");
        stringBuilder4.append(string3);
        h.d((String)"VideoCache", (String)stringBuilder4.toString());
        return string3;
    }

    static /* synthetic */ List a(MintegralBTContainer mintegralBTContainer) {
        return mintegralBTContainer.x;
    }

    static /* synthetic */ String b(MintegralBTContainer mintegralBTContainer) {
        return mintegralBTContainer.c;
    }

    private String b(f.f.a.s.f.a a2) {
        String string = a2.l().d1();
        if (a2 != null) {
            try {
                String string2;
                boolean bl;
                if ((a2.i() == 5 || a2.i() == 6) && !r.a((String)(string2 = a2.d())) && (bl = new File(string2).exists())) {
                    return string2;
                }
            }
            catch (Throwable throwable) {
                h.b((String)F, (String)throwable.getMessage(), (Throwable)throwable);
            }
        }
        return string;
    }

    static /* synthetic */ String c(MintegralBTContainer mintegralBTContainer) {
        return mintegralBTContainer.d;
    }

    public void a(Context context) {
        this.u = context;
        this.t = LayoutInflater.from((Context)context);
    }

    @Override
    protected final void a(String string) {
        f f2 = this.z;
        if (f2 != null) {
            f2.b(string);
        }
        super.a(string);
    }

    public int b(String string) {
        return o.a((Context)this.getContext(), (String)string, (String)"layout");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void b() {
        if (this.w) {
            return;
        }
        this.w = true;
        super.b();
        List<String> list = this.E;
        if (list != null && list.size() > 0) {
            Iterator iterator = this.E.iterator();
            while (iterator.hasNext()) {
                com.mintegral.msdk.playercommon.b.b((String)((String)iterator.next()));
            }
        }
        try {
            if (this.s != null) {
                ViewGroup viewGroup = (ViewGroup)this.s.getParent();
                if (viewGroup != null) {
                    viewGroup.removeAllViews();
                }
                this.s.c();
                this.s.e();
            }
            if (this.A != null) {
                this.A = null;
            }
            if (this.y != null) {
                this.y = null;
            }
            if (this.u != null) {
                this.u = null;
            }
            if (this.x != null && this.x.size() > 0) {
                for (f.f.a.e.e.a a2 : this.x) {
                    if (a2 == null || a2.R0() == null) continue;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(this.c);
                    stringBuilder.append("_");
                    stringBuilder.append(a2.L0());
                    stringBuilder.append("_");
                    stringBuilder.append(a2.R0().d());
                    f.f.a.s.a.b(stringBuilder.toString());
                }
            }
            f.f.a.r.a.a.b.b().b(this.v);
            f.f.a.r.a.a.b.b().c(this.c);
            return;
        }
        catch (Throwable throwable) {
            h.a((String)F, (String)throwable.getMessage());
            return;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void c() {
        super.c();
        LinkedHashMap<String, View> linkedHashMap = f.f.a.r.a.a.b.b().b(this.c, this.C);
        if (linkedHashMap == null) return;
        try {
            if (linkedHashMap.size() <= 0) return;
            for (View view : linkedHashMap.values()) {
                if (!(view instanceof d)) continue;
                ((d)view).b();
            }
            return;
        }
        catch (Throwable throwable) {
            h.a((String)F, (String)throwable.getMessage());
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void d() {
        super.d();
        LinkedHashMap<String, View> linkedHashMap = f.f.a.r.a.a.b.b().b(this.c, this.C);
        if (linkedHashMap == null) return;
        try {
            if (linkedHashMap.size() <= 0) return;
            for (View view : linkedHashMap.values()) {
                if (!(view instanceof d)) continue;
                ((d)view).c();
            }
            return;
        }
        catch (Throwable throwable) {
            h.a((String)F, (String)throwable.getMessage());
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void e() {
        LinkedHashMap<String, View> linkedHashMap = f.f.a.r.a.a.b.b().b(this.c, this.C);
        if (linkedHashMap == null) return;
        try {
            if (linkedHashMap.size() <= 0) return;
            for (View view : linkedHashMap.values()) {
                if (view instanceof MTGTempContainer) {
                    ((MTGTempContainer)view).l();
                    continue;
                }
                if (!(view instanceof e)) continue;
                ((e)view).c();
            }
            return;
        }
        catch (Throwable throwable) {
            h.a((String)F, (String)throwable.getMessage());
        }
    }

    /*
     * Exception decompiling
     */
    public void f() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl398 : ALOAD_0 : trying to set 1 previously set to 0
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

    @Override
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    protected void onDetachedFromWindow() {
        FrameLayout.super.onDetachedFromWindow();
    }

    public void setBTContainerCallback(a a2) {
        this.y = a2;
    }

    /*
     * Exception decompiling
     */
    public void setCampaignDownLoadTasks(List<f.f.a.s.f.a> var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl12 : ALOAD_2 : trying to set 1 previously set to 0
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

    public void setCampaigns(List<f.f.a.e.e.a> list) {
        this.x = list;
    }

    public void setJSFactory(c c2) {
        this.p = c2;
    }

    public void setShowRewardVideoListener(f f2) {
        this.z = f2;
    }
}

