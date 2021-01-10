/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.ActivityManager
 *  android.app.ActivityManager$TaskDescription
 *  android.content.ClipData
 *  android.content.ClipData$Item
 *  android.content.ClipboardManager
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.Rect
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.Window
 *  java.lang.CharSequence
 *  java.lang.Integer
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.List
 */
package io.flutter.plugin.platform;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.Window;
import io.flutter.embedding.engine.systemchannels.PlatformChannel;
import io.flutter.plugin.platform.PlatformPlugin;
import java.util.ArrayList;
import java.util.List;

public class PlatformPlugin {
    public static final int DEFAULT_SYSTEM_UI = 1280;
    private final Activity activity;
    private PlatformChannel.SystemChromeStyle currentTheme;
    private int mEnabledOverlays;
    private final PlatformChannel.PlatformMessageHandler mPlatformMessageHandler;
    private final PlatformChannel platformChannel;

    public PlatformPlugin(Activity activity, PlatformChannel platformChannel) {
        this.mPlatformMessageHandler = new PlatformChannel.PlatformMessageHandler((PlatformPlugin)this){
            final /* synthetic */ PlatformPlugin this$0;
            {
                this.this$0 = platformPlugin;
            }

            public CharSequence getClipboardData(PlatformChannel.ClipboardContentFormat clipboardContentFormat) {
                return PlatformPlugin.access$700(this.this$0, clipboardContentFormat);
            }

            public List<Rect> getSystemGestureExclusionRects() {
                return PlatformPlugin.access$900(this.this$0);
            }

            public void playSystemSound(PlatformChannel.SoundType soundType) {
                PlatformPlugin.access$000(this.this$0, soundType);
            }

            public void popSystemNavigator() {
                PlatformPlugin.access$600(this.this$0);
            }

            public void restoreSystemUiOverlays() {
                PlatformPlugin.access$400(this.this$0);
            }

            public void setApplicationSwitcherDescription(PlatformChannel.AppSwitcherDescription appSwitcherDescription) {
                PlatformPlugin.access$200(this.this$0, appSwitcherDescription);
            }

            public void setClipboardData(String string2) {
                PlatformPlugin.access$800(this.this$0, string2);
            }

            public void setPreferredOrientations(int n2) {
                PlatformPlugin.access$100(this.this$0, n2);
            }

            public void setSystemGestureExclusionRects(ArrayList<Rect> arrayList) {
                PlatformPlugin.access$1000(this.this$0, arrayList);
            }

            public void setSystemUiOverlayStyle(PlatformChannel.SystemChromeStyle systemChromeStyle) {
                PlatformPlugin.access$500(this.this$0, systemChromeStyle);
            }

            public void showSystemOverlays(List<PlatformChannel.SystemUiOverlay> list) {
                PlatformPlugin.access$300(this.this$0, list);
            }

            public void vibrateHapticFeedback(PlatformChannel.HapticFeedbackType hapticFeedbackType) {
                this.this$0.vibrateHapticFeedback(hapticFeedbackType);
            }
        };
        this.activity = activity;
        this.platformChannel = platformChannel;
        this.platformChannel.setPlatformMessageHandler(this.mPlatformMessageHandler);
        this.mEnabledOverlays = 1280;
    }

    static /* synthetic */ void access$000(PlatformPlugin platformPlugin, PlatformChannel.SoundType soundType) {
        platformPlugin.playSystemSound(soundType);
    }

    static /* synthetic */ void access$100(PlatformPlugin platformPlugin, int n2) {
        platformPlugin.setSystemChromePreferredOrientations(n2);
    }

    static /* synthetic */ void access$1000(PlatformPlugin platformPlugin, ArrayList arrayList) {
        platformPlugin.setSystemGestureExclusionRects((ArrayList<Rect>)arrayList);
    }

