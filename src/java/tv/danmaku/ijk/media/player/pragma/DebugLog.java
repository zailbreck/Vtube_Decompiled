/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.Locale
 */
package tv.danmaku.ijk.media.player.pragma;

import android.util.Log;
import java.util.Locale;

public class DebugLog {
    public static int level = 4;

    public static void d(String string2, String string3) {
        if (level <= 3) {
            Log.d((String)string2, (String)string3);
        }
    }

    public static void d(String string2, String string3, Throwable throwable) {
        if (level <= 3) {
            Log.d((String)string2, (String)string3, (Throwable)throwable);
        }
    }

    public static /* varargs */ void dfmt(String string2, String string3, Object ... arrobject) {
        if (level <= 3) {
            Log.d((String)string2, (String)String.format((Locale)Locale.US, (String)string3, (Object[])arrobject));
        }
    }

    public static void e(String string2, String string3) {
        if (level <= 6) {
            Log.e((String)string2, (String)string3);
        }
    }

    public static void e(String string2, String string3, Throwable throwable) {
        if (level <= 6) {
            Log.e((String)string2, (String)string3, (Throwable)throwable);
        }
    }

    public static /* varargs */ void efmt(String string2, String string3, Object ... arrobject) {
        if (level <= 6) {
            Log.e((String)string2, (String)String.format((Locale)Locale.US, (String)string3, (Object[])arrobject));
        }
    }

    public static void i(String string2, String string3) {
        if (level <= 4) {
            Log.i((String)string2, (String)string3);
        }
    }

    public static void i(String string2, String string3, Throwable throwable) {
        if (level <= 4) {
            Log.i((String)string2, (String)string3, (Throwable)throwable);
        }
    }

    public static /* varargs */ void ifmt(String string2, String string3, Object ... arrobject) {
        if (level <= 4) {
            Log.i((String)string2, (String)String.format((Locale)Locale.US, (String)string3, (Object[])arrobject));
        }
    }

    public static void printCause(Throwable throwable) {
        if (level <= 6) {
            Throwable throwable2 = throwable.getCause();
            if (throwable2 != null) {
                throwable = throwable2;
            }
            DebugLog.printStackTrace(throwable);
        }
    }

    public static void printStackTrace(Throwable throwable) {
        if (level <= 6) {
            throwable.printStackTrace();
        }
    }

    public static void setLogLevel(int n2) {
        level = n2;
    }

    public static void v(String string2, String string3) {
        if (level <= 2) {
            Log.v((String)string2, (String)string3);
        }
    }

    public static void v(String string2, String string3, Throwable throwable) {
        if (level <= 2) {
            Log.v((String)string2, (String)string3, (Throwable)throwable);
        }
    }

    public static /* varargs */ void vfmt(String string2, String string3, Object ... arrobject) {
        if (level <= 2) {
            Log.v((String)string2, (String)String.format((Locale)Locale.US, (String)string3, (Object[])arrobject));
        }
    }

    public static void w(String string2, String string3) {
        if (level <= 5) {
            Log.w((String)string2, (String)string3);
        }
    }

    public static void w(String string2, String string3, Throwable throwable) {
        if (level <= 5) {
            Log.w((String)string2, (String)string3, (Throwable)throwable);
        }
    }

    public static /* varargs */ void wfmt(String string2, String string3, Object ... arrobject) {
        if (level <= 5) {
            Log.w((String)string2, (String)String.format((Locale)Locale.US, (String)string3, (Object[])arrobject));
        }
    }
}

