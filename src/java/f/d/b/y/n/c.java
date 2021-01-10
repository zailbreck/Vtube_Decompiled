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
 *  f.d.b.y.e
 *  f.d.b.y.j
 *  f.d.b.y.n.o.a
 *  f.d.b.z.a
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.text.DateFormat
 *  java.text.ParseException
 *  java.text.ParsePosition
 *  java.util.ArrayList
 *  java.util.Date
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 */
package f.d.b.y.n;

import f.d.b.a0.b;
import f.d.b.f;
import f.d.b.t;
import f.d.b.v;
import f.d.b.w;
import f.d.b.y.e;
import f.d.b.y.j;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public final class c
extends v<Date> {
    public static final w b = new w(){

        public <T> v<T> create(f f2, f.d.b.z.a<T> a2) {
            if (a2.a() == Date.class) {
                return new c();
            }
            return null;
        }
    };
    private final List<DateFormat> a = new ArrayList();

    public c() {
        this.a.add((Object)DateFormat.getDateTimeInstance((int)2, (int)2, (Locale)Locale.US));
        if (!Locale.getDefault().equals((Object)Locale.US)) {
            this.a.add((Object)DateFormat.getDateTimeInstance((int)2, (int)2));
        }
        if (e.c()) {
            this.a.add((Object)j.a((int)2, (int)2));
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Date a(String string) {
        void var9_2 = this;
        synchronized (var9_2) {
            Iterator iterator = this.a.iterator();
            if (iterator.hasNext()) {
                DateFormat dateFormat = (DateFormat)iterator.next();
                return dateFormat.parse(string);
            }
            try {
                return f.d.b.y.n.o.a.a((String)string, (ParsePosition)new ParsePosition(0));
            }
            catch (ParseException parseException) {
                throw new t(string, parseException);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(f.d.b.a0.c c2, Date date) {
        void var6_3 = this;
        synchronized (var6_3) {
            if (date == null) {
                c2.r();
                return;
            }
            c2.d(((DateFormat)this.a.get(0)).format(date));
            return;
        }
    }

    public Date read(f.d.b.a0.a a2) {
        if (a2.A() == b.j) {
            a2.y();
            return null;
        }
        return c.super.a(a2.z());
    }

}

