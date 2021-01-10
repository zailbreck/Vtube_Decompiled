/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.util.List
 *  java.util.concurrent.Callable
 */
package io.flutter.plugins.pathprovider;

import io.flutter.plugins.pathprovider.PathProviderPlugin;
import java.util.List;
import java.util.concurrent.Callable;

public final class a
implements Callable {
    private final /* synthetic */ PathProviderPlugin b;

    public /* synthetic */ a(PathProviderPlugin pathProviderPlugin) {
        this.b = pathProviderPlugin;
    }

    public final Object call() {
        return this.b.d();
    }
}

