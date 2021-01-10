/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.f.a.q.b.a
 *  java.io.Closeable
 *  java.lang.ArrayIndexOutOfBoundsException
 *  java.lang.AssertionError
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.IllegalArgumentException
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
 *  java.net.UnknownHostException
 *  java.nio.charset.Charset
 *  java.util.Arrays
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.LinkedHashMap
 *  java.util.List
 *  java.util.Locale
 *  java.util.Map
 *  java.util.TimeZone
 *  java.util.concurrent.ThreadFactory
 *  java.util.regex.Pattern
 */
package f.f.a.q.a.r;

import f.f.a.q.a.m;
import f.f.a.q.a.o;
import f.f.a.q.b.c;
import f.f.a.q.b.d;
import java.io.Closeable;
import java.lang.reflect.Method;
import java.net.IDN;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ThreadFactory;
import java.util.regex.Pattern;

public final class b {
    public static final byte[] a;
    public static final String[] b;
    public static final o c;
    public static final m d;
    private static final d e;
    private static final d f;
    private static final d g;
    private static final d h;
    private static final d i;
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
        c = o.a(null, arrby);
        d = m.a(null, a);
        e = d.a("efbbbf");
        f = d.a("feff");
        g = d.a("fffe");
        h = d.a("0000ffff");
        i = d.a("ffff0000");
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

    public static String a(String string2) {
        String string3;
        block7 : {
            if (string2.contains((CharSequence)":")) {
                InetAddress inetAddress = string2.startsWith("[") && string2.endsWith("]") ? b.a(string2, 1, string2.length() - 1) : b.a(string2, 0, string2.length());
                if (inetAddress == null) {
                    return null;
                }
                byte[] arrby = inetAddress.getAddress();
                if (arrby.length == 16) {
                    return b.a(arrby);
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
        boolean bl = b.b(string3);
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
        f.f.a.q.b.a a2 = new f.f.a.q.b.a();
        while (n2 < arrby.length) {
            if (n2 == n4) {
                a2.c(58);
                if ((n2 += n5) != 16) continue;
                a2.c(58);
                continue;
            }
            if (n2 > 0) {
                a2.c(58);
            }
            a2.c((long)((255 & arrby[n2]) << 8 | 255 & arrby[n2 + 1]));
            n2 += 2;
        }
        return a2.c();
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
                        if (!b.a(string2, n6, n3, arrby, n4 - 2)) {
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
            for (n2 = n6; n2 < n3 && (n7 = b.a(string2.charAt(n2))) != -1; ++n2) {
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

    public static Charset a(c c2, Charset charset) {
        if (c2.a(0L, e)) {
            c2.skip(e.b());
            return j;
        }
        if (c2.a(0L, f)) {
            c2.skip(f.b());
            return k;
        }
        if (c2.a(0L, g)) {
            c2.skip(g.b());
            return l;
        }
        if (c2.a(0L, h)) {
            c2.skip(h.b());
            return m;
        }
        if (c2.a(0L, i)) {
            c2.skip(i.b());
            return n;
        }
        return charset;
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

    public static ThreadFactory a(final String string2, final boolean bl) {
        return new ThreadFactory(){

            public Thread newThread(Runnable runnable) {
                Thread thread = new Thread(runnable, string2);
                thread.setDaemon(bl);
                return thread;
            }
        };
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

    public static int c(String string2, int n2, int n3) {
        for (int i2 = n3 - 1; i2 >= n2; --i2) {
            char c2 = string2.charAt(i2);
            if (c2 == '\t' || c2 == '\n' || c2 == '\f' || c2 == '\r' || c2 == ' ') continue;
            return i2 + 1;
        }
        return n2;
    }

}

