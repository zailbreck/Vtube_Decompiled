/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.io.File
 *  java.io.IOException
 *  java.io.RandomAccessFile
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  tv.danmaku.ijk.media.player.misc.IMediaDataSource
 */
package f.c.a;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import tv.danmaku.ijk.media.player.misc.IMediaDataSource;

class f
implements IMediaDataSource {
    private RandomAccessFile a;
    private long b;

    public f(File file) {
        try {
            this.a = new RandomAccessFile(file, "r");
            this.b = this.a.length();
            return;
        }
        catch (IOException iOException) {
            this.a = null;
            this.b = -1L;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("failed to open RandomAccess");
            stringBuilder.append(iOException.getMessage());
            Log.e((String)"DataSource", (String)stringBuilder.toString());
            return;
        }
    }

    public void close() {
        RandomAccessFile randomAccessFile = this.a;
        if (randomAccessFile != null) {
            try {
                randomAccessFile.close();
                this.b = 0L;
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
        return this.b;
    }

    public int readAt(long l2, byte[] arrby, int n2, int n3) {
        if (n3 == 0) {
            return 0;
        }
        RandomAccessFile randomAccessFile = this.a;
        if (randomAccessFile != null) {
            try {
                if (randomAccessFile.getFilePointer() != l2) {
                    this.a.seek(l2);
                }
                int n4 = this.a.read(arrby, 0, n3);
                return n4;
            }
            catch (IOException iOException) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("failed to read");
                stringBuilder.append(iOException.getMessage());
                Log.e((String)"DataSource", (String)stringBuilder.toString());
            }
        }
        return -1;
    }
}

