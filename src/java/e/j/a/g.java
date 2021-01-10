/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  androidx.media2.common.VideoSize
 *  java.lang.Object
 *  java.lang.String
 */
package e.j.a;

import androidx.media2.common.VideoSize;

public final class g {
    private final VideoSize a;

    g(VideoSize videoSize) {
        this.a = videoSize;
    }

    public boolean equals(Object object) {
        if (object == null) {
            return false;
        }
        if (this == object) {
            return true;
        }
        if (object instanceof g) {
            g g2 = (g)object;
            return this.a.equals((Object)g2.a);
        }
        return false;
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }
}

