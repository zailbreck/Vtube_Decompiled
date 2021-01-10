/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.RuntimeException
 *  java.lang.Throwable
 */
package j.f0.f;

import j.f0.c;
import java.io.IOException;

public final class e
extends RuntimeException {
    private IOException b;
    private IOException c;

    public e(IOException iOException) {
        super((Throwable)iOException);
        this.b = iOException;
        this.c = iOException;
    }

    public IOException a() {
        return this.b;
    }

    public void a(IOException iOException) {
        c.a(this.b, iOException);
        this.c = iOException;
    }

    public IOException b() {
        return this.c;
    }
}

