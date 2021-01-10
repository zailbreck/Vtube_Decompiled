/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.f.a.j.a.a
 *  f.f.a.j.b
 *  f.f.a.j.q
 *  java.io.File
 *  java.io.IOException
 *  java.io.RandomAccessFile
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package f.f.a.j.a;

import f.f.a.j.a.a;
import f.f.a.j.a.i;
import f.f.a.j.q;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class b
implements f.f.a.j.b {
    private final a a;
    public File b;
    private RandomAccessFile c;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public b(File file, a a2) {
        if (a2 == null) throw new NullPointerException();
        try {
            File file2;
            boolean bl;
            this.a = a2;
            File file3 = file.getParentFile();
            if (file3.exists()) {
                if (!file3.isDirectory()) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("File ");
                    stringBuilder.append((Object)file3);
                    stringBuilder.append(" is not directory!");
                    throw new IOException(stringBuilder.toString());
                }
            } else if (!file3.mkdirs()) {
                Object[] arrobject = new Object[]{file3.getAbsolutePath()};
                throw new IOException(String.format((String)"Directory %s can't be created", (Object[])arrobject));
            }
            if (bl = file.exists()) {
                file2 = file;
            } else {
                File file4 = file.getParentFile();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(file.getName());
                stringBuilder.append(".download");
                file2 = new File(file4, stringBuilder.toString());
            }
            File file5 = this.b = file2;
            String string = bl ? "r" : "rw";
            this.c = new RandomAccessFile(file5, string);
            return;
        }
        catch (IOException iOException) {}
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Error using file ");
        stringBuilder.append((Object)file);
        stringBuilder.append(" as disc cache");
        throw new q(stringBuilder.toString(), (Throwable)iOException);
    }

    public b(String string) {
        try {
            this.a = new i();
            this.b = new File(string);
            if (!this.b.exists() && string.endsWith(".dltmp")) {
                this.b = new File(string.substring(0, -6 + string.length()));
            }
            this.c = new RandomAccessFile(this.b, "rw");
            return;
        }
        catch (IOException iOException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Error using file ");
            stringBuilder.append((Object)this.b);
            stringBuilder.append(" as disc cache");
            throw new q(stringBuilder.toString(), (Throwable)iOException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int a(byte[] arrby, long l2, int n2) {
        void var9_4 = this;
        synchronized (var9_4) {
            try {
                try {
                    this.c.seek(l2);
                    return this.c.read(arrby, 0, n2);
                }
                catch (IOException iOException) {
                    Object[] arrobject = new Object[]{n2, l2, this.a(), arrby.length};
                    throw new q(String.format((String)"Error reading %d bytes with offset %d from file[%d bytes] to buffer[%d bytes]", (Object[])arrobject), (Throwable)iOException);
                }
            }
            catch (Throwable throwable2) {}
            throw throwable2;
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final long a() {
        b b2 = this;
        // MONITORENTER : b2
        long l2 = this.c.length();
        long l3 = (int)l2;
        // MONITOREXIT : b2
        return l3;
        {
            catch (Throwable throwable22) {
                throw throwable22;
            }
            catch (IOException iOException) {}
            {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Error reading length of file ");
                stringBuilder.append((Object)this.b);
                throw new q(stringBuilder.toString(), (Throwable)iOException);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(byte[] arrby, int n2) {
        void var10_3 = this;
        synchronized (var10_3) {
            try {
                try {
                    if (!this.e()) {
                        this.c.seek(this.a());
                        this.c.write(arrby, 0, n2);
                        return;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Error append cache: cache file ");
                    stringBuilder.append((Object)this.b);
                    stringBuilder.append(" is completed!");
                    throw new q(stringBuilder.toString());
                }
                catch (IOException iOException) {
                    Object[] arrobject = new Object[]{n2, this.c, arrby.length};
                    throw new q(String.format((String)"Error writing %d bytes to %s from buffer with size %d", (Object[])arrobject), (Throwable)iOException);
                }
            }
            catch (Throwable throwable2) {}
            throw throwable2;
        }
    }

    /*
     * Exception decompiling
     */
    public final void b() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl19.1 : ALOAD_2 : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1133)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:607)
        // java.lang.Thread.run(Thread.java:761)
        throw new IllegalStateException("Decompilation failed");
    }

    public final void c() {
        b b2 = this;
        synchronized (b2) {
            block7 : {
                boolean bl = this.e();
                if (!bl) break block7;
                return;
            }
            this.b();
            String string = this.b.getName().endsWith(".dltmp") ? this.b.getName().substring(0, -6 + this.b.getName().length()) : this.b.getName().substring(0, -9 + this.b.getName().length());
            File file = new File(this.b.getParentFile(), string);
            this.b.renameTo(file);
            this.b = file;
            try {
                this.c = new RandomAccessFile(this.b, "r");
                this.a.a(this.b);
            }
            catch (IOException iOException) {}
            return;
        }
    }

    public final boolean e() {
        b b2 = this;
        synchronized (b2) {
            boolean bl;
            block4 : {
                boolean bl2;
                File file = this.b;
                if (!file.getName().endsWith(".download") && !(bl2 = file.getName().endsWith(".dltmp"))) {
                    bl = false;
                    break block4;
                }
                bl = true;
            }
            boolean bl3 = bl ^ true;
            return bl3;
        }
    }
}

