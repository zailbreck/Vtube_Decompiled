/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.IOException
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package j.f0.i;

import j.f0.c;
import java.io.IOException;
import k.f;

public final class e {
    static final f a;
    private static final String[] b;
    static final String[] c;
    static final String[] d;

    static {
        String[] arrstring;
        String[] arrstring2;
        a = f.c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
        b = new String[]{"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
        c = new String[64];
        d = new String[256];
        for (int i2 = 0; i2 < (arrstring = d).length; ++i2) {
            Object[] arrobject = new Object[]{Integer.toBinaryString((int)i2)};
            arrstring[i2] = c.a("%8s", arrobject).replace(' ', '0');
        }
        String[] arrstring3 = c;
        arrstring3[0] = "";
        arrstring3[1] = "END_STREAM";
        int[] arrn = new int[]{1};
        arrstring3[8] = "PADDED";
        int n2 = arrn.length;
        for (int i3 = 0; i3 < n2; ++i3) {
            int n3 = arrn[i3];
            String[] arrstring4 = c;
            int n4 = n3 | 8;
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(c[n3]);
            stringBuilder.append("|PADDED");
            arrstring4[n4] = stringBuilder.toString();
        }
        String[] arrstring5 = c;
        arrstring5[4] = "END_HEADERS";
        arrstring5[32] = "PRIORITY";
        arrstring5[36] = "END_HEADERS|PRIORITY";
        int[] arrn2 = new int[]{4, 32, 36};
        int n5 = arrn2.length;
        int n6 = 0;
        do {
            if (n6 >= n5) break;
            int n7 = arrn2[n6];
            for (int n8 : arrn) {
                String[] arrstring6 = c;
                int n9 = n8 | n7;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(c[n8]);
                stringBuilder.append('|');
                stringBuilder.append(c[n7]);
                arrstring6[n9] = stringBuilder.toString();
                String[] arrstring7 = c;
                int n10 = n9 | 8;
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append(c[n8]);
                stringBuilder2.append('|');
                stringBuilder2.append(c[n7]);
                stringBuilder2.append("|PADDED");
                arrstring7[n10] = stringBuilder2.toString();
            }
            ++n6;
        } while (true);
        for (int i4 = 0; i4 < (arrstring2 = c).length; ++i4) {
            if (arrstring2[i4] != null) continue;
            arrstring2[i4] = d[i4];
        }
    }

    private e() {
    }

    static /* varargs */ IllegalArgumentException a(String string2, Object ... arrobject) {
        throw new IllegalArgumentException(c.a(string2, arrobject));
    }

    static String a(byte by, byte by2) {
        if (by2 == 0) {
            return "";
        }
        if (by != 2 && by != 3) {
            if (by != 4 && by != 6) {
                if (by != 7 && by != 8) {
                    String[] arrstring = c;
                    String string2 = by2 < arrstring.length ? arrstring[by2] : d[by2];
                    if (by == 5 && (by2 & 4) != 0) {
                        return string2.replace((CharSequence)"HEADERS", (CharSequence)"PUSH_PROMISE");
                    }
                    if (by == 0 && (by2 & 32) != 0) {
                        return string2.replace((CharSequence)"PRIORITY", (CharSequence)"COMPRESSED");
                    }
                    return string2;
                }
            } else {
                if (by2 == 1) {
                    return "ACK";
                }
                return d[by2];
            }
        }
        return d[by2];
    }

    static String a(boolean bl, int n2, int n3, byte by, byte by2) {
        String string2;
        String[] arrstring = b;
        if (by < arrstring.length) {
            string2 = arrstring[by];
        } else {
            Object[] arrobject = new Object[]{by};
            string2 = c.a("0x%02x", arrobject);
        }
        String string3 = e.a(by, by2);
        Object[] arrobject = new Object[5];
        String string4 = bl ? "<<" : ">>";
        arrobject[0] = string4;
        arrobject[1] = n2;
        arrobject[2] = n3;
        arrobject[3] = string2;
        arrobject[4] = string3;
        return c.a("%s 0x%08x %5d %-13s %s", arrobject);
    }

    static /* varargs */ IOException b(String string2, Object ... arrobject) {
        throw new IOException(c.a(string2, arrobject));
    }
}

