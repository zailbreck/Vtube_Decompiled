/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.ActionBar
 *  android.app.Activity
 *  android.app.Dialog
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnKeyListener
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.KeyEvent
 *  android.view.KeyEvent$Callback
 *  android.view.KeyEvent$DispatcherState
 *  android.view.View
 *  android.view.Window
 *  android.view.Window$Callback
 *  java.lang.Object
 *  java.lang.reflect.Field
 *  java.lang.reflect.Method
 */
package e.e.k;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import e.e.k.u;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class d {
    private static boolean a;
    private static Method b;
    private static boolean c;
    private static Field d;

    /*
     * Exception decompiling
     */
    private static DialogInterface.OnKeyListener a(Dialog var0) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl25.1 : ACONST_NULL : trying to set 0 previously set to 1
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
    private static boolean a(ActionBar var0, KeyEvent var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl36.1 : ICONST_0 : trying to set 0 previously set to 1
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

    private static boolean a(Activity activity, KeyEvent keyEvent) {
        activity.onUserInteraction();
        Window window = activity.getWindow();
        if (window.hasFeature(8)) {
            ActionBar actionBar = activity.getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null && d.a(actionBar, keyEvent)) {
                return true;
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View view = window.getDecorView();
        if (u.a(view, keyEvent)) {
            return true;
        }
        KeyEvent.DispatcherState dispatcherState = view != null ? view.getKeyDispatcherState() : null;
        return keyEvent.dispatch((KeyEvent.Callback)activity, dispatcherState, (Object)activity);
    }

    private static boolean a(Dialog dialog, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener = d.a(dialog);
        if (onKeyListener != null && onKeyListener.onKey((DialogInterface)dialog, keyEvent.getKeyCode(), keyEvent)) {
            return true;
        }
        Window window = dialog.getWindow();
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View view = window.getDecorView();
        if (u.a(view, keyEvent)) {
            return true;
        }
        KeyEvent.DispatcherState dispatcherState = view != null ? view.getKeyDispatcherState() : null;
        return keyEvent.dispatch((KeyEvent.Callback)dialog, dispatcherState, (Object)dialog);
    }

    public static boolean a(View view, KeyEvent keyEvent) {
        return u.b(view, keyEvent);
    }

    public static boolean a(a a2, View view, Window.Callback callback, KeyEvent keyEvent) {
        boolean bl;
        block8 : {
            block7 : {
                if (a2 == null) {
                    return false;
                }
                if (Build.VERSION.SDK_INT >= 28) {
                    return a2.superDispatchKeyEvent(keyEvent);
                }
                if (callback instanceof Activity) {
                    return d.a((Activity)callback, keyEvent);
                }
                if (callback instanceof Dialog) {
                    return d.a((Dialog)callback, keyEvent);
                }
                if (view != null && u.a(view, keyEvent)) break block7;
                boolean bl2 = a2.superDispatchKeyEvent(keyEvent);
                bl = false;
                if (!bl2) break block8;
            }
            bl = true;
        }
        return bl;
    }

    public static interface a {
        public boolean superDispatchKeyEvent(KeyEvent var1);
    }

}

