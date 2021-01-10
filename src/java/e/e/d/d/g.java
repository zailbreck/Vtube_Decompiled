/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.util.AttributeSet
 *  android.util.TypedValue
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.UnsupportedOperationException
 *  org.xmlpull.v1.XmlPullParser
 */
package e.e.d.d;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import e.e.d.d.a;
import e.e.d.d.b;
import org.xmlpull.v1.XmlPullParser;

public class g {
    public static float a(TypedArray typedArray, XmlPullParser xmlPullParser, String string, int n2, float f2) {
        if (!g.a(xmlPullParser, string)) {
            return f2;
        }
        return typedArray.getFloat(n2, f2);
    }

    public static int a(TypedArray typedArray, XmlPullParser xmlPullParser, String string, int n2, int n3) {
        if (!g.a(xmlPullParser, string)) {
            return n3;
        }
        return typedArray.getColor(n2, n3);
    }

    public static ColorStateList a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String string, int n2) {
        if (g.a(xmlPullParser, string)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(n2, typedValue);
            int n3 = typedValue.type;
            if (n3 != 2) {
                if (n3 >= 28 && n3 <= 31) {
                    return g.a(typedValue);
                }
                return a.a(typedArray.getResources(), typedArray.getResourceId(n2, 0), theme);
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to resolve attribute at index ");
            stringBuilder.append(n2);
            stringBuilder.append(": ");
            stringBuilder.append((Object)typedValue);
            throw new UnsupportedOperationException(stringBuilder.toString());
        }
        return null;
    }

    private static ColorStateList a(TypedValue typedValue) {
        return ColorStateList.valueOf((int)typedValue.data);
    }

    public static TypedArray a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] arrn) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, arrn);
        }
        return theme.obtainStyledAttributes(attributeSet, arrn, 0, 0);
    }

    public static b a(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String string, int n2, int n3) {
        if (g.a(xmlPullParser, string)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(n2, typedValue);
            int n4 = typedValue.type;
            if (n4 >= 28 && n4 <= 31) {
                return b.b(typedValue.data);
            }
            b b2 = b.b(typedArray.getResources(), typedArray.getResourceId(n2, 0), theme);
            if (b2 != null) {
                return b2;
            }
        }
        return b.b(n3);
    }

    public static String a(TypedArray typedArray, XmlPullParser xmlPullParser, String string, int n2) {
        if (!g.a(xmlPullParser, string)) {
            return null;
        }
        return typedArray.getString(n2);
    }

    public static boolean a(TypedArray typedArray, XmlPullParser xmlPullParser, String string, int n2, boolean bl) {
        if (!g.a(xmlPullParser, string)) {
            return bl;
        }
        return typedArray.getBoolean(n2, bl);
    }

    public static boolean a(XmlPullParser xmlPullParser, String string) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", string) != null;
    }

    public static int b(TypedArray typedArray, XmlPullParser xmlPullParser, String string, int n2, int n3) {
        if (!g.a(xmlPullParser, string)) {
            return n3;
        }
        return typedArray.getInt(n2, n3);
    }

    public static TypedValue b(TypedArray typedArray, XmlPullParser xmlPullParser, String string, int n2) {
        if (!g.a(xmlPullParser, string)) {
            return null;
        }
        return typedArray.peekValue(n2);
    }

    public static int c(TypedArray typedArray, XmlPullParser xmlPullParser, String string, int n2, int n3) {
        if (!g.a(xmlPullParser, string)) {
            return n3;
        }
        return typedArray.getResourceId(n2, n3);
    }
}

