/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.sqlite.SQLiteDatabase
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package f.g.a.c;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import f.g.a.c.a;
import f.g.a.c.b;
import f.g.a.c.d;
import f.g.a.c.e;
import f.g.a.c.f;
import java.util.ArrayList;
import java.util.List;

public class c {
    private static c d;
    public f a;
    public b b;
    public d c;

    private c(d d2, f f2, b b2) {
        this.c = d2;
        this.a = f2;
        this.b = b2;
    }

    public static c a(Context context) {
        c c2 = d;
        if (c2 != null) {
            return c2;
        }
        d d2 = new d(context);
        d = new c(d2, new f(d2), new b(d2));
        return d;
    }

    public List<a> a(String string2, String string3, String string4, Integer n2) {
        List<a> list = new List<a>();
        e e2 = this.a.a(string2, string3, string4, n2);
        if (e2 != null) {
            list = this.b.a(e2.a);
        }
        return list;
    }

    public void a() {
        d d2 = this.c;
        d2.a(d2.getWritableDatabase());
    }

    public void a(String string2, String string3, String string4, Integer n2, String string5, String string6) {
        e e2 = this.a.a(string2, string3, string4, n2);
        if (e2 != null) {
            a a2 = this.b.a(string5, string6, e2.a);
            this.b.a(a2);
        }
    }

    public void b(String string2, String string3, String string4, Integer n2) {
        e e2 = this.a.a(string2, string3, string4, n2);
        if (e2 != null) {
            this.a.a(e2);
        }
    }

    public void b(String string2, String string3, String string4, Integer n2, String string5, String string6) {
        Long l2;
        e e2 = this.a.a(string2, string3, string4, n2);
        if (e2 == null) {
            f f2 = this.a;
            e e3 = new e(null, string2, string3, string4, n2);
            l2 = f2.b(e3);
        } else {
            l2 = e2.a;
        }
        a a2 = this.b.a(string5, string6, l2);
        if (a2 != null) {
            boolean bl = a2.b.equals((Object)string5);
            boolean bl2 = false;
            if (!bl) {
                a2.b = string5;
                bl2 = true;
            }
            if (!a2.c.equals((Object)string6)) {
                a2.c = string6;
                bl2 = true;
            }
            if (bl2) {
                this.b.c(a2);
                return;
            }
        } else {
            a a3 = new a(null, string5, string6, l2);
            a3.a = this.b.b(a3);
        }
    }
}

