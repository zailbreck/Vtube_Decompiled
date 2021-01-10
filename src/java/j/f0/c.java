/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.Closeable
 *  java.io.IOException
 *  java.io.InterruptedIOException
 *  java.lang.ArrayIndexOutOfBoundsException
 *  java.lang.AssertionError
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Math
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.lang.reflect.Method
 *  java.net.IDN
 *  java.net.InetAddress
 *  java.net.Socket
 *  java.net.UnknownHostException
 *  java.nio.charset.Charset
 *  java.security.GeneralSecurityException
 *  java.security.KeyStore
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.LinkedHashMap
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  java.util.TimeZone
 *  java.util.concurrent.ThreadFactory
 *  java.util.concurrent.TimeUnit
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 *  javax.net.ssl.TrustManager
 *  javax.net.ssl.TrustManagerFactory
 *  javax.net.ssl.X509TrustManager
 */
package j.f0;

import j.b0;
import j.s;
import j.z;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import k.e;
import k.f;
import k.t;

public final class c {
    public static final byte[] a;
    public static final String[] b;
    public static final b0 c;
    public static final z d;
    private static final f e;
    private static final f f;
    private static final f g;
    private static final f h;
    private static final f i;
    public static final Charset j;
    private static final Charset k;
    private static final Charset l;
    private static final Charset m;
    private static final Charset n;
    public static final TimeZone o;
    public static final Comparator<String> p;
    private static final Method q;
    private static final Pattern r;

