/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package f.a.a.a.a.i;

import java.io.IOException;

public class a
extends IOException {
    private Long b;
    private Long c;
    private String d;

    public a(Long l2, Long l3, String string) {
        this.b = l2;
        this.c = l3;
        this.d = string;
    }

    public String getMessage() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("InconsistentException: inconsistent object\n[RequestId]: ");
        stringBuilder.append(this.d);
        stringBuilder.append("\n[ClientChecksum]: ");
        stringBuilder.append((Object)this.b);
        stringBuilder.append("\n[ServerChecksum]: ");
        stringBuilder.append((Object)this.c);
        return stringBuilder.toString();
    }
}

