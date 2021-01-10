/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.InputStream
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.channels.ReadableByteChannel
 *  java.nio.charset.Charset
 *  k.f
 *  k.s
 */
package k;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;
import k.c;
import k.f;
import k.s;

public interface e
extends s,
ReadableByteChannel {
    public long a(byte var1);

    public String a(Charset var1);

    public f a(long var1);

    public boolean a(long var1, f var3);

    public byte[] b(long var1);

    public String c(long var1);

    public c c();

    public void d(long var1);

    public InputStream e();

    public String f();

    public byte[] g();

    public int h();

    public boolean i();

    public short j();

    public long k();

    public byte readByte();

    public void readFully(byte[] var1);

    public int readInt();

    public short readShort();

    public void skip(long var1);
}

