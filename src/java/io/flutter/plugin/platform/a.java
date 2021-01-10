/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnFocusChangeListener
 *  java.lang.Object
 */
package io.flutter.plugin.platform;

import android.view.View;
import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel;
import io.flutter.plugin.platform.PlatformViewsController;

public final class a
implements View.OnFocusChangeListener {
    private final /* synthetic */ PlatformViewsController.1 b;
    private final /* synthetic */ PlatformViewsChannel.PlatformViewCreationRequest c;

    public /* synthetic */ a(PlatformViewsController.1 var1, PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
        this.b = var1;
        this.c = platformViewCreationRequest;
    }

    public final void onFocusChange(View view, boolean bl) {
        this.b.a(this.c, view, bl);
    }
}

