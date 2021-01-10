/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Proxy
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.text.TextUtils
 *  j.c
 *  j.n
 *  j.v$b
 *  java.lang.CharSequence
 *  java.lang.Enum
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.net.InetSocketAddress
 *  java.net.Proxy
 *  java.net.Proxy$Type
 *  java.net.SocketAddress
 *  java.net.URI
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.concurrent.Callable
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 *  java.util.concurrent.Future
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.TimeUnit
 *  javax.net.ssl.HostnameVerifier
 *  javax.net.ssl.HttpsURLConnection
 *  javax.net.ssl.SSLSession
 */
package f.a.a.a.a.j;

import android.content.Context;
import android.net.Proxy;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import f.a.a.a.a.h.d;
import f.a.a.a.a.h.g.h;
import f.a.a.a.a.j.e;
import f.a.a.a.a.j.f;
import f.a.a.a.a.j.i;
import f.a.a.a.a.j.k;
import f.a.a.a.a.j.l;
import f.a.a.a.a.k.d;
import f.a.a.a.a.k.g;
import j.n;
import j.v;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

public class e {
    private static ExecutorService g = Executors.newFixedThreadPool((int)5, (ThreadFactory)new ThreadFactory(){

        public Thread newThread(Runnable runnable) {
            return new Thread(runnable, "oss-android-api-thread");
        }
    });
    private volatile URI a;
    private v b;
    private Context c;
    private f.a.a.a.a.h.f.c d;
    private int e = 2;
    private f.a.a.a.a.a f;

    public e(Context context, final URI uRI, f.a.a.a.a.h.f.c c2, f.a.a.a.a.a a2) {
        this.c = context;
        this.a = uRI;
        this.d = c2;
        this.f = a2;
        v.b b2 = new v.b();
        b2.a(false);
        b2.b(false);
        b2.c(false);
        b2.a(null);
        b2.a(new HostnameVerifier((e)this){

            public boolean verify(String string, SSLSession sSLSession) {
                return HttpsURLConnection.getDefaultHostnameVerifier().verify(uRI.getHost(), sSLSession);
            }
        });
        if (a2 != null) {
            n n2 = new n();
            n2.a(a2.e());
            b2.a((long)a2.a(), TimeUnit.MILLISECONDS);
            b2.b((long)a2.j(), TimeUnit.MILLISECONDS);
            b2.c((long)a2.j(), TimeUnit.MILLISECONDS);
            b2.a(n2);
            if (a2.h() != null && a2.i() != 0) {
                b2.a(new java.net.Proxy(Proxy.Type.HTTP, (SocketAddress)new InetSocketAddress(a2.h(), a2.i())));
            }
            this.e = a2.f();
        }
        this.b = b2.a();
    }

    static /* synthetic */ void a(e e2, f.a.a.a.a.k.d d2, f.a.a.a.a.k.e e3, f.a.a.a.a.g.a a2) {
        e2.a(d2, e3, a2);
    }

    private void a(i i2, f.a.a.a.a.k.d d2) {
        boolean bl;
        Map<String, String> map = i2.d();
        if (map.get((Object)"Date") == null) {
            map.put((Object)"Date", (Object)f.a.a.a.a.h.g.d.a());
        }
        if ((i2.j() == f.a.a.a.a.h.a.e || i2.j() == f.a.a.a.a.h.a.f) && h.c((String)map.get((Object)"Content-Type"))) {
            map.put((Object)"Content-Type", (Object)h.a(null, i2.n(), i2.k()));
        }
        i2.b(e.super.a(this.f.l()));
        i2.a(this.d);
        i2.b(this.f.d());
        i2.d().put((Object)"User-Agent", (Object)f.a.a.a.a.h.g.i.a(this.f.c()));
        if (i2.d().containsKey((Object)"Range") || i2.l().containsKey((Object)"x-oss-process")) {
            i2.a(false);
        }
        i2.d(h.a(this.a.getHost(), this.f.b()));
        if (d2.a() != d.a.b) {
            Enum enum_ = d2.a();
            d.a a2 = d.a.c;
            bl = false;
            if (enum_ == a2) {
                bl = true;
            }
        } else {
            bl = this.f.k();
        }
        i2.a(bl);
        d.a a3 = bl ? d.a.c : d.a.d;
        d2.a(a3);
    }

