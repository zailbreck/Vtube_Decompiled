/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.mintegral.msdk.video.module.MintegralContainerView
 *  com.mintegral.msdk.video.module.MintegralVideoView
 *  com.mintegral.msdk.video.module.j.b
 *  java.lang.Object
 *  java.lang.String
 */
package com.mintegral.msdk.video.module.j.a;

import com.mintegral.msdk.video.module.MintegralContainerView;
import com.mintegral.msdk.video.module.MintegralVideoView;
import com.mintegral.msdk.video.module.j.a.d;
import com.mintegral.msdk.video.module.j.a.k;
import f.f.a.s.f.a;

public final class b
extends d {
    private MintegralVideoView l;
    private MintegralContainerView m;

    public b(MintegralVideoView mintegralVideoView, MintegralContainerView mintegralContainerView, f.f.a.e.e.a a2, f.f.a.s.b.d d2, a a3, String string, String string2, com.mintegral.msdk.video.module.j.b b2, int n2, boolean bl) {
        super(a2, a3, d2, string, string2, b2, n2, bl);
        this.l = mintegralVideoView;
        this.m = mintegralContainerView;
        if (mintegralVideoView == null || mintegralContainerView == null) {
            this.a = false;
        }
    }

    @Override
    public final void a(int n2, Object object) {
        block9 : {
            MintegralVideoView mintegralVideoView;
            block16 : {
                block14 : {
                    block15 : {
                        block10 : {
                            int n3;
                            MintegralVideoView mintegralVideoView2;
                            block13 : {
                                block11 : {
                                    block12 : {
                                        if (!this.a) break block9;
                                        if (n2 == 8) break block10;
                                        if (n2 == 103 || n2 == 105) break block9;
                                        n3 = 1;
                                        if (n2 == 107) break block11;
                                        if (n2 == 112) break block12;
                                        if (n2 != 115) {
                                            if (n2 != 100) {
                                                // empty if block
                                            }
                                        } else {
                                            this.m.a(this.l.getBorderViewWidth(), this.l.getBorderViewHeight(), this.l.getBorderViewRadius());
                                        }
                                        break block9;
                                    }
                                    this.l.setCover((boolean)n3);
                                    mintegralVideoView2 = this.l;
                                    n3 = 2;
                                    break block13;
                                }
                                this.m.c(-1);
                                this.l.setCover(false);
                                mintegralVideoView2 = this.l;
                            }
                            mintegralVideoView2.a(n3);
                            break block9;
                        }
                        MintegralContainerView mintegralContainerView = this.m;
                        if (mintegralContainerView == null) break block14;
                        if (mintegralContainerView.h()) break block15;
                        mintegralVideoView = this.l;
                        if (mintegralVideoView == null) break block9;
                        break block16;
                    }
                    MintegralVideoView mintegralVideoView3 = this.l;
                    if (mintegralVideoView3 != null) {
                        mintegralVideoView3.g();
                    }
                    break block9;
                }
                mintegralVideoView = this.l;
                if (mintegralVideoView == null) break block9;
            }
            mintegralVideoView.e();
        }
        super.a(n2, object);
    }
}

