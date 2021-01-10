/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  android.text.TextUtils
 *  f.a.a.a.a.h.a
 *  f.a.a.a.a.h.d
 *  f.a.a.a.a.h.f.c
 *  f.a.a.a.a.h.g.e
 *  f.a.a.a.a.h.g.f
 *  f.a.a.a.a.h.g.h
 *  f.a.a.a.a.j.d
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.URI
 *  java.util.LinkedHashMap
 *  java.util.Map
 *  java.util.Set
 */
package f.a.a.a.a.j;

import android.net.Uri;
import android.text.TextUtils;
import f.a.a.a.a.h.a;
import f.a.a.a.a.h.f.c;
import f.a.a.a.a.h.g.e;
import f.a.a.a.a.h.g.f;
import f.a.a.a.a.h.g.h;
import f.a.a.a.a.j.d;
import java.net.URI;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class i
extends d {
    private URI e;
    private String f;
    private String g;
    private a h;
    private boolean i = true;
    private Map<String, String> j = new LinkedHashMap();
    private boolean k;
    private c l;
    private boolean m = false;
    private String n;
    private String o;
    private byte[] p;
    private Uri q;

    public void a(Uri uri) {
        this.q = uri;
    }

    public void a(a a2) {
        this.h = a2;
    }

    public void a(c c2) {
        this.l = c2;
    }

    public void a(String string) {
        this.f = string;
    }

    public void a(URI uRI) {
        this.e = uRI;
    }

    public void a(boolean bl) {
        this.k = bl;
    }

    public void a(byte[] arrby) {
        this.p = arrby;
    }

    public void b(String string) {
        this.n = string;
    }

    public void b(boolean bl) {
        this.m = bl;
    }

    public void c(String string) {
        this.g = string;
    }

    public void c(boolean bl) {
        this.i = bl;
    }

    public void d(String string) {
        this.o = string;
    }

    public void d(boolean bl) {
    }

    public String f() {
        boolean bl = this.e != null;
        h.a((boolean)bl, (String)"Endpoint haven't been set!");
        String string = this.e.getScheme();
        String string2 = this.e.getHost();
        int n2 = this.e.getPort();
        String string3 = null;
        String string4 = n2 != -1 ? String.valueOf((int)n2) : null;
        if (TextUtils.isEmpty((CharSequence)string2)) {
            String string5 = this.e.toString();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("endpoint url : ");
            stringBuilder.append(string5);
            f.a.a.a.a.h.d.a((String)stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(" scheme : ");
        stringBuilder.append(string);
        f.a.a.a.a.h.d.a((String)stringBuilder.toString());
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(" originHost : ");
        stringBuilder2.append(string2);
        f.a.a.a.a.h.d.a((String)stringBuilder2.toString());
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(" port : ");
        stringBuilder3.append(string4);
        f.a.a.a.a.h.d.a((String)stringBuilder3.toString());
        StringBuilder stringBuilder4 = new StringBuilder();
        stringBuilder4.append(string);
        stringBuilder4.append("://");
        stringBuilder4.append(string2);
        String string6 = stringBuilder4.toString();
        if (!TextUtils.isEmpty((CharSequence)string4)) {
            StringBuilder stringBuilder5 = new StringBuilder();
            stringBuilder5.append(string6);
            stringBuilder5.append(":");
            stringBuilder5.append(string4);
            string6 = stringBuilder5.toString();
        }
        if (!TextUtils.isEmpty((CharSequence)this.f)) {
            if (h.d((String)string2)) {
                String string7;
                StringBuilder stringBuilder6 = new StringBuilder();
                stringBuilder6.append(this.f);
                stringBuilder6.append(".");
                stringBuilder6.append(string2);
                String string8 = stringBuilder6.toString();
                if (this.r()) {
                    string3 = f.a().a(string8);
                } else {
                    f.a.a.a.a.h.d.a((String)"[buildCannonicalURL], disable httpdns");
                }
                this.a("Host", string8);
                if (!TextUtils.isEmpty((CharSequence)string3)) {
                    StringBuilder stringBuilder7 = new StringBuilder();
                    stringBuilder7.append(string);
                    stringBuilder7.append("://");
                    stringBuilder7.append(string3);
                    string7 = stringBuilder7.toString();
                } else {
                    StringBuilder stringBuilder8 = new StringBuilder();
                    stringBuilder8.append(string);
                    stringBuilder8.append("://");
                    stringBuilder8.append(string8);
                    string7 = stringBuilder8.toString();
                }
                string6 = string7;
            } else if (h.e((String)string2)) {
                StringBuilder stringBuilder9 = new StringBuilder();
                stringBuilder9.append(string6);
                stringBuilder9.append("/");
                string6 = stringBuilder9.toString();
                this.a("Host", this.i());
            }
        }
        if (!TextUtils.isEmpty((CharSequence)this.g)) {
            StringBuilder stringBuilder10 = new StringBuilder();
            stringBuilder10.append(string6);
            stringBuilder10.append("/");
            stringBuilder10.append(e.a((String)this.g, (String)"utf-8"));
            string6 = stringBuilder10.toString();
        }
        String string9 = h.a(this.j, (String)"utf-8");
        StringBuilder stringBuilder11 = new StringBuilder();
        stringBuilder11.append("request---------------------\n");
        StringBuilder stringBuilder12 = new StringBuilder();
        stringBuilder12.append("request url=");
        stringBuilder12.append(string6);
        stringBuilder12.append("\n");
        stringBuilder11.append(stringBuilder12.toString());
        StringBuilder stringBuilder13 = new StringBuilder();
        stringBuilder13.append("request params=");
        stringBuilder13.append(string9);
        stringBuilder13.append("\n");
        stringBuilder11.append(stringBuilder13.toString());
        for (String string10 : this.d().keySet()) {
            StringBuilder stringBuilder14 = new StringBuilder();
            stringBuilder14.append("requestHeader [");
            stringBuilder14.append(string10);
            stringBuilder14.append("]: ");
            stringBuilder11.append(stringBuilder14.toString());
            StringBuilder stringBuilder15 = new StringBuilder();
            stringBuilder15.append((String)this.d().get((Object)string10));
            stringBuilder15.append("\n");
            stringBuilder11.append(stringBuilder15.toString());
        }
        f.a.a.a.a.h.d.a((String)stringBuilder11.toString());
        if (h.c((String)string9)) {
            return string6;
        }
        StringBuilder stringBuilder16 = new StringBuilder();
        stringBuilder16.append(string6);
        stringBuilder16.append("?");
        stringBuilder16.append(string9);
        return stringBuilder16.toString();
    }

    public String g() {
        return this.f;
    }

    public c h() {
        return this.l;
    }

    public String i() {
        return this.n;
    }

    public a j() {
        return this.h;
    }

    public String k() {
        return this.g;
    }

    public Map<String, String> l() {
        return this.j;
    }

    public byte[] m() {
        return this.p;
    }

    public String n() {
        return this.o;
    }

    public Uri o() {
        return this.q;
    }

    public boolean p() {
        return this.i;
    }

    public boolean q() {
        return this.k;
    }

    public boolean r() {
        return this.m;
    }
}

