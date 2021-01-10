/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.MediaFormat
 *  e.j.b.e$a
 *  e.j.b.e$b
 *  e.j.b.u
 *  e.j.b.u$f
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package e.j.b;

import android.content.Context;
import android.media.MediaFormat;
import e.j.b.e;
import e.j.b.u;
import e.j.b.v;

/*
 * Exception performing whole class analysis.
 */
class e
extends u.f {
    private final Context a;
    private a b;

    e(Context context) {
        this.a = context;
    }

    public v a(MediaFormat mediaFormat) {
        if ("text/cea-708".equals((Object)mediaFormat.getString("mime"))) {
            if (this.b == null) {
                this.b = new /* Unavailable Anonymous Inner Class!! */;
            }
            return new /* Unavailable Anonymous Inner Class!! */;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No matching format: ");
        stringBuilder.append(mediaFormat.toString());
        throw new RuntimeException(stringBuilder.toString());
    }

    public boolean b(MediaFormat mediaFormat) {
        if (mediaFormat.containsKey("mime")) {
            return "text/cea-708".equals((Object)mediaFormat.getString("mime"));
        }
        return false;
    }
}

