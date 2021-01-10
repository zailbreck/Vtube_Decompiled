/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package f.d.c.f.c;

import f.d.c.f.b.a;
import f.d.c.f.b.c;
import f.d.c.f.c.b;

public final class f {
    private f.d.c.f.b.b a;
    private a b;
    private c c;
    private int d = -1;
    private b e;

    public static boolean b(int n2) {
        return n2 >= 0 && n2 < 8;
    }

    public b a() {
        return this.e;
    }

    public void a(int n2) {
        this.d = n2;
    }

    public void a(a a2) {
        this.b = a2;
    }

    public void a(f.d.c.f.b.b b2) {
        this.a = b2;
    }

    public void a(c c2) {
        this.c = c2;
    }

    public void a(b b2) {
        this.e = b2;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(200);
        stringBuilder.append("<<\n");
        stringBuilder.append(" mode: ");
        stringBuilder.append((Object)this.a);
        stringBuilder.append("\n ecLevel: ");
        stringBuilder.append((Object)this.b);
        stringBuilder.append("\n version: ");
        stringBuilder.append((Object)this.c);
        stringBuilder.append("\n maskPattern: ");
        stringBuilder.append(this.d);
        if (this.e == null) {
            stringBuilder.append("\n matrix: null\n");
        } else {
            stringBuilder.append("\n matrix:\n");
            stringBuilder.append((Object)this.e);
        }
        stringBuilder.append(">>\n");
        return stringBuilder.toString();
    }
}

