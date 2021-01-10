/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$NotFoundException
 *  android.content.res.Resources$Theme
 *  android.content.res.XmlResourceParser
 *  android.graphics.Typeface
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.Log
 *  android.util.TypedValue
 *  java.io.IOException
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
package e.e.d.d;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import e.e.d.d.c;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class f {
    public static Typeface a(Context context, int n2, TypedValue typedValue, int n3, a a2) {
        if (context.isRestricted()) {
            return null;
        }
        return f.a(context, n2, typedValue, n3, a2, null, true);
    }

    private static Typeface a(Context context, int n2, TypedValue typedValue, int n3, a a2, Handler handler, boolean bl) {
        Resources resources = context.getResources();
        resources.getValue(n2, typedValue, true);
        Typeface typeface = f.a(context, resources, typedValue, n2, n3, a2, handler, bl);
        if (typeface == null) {
            if (a2 != null) {
                return typeface;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Font resource ID #0x");
            stringBuilder.append(Integer.toHexString((int)n2));
            stringBuilder.append(" could not be retrieved.");
            throw new Resources.NotFoundException(stringBuilder.toString());
        }
        return typeface;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static Typeface a(Context context, Resources resources, TypedValue typedValue, int n2, int n3, a a2, Handler handler, boolean bl) {
        StringBuilder stringBuilder;
        void var18_15;
        String string;
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Resource \"");
            stringBuilder2.append(resources.getResourceName(n2));
            stringBuilder2.append("\" (");
            stringBuilder2.append(Integer.toHexString((int)n2));
            stringBuilder2.append(") is not a Font: ");
            stringBuilder2.append((Object)typedValue);
            throw new Resources.NotFoundException(stringBuilder2.toString());
        }
        String string2 = charSequence.toString();
        if (!string2.startsWith("res/")) {
            if (a2 == null) return null;
            {
                a2.a(-3, handler);
            }
            return null;
        }
        Typeface typeface = e.e.e.c.b(resources, n2, n3);
        if (typeface != null) {
            if (a2 == null) return typeface;
            {
                a2.a(typeface, handler);
            }
            return typeface;
        }
        try {
            if (string2.toLowerCase().endsWith(".xml")) {
                c.a a3 = c.a((XmlPullParser)resources.getXml(n2), resources);
                if (a3 != null) {
                    return e.e.e.c.a(context, a3, resources, n2, n3, a2, handler, bl);
                }
                Log.e((String)"ResourcesCompat", (String)"Failed to find font-family tag");
                if (a2 == null) return null;
                {
                    a2.a(-3, handler);
                    return null;
                }
            }
            Typeface typeface2 = e.e.e.c.a(context, resources, n2, string2, n3);
            if (a2 == null) return typeface2;
            {
                if (typeface2 != null) {
                    a2.a(typeface2, handler);
                    return typeface2;
                }
                a2.a(-3, handler);
            }
            return typeface2;
        }
        catch (IOException iOException) {
            stringBuilder = new StringBuilder();
            string = "Failed to read xml resource ";
        }
        catch (XmlPullParserException xmlPullParserException) {
            stringBuilder = new StringBuilder();
            string = "Failed to parse xml resource ";
        }
        stringBuilder.append(string);
        stringBuilder.append(string2);
        Log.e((String)"ResourcesCompat", (String)stringBuilder.toString(), (Throwable)var18_15);
        if (a2 == null) return null;
        {
            a2.a(-3, handler);
        }
        return null;
    }

    public static Drawable a(Resources resources, int n2, Resources.Theme theme) {
        if (Build.VERSION.SDK_INT >= 21) {
            return resources.getDrawable(n2, theme);
        }
        return resources.getDrawable(n2);
    }

    public static abstract class e.e.d.d.f$a {
        public abstract void a(int var1);

        public final void a(final int n2, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable(){

                public void run() {
                    a.this.a(n2);
                }
            });
        }

        public abstract void a(Typeface var1);

        public final void a(final Typeface typeface, Handler handler) {
            if (handler == null) {
                handler = new Handler(Looper.getMainLooper());
            }
            handler.post(new Runnable(){

                public void run() {
                    a.this.a(typeface);
                }
            });
        }

    }

}

