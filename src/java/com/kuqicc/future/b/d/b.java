/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.kuqicc.future.b.d.d
 *  java.io.File
 *  java.lang.Object
 *  java.lang.String
 */
package com.kuqicc.future.b.d;

import com.kuqicc.future.b.d.d;
import io.flutter.plugin.common.MethodChannel;
import java.io.File;

public final class b
implements h.b.q.d {
    private final /* synthetic */ String a;
    private final /* synthetic */ MethodChannel.Result b;
    private final /* synthetic */ File c;

    public /* synthetic */ b(String string2, MethodChannel.Result result, File file) {
        this.a = string2;
        this.b = result;
        this.c = file;
    }

    public final void a(Object object) {
        d.a((String)this.a, (MethodChannel.Result)this.b, (File)this.c, (byte[])((byte[])object));
    }
}

