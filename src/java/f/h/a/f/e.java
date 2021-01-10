/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 */
package f.h.a.f;

import f.h.a.f.g;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

public class e
extends f.h.a.f.a {
    final MethodCall a;
    final a b;

    public e(MethodCall methodCall, MethodChannel.Result result) {
        this.a = methodCall;
        this.b = new g((e)this, result){
            final MethodChannel.Result a;
            {
                this.a = result;
            }

            @Override
            public void error(String string, String string2, Object object) {
                this.a.error(string, string2, object);
            }

            @Override
            public void success(Object object) {
                this.a.success(object);
            }
        };
    }

    @Override
    public <T> T a(String string) {
        return this.a.argument(string);
    }

    @Override
    public g e() {
        return this.b;
    }

}

