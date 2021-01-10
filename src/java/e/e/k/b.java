/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.Log
 *  android.view.MenuItem
 *  android.view.SubMenu
 *  android.view.View
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package e.e.k;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public abstract class b {
    private b a;

    public b(Context context) {
    }

    public View a(MenuItem menuItem) {
        return this.c();
    }

    public void a(SubMenu subMenu) {
    }

    public void a(a a2) {
    }

    public void a(b b2) {
        if (this.a != null && b2 != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this ");
            stringBuilder.append(this.getClass().getSimpleName());
            stringBuilder.append(" instance while it is still in use somewhere else?");
            Log.w((String)"ActionProvider(support)", (String)stringBuilder.toString());
        }
        this.a = b2;
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public boolean d() {
        return false;
    }

    public boolean e() {
        return false;
    }

    public void f() {
        this.a = null;
    }

    public static interface a {
    }

    public static interface b {
        public void onActionProviderVisibilityChanged(boolean var1);
    }

}

