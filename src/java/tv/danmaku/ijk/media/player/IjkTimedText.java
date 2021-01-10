/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Rect
 *  java.lang.Object
 *  java.lang.String
 */
package tv.danmaku.ijk.media.player;

import android.graphics.Rect;

public final class IjkTimedText {
    public Rect mTextBounds = null;
    public String mTextChars = null;

    public IjkTimedText(Rect rect, String string2) {
        this.mTextBounds = rect;
        this.mTextChars = string2;
    }

    public Rect getBounds() {
        return this.mTextBounds;
    }

    public String getText() {
        return this.mTextChars;
    }
}

