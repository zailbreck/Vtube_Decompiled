/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Character
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.URI
 *  java.net.URISyntaxException
 *  java.nio.charset.Charset
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.List
 */
package j;

import j.f0.c;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class s {
    private static final char[] i = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    final String a;
    private final String b;
    private final String c;
    final String d;
    final int e;
    private final List<String> f;
    private final String g;
    private final String h;

    s(a a2) {
        this.a = a2.a;
        this.b = s.a(a2.b, false);
        this.c = s.a(a2.c, false);
        this.d = a2.d;
        this.e = a2.b();
        s.super.a(a2.f, false);
        List<String> list = a2.g;
        List<String> list2 = list != null ? s.super.a(list, true) : null;
        this.f = list2;
        String string2 = a2.h;
        String string3 = null;
        if (string2 != null) {
            string3 = s.a(string2, false);
        }
        this.g = string3;
        this.h = a2.toString();
    }

    static String a(String string2, int n2, int n3, String string3, boolean bl, boolean bl2, boolean bl3, boolean bl4, Charset charset) {
        int n4;
        for (int i2 = n2; i2 < n3; i2 += Character.charCount((int)n4)) {
            n4 = string2.codePointAt(i2);
            if (!(n4 < 32 || n4 == 127 || n4 >= 128 && bl4 || string3.indexOf(n4) != -1 || n4 == 37 && (!bl || bl2 && !s.a(string2, i2, n3)) || n4 == 43 && bl3)) {
                continue;
            }
            k.c c2 = new k.c();
            c2.a(string2, n2, i2);
            s.a(c2, string2, i2, n3, string3, bl, bl2, bl3, bl4, charset);
            return c2.o();
        }
        return string2.substring(n2, n3);
    }

    static String a(String string2, int n2, int n3, boolean bl) {
        for (int i2 = n2; i2 < n3; ++i2) {
            char c2 = string2.charAt(i2);
            if (!(c2 == '%' || c2 == '+' && bl)) {
                continue;
            }
            k.c c3 = new k.c();
            c3.a(string2, n2, i2);
            s.a(c3, string2, i2, n3, bl);
            return c3.o();
        }
        return string2.substring(n2, n3);
    }

    static String a(String string2, String string3, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        return s.a(string2, 0, string2.length(), string3, bl, bl2, bl3, bl4, null);
    }

    static String a(String string2, boolean bl) {
        return s.a(string2, 0, string2.length(), bl);
    }

    private List<String> a(List<String> list, boolean bl) {
        int n2 = list.size();
        ArrayList arrayList = new ArrayList(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            String string2 = (String)list.get(i2);
            String string3 = string2 != null ? s.a(string2, bl) : null;
            arrayList.add((Object)string3);
        }
        return Collections.unmodifiableList((List)arrayList);
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

    static void a(k.c c2, String string2, int n2, int n3, String string3, boolean bl, boolean bl2, boolean bl3, boolean bl4, Charset charset) {
        k.c c3 = null;
        while (n2 < n3) {
            int n4 = string2.codePointAt(n2);
            if (!bl || n4 != 9 && n4 != 10 && n4 != 12 && n4 != 13) {
                if (n4 == 43 && bl3) {
                    String string4 = bl ? "+" : "%2B";
                    c2.a(string4);
                } else if (!(n4 < 32 || n4 == 127 || n4 >= 128 && bl4 || string3.indexOf(n4) != -1 || n4 == 37 && (!bl || bl2 && !s.a(string2, n2, n3)))) {
                    c2.c(n4);
                } else {
                    if (c3 == null) {
                        c3 = new k.c();
                    }
                    if (charset != null && !charset.equals((Object)c.j)) {
                        c3.a(string2, n2, n2 + Character.charCount((int)n4), charset);
                    } else {
                        c3.c(n4);
                    }
                    while (!c3.i()) {
                        int n5 = 255 & c3.readByte();
                        c2.writeByte(37);
                        c2.writeByte(i[15 & n5 >> 4]);
                        c2.writeByte(i[n5 & 15]);
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
    static void a(k.c var0_2, String var1_1, int var2_4, int var3_3, boolean var4) {
        while (var2_4 < var3_3) {
            block4 : {
                block3 : {
                    var5_7 = var1_1.codePointAt(var2_4);
                    if (var5_7 != 37 || (var8_5 = var2_4 + 2) >= var3_3) break block3;
                    var9_6 = c.a(var1_1.charAt(var2_4 + 1));
                    var10_8 = c.a(var1_1.charAt(var8_5));
                    if (var9_6 == -1 || var10_8 == -1) ** GOTO lbl-1000
                    var0_2.writeByte(var10_8 + (var9_6 << 4));
                    var2_4 = var8_5;
                    break block4;
                }
                if (var5_7 == 43 && var4) {
                    var0_2.writeByte(32);
                } else lbl-1000: // 2 sources:
                {
                    var0_2.c(var5_7);
                }
            }
            var2_4 += Character.charCount((int)var5_7);
        }
    }

    static boolean a(String string2, int n2, int n3) {
        int n4 = n2 + 2;
        return n4 < n3 && string2.charAt(n2) == '%' && c.a(string2.charAt(n2 + 1)) != -1 && c.a(string2.charAt(n4)) != -1;
    }

    static void b(StringBuilder stringBuilder, List<String> list) {
        int n2 = list.size();
        for (int i2 = 0; i2 < n2; ++i2) {
            stringBuilder.append('/');
            stringBuilder.append((String)list.get(i2));
        }
    }

    public static int c(String string2) {
        if (string2.equals((Object)"http")) {
            return 80;
        }
        if (string2.equals((Object)"https")) {
            return 443;
        }
        return -1;
    }

    public static s d(String string2) {
        a a2 = new a();
        a2.a(null, string2);
        return a2.a();
    }

    static List<String> e(String string2) {
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

    public a a(String string2) {
        try {
            a a2 = new a();
            a2.a((s)this, string2);
            return a2;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return null;
        }
    }

    public String a() {
        if (this.g == null) {
            return null;
        }
        int n2 = 1 + this.h.indexOf(35);
        return this.h.substring(n2);
    }

    public s b(String string2) {
        a a2 = this.a(string2);
        if (a2 != null) {
            return a2.a();
        }
        return null;
    }

    public String b() {
        if (this.c.isEmpty()) {
            return "";
        }
        int n2 = 1 + this.h.indexOf(58, 3 + this.a.length());
        int n3 = this.h.indexOf(64);
        return this.h.substring(n2, n3);
    }

    public String c() {
        int n2 = this.h.indexOf(47, 3 + this.a.length());
        String string2 = this.h;
        int n3 = c.a(string2, n2, string2.length(), "?#");
        return this.h.substring(n2, n3);
    }

    public List<String> d() {
        int n2 = this.h.indexOf(47, 3 + this.a.length());
        String string2 = this.h;
        int n3 = c.a(string2, n2, string2.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (n2 < n3) {
            int n4 = n2 + 1;
            int n5 = c.a(this.h, n4, n3, '/');
            arrayList.add((Object)this.h.substring(n4, n5));
            n2 = n5;
        }
        return arrayList;
    }

    public String e() {
        if (this.f == null) {
            return null;
        }
        int n2 = 1 + this.h.indexOf(63);
        String string2 = this.h;
        int n3 = c.a(string2, n2, string2.length(), '#');
        return this.h.substring(n2, n3);
    }

    public boolean equals(Object object) {
        return object instanceof s && ((s)object).h.equals((Object)this.h);
    }

    public String f() {
        if (this.b.isEmpty()) {
            return "";
        }
        int n2 = 3 + this.a.length();
        String string2 = this.h;
        int n3 = c.a(string2, n2, string2.length(), ":@");
        return this.h.substring(n2, n3);
    }

    public String g() {
        return this.d;
    }

    public boolean h() {
        return this.a.equals((Object)"https");
    }

    public int hashCode() {
        return this.h.hashCode();
    }

    public a i() {
        a a2 = new a();
        a2.a = this.a;
        a2.b = this.f();
        a2.c = this.b();
        a2.d = this.d;
        int n2 = this.e != s.c(this.a) ? this.e : -1;
        a2.e = n2;
        a2.f.clear();
        a2.f.addAll(this.d());
        a2.a(this.e());
        a2.h = this.a();
        return a2;
    }

    public int j() {
        return this.e;
    }

    public String k() {
        if (this.f == null) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        s.a(stringBuilder, this.f);
        return stringBuilder.toString();
    }

    public String l() {
        a a2 = this.a("/...");
        a2.e("");
        a2.c("");
        return a2.a().toString();
    }

    public String m() {
        return this.a;
    }

    public URI n() {
        a a2 = this.i();
        a2.c();
        String string2 = a2.toString();
        try {
            URI uRI = new URI(string2);
            return uRI;
        }
        catch (URISyntaxException uRISyntaxException) {
            try {
                URI uRI = URI.create((String)string2.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
                return uRI;
            }
            catch (Exception exception) {
                throw new RuntimeException((Throwable)uRISyntaxException);
            }
        }
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
            return c.a(s.a(string2, n2, n3, false));
        }

        private void a(String string2, int n2, int n3, boolean bl, boolean bl2) {
            String string3 = s.a(string2, n2, n3, " \"<>^`{}|/\\?#", bl2, false, false, true, null);
            if (this.f(string3)) {
                return;
            }
            if (this.g(string3)) {
                this.d();
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

        private void d() {
            List<String> list = this.f;
            if (((String)list.remove(-1 + list.size())).isEmpty() && !this.f.isEmpty()) {
                List<String> list2 = this.f;
                list2.set(-1 + list2.size(), (Object)"");
                return;
            }
            this.f.add((Object)"");
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
                n2 = c.a(string2, n4, n3, "/\\");
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

        private boolean f(String string2) {
            return string2.equals((Object)".") || string2.equalsIgnoreCase("%2e");
            {
            }
        }

        private boolean g(String string2) {
            return string2.equals((Object)"..") || string2.equalsIgnoreCase("%2e.") || string2.equalsIgnoreCase(".%2e") || string2.equalsIgnoreCase("%2e%2e");
            {
            }
        }

        public a a(int n2) {
            if (n2 > 0 && n2 <= 65535) {
                this.e = n2;
                return this;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("unexpected port: ");
            stringBuilder.append(n2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        a a(s s2, String string2) {
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
                                            n5 = c.b(string2, 0, string2.length());
                                            n11 = a.e(string2, n5, n4 = c.c(string2, n5, string2.length()));
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
                                if (s2 == null) break block20;
                                this.a = s2.a;
                            }
                            n7 = a.f(string2, n5, n4);
                            n10 = 63;
                            n9 = 35;
                            if (n7 >= 2 || s2 == null || !s2.a.equals((Object)this.a)) break block21;
                            this.b = s2.f();
                            this.c = s2.b();
                            this.d = s2.d;
                            this.e = s2.e;
                            this.f.clear();
                            this.f.addAll(s2.d());
                            if (n5 == n4 || string2.charAt(n5) == n9) {
                                this.a(s2.e());
                            }
                            break block22;
                        }
                        n2 = n5 + n7;
                        boolean bl = false;
                        boolean bl2 = false;
                        while ((n8 = (n6 = c.a(string2, n2, n4, "@/\\?#")) != n4 ? (int)string2.charAt(n6) : -1) != -1 && n8 != n9 && n8 != 47 && n8 != 92 && n8 != n10) {
                            if (n8 == 64) {
                                int n12;
                                if (!bl) {
                                    int n13 = c.a(string2, n2, n6, ':');
                                    n12 = n6;
                                    String string3 = s.a(string2, n2, n13, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                    if (bl2) {
                                        StringBuilder stringBuilder = new StringBuilder();
                                        stringBuilder.append(this.b);
                                        stringBuilder.append("%40");
                                        stringBuilder.append(string3);
                                        string3 = stringBuilder.toString();
                                    }
                                    this.b = string3;
                                    if (n13 != n12) {
                                        this.c = s.a(string2, n13 + 1, n12, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                        bl = true;
                                    }
                                    bl2 = true;
                                } else {
                                    n12 = n6;
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append(this.c);
                                    stringBuilder.append("%40");
                                    stringBuilder.append(s.a(string2, n2, n12, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null));
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
                            this.e = s.c(this.a);
                        }
                        if (this.d == null) break block23;
                        n5 = n6;
                    }
                    int n15 = c.a(string2, n5, n4, "?#");
                    a.super.d(string2, n5, n15);
                    if (n15 < n4 && string2.charAt(n15) == '?') {
                        int n16 = c.a(string2, n15, n4, '#');
                        this.g = s.e(s.a(string2, n15 + 1, n16, " \"'<>#", true, false, true, true, null));
                        n15 = n16;
                    }
                    if (n15 < n4 && string2.charAt(n15) == '#') {
                        this.h = s.a(string2, 1 + n15, n4, "", true, false, false, false, null);
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
            List<String> list = string2 != null ? s.e(s.a(string2, " \"'<>#", true, false, true, true)) : null;
            this.g = list;
            return this;
        }

        public s a() {
            if (this.a != null) {
                if (this.d != null) {
                    return new s(this);
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
            return s.c(this.a);
        }

        public a b(String string2) {
            if (string2 != null) {
                String string3 = a.a(string2, 0, string2.length());
                if (string3 != null) {
                    this.d = string3;
                    return this;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("unexpected host: ");
                stringBuilder.append(string2);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            throw new NullPointerException("host == null");
        }

        a c() {
            String string2;
            int n2 = this.f.size();
            int n3 = 0;
            for (int i2 = 0; i2 < n2; ++i2) {
                String string3 = (String)this.f.get(i2);
                this.f.set(i2, (Object)s.a(string3, "[]", true, true, false, true));
            }
            List<String> list = this.g;
            if (list != null) {
                int n4 = list.size();
                while (n3 < n4) {
                    String string4 = (String)this.g.get(n3);
                    if (string4 != null) {
                        this.g.set(n3, (Object)s.a(string4, "\\^`{|}", true, true, true, true));
                    }
                    ++n3;
                }
            }
            if ((string2 = this.h) != null) {
                this.h = s.a(string2, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        public a c(String string2) {
            if (string2 != null) {
                this.c = s.a(string2, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("password == null");
        }

        /*
         * Enabled aggressive block sorting
         */
        public a d(String string2) {
            if (string2 == null) {
                NullPointerException nullPointerException = new NullPointerException("scheme == null");
                throw nullPointerException;
            }
            String string3 = "http";
            if (!string2.equalsIgnoreCase(string3) && !string2.equalsIgnoreCase(string3 = "https")) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("unexpected scheme: ");
                stringBuilder.append(string2);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            this.a = string3;
            return this;
        }

        public a e(String string2) {
            if (string2 != null) {
                this.b = s.a(string2, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
                return this;
            }
            throw new NullPointerException("username == null");
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.a);
            stringBuilder.append("://");
            if (!this.b.isEmpty() || !this.c.isEmpty()) {
                stringBuilder.append(this.b);
                if (!this.c.isEmpty()) {
                    stringBuilder.append(':');
                    stringBuilder.append(this.c);
                }
                stringBuilder.append('@');
            }
            if (this.d.indexOf(58) != -1) {
                stringBuilder.append('[');
                stringBuilder.append(this.d);
                stringBuilder.append(']');
            } else {
                stringBuilder.append(this.d);
            }
            int n2 = this.b();
            if (n2 != s.c(this.a)) {
                stringBuilder.append(':');
                stringBuilder.append(n2);
            }
            s.b(stringBuilder, this.f);
            if (this.g != null) {
                stringBuilder.append('?');
                s.a(stringBuilder, this.g);
            }
            if (this.h != null) {
                stringBuilder.append('#');
                stringBuilder.append(this.h);
            }
            return stringBuilder.toString();
        }
    }

}

