/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.ConnectivityManager
 *  android.net.InetAddresses
 *  android.net.NetworkInfo
 *  android.net.NetworkInfo$State
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.telephony.TelephonyManager
 *  android.text.TextUtils
 *  android.util.Base64
 *  android.webkit.MimeTypeMap
 *  java.io.IOException
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.ClassNotFoundException
 *  java.lang.Exception
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Long
 *  java.lang.NoSuchMethodException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.util.Arrays
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.TreeMap
 *  org.json.JSONObject
 */
package f.a.a.a.a.h.g;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.InetAddresses;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Base64;
import android.webkit.MimeTypeMap;
import f.a.a.a.a.h.a;
import f.a.a.a.a.h.c;
import f.a.a.a.a.h.d;
import f.a.a.a.a.h.f.g;
import f.a.a.a.a.h.g.e;
import f.a.a.a.a.j.i;
import f.a.a.a.a.k.f;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import org.json.JSONObject;

public class h {
    private static final List<String> a = Arrays.asList((Object[])new String[]{"bucketInfo", "acl", "uploads", "location", "cors", "logging", "website", "referer", "lifecycle", "delete", "append", "uploadId", "partNumber", "security-token", "position", "response-cache-control", "response-content-disposition", "response-content-encoding", "response-content-language", "response-content-type", "response-expires", "x-oss-process", "sequential", "symlink", "restore"});

    public static String a(Context context) {
        NetworkInfo networkInfo;
        String string;
        String string2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("=====[device info]=====\n");
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("[INFO]: android_version\uff1a");
        stringBuilder2.append(Build.VERSION.RELEASE);
        stringBuilder2.append("\n");
        stringBuilder.append(stringBuilder2.toString());
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("[INFO]: mobile_model\uff1a");
        stringBuilder3.append(Build.MODEL);
        stringBuilder3.append("\n");
        stringBuilder.append(stringBuilder3.toString());
        String string3 = h.b(context);
        if (!TextUtils.isEmpty((CharSequence)string3)) {
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append("[INFO]: operator_name\uff1a");
            stringBuilder4.append(string3);
            stringBuilder4.append("\n");
            stringBuilder.append(stringBuilder4.toString());
        }
        if ((networkInfo = ((ConnectivityManager)context.getSystemService("connectivity")).getActiveNetworkInfo()) != null && networkInfo.getState() == NetworkInfo.State.CONNECTED) {
            StringBuilder stringBuilder5 = new StringBuilder();
            stringBuilder5.append(networkInfo.getTypeName());
            stringBuilder5.append(" ");
            string2 = stringBuilder5.toString();
            string = "connected";
        } else {
            string = "unconnected";
            string2 = "unknown";
        }
        StringBuilder stringBuilder6 = new StringBuilder();
        stringBuilder6.append("[INFO]: network_state\uff1a");
        stringBuilder6.append(string);
        stringBuilder6.append("\n");
        stringBuilder.append(stringBuilder6.toString());
        StringBuilder stringBuilder7 = new StringBuilder();
        stringBuilder7.append("[INFO]: network_type\uff1a");
        stringBuilder7.append(string2);
        stringBuilder.append(stringBuilder7.toString());
        return stringBuilder.toString();
    }

