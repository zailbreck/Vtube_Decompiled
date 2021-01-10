/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.mintegral.msdk.video.module.j.b
 *  f.f.a.e.f.h
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.mintegral.msdk.video.module.j.a;

import com.mintegral.msdk.video.module.j.a.d;
import com.mintegral.msdk.video.module.j.a.k;
import com.mintegral.msdk.video.module.j.b;
import f.f.a.e.f.h;
import f.f.a.r.b.i;
import f.f.a.r.b.j;
import f.f.a.r.b.n;
import f.f.a.s.f.a;

public final class c
extends d {
    private f.f.a.r.b.k.a l;

    public c(f.f.a.r.b.k.a a2, f.f.a.e.e.a a3, f.f.a.s.b.d d2, a a4, String string, String string2, b b2, int n2, boolean bl) {
        super(a3, a4, d2, string, string2, b2, n2, bl);
        this.l = a2;
        if (a2 == null) {
            this.a = false;
        }
    }

    @Override
    public final void a(int n2, Object object) {
        if (this.a) {
            if (n2 != 8) {
                if (n2 != 103) {
                    if (n2 != 105) {
                        if (n2 != 107) {
                            if (n2 != 112) {
                                if (n2 != 115) {
                                    if (n2 != 100) {
                                        // empty if block
                                    }
                                } else {
                                    n n3 = this.l.getJSVideoModule();
                                    this.l.getJSContainerModule().a(n3.getBorderViewWidth(), n3.getBorderViewHeight(), n3.getBorderViewRadius());
                                }
                            } else {
                                this.l.getJSVideoModule().setCover(true);
                                this.l.getJSVideoModule().a(2);
                            }
                        } else {
                            this.l.getJSContainerModule().c(-1);
                            this.l.getJSVideoModule().setCover(false);
                            this.l.getJSVideoModule().a(1);
                        }
                    } else {
                        String string = object.toString();
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("pt:");
                        stringBuilder.append(string);
                        h.d((String)"=======", (String)stringBuilder.toString());
                        this.l.getJSNotifyProxy().a(3, string);
                        n2 = -1;
                    }
                }
            } else if (!this.l.getJSContainerModule().h()) {
                this.l.getJSVideoModule().e();
            } else {
                this.l.getJSVideoModule().g();
            }
        }
        super.a(n2, object);
    }
}

