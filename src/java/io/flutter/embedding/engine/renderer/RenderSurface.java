/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package io.flutter.embedding.engine.renderer;

import io.flutter.embedding.engine.renderer.FlutterRenderer;

public interface RenderSurface {
    public void attachToRenderer(FlutterRenderer var1);

    public void detachFromRenderer();

    public FlutterRenderer getAttachedRenderer();
}

