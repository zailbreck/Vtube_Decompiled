/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  androidx.appcompat.view.menu.g
 *  androidx.appcompat.view.menu.g$a
 *  androidx.appcompat.widget.ActionBarContextView
 *  e.a.n.b
 *  e.a.n.b$a
 *  e.a.n.g
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.ref.WeakReference
 */
package e.a.n;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.widget.ActionBarContextView;
import e.a.n.b;
import e.a.n.g;
import java.lang.ref.WeakReference;

public class e
extends b
implements g.a {
    private Context d;
    private ActionBarContextView e;
    private b.a f;
    private WeakReference<View> g;
    private boolean h;
    private androidx.appcompat.view.menu.g i;

    public e(Context context, ActionBarContextView actionBarContextView, b.a a2, boolean bl) {
        this.d = context;
        this.e = actionBarContextView;
        this.f = a2;
        androidx.appcompat.view.menu.g g2 = new androidx.appcompat.view.menu.g(actionBarContextView.getContext());
        g2.c(1);
        this.i = g2;
        this.i.a((g.a)this);
    }

    public void a() {
        if (this.h) {
            return;
        }
        this.h = true;
        this.e.sendAccessibilityEvent(32);
        this.f.a((b)this);
    }

    public void a(int n2) {
        this.a(this.d.getString(n2));
    }

    public void a(View view) {
        this.e.setCustomView(view);
        WeakReference weakReference = view != null ? new WeakReference((Object)view) : null;
        this.g = weakReference;
    }

    public void a(androidx.appcompat.view.menu.g g2) {
        this.i();
        this.e.d();
    }

    public void a(CharSequence charSequence) {
        this.e.setSubtitle(charSequence);
    }

    public void a(boolean bl) {
        super.a(bl);
        this.e.setTitleOptional(bl);
    }

    public boolean a(androidx.appcompat.view.menu.g g2, MenuItem menuItem) {
        return this.f.a((b)this, menuItem);
    }

    public View b() {
        WeakReference<View> weakReference = this.g;
        if (weakReference != null) {
            return (View)weakReference.get();
        }
        return null;
    }

    public void b(int n2) {
        this.b(this.d.getString(n2));
    }

    public void b(CharSequence charSequence) {
        this.e.setTitle(charSequence);
    }

    public Menu c() {
        return this.i;
    }

    public MenuInflater d() {
        return new g(this.e.getContext());
    }

    public CharSequence e() {
        return this.e.getSubtitle();
    }

    public CharSequence g() {
        return this.e.getTitle();
    }

    public void i() {
        this.f.a((b)this, (Menu)this.i);
    }

    public boolean j() {
        return this.e.b();
    }
}

