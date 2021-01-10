/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.mintegral.msdk.base.download.a.d
 *  com.mintegral.msdk.base.download.a.l
 *  com.mintegral.msdk.base.download.a.m
 *  com.mintegral.msdk.base.download.c.a
 *  com.mintegral.msdk.base.download.c.b
 *  com.mintegral.msdk.base.download.d
 *  com.mintegral.msdk.base.download.e.b
 *  com.mintegral.msdk.base.download.g.a
 *  com.mintegral.msdk.base.download.g.b
 *  com.mintegral.msdk.base.download.g.d
 *  com.mintegral.msdk.base.download.i
 *  java.io.File
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.mintegral.msdk.base.download.a;

import com.mintegral.msdk.base.download.a.d;
import com.mintegral.msdk.base.download.a.l;
import com.mintegral.msdk.base.download.a.m;
import com.mintegral.msdk.base.download.c.a;
import com.mintegral.msdk.base.download.g.b;
import com.mintegral.msdk.base.download.i;
import java.io.File;

final class k
implements m {
    private final d a;
    private final a b;
    private final com.mintegral.msdk.base.download.c.b c;
    private final String d;
    private com.mintegral.msdk.base.download.d e;

    private k(d d2, a a2, com.mintegral.msdk.base.download.c.b b2, String string2, com.mintegral.msdk.base.download.d d3) {
        this.a = d2;
        this.b = a2;
        this.c = b2;
        this.d = string2;
        this.e = d3;
    }

    static m a(d d2, a a2, com.mintegral.msdk.base.download.c.b b2, String string2, com.mintegral.msdk.base.download.d d3) {
        k k2 = new k(d2, a2, b2, string2, d3);
        return k2;
    }

    public final i a() {
        i i2;
        block4 : {
            File file;
            String string2;
            com.mintegral.msdk.base.download.g.a a2;
            block5 : {
                block2 : {
                    block3 : {
                        if (b.a((Object)this.b)) {
                            return null;
                        }
                        i2 = new i();
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(this.a.j());
                        stringBuilder.append(this.e.b());
                        file = new File(stringBuilder.toString());
                        if (!file.exists()) break block2;
                        if (com.mintegral.msdk.base.download.e.b.a().b(file) != this.b.g()) break block3;
                        if (com.mintegral.msdk.base.download.g.d.a((long)this.b.f(), (long)this.b.g()) >= this.e.c()) {
                            this.a.b(this.b.f());
                            this.a.a(this.b.g());
                            i2.a(true);
                            return i2;
                        }
                        this.a.a(this.b.g());
                        break block4;
                    }
                    this.a.a(0L);
                    a2 = l.f().a();
                    string2 = "\u79fb\u9664\u6570\u636e\u5e93\u4e2d\u7684\u6570\u636e\uff1a \u5927\u5c0f\u4e0d\u4e00\u81f4";
                    break block5;
                }
                this.a.a(0L);
                a2 = l.f().a();
                string2 = "\u79fb\u9664\u6570\u636e\u5e93\u4e2d\u7684\u6570\u636e\uff1a \u4e0d\u5b58\u5728\u6216\u8005\u6709\u95ee\u9898";
            }
            a2.a("DownloadTask", string2);
            this.c.b(this.d);
            com.mintegral.msdk.base.download.e.b.a().a(file);
        }
        i2.a(false);
        return i2;
    }
}

