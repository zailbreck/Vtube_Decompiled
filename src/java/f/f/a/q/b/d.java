/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.CharSequence
 *  java.lang.Character
 *  java.lang.Comparable
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.nio.charset.Charset
 *  java.util.Arrays
 */
package f.f.a.q.b;

import f.f.a.q.b.j;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;

public class d
implements Serializable,
Comparable<d> {
    static final char[] e = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static final d f = d.a(new byte[0]);
    final byte[] b;
    transient int c;
    transient String d;

    d(byte[] arrby) {
        this.b = arrby;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static int a(char n2) {
        if (n2 >= 48 && n2 <= 57) {
            return n2 - 48;
        }
        int n3 = 97;
        if (n2 >= n3 && n2 <= 102) {
            return 10 + (n2 - n3);
        }
        n3 = 65;
        if (n2 >= n3 && n2 <= 70) {
            return 10 + (n2 - n3);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected hex digit: ");
        stringBuilder.append((char)n2);
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
        throw illegalArgumentException;
    }

    static int a(String string2, int n2) {
        int n3;
        int n4 = string2.length();
        int n5 = 0;
        for (int i2 = 0; i2 < n4; i2 += Character.charCount((int)n3)) {
            if (n5 == n2) {
                return i2;
            }
            n3 = string2.codePointAt(i2);
            if (Character.isISOControl((int)n3) && n3 != 10 && n3 != 13 || n3 == 65533) {
                return -1;
            }
            ++n5;
        }
        return string2.length();
    }

    public static d a(String string2) {
        IllegalArgumentException illegalArgumentException;
        if (string2 != null) {
            if (string2.length() % 2 == 0) {
                byte[] arrby = new byte[string2.length() / 2];
                for (int i2 = 0; i2 < arrby.length; ++i2) {
                    int n2 = i2 * 2;
                    arrby[i2] = (byte)((d.a(string2.charAt(n2)) << 4) + d.a(string2.charAt(n2 + 1)));
                }
                return d.a(arrby);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected hex string: ");
            stringBuilder.append(string2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        illegalArgumentException = new IllegalArgumentException("hex == null");
        throw illegalArgumentException;
    }

    public static /* varargs */ d a(byte ... arrby) {
        if (arrby != null) {
            return new d((byte[])arrby.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public byte a(int n2) {
        return this.b[n2];
    }

    public int a(d d2) {
        int n2 = this.b();
        int n3 = d2.b();
        int n4 = Math.min((int)n2, (int)n3);
        for (int i2 = 0; i2 < n4; ++i2) {
            int n5;
            int n6 = 255 & this.a(i2);
            if (n6 == (n5 = 255 & d2.a(i2))) {
                continue;
            }
            if (n6 < n5) {
                return -1;
            }
            return 1;
        }
        if (n2 == n3) {
            return 0;
        }
        if (n2 < n3) {
            return -1;
        }
        return 1;
    }

    public d a(int n2, int n3) {
        if (n2 >= 0) {
            byte[] arrby = this.b;
            if (n3 <= arrby.length) {
                int n4 = n3 - n2;
                if (n4 >= 0) {
                    if (n2 == 0 && n3 == arrby.length) {
                        return this;
                    }
                    byte[] arrby2 = new byte[n4];
                    System.arraycopy((Object)this.b, (int)n2, (Object)arrby2, (int)0, (int)n4);
                    return new d(arrby2);
                }
                throw new IllegalArgumentException("endIndex < beginIndex");
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("endIndex > length(");
            stringBuilder.append(this.b.length);
            stringBuilder.append(")");
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        throw new IllegalArgumentException("beginIndex < 0");
    }

    public String a() {
        byte[] arrby = this.b;
        char[] arrc = new char[2 * arrby.length];
        int n2 = arrby.length;
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            byte by = arrby[i2];
            int n4 = n3 + 1;
            char[] arrc2 = e;
            arrc[n3] = arrc2[15 & by >> 4];
            n3 = n4 + 1;
            arrc[n4] = arrc2[by & 15];
        }
        return new String(arrc);
    }

    public boolean a(int n2, byte[] arrby, int n3, int n4) {
        byte[] arrby2;
        return n2 >= 0 && n2 <= (arrby2 = this.b).length - n4 && n3 >= 0 && n3 <= arrby.length - n4 && j.a(arrby2, n2, arrby, n3, n4);
    }

    public int b() {
        return this.b.length;
    }

    public String c() {
        String string2;
        String string3 = this.d;
        if (string3 != null) {
            return string3;
        }
        this.d = string2 = new String(this.b, j.a);
        return string2;
    }

    public boolean equals(Object object) {
        d d2;
        int n2;
        byte[] arrby;
        if (object == this) {
            return true;
        }
        return object instanceof d && (n2 = (d2 = (d)object).b()) == (arrby = this.b).length && d2.a(0, arrby, 0, arrby.length);
    }

    public int hashCode() {
        int n2;
        int n3 = this.c;
        if (n3 != 0) {
            return n3;
        }
        this.c = n2 = Arrays.hashCode((byte[])this.b);
        return n2;
    }

    public String toString() {
        StringBuilder stringBuilder;
        if (this.b.length == 0) {
            return "[size=0]";
        }
        String string2 = this.c();
        int n2 = d.a(string2, 64);
        if (n2 == -1) {
            StringBuilder stringBuilder2;
            if (this.b.length <= 64) {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append("[hex=");
                stringBuilder2.append(this.a());
                stringBuilder2.append("]");
            } else {
                stringBuilder2 = new StringBuilder();
                stringBuilder2.append("[size=");
                stringBuilder2.append(this.b.length);
                stringBuilder2.append(" hex=");
                stringBuilder2.append(this.a(0, 64).a());
                stringBuilder2.append("\u2026]");
            }
            return stringBuilder2.toString();
        }
        String string3 = string2.substring(0, n2).replace((CharSequence)"\\", (CharSequence)"\\\\").replace((CharSequence)"\n", (CharSequence)"\\n").replace((CharSequence)"\r", (CharSequence)"\\r");
        if (n2 < string2.length()) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("[size=");
            stringBuilder.append(this.b.length);
            stringBuilder.append(" text=");
            stringBuilder.append(string3);
            stringBuilder.append("\u2026]");
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("[text=");
            stringBuilder.append(string3);
            stringBuilder.append("]");
        }
        return stringBuilder.toString();
    }
}

