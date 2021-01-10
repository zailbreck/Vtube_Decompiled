/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.EOFException
 *  java.io.IOException
 *  java.io.Writer
 *  java.lang.Appendable
 *  java.lang.CharSequence
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package f.d.b.y;

import f.d.b.a0.b;
import f.d.b.a0.c;
import f.d.b.a0.d;
import f.d.b.m;
import f.d.b.n;
import f.d.b.t;
import f.d.b.v;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

public final class l {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static f.d.b.l a(f.d.b.a0.a a2) {
        boolean bl;
        try {
            try {
                a2.A();
            }
            catch (EOFException eOFException) {
                bl = true;
            }
            try {
                return f.d.b.y.n.n.X.read(a2);
            }
            catch (EOFException eOFException) {
                bl = false;
            }
        }
        catch (NumberFormatException numberFormatException) {
            throw new t(numberFormatException);
        }
        catch (IOException iOException) {
            throw new m(iOException);
        }
        catch (d d2) {
            throw new t((Throwable)d2);
        }
        if (!bl) void var1_4;
        throw new t((Throwable)var1_4);
        return n.a;
    }

    public static Writer a(Appendable appendable) {
        if (appendable instanceof Writer) {
            return (Writer)appendable;
        }
        return new a(appendable);
    }

    public static void a(f.d.b.l l2, c c2) {
        f.d.b.y.n.n.X.write(c2, l2);
    }

    private static final class f.d.b.y.l$a
    extends Writer {
        private final Appendable b;
        private final a c = new a();

        f.d.b.y.l$a(Appendable appendable) {
            this.b = appendable;
        }

        public void close() {
        }

        public void flush() {
        }

        public void write(int n2) {
            this.b.append((char)n2);
        }

        public void write(char[] arrc, int n2, int n3) {
            a a2 = this.c;
            a2.b = arrc;
            this.b.append((CharSequence)a2, n2, n3 + n2);
        }

        static class a
        implements CharSequence {
            char[] b;

            a() {
            }

            public char charAt(int n2) {
                return this.b[n2];
            }

            public int length() {
                return this.b.length;
            }

            public CharSequence subSequence(int n2, int n3) {
                return new String(this.b, n2, n3 - n2);
            }
        }

    }

}

