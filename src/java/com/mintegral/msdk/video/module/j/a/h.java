/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.mintegral.msdk.video.module.j.b
 *  java.lang.Object
 *  java.lang.String
 */
package com.mintegral.msdk.video.module.j.a;

import com.mintegral.msdk.video.module.j.a.k;
import com.mintegral.msdk.video.module.j.b;
import f.f.a.s.b.d;
import f.f.a.s.f.a;

public final class h
extends k {
    public h(f.f.a.e.e.a a2, a a3, d d2, String string, String string2, b b2, int n2, boolean bl) {
        super(a2, a3, d2, string, string2, b2, n2, bl);
    }

    @Override
    public final void a(int n2, Object object) {
        block6 : {
            block2 : {
                block3 : {
                    block4 : {
                        int n3;
                        String string;
                        block7 : {
                            block5 : {
                                if (n2 == 100) break block2;
                                if (n2 == 109) break block3;
                                if (n2 == 122) break block4;
                                string = "";
                                if (n2 == 118) break block5;
                                if (n2 != 119) break block6;
                                if (object != null && object instanceof String) {
                                    string = (String)object;
                                }
                                n3 = 4;
                                break block7;
                            }
                            if (object != null && object instanceof String) {
                                string = (String)object;
                            }
                            n3 = 3;
                        }
                        this.a(n3, string);
                        break block6;
                    }
                    this.a();
                    break block6;
                }
                this.b(2);
                break block6;
            }
            this.g();
            this.f();
            this.e();
            this.a(2);
        }
        super.a(n2, object);
    }
}

