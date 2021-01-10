/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.text.SpannableStringBuilder
 *  android.text.TextPaint
 *  android.text.style.CharacterStyle
 *  android.text.style.StyleSpan
 *  android.text.style.UnderlineSpan
 *  android.text.style.UpdateAppearance
 *  android.util.Log
 *  android.view.accessibility.CaptioningManager
 *  android.view.accessibility.CaptioningManager$CaptionStyle
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Arrays
 */
package e.j.b;

import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import android.text.style.UpdateAppearance;
import android.util.Log;
import android.view.accessibility.CaptioningManager;
import java.util.ArrayList;
import java.util.Arrays;

class b {
    private static final boolean h = Log.isLoggable((String)"Cea608CCParser", (int)3);
    private final d a;
    private int b = 1;
    private int c = 4;
    private int d = -1;
    private c e = new c();
    private c f = new c();
    private c g = new c();

    b(d d2) {
        this.a = d2;
    }

    private c a() {
        int n2 = this.b;
        if (n2 != 1 && n2 != 2) {
            if (n2 != 3) {
                if (n2 != 4) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("unrecoginized mode: ");
                    stringBuilder.append(this.b);
                    Log.w((String)"Cea608CCParser", (String)stringBuilder.toString());
                    return this.e;
                }
                return this.g;
            }
            return this.f;
        }
        return this.e;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private boolean a(a var1) {
        block18 : {
            var2_2 = var1.a();
            var3_3 = this.d;
            if (var3_3 != -1 && var3_3 == var2_2) {
                this.d = -1;
                return true;
            }
            switch (var2_2) {
                default: {
                    this.d = -1;
                    return false;
                }
                case 47: {
                    b.super.b();
                    this.b = 3;
                    ** GOTO lbl26
                }
                case 46: {
                    var5_4 = this.f;
                    ** GOTO lbl34
                }
                case 45: {
                    if (this.b == 2) {
                        b.super.a().a(this.c);
                    } else {
                        b.super.a().b();
                    }
                    if (this.b != 2) break block18;
                    ** GOTO lbl26
                }
                case 44: {
                    this.e.d();
lbl26: // 3 sources:
                    b.super.c();
                    break block18;
                }
                case 43: {
                    this.b = 4;
                    break block18;
                }
                case 42: {
                    this.b = 4;
                    var5_4 = this.g;
lbl34: // 2 sources:
                    var5_4.d();
                    break block18;
                }
                case 41: {
                    this.b = 1;
                    break block18;
                }
                case 40: {
                    Log.i((String)"Cea608CCParser", (String)"Flash On");
                    break block18;
                }
                case 37: 
                case 38: 
                case 39: {
                    this.c = var2_2 - 35;
                    if (this.b != 2) {
                        this.e.d();
                        this.f.d();
                    }
                    this.b = 2;
                    break block18;
                }
                case 36: {
                    b.super.a().c();
                    break block18;
                }
                case 33: {
                    b.super.a().a();
                    break block18;
                }
                case 32: 
            }
            this.b = 3;
        }
        this.d = var2_2;
        return true;
    }

    private void b() {
        c c2 = this.e;
        this.e = this.f;
        this.f = c2;
    }

    private boolean b(a a2) {
        if (!a2.f()) {
            return false;
        }
        if (a2.g()) {
            b.super.a().a();
        }
        b.super.a().a(a2.b());
        int n2 = this.b;
        if (n2 == 1 || n2 == 2) {
            b.super.c();
        }
        return true;
    }

    private void c() {
        d d2 = this.a;
        if (d2 != null) {
            CaptioningManager.CaptionStyle captionStyle = d2.a();
            this.a.a(this.e.a(captionStyle));
        }
    }

    private boolean c(a a2) {
        g g2 = a2.c();
        if (g2 != null) {
            b.super.a().a(g2);
            return true;
        }
        return false;
    }

    private boolean d(a a2) {
        f f2 = a2.d();
        if (f2 != null) {
            if (this.b == 2) {
                b.super.a().a(f2.d(), this.c);
            }
            b.super.a().a(f2);
            return true;
        }
        return false;
    }

