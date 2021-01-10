/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.mintegral.msdk.video.module.MintegralVideoView
 *  com.mintegral.msdk.video.module.MintegralVideoView$f
 *  com.mintegral.msdk.video.module.j.b
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.mintegral.msdk.video.module.j.a;

import com.mintegral.msdk.video.module.MintegralVideoView;
import com.mintegral.msdk.video.module.j.a.k;
import com.mintegral.msdk.video.module.j.a.o;
import com.mintegral.msdk.video.module.j.b;
import f.f.a.r.b.f;
import f.f.a.r.b.i;
import f.f.a.r.b.j;
import f.f.a.s.b.d;
import f.f.a.s.f.a;

public final class n
extends o {
    private f.f.a.r.b.k.a t;
    private int u;
    private boolean v = false;

    public n(f.f.a.r.b.k.a a2, f.f.a.e.e.a a3, d d2, a a4, String string, String string2, int n2, int n3, b b2, double d3, int n4, boolean bl) {
        super(a3, d2, a4, string, string2, b2, d3, n4, bl);
        this.t = a2;
        this.u = n2;
        boolean bl2 = n3 == 0;
        this.v = bl2;
        if (a2 == null) {
            this.a = false;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public final void a(int var1, Object var2_2) {
        block34 : {
            block35 : {
                block36 : {
                    block37 : {
                        if (!this.a) break block34;
                        var3_3 = 1;
                        if (var1 == var3_3) break block35;
                        if (var1 == 2) break block36;
                        if (var1 == 5) break block37;
                        var9_4 = 6;
                        if (var1 == var9_4) break block36;
                        if (var1 != 8) {
                            if (var1 != 114) {
                                if (var1 != 116) {
                                    switch (var1) {
                                        default: {
                                            switch (var1) {
                                                default: {
                                                    ** break;
                                                }
                                                case 125: {
                                                    this.t.getJSContainerModule().d();
                                                    ** break;
                                                }
                                                case 123: 
                                                case 124: 
                                            }
                                            var14_5 = this.t.getJSNotifyProxy();
                                            if (var1 == 123) {
                                                var9_4 = 7;
                                            }
                                            var14_5.a(var9_4, "");
                                            ** break;
                                        }
                                        case 15: {
                                            if (var2_2 == null || !(var2_2 instanceof MintegralVideoView.f)) break;
                                            var13_6 = (MintegralVideoView.f)var2_2;
                                            this.v = var3_3;
                                            this.t.getJSNotifyProxy().a(var13_6);
                                            ** break;
                                        }
                                        case 14: {
                                            if (this.v) break;
                                            this.t.getJSVideoModule().a(0, var3_3);
                                            ** break;
                                        }
                                        case 13: {
                                            if (!this.t.getJSVideoModule().c()) {
                                                this.t.getJSVideoModule().a(0, 2);
                                            }
                                            this.t.getJSNotifyProxy().a(-1);
                                            ** break;
                                        }
                                        case 11: 
                                        case 12: {
                                            this.t.getJSVideoModule().a(3);
                                            if (this.b.e1() != 3) {
                                                this.t.getJSVideoModule().setVisible(8);
                                            } else {
                                                this.t.getJSVideoModule().setVisible(0);
                                            }
                                            if (var1 == 12) {
                                                var3_3 = 2;
                                            }
                                            this.t.getJSNotifyProxy().a(var3_3);
                                            if (this.t.getJSCommon().e() == 2) {
                                                this.t.getJSVideoModule().setVisible(0);
                                                var12_7 = this.t.getJSVideoModule();
                                                this.t.getJSContainerModule().a(var12_7.getBorderViewTop(), var12_7.getBorderViewLeft(), var12_7.getBorderViewWidth(), var12_7.getBorderViewHeight(), var12_7.getBorderViewRadius());
                                            } else {
                                                this.t.getJSContainerModule().b(this.b.e1());
                                            }
                                            this.t.getJSVideoModule().b();
                                            ** break;
                                        }
                                        case 10: {
                                            this.t.getJSNotifyProxy().a(0);
                                            ** break;
lbl60: // 8 sources:
                                            break;
                                        }
                                    }
                                } else {
                                    var11_8 = this.t.getJSVideoModule();
                                    this.t.getJSContainerModule().b(var11_8.getBorderViewWidth(), var11_8.getBorderViewHeight(), var11_8.getBorderViewRadius());
                                }
                            } else if (this.t.getJSCommon().e() == 2) {
                                var10_9 = this.t.getJSVideoModule();
                                this.t.getJSContainerModule().a(var10_9.getBorderViewTop(), var10_9.getBorderViewLeft(), var10_9.getBorderViewWidth(), var10_9.getBorderViewHeight(), var10_9.getBorderViewRadius());
                            }
                        } else if (!this.t.getJSContainerModule().h()) {
                            this.t.getJSVideoModule().e();
                        } else {
                            this.t.getJSVideoModule().g();
                        }
                        break block34;
                    }
                    if (var2_2 != null && var2_2 instanceof Integer) {
                        var4_10 = (Integer)var2_2 == var3_3 ? Integer.valueOf((int)2) : Integer.valueOf((int)var3_3);
                        this.t.getJSVideoModule().b(var4_10, -1);
                        var5_11 = this.t.getJSNotifyProxy();
                        var6_12 = new StringBuilder();
                        var6_12.append((Object)var4_10);
                        var6_12.append("");
                        var5_11.a(5, var6_12.toString());
                    }
                    break block34;
                }
                this.t.getJSVideoModule().b();
                if (var1 == 2) {
                    this.t.getJSNotifyProxy().a(2, "");
                }
                this.t.getJSVideoModule().a(3);
                if (this.t.getJSCommon().e() == 2) ** GOTO lbl-1000
                if (this.b.e1() != 3) {
                    this.t.getJSVideoModule().setVisible(8);
                } else {
                    this.t.getJSVideoModule().setVisible(0);
                }
                if (this.u == 2 && !this.t.getJSContainerModule().f()) {
                    this.t.getJSContainerModule().b(this.b.e1());
                } else lbl-1000: // 2 sources:
                {
                    var1 = 16;
                }
                this.t.getJSNotifyProxy().a(var3_3);
                break block34;
            }
            if (!this.t.getJSContainerModule().f()) {
                this.t.getJSNotifyProxy().a(var3_3, "");
            }
        }
        super.a(var1, var2_2);
    }
}

