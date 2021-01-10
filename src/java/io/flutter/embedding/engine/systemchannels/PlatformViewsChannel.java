/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.PrintWriter
 *  java.io.StringWriter
 *  java.io.Writer
 *  java.lang.Exception
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.nio.ByteBuffer
 */
package io.flutter.embedding.engine.systemchannels;

import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.MethodCodec;
import io.flutter.plugin.common.StandardMethodCodec;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.ByteBuffer;

public class PlatformViewsChannel {
    private static final String TAG = "PlatformViewsChannel";
    private final MethodChannel channel;
    private PlatformViewsHandler handler;
    private final MethodChannel.MethodCallHandler parsingHandler;

    public PlatformViewsChannel(DartExecutor dartExecutor) {
        this.parsingHandler = new MethodChannel.MethodCallHandler((PlatformViewsChannel)this){
            final /* synthetic */ PlatformViewsChannel this$0;
            {
                this.this$0 = platformViewsChannel;
            }

            private void clearFocus(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel$Result result) {
                int n2 = (java.lang.Integer)methodCall.arguments();
                try {
                    PlatformViewsChannel.access$000(this.this$0).clearFocus(n2);
                    result.success(null);
                    return;
                }
                catch (java.lang.IllegalStateException illegalStateException) {
                    result.error("error", PlatformViewsChannel.access$100((Exception)((Object)illegalStateException)), null);
                    return;
                }
            }

            private void create(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel$Result result) {
                java.util.Map map = (java.util.Map)methodCall.arguments();
                int n2 = (java.lang.Integer)map.get((Object)"id");
                String string2 = (String)map.get((Object)"viewType");
                double d2 = (java.lang.Double)map.get((Object)"width");
                double d3 = (java.lang.Double)map.get((Object)"height");
                int n3 = (java.lang.Integer)map.get((Object)"direction");
                ByteBuffer byteBuffer = map.containsKey((Object)"params") ? ByteBuffer.wrap((byte[])((byte[])map.get((Object)"params"))) : null;
                PlatformViewCreationRequest platformViewCreationRequest = new PlatformViewCreationRequest(n2, string2, d2, d3, n3, byteBuffer);
                try {
                    result.success(PlatformViewsChannel.access$000(this.this$0).createPlatformView(platformViewCreationRequest));
                    return;
                }
                catch (java.lang.IllegalStateException illegalStateException) {
                    result.error("error", PlatformViewsChannel.access$100((Exception)((Object)illegalStateException)), null);
                    return;
                }
            }

            private void dispose(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel$Result result) {
                int n2 = (java.lang.Integer)methodCall.arguments();
                try {
                    PlatformViewsChannel.access$000(this.this$0).disposePlatformView(n2);
                    result.success(null);
                    return;
                }
                catch (java.lang.IllegalStateException illegalStateException) {
                    result.error("error", PlatformViewsChannel.access$100((Exception)((Object)illegalStateException)), null);
                    return;
                }
            }

            private void resize(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel$Result result) {
                java.util.Map map = (java.util.Map)methodCall.arguments();
                PlatformViewResizeRequest platformViewResizeRequest = new PlatformViewResizeRequest((java.lang.Integer)map.get((Object)"id"), (java.lang.Double)map.get((Object)"width"), (java.lang.Double)map.get((Object)"height"));
                try {
                    PlatformViewsChannel.access$000(this.this$0).resizePlatformView(platformViewResizeRequest, new Runnable(this, result){
                        final /* synthetic */ 1 this$1;
                        final /* synthetic */ io.flutter.plugin.common.MethodChannel$Result val$result;
                        {
                            this.this$1 = var1;
                            this.val$result = result;
                        }

                        public void run() {
                            this.val$result.success(null);
                        }
                    });
                    return;
                }
                catch (java.lang.IllegalStateException illegalStateException) {
                    result.error("error", PlatformViewsChannel.access$100((Exception)((Object)illegalStateException)), null);
                    return;
                }
            }

            private void setDirection(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel$Result result) {
                java.util.Map map = (java.util.Map)methodCall.arguments();
                int n2 = (java.lang.Integer)map.get((Object)"id");
                int n3 = (java.lang.Integer)map.get((Object)"direction");
                try {
                    PlatformViewsChannel.access$000(this.this$0).setDirection(n2, n3);
                    result.success(null);
                    return;
                }
                catch (java.lang.IllegalStateException illegalStateException) {
                    result.error("error", PlatformViewsChannel.access$100((Exception)((Object)illegalStateException)), null);
                    return;
                }
            }

            /*
             * Loose catch block
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Lifted jumps to return sites
             */
            private void touch(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel$Result result) {
                io.flutter.plugin.common.MethodChannel$Result result2;
                void var5_8;
                block4 : {
                    java.util.List list = (java.util.List)methodCall.arguments();
                    PlatformViewTouch platformViewTouch = new PlatformViewTouch((java.lang.Integer)list.get(0), (Number)list.get(1), (Number)list.get(2), (java.lang.Integer)list.get(3), (java.lang.Integer)list.get(4), list.get(5), list.get(6), (java.lang.Integer)list.get(7), (java.lang.Integer)list.get(8), (float)((java.lang.Double)list.get(9)).doubleValue(), (float)((java.lang.Double)list.get(10)).doubleValue(), (java.lang.Integer)list.get(11), (java.lang.Integer)list.get(12), (java.lang.Integer)list.get(13), (java.lang.Integer)list.get(14));
                    PlatformViewsChannel.access$000(this.this$0).onTouch(platformViewTouch);
                    result2 = result;
                    try {
                        result2.success(null);
                        return;
                    }
                    catch (java.lang.IllegalStateException illegalStateException) {}
                    break block4;
                    catch (java.lang.IllegalStateException illegalStateException) {
                        result2 = result;
                    }
                }
                result2.error("error", PlatformViewsChannel.access$100((Exception)var5_8), null);
            }

            public void onMethodCall(io.flutter.plugin.common.MethodCall methodCall, io.flutter.plugin.common.MethodChannel$Result result) {
                if (PlatformViewsChannel.access$000(this.this$0) == null) {
                    return;
                }
                java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
                stringBuilder.append("Received '");
                stringBuilder.append(methodCall.method);
                stringBuilder.append("' message.");
                io.flutter.Log.v("PlatformViewsChannel", stringBuilder.toString());
                String string2 = methodCall.method;
                int n2 = -1;
                switch (string2.hashCode()) {
                    default: {
                        break;
                    }
                    case 1671767583: {
                        if (!string2.equals((Object)"dispose")) break;
                        n2 = 1;
                        break;
                    }
                    case 576796989: {
                        if (!string2.equals((Object)"setDirection")) break;
                        n2 = 4;
                        break;
                    }
                    case 110550847: {
                        if (!string2.equals((Object)"touch")) break;
                        n2 = 3;
                        break;
                    }
                    case -756050293: {
                        if (!string2.equals((Object)"clearFocus")) break;
                        n2 = 5;
                        break;
                    }
                    case -934437708: {
                        if (!string2.equals((Object)"resize")) break;
                        n2 = 2;
                        break;
                    }
                    case -1352294148: {
                        if (!string2.equals((Object)"create")) break;
                        n2 = 0;
                    }
                }
                if (n2 != 0) {
                    if (n2 != 1) {
                        if (n2 != 2) {
                            if (n2 != 3) {
                                if (n2 != 4) {
                                    if (n2 != 5) {
                                        result.notImplemented();
                                        return;
                                    }
                                    1.super.clearFocus(methodCall, result);
                                    return;
                                }
                                1.super.setDirection(methodCall, result);
                                return;
                            }
                            1.super.touch(methodCall, result);
                            return;
                        }
                        1.super.resize(methodCall, result);
                        return;
                    }
                    1.super.dispose(methodCall, result);
                    return;
                }
                1.super.create(methodCall, result);
            }
        };
        this.channel = new MethodChannel(dartExecutor, "flutter/platform_views", StandardMethodCodec.INSTANCE);
        this.channel.setMethodCallHandler(this.parsingHandler);
    }

