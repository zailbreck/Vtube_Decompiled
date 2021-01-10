/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.f.a.e.f.h
 *  f.f.a.r.b.n
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package f.f.a.r.b.a;

import f.f.a.e.f.h;
import f.f.a.r.b.n;

public class g
implements n {
    public void a(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("videoOperate:");
        stringBuilder.append(n2);
        h.a((String)"js", (String)stringBuilder.toString());
    }

    public void a(int n2, int n3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("closeOperte:close=");
        stringBuilder.append(n2);
        stringBuilder.append("closeViewVisible=");
        stringBuilder.append(n3);
        h.a((String)"js", (String)stringBuilder.toString());
    }

    public void b() {
        h.a((String)"js", (String)"dismissAllAlert");
    }

    public void b(int n2, int n3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("soundOperate:mute=");
        stringBuilder.append(n2);
        stringBuilder.append(",soundViewVisible=");
        stringBuilder.append(n3);
        h.a((String)"js", (String)stringBuilder.toString());
    }

    public boolean c() {
        return false;
    }

    public void e() {
        h.a((String)"js", (String)"showAlertView:");
    }

    public void g() {
        h.a((String)"js", (String)"alertWebViewShowed:");
    }

    public int getBorderViewHeight() {
        return 0;
    }

    public int getBorderViewLeft() {
        return 0;
    }

    public int getBorderViewRadius() {
        return 0;
    }

    public int getBorderViewTop() {
        return 0;
    }

    public int getBorderViewWidth() {
        return 0;
    }

    public String getCurrentProgress() {
        h.a((String)"js", (String)"getCurrentProgress");
        return "{}";
    }

    public void setCover(boolean bl) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("setCover:");
        stringBuilder.append(bl);
        h.a((String)"js", (String)stringBuilder.toString());
    }

    public void setVisible(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("setVisible:");
        stringBuilder.append(n2);
        h.a((String)"js", (String)stringBuilder.toString());
    }
}

