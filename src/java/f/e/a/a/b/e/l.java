/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.webkit.WebView
 *  f.e.a.a.b.e.b
 *  f.e.a.a.b.e.c
 *  f.e.a.a.b.e.d
 *  f.e.a.a.b.e.e
 *  f.e.a.a.b.e.g
 *  f.e.a.a.b.e.k
 *  f.e.a.a.b.f.a
 *  f.e.a.a.b.f.c
 *  f.e.a.a.b.j.e
 *  f.e.a.a.b.k.a
 *  f.e.a.a.b.l.a
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 *  java.util.Map
 *  java.util.UUID
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 *  org.json.JSONObject
 */
package f.e.a.a.b.e;

import android.view.View;
import android.webkit.WebView;
import f.e.a.a.b.e.b;
import f.e.a.a.b.e.c;
import f.e.a.a.b.e.d;
import f.e.a.a.b.e.e;
import f.e.a.a.b.e.g;
import f.e.a.a.b.e.k;
import f.e.a.a.b.f.a;
import f.e.a.a.b.f.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONObject;

public class l
extends b {
    private static final Pattern k = Pattern.compile((String)"^[a-zA-Z0-9 ]+$");
    private final d a;
    private final c b;
    private final List<f.e.a.a.b.f.c> c = new ArrayList();
    private f.e.a.a.b.k.a d;
    private f.e.a.a.b.l.a e;
    private boolean f = false;
    private boolean g = false;
    private String h;
    private boolean i;
    private boolean j;

    l(c c2, d d2) {
        this.b = c2;
        this.a = d2;
        this.h = UUID.randomUUID().toString();
        l.super.d(null);
        f.e.a.a.b.l.a a2 = d2.a() != e.c && d2.a() != e.e ? new f.e.a.a.b.l.c((Map<String, k>)d2.d(), d2.e()) : new f.e.a.a.b.l.b(d2.h());
        this.e = a2;
        this.e.a();
        a.d().a((l)this);
        this.e.a(c2);
    }

    private void a(String string) {
        if (string != null) {
            if (string.length() <= 50 && k.matcher((CharSequence)string).matches()) {
                return;
            }
            throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
        }
    }

    private f.e.a.a.b.f.c b(View view) {
        for (f.e.a.a.b.f.c c2 : this.c) {
            if (c2.a().get() != view) continue;
            return c2;
        }
        return null;
    }

    private void c(View view) {
        if (view != null) {
            return;
        }
        throw new IllegalArgumentException("FriendlyObstruction is null");
    }

    private void d(View view) {
        this.d = new f.e.a.a.b.k.a(view);
    }

    private void e(View view) {
        Collection collection = a.d().a();
        if (collection != null && collection.size() > 0) {
            for (l l2 : collection) {
                if (l2 == this || l2.f() != view) continue;
                l2.d.clear();
            }
        }
    }

    private void o() {
        if (!this.i) {
            return;
        }
        throw new IllegalStateException("Impression event can only be sent once");
    }

    private void p() {
        if (!this.j) {
            return;
        }
        throw new IllegalStateException("Loaded event can only be sent once");
    }

    public void a() {
        if (this.g) {
            return;
        }
        this.d.clear();
        this.n();
        this.g = true;
        this.k().f();
        a.d().c(this);
        this.k().b();
        this.e = null;
    }

    public void a(View view) {
        if (this.g) {
            return;
        }
        f.e.a.a.b.j.e.a((Object)view, (String)"AdView is null");
        if (this.f() == view) {
            return;
        }
        l.super.d(view);
        this.k().j();
        l.super.e(view);
    }

    public void a(View view, g g2, String string) {
        if (this.g) {
            return;
        }
        l.super.c(view);
        l.super.a(string);
        if (l.super.b(view) == null) {
            this.c.add((Object)new f.e.a.a.b.f.c(view, g2, string));
        }
    }

    void a(JSONObject jSONObject) {
        l.super.p();
        this.k().a(jSONObject);
        this.j = true;
    }

    public void b() {
        if (this.f) {
            return;
        }
        this.f = true;
        a.d().b(this);
        float f2 = f.d().c();
        this.e.a(f2);
        this.e.a(this, this.a);
    }

    public List<f.e.a.a.b.f.c> c() {
        return this.c;
    }

    void d() {
        this.o();
        this.k().g();
        this.i = true;
    }

    void e() {
        this.p();
        this.k().i();
        this.j = true;
    }

    public View f() {
        return (View)this.d.get();
    }

    public boolean g() {
        return this.f && !this.g;
    }

    public boolean h() {
        return this.f;
    }

    public boolean i() {
        return this.g;
    }

    public String j() {
        return this.h;
    }

    public f.e.a.a.b.l.a k() {
        return this.e;
    }

    public boolean l() {
        return this.b.a();
    }

    public boolean m() {
        return this.b.b();
    }

    public void n() {
        if (this.g) {
            return;
        }
        this.c.clear();
    }
}

