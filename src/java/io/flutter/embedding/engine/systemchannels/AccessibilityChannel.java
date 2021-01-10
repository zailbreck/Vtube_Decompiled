/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  io.flutter.view.AccessibilityBridge
 *  io.flutter.view.AccessibilityBridge$Action
 *  java.lang.Object
 *  java.lang.String
 */
package io.flutter.embedding.engine.systemchannels;

import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.systemchannels.AccessibilityChannel;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.view.AccessibilityBridge;

public class AccessibilityChannel {
    private static final String TAG = "AccessibilityChannel";
    public final BasicMessageChannel<Object> channel;
    public final FlutterJNI flutterJNI;
    private AccessibilityMessageHandler handler;
    private final BasicMessageChannel.MessageHandler<Object> parsingMessageHandler;

    public AccessibilityChannel(DartExecutor dartExecutor, FlutterJNI flutterJNI) {
        this.parsingMessageHandler = new BasicMessageChannel.MessageHandler<Object>((AccessibilityChannel)this){
            final /* synthetic */ AccessibilityChannel this$0;
            {
                this.this$0 = accessibilityChannel;
            }

            public void onMessage(Object object, io.flutter.plugin.common.BasicMessageChannel$Reply<Object> reply) {
                if (AccessibilityChannel.access$000(this.this$0) == null) {
                    return;
                }
                java.util.HashMap hashMap = (java.util.HashMap)object;
                String string2 = (String)hashMap.get((Object)"type");
                java.util.HashMap hashMap2 = (java.util.HashMap)hashMap.get((Object)"data");
                java.lang.StringBuilder stringBuilder = new java.lang.StringBuilder();
                stringBuilder.append("Received ");
                stringBuilder.append(string2);
                stringBuilder.append(" message.");
                io.flutter.Log.v("AccessibilityChannel", stringBuilder.toString());
                int n2 = -1;
                switch (string2.hashCode()) {
                    default: {
                        break;
                    }
                    case 114203431: {
                        if (!string2.equals((Object)"longPress")) break;
                        n2 = 2;
                        break;
                    }
                    case 114595: {
                        if (!string2.equals((Object)"tap")) break;
                        n2 = 1;
                        break;
                    }
                    case -649620375: {
                        if (!string2.equals((Object)"announce")) break;
                        n2 = 0;
                        break;
                    }
                    case -1140076541: {
                        if (!string2.equals((Object)"tooltip")) break;
                        n2 = 3;
                    }
                }
                if (n2 != 0) {
                    if (n2 != 1) {
                        if (n2 != 2) {
                            if (n2 != 3) {
                                return;
                            }
                            String string3 = (String)hashMap2.get((Object)"message");
                            if (string3 != null) {
                                AccessibilityChannel.access$000(this.this$0).onTooltip(string3);
                                return;
                            }
                        } else {
                            java.lang.Integer n3 = (java.lang.Integer)hashMap.get((Object)"nodeId");
                            if (n3 != null) {
                                AccessibilityChannel.access$000(this.this$0).onLongPress(n3);
                                return;
                            }
                        }
                    } else {
                        java.lang.Integer n4 = (java.lang.Integer)hashMap.get((Object)"nodeId");
                        if (n4 != null) {
                            AccessibilityChannel.access$000(this.this$0).onTap(n4);
                            return;
                        }
                    }
                } else {
                    String string4 = (String)hashMap2.get((Object)"message");
                    if (string4 != null) {
                        AccessibilityChannel.access$000(this.this$0).announce(string4);
                    }
                }
            }
        };
        this.channel = new BasicMessageChannel<Object>(dartExecutor, "flutter/accessibility", StandardMessageCodec.INSTANCE);
        this.channel.setMessageHandler(this.parsingMessageHandler);
        this.flutterJNI = flutterJNI;
    }

    static /* synthetic */ AccessibilityMessageHandler access$000(AccessibilityChannel accessibilityChannel) {
        return accessibilityChannel.handler;
    }

    public void dispatchSemanticsAction(int n2, AccessibilityBridge.Action action) {
        this.flutterJNI.dispatchSemanticsAction(n2, action);
    }

    public void dispatchSemanticsAction(int n2, AccessibilityBridge.Action action, Object object) {
        this.flutterJNI.dispatchSemanticsAction(n2, action, object);
    }

    public void onAndroidAccessibilityDisabled() {
        this.flutterJNI.setSemanticsEnabled(false);
    }

    public void onAndroidAccessibilityEnabled() {
        this.flutterJNI.setSemanticsEnabled(true);
    }

    public void setAccessibilityFeatures(int n2) {
        this.flutterJNI.setAccessibilityFeatures(n2);
    }

    public void setAccessibilityMessageHandler(AccessibilityMessageHandler accessibilityMessageHandler) {
        this.handler = accessibilityMessageHandler;
        this.flutterJNI.setAccessibilityDelegate(accessibilityMessageHandler);
    }

}

