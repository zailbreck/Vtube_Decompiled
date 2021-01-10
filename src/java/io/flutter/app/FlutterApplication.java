/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.content.Context
 *  io.flutter.view.FlutterMain
 */
package io.flutter.app;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import io.flutter.view.FlutterMain;

public class FlutterApplication
extends Application {
    private Activity mCurrentActivity = null;

    public Activity getCurrentActivity() {
        return this.mCurrentActivity;
    }

    public void onCreate() {
        super.onCreate();
        FlutterMain.startInitialization((Context)this);
    }

    public void setCurrentActivity(Activity activity) {
        this.mCurrentActivity = activity;
    }
}

