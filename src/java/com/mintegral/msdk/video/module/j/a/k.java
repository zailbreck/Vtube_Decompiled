/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  com.mintegral.msdk.base.common.report.c
 *  com.mintegral.msdk.video.module.j.a.f
 *  com.mintegral.msdk.video.module.j.a.k$a
 *  com.mintegral.msdk.video.module.j.a.k$b
 *  com.mintegral.msdk.video.module.j.b
 *  com.mintegral.msdk.video.module.k.a
 *  f.f.a.e.b.a.c
 *  f.f.a.e.b.g.b
 *  f.f.a.e.c.a
 *  f.f.a.e.e.f
 *  f.f.a.e.e.n
 *  f.f.a.e.f.d
 *  f.f.a.e.f.h
 *  f.f.a.e.f.r
 *  f.f.a.g.b
 *  java.io.File
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.List
 *  java.util.Map
 */
package com.mintegral.msdk.video.module.j.a;

import android.content.Context;
import android.text.TextUtils;
import com.mintegral.msdk.base.common.report.c;
import com.mintegral.msdk.video.module.j.a.f;
import com.mintegral.msdk.video.module.j.a.k;
import f.f.a.e.d.j;
import f.f.a.e.d.q;
import f.f.a.e.d.r;
import f.f.a.e.e.n;
import f.f.a.e.f.d;
import f.f.a.e.f.h;
import f.f.a.s.a$b;
import java.io.File;
import java.util.List;
import java.util.Map;

