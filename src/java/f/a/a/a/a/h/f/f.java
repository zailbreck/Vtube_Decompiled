/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.text.ParseException
 *  java.text.SimpleDateFormat
 *  java.util.Date
 *  java.util.TimeZone
 */
package f.a.a.a.a.h.f;

import f.a.a.a.a.h.d;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class f {
    private String a;
    private String b;
    private String c;
    private long d;

    public f(String string, String string2, String string3, String string4) {
        this.c(string);
        this.d(string2);
        this.b(string3);
        this.a(string4);
    }

    public long a() {
        return this.d;
    }

    public void a(String string) {
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss");
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone((String)"UTC"));
            this.d = simpleDateFormat.parse(string).getTime() / 1000L;
            return;
        }
        catch (ParseException parseException) {
            if (d.a()) {
                parseException.printStackTrace();
            }
            this.d = 30L + f.a.a.a.a.h.g.d.b() / 1000L;
            return;
        }
    }

    public String b() {
        return this.c;
    }

    public void b(String string) {
        this.c = string;
    }

    public String c() {
        return this.a;
    }

    public void c(String string) {
        this.a = string;
    }

    public String d() {
        return this.b;
    }

    public void d(String string) {
        this.b = string;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OSSFederationToken [tempAk=");
        stringBuilder.append(this.a);
        stringBuilder.append(", tempSk=");
        stringBuilder.append(this.b);
        stringBuilder.append(", securityToken=");
        stringBuilder.append(this.c);
        stringBuilder.append(", expiration=");
        stringBuilder.append(this.d);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}

