/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.InputStream
 *  java.lang.Object
 *  tv.danmaku.ijk.media.player.misc.IMediaDataSource
 */
package tv.danmaku.ijk.media.player.misc;

import java.io.InputStream;
import tv.danmaku.ijk.media.player.misc.IMediaDataSource;

public class StreamDataSource
implements IMediaDataSource {
    public InputStream mIs;
    public long mPosition = 0L;

    public StreamDataSource(InputStream inputStream) {
        this.mIs = inputStream;
    }

    public void close() {
        InputStream inputStream = this.mIs;
        if (inputStream != null) {
            inputStream.close();
        }
        this.mIs = null;
    }

    public long getSize() {
        return this.mIs.available();
    }

    public int readAt(long l2, byte[] arrby, int n2, int n3) {
        if (n3 <= 0) {
            return n3;
        }
        if (this.mPosition != l2) {
            this.mIs.reset();
            this.mPosition = this.mIs.skip(l2);
        }
        int n4 = this.mIs.read(arrby, n2, n3);
        this.mPosition += (long)n4;
        return n4;
    }
}

