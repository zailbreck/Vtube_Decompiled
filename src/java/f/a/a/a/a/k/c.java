/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.a.a.a.a.j.b
 *  f.a.a.a.a.k.e
 *  f.a.a.a.a.k.f
 *  java.io.InputStream
 *  java.lang.Long
 */
package f.a.a.a.a.k;

import f.a.a.a.a.j.b;
import f.a.a.a.a.k.e;
import f.a.a.a.a.k.f;
import java.io.InputStream;

public class c
extends e {
    private long f;
    private InputStream g;

    public c() {
        new f();
    }

    public Long a() {
        InputStream inputStream = this.g;
        if (inputStream != null && inputStream instanceof b) {
            return ((b)inputStream).a();
        }
        return super.a();
    }

    public void a(long l2) {
        this.f = l2;
    }

    public void a(f f2) {
    }

    public void a(InputStream inputStream) {
        this.g = inputStream;
    }

    public long e() {
        return this.f;
    }

    public InputStream f() {
        return this.g;
    }
}

