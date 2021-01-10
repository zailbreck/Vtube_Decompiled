/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.Callable
 */
package io.flutter.plugins.pathprovider;

import io.flutter.plugins.pathprovider.PathProviderPlugin;
import java.util.concurrent.Callable;

public final class e
implements Callable {
    private final /* synthetic */ PathProviderPlugin b;

    public /* synthetic */ e(PathProviderPlugin pathProviderPlugin) {
        this.b = pathProviderPlugin;
    }

    public final Object call() {
        return this.b.b();
    }
}

