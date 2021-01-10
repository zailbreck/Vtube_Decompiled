/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.SpannableString
 *  android.text.Spanned
 *  android.text.TextUtils
 *  android.text.style.ClickableSpan
 *  android.util.Log
 *  android.util.SparseArray
 *  android.view.View
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 *  java.lang.reflect.Constructor
 *  java.util.ArrayList
 *  java.util.List
 */
package e.e.k.d0;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import e.e.b;
import e.e.k.d0.f;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.List;

public class c {
    private static int d;
    private final AccessibilityNodeInfo a;
    public int b = -1;
    private int c = -1;

    private c(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.a = accessibilityNodeInfo;
    }

    private int a(ClickableSpan clickableSpan, SparseArray<WeakReference<ClickableSpan>> sparseArray) {
        if (sparseArray != null) {
            for (int i2 = 0; i2 < sparseArray.size(); ++i2) {
                if (!clickableSpan.equals((Object)((ClickableSpan)((WeakReference)sparseArray.valueAt(i2)).get()))) continue;
                return sparseArray.keyAt(i2);
            }
        }
        int n2 = d;
        d = n2 + 1;
        return n2;
    }

    private SparseArray<WeakReference<ClickableSpan>> a(View view) {
        SparseArray sparseArray = c.super.b(view);
        if (sparseArray == null) {
            sparseArray = new SparseArray();
            view.setTag(b.tag_accessibility_clickable_spans, (Object)sparseArray);
        }
        return sparseArray;
    }

    public static c a(AccessibilityNodeInfo accessibilityNodeInfo) {
        return new c(accessibilityNodeInfo);
    }

