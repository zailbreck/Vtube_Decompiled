/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Canvas
 *  android.util.AttributeSet
 *  android.util.Log
 *  java.lang.Exception
 *  java.lang.String
 */
package com.mintegral.msdk.videocommon.view;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import f.f.a.t.a;

public class MyImageView
extends a {
    public MyImageView(Context context) {
        super(context);
    }

    public MyImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MyImageView(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
            return;
        }
        catch (Exception exception) {
            Log.e((String)"", (String)"MyImageView  -> onDraw() Canvas: trying to use a recycled bitmap");
            return;
        }
    }
}

