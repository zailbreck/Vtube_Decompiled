/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.widget.ImageView
 *  com.mintegral.msdk.video.module.j.a.e
 *  f.f.a.a
 *  f.f.a.e.f.g
 *  f.f.a.e.f.h
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 */
package com.mintegral.msdk.video.module.j.a;

import android.graphics.Bitmap;
import android.widget.ImageView;
import com.mintegral.msdk.video.module.j.a.e;
import f.f.a.a;
import f.f.a.e.f.g;
import f.f.a.e.f.h;
import java.lang.ref.WeakReference;

public final class j
extends e {
    private int e;

    public j(ImageView imageView, int n2) {
        super(imageView);
        this.e = n2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void a(Bitmap var1, String var2_2) {
        if (var1 != null) ** GOTO lbl5
        try {
            h.d((String)"ImageLoaderListener", (String)"bitmap=null");
            return;
lbl5: // 1 sources:
            if (this.b == null) return;
            if (this.b.get() == null) return;
            if (var1.isRecycled() != false) return;
            var4_3 = g.a((Bitmap)var1, (int)1, (int)this.e);
            if (var4_3 == null) return;
            ((ImageView)this.b.get()).setImageBitmap(var4_3);
            return;
        }
        catch (Throwable var3_4) {
            if (a.a == false) return;
            var3_4.printStackTrace();
        }
    }
}

