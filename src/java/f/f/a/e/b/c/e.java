/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 *  java.io.File
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 */
package f.f.a.e.b.c;

import android.content.Context;
import android.util.Log;
import f.f.a.e.b.c.b;
import f.f.a.e.b.c.c;
import f.f.a.e.f.h;
import f.f.a.e.f.j;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class e {
    private static e c;
    private b a;
    private ArrayList<a> b;

    private e(b b2) {
        this.a = b2;
        this.b = new ArrayList();
    }

    public static File a(c c2) {
        try {
            if (e.b() != null) {
                for (a a2 : e.b().b) {
                    if (!a2.a.equals((Object)c2)) continue;
                    File file = a2.b;
                    return file;
                }
            }
        }
        catch (Throwable throwable) {
            h.b("MIntegralDirManager", throwable.getMessage(), throwable);
        }
        return null;
    }

    public static void a(b b2) {
        Class<e> class_ = e.class;
        synchronized (e.class) {
            if (c == null) {
                c = new e(b2);
            }
            // ** MonitorExit[var2_1] (shouldn't be in output)
            return;
        }
    }

    private boolean a(f.f.a.e.b.c.a a2) {
        String string;
        f.f.a.e.b.c.a a3 = a2.c();
        if (a3 == null) {
            string = a2.b();
        } else {
            File file = e.a(a3.a());
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(file.getAbsolutePath());
            stringBuilder.append(File.separator);
            stringBuilder.append(a2.b());
            string = stringBuilder.toString();
        }
        File file = new File(string);
        boolean bl = !file.exists() ? file.mkdirs() : true;
        if (!bl) {
            return false;
        }
        this.b.add((Object)new a(a2.a(), file));
        List<f.f.a.e.b.c.a> list = a2.d();
        if (list != null) {
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                if (e.super.a((f.f.a.e.b.c.a)iterator.next())) continue;
                return false;
            }
        }
        return true;
    }

    public static e b() {
        Class<e> class_ = e.class;
        synchronized (e.class) {
            if (c == null && f.f.a.e.c.a.i().e() != null) {
                j.a(f.f.a.e.c.a.i().e());
            }
            if (c == null) {
                Log.e((String)"MIntegralDirManager", (String)"mDirectoryManager == null");
            }
            e e2 = c;
            // ** MonitorExit[var3] (shouldn't be in output)
            return e2;
        }
    }

    public static String b(c c2) {
        File file = e.a(c2);
        if (file != null) {
            return file.getAbsolutePath();
        }
        return null;
    }

    public final boolean a() {
        return this.a(this.a.a());
    }

    private static final class a {
        public c a;
        public File b;

        public a(c c2, File file) {
            this.a = c2;
            this.b = file;
        }
    }

}

