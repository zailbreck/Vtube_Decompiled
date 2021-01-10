/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.graphics.Path
 *  android.graphics.PathMeasure
 *  android.util.AttributeSet
 *  android.view.InflateException
 *  android.view.animation.Interpolator
 *  e.e.d.d.g
 *  e.e.e.b
 *  e.m.a.a.a
 *  java.lang.IllegalArgumentException
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  org.xmlpull.v1.XmlPullParser
 */
package e.m.a.a;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.util.AttributeSet;
import android.view.InflateException;
import android.view.animation.Interpolator;
import e.e.e.b;
import e.m.a.a.a;
import org.xmlpull.v1.XmlPullParser;

public class g
implements Interpolator {
    private float[] a;
    private float[] b;

    public g(Context context, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        super(context.getResources(), context.getTheme(), attributeSet, xmlPullParser);
    }

    public g(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray typedArray = e.e.d.d.g.a((Resources)resources, (Resources.Theme)theme, (AttributeSet)attributeSet, (int[])a.l);
        g.super.a(typedArray, xmlPullParser);
        typedArray.recycle();
    }

    private void a(float f2, float f3) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.quadTo(f2, f3, 1.0f, 1.0f);
        g.super.a(path);
    }

    private void a(float f2, float f3, float f4, float f5) {
        Path path = new Path();
        path.moveTo(0.0f, 0.0f);
        path.cubicTo(f2, f3, f4, f5, 1.0f, 1.0f);
        g.super.a(path);
    }

    private void a(TypedArray typedArray, XmlPullParser xmlPullParser) {
        if (e.e.d.d.g.a((XmlPullParser)xmlPullParser, (String)"pathData")) {
            String string = e.e.d.d.g.a((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (String)"pathData", (int)4);
            Path path = b.b((String)string);
            if (path != null) {
                g.super.a(path);
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("The path is null, which is created from ");
            stringBuilder.append(string);
            throw new InflateException(stringBuilder.toString());
        }
        if (e.e.d.d.g.a((XmlPullParser)xmlPullParser, (String)"controlX1")) {
            if (e.e.d.d.g.a((XmlPullParser)xmlPullParser, (String)"controlY1")) {
                float f2 = e.e.d.d.g.a((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (String)"controlX1", (int)0, (float)0.0f);
                float f3 = e.e.d.d.g.a((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (String)"controlY1", (int)1, (float)0.0f);
                boolean bl = e.e.d.d.g.a((XmlPullParser)xmlPullParser, (String)"controlX2");
                if (bl == e.e.d.d.g.a((XmlPullParser)xmlPullParser, (String)"controlY2")) {
                    if (!bl) {
                        g.super.a(f2, f3);
                        return;
                    }
                    g.super.a(f2, f3, e.e.d.d.g.a((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (String)"controlX2", (int)2, (float)0.0f), e.e.d.d.g.a((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (String)"controlY2", (int)3, (float)0.0f));
                    return;
                }
                throw new InflateException("pathInterpolator requires both controlX2 and controlY2 for cubic Beziers.");
            }
            throw new InflateException("pathInterpolator requires the controlY1 attribute");
        }
        throw new InflateException("pathInterpolator requires the controlX1 attribute");
    }

    private void a(Path path) {
        IllegalArgumentException illegalArgumentException;
        int n2 = 0;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float f2 = pathMeasure.getLength();
        int n3 = Math.min((int)3000, (int)(1 + (int)(f2 / 0.002f)));
        if (n3 > 0) {
            float[] arrf;
            int n4;
            this.a = new float[n3];
            this.b = new float[n3];
            float[] arrf2 = new float[2];
            for (int i2 = 0; i2 < n3; ++i2) {
                pathMeasure.getPosTan(f2 * (float)i2 / (float)(n3 - 1), arrf2, null);
                this.a[i2] = arrf2[0];
                this.b[i2] = arrf2[1];
            }
            if (!((double)Math.abs((float)this.a[0]) > 1.0E-5 || (double)Math.abs((float)this.b[0]) > 1.0E-5 || (double)Math.abs((float)((arrf = this.a)[n4 = n3 - 1] - 1.0f)) > 1.0E-5 || (double)Math.abs((float)(this.b[n4] - 1.0f)) > 1.0E-5)) {
                int n5 = 0;
                float f3 = 0.0f;
                while (n2 < n3) {
                    float[] arrf3 = this.a;
                    int n6 = n5 + 1;
                    float f4 = arrf3[n5];
                    if (!(f4 < f3)) {
                        arrf3[n2] = f4;
                        ++n2;
                        f3 = f4;
                        n5 = n6;
                        continue;
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("The Path cannot loop back on itself, x :");
                    stringBuilder.append(f4);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                if (!pathMeasure.nextContour()) {
                    return;
                }
                throw new IllegalArgumentException("The Path should be continuous, can't have 2+ contours");
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("The Path must start at (0,0) and end at (1,1) start: ");
            stringBuilder.append(this.a[0]);
            stringBuilder.append(",");
            stringBuilder.append(this.b[0]);
            stringBuilder.append(" end:");
            float[] arrf4 = this.a;
            int n7 = n3 - 1;
            stringBuilder.append(arrf4[n7]);
            stringBuilder.append(",");
            stringBuilder.append(this.b[n7]);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("The Path has a invalid length ");
        stringBuilder.append(f2);
        illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
        throw illegalArgumentException;
    }

    public float getInterpolation(float f2) {
        if (f2 <= 0.0f) {
            return 0.0f;
        }
        if (f2 >= 1.0f) {
            return 1.0f;
        }
        int n2 = 0;
        int n3 = this.a.length - 1;
        while (n3 - n2 > 1) {
            int n4 = (n2 + n3) / 2;
            if (f2 < this.a[n4]) {
                n3 = n4;
                continue;
            }
            n2 = n4;
        }
        float[] arrf = this.a;
        float f3 = arrf[n3] - arrf[n2];
        if (f3 == 0.0f) {
            return this.b[n2];
        }
        float f4 = (f2 - arrf[n2]) / f3;
        float[] arrf2 = this.b;
        float f5 = arrf2[n2];
        return f5 + f4 * (arrf2[n3] - f5);
    }
}

