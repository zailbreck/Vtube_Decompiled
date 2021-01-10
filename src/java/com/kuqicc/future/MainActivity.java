/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  androidx.core.app.a
 *  com.kuqicc.future.a.c
 *  com.kuqicc.future.b.a.b
 *  com.kuqicc.future.b.c.f
 *  com.mopub.common.MoPub
 *  java.lang.String
 */
package com.kuqicc.future;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.core.app.a;
import com.kuqicc.future.a.c;
import com.kuqicc.future.b.a.b;
import com.kuqicc.future.b.c.f;
import com.mopub.common.MoPub;
import io.flutter.embedding.android.FlutterActivity;
import io.flutter.embedding.engine.FlutterEngine;

public class MainActivity
extends FlutterActivity {
    public static Activity b;

    public MainActivity() {
        b = this;
    }

    public static Activity a() {
        return b;
    }

    private void b() {
        if (Build.VERSION.SDK_INT >= 23) {
            a.a((Activity)this, (String[])new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}, (int)123);
        }
    }

    @Override
    protected void onActivityResult(int n2, int n3, Intent intent) {
        super.onActivityResult(n2, n3, intent);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        MoPub.onBackPressed((Activity)this);
    }

    @SuppressLint(value={"SourceLockedOrientationActivity"})
    @Override
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.setRequestedOrientation(1);
        this.getApplicationContext();
        f.a();
        c.a((FlutterEngine)this.getFlutterEngine());
        b.b().a((Activity)this);
        MainActivity.super.b();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        MoPub.onDestroy((Activity)this);
    }

    @Override
    public void onPause() {
        super.onPause();
        MoPub.onPause((Activity)this);
    }

    @Override
    public void onRequestPermissionsResult(int n2, String[] arrstring, int[] arrn) {
        super.onRequestPermissionsResult(n2, arrstring, arrn);
    }

    public void onRestart() {
        Activity.super.onRestart();
        MoPub.onRestart((Activity)this);
    }

    @Override
    public void onResume() {
        super.onResume();
        MoPub.onResume((Activity)this);
    }

    @Override
    public void onStart() {
        super.onStart();
        MoPub.onStart((Activity)this);
    }

    @Override
    public void onStop() {
        super.onStop();
        MoPub.onStop((Activity)this);
    }
}

