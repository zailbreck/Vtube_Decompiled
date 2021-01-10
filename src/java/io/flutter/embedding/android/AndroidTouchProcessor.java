/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.InputDevice
 *  android.view.InputDevice$MotionRange
 *  android.view.MotionEvent
 *  java.lang.AssertionError
 *  java.lang.Object
 *  java.lang.annotation.Annotation
 *  java.nio.ByteBuffer
 *  java.nio.ByteOrder
 */
package io.flutter.embedding.android;

import android.os.Build;
import android.view.InputDevice;
import android.view.MotionEvent;
import io.flutter.embedding.engine.renderer.FlutterRenderer;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class AndroidTouchProcessor {
    private static final int BYTES_PER_FIELD = 8;
    private static final int POINTER_DATA_FIELD_COUNT = 28;
    private static final int POINTER_DATA_FLAG_BATCHED = 1;
    private static final int _POINTER_BUTTON_PRIMARY = 1;
    private final FlutterRenderer renderer;

    public AndroidTouchProcessor(FlutterRenderer flutterRenderer) {
        this.renderer = flutterRenderer;
    }

    private void addPointerForIndex(MotionEvent motionEvent, int n2, int n3, int n4, ByteBuffer byteBuffer) {
        InputDevice.MotionRange motionRange;
        long l2;
        double d2;
        double d3;
        double d4;
        if (n3 == -1) {
            return;
        }
        int n5 = this.getPointerDeviceTypeForToolType(motionEvent.getToolType(n2));
        int n6 = motionEvent.getActionMasked() == 8 ? 1 : 0;
        byteBuffer.putLong(1000L * motionEvent.getEventTime());
        byteBuffer.putLong((long)n3);
        byteBuffer.putLong((long)n5);
        byteBuffer.putLong((long)n6);
        byteBuffer.putLong((long)motionEvent.getPointerId(n2));
        byteBuffer.putLong(0L);
        byteBuffer.putDouble((double)motionEvent.getX(n2));
        byteBuffer.putDouble((double)motionEvent.getY(n2));
        byteBuffer.putDouble(0.0);
        byteBuffer.putDouble(0.0);
        if (n5 == 1) {
            l2 = 31 & motionEvent.getButtonState();
            if (l2 == 0L && motionEvent.getSource() == 8194 && (n3 == 4 || n3 == 5)) {
                l2 = 1L;
            }
        } else {
            l2 = n5 == 2 ? (long)(15 & motionEvent.getButtonState() >> 4) : 0L;
        }
        byteBuffer.putLong(l2);
        byteBuffer.putLong(0L);
        byteBuffer.putLong(0L);
        byteBuffer.putDouble((double)motionEvent.getPressure(n2));
        double d5 = 1.0;
        if (motionEvent.getDevice() != null && (motionRange = motionEvent.getDevice().getMotionRange(2)) != null) {
            d4 = motionRange.getMin();
            d5 = motionRange.getMax();
        } else {
            d4 = 0.0;
        }
        byteBuffer.putDouble(d4);
        byteBuffer.putDouble(d5);
        if (n5 == 2) {
            byteBuffer.putDouble((double)motionEvent.getAxisValue(24, n2));
            d3 = 0.0;
        } else {
            d3 = 0.0;
            byteBuffer.putDouble(d3);
        }
        byteBuffer.putDouble(d3);
        byteBuffer.putDouble((double)motionEvent.getSize(n2));
        byteBuffer.putDouble((double)motionEvent.getToolMajor(n2));
        byteBuffer.putDouble((double)motionEvent.getToolMinor(n2));
        byteBuffer.putDouble(d3);
        byteBuffer.putDouble(d3);
        byteBuffer.putDouble((double)motionEvent.getAxisValue(8, n2));
        if (n5 == 2) {
            byteBuffer.putDouble((double)motionEvent.getAxisValue(25, n2));
        } else {
            byteBuffer.putDouble(d3);
        }
        byteBuffer.putLong((long)n4);
        if (n6 == 1) {
            byteBuffer.putDouble((double)(-motionEvent.getAxisValue(10)));
            d2 = -motionEvent.getAxisValue(9);
        } else {
            d2 = 0.0;
            byteBuffer.putDouble(d2);
        }
        byteBuffer.putDouble(d2);
    }

    @PointerChange
    private int getPointerChangeForAction(int n2) {
        if (n2 == 0) {
            return 4;
        }
        if (n2 == 1) {
            return 6;
        }
        if (n2 == 5) {
            return 4;
        }
        if (n2 == 6) {
            return 6;
        }
        if (n2 == 2) {
            return 5;
        }
        if (n2 == 7) {
            return 3;
        }
        if (n2 == 3) {
            return 0;
        }
        if (n2 == 8) {
            return 3;
        }
        return -1;
    }

    @PointerDeviceKind
    private int getPointerDeviceTypeForToolType(int n2) {
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    if (n2 != 4) {
                        return 4;
                    }
                    return 3;
                }
                return 1;
            }
            return 2;
        }
        return 0;
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        boolean bl = Build.VERSION.SDK_INT >= 18 && motionEvent.isFromSource(2);
        boolean bl2 = motionEvent.getActionMasked() == 7 || motionEvent.getActionMasked() == 8;
        if (bl) {
            if (!bl2) {
                return false;
            }
            int n2 = AndroidTouchProcessor.super.getPointerChangeForAction(motionEvent.getActionMasked());
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect((int)(8 * (28 * motionEvent.getPointerCount())));
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            AndroidTouchProcessor.super.addPointerForIndex(motionEvent, motionEvent.getActionIndex(), n2, 0, byteBuffer);
            if (byteBuffer.position() % 224 == 0) {
                this.renderer.dispatchPointerDataPacket(byteBuffer, byteBuffer.position());
                return true;
            }
            throw new AssertionError((Object)"Packet position is not on field boundary.");
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ByteBuffer byteBuffer;
        block6 : {
            int n2;
            int n3;
            int n4;
            block5 : {
                block4 : {
                    n4 = motionEvent.getPointerCount();
                    byteBuffer = ByteBuffer.allocateDirect((int)(8 * (n4 * 28)));
                    byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                    int n5 = motionEvent.getActionMasked();
                    n3 = AndroidTouchProcessor.super.getPointerChangeForAction(motionEvent.getActionMasked());
                    boolean bl = n5 == 0 || n5 == 5;
                    boolean bl2 = !bl && (n5 == 1 || n5 == 6);
                    if (bl) break block4;
                    if (bl2) {
                        for (n2 = 0; n2 < n4; ++n2) {
                            if (n2 == motionEvent.getActionIndex() || motionEvent.getToolType(n2) != 1) continue;
                            AndroidTouchProcessor.super.addPointerForIndex(motionEvent, n2, 5, 1, byteBuffer);
                        }
                    }
                    break block5;
                }
                AndroidTouchProcessor.super.addPointerForIndex(motionEvent, motionEvent.getActionIndex(), n3, 0, byteBuffer);
                break block6;
            }
            while (n2 < n4) {
                AndroidTouchProcessor.super.addPointerForIndex(motionEvent, n2, n3, 0, byteBuffer);
                ++n2;
            }
        }
        if (byteBuffer.position() % 224 == 0) {
            this.renderer.dispatchPointerDataPacket(byteBuffer, byteBuffer.position());
            return true;
        }
        AssertionError assertionError = new AssertionError((Object)"Packet position is not on field boundary");
        throw assertionError;
    }

    private static @interface PointerChange {
        public static final int ADD = 1;
        public static final int CANCEL = 0;
        public static final int DOWN = 4;
        public static final int HOVER = 3;
        public static final int MOVE = 5;
        public static final int REMOVE = 2;
        public static final int UP = 6;
    }

    private static @interface PointerDeviceKind {
        public static final int INVERTED_STYLUS = 3;
        public static final int MOUSE = 1;
        public static final int STYLUS = 2;
        public static final int TOUCH = 0;
        public static final int UNKNOWN = 4;
    }

    private static @interface PointerSignalKind {
        public static final int NONE = 0;
        public static final int SCROLL = 1;
        public static final int UNKNOWN = 2;
    }

}

