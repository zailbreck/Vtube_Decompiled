/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.Log
 *  android.view.View
 *  android.view.ViewParent
 *  java.lang.AbstractMethodError
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package e.e.k;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import e.e.k.m;
import e.e.k.n;
import e.e.k.o;

public final class x {
    public static void a(ViewParent viewParent, View view, int n2) {
        if (viewParent instanceof m) {
            ((m)viewParent).a(view, n2);
            return;
        }
        if (n2 == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onStopNestedScroll(view);
                    return;
                }
                catch (AbstractMethodError abstractMethodError) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("ViewParent ");
                    stringBuilder.append((Object)viewParent);
                    stringBuilder.append(" does not implement interface method onStopNestedScroll");
                    Log.e((String)"ViewParentCompat", (String)stringBuilder.toString(), (Throwable)abstractMethodError);
                    return;
                }
            }
            if (viewParent instanceof o) {
                ((o)viewParent).onStopNestedScroll(view);
            }
        }
    }

    public static void a(ViewParent viewParent, View view, int n2, int n3, int n4, int n5, int n6, int[] arrn) {
        if (viewParent instanceof n) {
            ((n)viewParent).a(view, n2, n3, n4, n5, n6, arrn);
            return;
        }
        arrn[0] = n4 + arrn[0];
        arrn[1] = n5 + arrn[1];
        if (viewParent instanceof m) {
            ((m)viewParent).a(view, n2, n3, n4, n5, n6);
            return;
        }
        if (n6 == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScroll(view, n2, n3, n4, n5);
                    return;
                }
                catch (AbstractMethodError abstractMethodError) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("ViewParent ");
                    stringBuilder.append((Object)viewParent);
                    stringBuilder.append(" does not implement interface method onNestedScroll");
                    Log.e((String)"ViewParentCompat", (String)stringBuilder.toString(), (Throwable)abstractMethodError);
                    return;
                }
            }
            if (viewParent instanceof o) {
                ((o)viewParent).onNestedScroll(view, n2, n3, n4, n5);
            }
        }
    }

    public static void a(ViewParent viewParent, View view, int n2, int n3, int[] arrn, int n4) {
        if (viewParent instanceof m) {
            ((m)viewParent).a(view, n2, n3, arrn, n4);
            return;
        }
        if (n4 == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedPreScroll(view, n2, n3, arrn);
                    return;
                }
                catch (AbstractMethodError abstractMethodError) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("ViewParent ");
                    stringBuilder.append((Object)viewParent);
                    stringBuilder.append(" does not implement interface method onNestedPreScroll");
                    Log.e((String)"ViewParentCompat", (String)stringBuilder.toString(), (Throwable)abstractMethodError);
                    return;
                }
            }
            if (viewParent instanceof o) {
                ((o)viewParent).onNestedPreScroll(view, n2, n3, arrn);
            }
        }
    }

    public static void a(ViewParent viewParent, View view, View view2, int n2, int n3) {
        if (viewParent instanceof m) {
            ((m)viewParent).a(view, view2, n2, n3);
            return;
        }
        if (n3 == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScrollAccepted(view, view2, n2);
                    return;
                }
                catch (AbstractMethodError abstractMethodError) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("ViewParent ");
                    stringBuilder.append((Object)viewParent);
                    stringBuilder.append(" does not implement interface method onNestedScrollAccepted");
                    Log.e((String)"ViewParentCompat", (String)stringBuilder.toString(), (Throwable)abstractMethodError);
                    return;
                }
            }
            if (viewParent instanceof o) {
                ((o)viewParent).onNestedScrollAccepted(view, view2, n2);
            }
        }
    }

    public static boolean a(ViewParent viewParent, View view, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                boolean bl = viewParent.onNestedPreFling(view, f2, f3);
                return bl;
            }
            catch (AbstractMethodError abstractMethodError) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ViewParent ");
                stringBuilder.append((Object)viewParent);
                stringBuilder.append(" does not implement interface method onNestedPreFling");
                Log.e((String)"ViewParentCompat", (String)stringBuilder.toString(), (Throwable)abstractMethodError);
            }
        } else if (viewParent instanceof o) {
            return ((o)viewParent).onNestedPreFling(view, f2, f3);
        }
        return false;
    }

    public static boolean a(ViewParent viewParent, View view, float f2, float f3, boolean bl) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                boolean bl2 = viewParent.onNestedFling(view, f2, f3, bl);
                return bl2;
            }
            catch (AbstractMethodError abstractMethodError) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("ViewParent ");
                stringBuilder.append((Object)viewParent);
                stringBuilder.append(" does not implement interface method onNestedFling");
                Log.e((String)"ViewParentCompat", (String)stringBuilder.toString(), (Throwable)abstractMethodError);
            }
        } else if (viewParent instanceof o) {
            return ((o)viewParent).onNestedFling(view, f2, f3, bl);
        }
        return false;
    }

    public static boolean b(ViewParent viewParent, View view, View view2, int n2, int n3) {
        if (viewParent instanceof m) {
            return ((m)viewParent).b(view, view2, n2, n3);
        }
        if (n3 == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    boolean bl = viewParent.onStartNestedScroll(view, view2, n2);
                    return bl;
                }
                catch (AbstractMethodError abstractMethodError) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("ViewParent ");
                    stringBuilder.append((Object)viewParent);
                    stringBuilder.append(" does not implement interface method onStartNestedScroll");
                    Log.e((String)"ViewParentCompat", (String)stringBuilder.toString(), (Throwable)abstractMethodError);
                }
            } else if (viewParent instanceof o) {
                return ((o)viewParent).onStartNestedScroll(view, view2, n2);
            }
        }
        return false;
    }
}

