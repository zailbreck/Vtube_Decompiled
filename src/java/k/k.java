/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.EOFException
 *  java.io.IOException
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.zip.DataFormatException
 *  java.util.zip.Inflater
 *  k.o
 *  k.p
 *  k.s
 *  k.t
 */
package k;

import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import k.c;
import k.e;
import k.o;
import k.p;
import k.s;
import k.t;

public final class k
implements s {
    private final e b;
    private final Inflater c;
    private int d;
    private boolean e;

    k(e e2, Inflater inflater) {
        if (e2 != null) {
            if (inflater != null) {
                this.b = e2;
                this.c = inflater;
                return;
            }
            throw new IllegalArgumentException("inflater == null");
        }
        throw new IllegalArgumentException("source == null");
    }

    private void b() {
        int n2 = this.d;
        if (n2 == 0) {
            return;
        }
        int n3 = n2 - this.c.getRemaining();
        this.d -= n3;
        this.b.skip(n3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public long a(c c2, long l2) {
        if (l2 < 0L) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("byteCount < 0: ");
            stringBuilder.append(l2);
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
            throw illegalArgumentException;
        }
        if (this.e) throw new IllegalStateException("closed");
        if (l2 == 0L) {
            return 0L;
        }
        do {
            boolean bl = this.a();
            try {
                o o2 = c2.b(1);
                int n2 = (int)Math.min((long)l2, (long)(8192 - o2.c));
                int n3 = this.c.inflate(o2.a, o2.c, n2);
                if (n3 > 0) {
                    o2.c = n3 + o2.c;
                    long l3 = c2.c;
                    long l4 = n3;
                    c2.c = l3 + l4;
                    return l4;
                }
                if (this.c.finished() || this.c.needsDictionary()) {
                    k.super.b();
                    if (o2.b != o2.c) return -1L;
                    c2.b = o2.b();
                    p.a((o)o2);
                    return -1L;
                }
            }
            catch (DataFormatException dataFormatException) {
                throw new IOException((Throwable)dataFormatException);
            }
            if (bl) throw new EOFException("source exhausted prematurely");
        } while (true);
    }

    public boolean a() {
        if (!this.c.needsInput()) {
            return false;
        }
        this.b();
        if (this.c.getRemaining() == 0) {
            if (this.b.i()) {
                return true;
            }
            o o2 = this.b.c().b;
            int n2 = o2.c;
            int n3 = o2.b;
            this.d = n2 - n3;
            this.c.setInput(o2.a, n3, this.d);
            return false;
        }
        throw new IllegalStateException("?");
    }

    public void close() {
        if (this.e) {
            return;
        }
        this.c.end();
        this.e = true;
        this.b.close();
    }

    public t d() {
        return this.b.d();
    }
}

