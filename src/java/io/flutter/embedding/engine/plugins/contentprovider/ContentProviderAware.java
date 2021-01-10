/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package io.flutter.embedding.engine.plugins.contentprovider;

import io.flutter.embedding.engine.plugins.contentprovider.ContentProviderPluginBinding;

public interface ContentProviderAware {
    public void onAttachedToContentProvider(ContentProviderPluginBinding var1);

    public void onDetachedFromContentProvider();
}

