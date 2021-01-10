/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.concurrent.ExecutorService
 */
package com.mintegral.msdk.base.download.a;

import com.mintegral.msdk.base.download.a.d;
import com.mintegral.msdk.base.download.a.g;
import com.mintegral.msdk.base.download.a.j;
import com.mintegral.msdk.base.download.a.l;
import com.mintegral.msdk.base.download.a.q;
import com.mintegral.msdk.base.download.b;
import com.mintegral.msdk.base.download.f;
import com.mintegral.msdk.base.download.g.a;
import com.mintegral.msdk.base.download.i;
import java.util.concurrent.ExecutorService;

public final class h
implements Runnable {
    public final f b;
    public final int c;
    public volatile d d;
    private volatile com.mintegral.msdk.base.download.d e;
    private com.mintegral.msdk.base.download.c.b f;

    h(d d2) {
        this.d = d2;
        this.b = d2.a();
        this.c = d2.o();
    }

    public final void run() {
        l.f().a().a("DownloadTask", "\u5f00\u59cb\u4e0b\u8f7d\u4efb\u52a1");
        if (this.d.g() != com.mintegral.msdk.base.download.j.i) {
            this.d.b(this.d.i());
        }
        this.d.a(com.mintegral.msdk.base.download.j.c);
        a a2 = l.f().a();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\u4efb\u52a1 ");
        stringBuilder.append(this.d.f());
        stringBuilder.append(" \u4fee\u6539\u72b6\u6001\u4e3a RUNNING");
        a2.a("DownloadTask", stringBuilder.toString());
        this.e = this.d.i();
        this.f = l.f().b();
        new q(this.d).a();
        String string = this.d.j();
        int n2 = this.d.k();
        com.mintegral.msdk.base.download.d d2 = this.e;
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(string);
        stringBuilder2.append(this.e.b());
        d2.a(stringBuilder2.toString());
        a a3 = l.f().a();
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("cacheDirectoryPath\uff1a ");
        stringBuilder3.append(string);
        stringBuilder3.append(" cacheDirectorPathType\uff1a ");
        stringBuilder3.append(n2);
        a3.a("DownloadTask", stringBuilder3.toString());
        i i2 = g.a(this.d, this.e, this.f).a();
        if (i2.b()) {
            this.d.a(this.e);
            return;
        }
        if (i2.a() != null) {
            this.d.a(this.e, i2.a());
            return;
        }
        if (i2.c()) {
            d d3 = this.d;
            com.mintegral.msdk.base.download.d d4 = this.e;
            com.mintegral.msdk.base.download.a.i.b().a().b().execute(new Runnable(d4){
                final /* synthetic */ com.mintegral.msdk.base.download.d b;
                {
                    this.b = d3;
                }

                public final void run() {
                    if (d.this.h != null) {
                        d.this.h.a(this.b, new b((java.lang.Exception)((Object)new java.io.IOException("Download task is cancelled"))));
                    }
                    d.b(d.this);
                }
            });
        }
    }
}

