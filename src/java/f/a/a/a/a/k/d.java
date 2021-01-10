/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package f.a.a.a.a.k;

public class d {
    private boolean a = true;
    private Enum b = a.b;

    public Enum a() {
        return this.b;
    }

    public void a(Enum enum_) {
        this.b = enum_;
    }

    public boolean b() {
        return this.a;
    }

    public static final class a
    extends Enum<a> {
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final /* enum */ a d = new a();
        private static final /* synthetic */ a[] e;

        static {
            a[] arra = new a[]{b, c, d};
            e = arra;
        }

        public static a valueOf(String string) {
            return (a)Enum.valueOf(a.class, (String)string);
        }

        public static a[] values() {
            return (a[])e.clone();
        }
    }

}

