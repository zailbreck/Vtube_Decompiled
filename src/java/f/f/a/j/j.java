/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Message
 *  java.io.File
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.Socket
 *  java.util.Iterator
 *  java.util.List
 *  java.util.concurrent.CopyOnWriteArrayList
 *  java.util.concurrent.atomic.AtomicInteger
 */
package f.f.a.j;

import android.os.Handler;
import android.os.Message;
import f.f.a.j.a.c;
import f.f.a.j.c.b;
import f.f.a.j.d;
import f.f.a.j.f;
import f.f.a.j.g;
import f.f.a.j.h;
import f.f.a.j.k;
import f.f.a.j.o;
import f.f.a.j.q;
import java.io.File;
import java.net.Socket;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class j {
    private final AtomicInteger a;
    private final String b;
    private volatile h c;
    private final List<d> d;
    private final d e;
    private final f f;
    private boolean g;
    private f.f.a.j.a.b h;
    private String i;

    private j(String string, f f2) {
        this.a = new AtomicInteger(0);
        this.d = new CopyOnWriteArrayList();
        this.g = false;
        this.i = null;
        o.a(string);
        this.b = string;
        o.a(f2);
        this.f = f2;
        this.e = new d(string, this.d){
            private final String b;
            private final List<d> c;
            {
                this.b = string;
                this.c = list;
            }

            @Override
            public final void a(File file, String string, int n2) {
                Message message = this.obtainMessage();
                message.arg1 = n2;
                message.obj = file;
                this.sendMessage(message);
            }

            @Override
            public final void a(Throwable throwable) {
                Iterator iterator = this.c.iterator();
                while (iterator.hasNext()) {
                    ((d)iterator.next()).a(throwable);
                }
            }

            public final void handleMessage(Message message) {
                Iterator iterator = this.c.iterator();
                while (iterator.hasNext()) {
                    ((d)iterator.next()).a((File)message.obj, this.b, message.arg1);
                }
            }
        };
    }

    public j(String string, f f2, String string2) {
        super(string, f2);
        this.i = string2;
    }

    private void b() {
        j j2 = this;
        synchronized (j2) {
            if (this.c == null) {
                if (this.i == null) {
                    k k2 = new k(this.b, this.f.d, this.f.e);
                    f f2 = this.f;
                    String string = this.b;
                    String string2 = f2.b.b(string);
                    this.h = new f.f.a.j.a.b(new File(f2.a, string2), this.f.c);
                    h h2 = new h(k2, this.h);
                    h2.a(this.e);
                    this.c = h2;
                } else {
                    String string = this.i;
                    k k3 = new k(this.b, this.f.d, this.f.e);
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("--->");
                    stringBuilder.append(string);
                    f.f.a.e.f.h.d("VideoCachedown", stringBuilder.toString());
                    this.h = new f.f.a.j.a.b(string);
                    h h3 = new h(k3, this.h);
                    h3.a(this.e);
                    this.c = h3;
                }
            }
            if (this.g) {
                this.c.b();
            }
            return;
        }
    }

    private void c() {
        j j2 = this;
        synchronized (j2) {
            if (this.a.decrementAndGet() <= 0) {
                this.c.a();
                this.c = null;
            }
            return;
        }
    }

    public final h a() {
        return this.c;
    }

    public final void a(d d2) {
        this.d.add((Object)d2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(g g2, Socket socket) {
        Throwable throwable22;
        block4 : {
            try {
                try {
                    j.super.b();
                    this.a.incrementAndGet();
                    this.c.a(g2, socket);
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    if (!(exception instanceof q)) break block4;
                    this.e.a(exception);
                }
            }
            catch (Throwable throwable22) {}
        }
        j.super.c();
        return;
        j.super.c();
        throw throwable22;
    }

}