    private List<Integer> a(String string) {
        if (Build.VERSION.SDK_INT < 19) {
            return new ArrayList();
        }
        ArrayList arrayList = this.a.getExtras().getIntegerArrayList(string);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.a.getExtras().putIntegerArrayList(string, arrayList);
        }
        return arrayList;
    }

    private void a(int n2, boolean bl) {
        Bundle bundle = this.d();
        if (bundle != null) {
            int n3 = bundle.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & ~n2;
            if (!bl) {
                n2 = 0;
            }
            bundle.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", n2 | n3);
        }
    }

    private void a(ClickableSpan clickableSpan, Spanned spanned, int n2) {
        c.super.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add((Object)spanned.getSpanStart((Object)clickableSpan));
        c.super.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add((Object)spanned.getSpanEnd((Object)clickableSpan));
        c.super.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add((Object)spanned.getSpanFlags((Object)clickableSpan));
        c.super.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add((Object)n2);
    }

    private SparseArray<WeakReference<ClickableSpan>> b(View view) {
        return (SparseArray)view.getTag(b.tag_accessibility_clickable_spans);
    }

    private static String b(int n2) {
        if (n2 != 1) {
            if (n2 != 2) {
                switch (n2) {
                    default: {
                        return "ACTION_UNKNOWN";
                    }
                    case 131072: {
                        return "ACTION_SET_SELECTION";
                    }
                    case 65536: {
                        return "ACTION_CUT";
                    }
                    case 32768: {
                        return "ACTION_PASTE";
                    }
                    case 16384: {
                        return "ACTION_COPY";
                    }
                    case 8192: {
                        return "ACTION_SCROLL_BACKWARD";
                    }
                    case 4096: {
                        return "ACTION_SCROLL_FORWARD";
                    }
                    case 2048: {
                        return "ACTION_PREVIOUS_HTML_ELEMENT";
                    }
                    case 1024: {
                        return "ACTION_NEXT_HTML_ELEMENT";
                    }
                    case 512: {
                        return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
                    }
                    case 256: {
                        return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
                    }
                    case 128: {
                        return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
                    }
                    case 64: {
                        return "ACTION_ACCESSIBILITY_FOCUS";
                    }
                    case 32: {
                        return "ACTION_LONG_CLICK";
                    }
                    case 16: {
                        return "ACTION_CLICK";
                    }
                    case 8: {
                        return "ACTION_CLEAR_SELECTION";
                    }
                    case 4: 
                }
                return "ACTION_SELECT";
            }
            return "ACTION_CLEAR_FOCUS";
        }
        return "ACTION_FOCUS";
    }

    private void c(View view) {
        SparseArray<WeakReference<ClickableSpan>> sparseArray = c.super.b(view);
        if (sparseArray != null) {
            ArrayList arrayList = new ArrayList();
            int n2 = 0;
            do {
                int n3 = sparseArray.size();
                if (n2 >= n3) break;
                if (((WeakReference)sparseArray.valueAt(n2)).get() == null) {
                    arrayList.add((Object)n2);
                }
                ++n2;
            } while (true);
            for (int i2 = 0; i2 < arrayList.size(); ++i2) {
                sparseArray.remove(((Integer)arrayList.get(i2)).intValue());
            }
        }
    }

    public static ClickableSpan[] c(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[])((Spanned)charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    private void s() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            this.a.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        }
    }

    private boolean t() {
        return true ^ this.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
    }

    public int a() {
        return this.a.getActions();
    }

    public void a(int n2) {
        this.a.addAction(n2);
    }

    public void a(Rect rect) {
        this.a.getBoundsInParent(rect);
    }

    public void a(a a2) {
        if (Build.VERSION.SDK_INT >= 21) {
            this.a.addAction((AccessibilityNodeInfo.AccessibilityAction)a2.a);
        }
    }

    public void a(CharSequence charSequence) {
        this.a.setClassName(charSequence);
    }

    public void a(CharSequence charSequence, View view) {
        int n2 = Build.VERSION.SDK_INT;
        if (n2 >= 19 && n2 < 26) {
            c.super.s();
            c.super.c(view);
            ClickableSpan[] arrclickableSpan = c.c(charSequence);
            if (arrclickableSpan != null && arrclickableSpan.length > 0) {
                this.d().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", b.accessibility_action_clickable_span);
                SparseArray<WeakReference<ClickableSpan>> sparseArray = c.super.a(view);
                for (int i2 = 0; arrclickableSpan != null && i2 < arrclickableSpan.length; ++i2) {
                    int n3 = c.super.a(arrclickableSpan[i2], sparseArray);
                    sparseArray.put(n3, (Object)new WeakReference((Object)arrclickableSpan[i2]));
                    c.super.a(arrclickableSpan[i2], (Spanned)charSequence, n3);
                }
            }
        }
    }

    public void a(boolean bl) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.a.setHeading(bl);
            return;
        }
        c.super.a(2, bl);
    }

    public boolean a(int n2, Bundle bundle) {
        if (Build.VERSION.SDK_INT >= 16) {
            return this.a.performAction(n2, bundle);
        }
        return false;
    }

    public CharSequence b() {
        return this.a.getClassName();
    }

    public void b(Rect rect) {
        this.a.getBoundsInScreen(rect);
    }

    public void b(CharSequence charSequence) {
        int n2 = Build.VERSION.SDK_INT;
        if (n2 >= 28) {
            this.a.setPaneTitle(charSequence);
            return;
        }
        if (n2 >= 19) {
            this.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", charSequence);
        }
    }

    public void b(boolean bl) {
        if (Build.VERSION.SDK_INT >= 28) {
            this.a.setScreenReaderFocusable(bl);
            return;
        }
        c.super.a(1, bl);
    }

    public CharSequence c() {
        return this.a.getContentDescription();
    }

    public void c(boolean bl) {
        this.a.setScrollable(bl);
    }

    public Bundle d() {
        if (Build.VERSION.SDK_INT >= 19) {
            return this.a.getExtras();
        }
        return new Bundle();
    }

    public CharSequence e() {
        return this.a.getPackageName();
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null) {
            return false;
        }
        if (c.class != object.getClass()) {
            return false;
        }
        c c2 = (c)object;
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null ? c2.a != null : !accessibilityNodeInfo.equals((Object)c2.a)) {
            return false;
        }
        if (this.c != c2.c) {
            return false;
        }
        return this.b == c2.b;
    }

    public CharSequence f() {
        if (this.t()) {
            List<Integer> list = this.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
            List<Integer> list2 = this.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
            List<Integer> list3 = this.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
            List<Integer> list4 = this.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
            CharSequence charSequence = this.a.getText();
            int n2 = this.a.getText().length();
            SpannableString spannableString = new SpannableString((CharSequence)TextUtils.substring((CharSequence)charSequence, (int)0, (int)n2));
            for (int i2 = 0; i2 < list.size(); ++i2) {
                spannableString.setSpan((Object)new e.e.k.d0.a((Integer)list4.get(i2), this, this.d().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), ((Integer)list.get(i2)).intValue(), ((Integer)list2.get(i2)).intValue(), ((Integer)list3.get(i2)).intValue());
            }
            return spannableString;
        }
        return this.a.getText();
    }

    public String g() {
        if (Build.VERSION.SDK_INT >= 18) {
            return this.a.getViewIdResourceName();
        }
        return null;
    }

    public boolean h() {
        return this.a.isCheckable();
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.a;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public boolean i() {
        return this.a.isChecked();
    }

    public boolean j() {
        return this.a.isClickable();
    }

    public boolean k() {
        return this.a.isEnabled();
    }

    public boolean l() {
        return this.a.isFocusable();
    }

    public boolean m() {
        return this.a.isFocused();
    }

    public boolean n() {
        return this.a.isLongClickable();
    }

    public boolean o() {
        return this.a.isPassword();
    }

    public boolean p() {
        return this.a.isScrollable();
    }

    public boolean q() {
        return this.a.isSelected();
    }

    public AccessibilityNodeInfo r() {
        return this.a;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(super.toString());
        Rect rect = new Rect();
        this.a(rect);
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("; boundsInParent: ");
        stringBuilder2.append((Object)rect);
        stringBuilder.append(stringBuilder2.toString());
        this.b(rect);
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append("; boundsInScreen: ");
        stringBuilder3.append((Object)rect);
        stringBuilder.append(stringBuilder3.toString());
        stringBuilder.append("; packageName: ");
        stringBuilder.append(this.e());
        stringBuilder.append("; className: ");
        stringBuilder.append(this.b());
        stringBuilder.append("; text: ");
        stringBuilder.append(this.f());
        stringBuilder.append("; contentDescription: ");
        stringBuilder.append(this.c());
        stringBuilder.append("; viewId: ");
        stringBuilder.append(this.g());
        stringBuilder.append("; checkable: ");
        stringBuilder.append(this.h());
        stringBuilder.append("; checked: ");
        stringBuilder.append(this.i());
        stringBuilder.append("; focusable: ");
        stringBuilder.append(this.l());
        stringBuilder.append("; focused: ");
        stringBuilder.append(this.m());
        stringBuilder.append("; selected: ");
        stringBuilder.append(this.q());
        stringBuilder.append("; clickable: ");
        stringBuilder.append(this.j());
        stringBuilder.append("; longClickable: ");
        stringBuilder.append(this.n());
        stringBuilder.append("; enabled: ");
        stringBuilder.append(this.k());
        stringBuilder.append("; password: ");
        stringBuilder.append(this.o());
        StringBuilder stringBuilder4 = new StringBuilder();
        stringBuilder4.append("; scrollable: ");
        stringBuilder4.append(this.p());
        stringBuilder.append(stringBuilder4.toString());
        stringBuilder.append("; [");
        int n2 = this.a();
        while (n2 != 0) {
            int n3 = 1 << Integer.numberOfTrailingZeros((int)n2);
            stringBuilder.append(c.b(n3));
            if ((n2 &= ~n3) == 0) continue;
            stringBuilder.append(", ");
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public static class a {
        final Object a;
        private final Class<? extends f.a> b;
        protected final f c;

        static {
            new a(1, null);
            new a(2, null);
            new a(4, null);
            new a(8, null);
            new a(16, null);
            new a(32, null);
            new a(64, null);
            new a(128, null);
            new a(256, null, f.b.class);
            new a(512, null, f.b.class);
            new a(1024, null, f.c.class);
            new a(2048, null, f.c.class);
            new a(4096, null);
            new a(8192, null);
            new a(16384, null);
            new a(32768, null);
            new a(65536, null);
            new a(131072, null, f.g.class);
            new a(262144, null);
            new a(524288, null);
            new a(1048576, null);
            new a(2097152, null, f.h.class);
            Object object = Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN : null;
            new a(object, 16908342, null, null, null);
            Object object2 = Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION : null;
            new a(object2, 16908343, null, null, f.e.class);
            Object object3 = Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP : null;
            new a(object3, 16908344, null, null, null);
            Object object4 = Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT : null;
            new a(object4, 16908345, null, null, null);
            Object object5 = Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN : null;
            new a(object5, 16908346, null, null, null);
            Object object6 = Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT : null;
            new a(object6, 16908347, null, null, null);
            Object object7 = Build.VERSION.SDK_INT >= 23 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK : null;
            new a(object7, 16908348, null, null, null);
            Object object8 = Build.VERSION.SDK_INT >= 24 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS : null;
            new a(object8, 16908349, null, null, f.f.class);
            Object object9 = Build.VERSION.SDK_INT >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null;
            new a(object9, 16908354, null, null, f.d.class);
            Object object10 = Build.VERSION.SDK_INT >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null;
            new a(object10, 16908356, null, null, null);
            int n2 = Build.VERSION.SDK_INT;
            AccessibilityNodeInfo.AccessibilityAction accessibilityAction = null;
            if (n2 >= 28) {
                accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            }
            new a((Object)accessibilityAction, 16908357, null, null, null);
        }

        public a(int n2, CharSequence charSequence) {
            super(null, n2, charSequence, null, null);
        }

        private a(int n2, CharSequence charSequence, Class<? extends f.a> class_) {
            super(null, n2, charSequence, null, class_);
        }

        a(Object object, int n2, CharSequence charSequence, f f2, Class<? extends f.a> class_) {
            this.c = f2;
            if (Build.VERSION.SDK_INT >= 21 && object == null) {
                object = new AccessibilityNodeInfo.AccessibilityAction(n2, charSequence);
            }
            this.a = object;
            this.b = class_;
        }

        public int a() {
            if (Build.VERSION.SDK_INT >= 21) {
                return ((AccessibilityNodeInfo.AccessibilityAction)this.a).getId();
            }
            return 0;
        }

        /*
         * Loose catch block
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        public boolean a(View view, Bundle bundle) {
            void var5_8;
            f.a a2;
            block4 : {
                if (this.c == null) return false;
                Class<? extends f.a> class_ = this.b;
                a2 = null;
                if (class_ == null) return this.c.a(view, a2);
                f.a a3 = (f.a)class_.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                try {
                    a3.a(bundle);
                    a2 = a3;
                    return this.c.a(view, a2);
                }
                catch (Exception exception) {
                    a2 = a3;
                }
                break block4;
                catch (Exception exception) {
                    // empty catch block
                }
            }
            Class<? extends f.a> class_2 = this.b;
            String string = class_2 == null ? "null" : class_2.getName();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Failed to execute command with argument class ViewCommandArgument: ");
            stringBuilder.append(string);
            Log.e((String)"A11yActionCompat", (String)stringBuilder.toString(), (Throwable)var5_8);
            return this.c.a(view, a2);
        }
    }

}

