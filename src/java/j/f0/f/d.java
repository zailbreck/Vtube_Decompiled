/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.LinkedHashSet
 *  java.util.Set
 */
package j.f0.f;

import j.c0;
import java.util.LinkedHashSet;
import java.util.Set;

public final class d {
    private final Set<c0> a = new LinkedHashSet();

    public void a(c0 c02) {
        void var4_2 = this;
        synchronized (var4_2) {
            this.a.remove((Object)c02);
            return;
        }
    }

    public void b(c0 c02) {
        void var4_2 = this;
        synchronized (var4_2) {
            this.a.add((Object)c02);
            return;
        }
    }

    public boolean c(c0 c02) {
        void var4_2 = this;
        synchronized (var4_2) {
            boolean bl = this.a.contains((Object)c02);
            return bl;
        }
    }
}

