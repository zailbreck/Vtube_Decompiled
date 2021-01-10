/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.mintegral.msdk.playercommon.e
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.mintegral.msdk.playercommon;

import com.mintegral.msdk.playercommon.e;
import f.f.a.e.f.h;

public class a
implements e {
    public void a() {
        h.a("DefaultVideoFeedsPlayerListener", "onPlayCompleted");
    }

    public void a(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onPlayStarted:");
        stringBuilder.append(n2);
        h.a("DefaultVideoFeedsPlayerListener", stringBuilder.toString());
    }

    public void a(int n2, int n3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onPlayProgress:");
        stringBuilder.append(n2);
        stringBuilder.append(",allDuration:");
        stringBuilder.append(n3);
        h.a("DefaultVideoFeedsPlayerListener", stringBuilder.toString());
    }

    public void a(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onPlaySetDataSourceError:");
        stringBuilder.append(string2);
        h.a("DefaultVideoFeedsPlayerListener", stringBuilder.toString());
    }

    public void b() {
        h.a("DefaultVideoFeedsPlayerListener", "OnBufferingEnd");
    }

    public void b(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onPlayError:");
        stringBuilder.append(string2);
        h.a("DefaultVideoFeedsPlayerListener", stringBuilder.toString());
    }

    public void c(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OnBufferingStart:");
        stringBuilder.append(string2);
        h.a("DefaultVideoFeedsPlayerListener", stringBuilder.toString());
    }
}

