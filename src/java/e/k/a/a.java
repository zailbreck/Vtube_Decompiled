/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Comparator
 *  java.util.Iterator
 *  java.util.List
 *  java.util.PriorityQueue
 */
package e.k.a;

import android.graphics.Color;
import e.k.a.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;

final class a {
    private static final Comparator<b> f = new Comparator<b>(){

        public int a(b b2, b b3) {
            return b3.g() - b2.g();
        }
    };
    final int[] a;
    final int[] b;
    final List<b.e> c;
    final b.c[] d;
    private final float[] e = new float[3];

    a(int[] arrn, int n2, b.c[] arrc) {
        this.d = arrc;
        int[] arrn2 = new int[32768];
        this.b = arrn2;
        int n3 = 0;
        for (int i2 = 0; i2 < arrn.length; ++i2) {
            int n4;
            arrn[i2] = n4 = a.b(arrn[i2]);
            arrn2[n4] = 1 + arrn2[n4];
        }
        int n5 = 0;
        for (int i3 = 0; i3 < arrn2.length; ++i3) {
            if (arrn2[i3] > 0 && a.super.g(i3)) {
                arrn2[i3] = 0;
            }
            if (arrn2[i3] <= 0) continue;
            ++n5;
        }
        int[] arrn3 = new int[n5];
        this.a = arrn3;
        int n6 = 0;
        for (int i4 = 0; i4 < arrn2.length; ++i4) {
            if (arrn2[i4] <= 0) continue;
            int n7 = n6 + 1;
            arrn3[n6] = i4;
            n6 = n7;
        }
        if (n5 <= n2) {
            this.c = new ArrayList();
            int n8 = arrn3.length;
            while (n3 < n8) {
                int n9 = arrn3[n3];
                this.c.add((Object)new b.e(a.a(n9), arrn2[n9]));
                ++n3;
            }
        } else {
            this.c = a.super.c(n2);
        }
    }

    private static int a(int n2) {
        return a.a(a.f(n2), a.e(n2), a.d(n2));
    }

    static int a(int n2, int n3, int n4) {
        return Color.rgb((int)a.b(n2, 5, 8), (int)a.b(n3, 5, 8), (int)a.b(n4, 5, 8));
    }

