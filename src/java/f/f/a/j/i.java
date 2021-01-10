/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  java.io.File
 *  java.io.IOException
 *  java.lang.IllegalStateException
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.net.InetAddress
 *  java.net.ServerSocket
 *  java.net.Socket
 *  java.util.Locale
 *  java.util.Map
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.CountDownLatch
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 *  java.util.concurrent.Future
 */
package f.f.a.j;

import android.content.Context;
import android.net.Uri;
import f.f.a.j.a.g;
import f.f.a.j.f;
import f.f.a.j.h;
import f.f.a.j.j;
import f.f.a.j.l;
import f.f.a.j.n;
import f.f.a.j.o;
import f.f.a.j.q;
import f.f.a.j.r;
import f.f.a.j.u;
import java.io.File;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class i {
    private static ExecutorService l = Executors.newFixedThreadPool((int)3);
    private final Object a;
    private final ExecutorService b;
    private final Map<String, j> c;
    private final ServerSocket d;
    private final int e;
    private final Thread f;
    private final f g;
    private final n h;
    private String i;
    private volatile int j;
    private volatile boolean k;

    private i(f f2) {
        void var3_5;
        this.a = new Object();
        this.b = Executors.newFixedThreadPool((int)8);
        this.c = new ConcurrentHashMap();
        this.j = 40;
        this.k = false;
        o.a(f2);
        this.g = f2;
        try {
            this.d = new ServerSocket(0, 8, InetAddress.getByName((String)"127.0.0.1"));
            this.e = this.d.getLocalPort();
            l.a("127.0.0.1", this.e);
            CountDownLatch countDownLatch = new CountDownLatch(1);
            this.f = new Thread((Runnable)(i)this.new d(countDownLatch));
            this.f.start();
            countDownLatch.await();
            this.h = new n("127.0.0.1", this.e);
            f.f.a.e.f.h.d("VideoCache", "\u6784\u9020\u51fd\u6570\u88ab\u6267\u884c");
            return;
        }
        catch (InterruptedException interruptedException) {
        }
        catch (IOException iOException) {
            // empty catch block
        }
        this.b.shutdown();
        throw new IllegalStateException("Error starting local proxy server", (Throwable)var3_5);
    }

    /* synthetic */ i(f f2, a a2) {
        super(f2);
    }

    static /* synthetic */ int a(i i2, int n2) {
        i2.j = n2;
        return n2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private j a(String string, String string2) {
        Object object;
        Object object2 = object = this.a;
        synchronized (object2) {
            j j2 = (j)this.c.get((Object)string);
            if (j2 == null) {
                j2 = new j(string, this.g, string2);
                this.c.put((Object)string, (Object)j2);
            }
            return j2;
        }
    }

    static /* synthetic */ void a(i i2) {
        try {
            while (!Thread.currentThread().isInterrupted()) {
                Socket socket = i2.d.accept();
                i2.b.submit((Runnable)i2.new c(socket));
            }
        }
        catch (IOException iOException) {
            new q("Error during waiting connection", iOException);
        }
    }

    /*
     * Exception decompiling
     */
    static /* synthetic */ void a(i var0, Socket var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl77.1 : ALOAD_0 : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:885)
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

    private void a(Socket socket) {
        try {
            if (!socket.isClosed()) {
                socket.close();
                return;
            }
        }
        catch (IOException iOException) {
            new q("Error closing socket", iOException);
        }
    }

    static /* synthetic */ boolean a(i i2, boolean bl) {
        i2.k = bl;
        return bl;
    }

    private File d(String string) {
        f f2 = this.g;
        return new File(f2.a, f2.b.b(string));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(f.f.a.j.d d2, String string) {
        Object object;
        o.a(new Object[]{d2, string});
        Object object2 = object = this.a;
        synchronized (object2) {
            this.c(string).a(d2);
            return;
        }
    }

    public final void a(String string) {
        this.i = string;
    }

    public final void a(String string, int n2, int n3, int n4, int n5) {
        if (!this.k) {
            this.k = true;
            Runnable runnable = new Runnable(){

                /*
                 * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
                 * Unable to fully structure code
                 * Enabled aggressive block sorting
                 * Enabled unnecessary exception pruning
                 * Enabled aggressive exception aggregation
                 * Lifted jumps to return sites
                 */
                public final void run() {
                    var1_1 = f.f.a.e.f.d.z(f.f.a.e.c.a.i().e());
                    if (var1_1 != 9 && var1_1 != 5) {
                        if (var1_1 == 4) {
                            var2_2 = i.this;
                            var3_3 = 45;
                        } else {
                            var2_2 = i.this;
                            var3_3 = 50;
                        }
                    } else {
                        var2_2 = i.this;
                        var3_3 = 40;
                    }
                    i.a(var2_2, var3_3);
                    Thread.sleep((long)100000L);
lbl15: // 2 sources:
                    do {
                        i.a(i.this, false);
                        return;
                        break;
                    } while (true);
                    {
                        catch (Throwable var7_4) {
                        }
                        catch (InterruptedException var5_5) {}
                        {
                            var5_5.printStackTrace();
                            ** continue;
                        }
                    }
                    i.a(i.this, false);
                    throw var7_4;
                }
            };
            l.execute(runnable);
        }
        if (n4 > n5 - this.j) {
            n4 = n5 - this.j;
        }
        if (n3 == 0) {
            return;
        }
        if (n2 * 100 / n3 >= n4) {
            this.a(string, true);
        }
    }

    public final void a(String string, boolean bl) {
        if (this.c(string) != null && this.c(string).a() != null) {
            this.c(string).a().a(bl);
        }
    }

    public final String b(String string) {
        o.a(string, "Url can't be null!");
        if (i.super.d(string).exists()) {
            File file;
            file = i.super.d(string);
            try {
                this.g.c.a(file);
            }
            catch (IOException iOException) {}
            return Uri.fromFile((File)file).toString();
        }
        if (this.h.a(3, 70)) {
            Locale locale = Locale.US;
            Object[] arrobject = new Object[]{"127.0.0.1", this.e, r.b(string)};
            string = String.format((Locale)locale, (String)"http://%s:%d/%s", (Object[])arrobject);
        }
        return string;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final j c(String string) {
        Object object;
        Object object2 = object = this.a;
        synchronized (object2) {
            j j2 = (j)this.c.get((Object)string);
            if (j2 == null && this.i != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("-->");
                stringBuilder.append(this.i);
                f.f.a.e.f.h.d("VideoCachepath", stringBuilder.toString());
                j2 = new j(string, this.g, this.i);
                this.c.put((Object)string, (Object)j2);
            }
            return j2;
        }
    }

    public static final class b {
        private File a;
        private f.f.a.j.a.c b;
        private f.f.a.j.a.a c;
        private f.f.a.j.e.c d;
        private f.f.a.j.c.b e;

        public b(Context context) {
            this.d = f.f.a.j.e.d.a(context);
            this.a = u.a(context);
            this.c = new f.f.a.j.a.h(0x20000000L);
            this.b = new g();
            this.e = new f.f.a.j.c.a();
        }

        public final b a(File file) {
            o.a(file);
            this.a = file;
            return this;
        }

        public final i a() {
            f f2 = new f(this.a, this.b, this.c, this.d, this.e);
            return new i(f2, null);
        }
    }

    /*
     * Exception performing whole class analysis ignored.
     */
    private final class c
    implements Runnable {
        private final Socket b;

        public c(Socket socket) {
            this.b = socket;
        }

        public final void run() {
            i.a(i.this, this.b);
        }
    }

    private final class d
    implements Runnable {
        private final CountDownLatch b;

        public d(CountDownLatch countDownLatch) {
            this.b = countDownLatch;
        }

        public final void run() {
            this.b.countDown();
            i.a(i.this);
        }
    }

}

