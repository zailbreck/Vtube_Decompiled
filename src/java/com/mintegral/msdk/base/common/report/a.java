/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Looper
 *  android.os.Message
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.net.URLEncoder
 *  java.util.ArrayList
 *  java.util.Stack
 *  java.util.concurrent.atomic.AtomicInteger
 */
package com.mintegral.msdk.base.common.report;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.mintegral.msdk.base.common.report.BatchReportMessage;
import com.mintegral.msdk.base.common.report.a;
import com.mintegral.msdk.base.common.report.e;
import com.mintegral.msdk.base.common.report.e$b;
import com.mintegral.msdk.base.common.report.e$c;
import f.f.a.e.b.h.g;
import f.f.a.e.b.h.j.d;
import f.f.a.e.b.h.k.c;
import f.f.a.e.f.h;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Stack;
import java.util.concurrent.atomic.AtomicInteger;

public final class a {
    private static final String i = "a";
    private static volatile a j;
    private Handler a;
    private boolean b = false;
    private int c = 30;
    private long d = 5000L;
    private String e;
    private f.f.a.e.d.a f;
    private AtomicInteger g;
    private Stack<Long> h;

    private a() {
        this.e = d.a().b;
        f.f.a.f.a a2 = f.f.a.f.c.b().a(f.f.a.e.c.a.i().f());
        if (a2 != null) {
            int n2;
            this.c = a2.t();
            this.d = 1000 * a2.u();
            int n3 = a2.v();
            if (n3 != (n2 = 1)) {
                n2 = 0;
            }
            this.b = n2;
        }
        String string = i;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\u521d\u59cb\u5316\u6279\u91cf\u4e0a\u62a5\uff1a ");
        stringBuilder.append(this.e);
        stringBuilder.append(" ");
        stringBuilder.append(this.c);
        stringBuilder.append(" ");
        stringBuilder.append(this.d);
        stringBuilder.append(" ");
        stringBuilder.append(this.b);
        h.a(string, stringBuilder.toString());
        if (!this.b) {
            return;
        }
        this.g = new AtomicInteger(0);
        this.h = new Stack();
        this.f = f.f.a.e.d.a.a(f.f.a.e.c.a.i().e());
        HandlerThread handlerThread = new HandlerThread("mtg_batch_report_thread");
        handlerThread.start();
        this.a = new Handler(handlerThread.getLooper()){

            /*
             * Unable to fully structure code
             * Enabled aggressive block sorting
             * Lifted jumps to return sites
             */
            public final void handleMessage(Message var1) {
                block5 : {
                    block4 : {
                        var2_2 = var1.what;
                        if (var2_2 == 1) break block4;
                        if (var2_2 != 2) {
                            if (var2_2 != 3) {
                                return;
                            }
                            var16_3 = var1.getData();
                            if (var16_3 == null) return;
                            var17_4 = var16_3.getParcelableArrayList("report_message");
                            var18_5 = var16_3.getLong("last_report_time");
                            a.b(a.this, var17_4, var18_5);
                            return;
                        }
                        var12_6 = var1.getData();
                        if (a.a(a.this) == null) return;
                        if (a.b(a.this) == null) return;
                        if (var12_6 == null) return;
                        a.a(a.this).removeMessages(1);
                        var13_7 = var12_6.getLong("last_report_time");
                        var6_8 = a.b(a.this).b(var13_7);
                        a.a(a.this, var6_8, var13_7);
                        var7_9 = a.c();
                        var8_10 = new StringBuilder();
                        var8_10.append("\u961f\u5217\u4e0a\u62a5\u89e6\u53d1\u4e86\uff0c\u9700\u8981\u4e0a\u62a5\u7684\u6570\u636e\uff1a ");
                        if (var6_8 != null) ** GOTO lbl-1000
                        var10_11 = 0;
                        break block5;
                    }
                    var3_12 = var1.getData();
                    if (a.a(a.this) == null) return;
                    if (a.b(a.this) == null) return;
                    if (var3_12 == null) return;
                    a.a(a.this).removeMessages(2);
                    var4_13 = System.currentTimeMillis();
                    var6_8 = a.b(a.this).b(var4_13);
                    a.a(a.this, var6_8, var4_13);
                    a.c(a.this).set(0);
                    var7_9 = a.c();
                    var8_10 = new StringBuilder();
                    var8_10.append("\u8d85\u65f6\u4e0a\u62a5\u89e6\u53d1\u4e86\uff0c\u9700\u8981\u4e0a\u62a5\u7684\u6570\u636e\uff1a ");
                    if (var6_8 == null) {
                        var10_11 = 0;
                    } else lbl-1000: // 2 sources:
                    {
                        var10_11 = var6_8.size();
                    }
                }
                var8_10.append(var10_11);
                h.a(var7_9, var8_10.toString());
            }
        };
    }

