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
package f.e.a.a.a.d.j;

import f.e.a.a.a.d.b;
import f.e.a.a.a.d.i;
import f.e.a.a.a.d.j.a;
import f.e.a.a.a.d.j.c;
import f.e.a.a.a.g.e;
import org.json.JSONObject;

public final class d {
    private final i a;

    private d(i i2) {
        this.a = i2;
    }

    public static d a(b b2) {
        i i2 = (i)b2;
        e.a(b2, "AdSession is null");
        e.g(i2);
        e.a(i2);
        e.b(i2);
        e.e(i2);
        d d2 = new d(i2);
        i2.l().a(d2);
        return d2;
    }

    private void b(float f2) {
        if (!(f2 <= 0.0f)) {
            return;
        }
        throw new IllegalArgumentException("Invalid Video duration");
    }

    private void c(float f2) {
        if (!(f2 < 0.0f) && !(f2 > 1.0f)) {
            return;
        }
        throw new IllegalArgumentException("Invalid Video volume");
    }

    public void a() {
        e.c(this.a);
        this.a.l().a("bufferFinish");
    }

    public void a(float f2) {
        d.super.c(f2);
        e.c(this.a);
        JSONObject jSONObject = new JSONObject();
        f.e.a.a.a.g.b.a(jSONObject, "videoPlayerVolume", (Object)Float.valueOf((float)f2));
        f.e.a.a.a.g.b.a(jSONObject, "deviceVolume", (Object)Float.valueOf((float)f.e.a.a.a.e.e.d().c()));
        this.a.l().a("volumeChange", jSONObject);
    }

    public void a(float f2, float f3) {
        d.super.b(f2);
        d.super.c(f3);
        e.c(this.a);
        JSONObject jSONObject = new JSONObject();
        f.e.a.a.a.g.b.a(jSONObject, "duration", (Object)Float.valueOf((float)f2));
        f.e.a.a.a.g.b.a(jSONObject, "videoPlayerVolume", (Object)Float.valueOf((float)f3));
        f.e.a.a.a.g.b.a(jSONObject, "deviceVolume", (Object)Float.valueOf((float)f.e.a.a.a.e.e.d().c()));
        this.a.l().a("start", jSONObject);
    }

    public void a(a a2) {
        e.a((Object)a2, "InteractionType is null");
        e.c(this.a);
        JSONObject jSONObject = new JSONObject();
        f.e.a.a.a.g.b.a(jSONObject, "interactionType", (Object)a2);
        this.a.l().a("adUserInteraction", jSONObject);
    }

    public void a(c c2) {
        e.a(c2, "VastProperties is null");
        e.b(this.a);
        this.a.l().a("loaded", c2.a());
    }

    public void b() {
        e.c(this.a);
        this.a.l().a("bufferStart");
    }

    public void c() {
        e.c(this.a);
        this.a.l().a("complete");
    }

    public void d() {
        e.c(this.a);
        this.a.l().a("firstQuartile");
    }

    public void e() {
        e.c(this.a);
        this.a.l().a("midpoint");
    }

    public void f() {
        e.c(this.a);
        this.a.l().a("pause");
    }

    public void g() {
        e.c(this.a);
        this.a.l().a("resume");
    }

    public void h() {
        e.c(this.a);
        this.a.l().a("skipped");
    }

    public void i() {
        e.c(this.a);
        this.a.l().a("thirdQuartile");
    }
}

