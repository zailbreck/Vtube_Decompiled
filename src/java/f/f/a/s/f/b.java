/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  f.f.a.a
 *  f.f.a.e.f.h
 *  f.f.a.s.f.g
 *  f.f.a.s.f.g$e
 *  f.f.a.s.f.g$f
 *  f.f.a.s.f.l
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Iterator
 *  java.util.concurrent.ConcurrentMap
 *  java.util.concurrent.CopyOnWriteArrayList
 */
package f.f.a.s.f;

import android.text.TextUtils;
import f.f.a.a;
import f.f.a.e.f.h;
import f.f.a.s.f.g;
import f.f.a.s.f.l;
import java.util.Iterator;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

public final class b
implements g.e {
    private static String e = "DownLoadH5SourceListener";
    private ConcurrentMap<String, b> a;
    private l b;
    private CopyOnWriteArrayList<g.f> c = new CopyOnWriteArrayList();
    private String d;

    public b(ConcurrentMap<String, b> concurrentMap, l l2, g.f f2, String string) {
        this.a = concurrentMap;
        this.b = l2;
        this.c.add((Object)f2);
        this.d = string;
    }

    public final void a() {
    }

    public final void a(g.f f2) {
        this.c.add((Object)f2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(String string, byte[] arrby, String string2) {
        String string3;
        block13 : {
            try {
                if (this.a == null) {
                    for (g.f f2 : this.c) {
                        if (f2 == null) continue;
                        f2.a("mResDownloadingMap  is null", string2);
                        this.c.remove((Object)f2);
                    }
                    return;
                }
                if (this.a.containsKey((Object)string2)) {
                    this.a.remove((Object)string2);
                }
                if (arrby != null && arrby.length > 0) {
                    String string4 = this.b.a(string2, arrby);
                    if (TextUtils.isEmpty((CharSequence)string4)) {
                        for (g.f f3 : this.c) {
                            if (f3 == null) continue;
                            f3.b(string2);
                            this.c.remove((Object)f3);
                        }
                        return;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("data save failed:");
                    stringBuilder.append(string4);
                    string3 = stringBuilder.toString();
                    break block13;
                }
                string3 = "response data is error";
            }
            catch (Exception exception) {
                if (a.a) {
                    exception.printStackTrace();
                }
                try {
                    string3 = exception.getMessage();
                }
                catch (Throwable throwable) {
                    h.b((String)e, (String)throwable.getMessage(), (Throwable)throwable);
                    string3 = "";
                }
            }
        }
        Iterator iterator = this.c.iterator();
        while (iterator.hasNext()) {
            g.f f4 = (g.f)iterator.next();
            if (f4 == null) continue;
            f4.a(string3, string2);
        }
        return;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(String string) {
        try {
            if (this.a == null) {
                for (g.f f2 : this.c) {
                    if (f2 == null) continue;
                    f2.a("mResDownloadingMap  is null", this.d);
                    this.c.remove((Object)f2);
                }
                return;
            }
            if (this.a.containsKey((Object)this.d)) {
                this.a.remove((Object)this.d);
            }
        }
        catch (Exception exception) {
            if (a.a) {
                exception.printStackTrace();
            }
            try {
                string = exception.getMessage();
            }
            catch (Throwable throwable) {
                h.b((String)e, (String)throwable.getMessage(), (Throwable)throwable);
            }
        }
        Iterator iterator = this.c.iterator();
        while (iterator.hasNext()) {
            g.f f3 = (g.f)iterator.next();
            if (f3 == null) continue;
            f3.a(string, this.d);
            this.c.remove((Object)f3);
        }
        return;
    }
}

