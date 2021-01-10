/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.graphics.LinearGradient
 *  android.graphics.RadialGradient
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 *  android.graphics.SweepGradient
 *  android.util.AttributeSet
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.List
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
package e.e.d.d;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import e.e.c;
import e.e.d.d.g;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

final class d {
    private static Shader.TileMode a(int n2) {
        if (n2 != 1) {
            if (n2 != 2) {
                return Shader.TileMode.CLAMP;
            }
            return Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.REPEAT;
    }

    static Shader a(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String string = xmlPullParser.getName();
        if (string.equals((Object)"gradient")) {
            TypedArray typedArray = g.a(resources, theme, attributeSet, c.GradientColor);
            float f2 = g.a(typedArray, xmlPullParser, "startX", c.GradientColor_android_startX, 0.0f);
            float f3 = g.a(typedArray, xmlPullParser, "startY", c.GradientColor_android_startY, 0.0f);
            float f4 = g.a(typedArray, xmlPullParser, "endX", c.GradientColor_android_endX, 0.0f);
            float f5 = g.a(typedArray, xmlPullParser, "endY", c.GradientColor_android_endY, 0.0f);
            float f6 = g.a(typedArray, xmlPullParser, "centerX", c.GradientColor_android_centerX, 0.0f);
            float f7 = g.a(typedArray, xmlPullParser, "centerY", c.GradientColor_android_centerY, 0.0f);
            int n2 = g.b(typedArray, xmlPullParser, "type", c.GradientColor_android_type, 0);
            int n3 = g.a(typedArray, xmlPullParser, "startColor", c.GradientColor_android_startColor, 0);
            boolean bl = g.a(xmlPullParser, "centerColor");
            int n4 = g.a(typedArray, xmlPullParser, "centerColor", c.GradientColor_android_centerColor, 0);
            int n5 = g.a(typedArray, xmlPullParser, "endColor", c.GradientColor_android_endColor, 0);
            int n6 = g.b(typedArray, xmlPullParser, "tileMode", c.GradientColor_android_tileMode, 0);
            float f8 = g.a(typedArray, xmlPullParser, "gradientRadius", c.GradientColor_android_gradientRadius, 0.0f);
            typedArray.recycle();
            a a2 = d.a(d.b(resources, xmlPullParser, attributeSet, theme), n3, n5, bl, n4);
            if (n2 != 1) {
                if (n2 != 2) {
                    LinearGradient linearGradient = new LinearGradient(f2, f3, f4, f5, a2.a, a2.b, d.a(n6));
                    return linearGradient;
                }
                return new SweepGradient(f6, f7, a2.a, a2.b);
            }
            if (!(f8 <= 0.0f)) {
                RadialGradient radialGradient = new RadialGradient(f6, f7, f8, a2.a, a2.b, d.a(n6));
                return radialGradient;
            }
            throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(xmlPullParser.getPositionDescription());
        stringBuilder.append(": invalid gradient color tag ");
        stringBuilder.append(string);
        throw new XmlPullParserException(stringBuilder.toString());
    }

    /*
     * Exception decompiling
     */
    private static a a(a var0, int var1, int var2, boolean var3, int var4) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // java.lang.IllegalStateException: Invisible function parameters on a non-constructor (or reads of uninitialised local variables).
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1560)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1816)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:332)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1133)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:607)
        // java.lang.Thread.run(Thread.java:761)
        throw new IllegalStateException("Decompilation failed");
    }

    private static a b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int n2;
        int n3;
        int n4 = 1 + xmlPullParser.getDepth();
        ArrayList arrayList = new ArrayList(20);
        ArrayList arrayList2 = new ArrayList(20);
        while ((n3 = xmlPullParser.next()) != 1 && ((n2 = xmlPullParser.getDepth()) >= n4 || n3 != 3)) {
            if (n3 != 2 || n2 > n4 || !xmlPullParser.getName().equals((Object)"item")) continue;
            TypedArray typedArray = g.a(resources, theme, attributeSet, c.GradientColorItem);
            boolean bl = typedArray.hasValue(c.GradientColorItem_android_color);
            boolean bl2 = typedArray.hasValue(c.GradientColorItem_android_offset);
            if (bl && bl2) {
                int n5 = typedArray.getColor(c.GradientColorItem_android_color, 0);
                float f2 = typedArray.getFloat(c.GradientColorItem_android_offset, 0.0f);
                typedArray.recycle();
                arrayList2.add((Object)n5);
                arrayList.add((Object)Float.valueOf((float)f2));
                continue;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(xmlPullParser.getPositionDescription());
            stringBuilder.append(": <item> tag requires a 'color' attribute and a 'offset' attribute!");
            throw new XmlPullParserException(stringBuilder.toString());
        }
        if (arrayList2.size() > 0) {
            return new a((List<Integer>)arrayList2, (List<Float>)arrayList);
        }
        return null;
    }

    static final class a {
        final int[] a;
        final float[] b;

        a(int n2, int n3) {
            this.a = new int[]{n2, n3};
            this.b = new float[]{0.0f, 1.0f};
        }

        a(int n2, int n3, int n4) {
            this.a = new int[]{n2, n3, n4};
            this.b = new float[]{0.0f, 0.5f, 1.0f};
        }

        a(List<Integer> list, List<Float> list2) {
            int n2 = list.size();
            this.a = new int[n2];
            this.b = new float[n2];
            for (int i2 = 0; i2 < n2; ++i2) {
                this.a[i2] = (Integer)list.get(i2);
                this.b[i2] = ((Float)list2.get(i2)).floatValue();
            }
        }
    }

}

