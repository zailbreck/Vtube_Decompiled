/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.InputDevice
 *  android.view.KeyEvent
 *  java.lang.Character
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Map
 */
package io.flutter.embedding.engine.systemchannels;

import android.os.Build;
import android.view.InputDevice;
import android.view.KeyEvent;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.JSONMessageCodec;
import io.flutter.plugin.common.MessageCodec;
import java.util.HashMap;
import java.util.Map;

public class KeyEventChannel {
    public final BasicMessageChannel<Object> channel;

    public KeyEventChannel(DartExecutor dartExecutor) {
        this.channel = new BasicMessageChannel<Object>(dartExecutor, "flutter/keyevent", JSONMessageCodec.INSTANCE);
    }

    private void encodeKeyEvent(FlutterKeyEvent flutterKeyEvent, Map<String, Object> map) {
        map.put((Object)"flags", (Object)flutterKeyEvent.flags);
        map.put((Object)"plainCodePoint", (Object)flutterKeyEvent.plainCodePoint);
        map.put((Object)"codePoint", (Object)flutterKeyEvent.codePoint);
        map.put((Object)"keyCode", (Object)flutterKeyEvent.keyCode);
        map.put((Object)"scanCode", (Object)flutterKeyEvent.scanCode);
        map.put((Object)"metaState", (Object)flutterKeyEvent.metaState);
        Character c2 = flutterKeyEvent.complexCharacter;
        if (c2 != null) {
            map.put((Object)"character", (Object)c2.toString());
        }
        map.put((Object)"source", (Object)flutterKeyEvent.source);
        map.put((Object)"vendorId", (Object)flutterKeyEvent.vendorId);
        map.put((Object)"productId", (Object)flutterKeyEvent.productId);
        map.put((Object)"deviceId", (Object)flutterKeyEvent.deviceId);
        map.put((Object)"repeatCount", (Object)flutterKeyEvent.repeatCount);
    }

    public void keyDown(FlutterKeyEvent flutterKeyEvent) {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"type", (Object)"keydown");
        hashMap.put((Object)"keymap", (Object)"android");
        KeyEventChannel.super.encodeKeyEvent(flutterKeyEvent, (Map<String, Object>)hashMap);
        this.channel.send((Object)hashMap);
    }

    public void keyUp(FlutterKeyEvent flutterKeyEvent) {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"type", (Object)"keyup");
        hashMap.put((Object)"keymap", (Object)"android");
        KeyEventChannel.super.encodeKeyEvent(flutterKeyEvent, (Map<String, Object>)hashMap);
        this.channel.send((Object)hashMap);
    }

    public static class FlutterKeyEvent {
        public final int codePoint;
        public final Character complexCharacter;
        public final int deviceId;
        public final int flags;
        public final int keyCode;
        public final int metaState;
        public final int plainCodePoint;
        public final int productId;
        public final int repeatCount;
        public final int scanCode;
        public final int source;
        public final int vendorId;

        public FlutterKeyEvent(int n2, int n3, int n4, int n5, int n6, Character c2, int n7, int n8, int n9, int n10) {
            this.deviceId = n2;
            this.flags = n3;
            this.plainCodePoint = n4;
            this.codePoint = n5;
            this.keyCode = n6;
            this.complexCharacter = c2;
            this.scanCode = n7;
            this.metaState = n8;
            this.source = n9;
            this.repeatCount = n10;
            InputDevice inputDevice = InputDevice.getDevice((int)n2);
            if (inputDevice != null && Build.VERSION.SDK_INT >= 19) {
                this.vendorId = inputDevice.getVendorId();
                this.productId = inputDevice.getProductId();
                return;
            }
            this.vendorId = 0;
            this.productId = 0;
        }

        public FlutterKeyEvent(KeyEvent keyEvent) {
            super(keyEvent, null);
        }

        public FlutterKeyEvent(KeyEvent keyEvent, Character c2) {
            super(keyEvent.getDeviceId(), keyEvent.getFlags(), keyEvent.getUnicodeChar(0), keyEvent.getUnicodeChar(), keyEvent.getKeyCode(), c2, keyEvent.getScanCode(), keyEvent.getMetaState(), keyEvent.getSource(), keyEvent.getRepeatCount());
        }
    }

}

