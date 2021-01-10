/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  com.mintegral.msdk.base.common.report.e
 *  com.mintegral.msdk.base.common.report.e$b
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 */
package f.f.a.e.b.g;

import android.content.Context;
import com.mintegral.msdk.base.common.report.e;
import com.mintegral.msdk.base.common.report.e$c;
import f.f.a.e.b.g.a;
import f.f.a.e.b.h.g;
import f.f.a.e.b.h.j.d;
import f.f.a.e.b.h.k.c;
import f.f.a.e.f.h;

public final class a
implements Runnable {
    private String b;
    private String c;

    public a(String string, String string2) {
        this.b = string;
        this.c = string2;
    }

    public final void run() {
        try {
            h.d("ReportTask", "start report");
            e.b b2 = new e.b(f.f.a.e.c.a.i().e());
            c c2 = e.a((String)this.b, (Context)f.f.a.e.c.a.i().e(), (String)this.c);
            b2.b(0, d.a().b, c2, new e$c(this){

                public final void a(String string) {
                    h.d("ReportTask", string);
                }

                public final void b(String string) {
                    h.d("ReportTask", string);
                }
            });
            return;
        }
        catch (Throwable throwable) {
            h.d("ReportTask", throwable.getMessage());
            return;
        }
    }
}

