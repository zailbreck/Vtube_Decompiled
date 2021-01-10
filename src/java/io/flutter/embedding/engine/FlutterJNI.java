/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.AssetManager
 *  android.graphics.Bitmap
 *  android.graphics.SurfaceTexture
 *  android.os.Looper
 *  android.view.Surface
 *  androidx.annotation.Keep
 *  io.flutter.view.AccessibilityBridge
 *  io.flutter.view.AccessibilityBridge$Action
 *  io.flutter.view.FlutterCallbackInformation
 *  java.lang.IllegalStateException
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.nio.ByteBuffer
 *  java.util.Iterator
 *  java.util.Set
 *  java.util.concurrent.CopyOnWriteArraySet
 */
package io.flutter.embedding.engine;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.view.Surface;
import androidx.annotation.Keep;
import io.flutter.Log;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.dart.PlatformMessageHandler;
import io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.view.AccessibilityBridge;
import io.flutter.view.FlutterCallbackInformation;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

@Keep
public class FlutterJNI {
    private static final String TAG = "FlutterJNI";
    private static AsyncWaitForVsyncDelegate asyncWaitForVsyncDelegate;
    private static String observatoryUri;
    private static float refreshRateFPS;
    private AccessibilityDelegate accessibilityDelegate;
    private final Set<FlutterEngine.EngineLifecycleListener> engineLifecycleListeners = new CopyOnWriteArraySet();
    private final Set<FlutterUiDisplayListener> flutterUiDisplayListeners = new CopyOnWriteArraySet();
    private final Looper mainLooper = Looper.getMainLooper();
    private Long nativePlatformViewId;
    private PlatformMessageHandler platformMessageHandler;

    private static void asyncWaitForVsync(long l2) {
        AsyncWaitForVsyncDelegate asyncWaitForVsyncDelegate = FlutterJNI.asyncWaitForVsyncDelegate;
        if (asyncWaitForVsyncDelegate != null) {
            asyncWaitForVsyncDelegate.asyncWaitForVsync(l2);
            return;
        }
        throw new IllegalStateException("An AsyncWaitForVsyncDelegate must be registered with FlutterJNI before asyncWaitForVsync() is invoked.");
    }

    private void ensureAttachedToNative() {
        if (this.nativePlatformViewId != null) {
            return;
        }
        throw new RuntimeException("Cannot execute operation because FlutterJNI is not attached to native.");
    }

    private void ensureNotAttachedToNative() {
        if (this.nativePlatformViewId == null) {
            return;
        }
        throw new RuntimeException("Cannot execute operation because FlutterJNI is attached to native.");
    }

    private void ensureRunningOnMainThread() {
        if (Looper.myLooper() == this.mainLooper) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Methods marked with @UiThread must be executed on the main thread. Current thread: ");
        stringBuilder.append(Thread.currentThread().getName());
        throw new RuntimeException(stringBuilder.toString());
    }

    public static String getObservatoryUri() {
        return observatoryUri;
    }

    private void handlePlatformMessage(String string2, byte[] arrby, int n2) {
        PlatformMessageHandler platformMessageHandler = this.platformMessageHandler;
        if (platformMessageHandler != null) {
            platformMessageHandler.handleMessageFromDart(string2, arrby, n2);
        }
    }

    private void handlePlatformMessageResponse(int n2, byte[] arrby) {
        PlatformMessageHandler platformMessageHandler = this.platformMessageHandler;
        if (platformMessageHandler != null) {
            platformMessageHandler.handlePlatformMessageResponse(n2, arrby);
        }
    }

    private native long nativeAttach(FlutterJNI var1, boolean var2);

    private native void nativeDestroy(long var1);

    private native void nativeDispatchEmptyPlatformMessage(long var1, String var3, int var4);

    private native void nativeDispatchPlatformMessage(long var1, String var3, ByteBuffer var4, int var5, int var6);

    private native void nativeDispatchPointerDataPacket(long var1, ByteBuffer var3, int var4);

    private native void nativeDispatchSemanticsAction(long var1, int var3, int var4, ByteBuffer var5, int var6);

