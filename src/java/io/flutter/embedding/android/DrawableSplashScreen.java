/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.view.View
 *  android.view.ViewPropertyAnimator
 *  android.widget.ImageView
 *  android.widget.ImageView$ScaleType
 *  io.flutter.embedding.android.DrawableSplashScreen$1
 *  io.flutter.embedding.android.DrawableSplashScreen$DrawableSplashScreenView
 *  io.flutter.embedding.android.SplashScreen
 *  io.flutter.embedding.android.a
 *  java.lang.Object
 *  java.lang.Runnable
 */
package io.flutter.embedding.android;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import io.flutter.embedding.android.DrawableSplashScreen;
import io.flutter.embedding.android.SplashScreen;
import io.flutter.embedding.android.a;

/*
 * Exception performing whole class analysis.
 */
public final class DrawableSplashScreen
implements SplashScreen {
    private final long crossfadeDurationInMillis;
    private final Drawable drawable;
    private final ImageView.ScaleType scaleType;
    private DrawableSplashScreenView splashView;

    public DrawableSplashScreen(Drawable drawable) {
        super(drawable, ImageView.ScaleType.FIT_XY, 500L);
    }

    public DrawableSplashScreen(Drawable drawable, ImageView.ScaleType scaleType, long l2) {
        this.drawable = drawable;
        this.scaleType = scaleType;
        this.crossfadeDurationInMillis = l2;
    }

    public View createSplashView(Context context, Bundle bundle) {
        this.splashView = new /* Unavailable Anonymous Inner Class!! */;
        this.splashView.setSplashDrawable(this.drawable, this.scaleType);
        return this.splashView;
    }

    @SuppressLint(value={"NewApi"})
    public /* synthetic */ boolean doesSplashViewRememberItsTransition() {
        return a.$default$doesSplashViewRememberItsTransition((SplashScreen)this);
    }

    @SuppressLint(value={"NewApi"})
    public /* synthetic */ Bundle saveSplashScreenState() {
        return a.$default$saveSplashScreenState((SplashScreen)this);
    }

    public void transitionToFlutter(Runnable runnable) {
        DrawableSplashScreenView drawableSplashScreenView = this.splashView;
        if (drawableSplashScreenView == null) {
            runnable.run();
            return;
        }
        drawableSplashScreenView.animate().alpha(0.0f).setDuration(this.crossfadeDurationInMillis).setListener((Animator.AnimatorListener)new 1((DrawableSplashScreen)this, runnable));
    }
}

