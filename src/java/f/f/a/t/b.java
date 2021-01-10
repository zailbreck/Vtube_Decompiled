/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  java.lang.Object
 *  java.util.Calendar
 */
package f.f.a.t;

import android.view.View;
import java.util.Calendar;

public abstract class b
implements View.OnClickListener {
    private long b = 0L;

    protected abstract void a(View var1);

    public void onClick(View view) {
        long l2 = Calendar.getInstance().getTimeInMillis();
        if (l2 - this.b > 2000L) {
            this.b = l2;
            this.a(view);
        }
    }
}

