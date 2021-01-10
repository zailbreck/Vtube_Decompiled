/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.BufferedReader
 *  java.io.IOException
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.Reader
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.net.HttpURLConnection
 *  java.net.URL
 *  java.net.URLConnection
 *  java.util.concurrent.Callable
 *  java.util.concurrent.ConcurrentHashMap
 *  java.util.concurrent.ConcurrentMap
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 *  java.util.concurrent.Future
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package f.a.a.a.a.h.g;

import f.a.a.a.a.h.d;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import org.json.JSONArray;
import org.json.JSONObject;

public class f {
    private static f c;
    private ConcurrentMap<String, a> a = new ConcurrentHashMap();
    private ExecutorService b = Executors.newFixedThreadPool((int)5);

    private f() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static f a() {
        if (c != null) return c;
        Class<f> class_ = f.class;
        synchronized (f.class) {
            if (c != null) return c;
            c = new f();
            // ** MonitorExit[var1] (shouldn't be in output)
            return c;
        }
    }

    static /* synthetic */ ConcurrentMap a(f f2) {
        return f2.a;
    }

    public String a(String string) {
        a a2 = (a)this.a.get((Object)string);
        if (a2 == null || a2.e()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[httpdnsmini] - refresh host: ");
            stringBuilder.append(string);
            d.a(stringBuilder.toString());
            this.b.submit((Callable)(f)this.new b(string));
        }
        String string2 = null;
        if (a2 != null) {
            boolean bl = a2.f();
            string2 = null;
            if (bl) {
                string2 = a2.b();
            }
        }
        return string2;
    }

    class a {
        private String a;
        private String b;
        private long c;
        private long d;

        a(f f2) {
        }

        public String a() {
            return this.a;
        }

        public void a(long l2) {
            this.d = l2;
        }

        public void a(String string) {
            this.a = string;
        }

        public String b() {
            return this.b;
        }

        public void b(long l2) {
            this.c = l2;
        }

        public void b(String string) {
            this.b = string;
        }

        public long c() {
            return this.d;
        }

        public long d() {
            return this.c;
        }

        public boolean e() {
            return this.c() + this.c < System.currentTimeMillis() / 1000L;
        }

        public boolean f() {
            return 600L + (this.c() + this.c) > System.currentTimeMillis() / 1000L;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[hostName=");
            stringBuilder.append(this.a());
            stringBuilder.append(", ip=");
            stringBuilder.append(this.b);
            stringBuilder.append(", ttl=");
            stringBuilder.append(this.d());
            stringBuilder.append(", queryTime=");
            stringBuilder.append(this.d);
            stringBuilder.append("]");
            return stringBuilder.toString();
        }
    }

    class b
    implements Callable<String> {
        private String b;
        private boolean c = false;

        public b(String string) {
            this.b = string;
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        public String call() {
            block23 : {
                block24 : {
                    block22 : {
                        block21 : {
                            var1_1 = new StringBuilder();
                            var1_1.append("https://");
                            var1_1.append("203.107.1.1");
                            var1_1.append("/");
                            var1_1.append("181345");
                            var1_1.append("/d?host=");
                            var1_1.append(this.b);
                            var8_2 = var1_1.toString();
                            var9_3 = new StringBuilder();
                            var9_3.append("[httpdnsmini] - buildUrl: ");
                            var9_3.append(var8_2);
                            d.a(var9_3.toString());
                            var19_4 = (HttpURLConnection)new URL(var8_2).openConnection();
                            var19_4.setConnectTimeout(10000);
                            var19_4.setReadTimeout(10000);
                            if (var19_4.getResponseCode() != 200) {
                                var20_5 = new StringBuilder();
                                var20_5.append("[httpdnsmini] - responseCodeNot 200, but: ");
                                var20_5.append(var19_4.getResponseCode());
                                d.b(var20_5.toString());
                                var14_6 = null;
                                break block21;
                            }
                            var14_6 = var19_4.getInputStream();
                            var23_7 = new BufferedReader((Reader)new InputStreamReader(var14_6, "UTF-8"));
                            var24_8 = new StringBuilder();
                            while ((var25_9 = var23_7.readLine()) != null) {
                                var24_8.append(var25_9);
                            }
                            var27_10 = new JSONObject(var24_8.toString());
                            var28_11 = var27_10.getString("host");
                            var29_12 = var27_10.getLong("ttl");
                            var31_13 = var27_10.getJSONArray("ips");
                            var32_14 = new StringBuilder();
                            var32_14.append("[httpdnsmini] - ips:");
                            var32_14.append(var31_13.toString());
                            d.a(var32_14.toString());
                            if (var28_11 == null || var31_13 == null || var31_13.length() <= 0) break block21;
                            if (var29_12 == 0L) {
                                var29_12 = 30L;
                            }
                            var35_15 = new a(f.this);
                            var36_16 = var31_13 == null ? null : var31_13.getString(0);
                            var35_15.a(var28_11);
                            var35_15.b(var29_12);
                            var35_15.b(var36_16);
                            var35_15.a(System.currentTimeMillis() / 1000L);
                            var37_17 = new StringBuilder();
                            var37_17.append("[httpdnsmini] - resolve result:");
                            var37_17.append(var35_15.toString());
                            d.a(var37_17.toString());
                            if (f.a(f.this).size() < 100) {
                                f.a(f.this).put((Object)this.b, (Object)var35_15);
                            }
                            if (var14_6 == null) return var36_16;
                            try {
                                var14_6.close();
                                return var36_16;
                            }
                            catch (IOException var40_18) {
                                var40_18.printStackTrace();
                            }
                            return var36_16;
                        }
                        if (var14_6 != null) {
                            var14_6.close();
                        }
                        break block24;
                        catch (Exception var13_19) {
                            break block22;
                        }
                        catch (Throwable var18_21) {
                            var15_22 = var18_21;
                            var14_6 = null;
                            break block23;
                        }
                        catch (Exception var12_24) {
                            var13_20 = var12_24;
                            var14_6 = null;
                        }
                    }
                    try {
                        if (d.a()) {
                            var13_20.printStackTrace();
                            d.a(var13_20);
                        }
                        ** if (var14_6 == null) goto lbl-1000
                    }
                    catch (Throwable var15_23) {
                        // empty catch block
                    }
lbl-1000: // 1 sources:
                    {
                        var14_6.close();
                    }
lbl-1000: // 2 sources:
                    {
                        break block24;
                    }
                    catch (IOException var17_25) {
                        var17_25.printStackTrace();
                    }
                }
                if (this.c != false) return null;
                this.c = true;
                return this.call();
            }
            if (var14_6 == null) throw var15_22;
            try {
                var14_6.close();
                throw var15_22;
            }
            catch (IOException var16_26) {
                var16_26.printStackTrace();
                throw var15_22;
            }
        }
    }

}

