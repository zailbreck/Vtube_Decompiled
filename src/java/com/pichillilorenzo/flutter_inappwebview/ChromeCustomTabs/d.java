/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Service
 *  android.content.Intent
 *  android.os.Binder
 *  android.os.IBinder
 */
package com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs;

import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.IBinder;

public class d
extends Service {
    private static final Binder b = new Binder();

    public IBinder onBind(Intent intent) {
        return b;
    }
}

