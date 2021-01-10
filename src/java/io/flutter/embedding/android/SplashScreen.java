/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.View
 *  java.lang.Object
 *  java.lang.Runnable
 */
package io.flutter.embedding.android;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

public interface SplashScreen {
    public View createSplashView(Context var1, Bundle var2);

    @SuppressLint(value={"NewApi"})
    public boolean doesSplashViewRememberItsTransition();

    @SuppressLint(value={"NewApi"})
    public Bundle saveSplashScreenState();

    public void transitionToFlutter(Runnable var1);
}

