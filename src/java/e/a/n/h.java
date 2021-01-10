/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.animation.Interpolator
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Iterator
 */
package e.a.n;

import android.view.animation.Interpolator;
import e.a.n.h;
import e.e.k.a0;
import e.e.k.y;
import e.e.k.z;
import java.util.ArrayList;
import java.util.Iterator;

public class h {
    final ArrayList<y> a = new ArrayList();
    private long b = -1L;
    private Interpolator c;
    z d;
    private boolean e;
    private final a0 f = new a0(this){
        private boolean a;
        private int b;
        final /* synthetic */ h c;
        {
            this.c = h2;
            this.a = false;
            this.b = 0;
        }

        void a() {
            this.b = 0;
            this.a = false;
            this.c.b();
        }

        public void b(android.view.View view) {
            int n2;
            this.b = n2 = 1 + this.b;
            if (n2 == this.c.a.size()) {
                z z2 = this.c.d;
                if (z2 != null) {
                    z2.b(null);
                }
                this.a();
            }
        }

        public void c(android.view.View view) {
            if (this.a) {
                return;
            }
            this.a = true;
            z z2 = this.c.d;
            if (z2 != null) {
                z2.c(null);
            }
        }
    };

    public h a(long l2) {
        if (!this.e) {
            this.b = l2;
        }
        return this;
    }

    public h a(Interpolator interpolator) {
        if (!this.e) {
            this.c = interpolator;
        }
        return this;
    }

    public h a(y y2) {
        if (!this.e) {
            this.a.add((Object)y2);
        }
        return this;
    }

    public h a(y y2, y y3) {
        this.a.add((Object)y2);
        y3.b(y2.b());
        this.a.add((Object)y3);
        return this;
    }

    public h a(z z2) {
        if (!this.e) {
            this.d = z2;
        }
        return this;
    }

    public void a() {
        if (!this.e) {
            return;
        }
        Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((y)iterator.next()).a();
        }
        this.e = false;
    }

    void b() {
        this.e = false;
    }

    public void c() {
        if (this.e) {
            return;
        }
        for (y y2 : this.a) {
            Interpolator interpolator;
            long l2 = this.b;
            if (l2 >= 0L) {
                y2.a(l2);
            }
            if ((interpolator = this.c) != null) {
                y2.a(interpolator);
            }
            if (this.d != null) {
                y2.a(this.f);
            }
            y2.c();
        }
        this.e = true;
    }
}

