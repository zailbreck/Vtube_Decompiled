/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.res.ColorStateList
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.XmlResourceParser
 *  android.graphics.Shader
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.util.Xml
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
package e.e.d.d;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import e.e.d.d.a;
import e.e.d.d.d;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class b {
    private final Shader a;
    private final ColorStateList b;
    private int c;

    private b(Shader shader, ColorStateList colorStateList, int n2) {
        this.a = shader;
        this.b = colorStateList;
        this.c = n2;
    }

    static b a(ColorStateList colorStateList) {
        return new b(null, colorStateList, colorStateList.getDefaultColor());
    }

    private static b a(Resources resources, int n2, Resources.Theme theme) {
        XmlPullParserException xmlPullParserException;
        int n3;
        XmlResourceParser xmlResourceParser = resources.getXml(n2);
        AttributeSet attributeSet = Xml.asAttributeSet((XmlPullParser)xmlResourceParser);
        while ((n3 = xmlResourceParser.next()) != 2 && n3 != 1) {
        }
        if (n3 == 2) {
            String string = xmlResourceParser.getName();
            int n4 = -1;
            int n5 = string.hashCode();
            if (n5 != 89650992) {
                if (n5 == 1191572447 && string.equals((Object)"selector")) {
                    n4 = 0;
                }
            } else if (string.equals((Object)"gradient")) {
                n4 = 1;
            }
            if (n4 != 0) {
                if (n4 == 1) {
                    return b.a(d.a(resources, (XmlPullParser)xmlResourceParser, attributeSet, theme));
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(xmlResourceParser.getPositionDescription());
                stringBuilder.append(": unsupported complex color tag ");
                stringBuilder.append(string);
                throw new XmlPullParserException(stringBuilder.toString());
            }
            return b.a(a.a(resources, (XmlPullParser)xmlResourceParser, attributeSet, theme));
        }
        xmlPullParserException = new XmlPullParserException("No start tag found");
        throw xmlPullParserException;
    }

    static b a(Shader shader) {
        return new b(shader, null, 0);
    }

    static b b(int n2) {
        return new b(null, null, n2);
    }

    public static b b(Resources resources, int n2, Resources.Theme theme) {
        try {
            b b2 = b.a(resources, n2, theme);
            return b2;
        }
        catch (Exception exception) {
            Log.e((String)"ComplexColorCompat", (String)"Failed to inflate ComplexColor.", (Throwable)exception);
            return null;
        }
    }

    public int a() {
        return this.c;
    }

    public void a(int n2) {
        this.c = n2;
    }

    public boolean a(int[] arrn) {
        int n2;
        ColorStateList colorStateList;
        if (this.d() && (n2 = (colorStateList = this.b).getColorForState(arrn, colorStateList.getDefaultColor())) != this.c) {
            this.c = n2;
            return true;
        }
        return false;
    }

    public Shader b() {
        return this.a;
    }

    public boolean c() {
        return this.a != null;
    }

    public boolean d() {
        ColorStateList colorStateList;
        return this.a == null && (colorStateList = this.b) != null && colorStateList.isStateful();
    }

    public boolean e() {
        return this.c() || this.c != 0;
        {
        }
    }
}

