/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.annotation.TargetApi
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.database.ContentObserver
 *  android.graphics.Rect
 *  android.net.Uri
 *  android.opengl.Matrix
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.provider.Settings
 *  android.provider.Settings$Global
 *  android.util.Log
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.ViewParent
 *  android.view.WindowInsets
 *  android.view.accessibility.AccessibilityEvent
 *  android.view.accessibility.AccessibilityManager
 *  android.view.accessibility.AccessibilityManager$AccessibilityStateChangeListener
 *  android.view.accessibility.AccessibilityManager$TouchExplorationStateChangeListener
 *  android.view.accessibility.AccessibilityNodeInfo
 *  android.view.accessibility.AccessibilityNodeInfo$AccessibilityAction
 *  android.view.accessibility.AccessibilityNodeInfo$CollectionInfo
 *  android.view.accessibility.AccessibilityNodeProvider
 *  android.view.accessibility.AccessibilityRecord
 *  java.lang.CharSequence
 *  java.lang.Enum
 *  java.lang.Float
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.nio.ByteBuffer
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.HashMap
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package io.flutter.view;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.graphics.Rect;
import android.net.Uri;
import android.opengl.Matrix;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import android.view.accessibility.AccessibilityRecord;
import io.flutter.embedding.engine.systemchannels.AccessibilityChannel;
import io.flutter.plugin.platform.PlatformViewsAccessibilityDelegate;
import io.flutter.util.Predicate;
import io.flutter.view.AccessibilityBridge;
import io.flutter.view.AccessibilityViewEmbedder;
import io.flutter.view.a;
import io.flutter.view.b;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class AccessibilityBridge
extends AccessibilityNodeProvider {
    private static final int ACTION_SHOW_ON_SCREEN = 16908342;
    private static int FIRST_RESOURCE_ID = 267386881;
    private static final int MIN_ENGINE_GENERATED_NODE_ID = 65536;
    private static final int ROOT_NODE_ID = 0;
    private static final float SCROLL_EXTENT_FOR_INFINITY = 100000.0f;
    private static final float SCROLL_POSITION_CAP_FOR_INFINITY = 70000.0f;
    private static final String TAG = "AccessibilityBridge";
    private final AccessibilityChannel accessibilityChannel;
    private int accessibilityFeatureFlags = 0;
    private SemanticsNode accessibilityFocusedSemanticsNode;
    private final AccessibilityManager accessibilityManager;
    private final AccessibilityChannel.AccessibilityMessageHandler accessibilityMessageHandler = new AccessibilityChannel.AccessibilityMessageHandler(this){
        final /* synthetic */ AccessibilityBridge this$0;
        {
            this.this$0 = accessibilityBridge;
        }

        public void announce(String string2) {
            AccessibilityBridge.access$000(this.this$0).announceForAccessibility((CharSequence)string2);
        }

        public void onLongPress(int n2) {
            AccessibilityBridge.access$100(this.this$0, n2, 2);
        }

        public void onTap(int n2) {
            AccessibilityBridge.access$100(this.this$0, n2, 1);
        }

        public void onTooltip(String string2) {
            AccessibilityEvent accessibilityEvent = AccessibilityBridge.access$200(this.this$0, 0, 32);
            accessibilityEvent.getText().add((Object)string2);
            AccessibilityBridge.access$300(this.this$0, accessibilityEvent);
        }

        public void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] arrstring) {
            byteBuffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            this.this$0.updateCustomAccessibilityActions(byteBuffer, arrstring);
        }

        public void updateSemantics(ByteBuffer byteBuffer, String[] arrstring) {
            byteBuffer.order(java.nio.ByteOrder.LITTLE_ENDIAN);
            this.this$0.updateSemantics(byteBuffer, arrstring);
        }
    };
    private final AccessibilityManager.AccessibilityStateChangeListener accessibilityStateChangeListener = new AccessibilityManager.AccessibilityStateChangeListener(){

        public void onAccessibilityStateChanged(boolean bl) {
            AccessibilityChannel accessibilityChannel = AccessibilityBridge.this.accessibilityChannel;
            if (bl) {
                accessibilityChannel.setAccessibilityMessageHandler(AccessibilityBridge.this.accessibilityMessageHandler);
                AccessibilityBridge.this.accessibilityChannel.onAndroidAccessibilityEnabled();
            } else {
                accessibilityChannel.setAccessibilityMessageHandler(null);
                AccessibilityBridge.this.accessibilityChannel.onAndroidAccessibilityDisabled();
            }
            if (AccessibilityBridge.this.onAccessibilityChangeListener != null) {
                AccessibilityBridge.this.onAccessibilityChangeListener.onAccessibilityChanged(bl, AccessibilityBridge.this.accessibilityManager.isTouchExplorationEnabled());
            }
        }
    };
    private final AccessibilityViewEmbedder accessibilityViewEmbedder;
    private final ContentObserver animationScaleObserver = new ContentObserver(new Handler()){

        public void onChange(boolean bl) {
            this.onChange(bl, null);
        }

        public void onChange(boolean bl, Uri uri) {
            AccessibilityBridge accessibilityBridge;
            int n2;
            String string2 = Build.VERSION.SDK_INT < 17 ? null : Settings.Global.getString((ContentResolver)AccessibilityBridge.this.contentResolver, (String)"transition_animation_scale");
            boolean bl2 = string2 != null && string2.equals((Object)"0");
            if (bl2) {
                accessibilityBridge = AccessibilityBridge.this;
                n2 = accessibilityBridge.accessibilityFeatureFlags | AccessibilityFeature.DISABLE_ANIMATIONS.value;
            } else {
                accessibilityBridge = AccessibilityBridge.this;
                n2 = accessibilityBridge.accessibilityFeatureFlags & (-1 ^ AccessibilityFeature.DISABLE_ANIMATIONS.value);
            }
            accessibilityBridge.accessibilityFeatureFlags = n2;
            AccessibilityBridge.this.sendLatestAccessibilityFlagsToFlutter();
        }
    };
    private final ContentResolver contentResolver;
    private final Map<Integer, CustomAccessibilityAction> customAccessibilityActions = new HashMap();
    private Integer embeddedAccessibilityFocusedNodeId;
    private Integer embeddedInputFocusedNodeId;
    private final List<Integer> flutterNavigationStack = new ArrayList();
    private final Map<Integer, SemanticsNode> flutterSemanticsTree = new HashMap();
    private SemanticsNode hoveredObject;
    private SemanticsNode inputFocusedSemanticsNode;
    private SemanticsNode lastInputFocusedSemanticsNode;
    private Integer lastLeftFrameInset = 0;
    private OnAccessibilityChangeListener onAccessibilityChangeListener;
    private final PlatformViewsAccessibilityDelegate platformViewsAccessibilityDelegate;
    private int previousRouteId = 0;
    private final View rootAccessibilityView;
    @TargetApi(value=19)
    private final AccessibilityManager.TouchExplorationStateChangeListener touchExplorationStateChangeListener;

    public AccessibilityBridge(View view, AccessibilityChannel accessibilityChannel, final AccessibilityManager accessibilityManager, ContentResolver contentResolver, PlatformViewsAccessibilityDelegate platformViewsAccessibilityDelegate) {
        this.rootAccessibilityView = view;
        this.accessibilityChannel = accessibilityChannel;
        this.accessibilityManager = accessibilityManager;
        this.contentResolver = contentResolver;
        this.platformViewsAccessibilityDelegate = platformViewsAccessibilityDelegate;
        this.accessibilityStateChangeListener.onAccessibilityStateChanged(accessibilityManager.isEnabled());
        this.accessibilityManager.addAccessibilityStateChangeListener(this.accessibilityStateChangeListener);
        if (Build.VERSION.SDK_INT >= 19) {
            this.touchExplorationStateChangeListener = new AccessibilityManager.TouchExplorationStateChangeListener(){

                public void onTouchExplorationStateChanged(boolean bl) {
                    int n2;
                    AccessibilityBridge accessibilityBridge = AccessibilityBridge.this;
                    if (bl) {
                        n2 = accessibilityBridge.accessibilityFeatureFlags | AccessibilityFeature.ACCESSIBLE_NAVIGATION.value;
                    } else {
                        accessibilityBridge.onTouchExplorationExit();
                        accessibilityBridge = AccessibilityBridge.this;
                        n2 = accessibilityBridge.accessibilityFeatureFlags & (-1 ^ AccessibilityFeature.ACCESSIBLE_NAVIGATION.value);
                    }
                    accessibilityBridge.accessibilityFeatureFlags = n2;
                    AccessibilityBridge.this.sendLatestAccessibilityFlagsToFlutter();
                    if (AccessibilityBridge.this.onAccessibilityChangeListener != null) {
                        AccessibilityBridge.this.onAccessibilityChangeListener.onAccessibilityChanged(accessibilityManager.isEnabled(), bl);
                    }
                }
            };
            this.touchExplorationStateChangeListener.onTouchExplorationStateChanged(accessibilityManager.isTouchExplorationEnabled());
            this.accessibilityManager.addTouchExplorationStateChangeListener(this.touchExplorationStateChangeListener);
        } else {
            this.touchExplorationStateChangeListener = null;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            this.animationScaleObserver.onChange(false);
            Uri uri = Settings.Global.getUriFor((String)"transition_animation_scale");
            this.contentResolver.registerContentObserver(uri, false, this.animationScaleObserver);
        }
        if (platformViewsAccessibilityDelegate != null) {
            platformViewsAccessibilityDelegate.attachAccessibilityBridge(this);
        }
        this.accessibilityViewEmbedder = new AccessibilityViewEmbedder(view, 65536);
    }

    static /* synthetic */ boolean a(SemanticsNode semanticsNode) {
        return semanticsNode.hasFlag(Flag.HAS_IMPLICIT_SCROLLING);
    }

    static /* synthetic */ boolean a(SemanticsNode semanticsNode, SemanticsNode semanticsNode2) {
        return semanticsNode2 == semanticsNode;
    }

    static /* synthetic */ View access$000(AccessibilityBridge accessibilityBridge) {
        return accessibilityBridge.rootAccessibilityView;
    }

    static /* synthetic */ void access$100(AccessibilityBridge accessibilityBridge, int n2, int n3) {
        accessibilityBridge.sendAccessibilityEvent(n2, n3);
    }

    static /* synthetic */ AccessibilityEvent access$200(AccessibilityBridge accessibilityBridge, int n2, int n3) {
        return accessibilityBridge.obtainAccessibilityEvent(n2, n3);
    }

    static /* synthetic */ void access$300(AccessibilityBridge accessibilityBridge, AccessibilityEvent accessibilityEvent) {
        accessibilityBridge.sendAccessibilityEvent(accessibilityEvent);
    }

    private AccessibilityEvent createTextChangedEvent(int n2, String string2, String string3) {
        int n3;
        int n4;
        AccessibilityEvent accessibilityEvent = AccessibilityBridge.super.obtainAccessibilityEvent(n2, 16);
        accessibilityEvent.setBeforeText((CharSequence)string2);
        accessibilityEvent.getText().add((Object)string3);
        for (n4 = 0; n4 < string2.length() && n4 < string3.length() && string2.charAt(n4) == string3.charAt(n4); ++n4) {
        }
        if (n4 >= string2.length() && n4 >= string3.length()) {
            return null;
        }
        accessibilityEvent.setFromIndex(n4);
        int n5 = -1 + string2.length();
        for (n3 = -1 + string3.length(); n5 >= n4 && n3 >= n4 && string2.charAt(n5) == string3.charAt(n3); --n5, --n3) {
        }
        accessibilityEvent.setRemovedCount(1 + (n5 - n4));
        accessibilityEvent.setAddedCount(1 + (n3 - n4));
        return accessibilityEvent;
    }

    private CustomAccessibilityAction getOrCreateAccessibilityAction(int n2) {
        CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction)this.customAccessibilityActions.get((Object)n2);
        if (customAccessibilityAction == null) {
            customAccessibilityAction = new CustomAccessibilityAction();
            customAccessibilityAction.id = n2;
            customAccessibilityAction.resourceId = n2 + AccessibilityBridge.FIRST_RESOURCE_ID;
            this.customAccessibilityActions.put((Object)n2, (Object)customAccessibilityAction);
        }
        return customAccessibilityAction;
    }

    private SemanticsNode getOrCreateSemanticsNode(int n2) {
        SemanticsNode semanticsNode = (SemanticsNode)this.flutterSemanticsTree.get((Object)n2);
        if (semanticsNode == null) {
            semanticsNode = new SemanticsNode((AccessibilityBridge)this);
            semanticsNode.id = n2;
            this.flutterSemanticsTree.put((Object)n2, (Object)semanticsNode);
        }
        return semanticsNode;
    }

    private SemanticsNode getRootSemanticsNode() {
        return (SemanticsNode)this.flutterSemanticsTree.get((Object)0);
    }

    private void handleTouchExploration(float f2, float f3) {
        if (this.flutterSemanticsTree.isEmpty()) {
            return;
        }
        SemanticsNode semanticsNode = AccessibilityBridge.super.getRootSemanticsNode().hitTest(new float[]{f2, f3, 0.0f, 1.0f});
        if (semanticsNode != this.hoveredObject) {
            SemanticsNode semanticsNode2;
            if (semanticsNode != null) {
                AccessibilityBridge.super.sendAccessibilityEvent(semanticsNode.id, 128);
            }
            if ((semanticsNode2 = this.hoveredObject) != null) {
                AccessibilityBridge.super.sendAccessibilityEvent(semanticsNode2.id, 256);
            }
            this.hoveredObject = semanticsNode;
        }
    }

    private AccessibilityEvent obtainAccessibilityEvent(int n2, int n3) {
        AccessibilityEvent accessibilityEvent = AccessibilityEvent.obtain((int)n3);
        accessibilityEvent.setPackageName((CharSequence)this.rootAccessibilityView.getContext().getPackageName());
        accessibilityEvent.setSource(this.rootAccessibilityView, n2);
        return accessibilityEvent;
    }

    private void onTouchExplorationExit() {
        SemanticsNode semanticsNode = this.hoveredObject;
        if (semanticsNode != null) {
            this.sendAccessibilityEvent(semanticsNode.id, 256);
            this.hoveredObject = null;
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    @TargetApi(value=18)
    private boolean performCursorMoveAction(SemanticsNode semanticsNode, int n2, Bundle bundle, boolean bl) {
        AccessibilityChannel accessibilityChannel;
        Action action;
        int n3 = bundle.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT");
        boolean bl2 = bundle.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN");
        if (n3 != 1) {
            if (n3 != 2) {
                return false;
            }
            if (bl && semanticsNode.hasAction(Action.MOVE_CURSOR_FORWARD_BY_WORD)) {
                accessibilityChannel = this.accessibilityChannel;
                action = Action.MOVE_CURSOR_FORWARD_BY_WORD;
            } else {
                if (bl) return false;
                if (!semanticsNode.hasAction(Action.MOVE_CURSOR_BACKWARD_BY_WORD)) return false;
                accessibilityChannel = this.accessibilityChannel;
                action = Action.MOVE_CURSOR_BACKWARD_BY_WORD;
            }
        } else if (bl && semanticsNode.hasAction(Action.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
            accessibilityChannel = this.accessibilityChannel;
            action = Action.MOVE_CURSOR_FORWARD_BY_CHARACTER;
        } else {
            if (bl) return false;
            if (!semanticsNode.hasAction(Action.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) return false;
            accessibilityChannel = this.accessibilityChannel;
            action = Action.MOVE_CURSOR_BACKWARD_BY_CHARACTER;
        }
        accessibilityChannel.dispatchSemanticsAction(n2, action, bl2);
        return true;
    }

    private void sendAccessibilityEvent(int n2, int n3) {
        if (!this.accessibilityManager.isEnabled()) {
            return;
        }
        AccessibilityBridge.super.sendAccessibilityEvent(AccessibilityBridge.super.obtainAccessibilityEvent(n2, n3));
    }

    private void sendAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        if (!this.accessibilityManager.isEnabled()) {
            return;
        }
        this.rootAccessibilityView.getParent().requestSendAccessibilityEvent(this.rootAccessibilityView, accessibilityEvent);
    }

    private void sendLatestAccessibilityFlagsToFlutter() {
        this.accessibilityChannel.setAccessibilityFeatures(this.accessibilityFeatureFlags);
    }

    private void sendWindowChangeEvent(SemanticsNode semanticsNode) {
        AccessibilityEvent accessibilityEvent = AccessibilityBridge.super.obtainAccessibilityEvent(semanticsNode.id, 32);
        String string2 = semanticsNode.getRouteName();
        accessibilityEvent.getText().add((Object)string2);
        AccessibilityBridge.super.sendAccessibilityEvent(accessibilityEvent);
    }

    private void sendWindowContentChangeEvent(int n2) {
        AccessibilityEvent accessibilityEvent = AccessibilityBridge.super.obtainAccessibilityEvent(n2, 2048);
        if (Build.VERSION.SDK_INT >= 19) {
            accessibilityEvent.setContentChangeTypes(1);
        }
        AccessibilityBridge.super.sendAccessibilityEvent(accessibilityEvent);
    }

    private boolean shouldSetCollectionInfo(SemanticsNode semanticsNode) {
        return semanticsNode.scrollChildren > 0 && (SemanticsNode.nullableHasAncestor(this.accessibilityFocusedSemanticsNode, new a(semanticsNode)) || !SemanticsNode.nullableHasAncestor(this.accessibilityFocusedSemanticsNode, b.a));
    }

    private void willRemoveSemanticsNode(SemanticsNode semanticsNode) {
        semanticsNode.parent = null;
        SemanticsNode semanticsNode2 = this.accessibilityFocusedSemanticsNode;
        if (semanticsNode2 == semanticsNode) {
            AccessibilityBridge.super.sendAccessibilityEvent(semanticsNode2.id, 65536);
            this.accessibilityFocusedSemanticsNode = null;
        }
        if (this.inputFocusedSemanticsNode == semanticsNode) {
            this.inputFocusedSemanticsNode = null;
        }
        if (this.hoveredObject == semanticsNode) {
            this.hoveredObject = null;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    @SuppressLint(value={"NewApi"})
    public AccessibilityNodeInfo createAccessibilityNodeInfo(int var1) {
        block61 : {
            block60 : {
                block56 : {
                    block57 : {
                        block58 : {
                            block59 : {
                                if (var1 >= 65536) {
                                    return this.accessibilityViewEmbedder.createAccessibilityNodeInfo(var1);
                                }
                                if (var1 == -1) {
                                    var31_2 = AccessibilityNodeInfo.obtain((View)this.rootAccessibilityView);
                                    this.rootAccessibilityView.onInitializeAccessibilityNodeInfo(var31_2);
                                    if (this.flutterSemanticsTree.containsKey((Object)0) == false) return var31_2;
                                    var31_2.addChild(this.rootAccessibilityView, 0);
                                    return var31_2;
                                }
                                var2_3 = (SemanticsNode)this.flutterSemanticsTree.get((Object)var1);
                                if (var2_3 == null) {
                                    return null;
                                }
                                if (SemanticsNode.access$1400(var2_3) != -1) {
                                    var29_4 = this.platformViewsAccessibilityDelegate.getPlatformViewById(SemanticsNode.access$1400(var2_3));
                                    var30_5 = SemanticsNode.access$1500(var2_3);
                                    return this.accessibilityViewEmbedder.getRootNode(var29_4, SemanticsNode.access$1600(var2_3), var30_5);
                                }
                                var3_6 = AccessibilityNodeInfo.obtain((View)this.rootAccessibilityView, (int)var1);
                                if (Build.VERSION.SDK_INT >= 18) {
                                    var3_6.setViewIdResourceName("");
                                }
                                var3_6.setPackageName((CharSequence)this.rootAccessibilityView.getContext().getPackageName());
                                var3_6.setClassName((CharSequence)"android.view.View");
                                var3_6.setSource(this.rootAccessibilityView, var1);
                                var3_6.setFocusable(SemanticsNode.access$1700(var2_3));
                                var4_7 = this.inputFocusedSemanticsNode;
                                if (var4_7 != null) {
                                    var28_8 = SemanticsNode.access$1600(var4_7) == var1;
                                    var3_6.setFocused(var28_8);
                                }
                                if ((var5_9 = this.accessibilityFocusedSemanticsNode) != null) {
                                    var27_10 = SemanticsNode.access$1600(var5_9) == var1;
                                    var3_6.setAccessibilityFocused(var27_10);
                                }
                                if (SemanticsNode.access$1800(var2_3, Flag.IS_TEXT_FIELD)) {
                                    var3_6.setPassword(SemanticsNode.access$1800(var2_3, Flag.IS_OBSCURED));
                                    if (!SemanticsNode.access$1800(var2_3, Flag.IS_READ_ONLY)) {
                                        var3_6.setClassName((CharSequence)"android.widget.EditText");
                                    }
                                    if (Build.VERSION.SDK_INT >= 18) {
                                        var3_6.setEditable(true ^ SemanticsNode.access$1800(var2_3, Flag.IS_READ_ONLY));
                                        if (SemanticsNode.access$1900(var2_3) != -1 && SemanticsNode.access$2000(var2_3) != -1) {
                                            var3_6.setTextSelection(SemanticsNode.access$1900(var2_3), SemanticsNode.access$2000(var2_3));
                                        }
                                        if (Build.VERSION.SDK_INT > 18 && (var26_11 = this.accessibilityFocusedSemanticsNode) != null && SemanticsNode.access$1600(var26_11) == var1) {
                                            var3_6.setLiveRegion(1);
                                        }
                                    }
                                    if (SemanticsNode.access$2100(var2_3, Action.MOVE_CURSOR_FORWARD_BY_CHARACTER)) {
                                        var3_6.addAction(256);
                                        var22_12 = 1;
                                    } else {
                                        var22_12 = 0;
                                    }
                                    if (SemanticsNode.access$2100(var2_3, Action.MOVE_CURSOR_BACKWARD_BY_CHARACTER)) {
                                        var3_6.addAction(512);
                                        var22_12 |= true;
                                    }
                                    if (SemanticsNode.access$2100(var2_3, Action.MOVE_CURSOR_FORWARD_BY_WORD)) {
                                        var3_6.addAction(256);
                                        var22_12 |= 2;
                                    }
                                    if (SemanticsNode.access$2100(var2_3, Action.MOVE_CURSOR_BACKWARD_BY_WORD)) {
                                        var3_6.addAction(512);
                                        var22_12 |= 2;
                                    }
                                    var3_6.setMovementGranularities(var22_12);
                                    if (Build.VERSION.SDK_INT >= 21 && SemanticsNode.access$2200(var2_3) >= 0) {
                                        var23_13 = SemanticsNode.access$2300(var2_3) == null ? 0 : SemanticsNode.access$2300(var2_3).length();
                                        SemanticsNode.access$2400(var2_3);
                                        SemanticsNode.access$2200(var2_3);
                                        var3_6.setMaxTextLength(var23_13 - SemanticsNode.access$2400(var2_3) + SemanticsNode.access$2200(var2_3));
                                    }
                                }
                                if (Build.VERSION.SDK_INT > 18) {
                                    if (SemanticsNode.access$2100(var2_3, Action.SET_SELECTION)) {
                                        var3_6.addAction(131072);
                                    }
                                    if (SemanticsNode.access$2100(var2_3, Action.COPY)) {
                                        var3_6.addAction(16384);
                                    }
                                    if (SemanticsNode.access$2100(var2_3, Action.CUT)) {
                                        var3_6.addAction(65536);
                                    }
                                    if (SemanticsNode.access$2100(var2_3, Action.PASTE)) {
                                        var3_6.addAction(32768);
                                    }
                                }
                                if (SemanticsNode.access$1800(var2_3, Flag.IS_BUTTON) || SemanticsNode.access$1800(var2_3, Flag.IS_LINK)) {
                                    var3_6.setClassName((CharSequence)"android.widget.Button");
                                }
                                if (SemanticsNode.access$1800(var2_3, Flag.IS_IMAGE)) {
                                    var3_6.setClassName((CharSequence)"android.widget.ImageView");
                                }
                                if (Build.VERSION.SDK_INT > 18 && SemanticsNode.access$2100(var2_3, Action.DISMISS)) {
                                    var3_6.setDismissable(true);
                                    var3_6.addAction(1048576);
                                }
                                if (SemanticsNode.access$2500(var2_3) != null) {
                                    var3_6.setParent(this.rootAccessibilityView, SemanticsNode.access$1600(SemanticsNode.access$2500(var2_3)));
                                } else {
                                    var3_6.setParent(this.rootAccessibilityView);
                                }
                                var6_14 = SemanticsNode.access$1500(var2_3);
                                if (SemanticsNode.access$2500(var2_3) != null) {
                                    var20_15 = SemanticsNode.access$1500(SemanticsNode.access$2500(var2_3));
                                    var21_16 = new Rect(var6_14);
                                    var21_16.offset(-var20_15.left, -var20_15.top);
                                    var3_6.setBoundsInParent(var21_16);
                                } else {
                                    var3_6.setBoundsInParent(var6_14);
                                }
                                var3_6.setBoundsInScreen(var6_14);
                                var3_6.setVisibleToUser(true);
                                var7_17 = !SemanticsNode.access$1800(var2_3, Flag.HAS_ENABLED_STATE) || SemanticsNode.access$1800(var2_3, Flag.IS_ENABLED);
                                var3_6.setEnabled(var7_17);
                                if (SemanticsNode.access$2100(var2_3, Action.TAP)) {
                                    if (Build.VERSION.SDK_INT >= 21 && SemanticsNode.access$2600(var2_3) != null) {
                                        var3_6.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, (CharSequence)CustomAccessibilityAction.access$2700(SemanticsNode.access$2600(var2_3))));
                                    } else {
                                        var3_6.addAction(16);
                                    }
                                    var3_6.setClickable(true);
                                }
                                if (SemanticsNode.access$2100(var2_3, Action.LONG_PRESS)) {
                                    if (Build.VERSION.SDK_INT >= 21 && SemanticsNode.access$2800(var2_3) != null) {
                                        var3_6.addAction(new AccessibilityNodeInfo.AccessibilityAction(32, (CharSequence)CustomAccessibilityAction.access$2700(SemanticsNode.access$2800(var2_3))));
                                    } else {
                                        var3_6.addAction(32);
                                    }
                                    var3_6.setLongClickable(true);
                                }
                                if (!SemanticsNode.access$2100(var2_3, Action.SCROLL_LEFT) && !SemanticsNode.access$2100(var2_3, Action.SCROLL_UP) && !SemanticsNode.access$2100(var2_3, Action.SCROLL_RIGHT) && !SemanticsNode.access$2100(var2_3, Action.SCROLL_DOWN)) break block56;
                                var3_6.setScrollable(true);
                                if (!SemanticsNode.access$1800(var2_3, Flag.HAS_IMPLICIT_SCROLLING)) break block57;
                                if (SemanticsNode.access$2100(var2_3, Action.SCROLL_LEFT) || SemanticsNode.access$2100(var2_3, Action.SCROLL_RIGHT)) break block58;
                                if (Build.VERSION.SDK_INT <= 18 || !AccessibilityBridge.super.shouldSetCollectionInfo(var2_3)) break block59;
                                var19_18 = AccessibilityNodeInfo.CollectionInfo.obtain((int)SemanticsNode.access$1200(var2_3), (int)0, (boolean)false);
                                ** GOTO lbl117
                            }
                            var18_19 = "android.widget.ScrollView";
                            ** GOTO lbl120
                        }
                        if (Build.VERSION.SDK_INT > 19 && AccessibilityBridge.super.shouldSetCollectionInfo(var2_3)) {
                            var19_18 = AccessibilityNodeInfo.CollectionInfo.obtain((int)0, (int)SemanticsNode.access$1200(var2_3), (boolean)false);
lbl117: // 2 sources:
                            var3_6.setCollectionInfo(var19_18);
                        } else {
                            var18_19 = "android.widget.HorizontalScrollView";
lbl120: // 2 sources:
                            var3_6.setClassName((CharSequence)var18_19);
                        }
                    }
                    if (SemanticsNode.access$2100(var2_3, Action.SCROLL_LEFT) || SemanticsNode.access$2100(var2_3, Action.SCROLL_UP)) {
                        var3_6.addAction(4096);
                    }
                    if (SemanticsNode.access$2100(var2_3, Action.SCROLL_RIGHT) || SemanticsNode.access$2100(var2_3, Action.SCROLL_DOWN)) {
                        var3_6.addAction(8192);
                    }
                }
                if (SemanticsNode.access$2100(var2_3, Action.INCREASE) || SemanticsNode.access$2100(var2_3, Action.DECREASE)) {
                    var3_6.setClassName((CharSequence)"android.widget.SeekBar");
                    if (SemanticsNode.access$2100(var2_3, Action.INCREASE)) {
                        var3_6.addAction(4096);
                    }
                    if (SemanticsNode.access$2100(var2_3, Action.DECREASE)) {
                        var3_6.addAction(8192);
                    }
                }
                if (SemanticsNode.access$1800(var2_3, Flag.IS_LIVE_REGION) && Build.VERSION.SDK_INT > 18) {
                    var3_6.setLiveRegion(1);
                }
                var8_20 = SemanticsNode.access$1800(var2_3, Flag.HAS_CHECKED_STATE);
                var9_21 = SemanticsNode.access$1800(var2_3, Flag.HAS_TOGGLED_STATE);
                if (var8_20) break block60;
                var10_22 = false;
                if (!var9_21) break block61;
            }
            var10_22 = true;
        }
        var3_6.setCheckable(var10_22);
        if (var8_20) {
            var3_6.setChecked(SemanticsNode.access$1800(var2_3, Flag.IS_CHECKED));
            var3_6.setContentDescription((CharSequence)SemanticsNode.access$2900(var2_3));
            var17_23 = SemanticsNode.access$1800(var2_3, Flag.IS_IN_MUTUALLY_EXCLUSIVE_GROUP) != false ? "android.widget.RadioButton" : "android.widget.CheckBox";
            var3_6.setClassName((CharSequence)var17_23);
        } else if (var9_21) {
            var3_6.setChecked(SemanticsNode.access$1800(var2_3, Flag.IS_TOGGLED));
            var3_6.setClassName((CharSequence)"android.widget.Switch");
            var3_6.setContentDescription((CharSequence)SemanticsNode.access$2900(var2_3));
        } else if (!SemanticsNode.access$1800(var2_3, Flag.SCOPES_ROUTE)) {
            var3_6.setText((CharSequence)SemanticsNode.access$2900(var2_3));
        }
        var3_6.setSelected(SemanticsNode.access$1800(var2_3, Flag.IS_SELECTED));
        if (Build.VERSION.SDK_INT >= 28) {
            var3_6.setHeading(SemanticsNode.access$1800(var2_3, Flag.IS_HEADER));
        }
        var12_25 = (var11_24 = this.accessibilityFocusedSemanticsNode) != null && SemanticsNode.access$1600(var11_24) == var1 ? 128 : 64;
        var3_6.addAction(var12_25);
        if (Build.VERSION.SDK_INT >= 21 && SemanticsNode.access$3000(var2_3) != null) {
            for (CustomAccessibilityAction var16_27 : SemanticsNode.access$3000(var2_3)) {
                var3_6.addAction(new AccessibilityNodeInfo.AccessibilityAction(CustomAccessibilityAction.access$3100(var16_27), (CharSequence)CustomAccessibilityAction.access$3200(var16_27)));
            }
        }
        var13_28 = SemanticsNode.access$3300(var2_3).iterator();
        while (var13_28.hasNext() != false) {
            var14_29 = (SemanticsNode)var13_28.next();
            if (SemanticsNode.access$1800(var14_29, Flag.IS_HIDDEN)) continue;
            var3_6.addChild(this.rootAccessibilityView, SemanticsNode.access$1600(var14_29));
        }
        return var3_6;
    }

    public boolean externalViewRequestSendAccessibilityEvent(View view, View view2, AccessibilityEvent accessibilityEvent) {
        if (!this.accessibilityViewEmbedder.requestSendAccessibilityEvent(view, view2, accessibilityEvent)) {
            return false;
        }
        Integer n2 = this.accessibilityViewEmbedder.getRecordFlutterId(view, (AccessibilityRecord)accessibilityEvent);
        if (n2 == null) {
            return false;
        }
        int n3 = accessibilityEvent.getEventType();
        if (n3 != 8) {
            if (n3 != 128) {
                if (n3 != 32768) {
                    if (n3 == 65536) {
                        this.embeddedInputFocusedNodeId = null;
                        this.embeddedAccessibilityFocusedNodeId = null;
                    }
                } else {
                    this.embeddedAccessibilityFocusedNodeId = n2;
                    this.accessibilityFocusedSemanticsNode = null;
                }
            } else {
                this.hoveredObject = null;
            }
        } else {
            this.embeddedInputFocusedNodeId = n2;
            this.inputFocusedSemanticsNode = null;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public AccessibilityNodeInfo findFocus(int n2) {
        Integer n3;
        int n4;
        block8 : {
            block9 : {
                SemanticsNode semanticsNode;
                block7 : {
                    block6 : {
                        block5 : {
                            if (n2 == 1) break block5;
                            if (n2 != 2) {
                                return null;
                            }
                            break block6;
                        }
                        semanticsNode = this.inputFocusedSemanticsNode;
                        if (semanticsNode != null) break block7;
                        n3 = this.embeddedInputFocusedNodeId;
                        if (n3 != null) break block8;
                    }
                    if ((semanticsNode = this.accessibilityFocusedSemanticsNode) == null) break block9;
                }
                n4 = semanticsNode.id;
                return this.createAccessibilityNodeInfo(n4);
            }
            n3 = this.embeddedAccessibilityFocusedNodeId;
            if (n3 == null) return null;
        }
        n4 = n3;
        return this.createAccessibilityNodeInfo(n4);
    }

    public boolean isAccessibilityEnabled() {
        return this.accessibilityManager.isEnabled();
    }

    public boolean isTouchExplorationEnabled() {
        return this.accessibilityManager.isTouchExplorationEnabled();
    }

    public boolean onAccessibilityHoverEvent(MotionEvent motionEvent) {
        if (!this.accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        if (this.flutterSemanticsTree.isEmpty()) {
            return false;
        }
        SemanticsNode semanticsNode = AccessibilityBridge.super.getRootSemanticsNode();
        float[] arrf = new float[]{motionEvent.getX(), motionEvent.getY(), 0.0f, 1.0f};
        SemanticsNode semanticsNode2 = semanticsNode.hitTest(arrf);
        if (semanticsNode2.platformViewId != -1) {
            return this.accessibilityViewEmbedder.onAccessibilityHoverEvent(semanticsNode2.id, motionEvent);
        }
        if (motionEvent.getAction() != 9 && motionEvent.getAction() != 7) {
            if (motionEvent.getAction() == 10) {
                AccessibilityBridge.super.onTouchExplorationExit();
                return true;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("unexpected accessibility hover event: ");
            stringBuilder.append((Object)motionEvent);
            Log.d((String)"flutter", (String)stringBuilder.toString());
            return false;
        }
        AccessibilityBridge.super.handleTouchExploration(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean performAction(int n2, int n3, Bundle bundle) {
        if (n2 >= 65536) {
            boolean bl = this.accessibilityViewEmbedder.performAction(n2, n3, bundle);
            if (bl && n3 == 128) {
                this.embeddedAccessibilityFocusedNodeId = null;
            }
            return bl;
        }
        SemanticsNode semanticsNode = (SemanticsNode)this.flutterSemanticsTree.get((Object)n2);
        if (semanticsNode == null) {
            return false;
        }
        switch (n3) {
            default: {
                int n4 = n3 - FIRST_RESOURCE_ID;
                CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction)this.customAccessibilityActions.get((Object)n4);
                if (customAccessibilityAction == null) break;
                this.accessibilityChannel.dispatchSemanticsAction(n2, Action.CUSTOM_ACTION, customAccessibilityAction.id);
                return true;
            }
            case 16908342: {
                this.accessibilityChannel.dispatchSemanticsAction(n2, Action.SHOW_ON_SCREEN);
                return true;
            }
            case 1048576: {
                this.accessibilityChannel.dispatchSemanticsAction(n2, Action.DISMISS);
                return true;
            }
            case 131072: {
                int n5;
                if (Build.VERSION.SDK_INT < 18) {
                    return false;
                }
                HashMap hashMap = new HashMap();
                boolean bl = false;
                if (bundle != null) {
                    boolean bl2 = bundle.containsKey("ACTION_ARGUMENT_SELECTION_START_INT");
                    bl = false;
                    if (bl2) {
                        boolean bl3 = bundle.containsKey("ACTION_ARGUMENT_SELECTION_END_INT");
                        bl = false;
                        if (bl3) {
                            bl = true;
                        }
                    }
                }
                if (bl) {
                    hashMap.put((Object)"base", (Object)bundle.getInt("ACTION_ARGUMENT_SELECTION_START_INT"));
                    n5 = bundle.getInt("ACTION_ARGUMENT_SELECTION_END_INT");
                } else {
                    hashMap.put((Object)"base", (Object)semanticsNode.textSelectionExtent);
                    n5 = semanticsNode.textSelectionExtent;
                }
                hashMap.put((Object)"extent", (Object)n5);
                this.accessibilityChannel.dispatchSemanticsAction(n2, Action.SET_SELECTION, (Object)hashMap);
                return true;
            }
            case 65536: {
                this.accessibilityChannel.dispatchSemanticsAction(n2, Action.CUT);
                return true;
            }
            case 32768: {
                this.accessibilityChannel.dispatchSemanticsAction(n2, Action.PASTE);
                return true;
            }
            case 16384: {
                this.accessibilityChannel.dispatchSemanticsAction(n2, Action.COPY);
                return true;
            }
            case 8192: {
                Action action;
                AccessibilityChannel accessibilityChannel;
                if (semanticsNode.hasAction(Action.SCROLL_DOWN)) {
                    accessibilityChannel = this.accessibilityChannel;
                    action = Action.SCROLL_DOWN;
                } else if (semanticsNode.hasAction(Action.SCROLL_RIGHT)) {
                    accessibilityChannel = this.accessibilityChannel;
                    action = Action.SCROLL_RIGHT;
                } else {
                    if (!semanticsNode.hasAction(Action.DECREASE)) {
                        return false;
                    }
                    semanticsNode.value = semanticsNode.decreasedValue;
                    AccessibilityBridge.super.sendAccessibilityEvent(n2, 4);
                    accessibilityChannel = this.accessibilityChannel;
                    action = Action.DECREASE;
                }
                accessibilityChannel.dispatchSemanticsAction(n2, action);
                return true;
            }
            case 4096: {
                Action action;
                AccessibilityChannel accessibilityChannel;
                if (semanticsNode.hasAction(Action.SCROLL_UP)) {
                    accessibilityChannel = this.accessibilityChannel;
                    action = Action.SCROLL_UP;
                } else if (semanticsNode.hasAction(Action.SCROLL_LEFT)) {
                    accessibilityChannel = this.accessibilityChannel;
                    action = Action.SCROLL_LEFT;
                } else {
                    if (!semanticsNode.hasAction(Action.INCREASE)) {
                        return false;
                    }
                    semanticsNode.value = semanticsNode.increasedValue;
                    AccessibilityBridge.super.sendAccessibilityEvent(n2, 4);
                    accessibilityChannel = this.accessibilityChannel;
                    action = Action.INCREASE;
                }
                accessibilityChannel.dispatchSemanticsAction(n2, action);
                return true;
            }
            case 512: {
                if (Build.VERSION.SDK_INT < 18) {
                    return false;
                }
                return AccessibilityBridge.super.performCursorMoveAction(semanticsNode, n2, bundle, false);
            }
            case 256: {
                if (Build.VERSION.SDK_INT < 18) {
                    return false;
                }
                return AccessibilityBridge.super.performCursorMoveAction(semanticsNode, n2, bundle, true);
            }
            case 128: {
                this.accessibilityChannel.dispatchSemanticsAction(n2, Action.DID_LOSE_ACCESSIBILITY_FOCUS);
                AccessibilityBridge.super.sendAccessibilityEvent(n2, 65536);
                this.accessibilityFocusedSemanticsNode = null;
                this.embeddedAccessibilityFocusedNodeId = null;
                return true;
            }
            case 64: {
                this.accessibilityChannel.dispatchSemanticsAction(n2, Action.DID_GAIN_ACCESSIBILITY_FOCUS);
                AccessibilityBridge.super.sendAccessibilityEvent(n2, 32768);
                if (this.accessibilityFocusedSemanticsNode == null) {
                    this.rootAccessibilityView.invalidate();
                }
                this.accessibilityFocusedSemanticsNode = semanticsNode;
                if (semanticsNode.hasAction(Action.INCREASE) || semanticsNode.hasAction(Action.DECREASE)) {
                    AccessibilityBridge.super.sendAccessibilityEvent(n2, 4);
                }
                return true;
            }
            case 32: {
                this.accessibilityChannel.dispatchSemanticsAction(n2, Action.LONG_PRESS);
                return true;
            }
            case 16: {
                this.accessibilityChannel.dispatchSemanticsAction(n2, Action.TAP);
                return true;
            }
        }
        return false;
    }

    public void release() {
        PlatformViewsAccessibilityDelegate platformViewsAccessibilityDelegate = this.platformViewsAccessibilityDelegate;
        if (platformViewsAccessibilityDelegate != null) {
            platformViewsAccessibilityDelegate.detachAccessibiltyBridge();
        }
        this.setOnAccessibilityChangeListener(null);
        this.accessibilityManager.removeAccessibilityStateChangeListener(this.accessibilityStateChangeListener);
        if (Build.VERSION.SDK_INT >= 19) {
            this.accessibilityManager.removeTouchExplorationStateChangeListener(this.touchExplorationStateChangeListener);
        }
        this.contentResolver.unregisterContentObserver(this.animationScaleObserver);
    }

    public void reset() {
        this.flutterSemanticsTree.clear();
        SemanticsNode semanticsNode = this.accessibilityFocusedSemanticsNode;
        if (semanticsNode != null) {
            this.sendAccessibilityEvent(semanticsNode.id, 65536);
        }
        this.accessibilityFocusedSemanticsNode = null;
        this.hoveredObject = null;
        this.sendWindowContentChangeEvent(0);
    }

    public void setOnAccessibilityChangeListener(OnAccessibilityChangeListener onAccessibilityChangeListener) {
        this.onAccessibilityChangeListener = onAccessibilityChangeListener;
    }

    void updateCustomAccessibilityActions(ByteBuffer byteBuffer, String[] arrstring) {
        while (byteBuffer.hasRemaining()) {
            CustomAccessibilityAction customAccessibilityAction = AccessibilityBridge.super.getOrCreateAccessibilityAction(byteBuffer.getInt());
            customAccessibilityAction.overrideId = byteBuffer.getInt();
            int n2 = byteBuffer.getInt();
            String string2 = n2 == -1 ? null : arrstring[n2];
            customAccessibilityAction.label = string2;
            int n3 = byteBuffer.getInt();
            String string3 = n3 == -1 ? null : arrstring[n3];
            customAccessibilityAction.hint = string3;
        }
    }

    void updateSemantics(ByteBuffer byteBuffer, String[] arrstring) {
        ArrayList arrayList = new ArrayList();
        while (byteBuffer.hasRemaining()) {
            SemanticsNode semanticsNode = AccessibilityBridge.super.getOrCreateSemanticsNode(byteBuffer.getInt());
            semanticsNode.updateWith(byteBuffer, arrstring);
            if (semanticsNode.hasFlag(Flag.IS_HIDDEN)) continue;
            if (semanticsNode.hasFlag(Flag.IS_FOCUSED)) {
                this.inputFocusedSemanticsNode = semanticsNode;
            }
            if (!semanticsNode.hadPreviousConfig) continue;
            arrayList.add((Object)semanticsNode);
        }
        HashSet hashSet = new HashSet();
        SemanticsNode semanticsNode = AccessibilityBridge.super.getRootSemanticsNode();
        ArrayList arrayList2 = new ArrayList();
        if (semanticsNode != null) {
            WindowInsets windowInsets;
            float[] arrf = new float[16];
            Matrix.setIdentityM((float[])arrf, (int)0);
            if (Build.VERSION.SDK_INT >= 23 && (windowInsets = this.rootAccessibilityView.getRootWindowInsets()) != null) {
                if (!this.lastLeftFrameInset.equals((Object)windowInsets.getSystemWindowInsetLeft())) {
                    semanticsNode.globalGeometryDirty = true;
                    semanticsNode.inverseTransformDirty = true;
                }
                this.lastLeftFrameInset = windowInsets.getSystemWindowInsetLeft();
                Matrix.translateM((float[])arrf, (int)0, (float)this.lastLeftFrameInset.intValue(), (float)0.0f, (float)0.0f);
            }
            semanticsNode.updateRecursively(arrf, (Set<SemanticsNode>)((Set)hashSet), false);
            semanticsNode.collectRoutes((List<SemanticsNode>)((List)arrayList2));
        }
        Iterator iterator = arrayList2.iterator();
        SemanticsNode semanticsNode2 = null;
        while (iterator.hasNext()) {
            SemanticsNode semanticsNode3 = (SemanticsNode)iterator.next();
            if (this.flutterNavigationStack.contains((Object)semanticsNode3.id)) continue;
            semanticsNode2 = semanticsNode3;
        }
        if (semanticsNode2 == null && arrayList2.size() > 0) {
            semanticsNode2 = (SemanticsNode)arrayList2.get(arrayList2.size() - 1);
        }
        if (semanticsNode2 != null && semanticsNode2.id != this.previousRouteId) {
            this.previousRouteId = semanticsNode2.id;
            AccessibilityBridge.super.sendWindowChangeEvent(semanticsNode2);
        }
        this.flutterNavigationStack.clear();
        for (SemanticsNode semanticsNode4 : arrayList2) {
            this.flutterNavigationStack.add((Object)semanticsNode4.id);
        }
        Iterator iterator2 = this.flutterSemanticsTree.entrySet().iterator();
        while (iterator2.hasNext()) {
            SemanticsNode semanticsNode5 = (SemanticsNode)((Map.Entry)iterator2.next()).getValue();
            if (hashSet.contains((Object)semanticsNode5)) continue;
            AccessibilityBridge.super.willRemoveSemanticsNode(semanticsNode5);
            iterator2.remove();
        }
        AccessibilityBridge.super.sendWindowContentChangeEvent(0);
        for (SemanticsNode semanticsNode6 : arrayList) {
            SemanticsNode semanticsNode7;
            SemanticsNode semanticsNode8;
            AccessibilityEvent accessibilityEvent;
            SemanticsNode semanticsNode9;
            SemanticsNode semanticsNode10;
            SemanticsNode semanticsNode11;
            if (semanticsNode6.didScroll()) {
                float f2;
                float f3;
                AccessibilityEvent accessibilityEvent2 = AccessibilityBridge.super.obtainAccessibilityEvent(semanticsNode6.id, 4096);
                float f4 = semanticsNode6.scrollPosition;
                float f5 = semanticsNode6.scrollExtentMax;
                if (Float.isInfinite((float)semanticsNode6.scrollExtentMax)) {
                    if (f4 > 70000.0f) {
                        f4 = 70000.0f;
                    }
                    f5 = 100000.0f;
                }
                if (Float.isInfinite((float)semanticsNode6.scrollExtentMin)) {
                    f3 = f5 + 100000.0f;
                    if (f4 < -70000.0f) {
                        f4 = -70000.0f;
                    }
                    f2 = f4 + 100000.0f;
                } else {
                    f3 = f5 - semanticsNode6.scrollExtentMin;
                    f2 = f4 - semanticsNode6.scrollExtentMin;
                }
                if (!semanticsNode6.hadAction(Action.SCROLL_UP) && !semanticsNode6.hadAction(Action.SCROLL_DOWN)) {
                    if (semanticsNode6.hadAction(Action.SCROLL_LEFT) || semanticsNode6.hadAction(Action.SCROLL_RIGHT)) {
                        accessibilityEvent2.setScrollX((int)f2);
                        accessibilityEvent2.setMaxScrollX((int)f3);
                    }
                } else {
                    accessibilityEvent2.setScrollY((int)f2);
                    accessibilityEvent2.setMaxScrollY((int)f3);
                }
                if (semanticsNode6.scrollChildren > 0) {
                    accessibilityEvent2.setItemCount(semanticsNode6.scrollChildren);
                    accessibilityEvent2.setFromIndex(semanticsNode6.scrollIndex);
                    Iterator iterator3 = semanticsNode6.childrenInHitTestOrder.iterator();
                    int n2 = 0;
                    while (iterator3.hasNext()) {
                        if (((SemanticsNode)iterator3.next()).hasFlag(Flag.IS_HIDDEN)) continue;
                        ++n2;
                    }
                    accessibilityEvent2.setToIndex(n2 + semanticsNode6.scrollIndex - 1);
                }
                AccessibilityBridge.super.sendAccessibilityEvent(accessibilityEvent2);
            }
            if (semanticsNode6.hasFlag(Flag.IS_LIVE_REGION) && semanticsNode6.didChangeLabel()) {
                AccessibilityBridge.super.sendWindowContentChangeEvent(semanticsNode6.id);
            }
            if ((semanticsNode11 = this.accessibilityFocusedSemanticsNode) != null && semanticsNode11.id == semanticsNode6.id && !semanticsNode6.hadFlag(Flag.IS_SELECTED) && semanticsNode6.hasFlag(Flag.IS_SELECTED)) {
                AccessibilityEvent accessibilityEvent3 = AccessibilityBridge.super.obtainAccessibilityEvent(semanticsNode6.id, 4);
                accessibilityEvent3.getText().add((Object)semanticsNode6.label);
                AccessibilityBridge.super.sendAccessibilityEvent(accessibilityEvent3);
            }
            if ((semanticsNode10 = this.inputFocusedSemanticsNode) != null && semanticsNode10.id == semanticsNode6.id && ((semanticsNode8 = this.lastInputFocusedSemanticsNode) == null || semanticsNode8.id != this.inputFocusedSemanticsNode.id)) {
                this.lastInputFocusedSemanticsNode = this.inputFocusedSemanticsNode;
                AccessibilityBridge.super.sendAccessibilityEvent(AccessibilityBridge.super.obtainAccessibilityEvent(semanticsNode6.id, 8));
            } else if (this.inputFocusedSemanticsNode == null) {
                this.lastInputFocusedSemanticsNode = null;
            }
            if ((semanticsNode9 = this.inputFocusedSemanticsNode) == null || semanticsNode9.id != semanticsNode6.id || !semanticsNode6.hadFlag(Flag.IS_TEXT_FIELD) || !semanticsNode6.hasFlag(Flag.IS_TEXT_FIELD) || (semanticsNode7 = this.accessibilityFocusedSemanticsNode) != null && semanticsNode7.id != this.inputFocusedSemanticsNode.id) continue;
            String string2 = semanticsNode6.previousValue;
            String string3 = "";
            String string4 = string2 != null ? semanticsNode6.previousValue : string3;
            if (semanticsNode6.value != null) {
                string3 = semanticsNode6.value;
            }
            if ((accessibilityEvent = AccessibilityBridge.super.createTextChangedEvent(semanticsNode6.id, string4, string3)) != null) {
                AccessibilityBridge.super.sendAccessibilityEvent(accessibilityEvent);
            }
            if (semanticsNode6.previousTextSelectionBase == semanticsNode6.textSelectionBase && semanticsNode6.previousTextSelectionExtent == semanticsNode6.textSelectionExtent) continue;
            AccessibilityEvent accessibilityEvent4 = AccessibilityBridge.super.obtainAccessibilityEvent(semanticsNode6.id, 8192);
            accessibilityEvent4.getText().add((Object)string3);
            accessibilityEvent4.setFromIndex(semanticsNode6.textSelectionBase);
            accessibilityEvent4.setToIndex(semanticsNode6.textSelectionExtent);
            accessibilityEvent4.setItemCount(string3.length());
            AccessibilityBridge.super.sendAccessibilityEvent(accessibilityEvent4);
        }
    }

    private static final class AccessibilityFeature
    extends Enum<AccessibilityFeature> {
        private static final /* synthetic */ AccessibilityFeature[] $VALUES;
        public static final /* enum */ AccessibilityFeature ACCESSIBLE_NAVIGATION = new AccessibilityFeature(1);
        public static final /* enum */ AccessibilityFeature DISABLE_ANIMATIONS;
        public static final /* enum */ AccessibilityFeature INVERT_COLORS;
        final int value;

        static {
            INVERT_COLORS = new AccessibilityFeature(2);
            DISABLE_ANIMATIONS = new AccessibilityFeature(4);
            AccessibilityFeature[] arraccessibilityFeature = new AccessibilityFeature[]{ACCESSIBLE_NAVIGATION, INVERT_COLORS, DISABLE_ANIMATIONS};
            $VALUES = arraccessibilityFeature;
        }

        private AccessibilityFeature(int n3) {
            this.value = n3;
        }

        public static AccessibilityFeature valueOf(String string2) {
            return (AccessibilityFeature)Enum.valueOf(AccessibilityFeature.class, (String)string2);
        }

        public static AccessibilityFeature[] values() {
            return (AccessibilityFeature[])$VALUES.clone();
        }
    }

    public static final class Action
    extends Enum<Action> {
        private static final /* synthetic */ Action[] $VALUES;
        public static final /* enum */ Action COPY;
        public static final /* enum */ Action CUSTOM_ACTION;
        public static final /* enum */ Action CUT;
        public static final /* enum */ Action DECREASE;
        public static final /* enum */ Action DID_GAIN_ACCESSIBILITY_FOCUS;
        public static final /* enum */ Action DID_LOSE_ACCESSIBILITY_FOCUS;
        public static final /* enum */ Action DISMISS;
        public static final /* enum */ Action INCREASE;
        public static final /* enum */ Action LONG_PRESS;
        public static final /* enum */ Action MOVE_CURSOR_BACKWARD_BY_CHARACTER;
        public static final /* enum */ Action MOVE_CURSOR_BACKWARD_BY_WORD;
        public static final /* enum */ Action MOVE_CURSOR_FORWARD_BY_CHARACTER;
        public static final /* enum */ Action MOVE_CURSOR_FORWARD_BY_WORD;
        public static final /* enum */ Action PASTE;
        public static final /* enum */ Action SCROLL_DOWN;
        public static final /* enum */ Action SCROLL_LEFT;
        public static final /* enum */ Action SCROLL_RIGHT;
        public static final /* enum */ Action SCROLL_UP;
        public static final /* enum */ Action SET_SELECTION;
        public static final /* enum */ Action SHOW_ON_SCREEN;
        public static final /* enum */ Action TAP;
        public final int value;

        static {
            TAP = new Action(1);
            LONG_PRESS = new Action(2);
            SCROLL_LEFT = new Action(4);
            SCROLL_RIGHT = new Action(8);
            SCROLL_UP = new Action(16);
            SCROLL_DOWN = new Action(32);
            INCREASE = new Action(64);
            DECREASE = new Action(128);
            SHOW_ON_SCREEN = new Action(256);
            MOVE_CURSOR_FORWARD_BY_CHARACTER = new Action(512);
            MOVE_CURSOR_BACKWARD_BY_CHARACTER = new Action(1024);
            SET_SELECTION = new Action(2048);
            COPY = new Action(4096);
            CUT = new Action(8192);
            PASTE = new Action(16384);
            DID_GAIN_ACCESSIBILITY_FOCUS = new Action(32768);
            DID_LOSE_ACCESSIBILITY_FOCUS = new Action(65536);
            CUSTOM_ACTION = new Action(131072);
            DISMISS = new Action(262144);
            MOVE_CURSOR_FORWARD_BY_WORD = new Action(524288);
            MOVE_CURSOR_BACKWARD_BY_WORD = new Action(1048576);
            Action[] arraction = new Action[]{TAP, LONG_PRESS, SCROLL_LEFT, SCROLL_RIGHT, SCROLL_UP, SCROLL_DOWN, INCREASE, DECREASE, SHOW_ON_SCREEN, MOVE_CURSOR_FORWARD_BY_CHARACTER, MOVE_CURSOR_BACKWARD_BY_CHARACTER, SET_SELECTION, COPY, CUT, PASTE, DID_GAIN_ACCESSIBILITY_FOCUS, DID_LOSE_ACCESSIBILITY_FOCUS, CUSTOM_ACTION, DISMISS, MOVE_CURSOR_FORWARD_BY_WORD, MOVE_CURSOR_BACKWARD_BY_WORD};
            $VALUES = arraction;
        }

        private Action(int n3) {
            this.value = n3;
        }

        public static Action valueOf(String string2) {
            return (Action)Enum.valueOf(Action.class, (String)string2);
        }

        public static Action[] values() {
            return (Action[])$VALUES.clone();
        }
    }

    private static class CustomAccessibilityAction {
        private String hint;
        private int id = -1;
        private String label;
        private int overrideId = -1;
        private int resourceId = -1;

        CustomAccessibilityAction() {
        }

        static /* synthetic */ String access$2700(CustomAccessibilityAction customAccessibilityAction) {
            return customAccessibilityAction.hint;
        }

        static /* synthetic */ int access$3100(CustomAccessibilityAction customAccessibilityAction) {
            return customAccessibilityAction.resourceId;
        }

        static /* synthetic */ String access$3200(CustomAccessibilityAction customAccessibilityAction) {
            return customAccessibilityAction.label;
        }
    }

    private static final class Flag
    extends Enum<Flag> {
        private static final /* synthetic */ Flag[] $VALUES;
        public static final /* enum */ Flag HAS_CHECKED_STATE = new Flag(1);
        public static final /* enum */ Flag HAS_ENABLED_STATE;
        public static final /* enum */ Flag HAS_IMPLICIT_SCROLLING;
        public static final /* enum */ Flag HAS_TOGGLED_STATE;
        public static final /* enum */ Flag IS_BUTTON;
        public static final /* enum */ Flag IS_CHECKED;
        public static final /* enum */ Flag IS_ENABLED;
        public static final /* enum */ Flag IS_FOCUSABLE;
        public static final /* enum */ Flag IS_FOCUSED;
        public static final /* enum */ Flag IS_HEADER;
        public static final /* enum */ Flag IS_HIDDEN;
        public static final /* enum */ Flag IS_IMAGE;
        public static final /* enum */ Flag IS_IN_MUTUALLY_EXCLUSIVE_GROUP;
        public static final /* enum */ Flag IS_LINK;
        public static final /* enum */ Flag IS_LIVE_REGION;
        public static final /* enum */ Flag IS_OBSCURED;
        public static final /* enum */ Flag IS_READ_ONLY;
        public static final /* enum */ Flag IS_SELECTED;
        public static final /* enum */ Flag IS_TEXT_FIELD;
        public static final /* enum */ Flag IS_TOGGLED;
        public static final /* enum */ Flag NAMES_ROUTE;
        public static final /* enum */ Flag SCOPES_ROUTE;
        final int value;

        static {
            IS_CHECKED = new Flag(2);
            IS_SELECTED = new Flag(4);
            IS_BUTTON = new Flag(8);
            IS_TEXT_FIELD = new Flag(16);
            IS_FOCUSED = new Flag(32);
            HAS_ENABLED_STATE = new Flag(64);
            IS_ENABLED = new Flag(128);
            IS_IN_MUTUALLY_EXCLUSIVE_GROUP = new Flag(256);
            IS_HEADER = new Flag(512);
            IS_OBSCURED = new Flag(1024);
            SCOPES_ROUTE = new Flag(2048);
            NAMES_ROUTE = new Flag(4096);
            IS_HIDDEN = new Flag(8192);
            IS_IMAGE = new Flag(16384);
            IS_LIVE_REGION = new Flag(32768);
            HAS_TOGGLED_STATE = new Flag(65536);
            IS_TOGGLED = new Flag(131072);
            HAS_IMPLICIT_SCROLLING = new Flag(262144);
            IS_READ_ONLY = new Flag(1048576);
            IS_FOCUSABLE = new Flag(2097152);
            IS_LINK = new Flag(4194304);
            Flag[] arrflag = new Flag[]{HAS_CHECKED_STATE, IS_CHECKED, IS_SELECTED, IS_BUTTON, IS_TEXT_FIELD, IS_FOCUSED, HAS_ENABLED_STATE, IS_ENABLED, IS_IN_MUTUALLY_EXCLUSIVE_GROUP, IS_HEADER, IS_OBSCURED, SCOPES_ROUTE, NAMES_ROUTE, IS_HIDDEN, IS_IMAGE, IS_LIVE_REGION, HAS_TOGGLED_STATE, IS_TOGGLED, HAS_IMPLICIT_SCROLLING, IS_READ_ONLY, IS_FOCUSABLE, IS_LINK};
            $VALUES = arrflag;
        }

        private Flag(int n3) {
            this.value = n3;
        }

        public static Flag valueOf(String string2) {
            return (Flag)Enum.valueOf(Flag.class, (String)string2);
        }

        public static Flag[] values() {
            return (Flag[])$VALUES.clone();
        }
    }

    public static interface OnAccessibilityChangeListener {
        public void onAccessibilityChanged(boolean var1, boolean var2);
    }

    private static class SemanticsNode {
        final AccessibilityBridge accessibilityBridge;
        private int actions;
        private float bottom;
        private List<SemanticsNode> childrenInHitTestOrder = new ArrayList();
        private List<SemanticsNode> childrenInTraversalOrder = new ArrayList();
        private int currentValueLength;
        private List<CustomAccessibilityAction> customAccessibilityActions;
        private String decreasedValue;
        private int flags;
        private boolean globalGeometryDirty = true;
        private Rect globalRect;
        private float[] globalTransform;
        private boolean hadPreviousConfig = false;
        private String hint;
        private int id = -1;
        private String increasedValue;
        private float[] inverseTransform;
        private boolean inverseTransformDirty = true;
        private String label;
        private float left;
        private int maxValueLength;
        private CustomAccessibilityAction onLongPressOverride;
        private CustomAccessibilityAction onTapOverride;
        private SemanticsNode parent;
        private int platformViewId;
        private int previousActions;
        private int previousFlags;
        private String previousLabel;
        private float previousScrollExtentMax;
        private float previousScrollExtentMin;
        private float previousScrollPosition;
        private int previousTextSelectionBase;
        private int previousTextSelectionExtent;
        private String previousValue;
        private float right;
        private int scrollChildren;
        private float scrollExtentMax;
        private float scrollExtentMin;
        private int scrollIndex;
        private float scrollPosition;
        private TextDirection textDirection;
        private int textSelectionBase;
        private int textSelectionExtent;
        private float top;
        private float[] transform;
        private String value;

        SemanticsNode(AccessibilityBridge accessibilityBridge) {
            this.accessibilityBridge = accessibilityBridge;
        }

        static /* synthetic */ Rect access$1500(SemanticsNode semanticsNode) {
            return semanticsNode.getGlobalRect();
        }

        static /* synthetic */ boolean access$1700(SemanticsNode semanticsNode) {
            return semanticsNode.isFocusable();
        }

        static /* synthetic */ int access$2200(SemanticsNode semanticsNode) {
            return semanticsNode.maxValueLength;
        }

        static /* synthetic */ int access$2400(SemanticsNode semanticsNode) {
            return semanticsNode.currentValueLength;
        }

        static /* synthetic */ SemanticsNode access$2500(SemanticsNode semanticsNode) {
            return semanticsNode.parent;
        }

        static /* synthetic */ CustomAccessibilityAction access$2600(SemanticsNode semanticsNode) {
            return semanticsNode.onTapOverride;
        }

        static /* synthetic */ CustomAccessibilityAction access$2800(SemanticsNode semanticsNode) {
            return semanticsNode.onLongPressOverride;
        }

        static /* synthetic */ String access$2900(SemanticsNode semanticsNode) {
            return semanticsNode.getValueLabelHint();
        }

        static /* synthetic */ List access$3000(SemanticsNode semanticsNode) {
            return semanticsNode.customAccessibilityActions;
        }

        static /* synthetic */ List access$3300(SemanticsNode semanticsNode) {
            return semanticsNode.childrenInTraversalOrder;
        }

        private void collectRoutes(List<SemanticsNode> list) {
            if (SemanticsNode.super.hasFlag(Flag.SCOPES_ROUTE)) {
                list.add((Object)this);
            }
            Iterator iterator = this.childrenInTraversalOrder.iterator();
            while (iterator.hasNext()) {
                ((SemanticsNode)iterator.next()).collectRoutes(list);
            }
        }

        private boolean didChangeLabel() {
            boolean bl;
            block5 : {
                block4 : {
                    String string2;
                    if (this.label == null && this.previousLabel == null) {
                        return false;
                    }
                    String string3 = this.label;
                    if (string3 == null || (string2 = this.previousLabel) == null) break block4;
                    boolean bl2 = string3.equals((Object)string2);
                    bl = false;
                    if (bl2) break block5;
                }
                bl = true;
            }
            return bl;
        }

        private boolean didScroll() {
            return !Float.isNaN((float)this.scrollPosition) && !Float.isNaN((float)this.previousScrollPosition) && this.previousScrollPosition != this.scrollPosition;
        }

        private void ensureInverseTransform() {
            if (!this.inverseTransformDirty) {
                return;
            }
            this.inverseTransformDirty = false;
            if (this.inverseTransform == null) {
                this.inverseTransform = new float[16];
            }
            if (!Matrix.invertM((float[])this.inverseTransform, (int)0, (float[])this.transform, (int)0)) {
                Arrays.fill((float[])this.inverseTransform, (float)0.0f);
            }
        }

        private SemanticsNode getAncestor(Predicate<SemanticsNode> predicate) {
            SemanticsNode semanticsNode = this.parent;
            while (semanticsNode != null) {
                if (predicate.test(semanticsNode)) {
                    return semanticsNode;
                }
                semanticsNode = semanticsNode.parent;
            }
            return null;
        }

        private Rect getGlobalRect() {
            return this.globalRect;
        }

        private String getRouteName() {
            String string2;
            if (this.hasFlag(Flag.NAMES_ROUTE) && (string2 = this.label) != null && !string2.isEmpty()) {
                return this.label;
            }
            Iterator iterator = this.childrenInTraversalOrder.iterator();
            while (iterator.hasNext()) {
                String string3 = ((SemanticsNode)iterator.next()).getRouteName();
                if (string3 == null || string3.isEmpty()) continue;
                return string3;
            }
            return null;
        }

        private String getValueLabelHint() {
            StringBuilder stringBuilder = new StringBuilder();
            String[] arrstring = new String[3];
            String string2 = this.value;
            arrstring[0] = string2;
            arrstring[1] = this.label;
            arrstring[2] = this.hint;
            for (String string3 : arrstring) {
                if (string3 == null || string3.length() <= 0) continue;
                if (stringBuilder.length() > 0) {
                    stringBuilder.append(", ");
                }
                stringBuilder.append(string3);
            }
            if (stringBuilder.length() > 0) {
                return stringBuilder.toString();
            }
            return null;
        }

        private boolean hadAction(Action action) {
            return (this.previousActions & action.value) != 0;
        }

        private boolean hadFlag(Flag flag) {
            return (this.previousFlags & flag.value) != 0;
        }

        private boolean hasAction(Action action) {
            return (this.actions & action.value) != 0;
        }

        private boolean hasFlag(Flag flag) {
            return (this.flags & flag.value) != 0;
        }

        private SemanticsNode hitTest(float[] arrf) {
            float f2 = arrf[3];
            float f3 = arrf[0] / f2;
            float f4 = arrf[1] / f2;
            if (!(f3 < this.left || f3 >= this.right || f4 < this.top || f4 >= this.bottom)) {
                float[] arrf2 = new float[4];
                for (SemanticsNode semanticsNode : this.childrenInHitTestOrder) {
                    if (semanticsNode.hasFlag(Flag.IS_HIDDEN)) continue;
                    semanticsNode.ensureInverseTransform();
                    Matrix.multiplyMV((float[])arrf2, (int)0, (float[])semanticsNode.inverseTransform, (int)0, (float[])arrf, (int)0);
                    SemanticsNode semanticsNode2 = semanticsNode.hitTest(arrf2);
                    if (semanticsNode2 == null) continue;
                    return semanticsNode2;
                }
                return this;
            }
            return null;
        }

        private boolean isFocusable() {
            boolean bl;
            block6 : {
                block5 : {
                    String string2;
                    String string3;
                    if (this.hasFlag(Flag.SCOPES_ROUTE)) {
                        return false;
                    }
                    if (this.hasFlag(Flag.IS_FOCUSABLE)) {
                        return true;
                    }
                    int n2 = Action.SCROLL_RIGHT.value | Action.SCROLL_LEFT.value | Action.SCROLL_UP.value | Action.SCROLL_DOWN.value;
                    if ((this.actions & ~n2) != 0 || this.flags != 0 || (string2 = this.label) != null && !string2.isEmpty() || (string3 = this.value) != null && !string3.isEmpty()) break block5;
                    String string4 = this.hint;
                    bl = false;
                    if (string4 == null) break block6;
                    boolean bl2 = string4.isEmpty();
                    bl = false;
                    if (bl2) break block6;
                }
                bl = true;
            }
            return bl;
        }

        private void log(String string2, boolean bl) {
        }

        private float max(float f2, float f3, float f4, float f5) {
            return Math.max((float)f2, (float)Math.max((float)f3, (float)Math.max((float)f4, (float)f5)));
        }

        private float min(float f2, float f3, float f4, float f5) {
            return Math.min((float)f2, (float)Math.min((float)f3, (float)Math.min((float)f4, (float)f5)));
        }

        private static boolean nullableHasAncestor(SemanticsNode semanticsNode, Predicate<SemanticsNode> predicate) {
            return semanticsNode != null && semanticsNode.getAncestor(predicate) != null;
        }

        private void transformPoint(float[] arrf, float[] arrf2, float[] arrf3) {
            Matrix.multiplyMV((float[])arrf, (int)0, (float[])arrf2, (int)0, (float[])arrf3, (int)0);
            float f2 = arrf[3];
            arrf[0] = arrf[0] / f2;
            arrf[1] = arrf[1] / f2;
            arrf[2] = arrf[2] / f2;
            arrf[3] = 0.0f;
        }

        private void updateRecursively(float[] arrf, Set<SemanticsNode> set, boolean bl) {
            set.add((Object)this);
            if (this.globalGeometryDirty) {
                bl = true;
            }
            if (bl) {
                if (this.globalTransform == null) {
                    this.globalTransform = new float[16];
                }
                Matrix.multiplyMM((float[])this.globalTransform, (int)0, (float[])arrf, (int)0, (float[])this.transform, (int)0);
                float[] arrf2 = new float[4];
                arrf2[2] = 0.0f;
                arrf2[3] = 1.0f;
                float[] arrf3 = new float[4];
                float[] arrf4 = new float[4];
                float[] arrf5 = new float[4];
                float[] arrf6 = new float[4];
                arrf2[0] = this.left;
                arrf2[1] = this.top;
                SemanticsNode.super.transformPoint(arrf3, this.globalTransform, arrf2);
                arrf2[0] = this.right;
                arrf2[1] = this.top;
                SemanticsNode.super.transformPoint(arrf4, this.globalTransform, arrf2);
                arrf2[0] = this.right;
                arrf2[1] = this.bottom;
                SemanticsNode.super.transformPoint(arrf5, this.globalTransform, arrf2);
                arrf2[0] = this.left;
                arrf2[1] = this.bottom;
                SemanticsNode.super.transformPoint(arrf6, this.globalTransform, arrf2);
                if (this.globalRect == null) {
                    this.globalRect = new Rect();
                }
                this.globalRect.set(Math.round((float)SemanticsNode.super.min(arrf3[0], arrf4[0], arrf5[0], arrf6[0])), Math.round((float)SemanticsNode.super.min(arrf3[1], arrf4[1], arrf5[1], arrf6[1])), Math.round((float)SemanticsNode.super.max(arrf3[0], arrf4[0], arrf5[0], arrf6[0])), Math.round((float)SemanticsNode.super.max(arrf3[1], arrf4[1], arrf5[1], arrf6[1])));
                this.globalGeometryDirty = false;
            }
            Iterator iterator = this.childrenInTraversalOrder.iterator();
            while (iterator.hasNext()) {
                ((SemanticsNode)iterator.next()).updateRecursively(this.globalTransform, set, bl);
            }
        }

        private void updateWith(ByteBuffer byteBuffer, String[] arrstring) {
            this.hadPreviousConfig = true;
            this.previousValue = this.value;
            this.previousLabel = this.label;
            this.previousFlags = this.flags;
            this.previousActions = this.actions;
            this.previousTextSelectionBase = this.textSelectionBase;
            this.previousTextSelectionExtent = this.textSelectionExtent;
            this.previousScrollPosition = this.scrollPosition;
            this.previousScrollExtentMax = this.scrollExtentMax;
            this.previousScrollExtentMin = this.scrollExtentMin;
            this.flags = byteBuffer.getInt();
            this.actions = byteBuffer.getInt();
            this.maxValueLength = byteBuffer.getInt();
            this.currentValueLength = byteBuffer.getInt();
            this.textSelectionBase = byteBuffer.getInt();
            this.textSelectionExtent = byteBuffer.getInt();
            this.platformViewId = byteBuffer.getInt();
            this.scrollChildren = byteBuffer.getInt();
            this.scrollIndex = byteBuffer.getInt();
            this.scrollPosition = byteBuffer.getFloat();
            this.scrollExtentMax = byteBuffer.getFloat();
            this.scrollExtentMin = byteBuffer.getFloat();
            int n2 = byteBuffer.getInt();
            String string2 = n2 == -1 ? null : arrstring[n2];
            this.label = string2;
            int n3 = byteBuffer.getInt();
            String string3 = n3 == -1 ? null : arrstring[n3];
            this.value = string3;
            int n4 = byteBuffer.getInt();
            String string4 = n4 == -1 ? null : arrstring[n4];
            this.increasedValue = string4;
            int n5 = byteBuffer.getInt();
            String string5 = n5 == -1 ? null : arrstring[n5];
            this.decreasedValue = string5;
            int n6 = byteBuffer.getInt();
            String string6 = n6 == -1 ? null : arrstring[n6];
            this.hint = string6;
            this.textDirection = TextDirection.fromInt(byteBuffer.getInt());
            this.left = byteBuffer.getFloat();
            this.top = byteBuffer.getFloat();
            this.right = byteBuffer.getFloat();
            this.bottom = byteBuffer.getFloat();
            if (this.transform == null) {
                this.transform = new float[16];
            }
            int n7 = 0;
            for (int i2 = 0; i2 < 16; ++i2) {
                this.transform[i2] = byteBuffer.getFloat();
            }
            this.inverseTransformDirty = true;
            this.globalGeometryDirty = true;
            int n8 = byteBuffer.getInt();
            this.childrenInTraversalOrder.clear();
            this.childrenInHitTestOrder.clear();
            for (int i3 = 0; i3 < n8; ++i3) {
                SemanticsNode semanticsNode = this.accessibilityBridge.getOrCreateSemanticsNode(byteBuffer.getInt());
                semanticsNode.parent = this;
                this.childrenInTraversalOrder.add((Object)semanticsNode);
            }
            for (int i4 = 0; i4 < n8; ++i4) {
                SemanticsNode semanticsNode = this.accessibilityBridge.getOrCreateSemanticsNode(byteBuffer.getInt());
                semanticsNode.parent = this;
                this.childrenInHitTestOrder.add((Object)semanticsNode);
            }
            int n9 = byteBuffer.getInt();
            if (n9 == 0) {
                this.customAccessibilityActions = null;
                return;
            }
            List<CustomAccessibilityAction> list = this.customAccessibilityActions;
            if (list == null) {
                this.customAccessibilityActions = new ArrayList(n9);
                n7 = 0;
            } else {
                list.clear();
            }
            while (n7 < n9) {
                CustomAccessibilityAction customAccessibilityAction = this.accessibilityBridge.getOrCreateAccessibilityAction(byteBuffer.getInt());
                if (customAccessibilityAction.overrideId == Action.TAP.value) {
                    this.onTapOverride = customAccessibilityAction;
                } else if (customAccessibilityAction.overrideId == Action.LONG_PRESS.value) {
                    this.onLongPressOverride = customAccessibilityAction;
                } else {
                    this.customAccessibilityActions.add((Object)customAccessibilityAction);
                }
                this.customAccessibilityActions.add((Object)customAccessibilityAction);
                ++n7;
            }
        }
    }

    private static final class TextDirection
    extends Enum<TextDirection> {
        private static final /* synthetic */ TextDirection[] $VALUES;
        public static final /* enum */ TextDirection LTR;
        public static final /* enum */ TextDirection RTL;
        public static final /* enum */ TextDirection UNKNOWN;

        static {
            UNKNOWN = new TextDirection();
            LTR = new TextDirection();
            RTL = new TextDirection();
            TextDirection[] arrtextDirection = new TextDirection[]{UNKNOWN, LTR, RTL};
            $VALUES = arrtextDirection;
        }

        public static TextDirection fromInt(int n2) {
            if (n2 != 1) {
                if (n2 != 2) {
                    return UNKNOWN;
                }
                return LTR;
            }
            return RTL;
        }

        public static TextDirection valueOf(String string2) {
            return (TextDirection)Enum.valueOf(TextDirection.class, (String)string2);
        }

        public static TextDirection[] values() {
            return (TextDirection[])$VALUES.clone();
        }
    }

}

