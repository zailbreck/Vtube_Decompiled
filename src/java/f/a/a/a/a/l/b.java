/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  java.lang.Object
 */
package f.a.a.a.a.l;

import android.content.Context;
import f.a.a.a.a.g.c;
import f.a.a.a.a.k.d;
import f.a.a.a.a.k.e;
import f.a.a.a.a.l.a;
import j.v;

public class b<Request extends d, Result extends e> {
    private Request a;
    private v b;
    private a c = new a();
    private Context d;
    private f.a.a.a.a.g.a e;
    private f.a.a.a.a.g.b f;
    private c g;

    public b(v v2, Request Request, Context context) {
        this.a(v2);
        this.a(Request);
        this.d = context;
    }

    public Context a() {
        return this.d;
    }

    public void a(f.a.a.a.a.g.a<Request, Result> a2) {
        this.e = a2;
    }

    public void a(f.a.a.a.a.g.b b2) {
        this.f = b2;
    }

    public void a(c c2) {
        this.g = c2;
    }

    public void a(Request Request) {
        this.a = Request;
    }

    public void a(v v2) {
        this.b = v2;
    }

    public a b() {
        return this.c;
    }

    public v c() {
        return this.b;
    }

    public f.a.a.a.a.g.a<Request, Result> d() {
        return this.e;
    }

    public f.a.a.a.a.g.b e() {
        return this.f;
    }

    public Request f() {
        return this.a;
    }

    public c g() {
        return this.g;
    }
}

