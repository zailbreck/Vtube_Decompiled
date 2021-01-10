/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.SharedPreferences
 *  android.content.SharedPreferences$Editor
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 */
package f.f.a.e.f;

import android.content.Context;
import android.content.SharedPreferences;

public final class q {
    public static void a(Context context, String string, Object object) {
        String string2 = object.getClass().getSimpleName();
        if (context == null) {
            return;
        }
        SharedPreferences.Editor editor = context.getApplicationContext().getSharedPreferences("share_date", 0).edit();
        if ("String".equals((Object)string2)) {
            editor.putString(string, (String)object);
        } else if ("Integer".equals((Object)string2)) {
            editor.putInt(string, ((Integer)object).intValue());
        } else if ("Boolean".equals((Object)string2)) {
            editor.putBoolean(string, ((Boolean)object).booleanValue());
        } else if ("Float".equals((Object)string2)) {
            editor.putFloat(string, ((Float)object).floatValue());
        } else if ("Long".equals((Object)string2)) {
            editor.putLong(string, ((Long)object).longValue());
        }
        editor.apply();
    }

    public static Object b(Context context, String string, Object object) {
        if (context == null) {
            return object;
        }
        String string2 = object != null ? object.getClass().getSimpleName() : "";
        SharedPreferences sharedPreferences = context.getSharedPreferences("share_date", 0);
        if ("String".equals((Object)string2)) {
            return sharedPreferences.getString(string, (String)object);
        }
        if ("Integer".equals((Object)string2)) {
            return sharedPreferences.getInt(string, ((Integer)object).intValue());
        }
        if ("Boolean".equals((Object)string2)) {
            return sharedPreferences.getBoolean(string, ((Boolean)object).booleanValue());
        }
        if ("Float".equals((Object)string2)) {
            return Float.valueOf((float)sharedPreferences.getFloat(string, ((Float)object).floatValue()));
        }
        if ("Long".equals((Object)string2)) {
            return sharedPreferences.getLong(string, ((Long)object).longValue());
        }
        return object;
    }
}

