/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.InputStream
 *  java.lang.String
 *  java.util.zip.CheckedInputStream
 *  java.util.zip.Checksum
 */
package f.a.a.a.a.j;

import f.a.a.a.a.h.g.h;
import java.io.InputStream;
import java.util.zip.CheckedInputStream;
import java.util.zip.Checksum;

public class b
extends CheckedInputStream {
    private long b;
    private long c;
    private long d;
    private String e;
    private long f;

    public b(InputStream inputStream, Checksum checksum, long l2, long l3, String string) {
        super(inputStream, checksum);
        this.c = l2;
        this.d = l3;
        this.e = string;
    }

    private void a(int n2) {
        this.b += (long)n2;
        if (this.b >= this.c) {
            this.f = this.getChecksum().getValue();
            h.a(this.f, this.d, this.e);
        }
    }

    public long a() {
        return this.f;
    }

    public int read() {
        int n2 = super.read();
        this.a(n2);
        return n2;
    }

    public int read(byte[] arrby, int n2, int n3) {
        int n4 = super.read(arrby, n2, n3);
        b.super.a(n4);
        return n4;
    }
}

