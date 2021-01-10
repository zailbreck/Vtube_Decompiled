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
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 */
package f.e.a.a.b.m;

import android.view.View;
import android.view.ViewParent;
import f.e.a.a.b.e.l;
import f.e.a.a.b.f.c;
import f.e.a.a.b.j.f;
import f.e.a.a.b.m.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class b {
    private final HashMap<View, String> a = new HashMap();
    private final HashMap<View, a> b = new HashMap();
    private final HashMap<String, View> c = new HashMap();
    private final HashSet<View> d = new HashSet();
    private final HashSet<String> e = new HashSet();
    private final HashSet<String> f = new HashSet();
    private final HashMap<String, String> g = new HashMap();
    private boolean h;

    private void a(l l2) {
        Iterator iterator = l2.c().iterator();
        while (iterator.hasNext()) {
            b.super.a((c)iterator.next(), l2);
        }
    }

    private void a(c c2, l l2) {
        View view = (View)c2.a().get();
        if (view == null) {
            return;
        }
        a a2 = (a)this.b.get((Object)view);
        if (a2 != null) {
            a2.a(l2.j());
            return;
        }
        this.b.put((Object)view, (Object)new a(c2, l2.j()));
    }

    private String d(View view) {
        if (!view.hasWindowFocus()) {
            return "noWindowFocus";
        }
        HashSet hashSet = new HashSet();
        while (view != null) {
            String string = f.e(view);
            if (string != null) {
                return string;
            }
            hashSet.add((Object)view);
            ViewParent viewParent = view.getParent();
            if (viewParent instanceof View) {
                view = (View)viewParent;
                continue;
            }
            view = null;
        }
        this.d.addAll((Collection)hashSet);
        return null;
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

    public String a(String string) {
        return (String)this.g.get((Object)string);
    }

    public HashSet<String> a() {
        return this.e;
    }

    public View b(String string) {
        return (View)this.c.get((Object)string);
    }

    public a b(View view) {
        a a2 = (a)this.b.get((Object)view);
        if (a2 != null) {
            this.b.remove((Object)view);
        }
        return a2;
    }

    public HashSet<String> b() {
        return this.f;
    }

    public d c(View view) {
        if (this.d.contains((Object)view)) {
            return d.b;
        }
        if (this.h) {
            return d.c;
        }
        return d.d;
    }

    public void c() {
        f.e.a.a.b.f.a a2 = f.e.a.a.b.f.a.d();
        if (a2 != null) {
            for (l l2 : a2.b()) {
                View view = l2.f();
                if (!l2.g()) continue;
                String string = l2.j();
                if (view != null) {
                    String string2 = this.d(view);
                    if (string2 == null) {
                        this.e.add((Object)string);
                        this.a.put((Object)view, (Object)string);
                        this.a(l2);
                        continue;
                    }
                    this.f.add((Object)string);
                    this.c.put((Object)string, (Object)view);
                    this.g.put((Object)string, (Object)string2);
                    continue;
                }
                this.f.add((Object)string);
                this.g.put((Object)string, (Object)"noAdView");
            }
        }
    }

    public void d() {
        this.a.clear();
        this.b.clear();
        this.c.clear();
        this.d.clear();
        this.e.clear();
        this.f.clear();
        this.g.clear();
        this.h = false;
    }

    public void e() {
        this.h = true;
    }

    public static class a {
        private final c a;
        private final ArrayList<String> b = new ArrayList();

        public a(c c2, String string) {
            this.a = c2;
            this.a(string);
        }

        public c a() {
            return this.a;
        }

        public void a(String string) {
            this.b.add((Object)string);
        }

        public ArrayList<String> b() {
            return this.b;
        }
    }

}

