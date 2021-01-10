/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.media.AudioManager
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.ref.WeakReference
 */
package f.f.a.k.f;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import java.lang.ref.WeakReference;

public final class e {
    public static double f = -1.0;
    private Context a;
    private AudioManager b;
    private boolean c = false;
    private b d;
    private a e;

    public e(Context context) {
        this.a = context;
        this.b = (AudioManager)context.getApplicationContext().getSystemService("audio");
    }

    public final double a() {
        double d2;
        AudioManager audioManager = this.b;
        int n2 = -1;
        int n3 = audioManager != null ? audioManager.getStreamMaxVolume(3) : -1;
        AudioManager audioManager2 = this.b;
        if (audioManager2 != null) {
            n2 = audioManager2.getStreamVolume(3);
        }
        double d3 = n2;
        Double.isNaN((double)d3);
        double d4 = d3 * 100.0;
        double d5 = n3;
        Double.isNaN((double)d5);
        f = d2 = d4 / d5;
        return d2;
    }

    public final void a(b b2) {
        this.d = b2;
    }

    public final b b() {
        return this.d;
    }

    public final void c() {
        if (this.a != null) {
            this.e = new a(this);
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.media.VOLUME_CHANGED_ACTION");
            this.a.registerReceiver((BroadcastReceiver)this.e, intentFilter);
            this.c = true;
        }
    }

    public final void d() {
        Context context;
        if (this.c && (context = this.a) != null) {
            try {
                context.unregisterReceiver((BroadcastReceiver)this.e);
                this.d = null;
                this.c = false;
                return;
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
        }
    }

    private static final class a
    extends BroadcastReceiver {
        private WeakReference<e> a;

        public a(e e2) {
            this.a = new WeakReference((Object)e2);
        }

        public final void onReceive(Context context, Intent intent) {
            double d2;
            e e2;
            b b2;
            if ("android.media.VOLUME_CHANGED_ACTION".equals((Object)intent.getAction()) && intent.getIntExtra("android.media.EXTRA_VOLUME_STREAM_TYPE", -1) == 3 && (e2 = (e)this.a.get()) != null && (b2 = e2.b()) != null && (d2 = e2.a()) >= 0.0) {
                b2.a(d2);
            }
        }
    }

    public static interface b {
        public void a(double var1);
    }

}

