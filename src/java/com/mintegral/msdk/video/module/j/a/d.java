/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.text.TextUtils
 *  com.mintegral.msdk.video.module.j.b
 *  com.mintegral.msdk.video.module.k.a
 *  f.f.a.e.b.b
 *  f.f.a.e.c.a
 *  f.f.a.g.b
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.mintegral.msdk.video.module.j.a;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.mintegral.msdk.video.module.j.a.k;
import com.mintegral.msdk.video.module.j.b;
import f.f.a.s.f.a;

public class d
extends k {
    public d(f.f.a.e.e.a a2, a a3, f.f.a.s.b.d d2, String string, String string2, b b2, int n2, boolean bl) {
        super(a2, a3, d2, string, string2, b2, n2, bl);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @Override
    public void a(int var1, Object var2_2) {
        super.a(var1, var2_2);
        if (this.a == false) return;
        if (var1 == 100) return;
        if (var1 == 101) return;
        if (var1 == 103) return;
        if (var1 == 113) ** GOTO lbl-1000
        if (var1 == 122) ** GOTO lbl22
        switch (var1) {
            default: {
                switch (var1) {
                    default: {
                        return;
                    }
                    case 110: {
                        this.b(1);
                    }
                    case 111: {
                        this.a(1);
                        return;
                    }
                    case 109: 
                }
                this.b(2);
                this.a(2);
                return;
            }
lbl22: // 1 sources:
            this.a();
            return;
            case 105: 
            case 106: lbl-1000: // 2 sources:
            {
                com.mintegral.msdk.video.module.k.a.d((Context)f.f.a.e.c.a.i().e(), (f.f.a.e.e.a)this.b);
                if (var1 == 105) return;
                var3_3 = this.b.u0();
                if (!TextUtils.isEmpty((CharSequence)var3_3)) {
                    if (!var3_3.contains((CharSequence)f.f.a.e.b.b.h)) {
                        var5_4 = new StringBuilder();
                        var5_4.append(var3_3);
                        var5_4.append("&");
                        var5_4.append(f.f.a.e.b.b.h);
                        var5_4.append("=2");
                        var3_3 = var5_4.toString();
                    } else {
                        var10_5 = Uri.parse((String)var3_3).getQueryParameter(f.f.a.e.b.b.h);
                        var11_6 = new StringBuilder();
                        var11_6.append(f.f.a.e.b.b.h);
                        var11_6.append("=");
                        var11_6.append(var10_5);
                        var15_7 = var11_6.toString();
                        var16_8 = new StringBuilder();
                        var16_8.append(f.f.a.e.b.b.h);
                        var16_8.append("=2");
                        var3_3 = var3_3.replace((CharSequence)var15_7, (CharSequence)var16_8.toString());
                    }
                }
                var4_9 = var3_3;
                f.f.a.g.b.a((Context)f.f.a.e.c.a.i().e(), (f.f.a.e.e.a)this.b, (String)this.e, (String)var4_9, (boolean)true, (boolean)false);
            }
            case 107: 
        }
    }
}

