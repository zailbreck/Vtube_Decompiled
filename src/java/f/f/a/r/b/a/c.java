/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  f.f.a.e.f.h
 *  f.f.a.g.b
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package f.f.a.r.b.a;

import android.app.Activity;
import f.f.a.e.f.h;
import f.f.a.r.b.f;

public class c
implements f {
    protected boolean b = false;
    protected boolean c = false;
    protected int d = 0;
    protected int e = 0;
    protected int f = 0;
    protected int g = 0;
    protected int h = 1;
    protected int i = -1;
    protected String j;
    protected f.f.a.s.d.c k;
    protected f.f.a.g.b l;
    public f.a m = new a();

    @Override
    public final void a() {
        h.a((String)"DefaultJSCommon", (String)"release");
        f.f.a.g.b b2 = this.l;
        if (b2 != null) {
            b2.a(false);
            this.l.a(null);
            this.l.a();
        }
    }

    @Override
    public final void a(int n2) {
    }

    @Override
    public void a(int n2, String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("click:type");
        stringBuilder.append(n2);
        stringBuilder.append(",pt:");
        stringBuilder.append(string);
        h.a((String)"DefaultJSCommon", (String)stringBuilder.toString());
    }

    @Override
    public void a(Activity activity) {
        h.a((String)"DefaultJSCommon", (String)"setActivity ");
    }

    @Override
    public final void a(f.a a2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("setTrackingListener:");
        stringBuilder.append((Object)a2);
        h.a((String)"DefaultJSCommon", (String)stringBuilder.toString());
        this.m = a2;
    }

    @Override
    public final void a(f.f.a.s.d.c c2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("setSetting:");
        stringBuilder.append((Object)c2);
        h.a((String)"DefaultJSCommon", (String)stringBuilder.toString());
        this.k = c2;
    }

    @Override
    public final void a(boolean bl) {
        this.b = bl;
    }

    @Override
    public final int b() {
        return this.g;
    }

    @Override
    public final void b(int n2) {
        this.g = n2;
    }

    @Override
    public final void b(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("setUnitId:");
        stringBuilder.append(string);
        h.a((String)"DefaultJSCommon", (String)stringBuilder.toString());
        this.j = string;
    }

    @Override
    public final void c(int n2) {
    }

    @Override
    public final boolean c() {
        return this.b;
    }

    @Override
    public void d() {
        h.a((String)"DefaultJSCommon", (String)"finish");
    }

    @Override
    public final int e() {
        return this.i;
    }

    @Override
    public final int f() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("getAlertDialogRole ");
        stringBuilder.append(this.h);
        h.a((String)"DefaultJSCommon", (String)stringBuilder.toString());
        return this.h;
    }

    public final int g() {
        if (this.d == 0 && this.c) {
            this.d = 1;
        }
        return this.d;
    }

    public final int h() {
        if (this.e == 0 && this.c) {
            this.e = 1;
        }
        return this.e;
    }

    public final int i() {
        if (this.f == 0 && this.c) {
            this.f = 1;
        }
        return this.f;
    }

    public final boolean j() {
        return this.c;
    }

    public static class a
    implements f.a {
        @Override
        public void a() {
            h.a((String)"DefaultJSCommon", (String)"onInitSuccess");
        }

        @Override
        public void a(int n2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onDownloadProgress,progress:");
            stringBuilder.append(n2);
            h.a((String)"DefaultJSCommon", (String)stringBuilder.toString());
        }

        @Override
        public void a(f.f.a.m.a a2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onDownloadStart,campaign:");
            stringBuilder.append((Object)a2);
            h.a((String)"DefaultJSCommon", (String)stringBuilder.toString());
        }

        @Override
        public void a(f.f.a.m.a a2, String string) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onFinishRedirection,campaign:");
            stringBuilder.append((Object)a2);
            stringBuilder.append(",url:");
            stringBuilder.append(string);
            h.a((String)"DefaultJSCommon", (String)stringBuilder.toString());
        }

        @Override
        public void a(boolean bl) {
            h.a((String)"DefaultJSCommon", (String)"onStartInstall");
        }

        @Override
        public void b(f.f.a.m.a a2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onDownloadFinish,campaign:");
            stringBuilder.append((Object)a2);
            h.a((String)"DefaultJSCommon", (String)stringBuilder.toString());
        }

        @Override
        public void b(f.f.a.m.a a2, String string) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onFinishRedirection,campaign:");
            stringBuilder.append((Object)a2);
            stringBuilder.append(",url:");
            stringBuilder.append(string);
            h.a((String)"DefaultJSCommon", (String)stringBuilder.toString());
        }

        @Override
        public boolean b() {
            h.a((String)"DefaultJSCommon", (String)"onInterceptDefaultLoadingDialog");
            return false;
        }

        @Override
        public void c(f.f.a.m.a a2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onDismissLoading,campaign:");
            stringBuilder.append((Object)a2);
            h.a((String)"DefaultJSCommon", (String)stringBuilder.toString());
        }

        @Override
        public void c(f.f.a.m.a a2, String string) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onStartRedirection,campaign:");
            stringBuilder.append((Object)a2);
            stringBuilder.append(",url:");
            stringBuilder.append(string);
            h.a((String)"DefaultJSCommon", (String)stringBuilder.toString());
        }

        @Override
        public void d(f.f.a.m.a a2) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onShowLoading,campaign:");
            stringBuilder.append((Object)a2);
            h.a((String)"DefaultJSCommon", (String)stringBuilder.toString());
        }
    }

    public static final class b
    implements f.a {
        private f a;
        private f.a b;

        public b(f f2, f.a a2) {
            this.a = f2;
            this.b = a2;
        }

        @Override
        public final void a() {
            f.a a2 = this.b;
            if (a2 != null) {
                a2.a();
            }
        }

        @Override
        public final void a(int n2) {
            f.a a2 = this.b;
            if (a2 != null) {
                a2.a(n2);
            }
        }

        @Override
        public final void a(f.f.a.m.a a2) {
            f.a a3 = this.b;
            if (a3 != null) {
                a3.a(a2);
            }
        }

        @Override
        public final void a(f.f.a.m.a a2, String string) {
            f f2;
            f.a a3 = this.b;
            if (a3 != null) {
                a3.a(a2, string);
            }
            if ((f2 = this.a) != null) {
                f2.d();
            }
        }

        @Override
        public final void a(boolean bl) {
            f.a a2 = this.b;
            if (a2 != null) {
                a2.a(bl);
            }
        }

        @Override
        public final void b(f.f.a.m.a a2) {
            f.a a3 = this.b;
            if (a3 != null) {
                a3.b(a2);
            }
        }

        @Override
        public final void b(f.f.a.m.a a2, String string) {
            f f2;
            f.a a3 = this.b;
            if (a3 != null) {
                a3.b(a2, string);
            }
            if ((f2 = this.a) != null) {
                f2.d();
            }
        }

        @Override
        public final boolean b() {
            f.a a2 = this.b;
            return a2 != null && a2.b();
        }

        @Override
        public final void c(f.f.a.m.a a2) {
            f.a a3 = this.b;
            if (a3 != null) {
                a3.c(a2);
            }
        }

        @Override
        public final void c(f.f.a.m.a a2, String string) {
            f.a a3 = this.b;
            if (a3 != null) {
                a3.c(a2, string);
            }
        }

        @Override
        public final void d(f.f.a.m.a a2) {
            f.a a3 = this.b;
            if (a3 != null) {
                a3.d(a2);
            }
        }
    }

}

