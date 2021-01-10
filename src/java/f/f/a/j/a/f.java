/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  f.f.a.j.a.a
 *  f.f.a.j.a.d
 *  f.f.a.j.a.e
 *  f.f.a.j.a.f$a
 *  java.io.File
 *  java.io.IOException
 *  java.io.RandomAccessFile
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.Arrays
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.Iterator
 *  java.util.LinkedList
 *  java.util.List
 *  java.util.concurrent.Callable
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 *  java.util.concurrent.Future
 */
package f.f.a.j.a;

import android.util.Log;
import f.f.a.j.a.d;
import f.f.a.j.a.e;
import f.f.a.j.a.f;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * Exception performing whole class analysis.
 */
public abstract class f
implements f.f.a.j.a.a {
    public static final String b = "f";
    private final ExecutorService a;

    public f() {
        this.a = Executors.newSingleThreadExecutor();
    }

    static /* synthetic */ void a(f f2, File file) {
        if (file.exists() && !file.setLastModified(System.currentTimeMillis())) {
            long l2 = file.length();
            if (l2 == 0L) {
                if (!file.delete() || !file.createNewFile()) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Error recreate zero-size file ");
                    stringBuilder.append((Object)file);
                    throw new IOException(stringBuilder.toString());
                }
            } else {
                RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rwd");
                long l3 = l2 - 1L;
                randomAccessFile.seek(l3);
                byte by = randomAccessFile.readByte();
                randomAccessFile.seek(l3);
                randomAccessFile.write((int)by);
                randomAccessFile.close();
            }
            file.lastModified();
        }
        File file2 = file.getParentFile();
        LinkedList linkedList = new LinkedList();
        Object[] arrobject = file2.listFiles();
        if (arrobject != null) {
            linkedList = Arrays.asList((Object[])arrobject);
            Collections.sort((List)linkedList, (Comparator)new e(null));
        }
        f2.a((List<File>)linkedList);
    }

    private void a(List<File> list) {
        Iterator iterator = list.iterator();
        long l2 = 0L;
        while (iterator.hasNext()) {
            l2 += ((File)iterator.next()).length();
        }
        int n2 = list.size();
        for (File file : list) {
            String string;
            StringBuilder stringBuilder;
            String string2;
            if (this.a(file, l2, n2)) continue;
            long l3 = file.length();
            if (file.delete()) {
                --n2;
                l2 -= l3;
                string = b;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Cache file ");
                stringBuilder.append((Object)file);
                string2 = " is deleted because it exceeds cache limit";
            } else {
                string = b;
                stringBuilder = new StringBuilder();
                stringBuilder.append("Error deleting file ");
                stringBuilder.append((Object)file);
                string2 = " for trimming cache";
            }
            stringBuilder.append(string2);
            Log.i((String)string, (String)stringBuilder.toString());
        }
    }

    public final void a(File file) {
        this.a.submit((Callable)new /* Unavailable Anonymous Inner Class!! */);
    }

    protected abstract boolean a(File var1, long var2, int var4);
}

