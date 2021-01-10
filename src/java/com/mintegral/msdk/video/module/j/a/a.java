/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  android.net.Uri
 *  android.text.TextUtils
 *  com.mintegral.msdk.video.module.j.a.f
 *  f.f.a.e.f.h
 *  f.f.a.g.c
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.mintegral.msdk.video.module.j.a;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.mintegral.msdk.video.module.j.a.f;
import f.f.a.e.f.h;
import f.f.a.g.c;

public class a
extends f {
    private Activity a;
    private f.f.a.e.e.a b;

    public a(Activity activity, f.f.a.e.e.a a2) {
        this.a = activity;
        this.b = a2;
    }

    public void a(int n2, Object object) {
        super.a(n2, object);
        if (n2 != 106) {
            return;
        }
        if (this.a != null && this.b != null) {
            try {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.VIEW");
                String string = c.a((String)this.b.F(), (String)"-999", (String)"-999");
                if (!TextUtils.isEmpty((CharSequence)string)) {
                    intent.setData(Uri.parse((String)string));
                    this.a.startActivity(intent);
                }
            }
            catch (Throwable throwable) {
                h.b((String)"NotifyListener", (String)throwable.getMessage(), (Throwable)throwable);
            }
            this.a.finish();
        }
    }
}

