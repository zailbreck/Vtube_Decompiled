/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package f.h.a.f;

import f.h.a.f.b;
import f.h.a.f.g;

public abstract class a
extends b {
    protected abstract g e();

    @Override
    public void error(String string, String string2, Object object) {
        this.e().error(string, string2, object);
    }

    @Override
    public void success(Object object) {
        this.e().success(object);
    }
}

