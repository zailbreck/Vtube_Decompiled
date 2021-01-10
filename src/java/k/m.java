/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalStateException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.nio.ByteBuffer
 *  k.r
 *  k.t
 *  k.u
 */
package k;

import java.nio.ByteBuffer;
import k.c;
import k.d;
import k.r;
import k.t;
import k.u;

final class m
implements d {
    public final c b = new c();
    public final r c;
    boolean d;

    m(r r2) {
        if (r2 != null) {
            this.c = r2;
            return;
        }
        throw new NullPointerException("sink == null");
    }

    @Override
    public d a(String string) {
        if (!this.d) {
            this.b.a(string);
            this.l();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public void b(c c2, long l2) {
        if (!this.d) {
            this.b.b(c2, l2);
            this.l();
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override
    public c c() {
        return this.b;
    }

    public void close() {
        Throwable throwable;
        block7 : {
            if (this.d) {
                return;
            }
            try {
                if (this.b.c > 0L) {
                    this.c.b(this.b, this.b.c);
                }
                throwable = null;
            }
            catch (Throwable throwable2) {
                // empty catch block
            }
            try {
                this.c.close();
            }
            catch (Throwable throwable3) {
                if (throwable != null) break block7;
                throwable = throwable3;
            }
        }
        this.d = true;
        if (throwable == null) {
            return;
        }
        u.a((Throwable)throwable);
        throw null;
    }

    public t d() {
        return this.c.d();
    }

    @Override
    public d e(long l2) {
        if (!this.d) {
            this.b.e(l2);
            return this.l();
        }
        throw new IllegalStateException("closed");
    }

    @Override
    public void flush() {
        if (!this.d) {
            c c2 = this.b;
            long l2 = c2.c;
            if (l2 > 0L) {
                this.c.b(c2, l2);
            }
            this.c.flush();
            return;
        }
        throw new IllegalStateException("closed");
    }

    public boolean isOpen() {
        return true ^ this.d;
    }

    @Override
    public d l() {
        if (!this.d) {
            long l2 = this.b.b();
            if (l2 > 0L) {
                this.c.b(this.b, l2);
            }
            return this;
        }
        throw new IllegalStateException("closed");
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("buffer(");
        stringBuilder.append((Object)this.c);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public int write(ByteBuffer byteBuffer) {
        if (!this.d) {
            int n2 = this.b.write(byteBuffer);
            this.l();
            return n2;
        }
        throw new IllegalStateException("closed");
    }

    @Override
    public d write(byte[] arrby) {
        if (!this.d) {
            this.b.write(arrby);
            this.l();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override
    public d write(byte[] arrby, int n2, int n3) {
        if (!this.d) {
            this.b.write(arrby, n2, n3);
            this.l();
            return this;
        }
        throw new IllegalStateException("closed");
    }

    @Override
    public d writeByte(int n2) {
        if (!this.d) {
            this.b.writeByte(n2);
            return this.l();
        }
        throw new IllegalStateException("closed");
    }

    @Override
    public d writeInt(int n2) {
        if (!this.d) {
            this.b.writeInt(n2);
            return this.l();
        }
        throw new IllegalStateException("closed");
    }

    @Override
    public d writeShort(int n2) {
        if (!this.d) {
            this.b.writeShort(n2);
            this.l();
            return this;
        }
        throw new IllegalStateException("closed");
    }
}

