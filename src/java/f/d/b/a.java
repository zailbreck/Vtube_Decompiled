/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.d.b.a0.a
 *  f.d.b.a0.b
 *  f.d.b.a0.c
 *  f.d.b.v
 *  f.d.b.y.e
 *  f.d.b.y.j
 *  f.d.b.y.n.o.a
 *  java.lang.AssertionError
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.sql.Date
 *  java.sql.Timestamp
 *  java.text.DateFormat
 *  java.text.ParseException
 *  java.text.ParsePosition
 *  java.text.SimpleDateFormat
 *  java.util.ArrayList
 *  java.util.Date
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Locale
 */
package f.d.b;

import f.d.b.a0.b;
import f.d.b.a0.c;
import f.d.b.t;
import f.d.b.v;
import f.d.b.y.e;
import f.d.b.y.j;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

final class a
extends v<java.util.Date> {
    private final Class<? extends java.util.Date> a;
    private final List<DateFormat> b = new ArrayList();

    public a(Class<? extends java.util.Date> class_, int n2, int n3) {
        a.a(class_);
        this.a = class_;
        this.b.add((Object)DateFormat.getDateTimeInstance((int)n2, (int)n3, (Locale)Locale.US));
        if (!Locale.getDefault().equals((Object)Locale.US)) {
            this.b.add((Object)DateFormat.getDateTimeInstance((int)n2, (int)n3));
        }
        if (e.c()) {
            this.b.add((Object)j.a((int)n2, (int)n3));
        }
    }

    a(Class<? extends java.util.Date> class_, String string) {
        a.a(class_);
        this.a = class_;
        this.b.add((Object)new SimpleDateFormat(string, Locale.US));
        if (!Locale.getDefault().equals((Object)Locale.US)) {
            this.b.add((Object)new SimpleDateFormat(string));
        }
    }

    private static Class<? extends java.util.Date> a(Class<? extends java.util.Date> class_) {
        if (class_ != java.util.Date.class && class_ != Date.class) {
            if (class_ == Timestamp.class) {
                return class_;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Date type must be one of ");
            stringBuilder.append(java.util.Date.class);
            stringBuilder.append(", ");
            stringBuilder.append(Timestamp.class);
            stringBuilder.append(", or ");
            stringBuilder.append(Date.class);
            stringBuilder.append(" but was ");
            stringBuilder.append(class_);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        return class_;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private java.util.Date a(String string) {
        List<DateFormat> list;
        List<DateFormat> list2 = list = this.b;
        synchronized (list2) {
            Iterator iterator = this.b.iterator();
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
    public void a(c c2, java.util.Date date) {
        List<DateFormat> list;
        if (date == null) {
            c2.r();
            return;
        }
        List<DateFormat> list2 = list = this.b;
        synchronized (list2) {
            c2.d(((DateFormat)this.b.get(0)).format(date));
            return;
        }
    }

    public java.util.Date read(f.d.b.a0.a a2) {
        if (a2.A() == b.j) {
            a2.y();
            return null;
        }
        java.util.Date date = a.super.a(a2.z());
        Class<? extends java.util.Date> class_ = this.a;
        if (class_ == java.util.Date.class) {
            return date;
        }
        if (class_ == Timestamp.class) {
            return new Timestamp(date.getTime());
        }
        if (class_ == Date.class) {
            return new Date(date.getTime());
        }
        throw new AssertionError();
    }

    /*
     * Enabled aggressive block sorting
     */
    public String toString() {
        StringBuilder stringBuilder;
        String string;
        DateFormat dateFormat = (DateFormat)this.b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("DefaultDateTypeAdapter(");
            string = ((SimpleDateFormat)dateFormat).toPattern();
        } else {
            stringBuilder = new StringBuilder();
            stringBuilder.append("DefaultDateTypeAdapter(");
            string = dateFormat.getClass().getSimpleName();
        }
        stringBuilder.append(string);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

