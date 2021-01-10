/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.f.a.q.b.a
 *  java.lang.Character
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.charset.Charset
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.List
 */
package f.f.a.q.a;

import f.f.a.q.a.r.b;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class g {
    private static final char[] i = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    final String a;
    private final String b;
    private final String c;
    final String d;
    final int e;
    private final List<String> f;
    private final String g;
    private final String h;

    g(a a2) {
        this.a = a2.a;
        this.b = g.a(a2.b, false);
        this.c = g.a(a2.c, false);
        this.d = a2.d;
        this.e = a2.b();
        g.super.a(a2.f, false);
        List<String> list = a2.g;
        List<String> list2 = list != null ? g.super.a(list, true) : null;
        this.f = list2;
        String string2 = a2.h;
        String string3 = null;
        if (string2 != null) {
            string3 = g.a(string2, false);
        }
        this.g = string3;
        this.h = a2.toString();
    }

    public static int a(String string2) {
        if (string2.equals((Object)"http")) {
            return 80;
        }
        if (string2.equals((Object)"https")) {
            return 443;
        }
        return -1;
    }

    static String a(String string2, int n2, int n3, String string3, boolean bl, boolean bl2, boolean bl3, boolean bl4, Charset charset) {
        int n4;
        for (int i2 = n2; i2 < n3; i2 += Character.charCount((int)n4)) {
            n4 = string2.codePointAt(i2);
            if (!(n4 < 32 || n4 == 127 || n4 >= 128 && bl4 || string3.indexOf(n4) != -1 || n4 == 37 && (!bl || bl2 && !g.a(string2, i2, n3)) || n4 == 43 && bl3)) {
                continue;
            }
            f.f.a.q.b.a a2 = new f.f.a.q.b.a();
            a2.a(string2, n2, i2);
            g.a(a2, string2, i2, n3, string3, bl, bl2, bl3, bl4, charset);
            return a2.c();
        }
        return string2.substring(n2, n3);
    }

    static String a(String string2, int n2, int n3, boolean bl) {
        for (int i2 = n2; i2 < n3; ++i2) {
            char c2 = string2.charAt(i2);
            if (!(c2 == '%' || c2 == '+' && bl)) {
                continue;
            }
            f.f.a.q.b.a a2 = new f.f.a.q.b.a();
            a2.a(string2, n2, i2);
            g.a(a2, string2, i2, n3, bl);
            return a2.c();
        }
        return string2.substring(n2, n3);
    }

    static String a(String string2, String string3, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        return g.a(string2, 0, string2.length(), string3, bl, bl2, bl3, bl4, null);
    }

    static String a(String string2, boolean bl) {
        return g.a(string2, 0, string2.length(), bl);
    }

    private List<String> a(List<String> list, boolean bl) {
        int n2 = list.size();
        ArrayList arrayList = new ArrayList(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            String string2 = (String)list.get(i2);
            String string3 = string2 != null ? g.a(string2, bl) : null;
            arrayList.add((Object)string3);
        }
        return Collections.unmodifiableList((List)arrayList);
    }

    static void a(f.f.a.q.b.a a2, String string2, int n2, int n3, String string3, boolean bl, boolean bl2, boolean bl3, boolean bl4, Charset charset) {
        f.f.a.q.b.a a3 = null;
        while (n2 < n3) {
            int n4 = string2.codePointAt(n2);
            if (!bl || n4 != 9 && n4 != 10 && n4 != 12 && n4 != 13) {
                if (n4 == 43 && bl3) {
                    String string4 = bl ? "+" : "%2B";
                    a2.a(string4);
                } else if (!(n4 < 32 || n4 == 127 || n4 >= 128 && bl4 || string3.indexOf(n4) != -1 || n4 == 37 && (!bl || bl2 && !g.a(string2, n2, n3)))) {
                    a2.d(n4);
                } else {
                    if (a3 == null) {
                        a3 = new f.f.a.q.b.a();
                    }
                    if (charset != null && !charset.equals((Object)b.j)) {
                        a3.a(string2, n2, n2 + Character.charCount((int)n4), charset);
                    } else {
                        a3.d(n4);
                    }
                    while (!a3.a()) {
                        int n5 = 255 & a3.b();
                        a2.c(37);
                        a2.c((int)i[15 & n5 >> 4]);
                        a2.c((int)i[n5 & 15]);
                    }
                }
            }
            n2 += Character.charCount((int)n4);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    static void a(f.f.a.q.b.a var0_2, String var1_1, int var2_4, int var3_3, boolean var4) {
        while (var2_4 < var3_3) {
            block4 : {
                block3 : {
                    var5_7 = var1_1.codePointAt(var2_4);
                    if (var5_7 != 37 || (var8_5 = var2_4 + 2) >= var3_3) break block3;
                    var9_6 = b.a(var1_1.charAt(var2_4 + 1));
                    var10_8 = b.a(var1_1.charAt(var8_5));
                    if (var9_6 == -1 || var10_8 == -1) ** GOTO lbl-1000
                    var0_2.c(var10_8 + (var9_6 << 4));
                    var2_4 = var8_5;
                    break block4;
                }
                if (var5_7 == 43 && var4) {
                    var0_2.c(32);
                } else lbl-1000: // 2 sources:
                {
                    var0_2.d(var5_7);
                }
            }
            var2_4 += Character.charCount((int)var5_7);
        }
    }

    static void a(StringBuilder stringBuilder, List<String> list) {
        int n2 = list.size();
        for (int i2 = 0; i2 < n2; i2 += 2) {
            String string2 = (String)list.get(i2);
            String string3 = (String)list.get(i2 + 1);
            if (i2 > 0) {
                stringBuilder.append('&');
            }
            stringBuilder.append(string2);
            if (string3 == null) continue;
            stringBuilder.append('=');
            stringBuilder.append(string3);
        }
    }

    static boolean a(String string2, int n2, int n3) {
        int n4 = n2 + 2;
        return n4 < n3 && string2.charAt(n2) == '%' && b.a(string2.charAt(n2 + 1)) != -1 && b.a(string2.charAt(n4)) != -1;
    }

    public static g b(String string2) {
        a a2 = new a();
        a2.a(null, string2);
        return a2.a();
    }

    static void b(StringBuilder stringBuilder, List<String> list) {
        int n2 = list.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuilder.append('/');
            stringBuilder.append((String)list.get(i2));
        }
    }

    static List<String> c(String string2) {
        ArrayList arrayList = new ArrayList();
        int n2 = 0;
        while (n2 <= string2.length()) {
            String string3;
            int n3;
            int n4 = string2.indexOf(38, n2);
            if (n4 == -1) {
                n4 = string2.length();
            }
            if ((n3 = string2.indexOf(61, n2)) != -1 && n3 <= n4) {
                arrayList.add((Object)string2.substring(n2, n3));
                string3 = string2.substring(n3 + 1, n4);
            } else {
                arrayList.add((Object)string2.substring(n2, n4));
                string3 = null;
            }
            arrayList.add(string3);
            n2 = n4 + 1;
        }
        return arrayList;
    }

    public String a() {
        if (this.c.isEmpty()) {
            return "";
        }
        int n2 = 1 + this.h.indexOf(58, 3 + this.a.length());
        int n3 = this.h.indexOf(64);
        return this.h.substring(n2, n3);
    }

    public List<String> b() {
        int n2 = this.h.indexOf(47, 3 + this.a.length());
        String string2 = this.h;
        int n3 = b.a(string2, n2, string2.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (n2 < n3) {
            int n4 = n2 + 1;
            int n5 = b.a(this.h, n4, n3, '/');
            arrayList.add((Object)this.h.substring(n4, n5));
            n2 = n5;
        }
        return arrayList;
    }

    public String c() {
        if (this.f == null) {
            return null;
        }
        int n2 = 1 + this.h.indexOf(63);
        String string2 = this.h;
        int n3 = b.a(string2, n2, string2.length(), '#');
        return this.h.substring(n2, n3);
    }

    public String d() {
        if (this.b.isEmpty()) {
            return "";
        }
        int n2 = 3 + this.a.length();
        String string2 = this.h;
        int n3 = b.a(string2, n2, string2.length(), ":@");
        return this.h.substring(n2, n3);
    }

    public boolean equals(Object object) {
        return object instanceof g && ((g)object).h.equals((Object)this.h);
    }

    public int hashCode() {
        return this.h.hashCode();
    }

    public String toString() {
        return this.h;
    }

    public static final class a {
        String a;
        String b = "";
        String c = "";
        String d;
        int e = -1;
        final List<String> f = new ArrayList();
        List<String> g;
        String h;

        public a() {
            this.f.add((Object)"");
        }

        private static String a(String string2, int n2, int n3) {
            return b.a(g.a(string2, n2, n3, false));
        }

        private void a(String string2, int n2, int n3, boolean bl, boolean bl2) {
            String string3 = g.a(string2, n2, n3, " \"<>^`{}|/\\?#", bl2, false, false, true, null);
            if (this.b(string3)) {
                return;
            }
            if (this.c(string3)) {
                this.c();
                return;
            }
            List<String> list = this.f;
            if (((String)list.get(-1 + list.size())).isEmpty()) {
                List<String> list2 = this.f;
                list2.set(-1 + list2.size(), (Object)string3);
            } else {
                this.f.add((Object)string3);
            }
            if (bl) {
                this.f.add((Object)"");
            }
        }

        /*
         * Exception decompiling
         */
        private static int b(String var0, int var1, int var2) {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl20.1 : ICONST_M1 : trying to set 1 previously set to 0
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
            // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
            // org.benf.cfr.reader.entities.g.p(Method.java:396)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
            // org.benf.cfr.reader.entities.d.c(ClassFile.java:773)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:870)
            // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
            // org.benf.cfr.reader.b.a(Driver.java:128)
            // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
            // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
            // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
            // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
            // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
            // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1133)
            // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:607)
            // java.lang.Thread.run(Thread.java:761)
            throw new IllegalStateException("Decompilation failed");
        }

        private boolean b(String string2) {
            return string2.equals((Object)".") || string2.equalsIgnoreCase("%2e");
            {
            }
        }

        private static int c(String string2, int n2, int n3) {
            while (n2 < n3) {
                char c2 = string2.charAt(n2);
                if (c2 != ':') {
                    if (c2 == '[') {
                        while (++n2 < n3 && string2.charAt(n2) != ']') {
                        }
                    }
                    ++n2;
                    continue;
                }
                return n2;
            }
            return n3;
        }

        private void c() {
            List<String> list = this.f;
            if (((String)list.remove(-1 + list.size())).isEmpty() && !this.f.isEmpty()) {
                List<String> list2 = this.f;
                list2.set(-1 + list2.size(), (Object)"");
                return;
            }
            this.f.add((Object)"");
        }

        private boolean c(String string2) {
            return string2.equals((Object)"..") || string2.equalsIgnoreCase("%2e.") || string2.equalsIgnoreCase(".%2e") || string2.equalsIgnoreCase("%2e%2e");
            {
            }
        }

        private void d(String string2, int n2, int n3) {
            int n4;
            if (n2 == n3) {
                return;
            }
            char c2 = string2.charAt(n2);
            if (c2 != '/' && c2 != '\\') {
                List<String> list = this.f;
                list.set(list.size() - 1, (Object)"");
            } else {
                this.f.clear();
                this.f.add((Object)"");
            }
            while ((n4 = ++n2) < n3) {
                n2 = b.a(string2, n4, n3, "/\\");
                boolean bl = n2 < n3;
                a.super.a(string2, n4, n2, bl, true);
                if (!bl) continue;
            }
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        private static int e(String string2, int n2, int n3) {
            if (n3 - n2 < 2) {
                return -1;
            }
            char c2 = string2.charAt(n2);
            if (c2 < 'a' || c2 > 'z') {
                if (c2 < 'A') return -1;
                if (c2 > 'Z') {
                    return -1;
                }
            }
            while (++n2 < n3) {
                char c3 = string2.charAt(n2);
                if (c3 >= 'a' && c3 <= 'z' || c3 >= 'A' && c3 <= 'Z' || c3 >= '0' && c3 <= '9' || c3 == '+' || c3 == '-' || c3 == '.') continue;
                if (c3 != ':') return -1;
                return n2;
            }
            return -1;
        }

        private static int f(String string2, int n2, int n3) {
            char c2;
            int n4 = 0;
            while (n2 < n3 && ((c2 = string2.charAt(n2)) == '\\' || c2 == '/')) {
                ++n4;
                ++n2;
            }
            return n4;
        }

        a a(g g2, String string2) {
            IllegalArgumentException illegalArgumentException;
            block20 : {
                int n2;
                int n3;
                block23 : {
                    int n4;
                    int n5;
                    block22 : {
                        int n6;
                        int n7;
                        int n8;
                        int n9;
                        int n10;
                        block21 : {
                            block18 : {
                                block16 : {
                                    int n11;
                                    block19 : {
                                        block17 : {
                                            n5 = b.b(string2, 0, string2.length());
                                            n11 = a.e(string2, n5, n4 = b.c(string2, n5, string2.length()));
                                            if (n11 == -1) break block16;
                                            if (!string2.regionMatches(true, n5, "https:", 0, 6)) break block17;
                                            this.a = "https";
                                            n5 += 6;
                                            break block18;
                                        }
                                        if (!string2.regionMatches(true, n5, "http:", 0, 5)) break block19;
                                        this.a = "http";
                                        n5 += 5;
                                        break block18;
                                    }
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append("Expected URL scheme 'http' or 'https' but was '");
                                    stringBuilder.append(string2.substring(0, n11));
                                    stringBuilder.append("'");
                                    throw new IllegalArgumentException(stringBuilder.toString());
                                }
                                if (g2 == null) break block20;
                                this.a = g2.a;
                            }
                            n7 = a.f(string2, n5, n4);
                            n10 = 63;
                            n9 = 35;
                            if (n7 >= 2 || g2 == null || !g2.a.equals((Object)this.a)) break block21;
                            this.b = g2.d();
                            this.c = g2.a();
                            this.d = g2.d;
                            this.e = g2.e;
                            this.f.clear();
                            this.f.addAll(g2.b());
                            if (n5 == n4 || string2.charAt(n5) == n9) {
                                this.a(g2.c());
                            }
                            break block22;
                        }
                        n2 = n5 + n7;
                        boolean bl = false;
                        boolean bl2 = false;
                        while ((n8 = (n6 = b.a(string2, n2, n4, "@/\\?#")) != n4 ? (int)string2.charAt(n6) : -1) != -1 && n8 != n9 && n8 != 47 && n8 != 92 && n8 != n10) {
                            if (n8 == 64) {
                                int n12;
                                if (!bl) {
                                    int n13 = b.a(string2, n2, n6, ':');
                                    n12 = n6;
                                    String string3 = g.a(string2, n2, n13, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                    if (bl2) {
                                        StringBuilder stringBuilder = new StringBuilder();
                                        stringBuilder.append(this.b);
                                        stringBuilder.append("%40");
                                        stringBuilder.append(string3);
                                        string3 = stringBuilder.toString();
                                    }
                                    this.b = string3;
                                    if (n13 != n12) {
                                        this.c = g.a(string2, n13 + 1, n12, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                        bl = true;
                                    }
                                    bl2 = true;
                                } else {
                                    n12 = n6;
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append(this.c);
                                    stringBuilder.append("%40");
                                    stringBuilder.append(g.a(string2, n2, n12, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
                                    this.c = stringBuilder.toString();
                                }
                                n2 = n12 + 1;
                            }
                            n10 = 63;
                            n9 = 35;
                        }
                        n3 = a.c(string2, n2, n6);
                        int n14 = n3 + 1;
                        if (n14 < n6) {
                            this.d = a.a(string2, n2, n3);
                            this.e = a.b(string2, n14, n6);
                            if (this.e == -1) {
                                StringBuilder stringBuilder = new StringBuilder();
                                stringBuilder.append("Invalid URL port: \"");
                                stringBuilder.append(string2.substring(n14, n6));
                                stringBuilder.append('\"');
                                throw new IllegalArgumentException(stringBuilder.toString());
                            }
                        } else {
                            this.d = a.a(string2, n2, n3);
                            this.e = g.a(this.a);
                        }
                        if (this.d == null) break block23;
                        n5 = n6;
                    }
                    int n15 = b.a(string2, n5, n4, "?#");
                    a.super.d(string2, n5, n15);
                    if (n15 < n4 && string2.charAt(n15) == '?') {
                        int n16 = b.a(string2, n15, n4, '#');
                        this.g = g.c(g.a(string2, n15 + 1, n16, " \"'<>#", true, false, true, true, null));
                        n15 = n16;
                    }
                    if (n15 < n4 && string2.charAt(n15) == '#') {
                        this.h = g.a(string2, 1 + n15, n4, "", true, false, false, false, null);
                    }
                    return this;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid URL host: \"");
                stringBuilder.append(string2.substring(n2, n3));
                stringBuilder.append('\"');
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            illegalArgumentException = new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            throw illegalArgumentException;
        }

        public a a(String string2) {
            List<String> list = string2 != null ? g.c(g.a(string2, " \"'<>#", true, false, true, true)) : null;
            this.g = list;
            return this;
        }

        public g a() {
            if (this.a != null) {
                if (this.d != null) {
                    return new g(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        int b() {
            int n2 = this.e;
            if (n2 != -1) {
                return n2;
            }
            return g.a(this.a);
        }

        public String toString() {
            String string2;
            String string3;
            StringBuilder stringBuilder = new StringBuilder();
            String string4 = this.a;
            if (string4 != null) {
                stringBuilder.append(string4);
                string2 = "://";
            } else {
                string2 = "//";
            }
            stringBuilder.append(string2);
            if (!this.b.isEmpty() || !this.c.isEmpty()) {
                stringBuilder.append(this.b);
                if (!this.c.isEmpty()) {
                    stringBuilder.append(':');
                    stringBuilder.append(this.c);
                }
                stringBuilder.append('@');
            }
            if ((string3 = this.d) != null) {
                if (string3.indexOf(58) != -1) {
                    stringBuilder.append('[');
                    stringBuilder.append(this.d);
                    stringBuilder.append(']');
                } else {
                    stringBuilder.append(this.d);
                }
            }
            if (this.e != -1 || this.a != null) {
                int n2 = this.b();
                String string5 = this.a;
                if (string5 == null || n2 != g.a(string5)) {
                    stringBuilder.append(':');
                    stringBuilder.append(n2);
                }
            }
            g.b(stringBuilder, this.f);
            if (this.g != null) {
                stringBuilder.append('?');
                g.a(stringBuilder, this.g);
            }
            if (this.h != null) {
                stringBuilder.append('#');
                stringBuilder.append(this.h);
            }
            return stringBuilder.toString();
        }
    }

}

