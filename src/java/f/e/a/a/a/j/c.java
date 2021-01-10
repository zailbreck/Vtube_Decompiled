/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewParent
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 */
package f.e.a.a.a.j;

import android.view.View;
import android.view.ViewParent;
import f.e.a.a.a.d.i;
import f.e.a.a.a.e.a;
import f.e.a.a.a.g.f;
import f.e.a.a.a.j.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class c {
    private final HashMap<View, String> a = new HashMap();
    private final HashMap<View, ArrayList<String>> b = new HashMap();
    private final HashSet<View> c = new HashSet();
    private final HashSet<String> d = new HashSet();
    private final HashSet<String> e = new HashSet();
    private boolean f;

    private void a(View view, i i2) {
        ArrayList arrayList = (ArrayList)this.b.get((Object)view);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.b.put((Object)view, (Object)arrayList);
        }
        arrayList.add((Object)i2.k());
    }

    private void a(i i2) {
        Iterator iterator = i2.d().iterator();
        while (iterator.hasNext()) {
            View view = (View)((f.e.a.a.a.h.a)((Object)iterator.next())).get();
            if (view == null) continue;
            c.super.a(view, i2);
        }
    }

    private boolean d(View view) {
        if (!view.hasWindowFocus()) {
            return false;
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            if (f.d(view)) {
                hashSet.add((Object)view);
                ViewParent viewParent = view.getParent();
                if (viewParent instanceof View) {
                    view = (View)viewParent;
                    continue;
                }
                view = null;
                continue;
            }
            return false;
        }
        this.c.addAll((Collection)hashSet);
        return true;
    }

    public String a(View view) {
        if (this.a.size() == 0) {
            return null;
        }
        String string = (String)this.a.get((Object)view);
        if (string != null) {
            this.a.remove((Object)view);
        }
        return string;
    }

    public HashSet<String> a() {
        return this.d;
    }

    public ArrayList<String> b(View view) {
        if (this.b.size() == 0) {
            return null;
        }
        ArrayList arrayList = (ArrayList)this.b.get((Object)view);
        if (arrayList != null) {
            this.b.remove((Object)view);
            Collections.sort((List)arrayList);
        }
        return arrayList;
    }

    public HashSet<String> b() {
        return this.e;
    }

    public e c(View view) {
        if (this.c.contains((Object)view)) {
            return e.b;
        }
        if (this.f) {
            return e.c;
        }
        return e.d;
    }

    public void c() {
        a a2 = a.d();
        if (a2 != null) {
            for (i i2 : a2.b()) {
                View view = i2.f();
                if (!i2.g()) continue;
                if (view != null && this.d(view)) {
                    this.d.add((Object)i2.k());
                    this.a.put((Object)view, (Object)i2.k());
                    this.a(i2);
                    continue;
                }
                this.e.add((Object)i2.k());
            }
        }
    }

    public void d() {
        this.a.clear();
        this.b.clear();
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f = false;
    }

    public void e() {
        this.f = true;
    }
}

