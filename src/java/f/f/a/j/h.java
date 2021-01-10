/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  f.f.a.j.b
 *  f.f.a.j.d
 *  f.f.a.j.g
 *  f.f.a.j.p
 *  f.f.a.j.s
 *  java.io.BufferedOutputStream
 *  java.io.File
 *  java.io.IOException
 *  java.io.OutputStream
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.Socket
 *  java.util.Locale
 */
package f.f.a.j;

import android.text.TextUtils;
import f.f.a.j.a.b;
import f.f.a.j.d;
import f.f.a.j.g;
import f.f.a.j.k;
import f.f.a.j.p;
import f.f.a.j.s;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Locale;

public class h
extends p {
    private final k k;
    private final b l;
    private d m;

    public h(k k2, b b2) {
        super((s)k2, (f.f.a.j.b)b2);
        this.l = b2;
        this.k = k2;
    }

    private /* varargs */ String a(String string, Object ... arrobject) {
        return String.format((Locale)Locale.US, (String)string, (Object[])arrobject);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private void a(OutputStream var1, long var2_2) {
        var4_3 = new byte[8192];
        try {
            while ((var8_4 = this.a(var4_3, var2_2, var4_3.length)) != -1 && !this.g) {
                var1.write(var4_3, 0, var8_4);
                var2_2 += (long)var8_4;
            }
            var1.flush();
            ** GOTO lbl-1000
        }
        catch (IOException v0) {
            try lbl-1000: // 2 sources:
            {
                var1.close();
                return;
            }
            catch (IOException v1) {
                return;
            }
            catch (Throwable var5_5) {
                try {
                    var1.close();
                    throw var5_5;
                }
                catch (IOException v2) {}
                throw var5_5;
            }
        }
    }

    protected final void a(int n2) {
        d d2 = this.m;
        if (d2 != null) {
            d2.a(this.l.b, this.k.d(), n2);
        }
    }

    public final void a(d d2) {
        this.m = d2;
    }

    public final void a(g g2, Socket socket) {
        String string;
        String string2;
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
        String string3 = this.k.c();
        boolean bl = true ^ TextUtils.isEmpty((CharSequence)string3);
        long l2 = this.l.e() ? this.l.a() : this.k.a();
        boolean bl2 = l2 >= 0L;
        long l3 = g2.c ? l2 - g2.b : l2;
        boolean bl3 = bl2 && g2.c;
        StringBuilder stringBuilder = new StringBuilder();
        String string4 = g2.c ? "HTTP/1.1 206 PARTIAL CONTENT\n" : "HTTP/1.1 200 OK\n";
        stringBuilder.append(string4);
        stringBuilder.append("Accept-Ranges: bytes\n");
        String string5 = "";
        if (bl2) {
            Object[] arrobject = new Object[]{l3};
            string2 = h.super.a("Content-Length: %d\n", arrobject);
        } else {
            string2 = string5;
        }
        stringBuilder.append(string2);
        if (bl3) {
            Object[] arrobject = new Object[]{g2.b, l2 - 1L, l2};
            string = h.super.a("Content-Range: bytes %d-%d/%d\n", arrobject);
        } else {
            string = string5;
        }
        stringBuilder.append(string);
        if (bl) {
            string5 = h.super.a("Content-Type: %s\n", string3);
        }
        stringBuilder.append(string5);
        stringBuilder.append("\n");
        bufferedOutputStream.write(stringBuilder.toString().getBytes("UTF-8"));
        long l4 = g2.b;
        this.b(false);
        try {
            h.super.a((OutputStream)bufferedOutputStream, l4);
        }
        catch (Exception exception) {}
    }

    public final void b() {
    }
}