    static /* synthetic */ void access$200(PlatformPlugin platformPlugin, PlatformChannel.AppSwitcherDescription appSwitcherDescription) {
        platformPlugin.setSystemChromeApplicationSwitcherDescription(appSwitcherDescription);
    }

    static /* synthetic */ void access$300(PlatformPlugin platformPlugin, List list) {
        platformPlugin.setSystemChromeEnabledSystemUIOverlays((List<PlatformChannel.SystemUiOverlay>)list);
    }

    static /* synthetic */ void access$400(PlatformPlugin platformPlugin) {
        platformPlugin.restoreSystemChromeSystemUIOverlays();
    }

    static /* synthetic */ void access$500(PlatformPlugin platformPlugin, PlatformChannel.SystemChromeStyle systemChromeStyle) {
        platformPlugin.setSystemChromeSystemUIOverlayStyle(systemChromeStyle);
    }

    static /* synthetic */ void access$600(PlatformPlugin platformPlugin) {
        platformPlugin.popSystemNavigator();
    }

    static /* synthetic */ CharSequence access$700(PlatformPlugin platformPlugin, PlatformChannel.ClipboardContentFormat clipboardContentFormat) {
        return platformPlugin.getClipboardData(clipboardContentFormat);
    }

    static /* synthetic */ void access$800(PlatformPlugin platformPlugin, String string2) {
        platformPlugin.setClipboardData(string2);
    }

    static /* synthetic */ List access$900(PlatformPlugin platformPlugin) {
        return platformPlugin.getSystemGestureExclusionRects();
    }

    private CharSequence getClipboardData(PlatformChannel.ClipboardContentFormat clipboardContentFormat) {
        ClipData clipData = ((ClipboardManager)this.activity.getSystemService("clipboard")).getPrimaryClip();
        if (clipData == null) {
            return null;
        }
        if (clipboardContentFormat != null && clipboardContentFormat != PlatformChannel.ClipboardContentFormat.PLAIN_TEXT) {
            return null;
        }
        return clipData.getItemAt(0).coerceToText((Context)this.activity);
    }

    private List<Rect> getSystemGestureExclusionRects() {
        if (Build.VERSION.SDK_INT >= 29) {
            return this.activity.getWindow().getDecorView().getSystemGestureExclusionRects();
        }
        return null;
    }

    private void playSystemSound(PlatformChannel.SoundType soundType) {
        if (soundType == PlatformChannel.SoundType.CLICK) {
            this.activity.getWindow().getDecorView().playSoundEffect(0);
        }
    }

    private void popSystemNavigator() {
        this.activity.finish();
    }

    private void restoreSystemChromeSystemUIOverlays() {
        this.updateSystemUiOverlays();
    }

    private void setClipboardData(String string2) {
        ((ClipboardManager)this.activity.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText((CharSequence)"text label?", (CharSequence)string2));
    }

    private void setSystemChromeApplicationSwitcherDescription(PlatformChannel.AppSwitcherDescription appSwitcherDescription) {
        int n2 = Build.VERSION.SDK_INT;
        if (n2 < 21) {
            return;
        }
        if (n2 < 28 && n2 > 21) {
            this.activity.setTaskDescription(new ActivityManager.TaskDescription(appSwitcherDescription.label, null, appSwitcherDescription.color));
        }
        if (Build.VERSION.SDK_INT >= 28) {
            ActivityManager.TaskDescription taskDescription = new ActivityManager.TaskDescription(appSwitcherDescription.label, 0, appSwitcherDescription.color);
            this.activity.setTaskDescription(taskDescription);
        }
    }

