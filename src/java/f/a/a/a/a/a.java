/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.List
 */
package f.a.a.a.a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class a {
    private int a = 5;
    private int b = 60000;
    private int c = 60000;
    private long d = 0x500000L;
    private int e = 2;
    private List<String> f = new ArrayList();
    private String g;
    private int h;
    private String i;
    private boolean j = true;
    private boolean k = false;
    private String l;

    public static a m() {
        return new a();
    }

    public int a() {
        return this.c;
    }

    public void a(int n2) {
        this.c = n2;
    }

    public List<String> b() {
        return Collections.unmodifiableList(this.f);
    }

    public void b(int n2) {
        this.a = n2;
    }

    public String c() {
        return this.i;
    }

    public void c(int n2) {
        this.e = n2;
    }

    public String d() {
        return this.l;
    }

    public void d(int n2) {
        this.b = n2;
    }

    public int e() {
        return this.a;
    }

    public int f() {
        return this.e;
    }

    public long g() {
        return this.d;
    }

    public String h() {
        return this.g;
    }

    public int i() {
        return this.h;
    }

    public int j() {
        return this.b;
    }

    public boolean k() {
        return this.k;
    }

    public boolean l() {
        return this.j;
    }
}

