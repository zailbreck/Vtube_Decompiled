/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.util.Log
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.Socket
 *  java.nio.ByteBuffer
 *  java.nio.ByteOrder
 *  java.util.Arrays
 *  java.util.List
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 *  java.util.concurrent.atomic.AtomicInteger
 */
package f.f.a.e.b.h;

import android.text.TextUtils;
import android.util.Log;
import f.f.a.e.b.h.g;
import f.f.a.e.b.h.n;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class p {
    private static final String b = "p";
    private static String c = "analytics.tike.bid";
    private static int d = 9377;
    private static volatile AtomicInteger e = new AtomicInteger(1);
    private ExecutorService a;

    private p() {
        this.a = Executors.newCachedThreadPool();
    }

    /* synthetic */ p(a a2) {
    }

    public static p a() {
        return c.a;
    }

    static /* synthetic */ String b() {
        return b;
    }

    static /* synthetic */ String c() {
        return c;
    }

    static /* synthetic */ int d() {
        return d;
    }

    static /* synthetic */ AtomicInteger e() {
        return e;
    }

    public final void a(int n2) {
        d = n2;
    }

    public final void a(String string, g g2) {
        void var4_3 = this;
        synchronized (var4_3) {
            this.a.execute((Runnable)new b((p)this, string, g2));
            return;
        }
    }

    private final class b
    implements Runnable {
        private String b;
        private ByteBuffer c;
        private OutputStream d;
        private boolean e = false;
        private g f;
        private Socket g;

        b(p p2, String string, g g2) {
            this.b = string;
            this.e = false;
            this.f = g2;
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        public final void run() {
            var1_1 = p.b();
            var2_2 = new StringBuilder();
            var2_2.append("SendService: msg = ");
            var2_2.append(this.b);
            Log.d((String)var1_1, (String)var2_2.toString());
            try {
                this.g = new Socket(p.c(), p.d());
                this.g.setSoTimeout(15000);
                var17_3 = p.b();
                var18_4 = new StringBuilder();
                var18_4.append("SendService: new socket.isConnected = ");
                var18_4.append(this.g.isConnected());
                Log.d((String)var17_3, (String)var18_4.toString());
                this.d = this.g.getOutputStream();
                this.c = ByteBuffer.wrap((byte[])new byte[8]);
                this.c.order(ByteOrder.BIG_ENDIAN);
                this.c.put((byte)1);
                if (TextUtils.isEmpty((CharSequence)this.b)) {
                    this.c.put((byte)1);
                } else {
                    var24_5 = this.c;
                    var25_6 = this.e != false ? 3 : 2;
                    var24_5.put(var25_6);
                }
                this.c.putShort((short)p.e().getAndIncrement());
                if (TextUtils.isEmpty((CharSequence)this.b)) {
                    this.c.putInt(0);
                    Log.d((String)p.b(), (String)Arrays.toString((byte[])this.c.array()));
                    this.d.write(this.c.array());
                } else {
                    var28_7 = this.b.getBytes().length;
                    this.c.putInt(var28_7);
                    this.d.write(this.c.array());
                    var30_8 = p.b();
                    var31_9 = new StringBuilder();
                    var31_9.append("msg.getBytes().length = ");
                    var31_9.append(this.b.getBytes().length);
                    var31_9.append(" ");
                    var31_9.append(Arrays.toString((byte[])this.c.array()));
                    Log.d((String)var30_8, (String)var31_9.toString());
                    this.d.write(this.b.getBytes());
                }
                this.d.flush();
                var37_10 = this.g.getInputStream();
                var38_11 = new byte[8];
                var37_10.read(var38_11, 0, var38_11.length);
                var40_12 = p.b();
                var41_13 = new StringBuilder();
                var41_13.append("resp header:");
                var41_13.append(Arrays.toString((byte[])var38_11));
                Log.d((String)var40_12, (String)var41_13.toString());
                this.c = ByteBuffer.wrap((byte[])var38_11);
                this.c.order(ByteOrder.BIG_ENDIAN);
                var46_14 = this.c.getInt(4);
                var47_15 = new byte[var46_14];
                var37_10.read(var47_15, 0, var46_14);
                var49_16 = p.b();
                var50_17 = new StringBuilder();
                var50_17.append("SendService succeed data:");
                var50_17.append(Arrays.toString((byte[])var47_15));
                Log.d((String)var49_16, (String)var50_17.toString());
                if (var46_14 >= 1 && var47_15[0] == 1) {
                    if (this.f != null) {
                        this.f.a(n.a(null, new f.f.a.e.b.h.i.a(200, null, null)));
                    }
                } else if (this.f != null) {
                    this.f.a(new f.f.a.e.b.h.b.a(2, new f.f.a.e.b.h.i.a(404, null, null)));
                }
                this.g.close();
                this.c = null;
                var37_10.close();
                this.d.close();
                var54_18 = this.g;
                if (var54_18 == null) ** GOTO lbl98
            }
            catch (Throwable var6_22) {
                block20 : {
                    try {
                        var10_23 = p.b();
                        var11_24 = new StringBuilder();
                        var11_24.append("SendService exception: ");
                        var11_24.append(var6_22.getMessage());
                        Log.d((String)var10_23, (String)var11_24.toString());
                        if (this.f != null) {
                            this.f.a(new f.f.a.e.b.h.b.a(2, new f.f.a.e.b.h.i.a(404, null, null)));
                        }
                        if ((var15_25 = this.g) == null) break block20;
                    }
                    catch (Throwable var7_26) {
                        var8_27 = this.g;
                        if (var8_27 != null) {
                            try {
                                var8_27.close();
                            }
                            catch (IOException var9_28) {
                                var9_28.printStackTrace();
                            }
                        }
                        this.f = null;
                        throw var7_26;
                    }
                    try {
                        var15_25.close();
                        break block20;
                    }
                    catch (IOException var16_20) {
                        // empty catch block
                    }
lbl97: // 2 sources:
                    var16_21.printStackTrace();
                }
                this.f = null;
                return;
            }
            try {
                var54_18.close();
                ** GOTO lbl98
            }
            catch (IOException var16_19) {
                ** GOTO lbl97
            }
        }
    }

    private static final class c {
        private static p a = new p(null);
    }

}

