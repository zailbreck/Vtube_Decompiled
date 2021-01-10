/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Math
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.LinkedHashMap
 *  java.util.List
 *  java.util.Map
 */
package f.f.a.q.a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class c {
    static final Comparator<String> b = new Comparator<String>(){

        public int a(String string2, String string3) {
            int n2;
            int n3 = Math.min((int)string2.length(), (int)string3.length());
            for (int i2 = 4; i2 < n3; ++i2) {
                char c2;
                char c3 = string2.charAt(i2);
                if (c3 == (c2 = string3.charAt(i2))) continue;
                if (c3 < c2) {
                    return -1;
                }
                return 1;
            }
            int n4 = string2.length();
            if (n4 != (n2 = string3.length())) {
                if (n4 < n2) {
                    return -1;
                }
                return 1;
            }
            return 0;
        }
    };
    private static final Map<String, c> c = new LinkedHashMap();
    public static final c d;
    public static final c e;
    public static final c f;
    public static final c g;
    public static final c h;
    public static final c i;
    public static final c j;
    public static final c k;
    public static final c l;
    public static final c m;
    public static final c n;
    public static final c o;
    public static final c p;
    public static final c q;
    public static final c r;
    public static final c s;
    public static final c t;
    public static final c u;
    final String a;

    static {
        c.a("SSL_RSA_WITH_NULL_MD5", 1);
        c.a("SSL_RSA_WITH_NULL_SHA", 2);
        c.a("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        c.a("SSL_RSA_WITH_RC4_128_MD5", 4);
        c.a("SSL_RSA_WITH_RC4_128_SHA", 5);
        c.a("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        c.a("SSL_RSA_WITH_DES_CBC_SHA", 9);
        d = c.a("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
        c.a("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        c.a("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        c.a("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        c.a("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        c.a("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        c.a("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        c.a("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        c.a("SSL_DH_anon_WITH_RC4_128_MD5", 24);
        c.a("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        c.a("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        c.a("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        c.a("TLS_KRB5_WITH_DES_CBC_SHA", 30);
        c.a("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        c.a("TLS_KRB5_WITH_RC4_128_SHA", 32);
        c.a("TLS_KRB5_WITH_DES_CBC_MD5", 34);
        c.a("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        c.a("TLS_KRB5_WITH_RC4_128_MD5", 36);
        c.a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        c.a("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        c.a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        c.a("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        e = c.a("TLS_RSA_WITH_AES_128_CBC_SHA", 47);
        c.a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        c.a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        c.a("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        f = c.a("TLS_RSA_WITH_AES_256_CBC_SHA", 53);
        c.a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        c.a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        c.a("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        c.a("TLS_RSA_WITH_NULL_SHA256", 59);
        c.a("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        c.a("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        c.a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        c.a("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        c.a("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        c.a("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        c.a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        c.a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        c.a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        c.a("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        c.a("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        c.a("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        c.a("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        c.a("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        c.a("TLS_PSK_WITH_RC4_128_SHA", 138);
        c.a("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        c.a("TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        c.a("TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        c.a("TLS_RSA_WITH_SEED_CBC_SHA", 150);
        g = c.a("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
        h = c.a("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
        c.a("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        c.a("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        c.a("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        c.a("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        c.a("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        c.a("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        c.a("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
        c.a("TLS_FALLBACK_SCSV", 22016);
        c.a("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        c.a("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        c.a("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        c.a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        c.a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        c.a("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        c.a("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        c.a("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        c.a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        c.a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        c.a("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        c.a("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        c.a("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        c.a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        c.a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        c.a("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        c.a("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        c.a("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        i = c.a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
        j = c.a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
        c.a("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        c.a("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        c.a("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        c.a("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        c.a("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        c.a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        c.a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        c.a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        c.a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        c.a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        c.a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        c.a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        c.a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        k = c.a("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
        l = c.a("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
        c.a("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        c.a("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        m = c.a("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);
        n = c.a("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
        c.a("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        c.a("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        c.a("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        c.a("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        o = c.a("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
        p = c.a("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
        c.a("TLS_DHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52394);
        c.a("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
        q = c.a("TLS_AES_128_GCM_SHA256", 4865);
        r = c.a("TLS_AES_256_GCM_SHA384", 4866);
        s = c.a("TLS_CHACHA20_POLY1305_SHA256", 4867);
        t = c.a("TLS_AES_128_CCM_SHA256", 4868);
        u = c.a("TLS_AES_256_CCM_8_SHA256", 4869);
    }

    private c(String string2) {
        if (string2 != null) {
            this.a = string2;
            return;
        }
        throw new NullPointerException();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static c a(String string2) {
        Class<c> class_ = c.class;
        synchronized (c.class) {
            c c2 = (c)c.get((Object)string2);
            if (c2 == null) {
                c2 = (c)c.get((Object)c.b(string2));
                if (c2 == null) {
                    c2 = new c(string2);
                }
                c.put((Object)string2, (Object)c2);
            }
            // ** MonitorExit[var4_1] (shouldn't be in output)
            return c2;
        }
    }

    private static c a(String string2, int n2) {
        c c2 = new c(string2);
        c.put((Object)string2, (Object)c2);
        return c2;
    }

    static /* varargs */ List<c> a(String ... arrstring) {
        ArrayList arrayList = new ArrayList(arrstring.length);
        int n2 = arrstring.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            arrayList.add((Object)c.a(arrstring[i2]));
        }
        return Collections.unmodifiableList((List)arrayList);
    }

    private static String b(String string2) {
        if (string2.startsWith("TLS_")) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("SSL_");
            stringBuilder.append(string2.substring(4));
            return stringBuilder.toString();
        }
        if (string2.startsWith("SSL_")) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("TLS_");
            stringBuilder.append(string2.substring(4));
            string2 = stringBuilder.toString();
        }
        return string2;
    }

    public String toString() {
        return this.a;
    }

}

