/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 */
package f.h.a.f;

import f.h.a.f.b;
import io.flutter.plugin.common.MethodChannel;

public class d
extends b {
    private final f.h.a.d a;
    private final MethodChannel.Result b;
    private final Boolean c;

    public d(MethodChannel.Result result, f.h.a.d d2, Boolean bl) {
        this.b = result;
        this.a = d2;
        this.c = bl;
    }

    @Override
    public f.h.a.d a() {
        return this.a;
    }

    @Override
    public <T> T a(String string) {
        return null;
    }

    @Override
    public Boolean c() {
        return this.c;
    }

    @Override
    public void error(String string, String string2, Object object) {
        this.b.error(string, string2, object);
    }

    @Override
    public void success(Object object) {
        this.b.success(object);
    }
}

