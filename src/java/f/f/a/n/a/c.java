/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Looper
 *  android.os.Message
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.webkit.WebView
 *  android.widget.FrameLayout
 *  android.widget.FrameLayout$LayoutParams
 *  com.mintegral.msdk.base.common.report.c
 *  com.mintegral.msdk.video.bt.module.b
 *  com.mintegral.msdk.video.bt.module.c
 *  f.f.a.a
 *  f.f.a.e.b.d.b
 *  f.f.a.e.b.d.c
 *  f.f.a.e.c.a
 *  f.f.a.e.e.a
 *  f.f.a.e.e.a$b
 *  f.f.a.e.e.a$b$a
 *  f.f.a.e.e.n
 *  f.f.a.e.f.d
 *  f.f.a.e.f.h
 *  f.f.a.n.a.c$e
 *  f.f.a.n.a.c$n
 *  f.f.a.r.b.a.j
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.LinkedHashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.CopyOnWriteArrayList
 */
package f.f.a.n.a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.FrameLayout;
import f.f.a.e.d.r;
import f.f.a.e.e.a;
import f.f.a.n.a.c;
import f.f.a.s.a;
import f.f.a.s.f.g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/*
 * Exception performing whole class analysis.
 */
public final class c {
    private static Map<String, d> c;
    private final k a;
    private volatile List<f.f.a.k.g.b> b;

    private c() {
        HandlerThread handlerThread = new HandlerThread("mtg-reward-load-thread");
        c = new HashMap();
        handlerThread.start();
        this.a = new k(handlerThread.getLooper());
        new ConcurrentHashMap();
    }

    /* synthetic */ c(a a2) {
    }

    private f.f.a.k.g.b a(boolean bl) {
        if (this.b != null && this.b.size() > 0) {
            return (f.f.a.k.g.b)((Object)this.b.remove(0));
        }
        Context context = f.f.a.e.c.a.i().e();
        if (context != null) {
            f.f.a.k.g.b b2 = new f.f.a.k.g.b(context);
            this.b.add((Object)b2);
            if (bl) {
                f.f.a.k.g.b b3 = new f.f.a.k.g.b(context);
                this.b.add((Object)b3);
            }
        }
        return null;
    }

    public static c b() {
        return o.a;
    }