    private boolean e(a a2) {
        int n2 = a2.e();
        if (n2 > 0) {
            b.super.a().b(n2);
            return true;
        }
        return false;
    }

    public void a(byte[] arrby) {
        a[] arra = a.a(arrby);
        for (int i2 = 0; i2 < arra.length; ++i2) {
            if (h) {
                Log.d((String)"Cea608CCParser", (String)arra[i2].toString());
            }
            if (b.super.a(arra[i2]) || b.super.e(arra[i2]) || b.super.d(arra[i2]) || b.super.c(arra[i2])) continue;
            b.super.b(arra[i2]);
        }
    }

    private static class a {
        private static final String[] d = new String[]{"RCL", "BS", "AOF", "AON", "DER", "RU2", "RU3", "RU4", "FON", "RDC", "TR", "RTD", "EDM", "CR", "ENM", "EOC"};
        private static final String[] e = new String[]{"\u00ae", "\u00b0", "\u00bd", "\u00bf", "\u2122", "\u00a2", "\u00a3", "\u266a", "\u00e0", "\u00a0", "\u00e8", "\u00e2", "\u00ea", "\u00ee", "\u00f4", "\u00fb"};
        private static final String[] f = new String[]{"\u00c1", "\u00c9", "\u00d3", "\u00da", "\u00dc", "\u00fc", "\u2018", "\u00a1", "*", "'", "\u2014", "\u00a9", "\u2120", "\u2022", "\u201c", "\u201d", "\u00c0", "\u00c2", "\u00c7", "\u00c8", "\u00ca", "\u00cb", "\u00eb", "\u00ce", "\u00cf", "\u00ef", "\u00d4", "\u00d9", "\u00f9", "\u00db", "\u00ab", "\u00bb"};
        private static final String[] g = new String[]{"\u00c3", "\u00e3", "\u00cd", "\u00cc", "\u00ec", "\u00d2", "\u00f2", "\u00d5", "\u00f5", "{", "}", "\\", "^", "_", "|", "~", "\u00c4", "\u00e4", "\u00d6", "\u00f6", "\u00df", "\u00a5", "\u00a4", "\u2502", "\u00c5", "\u00e5", "\u00d8", "\u00f8", "\u250c", "\u2510", "\u2514", "\u2518"};
        private final byte a;
        private final byte b;
        private final byte c;

        a(byte by, byte by2, byte by3) {
            this.a = by;
            this.b = by2;
            this.c = by3;
        }

        private char a(byte by) {
            if (by != 42) {
                if (by != 92) {
                    switch (by) {
                        default: {
                            switch (by) {
                                default: {
                                    return (char)by;
                                }
                                case 127: {
                                    return '\u2588';
                                }
                                case 126: {
                                    return '\u00f1';
                                }
                                case 125: {
                                    return '\u00d1';
                                }
                                case 124: {
                                    return '\u00f7';
                                }
                                case 123: 
                            }
                            return '\u00e7';
                        }
                        case 96: {
                            return '\u00fa';
                        }
                        case 95: {
                            return '\u00f3';
                        }
                        case 94: 
                    }
                    return '\u00ed';
                }
                return '\u00e9';
            }
            return '\u00e1';
        }

        private String a(int n2) {
            return d[n2 - 32];
        }

        static a[] a(byte[] arrby) {
            a[] arra = new a[arrby.length / 3];
            for (int i2 = 0; i2 < arra.length; ++i2) {
                int n2 = i2 * 3;
                arra[i2] = new a(arrby[n2], arrby[n2 + 1], arrby[n2 + 2]);
            }
            return arra;
        }

        private String h() {
            byte by = this.b;
            if (by >= 32 && by <= 127) {
                StringBuilder stringBuilder = new StringBuilder(2);
                stringBuilder.append(this.a(this.b));
                byte by2 = this.c;
                if (by2 >= 32 && by2 <= 127) {
                    stringBuilder.append(this.a(by2));
                }
                return stringBuilder.toString();
            }
            return null;
        }