    private native Bitmap nativeGetBitmap(long var1);

    public static native void nativeInit(Context var0, String[] var1, String var2, String var3, String var4);

    private native void nativeInvokePlatformMessageEmptyResponseCallback(long var1, int var3);

    private native void nativeInvokePlatformMessageResponseCallback(long var1, int var3, ByteBuffer var4, int var5);

    public static native FlutterCallbackInformation nativeLookupCallbackInformation(long var0);

    private native void nativeMarkTextureFrameAvailable(long var1, long var3);

    public static native void nativeOnVsync(long var0, long var2, long var4);

    public static native void nativeRecordStartTimestamp(long var0);

    private native void nativeRegisterTexture(long var1, long var3, SurfaceTexture var5);

    private native void nativeRunBundleAndSnapshotFromLibrary(long var1, String var3, String var4, String var5, AssetManager var6);

    private native void nativeSetAccessibilityFeatures(long var1, int var3);

    private native void nativeSetSemanticsEnabled(long var1, boolean var3);

    private native void nativeSetViewportMetrics(long var1, float var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17);

    private native void nativeSurfaceChanged(long var1, int var3, int var4);

    private native void nativeSurfaceCreated(long var1, Surface var3);

    private native void nativeSurfaceDestroyed(long var1);

    private native void nativeUnregisterTexture(long var1, long var3);

    private void onPreEngineRestart() {
        Iterator iterator = this.engineLifecycleListeners.iterator();
        while (iterator.hasNext()) {
            ((FlutterEngine.EngineLifecycleListener)iterator.next()).onPreEngineRestart();
        }
    }

    public static void setAsyncWaitForVsyncDelegate(AsyncWaitForVsyncDelegate asyncWaitForVsyncDelegate) {
        FlutterJNI.asyncWaitForVsyncDelegate = asyncWaitForVsyncDelegate;
    }

    public static void setRefreshRateFPS(float f2) {
        refreshRateFPS = f2;
    }

