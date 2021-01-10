/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package com.mintegral.msdk.base.common.report;

import android.content.Context;
import android.text.TextUtils;
import f.f.a.e.c.a;
import f.f.a.e.d.h;
import f.f.a.e.e.i;
import f.f.a.e.f.d;
import f.f.a.e.f.l;

public final class a$c {
    private i a;
    private h b = null;
    private Context c;

    public a$c(i i2) {
        Context context;
        this.a = i2;
        this.c = a.i().e();
        this.b = h.a(this.c);
        if (this.a != null && (context = this.c) != null) {
            i i3;
            int n2;
            int n3 = d.z(context);
            this.a.e(n3);
            this.a.c(d.a(this.c, n3));
            if (l.a(this.c)) {
                i3 = this.a;
                n2 = 1;
            } else {
                i3 = this.a;
                n2 = 2;
            }
            i3.d(n2);
        }
    }

    public final void a() {
        if (this.a != null) {
            f.f.a.e.d.l.a(this.b).a(this.a);
        }
    }

    public final void a(int n2) {
        i i2 = this.a;
        if (i2 != null) {
            i2.b(n2);
        }
    }

    public final void a(String string) {
        if (!TextUtils.isEmpty((CharSequence)string)) {
            this.a.a(string);
        }
    }

    public final void b(int n2) {
        i i2 = this.a;
        if (i2 != null) {
            i2.c(n2);
        }
    }

    public final void b(String string) {
        i i2 = this.a;
        if (i2 != null) {
            i2.b(string);
        }
    }
}

