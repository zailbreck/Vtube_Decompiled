/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.LinkageError
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.ThreadDeath
 *  java.lang.Throwable
 *  java.lang.VirtualMachineError
 */
package h.b.p;

import h.b.r.h.a;

public final class b {
    public static RuntimeException a(Throwable throwable) {
        throw a.a(throwable);
    }

    public static void b(Throwable throwable) {
        if (!(throwable instanceof VirtualMachineError)) {
            if (!(throwable instanceof ThreadDeath)) {
                if (!(throwable instanceof LinkageError)) {
                    return;
                }
                throw (LinkageError)throwable;
            }
            throw (ThreadDeath)throwable;
        }
        throw (VirtualMachineError)throwable;
    }
}

