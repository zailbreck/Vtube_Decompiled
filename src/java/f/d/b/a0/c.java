/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.Closeable
 *  java.io.Flushable
 *  java.io.IOException
 *  java.io.Writer
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Long
 *  java.lang.NullPointerException
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Arrays
 */
package f.d.b.a0;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

public class c
implements Closeable,
Flushable {
    private static final String[] k = new String[128];
    private static final String[] l;
    private final Writer b;
    private int[] c = new int[32];
    private int d = 0;
    private String e;
    private String f;
    private boolean g;
    private boolean h;
    private String i;
    private boolean j;

    static {
        for (int i2 = 0; i2 <= 31; ++i2) {
            String[] arrstring = k;
            Object[] arrobject = new Object[]{i2};
            arrstring[i2] = String.format((String)"\\u%04x", (Object[])arrobject);
        }
        String[] arrstring = k;
        arrstring[34] = "\\\"";
        arrstring[92] = "\\\\";
        arrstring[9] = "\\t";
        arrstring[8] = "\\b";
        arrstring[10] = "\\n";
        arrstring[13] = "\\r";
        arrstring[12] = "\\f";
        String[] arrstring2 = l = (String[])arrstring.clone();
        arrstring2[60] = "\\u003c";
        arrstring2[62] = "\\u003e";
        arrstring2[38] = "\\u0026";
        arrstring2[61] = "\\u003d";
        arrstring2[39] = "\\u0027";
    }

    public c(Writer writer) {
        c.super.a(6);
        this.f = ":";
        this.j = true;
        if (writer != null) {
            this.b = writer;
            return;
        }
        throw new NullPointerException("out == null");
    }

    private c a(int n2, char c2) {
        c.super.t();
        c.super.a(n2);
        this.b.write((int)c2);
        return this;
    }

    private c a(int n2, int n3, char c2) {
        int n4 = c.super.v();
        if (n4 != n3 && n4 != n2) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.i == null) {
            this.d = -1 + this.d;
            if (n4 == n3) {
                c.super.u();
            }
            this.b.write((int)c2);
            return this;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Dangling name: ");
        stringBuilder.append(this.i);
        throw new IllegalStateException(stringBuilder.toString());
    }

    private void a(int n2) {
        int n3 = this.d;
        int[] arrn = this.c;
        if (n3 == arrn.length) {
            this.c = Arrays.copyOf((int[])arrn, (int)(n3 * 2));
        }
        int[] arrn2 = this.c;
        int n4 = this.d;
        this.d = n4 + 1;
        arrn2[n4] = n2;
    }

    private void b(int n2) {
        this.c[-1 + this.d] = n2;
    }

    private void e(String string) {
        String[] arrstring = this.h ? l : k;
        this.b.write(34);
        int n2 = string.length();
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            String string2;
            char c2 = string.charAt(i2);
            if (c2 < '') {
                string2 = arrstring[c2];
                if (string2 == null) {
                    continue;
                }
            } else if (c2 == '\u2028') {
                string2 = "\\u2028";
            } else {
                if (c2 != '\u2029') continue;
                string2 = "\\u2029";
            }
            if (n3 < i2) {
                this.b.write(string, n3, i2 - n3);
            }
            this.b.write(string2);
            n3 = i2 + 1;
        }
        if (n3 < n2) {
            this.b.write(string, n3, n2 - n3);
        }
        this.b.write(34);
    }

    private void s() {
        block4 : {
            block3 : {
                int n2;
                block2 : {
                    n2 = this.v();
                    if (n2 != 5) break block2;
                    this.b.write(44);
                    break block3;
                }
                if (n2 != 3) break block4;
            }
            this.u();
            this.b(4);
            return;
        }
        throw new IllegalStateException("Nesting problem.");
    }

    private void t() {
        int n2 = this.v();
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 4) {
                    if (n2 != 6) {
                        if (n2 == 7) {
                            if (!this.g) {
                                throw new IllegalStateException("JSON must have only one top-level value.");
                            }
                        } else {
                            throw new IllegalStateException("Nesting problem.");
                        }
                    }
                    this.b(7);
                    return;
                }
                this.b.append((CharSequence)this.f);
                this.b(5);
                return;
            }
            this.b.append(',');
        } else {
            this.b(2);
        }
        this.u();
    }

    private void u() {
        if (this.e == null) {
            return;
        }
        this.b.write(10);
        int n2 = this.d;
        for (int i2 = 1; i2 < n2; ++i2) {
            this.b.write(this.e);
        }
    }

    private int v() {
        int n2 = this.d;
        if (n2 != 0) {
            return this.c[n2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void w() {
        if (this.i != null) {
            this.s();
            this.e(this.i);
            this.i = null;
        }
    }

    public c a() {
        this.w();
        this.a(1, '[');
        return this;
    }

    public c a(Boolean bl) {
        if (bl == null) {
            return this.r();
        }
        c.super.w();
        c.super.t();
        Writer writer = this.b;
        String string = bl != false ? "true" : "false";
        writer.write(string);
        return this;
    }

    public c a(Number number) {
        if (number == null) {
            return this.r();
        }
        c.super.w();
        String string = number.toString();
        if (!this.g && (string.equals((Object)"-Infinity") || string.equals((Object)"Infinity") || string.equals((Object)"NaN"))) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Numeric values must be finite, but was ");
            stringBuilder.append((Object)number);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        c.super.t();
        this.b.append((CharSequence)string);
        return this;
    }

    public final void a(boolean bl) {
        this.h = bl;
    }

    public c b() {
        this.w();
        this.a(3, '{');
        return this;
    }

    public c b(String string) {
        if (string != null) {
            if (this.i == null) {
                if (this.d != 0) {
                    this.i = string;
                    return this;
                }
                throw new IllegalStateException("JsonWriter is closed.");
            }
            throw new IllegalStateException();
        }
        throw new NullPointerException("name == null");
    }

    public final void b(boolean bl) {
        this.g = bl;
    }

    public final void c(String string) {
        String string2;
        if (string.length() == 0) {
            this.e = null;
            string2 = ":";
        } else {
            this.e = string;
            string2 = ": ";
        }
        this.f = string2;
    }

    public final void c(boolean bl) {
        this.j = bl;
    }

    public void close() {
        this.b.close();
        int n2 = this.d;
        if (n2 <= 1 && (n2 != 1 || this.c[n2 - 1] == 7)) {
            this.d = 0;
            return;
        }
        throw new IOException("Incomplete document");
    }

    public c d(String string) {
        if (string == null) {
            return this.r();
        }
        c.super.w();
        c.super.t();
        c.super.e(string);
        return this;
    }

    public c d(boolean bl) {
        c.super.w();
        c.super.t();
        Writer writer = this.b;
        String string = bl ? "true" : "false";
        writer.write(string);
        return this;
    }

    public c f(long l2) {
        c.super.w();
        c.super.t();
        this.b.write(Long.toString((long)l2));
        return this;
    }

    public void flush() {
        if (this.d != 0) {
            this.b.flush();
            return;
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    public c m() {
        this.a(1, 2, ']');
        return this;
    }

    public c n() {
        this.a(3, 5, '}');
        return this;
    }

    public final boolean o() {
        return this.j;
    }

    public final boolean p() {
        return this.h;
    }

    public boolean q() {
        return this.g;
    }

    public c r() {
        if (this.i != null) {
            if (this.j) {
                this.w();
            } else {
                this.i = null;
                return this;
            }
        }
        this.t();
        this.b.write("null");
        return this;
    }
}

