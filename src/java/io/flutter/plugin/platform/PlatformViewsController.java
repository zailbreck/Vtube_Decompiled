/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.content.Context
 *  android.content.res.Resources
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.util.DisplayMetrics
 *  android.util.Log
 *  android.view.MotionEvent
 *  android.view.MotionEvent$PointerCoords
 *  android.view.MotionEvent$PointerProperties
 *  android.view.View
 *  android.view.View$OnFocusChangeListener
 *  io.flutter.embedding.engine.systemchannels.PlatformViewsChannel
 *  io.flutter.embedding.engine.systemchannels.PlatformViewsChannel$PlatformViewCreationRequest
 *  io.flutter.embedding.engine.systemchannels.PlatformViewsChannel$PlatformViewResizeRequest
 *  io.flutter.embedding.engine.systemchannels.PlatformViewsChannel$PlatformViewTouch
 *  io.flutter.embedding.engine.systemchannels.PlatformViewsChannel$PlatformViewsHandler
 *  io.flutter.plugin.common.MessageCodec
 *  io.flutter.plugin.editing.TextInputPlugin
 *  io.flutter.plugin.platform.AccessibilityEventsDelegate
 *  io.flutter.plugin.platform.PlatformViewFactory
 *  io.flutter.plugin.platform.PlatformViewRegistry
 *  io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate
 *  io.flutter.plugin.platform.PlatformViewsController$1$1
 *  io.flutter.plugin.platform.VirtualDisplayController
 *  io.flutter.plugin.platform.a
 *  io.flutter.view.AccessibilityBridge
 *  io.flutter.view.TextureRegistry
 *  io.flutter.view.TextureRegistry$SurfaceTextureEntry
 *  java.lang.AssertionError
 *  java.lang.Double
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.ByteBuffer
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 */
package io.flutter.plugin.platform;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.systemchannels.PlatformViewsChannel;
import io.flutter.plugin.common.MessageCodec;
import io.flutter.plugin.editing.TextInputPlugin;
import io.flutter.plugin.platform.AccessibilityEventsDelegate;
import io.flutter.plugin.platform.PlatformViewFactory;
import io.flutter.plugin.platform.PlatformViewRegistry;
import io.flutter.plugin.platform.PlatformViewRegistryImpl;
import io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate;
import io.flutter.plugin.platform.PlatformViewsController;
import io.flutter.plugin.platform.VirtualDisplayController;
import io.flutter.plugin.platform.a;
import io.flutter.view.AccessibilityBridge;
import io.flutter.view.TextureRegistry;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class PlatformViewsController
implements PlatformViewsAccessibilityDelegate {
    private static final int MINIMAL_SDK = 20;
    private static final String TAG = "PlatformViewsController";
    private final AccessibilityEventsDelegate accessibilityEventsDelegate = new AccessibilityEventsDelegate();
    private final PlatformViewsChannel.PlatformViewsHandler channelHandler = new PlatformViewsChannel.PlatformViewsHandler(){

        private void ensureValidAndroidVersion() {
            if (Build.VERSION.SDK_INT >= 20) {
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Trying to use platform views with API ");
            stringBuilder.append(Build.VERSION.SDK_INT);
            stringBuilder.append(", required API level is: ");
            stringBuilder.append(20);
            throw new IllegalStateException(stringBuilder.toString());
        }

        public /* synthetic */ void a(PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest, View view, boolean bl) {
            if (bl) {
                PlatformViewsController.this.platformViewsChannel.invokeViewFocused(platformViewCreationRequest.viewId);
            }
        }

        public void clearFocus(int n2) {
            ((VirtualDisplayController)PlatformViewsController.this.vdControllers.get((Object)n2)).getView().clearFocus();
        }

        @TargetApi(value=17)
        public long createPlatformView(PlatformViewsChannel.PlatformViewCreationRequest platformViewCreationRequest) {
            1.super.ensureValidAndroidVersion();
            if (PlatformViewsController.validateDirection(platformViewCreationRequest.direction)) {
                if (!PlatformViewsController.this.vdControllers.containsKey((Object)platformViewCreationRequest.viewId)) {
                    PlatformViewFactory platformViewFactory = PlatformViewsController.this.registry.getFactory(platformViewCreationRequest.viewType);
                    if (platformViewFactory != null) {
                        ByteBuffer byteBuffer = platformViewCreationRequest.params;
                        Object object = null;
                        if (byteBuffer != null) {
                            object = platformViewFactory.getCreateArgsCodec().decodeMessage(platformViewCreationRequest.params);
                        }
                        Object object2 = object;
                        int n2 = PlatformViewsController.this.toPhysicalPixels(platformViewCreationRequest.logicalWidth);
                        int n3 = PlatformViewsController.this.toPhysicalPixels(platformViewCreationRequest.logicalHeight);
                        PlatformViewsController.this.validateVirtualDisplayDimensions(n2, n3);
                        TextureRegistry.SurfaceTextureEntry surfaceTextureEntry = PlatformViewsController.this.textureRegistry.createSurfaceTexture();
                        VirtualDisplayController virtualDisplayController = VirtualDisplayController.create((Context)PlatformViewsController.this.context, (AccessibilityEventsDelegate)PlatformViewsController.this.accessibilityEventsDelegate, (PlatformViewFactory)platformViewFactory, (TextureRegistry.SurfaceTextureEntry)surfaceTextureEntry, (int)n2, (int)n3, (int)platformViewCreationRequest.viewId, (Object)object2, (View.OnFocusChangeListener)new a(this, platformViewCreationRequest));
                        if (virtualDisplayController != null) {
                            if (PlatformViewsController.this.flutterView != null) {
                                virtualDisplayController.onFlutterViewAttached(PlatformViewsController.this.flutterView);
                            }
                            PlatformViewsController.this.vdControllers.put((Object)platformViewCreationRequest.viewId, (Object)virtualDisplayController);
                            View view = virtualDisplayController.getView();
                            view.setLayoutDirection(platformViewCreationRequest.direction);
                            PlatformViewsController.this.contextToPlatformView.put((Object)view.getContext(), (Object)view);
                            return surfaceTextureEntry.id();
                        }
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("Failed creating virtual display for a ");
                        stringBuilder.append(platformViewCreationRequest.viewType);
                        stringBuilder.append(" with id: ");
                        stringBuilder.append(platformViewCreationRequest.viewId);
                        throw new IllegalStateException(stringBuilder.toString());
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Trying to create a platform view of unregistered type: ");
                    stringBuilder.append(platformViewCreationRequest.viewType);
                    throw new IllegalStateException(stringBuilder.toString());
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Trying to create an already created platform view, view id: ");
                stringBuilder.append(platformViewCreationRequest.viewId);
                throw new IllegalStateException(stringBuilder.toString());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Trying to create a view with unknown direction value: ");
            stringBuilder.append(platformViewCreationRequest.direction);
            stringBuilder.append("(view id: ");
            stringBuilder.append(platformViewCreationRequest.viewId);
            stringBuilder.append(")");
            throw new IllegalStateException(stringBuilder.toString());
        }

        public void disposePlatformView(int n2) {
            1.super.ensureValidAndroidVersion();
            VirtualDisplayController virtualDisplayController = (VirtualDisplayController)PlatformViewsController.this.vdControllers.get((Object)n2);
            if (virtualDisplayController != null) {
                if (PlatformViewsController.this.textInputPlugin != null) {
                    PlatformViewsController.this.textInputPlugin.clearPlatformViewClient(n2);
                }
                PlatformViewsController.this.contextToPlatformView.remove((Object)virtualDisplayController.getView().getContext());
                virtualDisplayController.dispose();
                PlatformViewsController.this.vdControllers.remove((Object)n2);
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Trying to dispose a platform view with unknown id: ");
            stringBuilder.append(n2);
            throw new IllegalStateException(stringBuilder.toString());
        }

        public void onTouch(PlatformViewsChannel.PlatformViewTouch platformViewTouch) {
            1.super.ensureValidAndroidVersion();
            float f2 = PlatformViewsController.access$500((PlatformViewsController)PlatformViewsController.this).getResources().getDisplayMetrics().density;
            MotionEvent.PointerProperties[] arrpointerProperties = (MotionEvent.PointerProperties[])PlatformViewsController.parsePointerPropertiesList(platformViewTouch.rawPointerPropertiesList).toArray((Object[])new MotionEvent.PointerProperties[platformViewTouch.pointerCount]);
            MotionEvent.PointerCoords[] arrpointerCoords = (MotionEvent.PointerCoords[])PlatformViewsController.parsePointerCoordsList(platformViewTouch.rawPointerCoords, f2).toArray((Object[])new MotionEvent.PointerCoords[platformViewTouch.pointerCount]);
            if (PlatformViewsController.this.vdControllers.containsKey((Object)platformViewTouch.viewId)) {
                ((VirtualDisplayController)PlatformViewsController.this.vdControllers.get((Object)platformViewTouch.viewId)).getView().dispatchTouchEvent(MotionEvent.obtain((long)platformViewTouch.downTime.longValue(), (long)platformViewTouch.eventTime.longValue(), (int)platformViewTouch.action, (int)platformViewTouch.pointerCount, (MotionEvent.PointerProperties[])arrpointerProperties, (MotionEvent.PointerCoords[])arrpointerCoords, (int)platformViewTouch.metaState, (int)platformViewTouch.buttonState, (float)platformViewTouch.xPrecision, (float)platformViewTouch.yPrecision, (int)platformViewTouch.deviceId, (int)platformViewTouch.edgeFlags, (int)platformViewTouch.source, (int)platformViewTouch.flags));
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Sending touch to an unknown view with id: ");
            stringBuilder.append(platformViewTouch.viewId);
            throw new IllegalStateException(stringBuilder.toString());
        }

        public void resizePlatformView(PlatformViewsChannel.PlatformViewResizeRequest platformViewResizeRequest, Runnable runnable) {
            1.super.ensureValidAndroidVersion();
            VirtualDisplayController virtualDisplayController = (VirtualDisplayController)PlatformViewsController.this.vdControllers.get((Object)platformViewResizeRequest.viewId);
            if (virtualDisplayController != null) {
                int n2 = PlatformViewsController.this.toPhysicalPixels(platformViewResizeRequest.newLogicalWidth);
                int n3 = PlatformViewsController.this.toPhysicalPixels(platformViewResizeRequest.newLogicalHeight);
                PlatformViewsController.this.validateVirtualDisplayDimensions(n2, n3);
                PlatformViewsController.this.lockInputConnection(virtualDisplayController);
                virtualDisplayController.resize(n2, n3, (Runnable)new 1(this, virtualDisplayController, runnable));
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Trying to resize a platform view with unknown id: ");
            stringBuilder.append(platformViewResizeRequest.viewId);
            throw new IllegalStateException(stringBuilder.toString());
        }

        @TargetApi(value=17)
        public void setDirection(int n2, int n3) {
            1.super.ensureValidAndroidVersion();
            if (PlatformViewsController.validateDirection(n3)) {
                View view = ((VirtualDisplayController)PlatformViewsController.this.vdControllers.get((Object)n2)).getView();
                if (view != null) {
                    view.setLayoutDirection(n3);
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Sending touch to an unknown view with id: ");
                stringBuilder.append(n3);
                throw new IllegalStateException(stringBuilder.toString());
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Trying to set unknown direction value: ");
            stringBuilder.append(n3);
            stringBuilder.append("(view id: ");
            stringBuilder.append(n2);
            stringBuilder.append(")");
            throw new IllegalStateException(stringBuilder.toString());
        }
    };
    private Context context;
    private final HashMap<Context, View> contextToPlatformView = new HashMap();
    private View flutterView;
    private PlatformViewsChannel platformViewsChannel;
    private final PlatformViewRegistryImpl registry = new PlatformViewRegistryImpl();
    private TextInputPlugin textInputPlugin;
    private TextureRegistry textureRegistry;
    final HashMap<Integer, VirtualDisplayController> vdControllers = new HashMap();

    static /* synthetic */ void access$1100(PlatformViewsController platformViewsController, VirtualDisplayController virtualDisplayController) {
        platformViewsController.unlockInputConnection(virtualDisplayController);
    }

    private void flushAllViews() {
        Iterator iterator = this.vdControllers.values().iterator();
        while (iterator.hasNext()) {
            ((VirtualDisplayController)iterator.next()).dispose();
        }
        this.vdControllers.clear();
    }

    private void lockInputConnection(VirtualDisplayController virtualDisplayController) {
        TextInputPlugin textInputPlugin = this.textInputPlugin;
        if (textInputPlugin == null) {
            return;
        }
        textInputPlugin.lockPlatformViewInputConnection();
        virtualDisplayController.onInputConnectionLocked();
    }

    private static MotionEvent.PointerCoords parsePointerCoords(Object object, float f2) {
        List list = (List)object;
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        pointerCoords.orientation = (float)((Double)list.get(0)).doubleValue();
        pointerCoords.pressure = (float)((Double)list.get(1)).doubleValue();
        pointerCoords.size = (float)((Double)list.get(2)).doubleValue();
        pointerCoords.toolMajor = f2 * (float)((Double)list.get(3)).doubleValue();
        pointerCoords.toolMinor = f2 * (float)((Double)list.get(4)).doubleValue();
        pointerCoords.touchMajor = f2 * (float)((Double)list.get(5)).doubleValue();
        pointerCoords.touchMinor = f2 * (float)((Double)list.get(6)).doubleValue();
        pointerCoords.x = f2 * (float)((Double)list.get(7)).doubleValue();
        pointerCoords.y = f2 * (float)((Double)list.get(8)).doubleValue();
        return pointerCoords;
    }

    private static List<MotionEvent.PointerCoords> parsePointerCoordsList(Object object, float f2) {
        List list = (List)object;
        ArrayList arrayList = new ArrayList();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            arrayList.add((Object)PlatformViewsController.parsePointerCoords(iterator.next(), f2));
        }
        return arrayList;
    }

    private static MotionEvent.PointerProperties parsePointerProperties(Object object) {
        List list = (List)object;
        MotionEvent.PointerProperties pointerProperties = new MotionEvent.PointerProperties();
        pointerProperties.id = (Integer)list.get(0);
        pointerProperties.toolType = (Integer)list.get(1);
        return pointerProperties;
    }

    private static List<MotionEvent.PointerProperties> parsePointerPropertiesList(Object object) {
        List list = (List)object;
        ArrayList arrayList = new ArrayList();
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            arrayList.add((Object)PlatformViewsController.parsePointerProperties(iterator.next()));
        }
        return arrayList;
    }

    private int toPhysicalPixels(double d2) {
        double d3 = this.context.getResources().getDisplayMetrics().density;
        Double.isNaN((double)d3);
        return (int)Math.round((double)(d2 * d3));
    }

    private void unlockInputConnection(VirtualDisplayController virtualDisplayController) {
        TextInputPlugin textInputPlugin = this.textInputPlugin;
        if (textInputPlugin == null) {
            return;
        }
        textInputPlugin.unlockPlatformViewInputConnection();
        virtualDisplayController.onInputConnectionUnlocked();
    }

    private static boolean validateDirection(int n2) {
        int n3 = 1;
        if (n2 != 0) {
            if (n2 == n3) {
                return n3;
            }
            n3 = 0;
        }
        return n3;
    }

    private void validateVirtualDisplayDimensions(int n2, int n3) {
        DisplayMetrics displayMetrics = this.context.getResources().getDisplayMetrics();
        if (n3 > displayMetrics.heightPixels || n2 > displayMetrics.widthPixels) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Creating a virtual display of size: [");
            stringBuilder.append(n2);
            stringBuilder.append(", ");
            stringBuilder.append(n3);
            stringBuilder.append("] may result in problems(https://github.com/flutter/flutter/issues/2897).It is larger than the device screen size: [");
            stringBuilder.append(displayMetrics.widthPixels);
            stringBuilder.append(", ");
            stringBuilder.append(displayMetrics.heightPixels);
            stringBuilder.append("].");
            Log.w((String)TAG, (String)stringBuilder.toString());
        }
    }

    public void attach(Context context, TextureRegistry textureRegistry, DartExecutor dartExecutor) {
        if (this.context == null) {
            this.context = context;
            this.textureRegistry = textureRegistry;
            this.platformViewsChannel = new PlatformViewsChannel(dartExecutor);
            this.platformViewsChannel.setPlatformViewsHandler(this.channelHandler);
            return;
        }
        throw new AssertionError((Object)"A PlatformViewsController can only be attached to a single output target.\nattach was called while the PlatformViewsController was already attached.");
    }

    public void attachAccessibilityBridge(AccessibilityBridge accessibilityBridge) {
        this.accessibilityEventsDelegate.setAccessibilityBridge(accessibilityBridge);
    }

    public void attachTextInputPlugin(TextInputPlugin textInputPlugin) {
        this.textInputPlugin = textInputPlugin;
    }

    public void attachToView(View view) {
        this.flutterView = view;
        Iterator iterator = this.vdControllers.values().iterator();
        while (iterator.hasNext()) {
            ((VirtualDisplayController)iterator.next()).onFlutterViewAttached(view);
        }
    }

    public boolean checkInputConnectionProxy(View view) {
        if (!this.contextToPlatformView.containsKey((Object)view.getContext())) {
            return false;
        }
        View view2 = (View)this.contextToPlatformView.get((Object)view.getContext());
        if (view2 == view) {
            return true;
        }
        return view2.checkInputConnectionProxy(view);
    }

    public void detach() {
        this.platformViewsChannel.setPlatformViewsHandler(null);
        this.platformViewsChannel = null;
        this.context = null;
        this.textureRegistry = null;
    }

    public void detachAccessibiltyBridge() {
        this.accessibilityEventsDelegate.setAccessibilityBridge(null);
    }

    public void detachFromView() {
        this.flutterView = null;
        Iterator iterator = this.vdControllers.values().iterator();
        while (iterator.hasNext()) {
            ((VirtualDisplayController)iterator.next()).onFlutterViewDetached();
        }
    }

    public void detachTextInputPlugin() {
        this.textInputPlugin = null;
    }

    public View getPlatformViewById(Integer n2) {
        VirtualDisplayController virtualDisplayController = (VirtualDisplayController)this.vdControllers.get((Object)n2);
        if (virtualDisplayController == null) {
            return null;
        }
        return virtualDisplayController.getView();
    }

    public PlatformViewRegistry getRegistry() {
        return this.registry;
    }

    public void onFlutterViewDestroyed() {
        this.flushAllViews();
    }

    public void onPreEngineRestart() {
        this.flushAllViews();
    }

}

