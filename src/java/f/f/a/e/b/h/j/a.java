/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package f.f.a.e.b.h.j;

public final class a {
    public static String a(int n2) {
        if (n2 == 2) {
            return "Network error,I/O exception";
        }
        if (n2 == 3) {
            return "Network error,timeout exception";
        }
        if (n2 == 4) {
            return "Network unknown error";
        }
        if (n2 == -2) {
            return "Network is canceled";
        }
        if (n2 == 5) {
            return "Network error\uff0chttps is not work,please check your phone time";
        }
        if (n2 == 6) {
            return "Network error,please check";
        }
        if (n2 == 7) {
            return "The server returns an exception";
        }
        if (n2 == 8) {
            return "Cast exception, return data can't be casted correctly";
        }
        return "Network error,Load failed";
    }
}

