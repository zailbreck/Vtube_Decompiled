/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package tv.danmaku.ijk.media.player.misc;

public interface IMediaDataSource {
    public void close();

    public long getSize();

    public int readAt(long var1, byte[] var3, int var4, int var5);
}

