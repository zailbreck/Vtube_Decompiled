/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  io.flutter.plugins.videoplayer.VideoPlayerPlugin$KeyForAssetFn
 *  io.flutter.view.FlutterMain
 *  java.lang.Object
 *  java.lang.String
 */
package io.flutter.plugins.videoplayer;

import io.flutter.plugins.videoplayer.VideoPlayerPlugin;
import io.flutter.view.FlutterMain;

public final class a
implements VideoPlayerPlugin.KeyForAssetFn {
    public static final /* synthetic */ a a;

    static /* synthetic */ {
        a = new a();
    }

    private /* synthetic */ a() {
    }

    public final String get(String string) {
        return FlutterMain.getLookupKeyForAsset((String)string);
    }
}

