/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package h.b.o;

import h.b.o.e;

final class f
extends e<Runnable> {
    f(Runnable runnable) {
        super(runnable);
    }

    @Override
    protected void a(Runnable runnable) {
        runnable.run();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RunnableDisposable(disposed=");
        stringBuilder.append(this.a());
        stringBuilder.append(", ");
        stringBuilder.append(this.get());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

