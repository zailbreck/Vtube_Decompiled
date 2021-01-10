/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  com.kuqicc.future.b.c.f
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package com.kuqicc.future.b.c;

import android.util.Log;
import com.kuqicc.future.b.c.f;
import f.a.a.a.a.b;
import f.a.a.a.a.g.a;
import f.a.a.a.a.k.c;
import f.a.a.a.a.k.e;
import h.b.d;
import java.io.IOException;
import java.io.InputStream;

class g
implements a<f.a.a.a.a.k.b, c> {
    final /* synthetic */ d a;

    g(f f2, d d2) {
        this.a = d2;
    }

    @Override
    public void a(f.a.a.a.a.k.b b2, b b3, f.a.a.a.a.f f2) {
        if (b3 != null) {
            b3.printStackTrace();
            this.a.a((Throwable)b3);
        }
        if (f2 != null) {
            Log.e((String)"ErrorCode", (String)f2.a());
            Log.e((String)"RequestId", (String)f2.d());
            Log.e((String)"HostId", (String)f2.b());
            Log.e((String)"RawMessage", (String)f2.c());
            this.a.a((Throwable)f2);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void a(f.a.a.a.a.k.b b2, c c2) {
        try {
            InputStream inputStream = c2.f();
            long l2 = c2.e();
            int n2 = (int)l2;
            byte[] arrby = new byte[n2];
            int n3 = 0;
            do {
                if ((long)n3 >= l2) {
                    inputStream.close();
                    this.a.b(arrby);
                    this.a.a();
                    return;
                }
                n3 += c2.f().read(arrby, n3, n2 - n3);
            } while (true);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return;
        }
    }
}

