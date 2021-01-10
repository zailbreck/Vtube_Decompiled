/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  j.a0
 *  j.e
 *  j.f
 *  j.f0.b
 *  j.f0.e.d
 *  j.f0.f.g
 *  j.f0.g.c
 *  j.f0.j.f
 *  j.m
 *  j.n
 *  j.p
 *  j.p$c
 *  j.s
 *  j.t
 *  j.y
 *  java.io.IOException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.List
 */
package j;

import j.a0;
import j.e;
import j.f0.e.d;
import j.f0.f.g;
import j.f0.g.b;
import j.f0.g.c;
import j.f0.g.j;
import j.f0.j.f;
import j.m;
import j.n;
import j.p;
import j.s;
import j.t;
import j.v;
import j.y;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

final class x
implements e {
    final v b;
    final j c;
    private p d;
    final y e;
    final boolean f;
    private boolean g;

    private x(v v2, y y2, boolean bl) {
        this.b = v2;
        this.e = y2;
        this.f = bl;
        this.c = new j(v2, bl);
    }

    static /* synthetic */ p a(x x2) {
        return x2.d;
    }

    static x a(v v2, y y2, boolean bl) {
        x x2 = new x(v2, y2, bl);
        x2.d = v2.i().a((e)x2);
        return x2;
    }

    private void d() {
        Object object = f.c().a("response.body().close()");
        this.c.a(object);
    }

    a0 a() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.b.n());
        arrayList.add((Object)this.c);
        arrayList.add((Object)new j.f0.g.a(this.b.f()));
        arrayList.add((Object)new j.f0.e.a(this.b.o()));
        arrayList.add((Object)new j.f0.f.a(this.b));
        if (!this.f) {
            arrayList.addAll(this.b.p());
        }
        arrayList.add((Object)new b(this.f));
        j.f0.g.g g2 = new j.f0.g.g((List<t>)arrayList, null, null, null, 0, this.e, this, this.d, this.b.c(), this.b.w(), this.b.A());
        return g2.a(this.e);
    }

    String b() {
        return this.e.g().l();
    }

    String c() {
        StringBuilder stringBuilder = new StringBuilder();
        String string = this.m() ? "canceled " : "";
        stringBuilder.append(string);
        String string2 = this.f ? "web socket" : "call";
        stringBuilder.append(string2);
        stringBuilder.append(" to ");
        stringBuilder.append(this.b());
        return stringBuilder.toString();
    }

    public x clone() {
        return x.a(this.b, this.e, this.f);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public a0 execute() {
        Throwable throwable2222;
        block9 : {
            block8 : {
                x x2 = this;
                // MONITORENTER : x2
                if (this.g) throw new IllegalStateException("Already Executed");
                this.g = true;
                // MONITOREXIT : x2
                this.d();
                this.d.b((e)this);
                this.b.g().a(this);
                a0 a02 = this.a();
                if (a02 == null) break block8;
                this.b.g().b(this);
                return a02;
            }
            try {
                throw new IOException("Canceled");
            }
            catch (Throwable throwable2222) {
                break block9;
            }
            catch (IOException iOException) {
                this.d.a((e)this, iOException);
                throw iOException;
            }
        }
        this.b.g().b(this);
        throw throwable2222;
    }

    public boolean m() {
        return this.c.a();
    }

    final class a
    extends j.f0.b {
        private final j.f c;
        final /* synthetic */ x d;

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        protected void b() {
            block10 : {
                block7 : {
                    block9 : {
                        var1_1 = true;
                        try {
                            block8 : {
                                var9_2 = this.d.a();
                                var10_3 = this.d.c.a();
                                if (!var10_3) ** GOTO lbl10
                                try {
                                    this.c.a((e)this.d, new IOException("Canceled"));
                                    break block7;
lbl10: // 1 sources:
                                    this.c.a((e)this.d, var9_2);
                                    break block7;
                                }
                                catch (IOException var3_4) {
                                    break block8;
                                }
                                catch (IOException var2_7) {
                                    var3_5 = var2_7;
                                    var1_1 = false;
                                }
                            }
                            if (!var1_1) break block9;
                            var5_8 = f.c();
                            var6_9 = new StringBuilder();
                            var6_9.append("Callback failure for ");
                            var6_9.append(this.d.c());
                            var5_8.a(4, var6_9.toString(), (Throwable)var3_5);
                            break block7;
                        }
                        catch (Throwable var4_6) {
                            break block10;
                        }
                    }
                    x.a(this.d).a((e)this.d, var3_5);
                    this.c.a((e)this.d, var3_5);
                }
                this.d.b.g().a(this);
                return;
            }
            this.d.b.g().a(this);
            throw var4_6;
        }

        x c() {
            return this.d;
        }

        String d() {
            return this.d.e.g().g();
        }
    }

}

