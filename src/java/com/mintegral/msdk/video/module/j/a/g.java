/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  com.mintegral.msdk.video.module.j.b
 *  java.lang.Object
 */
package com.mintegral.msdk.video.module.j.a;

import android.content.res.Configuration;
import android.content.res.Resources;
import com.mintegral.msdk.video.module.d;
import com.mintegral.msdk.video.module.j.a.i;
import com.mintegral.msdk.video.module.j.b;

public final class g
extends i {
    private d b;

    public g(d d2, b b2) {
        super(b2);
        this.b = d2;
    }

    @Override
    public final void a(int n2, Object object) {
        boolean bl;
        switch (n2) {
            default: {
                bl = false;
                break;
            }
            case 103: {
                n2 = 107;
                bl = false;
                break;
            }
            case 101: 
            case 102: {
                bl = true;
                break;
            }
            case 100: {
                d d2 = this.b;
                bl = false;
                if (d2 == null) break;
                d2.y();
                d d3 = this.b;
                d3.a(d3.getResources().getConfiguration());
            }
        }
        if (!bl) {
            super.a(n2, object);
        }
    }
}

