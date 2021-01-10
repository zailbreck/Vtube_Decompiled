/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Message
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.LinkedList
 */
package f.f.a.i;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import f.f.a.e.d.e;
import f.f.a.e.d.p;
import f.f.a.e.e.j;
import f.f.a.e.f.h;
import f.f.a.i.a;
import f.f.a.n.a.d;
import java.util.LinkedList;

public final class a {
    private long a;
    private boolean b;
    private LinkedList<j> c;
    private LinkedList<j> d;
    private int e;
    private int f;
    private e g;
    private f.f.a.s.d.a h;
    private p i;
    private Handler j;

    private a() {
        this.b = false;
        this.c = new LinkedList();
        this.d = new LinkedList();
        this.e = 0;
        this.f = 0;
        this.j = new Handler(){

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public final void handleMessage(Message message) {
                a a2;
                a a3 = a2 = a.this;
                synchronized (a3) {
                    int n2 = message.what;
                    if (n2 != 1) {
                        if (n2 == 2) {
                            a.c(a.this);
                        }
                    } else {
                        if (a.this.b) {
                            return;
                        }
                        a.a(a.this, a.this.a);
                        this.sendMessageDelayed(this.obtainMessage(1), a.this.a);
                    }
                    return;
                }
            }
        };
    }

    /* synthetic */ a(a a2) {
    }

    static /* synthetic */ void a(a a2, long l2) {
        LinkedList<j> linkedList = a2.c;
        if (linkedList != null && linkedList.size() > 0 && a2.e != 0 && a2.c.size() > a2.e) {
            return;
        }
        LinkedList<j> linkedList2 = a2.d;
        if (linkedList2 != null && linkedList2.size() > 0 && a2.f != 0 && a2.d.size() != a2.f) {
            return;
        }
        a2.f = 0;
        a2.e = 0;
        Handler handler = a2.j;
        handler.sendMessage(handler.obtainMessage(2));
    }

    private void a(String string, String string2, boolean bl) {
        Context context;
        block3 : {
            try {
                context = f.f.a.e.c.a.i().e();
                if (context != null) break block3;
                return;
            }
            catch (Exception exception) {
                h.b("LoopTimer", exception.getMessage(), exception);
                return;
            }
        }
        d d2 = new d(context, string, string2);
        d2.a(bl);
        d2.a(new f.f.a.n.a.b((a)this, d2){
            final /* synthetic */ d a;
            final /* synthetic */ a b;
            {
                this.b = a2;
                this.a = d2;
            }

            public final void a() {
            }

            public final void a(String string) {
                a.d(this.b).sendMessage(a.d(this.b).obtainMessage(2));
                this.a.a((f.f.a.n.a.b)null);
            }

            public final void b(String string) {
                a.d(this.b).sendMessage(a.d(this.b).obtainMessage(2));
                this.a.a((f.f.a.n.a.b)null);
            }
        });
        d2.a(1, 8000, false);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean a(j j2) {
        int n2;
        block13 : {
            void var4_10;
            block19 : {
                String string;
                block15 : {
                    block14 : {
                        p p2;
                        block18 : {
                            LinkedList<j> linkedList;
                            block17 : {
                                block16 : {
                                    int n3;
                                    if (j2 == null) {
                                        return false;
                                    }
                                    if (TextUtils.isEmpty((CharSequence)j2.a())) {
                                        return false;
                                    }
                                    string = j2.a();
                                    n2 = 1;
                                    if (this.g == null) break block13;
                                    long l2 = 0L;
                                    if (this.h != null) {
                                        l2 = this.h.c();
                                    }
                                    if ((n3 = this.g.a(string, l2)) != -1) {
                                        if (n3 == n2) break block13;
                                        break block14;
                                    }
                                    if (TextUtils.isEmpty((CharSequence)string)) break block14;
                                    if (this.c == null || !this.c.contains((Object)string)) break block16;
                                    linkedList = this.c;
                                    break block17;
                                }
                                if (this.d == null || !this.d.contains((Object)string)) break block18;
                                linkedList = this.d;
                            }
                            linkedList.remove((Object)string);
                        }
                        if ((p2 = this.i) != null) break block15;
                    }
                    try {
                        this.j.sendMessage(this.j.obtainMessage(2));
                        return false;
                    }
                    catch (Throwable throwable) {
                        n2 = 0;
                    }
                    break block19;
                }
                try {
                    this.i.a(string);
                }
                catch (Throwable throwable) {
                    // empty catch block
                }
                throw null;
            }
            h.b("LoopTimer", var4_10.getMessage(), (Throwable)var4_10);
        }
        return (boolean)n2;
    }

    static /* synthetic */ void c(a a2) {
        try {
            if (a2.c != null && a2.c.size() > 0 && a2.e < a2.c.size()) {
                j j2 = (j)a2.c.get(a2.e);
                a2.e = 1 + a2.e;
                if (a2.a(j2)) {
                    a2.a(j2.b(), j2.a(), false);
                    return;
                }
            } else if (a2.d != null && a2.d.size() > 0 && a2.f < a2.d.size()) {
                j j3 = (j)a2.d.get(a2.f);
                a2.f = 1 + a2.f;
                if (a2.a(j3)) {
                    a2.a(j3.b(), j3.a(), true);
                    return;
                }
            }
        }
        catch (Throwable throwable) {
            h.b("LoopTimer", throwable.getMessage(), throwable);
        }
    }

    static /* synthetic */ Handler d(a a2) {
        return a2.j;
    }

    public final void a(String string, String string2) {
        if (!this.c.contains((Object)string2)) {
            this.c.add((Object)new j(string, string2, 94));
            p p2 = this.i;
            if (p2 == null) {
                return;
            }
            p2.a(string, string2, 94);
            throw null;
        }
    }

    public final void b(String string, String string2) {
        if (!this.d.contains((Object)string2)) {
            this.d.add((Object)new j(string, string2, 287));
            p p2 = this.i;
            if (p2 == null) {
                return;
            }
            p2.a(string, string2, 287);
            throw null;
        }
    }

    static final class c {
        static a a = new a(null);
    }

}

