/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  io.flutter.plugin.common.MessageCodec
 *  io.flutter.plugin.common.StandardMessageCodec$ExposedByteArrayOutputStream
 *  java.io.ByteArrayOutputStream
 *  java.lang.Boolean
 *  java.lang.Byte
 *  java.lang.Class
 *  java.lang.Double
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.Short
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.math.BigInteger
 *  java.nio.Buffer
 *  java.nio.ByteBuffer
 *  java.nio.ByteOrder
 *  java.nio.DoubleBuffer
 *  java.nio.IntBuffer
 *  java.nio.LongBuffer
 *  java.nio.charset.Charset
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package io.flutter.plugin.common;

import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.math.BigInteger;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.DoubleBuffer;
import java.nio.IntBuffer;
import java.nio.LongBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * Exception performing whole class analysis.
 */
public class StandardMessageCodec
implements MessageCodec<Object> {
    private static final byte BIGINT = 5;
    private static final byte BYTE_ARRAY = 8;
    private static final byte DOUBLE = 6;
    private static final byte DOUBLE_ARRAY = 11;
    private static final byte FALSE = 2;
    public static final StandardMessageCodec INSTANCE;
    private static final byte INT = 3;
    private static final byte INT_ARRAY = 9;
    private static final byte LIST = 12;
    private static final boolean LITTLE_ENDIAN = false;
    private static final byte LONG = 4;
    private static final byte LONG_ARRAY = 10;
    private static final byte MAP = 13;
    private static final byte NULL = 0;
    private static final byte STRING = 7;
    private static final String TAG = "StandardMessageCodec#";
    private static final byte TRUE = 1;
    private static final Charset UTF8;

    static {
        INSTANCE = new StandardMessageCodec();
        boolean bl = ByteOrder.nativeOrder() == ByteOrder.LITTLE_ENDIAN;
        LITTLE_ENDIAN = bl;
        UTF8 = Charset.forName((String)"UTF8");
    }

    protected static final void readAlignment(ByteBuffer byteBuffer, int n2) {
        int n3 = byteBuffer.position() % n2;
        if (n3 != 0) {
            byteBuffer.position(n2 + byteBuffer.position() - n3);
        }
    }

    protected static final byte[] readBytes(ByteBuffer byteBuffer) {
        byte[] arrby = new byte[StandardMessageCodec.readSize(byteBuffer)];
        byteBuffer.get(arrby);
        return arrby;
    }

    protected static final int readSize(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            int n2 = 255 & byteBuffer.get();
            if (n2 < 254) {
                return n2;
            }
            if (n2 == 254) {
                return byteBuffer.getChar();
            }
            return byteBuffer.getInt();
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    protected static final void writeAlignment(ByteArrayOutputStream byteArrayOutputStream, int n2) {
        int n3 = byteArrayOutputStream.size() % n2;
        if (n3 != 0) {
            for (int i2 = 0; i2 < n2 - n3; ++i2) {
                byteArrayOutputStream.write(0);
            }
        }
    }

    protected static final void writeBytes(ByteArrayOutputStream byteArrayOutputStream, byte[] arrby) {
        StandardMessageCodec.writeSize(byteArrayOutputStream, arrby.length);
        byteArrayOutputStream.write(arrby, 0, arrby.length);
    }

    protected static final void writeChar(ByteArrayOutputStream byteArrayOutputStream, int n2) {
        if (LITTLE_ENDIAN) {
            byteArrayOutputStream.write(n2);
            n2 >>>= 8;
        } else {
            byteArrayOutputStream.write(n2 >>> 8);
        }
        byteArrayOutputStream.write(n2);
    }

    protected static final void writeDouble(ByteArrayOutputStream byteArrayOutputStream, double d2) {
        StandardMessageCodec.writeLong(byteArrayOutputStream, Double.doubleToLongBits((double)d2));
    }

    protected static final void writeInt(ByteArrayOutputStream byteArrayOutputStream, int n2) {
        if (LITTLE_ENDIAN) {
            byteArrayOutputStream.write(n2);
            byteArrayOutputStream.write(n2 >>> 8);
            byteArrayOutputStream.write(n2 >>> 16);
            n2 >>>= 24;
        } else {
            byteArrayOutputStream.write(n2 >>> 24);
            byteArrayOutputStream.write(n2 >>> 16);
            byteArrayOutputStream.write(n2 >>> 8);
        }
        byteArrayOutputStream.write(n2);
    }

    protected static final void writeLong(ByteArrayOutputStream byteArrayOutputStream, long l2) {
        if (LITTLE_ENDIAN) {
            byteArrayOutputStream.write((int)((byte)l2));
            byteArrayOutputStream.write((int)((byte)(l2 >>> 8)));
            byteArrayOutputStream.write((int)((byte)(l2 >>> 16)));
            byteArrayOutputStream.write((int)((byte)(l2 >>> 24)));
            byteArrayOutputStream.write((int)((byte)(l2 >>> 32)));
            byteArrayOutputStream.write((int)((byte)(l2 >>> 40)));
            byteArrayOutputStream.write((int)((byte)(l2 >>> 48)));
            l2 >>>= 56;
        } else {
            byteArrayOutputStream.write((int)((byte)(l2 >>> 56)));
            byteArrayOutputStream.write((int)((byte)(l2 >>> 48)));
            byteArrayOutputStream.write((int)((byte)(l2 >>> 40)));
            byteArrayOutputStream.write((int)((byte)(l2 >>> 32)));
            byteArrayOutputStream.write((int)((byte)(l2 >>> 24)));
            byteArrayOutputStream.write((int)((byte)(l2 >>> 16)));
            byteArrayOutputStream.write((int)((byte)(l2 >>> 8)));
        }
        byteArrayOutputStream.write((int)((byte)l2));
    }

    protected static final void writeSize(ByteArrayOutputStream byteArrayOutputStream, int n2) {
        if (n2 < 254) {
            byteArrayOutputStream.write(n2);
            return;
        }
        if (n2 <= 65535) {
            byteArrayOutputStream.write(254);
            StandardMessageCodec.writeChar(byteArrayOutputStream, n2);
            return;
        }
        byteArrayOutputStream.write(255);
        StandardMessageCodec.writeInt(byteArrayOutputStream, n2);
    }

    public Object decodeMessage(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return null;
        }
        byteBuffer.order(ByteOrder.nativeOrder());
        Object object = this.readValue(byteBuffer);
        if (!byteBuffer.hasRemaining()) {
            return object;
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    public ByteBuffer encodeMessage(Object object) {
        if (object == null) {
            return null;
        }
        ExposedByteArrayOutputStream exposedByteArrayOutputStream = new /* Unavailable Anonymous Inner Class!! */;
        this.writeValue((ByteArrayOutputStream)exposedByteArrayOutputStream, object);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect((int)exposedByteArrayOutputStream.size());
        byteBuffer.put(exposedByteArrayOutputStream.buffer(), 0, exposedByteArrayOutputStream.size());
        return byteBuffer;
    }

    protected final Object readValue(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            return this.readValueOfType(byteBuffer.get(), byteBuffer);
        }
        throw new IllegalArgumentException("Message corrupted");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    protected Object readValueOfType(byte var1, ByteBuffer var2_2) {
        var3_3 = 0;
        switch (var1) {
            default: {
                throw new IllegalArgumentException("Message corrupted");
            }
            case 13: {
                var16_4 = StandardMessageCodec.readSize(var2_2);
                var4_5 = new HashMap();
                while (var3_3 < var16_4) {
                    var4_5.put(this.readValue(var2_2), this.readValue(var2_2));
                    ++var3_3;
                }
                return var4_5;
            }
            case 12: {
                var14_6 = StandardMessageCodec.readSize(var2_2);
                var4_5 = new ArrayList(var14_6);
                while (var3_3 < var14_6) {
                    var4_5.add(this.readValue(var2_2));
                    ++var3_3;
                }
                return var4_5;
            }
            case 11: {
                var9_7 = StandardMessageCodec.readSize(var2_2);
                var10_8 = new double[var9_7];
                StandardMessageCodec.readAlignment(var2_2, 8);
                var2_2.asDoubleBuffer().get(var10_8);
                ** GOTO lbl32
            }
            case 10: {
                var9_7 = StandardMessageCodec.readSize(var2_2);
                var10_8 = new long[var9_7];
                StandardMessageCodec.readAlignment(var2_2, 8);
                var2_2.asLongBuffer().get((long[])var10_8);
lbl32: // 2 sources:
                var2_2.position(var2_2.position() + var9_7 * 8);
                return var10_8;
            }
            case 9: {
                var5_9 = StandardMessageCodec.readSize(var2_2);
                var6_10 = new int[var5_9];
                StandardMessageCodec.readAlignment(var2_2, 4);
                var2_2.asIntBuffer().get(var6_10);
                var2_2.position(var2_2.position() + var5_9 * 4);
                return var6_10;
            }
            case 8: {
                return StandardMessageCodec.readBytes(var2_2);
            }
            case 7: {
                return new String(StandardMessageCodec.readBytes(var2_2), StandardMessageCodec.UTF8);
            }
            case 6: {
                StandardMessageCodec.readAlignment(var2_2, 8);
                return var2_2.getDouble();
            }
            case 5: {
                return new BigInteger(new String(StandardMessageCodec.readBytes(var2_2), StandardMessageCodec.UTF8), 16);
            }
            case 4: {
                return var2_2.getLong();
            }
            case 3: {
                return var2_2.getInt();
            }
            case 2: {
                return false;
            }
            case 1: {
                return true;
            }
            case 0: 
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     */
    protected void writeValue(ByteArrayOutputStream byteArrayOutputStream, Object object) {
        block24 : {
            int n2;
            block27 : {
                int n3;
                block26 : {
                    block25 : {
                        if (object == null || object.equals(null)) break block24;
                        if (object != Boolean.TRUE) break block25;
                        n3 = 1;
                        break block26;
                    }
                    if (object != Boolean.FALSE) break block27;
                    n3 = 2;
                }
                byteArrayOutputStream.write(n3);
                return;
            }
            if (object instanceof Number) {
                if (!(object instanceof Integer || object instanceof Short || object instanceof Byte)) {
                    if (object instanceof Long) {
                        byteArrayOutputStream.write(4);
                        StandardMessageCodec.writeLong(byteArrayOutputStream, (Long)object);
                        return;
                    }
                    if (!(object instanceof Float) && !(object instanceof Double)) {
                        if (object instanceof BigInteger) {
                            byteArrayOutputStream.write(5);
                            StandardMessageCodec.writeBytes(byteArrayOutputStream, ((BigInteger)object).toString(16).getBytes(UTF8));
                            return;
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Unsupported Number type: ");
                        stringBuilder.append((Object)object.getClass());
                        throw new IllegalArgumentException(stringBuilder.toString());
                    }
                    byteArrayOutputStream.write(6);
                    StandardMessageCodec.writeAlignment(byteArrayOutputStream, 8);
                    StandardMessageCodec.writeDouble(byteArrayOutputStream, ((Number)object).doubleValue());
                    return;
                }
                byteArrayOutputStream.write(3);
                StandardMessageCodec.writeInt(byteArrayOutputStream, ((Number)object).intValue());
                return;
            }
            if (object instanceof String) {
                byteArrayOutputStream.write(7);
                StandardMessageCodec.writeBytes(byteArrayOutputStream, ((String)object).getBytes(UTF8));
                return;
            }
            if (object instanceof byte[]) {
                byteArrayOutputStream.write(8);
                StandardMessageCodec.writeBytes(byteArrayOutputStream, (byte[])object);
                return;
            }
            if (object instanceof int[]) {
                byteArrayOutputStream.write(9);
                int[] arrn = (int[])object;
                StandardMessageCodec.writeSize(byteArrayOutputStream, arrn.length);
                StandardMessageCodec.writeAlignment(byteArrayOutputStream, 4);
                int n4 = arrn.length;
                for (n2 = 0; n2 < n4; ++n2) {
                    StandardMessageCodec.writeInt(byteArrayOutputStream, arrn[n2]);
                }
                return;
            } else if (object instanceof long[]) {
                byteArrayOutputStream.write(10);
                long[] arrl = (long[])object;
                StandardMessageCodec.writeSize(byteArrayOutputStream, arrl.length);
                StandardMessageCodec.writeAlignment(byteArrayOutputStream, 8);
                int n5 = arrl.length;
                while (n2 < n5) {
                    StandardMessageCodec.writeLong(byteArrayOutputStream, arrl[n2]);
                    ++n2;
                }
                return;
            } else if (object instanceof double[]) {
                byteArrayOutputStream.write(11);
                double[] arrd = (double[])object;
                StandardMessageCodec.writeSize(byteArrayOutputStream, arrd.length);
                StandardMessageCodec.writeAlignment(byteArrayOutputStream, 8);
                int n6 = arrd.length;
                while (n2 < n6) {
                    StandardMessageCodec.writeDouble(byteArrayOutputStream, arrd[n2]);
                    ++n2;
                }
                return;
            } else if (object instanceof List) {
                byteArrayOutputStream.write(12);
                List list = (List)object;
                StandardMessageCodec.writeSize(byteArrayOutputStream, list.size());
                Iterator iterator = list.iterator();
                while (iterator.hasNext()) {
                    this.writeValue(byteArrayOutputStream, iterator.next());
                }
                return;
            } else {
                if (!(object instanceof Map)) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unsupported value: ");
                    stringBuilder.append(object);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                byteArrayOutputStream.write(13);
                Map map = (Map)object;
                StandardMessageCodec.writeSize(byteArrayOutputStream, map.size());
                for (Map.Entry entry : map.entrySet()) {
                    this.writeValue(byteArrayOutputStream, entry.getKey());
                    this.writeValue(byteArrayOutputStream, entry.getValue());
                }
            }
            return;
        }
        byteArrayOutputStream.write(0);
    }
}

