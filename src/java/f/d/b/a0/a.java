/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.Closeable
 *  java.io.EOFException
 *  java.io.IOException
 *  java.io.Reader
 *  java.lang.AssertionError
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.IllegalStateException
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.NullPointerException
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.Arrays
 */
package f.d.b.a0;

import f.d.b.a0.a;
import f.d.b.a0.b;
import f.d.b.a0.d;
import f.d.b.y.f;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;

public class a
implements Closeable {
    private static final char[] q = ")]}'\n".toCharArray();
    private final Reader b;
    private boolean c = false;
    private final char[] d = new char[1024];
    private int e = 0;
    private int f = 0;
    private int g = 0;
    private int h = 0;
    int i = 0;
    private long j;
    private int k;
    private String l;
    private int[] m = new int[32];
    private int n = 0;
    private String[] o;
    private int[] p;

    static {
        f.a = new f(){

            /*
             * Enabled aggressive block sorting
             */
            public void a(a a2) {
                int n2;
                if (a2 instanceof f.d.b.y.n.e) {
                    ((f.d.b.y.n.e)a2).C();
                    return;
                }
                int n3 = a2.i;
                if (n3 == 0) {
                    n3 = a2.m();
                }
                if (n3 == 13) {
                    n2 = 9;
                } else if (n3 == 12) {
                    n2 = 8;
                } else {
                    if (n3 != 14) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Expected a name but was ");
                        stringBuilder.append((Object)((Object)a2.A()));
                        stringBuilder.append(a2.s());
                        IllegalStateException illegalStateException = new IllegalStateException(stringBuilder.toString());
                        throw illegalStateException;
                    }
                    n2 = 10;
                }
                a2.i = n2;
            }
        };
    }

    public a(Reader reader) {
        int[] arrn = this.m;
        int n2 = this.n;
        this.n = n2 + 1;
        arrn[n2] = 6;
        this.o = new String[32];
        this.p = new int[32];
        if (reader != null) {
            this.b = reader;
            return;
        }
        throw new NullPointerException("in == null");
    }

    private void C() {
        if (this.c) {
            return;
        }
        this.c("Use JsonReader.setLenient(true) to accept malformed JSON");
        throw null;
    }

    private void D() {
        char[] arrc;
        this.b(true);
        --this.e;
        int n2 = this.e;
        char[] arrc2 = q;
        if (n2 + arrc2.length > this.f && !this.a(arrc2.length)) {
            return;
        }
        for (int i2 = 0; i2 < (arrc = q).length; ++i2) {
            if (this.d[i2 + this.e] == arrc[i2]) continue;
            return;
        }
        this.e += arrc.length;
    }

    /*
     * Exception decompiling
     */
    private String E() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Extractable last case doesn't follow previous
        // org.benf.cfr.reader.b.a.a.b.as.a(SwitchReplacer.java:478)
        // org.benf.cfr.reader.b.a.a.b.as.a(SwitchReplacer.java:61)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:372)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
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

    private int F() {
        String string;
        int n2;
        String string2;
        char c2 = this.d[this.e];
        if (c2 != 't' && c2 != 'T') {
            if (c2 != 'f' && c2 != 'F') {
                if (c2 != 'n' && c2 != 'N') {
                    return 0;
                }
                n2 = 7;
                string2 = "null";
                string = "NULL";
            } else {
                n2 = 6;
                string2 = "false";
                string = "FALSE";
            }
        } else {
            n2 = 5;
            string2 = "true";
            string = "TRUE";
        }
        int n3 = string2.length();
        for (int i2 = 1; i2 < n3; ++i2) {
            if (i2 + this.e >= this.f && !this.a(i2 + 1)) {
                return 0;
            }
            char c3 = this.d[i2 + this.e];
            if (c3 == string2.charAt(i2) || c3 == string.charAt(i2)) continue;
            return 0;
        }
        if ((n3 + this.e < this.f || this.a(n3 + 1)) && this.a(this.d[n3 + this.e])) {
            return 0;
        }
        this.e = n3 + this.e;
        this.i = n2;
        return n2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private int G() {
        var1_1 = this.d;
        var2_2 = this.e;
        var3_3 = this.f;
        var4_4 = 0;
        var5_5 = 0;
        var6_6 = true;
        var7_7 = 0L;
        var9_8 = false;
        do {
            block21 : {
                block23 : {
                    block18 : {
                        block19 : {
                            block22 : {
                                block20 : {
                                    block17 : {
                                        if (var2_2 + var4_4 != var3_3) break block17;
                                        if (var4_4 == var1_1.length) {
                                            return 0;
                                        }
                                        if (!this.a(var4_4 + 1)) ** GOTO lbl42
                                        var2_2 = this.e;
                                        var3_3 = this.f;
                                    }
                                    if ((var10_11 = var1_1[var2_2 + var4_4]) == '+') break block18;
                                    if (var10_11 == 'E' || var10_11 == 'e') break block19;
                                    if (var10_11 == '-') break block20;
                                    if (var10_11 == '.') ** GOTO lbl55
                                    if (var10_11 >= '0' && var10_11 <= '9') {
                                        if (var5_5 != 1 && var5_5 != 0) {
                                            if (var5_5 == 2) {
                                                if (var7_7 == 0L) {
                                                    return 0;
                                                }
                                                var12_10 = 10L * var7_7 - (long)(var10_11 - 48);
                                                var14_12 = var7_7 > -922337203685477580L || var7_7 == -922337203685477580L && var12_10 < var7_7;
                                                var15_9 = var14_12 & var6_6;
                                                var7_7 = var12_10;
                                                var6_6 = var15_9;
                                            } else if (var5_5 == 3) {
                                                var5_5 = 4;
                                            } else if (var5_5 == 5 || var5_5 == 6) {
                                                var5_5 = 7;
                                            }
                                        } else {
                                            var7_7 = -(var10_11 - 48);
                                            var5_5 = 2;
                                        }
                                    } else {
                                        if (this.a(var10_11) != false) return 0;
lbl42: // 2 sources:
                                        if (!(var5_5 != 2 || !var6_6 || var7_7 == Long.MIN_VALUE && !var9_8 || var7_7 == 0L && var9_8)) {
                                            if (!var9_8) {
                                                var7_7 = -var7_7;
                                            }
                                            this.j = var7_7;
                                            this.e = var4_4 + this.e;
                                            var11_13 = 15;
                                        } else {
                                            if (var5_5 != 2 && var5_5 != 4) {
                                                if (var5_5 != 7) return 0;
                                            }
                                            this.k = var4_4;
                                            var11_13 = 16;
                                        }
                                        this.i = var11_13;
                                        return var11_13;
lbl55: // 1 sources:
                                        if (var5_5 != 2) return 0;
                                        var5_5 = 3;
                                    }
                                    break block21;
                                }
                                if (var5_5 != 0) break block22;
                                var5_5 = 1;
                                var9_8 = true;
                                break block21;
                            }
                            if (var5_5 != 5) return 0;
                            break block23;
                        }
                        if (var5_5 != 2) {
                            if (var5_5 != 4) return 0;
                        }
                        var5_5 = 5;
                        break block21;
                    }
                    if (var5_5 != 5) return 0;
                }
                var5_5 = 6;
            }
            ++var4_4;
        } while (true);
    }

    /*
     * Enabled aggressive block sorting
     */
    private char H() {
        block16 : {
            char c2;
            block15 : {
                block14 : {
                    if (this.e == this.f && !this.a(1)) {
                        this.c("Unterminated escape sequence");
                        throw null;
                    }
                    char[] arrc = this.d;
                    int n2 = this.e;
                    this.e = n2 + 1;
                    c2 = arrc[n2];
                    if (c2 == '\n') break block14;
                    if (c2 == '\"' || c2 == '\'' || c2 == '/' || c2 == '\\') break block15;
                    if (c2 == 'b') {
                        return '\b';
                    }
                    if (c2 == 'f') {
                        return '\f';
                    }
                    if (c2 == 'n') {
                        return '\n';
                    }
                    if (c2 == 'r') {
                        return '\r';
                    }
                    if (c2 == 't') {
                        return '\t';
                    }
                    if (c2 != 'u') {
                        this.c("Invalid escape sequence");
                        throw null;
                    }
                    if (4 + this.e > this.f && !this.a(4)) {
                        this.c("Unterminated escape sequence");
                        throw null;
                    }
                    break block16;
                }
                this.g = 1 + this.g;
                this.h = this.e;
            }
            return c2;
        }
        char c3 = '\u0000';
        int n3 = this.e;
        int n4 = n3 + 4;
        do {
            int n5;
            if (n3 >= n4) {
                this.e = 4 + this.e;
                return c3;
            }
            char c4 = this.d[n3];
            char c5 = (char)(c3 << 4);
            if (c4 >= '0' && c4 <= '9') {
                n5 = c4 - 48;
            } else {
                int n6;
                if (c4 >= 'a' && c4 <= 'f') {
                    n6 = c4 - 97;
                } else {
                    if (c4 < 'A' || c4 > 'F') break;
                    n6 = c4 - 65;
                }
                n5 = n6 + 10;
            }
            c3 = (char)(c5 + n5);
            ++n3;
        } while (true);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\\u");
        stringBuilder.append(new String(this.d, this.e, 4));
        throw new NumberFormatException(stringBuilder.toString());
    }

    private void I() {
        while (this.e < this.f || this.a(1)) {
            char[] arrc = this.d;
            int n2 = this.e;
            this.e = n2 + 1;
            char c2 = arrc[n2];
            if (c2 == '\n') {
                this.g = 1 + this.g;
                this.h = this.e;
                return;
            }
            if (c2 != '\r') continue;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void J() {
        do {
            var1_1 = 0;
            block5 : while ((var2_2 = this.e) + var1_1 < this.f) {
                block6 : {
                    var3_3 = this.d[var2_2 + var1_1];
                    if (var3_3 == '\t' || var3_3 == '\n' || var3_3 == '\f' || var3_3 == '\r' || var3_3 == ' ') break block6;
                    if (var3_3 == '#') ** GOTO lbl-1000
                    if (var3_3 == ',') break block6;
                    if (var3_3 == '/' || var3_3 == '=') ** GOTO lbl-1000
                    if (var3_3 == '{' || var3_3 == '}' || var3_3 == ':') break block6;
                    if (var3_3 == ';') ** GOTO lbl-1000
                    switch (var3_3) {
                        default: {
                            ++var1_1;
                            continue block5;
                        }
                        case '\\': lbl-1000: // 4 sources:
                        {
                            this.C();
                        }
                        case '[': 
                        case ']': 
                    }
                }
                this.e = var1_1 + this.e;
                return;
            }
            this.e = var2_2 + var1_1;
        } while (this.a(1));
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private boolean a(char var1) {
        if (var1 == '\t') return false;
        if (var1 == '\n') return false;
        if (var1 == '\f') return false;
        if (var1 == '\r') return false;
        if (var1 == ' ') return false;
        if (var1 == '#') ** GOTO lbl-1000
        if (var1 == ',') return false;
        if (var1 == '/' || var1 == '=') ** GOTO lbl-1000
        if (var1 == '{') return false;
        if (var1 == '}') return false;
        if (var1 == ':') return false;
        if (var1 == ';') ** GOTO lbl-1000
        switch (var1) {
            default: {
                return true;
            }
            case '\\': lbl-1000: // 4 sources:
            {
                a.super.C();
            }
            case '[': 
            case ']': 
        }
        return false;
    }

    private boolean a(int n2) {
        int n3;
        int n4;
        Reader reader;
        char[] arrc = this.d;
        int n5 = this.h;
        int n6 = this.e;
        this.h = n5 - n6;
        int n7 = this.f;
        if (n7 != n6) {
            this.f = n7 - n6;
            System.arraycopy((Object)arrc, (int)n6, (Object)arrc, (int)0, (int)this.f);
        } else {
            this.f = 0;
        }
        this.e = 0;
        while ((n3 = (reader = this.b).read(arrc, n4 = this.f, arrc.length - n4)) != -1) {
            int n8;
            this.f = n3 + this.f;
            if (this.g == 0 && (n8 = this.h) == 0 && this.f > 0 && arrc[0] == '\ufeff') {
                this.e = 1 + this.e;
                this.h = n8 + 1;
                ++n2;
            }
            if (this.f < n2) continue;
            return true;
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private int b(boolean var1) {
        var2_2 = this.d;
        block0 : do {
            var3_5 = this.e;
            block1 : do {
                var4_6 = this.f;
                do {
                    block13 : {
                        block12 : {
                            if (var3_5 == var4_6) {
                                this.e = var3_5;
                                if (!a.super.a(1)) {
                                    if (!var1) {
                                        return -1;
                                    }
                                    var11_10 = new StringBuilder();
                                    var11_10.append("End of input");
                                    var11_10.append(this.s());
                                    throw new EOFException(var11_10.toString());
                                }
                                var3_5 = this.e;
                                var4_6 = this.f;
                            }
                            var5_4 = var3_5 + 1;
                            var6_9 = var2_2[var3_5];
                            if (var6_9 != '\n') break block12;
                            this.g = 1 + this.g;
                            this.h = var5_4;
                            break block13;
                        }
                        if (var6_9 == ' ' || var6_9 == '\r' || var6_9 == '\t') break block13;
                        if (var6_9 != '/') ** GOTO lbl48
                        this.e = var5_4;
                        if (var5_4 == var4_6) {
                            --this.e;
                            var10_7 = a.super.a(2);
                            this.e = 1 + this.e;
                            if (!var10_7) {
                                return var6_9;
                            }
                        }
                        a.super.C();
                        var7_8 = this.e;
                        var8_3 = var2_2[var7_8];
                        if (var8_3 != '*') {
                            if (var8_3 != '/') {
                                return var6_9;
                            }
                            this.e = var7_8 + 1;
                        } else {
                            this.e = var7_8 + 1;
                            if (!a.super.b("*/")) {
                                a.super.c("Unterminated comment");
                                throw null;
                            }
                            var3_5 = 2 + this.e;
                            continue block1;
lbl48: // 1 sources:
                            this.e = var5_4;
                            if (var6_9 != '#') return var6_9;
                            a.super.C();
                        }
                        a.super.I();
                        continue block0;
                    }
                    var3_5 = var5_4;
                } while (true);
                break;
            } while (true);
            break;
        } while (true);
    }

    private String b(char c2) {
        char[] arrc = this.d;
        StringBuilder stringBuilder = null;
        block0 : do {
            int n2 = this.e;
            int n3 = this.f;
            int n4 = n2;
            while (n2 < n3) {
                int n5 = n2 + 1;
                char c3 = arrc[n2];
                if (c3 == c2) {
                    this.e = n5;
                    int n6 = n5 - n4 - 1;
                    if (stringBuilder == null) {
                        return new String(arrc, n4, n6);
                    }
                    stringBuilder.append(arrc, n4, n6);
                    return stringBuilder.toString();
                }
                if (c3 == '\\') {
                    this.e = n5;
                    int n7 = n5 - n4 - 1;
                    if (stringBuilder == null) {
                        stringBuilder = new StringBuilder(Math.max((int)(2 * (n7 + 1)), (int)16));
                    }
                    stringBuilder.append(arrc, n4, n7);
                    stringBuilder.append(a.super.H());
                    continue block0;
                }
                if (c3 == '\n') {
                    this.g = 1 + this.g;
                    this.h = n5;
                }
                n2 = n5;
            }
            if (stringBuilder == null) {
                stringBuilder = new StringBuilder(Math.max((int)(2 * (n2 - n4)), (int)16));
            }
            stringBuilder.append(arrc, n4, n2 - n4);
            this.e = n2;
            if (!a.super.a(1)) break;
        } while (true);
        a.super.c("Unterminated string");
        throw null;
    }

    private void b(int n2) {
        int n3 = this.n;
        int[] arrn = this.m;
        if (n3 == arrn.length) {
            int n4 = n3 * 2;
            this.m = Arrays.copyOf((int[])arrn, (int)n4);
            this.p = Arrays.copyOf((int[])this.p, (int)n4);
            this.o = (String[])Arrays.copyOf((Object[])this.o, (int)n4);
        }
        int[] arrn2 = this.m;
        int n5 = this.n;
        this.n = n5 + 1;
        arrn2[n5] = n2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private boolean b(String var1) {
        var2_2 = var1.length();
        block0 : do {
            block6 : {
                if (var2_2 + this.e > this.f) {
                    if (a.super.a(var2_2) == false) return false;
                }
                var3_4 = this.d;
                var4_5 = this.e;
                var5_3 = var3_4[var4_5];
                var6_6 = 0;
                if (var5_3 != '\n') break block6;
                this.g = 1 + this.g;
                this.h = var4_5 + 1;
                ** GOTO lbl16
            }
            while (var6_6 < var2_2) {
                block7 : {
                    if (this.d[var6_6 + this.e] == var1.charAt(var6_6)) break block7;
lbl16: // 2 sources:
                    this.e = 1 + this.e;
                    continue block0;
                }
                ++var6_6;
            }
            return true;
            break;
        } while (true);
    }

    private IOException c(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        stringBuilder.append(this.s());
        throw new d(stringBuilder.toString());
    }

    private void c(char c2) {
        char[] arrc = this.d;
        block0 : do {
            int n2 = this.e;
            int n3 = this.f;
            while (n2 < n3) {
                int n4 = n2 + 1;
                char c3 = arrc[n2];
                if (c3 == c2) {
                    this.e = n4;
                    return;
                }
                if (c3 == '\\') {
                    this.e = n4;
                    a.super.H();
                    continue block0;
                }
                if (c3 == '\n') {
                    this.g = 1 + this.g;
                    this.h = n4;
                }
                n2 = n4;
            }
            this.e = n2;
            if (!a.super.a(1)) break;
        } while (true);
        a.super.c("Unterminated string");
        throw null;
    }

    public b A() {
        int n2 = this.i;
        if (n2 == 0) {
            n2 = this.m();
        }
        switch (n2) {
            default: {
                throw new AssertionError();
            }
            case 17: {
                return b.k;
            }
            case 15: 
            case 16: {
                return b.h;
            }
            case 12: 
            case 13: 
            case 14: {
                return b.f;
            }
            case 8: 
            case 9: 
            case 10: 
            case 11: {
                return b.g;
            }
            case 7: {
                return b.j;
            }
            case 5: 
            case 6: {
                return b.i;
            }
            case 4: {
                return b.c;
            }
            case 3: {
                return b.b;
            }
            case 2: {
                return b.e;
            }
            case 1: 
        }
        return b.d;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void B() {
        int n2 = 0;
        do {
            block6 : {
                block8 : {
                    int n3;
                    block11 : {
                        block9 : {
                            block10 : {
                                int n4;
                                block7 : {
                                    block5 : {
                                        block4 : {
                                            block3 : {
                                                if ((n4 = this.i) == 0) {
                                                    n4 = this.m();
                                                }
                                                if (n4 != 3) break block3;
                                                this.b(1);
                                                break block4;
                                            }
                                            if (n4 != 1) break block5;
                                            this.b(3);
                                        }
                                        ++n2;
                                        break block6;
                                    }
                                    if (n4 != 4 && n4 != 2) break block7;
                                    --this.n;
                                    --n2;
                                    break block6;
                                }
                                if (n4 == 14 || n4 == 10) break block8;
                                if (n4 == 8 || n4 == 12) break block9;
                                if (n4 == 9 || n4 == 13) break block10;
                                if (n4 == 16) {
                                    this.e += this.k;
                                }
                                break block6;
                            }
                            n3 = 34;
                            break block11;
                        }
                        n3 = 39;
                    }
                    this.c((char)n3);
                    break block6;
                }
                this.J();
            }
            this.i = 0;
        } while (n2 != 0);
        int[] arrn = this.p;
        int n5 = this.n;
        int n6 = n5 - 1;
        arrn[n6] = 1 + arrn[n6];
        this.o[n5 - 1] = "null";
    }

    public void a() {
        int n2 = this.i;
        if (n2 == 0) {
            n2 = this.m();
        }
        if (n2 == 3) {
            this.b(1);
            this.p[this.n - 1] = 0;
            this.i = 0;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected BEGIN_ARRAY but was ");
        stringBuilder.append((Object)this.A());
        stringBuilder.append(this.s());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public final void a(boolean bl) {
        this.c = bl;
    }

    public void b() {
        int n2 = this.i;
        if (n2 == 0) {
            n2 = this.m();
        }
        if (n2 == 1) {
            this.b(3);
            this.i = 0;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected BEGIN_OBJECT but was ");
        stringBuilder.append((Object)this.A());
        stringBuilder.append(this.s());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void close() {
        this.i = 0;
        this.m[0] = 8;
        this.n = 1;
        this.b.close();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    int m() {
        block31 : {
            block34 : {
                block35 : {
                    block32 : {
                        block33 : {
                            block26 : {
                                block24 : {
                                    block29 : {
                                        block30 : {
                                            block28 : {
                                                block27 : {
                                                    block25 : {
                                                        block23 : {
                                                            var1_1 = this.m;
                                                            var2_2 = this.n;
                                                            var3_3 = var1_1[var2_2 - 1];
                                                            if (var3_3 != 1) break block23;
                                                            var1_1[var2_2 - 1] = 2;
                                                            break block24;
                                                        }
                                                        if (var3_3 != 2) break block25;
                                                        var19_4 = this.b(true);
                                                        if (var19_4 != 44) {
                                                            if (var19_4 != 59) {
                                                                if (var19_4 == 93) {
                                                                    this.i = 4;
                                                                    return 4;
                                                                }
                                                                this.c("Unterminated array");
                                                                throw null;
                                                            }
                                                            this.C();
                                                        }
                                                        break block24;
                                                    }
                                                    if (var3_3 == 3 || var3_3 == 5) break block26;
                                                    if (var3_3 != 4) break block27;
                                                    var1_1[var2_2 - 1] = 5;
                                                    var15_5 = this.b(true);
                                                    if (var15_5 != 58) {
                                                        if (var15_5 != 61) {
                                                            this.c("Expected ':'");
                                                            throw null;
                                                        }
                                                        this.C();
                                                        if ((this.e < this.f || this.a(1)) && (var17_6 = this.d)[var18_7 = this.e] == '>') {
                                                            this.e = var18_7 + 1;
                                                        }
                                                    }
                                                    break block24;
                                                }
                                                if (var3_3 != 6) break block28;
                                                if (this.c) {
                                                    this.D();
                                                }
                                                this.m[this.n - 1] = 7;
                                                break block24;
                                            }
                                            if (var3_3 != 7) break block29;
                                            if (this.b(false) != -1) break block30;
                                            var5_8 = 17;
                                            break block31;
                                        }
                                        this.C();
                                        --this.e;
                                        break block24;
                                    }
                                    if (var3_3 == 8) throw new IllegalStateException("JsonReader is closed");
                                }
                                var10_9 = this.b(true);
                                if (var10_9 == 34) ** GOTO lbl87
                                if (var10_9 == 39) {
                                    this.C();
                                    this.i = 8;
                                    return 8;
                                }
                                if (var10_9 == 44 || var10_9 == 59) ** GOTO lbl80
                                if (var10_9 == 91) {
                                    this.i = 3;
                                    return 3;
                                }
                                if (var10_9 != 93) {
                                    if (var10_9 == 123) {
                                        this.i = 1;
                                        return 1;
                                    }
                                    --this.e;
                                    var12_10 = this.F();
                                    if (var12_10 != 0) {
                                        return var12_10;
                                    }
                                    var13_11 = this.G();
                                    if (var13_11 != 0) {
                                        return var13_11;
                                    }
                                    if (!this.a(this.d[this.e])) {
                                        this.c("Expected value");
                                        throw null;
                                    }
                                    this.C();
                                    var5_8 = 10;
                                } else {
                                    if (var3_3 == 1) {
                                        this.i = 4;
                                        return 4;
                                    }
lbl80: // 3 sources:
                                    if (var3_3 != 1 && var3_3 != 2) {
                                        this.c("Unexpected value");
                                        throw null;
                                    }
                                    this.C();
                                    --this.e;
                                    this.i = 7;
                                    return 7;
lbl87: // 1 sources:
                                    var5_8 = 9;
                                }
                                break block31;
                            }
                            this.m[this.n - 1] = 4;
                            if (var3_3 != 5 || (var8_12 = this.b(true)) == 44) break block32;
                            if (var8_12 == 59) break block33;
                            if (var8_12 != 125) {
                                this.c("Unterminated object");
                                throw null;
                            }
                            ** GOTO lbl-1000
                        }
                        this.C();
                    }
                    if ((var4_13 = this.b(true)) == 34) break block34;
                    if (var4_13 != 39) {
                        if (var4_13 != 125) {
                            this.C();
                            --this.e;
                            if (!this.a((char)var4_13)) {
                                this.c("Expected name");
                                throw null;
                            }
                            var5_8 = 14;
                        } else if (var3_3 == 5) {
                            this.c("Expected name");
                            throw null;
                        } else {
                            ** GOTO lbl-1000
                        }
                    }
                    break block35;
lbl-1000: // 3 sources:
                    {
                        var5_8 = 2;
                    }
                    break block31;
                }
                this.C();
                var5_8 = 12;
                break block31;
            }
            var5_8 = 13;
        }
        this.i = var5_8;
        return var5_8;
    }

    public void n() {
        int n2 = this.i;
        if (n2 == 0) {
            n2 = this.m();
        }
        if (n2 == 4) {
            this.n = -1 + this.n;
            int[] arrn = this.p;
            int n3 = -1 + this.n;
            arrn[n3] = 1 + arrn[n3];
            this.i = 0;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected END_ARRAY but was ");
        stringBuilder.append((Object)this.A());
        stringBuilder.append(this.s());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void o() {
        int n2 = this.i;
        if (n2 == 0) {
            n2 = this.m();
        }
        if (n2 == 2) {
            this.n = -1 + this.n;
            String[] arrstring = this.o;
            int n3 = this.n;
            arrstring[n3] = null;
            int[] arrn = this.p;
            int n4 = n3 - 1;
            arrn[n4] = 1 + arrn[n4];
            this.i = 0;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected END_OBJECT but was ");
        stringBuilder.append((Object)this.A());
        stringBuilder.append(this.s());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public String p() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append('$');
        int n2 = this.n;
        for (int i2 = 0; i2 < n2; ++i2) {
            int n3 = this.m[i2];
            if (n3 != 1 && n3 != 2) {
                if (n3 != 3 && n3 != 4 && n3 != 5) continue;
                stringBuilder.append('.');
                String[] arrstring = this.o;
                if (arrstring[i2] == null) continue;
                stringBuilder.append(arrstring[i2]);
                continue;
            }
            stringBuilder.append('[');
            stringBuilder.append(this.p[i2]);
            stringBuilder.append(']');
        }
        return stringBuilder.toString();
    }

    public boolean q() {
        int n2 = this.i;
        if (n2 == 0) {
            n2 = this.m();
        }
        return n2 != 2 && n2 != 4;
    }

    public final boolean r() {
        return this.c;
    }

    String s() {
        int n2 = 1 + this.g;
        int n3 = 1 + (this.e - this.h);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" at line ");
        stringBuilder.append(n2);
        stringBuilder.append(" column ");
        stringBuilder.append(n3);
        stringBuilder.append(" path ");
        stringBuilder.append(this.p());
        return stringBuilder.toString();
    }

    public boolean t() {
        int n2 = this.i;
        if (n2 == 0) {
            n2 = this.m();
        }
        if (n2 == 5) {
            this.i = 0;
            int[] arrn = this.p;
            int n3 = this.n - 1;
            arrn[n3] = 1 + arrn[n3];
            return true;
        }
        if (n2 == 6) {
            this.i = 0;
            int[] arrn = this.p;
            int n4 = this.n - 1;
            arrn[n4] = 1 + arrn[n4];
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected a boolean but was ");
        stringBuilder.append((Object)this.A());
        stringBuilder.append(this.s());
        throw new IllegalStateException(stringBuilder.toString());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.getClass().getSimpleName());
        stringBuilder.append(this.s());
        return stringBuilder.toString();
    }

    public double u() {
        block5 : {
            String string;
            block8 : {
                int n2;
                block6 : {
                    block7 : {
                        block4 : {
                            n2 = this.i;
                            if (n2 == 0) {
                                n2 = this.m();
                            }
                            if (n2 == 15) {
                                this.i = 0;
                                int[] arrn = this.p;
                                int n3 = -1 + this.n;
                                arrn[n3] = 1 + arrn[n3];
                                return this.j;
                            }
                            if (n2 != 16) break block4;
                            this.l = new String(this.d, this.e, this.k);
                            this.e += this.k;
                            break block5;
                        }
                        if (n2 == 8 || n2 == 9) break block6;
                        if (n2 != 10) break block7;
                        string = this.E();
                        break block8;
                    }
                    if (n2 != 11) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Expected a double but was ");
                        stringBuilder.append((Object)this.A());
                        stringBuilder.append(this.s());
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                    break block5;
                }
                char c2 = n2 == 8 ? (char)'\'' : '\"';
                string = this.b(c2);
            }
            this.l = string;
        }
        this.i = 11;
        double d2 = Double.parseDouble((String)this.l);
        if (!this.c && (Double.isNaN((double)d2) || Double.isInfinite((double)d2))) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("JSON forbids NaN and infinities: ");
            stringBuilder.append(d2);
            stringBuilder.append(this.s());
            throw new d(stringBuilder.toString());
        }
        this.l = null;
        this.i = 0;
        int[] arrn = this.p;
        int n4 = -1 + this.n;
        arrn[n4] = 1 + arrn[n4];
        return d2;
    }

    /*
     * Exception decompiling
     */
    public int v() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl172.1 : ALOAD_0 : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
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

    /*
     * Exception decompiling
     */
    public long w() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl138.1 : ALOAD_0 : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
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

    /*
     * Enabled aggressive block sorting
     */
    public String x() {
        String string;
        int n2 = this.i;
        if (n2 == 0) {
            n2 = this.m();
        }
        if (n2 == 14) {
            string = this.E();
        } else {
            int n3;
            if (n2 == 12) {
                n3 = 39;
            } else {
                if (n2 != 13) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Expected a name but was ");
                    stringBuilder.append((Object)this.A());
                    stringBuilder.append(this.s());
                    IllegalStateException illegalStateException = new IllegalStateException(stringBuilder.toString());
                    throw illegalStateException;
                }
                n3 = 34;
            }
            string = this.b((char)n3);
        }
        this.i = 0;
        this.o[-1 + this.n] = string;
        return string;
    }

    public void y() {
        int n2 = this.i;
        if (n2 == 0) {
            n2 = this.m();
        }
        if (n2 == 7) {
            this.i = 0;
            int[] arrn = this.p;
            int n3 = -1 + this.n;
            arrn[n3] = 1 + arrn[n3];
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Expected null but was ");
        stringBuilder.append((Object)this.A());
        stringBuilder.append(this.s());
        throw new IllegalStateException(stringBuilder.toString());
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public String z() {
        block9 : {
            block10 : {
                block8 : {
                    var1_1 = this.i;
                    if (var1_1 == 0) {
                        var1_1 = this.m();
                    }
                    if (var1_1 != 10) break block8;
                    var2_2 = this.E();
                    break block9;
                }
                if (var1_1 != 8) break block10;
                var10_3 = 39;
                ** GOTO lbl14
            }
            if (var1_1 == 9) {
                var10_3 = 34;
lbl14: // 2 sources:
                var2_2 = this.b((char)var10_3);
            } else if (var1_1 == 11) {
                var2_2 = this.l;
                this.l = null;
            } else if (var1_1 == 15) {
                var2_2 = Long.toString((long)this.j);
            } else {
                if (var1_1 != 16) {
                    var5_6 = new StringBuilder();
                    var5_6.append("Expected a string but was ");
                    var5_6.append((Object)this.A());
                    var5_6.append(this.s());
                    var9_7 = new IllegalStateException(var5_6.toString());
                    throw var9_7;
                }
                var2_2 = new String(this.d, this.e, this.k);
                this.e += this.k;
            }
        }
        this.i = 0;
        var3_4 = this.p;
        var4_5 = -1 + this.n;
        var3_4[var4_5] = 1 + var3_4[var4_5];
        return var2_2;
    }
}

