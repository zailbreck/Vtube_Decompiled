/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  io.flutter.plugins.videoplayer.VideoPlayerPlugin$KeyForAssetAndPackageName
 *  io.flutter.view.FlutterMain
 *  java.lang.Object
 *  java.lang.String
 */
package io.flutter.plugins.videoplayer;

import io.flutter.plugins.videoplayer.VideoPlayerPlugin;
import io.flutter.view.FlutterMain;

public final class e
implements VideoPlayerPlugin.KeyForAssetAndPackageName {
    public static final /* synthetic */ e a;

    static /* synthetic */ {
        a = new e();
    }

    private /* synthetic */ e() {
    }

    public final String get(String string, String string2) {
        return FlutterMain.getLookupKeyForAsset((String)string, (String)string2);
    }
}

