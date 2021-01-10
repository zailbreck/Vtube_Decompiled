/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.mintegral.msdk.video.module.MintegralVideoView
 *  java.lang.String
 */
package f.f.a.r.b.a;

import com.mintegral.msdk.video.module.MintegralVideoView;
import f.f.a.r.b.a.g;

public final class n
extends g {
    private MintegralVideoView b;

    public n(MintegralVideoView mintegralVideoView) {
        this.b = mintegralVideoView;
    }

    @Override
    public final void a(int n2) {
        super.a(n2);
        MintegralVideoView mintegralVideoView = this.b;
        if (mintegralVideoView != null) {
            mintegralVideoView.a(n2);
        }
    }

    @Override
    public final void a(int n2, int n3) {
        super.a(n2, n3);
        MintegralVideoView mintegralVideoView = this.b;
        if (mintegralVideoView != null) {
            mintegralVideoView.a(n2, n3);
        }
    }

    @Override
    public final void b() {
        MintegralVideoView mintegralVideoView = this.b;
        if (mintegralVideoView != null) {
            mintegralVideoView.b();
            return;
        }
        super.b();
    }

    @Override
    public final void b(int n2, int n3) {
        super.b(n2, n3);
        MintegralVideoView mintegralVideoView = this.b;
        if (mintegralVideoView != null) {
            mintegralVideoView.b(n2, n3);
        }
    }

    @Override
    public final boolean c() {
        MintegralVideoView mintegralVideoView = this.b;
        if (mintegralVideoView != null) {
            return mintegralVideoView.c();
        }
        return super.c();
    }

    @Override
    public final void e() {
        MintegralVideoView mintegralVideoView = this.b;
        if (mintegralVideoView != null) {
            mintegralVideoView.e();
            return;
        }
        super.e();
    }

    @Override
    public final void g() {
        MintegralVideoView mintegralVideoView = this.b;
        if (mintegralVideoView != null) {
            mintegralVideoView.g();
            return;
        }
        super.g();
    }

    @Override
    public final int getBorderViewHeight() {
        MintegralVideoView mintegralVideoView = this.b;
        if (mintegralVideoView != null) {
            return mintegralVideoView.getBorderViewHeight();
        }
        return super.getBorderViewHeight();
    }

    @Override
    public final int getBorderViewLeft() {
        MintegralVideoView mintegralVideoView = this.b;
        if (mintegralVideoView != null) {
            return mintegralVideoView.getBorderViewLeft();
        }
        return super.getBorderViewLeft();
    }

    @Override
    public final int getBorderViewRadius() {
        MintegralVideoView mintegralVideoView = this.b;
        if (mintegralVideoView != null) {
            return mintegralVideoView.getBorderViewRadius();
        }
        return super.getBorderViewRadius();
    }

    @Override
    public final int getBorderViewTop() {
        MintegralVideoView mintegralVideoView = this.b;
        if (mintegralVideoView != null) {
            return mintegralVideoView.getBorderViewTop();
        }
        return super.getBorderViewTop();
    }

    @Override
    public final int getBorderViewWidth() {
        MintegralVideoView mintegralVideoView = this.b;
        if (mintegralVideoView != null) {
            return mintegralVideoView.getBorderViewWidth();
        }
        return super.getBorderViewWidth();
    }

    @Override
    public final String getCurrentProgress() {
        MintegralVideoView mintegralVideoView = this.b;
        if (mintegralVideoView != null) {
            return mintegralVideoView.getCurrentProgress();
        }
        return super.getCurrentProgress();
    }

    @Override
    public final void setCover(boolean bl) {
        MintegralVideoView mintegralVideoView = this.b;
        if (mintegralVideoView != null) {
            mintegralVideoView.setCover(bl);
            return;
        }
        super.setCover(bl);
    }

    @Override
    public final void setVisible(int n2) {
        MintegralVideoView mintegralVideoView = this.b;
        if (mintegralVideoView != null) {
            mintegralVideoView.setVisible(n2);
            return;
        }
        super.setVisible(n2);
    }
}

