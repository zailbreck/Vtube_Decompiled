/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  io.flutter.view.TextureRegistry
 *  io.flutter.view.TextureRegistry$SurfaceTextureEntry
 *  java.lang.Object
 *  java.lang.String
 */
package f.c.a;

import android.content.Context;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.view.TextureRegistry;

interface a {
    public TextureRegistry.SurfaceTextureEntry a();

    public void a(int var1);

    public void a(boolean var1);

    public void b(int var1);

    public void b(boolean var1);

    public Context context();

    public String lookupKeyForAsset(String var1, String var2);

    public BinaryMessenger messenger();
}