        private String i() {
            byte by;
            byte by2;
            byte by3 = this.b;
            if ((by3 == 18 || by3 == 26) && (by = this.c) >= 32 && by <= 63) {
                return f[by - 32];
            }
            byte by4 = this.b;
            if ((by4 == 19 || by4 == 27) && (by2 = this.c) >= 32 && by2 <= 63) {
                return g[by2 - 32];
            }
            return null;
        }

        private String j() {
            byte by;
            byte by2 = this.b;
            if ((by2 == 17 || by2 == 25) && (by = this.c) >= 48 && by <= 63) {
                return e[by - 48];
            }
            return null;
        }

        private boolean k() {
            byte by = this.b;
            return by >= 32 && by <= 127;
        }

        private boolean l() {
            byte by;
            byte by2 = this.b;
            return (by2 == 17 || by2 == 25) && (by = this.c) >= 48 && by <= 63;
        }

        int a() {
            byte by;
            byte by2 = this.b;
            if ((by2 == 20 || by2 == 28) && (by = this.c) >= 32 && by <= 47) {
                return by;
            }
            return -1;
        }

        String b() {
            String string = this.h();
            if (string == null && (string = this.j()) == null) {
                string = this.i();
            }
            return string;
        }

        g c() {
            byte by;
            byte by2 = this.b;
            if ((by2 == 17 || by2 == 25) && (by = this.c) >= 32 && by <= 47) {
                return g.a(by);
            }
            return null;
        }

        f d() {
            byte by;
            byte by2 = this.b;
            if ((by2 & 112) == 16 && ((by = this.c) & 64) == 64 && ((by2 & 7) != 0 || (by & 32) == 0)) {
                return f.a(this.b, this.c);
            }
            return null;
        }

        int e() {
            byte by;
            byte by2 = this.b;
            if ((by2 == 23 || by2 == 31) && (by = this.c) >= 33 && by <= 35) {
                return by & 3;
            }
            return 0;
        }

        boolean f() {
            return this.k() || this.l() || this.g();
            {
            }
        }

        boolean g() {
            byte by;
            byte by2 = this.b;
            return (by2 == 18 || by2 == 26 || by2 == 19 || by2 == 27) && (by = this.c) >= 32 && by <= 63;
        }

        public String toString() {
            if (this.b < 16 && this.c < 16) {
                Object[] arrobject = new Object[]{this.a, this.b, this.c};
                return String.format((String)"[%d]Null: %02x %02x", (Object[])arrobject);
            }
            int n2 = this.a();
            if (n2 != -1) {
                Object[] arrobject = new Object[]{this.a, this.a(n2)};
                return String.format((String)"[%d]%s", (Object[])arrobject);
            }
            int n3 = this.e();
            if (n3 > 0) {
                Object[] arrobject = new Object[]{this.a, n3};
                return String.format((String)"[%d]Tab%d", (Object[])arrobject);
            }
            f f2 = this.d();
            if (f2 != null) {
                Object[] arrobject = new Object[]{this.a, f2.toString()};
                return String.format((String)"[%d]PAC: %s", (Object[])arrobject);
            }
            g g2 = this.c();
            if (g2 != null) {
                Object[] arrobject = new Object[]{this.a, g2.toString()};
                return String.format((String)"[%d]Mid-row: %s", (Object[])arrobject);
            }
            if (this.f()) {
                Object[] arrobject = new Object[]{this.a, this.b(), this.b, this.c};
                return String.format((String)"[%d]Displayable: %s (%02x %02x)", (Object[])arrobject);
            }
            Object[] arrobject = new Object[]{this.a, this.b, this.c};
            return String.format((String)"[%d]Invalid: %02x %02x", (Object[])arrobject);
        }
    }

    private static class b {
        private final StringBuilder a;
        private final g[] b;
        private final g[] c;

        b(String string) {
            this.a = new StringBuilder(string);
            this.b = new g[this.a.length()];
            this.c = new g[this.a.length()];
        }

        char a(int n2) {
            return this.a.charAt(n2);
        }

        int a() {
            return this.a.length();
        }

