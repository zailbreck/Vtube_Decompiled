/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.database.DatabaseErrorHandler
 *  android.database.sqlite.SQLiteDatabase
 *  java.io.File
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 */
package f.h.a;

import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import java.io.File;

class a {
    final boolean a;
    final String b;
    final int c;
    final int d;
    SQLiteDatabase e;
    boolean f;

    a(String string2, int n2, boolean bl, int n3) {
        this.b = string2;
        this.a = bl;
        this.c = n2;
        this.d = n3;
    }

    static void a(String string2) {
        SQLiteDatabase.deleteDatabase((File)new File(string2));
    }

    public void a() {
        this.e.close();
    }

    public SQLiteDatabase b() {
        return this.e;
    }

    String c() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        stringBuilder.append(this.d());
        stringBuilder.append("] ");
        return stringBuilder.toString();
    }

    String d() {
        Thread thread = Thread.currentThread();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("");
        stringBuilder.append(this.c);
        stringBuilder.append(",");
        stringBuilder.append(thread.getName());
        stringBuilder.append("(");
        stringBuilder.append(thread.getId());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public SQLiteDatabase e() {
        return this.e;
    }

    public void f() {
        this.e = SQLiteDatabase.openDatabase((String)this.b, null, (int)268435456);
    }

    public void g() {
        this.e = SQLiteDatabase.openDatabase((String)this.b, null, (int)1, (DatabaseErrorHandler)new DatabaseErrorHandler(this){

            public void onCorruption(SQLiteDatabase sQLiteDatabase) {
            }
        });
    }

}

