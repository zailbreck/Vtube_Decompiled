/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.lang.IllegalArgumentException
 *  java.lang.String
 */
package f.f.a.j.a;

import f.f.a.j.a.f;
import java.io.File;

public final class h
extends f {
    private final long c;

    public h(long l2) {
        if (l2 > 0L) {
            this.c = l2;
            return;
        }
        throw new IllegalArgumentException("Max size must be positive number!");
    }

    @Override
    protected final boolean a(File file, long l2, int n2) {
        return l2 <= this.c;
    }
}

