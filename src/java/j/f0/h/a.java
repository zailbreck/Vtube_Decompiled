/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  j.a0
 *  j.a0$a
 *  j.b0
 *  j.c0
 *  j.e
 *  j.f0.a
 *  j.f0.c
 *  j.f0.f.g
 *  j.f0.g.c
 *  j.f0.g.e
 *  j.f0.g.i
 *  j.f0.g.k
 *  j.f0.h.a$a
 *  j.m
 *  j.p
 *  j.r
 *  j.r$a
 *  j.s
 *  j.w
 *  j.y
 *  java.io.EOFException
 *  java.io.IOException
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.ProtocolException
 *  java.net.Proxy
 *  java.net.Proxy$Type
 *  java.util.concurrent.TimeUnit
 *  k.l
 *  k.r
 *  k.s
 *  k.t
 */
package j.f0.h;

import j.a0;
import j.b0;
import j.c0;
import j.f0.g.h;
import j.f0.g.k;
import j.f0.h.a;
import j.m;
import j.p;
import j.r;
import j.s;
import j.v;
import j.w;
import j.y;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import k.i;
import k.l;
import k.t;

public final class a
implements j.f0.g.c {
    final v a;
    final j.f0.f.g b;
    final k.e c;
    final k.d d;
    int e = 0;
    private long f = 262144L;

    public a(v v2, j.f0.f.g g2, k.e e2, k.d d2) {
        this.a = v2;
        this.b = g2;
        this.c = e2;
        this.d = d2;
    }

    private String f() {
        String string = this.c.c(this.f);
        this.f -= (long)string.length();
        return string;
    }

    public a0.a a(boolean bl) {
        a0.a a2;
        block7 : {
            k k2;
            block6 : {
                int n2 = this.e;
                if (n2 != 1 && n2 != 3) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("state: ");
                    stringBuilder.append(this.e);
                    throw new IllegalStateException(stringBuilder.toString());
                }
                try {
                    k2 = k.a((String)a.super.f());
                    a2 = new a0.a();
                    a2.a(k2.a);
                    a2.a(k2.b);
                    a2.a(k2.c);
                    a2.a(this.e());
                    if (!bl) break block6;
                }
                catch (EOFException eOFException) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("unexpected end of stream on ");
                    stringBuilder.append((Object)this.b);
                    IOException iOException = new IOException(stringBuilder.toString());
                    iOException.initCause((Throwable)eOFException);
                    throw iOException;
                }
                if (k2.b != 100) break block6;
                return null;
            }
            if (k2.b != 100) break block7;
            this.e = 3;
            return a2;
        }
        this.e = 4;
        return a2;
    }

    public b0 a(a0 a02) {
        j.f0.f.g g2 = this.b;
        g2.f.e(g2.e);
        String string = a02.b("Content-Type");
        if (!j.f0.g.e.b((a0)a02)) {
            return new h(string, 0L, l.a((k.s)this.b(0L)));
        }
        if ("chunked".equalsIgnoreCase(a02.b("Transfer-Encoding"))) {
            return new h(string, -1L, l.a((k.s)this.a(a02.s().g())));
        }
        long l2 = j.f0.g.e.a((a0)a02);
        if (l2 != -1L) {
            return new h(string, l2, l.a((k.s)this.b(l2)));
        }
        return new h(string, -1L, l.a((k.s)this.d()));
    }

    public k.r a(long l2) {
        if (this.e == 1) {
            this.e = 2;
            return (a)this.new e(l2);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("state: ");
        stringBuilder.append(this.e);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public k.r a(y y2, long l2) {
        if ("chunked".equalsIgnoreCase(y2.a("Transfer-Encoding"))) {
            return this.c();
        }
        if (l2 != -1L) {
            return this.a(l2);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    public k.s a(s s2) {
        if (this.e == 4) {
            this.e = 5;
            return (a)this.new d(s2);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("state: ");
        stringBuilder.append(this.e);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void a() {
        this.d.flush();
    }

    public void a(r r2, String string) {
        IllegalStateException illegalStateException;
        if (this.e == 0) {
            this.d.a(string).a("\r\n");
            int n2 = r2.b();
            for (int i2 = 0; i2 < n2; ++i2) {
                this.d.a(r2.a(i2)).a(": ").a(r2.b(i2)).a("\r\n");
            }
            this.d.a("\r\n");
            this.e = 1;
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("state: ");
        stringBuilder.append(this.e);
        illegalStateException = new IllegalStateException(stringBuilder.toString());
        throw illegalStateException;
    }

    public void a(y y2) {
        String string = j.f0.g.i.a((y)y2, (Proxy.Type)this.b.b().c().b().type());
        this.a(y2.c(), string);
    }

    void a(i i2) {
        t t2 = i2.g();
        i2.a(t.d);
        t2.a();
        t2.b();
    }

    public k.s b(long l2) {
        if (this.e == 4) {
            this.e = 5;
            return new f((a)this, l2);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("state: ");
        stringBuilder.append(this.e);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public void b() {
        this.d.flush();
    }

    public k.r c() {
        if (this.e == 1) {
            this.e = 2;
            return new c();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("state: ");
        stringBuilder.append(this.e);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public k.s d() {
        if (this.e == 4) {
            j.f0.f.g g2 = this.b;
            if (g2 != null) {
                this.e = 5;
                g2.d();
                return new g(this);
            }
            throw new IllegalStateException("streamAllocation == null");
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("state: ");
        stringBuilder.append(this.e);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public r e() {
        String string;
        r.a a2 = new r.a();
        while ((string = this.f()).length() != 0) {
            j.f0.a.a.a(a2, string);
        }
        return a2.a();
    }

    private abstract class b
    implements k.s {
        protected final i b;
        protected boolean c;
        protected long d;
        final /* synthetic */ a e;

        private b(a a2) {
            this.e = a2;
            this.b = new i(this.e.c.d());
            this.d = 0L;
        }

        /* synthetic */ b(a a2, a a3) {
            super(a2);
        }

        public long a(k.c c2, long l2) {
            long l3;
            block3 : {
                try {
                    l3 = this.e.c.a(c2, l2);
                    if (l3 <= 0L) break block3;
                }
                catch (IOException iOException) {
                    this.a(false, iOException);
                    throw iOException;
                }
                this.d = l3 + this.d;
            }
            return l3;
        }

        protected final void a(boolean bl, IOException iOException) {
            a a2 = this.e;
            int n2 = a2.e;
            if (n2 == 6) {
                return;
            }
            if (n2 == 5) {
                a2.a(this.b);
                a a3 = this.e;
                a3.e = 6;
                j.f0.f.g g2 = a3.b;
                if (g2 != null) {
                    g2.a(bl ^ true, (j.f0.g.c)a3, this.d, iOException);
                }
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("state: ");
            stringBuilder.append(this.e.e);
            throw new IllegalStateException(stringBuilder.toString());
        }

        public t d() {
            return this.b;
        }
    }

    private final class c
    implements k.r {
        private final i b;
        private boolean c;

        c() {
            this.b = new i(a.this.d.d());
        }

        public void b(k.c c2, long l2) {
            if (!this.c) {
                if (l2 == 0L) {
                    return;
                }
                a.this.d.e(l2);
                a.this.d.a("\r\n");
                a.this.d.b(c2, l2);
                a.this.d.a("\r\n");
                return;
            }
            throw new IllegalStateException("closed");
        }

        public void close() {
            c c2 = this;
            synchronized (c2) {
                block4 : {
                    boolean bl = this.c;
                    if (!bl) break block4;
                    return;
                }
                this.c = true;
                a.this.d.a("0\r\n\r\n");
                a.this.a(this.b);
                a.this.e = 3;
                return;
            }
        }

        public t d() {
            return this.b;
        }

        public void flush() {
            c c2 = this;
            synchronized (c2) {
                block4 : {
                    boolean bl = this.c;
                    if (!bl) break block4;
                    return;
                }
                a.this.d.flush();
                return;
            }
        }
    }

    private class d
    extends b {
        private final s f;
        private long g;
        private boolean h;

        d(s s2) {
            super(a.this, null);
            this.g = -1L;
            this.h = true;
            this.f = s2;
        }

        private void a() {
            String string;
            block4 : {
                block5 : {
                    if (this.g != -1L) {
                        a.this.c.f();
                    }
                    try {
                        boolean bl;
                        this.g = a.this.c.k();
                        string = a.this.c.f().trim();
                        if (this.g < 0L || !string.isEmpty() && !(bl = string.startsWith(";"))) break block4;
                        if (this.g != 0L) break block5;
                    }
                    catch (NumberFormatException numberFormatException) {
                        throw new ProtocolException(numberFormatException.getMessage());
                    }
                    this.h = false;
                    j.f0.g.e.a((m)a.this.a.f(), (s)this.f, (r)a.this.e());
                    this.a(true, null);
                }
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("expected chunk size and optional extensions but was \"");
            stringBuilder.append(this.g);
            stringBuilder.append(string);
            stringBuilder.append("\"");
            throw new ProtocolException(stringBuilder.toString());
        }

        @Override
        public long a(k.c c2, long l2) {
            if (l2 >= 0L) {
                if (!this.c) {
                    long l3;
                    if (!this.h) {
                        return -1L;
                    }
                    long l4 = this.g;
                    if (l4 == 0L || l4 == -1L) {
                        d.super.a();
                        if (!this.h) {
                            return -1L;
                        }
                    }
                    if ((l3 = super.a(c2, Math.min((long)l2, (long)this.g))) != -1L) {
                        this.g -= l3;
                        return l3;
                    }
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    this.a(false, (IOException)protocolException);
                    throw protocolException;
                }
                throw new IllegalStateException("closed");
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("byteCount < 0: ");
            stringBuilder.append(l2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public void close() {
            if (this.c) {
                return;
            }
            if (this.h && !j.f0.c.a((k.s)this, (int)100, (TimeUnit)TimeUnit.MILLISECONDS)) {
                this.a(false, null);
            }
            this.c = true;
        }
    }

    private final class e
    implements k.r {
        private final i b;
        private boolean c;
        private long d;

        e(long l2) {
            this.b = new i(a.this.d.d());
            this.d = l2;
        }

        public void b(k.c c2, long l2) {
            if (!this.c) {
                j.f0.c.a((long)c2.p(), (long)0L, (long)l2);
                if (l2 <= this.d) {
                    a.this.d.b(c2, l2);
                    this.d -= l2;
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("expected ");
                stringBuilder.append(this.d);
                stringBuilder.append(" bytes but received ");
                stringBuilder.append(l2);
                throw new ProtocolException(stringBuilder.toString());
            }
            throw new IllegalStateException("closed");
        }

        public void close() {
            if (this.c) {
                return;
            }
            this.c = true;
            if (this.d <= 0L) {
                a.this.a(this.b);
                a.this.e = 3;
                return;
            }
            throw new ProtocolException("unexpected end of stream");
        }

        public t d() {
            return this.b;
        }

        public void flush() {
            if (this.c) {
                return;
            }
            a.this.d.flush();
        }
    }

    private class f
    extends b {
        private long f;

        f(a a2, long l2) {
            super(a2, null);
            this.f = l2;
            if (this.f == 0L) {
                this.a(true, null);
            }
        }

        @Override
        public long a(k.c c2, long l2) {
            if (l2 >= 0L) {
                if (!this.c) {
                    long l3 = this.f;
                    if (l3 == 0L) {
                        return -1L;
                    }
                    long l4 = super.a(c2, Math.min((long)l3, (long)l2));
                    if (l4 != -1L) {
                        this.f -= l4;
                        if (this.f == 0L) {
                            this.a(true, null);
                        }
                        return l4;
                    }
                    ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                    this.a(false, (IOException)protocolException);
                    throw protocolException;
                }
                throw new IllegalStateException("closed");
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("byteCount < 0: ");
            stringBuilder.append(l2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public void close() {
            if (this.c) {
                return;
            }
            if (this.f != 0L && !j.f0.c.a((k.s)this, (int)100, (TimeUnit)TimeUnit.MILLISECONDS)) {
                this.a(false, null);
            }
            this.c = true;
        }
    }

    private class g
    extends b {
        private boolean f;

        g(a a2) {
            super(a2, null);
        }

        @Override
        public long a(k.c c2, long l2) {
            if (l2 >= 0L) {
                if (!this.c) {
                    if (this.f) {
                        return -1L;
                    }
                    long l3 = super.a(c2, l2);
                    if (l3 == -1L) {
                        this.f = true;
                        this.a(true, null);
                        return -1L;
                    }
                    return l3;
                }
                throw new IllegalStateException("closed");
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("byteCount < 0: ");
            stringBuilder.append(l2);
            throw new IllegalArgumentException(stringBuilder.toString());
        }

        public void close() {
            if (this.c) {
                return;
            }
            if (!this.f) {
                this.a(false, null);
            }
            this.c = true;
        }
    }

}

