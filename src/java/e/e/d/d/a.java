/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.content.res.XmlResourceParser
 *  android.graphics.Color
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.util.StateSet
 *  android.util.Xml
 *  java.lang.Exception
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
package e.e.d.d;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.Xml;
import e.e.c;
import e.e.d.d.e;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class a {
    private static int a(int n2, float f2) {
        int n3 = Math.round((float)(f2 * (float)Color.alpha((int)n2)));
        return n2 & 16777215 | n3 << 24;
    }

    public static ColorStateList a(Resources resources, int n2, Resources.Theme theme) {
        try {
            ColorStateList colorStateList = a.a(resources, (XmlPullParser)resources.getXml(n2), theme);
            return colorStateList;
        }
        catch (Exception exception) {
            Log.e((String)"CSLCompat", (String)"Failed to inflate ColorStateList.", (Throwable)exception);
            return null;
        }
    }

    public static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) {
        XmlPullParserException xmlPullParserException;
        int n2;
        AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xmlPullParser);
        while ((n2 = xmlPullParser.next()) != 2 && n2 != 1) {
        }
        if (n2 == 2) {
            return a.a(resources, xmlPullParser, attributeSet, theme);
        }
        xmlPullParserException = new XmlPullParserException("No start tag found");
        throw xmlPullParserException;
    }

    public static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String string = xmlPullParser.getName();
        if (string.equals((Object)"selector")) {
            return a.b(resources, xmlPullParser, attributeSet, theme);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(xmlPullParser.getPositionDescription());
        stringBuilder.append(": invalid color state list tag ");
        stringBuilder.append(string);
        throw new XmlPullParserException(stringBuilder.toString());
    }

    private static TypedArray a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] arrn) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, arrn);
        }
        return theme.obtainStyledAttributes(attributeSet, arrn, 0, 0);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int n2 = xmlPullParser.getDepth();
        int n3 = 1;
        int n4 = n2 + n3;
        int[][] arrarrn = new int[20][];
        int[] arrn = new int[arrarrn.length];
        int n5 = 0;
        do {
            block7 : {
                int n6;
                int n7;
                int n8;
                int[] arrn2;
                float f2;
                block11 : {
                    block6 : {
                        TypedArray typedArray;
                        block10 : {
                            int n9;
                            block9 : {
                                block8 : {
                                    int n10;
                                    int n11;
                                    if ((n11 = xmlPullParser.next()) == n3 || (n10 = xmlPullParser.getDepth()) < n4 && n11 == 3) break block6;
                                    if (n11 != 2 || n10 > n4 || !xmlPullParser.getName().equals((Object)"item")) break block7;
                                    typedArray = a.a(resources, theme, attributeSet, c.ColorStateListItem);
                                    n6 = typedArray.getColor(c.ColorStateListItem_android_color, -65281);
                                    f2 = 1.0f;
                                    if (!typedArray.hasValue(c.ColorStateListItem_android_alpha)) break block8;
                                    n9 = c.ColorStateListItem_android_alpha;
                                    break block9;
                                }
                                if (!typedArray.hasValue(c.ColorStateListItem_alpha)) break block10;
                                n9 = c.ColorStateListItem_alpha;
                            }
                            f2 = typedArray.getFloat(n9, f2);
                        }
                        typedArray.recycle();
                        n7 = attributeSet.getAttributeCount();
                        arrn2 = new int[n7];
                        n8 = 0;
                        break block11;
                    }
                    int[] arrn3 = new int[n5];
                    int[][] arrarrn2 = new int[n5][];
                    System.arraycopy((Object)arrn, (int)0, (Object)arrn3, (int)0, (int)n5);
                    System.arraycopy((Object)arrarrn, (int)0, (Object)arrarrn2, (int)0, (int)n5);
                    return new ColorStateList((int[][])arrarrn2, arrn3);
                }
                for (int i2 = 0; i2 < n7; ++i2) {
                    int n12 = attributeSet.getAttributeNameResource(i2);
                    if (n12 == 16843173 || n12 == 16843551 || n12 == e.e.a.alpha) continue;
                    int n13 = n8 + 1;
                    if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                        n12 = -n12;
                    }
                    arrn2[n8] = n12;
                    n8 = n13;
                }
                int[] arrn4 = StateSet.trimStateSet((int[])arrn2, (int)n8);
                arrn = e.a(arrn, n5, a.a(n6, f2));
                arrarrn = e.a(arrarrn, n5, arrn4);
                ++n5;
            }
            n3 = 1;
        } while (true);
    }
}

