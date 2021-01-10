/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.ComponentName
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcelable
 *  android.os.RemoteException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 */
package e.c.b;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.os.RemoteException;
import d.a.a.a;
import d.a.a.b;
import java.util.List;

public final class f {
    private final b a;
    private final a b;
    private final ComponentName c;
    private final PendingIntent d;

    f(b b2, a a2, ComponentName componentName, PendingIntent pendingIntent) {
        this.a = b2;
        this.b = a2;
        this.c = componentName;
        this.d = pendingIntent;
    }

    private void a(Bundle bundle) {
        PendingIntent pendingIntent = this.d;
        if (pendingIntent != null) {
            bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", (Parcelable)pendingIntent);
        }
    }

    private Bundle b(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        f.super.a(bundle2);
        return bundle2;
    }

    IBinder a() {
        return this.b.asBinder();
    }

    public boolean a(Uri uri, Bundle bundle, List<Bundle> list) {
        Bundle bundle2 = f.super.b(bundle);
        try {
            boolean bl = this.a.a(this.b, uri, bundle2, list);
            return bl;
        }
        catch (RemoteException remoteException) {
            return false;
        }
    }

    ComponentName b() {
        return this.c;
    }

    PendingIntent c() {
        return this.d;
    }
}

