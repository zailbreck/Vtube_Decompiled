/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.Serializable
 *  java.lang.Object
 *  java.lang.String
 */
package i.k.b;

import i.k.b.c;
import i.k.b.d;
import i.k.b.f;
import java.io.Serializable;

public abstract class e<R>
implements c<R>,
Serializable {
    public e(int n2) {
    }

    public String toString() {
        String string = f.a(this);
        d.b(string, "Reflection.renderLambdaToString(this)");
        return string;
    }
}