    static {
        Method method;
        a = new byte[0];
        b = new String[0];
        byte[] arrby = a;
        method = null;
        c = b0.a(null, arrby);
        d = z.a(null, a);
        e = f.a("efbbbf");
        f = f.a("feff");
        g = f.a("fffe");
        h = f.a("0000ffff");
        i = f.a("ffff0000");
        j = Charset.forName((String)"UTF-8");
        Charset.forName((String)"ISO-8859-1");
        k = Charset.forName((String)"UTF-16BE");
        l = Charset.forName((String)"UTF-16LE");
        m = Charset.forName((String)"UTF-32BE");
        n = Charset.forName((String)"UTF-32LE");
        o = TimeZone.getTimeZone((String)"GMT");
        p = new Comparator<String>(){

            public int a(String string2, String string3) {
                return string2.compareTo(string3);
            }
        };
        try {
            Class[] arrclass = new Class[]{Throwable.class};
            method = Throwable.class.getDeclaredMethod("addSuppressed", arrclass);
        }
        catch (Exception exception) {}
        q = method;
        r = Pattern.compile((String)"([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int a(char n2) {
        if (n2 >= 48 && n2 <= 57) {
            return n2 - 48;
        }
        int n3 = 97;
        if (n2 >= n3 && n2 <= 102) {
            return 10 + (n2 - n3);
        }
        n3 = 65;
        if (n2 < n3) return -1;
        if (n2 > 70) return -1;
        return 10 + (n2 - n3);
    }

    public static int a(String string2, int n2, int n3, char c2) {
        while (n2 < n3) {
            if (string2.charAt(n2) == c2) {
                return n2;
            }
            ++n2;
        }
        return n3;
    }

    public static int a(String string2, int n2, int n3, String string3) {
        while (n2 < n3) {
            if (string3.indexOf((int)string2.charAt(n2)) != -1) {
                return n2;
            }
            ++n2;
        }
        return n3;
    }

    public static int a(String string2, long l2, TimeUnit timeUnit) {
        if (l2 >= 0L) {
            if (timeUnit != null) {
                long l3 = timeUnit.toMillis(l2);
                if (l3 <= Integer.MAX_VALUE) {
                    if (l3 == 0L && l2 > 0L) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(string2);
                        stringBuilder.append(" too small.");
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                    return (int)l3;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append(" too large.");
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            throw new NullPointerException("unit == null");
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string2);
        stringBuilder.append(" < 0");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static int a(Comparator<String> comparator, String[] arrstring, String string2) {
        int n2 = arrstring.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            if (comparator.compare((Object)arrstring[i2], (Object)string2) != 0) continue;
            return i2;
        }
        return -1;
    }

    public static AssertionError a(String string2, Exception exception) {
        AssertionError assertionError;
        assertionError = new AssertionError((Object)string2);
        try {
            assertionError.initCause((Throwable)exception);
        }
        catch (IllegalStateException illegalStateException) {}
        return assertionError;
    }

    public static String a(s s2, boolean bl) {
        String string2;
        if (s2.g().contains((CharSequence)":")) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("[");
            stringBuilder.append(s2.g());
            stringBuilder.append("]");
            string2 = stringBuilder.toString();
        } else {
            string2 = s2.g();
        }
        if (bl || s2.j() != s.c(s2.m())) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(string2);
            stringBuilder.append(":");
            stringBuilder.append(s2.j());
            string2 = stringBuilder.toString();
        }
        return string2;
    }

    public static String a(String string2) {
        String string3;
        block7 : {
            if (string2.contains((CharSequence)":")) {
                InetAddress inetAddress = string2.startsWith("[") && string2.endsWith("]") ? c.a(string2, 1, string2.length() - 1) : c.a(string2, 0, string2.length());
                if (inetAddress == null) {
                    return null;
                }
                byte[] arrby = inetAddress.getAddress();
                if (arrby.length == 16) {
                    return c.a(arrby);
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid IPv6 address: '");
                stringBuilder.append(string2);
                stringBuilder.append("'");
                throw new AssertionError((Object)stringBuilder.toString());
            }
            try {
                string3 = IDN.toASCII((String)string2).toLowerCase(Locale.US);
                if (!string3.isEmpty()) break block7;
                return null;
            }
            catch (IllegalArgumentException illegalArgumentException) {
                return null;
            }
        }
        boolean bl = c.b(string3);
        if (bl) {
            return null;
        }
        return string3;
    }

    public static /* varargs */ String a(String string2, Object ... arrobject) {
        return String.format((Locale)Locale.US, (String)string2, (Object[])arrobject);
    }

    private static String a(byte[] arrby) {
        int n2 = 0;
        int n3 = 0;
        int n4 = -1;
        int n5 = 0;
        while (n3 < arrby.length) {
            int n6;
            for (n6 = n3; n6 < 16 && arrby[n6] == 0 && arrby[n6 + 1] == 0; n6 += 2) {
            }
            int n7 = n6 - n3;
            if (n7 > n5 && n7 >= 4) {
                n4 = n3;
                n5 = n7;
            }
            n3 = n6 + 2;
        }
        k.c c2 = new k.c();
        while (n2 < arrby.length) {
            if (n2 == n4) {
                c2.writeByte(58);
                if ((n2 += n5) != 16) continue;
                c2.writeByte(58);
                continue;
            }
            if (n2 > 0) {
                c2.writeByte(58);
            }
            c2.e((255 & arrby[n2]) << 8 | 255 & arrby[n2 + 1]);
            n2 += 2;
        }
        return c2.o();
    }

    private static InetAddress a(String string2, int n2, int n3) {
        byte[] arrby = new byte[16];
        int n4 = 0;
        int n5 = -1;
        int n6 = -1;
        while (n2 < n3) {
            int n7;
            if (n4 == arrby.length) {
                return null;
            }
            int n8 = n2 + 2;
            if (n8 <= n3 && string2.regionMatches(n2, "::", 0, 2)) {
                if (n5 != -1) {
                    return null;
                }
                n5 = n4 += 2;
                if (n8 == n3) break;
                n6 = n8;
            } else {
                if (n4 != 0 && !string2.regionMatches(n2, ":", 0, 1)) {
                    if (string2.regionMatches(n2, ".", 0, 1)) {
                        if (!c.a(string2, n6, n3, arrby, n4 - 2)) {
                            return null;
                        }
                        n4 += 2;
                        break;
                    }
                    return null;
                }
                n6 = ++n2;
            }
            int n9 = 0;
            for (n2 = n6; n2 < n3 && (n7 = c.a(string2.charAt(n2))) != -1; ++n2) {
                n9 = n7 + (n9 << 4);
            }
            int n10 = n2 - n6;
            if (n10 != 0) {
                if (n10 > 4) {
                    return null;
                }
                int n11 = n4 + 1;
                arrby[n4] = (byte)(255 & n9 >>> 8);
                n4 = n11 + 1;
                arrby[n11] = (byte)(n9 & 255);
                continue;
            }
            return null;
        }
        if (n4 != arrby.length) {
            if (n5 == -1) {
                return null;
            }
            int n12 = arrby.length;
            int n13 = n4 - n5;
            System.arraycopy((Object)arrby, (int)n5, (Object)arrby, (int)(n12 - n13), (int)n13);
            Arrays.fill((byte[])arrby, (int)n5, (int)(n5 + (arrby.length - n4)), (byte)0);
        }
        try {
            InetAddress inetAddress = InetAddress.getByAddress((byte[])arrby);
            return inetAddress;
        }
        catch (UnknownHostException unknownHostException) {
            AssertionError assertionError;
            assertionError = new AssertionError();
            throw assertionError;
        }
    }

    public static Charset a(e e2, Charset charset) {
        if (e2.a(0L, e)) {
            e2.skip(e.e());
            return j;
        }
        if (e2.a(0L, f)) {
            e2.skip(f.e());
            return k;
        }
        if (e2.a(0L, g)) {
            e2.skip(g.e());
            return l;
        }
        if (e2.a(0L, h)) {
            e2.skip(h.e());
            return m;
        }
        if (e2.a(0L, i)) {
            e2.skip(i.e());
            return n;
        }
        return charset;
    }

    public static <T> List<T> a(List<T> list) {
        return Collections.unmodifiableList((List)new ArrayList(list));
    }

    public static /* varargs */ <T> List<T> a(T ... arrT) {
        return Collections.unmodifiableList((List)Arrays.asList((Object[])((Object[])arrT.clone())));
    }

    public static <K, V> Map<K, V> a(Map<K, V> map) {
        if (map.isEmpty()) {
            return Collections.emptyMap();
        }
        return Collections.unmodifiableMap((Map)new LinkedHashMap(map));
    }

    public static ThreadFactory a(String string2, final boolean bl) {
        return new ThreadFactory(){

            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, String.this);
                thread.setDaemon(bl);
                return thread;
            }
        };
    }

