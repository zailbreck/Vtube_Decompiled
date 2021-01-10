/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.io.StringWriter
 *  java.io.Writer
 *  java.lang.AssertionError
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package f.d.b;

import f.d.b.a0.c;
import f.d.b.i;
import f.d.b.n;
import f.d.b.o;
import f.d.b.q;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

public abstract class l {
    public i a() {
        if (this.d()) {
            return (i)this;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Not a JSON Array: ");
        stringBuilder.append((Object)this);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public o b() {
        if (this.f()) {
            return (o)this;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Not a JSON Object: ");
        stringBuilder.append((Object)this);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public q c() {
        if (this.g()) {
            return (q)this;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Not a JSON Primitive: ");
        stringBuilder.append((Object)this);
        throw new IllegalStateException(stringBuilder.toString());
    }

    public boolean d() {
        return this instanceof i;
    }

    public boolean e() {
        return this instanceof n;
    }

    public boolean f() {
        return this instanceof o;
    }

    public boolean g() {
        return this instanceof q;
    }

    public String toString() {
        try {
            StringWriter stringWriter = new StringWriter();
            c c2 = new c((Writer)stringWriter);
            c2.b(true);
            f.d.b.y.l.a(this, c2);
            String string = stringWriter.toString();
            return string;
        }
        catch (IOException iOException) {
            throw new AssertionError((Object)iOException);
        }
    }
}

