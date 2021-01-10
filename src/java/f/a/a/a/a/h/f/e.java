/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.a.a.a.a.h.d
 *  f.a.a.a.a.h.f.c
 *  f.a.a.a.a.h.f.f
 *  f.a.a.a.a.h.g.d
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package f.a.a.a.a.h.f;

import f.a.a.a.a.h.d;
import f.a.a.a.a.h.f.c;
import f.a.a.a.a.h.f.f;

public abstract class e
implements c {
    private volatile f a;

    public abstract f a();

    public f b() {
        e e2 = this;
        synchronized (e2) {
            if (this.a == null || f.a.a.a.a.h.g.d.b() / 1000L > this.a.a() - 300L) {
                if (this.a != null) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("token expired! current time: ");
                    stringBuilder.append(f.a.a.a.a.h.g.d.b() / 1000L);
                    stringBuilder.append(" token expired: ");
                    stringBuilder.append(this.a.a());
                    d.a((String)stringBuilder.toString());
                }
                this.a = this.a();
            }
            f f2 = this.a;
            return f2;
        }
    }
}

