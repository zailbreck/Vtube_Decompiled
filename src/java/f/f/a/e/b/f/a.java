/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 */
package f.f.a.e.b.f;

public abstract class a
implements Runnable {
    public static long d;
    public a b = a.b;
    public b c;

    public a() {
        d = 1L + d;
    }

    private void a(a a2) {
        this.b = a2;
        b b2 = this.c;
        if (b2 != null) {
            b2.a(a2);
        }
    }

    public abstract void a();

    public abstract void b();

    public final void c() {
        a a2 = this.b;
        a a3 = a.e;
        if (a2 != a3) {
            this.a(a3);
            this.b();
        }
    }

    public final void run() {
        try {
            if (this.b == a.b) {
                this.a(a.c);
                this.a();
                this.a(a.f);
                return;
            }
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final /* enum */ a d = new a();
        public static final /* enum */ a e = new a();
        public static final /* enum */ a f = new a();
        private static final /* synthetic */ a[] g;

        static {
            a[] arra = new a[]{b, c, d, e, f};
            g = arra;
        }

        public static a valueOf(String string) {
            return (a)Enum.valueOf(a.class, (String)string);
        }

        public static a[] values() {
            return (a[])g.clone();
        }
    }

    public static interface b {
        public void a(a var1);
    }

}

