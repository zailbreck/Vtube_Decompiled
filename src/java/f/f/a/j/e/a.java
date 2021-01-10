/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.content.Context
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteDatabase$CursorFactory
 *  android.database.sqlite.SQLiteOpenHelper
 *  f.f.a.j.e.c
 *  f.f.a.j.o
 *  f.f.a.j.t
 *  java.lang.IllegalStateException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package f.f.a.j.e;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import f.f.a.j.e.c;
import f.f.a.j.o;
import f.f.a.j.t;

final class a
extends SQLiteOpenHelper
implements c {
    private static final String[] b = new String[]{"_id", "url", "length", "mime"};

    a(Context context) {
        super(context, "AndroidVideoCache.db", null, 1);
        o.a((Object)context);
    }

    public final void a(String string, t t2) {
        o.a((Object[])new Object[]{string, t2});
        boolean bl = this.b(string) != null;
        ContentValues contentValues = new ContentValues();
        contentValues.put("url", t2.a);
        contentValues.put("length", Long.valueOf((long)t2.b));
        contentValues.put("mime", t2.c);
        if (bl) {
            this.getWritableDatabase().update("SourceInfo", contentValues, "url=?", new String[]{string});
            return;
        }
        this.getWritableDatabase().insert("SourceInfo", null, contentValues);
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final t b(String string) {
        Throwable throwable;
        Cursor cursor;
        block5 : {
            t t2;
            block4 : {
                o.a((Object)string);
                cursor = this.getReadableDatabase().query("SourceInfo", b, "url=?", new String[]{string}, null, null, null);
                t2 = null;
                if (cursor == null) break block4;
                try {
                    t2 = !cursor.moveToFirst() ? null : new t(cursor.getString(cursor.getColumnIndexOrThrow("url")), cursor.getLong(cursor.getColumnIndexOrThrow("length")), cursor.getString(cursor.getColumnIndexOrThrow("mime")));
                }
                catch (Throwable throwable2) {
                    break block5;
                }
            }
            if (cursor == null) return t2;
            cursor.close();
            return t2;
            catch (Throwable throwable3) {
                throwable = throwable3;
                cursor = null;
            }
        }
        if (cursor == null) throw throwable;
        cursor.close();
        throw throwable;
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        o.a((Object)sQLiteDatabase);
        sQLiteDatabase.execSQL("CREATE TABLE SourceInfo (_id INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,url TEXT NOT NULL,mime TEXT,length INTEGER);");
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int n2, int n3) {
        throw new IllegalStateException("Should not be called. There is no any migration");
    }
}

