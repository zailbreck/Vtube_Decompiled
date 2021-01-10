/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Intent
 *  android.os.Bundle
 *  androidx.lifecycle.e
 *  java.lang.Object
 *  java.lang.String
 */
package io.flutter.embedding.engine.plugins.activity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.lifecycle.e;

public interface ActivityControlSurface {
    public void attachToActivity(Activity var1, e var2);

    public void detachFromActivity();

    public void detachFromActivityForConfigChanges();

    public boolean onActivityResult(int var1, int var2, Intent var3);

    public void onNewIntent(Intent var1);

    public boolean onRequestPermissionsResult(int var1, String[] var2, int[] var3);

    public void onRestoreInstanceState(Bundle var1);

    public void onSaveInstanceState(Bundle var1);

    public void onUserLeaveHint();
}

