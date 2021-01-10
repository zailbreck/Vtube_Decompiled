/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package f.g.a.c;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import f.g.a.c.d;
import f.g.a.c.e;
import java.util.ArrayList;
import java.util.List;

public class f {
    d a;
    String[] b = new String[]{"_id", "host", "protocol", "realm", "port"};

    public f(d d2) {
        this.a = d2;
    }

    public long a(e e2) {
        String[] arrstring = new String[]{e2.a.toString()};
        return this.a.getWritableDatabase().delete("protection_space", "_id = ?", arrstring);
    }

    public e a(String string2, String string3, String string4, Integer n2) {
        e e2;
        SQLiteDatabase sQLiteDatabase = this.a.getReadableDatabase();
        String[] arrstring = new String[]{string2, string3, string4, n2.toString()};
        Cursor cursor = sQLiteDatabase.query("protection_space", this.b, "host = ? AND protocol = ? AND realm = ? AND port = ?", arrstring, null, null, null);
        if (cursor.moveToNext()) {
            Long l2 = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
            String string5 = cursor.getString(cursor.getColumnIndexOrThrow("host"));
            String string6 = cursor.getString(cursor.getColumnIndexOrThrow("protocol"));
            String string7 = cursor.getString(cursor.getColumnIndexOrThrow("realm"));
            Integer n3 = cursor.getInt(cursor.getColumnIndexOrThrow("port"));
            e2 = new e(l2, string5, string6, string7, n3);
        } else {
            e2 = null;
        }
        cursor.close();
        return e2;
    }

    public List<e> a() {
        Cursor cursor = this.a.getReadableDatabase().query("protection_space", this.b, null, null, null, null, null);
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            Long l2 = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
            String string2 = cursor.getString(cursor.getColumnIndexOrThrow("host"));
            String string3 = cursor.getString(cursor.getColumnIndexOrThrow("protocol"));
            String string4 = cursor.getString(cursor.getColumnIndexOrThrow("realm"));
            Integer n2 = cursor.getInt(cursor.getColumnIndexOrThrow("port"));
            e e2 = new e(l2, string2, string3, string4, n2);
            arrayList.add((Object)e2);
        }
        cursor.close();
        return arrayList;
    }

    public long b(e e2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("host", e2.b);
        contentValues.put("protocol", e2.c);
        contentValues.put("realm", e2.d);
        contentValues.put("port", e2.e);
        return this.a.getWritableDatabase().insert("protection_space", null, contentValues);
    }
}

