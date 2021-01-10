/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.content.Context
 *  android.graphics.Rect
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.util.Log
 *  android.util.SparseArray
 *  android.view.MotionEvent
 *  android.view.MotionEvent$PointerCoords
 *  android.view.MotionEvent$PointerProperties
 *  android.view.View
 *  android.view.ViewParent
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityNodeInfo$CollectionInfo
 *  android.view.accessibility.AccessibilityNodeInfo$CollectionItemInfo
 *  android.view.accessibility.AccessibilityNodeInfo$RangeInfo
 *  android.view.accessibility.AccessibilityNodeProvider
 *  android.view.accessibility.AccessibilityRecord
 *  androidx.annotation.Keep
 *  java.lang.ArrayIndexOutOfBoundsException
 *  java.lang.CharSequence
 *  java.lang.IllegalAccessException
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.lang.reflect.Field
 *  java.lang.reflect.InvocationTargetException
 *  java.lang.reflect.Method
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 */
package io.flutter.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityRecord;
import androidx.annotation.Keep;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Keep
final class AccessibilityViewEmbedder {
    private static final String TAG = "AccessibilityBridge";
    private final Map<View, Rect> embeddedViewToDisplayBounds;
    private final SparseArray<ViewAndId> flutterIdToOrigin = new SparseArray();
    private int nextFlutterId;
    private final Map<ViewAndId, Integer> originToFlutterId;
    private final ReflectionAccessors reflectionAccessors = new ReflectionAccessors(null);
    private final View rootAccessibilityView;

    AccessibilityViewEmbedder(View view, int n2) {
        this.rootAccessibilityView = view;
        this.nextFlutterId = n2;
        this.originToFlutterId = new HashMap();
        this.embeddedViewToDisplayBounds = new HashMap();
    }

