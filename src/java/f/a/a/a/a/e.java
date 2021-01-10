/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  f.a.a.a.a.a
 *  f.a.a.a.a.c
 *  f.a.a.a.a.g.a
 *  f.a.a.a.a.h.e
 *  f.a.a.a.a.h.f.c
 *  f.a.a.a.a.h.g.h
 *  f.a.a.a.a.j.c
 *  f.a.a.a.a.j.e
 *  f.a.a.a.a.j.f
 *  java.lang.Boolean
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.URI
 *  java.net.URISyntaxException
 */
package f.a.a.a.a;

import android.content.Context;
import f.a.a.a.a.g.a;
import f.a.a.a.a.h.f.c;
import f.a.a.a.a.h.g.h;
import f.a.a.a.a.j.f;
import f.a.a.a.a.k.b;
import f.a.a.a.a.k.g;
import java.net.URI;
import java.net.URISyntaxException;

class e
implements f.a.a.a.a.c {
    private URI a;
    private f.a.a.a.a.j.e b;
    private f.a.a.a.a.a c;

    public e(Context context, String string, c c2, f.a.a.a.a.a a2) {
        block7 : {
            f.a.a.a.a.h.e.a((Context)context.getApplicationContext(), (f.a.a.a.a.a)a2);
            try {
                String string2 = string.trim();
                if (!string2.startsWith("http")) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("http://");
                    stringBuilder.append(string2);
                    string2 = stringBuilder.toString();
                }
                this.a = new URI(string2);
                if (c2 == null) break block7;
            }
            catch (URISyntaxException uRISyntaxException) {
                throw new IllegalArgumentException("Endpoint must be a string like 'http://oss-cn-****.aliyuncs.com',or your cname like 'http://image.cnamedomain.com'!");
            }
            Boolean bl = false;
            try {
                bl = h.e((String)this.a.getHost());
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            if (this.a.getScheme().equals((Object)"https") && bl.booleanValue()) {
                throw new IllegalArgumentException("endpoint should not be format with https://ip.");
            }
            if (a2 == null) {
                a2 = f.a.a.a.a.a.m();
            }
            this.c = a2;
            this.b = new f.a.a.a.a.j.e(context.getApplicationContext(), this.a, c2, this.c);
            new f.a.a.a.a.j.c(this.b);
            return;
        }
        throw new IllegalArgumentException("CredentialProvider can't be null.");
    }

    public f<f.a.a.a.a.k.c> a(b b2, a<b, f.a.a.a.a.k.c> a2) {
        return this.b.a(b2, a2);
    }

    public f<f.a.a.a.a.k.h> a(g g2, a<g, f.a.a.a.a.k.h> a2) {
        return this.b.a(g2, a2);
    }
}