    static /* synthetic */ Map c() {
        return c;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private void d() {
        Context context;
        if (this.b == null) {
            this.b = new ArrayList();
        }
        if ((context = f.f.a.e.c.a.i().e()) == null) return;
        try {
            f.f.a.k.g.b b2 = new f.f.a.k.g.b(context);
            this.b.add((Object)b2);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public final void a() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            new Handler(Looper.getMainLooper()).post(new Runnable(){

                public final void run() {
                    c.this.d();
                }
            });
            return;
        }
        this.d();
    }

    public final void a(Context context, f.f.a.e.e.a a2, String string2, String string3, String string4, l l2) {
        block3 : {
            this.a.a(context);
            if (a2 != null && !TextUtils.isEmpty((CharSequence)a2.p0())) {
                try {
                    f.f.a.s.f.g g2 = f.f.a.s.f.g.a();
                    String string5 = a2.p0();
                    g.f f2 = new g.f(this, string3, string2, string4, l2, context, a2){
                        final /* synthetic */ String a;
                        final /* synthetic */ String b;
                        final /* synthetic */ String c;
                        final /* synthetic */ l d;
                        final /* synthetic */ Context e;
                        final /* synthetic */ f.f.a.e.e.a f;
                        final /* synthetic */ c g;
                        {
                            this.g = c2;
                            this.a = string2;
                            this.b = string3;
                            this.c = string4;
                            this.d = l2;
                            this.e = context;
                            this.f = a2;
                        }

                        public final void a(String string2, String string3) {
                            f.f.a.e.f.h.a((String)"RewardCampaignsResourceManager", (String)"zip btl template download failed");
                            try {
                                f.f.a.s.f.j.a().b(string3, false);
                                Message message = Message.obtain();
                                message.what = 205;
                                Bundle bundle = new Bundle();
                                bundle.putString("unit_id", this.a);
                                bundle.putString(f.f.a.a.j, this.b);
                                bundle.putString("request_id", this.c);
                                bundle.putString("url", string3);
                                message.setData(bundle);
                                c.a(this.g).sendMessage(message);
                                if (this.d != null) {
                                    this.d.a(this.b, this.a, this.c, string3, string2);
                                }
                                f.f.a.e.e.n n2 = new f.f.a.e.e.n();
                                n2.l("2000045");
                                if (this.e != null) {
                                    n2.b(f.f.a.e.f.d.z((Context)this.e.getApplicationContext()));
                                }
                                n2.c(3);
                                if (this.f != null) {
                                    n2.k(this.f.e());
                                    n2.i(this.f.M0());
                                }
                                n2.g(string3);
                                n2.m(string2);
                                n2.j(this.a);
                                r.a(f.f.a.e.d.h.a(f.f.a.e.c.a.i().e())).a(n2);
                                return;
                            }
                            catch (Exception exception) {
                                f.f.a.s.f.j.a().b(string3, false);
                                Message message = Message.obtain();
                                message.what = 105;
                                Bundle bundle = new Bundle();
                                bundle.putString("unit_id", this.a);
                                bundle.putString(f.f.a.a.j, this.b);
                                bundle.putString("request_id", this.c);
                                bundle.putString("url", string3);
                                message.setData(bundle);
                                c.a(this.g).sendMessage(message);
                                l l2 = this.d;
                                if (l2 != null) {
                                    l2.a(this.b, this.a, this.c, string3, string2);
                                }
                                if (f.f.a.a.a) {
                                    f.f.a.e.f.h.d((String)"RewardCampaignsResourceManager", (String)exception.getLocalizedMessage());
                                }
                                return;
                            }
                        }

                        public final void b(String string2) {
                            try {
                                f.f.a.e.f.h.a((String)"RewardCampaignsResourceManager", (String)"zip btl template download success");
                                f.f.a.s.f.j.a().b(string2, true);
                                Message message = Message.obtain();
                                message.what = 105;
                                Bundle bundle = new Bundle();
                                bundle.putString("unit_id", this.a);
                                bundle.putString(f.f.a.a.j, this.b);
                                bundle.putString("request_id", this.c);
                                bundle.putString("url", string2);
                                message.setData(bundle);
                                c.a(this.g).sendMessage(message);
                                if (this.d != null) {
                                    this.d.a(this.b, this.a, this.c, string2);
                                }
                                f.f.a.e.e.n n2 = new f.f.a.e.e.n();
                                n2.l("2000045");
                                if (this.e != null) {
                                    n2.b(f.f.a.e.f.d.z((Context)this.e.getApplicationContext()));
                                }
                                n2.c(1);
                                if (this.f != null) {
                                    n2.k(this.f.e());
                                    n2.i(this.f.M0());
                                }
                                n2.g(string2);
                                n2.m("");
                                n2.j(this.a);
                                r.a(f.f.a.e.d.h.a(f.f.a.e.c.a.i().e())).a(n2);
                                return;
                            }
                            catch (Exception exception) {
                                f.f.a.s.f.j.a().b(string2, false);
                                Message message = Message.obtain();
                                message.what = 205;
                                Bundle bundle = new Bundle();
                                bundle.putString("unit_id", this.a);
                                bundle.putString(f.f.a.a.j, this.b);
                                bundle.putString("request_id", this.c);
                                bundle.putString("url", string2);
                                message.setData(bundle);
                                c.a(this.g).sendMessage(message);
                                l l2 = this.d;
                                if (l2 != null) {
                                    l2.a(this.b, this.a, this.c, string2, exception.getLocalizedMessage());
                                }
                                f.f.a.e.e.n n3 = new f.f.a.e.e.n();
                                n3.l("2000045");
                                Context context = this.e;
                                if (context != null) {
                                    n3.b(f.f.a.e.f.d.z((Context)context.getApplicationContext()));
                                }
                                n3.c(3);
                                f.f.a.e.e.a a2 = this.f;
                                if (a2 != null) {
                                    n3.k(a2.e());
                                    n3.i(this.f.M0());
                                }
                                n3.g(string2);
                                n3.m(exception.getLocalizedMessage());
                                n3.j(this.a);
                                r.a(f.f.a.e.d.h.a(f.f.a.e.c.a.i().e())).a(n3);
                                if (f.f.a.a.a) {
                                    f.f.a.e.f.h.d((String)"RewardCampaignsResourceManager", (String)exception.getLocalizedMessage());
                                }
                                return;
                            }
                        }
                    };
                    g2.a(string5, f2);
                    return;
                }
                catch (Exception exception) {
                    if (!f.f.a.a.a) break block3;
                    f.f.a.e.f.h.d((String)"RewardCampaignsResourceManager", (String)exception.getLocalizedMessage());
                }
            }
        }
    }

    public final void a(final Context context, boolean bl, int n2, boolean bl2, final int n3, final String string2, final String string3, final String string4, final List<f.f.a.e.e.a> list, f f2, final l l2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string3);
        stringBuilder.append("_");
        stringBuilder.append(string4);
        String string5 = stringBuilder.toString();
        Map<String, d> map = c;
        d d2 = new d(bl, bl2, n2, list.size(), string3, string4, n3, list);
        map.put((Object)string5, (Object)d2);
        this.a.a(string2, string3, string4, f2);
        this.a.a(context);
        this.a.a(string5, list);
        k k2 = this.a;
        Runnable runnable = new Runnable(){

            /*
             * Loose catch block
             * Enabled aggressive exception aggregation
             */
            public final void run() {
                block50 : {
                    block39 : {
                        List list3 = list;
                        if (list3 == null || list3.size() <= 0) break block50;
                        f.f.a.e.f.h.a((String)"RewardCampaignsResourceManager", (String)"\u5f00\u59cb\u4e0b\u8f7d video");
                        try {
                            f.f.a.s.f.j.a().a((List<f.f.a.e.e.a>)list);
                            f.f.a.s.f.c.a().a(context, string3, (List<f.f.a.e.e.a>)list, n3, new f.f.a.s.g.b(c.this.a, string2, string3, string4){
                                private Handler a;
                                private final String b;
                                private final String c;
                                private final String d;
                                {
                                    this.a = handler;
                                    this.c = string2;
                                    this.b = string3;
                                    this.d = string4;
                                }

                                @Override
                                public final void a(String string2, String string3) {
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append("Video \u4e0b\u8f7d\u5931\u8d25\uff1a ");
                                    stringBuilder.append(string2);
                                    stringBuilder.append(" ");
                                    stringBuilder.append(this.d);
                                    f.f.a.e.f.h.d((String)"RewardCampaignsResourceManager", (String)stringBuilder.toString());
                                    f.f.a.s.f.j.a().a(string3, false);
                                    Message message = Message.obtain();
                                    message.what = 200;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("unit_id", this.b);
                                    bundle.putString(f.f.a.a.j, this.c);
                                    bundle.putString("request_id", this.d);
                                    bundle.putString("url", string3);
                                    message.setData(bundle);
                                    this.a.sendMessage(message);
                                }

                                @Override
                                public final void b(String string2) {
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append("Video \u4e0b\u8f7d\u6210\u529f: ");
                                    stringBuilder.append(this.d);
                                    f.f.a.e.f.h.d((String)"RewardCampaignsResourceManager", (String)stringBuilder.toString());
                                    f.f.a.s.f.j.a().a(string2, true);
                                    Message message = Message.obtain();
                                    message.what = 100;
                                    Bundle bundle = new Bundle();
                                    bundle.putString("unit_id", this.b);
                                    bundle.putString(f.f.a.a.j, this.c);
                                    bundle.putString("request_id", this.d);
                                    bundle.putString("url", string2);
                                    message.setData(bundle);
                                    this.a.sendMessage(message);
                                }
                            });
                            f.f.a.s.f.c.a().c(string3);
                        }
                        catch (Exception exception) {
                            if (!f.f.a.a.a) break block39;
                            f.f.a.e.f.h.d((String)"RewardCampaignsResourceManager", (String)exception.getLocalizedMessage());
                        }
                    }
                    Iterator iterator = list.iterator();
                    while (iterator.hasNext()) {
                        String string22;
                        a.b b2;
                        f.f.a.e.e.a a2;
                        Iterator iterator2;
                        block47 : {
                            String string32;
                            block46 : {
                                String string42;
                                block44 : {
                                    String string5;
                                    block53 : {
                                        void var36_7;
                                        block55 : {
                                            String string6;
                                            block54 : {
                                                block45 : {
                                                    block42 : {
                                                        a.b b3;
                                                        block40 : {
                                                            block51 : {
                                                                block43 : {
                                                                    String string7;
                                                                    block52 : {
                                                                        block41 : {
                                                                            a2 = (f.f.a.e.e.a)iterator.next();
                                                                            b3 = a2.R0();
                                                                            if (b3 == null || TextUtils.isEmpty((CharSequence)(string7 = b3.d()))) break block51;
                                                                            if (!string7.contains((CharSequence)".zip")) break block52;
                                                                            f.f.a.e.f.h.a((String)"RewardCampaignsResourceManager", (String)"\u5f00\u59cb\u4e0b\u8f7d zip \u7c7b\u578b\u7684 template");
                                                                            f.f.a.s.f.g g2 = f.f.a.s.f.g.a();
                                                                            Context context2 = context;
                                                                            String string8 = string2;
                                                                            String string9 = string3;
                                                                            String string10 = string4;
                                                                            k k2 = c.this.a;
                                                                            l l22 = l2;
                                                                            List list4 = list;
                                                                            iterator2 = iterator;
                                                                            string5 = ".zip";
                                                                            try {
                                                                                g.f f2 = new g.f(context2, string8, string9, string10, a2, 859, k2, l22, (List<f.f.a.e.e.a>)list4){
                                                                                    private boolean a = false;
                                                                                    private Context b;
                                                                                    private String c;
                                                                                    private String d;
                                                                                    private String e;
                                                                                    private f.f.a.e.e.a f;
                                                                                    private int g;
                                                                                    private Handler h;
                                                                                    private l i;
                                                                                    private long j;
                                                                                    {
                                                                                        this.b = context;
                                                                                        this.d = string2;
                                                                                        this.c = string3;
                                                                                        this.e = string4;
                                                                                        this.f = a2;
                                                                                        this.g = n2;
                                                                                        this.h = handler;
                                                                                        this.i = l2;
                                                                                        this.j = System.currentTimeMillis();
                                                                                    }

                                                                                    /*
                                                                                     * Unable to fully structure code
                                                                                     * Enabled aggressive block sorting
                                                                                     * Enabled unnecessary exception pruning
                                                                                     * Enabled aggressive exception aggregation
                                                                                     * Lifted jumps to return sites
                                                                                     */
                                                                                    @Override
                                                                                    public final void a(String var1, String var2_2) {
                                                                                        f.f.a.s.f.j.a().b(var2_2, false);
                                                                                        var3_3 = System.currentTimeMillis() - this.j;
                                                                                        var5_4 = this.g;
                                                                                        if (var5_4 == 313) {
                                                                                            f.f.a.e.f.h.a((String)"RewardCampaignsResourceManager", (String)"zip pause download failed");
                                                                                            var6_18 = Message.obtain();
                                                                                            var6_18.what = 101;
                                                                                            var7_19 = new Bundle();
                                                                                            var7_19.putString("unit_id", this.c);
                                                                                            var7_19.putString(f.f.a.a.j, this.d);
                                                                                            var7_19.putString("request_id", this.e);
                                                                                            var7_19.putString("url", var2_2);
                                                                                            var6_18.setData(var7_19);
                                                                                            this.h.sendMessage(var6_18);
                                                                                            return;
                                                                                        }
                                                                                        if (var5_4 == 497) ** GOTO lbl49
                                                                                        if (var5_4 != 859) {
                                                                                            return;
                                                                                        }
                                                                                        f.f.a.e.f.h.a((String)"RewardCampaignsResourceManager", (String)"zip template download failed");
                                                                                        var21_5 = Message.obtain();
                                                                                        var21_5.what = 203;
                                                                                        var22_6 = new Bundle();
                                                                                        var22_6.putString("unit_id", this.c);
                                                                                        var22_6.putString(f.f.a.a.j, this.d);
                                                                                        var22_6.putString("request_id", this.e);
                                                                                        var22_6.putString("url", var2_2);
                                                                                        var21_5.setData(var22_6);
                                                                                        this.h.sendMessage(var21_5);
                                                                                        var24_7 = this.i;
                                                                                        if (var24_7 != null) {
                                                                                            var24_7.a(this.d, this.c, this.e, var2_2, var1);
                                                                                        }
                                                                                        try {
                                                                                            var25_8 = new f.f.a.e.e.n();
                                                                                            var25_8.l("2000045");
                                                                                            if (this.b != null) {
                                                                                                var25_8.b(f.f.a.e.f.d.z((Context)this.b.getApplicationContext()));
                                                                                            }
                                                                                            var25_8.c(3);
                                                                                            if (this.f != null) {
                                                                                                var25_8.k(this.f.e());
                                                                                                var25_8.i(this.f.M0());
                                                                                            }
                                                                                            var25_8.g(var2_2);
                                                                                            var25_8.m(var1);
                                                                                            var25_8.j(this.c);
                                                                                            r.a(f.f.a.e.d.h.a(f.f.a.e.c.a.i().e())).a(var25_8);
                                                                                            return;
                                                                                        }
                                                                                        catch (Exception var16_9) {
                                                                                            block12 : {
                                                                                                if (f.f.a.a.a == false) return;
                                                                                                break block12;
lbl49: // 1 sources:
                                                                                                var9_12 = new StringBuilder();
                                                                                                var9_12.append("zip endcard download failed:  ");
                                                                                                var9_12.append(var1);
                                                                                                f.f.a.e.f.h.a((String)"RewardCampaignsResourceManager", (String)var9_12.toString());
                                                                                                var12_13 = Message.obtain();
                                                                                                var12_13.what = 201;
                                                                                                var13_14 = new Bundle();
                                                                                                var13_14.putString("unit_id", this.c);
                                                                                                var13_14.putString(f.f.a.a.j, this.d);
                                                                                                var13_14.putString("request_id", this.e);
                                                                                                var13_14.putString("url", var2_2);
                                                                                                var12_13.setData(var13_14);
                                                                                                this.h.sendMessage(var12_13);
                                                                                                if (this.a == false) return;
                                                                                                try {
                                                                                                    block15 : {
                                                                                                        block14 : {
                                                                                                            block13 : {
                                                                                                                var15_15 = new StringBuilder();
                                                                                                                var15_15.append(var3_3);
                                                                                                                var15_15.append("");
                                                                                                                var19_16 = new f.f.a.e.e.n("2000043", 3, var15_15.toString(), var2_2, this.f.e(), this.c, "zip download failed", "1");
                                                                                                                var19_16.i(this.f.M0());
                                                                                                                var19_16.k(this.f.e());
                                                                                                                if (this.f.m() != 287) break block13;
                                                                                                                var20_17 = "3";
                                                                                                                break block14;
                                                                                                            }
                                                                                                            if (this.f.m() != 94) break block15;
                                                                                                            var20_17 = "1";
                                                                                                        }
                                                                                                        var19_16.f(var20_17);
                                                                                                    }
                                                                                                    com.mintegral.msdk.base.common.report.c.a((f.f.a.e.e.n)var19_16, (Context)f.f.a.e.c.a.i().e(), (String)this.c);
                                                                                                    return;
                                                                                                }
                                                                                                catch (Exception var16_11) {
                                                                                                    if (f.f.a.a.a == false) return;
                                                                                                }
                                                                                            }
                                                                                            f.f.a.e.f.h.d((String)"RewardCampaignsResourceManager", (String)var16_10.getLocalizedMessage());
                                                                                            return;
                                                                                        }
                                                                                    }

                                                                                    public final void a(boolean bl) {
                                                                                        this.a = bl;
                                                                                    }

                                                                                    /*
                                                                                     * Unable to fully structure code
                                                                                     * Enabled aggressive block sorting
                                                                                     * Enabled unnecessary exception pruning
                                                                                     * Enabled aggressive exception aggregation
                                                                                     * Lifted jumps to return sites
                                                                                     */
                                                                                    @Override
                                                                                    public final void b(String var1) {
                                                                                        f.f.a.s.f.j.a().b(var1, true);
                                                                                        var2_2 = System.currentTimeMillis() - this.j;
                                                                                        var4_3 = this.g;
                                                                                        if (var4_3 == 313) {
                                                                                            f.f.a.e.f.h.a((String)"RewardCampaignsResourceManager", (String)"zip pause download success");
                                                                                            var5_16 = Message.obtain();
                                                                                            var5_16.what = 101;
                                                                                            var6_17 = new Bundle();
                                                                                            var6_17.putString("unit_id", this.c);
                                                                                            var6_17.putString(f.f.a.a.j, this.d);
                                                                                            var6_17.putString("request_id", this.e);
                                                                                            var6_17.putString("url", var1);
                                                                                            var5_16.setData(var6_17);
                                                                                            this.h.sendMessage(var5_16);
                                                                                            return;
                                                                                        }
                                                                                        if (var4_3 == 497) ** GOTO lbl48
                                                                                        if (var4_3 != 859) {
                                                                                            return;
                                                                                        }
                                                                                        f.f.a.e.f.h.a((String)"RewardCampaignsResourceManager", (String)"zip template download success");
                                                                                        var17_4 = Message.obtain();
                                                                                        var17_4.what = 103;
                                                                                        var18_5 = new Bundle();
                                                                                        var18_5.putString("unit_id", this.c);
                                                                                        var18_5.putString(f.f.a.a.j, this.d);
                                                                                        var18_5.putString("request_id", this.e);
                                                                                        var17_4.setData(var18_5);
                                                                                        this.h.sendMessage(var17_4);
                                                                                        var20_6 = this.i;
                                                                                        if (var20_6 != null) {
                                                                                            var20_6.a(this.d, this.c, this.e, var1);
                                                                                        }
                                                                                        try {
                                                                                            var21_7 = new f.f.a.e.e.n();
                                                                                            var21_7.l("2000045");
                                                                                            if (this.b != null) {
                                                                                                var21_7.b(f.f.a.e.f.d.z((Context)this.b.getApplicationContext()));
                                                                                            }
                                                                                            var21_7.c(1);
                                                                                            if (this.f != null) {
                                                                                                var21_7.k(this.f.e());
                                                                                                var21_7.i(this.f.M0());
                                                                                            }
                                                                                            var21_7.g(var1);
                                                                                            var21_7.m("");
                                                                                            var21_7.j(this.c);
                                                                                            r.a(f.f.a.e.d.h.a(f.f.a.e.c.a.i().e())).a(var21_7);
                                                                                            return;
                                                                                        }
                                                                                        catch (Exception var12_8) {
                                                                                            block12 : {
                                                                                                if (f.f.a.a.a == false) return;
                                                                                                break block12;
lbl48: // 1 sources:
                                                                                                f.f.a.e.f.h.a((String)"RewardCampaignsResourceManager", (String)"zip endcard download success");
                                                                                                var8_11 = Message.obtain();
                                                                                                var8_11.what = 101;
                                                                                                var9_12 = new Bundle();
                                                                                                var9_12.putString("unit_id", this.c);
                                                                                                var9_12.putString(f.f.a.a.j, this.d);
                                                                                                var9_12.putString("request_id", this.e);
                                                                                                var9_12.putString("url", var1);
                                                                                                var8_11.setData(var9_12);
                                                                                                this.h.sendMessage(var8_11);
                                                                                                if (this.a == false) return;
                                                                                                try {
                                                                                                    block15 : {
                                                                                                        block14 : {
                                                                                                            block13 : {
                                                                                                                var11_13 = new StringBuilder();
                                                                                                                var11_13.append(var2_2);
                                                                                                                var11_13.append("");
                                                                                                                var15_14 = new f.f.a.e.e.n("2000043", 1, var11_13.toString(), var1, this.f.e(), this.c, "", "1");
                                                                                                                var15_14.i(this.f.M0());
                                                                                                                var15_14.k(this.f.e());
                                                                                                                if (this.f.m() != 287) break block13;
                                                                                                                var16_15 = "3";
                                                                                                                break block14;
                                                                                                            }
                                                                                                            if (this.f.m() != 94) break block15;
                                                                                                            var16_15 = "1";
                                                                                                        }
                                                                                                        var15_14.f(var16_15);
                                                                                                    }
                                                                                                    com.mintegral.msdk.base.common.report.c.a((f.f.a.e.e.n)var15_14, (Context)f.f.a.e.c.a.i().e(), (String)this.c);
                                                                                                    return;
                                                                                                }
                                                                                                catch (Exception var12_10) {
                                                                                                    if (f.f.a.a.a == false) return;
                                                                                                }
                                                                                            }
                                                                                            f.f.a.e.f.h.d((String)"RewardCampaignsResourceManager", (String)var12_9.getLocalizedMessage());
                                                                                            return;
                                                                                        }
                                                                                    }
                                                                                };
                                                                                g2.a(string7, f2);
                                                                                break block40;
                                                                            }
                                                                            catch (Exception exception) {
                                                                                break block41;
                                                                            }
                                                                            catch (Exception exception) {
                                                                                iterator2 = iterator;
                                                                                string5 = ".zip";
                                                                            }
                                                                        }
                                                                        if (f.f.a.a.a) {
                                                                            void var56_51;
                                                                            f.f.a.e.f.h.d((String)"RewardCampaignsResourceManager", (String)var56_51.getLocalizedMessage());
                                                                        }
                                                                        break block40;
                                                                    }
                                                                    iterator2 = iterator;
                                                                    string5 = ".zip";
                                                                    f.f.a.e.f.h.a((String)"RewardCampaignsResourceManager", (String)"\u5f00\u59cb\u4e0b\u8f7d html \u7c7b\u578b\u7684 template");
                                                                    f.f.a.s.f.g g3 = f.f.a.s.f.g.a();
                                                                    String string11 = string2;
                                                                    String string12 = string3;
                                                                    String string13 = string4;
                                                                    l l3 = l2;
                                                                    k k3 = c.this.a;
                                                                    List list5 = list;
                                                                    b2 = b3;
                                                                    try {
                                                                        g.d d2 = new g.d(859, string11, string12, string13, a2, l3, k3, (List<f.f.a.e.e.a>)list5){
                                                                            private boolean a = false;
                                                                            private int b;
                                                                            private final String c;
                                                                            private final String d;
                                                                            private final String e;
                                                                            private f.f.a.e.e.a f;
                                                                            private l g;
                                                                            private Handler h;
                                                                            private final long i;
                                                                            {
                                                                                this.b = n2;
                                                                                this.c = string2;
                                                                                this.d = string3;
                                                                                this.e = string4;
                                                                                this.f = a2;
                                                                                this.g = l2;
                                                                                this.h = handler;
                                                                                this.i = System.currentTimeMillis();
                                                                            }

                                                                            /*
                                                                             * Enabled aggressive block sorting
                                                                             * Enabled unnecessary exception pruning
                                                                             * Enabled aggressive exception aggregation
                                                                             */
                                                                            @Override
                                                                            public final void a(String string2, String string3) {
                                                                                block11 : {
                                                                                    f.f.a.s.f.j.a().b(string2, false);
                                                                                    int n2 = this.b;
                                                                                    if (n2 == 313) break block11;
                                                                                    if (n2 != 497) {
                                                                                        if (n2 != 859) {
                                                                                            return;
                                                                                        }
                                                                                        Message message = Message.obtain();
                                                                                        message.what = 205;
                                                                                        Bundle bundle = new Bundle();
                                                                                        bundle.putString("unit_id", this.d);
                                                                                        bundle.putString(f.f.a.a.j, this.c);
                                                                                        bundle.putString("request_id", this.e);
                                                                                        message.setData(bundle);
                                                                                        this.h.sendMessage(message);
                                                                                        l l2 = this.g;
                                                                                        if (l2 == null) return;
                                                                                        {
                                                                                            l2.a(this.c, this.d, this.e, string2, string3);
                                                                                            return;
                                                                                        }
                                                                                    }
                                                                                    Message message = Message.obtain();
                                                                                    message.what = 201;
                                                                                    Bundle bundle = new Bundle();
                                                                                    bundle.putString("unit_id", this.d);
                                                                                    bundle.putString(f.f.a.a.j, this.c);
                                                                                    bundle.putString("request_id", this.e);
                                                                                    bundle.putString("url", string2);
                                                                                    message.setData(bundle);
                                                                                    this.h.sendMessage(message);
                                                                                    if (!this.a) return;
                                                                                    long l3 = System.currentTimeMillis() - this.i;
                                                                                    try {
                                                                                        f.f.a.e.e.n n3;
                                                                                        block14 : {
                                                                                            String string4;
                                                                                            block13 : {
                                                                                                block12 : {
                                                                                                    StringBuilder stringBuilder = new StringBuilder();
                                                                                                    stringBuilder.append(l3);
                                                                                                    stringBuilder.append("");
                                                                                                    n3 = new f.f.a.e.e.n("2000043", 21, stringBuilder.toString(), string2, this.f.e(), this.d, "url download failed", "2");
                                                                                                    n3.i(this.f.M0());
                                                                                                    n3.k(this.f.e());
                                                                                                    if (this.f.m() != 287) break block12;
                                                                                                    string4 = "3";
                                                                                                    break block13;
                                                                                                }
                                                                                                if (this.f.m() != 94) break block14;
                                                                                                string4 = "1";
                                                                                            }
                                                                                            n3.f(string4);
                                                                                        }
                                                                                        com.mintegral.msdk.base.common.report.c.a((f.f.a.e.e.n)n3, (Context)f.f.a.e.c.a.i().e(), (String)this.d);
                                                                                        return;
                                                                                    }
                                                                                    catch (Exception exception) {
                                                                                        if (!f.f.a.a.a) return;
                                                                                        {
                                                                                            f.f.a.e.f.h.d((String)"RewardCampaignsResourceManager", (String)exception.getLocalizedMessage());
                                                                                            return;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                Message message = Message.obtain();
                                                                                message.what = 201;
                                                                                Bundle bundle = new Bundle();
                                                                                bundle.putString("unit_id", this.d);
                                                                                bundle.putString(f.f.a.a.j, this.c);
                                                                                bundle.putString("request_id", this.e);
                                                                                bundle.putString("url", string2);
                                                                                message.setData(bundle);
                                                                                this.h.sendMessage(message);
                                                                            }

                                                                            public final void a(boolean bl) {
                                                                                this.a = bl;
                                                                            }

                                                                            /*
                                                                             * Enabled aggressive block sorting
                                                                             * Enabled unnecessary exception pruning
                                                                             * Enabled aggressive exception aggregation
                                                                             */
                                                                            @Override
                                                                            public final void b(String string2) {
                                                                                block11 : {
                                                                                    f.f.a.s.f.j.a().b(string2, true);
                                                                                    int n2 = this.b;
                                                                                    if (n2 == 313) break block11;
                                                                                    if (n2 != 497) {
                                                                                        if (n2 != 859) {
                                                                                            return;
                                                                                        }
                                                                                        Message message = Message.obtain();
                                                                                        message.what = 105;
                                                                                        Bundle bundle = new Bundle();
                                                                                        bundle.putString("unit_id", this.d);
                                                                                        bundle.putString(f.f.a.a.j, this.c);
                                                                                        bundle.putString("request_id", this.e);
                                                                                        message.setData(bundle);
                                                                                        this.h.sendMessage(message);
                                                                                        l l2 = this.g;
                                                                                        if (l2 == null) return;
                                                                                        {
                                                                                            l2.a(this.c, this.d, this.e, string2);
                                                                                            return;
                                                                                        }
                                                                                    }
                                                                                    Message message = Message.obtain();
                                                                                    message.what = 101;
                                                                                    Bundle bundle = new Bundle();
                                                                                    bundle.putString("unit_id", this.d);
                                                                                    bundle.putString(f.f.a.a.j, this.c);
                                                                                    bundle.putString("request_id", this.e);
                                                                                    bundle.putString("url", string2);
                                                                                    message.setData(bundle);
                                                                                    this.h.sendMessage(message);
                                                                                    if (!this.a) return;
                                                                                    long l3 = System.currentTimeMillis() - this.i;
                                                                                    try {
                                                                                        f.f.a.e.e.n n3;
                                                                                        block14 : {
                                                                                            String string3;
                                                                                            block13 : {
                                                                                                block12 : {
                                                                                                    StringBuilder stringBuilder = new StringBuilder();
                                                                                                    stringBuilder.append(l3);
                                                                                                    stringBuilder.append("");
                                                                                                    n3 = new f.f.a.e.e.n("2000043", 20, stringBuilder.toString(), string2, this.f.e(), this.d, "", "2");
                                                                                                    n3.i(this.f.M0());
                                                                                                    n3.k(this.f.e());
                                                                                                    if (this.f.m() != 287) break block12;
                                                                                                    string3 = "3";
                                                                                                    break block13;
                                                                                                }
                                                                                                if (this.f.m() != 94) break block14;
                                                                                                string3 = "1";
                                                                                            }
                                                                                            n3.f(string3);
                                                                                        }
                                                                                        com.mintegral.msdk.base.common.report.c.a((f.f.a.e.e.n)n3, (Context)f.f.a.e.c.a.i().e(), (String)this.d);
                                                                                        return;
                                                                                    }
                                                                                    catch (Exception exception) {
                                                                                        if (!f.f.a.a.a) return;
                                                                                        {
                                                                                            f.f.a.e.f.h.d((String)"RewardCampaignsResourceManager", (String)exception.getLocalizedMessage());
                                                                                            return;
                                                                                        }
                                                                                    }
                                                                                }
                                                                                Message message = Message.obtain();
                                                                                message.what = 101;
                                                                                Bundle bundle = new Bundle();
                                                                                bundle.putString("unit_id", this.d);
                                                                                bundle.putString(f.f.a.a.j, this.c);
                                                                                bundle.putString("request_id", this.e);
                                                                                bundle.putString("url", string2);
                                                                                message.setData(bundle);
                                                                                this.h.sendMessage(message);
                                                                            }
                                                                        };
                                                                        g3.a(string7, d2);
                                                                        break block42;
                                                                    }
                                                                    catch (Exception exception) {
                                                                        break block43;
                                                                    }
                                                                    catch (Exception exception) {
                                                                        b2 = b3;
                                                                    }
                                                                }
                                                                if (f.f.a.a.a) {
                                                                    void var47_27;
                                                                    f.f.a.e.f.h.d((String)"RewardCampaignsResourceManager", (String)var47_27.getLocalizedMessage());
                                                                }
                                                                break block42;
                                                            }
                                                            iterator2 = iterator;
                                                            string5 = ".zip";
                                                        }
                                                        b2 = b3;
                                                    }
                                                    string6 = a2.i1();
                                                    if (TextUtils.isEmpty((CharSequence)string6) || TextUtils.isEmpty((CharSequence)string6) || a2.m1()) break block53;
                                                    if (!string6.contains((CharSequence)string5) || !string6.contains((CharSequence)"md5filename")) break block54;
                                                    f.f.a.e.f.h.a((String)"RewardCampaignsResourceManager", (String)"\u5f00\u59cb\u4e0b\u8f7d zip \u7c7b\u578b\u7684 endCard");
                                                    boolean bl = TextUtils.isEmpty((CharSequence)f.f.a.s.f.l.a().a(string6));
                                                    Context context3 = context;
                                                    String string14 = string2;
                                                    String string15 = string3;
                                                    String string16 = string4;
                                                    k k4 = c.this.a;
                                                    l l4 = l2;
                                                    List list6 = list;
                                                    string22 = string5;
                                                    try {
                                                        g.f f3 = new /* invalid duplicate definition of identical inner class */;
                                                        f3.a(bl);
                                                        f.f.a.s.f.g.a().a(string6, f3);
                                                        break block44;
                                                    }
                                                    catch (Exception exception) {
                                                        break block45;
                                                    }
                                                    catch (Exception exception) {
                                                        string22 = string5;
                                                    }
                                                }
                                                if (!f.f.a.a.a) break block44;
                                                break block55;
                                            }
                                            string22 = string5;
                                            f.f.a.e.f.h.a((String)"RewardCampaignsResourceManager", (String)"\u5f00\u59cb\u4e0b\u8f7d html \u7c7b\u578b\u7684 endCard");
                                            boolean bl = TextUtils.isEmpty((CharSequence)f.f.a.s.f.i.a().a(string6));
                                            try {
                                                g.d d3 = new /* invalid duplicate definition of identical inner class */;
                                                d3.a(bl);
                                                f.f.a.s.f.g.a().a(string6, d3);
                                                break block44;
                                            }
                                            catch (Exception exception) {
                                                if (!f.f.a.a.a) break block44;
                                            }
                                        }
                                        f.f.a.e.f.h.d((String)"RewardCampaignsResourceManager", (String)var36_7.getLocalizedMessage());
                                        {
                                            break block44;
                                        }
                                    }
                                    string22 = string5;
                                }
                                if (!TextUtils.isEmpty((CharSequence)a2.J())) {
                                    f.f.a.s.f.g.a().a(a2.J(), (g.d)null);
                                }
                                if (!TextUtils.isEmpty((CharSequence)(string42 = a2.d()))) {
                                    f.f.a.e.f.h.a((String)"RewardCampaignsResourceManager", (String)"\u5f00\u59cb\u4e0b\u8f7d icon");
                                    try {
                                        f.f.a.e.b.d.b b4 = f.f.a.e.b.d.b.a((Context)context);
                                        f.f.a.e.b.d.c c2 = new f.f.a.e.b.d.c(c.this.a, 0, string2, string3, string4, a2){
                                            private Handler b;
                                            private int c;
                                            private String d;
                                            private String e;
                                            private String f;
                                            private f.f.a.e.e.a g;
                                            {
                                                this.b = handler;
                                                this.c = n2;
                                                this.e = string2;
                                                this.d = string3;
                                                this.f = string4;
                                                this.g = a2;
                                            }

                                            public final void a(Bitmap bitmap, String string2) {
                                                f.f.a.s.f.j.a().c(string2, true);
                                                Message message = Message.obtain();
                                                int n2 = this.c == 0 ? 102 : 104;
                                                message.what = n2;
                                                Bundle bundle = new Bundle();
                                                bundle.putString("unit_id", this.d);
                                                bundle.putString(f.f.a.a.j, this.e);
                                                bundle.putString("request_id", this.f);
                                                message.setData(bundle);
                                                this.b.sendMessage(message);
                                            }

                                            public final void a(String string2, String string3) {
                                                block3 : {
                                                    Message message = Message.obtain();
                                                    int n2 = this.c == 0 ? 202 : 204;
                                                    message.what = n2;
                                                    Bundle bundle = new Bundle();
                                                    bundle.putString("unit_id", this.d);
                                                    bundle.putString(f.f.a.a.j, this.e);
                                                    bundle.putString("request_id", this.f);
                                                    message.setData(bundle);
                                                    this.b.sendMessage(message);
                                                    if (this.g != null) {
                                                        try {
                                                            r r2 = r.a(f.f.a.e.d.h.a(f.f.a.e.c.a.i().e()));
                                                            f.f.a.e.f.h.a((String)"RewardCampaignsResourceManager", (String)"campaign is null");
                                                            f.f.a.e.e.n n3 = new f.f.a.e.e.n();
                                                            n3.l("2000044");
                                                            n3.b(f.f.a.e.f.d.z((Context)f.f.a.e.c.a.i().e()));
                                                            n3.k(this.g.e());
                                                            n3.b(this.g.f());
                                                            n3.i(this.g.M0());
                                                            n3.j(this.d);
                                                            n3.m(string2);
                                                            r2.a(n3);
                                                            return;
                                                        }
                                                        catch (Exception exception) {
                                                            if (!f.f.a.a.a) break block3;
                                                            f.f.a.e.f.h.d((String)"RewardCampaignsResourceManager", (String)exception.getLocalizedMessage());
                                                        }
                                                    }
                                                }
                                            }
                                        };
                                        b4.a(string42, c2);
                                    }
                                    catch (Exception exception) {
                                        if (!f.f.a.a.a) break block46;
                                        f.f.a.e.f.h.d((String)"RewardCampaignsResourceManager", (String)exception.getLocalizedMessage());
                                    }
                                }
                            }
                            if (!TextUtils.isEmpty((CharSequence)(string32 = a2.f()))) {
                                f.f.a.e.f.h.a((String)"RewardCampaignsResourceManager", (String)"\u5f00\u59cb\u4e0b\u8f7d image");
                                try {
                                    f.f.a.e.b.d.b b5 = f.f.a.e.b.d.b.a((Context)context);
                                    f.f.a.e.b.d.c c3 = new /* invalid duplicate definition of identical inner class */;
                                    b5.a(string32, c3);
                                }
                                catch (Exception exception) {
                                    if (!f.f.a.a.a) break block47;
                                    f.f.a.e.f.h.d((String)"RewardCampaignsResourceManager", (String)exception.getLocalizedMessage());
                                }
                            }
                        }
                        if (b2 != null) {
                            List list7;
                            block48 : {
                                String string17 = b2.c();
                                if (!TextUtils.isEmpty((CharSequence)string17)) {
                                    void var23_11;
                                    block49 : {
                                        if (string17.contains((CharSequence)string22)) {
                                            f.f.a.e.f.h.a((String)"RewardCampaignsResourceManager", (String)"\u5f00\u59cb\u4e0b\u8f7d zip \u7c7b\u578b\u7684 pause");
                                            try {
                                                f.f.a.s.f.g g4 = f.f.a.s.f.g.a();
                                                g.f f4 = new /* invalid duplicate definition of identical inner class */;
                                                g4.a(string17, f4);
                                                break block48;
                                            }
                                            catch (Exception exception) {
                                                if (!f.f.a.a.a) break block48;
                                                break block49;
                                            }
                                        }
                                        f.f.a.e.f.h.a((String)"RewardCampaignsResourceManager", (String)"\u5f00\u59cb\u4e0b\u8f7d html \u7c7b\u578b\u7684 pause");
                                        try {
                                            f.f.a.s.f.g g5 = f.f.a.s.f.g.a();
                                            g.d d4 = new /* invalid duplicate definition of identical inner class */;
                                            g5.a(string17, d4);
                                            break block48;
                                        }
                                        catch (Exception exception) {
                                            if (!f.f.a.a.a) break block48;
                                        }
                                    }
                                    f.f.a.e.f.h.d((String)"RewardCampaignsResourceManager", (String)var23_11.getLocalizedMessage());
                                }
                            }
                            if ((list7 = b2.e()) != null && list7.size() > 0) {
                                for (a.b.a a3 : list7) {
                                    List list2;
                                    if (a3 == null || (list2 = a3.b) == null || list2.size() <= 0) continue;
                                    for (String string18 : a3.b) {
                                        if (TextUtils.isEmpty((CharSequence)string18)) continue;
                                        try {
                                            f.f.a.e.b.d.b b6 = f.f.a.e.b.d.b.a((Context)context);
                                            f.f.a.e.b.d.c c4 = new /* invalid duplicate definition of identical inner class */;
                                            b6.a(string18, c4);
                                        }
                                        catch (Exception exception) {
                                            if (!f.f.a.a.a) continue;
                                            f.f.a.e.f.h.d((String)"RewardCampaignsResourceManager", (String)exception.getLocalizedMessage());
                                        }
                                    }
                                }
                            }
                        }
                        iterator = iterator2;
                    }
                }
            }
        };
        k2.post(runnable);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void a(Handler handler, boolean bl, boolean bl2, f.f.a.k.g.b b2, String string2, int n2, f.f.a.e.e.a a2, List<f.f.a.e.e.a> list, String string3, String string4, String string5, String string6, f.f.a.s.d.c c2, m m2) {
        String string7;
        void var20_40;
        block13 : {
            a.a a3;
            f.f.a.k.g.b b3;
            block12 : {
                f.f.a.k.g.b b4;
                block11 : {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string5);
                    stringBuilder.append("_");
                    stringBuilder.append(string2);
                    string7 = stringBuilder.toString();
                    f.f.a.n.c.a.c(f.f.a.e.c.a.i().e(), "start preload temp", string5, bl2, string6);
                    a3 = new a.a();
                    b4 = o.a.a(false);
                    if (b4 != null) break block11;
                    {
                        catch (Exception exception) {
                            // empty catch block
                            break block13;
                        }
                    }
                    try {
                        f.f.a.k.g.b b5;
                        b3 = b5 = new f.f.a.k.g.b(f.f.a.e.c.a.i().e());
                        break block12;
                    }
                    catch (Throwable throwable) {
                        if (m2 == null) return;
                        a3.a(true);
                        f.f.a.s.f.j j2 = f.f.a.s.f.j.a();
                        StringBuilder stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(string5);
                        stringBuilder2.append("_");
                        stringBuilder2.append(string6);
                        stringBuilder2.append("_");
                        stringBuilder2.append(string2);
                        j2.d(stringBuilder2.toString(), true);
                        Context context = f.f.a.e.c.a.i().e();
                        StringBuilder stringBuilder3 = new StringBuilder();
                        stringBuilder3.append("WebView exception: ");
                        stringBuilder3.append(throwable.getMessage());
                        f.f.a.n.c.a.c(context, stringBuilder3.toString(), string5, bl2, string6);
                        StringBuilder stringBuilder4 = new StringBuilder();
                        stringBuilder4.append(string5);
                        stringBuilder4.append("_");
                        stringBuilder4.append(string2);
                        m2.a(stringBuilder4.toString(), string4, string5, string6, string2, a3);
                        return;
                        catch (Exception exception) {
                            if (m2 == null) return;
                            a3.a(true);
                            f.f.a.s.f.j j3 = f.f.a.s.f.j.a();
                            StringBuilder stringBuilder5 = new StringBuilder();
                            stringBuilder5.append(string5);
                            stringBuilder5.append("_");
                            stringBuilder5.append(string6);
                            stringBuilder5.append("_");
                            stringBuilder5.append(string2);
                            j3.d(stringBuilder5.toString(), true);
                            Context context2 = f.f.a.e.c.a.i().e();
                            StringBuilder stringBuilder6 = new StringBuilder();
                            stringBuilder6.append("WebView exception: ");
                            stringBuilder6.append(exception.getMessage());
                            f.f.a.n.c.a.c(context2, stringBuilder6.toString(), string5, bl2, string6);
                            StringBuilder stringBuilder7 = new StringBuilder();
                            stringBuilder7.append(string5);
                            stringBuilder7.append("_");
                            stringBuilder7.append(string2);
                            m2.a(stringBuilder7.toString(), string4, string5, string6, string2, a3);
                            return;
                        }
                    }
                }
                b3 = b4;
            }
            a3.a(b3);
            f.f.a.r.b.a.j j4 = list != null && list.size() > 0 ? new f.f.a.r.b.a.j(null, a2, list) : new f.f.a.r.b.a.j(null, a2);
            f.f.a.r.b.a.j j5 = j4;
            j5.a(n2);
            j5.b(string5);
            j5.a(c2);
            f.f.a.k.g.b b6 = b3;
            try {
                n n3 = new /* Unavailable Anonymous Inner Class!! */;
                b6.setWebViewListener((f.f.a.k.g.f)n3);
                b6.setObject((Object)j5);
                b6.loadUrl(string3);
            }
            catch (Exception exception) {}
            try {
                b6.setRid(string6);
                return;
            }
            catch (Exception exception) {}
        }
        if (f.f.a.a.a) {
            f.f.a.e.f.h.d((String)"RewardCampaignsResourceManager", (String)var20_40.getLocalizedMessage());
        }
        if (m2 == null) return;
        m2.a(string7, string4, string5, string6, string2, null, var20_40.getLocalizedMessage());
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive exception aggregation
     */
    public final void a(Handler var1_6, boolean var2_15, boolean var3_4, String var4_5, String var5_3, String var6_8, String var7_14, int var8, f.f.a.e.e.a var9_10, List<f.f.a.e.e.a> var10_13, String var11_1, String var12_11, f.f.a.s.d.c var13_2, m var14_12, boolean var15_7) {
        block16 : {
            block15 : {
                block19 : {
                    block17 : {
                        block18 : {
                            var16_16 = new StringBuilder();
                            var16_16.append(var6_8);
                            var16_16.append("_");
                            var16_16.append(var7_14);
                            var20_17 = var16_16.toString();
                            f.f.a.n.c.a.c(f.f.a.e.c.a.i().e(), "start preload tpl", var12_11, var3_4, var4_5);
                            f.f.a.e.f.h.a((String)"RewardCampaignsResourceManager", (String)"\u5f00\u59cb\u9884\u52a0\u8f7d\u5927\u6a21\u677f\u8d44\u6e90");
                            var24_18 = new a.a();
                            var25_19 = o.a().a(true);
                            if (var25_19 == null) {
                                var25_19 = new f.f.a.k.g.b(f.f.a.e.c.a.i().e());
                            }
                            var26_20 = var25_19;
                            var24_18.a(var26_20);
                            var27_21 = f.f.a.r.a.a.b.b().a();
                            var28_22 = f.f.a.r.a.a.b.b().a();
                            var24_18.a(var28_22);
                            var29_23 = new StringBuilder();
                            var29_23.append("preload BT wraper.setTag ");
                            var29_23.append(var28_22);
                            f.f.a.e.f.h.a((String)"RewardCampaignsResourceManager", (String)var29_23.toString());
                            if (var10_13 == null || var10_13.size() <= 0) break block18;
                            var40_24 = f.f.a.s.f.c.a().a(var6_8);
                            if (var40_24 == null || var40_24.size() <= 0) ** GOTO lbl38
                            var41_25 = 0;
lbl26: // 2 sources:
                            do {
                                if (var41_25 < var10_13.size()) {
                                    var42_27 = (f.f.a.e.e.a)var10_13.get(var41_25);
lbl29: // 2 sources:
                                    for (f.f.a.e.e.a var45_26 : var40_24) {
                                        var46_28 = var45_26.e();
                                        var47_29 = var40_24;
                                        if (var46_28.equals((Object)var42_27.e()) && var45_26.L0().equals((Object)var42_27.L0())) {
                                            f.f.a.e.f.h.a((String)"RewardCampaignsResourceManager", (String)"\u8bbe\u7f6e Campaign \u7684 isReady\uff1a true");
                                            var42_27.e(true);
                                            var10_13.set(var41_25, (Object)var42_27);
                                        }
                                        break block15;
                                    }
                                    break block16;
                                }
lbl38: // 3 sources:
                                var32_31 = new f.f.a.r.b.a.j(null, var9_10, var10_13);
                                break block17;
                                break;
                            } while (true);
                        }
                        var32_31 = new f.f.a.r.b.a.j(null, var9_10);
                    }
                    var33_32 = var32_31;
                    var33_32.a(var8);
                    var33_32.b(var12_11);
                    var33_32.a(var28_22);
                    var33_32.c(var27_21);
                    var33_32.b(true);
                    var33_32.a(var13_2);
                    var22_33 = "RewardCampaignsResourceManager";
                    try {
                        var34_34 = new /* Unavailable Anonymous Inner Class!! */;
                        var26_20.setWebViewListener((f.f.a.k.g.f)var34_34);
                        var26_20.setObject((Object)var33_32);
                        var26_20.loadUrl(var11_1);
                    }
                    catch (Exception var21_40) {}
                    try {
                        var26_20.setRid(var4_5);
                        var35_35 = new com.mintegral.msdk.video.bt.module.c(f.f.a.e.c.a.i().e());
                        var35_35.setLayoutParams((ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, -1));
                        var35_35.setInstanceId(var27_21);
                    }
                    catch (Exception var21_39) {}
                    try {
                        var35_35.setUnitId(var6_8);
                        var36_36 = new com.mintegral.msdk.video.bt.module.b(f.f.a.e.c.a.i().e());
                        var36_36.setLayoutParams((ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, -1));
                        var36_36.setInstanceId(var28_22);
                        var36_36.setUnitId(var6_8);
                        var36_36.setWebView((WebView)var26_20);
                        var37_37 = f.f.a.r.a.a.b.b().b(var6_8, var4_5);
                        var37_37.put((Object)var28_22, (Object)var36_36);
                        var37_37.put((Object)var27_21, (Object)var35_35);
                        var35_35.addView((View)var36_36, (ViewGroup.LayoutParams)new FrameLayout.LayoutParams(-1, -1));
                        return;
                    }
                    catch (Exception var21_38) {}
                    break block19;
                    catch (Exception var21_42) {
                        var22_33 = "RewardCampaignsResourceManager";
                    }
                }
                if (var14_12 != null) {
                    var14_12.a(var20_17, var5_3, var6_8, var4_5, var7_14, null, var21_41.getMessage());
                }
                if (f.f.a.a.a) {
                    var23_43 = var21_41.getLocalizedMessage();
                    f.f.a.e.f.h.d((String)var22_33, (String)var23_43);
                }
                return;
            }
            var40_24 = var47_29;
            ** GOTO lbl29
        }
        ++var41_25;
        ** while (true)
    }

    private static final class d {
        boolean a;
        boolean b;
        int c;
        int d;
        String e;
        List<f.f.a.e.e.a> f;
        CopyOnWriteArrayList<f.f.a.e.e.a> g;

        public d(boolean bl, boolean bl2, int n2, int n3, String string2, String string3, int n4, List<f.f.a.e.e.a> list) {
            this.a = bl;
            this.b = bl2;
            this.c = n2;
            this.d = n3;
            this.e = string2;
            this.f = list;
            this.g = new CopyOnWriteArrayList(list);
        }
    }

    public static interface f {
        public void a(String var1, String var2, String var3, List<f.f.a.e.e.a> var4);

        public void a(String var1, String var2, String var3, List<f.f.a.e.e.a> var4, String var5);
    }

    private static final class k
    extends Handler {
        private ConcurrentHashMap<String, f> a = new ConcurrentHashMap();
        private ConcurrentHashMap<String, List<f.f.a.e.e.a>> b = new ConcurrentHashMap();

        public k(Looper looper) {
            super(looper);
        }

        public final void a(Context context) {
        }

        public final void a(String string2, String string3, String string4, f f2) {
            ConcurrentHashMap<String, f> concurrentHashMap = this.a;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string3);
            stringBuilder.append("_");
            stringBuilder.append(string4);
            concurrentHashMap.put((Object)stringBuilder.toString(), (Object)f2);
        }

        public final void a(String string2, List<f.f.a.e.e.a> list) {
            this.b.put((Object)string2, list);
        }

        /*
         * Exception decompiling
         */
        public final void handleMessage(Message var1) {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [0[TRYBLOCK]], but top level block is 2[TRYBLOCK]
            // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:432)
            // org.benf.cfr.reader.b.a.a.j.d(Op04StructuredStatement.java:484)
            // org.benf.cfr.reader.b.a.a.i.a(Op03SimpleStatement.java:607)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:692)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
            // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
            // org.benf.cfr.reader.entities.g.p(Method.java:396)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
            // org.benf.cfr.reader.entities.d.c(ClassFile.java:773)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:870)
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
    }

    public static interface l {
        public void a(String var1, String var2, String var3, String var4);

        public void a(String var1, String var2, String var3, String var4, String var5);
    }

    public static interface m {
        public void a(String var1, String var2, String var3, String var4, String var5, a.a var6);

        public void a(String var1, String var2, String var3, String var4, String var5, a.a var6, String var7);
    }

    private static final class o {
        private static final c a = new c(null);
    }

}

