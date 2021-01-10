/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.mintegral.msdk.video.module.MintegralContainerView
 *  java.lang.Throwable
 */
package f.f.a.r.b.a;

import com.mintegral.msdk.video.module.MintegralContainerView;
import f.f.a.r.b.a.d;

public final class k
extends d {
    private MintegralContainerView b;

    public k(MintegralContainerView mintegralContainerView) {
        this.b = mintegralContainerView;
    }

    @Override
    public final void a(int n2, int n3, int n4) {
        super.a(n2, n3, n4);
        try {
            if (this.b != null) {
                this.b.a(n2, n3, n4);
                return;
            }
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    @Override
    public final void a(int n2, int n3, int n4, int n5, int n6) {
        super.a(n2, n3, n4, n5, n6);
        try {
            if (this.b != null) {
                this.b.a(n2, n3, n4, n5, n6);
                return;
            }
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    @Override
    public final boolean a() {
        try {
            if (this.b != null) {
                boolean bl = this.b.a();
                return bl;
            }
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return super.a();
    }

    @Override
    public final void b(int n2) {
        super.b(n2);
        try {
            if (this.b != null) {
                this.b.b(n2);
                return;
            }
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    @Override
    public final void b(int n2, int n3, int n4) {
        super.b(n2, n3, n4);
        try {
            if (this.b != null) {
                this.b.b(n2, n3, n4);
                return;
            }
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    @Override
    public final void c(int n2) {
        super.c(n2);
        MintegralContainerView mintegralContainerView = this.b;
        if (mintegralContainerView != null) {
            mintegralContainerView.c(n2);
        }
    }

    @Override
    public final void d() {
        super.d();
        MintegralContainerView mintegralContainerView = this.b;
        if (mintegralContainerView != null) {
            mintegralContainerView.d();
        }
    }

    @Override
    public final void d(int n2) {
        try {
            if (this.b != null) {
                this.b.d(n2);
            }
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        super.d(n2);
    }

    @Override
    public final boolean f() {
        try {
            if (this.b != null) {
                boolean bl = this.b.f();
                return bl;
            }
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        return super.f();
    }

    @Override
    public final boolean h() {
        super.h();
        MintegralContainerView mintegralContainerView = this.b;
        if (mintegralContainerView != null) {
            return mintegralContainerView.h();
        }
        return false;
    }
}

