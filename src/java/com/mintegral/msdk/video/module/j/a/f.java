/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.mintegral.msdk.video.module.j.b
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.mintegral.msdk.video.module.j.a;

import com.mintegral.msdk.video.module.j.b;
import f.f.a.e.f.h;

public class f
implements b {
    public void a(int n2, Object object) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onNotify,type=");
        stringBuilder.append(n2);
        stringBuilder.append(",pt=");
        stringBuilder.append(object);
        h.d("NotifyListener", stringBuilder.toString());
    }
}

