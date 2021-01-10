/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package f.f.a.e.b.h;

import android.text.TextUtils;
import f.f.a.c;
import f.f.a.e.f.b;

public class a {
    private static String a = "";

    public static String a() {
        return a;
    }

    public static String b() {
        block4 : {
            String string;
            block5 : {
                c c2 = f.f.a.e.c.c.c().b();
                if (c2 == null) break block4;
                String string2 = c.a(c2);
                boolean bl = TextUtils.isEmpty((CharSequence)string2);
                string = null;
                if (bl) break block5;
                try {
                    string = b.a(string2);
                }
                catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
            }
            return string;
        }
        return null;
    }
}

