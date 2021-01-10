/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.webkit.WebView
 *  com.mintegral.msdk.video.module.b
 *  com.mintegral.msdk.video.module.e
 *  com.mintegral.msdk.video.module.f$a
 *  com.mintegral.msdk.video.module.f$b
 *  f.f.a.e.f.h
 *  f.f.a.g.c
 *  f.f.a.k.c.b
 *  java.lang.Exception
 *  java.lang.String
 */
package com.mintegral.msdk.video.module;

import android.content.Context;
import android.webkit.WebView;
import com.mintegral.msdk.video.module.e;
import com.mintegral.msdk.video.module.f;
import f.f.a.e.f.h;
import f.f.a.k.g.i;
import f.f.a.r.b.k.c;

/*
 * Exception performing whole class analysis.
 */
public class f
extends e {
    public f(Context context) {
        super(context);
    }

    public void a(Context context) {
        super.a(context);
    }

    public void a(c c2) {
        if (this.g) {
            this.m.setFilter((f.f.a.k.c.b)new /* Unavailable Anonymous Inner Class!! */);
        }
        super.a(c2);
        this.setVisibility(0);
        this.setCloseVisible(0);
    }

    protected final String p() {
        f.f.a.e.e.a a2 = ((com.mintegral.msdk.video.module.b)this).c;
        if (a2 != null) {
            return f.f.a.g.c.a((String)a2.F(), (String)"-999", (String)"-999");
        }
        return null;
    }

    public void y() {
        try {
            h.a((String)"MintegralBaseView", (String)"webviewshow");
            i.a().a((WebView)this.m, "webviewshow", "");
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }
}

