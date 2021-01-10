/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.io.InterruptedIOException
 *  java.lang.AssertionError
 *  java.lang.Class
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.concurrent.TimeUnit
 *  k.a$c
 *  k.o
 *  k.r
 *  k.s
 *  k.t
 *  k.u
 */
package k;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import k.a;
import k.o;
import k.r;
import k.s;
import k.t;
import k.u;

/*
 * Exception performing whole class analysis.
 */
public class a
extends t {
    private static final long h;
    private static final long i;
    static a j;
    private boolean e;
    private a f;
    private long g;

    static {
        h = TimeUnit.SECONDS.toMillis(60L);
        i = TimeUnit.MILLISECONDS.toNanos(h);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private static void a(a var0_1, long var1, boolean var3_2) {
        block8 : {
            var10_3 = a.class;
            // MONITORENTER : k.a.class
            if (a.j == null) {
                a.j = new a();
                new /* Unavailable Anonymous Inner Class!! */.start();
            }
            var5_4 = System.nanoTime();
            if (var1 == 0L || !var3_2) break block8;
            var1 = Math.min((long)var1, (long)(var0_1.c() - var5_4));
            ** GOTO lbl-1000
        }
        if (var1 != 0L) lbl-1000: // 2 sources:
        {
            var0_1.g = var1 + var5_4;
        } else {
            if (var3_2 == false) throw new AssertionError();
            var0_1.g = var0_1.c();
        }
        var7_5 = var0_1.b(var5_4);
        var9_6 = a.j;
        while (var9_6.f != null && var7_5 >= var9_6.f.b(var5_4)) {
            var9_6 = var9_6.f;
        }
        var0_1.f = var9_6.f;
        var9_6.f = var0_1;
        if (var9_6 == a.j) {
            a.class.notify();
        }
        // MONITOREXIT : var10_3
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean a(a a2) {
        Class<a> class_ = a.class;
        synchronized (a.class) {
            a a3 = j;
            while (a3 != null) {
                block6 : {
                    if (a3.f != a2) break block6;
                    a3.f = a2.f;
                    a2.f = null;
                    return false;
                }
                a3 = a3.f;
            }
            return true;
        }
    }

    private long b(long l2) {
        return this.g - l2;
    }

    static a j() {
        a a2 = a.j.f;
        long l2 = System.nanoTime();
        if (a2 == null) {
            a.class.wait(h);
            a a3 = a.j.f;
            a a4 = null;
            if (a3 == null) {
                long l3 = System.nanoTime() - l2 LCMP i;
                a4 = null;
                if (l3 >= 0) {
                    a4 = j;
                }
            }
            return a4;
        }
        long l4 = a2.b(l2);
        if (l4 > 0L) {
            long l5 = l4 / 1000000L;
            a.class.wait(l5, (int)(l4 - 1000000L * l5));
            return null;
        }
        a.j.f = a2.f;
        a2.f = null;
        return a2;
    }

    final IOException a(IOException iOException) {
        if (!this.h()) {
            return iOException;
        }
        return this.b(iOException);
    }

    public final r a(final r r2) {
        return new r(){

            /*
             * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
             * Loose catch block
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Lifted jumps to return sites
             */
            public void b(k.c c2, long l2) {
                Throwable throwable2222;
                long l3;
                u.a((long)c2.c, (long)0L, (long)l2);
                while (l2 > (l3 = 0L)) {
                    o o2 = c2.b;
                    while (l3 < 65536L) {
                        if ((l3 += (long)(o2.c - o2.b)) >= l2) {
                            l3 = l2;
                            break;
                        }
                        o2 = o2.f;
                    }
                    a.this.g();
                    r2.b(c2, l3);
                    l2 -= l3;
                    a.this.a(true);
                }
                return;
                {
                    catch (Throwable throwable2222) {
                    }
                    catch (IOException iOException) {}
                    {
                        throw a.this.a(iOException);
                    }
                }
                a.this.a(false);
                throw throwable2222;
            }

            /*
             * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
             * Loose catch block
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Lifted jumps to return sites
             */
            public void close() {
                Throwable throwable2222;
                a.this.g();
                r2.close();
                a.this.a(true);
                return;
                {
                    catch (Throwable throwable2222) {
                    }
                    catch (IOException iOException) {}
                    {
                        throw a.this.a(iOException);
                    }
                }
                a.this.a(false);
                throw throwable2222;
            }

            public t d() {
                return a.this;
            }

            /*
             * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
             * Loose catch block
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Lifted jumps to return sites
             */
            public void flush() {
                Throwable throwable2222;
                a.this.g();
                r2.flush();
                a.this.a(true);
                return;
                {
                    catch (Throwable throwable2222) {
                    }
                    catch (IOException iOException) {}
                    {
                        throw a.this.a(iOException);
                    }
                }
                a.this.a(false);
                throw throwable2222;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("AsyncTimeout.sink(");
                stringBuilder.append((Object)r2);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        };
    }

    public final s a(final s s2) {
        return new s(){

            /*
             * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
             * Loose catch block
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Lifted jumps to return sites
             */
            public long a(k.c c2, long l2) {
                Throwable throwable2222;
                a.this.g();
                long l3 = s2.a(c2, l2);
                a.this.a(true);
                return l3;
                {
                    catch (Throwable throwable2222) {
                    }
                    catch (IOException iOException) {}
                    {
                        throw a.this.a(iOException);
                    }
                }
                a.this.a(false);
                throw throwable2222;
            }

            /*
             * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
             * Loose catch block
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Lifted jumps to return sites
             */
            public void close() {
                Throwable throwable2222;
                s2.close();
                a.this.a(true);
                return;
                {
                    catch (Throwable throwable2222) {
                    }
                    catch (IOException iOException) {}
                    {
                        throw a.this.a(iOException);
                    }
                }
                a.this.a(false);
                throw throwable2222;
            }

            public t d() {
                return a.this;
            }

            public String toString() {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("AsyncTimeout.source(");
                stringBuilder.append((Object)s2);
                stringBuilder.append(")");
                return stringBuilder.toString();
            }
        };
    }

    final void a(boolean bl) {
        if (this.h()) {
            if (!bl) {
                return;
            }
            throw this.b(null);
        }
    }

    protected IOException b(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause((Throwable)iOException);
        }
        return interruptedIOException;
    }

    public final void g() {
        if (!this.e) {
            long l2 = this.f();
            boolean bl = this.d();
            if (l2 == 0L && !bl) {
                return;
            }
            this.e = true;
            a.a(this, l2, bl);
            return;
        }
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    public final boolean h() {
        if (!this.e) {
            return false;
        }
        this.e = false;
        return a.a(this);
    }

    protected void i() {
    }

}

