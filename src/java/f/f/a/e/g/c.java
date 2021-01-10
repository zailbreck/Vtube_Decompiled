/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  java.lang.Object
 *  java.lang.String
 */
package f.f.a.e.g;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import f.f.a.e.c.a;
import f.f.a.e.f.l;

public class c
extends LinearLayout {
    public c(Context context) {
        super(context);
        c.super.a();
    }

    private void a() {
        this.setOrientation(0);
        int n2 = l.b(this.getContext(), 10.0f);
        this.setPadding(0, n2, 0, n2);
        ImageView imageView = (ImageView)this.b();
        imageView.setTag((Object)"backward");
        imageView.setImageDrawable(this.getResources().getDrawable(this.getResources().getIdentifier("mintegral_cm_backward", "drawable", a.i().a())));
        this.addView((View)imageView);
        ImageView imageView2 = (ImageView)this.b();
        imageView2.setTag((Object)"forward");
        imageView2.setImageDrawable(this.getResources().getDrawable(this.getResources().getIdentifier("mintegral_cm_forward", "drawable", a.i().a())));
        this.addView((View)imageView2);
        ImageView imageView3 = (ImageView)this.b();
        imageView3.setTag((Object)"refresh");
        imageView3.setImageDrawable(this.getResources().getDrawable(this.getResources().getIdentifier("mintegral_cm_refresh", "drawable", a.i().a())));
        this.addView((View)imageView3);
        ImageView imageView4 = (ImageView)this.b();
        imageView4.setTag((Object)"exits");
        imageView4.setImageDrawable(this.getResources().getDrawable(this.getResources().getIdentifier("mintegral_cm_exits", "drawable", a.i().a())));
        this.addView((View)imageView4);
    }

    private View b() {
        ImageView imageView = new ImageView(this.getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        imageView.setLayoutParams((ViewGroup.LayoutParams)layoutParams);
        imageView.setClickable(true);
        return imageView;
    }

    public View a(String string) {
        return this.findViewWithTag((Object)string);
    }

    public void setOnItemClickListener(View.OnClickListener onClickListener) {
        int n2 = this.getChildCount();
        for (int i2 = 0; i2 < n2; ++i2) {
            this.getChildAt(i2).setOnClickListener(onClickListener);
        }
    }
}

