/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  h.b.o.b
 *  h.b.p.a
 *  h.b.p.b
 *  h.b.r.a.a
 *  h.b.r.b.b
 *  h.b.r.h.a
 *  h.b.r.h.b
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 */
package h.b.o;

import h.b.o.b;
import java.util.ArrayList;

public final class a
implements b,
h.b.r.a.a {
    h.b.r.h.b<b> b;
    volatile boolean c;

    void a(h.b.r.h.b<b> b2) {
        if (b2 == null) {
            return;
        }
        Object[] arrobject = b2.a();
        int n2 = arrobject.length;
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object = arrobject[i2];
            if (!(object instanceof b)) continue;
            try {
                ((b)object).dispose();
                continue;
            }
            catch (Throwable throwable) {
                h.b.p.b.b((Throwable)throwable);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((Object)throwable);
            }
        }
        if (arrayList != null) {
            if (arrayList.size() == 1) {
                throw h.b.r.h.a.a((Throwable)((Throwable)arrayList.get(0)));
            }
            throw new h.b.p.a(arrayList);
        }
    }

    public boolean a() {
        return this.c;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean a(b b2) {
        h.b.r.b.b.a((Object)b2, (String)"Disposable item is null");
        if (this.c) {
            return false;
        }
        void var5_2 = this;
        synchronized (var5_2) {
            if (this.c) {
                return false;
            }
            h.b.r.h.b<b> b3 = this.b;
            return b3 != null && b3.b((Object)b2);
            {
            }
        }
    }

    public boolean b(b b2) {
        if (this.a(b2)) {
            b2.dispose();
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean c(b b2) {
        h.b.r.b.b.a((Object)b2, (String)"d is null");
        if (!this.c) {
            void var6_2 = this;
            synchronized (var6_2) {
                if (!this.c) {
                    h.b.r.h.b b3 = this.b;
                    if (b3 == null) {
                        this.b = b3 = new h.b.r.h.b();
                    }
                    b3.a((Object)b2);
                    return true;
                }
            }
        }
        b2.dispose();
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void dispose() {
        h.b.r.h.b<b> b2;
        if (this.c) {
            return;
        }
        a a2 = this;
        synchronized (a2) {
            if (this.c) {
                return;
            }
            this.c = true;
            b2 = this.b;
            this.b = null;
        }
        this.a(b2);
    }
}

