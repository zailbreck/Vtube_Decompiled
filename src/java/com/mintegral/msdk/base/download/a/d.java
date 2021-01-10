/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Future
 */
package com.mintegral.msdk.base.download.a;

import com.mintegral.msdk.base.download.DownloadProgress;
import com.mintegral.msdk.base.download.a.f;
import com.mintegral.msdk.base.download.a.i;
import com.mintegral.msdk.base.download.a.j;
import com.mintegral.msdk.base.download.l;
import com.mintegral.msdk.base.download.m;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

public final class d<T> {
    private com.mintegral.msdk.base.download.f a;
    private long b;
    private long c = 0L;
    private long d;
    private long e;
    private long f;
    private m g;
    private l h;
    private String i;
    private com.mintegral.msdk.base.download.j j;
    private com.mintegral.msdk.base.download.d<T> k;
    private int l;
    private String m;
    private int n;
    private String o;
    private String p;
    private long q;

    d(com.mintegral.msdk.base.download.a.e<T> e2) {
        this.a = e2.a;
        this.d = e2.b;
        this.f = e2.c;
        this.k = e2.f;
        this.e = e2.g;
        this.h = e2.h;
        this.g = e2.i;
        this.o = e2.j;
        this.p = e2.k;
        this.q = e2.m;
    }

    static /* synthetic */ void b(d d2) {
        d2.g = null;
        d2.h = null;
        f.b.a().b(d2);
    }

    public final com.mintegral.msdk.base.download.f a() {
        return this.a;
    }

    public final void a(int n2) {
        this.n = n2;
    }

    public final void a(long l2) {
        this.b = l2;
    }

    public final void a(final com.mintegral.msdk.base.download.d<T> d2) {
        if (this.j != com.mintegral.msdk.base.download.j.f) {
            this.j = com.mintegral.msdk.base.download.j.e;
            i.b().a().b().execute(new Runnable(){

                public final void run() {
                    if (d.this.h != null) {
                        d.this.h.b(d2);
                    }
                    d.b(d.this);
                }
            });
        }
    }

    public final void a(final com.mintegral.msdk.base.download.d<T> d2, final DownloadProgress downloadProgress) {
        if (this.j != com.mintegral.msdk.base.download.j.f) {
            i.b().a().b().execute(new Runnable(){

                public final void run() {
                    if (d.this.g != null) {
                        d.this.g.a(d2, downloadProgress);
                    }
                }
            });
        }
    }

    public final void a(final com.mintegral.msdk.base.download.d<T> d2, final com.mintegral.msdk.base.download.b b2) {
        if (this.j != com.mintegral.msdk.base.download.j.f) {
            this.j = com.mintegral.msdk.base.download.j.g;
            i.b().a().b().execute(new Runnable(){

                public final void run() {
                    if (d.this.h != null) {
                        d.this.h.a(d2, b2);
                    }
                    d.b(d.this);
                }
            });
        }
    }

    public final void a(com.mintegral.msdk.base.download.j j2) {
        this.j = j2;
    }

    public final void a(String string) {
        this.m = string;
    }

    public final void a(Future future) {
    }

    public final long b() {
        return this.b;
    }

    public final void b(int n2) {
        this.l = n2;
    }

    public final void b(long l2) {
        this.c = l2;
    }

    public final void b(final com.mintegral.msdk.base.download.d<T> d2) {
        if (this.j != com.mintegral.msdk.base.download.j.f) {
            i.b().a().b().execute(new Runnable(){

                public final void run() {
                    if (d.this.h != null) {
                        d.this.h.a(d2);
                    }
                }
            });
        }
    }

    public final long c() {
        return this.c;
    }

    public final long d() {
        return this.d;
    }

    public final long e() {
        return this.f;
    }

    public final String f() {
        return this.i;
    }

    public final com.mintegral.msdk.base.download.j g() {
        return this.j;
    }

    public final String h() {
        this.i = com.mintegral.msdk.base.download.e.b.a().a(this.k.f());
        f.b.a().a(this);
        return this.i;
    }

    public final com.mintegral.msdk.base.download.d<T> i() {
        return this.k;
    }

    public final String j() {
        return this.m;
    }

    public final int k() {
        return this.n;
    }

    public final long l() {
        return this.e;
    }

    public final String m() {
        return this.o;
    }

    public final String n() {
        return this.p;
    }

    public final int o() {
        return this.l;
    }

    public final long p() {
        return this.q;
    }

}