    private void addChildrenToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        for (int i2 = 0; i2 < accessibilityNodeInfo.getChildCount(); ++i2) {
            int n2;
            Long l2 = this.reflectionAccessors.getChildId(accessibilityNodeInfo, i2);
            if (l2 == null) continue;
            int n3 = ReflectionAccessors.getVirtualNodeId(l2);
            ViewAndId viewAndId = new ViewAndId(view, n3, null);
            if (this.originToFlutterId.containsKey((Object)viewAndId)) {
                n2 = (Integer)this.originToFlutterId.get((Object)viewAndId);
            } else {
                int n4 = this.nextFlutterId;
                this.nextFlutterId = n4 + 1;
                AccessibilityViewEmbedder.super.cacheVirtualIdMappings(view, n3, n4);
                n2 = n4;
            }
            accessibilityNodeInfo2.addChild(this.rootAccessibilityView, n2);
        }
    }

    private void cacheVirtualIdMappings(View view, int n2, int n3) {
        ViewAndId viewAndId = new ViewAndId(view, n2, null);
        this.originToFlutterId.put((Object)viewAndId, (Object)n3);
        this.flutterIdToOrigin.put(n3, (Object)viewAndId);
    }

    private AccessibilityNodeInfo convertToFlutterNode(AccessibilityNodeInfo accessibilityNodeInfo, int n2, View view) {
        AccessibilityNodeInfo accessibilityNodeInfo2 = AccessibilityNodeInfo.obtain((View)this.rootAccessibilityView, (int)n2);
        accessibilityNodeInfo2.setPackageName((CharSequence)this.rootAccessibilityView.getContext().getPackageName());
        accessibilityNodeInfo2.setSource(this.rootAccessibilityView, n2);
        accessibilityNodeInfo2.setClassName(accessibilityNodeInfo.getClassName());
        Rect rect = (Rect)this.embeddedViewToDisplayBounds.get((Object)view);
        AccessibilityViewEmbedder.super.copyAccessibilityFields(accessibilityNodeInfo, accessibilityNodeInfo2);
        AccessibilityViewEmbedder.super.setFlutterNodesTranslateBounds(accessibilityNodeInfo, rect, accessibilityNodeInfo2);
        AccessibilityViewEmbedder.super.addChildrenToFlutterNode(accessibilityNodeInfo, view, accessibilityNodeInfo2);
        AccessibilityViewEmbedder.super.setFlutterNodeParent(accessibilityNodeInfo, view, accessibilityNodeInfo2);
        return accessibilityNodeInfo2;
    }

    private void copyAccessibilityFields(AccessibilityNodeInfo accessibilityNodeInfo, AccessibilityNodeInfo accessibilityNodeInfo2) {
        accessibilityNodeInfo2.setAccessibilityFocused(accessibilityNodeInfo.isAccessibilityFocused());
        accessibilityNodeInfo2.setCheckable(accessibilityNodeInfo.isCheckable());
        accessibilityNodeInfo2.setChecked(accessibilityNodeInfo.isChecked());
        accessibilityNodeInfo2.setContentDescription(accessibilityNodeInfo.getContentDescription());
        accessibilityNodeInfo2.setEnabled(accessibilityNodeInfo.isEnabled());
        accessibilityNodeInfo2.setClickable(accessibilityNodeInfo.isClickable());
        accessibilityNodeInfo2.setFocusable(accessibilityNodeInfo.isFocusable());
        accessibilityNodeInfo2.setFocused(accessibilityNodeInfo.isFocused());
        accessibilityNodeInfo2.setLongClickable(accessibilityNodeInfo.isLongClickable());
        accessibilityNodeInfo2.setMovementGranularities(accessibilityNodeInfo.getMovementGranularities());
        accessibilityNodeInfo2.setPassword(accessibilityNodeInfo.isPassword());
        accessibilityNodeInfo2.setScrollable(accessibilityNodeInfo.isScrollable());
        accessibilityNodeInfo2.setSelected(accessibilityNodeInfo.isSelected());
        accessibilityNodeInfo2.setText(accessibilityNodeInfo.getText());
        accessibilityNodeInfo2.setVisibleToUser(accessibilityNodeInfo.isVisibleToUser());
        if (Build.VERSION.SDK_INT >= 18) {
            accessibilityNodeInfo2.setEditable(accessibilityNodeInfo.isEditable());
        }
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityNodeInfo2.setCanOpenPopup(accessibilityNodeInfo.canOpenPopup());
            accessibilityNodeInfo2.setCollectionInfo(accessibilityNodeInfo.getCollectionInfo());
            accessibilityNodeInfo2.setCollectionItemInfo(accessibilityNodeInfo.getCollectionItemInfo());
            accessibilityNodeInfo2.setContentInvalid(accessibilityNodeInfo.isContentInvalid());
            accessibilityNodeInfo2.setDismissable(accessibilityNodeInfo.isDismissable());
            accessibilityNodeInfo2.setInputType(accessibilityNodeInfo.getInputType());
            accessibilityNodeInfo2.setLiveRegion(accessibilityNodeInfo.getLiveRegion());
            accessibilityNodeInfo2.setMultiLine(accessibilityNodeInfo.isMultiLine());
            accessibilityNodeInfo2.setRangeInfo(accessibilityNodeInfo.getRangeInfo());
        }
        if (Build.VERSION.SDK_INT >= 21) {
            accessibilityNodeInfo2.setError(accessibilityNodeInfo.getError());
            accessibilityNodeInfo2.setMaxTextLength(accessibilityNodeInfo.getMaxTextLength());
        }
        if (Build.VERSION.SDK_INT >= 23) {
            accessibilityNodeInfo2.setContextClickable(accessibilityNodeInfo.isContextClickable());
        }
        if (Build.VERSION.SDK_INT >= 24) {
            accessibilityNodeInfo2.setDrawingOrder(accessibilityNodeInfo.getDrawingOrder());
            accessibilityNodeInfo2.setImportantForAccessibility(accessibilityNodeInfo.isImportantForAccessibility());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            accessibilityNodeInfo2.setAvailableExtraData(accessibilityNodeInfo.getAvailableExtraData());
            accessibilityNodeInfo2.setHintText(accessibilityNodeInfo.getHintText());
            accessibilityNodeInfo2.setShowingHintText(accessibilityNodeInfo.isShowingHintText());
        }
    }

    private void setFlutterNodeParent(AccessibilityNodeInfo accessibilityNodeInfo, View view, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Long l2 = this.reflectionAccessors.getParentNodeId(accessibilityNodeInfo);
        if (l2 == null) {
            return;
        }
        int n2 = ReflectionAccessors.getVirtualNodeId(l2);
        Integer n3 = (Integer)this.originToFlutterId.get((Object)new ViewAndId(view, n2, null));
        if (n3 != null) {
            accessibilityNodeInfo2.setParent(this.rootAccessibilityView, n3.intValue());
        }
    }

    private void setFlutterNodesTranslateBounds(AccessibilityNodeInfo accessibilityNodeInfo, Rect rect, AccessibilityNodeInfo accessibilityNodeInfo2) {
        Rect rect2 = new Rect();
        accessibilityNodeInfo.getBoundsInParent(rect2);
        accessibilityNodeInfo2.setBoundsInParent(rect2);
        Rect rect3 = new Rect();
        accessibilityNodeInfo.getBoundsInScreen(rect3);
        rect3.offset(rect.left, rect.top);
        accessibilityNodeInfo2.setBoundsInScreen(rect3);
    }

    public AccessibilityNodeInfo createAccessibilityNodeInfo(int n2) {
        ViewAndId viewAndId = (ViewAndId)this.flutterIdToOrigin.get(n2);
        if (viewAndId == null) {
            return null;
        }
        if (!this.embeddedViewToDisplayBounds.containsKey((Object)viewAndId.view)) {
            return null;
        }
        if (viewAndId.view.getAccessibilityNodeProvider() == null) {
            return null;
        }
        AccessibilityNodeInfo accessibilityNodeInfo = viewAndId.view.getAccessibilityNodeProvider().createAccessibilityNodeInfo(viewAndId.id);
        if (accessibilityNodeInfo == null) {
            return null;
        }
        return AccessibilityViewEmbedder.super.convertToFlutterNode(accessibilityNodeInfo, n2, viewAndId.view);
    }

    public Integer getRecordFlutterId(View view, AccessibilityRecord accessibilityRecord) {
        Long l2 = this.reflectionAccessors.getRecordSourceNodeId(accessibilityRecord);
        if (l2 == null) {
            return null;
        }
        int n2 = ReflectionAccessors.getVirtualNodeId(l2);
        return (Integer)this.originToFlutterId.get((Object)new ViewAndId(view, n2, null));
    }

    public AccessibilityNodeInfo getRootNode(View view, int n2, Rect rect) {
        AccessibilityNodeInfo accessibilityNodeInfo = view.createAccessibilityNodeInfo();
        Long l2 = this.reflectionAccessors.getSourceNodeId(accessibilityNodeInfo);
        if (l2 == null) {
            return null;
        }
        this.embeddedViewToDisplayBounds.put((Object)view, (Object)rect);
        AccessibilityViewEmbedder.super.cacheVirtualIdMappings(view, ReflectionAccessors.getVirtualNodeId(l2), n2);
        return AccessibilityViewEmbedder.super.convertToFlutterNode(accessibilityNodeInfo, n2, view);
    }

    public boolean onAccessibilityHoverEvent(int n2, MotionEvent motionEvent) {
        ViewAndId viewAndId = (ViewAndId)this.flutterIdToOrigin.get(n2);
        if (viewAndId == null) {
            return false;
        }
        Rect rect = (Rect)this.embeddedViewToDisplayBounds.get((Object)viewAndId.view);
        int n3 = motionEvent.getPointerCount();
        MotionEvent.PointerProperties[] arrpointerProperties = new MotionEvent.PointerProperties[n3];
        MotionEvent.PointerCoords[] arrpointerCoords = new MotionEvent.PointerCoords[n3];
        for (int i2 = 0; i2 < motionEvent.getPointerCount(); ++i2) {
            arrpointerProperties[i2] = new MotionEvent.PointerProperties();
            motionEvent.getPointerProperties(i2, arrpointerProperties[i2]);
            MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
            motionEvent.getPointerCoords(i2, pointerCoords);
            arrpointerCoords[i2] = new MotionEvent.PointerCoords(pointerCoords);
            MotionEvent.PointerCoords pointerCoords2 = arrpointerCoords[i2];
            pointerCoords2.x -= (float)rect.left;
            MotionEvent.PointerCoords pointerCoords3 = arrpointerCoords[i2];
            pointerCoords3.y -= (float)rect.top;
        }
        MotionEvent motionEvent2 = MotionEvent.obtain((long)motionEvent.getDownTime(), (long)motionEvent.getEventTime(), (int)motionEvent.getAction(), (int)motionEvent.getPointerCount(), (MotionEvent.PointerProperties[])arrpointerProperties, (MotionEvent.PointerCoords[])arrpointerCoords, (int)motionEvent.getMetaState(), (int)motionEvent.getButtonState(), (float)motionEvent.getXPrecision(), (float)motionEvent.getYPrecision(), (int)motionEvent.getDeviceId(), (int)motionEvent.getEdgeFlags(), (int)motionEvent.getSource(), (int)motionEvent.getFlags());
        return viewAndId.view.dispatchGenericMotionEvent(motionEvent2);
    }

    public boolean performAction(int n2, int n3, Bundle bundle) {
        ViewAndId viewAndId = (ViewAndId)this.flutterIdToOrigin.get(n2);
        if (viewAndId == null) {
            return false;
        }
        AccessibilityNodeProvider accessibilityNodeProvider = viewAndId.view.getAccessibilityNodeProvider();
        if (accessibilityNodeProvider == null) {
            return false;
        }
        return accessibilityNodeProvider.performAction(viewAndId.id, n3, bundle);
    }

    public boolean requestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
        AccessibilityEvent accessibilityEvent2 = AccessibilityEvent.obtain((AccessibilityEvent)accessibilityEvent);
        Long l2 = this.reflectionAccessors.getRecordSourceNodeId((AccessibilityRecord)accessibilityEvent);
        if (l2 == null) {
            return false;
        }
        int n2 = ReflectionAccessors.getVirtualNodeId(l2);
        Integer n3 = (Integer)this.originToFlutterId.get((Object)new ViewAndId(view, n2, null));
        if (n3 == null) {
            int n4 = this.nextFlutterId;
            this.nextFlutterId = n4 + 1;
            n3 = n4;
            AccessibilityViewEmbedder.super.cacheVirtualIdMappings(view, n2, n3);
        }
        accessibilityEvent2.setSource(this.rootAccessibilityView, n3.intValue());
        accessibilityEvent2.setClassName(accessibilityEvent.getClassName());
        accessibilityEvent2.setPackageName(accessibilityEvent.getPackageName());
        for (int i2 = 0; i2 < accessibilityEvent2.getRecordCount(); ++i2) {
            AccessibilityRecord accessibilityRecord = accessibilityEvent2.getRecord(i2);
            Long l3 = this.reflectionAccessors.getRecordSourceNodeId(accessibilityRecord);
            if (l3 == null) {
                return false;
            }
            ViewAndId viewAndId = new ViewAndId(view, ReflectionAccessors.getVirtualNodeId(l3), null);
            if (!this.originToFlutterId.containsKey((Object)viewAndId)) {
                return false;
            }
            int n5 = (Integer)this.originToFlutterId.get((Object)viewAndId);
            accessibilityRecord.setSource(this.rootAccessibilityView, n5);
        }
        return this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(view2, accessibilityEvent2);
    }

    private static class ReflectionAccessors {
        private final Field childNodeIdsField;
        private final Method getChildId;
        private final Method getParentNodeId;
        private final Method getRecordSourceNodeId;
        private final Method getSourceNodeId;
        private final Method longArrayGetIndex;

        /*
         * Exception decompiling
         */
        @SuppressLint(value={"PrivateApi"})
        private ReflectionAccessors() {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl70 : ALOAD : trying to set 1 previously set to 0
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
            // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
            // org.benf.cfr.reader.entities.g.p(Method.java:396)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
            // org.benf.cfr.reader.entities.d.c(ClassFile.java:773)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:870)
            // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
            // org.benf.cfr.reader.b.a(Driver.java:128)
            // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
            // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
            // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
            // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
            // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
            // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1133)
            // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:607)
            // java.lang.Thread.run(Thread.java:761)
            throw new IllegalStateException("Decompilation failed");
        }

        /* synthetic */ ReflectionAccessors(1 var1) {
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        private Long getChildId(AccessibilityNodeInfo var1, int var2_2) {
            block9 : {
                if (this.getChildId == null) {
                    if (this.childNodeIdsField == null) return null;
                    if (this.longArrayGetIndex == null) {
                        return null;
                    }
                }
                if ((var3_3 = this.getChildId) != null) {
                    try {
                        var10_4 = new Object[]{var2_2};
                        return (Long)var3_3.invoke((Object)var1, var10_4);
                    }
                    catch (InvocationTargetException var4_6) {
                        ** GOTO lbl20
                    }
                } else {
                    try {
                        var6_10 = this.longArrayGetIndex;
                        var7_11 = this.childNodeIdsField.get((Object)var1);
                        var8_12 = new Object[]{var2_2};
                        return (long)((Long)var6_10.invoke(var7_11, var8_12));
                    }
                    catch (ArrayIndexOutOfBoundsException var4_7) {}
                }
                break block9;
                catch (IllegalAccessException var4_8) {
                    // empty catch block
                }
            }
            Log.w((String)"AccessibilityBridge", (Throwable)var4_9);
            return null;
        }

        private Long getParentNodeId(AccessibilityNodeInfo accessibilityNodeInfo) {
            Method method = this.getParentNodeId;
            if (method != null) {
                void var3_6;
                try {
                    Long l2 = (long)((Long)method.invoke((Object)accessibilityNodeInfo, new Object[0]));
                    return l2;
                }
                catch (InvocationTargetException invocationTargetException) {
                }
                catch (IllegalAccessException illegalAccessException) {
                    // empty catch block
                }
                Log.w((String)AccessibilityViewEmbedder.TAG, (Throwable)var3_6);
            }
            return ReflectionAccessors.yoinkParentIdFromParcel(accessibilityNodeInfo);
        }

        private Long getRecordSourceNodeId(AccessibilityRecord accessibilityRecord) {
            void var3_6;
            Method method = this.getRecordSourceNodeId;
            if (method == null) {
                return null;
            }
            try {
                Long l2 = (Long)method.invoke((Object)accessibilityRecord, new Object[0]);
                return l2;
            }
            catch (InvocationTargetException invocationTargetException) {
            }
            catch (IllegalAccessException illegalAccessException) {
                // empty catch block
            }
            Log.w((String)AccessibilityViewEmbedder.TAG, (Throwable)var3_6);
            return null;
        }

        private Long getSourceNodeId(AccessibilityNodeInfo accessibilityNodeInfo) {
            void var3_6;
            Method method = this.getSourceNodeId;
            if (method == null) {
                return null;
            }
            try {
                Long l2 = (Long)method.invoke((Object)accessibilityNodeInfo, new Object[0]);
                return l2;
            }
            catch (InvocationTargetException invocationTargetException) {
            }
            catch (IllegalAccessException illegalAccessException) {
                // empty catch block
            }
            Log.w((String)AccessibilityViewEmbedder.TAG, (Throwable)var3_6);
            return null;
        }

        private static int getVirtualNodeId(long l2) {
            return (int)(l2 >> 32);
        }

        private static boolean isBitSet(long l2, int n2) {
            return (l2 & 1L << n2) != 0L;
        }

        private static Long yoinkParentIdFromParcel(AccessibilityNodeInfo accessibilityNodeInfo) {
            if (Build.VERSION.SDK_INT < 26) {
                Log.w((String)AccessibilityViewEmbedder.TAG, (String)"Unexpected Android version. Unable to find the parent ID.");
                return null;
            }
            AccessibilityNodeInfo accessibilityNodeInfo2 = AccessibilityNodeInfo.obtain((AccessibilityNodeInfo)accessibilityNodeInfo);
            Parcel parcel = Parcel.obtain();
            parcel.setDataPosition(0);
            accessibilityNodeInfo2.writeToParcel(parcel, 0);
            parcel.setDataPosition(0);
            long l2 = parcel.readLong();
            if (ReflectionAccessors.isBitSet(l2, 0)) {
                parcel.readInt();
            }
            if (ReflectionAccessors.isBitSet(l2, 1)) {
                parcel.readLong();
            }
            if (ReflectionAccessors.isBitSet(l2, 2)) {
                parcel.readInt();
            }
            boolean bl = ReflectionAccessors.isBitSet(l2, 3);
            Long l3 = null;
            if (bl) {
                l3 = parcel.readLong();
            }
            parcel.recycle();
            return l3;
        }
    }

    private static class ViewAndId {
        final int id;
        final View view;

        private ViewAndId(View view, int n2) {
            this.view = view;
            this.id = n2;
        }

        /* synthetic */ ViewAndId(View view, int n2, 1 var3_2) {
            super(view, n2);
        }

        public boolean equals(Object object) {
            if (this == object) {
                return true;
            }
            if (!(object instanceof ViewAndId)) {
                return false;
            }
            ViewAndId viewAndId = (ViewAndId)object;
            return this.id == viewAndId.id && this.view.equals((Object)viewAndId.view);
        }

        public int hashCode() {
            return 31 * (31 + this.view.hashCode()) + this.id;
        }
    }

}

