/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Error
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.Throwable
 */
package h.b.r.h;

public final class a {
    static {
        new Throwable("No further exceptions"){

            public Throwable fillInStackTrace() {
                return this;
            }
        };
    }

    public static RuntimeException a(Throwable throwable) {
        if (!(throwable instanceof Error)) {
            if (throwable instanceof RuntimeException) {
                return (RuntimeException)throwable;
            }
            return new RuntimeException(throwable);
        }
        throw (Error)throwable;
    }

}

