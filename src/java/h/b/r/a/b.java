/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  h.b.o.b
 *  h.b.r.b.b
 *  h.b.s.a
 *  java.lang.Enum
 *  java.lang.IllegalStateException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.concurrent.atomic.AtomicReference
 */
package h.b.r.a;

import h.b.s.a;
import java.util.concurrent.atomic.AtomicReference;

public final class b
extends Enum<b>
implements h.b.o.b {
    public static final /* enum */ b b = new b();
    private static final /* synthetic */ b[] c;

    static {
        b[] arrb = new b[]{b};
        c = arrb;
    }

    public static void a() {
        a.a((Throwable)new IllegalStateException("Disposable already set!"));
    }

    public static boolean a(h.b.o.b b2) {
        return b2 == b;
    }

    public static boolean a(h.b.o.b b2, h.b.o.b b3) {
        if (b3 == null) {
            a.a((Throwable)new NullPointerException("next is null"));
            return false;
        }
        if (b2 != null) {
            b3.dispose();
            b.a();
            return false;
        }
        return true;
    }

    public static boolean a(AtomicReference<h.b.o.b> atomicReference) {
        h.b.o.b b2;
        b b3;
        h.b.o.b b4 = (h.b.o.b)atomicReference.get();
        if (b4 != (b3 = b) && (b2 = (h.b.o.b)atomicReference.getAndSet((Object)b3)) != b3) {
            if (b2 != null) {
                b2.dispose();
            }
            return true;
        }
        return false;
    }

    public static boolean a(AtomicReference<h.b.o.b> atomicReference, h.b.o.b b2) {
        h.b.r.b.b.a((Object)b2, (String)"d is null");
        if (!atomicReference.compareAndSet(null, (Object)b2)) {
            b2.dispose();
            if (atomicReference.get() != b) {
                b.a();
            }
            return false;
        }
        return true;
    }

    public static b valueOf(String string) {
        return (b)Enum.valueOf(b.class, (String)string);
    }

    public static b[] values() {
        return (b[])c.clone();
    }

    public void dispose() {
    }
}

