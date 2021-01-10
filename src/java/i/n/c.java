/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  i.d
 *  i.k.b.d
 *  i.k.b.h.a
 *  i.l.d
 *  i.l.e
 *  i.m.a
 *  i.n.n
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.NullPointerException
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 *  java.util.Iterator
 *  java.util.NoSuchElementException
 */
package i.n;

import i.d;
import i.k.a.b;
import i.l.e;
import i.n.n;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class c
implements i.m.a<i.l.d> {
    private final CharSequence a;
    private final int b;
    private final int c;
    private final b<CharSequence, Integer, d<Integer, Integer>> d;

    public c(CharSequence charSequence, int n2, int n3, b<? super CharSequence, ? super Integer, d<Integer, Integer>> b2) {
        i.k.b.d.c((Object)charSequence, (String)"input");
        i.k.b.d.c(b2, (String)"getNextMatch");
        this.a = charSequence;
        this.b = n2;
        this.c = n3;
        this.d = b2;
    }

    public static final /* synthetic */ b a(c c2) {
        return c2.d;
    }

    public static final /* synthetic */ int c(c c2) {
        return c2.c;
    }

    public Iterator<i.l.d> iterator() {
        return new Iterator<i.l.d>(){
            private int b = -1;
            private int c;
            private int d;
            private i.l.d e;
            private int f;
            {
                this.d = this.c = e.a((int)c2.b, (int)0, (int)c2.a.length());
            }

            /*
             * Unable to fully structure code
             * Enabled aggressive block sorting
             * Lifted jumps to return sites
             */
            private final void a() {
                block6 : {
                    block5 : {
                        block4 : {
                            if (this.d < 0) {
                                this.b = 0;
                                this.e = null;
                                return;
                            }
                            var1_1 = c.c(this);
                            var2_2 = -1;
                            if (var1_1 <= 0) break block4;
                            this.f = 1 + this.f;
                            if (this.f >= c.c(this)) break block5;
                        }
                        if (this.d <= c.b(this).length()) break block6;
                    }
                    var4_3 = new i.l.d(this.c, n.a((CharSequence)c.b(this)));
                    ** GOTO lbl19
                }
                var3_4 = (d)c.a(this).a(c.b(this), (int)this.d);
                if (var3_4 == null) {
                    var4_3 = new i.l.d(this.c, n.a((CharSequence)c.b(this)));
lbl19: // 2 sources:
                    this.e = var4_3;
                } else {
                    var5_5 = ((Number)var3_4.a()).intValue();
                    var6_6 = ((Number)var3_4.b()).intValue();
                    this.e = e.d((int)this.c, (int)var5_5);
                    var7_7 = this.c = var5_5 + var6_6;
                    var8_8 = 0;
                    if (var6_6 == 0) {
                        var8_8 = 1;
                    }
                    var2_2 = var7_7 + var8_8;
                }
                this.d = var2_2;
                this.b = 1;
            }

            public boolean hasNext() {
                if (this.b == -1) {
                    this.a();
                }
                return this.b == 1;
            }

            public i.l.d next() {
                if (this.b == -1) {
                    this.a();
                }
                if (this.b != 0) {
                    i.l.d d2 = this.e;
                    if (d2 != null) {
                        this.e = null;
                        this.b = -1;
                        return d2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.ranges.IntRange");
                }
                throw new NoSuchElementException();
            }

            public void remove() {
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            }
        };
    }

}

