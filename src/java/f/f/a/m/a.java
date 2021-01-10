/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  android.text.TextUtils
 *  f.f.a.e.b.d.c
 *  f.f.a.m.h
 *  f.f.a.p.a
 *  java.io.Serializable
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package f.f.a.m;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import f.f.a.e.b.d.c;
import f.f.a.m.h;
import java.io.Serializable;

public class a
implements c,
f.f.a.p.a,
Serializable {
    private String b = "";
    private String c = "";
    private String d = "";
    private String e = "";
    private String f = "";
    private String g = "";
    private String h = "";
    private long i = 0L;
    private double j;
    public String k;
    private int l = 1;
    private h m;

    private Drawable a(Bitmap bitmap) {
        return new BitmapDrawable(bitmap);
    }

    public String a() {
        return this.k;
    }

    public void a(double d2) {
        this.j = d2;
    }

    public void a(int n2) {
    }

    public void a(long l2) {
        this.i = l2;
    }

    public void a(Bitmap bitmap, String string) {
        if (!TextUtils.isEmpty((CharSequence)this.f()) && this.f().equals((Object)string) && bitmap != null) {
            this.a(a.super.a(bitmap));
            h h2 = this.m;
            if (h2 != null) {
                h2.a(a.super.a(bitmap), 3);
            }
        }
        if (!TextUtils.isEmpty((CharSequence)this.d()) && this.d() != null && this.d().equals((Object)string) && bitmap != null) {
            this.b(a.super.a(bitmap));
            h h3 = this.m;
            if (h3 != null) {
                h3.a(a.super.a(bitmap), 2);
            }
        }
    }

    public void a(Drawable drawable) {
    }

    public void a(String string) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            return;
        }
        this.k = string;
    }

    public void a(String string, String string2) {
    }

    public String b() {
        return this.e;
    }

    public void b(int n2) {
    }

    public void b(Drawable drawable) {
    }

    public void b(String string) {
        this.e = string;
    }

    public String c() {
        return this.d;
    }

    public void c(int n2) {
        this.l = n2;
    }

    public void c(String string) {
        this.d = string;
    }

    public String d() {
        return this.g;
    }

    public void d(String string) {
        this.g = string;
    }

    public String e() {
        return this.b;
    }

    public void e(String string) {
        this.b = string;
    }

    public String f() {
        return this.h;
    }

    public void f(String string) {
        this.h = string;
    }

    public String g() {
        return this.c;
    }

    public void g(String string) {
        this.c = string;
    }

    public double h() {
        return this.j;
    }

    public void h(String string) {
        this.f = string;
    }

    public String i() {
        return this.f;
    }

    public long j() {
        return this.i;
    }

    public int k() {
        return this.l;
    }
}

