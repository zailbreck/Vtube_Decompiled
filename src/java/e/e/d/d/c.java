/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.content.res.TypedArray
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.util.Base64
 *  android.util.TypedValue
 *  android.util.Xml
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.List
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
package e.e.d.d;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.TypedValue;
import android.util.Xml;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class c {
    private static int a(TypedArray typedArray, int n2) {
        if (Build.VERSION.SDK_INT >= 21) {
            return typedArray.getType(n2);
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(n2, typedValue);
        return typedValue.type;
    }

    public static a a(XmlPullParser xmlPullParser, Resources resources) {
        XmlPullParserException xmlPullParserException;
        int n2;
        while ((n2 = xmlPullParser.next()) != 2 && n2 != 1) {
        }
        if (n2 == 2) {
            return c.b(xmlPullParser, resources);
        }
        xmlPullParserException = new XmlPullParserException("No start tag found");
        throw xmlPullParserException;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static List<List<byte[]>> a(Resources var0_1, int var1) {
        block10 : {
            block9 : {
                if (var1 == 0) {
                    return Collections.emptyList();
                }
                var2_2 = var0_1.obtainTypedArray(var1);
                try {
                    if (var2_2.length() != 0) break block9;
                    var9_3 = Collections.emptyList();
                }
                catch (Throwable var3_7) {
                    var2_2.recycle();
                    throw var3_7;
                }
                var2_2.recycle();
                return var9_3;
            }
            var4_4 = new ArrayList();
            if (c.a(var2_2, 0) == 1) {
                var5_5 = 0;
                break block10;
            }
            var4_4.add(c.a(var0_1.getStringArray(var1)));
            ** GOTO lbl-1000
        }
        do {
            if (var5_5 < var2_2.length()) {
                var6_6 = var2_2.getResourceId(var5_5, 0);
                if (var6_6 != 0) {
                    var4_4.add(c.a(var0_1.getStringArray(var6_6)));
                }
            } else lbl-1000: // 2 sources:
            {
                var2_2.recycle();
                return var4_4;
            }
            ++var5_5;
        } while (true);
    }

    private static List<byte[]> a(String[] arrstring) {
        ArrayList arrayList = new ArrayList();
        int n2 = arrstring.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            arrayList.add((Object)Base64.decode((String)arrstring[i2], (int)0));
        }
        return arrayList;
    }

    private static void a(XmlPullParser xmlPullParser) {
        int n2 = 1;
        while (n2 > 0) {
            int n3 = xmlPullParser.next();
            if (n3 != 2) {
                if (n3 != 3) continue;
                --n2;
                continue;
            }
            ++n2;
        }
    }

    private static a b(XmlPullParser xmlPullParser, Resources resources) {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals((Object)"font-family")) {
            return c.c(xmlPullParser, resources);
        }
        c.a(xmlPullParser);
        return null;
    }

    private static a c(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray typedArray = resources.obtainAttributes(Xml.asAttributeSet((XmlPullParser)xmlPullParser), e.e.c.FontFamily);
        String string = typedArray.getString(e.e.c.FontFamily_fontProviderAuthority);
        String string2 = typedArray.getString(e.e.c.FontFamily_fontProviderPackage);
        String string3 = typedArray.getString(e.e.c.FontFamily_fontProviderQuery);
        int n2 = typedArray.getResourceId(e.e.c.FontFamily_fontProviderCerts, 0);
        int n3 = typedArray.getInteger(e.e.c.FontFamily_fontProviderFetchStrategy, 1);
        int n4 = typedArray.getInteger(e.e.c.FontFamily_fontProviderFetchTimeout, 500);
        typedArray.recycle();
        if (string != null && string2 != null && string3 != null) {
            while (xmlPullParser.next() != 3) {
                c.a(xmlPullParser);
            }
            return new a(new e.e.h.a(string, string2, string3, c.a(resources, n2)), n3, n4){
                private final e.e.h.a a;
                private final int b;
                private final int c;
                {
                    this.a = a2;
                    this.c = n2;
                    this.b = n3;
                }

                public int a() {
                    return this.c;
                }

                public e.e.h.a b() {
                    return this.a;
                }

                public int c() {
                    return this.b;
                }
            };
        }
        ArrayList arrayList = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() != 2) continue;
            if (xmlPullParser.getName().equals((Object)"font")) {
                arrayList.add((Object)c.d(xmlPullParser, resources));
                continue;
            }
            c.a(xmlPullParser);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new a((c[])arrayList.toArray((Object[])new c[arrayList.size()])){
            private final c[] a;
            {
                this.a = arrc;
            }

            public c[] a() {
                return this.a;
            }
        };
    }

    private static c d(XmlPullParser xmlPullParser, Resources resources) {
        TypedArray typedArray = resources.obtainAttributes(Xml.asAttributeSet((XmlPullParser)xmlPullParser), e.e.c.FontFamilyFont);
        int n2 = typedArray.hasValue(e.e.c.FontFamilyFont_fontWeight) ? e.e.c.FontFamilyFont_fontWeight : e.e.c.FontFamilyFont_android_fontWeight;
        int n3 = typedArray.getInt(n2, 400);
        int n4 = typedArray.hasValue(e.e.c.FontFamilyFont_fontStyle) ? e.e.c.FontFamilyFont_fontStyle : e.e.c.FontFamilyFont_android_fontStyle;
        boolean bl = 1 == typedArray.getInt(n4, 0);
        int n5 = typedArray.hasValue(e.e.c.FontFamilyFont_ttcIndex) ? e.e.c.FontFamilyFont_ttcIndex : e.e.c.FontFamilyFont_android_ttcIndex;
        int n6 = typedArray.hasValue(e.e.c.FontFamilyFont_fontVariationSettings) ? e.e.c.FontFamilyFont_fontVariationSettings : e.e.c.FontFamilyFont_android_fontVariationSettings;
        String string = typedArray.getString(n6);
        int n7 = typedArray.getInt(n5, 0);
        int n8 = typedArray.hasValue(e.e.c.FontFamilyFont_font) ? e.e.c.FontFamilyFont_font : e.e.c.FontFamilyFont_android_font;
        int n9 = typedArray.getResourceId(n8, 0);
        String string2 = typedArray.getString(n8);
        typedArray.recycle();
        while (xmlPullParser.next() != 3) {
            c.a(xmlPullParser);
        }
        c c2 = new c(string2, n3, bl, string, n7, n9);
        return c2;
    }

    public static interface a {
    }

    public static final class c {
        private final String a;
        private int b;
        private boolean c;
        private String d;
        private int e;
        private int f;

        public c(String string, int n2, boolean bl, String string2, int n3, int n4) {
            this.a = string;
            this.b = n2;
            this.c = bl;
            this.d = string2;
            this.e = n3;
            this.f = n4;
        }

        public String a() {
            return this.a;
        }

        public int b() {
            return this.f;
        }

        public int c() {
            return this.e;
        }

        public String d() {
            return this.d;
        }

        public int e() {
            return this.b;
        }

        public boolean f() {
            return this.c;
        }
    }

}

