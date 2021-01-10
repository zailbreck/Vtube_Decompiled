/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.Intent
 *  android.database.Cursor
 *  android.net.Uri
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.os.Process
 *  android.text.TextUtils
 *  android.widget.Toast
 *  com.mintegral.msdk.base.common.report.a
 *  com.mintegral.msdk.base.common.report.d
 *  com.mintegral.msdk.optimize.a
 *  com.mintegral.msdk.optimize.b
 *  java.io.File
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.lang.reflect.Constructor
 *  java.lang.reflect.Method
 *  java.net.URLEncoder
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package f.f.a.g;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Process;
import android.text.TextUtils;
import android.widget.Toast;
import f.f.a.e.f.k;
import f.f.a.e.f.l;
import f.f.a.e.f.q;
import f.f.a.e.f.r;
import f.f.a.e.f.s;
import f.f.a.g.a;
import f.f.a.g.b;
import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public class b {
    public static boolean p;
    public static Set<String> q;
    public static Map<String, Long> r;
    public static Set<String> s;
    static Handler t;
    private String a;
    private long b;
    private long c;
    private f.f.a.e.d.h d = null;
    private Context e = null;
    private f.f.a.g.a f;
    private HashMap<String, f.f.a.g.a> g;
    private f.f.a.m.f h = null;
    private com.mintegral.msdk.base.common.report.d i;
    private boolean j;
    private f.f.a.f.a k;
    private boolean l;
    private boolean m = false;
    private boolean n = true;
    private boolean o;

    static {
        q = new HashSet();
        new HashMap();
        r = new HashMap();
        s = new HashSet();
        t = new Handler(Looper.getMainLooper()){

            public final void handleMessage(Message message) {
                super.handleMessage(message);
                int n2 = message.what;
                if (n2 != 0) {
                    if (n2 != 1) {
                        return;
                    }
                    b.d();
                    return;
                }
                Object object = message.obj;
                if (object != null && object instanceof Context) {
                    b.a((Context)object);
                }
            }
        };
    }

    public b(Context context, String string) {
        new Handler(){

            public final void handleMessage(Message message) {
                super.handleMessage(message);
                int n2 = message.what;
                if (n2 != 0) {
                    if (n2 != 1) {
                        if (n2 != 2) {
                            return;
                        }
                        if (b.this.h != null) {
                            b.this.h.b((f.f.a.m.a)message.obj);
                            return;
                        }
                    } else if (b.this.h != null) {
                        b.this.h.a(message.arg1);
                        return;
                    }
                } else if (b.this.h != null) {
                    b.this.h.a(null);
                }
            }
        };
        this.k = f.f.a.f.c.b().a(string);
        if (this.k == null) {
            this.k = f.f.a.f.c.b().a();
        }
        this.l = this.k.i();
        this.e = context.getApplicationContext();
        this.a = string;
        if (this.d == null) {
            this.d = f.f.a.e.d.h.a(this.e);
        }
        this.i = new com.mintegral.msdk.base.common.report.d(this.e);
        this.g = new HashMap();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(int n2, String string, f.f.a.e.e.a a2, f.f.a.m.f f2) {
        try {
            if (TextUtils.isEmpty((CharSequence)string)) return;
            if (n2 == 2) {
                f.f.a.e.f.k.a(this.e, string, a2, f2);
                return;
            }
            f.f.a.e.f.k.a(this.e, string, f2);
            return;
        }
        catch (Throwable throwable) {
            f.f.a.e.f.h.b("Mintegral SDK M", throwable.getMessage(), throwable);
        }
    }

    public static void a(Context context) {
        f.f.a.f.a a2 = f.f.a.f.c.b().a(f.f.a.e.c.a.i().f());
        if (a2 == null) {
            a2 = f.f.a.f.c.b().a();
        }
        if (a2 != null) {
            if (f.f.a.e.c.a.i().e() != null || context == null) {
                context = f.f.a.e.c.a.i().e();
            }
            Toast.makeText((Context)context, (CharSequence)a2.M(), (int)0).show();
        }
    }

    public static void a(Context context, f.f.a.e.e.a a2, String string, String string2, boolean bl, boolean bl2) {
        if (context == null) {
            return;
        }
        new f.f.a.g.a(context.getApplicationContext(), true).a("2", string, a2, new f.f.a.g.e(){

            public final void a(Object object) {
            }

            public final void a(Object object, String string) {
            }

            public final void b(Object object) {
            }
        }, string2, bl, bl2);
    }

    public static void a(Context context, f.f.a.e.e.a a2, String string, String[] arrstring, boolean bl, boolean bl2) {
        if (context != null && a2 != null && !TextUtils.isEmpty((CharSequence)string)) {
            if (arrstring == null) {
                return;
            }
            f.f.a.g.a a3 = new f.f.a.g.a(context.getApplicationContext(), true);
            for (int i2 = 0; i2 < arrstring.length; ++i2) {
                a3.a("2", string, a2, new f.f.a.g.e(){

                    public final void a(Object object) {
                    }

                    public final void a(Object object, String string) {
                    }

                    public final void b(Object object) {
                    }
                }, arrstring[i2], bl, bl2);
            }
        }
    }

    private void a(Context context, String string, String string2, String string3) {
        if (context == null) {
            return;
        }
        if (!TextUtils.isEmpty((CharSequence)string) && !TextUtils.isEmpty((CharSequence)string3)) {
            if (TextUtils.isEmpty((CharSequence)string2)) {
                string2 = "";
            }
            Cursor cursor = context.getContentResolver().query(Uri.parse((String)f.f.a.e.f.b.b("DFK/J75/JaEXWFfXYZPTHkPUHkPTWr2wWgf3LBPUYF2wWgSBYbHuH75BWFetJkPULcJDnkQ/L+SBYFJBDkT=")), null, null, new String[]{string3, string, string2, "0"}, null);
            if (cursor != null) {
                cursor.close();
            }
        }
    }

    public static void a(f.f.a.e.e.a a2, Context context, String string) {
        try {
            if (string.equals((Object)"start") || string.equals((Object)"downloading")) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    b.d();
                } else {
                    Message message = t.obtainMessage(1);
                    message.obj = context;
                    t.sendMessage(message);
                }
            }
            b.c(a2, context, string);
            return;
        }
        catch (Throwable throwable) {
            f.f.a.e.f.h.b("Mintegral SDK M", throwable.getMessage(), throwable);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(f.f.a.e.e.a a2, a.a a3, boolean bl, boolean bl2, boolean bl3, Boolean bl4) {
        try {
            block30 : {
                block36 : {
                    f.f.a.m.f f2;
                    String string;
                    block37 : {
                        block38 : {
                            int n2;
                            block31 : {
                                block33 : {
                                    block35 : {
                                        int n3;
                                        block34 : {
                                            block32 : {
                                                if (!this.n) {
                                                    return;
                                                }
                                                f.f.a.a.c = f.f.a.f.a.O();
                                                if (a2 == null || a3 == null) break block30;
                                                n3 = this.c();
                                                n2 = a3.a();
                                                if (!bl4.booleanValue()) {
                                                    if (TextUtils.isEmpty((CharSequence)a3.i())) return;
                                                    {
                                                        this.a(a2, a3.i(), bl4);
                                                        return;
                                                    }
                                                }
                                                if (TextUtils.isEmpty((CharSequence)a3.i()) && bl) {
                                                    int n4 = a2.l0();
                                                    if (n4 == 2) {
                                                        this.a(a2, a3, bl, bl3, this.c());
                                                        return;
                                                    }
                                                    if (n4 == 3) {
                                                        this.a(a2, a3, bl, bl3);
                                                        return;
                                                    }
                                                    f.f.a.e.f.k.a(this.e, a2.F(), this.h);
                                                    this.a(a3, a2, true, bl3);
                                                    if (this.h == null || !bl) return;
                                                    {
                                                        this.h.b(a2, a3.i());
                                                    }
                                                    return;
                                                }
                                                if (n2 != 1) break block31;
                                                StringBuilder stringBuilder = new StringBuilder();
                                                stringBuilder.append("Jump to Google Play: ");
                                                stringBuilder.append(a3.i());
                                                f.f.a.e.f.h.b("Mintegral SDK M", stringBuilder.toString());
                                                if (TextUtils.isEmpty((CharSequence)a2.g()) || TextUtils.isEmpty((CharSequence)a3.i()) || !a3.i().contains((CharSequence)a2.g()) || !bl) break block32;
                                                if (!k.d.a(this.e, a3.i(), this.h)) {
                                                    this.a(n3, a3.i(), a2, this.h);
                                                }
                                                break block33;
                                            }
                                            if (!bl) break block33;
                                            if (TextUtils.isEmpty((CharSequence)a2.g())) break block34;
                                            Context context = this.e;
                                            StringBuilder stringBuilder = new StringBuilder();
                                            stringBuilder.append("market://details?id=");
                                            stringBuilder.append(a2.g());
                                            if (k.d.a(context, stringBuilder.toString(), this.h)) break block35;
                                        }
                                        this.a(n3, a3.i(), a2, this.h);
                                    }
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append("code market This pkg is ");
                                    stringBuilder.append(a2.g());
                                    f.f.a.e.f.h.d("Mintegral SDK M", stringBuilder.toString());
                                }
                                if (this.h == null || !bl) break block36;
                                f2 = this.h;
                                string = a3.i();
                                break block37;
                            }
                            if (n2 != 3) break block38;
                            if (bl) {
                                if (f.f.a.a.c) {
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append("Jump to download: ");
                                    stringBuilder.append(a3.i());
                                    f.f.a.e.f.h.b("Mintegral SDK M", stringBuilder.toString());
                                    this.a(a2, a3.i(), bl4);
                                } else {
                                    f.f.a.e.f.k.a(this.e, a3.i(), this.h);
                                }
                            }
                            if (this.h == null || !bl) break block36;
                            f2 = this.h;
                            string = a3.i();
                            break block37;
                        }
                        if (!bl) break block36;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Jump to Web: ");
                        stringBuilder.append(a3.i());
                        f.f.a.e.f.h.b("Mintegral SDK M", stringBuilder.toString());
                        if (3 == a2.l0()) {
                            this.a(a2, a3, bl, bl3);
                            return;
                        }
                        if (2 == a2.l0()) {
                            this.a(a2, a3, bl, bl3, this.c());
                            return;
                        }
                        f.f.a.e.f.k.a(this.e, a3.i(), this.h);
                        if (this.h == null || !bl) break block36;
                        f2 = this.h;
                        string = a3.i();
                    }
                    f2.b(a2, string);
                }
                if (this.a(a2.l0(), a3.i())) {
                    this.a(a3, a2, false, bl3);
                } else {
                    this.a(a3, a2, true, bl3);
                }
                if (this.h == null || bl || !bl2) return;
                {
                    this.h.b(a2, a3.i());
                    return;
                }
            }
            if (!bl) return;
            {
                this.a(a3, a2, true, bl3);
                if (this.h == null || !bl) return;
                {
                    this.h.a(null, null);
                }
            }
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void a(f.f.a.e.e.a a2, String string) {
        if (!TextUtils.isEmpty((CharSequence)string)) {
            b.a(this.e, a2, this.a, string, true, false);
        }
    }

    /*
     * Exception decompiling
     */
    private void a(f.f.a.e.e.a var1, String var2, boolean var3) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl167 : GETSTATIC : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1133)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:607)
        // java.lang.Thread.run(Thread.java:761)
        throw new IllegalStateException("Decompilation failed");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(final f.f.a.e.e.a a2, boolean bl, boolean bl2, boolean bl3, int n2, final boolean bl4, Boolean bl5) {
        block19 : {
            try {
                boolean bl6;
                boolean bl7;
                block21 : {
                    block22 : {
                        boolean bl8;
                        block20 : {
                            this.b = System.currentTimeMillis();
                            bl8 = true;
                            if (bl) {
                                f.f.a.e.f.h.b("Mintegral SDK M", "Start 302 Redirection... ");
                                if (!bl3 && this.g.containsKey((Object)a2.F()) && !bl2) {
                                    return;
                                }
                                Context context = this.e;
                                if (bl2) {
                                    bl8 = false;
                                }
                                f.f.a.g.a a3 = new f.f.a.g.a(context, bl8);
                                this.g.put((Object)a2.F(), (Object)a3);
                                a3.a("2", this.a, a2, new f.f.a.g.e(this, a2, bl, n2){
                                    final /* synthetic */ f.f.a.e.e.a a;
                                    final /* synthetic */ boolean b;
                                    final /* synthetic */ int c;
                                    final /* synthetic */ b d;
                                    {
                                        this.d = b2;
                                        this.a = a2;
                                        this.b = bl;
                                        this.c = n2;
                                    }

                                    public final void a(Object object) {
                                        try {
                                            f.f.a.e.d.c.a(b.b(this.d)).a(this.a, b.c(this.d), this.b, 0, this.c);
                                            if (b.q != null) {
                                                b.q.add((Object)this.a.e());
                                                return;
                                            }
                                        }
                                        catch (Exception exception) {
                                            exception.printStackTrace();
                                        }
                                    }

                                    /*
                                     * Enabled aggressive block sorting
                                     * Enabled unnecessary exception pruning
                                     * Enabled aggressive exception aggregation
                                     */
                                    public final void a(Object object, String string) {
                                        try {
                                            if (this.b) {
                                                f.f.a.e.d.c.a(b.b(this.d)).a(this.a, b.c(this.d), this.b, 0, this.c);
                                            }
                                            if (object != null && object instanceof a.a) {
                                                b.a(this.d, (a.a)object, this.a, true, true);
                                            }
                                            b.d(this.d).remove((Object)this.a.F());
                                            if (b.q == null) return;
                                            b.q.remove((Object)this.a.e());
                                            return;
                                        }
                                        catch (Exception exception) {
                                            exception.printStackTrace();
                                        }
                                    }

                                    /*
                                     * Unable to fully structure code
                                     * Enabled aggressive block sorting
                                     * Enabled unnecessary exception pruning
                                     * Enabled aggressive exception aggregation
                                     * Lifted jumps to return sites
                                     */
                                    public final void b(Object var1) {
                                        if (var1 == null) ** GOTO lbl12
                                        try {
                                            if (var1 instanceof a.a) {
                                                var5_2 = (a.a)var1;
                                                var6_3 = new StringBuilder();
                                                var6_3.append("Redirection done...  code: ");
                                                var6_3.append(var5_2.a());
                                                f.f.a.e.f.h.b("Mintegral SDK M", var6_3.toString());
                                                if (this.a != null && var5_2 != null) {
                                                    this.a.a(var5_2);
                                                    b.a(this.d, this.a, this.b, var5_2, this.c, true);
                                                }
                                            }
lbl12: // 6 sources:
                                            if (this.a != null) {
                                                b.d(this.d).remove((Object)this.a.F());
                                            }
                                            if (b.q == null) return;
                                            if (this.a == null) return;
                                            b.q.remove((Object)this.a.e());
                                            return;
                                        }
                                        catch (Exception var2_4) {
                                            var2_4.printStackTrace();
                                        }
                                    }
                                });
                                return;
                            }
                            if (this.h != null && !bl4) {
                                this.h.c(a2, a2.F());
                                bl6 = bl8 ^ this.h.b();
                            } else {
                                bl6 = true;
                            }
                            if (this.g.containsKey((Object)a2.F())) {
                                ((f.f.a.g.a)this.g.get((Object)a2.F())).a();
                                this.g.remove((Object)a2.F());
                            }
                            bl7 = true;
                            this.o = false;
                            if (a2.f0() != null) {
                                if (!bl4) {
                                    this.a(a2, a2.f0(), bl7, this.m, false, bl5);
                                }
                                this.o = bl8;
                                this.m = false;
                                bl7 = false;
                            }
                            if (f.f.a.e.d.c.a(this.d).a(a2.e(), this.a) && a2.f0() != null) break block19;
                            f.f.a.e.d.c c2 = f.f.a.e.d.c.a(this.d);
                            c2.c();
                            a.a a4 = c2.b(a2.e(), this.a);
                            if (a4 == null || bl4) break block20;
                            a2.a(a4);
                            if (!bl7) break block21;
                            if (!bl4) {
                                this.a(a2, a4, bl7, this.m, false, bl5);
                            }
                            this.o = bl8;
                            break block22;
                        }
                        if (a2.G().equals((Object)"6") && !a2.g().isEmpty() && a2.l0() == 2 && !bl4) {
                            Context context = this.e;
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("market://details?id=");
                            stringBuilder.append(a2.g());
                            k.d.a(context, stringBuilder.toString(), this.h);
                            if (this.h != null && bl7) {
                                this.h.c(a2);
                                this.h.b(a2, null);
                            }
                            this.o = bl8;
                            bl7 = false;
                        }
                        if (!bl4) break block21;
                        this.o = bl8;
                    }
                    this.m = false;
                    bl7 = false;
                }
                f.f.a.e.f.h.b("Mintegral SDK M", "Start 302 Redirection... ");
                new Handler(Looper.getMainLooper()).post(new Runnable(){

                    public final void run() {
                        if (bl6 && !b.p && !b.this.o && f.f.a.a.d && !bl4) {
                            b.a(b.this, a2);
                        }
                        if (!bl6 && b.this.h != null && !b.p && !b.this.o && f.f.a.a.d) {
                            b.this.h.d(a2);
                        }
                    }
                });
                if (this.f != null) {
                    this.f.a();
                }
                if (s != null && s.contains((Object)a2.e())) {
                    if (this.h != null) {
                        this.h.c(a2);
                        this.h.b(a2, a2.F());
                    }
                    f.f.a.e.f.h.b("Mintegral SDK M", "\u70b9\u51fb\u6b63\u5728tracking");
                    return;
                }
                s.add((Object)a2.e());
                f.f.a.g.a a5 = this.f = new f.f.a.g.a(this.e, false);
                String string = this.a;
                f.f.a.g.e e2 = new f.f.a.g.e(this, a2, bl7, bl5, n2, bl6){
                    final /* synthetic */ f.f.a.e.e.a a;
                    final /* synthetic */ boolean b;
                    final /* synthetic */ Boolean c;
                    final /* synthetic */ int d;
                    final /* synthetic */ boolean e;
                    final /* synthetic */ b f;
                    {
                        this.f = b2;
                        this.a = a2;
                        this.b = bl;
                        this.c = bl2;
                        this.d = n2;
                        this.e = bl3;
                    }

                    public final void a(Object object) {
                    }

                    public final void a(Object object, String string) {
                        Set<String> set = b.s;
                        if (set != null) {
                            set.remove((Object)this.a.e());
                        }
                        if (object != null && object instanceof a.a) {
                            b.a(this.f, true);
                            b.a(this.f, (a.a)object, this.a, true, false);
                        }
                        if (b.a(this.f) != null) {
                            b.a(this.f).a(this.a, string);
                        }
                        b.a(this.f, this.e, this.a);
                    }

                    public final void b(Object object) {
                        Set<String> set = b.s;
                        if (set != null) {
                            set.remove((Object)this.a.e());
                        }
                        if (object != null && object instanceof a.a) {
                            a.a a2 = (a.a)object;
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Redirection done...   code: ");
                            stringBuilder.append(a2.a());
                            f.f.a.e.f.h.b("Mintegral SDK M", stringBuilder.toString());
                            b.a(this.f, true);
                            this.a.a(a2);
                            b b2 = this.f;
                            b.a(b2, this.a, a2, this.b, b.f(b2), false, this.c);
                            if (a2.k()) {
                                f.f.a.e.d.c.a(b.b(this.f)).a(this.a, b.c(this.f), false, -1, this.d);
                            }
                            b.a(this.f, this.e, this.a);
                        }
                    }
                };
                a5.a("1", string, a2, e2);
                return;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(a.a a2, f.f.a.e.e.a a3, int n2, boolean bl) {
        if (a3 == null) return;
        if (a2 == null) {
            return;
        }
        try {
            this.c = System.currentTimeMillis() - this.b;
            f.f.a.e.e.e e2 = new f.f.a.e.e.e();
            int n3 = f.f.a.e.f.d.z(this.e);
            e2.a(n3);
            e2.a(f.f.a.e.f.d.a(this.e, n3));
            e2.j(a3.M0());
            e2.d(n2);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.c);
            stringBuilder.append("");
            e2.i(stringBuilder.toString());
            e2.h(a3.e());
            e2.f(a2.h());
            boolean bl2 = TextUtils.isEmpty((CharSequence)a2.i());
            if (!bl2) {
                e2.g(URLEncoder.encode((String)a2.i(), (String)"utf-8"));
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(this.b / 1000L);
            stringBuilder2.append("");
            e2.c(stringBuilder2.toString());
            e2.b(Integer.parseInt((String)a3.k0()));
            e2.c(a3.l0());
            e2.b(this.a);
            if (a2 == null) return;
            e2.f(a2.h());
            if (!TextUtils.isEmpty((CharSequence)a2.i())) {
                e2.g(URLEncoder.encode((String)a2.i(), (String)"utf-8"));
            }
            if (this.l) {
                e2.e(a2.g());
                if (!TextUtils.isEmpty((CharSequence)a2.d())) {
                    e2.e(URLEncoder.encode((String)a2.d(), (String)"utf-8"));
                }
                if (!TextUtils.isEmpty((CharSequence)a2.b())) {
                    e2.f(URLEncoder.encode((String)a2.b(), (String)"UTF-8"));
                }
                if (!TextUtils.isEmpty((CharSequence)a2.c())) {
                    e2.d(URLEncoder.encode((String)a2.c(), (String)"utf-8"));
                }
            }
            if (bl) {
                this.i.a("click_jump_error", e2, this.a);
                return;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add((Object)e2);
            String string = f.f.a.e.e.e.a((List<f.f.a.e.e.e>)arrayList);
            if (!r.b(string)) return;
            if (com.mintegral.msdk.base.common.report.a.b().a()) {
                com.mintegral.msdk.base.common.report.a.b().a(string);
                return;
            }
            new com.mintegral.msdk.base.common.report.d(this.e, 0).a("click_jump_success", string, null, null);
            return;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(a.a a2, f.f.a.e.e.a a3, boolean bl, boolean bl2) {
        int n2;
        if (this.j) {
            n2 = 1;
        } else {
            if (!bl2) {
                return;
            }
            n2 = 2;
        }
        b.super.a(a2, a3, n2, bl);
    }

    static /* synthetic */ void a(b b2, f.f.a.e.e.a a2) {
        try {
            Intent intent = new Intent(b2.e, f.f.a.m.e.class);
            intent.setFlags(268435456);
            intent.putExtra("icon_url", a2.d());
            b2.e.startActivity(intent);
            return;
        }
        catch (Exception exception) {
            f.f.a.e.f.h.b("Mintegral SDK M", "Exception", exception);
            return;
        }
    }

    static /* synthetic */ void a(b b2, f.f.a.e.e.a a2, a.a a3, boolean bl, boolean bl2, boolean bl3, Boolean bl4) {
        b2.a(a2, a3, bl, bl2, bl3, bl4);
    }

    static /* synthetic */ void a(b b2, f.f.a.e.e.a a2, String string, boolean bl) {
        String string2 = a2 != null && !TextUtils.isEmpty((CharSequence)a2.g()) ? a2.g() : string;
        try {
            boolean[] arrbl = new boolean[1];
            File file = f.f.a.e.f.f.a("/apk", b2.e, arrbl);
            String string3 = f.f.a.g.c.a(string);
            com.mintegral.msdk.optimize.b b3 = new com.mintegral.msdk.optimize.b(b2, bl, a2, string2, string){};
            com.mintegral.msdk.optimize.a.a((File)file, (String)string3, (String)string, (com.mintegral.msdk.optimize.b)b3);
            return;
        }
        catch (Throwable throwable) {
            f.f.a.g.c.a(f.f.a.e.c.a.i().e(), string, string2);
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    static /* synthetic */ void a(b var0, f.f.a.e.e.a var1_4, boolean var2_5, a.a var3_2, int var4_3, boolean var5_1) {
        if (var1_4 == null) {
            return;
        }
        var6_6 = "";
        if (var3_2 == null) ** GOTO lbl7
        try {
            var6_6 = var3_2.i();
lbl7: // 2 sources:
            var8_7 = f.f.a.e.d.c.a(var0.d);
            if (!var0.a(var1_4.l0(), var6_6)) {
                var0.a(var3_2, var1_4, true, var5_1);
                var8_7.a(var1_4, var0.a, var2_5, 0, var4_3);
                return;
            }
            var0.a(var3_2, var1_4, false, var5_1);
            if (var1_4.f0() != null && !TextUtils.isEmpty((CharSequence)var1_4.u0())) {
                var1_4.f0().d(var1_4.u0());
            }
            var8_7.a(var1_4, var0.a, var2_5, 1, var4_3);
            return;
        }
        catch (Exception var7_8) {
            var7_8.printStackTrace();
            return;
        }
    }

    static /* synthetic */ void a(b b2, a.a a2, f.f.a.e.e.a a3, boolean bl, boolean bl2) {
        b2.a(a2, a3, bl, bl2);
    }

    static /* synthetic */ void a(b b2, final boolean bl, final f.f.a.m.a a2) {
        new Handler(Looper.getMainLooper()).post(new Runnable(){

            public final void run() {
                if (bl && !b.p && f.f.a.a.d) {
                    b.g(b.this);
                }
                if (b.this.h != null && !b.p && f.f.a.a.d) {
                    b.this.h.c(a2);
                }
            }
        });
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private boolean a(int var1_1, String var2_2) {
        if (var1_1 != 2) ** GOTO lbl5
        try {
            if (k.d.a(var2_2) == false) return false;
            return true;
lbl5: // 1 sources:
            var4_3 = TextUtils.isEmpty((CharSequence)var2_2);
            if (var4_3 != false) return false;
            return true;
        }
        catch (Exception var3_4) {
            var3_4.printStackTrace();
        }
        return false;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private boolean a(f.f.a.e.e.a var1_1, a.a var2_4, boolean var3_3, boolean var4) {
        var5_5 = false;
        if (!var3_3) ** GOTO lbl6
        try {
            f.f.a.e.f.k.a(this.e, var1_1.F(), this.h);
            var5_5 = true;
lbl6: // 2 sources:
            if (var5_5) {
                b.super.a(var2_4, var1_1, true, var4);
                if (this.h == null) return var5_5;
                if (var3_3 == false) return var5_5;
                this.h.b(var1_1, var2_4.i());
                return var5_5;
            }
            b.super.a(var2_4, var1_1, true, var4);
            if (this.h == null) return var5_5;
            if (var3_3 == false) return var5_5;
            this.h.a(var1_1, var2_4.i());
            return var5_5;
        }
        catch (Throwable var6_6) {}
        f.f.a.e.f.h.b("Mintegral SDK M", var6_6.getMessage(), var6_6);
        return var5_5;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private boolean a(f.f.a.e.e.a var1_4, a.a var2_5, boolean var3_2, boolean var4_3, int var5_1) {
        var6_6 = false;
        if (!var3_2) ** GOTO lbl35
        try {
            block8 : {
                block4 : {
                    block7 : {
                        block6 : {
                            block5 : {
                                block3 : {
                                    var8_7 = Integer.valueOf((String)var1_4.k0());
                                    var6_6 = false;
                                    if (var8_7 != 1) break block3;
                                    f.f.a.e.f.k.a(this.e, var2_5.i(), this.h);
                                    break block4;
                                }
                                var6_6 = false;
                                if (var8_7 != 2) break block5;
                                f.f.a.e.f.k.a(this.e, var2_5.i(), var1_4, this.h);
                                break block4;
                            }
                            var9_8 = var1_4.g();
                            var6_6 = false;
                            if (var9_8 == null) break block6;
                            var10_9 = this.e;
                            var11_10 = new StringBuilder();
                            var11_10.append("market://details?id=");
                            var11_10.append(var1_4.g());
                            if (k.d.a(var10_9, var11_10.toString(), this.h)) break block4;
                            var14_11 = var2_5.i();
                            var15_12 = this.h;
                            break block7;
                        }
                        var14_11 = var2_5.i();
                        var15_12 = this.h;
                    }
                    this.a(var5_1, var14_11, var1_4, var15_12);
                    var6_6 = false;
                    break block8;
                }
                var6_6 = true;
            }
            if (var6_6) {
                this.a(var2_5, var1_4, true, var4_3);
                if (this.h == null) return var6_6;
                if (var3_2 == false) return var6_6;
                this.h.b(var1_4, var2_5.i());
                return var6_6;
            }
            this.a(var2_5, var1_4, true, var4_3);
            if (this.h == null) return var6_6;
            if (var3_2 == false) return var6_6;
            this.h.a(var1_4, var2_5.i());
            return var6_6;
        }
        catch (Throwable var7_13) {}
        f.f.a.e.f.h.b("Mintegral SDK M", var7_13.getMessage(), var7_13);
        return var6_6;
    }

    static /* synthetic */ boolean a(b b2, boolean bl) {
        b2.j = bl;
        return bl;
    }

    static /* synthetic */ f.f.a.e.d.h b(b b2) {
        return b2.d;
    }

    public static void b(f.f.a.e.e.a a2, Context context, String string) {
        try {
            if (string.equals((Object)"start") || string.equals((Object)"downloading")) {
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    b.a(context);
                } else {
                    Message message = t.obtainMessage(0);
                    message.obj = context;
                    t.sendMessage(message);
                }
            }
            b.c(a2, context, string);
            return;
        }
        catch (Throwable throwable) {
            f.f.a.e.f.h.b("Mintegral SDK M", throwable.getMessage(), throwable);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void b(f.f.a.e.e.a a2, String string, boolean bl) {
        String string2 = a2 != null && !TextUtils.isEmpty((CharSequence)a2.g()) ? a2.g() : string;
        try {
            f.f.a.e.f.k.a(string, 1, a2);
            Context context = f.f.a.e.c.a.i().e();
            boolean bl2 = s.a(context);
            boolean bl3 = s.c(context);
            if (!s.b(context)) {
                f.f.a.g.c.a(context, string, string2);
                return;
            }
            if (!bl3) {
                b.super.c(a2, string, bl);
                return;
            }
            if (!bl2) {
                b.super.c(a2, string, bl);
                return;
            }
            Context context2 = f.f.a.e.c.a.i().e();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append("isDowning");
            q.a(context2, stringBuilder.toString(), System.currentTimeMillis());
            Context context3 = f.f.a.e.c.a.i().e();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(string2);
            stringBuilder2.append("process");
            q.a(context3, stringBuilder2.toString(), Process.myPid());
            Class class_ = Class.forName((String)"com.mintegral.msdk.mtgdownload.g");
            Constructor constructor = class_.getConstructor(new Class[]{Context.class, String.class});
            Object[] arrobject = new Object[]{f.f.a.e.c.a.i().e(), string};
            Object object = constructor.newInstance(arrobject);
            Method method = class_.getMethod("setTitle", new Class[]{String.class});
            Object[] arrobject2 = new Object[]{a2.c()};
            method.invoke(object, arrobject2);
            Method method2 = class_.getMethod("setDownloadListener", new Class[]{f.f.a.m.d.class});
            Object[] arrobject3 = new Object[1];
            f.f.a.m.d d2 = new f.f.a.m.d((b)this, a2, bl, string2, string){};
            arrobject3[0] = d2;
            method2.invoke(object, arrobject3);
            class_.getMethod("start", new Class[0]).invoke(object, new Object[0]);
            return;
        }
        catch (Throwable throwable) {
            Context context = f.f.a.e.c.a.i().e();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append("isDowning");
            q.a(context, stringBuilder.toString(), 0L);
            Context context4 = f.f.a.e.c.a.i().e();
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(string2);
            stringBuilder3.append("process");
            q.a(context4, stringBuilder3.toString(), 0);
            if (f.f.a.a.a) {
                throwable.printStackTrace();
            }
            b.super.c(a2, string, bl);
            return;
        }
    }

    private int c() {
        try {
            if (this.k != null) {
                int n2 = this.k.b();
                return n2;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return 1;
    }

    static /* synthetic */ String c(b b2) {
        return b2.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void c(f.f.a.e.e.a a2, Context context, String string) {
        block8 : {
            if (a2 == null) return;
            try {
                block12 : {
                    block13 : {
                        block11 : {
                            block9 : {
                                block10 : {
                                    if (a2.s0() == null) {
                                        return;
                                    }
                                    if (string.equals((Object)"start") || string.equals((Object)"shortcuts_start")) break block9;
                                    if (!string.equals((Object)"end")) break block10;
                                    String[] arrstring = a2.s0().b();
                                    if (arrstring == null) return;
                                    break block11;
                                }
                                if (!string.equals((Object)"install")) return;
                                String[] arrstring = a2.s0().c();
                                if (arrstring == null) break block12;
                                break block13;
                            }
                            String[] arrstring = a2.s0().a();
                            if (arrstring == null) return;
                            break block8;
                        }
                        for (int i2 = 0; i2 < a2.s0().b().length; ++i2) {
                            b.a(context, a2, a2.B(), a2.s0().b()[i2], false, false);
                        }
                        return;
                    }
                    for (int i3 = 0; i3 < a2.s0().c().length; ++i3) {
                        b.a(context, a2, a2.B(), a2.s0().c()[i3], false, false);
                    }
                }
                f.f.a.e.d.f.b(f.f.a.e.d.h.a(context)).e(a2.g());
                return;
            }
            catch (Throwable throwable) {
                f.f.a.e.f.h.b("Mintegral SDK M", throwable.getMessage(), throwable);
                return;
            }
        }
        for (int i4 = 0; i4 < a2.s0().a().length; ++i4) {
            b.a(context, a2, a2.B(), a2.s0().a()[i4], false, false);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void c(final f.f.a.e.e.a a2, final String string, final boolean bl) {
        String string2;
        block6 : {
            block5 : {
                if (a2 != null) {
                    try {
                        if (TextUtils.isEmpty((CharSequence)a2.g())) break block5;
                        string2 = a2.g();
                        break block6;
                    }
                    catch (Throwable throwable) {
                        if (f.f.a.a.a) {
                            throwable.printStackTrace();
                        }
                        return;
                    }
                }
            }
            string2 = string;
        }
        f.f.a.e.f.k.a(string, 2, a2);
        Context context = f.f.a.e.c.a.i().e();
        if (!s.b(context)) {
            f.f.a.g.c.a(context, string, string2);
            return;
        }
        Context context2 = f.f.a.e.c.a.i().e();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append("isDowning");
        q.a(context2, stringBuilder.toString(), System.currentTimeMillis());
        Context context3 = f.f.a.e.c.a.i().e();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(string2);
        stringBuilder2.append("process");
        q.a(context3, stringBuilder2.toString(), Process.myPid());
        new Thread(new Runnable(){

            public final void run() {
                b.a(b.this, a2, string, bl);
            }
        }).start();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private boolean c(f.f.a.e.e.a var1_1) {
        if (var1_1 == null) ** GOTO lbl4
        try {
            block7 : {
                if (2 == var1_1.l0()) break block7;
lbl4: // 2 sources:
                if (3 != var1_1.l0()) return true;
            }
            var3_2 = var1_1.e();
            if (b.r == null) return true;
            var4_3 = b.r.containsKey((Object)var3_2);
            if (var4_3 && (var10_4 = (Long)b.r.get((Object)var3_2)) != null) {
                var11_5 = System.currentTimeMillis();
                if (var10_4 > var11_5 || b.s.contains((Object)var1_1.e())) {
                    var13_6 = new StringBuilder();
                    var13_6.append("\u70b9\u51fb\u65f6\u95f4\u672a\u8d85\u8fc7coit ");
                    var13_6.append(var11_5);
                    var13_6.append("|");
                    var13_6.append((Object)var10_4);
                    f.f.a.e.f.h.b("Mintegral SDK M", var13_6.toString());
                    return false;
                }
            }
            var5_7 = new StringBuilder();
            var5_7.append("\u672a\u53d1\u73b0\u6709\u70b9\u51fb\u6216\u70b9\u51fb\u8d85\u65f6\u4fdd\u5b58\u70b9\u51fb\u65f6\u95f4 interval = ");
            var5_7.append(var1_1.E());
            f.f.a.e.f.h.b("Mintegral SDK M", var5_7.toString());
            var8_8 = 1000 * var1_1.E();
            b.r.put((Object)var1_1.e(), (Object)(System.currentTimeMillis() + (long)var8_8));
            return true;
        }
        catch (Exception var2_9) {
            if (f.f.a.a.a == false) return true;
            var2_9.printStackTrace();
        }
        return true;
    }

    static /* synthetic */ HashMap d(b b2) {
        return b2.g;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void d() {
        try {
            String string;
            Context context;
            String string2 = Locale.getDefault().getLanguage();
            if (!TextUtils.isEmpty((CharSequence)string2) && string2.equals((Object)"zh")) {
                context = f.f.a.e.c.a.i().e();
                string = "\u6b63\u5728\u4e0b\u8f7d\u4e2d,\u8bf7\u7a0d\u5019...";
            } else {
                context = f.f.a.e.c.a.i().e();
                string = "Downloading....";
            }
            Toast.makeText((Context)context, (CharSequence)string, (int)0).show();
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    static /* synthetic */ boolean f(b b2) {
        return b2.m;
    }

    static /* synthetic */ void g(b b2) {
        try {
            Intent intent = new Intent();
            intent.setAction("ExitApp");
            b2.e.sendBroadcast(intent);
            return;
        }
        catch (Exception exception) {
            f.f.a.e.f.h.b("Mintegral SDK M", "Exception", exception);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a() {
        try {
            Set set;
            if (this.g != null && (set = this.g.entrySet()) != null && set.size() > 0) {
                for (Map.Entry entry : set) {
                    f.f.a.g.a a2;
                    if (entry == null || (a2 = (f.f.a.g.a)entry.getValue()) == null) continue;
                    a2.a();
                }
            }
            this.h = null;
            return;
        }
        catch (Exception exception) {}
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(f.f.a.e.e.a a2) {
        try {
            if (!b.super.c(a2)) {
                return;
            }
            f.f.a.e.d.c c2 = f.f.a.e.d.c.a(this.d);
            c2.c();
            a.a a3 = c2.b(a2.e(), this.a);
            if (a3 != null) {
                if (a3.f() != null) {
                    a3.d(null);
                }
                a2.a(a3);
                c2.a(a2, this.a, false, -1, a2.Y0());
            }
            if (f.f.a.g.c.b(this.e, a2.g())) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(a2.g());
                stringBuilder.append(" is intalled.");
                f.f.a.e.f.h.a("Mintegral SDK M", stringBuilder.toString());
                return;
            }
            b.super.a(a2, false, false, false, a2.Y0(), false, false);
            return;
        }
        catch (Throwable throwable) {
            f.f.a.e.f.h.b("Mintegral SDK M", throwable.getMessage(), throwable);
            return;
        }
    }

    public final void a(f.f.a.m.f f2) {
        this.h = f2;
    }

    public final void a(boolean bl) {
        this.n = bl;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void b(f.f.a.e.e.a a2) {
        try {
            this.j = false;
            if (!b.super.c(a2)) {
                return;
            }
            String string = a2.u0();
            f.f.a.e.d.c c2 = f.f.a.e.d.c.a(this.d);
            c2.c();
            a.a a3 = c2.b(a2.e(), this.a);
            if (a3 != null) {
                if (a3.f() != null) {
                    a3.d(null);
                }
                a2.a(a3);
                c2.a(a2, this.a, false, -1, a2.Y0());
            }
            if (l.a(a2)) {
                if (f.f.a.g.c.c(this.e, a2.I())) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(string);
                    stringBuilder.append("&opdptype=1");
                    b.super.a(a2, stringBuilder.toString());
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string);
                stringBuilder.append("&opdptype=0");
                string = stringBuilder.toString();
            }
            b.super.a(a2, string);
            if (!TextUtils.isEmpty((CharSequence)a2.O())) {
                b.super.a(this.e, a2.O(), a2.P(), a2.y());
                return;
            }
            if (f.f.a.g.c.b(this.e, a2.g())) {
                f.f.a.g.c.d(this.e, a2.g());
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(a2.g());
                stringBuilder.append(" is intalled.");
                f.f.a.e.f.h.a("Mintegral SDK M", stringBuilder.toString());
                if (this.h != null) {
                    this.h.c(a2, a2.F());
                }
                b.super.a(a2, false, false, false, a2.Y0(), true, true);
                if (this.h == null) return;
                {
                    this.h.b(a2, a2.F());
                    f.f.a.e.f.k.a(this.h);
                    return;
                }
            }
            int n2 = a2.l0();
            int n3 = b.super.c();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("======302\u8df3\u8f6c\u524dlinkType:");
            stringBuilder.append(n2);
            stringBuilder.append(" openType:");
            stringBuilder.append(n3);
            stringBuilder.append("======landingType\uff1a");
            stringBuilder.append(a2.k0());
            f.f.a.e.f.h.b("Mintegral SDK M", stringBuilder.toString());
            boolean bl = n2 == 8 || n2 == 9 || n2 == 4;
            if (bl) {
                String string2 = a2.F();
                if (this.h != null) {
                    this.h.c(a2, string2);
                }
                if (TextUtils.isEmpty((CharSequence)string2)) {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append("linketype=");
                    stringBuilder2.append(n2);
                    stringBuilder2.append(" clickurl \u4e3a\u7a7a");
                    f.f.a.e.f.h.b("Mintegral SDK M", stringBuilder2.toString());
                    if (this.h != null) {
                        this.h.a(a2, string2);
                    }
                    b.super.a(a3, a2, true, false);
                    return;
                }
                if (n2 == 8) {
                    f.f.a.e.f.h.b("Mintegral SDK M", "linketype=8 \u7528webview \u6253\u5f00");
                    f.f.a.e.f.k.a(this.e, string2, a2, this.h);
                    b.super.a(a3, a2, false, false);
                    if (this.h == null) return;
                    {
                        this.h.b(a2, string2);
                        return;
                    }
                }
                if (n2 == 9) {
                    f.f.a.e.f.h.b("Mintegral SDK M", "linketype=9 \u7528\u6d4f\u89c8\u5668 \u6253\u5f00");
                    f.f.a.e.f.k.a(this.e, string2, this.h);
                    b.super.a(a3, a2, false, false);
                    if (this.h == null) return;
                    {
                        this.h.b(a2, string2);
                        return;
                    }
                }
                if (n2 == 4) {
                    if (n3 == 2) {
                        f.f.a.e.f.h.b("Mintegral SDK M", "linketype=4 opent=2 \u7528webview \u6253\u5f00");
                        f.f.a.e.f.k.a(this.e, string2, a2, this.h);
                    } else {
                        f.f.a.e.f.h.b("Mintegral SDK M", "linketype=4 opent=\u4e0d\u4e3a2 \u7528Browser \u6253\u5f00");
                        f.f.a.e.f.k.a(this.e, string2, this.h);
                    }
                }
                if (this.h != null) {
                    this.h.b(a2, string2);
                }
                b.super.a(a3, a2, false, false);
                return;
            }
            if (n2 == 2) {
                StringBuilder stringBuilder3 = new StringBuilder();
                stringBuilder3.append("linktype\u4e3a2 \u5f00\u59cb\u505a302\u8df3\u8f6c");
                stringBuilder3.append(a2.F());
                f.f.a.e.f.h.b("Mintegral SDK M", stringBuilder3.toString());
                if (!a2.F().startsWith("market://") && !a2.F().startsWith("https://play.google.com/")) {
                    b.super.a(a2, false, true, false, a2.Y0(), false, true);
                    return;
                }
                if (this.h != null) {
                    this.h.c(a2, a2.F());
                }
                if (!k.d.a(this.e, a2.F(), this.h)) {
                    b.super.a(n3, a2.F(), a2, this.h);
                }
                b.super.a(a3, a2, false, false);
                StringBuilder stringBuilder4 = new StringBuilder();
                stringBuilder4.append("\u4e0d\u7528\u505a302\u8df3\u8f6c \u6700\u7ec8\u5730\u5740\u5df2\u7ecf\u662fgp\u4e86\uff1a");
                stringBuilder4.append(a2.F());
                f.f.a.e.f.h.b("Mintegral SDK M", stringBuilder4.toString());
                if (this.h == null) return;
                {
                    this.h.b(a2, a2.F());
                    return;
                }
            }
            if (n2 == 3) {
                StringBuilder stringBuilder5 = new StringBuilder();
                stringBuilder5.append("linktype\u4e3a3 \u5f00\u59cb\u505a302\u8df3\u8f6c");
                stringBuilder5.append(a2.F());
                f.f.a.e.f.h.b("Mintegral SDK M", stringBuilder5.toString());
                b.super.a(a2, false, true, false, a2.Y0(), false, true);
                return;
            }
            String string3 = a2.F();
            if (TextUtils.isEmpty((CharSequence)string3)) {
                StringBuilder stringBuilder6 = new StringBuilder();
                stringBuilder6.append("linketype=");
                stringBuilder6.append(n2);
                stringBuilder6.append(" clickurl \u4e3a\u7a7a");
                f.f.a.e.f.h.b("Mintegral SDK M", stringBuilder6.toString());
                if (this.h != null) {
                    this.h.a(a2, string3);
                }
                b.super.a(a3, a2, true, false);
                return;
            }
            if (this.h != null) {
                this.h.b(a2, string3);
            }
            f.f.a.e.f.h.b("Mintegral SDK M", "linketyp\u4e0d\u662f23489\u7684\u503c \u7528\u6d4f\u89c8\u5668 \u6253\u5f00");
            f.f.a.e.f.k.a(this.e, string3, this.h);
            b.super.a(a3, a2, false, false);
            return;
        }
        catch (Throwable throwable) {
            f.f.a.e.f.h.b("Mintegral SDK M", throwable.getMessage(), throwable);
            return;
        }
    }

}

