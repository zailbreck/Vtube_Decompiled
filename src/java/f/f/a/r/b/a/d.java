/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.f.a.e.f.h
 *  f.f.a.r.b.i
 *  f.f.a.r.b.l
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package f.f.a.r.b.a;

import f.f.a.e.f.h;
import f.f.a.r.b.i;
import f.f.a.r.b.l;

public class d
implements i,
l {
    public void a(int n2, int n3, int n4) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("showMiniCard width = ");
        stringBuilder.append(n2);
        stringBuilder.append(" height = ");
        stringBuilder.append(n3);
        stringBuilder.append(" radius = ");
        stringBuilder.append(n4);
        h.a((String)"js", (String)stringBuilder.toString());
    }

    public void a(int n2, int n3, int n4, int n5, int n6) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("showMiniCard top = ");
        stringBuilder.append(n2);
        stringBuilder.append(" left = ");
        stringBuilder.append(n3);
        stringBuilder.append(" width = ");
        stringBuilder.append(n4);
        stringBuilder.append(" height = ");
        stringBuilder.append(n5);
        stringBuilder.append(" radius = ");
        stringBuilder.append(n6);
        h.a((String)"js", (String)stringBuilder.toString());
    }

    public boolean a() {
        h.a((String)"js", (String)"miniCardShowing");
        return false;
    }

    public void b(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("showEndcard,type=");
        stringBuilder.append(n2);
        h.a((String)"js", (String)stringBuilder.toString());
    }

    public void b(int n2, int n3, int n4) {
    }

    public void c(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("showVideoClickView:");
        stringBuilder.append(n2);
        h.a((String)"js", (String)stringBuilder.toString());
    }

    public void d() {
        h.a((String)"js", (String)"hideAlertWebview ,msg=");
    }

    public void d(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("readyStatus:isReady=");
        stringBuilder.append(n2);
        h.a((String)"js", (String)stringBuilder.toString());
    }

    public boolean f() {
        h.a((String)"js", (String)"endCardShowing");
        return true;
    }

    public boolean h() {
        h.a((String)"js", (String)"showAlertWebView ,msg=");
        return false;
    }
}

