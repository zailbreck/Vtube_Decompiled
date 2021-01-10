/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.SurfaceTexture
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.view.Surface
 *  android.view.TextureView
 *  android.view.TextureView$SurfaceTextureListener
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  androidx.media2.common.VideoSize
 *  e.e.d.a
 *  e.j.b.b0
 *  e.j.b.b0$a
 *  e.j.b.k
 *  e.j.b.z$a
 *  f.d.a.b.a.e
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.concurrent.Executor
 */
package e.j.b;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import androidx.media2.common.VideoSize;
import e.j.b.b0;
import e.j.b.k;
import e.j.b.z;
import f.d.a.b.a.e;
import java.util.concurrent.Executor;

class z
extends TextureView
implements b0,
TextureView.SurfaceTextureListener {
    private Surface b;
    b0.a c;
    private k d;

    static {
        Log.isLoggable((String)"VideoTextureView", (int)3);
    }

    z(Context context) {
        super(context, null);
        this.setSurfaceTextureListener((TextureView.SurfaceTextureListener)this);
    }

    public int a() {
        return 1;
    }

    public void a(b0.a a2) {
        this.c = a2;
    }

    public boolean a(k k2) {
        this.d = k2;
        if (k2 != null && this.b()) {
            k2.a(this.b).a((Runnable)new a((z)this), e.e.d.a.b((Context)this.getContext()));
            return true;
        }
        return false;
    }

    public boolean b() {
        Surface surface = this.b;
        return surface != null && surface.isValid();
    }

    protected void onMeasure(int n2, int n3) {
        k k2 = this.d;
        int n4 = k2 != null ? k2.t().f() : 0;
        k k3 = this.d;
        int n5 = 0;
        if (k3 != null) {
            n5 = k3.t().e();
        }
        if (n4 != 0 && n5 != 0) {
            int n6 = View.MeasureSpec.getMode((int)n2);
            int n7 = View.MeasureSpec.getSize((int)n2);
            int n8 = View.MeasureSpec.getMode((int)n3);
            int n9 = View.MeasureSpec.getSize((int)n3);
            if (n6 == 1073741824 && n8 == 1073741824) {
                int n10 = n4 * n9;
                int n11 = n7 * n5;
                if (n10 < n11) {
                    n7 = n10 / n5;
                } else if (n10 > n11) {
                    n9 = n11 / n4;
                }
            } else if (n6 == 1073741824) {
                int n12 = n5 * n7 / n4;
                n9 = n8 == Integer.MIN_VALUE && n12 > n9 ? (n9 |= 16777216) : n12;
            } else if (n8 == 1073741824) {
                int n13 = n4 * n9 / n5;
                n7 = n6 == Integer.MIN_VALUE && n13 > n7 ? (n7 |= 16777216) : n13;
            } else {
                int n14;
                if (n8 == Integer.MIN_VALUE && n5 > n9) {
                    n14 = n9 * n4 / n5;
                } else {
                    n14 = n4;
                    n9 = n5;
                }
                if (n6 == Integer.MIN_VALUE && n14 > n7) {
                    n9 = n5 * n7 / n4;
                } else {
                    n7 = n14;
                }
            }
            this.setMeasuredDimension(n7, n9);
            return;
        }
        this.setMeasuredDimension(TextureView.getDefaultSize((int)n4, (int)n2), TextureView.getDefaultSize((int)n5, (int)n3));
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int n2, int n3) {
        this.b = new Surface(surfaceTexture);
        b0.a a2 = this.c;
        if (a2 != null) {
            a2.a((View)this, n2, n3);
        }
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        b0.a a2 = this.c;
        if (a2 != null) {
            a2.a((View)this);
        }
        this.b = null;
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int n2, int n3) {
        b0.a a2 = this.c;
        if (a2 != null) {
            a2.b((View)this, n2, n3);
        }
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}

