/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.ValueAnimator
 *  android.content.Context
 *  android.content.res.ColorStateList
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.IBinder
 *  android.util.Log
 *  android.util.SparseArray
 *  android.view.Display
 *  android.view.KeyEvent
 *  android.view.View
 *  android.view.View$AccessibilityDelegate
 *  android.view.View$OnApplyWindowInsetsListener
 *  android.view.View$OnAttachStateChangeListener
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 *  android.view.WindowInsets
 *  android.view.WindowManager
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityManager
 *  java.lang.AbstractMethodError
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 *  java.lang.reflect.Field
 *  java.util.ArrayList
 *  java.util.Map$Entry
 *  java.util.Set
 *  java.util.WeakHashMap
 *  java.util.concurrent.atomic.AtomicInteger
 */
package e.e.k;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.IBinder;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import e.e.k.a;
import e.e.k.c0;
import e.e.k.k;
import e.e.k.q;
import e.e.k.t;
import e.e.k.u;
import e.e.k.y;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class u {
    private static Field a;
    private static boolean b;
    private static Field c;
    private static boolean d;
    private static WeakHashMap<View, String> e;
    private static WeakHashMap<View, y> f;
    private static Field g;
    private static boolean h;

    static {
        new AtomicInteger(1);
        f = null;
        h = false;
        int[] arrn = new int[]{e.e.b.accessibility_custom_action_0, e.e.b.accessibility_custom_action_1, e.e.b.accessibility_custom_action_2, e.e.b.accessibility_custom_action_3, e.e.b.accessibility_custom_action_4, e.e.b.accessibility_custom_action_5, e.e.b.accessibility_custom_action_6, e.e.b.accessibility_custom_action_7, e.e.b.accessibility_custom_action_8, e.e.b.accessibility_custom_action_9, e.e.b.accessibility_custom_action_10, e.e.b.accessibility_custom_action_11, e.e.b.accessibility_custom_action_12, e.e.b.accessibility_custom_action_13, e.e.b.accessibility_custom_action_14, e.e.b.accessibility_custom_action_15, e.e.b.accessibility_custom_action_16, e.e.b.accessibility_custom_action_17, e.e.b.accessibility_custom_action_18, e.e.b.accessibility_custom_action_19, e.e.b.accessibility_custom_action_20, e.e.b.accessibility_custom_action_21, e.e.b.accessibility_custom_action_22, e.e.b.accessibility_custom_action_23, e.e.b.accessibility_custom_action_24, e.e.b.accessibility_custom_action_25, e.e.b.accessibility_custom_action_26, e.e.b.accessibility_custom_action_27, e.e.b.accessibility_custom_action_28, e.e.b.accessibility_custom_action_29, e.e.b.accessibility_custom_action_30, e.e.b.accessibility_custom_action_31};
        new e();
    }

    public static c0 a(View view, c0 c02) {
        if (Build.VERSION.SDK_INT >= 21) {
            WindowInsets windowInsets = (WindowInsets)c0.a(c02);
            WindowInsets windowInsets2 = view.onApplyWindowInsets(windowInsets);
            if (!windowInsets2.equals((Object)windowInsets)) {
                windowInsets = new WindowInsets(windowInsets2);
            }
            return c0.a((Object)windowInsets);
        }
        return c02;
    }

    private static f<Boolean> a() {
        return new f<Boolean>(e.e.b.tag_accessibility_heading, Boolean.class, 28){

            Boolean a(View view) {
                return view.isAccessibilityHeading();
            }
        };
    }

    public static y a(View view) {
        y y2;
        if (f == null) {
            f = new WeakHashMap();
        }
        if ((y2 = (y)f.get((Object)view)) == null) {
            y2 = new y(view);
            f.put((Object)view, (Object)y2);
        }
        return y2;
    }

    public static void a(View view, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setElevation(f2);
        }
    }

    static void a(View view, int n2) {
        if (!((AccessibilityManager)view.getContext().getSystemService("accessibility")).isEnabled()) {
            return;
        }
        boolean bl = u.d(view) != null;
        if (!(u.c(view) != 0 || bl && view.getVisibility() == 0)) {
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, n2);
                    return;
                }
                catch (AbstractMethodError abstractMethodError) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(view.getParent().getClass().getSimpleName());
                    stringBuilder.append(" does not fully implement ViewParent");
                    Log.e((String)"ViewCompat", (String)stringBuilder.toString(), (Throwable)abstractMethodError);
                    return;
                }
            }
        } else {
            AccessibilityEvent accessibilityEvent = AccessibilityEvent.obtain();
            int n3 = bl ? 32 : 2048;
            accessibilityEvent.setEventType(n3);
            accessibilityEvent.setContentChangeTypes(n2);
            view.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public static void a(View view, int n2, int n3) {
        if (Build.VERSION.SDK_INT >= 23) {
            view.setScrollIndicators(n2, n3);
        }
    }

    public static void a(View view, ColorStateList colorStateList) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintList(colorStateList);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable drawable = view.getBackground();
                boolean bl = view.getBackgroundTintList() != null || view.getBackgroundTintMode() != null;
                if (drawable != null && bl) {
                    if (drawable.isStateful()) {
                        drawable.setState(view.getDrawableState());
                    }
                    view.setBackground(drawable);
                    return;
                }
            }
        } else if (view instanceof t) {
            ((t)view).setSupportBackgroundTintList(colorStateList);
        }
    }

    public static void a(View view, PorterDuff.Mode mode) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setBackgroundTintMode(mode);
            if (Build.VERSION.SDK_INT == 21) {
                Drawable drawable = view.getBackground();
                boolean bl = view.getBackgroundTintList() != null || view.getBackgroundTintMode() != null;
                if (drawable != null && bl) {
                    if (drawable.isStateful()) {
                        drawable.setState(view.getDrawableState());
                    }
                    view.setBackground(drawable);
                    return;
                }
            }
        } else if (view instanceof t) {
            ((t)view).setSupportBackgroundTintMode(mode);
        }
    }

    public static void a(View view, Drawable drawable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.setBackground(drawable);
            return;
        }
        view.setBackgroundDrawable(drawable);
    }

    public static void a(View view, e.e.k.a a2) {
        if (a2 == null && u.b(view) instanceof a.a) {
            a2 = new e.e.k.a();
        }
        View.AccessibilityDelegate accessibilityDelegate = a2 == null ? null : a2.a();
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    public static void a(View view, final q q2) {
        if (Build.VERSION.SDK_INT >= 21) {
            if (q2 == null) {
                view.setOnApplyWindowInsetsListener(null);
                return;
            }
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener(){

                public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                    c0 c02 = c0.a((Object)windowInsets);
                    return (WindowInsets)c0.a(q2.a(view, c02));
                }
            });
        }
    }

    public static void a(View view, Runnable runnable) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimation(runnable);
            return;
        }
        view.postDelayed(runnable, ValueAnimator.getFrameDelay());
    }

    public static void a(View view, Runnable runnable, long l2) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postOnAnimationDelayed(runnable, l2);
            return;
        }
        view.postDelayed(runnable, l2 + ValueAnimator.getFrameDelay());
    }

    public static void a(View view, String string) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.setTransitionName(string);
            return;
        }
        if (e == null) {
            e = new WeakHashMap();
        }
        e.put((Object)view, (Object)string);
    }

    static boolean a(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return h.a(view).a(view, keyEvent);
    }

    private static View.AccessibilityDelegate b(View view) {
        if (h) {
            return null;
        }
        if (g == null) {
            try {
                g = View.class.getDeclaredField("mAccessibilityDelegate");
                g.setAccessible(true);
            }
            catch (Throwable throwable) {
                h = true;
                return null;
            }
        }
        try {
            Object object = g.get((Object)view);
            if (object instanceof View.AccessibilityDelegate) {
                View.AccessibilityDelegate accessibilityDelegate = (View.AccessibilityDelegate)object;
                return accessibilityDelegate;
            }
            return null;
        }
        catch (Throwable throwable) {
            h = true;
            return null;
        }
    }

    private static f<CharSequence> b() {
        return new f<CharSequence>(e.e.b.tag_accessibility_pane_title, CharSequence.class, 8, 28){

            CharSequence a(View view) {
                return view.getAccessibilityPaneTitle();
            }
        };
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void b(View view, int n2) {
        int n3 = Build.VERSION.SDK_INT;
        if (n3 < 19) {
            if (n3 < 16) {
                return;
            }
            if (n2 == 4) {
                n2 = 2;
            }
        }
        view.setImportantForAccessibility(n2);
    }

    static boolean b(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        return h.a(view).a(keyEvent);
    }

    public static int c(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.getAccessibilityLiveRegion();
        }
        return 0;
    }

    private static f<Boolean> c() {
        return new f<Boolean>(e.e.b.tag_screen_reader_focusable, Boolean.class, 28){

            Boolean a(View view) {
                return view.isScreenReaderFocusable();
            }
        };
    }

    public static CharSequence d(View view) {
        return u.b().b(view);
    }

    public static ColorStateList e(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintList();
        }
        if (view instanceof t) {
            return ((t)view).getSupportBackgroundTintList();
        }
        return null;
    }

    public static PorterDuff.Mode f(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getBackgroundTintMode();
        }
        if (view instanceof t) {
            return ((t)view).getSupportBackgroundTintMode();
        }
        return null;
    }

    public static Display g(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getDisplay();
        }
        if (u.p(view)) {
            return ((WindowManager)view.getContext().getSystemService("window")).getDefaultDisplay();
        }
        return null;
    }

    public static int h(View view) {
        if (Build.VERSION.SDK_INT >= 17) {
            return view.getLayoutDirection();
        }
        return 0;
    }

    /*
     * Exception decompiling
     */
    public static int i(View var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl32.1 : ICONST_0 : trying to set 0 previously set to 1
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
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

    /*
     * Exception decompiling
     */
    public static int j(View var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl32.1 : ICONST_0 : trying to set 0 previously set to 1
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
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

    public static String k(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            return view.getTransitionName();
        }
        WeakHashMap<View, String> weakHashMap = e;
        if (weakHashMap == null) {
            return null;
        }
        return (String)weakHashMap.get((Object)view);
    }

    public static int l(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.getWindowSystemUiVisibility();
        }
        return 0;
    }

    public static boolean m(View view) {
        if (Build.VERSION.SDK_INT >= 15) {
            return view.hasOnClickListeners();
        }
        return false;
    }

    public static boolean n(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            return view.hasTransientState();
        }
        return false;
    }

    public static boolean o(View view) {
        Boolean bl = u.a().b(view);
        if (bl == null) {
            return false;
        }
        return bl;
    }

    public static boolean p(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isAttachedToWindow();
        }
        return view.getWindowToken() != null;
    }

    public static boolean q(View view) {
        if (Build.VERSION.SDK_INT >= 19) {
            return view.isLaidOut();
        }
        return view.getWidth() > 0 && view.getHeight() > 0;
    }

    public static boolean r(View view) {
        Boolean bl = u.c().b(view);
        if (bl == null) {
            return false;
        }
        return bl;
    }

    public static void s(View view) {
        if (Build.VERSION.SDK_INT >= 16) {
            view.postInvalidateOnAnimation();
            return;
        }
        view.postInvalidate();
    }

    public static void t(View view) {
        int n2 = Build.VERSION.SDK_INT;
        if (n2 >= 20) {
            view.requestApplyInsets();
            return;
        }
        if (n2 >= 16) {
            view.requestFitSystemWindows();
        }
    }

    public static void u(View view) {
        if (Build.VERSION.SDK_INT >= 21) {
            view.stopNestedScroll();
            return;
        }
        if (view instanceof k) {
            ((k)view).stopNestedScroll();
        }
    }

    static class e
    implements ViewTreeObserver.OnGlobalLayoutListener,
    View.OnAttachStateChangeListener {
        private WeakHashMap<View, Boolean> b = new WeakHashMap();

        e() {
        }

        private void a(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener((ViewTreeObserver.OnGlobalLayoutListener)this);
        }

        private void a(View view, boolean bl) {
            boolean bl2 = view.getVisibility() == 0;
            if (bl != bl2) {
                if (bl2) {
                    u.a(view, 16);
                }
                this.b.put((Object)view, (Object)bl2);
            }
        }

        public void onGlobalLayout() {
            for (Map.Entry entry : this.b.entrySet()) {
                this.a((View)entry.getKey(), (Boolean)entry.getValue());
            }
        }

        public void onViewAttachedToWindow(View view) {
            e.super.a(view);
        }

        public void onViewDetachedFromWindow(View view) {
        }
    }

    static abstract class f<T> {
        private final int a;
        private final Class<T> b;
        private final int c;

        f(int n2, Class<T> class_, int n3) {
            super(n2, class_, 0, n3);
        }

        f(int n2, Class<T> class_, int n3, int n4) {
            this.a = n2;
            this.b = class_;
            this.c = n4;
        }

        private boolean a() {
            return Build.VERSION.SDK_INT >= 19;
        }

        private boolean b() {
            return Build.VERSION.SDK_INT >= this.c;
        }

        abstract T a(View var1);

        T b(View view) {
            Object object;
            if (f.super.b()) {
                return this.a(view);
            }
            if (f.super.a() && this.b.isInstance(object = view.getTag(this.a))) {
                return (T)object;
            }
            return null;
        }
    }

    public static interface g {
        public boolean a(View var1, KeyEvent var2);
    }

    static class h {
        private static final ArrayList<WeakReference<View>> d = new ArrayList();
        private WeakHashMap<View, Boolean> a = null;
        private SparseArray<WeakReference<View>> b = null;
        private WeakReference<KeyEvent> c = null;

        h() {
        }

        private SparseArray<WeakReference<View>> a() {
            if (this.b == null) {
                this.b = new SparseArray();
            }
            return this.b;
        }

        static h a(View view) {
            h h2 = (h)view.getTag(e.e.b.tag_unhandled_key_event_manager);
            if (h2 == null) {
                h2 = new h();
                view.setTag(e.e.b.tag_unhandled_key_event_manager, (Object)h2);
            }
            return h2;
        }

        private View b(View view, KeyEvent keyEvent) {
            WeakHashMap<View, Boolean> weakHashMap = this.a;
            if (weakHashMap != null) {
                if (!weakHashMap.containsKey((Object)view)) {
                    return null;
                }
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup)view;
                    for (int i2 = -1 + viewGroup.getChildCount(); i2 >= 0; --i2) {
                        View view2 = h.super.b(viewGroup.getChildAt(i2), keyEvent);
                        if (view2 == null) continue;
                        return view2;
                    }
                }
                if (h.super.c(view, keyEvent)) {
                    return view;
                }
            }
            return null;
        }

        /*
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         */
        private void b() {
            ArrayList<WeakReference<View>> arrayList;
            WeakHashMap<View, Boolean> weakHashMap = this.a;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            if (d.isEmpty()) {
                return;
            }
            ArrayList<WeakReference<View>> arrayList2 = arrayList = d;
            synchronized (arrayList2) {
                if (this.a == null) {
                    this.a = new WeakHashMap();
                }
                int n2 = -1 + d.size();
                while (n2 >= 0) {
                    View view = (View)((WeakReference)d.get(n2)).get();
                    if (view == null) {
                        d.remove(n2);
                    } else {
                        this.a.put((Object)view, (Object)Boolean.TRUE);
                        ViewParent viewParent = view.getParent();
                        while (viewParent instanceof View) {
                            this.a.put((Object)((View)viewParent), (Object)Boolean.TRUE);
                            viewParent = viewParent.getParent();
                        }
                    }
                    --n2;
                }
                return;
            }
        }

        private boolean c(View view, KeyEvent keyEvent) {
            ArrayList arrayList = (ArrayList)view.getTag(e.e.b.tag_unhandled_key_listeners);
            if (arrayList != null) {
                for (int i2 = arrayList.size() - 1; i2 >= 0; --i2) {
                    if (!((g)arrayList.get(i2)).a(view, keyEvent)) continue;
                    return true;
                }
            }
            return false;
        }

        boolean a(KeyEvent keyEvent) {
            WeakReference<KeyEvent> weakReference = this.c;
            if (weakReference != null && weakReference.get() == keyEvent) {
                return false;
            }
            this.c = new WeakReference((Object)keyEvent);
            SparseArray<WeakReference<View>> sparseArray = h.super.a();
            int n2 = keyEvent.getAction();
            WeakReference weakReference2 = null;
            if (n2 == 1) {
                int n3 = sparseArray.indexOfKey(keyEvent.getKeyCode());
                weakReference2 = null;
                if (n3 >= 0) {
                    weakReference2 = (WeakReference)sparseArray.valueAt(n3);
                    sparseArray.removeAt(n3);
                }
            }
            if (weakReference2 == null) {
                weakReference2 = (WeakReference)sparseArray.get(keyEvent.getKeyCode());
            }
            if (weakReference2 != null) {
                View view = (View)weakReference2.get();
                if (view != null && u.p(view)) {
                    h.super.c(view, keyEvent);
                }
                return true;
            }
            return false;
        }

        boolean a(View view, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                h.super.b();
            }
            View view2 = h.super.b(view, keyEvent);
            if (keyEvent.getAction() == 0) {
                int n2 = keyEvent.getKeyCode();
                if (view2 != null && !KeyEvent.isModifierKey((int)n2)) {
                    h.super.a().put(n2, (Object)new WeakReference((Object)view2));
                }
            }
            return view2 != null;
        }
    }

}

