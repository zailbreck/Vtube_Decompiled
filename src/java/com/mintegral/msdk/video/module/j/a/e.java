/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.widget.ImageView
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 */
package com.mintegral.msdk.video.module.j.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.ImageView;
import f.f.a.e.b.d.c;
import f.f.a.e.d.r;
import f.f.a.e.e.a;
import f.f.a.e.e.n;
import f.f.a.e.f.d;
import f.f.a.e.f.h;
import java.lang.ref.WeakReference;

public class e
implements c {
    protected WeakReference<ImageView> b;
    private a c;
    private String d;

    public e(ImageView imageView) {
        this.b = new WeakReference((Object)imageView);
    }

    public e(ImageView imageView, a a2, String string2) {
        this.b = new WeakReference((Object)imageView);
        this.c = a2;
        this.d = string2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public void a(Bitmap var1, String var2_2) {
        if (var1 != null) ** GOTO lbl5
        try {
            h.d("ImageLoaderListener", "bitmap=null");
            return;
lbl5: // 1 sources:
            if (this.b == null) return;
            if (this.b.get() == null) return;
            if (var1.isRecycled() != false) return;
            ((ImageView)this.b.get()).setImageBitmap(var1);
            ((ImageView)this.b.get()).setVisibility(0);
            return;
        }
        catch (Throwable var3_3) {
            if (f.f.a.a.a == false) return;
            var3_3.printStackTrace();
        }
    }

    @Override
    public void a(String string2, String string3) {
        try {
            r r2 = r.a(f.f.a.e.d.h.a(f.f.a.e.c.a.i().e()));
            if (this.c == null) {
                h.a("ImageLoaderListener", "campaign is null");
                return;
            }
            n n2 = new n();
            n2.l("2000044");
            n2.b(d.z(f.f.a.e.c.a.i().e()));
            n2.k(this.c.e());
            n2.b(this.c.f());
            n2.i(this.c.M0());
            n2.j(this.d);
            n2.m(string2);
            r2.a(n2);
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("desc:");
        stringBuilder.append(string2);
        h.d("ImageLoaderListener", stringBuilder.toString());
    }
}

