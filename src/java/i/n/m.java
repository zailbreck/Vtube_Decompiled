/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package i.n;

import i.k.b.d;
import i.m.b;
import i.n.l;
import i.n.n;

class m
extends l {
    public static final String a(String string, String string2, String string3, boolean bl) {
        d.c(string, "$this$replace");
        d.c(string2, "oldValue");
        d.c(string3, "newValue");
        return b.a(n.b((CharSequence)string, new String[]{string2}, bl, 0, 4, null), string3, null, null, 0, null, null, 62, null);
    }

    public static /* synthetic */ String a(String string, String string2, String string3, boolean bl, int n2, Object object) {
        if ((n2 & 4) != 0) {
            bl = false;
        }
        return m.a(string, string2, string3, bl);
    }

    public static final boolean a(String string, int n2, String string2, int n3, int n4, boolean bl) {
        d.c(string, "$this$regionMatches");
        d.c(string2, "other");
        if (!bl) {
            return string.regionMatches(n2, string2, n3, n4);
        }
        return string.regionMatches(bl, n2, string2, n3, n4);
    }

    public static boolean a(String string, String string2, boolean bl) {
        if (string == null) {
            return string2 == null;
        }
        if (!bl) {
            return string.equals((Object)string2);
        }
        return string.equalsIgnoreCase(string2);
    }
}

