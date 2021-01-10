/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.mintegral.msdk.base.download.e.a.a
 *  java.io.BufferedOutputStream
 *  java.io.File
 *  java.io.FileDescriptor
 *  java.io.FileOutputStream
 *  java.io.OutputStream
 *  java.io.RandomAccessFile
 *  java.lang.Object
 *  java.lang.String
 */
package com.mintegral.msdk.base.download.e.a;

import com.mintegral.msdk.base.download.e.a.a;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;

public final class b
implements a {
    private final BufferedOutputStream a;
    private final FileDescriptor b;
    private final RandomAccessFile c;

    public b(File file) {
        this.c = new RandomAccessFile(file, "rw");
        this.b = this.c.getFD();
        this.a = new BufferedOutputStream((OutputStream)new FileOutputStream(this.c.getFD()));
    }

    public final void a() {
        this.a.flush();
        this.b.sync();
    }

    public final void a(long l2) {
        this.c.seek(l2);
    }

    public final void a(byte[] arrby, int n2, int n3) {
        this.a.write(arrby, n2, n3);
    }

    public final void b() {
        this.a.close();
        this.c.close();
    }
}