public class k
extends f {
    protected boolean a;
    protected f.f.a.e.e.a b;
    protected boolean c = false;
    protected f.f.a.s.f.a d;
    protected String e;
    protected String f;
    protected com.mintegral.msdk.video.module.j.b g = new f();
    protected int h = 1;
    private boolean i = false;
    private boolean j = false;
    private boolean k = false;

    public k(f.f.a.e.e.a a2, f.f.a.s.f.a a3, f.f.a.s.b.d d2, String string, String string2, com.mintegral.msdk.video.module.j.b b2, int n2, boolean bl) {
        if (!bl && a2 != null && f.f.a.e.f.r.b((String)string2) && a3 != null && b2 != null) {
            this.b = a2;
            this.f = string;
            this.e = string2;
            this.d = a3;
            this.g = b2;
            this.a = true;
            this.h = n2;
            this.c = false;
            return;
        }
        if (bl && a2 != null && f.f.a.e.f.r.b((String)string2) && b2 != null) {
            this.b = a2;
            this.f = string;
            this.e = string2;
            this.d = a3;
            this.g = b2;
            this.a = true;
            this.h = n2;
            this.c = true;
        }
    }

    public final void a() {
        if (this.a && this.b != null) {
            int n2 = d.z((Context)f.f.a.e.c.a.i().e());
            n n3 = new n("2000061", this.b.e(), this.b.L0(), this.e, n2);
            int n4 = this.b.m1() ? n.D : n.E;
            n3.a(n4);
            c.d((n)n3, (Context)f.f.a.e.c.a.i().e(), (String)this.e);
        }
    }

    public final void a(int n2) {
        if (this.b != null) {
            if (n2 != 1 && n2 != 2) {
                return;
            }
            com.mintegral.msdk.video.module.k.a.a((Context)f.f.a.e.c.a.i().e(), (f.f.a.e.e.a)this.b, (int)n2, (int)this.h);
        }
    }

    public void a(int n2, Object object) {
        super.a(n2, object);
        this.g.a(n2, object);
    }

    public final void a(int n2, String string) {
        if (this.b != null) {
            int n3 = d.z((Context)f.f.a.e.c.a.i().e());
            n n4 = new n("2000062", this.b.e(), this.b.L0(), this.e, n3, n2, string);
            c.e((n)n4, (Context)f.f.a.e.c.a.i().e(), (String)this.e);
        }
    }

    protected final void a(String string) {
        block6 : {
            r r2;
            n n2;
            block7 : {
                if (!this.a) break block6;
                r2 = r.a(f.f.a.e.d.h.a(f.f.a.e.c.a.i().e()));
                if (!TextUtils.isEmpty((CharSequence)this.b.u0())) {
                    int n3 = d.z((Context)f.f.a.e.c.a.i().e());
                    String string2 = this.b.u0();
                    String string3 = d.a((Context)f.f.a.e.c.a.i().e(), (int)n3);
                    n2 = new n("2000021", n3, string2, string, string3);
                    break block7;
                }
                boolean bl = TextUtils.isEmpty((CharSequence)this.b.F());
                n2 = null;
                if (bl) break block7;
                try {
                    int n4 = d.z((Context)f.f.a.e.c.a.i().e());
                    String string4 = this.b.F();
                    String string5 = d.a((Context)f.f.a.e.c.a.i().e(), (int)n4);
                    n2 = new n("2000021", n4, string4, string, string5);
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
            if (n2 != null) {
                n2.k(this.b.e());
                n2.c(this.b.d1());
                n2.m(string);
                n2.i(this.b.M0());
                n2.j(this.e);
                r2.a(n2);
                return;
            }
        }
    }

    public final void b() {
        try {
            if (this.a && this.b != null && f.f.a.e.f.r.b((String)this.e) && f.f.a.e.c.a.i().e() != null) {
                j j2 = j.a(f.f.a.e.d.h.a(f.f.a.e.c.a.i().e()));
                f.f.a.e.e.f f2 = new f.f.a.e.e.f();
                f2.a(System.currentTimeMillis());
                f2.b(this.e);
                f2.a(this.b.e());
                j2.a(f2);
                return;
            }
        }
        catch (Throwable throwable) {
            h.b((String)"NotifyListener", (String)throwable.getMessage(), (Throwable)throwable);
        }
    }

    public final void b(int n2) {
        String string;
        f.f.a.e.e.a a2 = this.b;
        if (!(a2 == null || TextUtils.isEmpty((CharSequence)(string = a2.u0())) || n2 != 1 && n2 != 2)) {
            if (string.contains((CharSequence)"endscreen_type")) {
                if (n2 == 2) {
                    if (string.contains((CharSequence)"endscreen_type=1")) {
                        string = string.replace((CharSequence)"endscreen_type=1", (CharSequence)"endscreen_type=2");
                    }
                } else if (string.contains((CharSequence)"endscreen_type=2")) {
                    string = string.replace((CharSequence)"endscreen_type=2", (CharSequence)"endscreen_type=1");
                }
            } else {
                StringBuilder stringBuilder = new StringBuilder(string);
                String string2 = string.contains((CharSequence)"?") ? "&endscreen_type=" : "?endscreen_type=";
                stringBuilder.append(string2);
                stringBuilder.append(n2);
                string = stringBuilder.toString();
            }
            this.b.P(string);
        }
    }

    public final void c() {
        try {
            if (this.a && this.b != null && f.f.a.e.f.r.b((String)this.e)) {
                a$b.a().a(this.b, this.e);
            }
            f.f.a.e.b.g.b.a().execute((Runnable)new a(this));
            return;
        }
        catch (Throwable throwable) {
            h.b((String)"NotifyListener", (String)throwable.getMessage(), (Throwable)throwable);
            return;
        }
    }

    protected final void d() {
        f.f.a.s.f.a a2 = this.d;
        if (a2 != null) {
            a2.b(true);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected final void e() {
        try {
            StringBuilder stringBuilder;
            if (!this.a) return;
            if (TextUtils.isEmpty((CharSequence)this.b.B0())) return;
            if (f.f.a.e.b.a.c.b == null) return;
            if (f.f.a.e.b.a.c.b.containsKey((Object)this.b.B0())) return;
            if (this.j) return;
            f.f.a.e.b.a.c.b.put((Object)this.b.B0(), (Object)System.currentTimeMillis());
            String string = this.b.B0();
            int n2 = this.b.S0();
            if (n2 == 1) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append("&to=1&cbt=");
                stringBuilder.append(this.b.C());
                stringBuilder.append("&tmorl=");
                stringBuilder.append(this.h);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append("&to=0&cbt=");
                stringBuilder.append(this.b.C());
                stringBuilder.append("&tmorl=");
                stringBuilder.append(this.h);
            }
            String string2 = stringBuilder.toString();
            if (!this.c) {
                f.f.a.g.b.a((Context)f.f.a.e.c.a.i().e(), (f.f.a.e.e.a)this.b, (String)this.e, (String)string2, (boolean)false, (boolean)true);
                this.c();
            }
            this.j = true;
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected final void f() {
        try {
            StringBuilder stringBuilder;
            if (!this.a) return;
            if (this.i) return;
            if (TextUtils.isEmpty((CharSequence)this.b.Y())) return;
            this.i = true;
            String string = this.b.Y();
            int n2 = this.b.S0();
            if (n2 == 1) {
                stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append("&to=1&cbt=");
                stringBuilder.append(this.b.C());
                stringBuilder.append("&tmorl=");
                stringBuilder.append(this.h);
            } else {
                stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append("&to=0&cbt=");
                stringBuilder.append(this.b.C());
                stringBuilder.append("&tmorl=");
                stringBuilder.append(this.h);
            }
            String string2 = stringBuilder.toString();
            f.f.a.g.b.a((Context)f.f.a.e.c.a.i().e(), (f.f.a.e.e.a)this.b, (String)this.e, (String)string2, (boolean)false, (boolean)true);
            com.mintegral.msdk.video.module.k.a.a((Context)f.f.a.e.c.a.i().e(), (f.f.a.e.e.a)this.b);
            new Thread((Runnable)new b(this)).start();
            if (!this.a) return;
            if (f.f.a.e.b.a.c.d == null) return;
            if (TextUtils.isEmpty((CharSequence)this.b.e())) return;
            f.f.a.e.b.a.c.a((String)this.e, (f.f.a.e.e.a)this.b, (String)"reward");
            return;
        }
        catch (Throwable throwable) {
            h.b((String)"NotifyListener", (String)throwable.getMessage(), (Throwable)throwable);
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    protected final void g() {
        List<String> list;
        if (!this.a || this.k || this.b == null) return;
        this.k = true;
        if (this.c || (list = this.b.H0()) == null) return;
        try {
            if (list.size() <= 0) return;
            for (String string : list) {
                f.f.a.g.b.a((Context)f.f.a.e.c.a.i().e(), (f.f.a.e.e.a)this.b, (String)this.e, (String)string, (boolean)false, (boolean)true);
            }
            return;
        }
        catch (Throwable throwable) {
            h.d((String)"NotifyListener", (String)throwable.getMessage());
        }
    }

    protected final void h() {
        try {
            if (this.a && this.d != null) {
                File file;
                if (this.d.l() != null && !TextUtils.isEmpty((CharSequence)this.d.l().d1())) {
                    String string = this.d.l().d1();
                    q.a(f.f.a.e.d.h.a(f.f.a.e.c.a.i().e())).a(string);
                }
                if (!TextUtils.isEmpty((CharSequence)this.d.d()) && (file = new File(this.d.d())).exists() && file.isFile() && file.delete()) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("DEL File :");
                    stringBuilder.append(file.getAbsolutePath());
                    h.a((String)"NotifyListener", (String)stringBuilder.toString());
                    return;
                }
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

