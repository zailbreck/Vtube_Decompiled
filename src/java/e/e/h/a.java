/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Base64
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.List
 */
package e.e.h;

import android.util.Base64;
import e.e.j.e;
import java.util.List;

public final class a {
    private final String a;
    private final String b;
    private final String c;
    private final List<List<byte[]>> d;
    private final int e;
    private final String f;

    public a(String string, String string2, String string3, List<List<byte[]>> list) {
        e.a(string);
        this.a = string;
        e.a(string2);
        this.b = string2;
        e.a(string3);
        this.c = string3;
        e.a(list);
        this.d = list;
        this.e = 0;
        StringBuilder stringBuilder = new StringBuilder(this.a);
        stringBuilder.append("-");
        stringBuilder.append(this.b);
        stringBuilder.append("-");
        stringBuilder.append(this.c);
        this.f = stringBuilder.toString();
    }

    public List<List<byte[]>> a() {
        return this.d;
    }

    public int b() {
        return this.e;
    }

    public String c() {
        return this.f;
    }

    public String d() {
        return this.a;
    }

    public String e() {
        return this.b;
    }

    public String f() {
        return this.c;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("FontRequest {mProviderAuthority: ");
        stringBuilder2.append(this.a);
        stringBuilder2.append(", mProviderPackage: ");
        stringBuilder2.append(this.b);
        stringBuilder2.append(", mQuery: ");
        stringBuilder2.append(this.c);
        stringBuilder2.append(", mCertificates:");
        stringBuilder.append(stringBuilder2.toString());
        for (int i2 = 0; i2 < this.d.size(); ++i2) {
            stringBuilder.append(" [");
            List list = (List)this.d.get(i2);
            for (int i3 = 0; i3 < list.size(); ++i3) {
                stringBuilder.append(" \"");
                stringBuilder.append(Base64.encodeToString((byte[])((byte[])list.get(i3)), (int)0));
                stringBuilder.append("\"");
            }
            stringBuilder.append(" ]");
        }
        stringBuilder.append("}");
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("mCertificatesArray: ");
        stringBuilder3.append(this.e);
        stringBuilder.append(stringBuilder3.toString());
        return stringBuilder.toString();
    }
}

