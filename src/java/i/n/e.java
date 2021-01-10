/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Appendable
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Object
 *  java.lang.String
 */
package i.n;

import i.k.a.a;
import i.k.b.d;

class e {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static <T> void a(Appendable var0_1, T var1, a<? super T, ? extends CharSequence> var2_2) {
        block3 : {
            d.c(var0_3, "$this$appendElement");
            if (var2_4 == null) break block3;
            var1_1 = var2_4.a(var1 /* !! */ );
            ** GOTO lbl-1000
        }
        var3_6 = var1 /* !! */  != null ? var1 /* !! */  instanceof CharSequence : true;
        if (var3_6) lbl-1000: // 2 sources:
        {
            var4_5 = (CharSequence)var1_2;
        } else {
            if (var1 /* !! */  instanceof Character) {
                var0_3.append(((Character)var1 /* !! */ ).charValue());
                return;
            }
            var4_5 = String.valueOf(var1 /* !! */ );
        }
        var0_3.append(var4_5);
    }
}

