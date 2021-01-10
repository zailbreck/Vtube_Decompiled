/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 */
package f.f.a.e.b.h.j;

import f.f.a.e.b.h.k.c;
import f.f.a.e.f.r;

public class b {
    public static void a(c c2, String string, String string2) {
        if (c2 != null) {
            try {
                if (!r.a(string)) {
                    if (r.a(string2)) {
                        return;
                    }
                    c2.a(string, string2);
                    return;
                }
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }
}

