/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteDatabase$CursorFactory
 *  android.database.sqlite.SQLiteOpenHelper
 *  java.lang.String
 */
package f.g.a.c;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class d
extends SQLiteOpenHelper {
    public d(Context context) {
        super(context, "CredentialDatabase.db", null, 2);
    }

    public void a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS protection_space");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS credential");
        this.onCreate(sQLiteDatabase);
    }

    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE protection_space (_id INTEGER PRIMARY KEY,host TEXT NOT NULL,protocol TEXT,realm TEXT,port INTEGER,UNIQUE(host, protocol, realm, port));");
        sQLiteDatabase.execSQL("CREATE TABLE credential (_id INTEGER PRIMARY KEY,username TEXT NOT NULL,password TEXT NOT NULL,protection_space_id INTEGER NOT NULL,UNIQUE(username, password, protection_space_id),FOREIGN KEY (protection_space_id) REFERENCES protection_space (_id) ON DELETE CASCADE);");
    }

    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int n2, int n3) {
        this.onUpgrade(sQLiteDatabase, n2, n3);
    }

    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int n2, int n3) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS protection_space");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS credential");
        this.onCreate(sQLiteDatabase);
    }
}

