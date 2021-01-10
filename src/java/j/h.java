/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Math
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.List
 *  java.util.Map
 *  java.util.TreeMap
 */
package j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public final class h {
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
    private static final Map<String, h> c = new TreeMap(b);
    public static final h d;
    public static final h e;
    public static final h f;
    public static final h g;
    public static final h h;
    public static final h i;
    public static final h j;
    public static final h k;
    public static final h l;
    public static final h m;
    public static final h n;
    public static final h o;
    public static final h p;
    final String a;

    static {
        h.a("SSL_RSA_WITH_NULL_MD5", 1);
        h.a("SSL_RSA_WITH_NULL_SHA", 2);
        h.a("SSL_RSA_EXPORT_WITH_RC4_40_MD5", 3);
        h.a("SSL_RSA_WITH_RC4_128_MD5", 4);
        h.a("SSL_RSA_WITH_RC4_128_SHA", 5);
        h.a("SSL_RSA_EXPORT_WITH_DES40_CBC_SHA", 8);
        h.a("SSL_RSA_WITH_DES_CBC_SHA", 9);
        d = h.a("SSL_RSA_WITH_3DES_EDE_CBC_SHA", 10);
        h.a("SSL_DHE_DSS_EXPORT_WITH_DES40_CBC_SHA", 17);
        h.a("SSL_DHE_DSS_WITH_DES_CBC_SHA", 18);
        h.a("SSL_DHE_DSS_WITH_3DES_EDE_CBC_SHA", 19);
        h.a("SSL_DHE_RSA_EXPORT_WITH_DES40_CBC_SHA", 20);
        h.a("SSL_DHE_RSA_WITH_DES_CBC_SHA", 21);
        h.a("SSL_DHE_RSA_WITH_3DES_EDE_CBC_SHA", 22);
        h.a("SSL_DH_anon_EXPORT_WITH_RC4_40_MD5", 23);
        h.a("SSL_DH_anon_WITH_RC4_128_MD5", 24);
        h.a("SSL_DH_anon_EXPORT_WITH_DES40_CBC_SHA", 25);
        h.a("SSL_DH_anon_WITH_DES_CBC_SHA", 26);
        h.a("SSL_DH_anon_WITH_3DES_EDE_CBC_SHA", 27);
        h.a("TLS_KRB5_WITH_DES_CBC_SHA", 30);
        h.a("TLS_KRB5_WITH_3DES_EDE_CBC_SHA", 31);
        h.a("TLS_KRB5_WITH_RC4_128_SHA", 32);
        h.a("TLS_KRB5_WITH_DES_CBC_MD5", 34);
        h.a("TLS_KRB5_WITH_3DES_EDE_CBC_MD5", 35);
        h.a("TLS_KRB5_WITH_RC4_128_MD5", 36);
        h.a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_SHA", 38);
        h.a("TLS_KRB5_EXPORT_WITH_RC4_40_SHA", 40);
        h.a("TLS_KRB5_EXPORT_WITH_DES_CBC_40_MD5", 41);
        h.a("TLS_KRB5_EXPORT_WITH_RC4_40_MD5", 43);
        e = h.a("TLS_RSA_WITH_AES_128_CBC_SHA", 47);
        h.a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA", 50);
        h.a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA", 51);
        h.a("TLS_DH_anon_WITH_AES_128_CBC_SHA", 52);
        f = h.a("TLS_RSA_WITH_AES_256_CBC_SHA", 53);
        h.a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA", 56);
        h.a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA", 57);
        h.a("TLS_DH_anon_WITH_AES_256_CBC_SHA", 58);
        h.a("TLS_RSA_WITH_NULL_SHA256", 59);
        h.a("TLS_RSA_WITH_AES_128_CBC_SHA256", 60);
        h.a("TLS_RSA_WITH_AES_256_CBC_SHA256", 61);
        h.a("TLS_DHE_DSS_WITH_AES_128_CBC_SHA256", 64);
        h.a("TLS_RSA_WITH_CAMELLIA_128_CBC_SHA", 65);
        h.a("TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA", 68);
        h.a("TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA", 69);
        h.a("TLS_DHE_RSA_WITH_AES_128_CBC_SHA256", 103);
        h.a("TLS_DHE_DSS_WITH_AES_256_CBC_SHA256", 106);
        h.a("TLS_DHE_RSA_WITH_AES_256_CBC_SHA256", 107);
        h.a("TLS_DH_anon_WITH_AES_128_CBC_SHA256", 108);
        h.a("TLS_DH_anon_WITH_AES_256_CBC_SHA256", 109);
        h.a("TLS_RSA_WITH_CAMELLIA_256_CBC_SHA", 132);
        h.a("TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA", 135);
        h.a("TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA", 136);
        h.a("TLS_PSK_WITH_RC4_128_SHA", 138);
        h.a("TLS_PSK_WITH_3DES_EDE_CBC_SHA", 139);
        h.a("TLS_PSK_WITH_AES_128_CBC_SHA", 140);
        h.a("TLS_PSK_WITH_AES_256_CBC_SHA", 141);
        h.a("TLS_RSA_WITH_SEED_CBC_SHA", 150);
        g = h.a("TLS_RSA_WITH_AES_128_GCM_SHA256", 156);
        h = h.a("TLS_RSA_WITH_AES_256_GCM_SHA384", 157);
        h.a("TLS_DHE_RSA_WITH_AES_128_GCM_SHA256", 158);
        h.a("TLS_DHE_RSA_WITH_AES_256_GCM_SHA384", 159);
        h.a("TLS_DHE_DSS_WITH_AES_128_GCM_SHA256", 162);
        h.a("TLS_DHE_DSS_WITH_AES_256_GCM_SHA384", 163);
        h.a("TLS_DH_anon_WITH_AES_128_GCM_SHA256", 166);
        h.a("TLS_DH_anon_WITH_AES_256_GCM_SHA384", 167);
        h.a("TLS_EMPTY_RENEGOTIATION_INFO_SCSV", 255);
        h.a("TLS_FALLBACK_SCSV", 22016);
        h.a("TLS_ECDH_ECDSA_WITH_NULL_SHA", 49153);
        h.a("TLS_ECDH_ECDSA_WITH_RC4_128_SHA", 49154);
        h.a("TLS_ECDH_ECDSA_WITH_3DES_EDE_CBC_SHA", 49155);
        h.a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA", 49156);
        h.a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA", 49157);
        h.a("TLS_ECDHE_ECDSA_WITH_NULL_SHA", 49158);
        h.a("TLS_ECDHE_ECDSA_WITH_RC4_128_SHA", 49159);
        h.a("TLS_ECDHE_ECDSA_WITH_3DES_EDE_CBC_SHA", 49160);
        h.a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA", 49161);
        h.a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA", 49162);
        h.a("TLS_ECDH_RSA_WITH_NULL_SHA", 49163);
        h.a("TLS_ECDH_RSA_WITH_RC4_128_SHA", 49164);
        h.a("TLS_ECDH_RSA_WITH_3DES_EDE_CBC_SHA", 49165);
        h.a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA", 49166);
        h.a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA", 49167);
        h.a("TLS_ECDHE_RSA_WITH_NULL_SHA", 49168);
        h.a("TLS_ECDHE_RSA_WITH_RC4_128_SHA", 49169);
        h.a("TLS_ECDHE_RSA_WITH_3DES_EDE_CBC_SHA", 49170);
        i = h.a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA", 49171);
        j = h.a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA", 49172);
        h.a("TLS_ECDH_anon_WITH_NULL_SHA", 49173);
        h.a("TLS_ECDH_anon_WITH_RC4_128_SHA", 49174);
        h.a("TLS_ECDH_anon_WITH_3DES_EDE_CBC_SHA", 49175);
        h.a("TLS_ECDH_anon_WITH_AES_128_CBC_SHA", 49176);
        h.a("TLS_ECDH_anon_WITH_AES_256_CBC_SHA", 49177);
        h.a("TLS_ECDHE_ECDSA_WITH_AES_128_CBC_SHA256", 49187);
        h.a("TLS_ECDHE_ECDSA_WITH_AES_256_CBC_SHA384", 49188);
        h.a("TLS_ECDH_ECDSA_WITH_AES_128_CBC_SHA256", 49189);
        h.a("TLS_ECDH_ECDSA_WITH_AES_256_CBC_SHA384", 49190);
        h.a("TLS_ECDHE_RSA_WITH_AES_128_CBC_SHA256", 49191);
        h.a("TLS_ECDHE_RSA_WITH_AES_256_CBC_SHA384", 49192);
        h.a("TLS_ECDH_RSA_WITH_AES_128_CBC_SHA256", 49193);
        h.a("TLS_ECDH_RSA_WITH_AES_256_CBC_SHA384", 49194);
        k = h.a("TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", 49195);
        l = h.a("TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", 49196);
        h.a("TLS_ECDH_ECDSA_WITH_AES_128_GCM_SHA256", 49197);
        h.a("TLS_ECDH_ECDSA_WITH_AES_256_GCM_SHA384", 49198);
        m = h.a("TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", 49199);
        n = h.a("TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", 49200);
        h.a("TLS_ECDH_RSA_WITH_AES_128_GCM_SHA256", 49201);
        h.a("TLS_ECDH_RSA_WITH_AES_256_GCM_SHA384", 49202);
        h.a("TLS_ECDHE_PSK_WITH_AES_128_CBC_SHA", 49205);
        h.a("TLS_ECDHE_PSK_WITH_AES_256_CBC_SHA", 49206);
        o = h.a("TLS_ECDHE_RSA_WITH_CHACHA20_POLY1305_SHA256", 52392);
        p = h.a("TLS_ECDHE_ECDSA_WITH_CHACHA20_POLY1305_SHA256", 52393);
        h.a("TLS_ECDHE_PSK_WITH_CHACHA20_POLY1305_SHA256", 52396);
    }

    private h(String string2) {
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
    public static h a(String string2) {
        Class<h> class_ = h.class;
        synchronized (h.class) {
            h h2 = (h)c.get((Object)string2);
            if (h2 == null) {
                h2 = new h(string2);
                c.put((Object)string2, (Object)h2);
            }
            // ** MonitorExit[var4_1] (shouldn't be in output)
            return h2;
        }
    }

    private static h a(String string2, int n2) {
        return h.a(string2);
    }

    static /* varargs */ List<h> a(String ... arrstring) {
        ArrayList arrayList = new ArrayList(arrstring.length);
        int n2 = arrstring.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            arrayList.add((Object)h.a(arrstring[i2]));
        }
        return Collections.unmodifiableList((List)arrayList);
    }

    public String toString() {
        return this.a;
    }

}

