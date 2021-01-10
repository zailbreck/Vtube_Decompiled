/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.Looper
 *  android.os.Message
 *  android.text.TextUtils
 *  f.f.a.k.b.a
 *  f.f.a.k.b.a$c
 *  f.f.a.k.b.b
 *  f.f.a.k.f.d
 *  f.f.a.k.g.c
 *  f.f.a.k.g.d
 *  f.f.a.k.g.k
 *  f.f.a.k.g.l
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.reflect.Method
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package f.f.a.k.g;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import f.f.a.k.b.a;
import f.f.a.k.g.b;
import f.f.a.k.g.c;
import f.f.a.k.g.d;
import f.f.a.k.g.k;
import f.f.a.k.g.l;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class j
implements Handler.Callback,
d {
    protected Pattern b;
    protected Context c;
    protected b d;
    protected Handler e;

    public j(Context context) {
        this.c = context;
        this.e = new Handler(Looper.getMainLooper(), (Handler.Callback)this);
    }

    public final void a(b b2) {
        this.d = b2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(String string) {
        c c2;
        if (TextUtils.isEmpty((CharSequence)string)) {
            return;
        }
        if (string != null) {
            c2 = f.f.a.k.f.d.a((b)this.d, (String)string);
            if (c2 == null) {
                Matcher matcher = this.b.matcher((CharSequence)string);
                if (!matcher.matches()) return;
                c2 = new c();
                int n2 = matcher.groupCount();
                if (n2 >= 5) {
                    c2.f = matcher.group(5);
                }
                if (n2 < 3) return;
                c2.d = matcher.group(1);
                c2.g = matcher.group(2);
                c2.e = matcher.group(3);
            }
        } else {
            return;
        }
        c2.a = this.d;
        if (c2 == null) {
            return;
        }
        b b2 = c2.a;
        if (b2 == null) {
            return;
        }
        Object object = b2.a(c2.d);
        if (object == null) {
            return;
        }
        try {
            a.c c3 = a.a((ClassLoader)this.c.getClassLoader(), (String)object.getClass().getName()).a(c2.e, new Class[]{Object.class, String.class});
            c3.a();
            if (object == null) return;
            if (!(object instanceof k)) return;
            c2.b = object;
            c2.c = c3;
            c2.b = object;
            Message message = Message.obtain();
            message.what = 1;
            message.obj = c2;
            this.e.sendMessage(message);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
        catch (f.f.a.k.b.b b3) {
            b3.printStackTrace();
        }
    }

    public final boolean b(String string) {
        if (l.a((String)string)) {
            this.b = l.b((String)string);
            return true;
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean handleMessage(Message message) {
        c c2 = (c)message.obj;
        if (c2 == null) {
            return false;
        }
        try {
            if (message.what != 1) {
                return false;
            }
            Object object = c2.b;
            a.c c3 = c2.c;
            Object[] arrobject = new Object[2];
            arrobject[0] = c2;
            String string = TextUtils.isEmpty((CharSequence)c2.f) ? "{}" : c2.f;
            arrobject[1] = string;
            c3.a(object, arrobject);
            return true;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return false;
        }
    }
}

