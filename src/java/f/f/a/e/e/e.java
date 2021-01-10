/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Iterator
 *  java.util.List
 */
package f.f.a.e.e;

import f.f.a.e.c.b.b;
import java.util.Iterator;
import java.util.List;

public final class e {
    private String a;
    private String b;
    private String c;
    private String d;
    private int e;
    private String f;
    private String g;
    private String h;
    private int i;
    private int j;
    private String k;
    private int l;
    private int m;
    private String n;
    private int o;
    private String p;

    public e() {
    }

    public e(String string, String string2, String string3, String string4, int n2, String string5, String string6, String string7, int n3, int n4, String string8, int n5, int n6, String string9, int n7, int n8, String string10) {
        this.a = string;
        this.b = string2;
        this.c = string3;
        this.d = string4;
        this.e = n2;
        this.f = string5;
        this.g = string6;
        this.h = string7;
        this.i = n3;
        this.j = n4;
        this.k = string8;
        this.l = n5;
        this.m = n6;
        this.n = string9;
        this.o = n7;
        this.p = string10;
    }

    public static String a(List<e> list) {
        if (list != null && list.size() > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                StringBuilder stringBuilder2;
                String string;
                e e2 = (e)iterator.next();
                boolean bl = b.b().a("authority_general_data");
                Iterator iterator2 = iterator;
                if (bl) {
                    StringBuilder stringBuilder3 = new StringBuilder();
                    stringBuilder3.append("rid_n=");
                    stringBuilder3.append(e2.a);
                    stringBuilder.append(stringBuilder3.toString());
                    StringBuilder stringBuilder4 = new StringBuilder();
                    stringBuilder4.append("&network_type=");
                    stringBuilder4.append(e2.o);
                    stringBuilder.append(stringBuilder4.toString());
                    StringBuilder stringBuilder5 = new StringBuilder();
                    stringBuilder5.append("&network_str=");
                    stringBuilder5.append(e2.p);
                    stringBuilder.append(stringBuilder5.toString());
                    StringBuilder stringBuilder6 = new StringBuilder();
                    stringBuilder6.append("&cid=");
                    stringBuilder6.append(e2.b);
                    stringBuilder.append(stringBuilder6.toString());
                    StringBuilder stringBuilder7 = new StringBuilder();
                    stringBuilder7.append("&click_type=");
                    stringBuilder7.append(e2.j);
                    stringBuilder.append(stringBuilder7.toString());
                    StringBuilder stringBuilder8 = new StringBuilder();
                    stringBuilder8.append("&type=");
                    stringBuilder8.append(e2.i);
                    stringBuilder.append(stringBuilder8.toString());
                    StringBuilder stringBuilder9 = new StringBuilder();
                    stringBuilder9.append("&click_duration=");
                    stringBuilder9.append(e2.c);
                    stringBuilder.append(stringBuilder9.toString());
                    stringBuilder.append("&key=2000013");
                    StringBuilder stringBuilder10 = new StringBuilder();
                    stringBuilder10.append("&unit_id=");
                    stringBuilder10.append(e2.k);
                    stringBuilder.append(stringBuilder10.toString());
                    StringBuilder stringBuilder11 = new StringBuilder();
                    stringBuilder11.append("&last_url=");
                    stringBuilder11.append(e2.d);
                    stringBuilder.append(stringBuilder11.toString());
                    StringBuilder stringBuilder12 = new StringBuilder();
                    stringBuilder12.append("&content=");
                    stringBuilder12.append(e2.h);
                    stringBuilder.append(stringBuilder12.toString());
                    StringBuilder stringBuilder13 = new StringBuilder();
                    stringBuilder13.append("&code=");
                    stringBuilder13.append(e2.e);
                    stringBuilder.append(stringBuilder13.toString());
                    StringBuilder stringBuilder14 = new StringBuilder();
                    stringBuilder14.append("&exception=");
                    stringBuilder14.append(e2.f);
                    stringBuilder.append(stringBuilder14.toString());
                    StringBuilder stringBuilder15 = new StringBuilder();
                    stringBuilder15.append("&header=");
                    stringBuilder15.append(e2.g);
                    stringBuilder.append(stringBuilder15.toString());
                    StringBuilder stringBuilder16 = new StringBuilder();
                    stringBuilder16.append("&landing_type=");
                    stringBuilder16.append(e2.l);
                    stringBuilder.append(stringBuilder16.toString());
                    StringBuilder stringBuilder17 = new StringBuilder();
                    stringBuilder17.append("&link_type=");
                    stringBuilder17.append(e2.m);
                    stringBuilder.append(stringBuilder17.toString());
                    stringBuilder2 = new StringBuilder();
                    string = "&click_time=";
                } else {
                    StringBuilder stringBuilder18 = new StringBuilder();
                    stringBuilder18.append("rid_n=");
                    stringBuilder18.append(e2.a);
                    stringBuilder.append(stringBuilder18.toString());
                    StringBuilder stringBuilder19 = new StringBuilder();
                    stringBuilder19.append("&cid=");
                    stringBuilder19.append(e2.b);
                    stringBuilder.append(stringBuilder19.toString());
                    StringBuilder stringBuilder20 = new StringBuilder();
                    stringBuilder20.append("&click_type=");
                    stringBuilder20.append(e2.j);
                    stringBuilder.append(stringBuilder20.toString());
                    StringBuilder stringBuilder21 = new StringBuilder();
                    stringBuilder21.append("&type=");
                    stringBuilder21.append(e2.i);
                    stringBuilder.append(stringBuilder21.toString());
                    StringBuilder stringBuilder22 = new StringBuilder();
                    stringBuilder22.append("&click_duration=");
                    stringBuilder22.append(e2.c);
                    stringBuilder.append(stringBuilder22.toString());
                    stringBuilder.append("&key=2000013");
                    StringBuilder stringBuilder23 = new StringBuilder();
                    stringBuilder23.append("&unit_id=");
                    stringBuilder23.append(e2.k);
                    stringBuilder.append(stringBuilder23.toString());
                    StringBuilder stringBuilder24 = new StringBuilder();
                    stringBuilder24.append("&last_url=");
                    stringBuilder24.append(e2.d);
                    stringBuilder.append(stringBuilder24.toString());
                    StringBuilder stringBuilder25 = new StringBuilder();
                    stringBuilder25.append("&content=");
                    stringBuilder25.append(e2.h);
                    stringBuilder.append(stringBuilder25.toString());
                    StringBuilder stringBuilder26 = new StringBuilder();
                    stringBuilder26.append("&code=");
                    stringBuilder26.append(e2.e);
                    stringBuilder.append(stringBuilder26.toString());
                    StringBuilder stringBuilder27 = new StringBuilder();
                    stringBuilder27.append("&exception=");
                    stringBuilder27.append(e2.f);
                    stringBuilder.append(stringBuilder27.toString());
                    StringBuilder stringBuilder28 = new StringBuilder();
                    stringBuilder28.append("&header=");
                    stringBuilder28.append(e2.g);
                    stringBuilder.append(stringBuilder28.toString());
                    StringBuilder stringBuilder29 = new StringBuilder();
                    stringBuilder29.append("&landing_type=");
                    stringBuilder29.append(e2.l);
                    stringBuilder.append(stringBuilder29.toString());
                    StringBuilder stringBuilder30 = new StringBuilder();
                    stringBuilder30.append("&link_type=");
                    stringBuilder30.append(e2.m);
                    stringBuilder.append(stringBuilder30.toString());
                    stringBuilder2 = new StringBuilder();
                    string = "&click_time=";
                }
                stringBuilder2.append(string);
                stringBuilder2.append(e2.n);
                stringBuilder2.append("\n");
                stringBuilder.append(stringBuilder2.toString());
                iterator = iterator2;
            }
            return stringBuilder.toString();
        }
        return null;
    }

    public final int a() {
        return this.o;
    }

    public final void a(int n2) {
        this.o = n2;
    }

    public final void a(String string) {
        this.p = string;
    }

    public final String b() {
        return this.p;
    }

    public final void b(int n2) {
        this.l = n2;
    }

    public final void b(String string) {
        this.k = string;
    }

    public final String c() {
        return this.k;
    }

    public final void c(int n2) {
        this.m = n2;
    }

    public final void c(String string) {
        this.n = string;
    }

    public final int d() {
        return this.l;
    }

    public final void d(int n2) {
        this.j = n2;
    }

    public final void d(String string) {
        this.f = string;
    }

    public final int e() {
        return this.m;
    }

    public final void e(int n2) {
        this.e = n2;
    }

    public final void e(String string) {
        this.g = string;
    }

    public final String f() {
        return this.n;
    }

    public final void f(int n2) {
        this.i = n2;
    }

    public final void f(String string) {
        this.h = string;
    }

    public final int g() {
        return this.j;
    }

    public final void g(String string) {
        this.d = string;
    }

    public final String h() {
        return this.f;
    }

    public final void h(String string) {
        this.b = string;
    }

    public final int i() {
        return this.e;
    }

    public final void i(String string) {
        this.c = string;
    }

    public final int j() {
        return this.i;
    }

    public final void j(String string) {
        this.a = string;
    }

    public final String k() {
        return this.d;
    }

    public final String l() {
        return this.b;
    }

    public final String m() {
        return this.c;
    }

    public final String n() {
        return this.a;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("ClickTime [campaignId=");
        stringBuilder.append(this.b);
        stringBuilder.append(", click_duration=");
        stringBuilder.append(this.c);
        stringBuilder.append(", lastUrl=");
        stringBuilder.append(this.d);
        stringBuilder.append(", code=");
        stringBuilder.append(this.e);
        stringBuilder.append(", excepiton=");
        stringBuilder.append(this.f);
        stringBuilder.append(", header=");
        stringBuilder.append(this.g);
        stringBuilder.append(", content=");
        stringBuilder.append(this.h);
        stringBuilder.append(", type=");
        stringBuilder.append(this.i);
        stringBuilder.append(", click_type=");
        stringBuilder.append(this.j);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

