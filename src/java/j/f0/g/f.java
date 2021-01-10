/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package j.f0.g;

public final class f {
    public static boolean a(String string2) {
        return string2.equals((Object)"POST") || string2.equals((Object)"PATCH") || string2.equals((Object)"PUT") || string2.equals((Object)"DELETE") || string2.equals((Object)"MOVE");
        {
        }
    }

    public static boolean b(String string2) {
        return !string2.equals((Object)"GET") && !string2.equals((Object)"HEAD");
    }

    public static boolean c(String string2) {
        return true ^ string2.equals((Object)"PROPFIND");
    }

    public static boolean d(String string2) {
        return string2.equals((Object)"PROPFIND");
    }

    public static boolean e(String string2) {
        return string2.equals((Object)"POST") || string2.equals((Object)"PUT") || string2.equals((Object)"PATCH") || string2.equals((Object)"PROPPATCH") || string2.equals((Object)"REPORT");
        {
        }
    }
}

