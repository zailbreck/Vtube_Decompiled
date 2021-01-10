/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  com.mintegral.msdk.video.module.MintegralContainerView
 *  com.mintegral.msdk.video.module.MintegralVideoView
 *  com.mintegral.msdk.video.module.MintegralVideoView$f
 *  com.mintegral.msdk.video.module.j.a.m$a
 *  com.mintegral.msdk.video.module.j.b
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Timer
 *  java.util.TimerTask
 */
package com.mintegral.msdk.video.module.j.a;

import android.os.Handler;
import com.mintegral.msdk.video.module.MintegralContainerView;
import com.mintegral.msdk.video.module.MintegralVideoView;
import com.mintegral.msdk.video.module.j.a.k;
import com.mintegral.msdk.video.module.j.a.m;
import com.mintegral.msdk.video.module.j.a.o;
import com.mintegral.msdk.video.module.j.b;
import f.f.a.s.b.d;
import java.util.Timer;
import java.util.TimerTask;

public final class m
extends o {
    private MintegralVideoView t;
    private MintegralContainerView u;
    private int v;
    private Timer w;
    private Handler x = new Handler();
    private boolean y = false;
    private int z;

    public m(MintegralVideoView mintegralVideoView, MintegralContainerView mintegralContainerView, f.f.a.e.e.a a2, d d2, f.f.a.s.f.a a3, String string, String string2, int n2, int n3, b b2, double d3, int n4, boolean bl) {
        super(a2, d2, a3, string, string2, b2, d3, n4, bl);
        this.t = mintegralVideoView;
        this.u = mintegralContainerView;
        this.z = n2;
        this.v = n3;
        if (mintegralVideoView != null) {
            boolean bl2 = mintegralVideoView.getVideoSkipTime() == 0;
            this.y = bl2;
        }
        if (mintegralVideoView == null || mintegralContainerView == null) {
            this.a = false;
        }
    }

    static /* synthetic */ MintegralContainerView a(m m2) {
        return m2.u;
    }

    static /* synthetic */ MintegralVideoView b(m m2) {
        return m2.t;
    }

    static /* synthetic */ Handler c(m m2) {
        return m2.x;
    }

    private void i() {
        try {
            if (this.w != null) {
                this.w.cancel();
                this.w = null;
                return;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    @Override
    public final void a(int var1, Object var2_2) {
        block25 : {
            block26 : {
                block27 : {
                    block28 : {
                        block32 : {
                            block30 : {
                                block31 : {
                                    block29 : {
                                        if (!this.a) break block25;
                                        if (var1 == 1) break block26;
                                        if (var1 == 2) break block27;
                                        if (var1 == 5) break block28;
                                        if (var1 == 6) break block27;
                                        if (var1 == 8) break block29;
                                        switch (var1) {
                                            default: {
                                                ** break;
                                            }
                                            case 15: {
                                                if (var2_2 == null || !(var2_2 instanceof MintegralVideoView.f)) break;
                                                var10_3 = (MintegralVideoView.f)var2_2;
                                                var11_4 = this.u.getVideoInteractiveType();
                                                if (var11_4 >= 0 && var10_3.a >= var11_4) {
                                                    this.u.c(1);
                                                    this.t.b(0, 1);
                                                }
                                                this.y = var10_3.c;
                                                var12_5 = this.v;
                                                if (var12_5 < 0 || var10_3.a < var12_5 || this.y) break;
                                                this.t.a(0, 2);
                                                this.y = true;
                                                ** break;
                                            }
                                            case 14: {
                                                if (this.y) break;
                                                this.t.a(0, 1);
                                                ** break;
                                            }
                                            case 13: {
                                                this.t.a(0, 2);
                                                ** break;
                                            }
                                            case 11: 
                                            case 12: {
                                                this.t.a(3);
                                                this.t.b();
                                                if (this.b.e1() != 3) {
                                                    this.t.setVisibility(8);
                                                } else {
                                                    this.t.setVisibility(0);
                                                }
                                                ** GOTO lbl-1000
                                            }
                                            case 10: {
                                                this.t.b(0, 2);
                                                this.t.d(0, 2);
                                                ** break;
lbl42: // 5 sources:
                                                break;
                                            }
                                        }
                                        break block25;
                                    }
                                    var7_6 = this.u;
                                    if (var7_6 == null) break block30;
                                    if (var7_6.h()) break block31;
                                    var8_7 = this.t;
                                    if (var8_7 == null) break block25;
                                    break block32;
                                }
                                var9_8 = this.t;
                                if (var9_8 != null) {
                                    var9_8.g();
                                }
                                break block25;
                            }
                            var8_7 = this.t;
                            if (var8_7 == null) break block25;
                        }
                        var8_7.e();
                        break block25;
                    }
                    if (var2_2 != null && var2_2 instanceof Integer) {
                        var6_9 = (Integer)var2_2 == 1 ? Integer.valueOf((int)2) : Integer.valueOf((int)1);
                        this.t.b(var6_9.intValue(), -1);
                    }
                    break block25;
                }
                this.t.b();
                this.t.a(3);
                if (this.z == 2 && !this.u.f()) lbl-1000: // 3 sources:
                {
                    this.u.b(this.b.e1());
                } else {
                    var1 = 16;
                }
                break block25;
            }
            if (!this.u.f()) {
                var3_10 = this.u.getVideoInteractiveType();
                if (var3_10 != -2) {
                    if (var3_10 == -1) {
                        if (this.u.q()) {
                            this.u.c(1);
                            this.t.b(0, 1);
                            try {
                                m.super.i();
                                this.w = new Timer();
                                var5_11 = new a((m)this);
                                this.w.schedule((TimerTask)var5_11, 3000L);
                            }
                            catch (Exception var4_12) {
                                var4_12.printStackTrace();
                            }
                        } else {
                            this.u.c(-1);
                            this.t.b(0, 2);
                            m.super.i();
                        }
                    }
                } else if (this.u.r()) {
                    this.u.c(2);
                }
            }
        }
        super.a(var1, var2_2);
    }
}