        SpannableStringBuilder a(CaptioningManager.CaptionStyle captionStyle) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder((CharSequence)this.a);
            g g2 = null;
            int n2 = -1;
            int n3 = -1;
            for (int i2 = 0; i2 < this.a.length(); ++i2) {
                g[] arrg = this.b;
                g g3 = arrg[i2] != null ? arrg[i2] : (this.c[i2] != null && (n2 < 0 || n3 < 0) ? this.c[i2] : null);
                if (g3 != null) {
                    if (n2 >= 0 && n3 >= 0) {
                        this.a(spannableStringBuilder, g3, n2, i2);
                    }
                    n2 = i2;
                    g2 = g3;
                }
                if (this.a.charAt(i2) != '\u00a0') {
                    if (n3 >= 0) continue;
                    n3 = i2;
                    continue;
                }
                if (n3 < 0) continue;
                if (this.a.charAt(n3) != ' ') {
                    --n3;
                }
                int n4 = this.a.charAt(i2 - 1) == ' ' ? i2 : i2 + 1;
                spannableStringBuilder.setSpan((Object)new e(captionStyle.backgroundColor), n3, n4, 33);
                if (n2 >= 0) {
                    this.a(spannableStringBuilder, g2, n2, n4);
                }
                n3 = -1;
            }
            return spannableStringBuilder;
        }

        void a(int n2, char c2) {
            this.a.setCharAt(n2, c2);
            this.b[n2] = null;
        }

        void a(int n2, f f2) {
            this.c[n2] = f2;
        }

        void a(int n2, g g2) {
            this.a.setCharAt(n2, ' ');
            this.b[n2] = g2;
        }