    static /* synthetic */ PlatformViewsHandler access$000(PlatformViewsChannel platformViewsChannel) {
        return platformViewsChannel.handler;
    }

    static /* synthetic */ String access$100(Exception exception) {
        return PlatformViewsChannel.detailedExceptionString(exception);
    }

    private static String detailedExceptionString(Exception exception) {
        StringWriter stringWriter = new StringWriter();
        exception.printStackTrace(new PrintWriter((Writer)stringWriter));
        return stringWriter.toString();
    }

    public void invokeViewFocused(int n2) {
        MethodChannel methodChannel = this.channel;
        if (methodChannel == null) {
            return;
        }
        methodChannel.invokeMethod("viewFocused", n2);
    }

    public void setPlatformViewsHandler(PlatformViewsHandler platformViewsHandler) {
        this.handler = platformViewsHandler;
    }

    public static class PlatformViewCreationRequest {
        public final int direction;
        public final double logicalHeight;
        public final double logicalWidth;
        public final ByteBuffer params;
        public final int viewId;
        public final String viewType;

        public PlatformViewCreationRequest(int n2, String string2, double d2, double d3, int n3, ByteBuffer byteBuffer) {
            this.viewId = n2;
            this.viewType = string2;
            this.logicalWidth = d2;
            this.logicalHeight = d3;
            this.direction = n3;
            this.params = byteBuffer;
        }
    }

    public static class PlatformViewResizeRequest {
        public final double newLogicalHeight;
        public final double newLogicalWidth;
        public final int viewId;

        public PlatformViewResizeRequest(int n2, double d2, double d3) {
            this.viewId = n2;
            this.newLogicalWidth = d2;
            this.newLogicalHeight = d3;
        }
    }

    public static class PlatformViewTouch {
        public final int action;
        public final int buttonState;
        public final int deviceId;
        public final Number downTime;
        public final int edgeFlags;
        public final Number eventTime;
        public final int flags;
        public final int metaState;
        public final int pointerCount;
        public final Object rawPointerCoords;
        public final Object rawPointerPropertiesList;
        public final int source;
        public final int viewId;
        public final float xPrecision;
        public final float yPrecision;

        PlatformViewTouch(int n2, Number number, Number number2, int n3, int n4, Object object, Object object2, int n5, int n6, float f2, float f3, int n7, int n8, int n9, int n10) {
            this.viewId = n2;
            this.downTime = number;
            this.eventTime = number2;
            this.action = n3;
            this.pointerCount = n4;
            this.rawPointerPropertiesList = object;
            this.rawPointerCoords = object2;
            this.metaState = n5;
            this.buttonState = n6;
            this.xPrecision = f2;
            this.yPrecision = f3;
            this.deviceId = n7;
            this.edgeFlags = n8;
            this.source = n9;
            this.flags = n10;
        }
    }

    public static interface PlatformViewsHandler {
        public void clearFocus(int var1);

        public long createPlatformView(PlatformViewCreationRequest var1);

        public void disposePlatformView(int var1);

        public void onTouch(PlatformViewTouch var1);

        public void resizePlatformView(PlatformViewResizeRequest var1, Runnable var2);

        public void setDirection(int var1, int var2);
    }

}

