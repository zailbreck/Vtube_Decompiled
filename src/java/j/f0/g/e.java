/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Long
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  java.util.regex.Pattern
 */
package j.f0.g;

import j.a0;
import j.l;
import j.m;
import j.r;
import j.s;
import j.y;
import java.util.List;
import java.util.regex.Pattern;

public final class e {
    static {
        Pattern.compile((String)" +([^ \"=]*)=(:?\"([^\"]*)\"|([^ \"=]*)) *(:?,|$)");
    }

    public static int a(String string2, int n2) {
        long l2;
        block3 : {
            try {
                l2 = Long.parseLong((String)string2);
                if (l2 > Integer.MAX_VALUE) {
                    return Integer.MAX_VALUE;
                }
                if (l2 >= 0L) break block3;
                return 0;
            }
            catch (NumberFormatException numberFormatException) {}
        }
        n2 = (int)l2;
        return n2;
    }

    public static int a(String string2, int n2, String string3) {
        while (n2 < string2.length()) {
            if (string3.indexOf((int)string2.charAt(n2)) != -1) {
                return n2;
            }
            ++n2;
        }
        return n2;
    }

    public static long a(a0 a02) {
        return e.a(a02.o());
    }

    public static long a(r r2) {
        return e.a(r2.a("Content-Length"));
    }

    private static long a(String string2) {
        long l2;
        l2 = -1L;
        if (string2 == null) {
            return l2;
        }
        try {
            l2 = Long.parseLong((String)string2);
        }
        catch (NumberFormatException numberFormatException) {}
        return l2;
    }

    public static void a(m m2, s s2, r r2) {
        if (m2 == m.a) {
            return;
        }
        List<l> list = l.a(s2, r2);
        if (list.isEmpty()) {
            return;
        }
        m2.a(s2, list);
    }

    public static int b(String string2, int n2) {
        while (n2 < string2.length()) {
            char c2 = string2.charAt(n2);
            if (c2 != ' ' && c2 != '\t') {
                return n2;
            }
            ++n2;
        }
        return n2;
    }

    public static boolean b(a0 a02) {
        if (a02.s().e().equals((Object)"HEAD")) {
            return false;
        }
        int n2 = a02.m();
        if ((n2 < 100 || n2 >= 200) && n2 != 204 && n2 != 304) {
            return true;
        }
        if (e.a(a02) == -1L) {
            return "chunked".equalsIgnoreCase(a02.b("Transfer-Encoding"));
        }
        return true;
    }
}

