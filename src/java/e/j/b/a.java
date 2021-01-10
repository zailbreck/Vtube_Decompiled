/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorSet
 *  android.animation.AnimatorSet$Builder
 *  android.animation.ObjectAnimator
 *  android.view.View
 *  java.lang.Object
 *  java.lang.String
 */
package e.j.b;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.View;

class a {
    static AnimatorSet a(float f2, float f3, View[] arrview) {
        AnimatorSet animatorSet = new AnimatorSet();
        if (arrview.length == 0) {
            return animatorSet;
        }
        AnimatorSet.Builder builder = animatorSet.play((Animator)a.a(f2, f3, arrview[0]));
        for (int i2 = 1; i2 < arrview.length; ++i2) {
            builder.with((Animator)a.a(f2, f3, arrview[i2]));
        }
        return animatorSet;
    }

    static ObjectAnimator a(float f2, float f3, View view) {
        return ObjectAnimator.ofFloat((Object)view, (String)"translationY", (float[])new float[]{f2, f3});
    }
}

