/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.f.a.q.b.d
 *  f.f.a.q.b.i
 *  java.io.InputStream
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.channels.ReadableByteChannel
 *  java.nio.charset.Charset
 */
package f.f.a.q.b;

import f.f.a.q.b.d;
import f.f.a.q.b.i;
import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

public interface c
extends i,
ReadableByteChannel {
    public String a(Charset var1);

    public boolean a(long var1, d var3);

    public InputStream e();

    public void skip(long var1);
}

