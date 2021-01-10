/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.List
 */
package f.f.a.q.a;

import f.f.a.q.a.r.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class f {
    private final String[] a;

    f(a a2) {
        List<String> list = a2.a;
        this.a = (String[])list.toArray((Object[])new String[list.size()]);
    }

    static void a(String string2) {
        NullPointerException nullPointerException;
        if (string2 != null) {
            if (!string2.isEmpty()) {
                int n2 = string2.length();
                for (int i2 = 0; i2 < n2; ++i2) {
                    char c2 = string2.charAt(i2);
                    if (c2 > ' ' && c2 < '') {
                        continue;
                    }
                    Object[] arrobject = new Object[]{(int)c2, i2, string2};
                    throw new IllegalArgumentException(b.a("Unexpected char %#04x at %d in header name: %s", arrobject));
                }
                return;
            }
            throw new IllegalArgumentException("name is empty");
        }
        nullPointerException = new NullPointerException("name == null");
        throw nullPointerException;
    }

    static void a(String string2, String string3) {
        NullPointerException nullPointerException;
        if (string2 != null) {
            int n2 = string2.length();
            for (int i2 = 0; i2 < n2; ++i2) {
                char c2 = string2.charAt(i2);
                if ((c2 > '\u001f' || c2 == '\t') && c2 < '') {
                    continue;
                }
                Object[] arrobject = new Object[]{(int)c2, i2, string3, string2};
                throw new IllegalArgumentException(b.a("Unexpected char %#04x at %d in %s value: %s", arrobject));
            }
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("value for name ");
        stringBuilder.append(string3);
        stringBuilder.append(" == null");
        nullPointerException = new NullPointerException(stringBuilder.toString());
        throw nullPointerException;
    }

    public int a() {
        return this.a.length / 2;
    }

    public String a(int n2) {
        return this.a[n2 * 2];
    }

    public String b(int n2) {
        return this.a[1 + n2 * 2];
    }

    public boolean equals(Object object) {
        return object instanceof f && Arrays.equals((Object[])((f)object).a, (Object[])this.a);
    }

    public int hashCode() {
        return Arrays.hashCode((Object[])this.a);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = this.a();
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuilder.append(this.a(i2));
            stringBuilder.append(": ");
            stringBuilder.append(this.b(i2));
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public static final class a {
        final List<String> a = new ArrayList(20);

        public a a(String string2) {
            for (int i2 = 0; i2 < this.a.size(); i2 += 2) {
                if (!string2.equalsIgnoreCase((String)this.a.get(i2))) continue;
                this.a.remove(i2);
                this.a.remove(i2);
                i2 -= 2;
            }
            return this;
        }

        public a a(String string2, String string3) {
            f.a(string2);
            f.a(string3, string2);
            this.b(string2, string3);
            return this;
        }

        public f a() {
            return new f(this);
        }

        a b(String string2, String string3) {
            this.a.add((Object)string2);
            this.a.add((Object)string3.trim());
            return this;
        }

        public a c(String string2, String string3) {
            f.a(string2);
            f.a(string3, string2);
            this.a(string2);
            this.b(string2, string3);
            return this;
        }
    }

}

