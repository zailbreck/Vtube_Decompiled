/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 */
package f.e.a.a.b.f;

import f.e.a.a.b.e.l;
import f.e.a.a.b.f.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class a {
    private static a c = new a();
    private final ArrayList<l> a = new ArrayList();
    private final ArrayList<l> b = new ArrayList();

    private a() {
    }

    public static a d() {
        return c;
    }

    public Collection<l> a() {
        return Collections.unmodifiableCollection(this.a);
    }

    public void a(l l2) {
        this.a.add((Object)l2);
    }

    public Collection<l> b() {
        return Collections.unmodifiableCollection(this.b);
    }

    public void b(l l2) {
        boolean bl = this.c();
        this.b.add((Object)l2);
        if (!bl) {
            f.d().a();
        }
    }

    public void c(l l2) {
        boolean bl = this.c();
        this.a.remove((Object)l2);
        this.b.remove((Object)l2);
        if (bl && !this.c()) {
            f.d().b();
        }
    }

    public boolean c() {
        return this.b.size() > 0;
    }
}

