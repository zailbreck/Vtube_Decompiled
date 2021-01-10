/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  java.lang.CharSequence
 *  java.lang.Enum
 *  java.lang.Integer
 *  java.lang.NoSuchFieldError
 *  java.lang.NoSuchFieldException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.List
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package io.flutter.embedding.engine.systemchannels;

import android.graphics.Rect;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.systemchannels.PlatformChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.JSONMethodCodec;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodCodec;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class PlatformChannel {
    private static final String TAG = "PlatformChannel";
    public final MethodChannel channel;
    protected final MethodChannel.MethodCallHandler parsingMethodCallHandler;
    private PlatformMessageHandler platformMessageHandler;

    public PlatformChannel(DartExecutor dartExecutor) {
        this.parsingMethodCallHandler = new MethodChannel.MethodCallHandler((PlatformChannel)this){
            final /* synthetic */ PlatformChannel this$0;
            {
                this.this$0 = platformChannel;
            }

            /*
             * Exception decompiling
             */
            public void onMethodCall(}
        java.lang.IllegalStateException: Parameters not created
        
        