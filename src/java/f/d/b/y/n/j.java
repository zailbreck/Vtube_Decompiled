/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.d.b.a0.a
 *  f.d.b.a0.b
 *  f.d.b.a0.c
 *  f.d.b.f
 *  f.d.b.v
 *  f.d.b.w
 *  f.d.b.z.a
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.sql.Date
 *  java.text.DateFormat
 *  java.text.ParseException
 *  java.text.SimpleDateFormat
 *  java.util.Date
 */
package f.d.b.y.n;

import f.d.b.a0.b;
import f.d.b.a0.c;
import f.d.b.f;
import f.d.b.t;
import f.d.b.v;
import f.d.b.w;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public final class j
extends v<Date> {
    public static final w b = new w(){

        public <T> v<T> create(f f2, f.d.b.z.a<T> a2) {
            if (a2.a() == Date.class) {
                return new j();
            }
            return null;
        }
    };
    private final DateFormat a = new SimpleDateFormat("MMM d, yyyy");

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(c c2, Date date) {
        void var6_3 = this;
        synchronized (var6_3) {
            String string = date == null ? null : this.a.format((java.util.Date)date);
            c2.d(string);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Date read(f.d.b.a0.a a2) {
        void var5_2 = this;
        synchronized (var5_2) {
            if (a2.A() == b.j) {
                a2.y();
                return null;
            }
            try {
                return new Date(this.a.parse(a2.z()).getTime());
            }
            catch (ParseException parseException) {
                throw new t(parseException);
            }
        }
    }

}

