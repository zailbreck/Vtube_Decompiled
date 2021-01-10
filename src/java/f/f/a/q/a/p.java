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
package f.f.a.q.a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class p
extends Enum<p> {
    public static final /* enum */ p c = new p("TLSv1.3");
    public static final /* enum */ p d = new p("TLSv1.2");
    public static final /* enum */ p e = new p("TLSv1.1");
    public static final /* enum */ p f = new p("TLSv1");
    public static final /* enum */ p g = new p("SSLv3");
    private static final /* synthetic */ p[] h;
    final String b;

    static {
        p[] arrp = new p[]{c, d, e, f, g};
        h = arrp;
    }

    private p(String string3) {
        this.b = string3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public static p a(String var0) {
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
        if (var2_2 == 0) return p.c;
        if (var2_2 == 1) return p.d;
        if (var2_2 == 2) return p.e;
        if (var2_2 == 3) return p.f;
        if (var2_2 == 4) {
            return p.g;
        }
        var3_3 = new StringBuilder();
        var3_3.append("Unexpected TLS version: ");
        var3_3.append(var0);
        throw new IllegalArgumentException(var3_3.toString());
    }

    static /* varargs */ List<p> a(String ... arrstring) {
        ArrayList arrayList = new ArrayList(arrstring.length);
        int n2 = arrstring.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            arrayList.add((Object)p.a(arrstring[i2]));
        }
        return Collections.unmodifiableList((List)arrayList);
    }

    public static p valueOf(String string2) {
        return (p)Enum.valueOf(p.class, (String)string2);
    }

    public static p[] values() {
        return (p[])h.clone();
    }
}

