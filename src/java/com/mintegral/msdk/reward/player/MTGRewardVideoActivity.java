/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.View
 *  com.mintegral.msdk.reward.player.MTGRewardVideoActivity$a
 *  com.mintegral.msdk.video.bt.module.f.a
 *  com.mintegral.msdk.video.bt.module.g.f
 *  f.f.a.a
 *  f.f.a.e.c.a
 *  f.f.a.e.f.h
 *  f.f.a.e.f.o
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.List
 *  java.util.Map
 */
package com.mintegral.msdk.reward.player;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.mintegral.msdk.reward.player.MTGRewardVideoActivity;
import com.mintegral.msdk.video.bt.module.MTGTempContainer;
import com.mintegral.msdk.video.bt.module.MintegralBTContainer;
import com.mintegral.msdk.video.bt.module.g.f;
import f.f.a.e.f.h;
import f.f.a.e.f.o;
import f.f.a.r.b.k.c;
import f.f.a.s.a;
import f.f.a.s.b.d;
import f.f.a.s.d.b;
import java.util.List;
import java.util.Map;

public class MTGRewardVideoActivity
extends f.f.a.r.b.c.a {
    public static String A = "reward";
    public static String B = "mute";
    public static String C = "isIV";
    public static String D = "isBid";
    public static String E = "isBigOffer";
    public static String F = "hasRelease";
    public static String G = "ivRewardMode";
    public static String H = "ivRewardValueType";
    public static String I = "ivRewardValue";
    public static String y = "unitId";
    public static String z = "userId";
    private String c;
    private String d;
    private String e;
    private d f;
    private int g = 2;
    private boolean h = false;
    private boolean i = false;
    private int j;
    private int k;
    private int l;
    private boolean m = false;
    private f n;
    private f.f.a.s.d.c o;
    private boolean p = false;
    private f.f.a.s.f.a q;
    private f.f.a.e.e.a r;
    private List<f.f.a.s.f.a> s;
    private List<f.f.a.e.e.a> t;
    private MTGTempContainer u;
    private MintegralBTContainer v;
    private f.f.a.k.g.b w;
    private com.mintegral.msdk.video.bt.module.f.a x;

    private void b() {
        int n2 = this.a("mintegral_temp_container");
        if (n2 < 0) {
            this.c("no id mintegral_bt_container in mintegral_more_offer_activity layout");
        }
        this.u = (MTGTempContainer)this.findViewById(n2);
        if (this.u == null) {
            this.c("env error");
        }
        this.u.setVisibility(0);
        this.u.setActivity(this);
        this.u.setBidCampaign(this.i);
        this.u.setBigOffer(this.m);
        this.u.setCampaign(this.r);
        this.u.setCampaignDownLoadTask(this.q);
        this.u.setIV(this.h);
        this.u.a(this.j, this.k, this.l);
        this.u.setMute(this.g);
        this.u.setReward(this.f);
        this.u.setRewardUnitSetting(this.o);
        this.u.setUnitId(this.c);
        this.u.setPlacementId(this.d);
        this.u.setUserId(this.e);
        this.u.setShowRewardListener(this.n);
        this.u.a((Context)this);
        this.u.m();
        f.f.a.n.c.a.c(f.f.a.e.c.a.i().e(), "showBTOld", this.c, this.i, "");
    }

    private void c(String string) {
        h.d((String)"MTGRewardVideoActivity", (String)string);
        f f2 = this.n;
        if (f2 != null) {
            f2.b(string);
        }
        this.finish();
    }

    public int a(String string) {
        return o.a((Context)this.getApplicationContext(), (String)string, (String)"id");
    }

    public int b(String string) {
        return o.a((Context)this.getApplicationContext(), (String)string, (String)"layout");
    }

    public void finish() {
        MintegralBTContainer mintegralBTContainer;
        Activity.super.finish();
        f.f.a.e.c.a.i().a(0);
        MTGTempContainer mTGTempContainer = this.u;
        if (mTGTempContainer != null) {
            mTGTempContainer.b();
            this.u = null;
        }
        if ((mintegralBTContainer = this.v) != null) {
            mintegralBTContainer.b();
            this.v = null;
        }
    }

    @Override
    public void onBackPressed() {
        MintegralBTContainer mintegralBTContainer;
        super.onBackPressed();
        MTGTempContainer mTGTempContainer = this.u;
        if (mTGTempContainer != null) {
            mTGTempContainer.l();
        }
        if ((mintegralBTContainer = this.v) != null) {
            mintegralBTContainer.e();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    protected void onCreate(Bundle bundle) {
        String string;
        String string2;
        block25 : {
            block24 : {
                f.f.a.s.f.c c2;
                int n2;
                block23 : {
                    block22 : {
                        Activity.super.onCreate(bundle);
                        try {
                            int n3 = this.b("mintegral_more_offer_activity");
                            if (n3 < 0) {
                                MTGRewardVideoActivity.super.c("no mintegral_more_offer_activity layout");
                                return;
                            }
                            this.setContentView(n3);
                            Intent intent = this.getIntent();
                            this.c = intent.getStringExtra(y);
                            boolean bl = TextUtils.isEmpty((CharSequence)this.c);
                            if (bl) {
                                MTGRewardVideoActivity.super.c("data empty error");
                                return;
                            }
                            this.n = (f)f.f.a.n.b.a.F.get((Object)this.c);
                            this.d = intent.getStringExtra(f.f.a.a.j);
                            this.f = d.a(intent.getStringExtra(A));
                            this.e = intent.getStringExtra(z);
                            this.g = intent.getIntExtra(B, 2);
                            this.h = intent.getBooleanExtra(C, false);
                            f.f.a.e.c.a a2 = f.f.a.e.c.a.i();
                            boolean bl2 = this.h;
                            n2 = 287;
                            int n4 = bl2 ? 287 : 94;
                            a2.a(n4);
                            this.i = intent.getBooleanExtra(D, false);
                            if (this.h) {
                                this.j = intent.getIntExtra(G, 0);
                                this.k = intent.getIntExtra(H, 0);
                                this.l = intent.getIntExtra(I, 0);
                            }
                            this.b = new c((Activity)this);
                            this.a(this.b);
                            if (this.n == null) {
                                MTGRewardVideoActivity.super.c("showRewardListener is null");
                                return;
                            }
                            this.o = f.f.a.n.b.a.a();
                            if (this.o == null) {
                                this.o = b.c().a(f.f.a.e.c.a.i().f(), this.c);
                                if (this.o == null) {
                                    this.o = b.c().a(f.f.a.e.c.a.i().f(), this.c, this.h);
                                }
                            }
                            int n5 = o.a((Context)this, (String)"mintegral_reward_activity_open", (String)"anim");
                            int n6 = o.a((Context)this, (String)"mintegral_reward_activity_stay", (String)"anim");
                            if (n5 > 1 && n6 > 1) {
                                this.overridePendingTransition(n5, n6);
                            }
                            if (bundle != null) {
                                try {
                                    this.p = bundle.getBoolean(F);
                                }
                                catch (Exception exception) {
                                    exception.printStackTrace();
                                }
                            }
                            this.m = intent.getBooleanExtra(E, false);
                            if (!this.m) {
                                c2 = f.f.a.s.f.c.a();
                                if (!this.h) break block22;
                                break block23;
                            }
                            this.s = f.f.a.s.f.c.a().b(this.c);
                            this.t = f.f.a.s.f.c.a().a(this.c);
                            List<f.f.a.e.e.a> list = this.t;
                            if (list == null || this.t.size() <= 0) break block24;
                            f.f.a.e.e.a a3 = (f.f.a.e.e.a)this.t.get(0);
                            string = a3.p0();
                            string2 = a3.L0();
                            break block25;
                        }
                        catch (Throwable throwable) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("onCreate error");
                            stringBuilder.append((Object)throwable);
                            MTGRewardVideoActivity.super.c(stringBuilder.toString());
                            return;
                        }
                    }
                    n2 = 94;
                }
                this.q = c2.a(n2, this.c, this.i);
                if (this.q != null) {
                    this.r = this.q.l();
                    this.q.a(true);
                    this.q.b(false);
                }
                if (this.q == null || this.r == null || this.f == null) {
                    MTGRewardVideoActivity.super.c("data empty error");
                }
                MTGRewardVideoActivity.super.b();
                return;
            }
            string = string2 = "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.c);
        stringBuilder.append("_");
        stringBuilder.append(string2);
        stringBuilder.append("_");
        stringBuilder.append(string);
        a.a a4 = f.f.a.s.a.a(stringBuilder.toString());
        f.f.a.k.g.b b2 = a4 != null ? a4.a() : null;
        this.w = b2;
        if (this.w == null) {
            if (this.s != null && this.s.size() > 0) {
                this.q = (f.f.a.s.f.a)this.s.get(0);
                if (this.q != null) {
                    this.r = this.q.l();
                    this.q.a(true);
                    this.q.b(false);
                }
            }
            if (this.q == null || this.r == null || this.f == null) {
                MTGRewardVideoActivity.super.c("data empty error");
            }
            this.m = false;
            MTGRewardVideoActivity.super.b();
            return;
        }
        int n7 = this.a("mintegral_bt_container");
        if (n7 < 0) {
            MTGRewardVideoActivity.super.c("no mintegral_webview_framelayout in mintegral_more_offer_activity layout");
        }
        this.v = (MintegralBTContainer)this.findViewById(n7);
        if (this.v == null) {
            MTGRewardVideoActivity.super.c("env error");
        }
        this.v.setVisibility(0);
        if (this.x == null) {
            this.x = new a((MTGRewardVideoActivity)this);
        }
        this.x = this.x;
        this.v.setBTContainerCallback(this.x);
        this.v.setShowRewardVideoListener(this.n);
        this.v.setCampaigns(this.t);
        this.v.setCampaignDownLoadTasks(this.s);
        this.v.setRewardUnitSetting(this.o);
        this.v.setUnitId(this.c);
        this.v.setPlacementId(this.d);
        this.v.setUserId(this.e);
        this.v.setActivity((Activity)this);
        this.v.setReward(this.f);
        this.v.a(this.j, this.k, this.l);
        this.v.setIV(this.h);
        this.v.setMute(this.g);
        this.v.setJSFactory((c)this.b);
        this.v.a((Context)this);
        this.v.f();
        f.f.a.n.c.a.c(f.f.a.e.c.a.i().e(), "showMoreOffer", this.c, this.i, "");
    }

    @Override
    public void onDestroy() {
        MintegralBTContainer mintegralBTContainer;
        super.onDestroy();
        MTGTempContainer mTGTempContainer = this.u;
        if (mTGTempContainer != null) {
            mTGTempContainer.b();
            this.u = null;
        }
        if ((mintegralBTContainer = this.v) != null) {
            mintegralBTContainer.b();
            this.v = null;
        }
    }

    @Override
    public void onPause() {
        MintegralBTContainer mintegralBTContainer;
        super.onPause();
        MTGTempContainer mTGTempContainer = this.u;
        if (mTGTempContainer != null) {
            mTGTempContainer.c();
        }
        if ((mintegralBTContainer = this.v) != null) {
            mintegralBTContainer.c();
        }
    }

    @Override
    public void onResume() {
        MintegralBTContainer mintegralBTContainer;
        super.onResume();
        MTGTempContainer mTGTempContainer = this.u;
        if (mTGTempContainer != null) {
            mTGTempContainer.d();
        }
        if ((mintegralBTContainer = this.v) != null) {
            mintegralBTContainer.d();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        bundle.putBoolean(F, this.p);
        Activity.super.onSaveInstanceState(bundle);
    }

    protected void onStop() {
        Activity.super.onStop();
    }
}

