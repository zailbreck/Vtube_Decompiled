/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.ServiceConnection
 *  android.os.IBinder
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 */
package e.c.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;
import d.a.a.b;
import e.c.b.c;
import e.c.b.e;

public abstract class e
implements ServiceConnection {
    private Context a;

    public abstract void a(ComponentName var1, c var2);

    void a(Context context) {
        this.a = context;
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (this.a != null) {
            this.a(componentName, new c((e)this, b.a.a(iBinder), componentName, this.a){});
            return;
        }
        throw new IllegalStateException("Custom Tabs Service connected before an applicationcontext has been provided.");
    }
}

