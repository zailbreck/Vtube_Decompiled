/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.content.res.Resources
 *  android.net.http.SslCertificate
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.Log
 *  j.v
 *  j.v$b
 *  java.io.ByteArrayInputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.security.Key
 *  java.security.KeyStore
 *  java.security.PrivateKey
 *  java.security.SecureRandom
 *  java.security.cert.Certificate
 *  java.security.cert.CertificateException
 *  java.security.cert.CertificateFactory
 *  java.security.cert.X509Certificate
 *  java.util.Enumeration
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.concurrent.CountDownLatch
 *  java.util.concurrent.TimeUnit
 *  javax.net.ssl.HostnameVerifier
 *  javax.net.ssl.KeyManager
 *  javax.net.ssl.SSLContext
 *  javax.net.ssl.SSLSession
 *  javax.net.ssl.SSLSocketFactory
 *  javax.net.ssl.TrustManager
 *  javax.net.ssl.X509TrustManager
 */
package f.g.a;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.http.SslCertificate;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import f.g.a.q;
import f.g.a.r;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import j.v;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.Key;
import java.security.KeyStore;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.KeyManager;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

public class r {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static d a(String string2, String string3, String string4) {
        d d2 = null;
        try {
            InputStream inputStream = r.a(string2);
            KeyStore keyStore = KeyStore.getInstance((String)string4);
            d2 = null;
            char[] arrc = string3 != null ? string3.toCharArray() : null;
            keyStore.load(inputStream, arrc);
            String string5 = (String)keyStore.aliases().nextElement();
            Key key = keyStore.getKey(string5, string3.toCharArray());
            boolean bl = key instanceof PrivateKey;
            d2 = null;
            if (bl) {
                PrivateKey privateKey = (PrivateKey)key;
                Certificate certificate = keyStore.getCertificate(string5);
                X509Certificate[] arrx509Certificate = new X509Certificate[]{(X509Certificate)certificate};
                d2 = new d(privateKey, arrx509Certificate);
            }
            inputStream.close();
            return d2;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            Log.e((String)"Util", (String)exception.getMessage());
            return d2;
        }
    }

    public static e a(final MethodChannel methodChannel, final String string2, final Object object) {
        CountDownLatch countDownLatch = new CountDownLatch(1);
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"result", null);
        hashMap.put((Object)"error", null);
        Handler handler = new Handler(Looper.getMainLooper());
        Runnable runnable = new Runnable((Map)hashMap, countDownLatch){
            final /* synthetic */ Map e;
            final /* synthetic */ CountDownLatch f;
            {
                this.e = map;
                this.f = countDownLatch;
            }

            public void run() {
                methodChannel.invokeMethod(string2, object, new MethodChannel.Result(this){
                    final /* synthetic */ a a;
                    {
                        this.a = a2;
                    }

                    public void error(String string2, String string3, Object object) {
                        Map map = this.a.e;
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("ERROR: ");
                        stringBuilder.append(string2);
                        stringBuilder.append(" ");
                        stringBuilder.append(string3);
                        map.put((Object)"error", (Object)stringBuilder.toString());
                        this.a.e.put((Object)"result", object);
                        this.a.f.countDown();
                    }

                    public void notImplemented() {
                        this.a.f.countDown();
                    }

                    public void success(Object object) {
                        this.a.e.put((Object)"result", object);
                        this.a.f.countDown();
                    }
                });
            }
        };
        handler.post(runnable);
        countDownLatch.await();
        return new e(hashMap.get((Object)"result"), (String)hashMap.get((Object)"error"));
    }

    public static v a() {
        try {
            TrustManager[] arrtrustManager = new TrustManager[]{new X509TrustManager(){

                public void checkClientTrusted(X509Certificate[] arrx509Certificate, String string2) {
                }

                public void checkServerTrusted(X509Certificate[] arrx509Certificate, String string2) {
                }

                public X509Certificate[] getAcceptedIssuers() {
                    return new X509Certificate[0];
                }
            }};
            SSLContext sSLContext = SSLContext.getInstance((String)"SSL");
            sSLContext.init(null, arrtrustManager, new SecureRandom());
            SSLSocketFactory sSLSocketFactory = sSLContext.getSocketFactory();
            v.b b2 = new v.b();
            b2.a(sSLSocketFactory, (X509TrustManager)arrtrustManager[0]);
            b2.a(new HostnameVerifier(){

                public boolean verify(String string2, SSLSession sSLSession) {
                    return true;
                }
            });
            b2.a(15L, TimeUnit.SECONDS);
            b2.c(15L, TimeUnit.SECONDS);
            b2.b(15L, TimeUnit.SECONDS);
            v v2 = b2.a();
            return v2;
        }
        catch (Exception exception) {
            throw new RuntimeException((Throwable)exception);
        }
    }

    public static InputStream a(String string2) {
        PluginRegistry.Registrar registrar = q.b;
        String string3 = registrar != null ? registrar.lookupKeyForAsset(string2) : q.d.getAssetFilePathByName(string2);
        return q.a.getResources().getAssets().open(string3);
    }

    public static X509Certificate a(SslCertificate sslCertificate) {
        X509Certificate x509Certificate;
        byte[] arrby = SslCertificate.saveState((SslCertificate)sslCertificate).getByteArray("x509-certificate");
        x509Certificate = null;
        if (arrby == null) {
            return null;
        }
        try {
            X509Certificate x509Certificate2;
            x509Certificate = x509Certificate2 = (X509Certificate)CertificateFactory.getInstance((String)"X.509").generateCertificate((InputStream)new ByteArrayInputStream(arrby));
        }
        catch (CertificateException certificateException) {}
        return x509Certificate;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static String b(String var0) {
        block5 : {
            var1_1 = q.b;
            var2_2 = var1_1 != null ? var1_1.lookupKeyForAsset(var0) : q.d.getAssetFilePathByName(var0);
            try {
                var8_3 = r.a(var0);
                var4_4 = null;
                ** if (var8_3 == null) goto lbl-1000
lbl-1000: // 1 sources:
                {
                    var8_3.close();
                    var4_4 = null;
                }
lbl-1000: // 1 sources:
                {
                    break block5;
                }
            }
            catch (IOException var4_5) {}
            break block5;
            catch (Throwable var3_6) {
                throw var3_6;
            }
        }
        if (var4_4 != null) throw var4_4;
        var5_7 = new StringBuilder();
        var5_7.append("file:///android_asset/");
        var5_7.append(var2_2);
        return var5_7.toString();
    }

    public static class d {
        public X509Certificate[] a;
        public PrivateKey b;

        public d(PrivateKey privateKey, X509Certificate[] arrx509Certificate) {
            this.b = privateKey;
            this.a = arrx509Certificate;
        }
    }

    public static class e {
        public Object a;
        public String b;

        public e(Object object, String string2) {
            this.a = object;
            this.b = string2;
        }
    }

}

