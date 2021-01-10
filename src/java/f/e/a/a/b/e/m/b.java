/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  org.json.JSONObject
 */
package f.e.a.a.b.e.m;

import f.e.a.a.b.e.l;
import f.e.a.a.b.e.m.a;
import f.e.a.a.b.e.m.c;
import f.e.a.a.b.f.f;
import f.e.a.a.b.j.e;
import org.json.JSONObject;

public final class b {
    private final l a;

    private b(l l2) {
        this.a = l2;
    }

    public static b a(f.e.a.a.b.e.b b2) {
        l l2 = (l)b2;
        e.a(b2, "AdSession is null");
        e.g(l2);
        e.a(l2);
        e.b(l2);
        e.e(l2);
        b b3 = new b(l2);
        l2.k().a(b3);
        return b3;
    }

    private void b(float f2) {
        if (!(f2 <= 0.0f)) {
            return;
        }
        throw new IllegalArgumentException("Invalid Media duration");
    }

    private void c(float f2) {
        if (!(f2 < 0.0f) && !(f2 > 1.0f)) {
            return;
        }
        throw new IllegalArgumentException("Invalid Media volume");
    }

    public void a() {
        e.c(this.a);
        this.a.k().a("bufferFinish");
    }

    public void a(float f2) {
        b.super.c(f2);
        e.c(this.a);
        JSONObject jSONObject = new JSONObject();
        f.e.a.a.b.j.b.a(jSONObject, "mediaPlayerVolume", (Object)Float.valueOf((float)f2));
        f.e.a.a.b.j.b.a(jSONObject, "deviceVolume", (Object)Float.valueOf((float)f.d().c()));
        this.a.k().a("volumeChange", jSONObject);
    }

    public void a(float f2, float f3) {
        b.super.b(f2);
        b.super.c(f3);
        e.c(this.a);
        JSONObject jSONObject = new JSONObject();
        f.e.a.a.b.j.b.a(jSONObject, "duration", (Object)Float.valueOf((float)f2));
        f.e.a.a.b.j.b.a(jSONObject, "mediaPlayerVolume", (Object)Float.valueOf((float)f3));
        f.e.a.a.b.j.b.a(jSONObject, "deviceVolume", (Object)Float.valueOf((float)f.d().c()));
        this.a.k().a("start", jSONObject);
    }

    public void a(a a2) {
        e.a((Object)a2, "InteractionType is null");
        e.c(this.a);
        JSONObject jSONObject = new JSONObject();
        f.e.a.a.b.j.b.a(jSONObject, "interactionType", (Object)a2);
        this.a.k().a("adUserInteraction", jSONObject);
    }

    public void a(c c2) {
        e.a((Object)c2, "PlayerState is null");
        e.c(this.a);
        JSONObject jSONObject = new JSONObject();
        f.e.a.a.b.j.b.a(jSONObject, "state", (Object)c2);
        this.a.k().a("playerStateChange", jSONObject);
    }

    public void b() {
        e.c(this.a);
        this.a.k().a("bufferStart");
    }

    public void c() {
        e.c(this.a);
        this.a.k().a("complete");
    }

    public void d() {
        e.c(this.a);
        this.a.k().a("firstQuartile");
    }

    public void e() {
        e.c(this.a);
        this.a.k().a("midpoint");
    }

    public void f() {
        e.c(this.a);
        this.a.k().a("pause");
    }

    public void g() {
        e.c(this.a);
        this.a.k().a("resume");
    }

    public void h() {
        e.c(this.a);
        this.a.k().a("skipped");
    }

    public void i() {
        e.c(this.a);
        this.a.k().a("thirdQuartile");
    }
}

