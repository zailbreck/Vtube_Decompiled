/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.Object
 */
package h.b.r.h;

public final class c {
    public static int a(int n2) {
        return 1 << 32 - Integer.numberOfLeadingZeros((int)(n2 - 1));
    }
}

