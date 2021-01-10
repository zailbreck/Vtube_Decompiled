/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.io.RandomAccessFile
 *  java.lang.Object
 *  java.lang.String
 *  tv.danmaku.ijk.media.player.misc.IMediaDataSource
 */
package tv.danmaku.ijk.media.player.misc;

import java.io.File;
import java.io.RandomAccessFile;
import tv.danmaku.ijk.media.player.misc.IMediaDataSource;

public class FileMediaDataSource
implements IMediaDataSource {
    public RandomAccessFile mFile;
    public long mFileSize;

    public FileMediaDataSource(File file) {
        RandomAccessFile randomAccessFile;
        this.mFile = randomAccessFile = new RandomAccessFile(file, "r");
        this.mFileSize = randomAccessFile.length();
    }

    public void close() {
        this.mFileSize = 0L;
        this.mFile.close();
        this.mFile = null;
    }

    public long getSize() {
        return this.mFileSize;
    }

    public int readAt(long l2, byte[] arrby, int n2, int n3) {
        if (this.mFile.getFilePointer() != l2) {
            this.mFile.seek(l2);
        }
        if (n3 == 0) {
            return 0;
        }
        return this.mFile.read(arrby, 0, n3);
    }
}

