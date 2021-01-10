/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.hardware.display.DisplayManager
 *  android.hardware.display.DisplayManager$DisplayListener
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.util.Log
 *  android.view.Display
 *  java.lang.Class
 *  java.lang.IllegalAccessException
 *  java.lang.NoSuchFieldException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.reflect.Field
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Iterator
 */
package com.pichillilorenzo.flutter_inappwebview.InAppWebView;

import android.annotation.TargetApi;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import android.view.Display;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

@TargetApi(value=19)
public class b {
    private ArrayList<DisplayManager.DisplayListener> a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static ArrayList<DisplayManager.DisplayListener> c(DisplayManager displayManager) {
        void var1_11;
        if (Build.VERSION.SDK_INT >= 28) {
            return new ArrayList();
        }
        try {
            Field field = DisplayManager.class.getDeclaredField("mGlobal");
            field.setAccessible(true);
            Object object = field.get((Object)displayManager);
            Field field2 = object.getClass().getDeclaredField("mDisplayListeners");
            field2.setAccessible(true);
            ArrayList arrayList = (ArrayList)field2.get(object);
            Field field3 = null;
            ArrayList arrayList2 = new ArrayList();
            Iterator iterator = arrayList.iterator();
            do {
                if (!iterator.hasNext()) {
                    return arrayList2;
                }
                Object object2 = iterator.next();
                if (field3 == null) {
                    field3 = object2.getClass().getField("mListener");
                    field3.setAccessible(true);
                }
                arrayList2.add((Object)((DisplayManager.DisplayListener)field3.get(object2)));
            } while (true);
        }
        catch (IllegalAccessException illegalAccessException) {
        }
        catch (NoSuchFieldException noSuchFieldException) {
            // empty catch block
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Could not extract WebView's display listeners. ");
        stringBuilder.append((Object)var1_11);
        Log.w((String)"DisplayListenerProxy", (String)stringBuilder.toString());
        return new ArrayList();
    }

    public void a(final DisplayManager displayManager) {
        final ArrayList<DisplayManager.DisplayListener> arrayList = b.c(displayManager);
        arrayList.removeAll(this.a);
        if (arrayList.isEmpty()) {
            return;
        }
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            displayManager.unregisterDisplayListener((DisplayManager.DisplayListener)iterator.next());
            displayManager.registerDisplayListener(new DisplayManager.DisplayListener((b)this){

                public void onDisplayAdded(int n2) {
                    Iterator iterator = arrayList.iterator();
                    while (iterator.hasNext()) {
                        ((DisplayManager.DisplayListener)iterator.next()).onDisplayAdded(n2);
                    }
                }

                public void onDisplayChanged(int n2) {
                    if (displayManager.getDisplay(n2) == null) {
                        return;
                    }
                    Iterator iterator = arrayList.iterator();
                    while (iterator.hasNext()) {
                        ((DisplayManager.DisplayListener)iterator.next()).onDisplayChanged(n2);
                    }
                }

                public void onDisplayRemoved(int n2) {
                    Iterator iterator = arrayList.iterator();
                    while (iterator.hasNext()) {
                        ((DisplayManager.DisplayListener)iterator.next()).onDisplayRemoved(n2);
                    }
                }
            }, null);
        }
    }

    public void b(DisplayManager displayManager) {
        this.a = b.c(displayManager);
    }

}

