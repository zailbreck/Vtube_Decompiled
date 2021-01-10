/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  io.flutter.plugin.common.FlutterException
 *  io.flutter.plugin.common.MethodCall
 *  io.flutter.plugin.common.MethodCodec
 *  io.flutter.plugin.common.StandardMessageCodec$ExposedByteArrayOutputStream
 *  java.io.ByteArrayOutputStream
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.nio.ByteBuffer
 *  java.nio.ByteOrder
 */
package io.flutter.plugin.common;

import io.flutter.plugin.common.FlutterException;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodCodec;
import io.flutter.plugin.common.StandardMessageCodec;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/*
 * Exception performing whole class analysis.
 */
public final class StandardMethodCodec
implements MethodCodec {
    public static final StandardMethodCodec INSTANCE;
    private final StandardMessageCodec messageCodec;

    static {
        INSTANCE = new StandardMethodCodec(StandardMessageCodec.INSTANCE);
    }

    public StandardMethodCodec(StandardMessageCodec standardMessageCodec) {
        this.messageCodec = standardMessageCodec;
    }

    public Object decodeEnvelope(ByteBuffer byteBuffer) {
        block3 : {
            block4 : {
                block2 : {
                    byteBuffer.order(ByteOrder.nativeOrder());
                    byte by = byteBuffer.get();
                    if (by == 0) break block2;
                    if (by != 1) break block3;
                    break block4;
                }
                Object object = this.messageCodec.readValue(byteBuffer);
                if (!byteBuffer.hasRemaining()) {
                    return object;
                }
            }
            Object object = this.messageCodec.readValue(byteBuffer);
            Object object2 = this.messageCodec.readValue(byteBuffer);
            Object object3 = this.messageCodec.readValue(byteBuffer);
            if (object instanceof String && (object2 == null || object2 instanceof String) && !byteBuffer.hasRemaining()) {
                throw new FlutterException((String)object, (String)object2, object3);
            }
        }
        throw new IllegalArgumentException("Envelope corrupted");
    }

    public MethodCall decodeMethodCall(ByteBuffer byteBuffer) {
        byteBuffer.order(ByteOrder.nativeOrder());
        Object object = this.messageCodec.readValue(byteBuffer);
        Object object2 = this.messageCodec.readValue(byteBuffer);
        if (object instanceof String && !byteBuffer.hasRemaining()) {
            return new MethodCall((String)object, object2);
        }
        throw new IllegalArgumentException("Method call corrupted");
    }

    public ByteBuffer encodeErrorEnvelope(String string, String string2, Object object) {
        StandardMessageCodec.ExposedByteArrayOutputStream exposedByteArrayOutputStream = new /* Unavailable Anonymous Inner Class!! */;
        exposedByteArrayOutputStream.write(1);
        this.messageCodec.writeValue((ByteArrayOutputStream)exposedByteArrayOutputStream, string);
        this.messageCodec.writeValue((ByteArrayOutputStream)exposedByteArrayOutputStream, string2);
        this.messageCodec.writeValue((ByteArrayOutputStream)exposedByteArrayOutputStream, object);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect((int)exposedByteArrayOutputStream.size());
        byteBuffer.put(exposedByteArrayOutputStream.buffer(), 0, exposedByteArrayOutputStream.size());
        return byteBuffer;
    }

    public ByteBuffer encodeMethodCall(MethodCall methodCall) {
        StandardMessageCodec.ExposedByteArrayOutputStream exposedByteArrayOutputStream = new /* Unavailable Anonymous Inner Class!! */;
        this.messageCodec.writeValue((ByteArrayOutputStream)exposedByteArrayOutputStream, methodCall.method);
        this.messageCodec.writeValue((ByteArrayOutputStream)exposedByteArrayOutputStream, methodCall.arguments);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect((int)exposedByteArrayOutputStream.size());
        byteBuffer.put(exposedByteArrayOutputStream.buffer(), 0, exposedByteArrayOutputStream.size());
        return byteBuffer;
    }

    public ByteBuffer encodeSuccessEnvelope(Object object) {
        StandardMessageCodec.ExposedByteArrayOutputStream exposedByteArrayOutputStream = new /* Unavailable Anonymous Inner Class!! */;
        exposedByteArrayOutputStream.write(0);
        this.messageCodec.writeValue((ByteArrayOutputStream)exposedByteArrayOutputStream, object);
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect((int)exposedByteArrayOutputStream.size());
        byteBuffer.put(exposedByteArrayOutputStream.buffer(), 0, exposedByteArrayOutputStream.size());
        return byteBuffer;
    }
}

