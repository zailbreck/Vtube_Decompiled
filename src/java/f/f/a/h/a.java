/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package f.f.a.h;

import android.content.Context;
import f.f.a.e.f.d;
import f.f.a.e.f.l;
import f.f.a.f.c;
import f.f.a.h.a;
import f.f.a.h.a$c;
import java.util.ArrayList;
import java.util.List;

public final class a {
    public static int b = 3;
    public static int c = 4;
    public static int d = 5;
    private f.f.a.g.b a;

    private a() {
    }

    /* synthetic */ a(a a2) {
    }

    public static a a() {
        return b.a;
    }

    static /* synthetic */ List a(a a2, Context context, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); ++i2) {
            int n2;
            f.f.a.e.e.a a3 = (f.f.a.e.e.a)list.get(i2);
            if (a3 == null) continue;
            boolean bl = l.a(context, a3.g());
            if (a3.g1() != 1 && bl && !l.a(a3)) continue;
            arrayList.add((Object)a3);
            if (a3 == null || a3.l0() != 3 || (n2 = a3.e0()) == 0 || n2 != 1 && d.z(context) != 9) continue;
            a2.a(context, a3, 2);
        }
        return arrayList;
    }

    public final void a(Context context, int n2, a$c a$c) {
        f.f.a.e.b.f.a a2 = new f.f.a.e.b.f.a((a)this, context, a$c, n2){
            final /* synthetic */ Context e;
            final /* synthetic */ a$c f;
            final /* synthetic */ int g;
            final /* synthetic */ a h;
            {
                this.h = a2;
                this.e = context;
                this.f = a$c;
                this.g = n2;
            }

            public final void a() {
                String string;
                f.f.a.h.b$e b$e = new f.f.a.h.b$e(this.e);
                f.f.a.e.b.h.k.c c2 = new f.f.a.e.b.h.k.c();
                f.f.a.f.a a2 = c.b().a(f.f.a.e.c.a.i().f());
                if (a2 == null) {
                    a2 = c.b().a();
                }
                if (android.text.TextUtils.isEmpty((java.lang.CharSequence)(string = a2.E()))) {
                    this.f.a(1, "unit id is empty");
                    return;
                }
                c2.a("app_id", f.f.a.e.c.a.i().f());
                java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
                stringBuilder.append(f.f.a.e.c.a.i().f());
                stringBuilder.append(f.f.a.e.c.a.i().g());
                c2.a("sign", f.f.a.e.f.a.a(stringBuilder.toString()));
                c2.a("jm_a", f.f.a.h.b.a(this.e).c());
                java.lang.StringBuilder stringBuilder2 = new java.lang.StringBuilder();
                stringBuilder2.append(f.f.a.h.b.a(this.e).a());
                stringBuilder2.append("");
                c2.a("jm_n", stringBuilder2.toString());
                c2.a("jm_l", f.f.a.h.b.a(this.e).b());
                c2.a("unit_id", string);
                c2.a("jm_dp_ads", f.f.a.e.d.e.a(f.f.a.e.d.h.a(f.f.a.e.c.a.i().e())).d(string));
                java.lang.StringBuilder stringBuilder3 = new java.lang.StringBuilder();
                stringBuilder3.append(this.g);
                stringBuilder3.append("");
                c2.a("req_type", stringBuilder3.toString());
                c2.a("ad_type", "289");
                android.os.Looper.prepare();
                f.f.a.h.b$f b$f = new f.f.a.h.b$f(this){
                    final /* synthetic */ a g;
                    {
                        this.g = a2;
                    }

                    public final void a(int n2, String string, f.f.a.e.e.b b2) {
                        if (this.g.f == null) {
                            return;
                        }
                        if (b2 != null && b2.h() == a.b) {
                            this.g.f.a();
                            return;
                        }
                        this.g.f.a(n2, string);
                    }

                    public final void a(List<f.f.a.e.b.h.e.b> list, f.f.a.e.e.b b2) {
                        if (this.g.f == null) {
                            return;
                        }
                        if (b2.h() == a.b) {
                            this.g.f.a();
                            return;
                        }
                        a a2 = this.g;
                        a2.f.a((List<f.f.a.e.e.a>)a.a(a2.h, a2.e, b2.c()));
                    }
                };
                b$f.b = string;
                b$e.a(1, f.f.a.e.b.h.j.d.a().g, c2, b$f);
                android.os.Looper.loop();
            }

            public final void b() {
            }
        };
        new f.f.a.e.b.f.b(context).a(a2);
    }

    public final void a(Context context, f.f.a.e.e.a a2, int n2) {
        f.f.a.f.a a3 = c.b().a(f.f.a.e.c.a.i().f());
        if (a3 == null) {
            a3 = c.b().a();
        }
        if (this.a == null) {
            this.a = new f.f.a.g.b(context, a3.E());
        }
        if (n2 == 1) {
            this.a.b(a2);
            return;
        }
        if (n2 == 2) {
            this.a.a(a2);
        }
    }

    public final void a(Context context, f.f.a.e.e.a a2, a$c a$c) {
        this.a(context, d, a$c);
        this.a(context, a2, 1);
    }

    private static final class b {
        private static a a = new a(null);
    }

}

