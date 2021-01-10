/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.AssertionError
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.net.Socket
 *  java.util.logging.Logger
 */
package k;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.logging.Logger;
import k.d;
import k.e;
import k.l;
import k.m;
import k.n;
import k.r;
import k.s;
import k.t;

public final class l {
    static final Logger a = Logger.getLogger((String)l.class.getName());

    private l() {
    }

    public static d a(r r2) {
        return new m(r2);
    }

    public static e a(s s2) {
        return new n(s2);
    }

    private static r a(OutputStream outputStream, t t2) {
        if (outputStream != null) {
            if (t2 != null) {
                return new r(t2, outputStream){
                    final /* synthetic */ t b;
                    final /* synthetic */ OutputStream c;
                    {
                        this.b = t2;
                        this.c = outputStream;
                    }

                    public void b(k.c c2, long l2) {
                        k.u.a(c2.c, 0L, l2);
                        while (l2 > 0L) {
                            this.b.e();
                            k.o o2 = c2.b;
                            int n2 = (int)java.lang.Math.min((long)l2, (long)(o2.c - o2.b));
                            this.c.write(o2.a, o2.b, n2);
                            o2.b = n2 + o2.b;
                            long l3 = n2;
                            l2 -= l3;
                            c2.c -= l3;
                            if (o2.b != o2.c) continue;
                            c2.b = o2.b();
                            k.p.a(o2);
                        }
                    }

                    public void close() {
                        this.c.close();
                    }

                    public t d() {
                        return this.b;
                    }

                    public void flush() {
                        this.c.flush();
                    }

                    public String toString() {
                        java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
                        stringBuilder.append("sink(");
                        stringBuilder.append((Object)this.c);
                        stringBuilder.append(")");
                        return stringBuilder.toString();
                    }
                };
            }
            throw new IllegalArgumentException("timeout == null");
        }
        throw new IllegalArgumentException("out == null");
    }

    public static r a(Socket socket) {
        if (socket != null) {
            if (socket.getOutputStream() != null) {
                k.a a2 = l.c(socket);
                return a2.a(l.a(socket.getOutputStream(), (t)a2));
            }
            throw new IOException("socket's output stream == null");
        }
        throw new IllegalArgumentException("socket == null");
    }

    public static s a(InputStream inputStream) {
        return l.a(inputStream, new t());
    }

    private static s a(InputStream inputStream, t t2) {
        if (inputStream != null) {
            if (t2 != null) {
                return new s(t2, inputStream){
                    final /* synthetic */ t b;
                    final /* synthetic */ InputStream c;
                    {
                        this.b = t2;
                        this.c = inputStream;
                    }

                    public long a(k.c c2, long l2) {
                        if (l2 >= 0L) {
                            k.o o2;
                            int n2;
                            block7 : {
                                if (l2 == 0L) {
                                    return 0L;
                                }
                                try {
                                    this.b.e();
                                    o2 = c2.b(1);
                                    int n3 = (int)java.lang.Math.min((long)l2, (long)(8192 - o2.c));
                                    n2 = this.c.read(o2.a, o2.c, n3);
                                    if (n2 != -1) break block7;
                                    return -1L;
                                }
                                catch (AssertionError assertionError) {
                                    if (l.a(assertionError)) {
                                        throw new IOException((Throwable)assertionError);
                                    }
                                    throw assertionError;
                                }
                            }
                            o2.c = n2 + o2.c;
                            long l3 = c2.c;
                            long l4 = n2;
                            c2.c = l3 + l4;
                            return l4;
                        }
                        java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
                        stringBuilder.append("byteCount < 0: ");
                        stringBuilder.append(l2);
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }

                    public void close() {
                        this.c.close();
                    }

                    public t d() {
                        return this.b;
                    }

                    public String toString() {
                        java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
                        stringBuilder.append("source(");
                        stringBuilder.append((Object)this.c);
                        stringBuilder.append(")");
                        return stringBuilder.toString();
                    }
                };
            }
            throw new IllegalArgumentException("timeout == null");
        }
        throw new IllegalArgumentException("in == null");
    }

    static boolean a(AssertionError assertionError) {
        return assertionError.getCause() != null && assertionError.getMessage() != null && assertionError.getMessage().contains((CharSequence)"getsockname failed");
    }

    public static s b(Socket socket) {
        if (socket != null) {
            if (socket.getInputStream() != null) {
                k.a a2 = l.c(socket);
                return a2.a(l.a(socket.getInputStream(), (t)a2));
            }
            throw new IOException("socket's input stream == null");
        }
        throw new IllegalArgumentException("socket == null");
    }

    private static k.a c(Socket socket) {
        return new k.a(socket){
            final /* synthetic */ Socket k;
            {
                this.k = socket;
            }

            protected IOException b(IOException iOException) {
                java.net.SocketTimeoutException socketTimeoutException = new java.net.SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException.initCause((Throwable)iOException);
                }
                return socketTimeoutException;
            }

            protected void i() {
                Logger logger;
                void var1_3;
                java.util.logging.Level level;
                java.lang.StringBuilder stringBuilder;
                try {
                    this.k.close();
                    return;
                }
                catch (AssertionError assertionError) {
                    if (l.a(assertionError)) {
                        logger = l.a;
                        level = java.util.logging.Level.WARNING;
                        stringBuilder = new java.lang.StringBuilder();
                    }
                    throw assertionError;
                }
                catch (java.lang.Exception exception) {
                    logger = l.a;
                    level = java.util.logging.Level.WARNING;
                    stringBuilder = new java.lang.StringBuilder();
                }
                stringBuilder.append("Failed to close timed out socket ");
                stringBuilder.append((Object)this.k);
                logger.log(level, stringBuilder.toString(), (Throwable)var1_3);
            }
        };
    }
}

