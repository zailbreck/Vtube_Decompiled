/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package tv.danmaku.ijk.media.player.misc;

public interface IMediaFormat {
    public static final String KEY_HEIGHT = "height";
    public static final String KEY_MIME = "mime";
    public static final String KEY_WIDTH = "width";

    public int getInteger(String var1);

    public String getString(String var1);
}

