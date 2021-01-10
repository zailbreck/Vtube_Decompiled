/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.mintegral.msdk.video.bt.module.f.b
 *  com.mintegral.msdk.video.bt.module.g.b
 *  f.f.a.e.f.h
 *  java.lang.String
 */
package com.mintegral.msdk.video.bt.module.g;

import com.mintegral.msdk.video.bt.module.g.b;
import f.f.a.e.f.h;
import f.f.a.s.b.d;

public final class c
extends b {
    private com.mintegral.msdk.video.bt.module.f.b a;
    private String b;

    public c(com.mintegral.msdk.video.bt.module.f.b b2, String string) {
        this.a = b2;
        this.b = string;
    }

    public final void a() {
        if (this.a != null) {
            h.a((String)"H5ShowRewardListener", (String)"onAdShow");
            this.a.b(this.b);
        }
    }

    public final void a(int n2, String string, String string2) {
        if (this.a != null) {
            h.a((String)"H5ShowRewardListener", (String)"onAutoLoad");
            this.a.a(this.b, n2, string, string2);
        }
    }

    public final void a(String string, String string2) {
        if (this.a != null) {
            h.a((String)"H5ShowRewardListener", (String)"onVideoComplete");
            this.a.b(this.b, string, string2);
        }
    }

    public final void a(boolean bl, d d2) {
        if (this.a != null) {
            h.a((String)"H5ShowRewardListener", (String)"onAdClose");
            this.a.a(this.b, bl, d2);
        }
    }

    public final void a(boolean bl, String string, String string2) {
        if (this.a != null) {
            h.a((String)"H5ShowRewardListener", (String)"onVideoAdClicked");
            this.a.a(this.b, string, string2);
        }
    }

    public final void b(String string) {
        if (this.a != null) {
            h.a((String)"H5ShowRewardListener", (String)"onShowFail");
            this.a.a(this.b, string);
        }
    }

    public final void b(String string, String string2) {
        if (this.a != null) {
            h.a((String)"H5ShowRewardListener", (String)"onEndcardShow");
            this.a.c(this.b, string, string2);
        }
    }

    public final boolean b() {
        return false;
    }
}

