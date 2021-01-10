/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ContentValues
 *  android.content.Context
 *  android.database.Cursor
 *  android.database.sqlite.SQLiteDatabase
 *  com.mintegral.msdk.base.common.report.BatchReportMessage
 *  f.f.a.e.d.b
 *  f.f.a.e.d.g
 *  f.f.a.p.a
 *  java.io.Serializable
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.UUID
 */
package f.f.a.e.d;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.mintegral.msdk.base.common.report.BatchReportMessage;
import f.f.a.e.d.b;
import f.f.a.e.d.g;
import f.f.a.e.d.h;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.UUID;

public class a
extends b<BatchReportMessage>
implements f.f.a.p.a,
Serializable {
    private static volatile a c;

    protected a(g g2) {
        super(g2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static a a(Context context) {
        if (c != null) return c;
        Class<a> class_ = a.class;
        synchronized (a.class) {
            if (c != null) return c;
            c = new a(h.a(context));
            // ** MonitorExit[var2_1] (shouldn't be in output)
            return c;
        }
    }

    public void a(long l2) {
        SQLiteDatabase sQLiteDatabase = this.a();
        if (sQLiteDatabase == null) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("delete from ");
        stringBuilder.append("batch_report");
        stringBuilder.append(" where ");
        stringBuilder.append("time");
        stringBuilder.append(" <= ");
        stringBuilder.append(l2);
        try {
            sQLiteDatabase.rawQuery(stringBuilder.toString(), null);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public void a(String string) {
        SQLiteDatabase sQLiteDatabase = this.b();
        if (sQLiteDatabase == null) {
            return;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("report_message", string);
            contentValues.put("time", Long.valueOf((long)System.currentTimeMillis()));
            contentValues.put("uuid", UUID.randomUUID().toString().replace((CharSequence)"-", (CharSequence)""));
            contentValues.put("report_state", Integer.valueOf((int)0));
            sQLiteDatabase.insert("batch_report", null, contentValues);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public void a(ArrayList<BatchReportMessage> arrayList) {
        SQLiteDatabase sQLiteDatabase = this.b();
        if (arrayList != null && arrayList.size() != 0) {
            if (sQLiteDatabase == null) {
                return;
            }
            for (BatchReportMessage batchReportMessage : arrayList) {
                try {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("report_state", Integer.valueOf((int)0));
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("uuid = '");
                    stringBuilder.append(batchReportMessage.e());
                    stringBuilder.append("'");
                    sQLiteDatabase.update("batch_report", contentValues, stringBuilder.toString(), null);
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public ArrayList<BatchReportMessage> b(long l2) {
        Cursor cursor;
        void var22_8;
        block12 : {
            ArrayList arrayList;
            SQLiteDatabase sQLiteDatabase;
            block13 : {
                sQLiteDatabase = this.a();
                if (sQLiteDatabase == null) {
                    return null;
                }
                arrayList = new ArrayList();
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("SELECT * FROM ");
                stringBuilder.append("batch_report");
                stringBuilder.append(" WHERE ");
                stringBuilder.append("time");
                stringBuilder.append(" <= ");
                stringBuilder.append(l2);
                stringBuilder.append(" AND ");
                stringBuilder.append("report_state");
                stringBuilder.append(" = 0");
                try {
                    block11 : {
                        cursor = sQLiteDatabase.rawQuery(stringBuilder.toString(), null);
                        if (cursor == null) break block11;
                        try {
                            while (cursor.moveToNext()) {
                                arrayList.add((Object)new BatchReportMessage(cursor.getString(cursor.getColumnIndex("uuid")), cursor.getString(cursor.getColumnIndex("report_message")), cursor.getLong(cursor.getColumnIndex("time"))));
                            }
                        }
                        catch (Throwable throwable) {
                            break block12;
                        }
                    }
                    if (cursor == null) break block13;
                }
                catch (Exception exception) {
                    try {
                        exception.printStackTrace();
                    }
                    catch (Throwable throwable) {
                        cursor = null;
                        break block12;
                    }
                }
                cursor.close();
            }
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put("report_state", Integer.valueOf((int)1));
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("time <= ");
                stringBuilder.append(l2);
                sQLiteDatabase.update("batch_report", contentValues, stringBuilder.toString(), null);
                return arrayList;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return arrayList;
            }
        }
        if (cursor == null) throw var22_8;
        cursor.close();
        throw var22_8;
    }
}

