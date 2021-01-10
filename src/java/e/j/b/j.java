/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 *  java.lang.AssertionError
 *  java.lang.CharSequence
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package e.j.b;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import e.j.b.p;
import e.j.b.q;

class j
extends ViewGroup {
    private a b = a.d;
    private View c;
    private View d;
    private View e;

    j(Context context) {
        super(context);
        j.super.a();
    }

    private void a() {
        LayoutInflater layoutInflater = (LayoutInflater)this.getContext().getSystemService("layout_inflater");
        this.c = layoutInflater.inflate(q.music_with_title_landscape, null);
        this.d = layoutInflater.inflate(q.music_with_title_portrait, null);
        this.e = layoutInflater.inflate(q.music_without_title, null);
        this.addView(this.c);
        this.addView(this.d);
        this.addView(this.e);
    }

    private static boolean a(View view) {
        return (16777216 & view.getMeasuredWidthAndState() | 16777216 & view.getMeasuredHeightAndState()) != 0;
    }

    void a(Drawable drawable) {
        int n2 = this.getChildCount();
        for (int i2 = 0; i2 < n2; ++i2) {
            ImageView imageView = (ImageView)this.getChildAt(i2).findViewById(p.album);
            if (imageView == null) continue;
            imageView.setImageDrawable(drawable);
        }
    }

    void a(String string) {
        int n2 = this.getChildCount();
        for (int i2 = 0; i2 < n2; ++i2) {
            TextView textView = (TextView)this.getChildAt(i2).findViewById(p.artist);
            if (textView == null) continue;
            textView.setText((CharSequence)string);
        }
    }

    void b(String string) {
        int n2 = this.getChildCount();
        for (int i2 = 0; i2 < n2; ++i2) {
            TextView textView = (TextView)this.getChildAt(i2).findViewById(p.title);
            if (textView == null) continue;
            textView.setText((CharSequence)string);
        }
    }

    protected void onLayout(boolean bl, int n2, int n3, int n4, int n5) {
        a a2 = this.b;
        View view = a2 == a.b ? this.c : (a2 == a.c ? this.d : this.e);
        int n6 = this.getChildCount();
        for (int i2 = 0; i2 < n6; ++i2) {
            View view2 = this.getChildAt(i2);
            if (view2 == view) {
                view2.setVisibility(0);
                continue;
            }
            view2.setVisibility(4);
        }
        int n7 = n4 - n2;
        int n8 = n5 - n3;
        int n9 = view.getMeasuredWidth();
        int n10 = view.getMeasuredHeight();
        int n11 = (n7 - n9) / 2;
        int n12 = (n8 - n10) / 2;
        view.layout(n11, n12, n9 + n11, n10 + n12);
    }

    protected void onMeasure(int n2, int n3) {
        block4 : {
            int n4;
            int n5;
            block6 : {
                block7 : {
                    block5 : {
                        if (View.MeasureSpec.getMode((int)n2) != 1073741824 || View.MeasureSpec.getMode((int)n3) != 1073741824) break block4;
                        n4 = View.MeasureSpec.getSize((int)n2);
                        if (n4 <= (n5 = View.MeasureSpec.getSize((int)n3))) break block5;
                        this.b = a.b;
                        this.c.measure(View.MeasureSpec.makeMeasureSpec((int)n4, (int)0), View.MeasureSpec.makeMeasureSpec((int)n5, (int)Integer.MIN_VALUE));
                        if (!j.a(this.c) && this.c.getMeasuredWidth() <= n4) break block6;
                        break block7;
                    }
                    this.b = a.c;
                    this.d.measure(View.MeasureSpec.makeMeasureSpec((int)n4, (int)Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec((int)n5, (int)0));
                    if (!j.a(this.d) && this.d.getMeasuredHeight() <= n5) break block6;
                }
                this.b = a.d;
            }
            if (this.b == a.d) {
                this.e.measure(View.MeasureSpec.makeMeasureSpec((int)(n4 / 2), (int)1073741824), View.MeasureSpec.makeMeasureSpec((int)(n5 / 2), (int)1073741824));
            }
            this.setMeasuredDimension(n4, n5);
            return;
        }
        throw new AssertionError((Object)"MusicView should be measured in MeasureSpec.EXACTLY");
    }

    private static final class a
    extends Enum<a> {
        public static final /* enum */ a b = new a();
        public static final /* enum */ a c = new a();
        public static final /* enum */ a d = new a();
        private static final /* synthetic */ a[] e;

        static {
            a[] arra = new a[]{b, c, d};
            e = arra;
        }

        public static a valueOf(String string) {
            return (a)Enum.valueOf(a.class, (String)string);
        }

        public static a[] values() {
            return (a[])e.clone();
        }
    }

}

