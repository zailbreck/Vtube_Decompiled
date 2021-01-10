/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  java.lang.Object
 *  java.lang.String
 */
package e.j.b;

import android.net.Uri;

class x {
    static boolean a(Uri uri) {
        boolean bl;
        block5 : {
            block4 : {
                String string = uri.getScheme();
                if (string == null) {
                    return false;
                }
                if (string.equals((Object)"http") || string.equals((Object)"https")) break block4;
                boolean bl2 = string.equals((Object)"rtsp");
                bl = false;
                if (!bl2) break block5;
            }
            bl = true;
        }
        return bl;
    }
}