    static /* synthetic */ Handler a(a a2) {
        return a2.a;
    }

    static /* synthetic */ void a(a a2, ArrayList arrayList, long l2) {
        if (arrayList != null && arrayList.size() > 0) {
            Message message = Message.obtain();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList("report_message", arrayList);
            bundle.putLong("last_report_time", l2);
            message.setData(bundle);
            message.what = 3;
            a2.a.sendMessage(message);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static a b() {
        if (j != null) return j;
        Class<a> class_ = a.class;
        synchronized (a.class) {
            if (j != null) return j;
            j = new a();
            // ** MonitorExit[var1] (shouldn't be in output)
            return j;
        }
    }

    static /* synthetic */ f.f.a.e.d.a b(a a2) {
        return a2.f;
    }

    static /* synthetic */ void b(a a2, ArrayList arrayList, long l2) {
        if (arrayList != null && arrayList.size() > 0) {
            String string = i;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("\u9700\u8981\u4e0a\u62a5\u7684\u6570\u636e\u6761\u6570\uff1a ");
            stringBuilder.append(arrayList.size());
            h.a(string, stringBuilder.toString());
            Context context = f.f.a.e.c.a.i().e();
            if (context == null) {
                return;
            }
            c c2 = e.a(context);
            c2.a("app_id", f.f.a.e.c.a.i().f());
            c2.a("m_sdk", "msdk");
            c2.a("lqswt", String.valueOf((int)1));
            StringBuilder stringBuilder2 = new StringBuilder();
            for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                BatchReportMessage batchReportMessage = (BatchReportMessage)arrayList.get(i2);
                if (batchReportMessage == null) continue;
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append(batchReportMessage.c());
                stringBuilder3.append("&ts=");
                stringBuilder3.append(batchReportMessage.d());
                stringBuilder2.append(stringBuilder3.toString());
                boolean bl = i2 >= 0;
                boolean bl2 = i2 < arrayList.size() - 1;
                if (!(bl & bl2)) continue;
                stringBuilder2.append("\n");
            }
            try {
                String string2 = URLEncoder.encode((String)stringBuilder2.toString(), (String)"utf-8");
                c2.a("data", string2);
                String string3 = i;
                StringBuilder stringBuilder4 = new StringBuilder();
                stringBuilder4.append("\u9700\u8981\u6279\u91cf\u4e0a\u62a5\u7684\u6570\u636e\uff1a ");
                stringBuilder4.append(string2);
                h.a(string3, stringBuilder4.toString());
                new e$b(f.f.a.e.c.a.i().e()).b(0, a2.e, c2, new e$c(a2, l2, arrayList){
                    final /* synthetic */ long g;
                    final /* synthetic */ ArrayList h;
                    final /* synthetic */ a i;
                    {
                        this.i = a2;
                        this.g = l2;
                        this.h = arrayList;
                    }

                    /*
                     * Enabled aggressive block sorting
                     * Enabled unnecessary exception pruning
                     * Enabled aggressive exception aggregation
                     */
                    public final void a(String string) {
                        Stack stack;
                        h.a(a.c(), "\u6279\u91cf\u4e0a\u62a5\u6210\u529f");
                        try {
                            if (a.b(this.i) != null) {
                                a.b(this.i).a(this.g);
                            }
                        }
                        catch (Exception exception) {
                            h.d(a.c(), exception.getMessage());
                        }
                        Stack stack2 = stack = a.d(this.i);
                        synchronized (stack2) {
                            a.d(this.i).clear();
                            return;
                        }
                    }

                    /*
                     * Exception decompiling
                     */
                    public final void b(String var1) {
                        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
                        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [2[TRYBLOCK]], but top level block is 4[TRYBLOCK]
                        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:432)
                        // org.benf.cfr.reader.b.a.a.j.d(Op04StructuredStatement.java:484)
                        // org.benf.cfr.reader.b.a.a.i.a(Op03SimpleStatement.java:607)
                        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:692)
                        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
                        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
                        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
                        // org.benf.cfr.reader.entities.g.a(Method.java:474)
                        // org.benf.cfr.reader.entities.c.d.a(ClassFileDumperAnonymousInner.java:87)
                        // org.benf.cfr.reader.b.a.b.a.x.b(ConstructorInvokationAnonymousInner.java:73)
                        // org.benf.cfr.reader.b.a.b.a.c.a(AbstractExpression.java:119)
                        // org.benf.cfr.reader.b.a.b.a.c.a(AbstractExpression.java:80)
                        // org.benf.cfr.reader.b.a.e.s.a(MethodPrototype.java:473)
                        // org.benf.cfr.reader.b.a.b.a.ag.b(MemberFunctionInvokation.java:62)
                        // org.benf.cfr.reader.b.a.b.a.c.a(AbstractExpression.java:119)
                        // org.benf.cfr.reader.b.a.b.a.c.a(AbstractExpression.java:80)
                        // org.benf.cfr.reader.util.output.t.a(StreamDumper.java:146)
                        // org.benf.cfr.reader.b.a.d.b.o.a(StructuredExpressionStatement.java:27)
                        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:204)
                        // org.benf.cfr.reader.b.a.d.b.e.a(Block.java:543)
                        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:204)
                        // org.benf.cfr.reader.b.a.d.b.y.a(StructuredTry.java:68)
                        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:204)
                        // org.benf.cfr.reader.b.a.d.b.e.a(Block.java:543)
                        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:204)
                        // org.benf.cfr.reader.b.a.d.b.s.a(StructuredIf.java:50)
                        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:204)
                        // org.benf.cfr.reader.b.a.d.b.e.a(Block.java:543)
                        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:204)
                        // org.benf.cfr.reader.entities.attributes.f.a(AttributeCode.java:141)
                        // org.benf.cfr.reader.util.output.t.a(StreamDumper.java:146)
                        // org.benf.cfr.reader.entities.g.a(Method.java:493)
                        // org.benf.cfr.reader.entities.c.g.a(ClassFileDumperNormal.java:87)
                        // org.benf.cfr.reader.entities.d.a(ClassFile.java:1000)
                        // org.benf.cfr.reader.b.a(Driver.java:134)
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
                });
                return;
            }
            catch (Exception exception) {
                h.d(i, exception.getMessage());
                return;
            }
        }
        h.a(i, "\u9700\u8981\u4e0a\u62a5\u7684\u6570\u636e\u6761\u6570\uff1a 0");
    }

    static /* synthetic */ String c() {
        return i;
    }

    static /* synthetic */ AtomicInteger c(a a2) {
        return a2.g;
    }

    static /* synthetic */ Stack d(a a2) {
        return a2.h;
    }

    public final void a(String string) {
        void var12_2 = this;
        synchronized (var12_2) {
            if (this.f != null && this.b) {
                String string2 = i;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("\u63a5\u6536\u5230\u4e0a\u62a5\u6570\u636e\uff1a ");
                stringBuilder.append(string);
                h.a(string2, stringBuilder.toString());
                this.f.a(string);
                if (this.a != null && this.d > 0L && !this.a.hasMessages(1)) {
                    Message message = Message.obtain();
                    message.what = 1;
                    this.a.sendMessageDelayed(message, this.d);
                }
                if (this.g.incrementAndGet() >= this.c && this.a != null) {
                    Message message = Message.obtain();
                    Bundle bundle = new Bundle();
                    bundle.putLong("last_report_time", System.currentTimeMillis());
                    message.setData(bundle);
                    message.what = 2;
                    this.a.sendMessage(message);
                    this.g.set(0);
                }
                return;
            }
            return;
        }
    }

    public final boolean a() {
        a a2 = this;
        synchronized (a2) {
            boolean bl = this.b;
            return bl;
        }
    }

}

