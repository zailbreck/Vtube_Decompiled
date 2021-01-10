/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 */
package f.f.a.e.c.b;

import android.text.TextUtils;
import f.f.a.e.c.b.a;
import f.f.a.e.f.h;
import f.f.a.f.c;
import java.util.ArrayList;

public class b {
    private static volatile b d;
    public ArrayList<String> a = new ArrayList();
    private a b = new a();
    private int c = 3;

    private b() {
        try {
            if (f.f.a.e.a.a.a.a().a("authority_general_data").equals((Object)"")) {
                this.b.a(1);
            }
            if (f.f.a.e.a.a.a.a().a("authority_device_id").equals((Object)"")) {
                this.b.b(1);
            }
            if (f.f.a.e.a.a.a.a().a("authority_serial_id").equals((Object)"")) {
                this.b.c(1);
            }
            if (f.f.a.e.a.a.a.a().a("authority_applist").equals((Object)"")) {
                this.b.e(1);
            }
            if (f.f.a.e.a.a.a.a().a("authority_app_download").equals((Object)"")) {
                this.b.f(1);
            }
            if (f.f.a.e.a.a.a.a().a("authority_oaid_id").equals((Object)"")) {
                this.b.d(1);
            }
            if (f.f.a.e.a.a.a.a().a("authority_other").equals((Object)"")) {
                this.b.g(1);
            }
            this.a.add((Object)"authority_general_data");
            this.a.add((Object)"authority_device_id");
            this.a.add((Object)"authority_applist");
            this.a.add((Object)"authority_app_download");
            this.a.add((Object)"authority_serial_id");
            this.a.add((Object)"authority_oaid_id");
            this.a.add((Object)"authority_other");
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    private int b(String string) {
        block3 : {
            String string2;
            block4 : {
                if (TextUtils.isEmpty((CharSequence)string)) break block3;
                string2 = f.f.a.e.a.a.a.a().a(string);
                if (!TextUtils.isEmpty((CharSequence)string2)) break block4;
                return 0;
            }
            try {
                int n2 = Integer.parseInt((String)string2);
                return n2;
            }
            catch (Exception exception) {
                h.d("SDKAuthorityController", exception.getMessage());
            }
        }
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static b b() {
        if (d != null) return d;
        Class<b> class_ = b.class;
        synchronized (b.class) {
            if (d != null) return d;
            d = new b();
            // ** MonitorExit[var1] (shouldn't be in output)
            return d;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    private int c(String string) {
        f.f.a.f.a a2 = c.b().a(f.f.a.e.c.a.i().f());
        if (a2 == null) {
            a2 = c.b().a();
        }
        if (string.equals((Object)"authority_general_data")) {
            return a2.G();
        }
        if (string.equals((Object)"authority_device_id")) {
            return a2.H();
        }
        if (string.equals((Object)"authority_applist")) {
            return a2.L();
        }
        if (string.equals((Object)"authority_app_download")) {
            return a2.N();
        }
        if (string.equals((Object)"authority_serial_id")) {
            return a2.F();
        }
        if (!string.equals((Object)"authority_oaid_id")) return -1;
        return a2.H();
    }

    public final int a() {
        return this.c;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean a(String string) {
        int n2;
        f.f.a.f.a a2 = c.b().a(f.f.a.e.c.a.i().f());
        if (a2 == null) {
            a2 = c.b().a();
        }
        boolean bl = (n2 = a2.I()) == 0 ? b.super.b(string) == 1 && b.super.c(string) == 1 : n2 == 1 && b.super.c(string) == 1;
        if (string.equals((Object)"authority_applist") || string.equals((Object)"authority_app_download")) {
            bl = b.super.c(string) != 0;
        }
        if (string.equals((Object)"authority_other")) {
            bl = b.super.b(string) == 1;
        }
        if (string.equals((Object)"authority_device_id") && b.b().c == 2) {
            bl = !a2.z() && b.super.b(string) == 1;
        }
        if (string.equals((Object)"authority_imei_mac")) return true ^ a2.z();
        if (string.equals((Object)"authority_imsi_id")) return true ^ a2.z();
        if (!string.equals((Object)"authority_android_id")) return bl;
        return true ^ a2.z();
    }
}

