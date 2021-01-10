/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.media.MediaFormat
 *  e.j.a.c
 *  e.j.a.c$c
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package e.j.a.h;

import android.media.MediaFormat;
import e.j.a.c;

public final class a
extends c.c {
    private final int a;
    private final MediaFormat b;

    public a(int n2, MediaFormat mediaFormat) {
        this.a = n2;
        this.b = mediaFormat;
    }

    public MediaFormat a() {
        if (this.a == 4) {
            return this.b;
        }
        return null;
    }

    public int b() {
        return this.a;
    }

    /*
     * Enabled aggressive block sorting
     */
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append(a.class.getName());
        stringBuilder.append('{');
        int n2 = this.a;
        String string = n2 != 1 ? (n2 != 2 ? (n2 != 4 ? (n2 != 5 ? "UNKNOWN" : "METADATA") : "SUBTITLE") : "AUDIO") : "VIDEO";
        stringBuilder.append(string);
        stringBuilder.append(", ");
        stringBuilder.append((Object)this.b);
        stringBuilder.append("}");
        return stringBuilder.toString();
    }
}

