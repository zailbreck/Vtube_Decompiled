/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.System
 *  java.text.DateFormat
 *  java.text.SimpleDateFormat
 *  java.util.Date
 *  java.util.Locale
 *  java.util.SimpleTimeZone
 *  java.util.TimeZone
 */
package f.a.a.a.a.h.g;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

public class d {
    private static volatile long a;

    public static String a() {
        Class<d> class_ = d.class;
        synchronized (d.class) {
            String string = d.a(new Date(d.b()));
            // ** MonitorExit[var2] (shouldn't be in output)
            return string;
        }
    }

    public static String a(Date date) {
        return d.c().format(date);
    }

    public static Date a(String string) {
        return d.c().parse(string);
    }

    public static void a(long l2) {
        Class<d> class_ = d.class;
        synchronized (d.class) {
            a = l2 - System.currentTimeMillis();
            // ** MonitorExit[var3_1] (shouldn't be in output)
            return;
        }
    }

    public static long b() {
        return System.currentTimeMillis() + a;
    }

    private static DateFormat c() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpleDateFormat.setTimeZone((TimeZone)new SimpleTimeZone(0, "GMT"));
        return simpleDateFormat;
    }
}

