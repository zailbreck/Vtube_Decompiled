/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.res.Configuration
 *  f.f.a.e.f.h
 *  f.f.a.r.b.b
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package f.f.a.r.b.a;

import android.content.res.Configuration;
import f.f.a.e.f.h;
import f.f.a.r.b.b;

public class a
implements b {
    public void a() {
        h.a((String)"js", (String)"DefaultJSActivity-onPause");
    }

    public void a(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("setSystemResume,isResume:");
        stringBuilder.append(n2);
        h.a((String)"js", (String)stringBuilder.toString());
    }

    public void a(Configuration configuration) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("DefaultJSActivity-onConfigurationChanged:");
        stringBuilder.append(configuration.orientation);
        h.a((String)"js", (String)stringBuilder.toString());
    }

    public void b() {
        h.a((String)"js", (String)"DefaultJSActivity-onResume");
    }

    public void c() {
        h.a((String)"js", (String)"DefaultJSActivity-onDestory");
    }

    public int d() {
        h.a((String)"js", (String)"isSystemResume");
        return 0;
    }

    public void e() {
        h.a((String)"js", (String)"DefaultJSActivity-onBackPressed");
    }
}

