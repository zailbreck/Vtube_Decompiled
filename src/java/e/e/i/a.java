/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.LocaleList
 *  android.text.PrecomputedText
 *  android.text.PrecomputedText$Params
 *  android.text.Spannable
 *  android.text.TextDirectionHeuristic
 *  android.text.TextDirectionHeuristics
 *  android.text.TextPaint
 *  android.text.TextUtils
 *  android.text.style.MetricAffectingSpan
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Locale
 */
package e.e.i;

import android.graphics.Typeface;
import android.os.Build;
import android.os.LocaleList;
import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.MetricAffectingSpan;
import e.e.j.c;
import java.util.Locale;

public class a
implements Spannable {
    private final Spannable b;
    private final a c;

    public a a() {
        return this.c;
    }

    public char charAt(int n2) {
        return this.b.charAt(n2);
    }

    public int getSpanEnd(Object object) {
        return this.b.getSpanEnd(object);
    }

    public int getSpanFlags(Object object) {
        return this.b.getSpanFlags(object);
    }

    public int getSpanStart(Object object) {
        return this.b.getSpanStart(object);
    }

    public <T> T[] getSpans(int n2, int n3, Class<T> class_) {
        return this.b.getSpans(n2, n3, class_);
    }

    public int length() {
        return this.b.length();
    }

    public int nextSpanTransition(int n2, int n3, Class class_) {
        return this.b.nextSpanTransition(n2, n3, class_);
    }

    public void removeSpan(Object object) {
        if (!(object instanceof MetricAffectingSpan)) {
            this.b.removeSpan(object);
            return;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be removed from PrecomputedText.");
    }

    public void setSpan(Object object, int n2, int n3, int n4) {
        if (!(object instanceof MetricAffectingSpan)) {
            this.b.setSpan(object, n2, n3, n4);
            return;
        }
        throw new IllegalArgumentException("MetricAffectingSpan can not be set to PrecomputedText.");
    }

    public CharSequence subSequence(int n2, int n3) {
        return this.b.subSequence(n2, n3);
    }

    public String toString() {
        return this.b.toString();
    }

    public static final class e.e.i.a$a {
        private final TextPaint a;
        private final TextDirectionHeuristic b;
        private final int c;
        private final int d;
        final PrecomputedText.Params e;

        public e.e.i.a$a(PrecomputedText.Params params) {
            this.a = params.getTextPaint();
            this.b = params.getTextDirection();
            this.c = params.getBreakStrategy();
            this.d = params.getHyphenationFrequency();
            this.e = null;
        }

        e.e.i.a$a(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int n2, int n3) {
            this.e = null;
            this.a = textPaint;
            this.b = textDirectionHeuristic;
            this.c = n2;
            this.d = n3;
        }

        public int a() {
            return this.c;
        }

        public boolean a(e.e.i.a$a a2) {
            PrecomputedText.Params params = this.e;
            if (params != null) {
                return params.equals((Object)a2.e);
            }
            if (Build.VERSION.SDK_INT >= 23) {
                if (this.c != a2.a()) {
                    return false;
                }
                if (this.d != a2.b()) {
                    return false;
                }
            }
            if (this.a.getTextSize() != a2.d().getTextSize()) {
                return false;
            }
            if (this.a.getTextScaleX() != a2.d().getTextScaleX()) {
                return false;
            }
            if (this.a.getTextSkewX() != a2.d().getTextSkewX()) {
                return false;
            }
            if (Build.VERSION.SDK_INT >= 21) {
                if (this.a.getLetterSpacing() != a2.d().getLetterSpacing()) {
                    return false;
                }
                if (!TextUtils.equals((CharSequence)this.a.getFontFeatureSettings(), (CharSequence)a2.d().getFontFeatureSettings())) {
                    return false;
                }
            }
            if (this.a.getFlags() != a2.d().getFlags()) {
                return false;
            }
            int n2 = Build.VERSION.SDK_INT;
            if (n2 >= 24 ? !this.a.getTextLocales().equals((Object)a2.d().getTextLocales()) : n2 >= 17 && !this.a.getTextLocale().equals((Object)a2.d().getTextLocale())) {
                return false;
            }
            return !(this.a.getTypeface() == null ? a2.d().getTypeface() != null : !this.a.getTypeface().equals((Object)a2.d().getTypeface()));
        }

        public int b() {
            return this.d;
        }

        public TextDirectionHeuristic c() {
            return this.b;
        }

        public TextPaint d() {
            return this.a;
        }

        public boolean equals(Object object) {
            if (object == this) {
                return true;
            }
            if (!(object instanceof e.e.i.a$a)) {
                return false;
            }
            e.e.i.a$a a2 = (e.e.i.a$a)object;
            if (!this.a(a2)) {
                return false;
            }
            return Build.VERSION.SDK_INT < 18 || this.b == a2.c();
        }

        public int hashCode() {
            int n2 = Build.VERSION.SDK_INT;
            if (n2 >= 24) {
                Object[] arrobject = new Object[]{Float.valueOf((float)this.a.getTextSize()), Float.valueOf((float)this.a.getTextScaleX()), Float.valueOf((float)this.a.getTextSkewX()), Float.valueOf((float)this.a.getLetterSpacing()), this.a.getFlags(), this.a.getTextLocales(), this.a.getTypeface(), this.a.isElegantTextHeight(), this.b, this.c, this.d};
                return c.a(arrobject);
            }
            if (n2 >= 21) {
                Object[] arrobject = new Object[]{Float.valueOf((float)this.a.getTextSize()), Float.valueOf((float)this.a.getTextScaleX()), Float.valueOf((float)this.a.getTextSkewX()), Float.valueOf((float)this.a.getLetterSpacing()), this.a.getFlags(), this.a.getTextLocale(), this.a.getTypeface(), this.a.isElegantTextHeight(), this.b, this.c, this.d};
                return c.a(arrobject);
            }
            if (n2 >= 18) {
                Object[] arrobject = new Object[]{Float.valueOf((float)this.a.getTextSize()), Float.valueOf((float)this.a.getTextScaleX()), Float.valueOf((float)this.a.getTextSkewX()), this.a.getFlags(), this.a.getTextLocale(), this.a.getTypeface(), this.b, this.c, this.d};
                return c.a(arrobject);
            }
            if (n2 >= 17) {
                Object[] arrobject = new Object[]{Float.valueOf((float)this.a.getTextSize()), Float.valueOf((float)this.a.getTextScaleX()), Float.valueOf((float)this.a.getTextSkewX()), this.a.getFlags(), this.a.getTextLocale(), this.a.getTypeface(), this.b, this.c, this.d};
                return c.a(arrobject);
            }
            Object[] arrobject = new Object[]{Float.valueOf((float)this.a.getTextSize()), Float.valueOf((float)this.a.getTextScaleX()), Float.valueOf((float)this.a.getTextSkewX()), this.a.getFlags(), this.a.getTypeface(), this.b, this.c, this.d};
            return c.a(arrobject);
        }

        /*
         * Enabled aggressive block sorting
         */
        public String toString() {
            StringBuilder stringBuilder;
            block7 : {
                StringBuilder stringBuilder2;
                LocaleList localeList;
                block6 : {
                    int n2;
                    block5 : {
                        stringBuilder = new StringBuilder("{");
                        StringBuilder stringBuilder3 = new StringBuilder();
                        stringBuilder3.append("textSize=");
                        stringBuilder3.append(this.a.getTextSize());
                        stringBuilder.append(stringBuilder3.toString());
                        StringBuilder stringBuilder4 = new StringBuilder();
                        stringBuilder4.append(", textScaleX=");
                        stringBuilder4.append(this.a.getTextScaleX());
                        stringBuilder.append(stringBuilder4.toString());
                        StringBuilder stringBuilder5 = new StringBuilder();
                        stringBuilder5.append(", textSkewX=");
                        stringBuilder5.append(this.a.getTextSkewX());
                        stringBuilder.append(stringBuilder5.toString());
                        if (Build.VERSION.SDK_INT >= 21) {
                            StringBuilder stringBuilder6 = new StringBuilder();
                            stringBuilder6.append(", letterSpacing=");
                            stringBuilder6.append(this.a.getLetterSpacing());
                            stringBuilder.append(stringBuilder6.toString());
                            StringBuilder stringBuilder7 = new StringBuilder();
                            stringBuilder7.append(", elegantTextHeight=");
                            stringBuilder7.append(this.a.isElegantTextHeight());
                            stringBuilder.append(stringBuilder7.toString());
                        }
                        if ((n2 = Build.VERSION.SDK_INT) < 24) break block5;
                        stringBuilder2 = new StringBuilder();
                        stringBuilder2.append(", textLocale=");
                        localeList = this.a.getTextLocales();
                        break block6;
                    }
                    if (n2 < 17) break block7;
                    stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(", textLocale=");
                    localeList = this.a.getTextLocale();
                }
                stringBuilder2.append((Object)localeList);
                stringBuilder.append(stringBuilder2.toString());
            }
            StringBuilder stringBuilder8 = new StringBuilder();
            stringBuilder8.append(", typeface=");
            stringBuilder8.append((Object)this.a.getTypeface());
            stringBuilder.append(stringBuilder8.toString());
            if (Build.VERSION.SDK_INT >= 26) {
                StringBuilder stringBuilder9 = new StringBuilder();
                stringBuilder9.append(", variationSettings=");
                stringBuilder9.append(this.a.getFontVariationSettings());
                stringBuilder.append(stringBuilder9.toString());
            }
            StringBuilder stringBuilder10 = new StringBuilder();
            stringBuilder10.append(", textDir=");
            stringBuilder10.append((Object)this.b);
            stringBuilder.append(stringBuilder10.toString());
            StringBuilder stringBuilder11 = new StringBuilder();
            stringBuilder11.append(", breakStrategy=");
            stringBuilder11.append(this.c);
            stringBuilder.append(stringBuilder11.toString());
            StringBuilder stringBuilder12 = new StringBuilder();
            stringBuilder12.append(", hyphenationFrequency=");
            stringBuilder12.append(this.d);
            stringBuilder.append(stringBuilder12.toString());
            stringBuilder.append("}");
            return stringBuilder.toString();
        }

        public static class a {
            private final TextPaint a;
            private TextDirectionHeuristic b;
            private int c;
            private int d;

            public a(TextPaint textPaint) {
                this.a = textPaint;
                if (Build.VERSION.SDK_INT >= 23) {
                    this.c = 1;
                    this.d = 1;
                } else {
                    this.d = 0;
                    this.c = 0;
                }
                Object object = Build.VERSION.SDK_INT >= 18 ? TextDirectionHeuristics.FIRSTSTRONG_LTR : null;
                this.b = object;
            }

            public a a(int n2) {
                this.c = n2;
                return this;
            }

            public a a(TextDirectionHeuristic textDirectionHeuristic) {
                this.b = textDirectionHeuristic;
                return this;
            }

            public e.e.i.a$a a() {
                return new e.e.i.a$a(this.a, this.b, this.c, this.d);
            }

            public a b(int n2) {
                this.d = n2;
                return this;
            }
        }

    }

}

