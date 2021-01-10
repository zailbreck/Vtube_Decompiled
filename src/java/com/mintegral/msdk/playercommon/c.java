/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnPreparedListener
 *  java.lang.Object
 *  java.lang.String
 */
package com.mintegral.msdk.playercommon;

import android.media.MediaPlayer;
import f.f.a.e.f.h;

public final class c {
    private MediaPlayer a;
    private volatile boolean b;
    private volatile MediaPlayer.OnPreparedListener c;
    Object d = new Object();

    public c(String string, MediaPlayer mediaPlayer) {
        this.a = mediaPlayer;
        this.b = false;
        this.a.setOnPreparedListener(new MediaPlayer.OnPreparedListener(){

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public final void onPrepared(MediaPlayer mediaPlayer) {
                Object object;
                Object object2 = object = c.this.d;
                synchronized (object2) {
                    c.this.b = true;
                    h.a("test_media_player", "\u521d\u59cb\u5316\u5b8c\u6210");
                    if (c.this.c != null) {
                        c.this.c.onPrepared(mediaPlayer);
                    }
                    return;
                }
            }
        });
        this.a.prepareAsync();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(MediaPlayer.OnPreparedListener onPreparedListener) {
        Object object;
        Object object2 = object = this.d;
        synchronized (object2) {
            this.c = onPreparedListener;
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean a() {
        Object object;
        Object object2 = object = this.d;
        synchronized (object2) {
            return this.b;
        }
    }

    public final MediaPlayer b() {
        return this.a;
    }

}

