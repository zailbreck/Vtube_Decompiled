/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.media.AudioManager
 *  android.media.AudioManager$OnAudioFocusChangeListener
 *  android.util.Log
 *  androidx.media.AudioAttributesCompat
 *  androidx.media2.common.SessionPlayer
 *  androidx.media2.common.SessionPlayer$b
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package e.j.a;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.util.Log;
import androidx.media.AudioAttributesCompat;
import androidx.media2.common.SessionPlayer;
import f.d.a.b.a.e;

public class a {
    private final a a;

    a(Context context, e.j.a.b b2) {
        this.a = new a(context, b2){
            private final BroadcastReceiver a;
            private final IntentFilter b;
            private final AudioManager.OnAudioFocusChangeListener c;
            final Object d;
            private final Context e;
            final e.j.a.b f;
            private final AudioManager g;
            AudioAttributesCompat h;
            private int i;
            boolean j;
            boolean k;
            {
                this.a = new BroadcastReceiver(){

                    /*
                     * Enabled aggressive block sorting
                     * Enabled unnecessary exception pruning
                     * Enabled aggressive exception aggregation
                     */
                    public void onReceive(Context context, Intent intent) {
                        Object object;
                        if (!"android.media.AUDIO_BECOMING_NOISY".equals((Object)intent.getAction())) {
                            return;
                        }
                        Object object2 = object = b.this.d;
                        synchronized (object2) {
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("Received noisy intent, intent=");
                            stringBuilder.append((Object)intent);
                            stringBuilder.append(", registered=");
                            stringBuilder.append(b.this.k);
                            stringBuilder.append(", attr=");
                            stringBuilder.append((Object)b.this.h);
                            Log.d((String)"AudioFocusHandler", (String)stringBuilder.toString());
                            if (b.this.k && b.this.h != null) {
                                int n2 = b.this.h.a();
                                // MONITOREXIT [5, 2] lbl15 : w: MONITOREXIT : var17_4
                                if (n2 == 1) {
                                    b.this.f.v();
                                    return;
                                }
                                if (n2 != 14) {
                                    return;
                                }
                                e.j.a.b b2 = b.this.f;
                                b2.b(0.2f * b2.C());
                                return;
                            }
                            return;
                        }
                    }
                };
                this.b = new IntentFilter("android.media.AUDIO_BECOMING_NOISY");
                this.c = new AudioManager.OnAudioFocusChangeListener(){
                    private float b;
                    private float c;

                    /*
                     * Enabled aggressive block sorting
                     * Enabled unnecessary exception pruning
                     * Enabled aggressive exception aggregation
                     */
                    public void onAudioFocusChange(int n2) {
                        boolean bl;
                        Object object;
                        Object object2;
                        if (n2 != -3) {
                            float f2;
                            Object object3;
                            if (n2 == -2) {
                                Object object4;
                                b.this.f.v();
                                Object object5 = object4 = b.this.d;
                                synchronized (object5) {
                                    b.this.j = true;
                                    return;
                                }
                            }
                            if (n2 == -1) {
                                Object object6;
                                b.this.f.v();
                                Object object7 = object6 = b.this.d;
                                synchronized (object7) {
                                    b.this.j = false;
                                    return;
                                }
                            }
                            if (n2 != 1) {
                                return;
                            }
                            if (b.this.f.r() == 1) {
                                Object object8;
                                Object object9 = object8 = b.this.d;
                                synchronized (object9) {
                                    if (!b.this.j) {
                                        return;
                                    }
                                }
                                b.this.f.w();
                                return;
                            }
                            float f3 = b.this.f.C();
                            Object object10 = object3 = b.this.d;
                            synchronized (object10) {
                                if (f3 != this.c) {
                                    return;
                                }
                                f2 = this.b;
                            }
                            b.this.f.b(f2);
                            return;
                        }
                        Object object11 = object2 = b.this.d;
                        synchronized (object11) {
                            if (b.this.h == null) {
                                return;
                            }
                            int n3 = b.this.h.d();
                            bl = false;
                            if (n3 == 1) {
                                bl = true;
                            }
                        }
                        e.j.a.b b2 = b.this.f;
                        if (bl) {
                            b2.v();
                            return;
                        }
                        float f4 = b2.C();
                        float f5 = 0.2f * f4;
                        Object object12 = object = b.this.d;
                        synchronized (object12) {
                            this.b = f4;
                            this.c = f5;
                        }
                        b.this.f.b(f5);
                    }
                };
                this.d = new Object();
                this.e = context;
                this.f = b2;
                this.g = (AudioManager)context.getSystemService("audio");
            }

            private static int a(AudioAttributesCompat audioAttributesCompat) {
                if (audioAttributesCompat == null) {
                    return 0;
                }
                switch (audioAttributesCompat.a()) {
                    default: {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unidentified AudioAttribute ");
                        stringBuilder.append((Object)audioAttributesCompat);
                        Log.w((String)"AudioFocusHandler", (String)stringBuilder.toString());
                        return 0;
                    }
                    case 16: {
                        return 4;
                    }
                    case 11: {
                        if (audioAttributesCompat.d() == 1) {
                            return 2;
                        }
                    }
                    case 5: 
                    case 6: 
                    case 7: 
                    case 8: 
                    case 9: 
                    case 10: 
                    case 12: 
                    case 13: {
                        return 3;
                    }
                    case 3: {
                        return 0;
                    }
                    case 2: 
                    case 4: {
                        return 2;
                    }
                    case 1: 
                    case 14: {
                        return 1;
                    }
                    case 0: 
                }
                Log.w((String)"AudioFocusHandler", (String)"Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                return 1;
            }

            private void c() {
                if (this.i == 0) {
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("abandoningAudioFocusLocked, currently=");
                stringBuilder.append(this.i);
                Log.d((String)"AudioFocusHandler", (String)stringBuilder.toString());
                this.g.abandonAudioFocus(this.c);
                this.i = 0;
                this.j = false;
            }

            private void d() {
                if (this.k) {
                    return;
                }
                Log.d((String)"AudioFocusHandler", (String)"registering becoming noisy receiver");
                this.e.registerReceiver(this.a, this.b);
                this.k = true;
            }

            private boolean e() {
                int n2 = b.a(this.h);
                if (n2 == 0) {
                    if (this.h == null) {
                        Log.e((String)"AudioFocusHandler", (String)"requestAudioFocusLocked() shouldn't be called when AudioAttributes is null");
                    }
                    return true;
                }
                int n3 = this.g.requestAudioFocus(this.c, this.h.b(), n2);
                if (n3 == 1) {
                    this.i = n2;
                } else {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("requestAudioFocus(");
                    stringBuilder.append(n2);
                    stringBuilder.append(") failed (return=");
                    stringBuilder.append(n3);
                    stringBuilder.append(") playback wouldn't start.");
                    Log.w((String)"AudioFocusHandler", (String)stringBuilder.toString());
                    this.i = 0;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("requestAudioFocus(");
                stringBuilder.append(n2);
                stringBuilder.append("), result=");
                boolean bl = n3 == 1;
                stringBuilder.append(bl);
                Log.d((String)"AudioFocusHandler", (String)stringBuilder.toString());
                this.j = false;
                return this.i != 0;
            }

            private void f() {
                if (!this.k) {
                    return;
                }
                Log.d((String)"AudioFocusHandler", (String)"unregistering becoming noisy receiver");
                this.e.unregisterReceiver(this.a);
                this.k = false;
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public boolean a() {
                Object object;
                AudioAttributesCompat audioAttributesCompat = this.f.A();
                Object object2 = object = this.d;
                synchronized (object2) {
                    this.h = audioAttributesCompat;
                    if (audioAttributesCompat == null) {
                        this.c();
                        this.f();
                        return true;
                    }
                    boolean bl = this.e();
                    if (!bl) return bl;
                    this.d();
                    return bl;
                }
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public void b() {
                Object object;
                Object object2 = object = this.d;
                synchronized (object2) {
                    this.c();
                    this.f();
                    return;
                }
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public void close() {
                Object object;
                Object object2 = object = this.d;
                synchronized (object2) {
                    this.f();
                    this.c();
                    return;
                }
            }

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            @Override
            public void onPause() {
                Object object;
                Object object2 = object = this.d;
                synchronized (object2) {
                    this.j = false;
                    this.f();
                    return;
                }
            }

        };
    }

    public void a() {
        this.a.close();
    }

    public void b() {
        this.a.onPause();
    }

    public boolean c() {
        return this.a.a();
    }

    public void d() {
        this.a.b();
    }

    static interface a {
        public boolean a();

        public void b();

        public void close();

        public void onPause();
    }

}

