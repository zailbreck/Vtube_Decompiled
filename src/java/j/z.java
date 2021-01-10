/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 */
package j;

import j.f0.c;
import j.u;
import j.z;
import k.d;

public abstract class z {
    public static z a(u u2, byte[] arrby) {
        return z.a(u2, arrby, 0, arrby.length);
    }

    public static z a(u u2, byte[] arrby, int n2, int n3) {
        if (arrby != null) {
            c.a(arrby.length, (long)n2, (long)n3);
            return new z(u2, n3, arrby, n2){
                final /* synthetic */ u a;
                final /* synthetic */ int b;
                final /* synthetic */ byte[] c;
                final /* synthetic */ int d;
                {
                    this.a = u2;
                    this.b = n2;
                    this.c = arrby;
                    this.d = n3;
                }

                public long a() {
                    return this.b;
                }

                public void a(d d2) {
                    d2.write(this.c, this.d, this.b);
                }

                public u b() {
                    return this.a;
                }
            };
        }
        throw new NullPointerException("content == null");
    }

    public abstract long a();

    public abstract void a(d var1);

    public abstract u b();
}

