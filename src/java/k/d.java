/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.channels.WritableByteChannel
 *  k.r
 */
package k;

import java.nio.channels.WritableByteChannel;
import k.c;
import k.r;

public interface d
extends r,
WritableByteChannel {
    public d a(String var1);

    public c c();

    public d e(long var1);

    public void flush();

    public d l();

    public d write(byte[] var1);

    public d write(byte[] var1, int var2, int var3);

    public d writeByte(int var1);

    public d writeInt(int var1);

    public d writeShort(int var1);
}

