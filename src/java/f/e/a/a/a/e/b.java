/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.KeyguardManager
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collection
 *  java.util.Iterator
 */
package f.e.a.a.a.e;

import android.annotation.SuppressLint;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import f.e.a.a.a.d.i;
import java.util.Collection;
import java.util.Iterator;

public class b {
    @SuppressLint(value={"StaticFieldLeak"})
    private static b f = new b();
    private Context a;
    private BroadcastReceiver b;
    private boolean c;
    private boolean d;
    private b e;

    private b() {
    }

    private void a(boolean bl) {
        if (this.d != bl) {
            this.d = bl;
            if (this.c) {
                b.super.g();
                b b2 = this.e;
                if (b2 != null) {
                    b2.a(this.c());
                }
            }
        }
    }

    public static b d() {
        return f;
    }

    private void e() {
        this.b = new BroadcastReceiver(){

            /*
             * Enabled aggressive block sorting
             */
            public void onReceive(Context context, Intent intent) {
                KeyguardManager keyguardManager;
                if (intent == null) {
                    return;
                }
                if ("android.intent.action.SCREEN_OFF".equals((Object)intent.getAction())) {
                    b.this.a(true);
                    return;
                }
                if ("android.intent.action.USER_PRESENT".equals((Object)intent.getAction()) || "android.intent.action.SCREEN_ON".equals((Object)intent.getAction()) && (keyguardManager = (KeyguardManager)context.getSystemService("keyguard")) != null && !keyguardManager.inKeyguardRestrictedInputMode()) {
                    b.this.a(false);
                    return;
                }
            }
        };
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        this.a.registerReceiver(this.b, intentFilter);
    }

    private void f() {
        BroadcastReceiver broadcastReceiver;
        Context context = this.a;
        if (context != null && (broadcastReceiver = this.b) != null) {
            context.unregisterReceiver(broadcastReceiver);
            this.b = null;
        }
    }

    private void g() {
        boolean bl = true ^ this.d;
        Iterator iterator = f.e.a.a.a.e.a.d().a().iterator();
        while (iterator.hasNext()) {
            ((i)iterator.next()).l().a(bl);
        }
    }

    public void a() {
        this.e();
        this.c = true;
        this.g();
    }

    public void a(Context context) {
        this.a = context.getApplicationContext();
    }

    public void a(b b2) {
        this.e = b2;
    }

    public void b() {
        this.f();
        this.c = false;
        this.d = false;
        this.e = null;
    }

    public boolean c() {
        return true ^ this.d;
    }

    public static interface b {
        public void a(boolean var1);
    }

}

