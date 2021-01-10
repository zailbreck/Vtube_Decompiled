/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.net.Uri
 *  android.os.Bundle
 *  com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.b$a
 *  com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.c
 *  com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.f
 *  e.c.b.b
 *  e.c.b.c
 *  e.c.b.d
 *  e.c.b.e
 *  e.c.b.f
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Bundle;
import com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.b;
import com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.c;
import com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.e;
import com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.f;
import e.c.b.d;
import java.util.List;

public class b
implements f {
    private e.c.b.f a;
    private e.c.b.c b;
    private e.c.b.e c;
    private a d;
    private e.c.b.b e;

    public static void a(Activity activity, d d2, Uri uri, int n2) {
        d2.a.setData(uri);
        activity.startActivityForResult(d2.a, n2);
    }

    public static boolean c(Activity activity) {
        return c.a((Context)activity) != null;
    }

    public void a() {
        this.b = null;
        this.a = null;
        a a2 = this.d;
        if (a2 != null) {
            a2.a();
        }
    }

    public void a(Activity activity) {
        if (this.b != null) {
            return;
        }
        String string2 = c.a((Context)activity);
        if (string2 == null) {
            return;
        }
        this.c = new e((f)this);
        e.c.b.c.a((Context)activity, (String)string2, (e.c.b.e)this.c);
    }

    public void a(a a2) {
        this.d = a2;
    }

    public void a(e.c.b.b b2) {
        this.e = b2;
    }

    public void a(e.c.b.c c2) {
        this.b = c2;
        this.b.a(0L);
        a a2 = this.d;
        if (a2 != null) {
            a2.b();
        }
    }

    public boolean a(Uri uri, Bundle bundle, List<Bundle> list) {
        if (this.b == null) {
            return false;
        }
        e.c.b.f f2 = this.b();
        if (f2 == null) {
            return false;
        }
        return f2.a(uri, bundle, list);
    }

    /*
     * Enabled aggressive block sorting
     */
    public e.c.b.f b() {
        e.c.b.f f2;
        e.c.b.c c2 = this.b;
        if (c2 == null) {
            f2 = null;
        } else {
            if (this.a != null) return this.a;
            f2 = c2.a(this.e);
        }
        this.a = f2;
        return this.a;
    }

    public void b(Activity activity) {
        e.c.b.e e2 = this.c;
        if (e2 == null) {
            return;
        }
        activity.unbindService((ServiceConnection)e2);
        this.b = null;
        this.a = null;
        this.c = null;
    }
}

