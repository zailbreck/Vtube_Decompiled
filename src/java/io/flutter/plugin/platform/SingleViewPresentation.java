/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.Presentation
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.graphics.Rect
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.util.Log
 *  android.view.Display
 *  android.view.Gravity
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.View$OnFocusChangeListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 *  android.view.WindowManager
 *  android.view.WindowManager$LayoutParams
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.inputmethod.InputMethodManager
 *  android.widget.FrameLayout
 *  androidx.annotation.Keep
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.InvocationHandler
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.lang.reflect.Proxy
 */
package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.app.Presentation;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import io.flutter.plugin.platform.AccessibilityEventsDelegate;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

@TargetApi(value=17)
@Keep
class SingleViewPresentation
extends Presentation {
    private final AccessibilityEventsDelegate accessibilityEventsDelegate;
    private FrameLayout container;
    private Object createParams;
    private final View.OnFocusChangeListener focusChangeListener;
    private AccessibilityDelegatingFrameLayout rootView;
    private boolean startFocused = false;
    private PresentationState state;
    private final PlatformViewFactory viewFactory;
    private int viewId;

    public SingleViewPresentation(Context context, Display display, AccessibilityEventsDelegate accessibilityEventsDelegate, PresentationState presentationState, View.OnFocusChangeListener onFocusChangeListener, boolean bl) {
        super((Context)new ImmContext(context), display);
        this.accessibilityEventsDelegate = accessibilityEventsDelegate;
        this.viewFactory = null;
        this.state = presentationState;
        this.focusChangeListener = onFocusChangeListener;
        this.getWindow().setFlags(8, 8);
        this.startFocused = bl;
    }

    public SingleViewPresentation(Context context, Display display, PlatformViewFactory platformViewFactory, AccessibilityEventsDelegate accessibilityEventsDelegate, int n2, Object object, View.OnFocusChangeListener onFocusChangeListener) {
        super((Context)new ImmContext(context), display);
        this.viewFactory = platformViewFactory;
        this.accessibilityEventsDelegate = accessibilityEventsDelegate;
        this.viewId = n2;
        this.createParams = object;
        this.focusChangeListener = onFocusChangeListener;
        this.state = new PresentationState();
        this.getWindow().setFlags(8, 8);
        if (Build.VERSION.SDK_INT >= 19) {
            this.getWindow().setType(2030);
        }
    }

    public PresentationState detachState() {
        this.container.removeAllViews();
        this.rootView.removeAllViews();
        return this.state;
    }

    public PlatformView getView() {
        if (this.state.platformView == null) {
            return null;
        }
        return this.state.platformView;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.getWindow().setBackgroundDrawable((Drawable)new ColorDrawable(0));
        if (this.state.fakeWindowViewGroup == null) {
            this.state.fakeWindowViewGroup = new FakeWindowViewGroup(this.getContext());
        }
        if (this.state.windowManagerHandler == null) {
            WindowManager windowManager = (WindowManager)this.getContext().getSystemService("window");
            PresentationState presentationState = this.state;
            presentationState.windowManagerHandler = new WindowManagerHandler(windowManager, presentationState.fakeWindowViewGroup);
        }
        this.container = new FrameLayout(this.getContext());
        PresentationContext presentationContext = new PresentationContext(this.getContext(), this.state.windowManagerHandler);
        if (this.state.platformView == null) {
            this.state.platformView = this.viewFactory.create((Context)presentationContext, this.viewId, this.createParams);
        }
        View view = this.state.platformView.getView();
        this.container.addView(view);
        this.rootView = new AccessibilityDelegatingFrameLayout(this.getContext(), this.accessibilityEventsDelegate, view);
        this.rootView.addView((View)this.container);
        this.rootView.addView((View)this.state.fakeWindowViewGroup);
        view.setOnFocusChangeListener(this.focusChangeListener);
        this.rootView.setFocusableInTouchMode(true);
        if (this.startFocused) {
            view.requestFocus();
        } else {
            this.rootView.requestFocus();
        }
        this.setContentView((View)this.rootView);
    }

    private static class AccessibilityDelegatingFrameLayout
    extends FrameLayout {
        private final AccessibilityEventsDelegate accessibilityEventsDelegate;
        private final View embeddedView;

        public AccessibilityDelegatingFrameLayout(Context context, AccessibilityEventsDelegate accessibilityEventsDelegate, View view) {
            super(context);
            this.accessibilityEventsDelegate = accessibilityEventsDelegate;
            this.embeddedView = view;
        }

        public boolean requestSendAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.accessibilityEventsDelegate.requestSendAccessibilityEvent(this.embeddedView, view, accessibilityEvent);
        }
    }

    static class FakeWindowViewGroup
    extends ViewGroup {
        private final Rect childRect = new Rect();
        private final Rect viewBounds = new Rect();

        public FakeWindowViewGroup(Context context) {
            super(context);
        }

        private static int atMost(int n2) {
            return View.MeasureSpec.makeMeasureSpec((int)View.MeasureSpec.getSize((int)n2), (int)Integer.MIN_VALUE);
        }

        protected void onLayout(boolean bl, int n2, int n3, int n4, int n5) {
            for (int i2 = 0; i2 < this.getChildCount(); ++i2) {
                View view = this.getChildAt(i2);
                WindowManager.LayoutParams layoutParams = (WindowManager.LayoutParams)view.getLayoutParams();
                this.viewBounds.set(n2, n3, n4, n5);
                Gravity.apply((int)layoutParams.gravity, (int)view.getMeasuredWidth(), (int)view.getMeasuredHeight(), (Rect)this.viewBounds, (int)layoutParams.x, (int)layoutParams.y, (Rect)this.childRect);
                Rect rect = this.childRect;
                view.layout(rect.left, rect.top, rect.right, rect.bottom);
            }
        }

        protected void onMeasure(int n2, int n3) {
            for (int i2 = 0; i2 < this.getChildCount(); ++i2) {
                this.getChildAt(i2).measure(FakeWindowViewGroup.atMost(n2), FakeWindowViewGroup.atMost(n3));
            }
            super.onMeasure(n2, n3);
        }
    }

    private static class ImmContext
    extends ContextWrapper {
        private final InputMethodManager inputMethodManager;

        ImmContext(Context context) {
            super(context, null);
        }

        private ImmContext(Context context, InputMethodManager inputMethodManager) {
            super(context);
            if (inputMethodManager == null) {
                inputMethodManager = (InputMethodManager)context.getSystemService("input_method");
            }
            this.inputMethodManager = inputMethodManager;
        }

        public Context createDisplayContext(Display display) {
            return new ImmContext(super.createDisplayContext(display), this.inputMethodManager);
        }

        public Object getSystemService(String string2) {
            if ("input_method".equals((Object)string2)) {
                return this.inputMethodManager;
            }
            return super.getSystemService(string2);
        }
    }

    private static class PresentationContext
    extends ContextWrapper {
        private WindowManager windowManager;
        private final WindowManagerHandler windowManagerHandler;

        PresentationContext(Context context, WindowManagerHandler windowManagerHandler) {
            super(context);
            this.windowManagerHandler = windowManagerHandler;
        }

        private WindowManager getWindowManager() {
            if (this.windowManager == null) {
                this.windowManager = this.windowManagerHandler.getWindowManager();
            }
            return this.windowManager;
        }

        public Object getSystemService(String string2) {
            if ("window".equals((Object)string2)) {
                return PresentationContext.super.getWindowManager();
            }
            return super.getSystemService(string2);
        }
    }

    static class PresentationState {
        private FakeWindowViewGroup fakeWindowViewGroup;
        private PlatformView platformView;
        private WindowManagerHandler windowManagerHandler;

        PresentationState() {
        }
    }

    static class WindowManagerHandler
    implements InvocationHandler {
        private static final String TAG = "PlatformViewsController";
        private final WindowManager delegate;
        FakeWindowViewGroup fakeWindowRootView;

        WindowManagerHandler(WindowManager windowManager, FakeWindowViewGroup fakeWindowViewGroup) {
            this.delegate = windowManager;
            this.fakeWindowRootView = fakeWindowViewGroup;
        }

        private void addView(Object[] arrobject) {
            FakeWindowViewGroup fakeWindowViewGroup = this.fakeWindowRootView;
            if (fakeWindowViewGroup == null) {
                Log.w((String)TAG, (String)"Embedded view called addView while detached from presentation");
                return;
            }
            fakeWindowViewGroup.addView((View)arrobject[0], (ViewGroup.LayoutParams)((WindowManager.LayoutParams)arrobject[1]));
        }

        private void removeView(Object[] arrobject) {
            FakeWindowViewGroup fakeWindowViewGroup = this.fakeWindowRootView;
            if (fakeWindowViewGroup == null) {
                Log.w((String)TAG, (String)"Embedded view called removeView while detached from presentation");
                return;
            }
            fakeWindowViewGroup.removeView((View)arrobject[0]);
        }

        private void removeViewImmediate(Object[] arrobject) {
            if (this.fakeWindowRootView == null) {
                Log.w((String)TAG, (String)"Embedded view called removeViewImmediate while detached from presentation");
                return;
            }
            View view = (View)arrobject[0];
            view.clearAnimation();
            this.fakeWindowRootView.removeView(view);
        }

        private void updateViewLayout(Object[] arrobject) {
            FakeWindowViewGroup fakeWindowViewGroup = this.fakeWindowRootView;
            if (fakeWindowViewGroup == null) {
                Log.w((String)TAG, (String)"Embedded view called updateViewLayout while detached from presentation");
                return;
            }
            fakeWindowViewGroup.updateViewLayout((View)arrobject[0], (ViewGroup.LayoutParams)((WindowManager.LayoutParams)arrobject[1]));
        }

        public WindowManager getWindowManager() {
            return (WindowManager)Proxy.newProxyInstance((ClassLoader)WindowManager.class.getClassLoader(), (Class[])new Class[]{WindowManager.class}, (InvocationHandler)this);
        }

        public Object invoke(Object object, Method method, Object[] arrobject) {
            int n2;
            block12 : {
                String string2 = method.getName();
                switch (string2.hashCode()) {
                    default: {
                        break;
                    }
                    case 1098630473: {
                        if (!string2.equals((Object)"removeView")) break;
                        n2 = 1;
                        break block12;
                    }
                    case 931413976: {
                        if (!string2.equals((Object)"updateViewLayout")) break;
                        n2 = 3;
                        break block12;
                    }
                    case 542766184: {
                        if (!string2.equals((Object)"removeViewImmediate")) break;
                        n2 = 2;
                        break block12;
                    }
                    case -1148522778: {
                        if (!string2.equals((Object)"addView")) break;
                        n2 = 0;
                        break block12;
                    }
                }
                n2 = -1;
            }
            if (n2 != 0) {
                if (n2 != 1) {
                    if (n2 != 2) {
                        if (n2 != 3) {
                            try {
                                Object object2 = method.invoke((Object)this.delegate, arrobject);
                                return object2;
                            }
                            catch (InvocationTargetException invocationTargetException) {
                                throw invocationTargetException.getCause();
                            }
                        }
                        WindowManagerHandler.super.updateViewLayout(arrobject);
                        return null;
                    }
                    WindowManagerHandler.super.removeViewImmediate(arrobject);
                    return null;
                }
                WindowManagerHandler.super.removeView(arrobject);
                return null;
            }
            WindowManagerHandler.super.addView(arrobject);
            return null;
        }
    }

}

