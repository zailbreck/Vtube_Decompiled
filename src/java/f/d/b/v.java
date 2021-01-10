/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.io.Reader
 *  java.io.StringReader
 *  java.io.StringWriter
 *  java.io.Writer
 *  java.lang.AssertionError
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package f.d.b;

import f.d.b.a0.c;
import f.d.b.l;
import f.d.b.m;
import f.d.b.v;
import f.d.b.y.n.e;
import f.d.b.y.n.f;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;

public abstract class v<T> {
    public final T fromJson(Reader reader) {
        return this.read(new f.d.b.a0.a(reader));
    }

    public final T fromJson(String string) {
        return this.fromJson((Reader)new StringReader(string));
    }

    public final T fromJsonTree(l l2) {
        T t2;
        try {
            t2 = this.read(new e(l2));
        }
        catch (IOException iOException) {
            throw new m(iOException);
        }
        return t2;
    }

    public final v<T> nullSafe() {
        return new v<T>(this){
            final /* synthetic */ v a;
            {
                this.a = v2;
            }

            public T read(f.d.b.a0.a a2) {
                if (a2.A() == f.d.b.a0.b.j) {
                    a2.y();
                    return null;
                }
                return this.a.read(a2);
            }

            public void write(c c2, T t2) {
                if (t2 == null) {
                    c2.r();
                    return;
                }
                this.a.write(c2, t2);
            }
        };
    }

    public abstract T read(f.d.b.a0.a var1);

    public final String toJson(T t2) {
        StringWriter stringWriter = new StringWriter();
        try {
            this.toJson((Writer)stringWriter, t2);
        }
        catch (IOException iOException) {
            throw new AssertionError((Object)((Object)iOException));
        }
        return stringWriter.toString();
    }

    public final void toJson(Writer writer, T t2) {
        this.write(new c(writer), t2);
    }

    public final l toJsonTree(T t2) {
        try {
            f f2 = new f();
            this.write(f2, t2);
            l l2 = f2.s();
            return l2;
        }
        catch (IOException iOException) {
            throw new m(iOException);
        }
    }

    public abstract void write(c var1, T var2);
}