    private void setSystemChromeEnabledSystemUIOverlays(List<PlatformChannel.SystemUiOverlay> list) {
        int n2 = list.size() == 0 && Build.VERSION.SDK_INT >= 19 ? 5894 : 1798;
        for (int i2 = 0; i2 < list.size(); ++i2) {
            PlatformChannel.SystemUiOverlay systemUiOverlay = (PlatformChannel.SystemUiOverlay)((Object)list.get(i2));
            int n3 = 2.$SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$SystemUiOverlay[systemUiOverlay.ordinal()];
            if (n3 != 1) {
                if (n3 != 2) continue;
                n2 = -3 & (n2 & -513);
                continue;
            }
            n2 &= -5;
        }
        this.mEnabledOverlays = n2;
        this.updateSystemUiOverlays();
    }

    private void setSystemChromePreferredOrientations(int n2) {
        this.activity.setRequestedOrientation(n2);
    }

    private void setSystemChromeSystemUIOverlayStyle(PlatformChannel.SystemChromeStyle systemChromeStyle) {
        Window window = this.activity.getWindow();
        View view = window.getDecorView();
        int n2 = view.getSystemUiVisibility();
        if (Build.VERSION.SDK_INT >= 26) {
            Integer n3;
            PlatformChannel.Brightness brightness = systemChromeStyle.systemNavigationBarIconBrightness;
            if (brightness != null) {
                int n4 = 2.$SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$Brightness[brightness.ordinal()];
                if (n4 != 1) {
                    if (n4 == 2) {
                        n2 &= -17;
                    }
                } else {
                    n2 |= 16;
                }
            }
            if ((n3 = systemChromeStyle.systemNavigationBarColor) != null) {
                window.setNavigationBarColor(n3.intValue());
            }
        }
        if (Build.VERSION.SDK_INT >= 23) {
            Integer n5;
            PlatformChannel.Brightness brightness = systemChromeStyle.statusBarIconBrightness;
            if (brightness != null) {
                int n6 = 2.$SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$Brightness[brightness.ordinal()];
                if (n6 != 1) {
                    if (n6 == 2) {
                        n2 &= -8193;
                    }
                } else {
                    n2 |= 8192;
                }
            }
            if ((n5 = systemChromeStyle.statusBarColor) != null) {
                window.setStatusBarColor(n5.intValue());
            }
        }
        view.setSystemUiVisibility(n2);
        this.currentTheme = systemChromeStyle;
    }

    private void setSystemGestureExclusionRects(ArrayList<Rect> arrayList) {
        if (Build.VERSION.SDK_INT < 29) {
            return;
        }
        this.activity.getWindow().getDecorView().setSystemGestureExclusionRects(arrayList);
    }

    public void destroy() {
        this.platformChannel.setPlatformMessageHandler(null);
    }

    public void updateSystemUiOverlays() {
        this.activity.getWindow().getDecorView().setSystemUiVisibility(this.mEnabledOverlays);
        PlatformChannel.SystemChromeStyle systemChromeStyle = this.currentTheme;
        if (systemChromeStyle != null) {
            this.setSystemChromeSystemUIOverlayStyle(systemChromeStyle);
        }
    }

    void vibrateHapticFeedback(PlatformChannel.HapticFeedbackType hapticFeedbackType) {
        block4 : {
            View view;
            int n2;
            block5 : {
                block1 : {
                    int n3;
                    block2 : {
                        block3 : {
                            view = this.activity.getWindow().getDecorView();
                            int n4 = 2.$SwitchMap$io$flutter$embedding$engine$systemchannels$PlatformChannel$HapticFeedbackType[hapticFeedbackType.ordinal()];
                            if (n4 == (n3 = 1)) break block1;
                            if (n4 == 2 || n4 == (n3 = 3)) break block2;
                            n3 = 4;
                            if (n4 == n3) break block3;
                            if (n4 != 5) {
                                return;
                            }
                            if (Build.VERSION.SDK_INT < 21) break block4;
                            break block2;
                        }
                        if (Build.VERSION.SDK_INT < 23) break block4;
                        n2 = 6;
                        break block5;
                    }
                    view.performHapticFeedback(n3);
                    return;
                }
                n2 = 0;
            }
            view.performHapticFeedback(n2);
        }
    }

}

