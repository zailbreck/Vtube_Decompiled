/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
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
import f.g.a.c.a;
import f.g.a.c.d;
import java.util.ArrayList;
import java.util.List;

public class b {
    d a;
    String[] b = new String[]{"_id", "username", "password", "protection_space_id"};

    public b(d d2) {
        this.a = d2;
    }

    public long a(a a2) {
        String[] arrstring = new String[]{a2.a.toString()};
        return this.a.getWritableDatabase().delete("credential", "_id = ?", arrstring);
    }

    public a a(String string2, String string3, Long l2) {
        String[] arrstring = new String[]{string2, string3, l2.toString()};
        Cursor cursor = this.a.getReadableDatabase().query("credential", this.b, "username = ? AND password = ? AND protection_space_id = ?", arrstring, null, null, null);
        a a2 = cursor.moveToNext() ? new a(cursor.getLong(cursor.getColumnIndexOrThrow("_id")), cursor.getString(cursor.getColumnIndexOrThrow("username")), cursor.getString(cursor.getColumnIndexOrThrow("password")), l2) : null;
        cursor.close();
        return a2;
    }

    public List<a> a(Long l2) {
        String[] arrstring = new String[]{l2.toString()};
        Cursor cursor = this.a.getReadableDatabase().query("credential", this.b, "protection_space_id = ?", arrstring, null, null, null);
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add((Object)new a(cursor.getLong(cursor.getColumnIndexOrThrow("_id")), cursor.getString(cursor.getColumnIndexOrThrow("username")), cursor.getString(cursor.getColumnIndexOrThrow("password")), l2));
        }
        cursor.close();
        return arrayList;
    }

    public long b(a a2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("username", a2.b);
        contentValues.put("password", a2.c);
        contentValues.put("protection_space_id", a2.d);
        return this.a.getWritableDatabase().insert("credential", null, contentValues);
    }

    public long c(a a2) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("username", a2.b);
        contentValues.put("password", a2.c);
        String[] arrstring = new String[]{a2.d.toString()};
        return this.a.getWritableDatabase().update("credential", contentValues, "protection_space_id = ?", arrstring);
    }
}

