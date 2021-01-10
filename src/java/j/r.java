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
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  java.util.TreeMap
 */
package j;

import j.f0.c;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;

public final class r {
    private final String[] a;

    r(a a2) {
        List<String> list = a2.a;
        this.a = (String[])list.toArray((Object[])new String[list.size()]);
    }

    private static String a(String[] arrstring, String string2) {
        for (int i2 = -2 + arrstring.length; i2 >= 0; i2 -= 2) {
            if (!string2.equalsIgnoreCase(arrstring[i2])) continue;
            return arrstring[i2 + 1];
        }
        return null;
    }

    public a a() {
        a a2 = new a();
        Collections.addAll(a2.a, (Object[])this.a);
        return a2;
    }

    public String a(int n2) {
        return this.a[n2 * 2];
    }

    public String a(String string2) {
        return r.a(this.a, string2);
    }

    public int b() {
        return this.a.length / 2;
    }

    public String b(int n2) {
        return this.a[1 + n2 * 2];
    }

    public List<String> b(String string2) {
        int n2 = this.b();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (!string2.equalsIgnoreCase(this.a(i2))) continue;
            if (arrayList == null) {
                arrayList = new ArrayList(2);
            }
            arrayList.add((Object)this.b(i2));
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    public Map<String, List<String>> c() {
        TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
        int n2 = this.b();
        for (int i2 = 0; i2 < n2; ++i2) {
            String string2 = this.a(i2).toLowerCase(Locale.US);
            List list = (List)treeMap.get((Object)string2);
            if (list == null) {
                list = new ArrayList(2);
                treeMap.put((Object)string2, (Object)list);
            }
            list.add((Object)this.b(i2));
        }
        return treeMap;
    }

    public boolean equals(Object object) {
        return object instanceof r && Arrays.equals((Object[])((r)object).a, (Object[])this.a);
    }

    public int hashCode() {
        return Arrays.hashCode((Object[])this.a);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = this.b();
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

        private void d(String string2, String string3) {
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
                        throw new IllegalArgumentException(c.a("Unexpected char %#04x at %d in header name: %s", arrobject));
                    }
                    if (string3 != null) {
                        int n3 = string3.length();
                        for (int i3 = 0; i3 < n3; ++i3) {
                            char c3 = string3.charAt(i3);
                            if ((c3 > '\u001f' || c3 == '\t') && c3 < '') {
                                continue;
                            }
                            Object[] arrobject = new Object[]{(int)c3, i3, string2, string3};
                            throw new IllegalArgumentException(c.a("Unexpected char %#04x at %d in %s value: %s", arrobject));
                        }
                        return;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("value for name ");
                    stringBuilder.append(string2);
                    stringBuilder.append(" == null");
                    throw new NullPointerException(stringBuilder.toString());
                }
                throw new IllegalArgumentException("name is empty");
            }
            nullPointerException = new NullPointerException("name == null");
            throw nullPointerException;
        }

        a a(String string2) {
            int n2 = string2.indexOf(":", 1);
            if (n2 != -1) {
                this.b(string2.substring(0, n2), string2.substring(n2 + 1));
                return this;
            }
            if (string2.startsWith(":")) {
                this.b("", string2.substring(1));
                return this;
            }
            this.b("", string2);
            return this;
        }

        public a a(String string2, String string3) {
            a.super.d(string2, string3);
            this.b(string2, string3);
            return this;
        }

        public r a() {
            return new r(this);
        }

        public a b(String string2) {
            for (int i2 = 0; i2 < this.a.size(); i2 += 2) {
                if (!string2.equalsIgnoreCase((String)this.a.get(i2))) continue;
                this.a.remove(i2);
                this.a.remove(i2);
                i2 -= 2;
            }
            return this;
        }

        a b(String string2, String string3) {
            this.a.add((Object)string2);
            this.a.add((Object)string3.trim());
            return this;
        }

        public a c(String string2, String string3) {
            a.super.d(string2, string3);
            this.b(string2);
            this.b(string2, string3);
            return this;
        }
    }

}

