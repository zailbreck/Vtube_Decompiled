/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.res.ColorStateList
 *  android.content.res.TypedArray
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.view.InflateException
 *  android.view.Menu
 *  android.view.MenuInflater
 *  android.view.MenuItem
 *  android.view.MenuItem$OnMenuItemClickListener
 *  android.view.SubMenu
 *  android.view.View
 *  androidx.appcompat.view.menu.j
 *  androidx.appcompat.view.menu.k
 *  androidx.appcompat.widget.d0
 *  androidx.appcompat.widget.v0
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.ClassLoader
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.lang.reflect.Constructor
 *  java.lang.reflect.Method
 *  org.xmlpull.v1.XmlPullParser
 */
package e.a.n;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Log;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.k;
import androidx.appcompat.widget.d0;
import androidx.appcompat.widget.v0;
import e.a.j;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;

public class g
extends MenuInflater {
    static final Class<?>[] e = new Class[]{Context.class};
    static final Class<?>[] f = e;
    final Object[] a;
    final Object[] b;
    Context c;
    private Object d;

    public g(Context context) {
        super(context);
        this.c = context;
        this.a = new Object[]{context};
        this.b = this.a;
    }

    private Object a(Object object) {
        if (object instanceof Activity) {
            return object;
        }
        if (object instanceof ContextWrapper) {
            object = g.super.a((Object)((ContextWrapper)object).getBaseContext());
        }
        return object;
    }

    private void a(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) {
        b b2 = (g)this.new b(menu);
        int n2 = xmlPullParser.getEventType();
        do {
            if (n2 != 2) continue;
            String string = xmlPullParser.getName();
            if (string.equals((Object)"menu")) {
                n2 = xmlPullParser.next();
                break;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Expecting menu, got ");
            stringBuilder.append(string);
            throw new RuntimeException(stringBuilder.toString());
        } while ((n2 = xmlPullParser.next()) != 1);
        int n3 = n2;
        String string = null;
        boolean bl = false;
        boolean bl2 = false;
        while (!bl) {
            if (n3 != 1) {
                if (n3 != 2) {
                    if (n3 == 3) {
                        String string2 = xmlPullParser.getName();
                        if (bl2 && string2.equals(string)) {
                            bl2 = false;
                            string = null;
                        } else if (string2.equals((Object)"group")) {
                            b2.d();
                        } else if (string2.equals((Object)"item")) {
                            if (!b2.c()) {
                                e.e.k.b b3 = b2.A;
                                if (b3 != null && b3.a()) {
                                    b2.b();
                                } else {
                                    b2.a();
                                }
                            }
                        } else if (string2.equals((Object)"menu")) {
                            bl = true;
                        }
                    }
                } else if (!bl2) {
                    String string3 = xmlPullParser.getName();
                    if (string3.equals((Object)"group")) {
                        b2.a(attributeSet);
                    } else if (string3.equals((Object)"item")) {
                        b2.b(attributeSet);
                    } else if (string3.equals((Object)"menu")) {
                        g.super.a(xmlPullParser, attributeSet, (Menu)b2.b());
                    } else {
                        string = string3;
                        bl2 = true;
                    }
                }
                n3 = xmlPullParser.next();
                continue;
            }
            throw new RuntimeException("Unexpected end of document");
        }
    }

    Object a() {
        if (this.d == null) {
            this.d = this.a((Object)this.c);
        }
        return this.d;
    }

    /*
     * Exception decompiling
     */
    public void inflate(int var1, Menu var2_2) {
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

    private static class a
    implements MenuItem.OnMenuItemClickListener {
        private static final Class<?>[] c = new Class[]{MenuItem.class};
        private Object a;
        private Method b;

        public a(Object object, String string) {
            this.a = object;
            Class class_ = object.getClass();
            try {
                this.b = class_.getMethod(string, c);
                return;
            }
            catch (Exception exception) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Couldn't resolve menu item onClick handler ");
                stringBuilder.append(string);
                stringBuilder.append(" in class ");
                stringBuilder.append(class_.getName());
                InflateException inflateException = new InflateException(stringBuilder.toString());
                inflateException.initCause((Throwable)exception);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.b.getReturnType() == Boolean.TYPE) {
                    return (Boolean)this.b.invoke(this.a, new Object[]{menuItem});
                }
                this.b.invoke(this.a, new Object[]{menuItem});
                return true;
            }
            catch (Exception exception) {
                throw new RuntimeException((Throwable)exception);
            }
        }
    }

    private class b {
        e.e.k.b A;
        private CharSequence B;
        private CharSequence C;
        private ColorStateList D = null;
        private PorterDuff.Mode E = null;
        private Menu a;
        private int b;
        private int c;
        private int d;
        private int e;
        private boolean f;
        private boolean g;
        private boolean h;
        private int i;
        private int j;
        private CharSequence k;
        private CharSequence l;
        private int m;
        private char n;
        private int o;
        private char p;
        private int q;
        private int r;
        private boolean s;
        private boolean t;
        private boolean u;
        private int v;
        private int w;
        private String x;
        private String y;
        private String z;

        public b(Menu menu) {
            this.a = menu;
            this.d();
        }

        private char a(String string) {
            if (string == null) {
                return '\u0000';
            }
            return string.charAt(0);
        }

        private <T> T a(String string, Class<?>[] arrclass, Object[] arrobject) {
            Object object;
            try {
                Constructor constructor = Class.forName((String)string, (boolean)false, (ClassLoader)g.this.c.getClassLoader()).getConstructor(arrclass);
                constructor.setAccessible(true);
                object = constructor.newInstance(arrobject);
            }
            catch (Exception exception) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Cannot instantiate class: ");
                stringBuilder.append(string);
                Log.w((String)"SupportMenuInflater", (String)stringBuilder.toString(), (Throwable)exception);
                return null;
            }
            return (T)object;
        }

        private void a(MenuItem menuItem) {
            ColorStateList colorStateList;
            int n2;
            boolean bl;
            e.e.k.b b2;
            MenuItem menuItem2 = menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u);
            boolean bl2 = this.r >= 1;
            menuItem2.setCheckable(bl2).setTitleCondensed(this.l).setIcon(this.m);
            int n3 = this.v;
            if (n3 >= 0) {
                menuItem.setShowAsAction(n3);
            }
            if (this.z != null) {
                if (!g.this.c.isRestricted()) {
                    menuItem.setOnMenuItemClickListener((MenuItem.OnMenuItemClickListener)new a(g.this.a(), this.z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (bl = menuItem instanceof androidx.appcompat.view.menu.j) {
                (androidx.appcompat.view.menu.j)menuItem;
            }
            if (this.r >= 2) {
                if (bl) {
                    ((androidx.appcompat.view.menu.j)menuItem).c(true);
                } else if (menuItem instanceof k) {
                    ((k)menuItem).a(true);
                }
            }
            String string = this.x;
            boolean bl3 = false;
            if (string != null) {
                menuItem.setActionView((View)b.super.a(string, g.e, g.this.a));
                bl3 = true;
            }
            if ((n2 = this.w) > 0) {
                if (!bl3) {
                    menuItem.setActionView(n2);
                } else {
                    Log.w((String)"SupportMenuInflater", (String)"Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            if ((b2 = this.A) != null) {
                e.e.k.g.a(menuItem, b2);
            }
            e.e.k.g.a(menuItem, this.B);
            e.e.k.g.b(menuItem, this.C);
            e.e.k.g.a(menuItem, this.n, this.o);
            e.e.k.g.b(menuItem, this.p, this.q);
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                e.e.k.g.a(menuItem, mode);
            }
            if ((colorStateList = this.D) != null) {
                e.e.k.g.a(menuItem, colorStateList);
            }
        }

        public void a() {
            this.h = true;
            this.a(this.a.add(this.b, this.i, this.j, this.k));
        }

        public void a(AttributeSet attributeSet) {
            TypedArray typedArray = g.this.c.obtainStyledAttributes(attributeSet, j.MenuGroup);
            this.b = typedArray.getResourceId(j.MenuGroup_android_id, 0);
            this.c = typedArray.getInt(j.MenuGroup_android_menuCategory, 0);
            this.d = typedArray.getInt(j.MenuGroup_android_orderInCategory, 0);
            this.e = typedArray.getInt(j.MenuGroup_android_checkableBehavior, 0);
            this.f = typedArray.getBoolean(j.MenuGroup_android_visible, true);
            this.g = typedArray.getBoolean(j.MenuGroup_android_enabled, true);
            typedArray.recycle();
        }

        public SubMenu b() {
            this.h = true;
            SubMenu subMenu = this.a.addSubMenu(this.b, this.i, this.j, this.k);
            this.a(subMenu.getItem());
            return subMenu;
        }

        public void b(AttributeSet attributeSet) {
            v0 v02 = v0.a((Context)g.this.c, (AttributeSet)attributeSet, (int[])j.MenuItem);
            this.i = v02.g(j.MenuItem_android_id, 0);
            int n2 = v02.d(j.MenuItem_android_menuCategory, this.c);
            int n3 = v02.d(j.MenuItem_android_orderInCategory, this.d);
            this.j = n2 & -65536 | n3 & 65535;
            this.k = v02.e(j.MenuItem_android_title);
            this.l = v02.e(j.MenuItem_android_titleCondensed);
            this.m = v02.g(j.MenuItem_android_icon, 0);
            this.n = b.super.a(v02.d(j.MenuItem_android_alphabeticShortcut));
            this.o = v02.d(j.MenuItem_alphabeticModifiers, 4096);
            this.p = b.super.a(v02.d(j.MenuItem_android_numericShortcut));
            this.q = v02.d(j.MenuItem_numericModifiers, 4096);
            int n4 = v02.g(j.MenuItem_android_checkable) ? (int)(v02.a(j.MenuItem_android_checkable, false) ? 1 : 0) : this.e;
            this.r = n4;
            this.s = v02.a(j.MenuItem_android_checked, false);
            this.t = v02.a(j.MenuItem_android_visible, this.f);
            this.u = v02.a(j.MenuItem_android_enabled, this.g);
            this.v = v02.d(j.MenuItem_showAsAction, -1);
            this.z = v02.d(j.MenuItem_android_onClick);
            this.w = v02.g(j.MenuItem_actionLayout, 0);
            this.x = v02.d(j.MenuItem_actionViewClass);
            this.y = v02.d(j.MenuItem_actionProviderClass);
            boolean bl = this.y != null;
            if (bl && this.w == 0 && this.x == null) {
                this.A = (e.e.k.b)b.super.a(this.y, g.f, g.this.b);
            } else {
                if (bl) {
                    Log.w((String)"SupportMenuInflater", (String)"Ignoring attribute 'actionProviderClass'. Action view already specified.");
                }
                this.A = null;
            }
            this.B = v02.e(j.MenuItem_contentDescription);
            this.C = v02.e(j.MenuItem_tooltipText);
            this.E = v02.g(j.MenuItem_iconTintMode) ? d0.a((int)v02.d(j.MenuItem_iconTintMode, -1), (PorterDuff.Mode)this.E) : null;
            this.D = v02.g(j.MenuItem_iconTint) ? v02.a(j.MenuItem_iconTint) : null;
            v02.a();
            this.h = false;
        }

        public boolean c() {
            return this.h;
        }

        public void d() {
            this.b = 0;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = true;
            this.g = true;
        }
    }

}

