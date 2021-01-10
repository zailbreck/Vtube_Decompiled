/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.database.sqlite.SQLiteDatabase
 *  java.lang.Object
 */
package f.f.a.e.d;

import android.database.sqlite.SQLiteDatabase;
import f.f.a.e.d.g;

public class b<T> {
    protected g b = null;

    public b(g g2) {
        this.b = g2;
    }

    protected SQLiteDatabase a() {
        b b2 = this;
        synchronized (b2) {
            SQLiteDatabase sQLiteDatabase = this.b.a();
            return sQLiteDatabase;
        }
    }

    protected SQLiteDatabase b() {
        b b2 = this;
        synchronized (b2) {
            SQLiteDatabase sQLiteDatabase = this.b.b();
            return sQLiteDatabase;
        }
    }
}

