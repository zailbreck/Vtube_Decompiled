/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Comparable
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.util.concurrent.FutureTask
 */
package com.mintegral.msdk.base.download.a;

import com.mintegral.msdk.base.download.a.h;
import com.mintegral.msdk.base.download.f;
import java.util.concurrent.FutureTask;

public final class c
extends FutureTask<h>
implements Comparable<c> {
    private final h b;

    c(h h2) {
        super((Runnable)h2, null);
        this.b = h2;
    }

    public final /* synthetic */ int compareTo(Object object) {
        c c2 = (c)((Object)object);
        h h2 = this.b;
        f f2 = h2.b;
        h h3 = c2.b;
        f f3 = h3.b;
        if (f2 == f3) {
            return h2.c - h3.c;
        }
        return f3.ordinal() - f2.ordinal();
    }
}

