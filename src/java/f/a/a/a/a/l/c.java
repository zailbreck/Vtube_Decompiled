/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  j.t
 *  j.v$b
 *  java.io.InputStream
 *  java.lang.Object
 *  java.lang.String
 */
package f.a.a.a.a.l;

import f.a.a.a.a.l.b;
import f.a.a.a.a.l.c;
import f.a.a.a.a.l.e;
import j.t;
import j.v;
import java.io.InputStream;

public class c {
    public static e a(InputStream inputStream, long l2, String string, b b2) {
        e e2 = new e(inputStream, l2, string, b2);
        return e2;
    }

    public static v a(v v2, b b2) {
        v.b b3 = v2.q();
        b3.a(new t(b2){
            final /* synthetic */ b a;
            {
                this.a = b2;
            }

            public j.a0 a(j.t$a a2) {
                j.a0 a02 = a2.a(a2.d());
                j.a0$a a3 = a02.p();
                a3.a(new f.a.a.a.a.l.f<T>(a02.a(), this.a));
                return a3.a();
            }
        });
        return b3.a();
    }
}

