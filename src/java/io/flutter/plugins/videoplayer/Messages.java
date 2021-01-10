/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Double
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 */
package io.flutter.plugins.videoplayer;

import java.util.HashMap;

public class Messages {
    static /* synthetic */ HashMap access$000(Exception exception) {
        return Messages.wrapError(exception);
    }

    private static HashMap wrapError(Exception exception) {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"message", (Object)exception.toString());
        hashMap.put((Object)"code", null);
        hashMap.put((Object)"details", null);
        return hashMap;
    }

    public static class CreateMessage {
        private String asset;
        private String formatHint;
        private String packageName;
        private String uri;

        static CreateMessage fromMap(HashMap hashMap) {
            CreateMessage createMessage = new CreateMessage();
            createMessage.asset = (String)hashMap.get((Object)"asset");
            createMessage.uri = (String)hashMap.get((Object)"uri");
            createMessage.packageName = (String)hashMap.get((Object)"packageName");
            createMessage.formatHint = (String)hashMap.get((Object)"formatHint");
            return createMessage;
        }

        public String getAsset() {
            return this.asset;
        }

        public String getFormatHint() {
            return this.formatHint;
        }

        public String getPackageName() {
            return this.packageName;
        }

        public String getUri() {
            return this.uri;
        }

        public void setAsset(String string2) {
            this.asset = string2;
        }

        public void setFormatHint(String string2) {
            this.formatHint = string2;
        }

        public void setPackageName(String string2) {
            this.packageName = string2;
        }

        public void setUri(String string2) {
            this.uri = string2;
        }

        HashMap toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put((Object)"asset", (Object)this.asset);
            hashMap.put((Object)"uri", (Object)this.uri);
            hashMap.put((Object)"packageName", (Object)this.packageName);
            hashMap.put((Object)"formatHint", (Object)this.formatHint);
            return hashMap;
        }
    }

    public static class LoopingMessage {
        private Boolean isLooping;
        private Long textureId;

        static LoopingMessage fromMap(HashMap hashMap) {
            LoopingMessage loopingMessage = new LoopingMessage();
            boolean bl = hashMap.get((Object)"textureId") instanceof Integer;
            Object object = hashMap.get((Object)"textureId");
            long l2 = bl ? (long)((Integer)object).intValue() : (Long)object;
            loopingMessage.textureId = l2;
            loopingMessage.isLooping = (Boolean)hashMap.get((Object)"isLooping");
            return loopingMessage;
        }

        public Boolean getIsLooping() {
            return this.isLooping;
        }

        public Long getTextureId() {
            return this.textureId;
        }

        public void setIsLooping(Boolean bl) {
            this.isLooping = bl;
        }

        public void setTextureId(Long l2) {
            this.textureId = l2;
        }

        HashMap toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put((Object)"textureId", (Object)this.textureId);
            hashMap.put((Object)"isLooping", (Object)this.isLooping);
            return hashMap;
        }
    }

    public static class MixWithOthersMessage {
        private Boolean mixWithOthers;

        static MixWithOthersMessage fromMap(HashMap hashMap) {
            MixWithOthersMessage mixWithOthersMessage = new MixWithOthersMessage();
            mixWithOthersMessage.mixWithOthers = (Boolean)hashMap.get((Object)"mixWithOthers");
            return mixWithOthersMessage;
        }

        public Boolean getMixWithOthers() {
            return this.mixWithOthers;
        }

        public void setMixWithOthers(Boolean bl) {
            this.mixWithOthers = bl;
        }

        HashMap toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put((Object)"mixWithOthers", (Object)this.mixWithOthers);
            return hashMap;
        }
    }

    public static class PositionMessage {
        private Long position;
        private Long textureId;

        static PositionMessage fromMap(HashMap hashMap) {
            PositionMessage positionMessage = new PositionMessage();
            boolean bl = hashMap.get((Object)"textureId") instanceof Integer;
            Object object = hashMap.get((Object)"textureId");
            long l2 = bl ? (long)((Integer)object).intValue() : (Long)object;
            positionMessage.textureId = l2;
            boolean bl2 = hashMap.get((Object)"position") instanceof Integer;
            Object object2 = hashMap.get((Object)"position");
            long l3 = bl2 ? (long)((Integer)object2).intValue() : (Long)object2;
            positionMessage.position = l3;
            return positionMessage;
        }

        public Long getPosition() {
            return this.position;
        }

        public Long getTextureId() {
            return this.textureId;
        }

        public void setPosition(Long l2) {
            this.position = l2;
        }

        public void setTextureId(Long l2) {
            this.textureId = l2;
        }

        HashMap toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put((Object)"textureId", (Object)this.textureId);
            hashMap.put((Object)"position", (Object)this.position);
            return hashMap;
        }
    }

    public static class TextureMessage {
        private Long textureId;

        static TextureMessage fromMap(HashMap hashMap) {
            TextureMessage textureMessage = new TextureMessage();
            boolean bl = hashMap.get((Object)"textureId") instanceof Integer;
            Object object = hashMap.get((Object)"textureId");
            long l2 = bl ? (long)((Integer)object).intValue() : (Long)object;
            textureMessage.textureId = l2;
            return textureMessage;
        }

        public Long getTextureId() {
            return this.textureId;
        }

        public void setTextureId(Long l2) {
            this.textureId = l2;
        }

        HashMap toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put((Object)"textureId", (Object)this.textureId);
            return hashMap;
        }
    }

    public static interface VideoPlayerApi {
        public TextureMessage create(CreateMessage var1);

        public void dispose(TextureMessage var1);

        public void initialize();

        public void pause(TextureMessage var1);

        public void play(TextureMessage var1);

        public PositionMessage position(TextureMessage var1);

        public void seekTo(PositionMessage var1);

        public void setLooping(LoopingMessage var1);

        public void setMixWithOthers(MixWithOthersMessage var1);

        public void setVolume(VolumeMessage var1);
    }

    public static class VolumeMessage {
        private Long textureId;
        private Double volume;

        static VolumeMessage fromMap(HashMap hashMap) {
            VolumeMessage volumeMessage = new VolumeMessage();
            boolean bl = hashMap.get((Object)"textureId") instanceof Integer;
            Object object = hashMap.get((Object)"textureId");
            long l2 = bl ? (long)((Integer)object).intValue() : (Long)object;
            volumeMessage.textureId = l2;
            volumeMessage.volume = (Double)hashMap.get((Object)"volume");
            return volumeMessage;
        }

        public Long getTextureId() {
            return this.textureId;
        }

        public Double getVolume() {
            return this.volume;
        }

        public void setTextureId(Long l2) {
            this.textureId = l2;
        }

        public void setVolume(Double d2) {
            this.volume = d2;
        }

        HashMap toMap() {
            HashMap hashMap = new HashMap();
            hashMap.put((Object)"textureId", (Object)this.textureId);
            hashMap.put((Object)"volume", (Object)this.volume);
            return hashMap;
        }
    }

}

