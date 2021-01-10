/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorListenerAdapter
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.graphics.Paint
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.ViewPropertyAnimator
 *  android.view.animation.Interpolator
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.ref.WeakReference
 */
package e.e.k;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.Paint;
import android.os.Build;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import e.e.k.b0;
import e.e.k.z;
import java.lang.ref.WeakReference;

public final class y {
    private WeakReference<View> a;
    Runnable b = null;
    Runnable c = null;
    int d = -1;

    y(View view) {
        this.a = new WeakReference((Object)view);
    }

    private void a(final View view, final z z2) {
        if (z2 != null) {
            view.animate().setListener((Animator.AnimatorListener)new AnimatorListenerAdapter((y)this){

                public void onAnimationCancel(Animator animator) {
                    z2.a(view);
                }

                public void onAnimationEnd(Animator animator) {
                    z2.b(view);
                }

                public void onAnimationStart(Animator animator) {
                    z2.c(view);
                }
            });
            return;
        }
        view.animate().setListener(null);
    }

    public y a(float f2) {
        View view = (View)this.a.get();
        if (view != null) {
            view.animate().alpha(f2);
        }
        return this;
    }

    public y a(long l2) {
        View view = (View)this.a.get();
        if (view != null) {
            view.animate().setDuration(l2);
        }
        return this;
    }

    public y a(Interpolator interpolator) {
        View view = (View)this.a.get();
        if (view != null) {
            view.animate().setInterpolator((TimeInterpolator)interpolator);
        }
        return this;
    }

    public y a(final b0 b02) {
        final View view = (View)this.a.get();
        if (view != null && Build.VERSION.SDK_INT >= 19) {
            ValueAnimator.AnimatorUpdateListener animatorUpdateListener = null;
            if (b02 != null) {
                animatorUpdateListener = new ValueAnimator.AnimatorUpdateListener((y)this){

                    public void onAnimationUpdate(ValueAnimator valueAnimator) {
                        b02.a(view);
                    }
                };
            }
            view.animate().setUpdateListener(animatorUpdateListener);
        }
        return this;
    }

    public y a(z z2) {
        View view = (View)this.a.get();
        if (view != null) {
            if (Build.VERSION.SDK_INT < 16) {
                view.setTag(2113929216, (Object)z2);
                z2 = new z((y)this){
                    y a;
                    boolean b;
                    {
                        this.a = y2;
                    }

                    @Override
                    public void a(View view) {
                        Object object = view.getTag(2113929216);
                        z z2 = object instanceof z ? (z)object : null;
                        if (z2 != null) {
                            z2.a(view);
                        }
                    }

                    @Override
                    public void b(View view) {
                        int n2 = this.a.d;
                        if (n2 > -1) {
                            view.setLayerType(n2, null);
                            this.a.d = -1;
                        }
                        if (Build.VERSION.SDK_INT >= 16 || !this.b) {
                            y y2 = this.a;
                            Runnable runnable = y2.c;
                            if (runnable != null) {
                                y2.c = null;
                                runnable.run();
                            }
                            Object object = view.getTag(2113929216);
                            boolean bl = object instanceof z;
                            z z2 = null;
                            if (bl) {
                                z2 = (z)object;
                            }
                            if (z2 != null) {
                                z2.b(view);
                            }
                            this.b = true;
                        }
                    }

                    @Override
                    public void c(View view) {
                        this.b = false;
                        if (this.a.d > -1) {
                            view.setLayerType(2, null);
                        }
                        y y2 = this.a;
                        Runnable runnable = y2.b;
                        if (runnable != null) {
                            y2.b = null;
                            runnable.run();
                        }
                        Object object = view.getTag(2113929216);
                        boolean bl = object instanceof z;
                        z z2 = null;
                        if (bl) {
                            z2 = (z)object;
                        }
                        if (z2 != null) {
                            z2.c(view);
                        }
                    }
                };
            }
            y.super.a(view, z2);
        }
        return this;
    }

    public void a() {
        View view = (View)this.a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long b() {
        View view = (View)this.a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public y b(float f2) {
        View view = (View)this.a.get();
        if (view != null) {
            view.animate().translationY(f2);
        }
        return this;
    }

    public y b(long l2) {
        View view = (View)this.a.get();
        if (view != null) {
            view.animate().setStartDelay(l2);
        }
        return this;
    }

    public void c() {
        View view = (View)this.a.get();
        if (view != null) {
            view.animate().start();
        }
    }

}

