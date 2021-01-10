/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.webkit.WebView
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.UUID
 */
package f.e.a.a.b.e;

import android.webkit.WebView;
import f.e.a.a.b.e.e;
import f.e.a.a.b.e.j;
import f.e.a.a.b.e.k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public final class d {
    private final j a;
    private final WebView b;
    private final List<k> c = new ArrayList();
    private final Map<String, k> d = new HashMap();
    private final String e;
    private final String f;
    private final String g;
    private final e h;

    private d(j j2, WebView webView, String string, List<k> list, String string2, String string3, e e2) {
        this.a = j2;
        this.b = webView;
        this.e = string;
        this.h = e2;
        if (list != null) {
            this.c.addAll(list);
            for (k k2 : list) {
                String string4 = UUID.randomUUID().toString();
                this.d.put((Object)string4, (Object)k2);
            }
        }
        this.g = string2;
        this.f = string3;
    }

    public static d a(j j2, WebView webView, String string, String string2) {
        f.e.a.a.b.j.e.a(j2, "Partner is null");
        f.e.a.a.b.j.e.a((Object)webView, "WebView is null");
        if (string2 != null) {
            f.e.a.a.b.j.e.a(string2, 256, "CustomReferenceData is greater than 256 characters");
        }
        d d2 = new d(j2, webView, null, null, string, string2, e.c);
        return d2;
    }

    public static d a(j j2, String string, List<k> list, String string2, String string3) {
        f.e.a.a.b.j.e.a(j2, "Partner is null");
        f.e.a.a.b.j.e.a((Object)string, "OM SDK JS script content is null");
        f.e.a.a.b.j.e.a(list, "VerificationScriptResources is null");
        if (string3 != null) {
            f.e.a.a.b.j.e.a(string3, 256, "CustomReferenceData is greater than 256 characters");
        }
        d d2 = new d(j2, null, string, list, string2, string3, e.d);
        return d2;
    }

    public e a() {
        return this.h;
    }

    public String b() {
        return this.g;
    }

    public String c() {
        return this.f;
    }

    public Map<String, k> d() {
        return Collections.unmodifiableMap(this.d);
    }

    public String e() {
        return this.e;
    }

    public j f() {
        return this.a;
    }

    public List<k> g() {
        return Collections.unmodifiableList(this.c);
    }

    public WebView h() {
        return this.b;
    }
}

