/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.Date
 *  java.util.GregorianCalendar
 *  java.util.List
 *  java.util.Locale
 *  java.util.TimeZone
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package j;

import j.f0.c;
import j.f0.g.d;
import j.r;
import j.s;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class l {
    private static final Pattern j = Pattern.compile((String)"(\\d{2,4})[^\\d]*");
    private static final Pattern k = Pattern.compile((String)"(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern l = Pattern.compile((String)"(\\d{1,2})[^\\d]*");
    private static final Pattern m = Pattern.compile((String)"(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    private final String a;
    private final String b;
    private final long c;
    private final String d;
    private final String e;
    private final boolean f;
    private final boolean g;
    private final boolean h;
    private final boolean i;

    private l(String string2, String string3, long l2, String string4, String string5, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        this.a = string2;
        this.b = string3;
        this.c = l2;
        this.d = string4;
        this.e = string5;
        this.f = bl;
        this.g = bl2;
        this.i = bl3;
        this.h = bl4;
    }

    private static int a(String string2, int n2, int n3, boolean bl) {
        while (n2 < n3) {
            char c2 = string2.charAt(n2);
            boolean bl2 = c2 < ' ' && c2 != '\t' || c2 >= '' || c2 >= '0' && c2 <= '9' || c2 >= 'a' && c2 <= 'z' || c2 >= 'A' && c2 <= 'Z' || c2 == ':';
            if (bl2 == (bl ^ true)) {
                return n2;
            }
            ++n2;
        }
        return n3;
    }

    private static long a(String string2, int n2, int n3) {
        IllegalArgumentException illegalArgumentException;
        int n4 = l.a(string2, n2, n3, false);
        Matcher matcher = m.matcher((CharSequence)string2);
        int n5 = -1;
        int n6 = -1;
        int n7 = -1;
        int n8 = -1;
        int n9 = -1;
        int n10 = -1;
        while (n4 < n3) {
            int n11 = l.a(string2, n4 + 1, n3, true);
            matcher.region(n4, n11);
            if (n6 == -1 && matcher.usePattern(m).matches()) {
                int n12 = Integer.parseInt((String)matcher.group(1));
                int n13 = Integer.parseInt((String)matcher.group(2));
                n10 = Integer.parseInt((String)matcher.group(3));
                n9 = n13;
                n6 = n12;
            } else if (n7 == -1 && matcher.usePattern(l).matches()) {
                n7 = Integer.parseInt((String)matcher.group(1));
            } else if (n8 == -1 && matcher.usePattern(k).matches()) {
                String string3 = matcher.group(1).toLowerCase(Locale.US);
                n8 = k.pattern().indexOf(string3) / 4;
            } else if (n5 == -1 && matcher.usePattern(j).matches()) {
                n5 = Integer.parseInt((String)matcher.group(1));
            }
            n4 = l.a(string2, n11 + 1, n3, false);
        }
        if (n5 >= 70 && n5 <= 99) {
            n5 += 1900;
        }
        if (n5 >= 0 && n5 <= 69) {
            n5 += 2000;
        }
        if (n5 >= 1601) {
            if (n8 != -1) {
                if (n7 >= 1 && n7 <= 31) {
                    if (n6 >= 0 && n6 <= 23) {
                        if (n9 >= 0 && n9 <= 59) {
                            if (n10 >= 0 && n10 <= 59) {
                                GregorianCalendar gregorianCalendar = new GregorianCalendar(c.o);
                                gregorianCalendar.setLenient(false);
                                gregorianCalendar.set(1, n5);
                                gregorianCalendar.set(2, n8 - 1);
                                gregorianCalendar.set(5, n7);
                                gregorianCalendar.set(11, n6);
                                gregorianCalendar.set(12, n9);
                                gregorianCalendar.set(13, n10);
                                gregorianCalendar.set(14, 0);
                                return gregorianCalendar.getTimeInMillis();
                            }
                            throw new IllegalArgumentException();
                        }
                        throw new IllegalArgumentException();
                    }
                    throw new IllegalArgumentException();
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
        illegalArgumentException = new IllegalArgumentException();
        throw illegalArgumentException;
    }

    /*
     * Exception decompiling
     */
    static l a(long var0, s var2, String var3) {
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

    public static l a(s s2, String string2) {
        return l.a(System.currentTimeMillis(), s2, string2);
    }

    private static String a(String string2) {
        if (!string2.endsWith(".")) {
            String string3;
            if (string2.startsWith(".")) {
                string2 = string2.substring(1);
            }
            if ((string3 = c.a(string2)) != null) {
                return string3;
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    public static List<l> a(s s2, r r2) {
        List<String> list = r2.b("Set-Cookie");
        int n2 = list.size();
        ArrayList arrayList = null;
        for (int i2 = 0; i2 < n2; ++i2) {
            l l2 = l.a(s2, (String)list.get(i2));
            if (l2 == null) continue;
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add((Object)l2);
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    private static boolean a(String string2, String string3) {
        if (string2.equals((Object)string3)) {
            return true;
        }
        return string2.endsWith(string3) && string2.charAt(string2.length() - string3.length() - 1) == '.' && !c.d(string2);
    }

    private static long b(String string2) {
        try {
            long l2 = Long.parseLong((String)string2);
            if (l2 <= 0L) {
                return Long.MIN_VALUE;
            }
            return l2;
        }
        catch (NumberFormatException numberFormatException) {
            if (string2.matches("-?\\d+")) {
                if (string2.startsWith("-")) {
                    return Long.MIN_VALUE;
                }
                return Long.MAX_VALUE;
            }
            throw numberFormatException;
        }
    }

    public String a() {
        return this.a;
    }

    String a(boolean bl) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        stringBuilder.append('=');
        stringBuilder.append(this.b);
        if (this.h) {
            String string2;
            if (this.c == Long.MIN_VALUE) {
                string2 = "; max-age=0";
            } else {
                stringBuilder.append("; expires=");
                string2 = d.a(new Date(this.c));
            }
            stringBuilder.append(string2);
        }
        if (!this.i) {
            stringBuilder.append("; domain=");
            if (bl) {
                stringBuilder.append(".");
            }
            stringBuilder.append(this.d);
        }
        stringBuilder.append("; path=");
        stringBuilder.append(this.e);
        if (this.f) {
            stringBuilder.append("; secure");
        }
        if (this.g) {
            stringBuilder.append("; httponly");
        }
        return stringBuilder.toString();
    }

    public String b() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (!(object instanceof l)) {
            return false;
        }
        l l2 = (l)object;
        boolean bl = l2.a.equals((Object)this.a);
        boolean bl2 = false;
        if (bl) {
            boolean bl3 = l2.b.equals((Object)this.b);
            bl2 = false;
            if (bl3) {
                boolean bl4 = l2.d.equals((Object)this.d);
                bl2 = false;
                if (bl4) {
                    boolean bl5 = l2.e.equals((Object)this.e);
                    bl2 = false;
                    if (bl5) {
                        long l3 = l2.c LCMP this.c;
                        bl2 = false;
                        if (l3 == false) {
                            boolean bl6 = l2.f;
                            boolean bl7 = this.f;
                            bl2 = false;
                            if (bl6 == bl7) {
                                boolean bl8 = l2.g;
                                boolean bl9 = this.g;
                                bl2 = false;
                                if (bl8 == bl9) {
                                    boolean bl10 = l2.h;
                                    boolean bl11 = this.h;
                                    bl2 = false;
                                    if (bl10 == bl11) {
                                        boolean bl12 = l2.i;
                                        boolean bl13 = this.i;
                                        bl2 = false;
                                        if (bl12 == bl13) {
                                            bl2 = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return bl2;
    }

    public int hashCode() {
        int n2 = 31 * (31 * (31 * (31 * (527 + this.a.hashCode()) + this.b.hashCode()) + this.d.hashCode()) + this.e.hashCode());
        long l2 = this.c;
        return 31 * (31 * (31 * (31 * (n2 + (int)(l2 ^ l2 >>> 32)) + (true ^ this.f)) + (true ^ this.g)) + (true ^ this.h)) + (true ^ this.i);
    }

    public String toString() {
        return this.a(false);
    }
}

