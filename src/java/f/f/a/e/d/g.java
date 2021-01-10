/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.database.sqlite.SQLiteDatabase
 *  android.database.sqlite.SQLiteDatabase$CursorFactory
 *  android.database.sqlite.SQLiteOpenHelper
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package f.f.a.e.d;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import f.f.a.e.f.h;

public abstract class g {
    private a a;

    public g(Context context) {
        this.a = (g)this.new a(context, this.c(), this.d());
    }

    public final SQLiteDatabase a() {
        return this.a.getReadableDatabase();
    }

    protected abstract void a(SQLiteDatabase var1);

    protected abstract void a(SQLiteDatabase var1, int var2, int var3);

    /*
     * Exception decompiling
     */
    public final SQLiteDatabase b() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl17.1 : ALOAD_3 : trying to set 1 previously set to 0
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1133)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:607)
        // java.lang.Thread.run(Thread.java:761)
        throw new IllegalStateException("Decompilation failed");
    }

    protected abstract void b(SQLiteDatabase var1, int var2, int var3);

    protected abstract String c();

    protected abstract int d();

    private final class a
    extends SQLiteOpenHelper {
        public a(Context context, String string, int n2) {
            super(context, string, null, n2);
            if (f.f.a.a.a) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("\u6570\u636e\u5e93\uff1a name :");
                stringBuilder.append(string);
                stringBuilder.append("  ");
                stringBuilder.append(n2);
                h.a("DatabaseOpenHelper", stringBuilder.toString());
            }
        }

        public final void onCreate(SQLiteDatabase sQLiteDatabase) {
            if (f.f.a.a.a) {
                h.a("DatabaseOpenHelper", "\u6570\u636e\u5e93\u521b\u5efa\u4e86");
            }
            g.this.a(sQLiteDatabase);
        }

        public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int n2, int n3) {
            g.this.b(sQLiteDatabase, n2, n3);
        }

        public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int n2, int n3) {
            if (f.f.a.a.a) {
                h.a("DatabaseOpenHelper", "\u6570\u636e\u5e93\u5347\u7ea7\u4e86");
            }
            g.this.a(sQLiteDatabase, n2, n3);
        }
    }

}

