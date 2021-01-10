/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.MalformedURLException
 *  java.net.URL
 */
package com.mintegral.msdk.base.download;

import com.mintegral.msdk.base.download.a.l;
import com.mintegral.msdk.base.download.g.a;
import com.mintegral.msdk.base.download.h;
import java.net.MalformedURLException;
import java.net.URL;

public final class d<T> {
    private String a;
    private String b;
    private int c = 100;
    private String d;
    private h e;
    private String f;

    public d(T t2, String string, String string2, int n2, h h2) {
        this.a = string;
        this.b = string2;
        this.c = n2;
        this.e = h2;
        try {
            URL uRL = new URL(string);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(uRL.getProtocol());
            stringBuilder.append("://");
            stringBuilder.append(uRL.getHost());
            stringBuilder.append(uRL.getPath());
            this.f = stringBuilder.toString();
            a a2 = l.f().a();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(" resourceUrl: ");
            stringBuilder2.append(this.f);
            a2.a("DownloadMessage", stringBuilder2.toString());
            return;
        }
        catch (MalformedURLException malformedURLException) {
            this.f = "";
            return;
        }
    }

    public final String a() {
        return this.a;
    }

    public final void a(String string) {
        this.d = string;
    }

    public final String b() {
        return this.b;
    }

    public final int c() {
        return this.c;
    }

    public final h d() {
        return this.e;
    }

    public final String e() {
        return this.d;
    }

    public final String f() {
        return this.f;
    }
}

