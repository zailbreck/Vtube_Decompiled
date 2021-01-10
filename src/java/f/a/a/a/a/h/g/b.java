/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  J
 *  java.lang.Object
 *  java.lang.reflect.Array
 *  java.util.zip.Checksum
 */
package f.a.a.a.a.h.g;

import java.lang.reflect.Array;
import java.util.zip.Checksum;

public class b
implements Checksum {
    private static final long[][] b = (long[][])Array.newInstance(J.class, (int[])new int[]{8, 256});
    private long a = 0L;

    static {
        for (int i2 = 0; i2 < 256; ++i2) {
            long l2 = i2;
            for (int i3 = 0; i3 < 8; ++i3) {
                long l3 = l2 & 1L LCMP 1L;
                l2 >>>= 1;
                if (l3 != false) continue;
                l2 ^= -3932672073523589310L;
            }
            b.b[0][i2] = l2;
        }
        for (int i4 = 0; i4 < 256; ++i4) {
            long l4 = b[0][i4];
            for (int i5 = 1; i5 < 8; ++i5) {
                long[][] arrl = b;
                arrl[i5][i4] = l4 = arrl[0][(int)(255L & l4)] ^ l4 >>> 8;
            }
        }
    }

    public void a(byte[] arrby, int n2) {
        this.update(arrby, 0, n2);
    }

    public long getValue() {
        return this.a;
    }

    public void reset() {
        this.a = 0L;
    }

    public void update(int n2) {
        byte[] arrby = new byte[]{(byte)(n2 & 255)};
        this.a(arrby, arrby.length);
    }

    public void update(byte[] arrby, int n2, int n3) {
        int n4;
        this.a = -1L ^ this.a;
        int n5 = n2;
        for (n4 = n3; n4 >= 8; n4 -= 8) {
            long[][] arrl = b;
            long[] arrl2 = arrl[7];
            long l2 = this.a;
            this.a = arrl2[(int)(l2 & 255L ^ (long)(255 & arrby[n5]))] ^ arrl[6][(int)(255L & l2 >>> 8 ^ (long)(255 & arrby[n5 + 1]))] ^ arrl[5][(int)(255L & l2 >>> 16 ^ (long)(255 & arrby[n5 + 2]))] ^ arrl[4][(int)(255L & l2 >>> 24 ^ (long)(255 & arrby[n5 + 3]))] ^ arrl[3][(int)(255L & l2 >>> 32 ^ (long)(255 & arrby[n5 + 4]))] ^ arrl[2][(int)(255L & l2 >>> 40 ^ (long)(255 & arrby[n5 + 5]))] ^ arrl[1][(int)(255L & l2 >>> 48 ^ (long)(255 & arrby[n5 + 6]))] ^ arrl[0][(int)(l2 >>> 56 ^ (long)(255 & arrby[n5 + 7]))];
            n5 += 8;
        }
        while (n4 > 0) {
            long[] arrl = b[0];
            long l3 = this.a;
            this.a = arrl[(int)(255L & (l3 ^ (long)arrby[n5]))] ^ l3 >>> 8;
            ++n5;
            --n4;
        }
        this.a = -1L ^ this.a;
    }
}

