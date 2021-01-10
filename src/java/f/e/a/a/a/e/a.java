/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 */
package f.e.a.a.a.e;

import f.e.a.a.a.d.i;
import f.e.a.a.a.e.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class a {
    private static a c = new a();
    private final ArrayList<i> a = new ArrayList();
    private final ArrayList<i> b = new ArrayList();

    private a() {
    }

    public static a d() {
        return c;
    }

    public Collection<i> a() {
        return Collections.unmodifiableCollection(this.a);
    }

    public void a(i i2) {
        this.a.add((Object)i2);
    }

    public Collection<i> b() {
        return Collections.unmodifiableCollection(this.b);
    }

    public void b(i i2) {
        boolean bl = this.c();
        this.b.add((Object)i2);
        if (!bl) {
            e.d().a();
        }
    }

    public void c(i i2) {
        boolean bl = this.c();
        this.a.remove((Object)i2);
        this.b.remove((Object)i2);
        if (bl && !this.c()) {
            e.d().b();
        }
    }

    public boolean c() {
        return this.b.size() > 0;
    }
}

