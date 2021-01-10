/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Canvas
 *  android.util.AttributeSet
 *  android.widget.ImageView
 *  f.f.a.e.b.d.b
 *  f.f.a.e.b.d.c
 *  f.f.a.e.f.h
 *  java.lang.String
 */
package f.f.a.t;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.ImageView;
import f.f.a.e.b.d.b;
import f.f.a.e.b.d.c;
import f.f.a.e.f.h;
import f.f.a.t.a;

public class a
extends ImageView {
    private Bitmap b = null;
    private String c;

    public a(Context context) {
        super(context);
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public a(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
    }

    protected void onDraw(Canvas canvas) {
        Bitmap bitmap = this.b;
        if (bitmap != null && bitmap.isRecycled()) {
            h.d((String)"mtg-widget-imageview", (String)"onDraw bitmap recycled");
            if (this.getContext() != null) {
                b.a((Context)this.getContext()).a(this.c, new c((a)this){
                    final /* synthetic */ a b;
                    {
                        this.b = a2;
                    }

                    public final void a(Bitmap bitmap, String string2) {
                        this.b.setImageBitmap(bitmap);
                    }

                    public final void a(String string2, String string3) {
                        java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
                        stringBuilder.append(string3);
                        stringBuilder.append(" load failed:");
                        stringBuilder.append(string2);
                        h.d((String)"mtg-widget-imageview", (String)stringBuilder.toString());
                    }
                });
                return;
            }
        } else {
            super.onDraw(canvas);
        }
    }

    public void setImageBitmap(Bitmap bitmap) {
        this.b = bitmap;
        if (bitmap != null && bitmap.isRecycled()) {
            this.b = null;
            super.setImageBitmap(null);
            h.d((String)"mtg-widget-imageview", (String)"setImageBitmap recycled");
            return;
        }
        super.setImageBitmap(bitmap);
    }

    public void setImageUrl(String string2) {
        this.c = string2;
    }
}

