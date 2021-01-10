/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.io.Writer
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package e.e.j;

import android.util.Log;
import java.io.Writer;

public class b
extends Writer {
    private final String b;
    private StringBuilder c = new StringBuilder(128);

    public b(String string) {
        this.b = string;
    }

    private void a() {
        if (this.c.length() > 0) {
            Log.d((String)this.b, (String)this.c.toString());
            StringBuilder stringBuilder = this.c;
            stringBuilder.delete(0, stringBuilder.length());
        }
    }

    public void close() {
        this.a();
    }

    public void flush() {
        this.a();
    }

    public void write(char[] arrc, int n2, int n3) {
        for (int i2 = 0; i2 < n3; ++i2) {
            char c2 = arrc[n2 + i2];
            if (c2 == '\n') {
                b.super.a();
                continue;
            }
            this.c.append(c2);
        }
    }
}

