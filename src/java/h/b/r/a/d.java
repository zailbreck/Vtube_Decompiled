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
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.LinkedList
 *  java.util.List
 */
package h.b.r.a;

import h.b.p.b;
import h.b.r.a.a;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class d
implements h.b.o.b,
a {
    List<h.b.o.b> b;
    volatile boolean c;

    void a(List<h.b.o.b> list) {
        if (list == null) {
            return;
        }
        ArrayList arrayList = null;
        for (h.b.o.b b2 : list) {
            try {
                b2.dispose();
            }
            catch (Throwable throwable) {
                b.b((Throwable)throwable);
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean a(h.b.o.b b2) {
        h.b.r.b.b.a((Object)b2, (String)"Disposable item is null");
        if (this.c) {
            return false;
        }
        void var5_2 = this;
        synchronized (var5_2) {
            if (this.c) {
                return false;
            }
            List<h.b.o.b> list = this.b;
            return list != null && list.remove((Object)b2);
            {
            }
        }
    }

    public boolean b(h.b.o.b b2) {
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
    public boolean c(h.b.o.b b2) {
        h.b.r.b.b.a((Object)b2, (String)"d is null");
        if (!this.c) {
            void var6_2 = this;
            synchronized (var6_2) {
                if (!this.c) {
                    LinkedList linkedList = this.b;
                    if (linkedList == null) {
                        this.b = linkedList = new LinkedList();
                    }
                    linkedList.add((Object)b2);
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
        List<h.b.o.b> list;
        if (this.c) {
            return;
        }
        d d2 = this;
        synchronized (d2) {
            if (this.c) {
                return;
            }
            this.c = true;
            list = this.b;
            this.b = null;
        }
        this.a(list);
    }
}

