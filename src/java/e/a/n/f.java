/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.ActionMode
 *  android.view.ActionMode$Callback
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.View
 *  androidx.appcompat.view.menu.k
 *  androidx.appcompat.view.menu.p
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.util.ArrayList
 */
package e.a.n;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.view.menu.p;
import e.a.n.b;
import e.d.g;
import java.util.ArrayList;

public class f
extends ActionMode {
    final Context a;
    final b b;

    public f(Context context, b b2) {
        this.a = context;
        this.b = b2;
    }

    public void finish() {
        this.b.a();
    }

    public View getCustomView() {
        return this.b.b();
    }

    public Menu getMenu() {
        return new p(this.a, (e.e.f.a.a)this.b.c());
    }

    public MenuInflater getMenuInflater() {
        return this.b.d();
    }

    public CharSequence getSubtitle() {
        return this.b.e();
    }

    public Object getTag() {
        return this.b.f();
    }

    public CharSequence getTitle() {
        return this.b.g();
    }

    public boolean getTitleOptionalHint() {
        return this.b.h();
    }

    public void invalidate() {
        this.b.i();
    }

    public boolean isTitleOptional() {
        return this.b.j();
    }

    public void setCustomView(View view) {
        this.b.a(view);
    }

    public void setSubtitle(int n2) {
        this.b.a(n2);
    }

    public void setSubtitle(CharSequence charSequence) {
        this.b.a(charSequence);
    }

    public void setTag(Object object) {
        this.b.a(object);
    }

    public void setTitle(int n2) {
        this.b.b(n2);
    }

    public void setTitle(CharSequence charSequence) {
        this.b.b(charSequence);
    }

    public void setTitleOptionalHint(boolean bl) {
        this.b.a(bl);
    }

}

