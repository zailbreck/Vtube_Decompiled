/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package tv.danmaku.ijk.media.player.misc;

public interface IAndroidIO {
    public int close();

    public int open(String var1);

    public int read(byte[] var1, int var2);

    public long seek(long var1, int var3);
}

