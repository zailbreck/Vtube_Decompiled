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
 *  java.util.List
 */
package f.e.a.a.a.d;

import android.webkit.WebView;
import f.e.a.a.a.d.e;
import f.e.a.a.a.d.g;
import f.e.a.a.a.d.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public final class d {
    private final g a;
    private final WebView b;
    private final List<h> c = new ArrayList();
    private final String d;
    private final String e;
    private final e f;

    private d(g g2, WebView webView, String string, List<h> list, String string2) {
        e e2;
        this.a = g2;
        this.b = webView;
        this.d = string;
        if (list != null) {
            this.c.addAll(list);
            e2 = e.d;
        } else {
            e2 = e.c;
        }
        this.f = e2;
        this.e = string2;
    }

    public static d a(g g2, String string, List<h> list, String string2) {
        f.e.a.a.a.g.e.a(g2, "Partner is null");
        f.e.a.a.a.g.e.a((Object)string, "OM SDK JS script content is null");
        f.e.a.a.a.g.e.a(list, "VerificationScriptResources is null");
        if (string2 != null) {
            f.e.a.a.a.g.e.a(string2, 256, "CustomReferenceData is greater than 256 characters");
        }
        d d2 = new d(g2, null, string, list, string2);
        return d2;
    }

    public e a() {
        return this.f;
    }

    public String b() {
        return this.e;
    }

    public String c() {
        return this.d;
    }

    public g d() {
        return this.a;
    }

    public List<h> e() {
        return Collections.unmodifiableList(this.c);
    }

    public WebView f() {
        return this.b;
    }
}

