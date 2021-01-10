/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.os.RemoteException
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package e.c.b;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.RemoteException;
import android.text.TextUtils;
import d.a.a.a;
import e.c.b.b;
import e.c.b.c;
import e.c.b.e;
import e.c.b.f;

public class c {
    private final d.a.a.b a;
    private final ComponentName b;

    c(d.a.a.b b2, ComponentName componentName, Context context) {
        this.a = b2;
        this.b = componentName;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    private f a(b var1, PendingIntent var2_2) {
        var3_3 = c.super.b(var1);
        var4_4 = null;
        if (var2_2 == null) ** GOTO lbl9
        try {
            block2 : {
                var7_5 = new Bundle();
                var7_5.putParcelable("android.support.customtabs.extra.SESSION_ID", (Parcelable)var2_2);
                var6_6 = this.a.a(var3_3, var7_5);
                break block2;
lbl9: // 1 sources:
                var6_6 = this.a.a(var3_3);
            }
            if (var6_6 != false) return new f(this.a, var3_3, this.b, var2_2);
            return null;
        }
        catch (RemoteException v0) {}
        return var4_4;
    }

    public static boolean a(Context context, String string, e e2) {
        e2.a(context.getApplicationContext());
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (!TextUtils.isEmpty((CharSequence)string)) {
            intent.setPackage(string);
        }
        return context.bindService(intent, (ServiceConnection)e2, 33);
    }

    private a.a b(b b2) {
        return new a.a((c)this, b2){
            private android.os.Handler a;
            final /* synthetic */ b b;
            {
                this.b = b2;
                this.a = new android.os.Handler(android.os.Looper.getMainLooper());
            }

            public void a(int n2, android.net.Uri uri, boolean bl, Bundle bundle) {
                if (this.b == null) {
                    return;
                }
                android.os.Handler handler = this.a;
                java.lang.Runnable runnable = new java.lang.Runnable(this, n2, uri, bl, bundle){
                    final /* synthetic */ int b;
                    final /* synthetic */ android.net.Uri c;
                    final /* synthetic */ boolean d;
                    final /* synthetic */ Bundle e;
                    final /* synthetic */ a f;
                    {
                        this.f = a2;
                        this.b = n2;
                        this.c = uri;
                        this.d = bl;
                        this.e = bundle;
                    }

                    public void run() {
                        this.f.b.a(this.b, this.c, this.d, this.e);
                    }
                };
                handler.post(runnable);
            }

            public void a(String string, Bundle bundle) {
                if (this.b == null) {
                    return;
                }
                this.a.post(new java.lang.Runnable(this, string, bundle){
                    final /* synthetic */ String b;
                    final /* synthetic */ Bundle c;
                    final /* synthetic */ a d;
                    {
                        this.d = a2;
                        this.b = string;
                        this.c = bundle;
                    }

                    public void run() {
                        this.d.b.a(this.b, this.c);
                    }
                });
            }

            public Bundle b(String string, Bundle bundle) {
                b b2 = this.b;
                if (b2 == null) {
                    return null;
                }
                return b2.b(string, bundle);
            }

            public void b(int n2, Bundle bundle) {
                if (this.b == null) {
                    return;
                }
                this.a.post(new java.lang.Runnable(this, n2, bundle){
                    final /* synthetic */ int b;
                    final /* synthetic */ Bundle c;
                    final /* synthetic */ a d;
                    {
                        this.d = a2;
                        this.b = n2;
                        this.c = bundle;
                    }

                    public void run() {
                        this.d.b.a(this.b, this.c);
                    }
                });
            }

            public void b(Bundle bundle) {
                if (this.b == null) {
                    return;
                }
                this.a.post(new java.lang.Runnable(this, bundle){
                    final /* synthetic */ Bundle b;
                    final /* synthetic */ a c;
                    {
                        this.c = a2;
                        this.b = bundle;
                    }

                    public void run() {
                        this.c.b.a(this.b);
                    }
                });
            }

            public void c(String string, Bundle bundle) {
                if (this.b == null) {
                    return;
                }
                this.a.post(new java.lang.Runnable(this, string, bundle){
                    final /* synthetic */ String b;
                    final /* synthetic */ Bundle c;
                    final /* synthetic */ a d;
                    {
                        this.d = a2;
                        this.b = string;
                        this.c = bundle;
                    }

                    public void run() {
                        this.d.b.c(this.b, this.c);
                    }
                });
            }
        };
    }

    public f a(b b2) {
        return c.super.a(b2, null);
    }

    public boolean a(long l2) {
        try {
            boolean bl = this.a.a(l2);
            return bl;
        }
        catch (RemoteException remoteException) {
            return false;
        }
    }
}