    private List<b.e> a(Collection<b> collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            b.e e2 = ((b)iterator.next()).d();
            if (a.super.a(e2)) continue;
            arrayList.add((Object)e2);
        }
        return arrayList;
    }

    private void a(PriorityQueue<b> priorityQueue, int n2) {
        b b2;
        while (priorityQueue.size() < n2 && (b2 = (b)priorityQueue.poll()) != null && b2.a()) {
            priorityQueue.offer((Object)b2.h());
            priorityQueue.offer((Object)b2);
        }
    }

    static void a(int[] arrn, int n2, int n3, int n4) {
        block5 : {
            if (n2 == -3) break block5;
            if (n2 != -2) {
                if (n2 != -1) {
                    return;
                }
                while (n3 <= n4) {
                    int n5 = arrn[n3];
                    arrn[n3] = a.d(n5) << 10 | a.e(n5) << 5 | a.f(n5);
                    ++n3;
                }
            } else {
                while (n3 <= n4) {
                    int n6 = arrn[n3];
                    arrn[n3] = a.e(n6) << 10 | a.f(n6) << 5 | a.d(n6);
                    ++n3;
                }
            }
        }
    }

    private boolean a(int n2, float[] arrf) {
        b.c[] arrc = this.d;
        if (arrc != null && arrc.length > 0) {
            int n3 = arrc.length;
            for (int i2 = 0; i2 < n3; ++i2) {
                if (this.d[i2].a(n2, arrf)) continue;
                return true;
            }
        }
        return false;
    }

    private boolean a(b.e e2) {
        return a.super.a(e2.d(), e2.b());
    }

    private static int b(int n2) {
        int n3 = a.b(Color.red((int)n2), 8, 5);
        int n4 = a.b(Color.green((int)n2), 8, 5);
        return a.b(Color.blue((int)n2), 8, 5) | (n3 << 10 | n4 << 5);
    }

    private static int b(int n2, int n3, int n4) {
        int n5 = n4 > n3 ? n2 << n4 - n3 : n2 >> n3 - n4;
        return n5 & (1 << n4) - 1;
    }

    private List<b.e> c(int n2) {
        PriorityQueue priorityQueue = new PriorityQueue(n2, f);
        priorityQueue.offer((Object)(a)this.new b(0, -1 + this.a.length));
        a.super.a((PriorityQueue<b>)priorityQueue, n2);
        return a.super.a((Collection<b>)priorityQueue);
    }

    static int d(int n2) {
        return n2 & 31;
    }

    static int e(int n2) {
        return 31 & n2 >> 5;
    }

    static int f(int n2) {
        return 31 & n2 >> 10;
    }

    private boolean g(int n2) {
        int n3 = a.a(n2);
        e.e.e.a.a(n3, this.e);
        return a.super.a(n3, this.e);
    }

    List<b.e> a() {
        return this.c;
    }

    private class b {
        private int a;
        private int b;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;

        b(int n2, int n3) {
            this.a = n2;
            this.b = n3;
            this.c();
        }

        final boolean a() {
            return this.e() > 1;
        }

        final int b() {
            int n2;
            int n3 = this.f();
            a a2 = a.this;
            int[] arrn = a2.a;
            int[] arrn2 = a2.b;
            a.a(arrn, n3, this.a, this.b);
            Arrays.sort((int[])arrn, (int)this.a, (int)(1 + this.b));
            a.a(arrn, n3, this.a, this.b);
            int n4 = this.c / 2;
            int n5 = 0;
            for (int i2 = this.a; i2 <= (n2 = this.b); ++i2) {
                if ((n5 += arrn2[arrn[i2]]) < n4) continue;
                return Math.min((int)(n2 - 1), (int)i2);
            }
            return this.a;
        }

        final void c() {
            a a2 = a.this;
            int[] arrn = a2.a;
            int[] arrn2 = a2.b;
            int n2 = Integer.MAX_VALUE;
            int n3 = Integer.MIN_VALUE;
            int n4 = Integer.MAX_VALUE;
            int n5 = Integer.MIN_VALUE;
            int n6 = Integer.MAX_VALUE;
            int n7 = Integer.MIN_VALUE;
            int n8 = 0;
            for (int i2 = this.a; i2 <= this.b; ++i2) {
                int n9 = arrn[i2];
                n8 += arrn2[n9];
                int n10 = a.f(n9);
                int n11 = a.e(n9);
                int n12 = a.d(n9);
                if (n10 > n3) {
                    n3 = n10;
                }
                if (n10 < n2) {
                    n2 = n10;
                }
                if (n11 > n5) {
                    n5 = n11;
                }
                if (n11 < n4) {
                    n4 = n11;
                }
                if (n12 > n7) {
                    n7 = n12;
                }
                if (n12 >= n6) continue;
                n6 = n12;
            }
            this.d = n2;
            this.e = n3;
            this.f = n4;
            this.g = n5;
            this.h = n6;
            this.i = n7;
            this.c = n8;
        }

        final b.e d() {
            a a2 = a.this;
            int[] arrn = a2.a;
            int[] arrn2 = a2.b;
            int n2 = 0;
            int n3 = 0;
            int n4 = 0;
            int n5 = 0;
            for (int i2 = this.a; i2 <= this.b; ++i2) {
                int n6 = arrn[i2];
                int n7 = arrn2[n6];
                n3 += n7;
                n2 += n7 * a.f(n6);
                n4 += n7 * a.e(n6);
                n5 += n7 * a.d(n6);
            }
            float f2 = n2;
            float f3 = n3;
            return new b.e(a.a(Math.round((float)(f2 / f3)), Math.round((float)((float)n4 / f3)), Math.round((float)((float)n5 / f3))), n3);
        }

        final int e() {
            return 1 + this.b - this.a;
        }

        final int f() {
            int n2 = this.e - this.d;
            int n3 = this.g - this.f;
            int n4 = this.i - this.h;
            if (n2 >= n3 && n2 >= n4) {
                return -3;
            }
            if (n3 >= n2 && n3 >= n4) {
                return -2;
            }
            return -1;
        }

        final int g() {
            return (1 + (this.e - this.d)) * (1 + (this.g - this.f)) * (1 + (this.i - this.h));
        }

        final b h() {
            if (this.a()) {
                int n2 = this.b();
                b b2 = new b(n2 + 1, this.b);
                this.b = n2;
                this.c();
                return b2;
            }
            throw new IllegalStateException("Can not split a box with only 1 color");
        }
    }

}

