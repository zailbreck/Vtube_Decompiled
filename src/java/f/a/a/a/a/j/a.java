/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.a.a.a.a.h.d
 *  f.a.a.a.a.h.g.c
 *  f.a.a.a.a.j.k
 *  f.a.a.a.a.k.e
 *  j.a0
 *  j.r
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.ParameterizedType
 *  java.lang.reflect.Type
 *  java.math.BigInteger
 *  java.util.Map
 *  java.util.zip.CheckedInputStream
 *  java.util.zip.Checksum
 */
package f.a.a.a.a.j;

import f.a.a.a.a.h.d;
import f.a.a.a.a.h.g.c;
import f.a.a.a.a.j.i;
import f.a.a.a.a.j.j;
import f.a.a.a.a.j.k;
import f.a.a.a.a.k.e;
import j.a0;
import j.r;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.math.BigInteger;
import java.util.Map;
import java.util.zip.CheckedInputStream;
import java.util.zip.Checksum;

public abstract class a<T extends e>
implements k {
    private c<String, String> a(a0 a02) {
        c c2 = new c();
        r r2 = a02.o();
        for (int i2 = 0; i2 < r2.b(); ++i2) {
            c2.put((Object)r2.a(i2), (Object)r2.b(i2));
        }
        return c2;
    }

    public static void b(j j2) {
        try {
            j2.a();
        }
        catch (Exception exception) {}
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public T a(j j2) {
        e e2;
        Throwable throwable2222;
        block4 : {
            e2 = (e)((Class)((ParameterizedType)this.getClass().getGenericSuperclass()).getActualTypeArguments()[0]).newInstance();
            if (e2 == null) break block4;
            e2.a((String)j2.d().get((Object)"x-oss-request-id"));
            e2.a(j2.h());
            e2.a(a.super.a(j2.g()));
            this.a((Result)e2, j2);
            e2 = this.a(j2, (T)e2);
        }
        if (!this.a()) return (T)e2;
        a.b(j2);
        return (T)e2;
        {
            catch (Throwable throwable2222) {
            }
            catch (Exception exception) {}
            {
                IOException iOException = new IOException(exception.getMessage(), (Throwable)exception);
                exception.printStackTrace();
                d.a((Throwable)exception);
                throw iOException;
            }
        }
        if (!this.a()) throw throwable2222;
        a.b(j2);
        throw throwable2222;
    }

    abstract T a(j var1, T var2);

    public <Result extends e> void a(Result Result, j j2) {
        String string;
        InputStream inputStream = j2.f().b();
        if (inputStream != null && inputStream instanceof CheckedInputStream) {
            Result.a(Long.valueOf((long)((CheckedInputStream)inputStream).getChecksum().getValue()));
        }
        if ((string = (String)j2.d().get((Object)"x-oss-hash-crc64ecma")) != null) {
            Result.b(Long.valueOf((long)new BigInteger(string).longValue()));
        }
    }

    public boolean a() {
        return true;
    }
}

