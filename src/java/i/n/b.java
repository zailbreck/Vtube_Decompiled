/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  i.n.a
 *  java.lang.Character
 */
package i.n;

import i.n.a;

class b
extends a {
    public static final boolean a(char c2, char c3, boolean bl) {
        if (c2 == c3) {
            return true;
        }
        if (!bl) {
            return false;
        }
        if (Character.toUpperCase((char)c2) == Character.toUpperCase((char)c3)) {
            return true;
        }
        return Character.toLowerCase((char)c2) == Character.toLowerCase((char)c3);
    }
}

