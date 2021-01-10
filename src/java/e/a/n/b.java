/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  java.lang.CharSequence
 *  java.lang.Object
 */
package e.a.n;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public abstract class b {
    private Object b;
    private boolean c;

    public abstract void a();

    public abstract void a(int var1);

    public abstract void a(View var1);

    public abstract void a(CharSequence var1);

    public void a(Object object) {
        this.b = object;
    }

    public void a(boolean bl) {
        this.c = bl;
    }

    public abstract View b();

    public abstract void b(int var1);

    public abstract void b(CharSequence var1);

    public abstract Menu c();

    public abstract MenuInflater d();

    public abstract CharSequence e();

    public Object f() {
        return this.b;
    }

    public abstract CharSequence g();

    public boolean h() {
        return this.c;
    }

    public abstract void i();

    public abstract boolean j();

    public static interface a {
        public void a(b var1);

        public boolean a(b var1, Menu var2);

        public boolean a(b var1, MenuItem var2);

        public boolean b(b var1, Menu var2);
    }

}

