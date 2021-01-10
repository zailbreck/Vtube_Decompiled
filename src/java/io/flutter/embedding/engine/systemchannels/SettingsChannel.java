/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Float
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.HashMap
 *  java.util.Map
 */
package io.flutter.embedding.engine.systemchannels;

import io.flutter.Log;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.plugin.common.BasicMessageChannel;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.JSONMessageCodec;
import io.flutter.plugin.common.MessageCodec;
import java.util.HashMap;
import java.util.Map;

public class SettingsChannel {
    private static final String ALWAYS_USE_24_HOUR_FORMAT = "alwaysUse24HourFormat";
    public static final String CHANNEL_NAME = "flutter/settings";
    private static final String PLATFORM_BRIGHTNESS = "platformBrightness";
    private static final String TAG = "SettingsChannel";
    private static final String TEXT_SCALE_FACTOR = "textScaleFactor";
    public final BasicMessageChannel<Object> channel;

    public SettingsChannel(DartExecutor dartExecutor) {
        this.channel = new BasicMessageChannel<Object>(dartExecutor, CHANNEL_NAME, JSONMessageCodec.INSTANCE);
    }

    public MessageBuilder startMessage() {
        return new MessageBuilder(this.channel);
    }

    public static class MessageBuilder {
        private final BasicMessageChannel<Object> channel;
        private Map<String, Object> message = new HashMap();

        MessageBuilder(BasicMessageChannel<Object> basicMessageChannel) {
            this.channel = basicMessageChannel;
        }

        public void send() {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Sending message: \ntextScaleFactor: ");
            stringBuilder.append(this.message.get((Object)SettingsChannel.TEXT_SCALE_FACTOR));
            stringBuilder.append("\nalwaysUse24HourFormat: ");
            stringBuilder.append(this.message.get((Object)SettingsChannel.ALWAYS_USE_24_HOUR_FORMAT));
            stringBuilder.append("\nplatformBrightness: ");
            stringBuilder.append(this.message.get((Object)SettingsChannel.PLATFORM_BRIGHTNESS));
            Log.v(SettingsChannel.TAG, stringBuilder.toString());
            this.channel.send(this.message);
        }

        public MessageBuilder setPlatformBrightness(PlatformBrightness platformBrightness) {
            this.message.put((Object)SettingsChannel.PLATFORM_BRIGHTNESS, (Object)platformBrightness.name);
            return this;
        }

        public MessageBuilder setTextScaleFactor(float f2) {
            this.message.put((Object)SettingsChannel.TEXT_SCALE_FACTOR, (Object)Float.valueOf((float)f2));
            return this;
        }

        public MessageBuilder setUse24HourFormat(boolean bl) {
            this.message.put((Object)SettingsChannel.ALWAYS_USE_24_HOUR_FORMAT, (Object)bl);
            return this;
        }
    }

    public static final class PlatformBrightness
    extends Enum<PlatformBrightness> {
        private static final /* synthetic */ PlatformBrightness[] $VALUES;
        public static final /* enum */ PlatformBrightness dark;
        public static final /* enum */ PlatformBrightness light;
        public String name;

        static {
            light = new PlatformBrightness("light");
            dark = new PlatformBrightness("dark");
            PlatformBrightness[] arrplatformBrightness = new PlatformBrightness[]{light, dark};
            $VALUES = arrplatformBrightness;
        }

        private PlatformBrightness(String string3) {
            this.name = string3;
        }

        public static PlatformBrightness valueOf(String string2) {
            return (PlatformBrightness)Enum.valueOf(PlatformBrightness.class, (String)string2);
        }

        public static PlatformBrightness[] values() {
            return (PlatformBrightness[])$VALUES.clone();
        }
    }

}

