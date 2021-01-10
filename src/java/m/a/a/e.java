/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.AsyncTask
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 *  android.os.Message
 *  android.text.TextUtils
 *  android.util.Log
 *  java.io.File
 *  java.io.IOException
 *  java.lang.CharSequence
 *  java.lang.Math
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 *  java.util.concurrent.Executor
 */
package m.a.a;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import m.a.a.c;
import m.a.a.d;
import m.a.a.e;
import m.a.a.f;
import m.a.a.g;

public class e
implements Handler.Callback {
    private String b;
    private boolean c;
    private int d;
    private g e;
    private f f;
    private m.a.a.b g;
    private List<d> h;
    private Handler i;

    private e(b b2) {
        this.b = b2.b;
        this.e = b2.d;
        this.h = b2.g;
        this.f = b2.e;
        this.d = b2.c;
        this.g = b2.f;
        this.i = new Handler(Looper.getMainLooper(), (Handler.Callback)this);
    }

    /* synthetic */ e(b b2, a a2) {
        super(b2);
    }

    private File a(Context context) {
        return e.a(context, "luban_disk_cache");
    }

    private static File a(Context context, String string2) {
        File file = context.getExternalCacheDir();
        if (file != null) {
            File file2 = new File(file, string2);
            if (!(file2.mkdirs() || file2.exists() && file2.isDirectory())) {
                return null;
            }
            return file2;
        }
        if (Log.isLoggable((String)"Luban", (int)6)) {
            Log.e((String)"Luban", (String)"default disk cache dir is null");
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private File a(Context context, d d2) {
        m.a.a.b b2;
        c c2;
        File file = e.super.b(context, m.a.a.a.c.a(d2));
        g g2 = this.e;
        if (g2 != null) {
            file = e.super.c(context, g2.a(d2.b()));
        }
        if ((b2 = this.g) != null) {
            if (!b2.a(d2.b()) || !m.a.a.a.c.a(this.d, d2.b())) return new File(d2.b());
            c2 = new c(d2, file, this.c);
            do {
                return c2.a();
                break;
            } while (true);
        }
        if (!m.a.a.a.c.a(this.d, d2.b())) return new File(d2.b());
        c2 = new c(d2, file, this.c);
        return c2.a();
    }

    private File b(Context context, String string2) {
        if (TextUtils.isEmpty((CharSequence)this.b)) {
            this.b = e.super.a(context).getAbsolutePath();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b);
        stringBuilder.append("/");
        stringBuilder.append(System.currentTimeMillis());
        stringBuilder.append((int)(1000.0 * Math.random()));
        if (TextUtils.isEmpty((CharSequence)string2)) {
            string2 = ".jpg";
        }
        stringBuilder.append(string2);
        return new File(stringBuilder.toString());
    }

    private void b(final Context context) {
        List<d> list = this.h;
        if (list == null || list.size() == 0 && this.f != null) {
            this.f.a(new NullPointerException("image file cannot be null"));
        }
        Iterator iterator = this.h.iterator();
        while (iterator.hasNext()) {
            final d d2 = (d)iterator.next();
            AsyncTask.SERIAL_EXECUTOR.execute(new Runnable(){

                public void run() {
                    try {
                        e.this.i.sendMessage(e.this.i.obtainMessage(1));
                        File file = e.this.a(context, d2);
                        e.this.i.sendMessage(e.this.i.obtainMessage(0, (Object)file));
                        return;
                    }
                    catch (IOException iOException) {
                        e.this.i.sendMessage(e.this.i.obtainMessage(2, (Object)iOException));
                        return;
                    }
                }
            });
            iterator.remove();
        }
    }

    private File c(Context context, String string2) {
        if (TextUtils.isEmpty((CharSequence)this.b)) {
            this.b = e.super.a(context).getAbsolutePath();
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.b);
        stringBuilder.append("/");
        stringBuilder.append(string2);
        return new File(stringBuilder.toString());
    }

    public static b c(Context context) {
        return new b(context);
    }

    public boolean handleMessage(Message message) {
        f f2 = this.f;
        if (f2 == null) {
            return false;
        }
        int n2 = message.what;
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    return false;
                }
                f2.a((Throwable)message.obj);
                return false;
            }
            f2.onStart();
            return false;
        }
        f2.a((File)message.obj);
        return false;
    }

    public static class b {
        private Context a;
        private String b;
        private int c = 100;
        private g d;
        private f e;
        private m.a.a.b f;
        private List<d> g;

        b(Context context) {
            this.a = context;
            this.g = new ArrayList();
        }

        private e b() {
            return new e(this, null);
        }

        public b a(int n2) {
            this.c = n2;
            return this;
        }

        public b a(String string2) {
            this.g.add((Object)new d((b)this, string2){
                final /* synthetic */ String a;
                {
                    this.a = string2;
                }

                public java.io.InputStream a() {
                    return new java.io.FileInputStream(this.a);
                }

                public String b() {
                    return this.a;
                }
            });
            return this;
        }

        public b a(m.a.a.b b2) {
            this.f = b2;
            return this;
        }

        public b a(f f2) {
            this.e = f2;
            return this;
        }

        public void a() {
            this.b().b(this.a);
        }

        public b b(String string2) {
            this.b = string2;
            return this;
        }
    }

}

