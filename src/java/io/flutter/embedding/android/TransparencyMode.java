/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package io.flutter.embedding.android;

public final class TransparencyMode
extends Enum<TransparencyMode> {
    private static final /* synthetic */ TransparencyMode[] $VALUES;
    public static final /* enum */ TransparencyMode opaque = new TransparencyMode();
    public static final /* enum */ TransparencyMode transparent = new TransparencyMode();

    static {
        TransparencyMode[] arrtransparencyMode = new TransparencyMode[]{opaque, transparent};
        $VALUES = arrtransparencyMode;
    }

    public static TransparencyMode valueOf(String string2) {
        return (TransparencyMode)Enum.valueOf(TransparencyMode.class, (String)string2);
    }

    public static TransparencyMode[] values() {
        return (TransparencyMode[])$VALUES.clone();
    }
}

