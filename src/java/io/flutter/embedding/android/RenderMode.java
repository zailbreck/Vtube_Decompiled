/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package io.flutter.embedding.android;

public final class RenderMode
extends Enum<RenderMode> {
    private static final /* synthetic */ RenderMode[] $VALUES;
    public static final /* enum */ RenderMode surface = new RenderMode();
    public static final /* enum */ RenderMode texture = new RenderMode();

    static {
        RenderMode[] arrrenderMode = new RenderMode[]{surface, texture};
        $VALUES = arrrenderMode;
    }

    public static RenderMode valueOf(String string2) {
        return (RenderMode)Enum.valueOf(RenderMode.class, (String)string2);
    }

    public static RenderMode[] values() {
        return (RenderMode[])$VALUES.clone();
    }
}

