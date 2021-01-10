/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.Display
 *  android.view.WindowManager
 *  java.lang.Object
 */
package io.flutter.view;

import android.view.Display;
import android.view.WindowManager;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.view.VsyncWaiter;

public class VsyncWaiter {
    private static VsyncWaiter instance;
    private final FlutterJNI.AsyncWaitForVsyncDelegate asyncWaitForVsyncDelegate;
    private final WindowManager windowManager;

    private VsyncWaiter(WindowManager windowManager) {
        this.asyncWaitForVsyncDelegate = new FlutterJNI.AsyncWaitForVsyncDelegate((VsyncWaiter)this){
            final /* synthetic */ VsyncWaiter this$0;
            {
                this.this$0 = vsyncWaiter;
            }

            public void asyncWaitForVsync(long l2) {
                android.view.Choreographer.getInstance().postFrameCallback(new android.view.Choreographer$FrameCallback(this, l2){
                    final /* synthetic */ 1 this$1;
                    final /* synthetic */ long val$cookie;
                    {
                        this.this$1 = var1;
                        this.val$cookie = l2;
                    }

                    public void doFrame(long l2) {
                        double d2 = VsyncWaiter.access$000(this.this$1.this$0).getDefaultDisplay().getRefreshRate();
                        java.lang.Double.isNaN((double)d2);
                        FlutterJNI.nativeOnVsync(l2, l2 + (long)(1.0E9 / d2), this.val$cookie);
                    }
                });
            }
        };
        this.windowManager = windowManager;
    }

    static /* synthetic */ WindowManager access$000(VsyncWaiter vsyncWaiter) {
        return vsyncWaiter.windowManager;
    }

    public static VsyncWaiter getInstance(WindowManager windowManager) {
        if (instance == null) {
            instance = new VsyncWaiter(windowManager);
        }
        return instance;
    }

    public void init() {
        FlutterJNI.setAsyncWaitForVsyncDelegate(this.asyncWaitForVsyncDelegate);
        FlutterJNI.setRefreshRateFPS(this.windowManager.getDefaultDisplay().getRefreshRate());
    }
}