    private <Request extends f.a.a.a.a.k.d, Result extends f.a.a.a.a.k.e> void a(Request Request, Result Result) {
        if (((f.a.a.a.a.k.d)Request).a() == d.a.c) {
            try {
                h.a(((f.a.a.a.a.k.e)Result).a(), ((f.a.a.a.a.k.e)Result).d(), ((f.a.a.a.a.k.e)Result).b());
                return;
            }
            catch (f.a.a.a.a.i.a a2) {
                throw new f.a.a.a.a.b(a2.getMessage(), (Throwable)a2);
            }
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private <Request extends f.a.a.a.a.k.d, Result extends f.a.a.a.a.k.e> void a(Request Request, Result Result, f.a.a.a.a.g.a<Request, Result> a2) {
        e.super.a(Request, Result);
        if (a2 == null) return;
        try {
            a2.a(Request, Result);
            return;
        }
        catch (f.a.a.a.a.b b2) {
            if (a2 == null) return;
            a2.a(Request, b2, null);
        }
    }

    private boolean a(boolean bl) {
        if (bl) {
            if (this.c == null) {
                return false;
            }
            int n2 = Build.VERSION.SDK_INT;
            boolean bl2 = false;
            if (n2 >= 14) {
                bl2 = true;
            }
            String string = bl2 ? System.getProperty((String)"http.proxyHost") : Proxy.getHost((Context)this.c);
            String string2 = this.f.h();
            if (!TextUtils.isEmpty((CharSequence)string2)) {
                string = string2;
            }
            return TextUtils.isEmpty((CharSequence)string);
        }
        return false;
    }

    public f<f.a.a.a.a.k.c> a(f.a.a.a.a.k.b b2, f.a.a.a.a.g.a<f.a.a.a.a.k.b, f.a.a.a.a.k.c> a2) {
        i i2 = new i();
        i2.c(b2.b());
        i2.a(this.a);
        i2.a(f.a.a.a.a.h.a.c);
        i2.a(b2.c());
        i2.c(b2.d());
        if (b2.f() == null) {
            if (b2.h() != null) {
                i2.l().put((Object)"x-oss-process", (Object)b2.h());
            }
            e.super.a(i2, b2);
            if (b2.g() != null) {
                for (Map.Entry entry : b2.g().entrySet()) {
                    i2.d().put(entry.getKey(), entry.getValue());
                }
            }
            f.a.a.a.a.l.b b3 = new f.a.a.a.a.l.b(this.a(), b2, this.c);
            if (a2 != null) {
                b3.a((f.a.a.a.a.k.b)((Object)a2));
            }
            b3.a(b2.e());
            f.a.a.a.a.l.d d2 = new f.a.a.a.a.l.d(i2, new l.a(), b3, this.e);
            return f.a(g.submit(d2), b3);
        }
        i2.d();
        b2.f().toString();
        throw null;
    }

    public f<f.a.a.a.a.k.h> a(g g2, f.a.a.a.a.g.a<g, f.a.a.a.a.k.h> a2) {
        d.a(" Internal putObject Start ");
        i i2 = new i();
        i2.c(g2.b());
        i2.a(this.a);
        i2.a(f.a.a.a.a.h.a.f);
        i2.a(g2.c());
        i2.c(g2.g());
        if (g2.j() != null) {
            i2.a(g2.j());
        }
        if (g2.k() != null) {
            i2.d(g2.k());
        }
        if (g2.l() != null) {
            i2.a(g2.l());
        }
        if (g2.d() != null) {
            i2.d().put((Object)"x-oss-callback", (Object)h.a(g2.d()));
        }
        if (g2.e() != null) {
            i2.d().put((Object)"x-oss-callback-var", (Object)h.a(g2.e()));
        }
        d.a(" populateRequestMetadata ");
        h.a(i2.d(), g2.f());
        d.a(" canonicalizeRequestMessage ");
        e.super.a(i2, g2);
        d.a(" ExecutionContext ");
        f.a.a.a.a.l.b b2 = new f.a.a.a.a.l.b(this.a(), g2, this.c);
        if (a2 != null) {
            b2.a((g)((Object)new f.a.a.a.a.g.a<g, f.a.a.a.a.k.h>((e)this, a2){
                final /* synthetic */ f.a.a.a.a.g.a a;
                final /* synthetic */ e b;
                {
                    this.b = e2;
                    this.a = a2;
                }

                public void a(g g2, f.a.a.a.a.b b2, f.a.a.a.a.f f2) {
                    this.a.a(g2, b2, f2);
                }

                public void a(g g2, f.a.a.a.a.k.h h2) {
                    e.a(this.b, g2, h2, this.a);
                }
            }));
        }
        if (g2.i() != null) {
            b2.a(g2.i());
        }
        b2.a(g2.h());
        f.a.a.a.a.l.d d2 = new f.a.a.a.a.l.d(i2, new l.b(), b2, this.e);
        d.a(" call OSSRequestTask ");
        return f.a(g.submit(d2), b2);
    }

    public v a() {
        return this.b;
    }

}

