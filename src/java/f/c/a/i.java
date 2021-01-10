/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  tv.danmaku.ijk.media.player.misc.IMediaDataSource
 */
package f.c.a;

import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import tv.danmaku.ijk.media.player.misc.IMediaDataSource;

class i
implements IMediaDataSource {
    private InputStream a;
    private long b = 0L;

    public i(InputStream inputStream) {
        this.a = inputStream;
    }

    public void close() {
        InputStream inputStream = this.a;
        if (inputStream != null) {
            try {
                inputStream.close();
                this.a = null;
                return;
            }
            catch (IOException iOException) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("failed to close");
                stringBuilder.append(iOException.getMessage());
                Log.e((String)"DataSource", (String)stringBuilder.toString());
            }
        }
    }

    public long getSize() {
        int n2;
        try {
            n2 = this.a.available();
        }
        catch (IOException iOException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("failed to get size");
            stringBuilder.append(iOException.getMessage());
            Log.e((String)"DataSource", (String)stringBuilder.toString());
            return -1L;
        }
        return n2;
    }

    public int readAt(long l2, byte[] arrby, int n2, int n3) {
        if (n3 <= 0) {
            return n3;
        }
        int n4 = -1;
        try {
            if (this.b != l2) {
                this.a.reset();
                this.b = this.a.skip(l2);
            }
            n4 = this.a.read(arrby, n2, n3);
            this.b += (long)n4;
            return n4;
        }
        catch (IOException iOException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("failed to read");
            stringBuilder.append(iOException.getMessage());
            Log.e((String)"DataSource", (String)stringBuilder.toString());
            return n4;
        }
    }
}

