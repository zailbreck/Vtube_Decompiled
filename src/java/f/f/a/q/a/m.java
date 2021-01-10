/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 */
package f.f.a.q.a;

import f.f.a.q.a.i;
import f.f.a.q.a.m;
import f.f.a.q.a.r.b;

public abstract class m {
    public static m a(i i2, byte[] arrby) {
        return m.a(i2, arrby, 0, arrby.length);
    }

    public static m a(i i2, byte[] arrby, int n2, int n3) {
        if (arrby != null) {
            b.a(arrby.length, (long)n2, (long)n3);
            return new m(i2, n3, arrby, n2){
                final /* synthetic */ i a;
                final /* synthetic */ int b;
                final /* synthetic */ byte[] c;
                final /* synthetic */ int d;
                {
                    this.a = i2;
                    this.b = n2;
                    this.c = arrby;
                    this.d = n3;
                }
            };
        }
        throw new NullPointerException("content == null");
    }
}

