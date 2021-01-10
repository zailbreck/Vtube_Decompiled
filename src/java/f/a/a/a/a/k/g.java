/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 *  f.a.a.a.a.g.b
 *  f.a.a.a.a.g.c
 *  f.a.a.a.a.k.d
 *  f.a.a.a.a.k.f
 *  java.lang.String
 *  java.util.Map
 */
package f.a.a.a.a.k;

import android.net.Uri;
import f.a.a.a.a.g.b;
import f.a.a.a.a.g.c;
import f.a.a.a.a.k.d;
import f.a.a.a.a.k.f;
import java.util.Map;

public class g
extends d {
    private String c;
    private String d;
    private String e;
    private byte[] f;
    private Uri g;
    private f h;
    private Map<String, String> i;
    private Map<String, String> j;
    private b<g> k;
    private c l;

    public g(String string, String string2, String string3) {
        super(string, string2, string3, null);
    }

    public g(String string, String string2, String string3, f f2) {
        this.a(string);
        this.b(string2);
        this.c(string3);
        this.a(f2);
    }

    public void a(f f2) {
        this.h = f2;
    }

    public void a(String string) {
        this.c = string;
    }

    public void b(String string) {
        this.d = string;
    }

    public String c() {
        return this.c;
    }

    public void c(String string) {
        this.e = string;
    }

    public Map<String, String> d() {
        return this.i;
    }

    public Map<String, String> e() {
        return this.j;
    }

    public f f() {
        return this.h;
    }

    public String g() {
        return this.d;
    }

    public b<g> h() {
        return this.k;
    }

    public c i() {
        return this.l;
    }

    public byte[] j() {
        return this.f;
    }

    public String k() {
        return this.e;
    }

    public Uri l() {
        return this.g;
    }
}

