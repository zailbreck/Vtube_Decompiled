/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorInflater
 *  android.animation.AnimatorSet
 *  android.animation.Keyframe
 *  android.animation.ObjectAnimator
 *  android.animation.PropertyValuesHolder
 *  android.animation.TimeInterpolator
 *  android.animation.TypeEvaluator
 *  android.animation.ValueAnimator
 *  android.content.Context
 *  android.content.res.Resources
 *  android.content.res.Resources$Theme
 *  android.content.res.TypedArray
 *  android.graphics.Path
 *  android.graphics.PathMeasure
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.AttributeSet
 *  android.util.TypedValue
 *  android.util.Xml
 *  android.view.InflateException
 *  e.e.d.d.g
 *  e.e.e.b
 *  e.e.e.b$b
 *  e.m.a.a.a
 *  java.lang.Class
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  org.xmlpull.v1.XmlPullParser
 */
package e.m.a.a;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.Keyframe;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.animation.TypeEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Build;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import android.view.InflateException;
import e.e.d.d.g;
import e.e.e.b;
import e.m.a.a.d;
import e.m.a.a.f;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

public class e {
    private static int a(Resources resources, Resources.Theme theme, AttributeSet attributeSet, XmlPullParser xmlPullParser) {
        TypedArray typedArray = g.a((Resources)resources, (Resources.Theme)theme, (AttributeSet)attributeSet, (int[])e.m.a.a.a.j);
        TypedValue typedValue = g.b((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (String)"value", (int)0);
        boolean bl = typedValue != null;
        int n2 = 0;
        if (bl) {
            boolean bl2 = e.a(typedValue.type);
            n2 = 0;
            if (bl2) {
                n2 = 3;
            }
        }
        typedArray.recycle();
        return n2;
    }

    private static int a(TypedArray typedArray, int n2, int n3) {
        int n4;
        block5 : {
            block4 : {
                TypedValue typedValue = typedArray.peekValue(n2);
                boolean bl = true;
                boolean bl2 = typedValue != null;
                int n5 = bl2 ? typedValue.type : 0;
                TypedValue typedValue2 = typedArray.peekValue(n3);
                if (typedValue2 == null) {
                    bl = false;
                }
                int n6 = bl ? typedValue2.type : 0;
                if (bl2 && e.a(n5)) break block4;
                n4 = 0;
                if (!bl) break block5;
                boolean bl3 = e.a(n6);
                n4 = 0;
                if (!bl3) break block5;
            }
            n4 = 3;
        }
        return n4;
    }

    public static Animator a(Context context, int n2) {
        if (Build.VERSION.SDK_INT >= 24) {
            return AnimatorInflater.loadAnimator((Context)context, (int)n2);
        }
        return e.a(context, context.getResources(), context.getTheme(), n2);
    }

    public static Animator a(Context context, Resources resources, Resources.Theme theme, int n2) {
        return e.a(context, resources, theme, n2, 1.0f);
    }

    /*
     * Exception decompiling
     */
    public static Animator a(Context var0_2, Resources var1_1, Resources.Theme var2_4, int var3_3, float var4) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Tried to end blocks [3[CATCHBLOCK]], but top level block is 1[TRYBLOCK]
        // org.benf.cfr.reader.b.a.a.j.a(Op04StructuredStatement.java:432)
        // org.benf.cfr.reader.b.a.a.j.d(Op04StructuredStatement.java:484)
        // org.benf.cfr.reader.b.a.a.i.a(Op03SimpleStatement.java:607)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:692)
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

    private static Animator a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, float f2) {
        return e.a(context, resources, theme, xmlPullParser, Xml.asAttributeSet((XmlPullParser)xmlPullParser), null, 0, f2);
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static Animator a(Context var0, Resources var1_4, Resources.Theme var2_7, XmlPullParser var3_2, AttributeSet var4_3, AnimatorSet var5_1, int var6_6, float var7_5) {
        var8_8 = var3_2.getDepth();
        var9_9 = null;
        var10_10 = null;
        do {
            block10 : {
                var11_11 = var3_2.next();
                var12_16 = 0;
                if (var11_11 == 3 && var3_2.getDepth() <= var8_8 || var11_11 == 1) break;
                if (var11_11 != 2) continue;
                var17_15 = var3_2.getName();
                if (!var17_15.equals((Object)"objectAnimator")) break block10;
                var9_9 = e.a(var0, var1_4, var2_7, var4_3, var7_5, var3_2);
                ** GOTO lbl16
            }
            if (var17_15.equals((Object)"animator")) {
                var9_9 = e.a(var0, var1_4, var2_7, var4_3, null, var7_5, var3_2);
lbl16: // 2 sources:
                var21_17 = false;
            } else if (var17_15.equals((Object)"set")) {
                var18_13 = new AnimatorSet();
                var19_12 = g.a((Resources)var1_4, (Resources.Theme)var2_7, (AttributeSet)var4_3, (int[])e.m.a.a.a.h);
                e.a(var0, var1_4, var2_7, var3_2, var4_3, var18_13, g.b((TypedArray)var19_12, (XmlPullParser)var3_2, (String)"ordering", (int)0, (int)0), var7_5);
                var19_12.recycle();
                var9_9 = var18_13;
                var21_17 = false;
            } else {
                if (!var17_15.equals((Object)"propertyValuesHolder")) {
                    var23_18 = new StringBuilder();
                    var23_18.append("Unknown animator name: ");
                    var23_18.append(var3_2.getName());
                    throw new RuntimeException(var23_18.toString());
                }
                var26_14 = e.a(var0, var1_4, var2_7, var3_2, Xml.asAttributeSet((XmlPullParser)var3_2));
                if (var26_14 != null && var9_9 instanceof ValueAnimator) {
                    ((ValueAnimator)var9_9).setValues(var26_14);
                }
                var21_17 = true;
            }
            if (var5_1 == null || var21_17) continue;
            if (var10_10 == null) {
                var10_10 = new ArrayList();
            }
            var10_10.add((Object)var9_9);
        } while (true);
        if (var5_1 == null) return var9_9;
        if (var10_10 == null) return var9_9;
        var13_19 = new Animator[var10_10.size()];
        for (Animator var15_21 : var10_10) {
            var16_22 = var12_16 + 1;
            var13_19[var12_16] = var15_21;
            var12_16 = var16_22;
        }
        if (var6_6 == 0) {
            var5_1.playTogether(var13_19);
            return var9_9;
        }
        var5_1.playSequentially(var13_19);
        return var9_9;
    }

    private static Keyframe a(Keyframe keyframe, float f2) {
        if (keyframe.getType() == Float.TYPE) {
            return Keyframe.ofFloat((float)f2);
        }
        if (keyframe.getType() == Integer.TYPE) {
            return Keyframe.ofInt((float)f2);
        }
        return Keyframe.ofObject((float)f2);
    }

    private static Keyframe a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, int n2, XmlPullParser xmlPullParser) {
        TypedArray typedArray = g.a((Resources)resources, (Resources.Theme)theme, (AttributeSet)attributeSet, (int[])e.m.a.a.a.j);
        float f2 = g.a((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (String)"fraction", (int)3, (float)-1.0f);
        TypedValue typedValue = g.b((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (String)"value", (int)0);
        boolean bl = typedValue != null;
        if (n2 == 4) {
            n2 = bl && e.a(typedValue.type) ? 3 : 0;
        }
        Object object = bl ? (n2 != 0 ? (n2 != 1 && n2 != 3 ? null : Keyframe.ofInt((float)f2, (int)g.b((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (String)"value", (int)0, (int)0))) : Keyframe.ofFloat((float)f2, (float)g.a((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (String)"value", (int)0, (float)0.0f))) : (n2 == 0 ? Keyframe.ofFloat((float)f2) : Keyframe.ofInt((float)f2));
        int n3 = g.c((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (String)"interpolator", (int)1, (int)0);
        if (n3 > 0) {
            object.setInterpolator((TimeInterpolator)d.a(context, n3));
        }
        typedArray.recycle();
        return object;
    }

    private static ObjectAnimator a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, float f2, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = new ObjectAnimator();
        e.a(context, resources, theme, attributeSet, (ValueAnimator)objectAnimator, f2, xmlPullParser);
        return objectAnimator;
    }

    private static PropertyValuesHolder a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, String string, int n2) {
        int n3;
        int n4 = n2;
        ArrayList arrayList = null;
        while ((n3 = xmlPullParser.next()) != 3 && n3 != 1) {
            Keyframe keyframe;
            if (!xmlPullParser.getName().equals((Object)"keyframe")) continue;
            if (n4 == 4) {
                n4 = e.a(resources, theme, Xml.asAttributeSet((XmlPullParser)xmlPullParser), xmlPullParser);
            }
            if ((keyframe = e.a(context, resources, theme, Xml.asAttributeSet((XmlPullParser)xmlPullParser), n4, xmlPullParser)) != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add((Object)keyframe);
            }
            xmlPullParser.next();
        }
        PropertyValuesHolder propertyValuesHolder = null;
        if (arrayList != null) {
            int n5 = arrayList.size();
            propertyValuesHolder = null;
            if (n5 > 0) {
                float f2;
                int n6 = 0;
                Keyframe keyframe = (Keyframe)arrayList.get(0);
                Keyframe keyframe2 = (Keyframe)arrayList.get(n5 - 1);
                float f3 = keyframe2.getFraction();
                if (f3 < 1.0f) {
                    if (f3 < 0.0f) {
                        keyframe2.setFraction(1.0f);
                    } else {
                        arrayList.add(arrayList.size(), (Object)e.a(keyframe2, 1.0f));
                        ++n5;
                    }
                }
                if ((f2 = keyframe.getFraction()) != 0.0f) {
                    if (f2 < 0.0f) {
                        keyframe.setFraction(0.0f);
                    } else {
                        arrayList.add(0, (Object)e.a(keyframe, 0.0f));
                        ++n5;
                    }
                }
                Object[] arrobject = new Keyframe[n5];
                arrayList.toArray(arrobject);
                while (n6 < n5) {
                    Object object = arrobject[n6];
                    if (object.getFraction() < 0.0f) {
                        if (n6 == 0) {
                            object.setFraction(0.0f);
                        } else {
                            int n7 = n5 - 1;
                            if (n6 == n7) {
                                object.setFraction(1.0f);
                            } else {
                                int n8 = n6 + 1;
                                int n9 = n6;
                                while (n8 < n7 && !(arrobject[n8].getFraction() >= 0.0f)) {
                                    int n10 = n8 + 1;
                                    n9 = n8;
                                    n8 = n10;
                                }
                                e.a((Keyframe[])arrobject, arrobject[n9 + 1].getFraction() - arrobject[n6 - 1].getFraction(), n6, n9);
                            }
                        }
                    }
                    ++n6;
                }
                propertyValuesHolder = PropertyValuesHolder.ofKeyframe((String)string, (Keyframe[])arrobject);
                if (n4 == 3) {
                    propertyValuesHolder.setEvaluator((TypeEvaluator)f.a());
                }
            }
        }
        return propertyValuesHolder;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static PropertyValuesHolder a(TypedArray typedArray, int n2, int n3, int n4, String string) {
        PropertyValuesHolder propertyValuesHolder;
        TypedValue typedValue = typedArray.peekValue(n3);
        boolean bl = typedValue != null;
        int n5 = bl ? typedValue.type : 0;
        TypedValue typedValue2 = typedArray.peekValue(n4);
        boolean bl2 = typedValue2 != null;
        int n6 = bl2 ? typedValue2.type : 0;
        if (n2 == 4) {
            n2 = bl && e.a(n5) || bl2 && e.a(n6) ? 3 : 0;
        }
        boolean bl3 = n2 == 0;
        if (n2 == 2) {
            String string2 = typedArray.getString(n3);
            String string3 = typedArray.getString(n4);
            b.b[] arrb = b.a((String)string2);
            b.b[] arrb2 = b.a((String)string3);
            if (arrb == null) {
                propertyValuesHolder = null;
                if (arrb2 == null) return propertyValuesHolder;
            }
            if (arrb != null) {
                a a2 = new a();
                if (arrb2 == null) return PropertyValuesHolder.ofObject((String)string, (TypeEvaluator)a2, (Object[])new Object[]{arrb});
                if (b.a((b.b[])arrb, (b.b[])arrb2)) {
                    return PropertyValuesHolder.ofObject((String)string, (TypeEvaluator)a2, (Object[])new Object[]{arrb, arrb2});
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(" Can't morph from ");
                stringBuilder.append(string2);
                stringBuilder.append(" to ");
                stringBuilder.append(string3);
                throw new InflateException(stringBuilder.toString());
            }
            propertyValuesHolder = null;
            if (arrb2 == null) return propertyValuesHolder;
            return PropertyValuesHolder.ofObject((String)string, (TypeEvaluator)new a(), (Object[])new Object[]{arrb2});
        }
        f f2 = n2 == 3 ? f.a() : null;
        if (bl3) {
            PropertyValuesHolder propertyValuesHolder2;
            if (bl) {
                float f3 = n5 == 5 ? typedArray.getDimension(n3, 0.0f) : typedArray.getFloat(n3, 0.0f);
                if (bl2) {
                    float f4 = n6 == 5 ? typedArray.getDimension(n4, 0.0f) : typedArray.getFloat(n4, 0.0f);
                    propertyValuesHolder2 = PropertyValuesHolder.ofFloat((String)string, (float[])new float[]{f3, f4});
                } else {
                    propertyValuesHolder2 = PropertyValuesHolder.ofFloat((String)string, (float[])new float[]{f3});
                }
            } else {
                float f5 = n6 == 5 ? typedArray.getDimension(n4, 0.0f) : typedArray.getFloat(n4, 0.0f);
                propertyValuesHolder2 = PropertyValuesHolder.ofFloat((String)string, (float[])new float[]{f5});
            }
            propertyValuesHolder = propertyValuesHolder2;
        } else if (bl) {
            int n7 = n5 == 5 ? (int)typedArray.getDimension(n3, 0.0f) : (e.a(n5) ? typedArray.getColor(n3, 0) : typedArray.getInt(n3, 0));
            if (bl2) {
                int n8 = n6 == 5 ? (int)typedArray.getDimension(n4, 0.0f) : (e.a(n6) ? typedArray.getColor(n4, 0) : typedArray.getInt(n4, 0));
                propertyValuesHolder = PropertyValuesHolder.ofInt((String)string, (int[])new int[]{n7, n8});
            } else {
                propertyValuesHolder = PropertyValuesHolder.ofInt((String)string, (int[])new int[]{n7});
            }
        } else {
            propertyValuesHolder = null;
            if (bl2) {
                int n9 = n6 == 5 ? (int)typedArray.getDimension(n4, 0.0f) : (e.a(n6) ? typedArray.getColor(n4, 0) : typedArray.getInt(n4, 0));
                propertyValuesHolder = PropertyValuesHolder.ofInt((String)string, (int[])new int[]{n9});
            }
        }
        if (propertyValuesHolder == null) return propertyValuesHolder;
        if (f2 == null) return propertyValuesHolder;
        propertyValuesHolder.setEvaluator((TypeEvaluator)f2);
        return propertyValuesHolder;
    }

    private static ValueAnimator a(Context context, Resources resources, Resources.Theme theme, AttributeSet attributeSet, ValueAnimator valueAnimator, float f2, XmlPullParser xmlPullParser) {
        TypedArray typedArray = g.a((Resources)resources, (Resources.Theme)theme, (AttributeSet)attributeSet, (int[])e.m.a.a.a.g);
        TypedArray typedArray2 = g.a((Resources)resources, (Resources.Theme)theme, (AttributeSet)attributeSet, (int[])e.m.a.a.a.k);
        if (valueAnimator == null) {
            valueAnimator = new ValueAnimator();
        }
        e.a(valueAnimator, typedArray, typedArray2, f2, xmlPullParser);
        int n2 = g.c((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (String)"interpolator", (int)0, (int)0);
        if (n2 > 0) {
            valueAnimator.setInterpolator((TimeInterpolator)d.a(context, n2));
        }
        typedArray.recycle();
        if (typedArray2 != null) {
            typedArray2.recycle();
        }
        return valueAnimator;
    }

    private static void a(ValueAnimator valueAnimator, TypedArray typedArray, int n2, float f2, XmlPullParser xmlPullParser) {
        ObjectAnimator objectAnimator = (ObjectAnimator)valueAnimator;
        String string = g.a((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (String)"pathData", (int)1);
        if (string != null) {
            String string2 = g.a((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (String)"propertyXName", (int)2);
            String string3 = g.a((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (String)"propertyYName", (int)3);
            if (n2 != 2) {
                // empty if block
            }
            if (string2 == null && string3 == null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(typedArray.getPositionDescription());
                stringBuilder.append(" propertyXName or propertyYName is needed for PathData");
                throw new InflateException(stringBuilder.toString());
            }
            e.a(b.b((String)string), objectAnimator, f2 * 0.5f, string2, string3);
            return;
        }
        objectAnimator.setPropertyName(g.a((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (String)"propertyName", (int)0));
    }

    private static void a(ValueAnimator valueAnimator, TypedArray typedArray, TypedArray typedArray2, float f2, XmlPullParser xmlPullParser) {
        long l2 = g.b((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (String)"duration", (int)1, (int)300);
        long l3 = g.b((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (String)"startOffset", (int)2, (int)0);
        int n2 = g.b((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (String)"valueType", (int)7, (int)4);
        if (g.a((XmlPullParser)xmlPullParser, (String)"valueFrom") && g.a((XmlPullParser)xmlPullParser, (String)"valueTo")) {
            PropertyValuesHolder propertyValuesHolder;
            if (n2 == 4) {
                n2 = e.a(typedArray, 5, 6);
            }
            if ((propertyValuesHolder = e.a(typedArray, n2, 5, 6, "")) != null) {
                valueAnimator.setValues(new PropertyValuesHolder[]{propertyValuesHolder});
            }
        }
        valueAnimator.setDuration(l2);
        valueAnimator.setStartDelay(l3);
        valueAnimator.setRepeatCount(g.b((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (String)"repeatCount", (int)3, (int)0));
        valueAnimator.setRepeatMode(g.b((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (String)"repeatMode", (int)4, (int)1));
        if (typedArray2 != null) {
            e.a(valueAnimator, typedArray2, n2, f2, xmlPullParser);
        }
    }

    private static void a(Path path, ObjectAnimator objectAnimator, float f2, String string, String string2) {
        PathMeasure pathMeasure = new PathMeasure(path, false);
        ArrayList arrayList = new ArrayList();
        arrayList.add((Object)Float.valueOf((float)0.0f));
        float f3 = 0.0f;
        do {
            arrayList.add((Object)Float.valueOf((float)(f3 += pathMeasure.getLength())));
        } while (pathMeasure.nextContour());
        PathMeasure pathMeasure2 = new PathMeasure(path, false);
        int n2 = Math.min((int)100, (int)(1 + (int)(f3 / f2)));
        float[] arrf = new float[n2];
        float[] arrf2 = new float[n2];
        float[] arrf3 = new float[2];
        float f4 = f3 / (float)(n2 - 1);
        float f5 = 0.0f;
        int n3 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            pathMeasure2.getPosTan(f5 - ((Float)arrayList.get(n3)).floatValue(), arrf3, null);
            arrf[i2] = arrf3[0];
            arrf2[i2] = arrf3[1];
            f5 += f4;
            int n4 = n3 + 1;
            if (n4 >= arrayList.size() || !(f5 > ((Float)arrayList.get(n4)).floatValue())) continue;
            pathMeasure2.nextContour();
            n3 = n4;
        }
        PropertyValuesHolder propertyValuesHolder = string != null ? PropertyValuesHolder.ofFloat((String)string, (float[])arrf) : null;
        PropertyValuesHolder propertyValuesHolder2 = null;
        if (string2 != null) {
            propertyValuesHolder2 = PropertyValuesHolder.ofFloat((String)string2, (float[])arrf2);
        }
        if (propertyValuesHolder == null) {
            objectAnimator.setValues(new PropertyValuesHolder[]{propertyValuesHolder2});
            return;
        }
        if (propertyValuesHolder2 == null) {
            objectAnimator.setValues(new PropertyValuesHolder[]{propertyValuesHolder});
            return;
        }
        objectAnimator.setValues(new PropertyValuesHolder[]{propertyValuesHolder, propertyValuesHolder2});
    }

    private static void a(Keyframe[] arrkeyframe, float f2, int n2, int n3) {
        float f3 = f2 / (float)(2 + (n3 - n2));
        while (n2 <= n3) {
            arrkeyframe[n2].setFraction(f3 + arrkeyframe[n2 - 1].getFraction());
            ++n2;
        }
    }

    private static boolean a(int n2) {
        return n2 >= 28 && n2 <= 31;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static PropertyValuesHolder[] a(Context context, Resources resources, Resources.Theme theme, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        ArrayList arrayList = null;
        do {
            int n2 = xmlPullParser.getEventType();
            if (n2 == 3 || n2 == 1) break;
            if (n2 == 2 && xmlPullParser.getName().equals((Object)"propertyValuesHolder")) {
                int n3;
                TypedArray typedArray = g.a((Resources)resources, (Resources.Theme)theme, (AttributeSet)attributeSet, (int[])e.m.a.a.a.i);
                String string = g.a((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (String)"propertyName", (int)3);
                PropertyValuesHolder propertyValuesHolder = e.a(context, resources, theme, xmlPullParser, string, n3 = g.b((TypedArray)typedArray, (XmlPullParser)xmlPullParser, (String)"valueType", (int)2, (int)4));
                if (propertyValuesHolder == null) {
                    propertyValuesHolder = e.a(typedArray, n3, 0, 1, string);
                }
                if (propertyValuesHolder != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add((Object)propertyValuesHolder);
                }
                typedArray.recycle();
            }
            xmlPullParser.next();
        } while (true);
        PropertyValuesHolder[] arrpropertyValuesHolder = null;
        if (arrayList != null) {
            int n4 = arrayList.size();
            arrpropertyValuesHolder = new PropertyValuesHolder[n4];
            for (int i2 = 0; i2 < n4; ++i2) {
                arrpropertyValuesHolder[i2] = (PropertyValuesHolder)arrayList.get(i2);
            }
        }
        return arrpropertyValuesHolder;
    }

    private static class a
    implements TypeEvaluator<b.b[]> {
        private b.b[] a;

        a() {
        }

        public b.b[] a(float f2, b.b[] arrb, b.b[] arrb2) {
            IllegalArgumentException illegalArgumentException;
            if (b.a((b.b[])arrb, (b.b[])arrb2)) {
                if (!b.a((b.b[])this.a, (b.b[])arrb)) {
                    this.a = b.a((b.b[])arrb);
                }
                for (int i2 = 0; i2 < arrb.length; ++i2) {
                    this.a[i2].a(arrb[i2], arrb2[i2], f2);
                }
                return this.a;
            }
            illegalArgumentException = new IllegalArgumentException("Can't interpolate between two incompatible pathData");
            throw illegalArgumentException;
        }
    }

}

