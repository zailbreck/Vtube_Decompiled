/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.List
 */
package j;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class d0
extends Enum<d0> {
    public static final /* enum */ d0 c = new d0("TLSv1.3");
    public static final /* enum */ d0 d = new d0("TLSv1.2");
    public static final /* enum */ d0 e = new d0("TLSv1.1");
    public static final /* enum */ d0 f = new d0("TLSv1");
    public static final /* enum */ d0 g = new d0("SSLv3");
    private static final /* synthetic */ d0[] h;
    final String b;

    static {
        d0[] arrd0 = new d0[]{c, d, e, f, g};
        h = arrd0;
    }

    private d0(String string3) {
        this.b = string3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static d0 a(String var0) {
        block13 : {
            block11 : {
                block12 : {
                    var1_1 = var0.hashCode();
                    if (var1_1 == 79201641) break block11;
                    if (var1_1 == 79923350) break block12;
                    switch (var1_1) {
                        default: {
                            ** GOTO lbl-1000
                        }
                        case -503070501: {
                            if (var0.equals((Object)"TLSv1.3")) {
                                var2_2 = 0;
                                ** break;
                            }
                            ** GOTO lbl-1000
                        }
                        case -503070502: {
                            if (var0.equals((Object)"TLSv1.2")) {
                                var2_2 = 1;
                                ** break;
                            }
                            ** GOTO lbl-1000
                        }
                        case -503070503: {
                            if (var0.equals((Object)"TLSv1.1")) {
                                var2_2 = 2;
                                ** break;
                            }
                            ** GOTO lbl-1000
lbl22: // 3 sources:
                            break;
                        }
                    }
                    break block13;
                }
                if (!var0.equals((Object)"TLSv1")) ** GOTO lbl-1000
                var2_2 = 3;
                break block13;
            }
            if (var0.equals((Object)"SSLv3")) {
                var2_2 = 4;
            } else lbl-1000: // 6 sources:
            {
                var2_2 = -1;
            }
        }
        if (var2_2 == 0) return d0.c;
        if (var2_2 == 1) return d0.d;
        if (var2_2 == 2) return d0.e;
        if (var2_2 == 3) return d0.f;
        if (var2_2 == 4) {
            return d0.g;
        }
        var3_3 = new StringBuilder();
        var3_3.append("Unexpected TLS version: ");
        var3_3.append(var0);
        throw new IllegalArgumentException(var3_3.toString());
    }

    static /* varargs */ List<d0> a(String ... arrstring) {
        ArrayList arrayList = new ArrayList(arrstring.length);
        int n2 = arrstring.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            arrayList.add((Object)d0.a(arrstring[i2]));
        }
        return Collections.unmodifiableList((List)arrayList);
    }

    public static d0 valueOf(String string2) {
        return (d0)Enum.valueOf(d0.class, (String)string2);
    }

    public static d0[] values() {
        return (d0[])h.clone();
    }
}

