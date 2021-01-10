/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Integer
 *  java.lang.NumberFormatException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.ProtocolException
 */
package j.f0.g;

import j.w;
import java.net.ProtocolException;

public final class k {
    public final w a;
    public final int b;
    public final String c;

    public k(w w2, int n2, String string2) {
        this.a = w2;
        this.b = n2;
        this.c = string2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static k a(String var0) {
        var1_1 = var0.startsWith("HTTP/1.");
        var2_2 = 9;
        if (!var1_1) ** GOTO lbl20
        if (var0.length() >= var2_2 && var0.charAt(8) == ' ') {
            var23_3 = -48 + var0.charAt(7);
            if (var23_3 == 0) {
                var6_4 = w.c;
            } else {
                if (var23_3 != 1) {
                    var24_5 = new StringBuilder();
                    var24_5.append("Unexpected status line: ");
                    var24_5.append(var0);
                    throw new ProtocolException(var24_5.toString());
                }
                var6_4 = w.d;
            }
        } else {
            var20_6 = new StringBuilder();
            var20_6.append("Unexpected status line: ");
            var20_6.append(var0);
            throw new ProtocolException(var20_6.toString());
lbl20: // 1 sources:
            if (!var0.startsWith("ICY ")) {
                var3_14 = new StringBuilder();
                var3_14.append("Unexpected status line: ");
                var3_14.append(var0);
                throw new ProtocolException(var3_14.toString());
            }
            var6_4 = w.c;
            var2_2 = 4;
        }
        var7_7 = var0.length();
        var8_8 = var2_2 + 3;
        if (var7_7 < var8_8) {
            var9_13 = new StringBuilder();
            var9_13.append("Unexpected status line: ");
            var9_13.append(var0);
            throw new ProtocolException(var9_13.toString());
        }
        try {
            var15_9 = Integer.parseInt((String)var0.substring(var2_2, var8_8));
        }
        catch (NumberFormatException v0) {
            var12_12 = new StringBuilder();
            var12_12.append("Unexpected status line: ");
            var12_12.append(var0);
            throw new ProtocolException(var12_12.toString());
        }
        if (var0.length() <= var8_8) {
            var16_10 = "";
            return new k(var6_4, var15_9, var16_10);
        }
        if (var0.charAt(var8_8) == ' ') {
            var16_10 = var0.substring(var2_2 + 4);
            return new k(var6_4, var15_9, var16_10);
        }
        var17_11 = new StringBuilder();
        var17_11.append("Unexpected status line: ");
        var17_11.append(var0);
        throw new ProtocolException(var17_11.toString());
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string2 = this.a == w.c ? "HTTP/1.0" : "HTTP/1.1";
        stringBuilder.append(string2);
        stringBuilder.append(' ');
        stringBuilder.append(this.b);
        if (this.c != null) {
            stringBuilder.append(' ');
            stringBuilder.append(this.c);
        }
        return stringBuilder.toString();
    }
}

