/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  androidx.annotation.Keep
 *  androidx.lifecycle.e
 *  java.lang.Object
 */
package io.flutter.embedding.engine.plugins.lifecycle;

import androidx.annotation.Keep;
import androidx.lifecycle.e;

@Keep
public class HiddenLifecycleReference {
    private final e lifecycle;

    public HiddenLifecycleReference(e e2) {
        this.lifecycle = e2;
    }

    public e getLifecycle() {
        return this.lifecycle;
    }
}

