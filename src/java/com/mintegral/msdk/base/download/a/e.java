/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.mintegral.msdk.base.download.a.d
 *  com.mintegral.msdk.base.download.a.p
 *  com.mintegral.msdk.base.download.d
 *  com.mintegral.msdk.base.download.f
 *  com.mintegral.msdk.base.download.l
 *  com.mintegral.msdk.base.download.m
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.List
 */
package com.mintegral.msdk.base.download.a;

import com.mintegral.msdk.base.download.a.d;
import com.mintegral.msdk.base.download.a.p;
import com.mintegral.msdk.base.download.f;
import com.mintegral.msdk.base.download.l;
import com.mintegral.msdk.base.download.m;
import java.util.HashMap;
import java.util.List;

public final class e<T>
implements p<T> {
    f a = f.c;
    long b;
    long c;
    String d;
    HashMap<String, List<String>> e;
    com.mintegral.msdk.base.download.d<T> f;
    long g;
    l h;
    m i;
    String j;
    String k;
    int l;
    long m;

    public e(com.mintegral.msdk.base.download.d<T> d2) {
        this.f = d2;
    }

    public final d<T> a() {
        return new d(this);
    }

    public final e<T> a(long l2) {
        this.b = l2;
        return this;
    }

    public final p<T> a(f f2) {
        this.a = f2;
        return this;
    }

    public final p<T> a(l l2) {
        this.h = l2;
        return this;
    }

    public final e<T> b(long l2) {
        this.c = l2;
        return this;
    }

    public final p<T> b(String string2) {
        this.k = string2;
        return this;
    }
}

