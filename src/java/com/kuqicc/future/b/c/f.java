/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  java.io.File
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Throwable
 */
package com.kuqicc.future.b.c;

import android.app.Activity;
import android.content.Context;
import com.kuqicc.future.MainActivity;
import com.kuqicc.future.b.c.b;
import com.kuqicc.future.b.c.c;
import com.kuqicc.future.b.c.d;
import com.kuqicc.future.b.c.e;
import com.kuqicc.future.b.c.f;
import com.kuqicc.future.b.c.g;
import f.a.a.a.a.k.h;
import java.io.File;

public class f {
    private static f b;
    private f.a.a.a.a.c a;

    f() {
        f.a.a.a.a.h.f.b b2 = new f.a.a.a.a.h.f.b("https://app.v-tube.biz/api/getOSSToken");
        f.a.a.a.a.a a2 = new f.a.a.a.a.a();
        a2.a(15000);
        a2.d(15000);
        a2.b(5);
        a2.c(2);
        new Thread((Runnable)new b(this, b2)).start();
    }

    public static f a() {
        f f2 = b;
        if (f2 != null) {
            return f2;
        }
        b = new f();
        return b;
    }

    static /* synthetic */ void a(h.b.d d2, Throwable throwable) {
        d2.a(throwable);
    }

    private void a(String string, String string2, h.b.d<String> d2) {
        f.a.a.a.a.k.g g2 = new f.a.a.a.a.k.g("fvfile", string2, string);
        this.a.a(g2, new f.a.a.a.a.g.a<f.a.a.a.a.k.g, h>((f)this, d2){
            final /* synthetic */ h.b.d a;
            {
                this.a = d2;
            }

            public void a(f.a.a.a.a.k.g g2, f.a.a.a.a.b b2, f.a.a.a.a.f f2) {
                if (b2 != null) {
                    b2.printStackTrace();
                    this.a.a((Throwable)b2);
                }
                if (f2 != null) {
                    android.util.Log.e((String)"ErrorCode", (String)f2.a());
                    android.util.Log.e((String)"RequestId", (String)f2.d());
                    android.util.Log.e((String)"HostId", (String)f2.b());
                    android.util.Log.e((String)"RawMessage", (String)f2.c());
                    this.a.a((Throwable)f2);
                }
            }

            public void a(f.a.a.a.a.k.g g2, h h2) {
                this.a.b(g2.g());
                this.a.a();
            }
        });
    }

    public h.b.c<byte[]> a(String string) {
        return h.b.c.a(new e((f)this, new f.a.a.a.a.k.b("fvfile", string)));
    }

    public h.b.c<String> a(String string, String string2, boolean bl) {
        return h.b.c.a(new d((f)this, bl, string, string2));
    }

    public /* synthetic */ void a(f.a.a.a.a.h.f.c c2) {
        this.a = new f.a.a.a.a.d(MainActivity.b.getBaseContext(), "oss-ap-southeast-5.aliyuncs.com", c2);
    }

    public /* synthetic */ void a(f.a.a.a.a.k.b b2, h.b.d d2) {
        this.a.a(b2, new g((f)this, d2));
    }

    public /* synthetic */ void a(String string, h.b.d d2, File file) {
        f.super.a(file.getPath(), string, d2);
    }

    public /* synthetic */ void a(boolean bl, String string, String string2, h.b.d d2) {
        if (bl) {
            f.super.a(string, string2, d2);
            return;
        }
        com.kuqicc.future.b.b.c.a(string).a(new com.kuqicc.future.b.c.a((f)this, string2, d2), new c(d2));
    }
}

