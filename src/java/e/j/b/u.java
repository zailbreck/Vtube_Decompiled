/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.MediaFormat
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 *  android.os.Message
 *  android.view.accessibility.CaptioningManager
 *  android.view.accessibility.CaptioningManager$CaptioningChangeListener
 *  java.lang.ClassCastException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.Locale
 */
package e.j.b;

import android.content.Context;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.accessibility.CaptioningManager;
import e.j.b.h;
import e.j.b.v;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

class u {
    private h a;
    private ArrayList<f> b;
    private ArrayList<v> c;
    private final Object d = new Object();
    private final Object e = new Object();
    private v f;
    private CaptioningManager g;
    private Handler h;
    private final Handler.Callback i;
    private CaptioningManager.CaptioningChangeListener j;
    private boolean k;
    private boolean l;
    private c m;
    private d n;

    u(Context context, h h2, d d2) {
        this.i = new Handler.Callback(){

            public boolean handleMessage(Message message) {
                int n2 = message.what;
                if (n2 != 1) {
                    if (n2 != 2) {
                        if (n2 != 3) {
                            if (n2 != 4) {
                                return false;
                            }
                            u.this.b();
                            return true;
                        }
                        u.this.a((v)message.obj);
                        return true;
                    }
                    u.this.a();
                    return true;
                }
                u.this.c();
                return true;
            }
        };
        this.j = new CaptioningManager.CaptioningChangeListener(){

            public void onEnabledChanged(boolean bl) {
                u.this.f();
            }

            public void onLocaleChanged(Locale locale) {
                u.this.f();
            }
        };
        this.k = false;
        this.l = false;
        this.a = h2;
        this.n = d2;
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.g = (CaptioningManager)context.getSystemService("captioning");
    }

    private void a(Message message) {
        if (Looper.myLooper() == this.h.getLooper()) {
            this.h.dispatchMessage(message);
            return;
        }
        this.h.sendMessage(message);
    }

    private void h() {
    }

    private v.c i() {
        v v2 = this.f;
        if (v2 == null) {
            return null;
        }
        return v2.c();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public v a(MediaFormat mediaFormat) {
        Object object;
        v v2;
        Object object2 = object = this.d;
        // MONITORENTER : object2
        for (f f2 : this.b) {
            Object object3;
            if (!f2.b(mediaFormat) || (v2 = f2.a(mediaFormat)) == null) continue;
            Object object4 = object3 = this.e;
            // MONITORENTER : object4
        }
        {
            if (this.c.size() == 0) {
                this.g.addCaptioningChangeListener(this.j);
            }
            this.c.add((Object)v2);
            // MONITOREXIT : object4
            // MONITOREXIT : object2
            return v2;
        }
        {
            // MONITOREXIT : object2
            return null;
        }
    }

    void a() {
        this.l = true;
        v v2 = this.f;
        if (v2 != null) {
            v2.e();
        }
    }

    public void a(c c2) {
        c c3 = this.m;
        if (c3 == c2) {
            return;
        }
        if (c3 != null) {
            u.super.h();
            this.m.a(null);
        }
        this.m = c2;
        this.h = null;
        c c4 = this.m;
        if (c4 != null) {
            this.h = new Handler(c4.a(), this.i);
            u.super.h();
            this.m.a(u.super.i());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(f f2) {
        Object object;
        Object object2 = object = this.d;
        synchronized (object2) {
            if (!this.b.contains((Object)f2)) {
                this.b.add((Object)f2);
            }
            return;
        }
    }

    void a(v v2) {
        d d2;
        v v3;
        this.k = true;
        v v4 = this.f;
        if (v4 == v2) {
            return;
        }
        if (v4 != null) {
            v4.e();
            this.f.a((h)null);
        }
        this.f = v2;
        c c2 = this.m;
        if (c2 != null) {
            c2.a(u.super.i());
        }
        if ((v3 = this.f) != null) {
            v3.a(this.a);
            this.f.f();
        }
        if ((d2 = this.n) != null) {
            d2.a(v2);
        }
    }

    void b() {
        v v2;
        if (this.k) {
            v v3;
            if (this.l) {
                return;
            }
            if (!(this.g.isEnabled() || (v3 = this.f) != null && e.a(v3.b(), "is-forced-subtitle", 0) != 0)) {
                v v4 = this.f;
                if (v4 != null && v4.d() == 4) {
                    this.e();
                }
            } else {
                this.g();
            }
            this.l = false;
        }
        if ((v2 = this.d()) != null) {
            this.b(v2);
            this.k = false;
            if (!this.l) {
                this.g();
                this.l = false;
            }
        }
    }

    public boolean b(v v2) {
        if (v2 != null && !this.c.contains((Object)v2)) {
            return false;
        }
        u.super.a(this.h.obtainMessage(3, (Object)v2));
        return true;
    }

    void c() {
        this.l = true;
        v v2 = this.f;
        if (v2 != null) {
            v2.f();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public v d() {
        Object object;
        Locale locale = this.g.getLocale();
        Locale locale2 = locale == null ? Locale.getDefault() : locale;
        boolean bl = this.g.isEnabled();
        int n2 = 1;
        boolean bl2 = bl ^ n2;
        Object object2 = object = this.e;
        synchronized (object2) {
            Iterator iterator = this.c.iterator();
            v v2 = null;
            int n3 = -1;
            while (iterator.hasNext()) {
                v v3 = (v)iterator.next();
                MediaFormat mediaFormat = v3.b();
                String string = mediaFormat.getString("language");
                boolean bl3 = e.a(mediaFormat, "is-forced-subtitle", 0) != 0;
                boolean bl4 = e.a(mediaFormat, "is-autoselect", n2) != 0;
                boolean bl5 = e.a(mediaFormat, "is-default", 0) != 0;
                int n4 = !(locale2 == null || locale2.getLanguage().equals((Object)"") || locale2.getISO3Language().equals((Object)string) || locale2.getLanguage().equals((Object)string)) ? 0 : 1;
                int n5 = bl3 ? 0 : 8;
                int n6 = locale == null && bl5 ? 4 : 0;
                int n7 = n5 + n6;
                int n8 = bl4 ? 0 : 2;
                int n9 = n4 + (n7 + n8);
                if ((!bl2 || bl3) && (locale == null && bl5 || n4 != 0 && (bl4 || bl3 || locale != null)) && n9 > n3) {
                    v2 = v3;
                    n3 = n9;
                }
                n2 = 1;
            }
            return v2;
        }
    }

    public void e() {
        this.a(this.h.obtainMessage(2));
    }

    public void f() {
        this.a(this.h.obtainMessage(4));
    }

    protected void finalize() {
        this.g.removeCaptioningChangeListener(this.j);
        super.finalize();
    }

    public void g() {
        this.a(this.h.obtainMessage(1));
    }

    static interface c {
        public Looper a();

        public void a(v.c var1);
    }

    static interface d {
        public void a(v var1);
    }

    static class e {
        static int a(MediaFormat mediaFormat, String string, int n2) {
            try {
                int n3 = mediaFormat.getInteger(string);
                return n3;
            }
            catch (ClassCastException | NullPointerException throwable) {
                return n2;
            }
        }
    }

    public static abstract class f {
        public abstract v a(MediaFormat var1);

        public abstract boolean b(MediaFormat var1);
    }

}

