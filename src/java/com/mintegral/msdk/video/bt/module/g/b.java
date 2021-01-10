/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.mintegral.msdk.video.bt.module.g.f
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package com.mintegral.msdk.video.bt.module.g;

import com.mintegral.msdk.video.bt.module.g.f;
import f.f.a.e.f.h;
import f.f.a.s.b.d;

public class b
implements f {
    public void a() {
        h.a("ShowRewardListener", "onAdShow");
    }

    public void a(int n2, String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onAutoLoad: ");
        stringBuilder.append(string3);
        h.a("ShowRewardListener", stringBuilder.toString());
    }

    public void a(String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onVideoComplete: ");
        stringBuilder.append(string3);
        h.a("ShowRewardListener", stringBuilder.toString());
    }

    public void a(boolean bl, int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onAdCloseWithIVReward: ");
        stringBuilder.append(bl);
        stringBuilder.append("  ");
        stringBuilder.append(n2);
        h.a("ShowRewardListener", stringBuilder.toString());
    }

    public void a(boolean bl, d d2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onAdClose:isCompleteView:");
        stringBuilder.append(bl);
        stringBuilder.append(",reward:");
        stringBuilder.append((Object)d2);
        h.a("ShowRewardListener", stringBuilder.toString());
    }

    public void a(boolean bl, String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onVideoAdClicked:");
        stringBuilder.append(string3);
        h.a("ShowRewardListener", stringBuilder.toString());
    }

    public void b(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onShowFail:");
        stringBuilder.append(string2);
        h.a("ShowRewardListener", stringBuilder.toString());
    }

    public void b(String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onEndcardShow: ");
        stringBuilder.append(string3);
        h.a("ShowRewardListener", stringBuilder.toString());
    }
}

