/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.style.ClickableSpan
 *  android.util.SparseArray
 *  android.view.View
 *  android.view.View$AccessibilityDelegate
 *  android.view.ViewGroup
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityNodeProvider
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.ref.WeakReference
 *  java.util.Collections
 *  java.util.List
 */
package e.e.k;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import e.e.b;
import e.e.k.d0.c;
import e.e.k.d0.d;
import e.e.k.u;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

public class a {
    private static final View.AccessibilityDelegate c = new View.AccessibilityDelegate();
    private final View.AccessibilityDelegate a;
    private final View.AccessibilityDelegate b;

    public a() {
        this(c);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.a = accessibilityDelegate;
        this.b = new a((a)this);
    }

    private boolean a(int n2, View view) {
        ClickableSpan clickableSpan;
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray)view.getTag(b.tag_accessibility_clickable_spans);
        if (sparseArray != null && (weakReference = (WeakReference)sparseArray.get(n2)) != null && a.super.a(clickableSpan = (ClickableSpan)weakReference.get(), view)) {
            clickableSpan.onClick(view);
            return true;
        }
        return false;
    }

    private boolean a(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] arrclickableSpan = c.c(view.createAccessibilityNodeInfo().getText());
            for (int i2 = 0; arrclickableSpan != null && i2 < arrclickableSpan.length; ++i2) {
                if (!clickableSpan.equals((Object)arrclickableSpan[i2])) continue;
                return true;
            }
        }
        return false;
    }

    static List<c.a> b(View view) {
        List list = (List)view.getTag(b.tag_accessibility_actions);
        if (list == null) {
            list = Collections.emptyList();
        }
        return list;
    }

    View.AccessibilityDelegate a() {
        return this.b;
    }

    public d a(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider;
        if (Build.VERSION.SDK_INT >= 16 && (accessibilityNodeProvider = this.a.getAccessibilityNodeProvider(view)) != null) {
            return new d((Object)accessibilityNodeProvider);
        }
        return null;
    }

    public void a(View view, int n2) {
        this.a.sendAccessibilityEvent(view, n2);
    }

    public void a(View view, c c2) {
        this.a.onInitializeAccessibilityNodeInfo(view, c2.r());
    }

    public boolean a(View view, int n2, Bundle bundle) {
        boolean bl;
        List<c.a> list = a.b(view);
        int n3 = 0;
        do {
            int n4 = list.size();
            bl = false;
            if (n3 >= n4) break;
            c.a a2 = (c.a)list.get(n3);
            if (a2.a() == n2) {
                bl = a2.a(view, bundle);
                break;
            }
            ++n3;
        } while (true);
        if (!bl && Build.VERSION.SDK_INT >= 16) {
            bl = this.a.performAccessibilityAction(view, n2, bundle);
        }
        if (!bl && n2 == b.accessibility_action_clickable_span) {
            bl = a.super.a(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
        }
        return bl;
    }

    public boolean a(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public void b(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public void d(View view, AccessibilityEvent accessibilityEvent) {
        this.a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    static final class a
    extends View.AccessibilityDelegate {
        final a a;

        a(a a2) {
            this.a = a2;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.a.a(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            d d2 = this.a.a(view);
            if (d2 != null) {
                return (AccessibilityNodeProvider)d2.a();
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.a.b(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            c c2 = c.a(accessibilityNodeInfo);
            c2.b(u.r(view));
            c2.a(u.o(view));
            c2.b(u.d(view));
            this.a.a(view, c2);
            c2.a(accessibilityNodeInfo.getText(), view);
            List<c.a> list = a.b(view);
            for (int i2 = 0; i2 < list.size(); ++i2) {
                c2.a((c.a)list.get(i2));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.a.c(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.a.a(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int n2, Bundle bundle) {
            return this.a.a(view, n2, bundle);
        }

        public void sendAccessibilityEvent(View view, int n2) {
            this.a.a(view, n2);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.a.d(view, accessibilityEvent);
        }
    }

}