    private void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] arrstring) {
        FlutterJNI.super.ensureRunningOnMainThread();
        AccessibilityDelegate accessibilityDelegate = this.accessibilityDelegate;
        if (accessibilityDelegate != null) {
            accessibilityDelegate.updateCustomAccessibilityActions(byteBuffer, arrstring);
        }
    }

    private void updateSemantics(ByteBuffer byteBuffer, String[] arrstring) {
        FlutterJNI.super.ensureRunningOnMainThread();
        AccessibilityDelegate accessibilityDelegate = this.accessibilityDelegate;
        if (accessibilityDelegate != null) {
            accessibilityDelegate.updateSemantics(byteBuffer, arrstring);
        }
    }

    public void addEngineLifecycleListener(FlutterEngine.EngineLifecycleListener engineLifecycleListener) {
        FlutterJNI.super.ensureRunningOnMainThread();
        this.engineLifecycleListeners.add((Object)engineLifecycleListener);
    }

    public void addIsDisplayingFlutterUiListener(FlutterUiDisplayListener flutterUiDisplayListener) {
        FlutterJNI.super.ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.add((Object)flutterUiDisplayListener);
    }

    public void attachToNative(boolean bl) {
        FlutterJNI.super.ensureRunningOnMainThread();
        FlutterJNI.super.ensureNotAttachedToNative();
        this.nativePlatformViewId = FlutterJNI.super.nativeAttach((FlutterJNI)this, bl);
    }

    public void detachFromNativeAndReleaseResources() {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.nativeDestroy(this.nativePlatformViewId);
        this.nativePlatformViewId = null;
    }

    public void dispatchEmptyPlatformMessage(String string2, int n2) {
        FlutterJNI.super.ensureRunningOnMainThread();
        if (this.isAttached()) {
            FlutterJNI.super.nativeDispatchEmptyPlatformMessage(this.nativePlatformViewId, string2, n2);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: ");
        stringBuilder.append(string2);
        stringBuilder.append(". Response ID: ");
        stringBuilder.append(n2);
        Log.w("FlutterJNI", stringBuilder.toString());
    }

    public void dispatchPlatformMessage(String string2, ByteBuffer byteBuffer, int n2, int n3) {
        FlutterJNI.super.ensureRunningOnMainThread();
        if (this.isAttached()) {
            FlutterJNI.super.nativeDispatchPlatformMessage(this.nativePlatformViewId, string2, byteBuffer, n2, n3);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Tried to send a platform message to Flutter, but FlutterJNI was detached from native C++. Could not send. Channel: ");
        stringBuilder.append(string2);
        stringBuilder.append(". Response ID: ");
        stringBuilder.append(n3);
        Log.w("FlutterJNI", stringBuilder.toString());
    }

    public void dispatchPointerDataPacket(ByteBuffer byteBuffer, int n2) {
        FlutterJNI.super.ensureRunningOnMainThread();
        FlutterJNI.super.ensureAttachedToNative();
        FlutterJNI.super.nativeDispatchPointerDataPacket(this.nativePlatformViewId, byteBuffer, n2);
    }

    public void dispatchSemanticsAction(int n2, int n3, ByteBuffer byteBuffer, int n4) {
        FlutterJNI.super.ensureRunningOnMainThread();
        FlutterJNI.super.ensureAttachedToNative();
        FlutterJNI.super.nativeDispatchSemanticsAction(this.nativePlatformViewId, n2, n3, byteBuffer, n4);
    }

    public void dispatchSemanticsAction(int n2, AccessibilityBridge.Action action) {
        this.dispatchSemanticsAction(n2, action, null);
    }

    public void dispatchSemanticsAction(int n2, AccessibilityBridge.Action action, Object object) {
        ByteBuffer byteBuffer;
        int n3;
        FlutterJNI.super.ensureAttachedToNative();
        if (object != null) {
            byteBuffer = StandardMessageCodec.INSTANCE.encodeMessage(object);
            n3 = byteBuffer.position();
        } else {
            byteBuffer = null;
            n3 = 0;
        }
        this.dispatchSemanticsAction(n2, action.value, byteBuffer, n3);
    }

    public Bitmap getBitmap() {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        return this.nativeGetBitmap(this.nativePlatformViewId);
    }

    public void invokePlatformMessageEmptyResponseCallback(int n2) {
        FlutterJNI.super.ensureRunningOnMainThread();
        if (this.isAttached()) {
            FlutterJNI.super.nativeInvokePlatformMessageEmptyResponseCallback(this.nativePlatformViewId, n2);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: ");
        stringBuilder.append(n2);
        Log.w("FlutterJNI", stringBuilder.toString());
    }

    public void invokePlatformMessageResponseCallback(int n2, ByteBuffer byteBuffer, int n3) {
        FlutterJNI.super.ensureRunningOnMainThread();
        if (this.isAttached()) {
            FlutterJNI.super.nativeInvokePlatformMessageResponseCallback(this.nativePlatformViewId, n2, byteBuffer, n3);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Tried to send a platform message response, but FlutterJNI was detached from native C++. Could not send. Response ID: ");
        stringBuilder.append(n2);
        Log.w("FlutterJNI", stringBuilder.toString());
    }

    public boolean isAttached() {
        return this.nativePlatformViewId != null;
    }

    public void markTextureFrameAvailable(long l2) {
        FlutterJNI.super.ensureRunningOnMainThread();
        FlutterJNI.super.ensureAttachedToNative();
        FlutterJNI.super.nativeMarkTextureFrameAvailable(this.nativePlatformViewId, l2);
    }

    public native boolean nativeGetIsSoftwareRenderingEnabled();

    void onFirstFrame() {
        this.ensureRunningOnMainThread();
        Iterator iterator = this.flutterUiDisplayListeners.iterator();
        while (iterator.hasNext()) {
            ((FlutterUiDisplayListener)iterator.next()).onFlutterUiDisplayed();
        }
    }

    void onRenderingStopped() {
        this.ensureRunningOnMainThread();
        Iterator iterator = this.flutterUiDisplayListeners.iterator();
        while (iterator.hasNext()) {
            ((FlutterUiDisplayListener)iterator.next()).onFlutterUiNoLongerDisplayed();
        }
    }

    public void onSurfaceChanged(int n2, int n3) {
        FlutterJNI.super.ensureRunningOnMainThread();
        FlutterJNI.super.ensureAttachedToNative();
        FlutterJNI.super.nativeSurfaceChanged(this.nativePlatformViewId, n2, n3);
    }

    public void onSurfaceCreated(Surface surface) {
        FlutterJNI.super.ensureRunningOnMainThread();
        FlutterJNI.super.ensureAttachedToNative();
        FlutterJNI.super.nativeSurfaceCreated(this.nativePlatformViewId, surface);
    }

    public void onSurfaceDestroyed() {
        this.ensureRunningOnMainThread();
        this.ensureAttachedToNative();
        this.onRenderingStopped();
        this.nativeSurfaceDestroyed(this.nativePlatformViewId);
    }

    public void registerTexture(long l2, SurfaceTexture surfaceTexture) {
        FlutterJNI.super.ensureRunningOnMainThread();
        FlutterJNI.super.ensureAttachedToNative();
        FlutterJNI.super.nativeRegisterTexture(this.nativePlatformViewId, l2, surfaceTexture);
    }

    public void removeEngineLifecycleListener(FlutterEngine.EngineLifecycleListener engineLifecycleListener) {
        FlutterJNI.super.ensureRunningOnMainThread();
        this.engineLifecycleListeners.remove((Object)engineLifecycleListener);
    }

    public void removeIsDisplayingFlutterUiListener(FlutterUiDisplayListener flutterUiDisplayListener) {
        FlutterJNI.super.ensureRunningOnMainThread();
        this.flutterUiDisplayListeners.remove((Object)flutterUiDisplayListener);
    }

    public void runBundleAndSnapshotFromLibrary(String string2, String string3, String string4, AssetManager assetManager) {
        FlutterJNI.super.ensureRunningOnMainThread();
        FlutterJNI.super.ensureAttachedToNative();
        FlutterJNI.super.nativeRunBundleAndSnapshotFromLibrary(this.nativePlatformViewId, string2, string3, string4, assetManager);
    }

    public void setAccessibilityDelegate(AccessibilityDelegate accessibilityDelegate) {
        FlutterJNI.super.ensureRunningOnMainThread();
        this.accessibilityDelegate = accessibilityDelegate;
    }

    public void setAccessibilityFeatures(int n2) {
        FlutterJNI.super.ensureRunningOnMainThread();
        FlutterJNI.super.ensureAttachedToNative();
        FlutterJNI.super.nativeSetAccessibilityFeatures(this.nativePlatformViewId, n2);
    }

    public void setPlatformMessageHandler(PlatformMessageHandler platformMessageHandler) {
        FlutterJNI.super.ensureRunningOnMainThread();
        this.platformMessageHandler = platformMessageHandler;
    }

    public void setSemanticsEnabled(boolean bl) {
        FlutterJNI.super.ensureRunningOnMainThread();
        FlutterJNI.super.ensureAttachedToNative();
        FlutterJNI.super.nativeSetSemanticsEnabled(this.nativePlatformViewId, bl);
    }

    public void setViewportMetrics(float f2, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15) {
        FlutterJNI.super.ensureRunningOnMainThread();
        FlutterJNI.super.ensureAttachedToNative();
        FlutterJNI.super.nativeSetViewportMetrics(this.nativePlatformViewId, f2, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15);
    }

    public void unregisterTexture(long l2) {
        FlutterJNI.super.ensureRunningOnMainThread();
        FlutterJNI.super.ensureAttachedToNative();
        FlutterJNI.super.nativeUnregisterTexture(this.nativePlatformViewId, l2);
    }

    public static interface AccessibilityDelegate {
        public void updateCustomAccessibilityActions(ByteBuffer var1, String[] var2);

        public void updateSemantics(ByteBuffer var1, String[] var2);
    }

    public static interface AsyncWaitForVsyncDelegate {
        public void asyncWaitForVsync(long var1);
    }

}

