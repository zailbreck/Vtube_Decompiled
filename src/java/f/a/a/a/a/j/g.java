/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.InterruptedIOException
 *  java.lang.Boolean
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.SocketTimeoutException
 */
package f.a.a.a.a.j;

import f.a.a.a.a.b;
import f.a.a.a.a.f;
import f.a.a.a.a.h.d;
import f.a.a.a.a.j.h;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;

public class g {
    private int a = 2;

    public g(int n2) {
        this.a(n2);
    }

    public long a(int n2, h h2) {
        if (a.a[h2.ordinal()] != 1) {
            return 0L;
        }
        return 200L * (long)Math.pow((double)2.0, (double)n2);
    }

    public h a(Exception exception, int n2) {
        if (n2 >= this.a) {
            return h.b;
        }
        if (exception instanceof b) {
            if (((b)exception).a().booleanValue()) {
                return h.b;
            }
            Exception exception2 = (Exception)exception.getCause();
            if (exception2 instanceof InterruptedIOException && !(exception2 instanceof SocketTimeoutException)) {
                d.b("[shouldRetry] - is interrupted!");
                return h.b;
            }
            if (exception2 instanceof IllegalArgumentException) {
                return h.b;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("shouldRetry - ");
            stringBuilder.append(exception.toString());
            d.a(stringBuilder.toString());
            exception.getCause().printStackTrace();
            return h.c;
        }
        if (exception instanceof f) {
            f f2 = (f)exception;
            if (f2.a() != null && f2.a().equalsIgnoreCase("RequestTimeTooSkewed")) {
                return h.d;
            }
            if (f2.e() >= 500) {
                return h.c;
            }
            return h.b;
        }
        return h.b;
    }

    public void a(int n2) {
        this.a = n2;
    }

}

