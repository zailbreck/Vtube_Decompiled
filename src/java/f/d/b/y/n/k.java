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
 *  java.sql.Time
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
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public final class k
extends v<Time> {
    public static final w b = new w(){

        public <T> v<T> create(f f2, f.d.b.z.a<T> a2) {
            if (a2.a() == Time.class) {
                return new k();
            }
            return null;
        }
    };
    private final DateFormat a = new SimpleDateFormat("hh:mm:ss a");

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(c c2, Time time) {
        void var6_3 = this;
        synchronized (var6_3) {
            String string = time == null ? null : this.a.format((Date)time);
            c2.d(string);
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Time read(f.d.b.a0.a a2) {
        void var5_2 = this;
        synchronized (var5_2) {
            if (a2.A() == b.j) {
                a2.y();
                return null;
            }
            try {
                return new Time(this.a.parse(a2.z()).getTime());
            }
            catch (ParseException parseException) {
                throw new t(parseException);
            }
        }
    }

}

