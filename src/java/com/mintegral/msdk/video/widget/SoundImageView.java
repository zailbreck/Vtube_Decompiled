/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.widget.ImageView
 *  java.lang.String
 */
package com.mintegral.msdk.video.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import f.f.a.e.f.o;

public class SoundImageView
extends ImageView {
    private boolean b = true;

    public SoundImageView(Context context) {
        super(context);
    }

    public SoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SoundImageView(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
    }

    public boolean getStatus() {
        return this.b;
    }

    public void setSoundStatus(boolean bl) {
        Context context;
        String string;
        this.b = bl;
        if (this.b) {
            context = this.getContext();
            string = "mintegral_reward_sound_open";
        } else {
            context = this.getContext();
            string = "mintegral_reward_sound_close";
        }
        this.setImageResource(o.a(context, string, "drawable"));
    }
}

