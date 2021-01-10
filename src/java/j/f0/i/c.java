/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package j.f0.i;

import k.f;

public final class c {
    public static final f d = f.c(":");
    public static final f e = f.c(":status");
    public static final f f = f.c(":method");
    public static final f g = f.c(":path");
    public static final f h = f.c(":scheme");
    public static final f i = f.c(":authority");
    public final f a;
    public final f b;
    final int c;

    public c(String string2, String string3) {
        super(f.c(string2), f.c(string3));
    }

    public c(f f2, String string2) {
        super(f2, f.c(string2));
    }

    public c(f f2, f f3) {
        this.a = f2;
        this.b = f3;
        this.c = 32 + f2.e() + f3.e();
    }

    public boolean equals(Object object) {
        boolean bl = object instanceof c;
        boolean bl2 = false;
        if (bl) {
            c c2 = (c)object;
            boolean bl3 = this.a.equals(c2.a);
            bl2 = false;
            if (bl3) {
                boolean bl4 = this.b.equals(c2.b);
                bl2 = false;
                if (bl4) {
                    bl2 = true;
                }
            }
        }
        return bl2;
    }

    public int hashCode() {
        return 31 * (527 + this.a.hashCode()) + this.b.hashCode();
    }

    public String toString() {
        Object[] arrobject = new Object[]{this.a.h(), this.b.h()};
        return j.f0.c.a("%s: %s", arrobject);
    }
}

