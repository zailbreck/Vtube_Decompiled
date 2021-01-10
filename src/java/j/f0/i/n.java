/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package j.f0.i;

import j.f0.i.b;
import java.io.IOException;

public final class n
extends IOException {
    public final b b;

    public n(b b2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("stream was reset: ");
        stringBuilder.append((Object)b2);
        super(stringBuilder.toString());
        this.b = b2;
    }
}

