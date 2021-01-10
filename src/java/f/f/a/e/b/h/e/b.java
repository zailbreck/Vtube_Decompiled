/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package f.f.a.e.b.h.e;

import android.text.TextUtils;

public final class b {
    private final String a;
    private final String b;

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object != null) {
            if (b.class != object.getClass()) {
                return false;
            }
            b b2 = (b)object;
            return TextUtils.equals((CharSequence)this.a, (CharSequence)b2.a) && TextUtils.equals((CharSequence)this.b, (CharSequence)b2.b);
        }
        return false;
    }

    public final int hashCode() {
        return 31 * this.a.hashCode() + this.b.hashCode();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Header[name=");
        stringBuilder.append(this.a);
        stringBuilder.append(",value=");
        stringBuilder.append(this.b);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