    public static X509TrustManager a() {
        try {
            TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance((String)TrustManagerFactory.getDefaultAlgorithm());
            trustManagerFactory.init(null);
            Object[] arrobject = trustManagerFactory.getTrustManagers();
            if (arrobject.length == 1 && arrobject[0] instanceof X509TrustManager) {
                return (X509TrustManager)arrobject[0];
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected default trust managers:");
            stringBuilder.append(Arrays.toString((Object[])arrobject));
            throw new IllegalStateException(stringBuilder.toString());
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw c.a("No System TLS", (Exception)((Object)generalSecurityException));
        }
    }

    public static void a(long l2, long l3, long l4) {
        if ((l3 | l4) >= 0L && l3 <= l2 && l2 - l3 >= l4) {
            return;
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    /*
     * Exception decompiling
     */
    public static void a(Closeable var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl9.1 : RETURN : trying to set 0 previously set to 1
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
     * Exception decompiling
     */
    public static void a(Throwable var0, Throwable var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Underrun type stack
        // org.benf.cfr.reader.b.a.c.e.a(StackSim.java:35)
        // org.benf.cfr.reader.b.b.af.a(OperationFactoryPop.java:20)
        // org.benf.cfr.reader.b.b.e.a(JVMInstr.java:315)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:195)
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
     * Exception decompiling
     */
    public static void a(Socket var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl16.1 : RETURN : trying to set 0 previously set to 1
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

    public static boolean a(AssertionError assertionError) {
        return assertionError.getCause() != null && assertionError.getMessage() != null && assertionError.getMessage().contains((CharSequence)"getsockname failed");
    }

    public static boolean a(Object object, Object object2) {
        return object == object2 || object != null && object.equals(object2);
        {
        }
    }

    private static boolean a(String string2, int n2, int n3, byte[] arrby, int n4) {
        int n5 = n4;
        while (n2 < n3) {
            int n6;
            char c2;
            if (n5 == arrby.length) {
                return false;
            }
            if (n5 != n4 && string2.charAt(n2) != '.') {
                return false;
            }
            int n7 = 0;
            for (n6 = ++n2; n6 < n3 && (c2 = string2.charAt(n6)) >= '0' && c2 <= '9'; ++n6) {
                if (n7 == 0 && n2 != n6) {
                    return false;
                }
                if ((n7 = c2 + n7 * 10 - 48) <= 255) continue;
                return false;
            }
            if (n6 - n2 == 0) {
                return false;
            }
            int n8 = n5 + 1;
            arrby[n5] = (byte)n7;
            n5 = n8;
            n2 = n6;
        }
        return n5 == n4 + 4;
    }

    public static boolean a(k.s s2, int n2, TimeUnit timeUnit) {
        try {
            boolean bl = c.b(s2, n2, timeUnit);
            return bl;
        }
        catch (IOException iOException) {
            return false;
        }
    }

    public static String[] a(Comparator<? super String> comparator, String[] arrstring, String[] arrstring2) {
        ArrayList arrayList = new ArrayList();
        block0 : for (String string2 : arrstring) {
            int n2 = arrstring2.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                if (comparator.compare((Object)string2, (Object)arrstring2[i2]) != 0) continue;
                arrayList.add((Object)string2);
                continue block0;
            }
        }
        return (String[])arrayList.toArray((Object[])new String[arrayList.size()]);
    }

    public static String[] a(String[] arrstring, String string2) {
        String[] arrstring2 = new String[1 + arrstring.length];
        System.arraycopy((Object)arrstring, (int)0, (Object)arrstring2, (int)0, (int)arrstring.length);
        arrstring2[-1 + arrstring2.length] = string2;
        return arrstring2;
    }

    public static int b(String string2, int n2, int n3) {
        while (n2 < n3) {
            char c2 = string2.charAt(n2);
            if (c2 != '\t' && c2 != '\n' && c2 != '\f' && c2 != '\r' && c2 != ' ') {
                return n2;
            }
            ++n2;
        }
        return n3;
    }

    private static boolean b(String string2) {
        for (int i2 = 0; i2 < string2.length(); ++i2) {
            char c2 = string2.charAt(i2);
            if (c2 > '\u001f') {
                if (c2 >= '') {
                    return true;
                }
                if (" #%/:?@[\\]".indexOf((int)c2) == -1) continue;
                return true;
            }
            return true;
        }
        return false;
    }

    public static boolean b(Comparator<String> comparator, String[] arrstring, String[] arrstring2) {
        if (arrstring != null && arrstring2 != null && arrstring.length != 0) {
            if (arrstring2.length == 0) {
                return false;
            }
            for (String string2 : arrstring) {
                int n2 = arrstring2.length;
                for (int i2 = 0; i2 < n2; ++i2) {
                    if (comparator.compare((Object)string2, (Object)arrstring2[i2]) != 0) continue;
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean b(k.s s2, int n2, TimeUnit timeUnit) {
        long l2 = System.nanoTime();
        long l3 = s2.d().d() ? s2.d().c() - l2 : Long.MAX_VALUE;
        s2.d().a(l2 + Math.min((long)l3, (long)timeUnit.toNanos((long)n2)));
        try {
            k.c c2 = new k.c();
            while (s2.a(c2, 8192L) != -1L) {
                c2.a();
            }
        }
        catch (Throwable throwable) {
            long l4 = l3 LCMP Long.MAX_VALUE;
            t t2 = s2.d();
            if (l4 == false) {
                t2.a();
            } else {
                t2.a(l2 + l3);
            }
            throw throwable;
        }
        catch (InterruptedIOException interruptedIOException) {
            long l5 = l3 LCMP Long.MAX_VALUE;
            t t3 = s2.d();
            if (l5 == false) {
                t3.a();
                return false;
            }
            t3.a(l2 + l3);
            return false;
        }
        long l6 = l3 LCMP Long.MAX_VALUE;
        t t4 = s2.d();
        if (l6 == false) {
            t4.a();
            return true;
        }
        t4.a(l2 + l3);
        return true;
    }

    public static int c(String string2) {
        int n2 = string2.length();
        for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = string2.charAt(i2);
            if (c2 > '\u001f') {
                if (c2 < '') continue;
                return i2;
            }
            return i2;
        }
        return -1;
    }

    public static int c(String string2, int n2, int n3) {
        for (int i2 = n3 - 1; i2 >= n2; --i2) {
            char c2 = string2.charAt(i2);
            if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') continue;
            return i2 + 1;
        }
        return n2;
    }

    public static String d(String string2, int n2, int n3) {
        int n4 = c.b(string2, n2, n3);
        return string2.substring(n4, c.c(string2, n4, n3));
    }

    public static boolean d(String string2) {
        return r.matcher((CharSequence)string2).matches();
    }

}

