/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 */
package com.mintegral.msdk.videocommon.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import f.f.a.e.f.o;

public class StarLevelView
extends LinearLayout {
    public StarLevelView(Context context) {
        super(context);
        this.setOrientation(0);
    }

    public StarLevelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.setOrientation(0);
    }

    public StarLevelView(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        this.setOrientation(0);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void a(double d2) {
        block10 : {
            int n2;
            block13 : {
                LinearLayout.LayoutParams layoutParams;
                ImageView imageView;
                block12 : {
                    int n3;
                    block11 : {
                        for (int i2 = 0; i2 < (int)d2; ++i2) {
                            ImageView imageView2 = new ImageView(this.getContext());
                            imageView2.setImageResource(o.a(this.getContext(), "mintegral_video_common_full_star", "drawable"));
                            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                            if (i2 != 0) {
                                layoutParams2.setMargins(5, 0, 5, 0);
                            }
                            this.addView((View)imageView2, (ViewGroup.LayoutParams)layoutParams2);
                        }
                        int n4 = (int)(50.0 - d2 * 10.0);
                        if (n4 <= 0) {
                            return;
                        }
                        if (n4 > 1 && n4 < 10) {
                            LinearLayout.LayoutParams layoutParams3;
                            ImageView imageView3;
                            if (n4 > 0 && n4 < 5) {
                                imageView3 = new ImageView(this.getContext());
                                imageView3.setImageResource(o.a(this.getContext(), "mintegral_video_common_full_star", "drawable"));
                                layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                            } else {
                                imageView3 = new ImageView(this.getContext());
                                imageView3.setImageResource(o.a(this.getContext(), "mintegral_video_common_full_star", "drawable"));
                                layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                            }
                            layoutParams3.setMargins(5, 0, 5, 0);
                            this.addView((View)imageView3, (ViewGroup.LayoutParams)layoutParams3);
                        }
                        if ((n2 = n4 / 10) < 1) break block10;
                        n3 = n4 % (n2 * 10);
                        if (n3 <= 0 || n3 >= 5) break block11;
                        imageView = new ImageView(this.getContext());
                        imageView.setImageResource(o.a(this.getContext(), "mintegral_video_common_full_while_star", "drawable"));
                        layoutParams = new LinearLayout.LayoutParams(-2, -2);
                        break block12;
                    }
                    if (n3 < 5 || n3 > 9) break block13;
                    imageView = new ImageView(this.getContext());
                    imageView.setImageResource(o.a(this.getContext(), "mintegral_video_common_half_star", "drawable"));
                    layoutParams = new LinearLayout.LayoutParams(-2, -2);
                }
                layoutParams.setMargins(5, 0, 5, 0);
                this.addView((View)imageView, (ViewGroup.LayoutParams)layoutParams);
            }
            for (int i3 = 0; i3 < n2; ++i3) {
                ImageView imageView = new ImageView(this.getContext());
                imageView.setImageResource(o.a(this.getContext(), "mintegral_video_common_full_while_star", "drawable"));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.setMargins(5, 0, 5, 0);
                this.addView((View)imageView, (ViewGroup.LayoutParams)layoutParams);
            }
        }
    }
}