        void a(SpannableStringBuilder spannableStringBuilder, g g2, int n2, int n3) {
            if (g2.a()) {
                spannableStringBuilder.setSpan((Object)new StyleSpan(2), n2, n3, 33);
            }
            if (g2.b()) {
                spannableStringBuilder.setSpan((Object)new UnderlineSpan(), n2, n3, 33);
            }
        }
    }

    private static class c {
        private final String a;
        private final b[] b = new b[17];
        private int c;
        private int d;

        c() {
            char[] arrc = new char[34];
            Arrays.fill((char[])arrc, (char)'\u00a0');
            this.a = new String(arrc);
        }

        private static int a(int n2, int n3, int n4) {
            if (n2 < n3) {
                return n3;
            }
            if (n2 > n4) {
                n2 = n4;
            }
            return n2;
        }

        private void b(int n2, int n3) {
            this.c = c.a(n2, 1, 15);
            this.d = c.a(n3, 1, 32);
        }

        private b c(int n2) {
            b[] arrb = this.b;
            if (arrb[n2] == null) {
                arrb[n2] = new b(this.a);
            }
            return this.b[n2];
        }

        private void d(int n2) {
            this.d = c.a(n2 + this.d, 1, 32);
        }

        void a() {
            this.d(-1);
            b[] arrb = this.b;
            int n2 = this.c;
            if (arrb[n2] != null) {
                arrb[n2].a(this.d, '\u00a0');
                if (this.d == 31) {
                    this.b[this.c].a(32, '\u00a0');
                }
            }
        }

        void a(int n2) {
            int n3;
            b[] arrb;
            int n4;
            for (int i2 = 0; i2 <= (n4 = this.c) - n2; ++i2) {
                this.b[i2] = null;
            }
            int n5 = 1 + (n4 - n2);
            if (n5 < 1) {
                n5 = 1;
            }
            while (n5 < (n3 = this.c)) {
                b[] arrb2 = this.b;
                int n6 = n5 + 1;
                arrb2[n5] = arrb2[n6];
                n5 = n6;
            }
            while (n3 < (arrb = this.b).length) {
                arrb[n3] = null;
                ++n3;
            }
            this.d = 1;
        }

        void a(int n2, int n3) {
            int n4;
            b[] arrb;
            if (this.c == n2) {
                return;
            }
            int n5 = this.c;
            int n6 = n2 < n3 ? n2 : n3;
            if (n5 < n6) {
                n6 = n5;
            }
            if (n2 < this.c) {
                int n7 = n6 - 1;
                do {
                    n4 = 0;
                    if (n7 >= 0) {
                        b[] arrb2 = this.b;
                        arrb2[n2 - n7] = arrb2[this.c - n7];
                        --n7;
                        continue;
                    }
                    break;
                } while (true);
            } else {
                int n8 = 0;
                do {
                    n4 = 0;
                    if (n8 >= n6) break;
                    b[] arrb3 = this.b;
                    arrb3[n2 - n8] = arrb3[this.c - n8];
                    ++n8;
                } while (true);
            }
            while (n4 <= n2 - n3) {
                this.b[n4] = null;
                ++n4;
            }
            while (++n2 < (arrb = this.b).length) {
                arrb[n2] = null;
            }
        }

        void a(f f2) {
            int n2;
            int n3;
            if (f2.e()) {
                n2 = f2.d();
                n3 = f2.c();
            } else {
                n2 = f2.d();
                n3 = 1;
            }
            c.super.b(n2, n3);
            c.super.c(this.c).a(this.d, f2);
        }

        void a(g g2) {
            c.super.c(this.c).a(this.d, g2);
            c.super.d(1);
        }

        void a(String string) {
            for (int i2 = 0; i2 < string.length(); ++i2) {
                c.super.c(this.c).a(this.d, string.charAt(i2));
                c.super.d(1);
            }
        }

        SpannableStringBuilder[] a(CaptioningManager.CaptionStyle captionStyle) {
            ArrayList arrayList = new ArrayList(15);
            for (int i2 = 1; i2 <= 15; ++i2) {
                b[] arrb = this.b;
                SpannableStringBuilder spannableStringBuilder = arrb[i2] != null ? arrb[i2].a(captionStyle) : null;
                arrayList.add(spannableStringBuilder);
            }
            return (SpannableStringBuilder[])arrayList.toArray((Object[])new SpannableStringBuilder[15]);
        }

        void b() {
            this.b(1 + this.c, 1);
        }

        void b(int n2) {
            c.super.d(n2);
        }

        void c() {
            if (this.b[this.c] != null) {
                for (int i2 = 0; i2 < this.d; ++i2) {
                    if (this.b[this.c].a(i2) == '\u00a0') continue;
                    for (int i3 = this.d; i3 < this.b[this.c].a(); ++i3) {
                        this.b[i3].a(i3, '\u00a0');
                    }
                    return;
                }
                this.b[this.c] = null;
            }
        }

        void d() {
            b[] arrb;
            for (int i2 = 0; i2 < (arrb = this.b).length; ++i2) {
                arrb[i2] = null;
            }
            this.c = 15;
            this.d = 1;
        }
    }

    static interface d {
        public CaptioningManager.CaptionStyle a();

        public void a(SpannableStringBuilder[] var1);
    }

    public static class e
    extends CharacterStyle
    implements UpdateAppearance {
        private int b;

        e(int n2) {
            this.b = n2;
        }

        public void a(int n2) {
            this.b = n2;
        }

        public void updateDrawState(TextPaint textPaint) {
            textPaint.bgColor = this.b;
        }
    }

    private static class g {
        static final String[] c = new String[]{"WHITE", "GREEN", "BLUE", "CYAN", "RED", "YELLOW", "MAGENTA", "INVALID"};
        final int a;
        final int b;

        g(int n2, int n3) {
            this.a = n2;
            this.b = n3;
        }

        static g a(byte by) {
            int n2 = 7 & by >> 1;
            int n3 = (by & 1) != 0 ? 2 : 0;
            if (n2 == 7) {
                n3 |= 1;
                n2 = 0;
            }
            return new g(n3, n2);
        }

        boolean a() {
            return (1 & this.a) != 0;
        }

        boolean b() {
            return (2 & this.a) != 0;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("{");
            stringBuilder.append(c[this.b]);
            if ((1 & this.a) != 0) {
                stringBuilder.append(", ITALICS");
            }
            if ((2 & this.a) != 0) {
                stringBuilder.append(", UNDERLINE");
            }
            stringBuilder.append("}");
            return stringBuilder.toString();
        }
    }

}

