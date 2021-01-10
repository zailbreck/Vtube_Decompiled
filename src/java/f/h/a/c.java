/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.database.Cursor
 *  android.database.SQLException
 *  android.database.sqlite.SQLiteCantOpenDatabaseException
 *  android.database.sqlite.SQLiteDatabase
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.HandlerThread
 *  android.os.Looper
 *  android.util.Log
 *  f.h.a.a
 *  f.h.a.b
 *  f.h.a.c$a
 *  f.h.a.c$b
 *  f.h.a.c$c
 *  f.h.a.c$d
 *  f.h.a.c$e
 *  f.h.a.c$f
 *  f.h.a.c$g
 *  f.h.a.c$h
 *  f.h.a.c$i$a
 *  f.h.a.c$i$b
 *  f.h.a.c$i$c
 *  f.h.a.d
 *  f.h.a.e.a
 *  f.h.a.f.d
 *  f.h.a.f.h
 *  io.flutter.embedding.engine.plugins.FlutterPlugin
 *  io.flutter.embedding.engine.plugins.FlutterPlugin$FlutterPluginBinding
 *  io.flutter.plugin.common.BinaryMessenger
 *  io.flutter.plugin.common.MethodCall
 *  io.flutter.plugin.common.MethodChannel
 *  io.flutter.plugin.common.MethodChannel$MethodCallHandler
 *  io.flutter.plugin.common.MethodChannel$Result
 *  java.io.File
 *  java.lang.Boolean
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package f.h.a;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import f.h.a.c;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class c
implements FlutterPlugin,
MethodChannel.MethodCallHandler {
    static final Map<String, Integer> d = new HashMap();
    private static boolean e = false;
    private static int f = 10;
    static int g = 0;
    private static final Object h = new Object();
    private static final Object i = new Object();
    static String j;
    private static int k;
    private static HandlerThread l;
    private static Handler m;
    @SuppressLint(value={"UseSparseArrays"})
    static final Map<Integer, f.h.a.a> n;
    private Context b;
    private MethodChannel c;

    static {
        k = 0;
        n = new HashMap();
    }

    static /* synthetic */ int a() {
        return k;
    }

    private f.h.a.a a(int n2) {
        return (f.h.a.a)n.get((Object)n2);
    }

    private f.h.a.a a(f.h.a.a a2, MethodCall methodCall, MethodChannel.Result result) {
        if (c.super.b(a2, (f.h.a.f.f)new f.h.a.f.d(result, c.super.a(methodCall), (Boolean)methodCall.argument("inTransaction")))) {
            return a2;
        }
        return null;
    }

    static /* synthetic */ f.h.a.a a(c c2, f.h.a.a a2, MethodCall methodCall, MethodChannel.Result result) {
        return c2.a(a2, methodCall, result);
    }

    private f.h.a.d a(MethodCall methodCall) {
        return new f.h.a.d((String)methodCall.argument("sql"), (List)methodCall.argument("arguments"));
    }

    private static String a(Object object) {
        if (object == null) {
            return null;
        }
        if (object instanceof byte[]) {
            ArrayList arrayList = new ArrayList();
            byte[] arrby = (byte[])object;
            int n2 = arrby.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                arrayList.add((Object)arrby[i2]);
            }
            return arrayList.toString();
        }
        if (object instanceof Map) {
            return c.a((Map<Object, Object>)((Map)object)).toString();
        }
        return object.toString();
    }

    private static List<Object> a(Cursor cursor, int n2) {
        ArrayList arrayList = new ArrayList(n2);
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object = c.b(cursor, i2);
            if (f.h.a.e.a.c) {
                String string;
                String string2 = null;
                if (object != null) {
                    if (object.getClass().isArray()) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("array(");
                        stringBuilder.append(object.getClass().getComponentType().getName());
                        stringBuilder.append(")");
                        string2 = stringBuilder.toString();
                    } else {
                        string2 = object.getClass().getName();
                    }
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("column ");
                stringBuilder.append(i2);
                stringBuilder.append(" ");
                stringBuilder.append(cursor.getType(i2));
                stringBuilder.append(": ");
                stringBuilder.append(object);
                if (string2 == null) {
                    string = "";
                } else {
                    StringBuilder stringBuilder2 = new StringBuilder();
                    stringBuilder2.append(" (");
                    stringBuilder2.append(string2);
                    stringBuilder2.append(")");
                    string = stringBuilder2.toString();
                }
                stringBuilder.append(string);
                Log.d((String)"Sqflite", (String)stringBuilder.toString());
            }
            arrayList.add(object);
        }
        return arrayList;
    }

    static Map a(int n2, boolean bl, boolean bl2) {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"id", (Object)n2);
        Boolean bl3 = true;
        if (bl) {
            hashMap.put((Object)"recovered", (Object)bl3);
        }
        if (bl2) {
            hashMap.put((Object)"recoveredInTransaction", (Object)bl3);
        }
        return hashMap;
    }

    private static Map<String, Object> a(Cursor cursor) {
        HashMap hashMap = new HashMap();
        String[] arrstring = cursor.getColumnNames();
        int n2 = arrstring.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            Object object;
            int n3;
            String string;
            if (f.h.a.e.a.c) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("column ");
                stringBuilder.append(i2);
                stringBuilder.append(" ");
                stringBuilder.append(cursor.getType(i2));
                Log.d((String)"Sqflite", (String)stringBuilder.toString());
            }
            if ((n3 = cursor.getType(i2)) != 0) {
                if (n3 != 1) {
                    if (n3 != 2) {
                        if (n3 != 3) {
                            if (n3 != 4) continue;
                            hashMap.put((Object)arrstring[i2], (Object)cursor.getBlob(i2));
                            continue;
                        }
                        string = arrstring[i2];
                        object = cursor.getString(i2);
                    } else {
                        string = arrstring[i2];
                        object = cursor.getDouble(i2);
                    }
                } else {
                    string = arrstring[i2];
                    object = cursor.getLong(i2);
                }
            } else {
                string = arrstring[i2];
                object = null;
            }
            hashMap.put((Object)string, object);
        }
        return hashMap;
    }

    private static Map<String, Object> a(Map<Object, Object> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object object = entry.getValue();
            Map<String, Object> map2 = object instanceof Map ? c.a((Map<Object, Object>)((Map)object)) : c.a(object);
            hashMap.put((Object)c.a(entry.getKey()), map2);
        }
        return hashMap;
    }

    private void a(Context context, BinaryMessenger binaryMessenger) {
        this.b = context;
        this.c = new MethodChannel(binaryMessenger, "com.tekartik.sqflite");
        this.c.setMethodCallHandler((MethodChannel.MethodCallHandler)this);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void a(f.h.a.a a2) {
        Object object;
        try {
            if (f.h.a.b.a((int)a2.d)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(a2.c());
                stringBuilder.append("closing database ");
                stringBuilder.append((Object)l);
                Log.d((String)"Sqflite", (String)stringBuilder.toString());
            }
            a2.a();
        }
        catch (Exception exception) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("error ");
            stringBuilder.append((Object)exception);
            stringBuilder.append(" while closing database ");
            stringBuilder.append(k);
            Log.e((String)"Sqflite", (String)stringBuilder.toString());
        }
        Object object2 = object = h;
        synchronized (object2) {
            if (n.isEmpty() && m != null) {
                if (f.h.a.b.a((int)a2.d)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(a2.c());
                    stringBuilder.append("stopping thread");
                    stringBuilder.append((Object)l);
                    Log.d((String)"Sqflite", (String)stringBuilder.toString());
                }
                l.quit();
                l = null;
                m = null;
            }
            return;
        }
    }

    static /* synthetic */ void a(c c2, f.h.a.a a2) {
        c2.a(a2);
    }

    static /* synthetic */ void a(c c2, Exception exception, f.h.a.f.f f2, f.h.a.a a2) {
        c2.a(exception, f2, a2);
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(Exception exception, f.h.a.f.f f2, f.h.a.a a2) {
        String string;
        Map map;
        if (exception instanceof SQLiteCantOpenDatabaseException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("open_failed ");
            stringBuilder.append(a2.b);
            string = stringBuilder.toString();
            map = null;
        } else {
            exception instanceof SQLException;
            string = exception.getMessage();
            map = f.h.a.f.h.a((f.h.a.f.f)f2);
        }
        f2.error("sqlite_error", string, (Object)map);
    }

    private boolean a(f.h.a.a a2, f.h.a.f.f f2) {
        if (!c.super.b(a2, f2)) {
            return false;
        }
        f2.success(null);
        return true;
    }

    static /* synthetic */ boolean a(c c2, f.h.a.a a2, f.h.a.f.f f2) {
        return c2.d(a2, f2);
    }

    static boolean a(String string) {
        return string == null || string.equals((Object)":memory:");
        {
        }
    }

    static /* synthetic */ Object b() {
        return i;
    }

    private static Object b(Cursor cursor, int n2) {
        int n3 = cursor.getType(n2);
        if (n3 != 0) {
            if (n3 != 1) {
                if (n3 != 2) {
                    if (n3 != 3) {
                        if (n3 != 4) {
                            return null;
                        }
                        return cursor.getBlob(n2);
                    }
                    return cursor.getString(n2);
                }
                return cursor.getDouble(n2);
            }
            return cursor.getLong(n2);
        }
        return null;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private boolean b(f.h.a.a a2, f.h.a.f.f f2) {
        Throwable throwable2222;
        Boolean bl;
        block5 : {
            f.h.a.d d2 = f2.a();
            if (f.h.a.b.a((int)a2.d)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(a2.c());
                stringBuilder.append((Object)d2);
                Log.d((String)"Sqflite", (String)stringBuilder.toString());
            }
            bl = f2.c();
            a2.e().execSQL(d2.c(), d2.d());
            if (!Boolean.TRUE.equals((Object)bl)) break block5;
            a2.f = true;
        }
        if (!Boolean.FALSE.equals((Object)bl)) return true;
        a2.f = false;
        return true;
        {
            catch (Throwable throwable2222) {
            }
            catch (Exception exception) {}
            {
                c.super.a(exception, f2, a2);
            }
            if (!Boolean.FALSE.equals((Object)bl)) return false;
            a2.f = false;
            return false;
        }
        if (!Boolean.FALSE.equals((Object)bl)) throw throwable2222;
        a2.f = false;
        throw throwable2222;
    }

    static /* synthetic */ boolean b(c c2, f.h.a.a a2, f.h.a.f.f f2) {
        return c2.a(a2, f2);
    }

    private f.h.a.a c(MethodCall methodCall, MethodChannel.Result result) {
        int n2 = (Integer)methodCall.argument("id");
        f.h.a.a a2 = c.super.a(n2);
        if (a2 != null) {
            return a2;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("database_closed ");
        stringBuilder.append(n2);
        result.error("sqlite_error", stringBuilder.toString(), null);
        return null;
    }

    static /* synthetic */ Object c() {
        return h;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private boolean c(f.h.a.a a2, f.h.a.f.f f2) {
        void var6_12;
        Cursor cursor;
        block16 : {
            Exception exception;
            block15 : {
                block13 : {
                    block14 : {
                        if (!c.super.b(a2, f2)) {
                            return false;
                        }
                        if (f2.b()) {
                            f2.success(null);
                            return true;
                        }
                        cursor = a2.e().rawQuery("SELECT changes(), last_insert_rowid()", null);
                        if (cursor == null) break block13;
                        if (cursor.getCount() <= 0 || !cursor.moveToFirst()) break block13;
                        if (cursor.getInt(0) != 0) break block14;
                        if (f.h.a.b.a((int)a2.d)) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append(a2.c());
                            stringBuilder.append("no changes (id was ");
                            stringBuilder.append(cursor.getLong(1));
                            stringBuilder.append(")");
                            Log.d((String)"Sqflite", (String)stringBuilder.toString());
                        }
                        f2.success(null);
                        if (cursor == null) return true;
                        cursor.close();
                        return true;
                    }
                    long l2 = cursor.getLong(1);
                    if (f.h.a.b.a((int)a2.d)) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(a2.c());
                        stringBuilder.append("inserted ");
                        stringBuilder.append(l2);
                        Log.d((String)"Sqflite", (String)stringBuilder.toString());
                    }
                    f2.success((Object)l2);
                    if (cursor == null) return true;
                    cursor.close();
                    return true;
                }
                try {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(a2.c());
                    stringBuilder.append("fail to read changes for Insert");
                    Log.e((String)"Sqflite", (String)stringBuilder.toString());
                    f2.success(null);
                    if (cursor == null) return true;
                }
                catch (Exception exception2) {
                    break block15;
                }
                cursor.close();
                return true;
                catch (Throwable throwable) {
                    cursor = null;
                    break block16;
                }
                catch (Exception exception3) {
                    exception = exception3;
                    cursor = null;
                }
            }
            try {
                c.super.a(exception, f2, a2);
                if (cursor == null) return false;
            }
            catch (Throwable throwable) {
                // empty catch block
            }
            cursor.close();
            return false;
        }
        if (cursor == null) throw var6_12;
        cursor.close();
        throw var6_12;
    }

    static /* synthetic */ boolean c(c c2, f.h.a.a a2, f.h.a.f.f f2) {
        return c2.c(a2, f2);
    }

    private void d(MethodCall methodCall, MethodChannel.Result result) {
        f.h.a.a a2 = c.super.c(methodCall, result);
        if (a2 == null) {
            return;
        }
        i i2 = new i((c)this, result, null);
        m.post((Runnable)new b((c)this, methodCall, i2, a2));
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private boolean d(f.h.a.a var1, f.h.a.f.f var2_2) {
        block15 : {
            var3_3 = var2_2.a();
            var4_4 = new ArrayList();
            if (f.h.a.b.a((int)var1.d)) {
                var5_5 = new StringBuilder();
                var5_5.append(var1.c());
                var5_5.append((Object)var3_3);
                Log.d((String)"Sqflite", (String)var5_5.toString());
            }
            var9_6 = c.e;
            var10_7 = null;
            var14_8 = var3_3.e();
            var13_9 = var1.b().rawQuery(var14_8.c(), var14_8.a());
            var15_10 = null;
            var16_11 = 0;
            try {
                while (var13_9.moveToNext()) {
                    if (var9_6) {
                        var17_16 = c.a(var13_9);
                        if (f.h.a.b.a((int)var1.d)) {
                            var18_12 = new StringBuilder();
                            var18_12.append(var1.c());
                            var18_12.append(c.a(var17_16));
                            Log.d((String)"Sqflite", (String)var18_12.toString());
                        }
                        var4_4.add(var17_16);
                        continue;
                    }
                    if (var10_7 == null) {
                        var23_13 = new ArrayList();
                        var24_15 = new HashMap();
                        var25_14 = var13_9.getColumnCount();
                        var24_15.put((Object)"columns", (Object)Arrays.asList((Object[])var13_9.getColumnNames()));
                        var24_15.put((Object)"rows", (Object)var23_13);
                        var15_10 = var23_13;
                        var10_7 = var24_15;
                        var16_11 = var25_14;
                    }
                    var15_10.add(c.a(var13_9, var16_11));
                }
                if (var9_6) {
                    var2_2.success((Object)var4_4);
                } else {
                    if (var10_7 == null) {
                        var10_7 = new HashMap();
                    }
                    var2_2.success((Object)var10_7);
                }
                if (var13_9 == null) return true;
            }
            catch (Throwable var12_17) {
                break block15;
            }
            catch (Exception var11_20) {
                var10_7 = var13_9;
                ** GOTO lbl-1000
            }
            var13_9.close();
            return true;
            catch (Throwable var12_18) {
                var13_9 = var10_7;
                break block15;
            }
            catch (Exception var11_21) {
                // empty catch block
            }
lbl-1000: // 2 sources:
            {
                c.super.a((Exception)var11_22, var2_2, var1);
                if (var10_7 == null) return false;
            }
            var10_7.close();
            return false;
        }
        if (var13_9 == null) throw var12_19;
        var13_9.close();
        throw var12_19;
    }

    static /* synthetic */ boolean d(c c2, f.h.a.a a2, f.h.a.f.f f2) {
        return c2.e(a2, f2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void e(MethodCall methodCall, MethodChannel.Result result) {
        Object object;
        int n2 = (Integer)methodCall.argument("id");
        f.h.a.a a2 = c.super.c(methodCall, result);
        if (a2 == null) {
            return;
        }
        if (f.h.a.b.a((int)a2.d)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(a2.c());
            stringBuilder.append("closing ");
            stringBuilder.append(n2);
            stringBuilder.append(" ");
            stringBuilder.append(a2.b);
            Log.d((String)"Sqflite", (String)stringBuilder.toString());
        }
        String string = a2.b;
        Object object2 = object = h;
        synchronized (object2) {
            n.remove((Object)n2);
            if (a2.a) {
                d.remove((Object)string);
            }
        }
        i i2 = new i((c)this, result, null);
        m.post((Runnable)new g((c)this, a2, i2));
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private boolean e(f.h.a.a var1, f.h.a.f.f var2_2) {
        block12 : {
            block11 : {
                if (!c.super.b(var1, var2_2)) {
                    return false;
                }
                var3_3 = var2_2.b();
                var4_4 = null;
                if (var3_3) {
                    var2_2.success(null);
                    return true;
                }
                var7_5 = var1.e().rawQuery("SELECT changes()", null);
                if (var7_5 == null) break block11;
                if (var7_5.getCount() <= 0 || !var7_5.moveToFirst()) break block11;
                var12_6 = var7_5.getInt(0);
                if (f.h.a.b.a((int)var1.d)) {
                    var13_7 = new StringBuilder();
                    var13_7.append(var1.c());
                    var13_7.append("changed ");
                    var13_7.append(var12_6);
                    Log.d((String)"Sqflite", (String)var13_7.toString());
                }
                var2_2.success((Object)var12_6);
                if (var7_5 == null) return true;
                var7_5.close();
                return true;
            }
            try {
                var8_14 = new StringBuilder();
                var8_14.append(var1.c());
                var8_14.append("fail to read changes for Update/Delete");
                Log.e((String)"Sqflite", (String)var8_14.toString());
                var2_2.success(null);
                if (var7_5 == null) return true;
            }
            catch (Throwable var6_8) {
                break block12;
            }
            catch (Exception var5_11) {
                var4_4 = var7_5;
                ** GOTO lbl-1000
            }
            var7_5.close();
            return true;
            catch (Throwable var6_9) {
                var7_5 = var4_4;
                break block12;
            }
            catch (Exception var5_12) {
                // empty catch block
            }
lbl-1000: // 2 sources:
            {
                c.super.a((Exception)var5_13, var2_2, var1);
                if (var4_4 == null) return false;
            }
            var4_4.close();
            return false;
        }
        if (var7_5 == null) throw var6_10;
        var7_5.close();
        throw var6_10;
    }

    private void f(MethodCall methodCall, MethodChannel.Result result) {
        String string = (String)methodCall.argument("cmd");
        HashMap hashMap = new HashMap();
        if ("get".equals((Object)string)) {
            int n2 = g;
            if (n2 > 0) {
                hashMap.put((Object)"logLevel", (Object)n2);
            }
            if (!n.isEmpty()) {
                HashMap hashMap2 = new HashMap();
                for (Map.Entry entry : n.entrySet()) {
                    f.h.a.a a2 = (f.h.a.a)entry.getValue();
                    HashMap hashMap3 = new HashMap();
                    hashMap3.put((Object)"path", (Object)a2.b);
                    hashMap3.put((Object)"singleInstance", (Object)a2.a);
                    int n3 = a2.d;
                    if (n3 > 0) {
                        hashMap3.put((Object)"logLevel", (Object)n3);
                    }
                    hashMap2.put((Object)((Integer)entry.getKey()).toString(), (Object)hashMap3);
                }
                hashMap.put((Object)"databases", (Object)hashMap2);
            }
        }
        result.success((Object)hashMap);
    }

    private void g(MethodCall methodCall, MethodChannel.Result result) {
        Object object = methodCall.arguments();
        f.h.a.e.a.a = Boolean.TRUE.equals(object);
        boolean bl = f.h.a.e.a.b && f.h.a.e.a.a;
        f.h.a.e.a.c = bl;
        if (f.h.a.e.a.a) {
            if (f.h.a.e.a.c) {
                g = 2;
            } else if (f.h.a.e.a.a) {
                g = 1;
            }
        } else {
            g = 0;
        }
        result.success(null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void h(MethodCall methodCall, MethodChannel.Result result) {
        f.h.a.a a2;
        Object object;
        String string = (String)methodCall.argument("path");
        Object object2 = object = h;
        synchronized (object2) {
            Integer n2;
            if (f.h.a.b.b((int)g)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Look for ");
                stringBuilder.append(string);
                stringBuilder.append(" in ");
                stringBuilder.append((Object)d.keySet());
                Log.d((String)"Sqflite", (String)stringBuilder.toString());
            }
            if ((n2 = (Integer)d.get((Object)string)) != null && (a2 = (f.h.a.a)n.get((Object)n2)) != null && a2.e.isOpen()) {
                if (f.h.a.b.b((int)g)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(a2.c());
                    stringBuilder.append("found single instance ");
                    String string2 = a2.f ? "(in transaction) " : "";
                    stringBuilder.append(string2);
                    stringBuilder.append((Object)n2);
                    stringBuilder.append(" ");
                    stringBuilder.append(string);
                    Log.d((String)"Sqflite", (String)stringBuilder.toString());
                }
                n.remove((Object)n2);
                d.remove((Object)string);
            } else {
                a2 = null;
            }
        }
        h h2 = new h((c)this, a2, string, new i((c)this, result, null));
        Handler handler = m;
        if (handler != null) {
            handler.post((Runnable)h2);
            return;
        }
        h2.run();
    }

    private void i(MethodCall methodCall, MethodChannel.Result result) {
        f.h.a.a a2 = c.super.c(methodCall, result);
        if (a2 == null) {
            return;
        }
        i i2 = new i((c)this, result, null);
        m.post((Runnable)new d((c)this, a2, methodCall, i2));
    }

    private void j(MethodCall methodCall, MethodChannel.Result result) {
        f.h.a.a a2 = c.super.c(methodCall, result);
        if (a2 == null) {
            return;
        }
        i i2 = new i((c)this, result, null);
        m.post((Runnable)new c((c)this, methodCall, i2, a2));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void k(MethodCall methodCall, MethodChannel.Result result) {
        int n2;
        Object object;
        Object object2;
        String string = (String)methodCall.argument("path");
        Boolean bl = (Boolean)methodCall.argument("readOnly");
        boolean bl2 = c.a(string);
        boolean bl3 = !Boolean.FALSE.equals(methodCall.argument("singleInstance")) && !bl2;
        if (bl3) {
            Object object3;
            Object object4 = object3 = h;
            synchronized (object4) {
                f.h.a.a a2;
                Integer n3;
                if (f.h.a.b.b((int)g)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Look for ");
                    stringBuilder.append(string);
                    stringBuilder.append(" in ");
                    stringBuilder.append((Object)d.keySet());
                    Log.d((String)"Sqflite", (String)stringBuilder.toString());
                }
                if ((n3 = (Integer)d.get((Object)string)) != null && (a2 = (f.h.a.a)n.get((Object)n3)) != null) {
                    if (!a2.e.isOpen()) {
                        if (f.h.a.b.b((int)g)) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append(a2.c());
                            stringBuilder.append("single instance database of ");
                            stringBuilder.append(string);
                            stringBuilder.append(" not opened");
                            Log.d((String)"Sqflite", (String)stringBuilder.toString());
                        }
                    } else {
                        if (f.h.a.b.b((int)g)) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append(a2.c());
                            stringBuilder.append("re-opened single instance ");
                            String string2 = a2.f ? "(in transaction) " : "";
                            stringBuilder.append(string2);
                            stringBuilder.append((Object)n3);
                            stringBuilder.append(" ");
                            stringBuilder.append(string);
                            Log.d((String)"Sqflite", (String)stringBuilder.toString());
                        }
                        result.success((Object)c.a(n3, true, a2.f));
                        return;
                    }
                }
            }
        }
        Object object5 = object2 = h;
        synchronized (object5) {
            k = n2 = 1 + k;
        }
        f.h.a.a a3 = new f.h.a.a(string, n2, bl3, g);
        i i2 = new i((c)this, result, null);
        Object object6 = object = h;
        synchronized (object6) {
            if (m == null) {
                l = new HandlerThread("Sqflite", f);
                l.start();
                m = new Handler(l.getLooper());
                if (f.h.a.b.a((int)a3.d)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append(a3.c());
                    stringBuilder.append("starting thread");
                    stringBuilder.append((Object)l);
                    stringBuilder.append(" priority ");
                    stringBuilder.append(f);
                    Log.d((String)"Sqflite", (String)stringBuilder.toString());
                }
            }
            if (f.h.a.b.a((int)a3.d)) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(a3.c());
                stringBuilder.append("opened ");
                stringBuilder.append(n2);
                stringBuilder.append(" ");
                stringBuilder.append(string);
                Log.d((String)"Sqflite", (String)stringBuilder.toString());
            }
            Handler handler = m;
            f f2 = new f((c)this, bl2, string, i2, bl, a3, methodCall, bl3, n2);
            handler.post((Runnable)f2);
            return;
        }
    }

    private void l(MethodCall methodCall, MethodChannel.Result result) {
        f.h.a.a a2 = c.super.c(methodCall, result);
        if (a2 == null) {
            return;
        }
        i i2 = new i((c)this, result, null);
        m.post((Runnable)new a((c)this, methodCall, i2, a2));
    }

    private void m(MethodCall methodCall, MethodChannel.Result result) {
        f.h.a.a a2 = c.super.c(methodCall, result);
        if (a2 == null) {
            return;
        }
        i i2 = new i((c)this, result, null);
        m.post((Runnable)new e((c)this, methodCall, i2, a2));
    }

    void a(MethodCall methodCall, MethodChannel.Result result) {
        if (j == null) {
            j = this.b.getDatabasePath("tekartik_sqflite.db").getParent();
        }
        result.success((Object)j);
    }

    void b(MethodCall methodCall, MethodChannel.Result result) {
        Object object;
        Integer n2;
        Object object2 = methodCall.argument("queryAsMapList");
        if (object2 != null) {
            e = Boolean.TRUE.equals(object2);
        }
        if ((object = methodCall.argument("androidThreadPriority")) != null) {
            f = (Integer)object;
        }
        if ((n2 = f.h.a.b.a((MethodCall)methodCall)) != null) {
            g = n2;
        }
        result.success(null);
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        c.super.a(flutterPluginBinding.getApplicationContext(), flutterPluginBinding.getBinaryMessenger());
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.b = null;
        this.c.setMethodCallHandler(null);
        this.c = null;
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        int n2;
        block30 : {
            String string = methodCall.method;
            switch (string.hashCode()) {
                default: {
                    break;
                }
                case 1863829223: {
                    if (!string.equals((Object)"getDatabasesPath")) break;
                    n2 = 9;
                    break block30;
                }
                case 1385449135: {
                    if (!string.equals((Object)"getPlatformVersion")) break;
                    n2 = 0;
                    break block30;
                }
                case 107944136: {
                    if (!string.equals((Object)"query")) break;
                    n2 = 2;
                    break block30;
                }
                case 95458899: {
                    if (!string.equals((Object)"debug")) break;
                    n2 = 11;
                    break block30;
                }
                case 93509434: {
                    if (!string.equals((Object)"batch")) break;
                    n2 = 7;
                    break block30;
                }
                case -17190427: {
                    if (!string.equals((Object)"openDatabase")) break;
                    n2 = 6;
                    break block30;
                }
                case -198450538: {
                    if (!string.equals((Object)"debugMode")) break;
                    n2 = 12;
                    break block30;
                }
                case -263511994: {
                    if (!string.equals((Object)"deleteDatabase")) break;
                    n2 = 10;
                    break block30;
                }
                case -838846263: {
                    if (!string.equals((Object)"update")) break;
                    n2 = 4;
                    break block30;
                }
                case -1183792455: {
                    if (!string.equals((Object)"insert")) break;
                    n2 = 3;
                    break block30;
                }
                case -1249474914: {
                    if (!string.equals((Object)"options")) break;
                    n2 = 8;
                    break block30;
                }
                case -1253581933: {
                    if (!string.equals((Object)"closeDatabase")) break;
                    n2 = 1;
                    break block30;
                }
                case -1319569547: {
                    if (!string.equals((Object)"execute")) break;
                    n2 = 5;
                    break block30;
                }
            }
            n2 = -1;
        }
        switch (n2) {
            default: {
                result.notImplemented();
                return;
            }
            case 12: {
                c.super.g(methodCall, result);
                return;
            }
            case 11: {
                c.super.f(methodCall, result);
                return;
            }
            case 10: {
                c.super.h(methodCall, result);
                return;
            }
            case 9: {
                this.a(methodCall, result);
                return;
            }
            case 8: {
                this.b(methodCall, result);
                return;
            }
            case 7: {
                c.super.d(methodCall, result);
                return;
            }
            case 6: {
                c.super.k(methodCall, result);
                return;
            }
            case 5: {
                c.super.i(methodCall, result);
                return;
            }
            case 4: {
                c.super.m(methodCall, result);
                return;
            }
            case 3: {
                c.super.j(methodCall, result);
                return;
            }
            case 2: {
                c.super.l(methodCall, result);
                return;
            }
            case 1: {
                c.super.e(methodCall, result);
                return;
            }
            case 0: 
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Android ");
        stringBuilder.append(Build.VERSION.RELEASE);
        result.success((Object)stringBuilder.toString());
    }

    private class i
    implements MethodChannel.Result {
        final Handler a;
        private final MethodChannel.Result b;

        private i(f.h.a.c c2, MethodChannel.Result result) {
            this.a = new Handler();
            this.b = result;
        }

        /* synthetic */ i(f.h.a.c c2, MethodChannel.Result result, f.h.a.c$a a2) {
            super(c2, result);
        }

        static /* synthetic */ MethodChannel.Result a(i i2) {
            return i2.b;
        }

        public void error(String string, String string2, Object object) {
            this.a.post((Runnable)new b((i)this, string, string2, object));
        }

        public void notImplemented() {
            this.a.post((Runnable)new c(this));
        }

        public void success(Object object) {
            this.a.post((Runnable)new a((i)this, object));
        }
    }

}

