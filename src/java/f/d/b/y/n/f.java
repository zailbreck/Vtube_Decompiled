/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.d.b.a0.c
 *  f.d.b.l
 *  f.d.b.y.n.f$a
 *  java.io.IOException
 *  java.io.Writer
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.List
 */
package f.d.b.y.n;

import f.d.b.a0.c;
import f.d.b.i;
import f.d.b.l;
import f.d.b.n;
import f.d.b.o;
import f.d.b.q;
import f.d.b.y.n.f;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public final class f
extends c {
    private static final Writer p = new a();
    private static final q q = new q("closed");
    private final List<l> m = new ArrayList();
    private String n;
    private l o = n.a;

    public f() {
        super(p);
    }

    private void a(l l2) {
        if (this.n != null) {
            if (!l2.e() || this.o()) {
                ((o)f.super.t()).a(this.n, l2);
            }
            this.n = null;
            return;
        }
        if (this.m.isEmpty()) {
            this.o = l2;
            return;
        }
        l l3 = f.super.t();
        if (l3 instanceof i) {
            ((i)l3).a(l2);
            return;
        }
        throw new IllegalStateException();
    }

    private l t() {
        List<l> list = this.m;
        return (l)list.get(-1 + list.size());
    }

    public c a() {
        i i2 = new i();
        this.a(i2);
        this.m.add((Object)i2);
        return this;
    }

    public c a(Boolean bl) {
        if (bl == null) {
            this.r();
            return this;
        }
        f.super.a(new q(bl));
        return this;
    }

    public c a(Number number) {
        double d2;
        if (number == null) {
            this.r();
            return this;
        }
        if (!this.q() && (Double.isNaN((double)(d2 = number.doubleValue())) || Double.isInfinite((double)d2))) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("JSON forbids NaN and infinities: ");
            stringBuilder.append((Object)number);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        f.super.a(new q(number));
        return this;
    }

    public c b() {
        o o2 = new o();
        this.a(o2);
        this.m.add((Object)o2);
        return this;
    }

    public c b(String string) {
        if (!this.m.isEmpty() && this.n == null) {
            if (f.super.t() instanceof o) {
                this.n = string;
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    public void close() {
        if (this.m.isEmpty()) {
            this.m.add((Object)q);
            return;
        }
        throw new IOException("Incomplete document");
    }

    public c d(String string) {
        if (string == null) {
            this.r();
            return this;
        }
        f.super.a(new q(string));
        return this;
    }

    public c d(boolean bl) {
        f.super.a(new q(bl));
        return this;
    }

    public c f(long l2) {
        f.super.a(new q(l2));
        return this;
    }

    public void flush() {
    }

    public c m() {
        if (!this.m.isEmpty() && this.n == null) {
            if (this.t() instanceof i) {
                List<l> list = this.m;
                list.remove(-1 + list.size());
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    public c n() {
        if (!this.m.isEmpty() && this.n == null) {
            if (this.t() instanceof o) {
                List<l> list = this.m;
                list.remove(-1 + list.size());
                return this;
            }
            throw new IllegalStateException();
        }
        throw new IllegalStateException();
    }

    public c r() {
        this.a(n.a);
        return this;
    }

    public l s() {
        if (this.m.isEmpty()) {
            return this.o;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected one JSON element but was ");
        stringBuilder.append(this.m);
        throw new IllegalStateException(stringBuilder.toString());
    }
}

