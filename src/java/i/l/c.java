/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.util.NoSuchElementException
 */
package i.l;

import i.i.t;
import java.util.NoSuchElementException;

public final class c
extends t {
    private final int b;
    private boolean c;
    private int d;
    private final int e;

    public c(int n2, int n3, int n4) {
        this.e = n4;
        this.b = n3;
        int n5 = this.e;
        boolean bl = true;
        if (!(n5 > 0 ? n2 <= n3 : n2 >= n3)) {
            bl = false;
        }
        this.c = bl;
        if (!this.c) {
            n2 = this.b;
        }
        this.d = n2;
    }

    @Override
    public int a() {
        int n2 = this.d;
        if (n2 == this.b) {
            if (this.c) {
                this.c = false;
                return n2;
            }
            throw new NoSuchElementException();
        }
        this.d = n2 + this.e;
        return n2;
    }

    public boolean hasNext() {
        return this.c;
    }
}

