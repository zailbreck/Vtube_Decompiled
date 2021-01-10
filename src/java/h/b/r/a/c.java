/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.UnsupportedOperationException
 */
package h.b.r.a;

import h.b.r.c.b;

public final class c
extends Enum<c>
implements b<Object> {
    public static final /* enum */ c b = new c();
    public static final /* enum */ c c = new c();
    private static final /* synthetic */ c[] d;

    static {
        c[] arrc = new c[]{b, c};
        d = arrc;
    }

    public static c valueOf(String string) {
        return (c)Enum.valueOf(c.class, (String)string);
    }

    public static c[] values() {
        return (c[])d.clone();
    }

    @Override
    public int a(int n2) {
        return n2 & 2;
    }

    @Override
    public boolean a(Object object) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override
    public Object b() {
        return null;
    }

    @Override
    public void clear() {
    }

    @Override
    public void dispose() {
    }

    @Override
    public boolean isEmpty() {
        return true;
    }
}