    public static String a(i i2) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(i2.j().toString());
        stringBuilder2.append("\n");
        stringBuilder.append(stringBuilder2.toString());
        Map<String, String> map = i2.d();
        TreeMap treeMap = new TreeMap();
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String string;
                if (entry.getKey() == null || !(string = ((String)entry.getKey()).toLowerCase()).equals((Object)"Content-Type".toLowerCase()) && !string.equals((Object)"Content-MD5".toLowerCase()) && !string.equals((Object)"Date".toLowerCase()) && !string.startsWith("x-oss-")) continue;
                treeMap.put((Object)string, (Object)((String)entry.getValue()).trim());
            }
        }
        if (!treeMap.containsKey((Object)"Content-Type".toLowerCase())) {
            treeMap.put((Object)"Content-Type".toLowerCase(), (Object)"");
        }
        if (!treeMap.containsKey((Object)"Content-MD5".toLowerCase())) {
            treeMap.put((Object)"Content-MD5".toLowerCase(), (Object)"");
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String string = (String)entry.getKey();
            Object object = entry.getValue();
            if (string.startsWith("x-oss-")) {
                stringBuilder.append(string);
                stringBuilder.append(':');
            }
            stringBuilder.append(object);
            stringBuilder.append("\n");
        }
        stringBuilder.append(h.a(i2.g(), i2.k(), i2.l()));
        return stringBuilder.toString();
    }

    public static String a(String string, String string2, String string3) {
        String string4;
        String string5;
        if (string != null) {
            return string;
        }
        MimeTypeMap mimeTypeMap = MimeTypeMap.getSingleton();
        if (string2 != null && (string5 = mimeTypeMap.getMimeTypeFromExtension(string2.substring(1 + string2.lastIndexOf(46)))) != null) {
            return string5;
        }
        if (string3 != null && (string4 = mimeTypeMap.getMimeTypeFromExtension(string3.substring(1 + string3.lastIndexOf(46)))) != null) {
            return string4;
        }
        return "application/octet-stream";
    }

    public static String a(String string, String string2, Map<String, String> map) {
        String string3 = "/";
        if (string != null || string2 != null) {
            if (string2 == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string3);
                stringBuilder.append(string);
                stringBuilder.append(string3);
                string3 = stringBuilder.toString();
            } else {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string3);
                stringBuilder.append(string);
                stringBuilder.append(string3);
                stringBuilder.append(string2);
                string3 = stringBuilder.toString();
            }
        }
        return h.a(string3, map);
    }

    public static String a(String string, Map<String, String> map) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string);
        if (map != null) {
            Object[] arrobject = (String[])map.keySet().toArray((Object[])new String[map.size()]);
            Arrays.sort((Object[])arrobject);
            int n2 = 63;
            for (Object object : arrobject) {
                if (!a.contains(object)) continue;
                stringBuilder.append((char)n2);
                stringBuilder.append((String)object);
                String string2 = (String)map.get(object);
                if (!h.c(string2)) {
                    stringBuilder.append("=");
                    stringBuilder.append(string2);
                }
                n2 = 38;
            }
        }
        return stringBuilder.toString();
    }

    public static String a(Map<String, String> map) {
        return Base64.encodeToString((byte[])new JSONObject(map).toString().getBytes(), (int)2);
    }

    public static String a(Map<String, String> map, String string) {
        if (map != null && !map.isEmpty()) {
            StringBuilder stringBuilder = new StringBuilder();
            boolean bl = true;
            for (Map.Entry entry : map.entrySet()) {
                String string2 = (String)entry.getKey();
                String string3 = (String)entry.getValue();
                if (!bl) {
                    stringBuilder.append("&");
                }
                stringBuilder.append(e.a(string2, string));
                if (!h.c(string3)) {
                    stringBuilder.append("=");
                    stringBuilder.append(e.a(string3, string));
                }
                bl = false;
            }
            return stringBuilder.toString();
        }
        return null;
    }

    public static void a(f.a.a.a.a.k.d d2, i i2) {
        if (h.a(d2)) {
            h.a(i2.g());
        }
        if (h.b(d2)) {
            h.b(i2.k());
        }
        if (d2 instanceof f.a.a.a.a.k.a) {
            h.b(((f.a.a.a.a.k.a)d2).c());
        }
    }

    public static void a(Long l2, Long l3, String string) {
        if (l2 != null && l3 != null) {
            if (l2.equals((Object)l3)) {
                return;
            }
            throw new f.a.a.a.a.i.a(l2, l3, string);
        }
    }

    public static void a(String string) {
        if (h.f(string)) {
            return;
        }
        throw new IllegalArgumentException("The bucket name is invalid. \nA bucket name must: \n1) be comprised of lower-case characters, numbers or dash(-); \n2) start with lower case or numbers; \n3) be between 3-63 characters long. ");
    }

    public static void a(Map<String, String> map, f f2) {
        Map<String, String> map2;
        if (f2 == null) {
            return;
        }
        Map<String, Object> map3 = f2.j();
        if (map3 != null) {
            for (Map.Entry entry : map3.entrySet()) {
                map.put(entry.getKey(), (Object)entry.getValue().toString());
            }
        }
        if ((map2 = f2.l()) != null) {
            for (Map.Entry entry : map2.entrySet()) {
                String string = (String)entry.getKey();
                String string2 = (String)entry.getValue();
                if (string != null) {
                    string = string.trim();
                }
                if (string2 != null) {
                    string2 = string2.trim();
                }
                map.put((Object)string, (Object)string2);
            }
        }
    }

    public static void a(boolean bl, String string) {
        if (bl) {
            return;
        }
        throw new IllegalArgumentException(string);
    }

    public static boolean a(f.a.a.a.a.k.d d2) {
        return true;
    }

    public static boolean a(String string, List<String> list) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            if (!string.endsWith(((String)iterator.next()).toLowerCase())) continue;
            return true;
        }
        return false;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static String b(Context context) {
        String string = ((TelephonyManager)context.getSystemService("phone")).getSimOperator();
        if (string == null) return "";
        if (string.equals((Object)"46000")) return "CMCC";
        if (string.equals((Object)"46002")) return "CMCC";
        if (string.equals((Object)"46001")) {
            return "CUCC";
        }
        if (!string.equals((Object)"46003")) return string;
        return "CTCC";
    }

    public static String b(String string, String string2, String string3) {
        String string4;
        try {
            string4 = new f.a.a.a.a.h.f.a().a(string2, string3).trim();
        }
        catch (Exception exception) {
            throw new IllegalStateException("Compute signature failed!", (Throwable)exception);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OSS ");
        stringBuilder.append(string);
        stringBuilder.append(":");
        stringBuilder.append(string4);
        return stringBuilder.toString();
    }

    public static void b(i i2) {
        d.a("signRequest start");
        if (!i2.p()) {
            return;
        }
        if (i2.h() != null) {
            String string;
            f.a.a.a.a.h.f.c c2 = i2.h();
            boolean bl = c2 instanceof f.a.a.a.a.h.f.e;
            f.a.a.a.a.h.f.f f2 = null;
            if (bl) {
                f2 = ((f.a.a.a.a.h.f.e)c2).b();
                if (f2 != null) {
                    i2.d().put((Object)"x-oss-security-token", (Object)f2.b());
                } else {
                    d.b("Can't get a federation token");
                    throw new IOException("Can't get a federation token");
                }
            }
            String string2 = h.a(i2);
            d.a("get contentToSign");
            if (!bl) {
                if (c2 instanceof g) {
                    g g2 = (g)c2;
                    string = h.b(g2.a(), g2.b(), string2);
                } else {
                    string = c2 instanceof f.a.a.a.a.h.f.d ? ((f.a.a.a.a.h.f.d)c2).a(string2) : "---initValue---";
                }
            } else {
                string = h.b(f2.c(), f2.d(), string2);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("signed content: ");
            stringBuilder.append(string2);
            stringBuilder.append("   \n ---------   signature: ");
            stringBuilder.append(string);
            d.b(stringBuilder.toString(), false);
            d.a("get signature");
            i2.d().put((Object)"Authorization", (Object)string);
            return;
        }
        throw new IllegalStateException("\u5f53\u524dCredentialProvider\u4e3a\u7a7a\uff01\uff01\uff01\n1. \u8bf7\u68c0\u67e5\u60a8\u662f\u5426\u5728\u521d\u59cb\u5316OSSService\u65f6\u8bbe\u7f6eCredentialProvider;\n2. \u5982\u679c\u60a8bucket\u4e3a\u516c\u5171\u6743\u9650\uff0c\u8bf7\u786e\u8ba4\u83b7\u53d6\u5230Bucket\u540e\u5df2\u7ecf\u8c03\u7528Bucket\u4e2d\u63a5\u53e3\u58f0\u660eACL;");
    }

    public static void b(String string) {
        if (h.g(string)) {
            return;
        }
        throw new IllegalArgumentException("The object key is invalid. \nAn object name should be: \n1) between 1 - 1023 bytes long when encoded as UTF-8 \n2) cannot contain LF or CR or unsupported chars in XML1.0, \n3) cannot begin with \"/\" or \"\\\".");
    }

    public static boolean b(f.a.a.a.a.k.d d2) {
        return true;
    }

    public static boolean c(String string) {
        return TextUtils.isEmpty((CharSequence)string);
    }

    public static boolean d(String string) {
        if (TextUtils.isEmpty((CharSequence)string)) {
            return false;
        }
        for (String string2 : c.a) {
            if (!string.toLowerCase().endsWith(string2)) continue;
            return true;
        }
        return false;
    }

    public static boolean e(String string) {
        if (string != null) {
            if (Build.VERSION.SDK_INT >= 29) {
                return InetAddresses.isNumericAddress((String)string);
            }
            try {
                boolean bl = (Boolean)Class.forName((String)"java.net.InetAddress").getMethod("isNumeric", new Class[]{String.class}).invoke(null, new Object[]{string});
                return bl;
            }
            catch (ClassNotFoundException | IllegalAccessException | IllegalArgumentException | NoSuchMethodException | InvocationTargetException throwable) {
                return false;
            }
        }
        throw new Exception("host is null");
    }

    public static boolean f(String string) {
        if (string == null) {
            return false;
        }
        return string.matches("^[a-z0-9][a-z0-9\\-]{1,61}[a-z0-9]$");
    }

    /*
     * Exception decompiling
     */
    public static boolean g(String var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl57.1 : ICONST_0 : trying to set 1 previously set to 0
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
}

