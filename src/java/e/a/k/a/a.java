/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.content.res.Configuration
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.XmlResourceParser
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Log
 *  android.util.SparseArray
 *  android.util.TypedValue
 *  androidx.appcompat.widget.l0
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.ThreadLocal
 *  java.lang.Throwable
 *  java.util.WeakHashMap
 *  org.xmlpull.v1.XmlPullParser
 */
package e.a.k.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.appcompat.widget.l0;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParser;

@SuppressLint(value={"RestrictedAPI"})
public final class a {
    private static final ThreadLocal<TypedValue> a = new ThreadLocal();
    private static final WeakHashMap<Context, SparseArray<a>> b = new WeakHashMap(0);
    private static final Object c = new Object();

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static ColorStateList a(Context context, int n2) {
        Object object;
        Object object2 = object = c;
        synchronized (object2) {
            SparseArray sparseArray = (SparseArray)b.get((Object)context);
            if (sparseArray == null) return null;
            if (sparseArray.size() <= 0) return null;
            a a2 = (a)sparseArray.get(n2);
            if (a2 == null) return null;
            if (a2.b.equals(context.getResources().getConfiguration())) {
                return a2.a;
            }
            sparseArray.remove(n2);
            return null;
        }
    }

    private static TypedValue a() {
        TypedValue typedValue = (TypedValue)a.get();
        if (typedValue == null) {
            typedValue = new TypedValue();
            a.set((Object)typedValue);
        }
        return typedValue;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void a(Context context, int n2, ColorStateList colorStateList) {
        Object object;
        Object object2 = object = c;
        synchronized (object2) {
            SparseArray sparseArray = (SparseArray)b.get((Object)context);
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                b.put((Object)context, (Object)sparseArray);
            }
            sparseArray.append(n2, (Object)new a(colorStateList, context.getResources().getConfiguration()));
            return;
        }
    }

    public static ColorStateList b(Context context, int n2) {
        if (Build.VERSION.SDK_INT >= 23) {
            return context.getColorStateList(n2);
        }
        ColorStateList colorStateList = a.a(context, n2);
        if (colorStateList != null) {
            return colorStateList;
        }
        ColorStateList colorStateList2 = a.d(context, n2);
        if (colorStateList2 != null) {
            a.a(context, n2, colorStateList2);
            return colorStateList2;
        }
        return e.e.d.a.a(context, n2);
    }

    public static Drawable c(Context context, int n2) {
        return l0.a().a(context, n2);
    }

    private static ColorStateList d(Context context, int n2) {
        if (a.e(context, n2)) {
            return null;
        }
        Resources resources = context.getResources();
        XmlResourceParser xmlResourceParser = resources.getXml(n2);
        try {
            ColorStateList colorStateList = e.e.d.d.a.a(resources, (XmlPullParser)xmlResourceParser, context.getTheme());
            return colorStateList;
        }
        catch (Exception exception) {
            Log.e((String)"AppCompatResources", (String)"Failed to inflate ColorStateList, leaving it to the framework", (Throwable)exception);
            return null;
        }
    }

    private static boolean e(Context context, int n2) {
        Resources resources = context.getResources();
        TypedValue typedValue = a.a();
        resources.getValue(n2, typedValue, true);
        int n3 = typedValue.type;
        return n3 >= 28 && n3 <= 31;
    }

    private static class a {
        final ColorStateList a;
        final Configuration b;

        a(ColorStateList colorStateList, Configuration configuration) {
            this.a = colorStateList;
            this.b = configuration;
        }
    }

}

