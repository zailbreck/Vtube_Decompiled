/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.View$BaseSavedState
 *  android.widget.FrameLayout
 *  androidx.annotation.Keep
 *  java.lang.ClassLoader
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package io.flutter.embedding.android;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Keep;
import io.flutter.Log;
import io.flutter.embedding.android.FlutterSplashView;
import io.flutter.embedding.android.FlutterView;
import io.flutter.embedding.android.SplashScreen;
import io.flutter.embedding.engine.FlutterEngine;
import io.flutter.embedding.engine.dart.DartExecutor;
import io.flutter.embedding.engine.renderer.FlutterUiDisplayListener;

final class FlutterSplashView
extends FrameLayout {
    private static String TAG = "FlutterSplashView";
    private final FlutterView.FlutterEngineAttachmentListener flutterEngineAttachmentListener;
    private final FlutterUiDisplayListener flutterUiDisplayListener;
    private FlutterView flutterView;
    private final Runnable onTransitionComplete;
    private String previousCompletedSplashIsolate;
    private SplashScreen splashScreen;
    private Bundle splashScreenState;
    private View splashScreenView;
    private String transitioningIsolateId;

    public FlutterSplashView(Context context) {
        super(context, null, 0);
    }

    public FlutterSplashView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public FlutterSplashView(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        this.flutterEngineAttachmentListener = new FlutterView.FlutterEngineAttachmentListener((FlutterSplashView)this){
            final /* synthetic */ FlutterSplashView this$0;
            {
                this.this$0 = flutterSplashView;
            }

            public void onFlutterEngineAttachedToFlutterView(FlutterEngine flutterEngine) {
                FlutterSplashView.access$000(this.this$0).removeFlutterEngineAttachmentListener((FlutterView.FlutterEngineAttachmentListener)this);
                FlutterSplashView flutterSplashView = this.this$0;
                flutterSplashView.displayFlutterViewWithSplash(FlutterSplashView.access$000(flutterSplashView), FlutterSplashView.access$100(this.this$0));
            }

            public void onFlutterEngineDetachedFromFlutterView() {
            }
        };
        this.flutterUiDisplayListener = new FlutterUiDisplayListener((FlutterSplashView)this){
            final /* synthetic */ FlutterSplashView this$0;
            {
                this.this$0 = flutterSplashView;
            }

            public void onFlutterUiDisplayed() {
                if (FlutterSplashView.access$100(this.this$0) != null) {
                    FlutterSplashView.access$200(this.this$0);
                }
            }

            public void onFlutterUiNoLongerDisplayed() {
            }
        };
        this.onTransitionComplete = new Runnable(){

            public void run() {
                FlutterSplashView flutterSplashView = FlutterSplashView.this;
                flutterSplashView.removeView(flutterSplashView.splashScreenView);
                FlutterSplashView flutterSplashView2 = FlutterSplashView.this;
                flutterSplashView2.previousCompletedSplashIsolate = flutterSplashView2.transitioningIsolateId;
            }
        };
        this.setSaveEnabled(true);
    }

    static /* synthetic */ FlutterView access$000(FlutterSplashView flutterSplashView) {
        return flutterSplashView.flutterView;
    }

    static /* synthetic */ SplashScreen access$100(FlutterSplashView flutterSplashView) {
        return flutterSplashView.splashScreen;
    }

    static /* synthetic */ void access$200(FlutterSplashView flutterSplashView) {
        flutterSplashView.transitionToFlutter();
    }

    private boolean hasSplashCompleted() {
        FlutterView flutterView = this.flutterView;
        if (flutterView != null) {
            if (flutterView.isAttachedToFlutterEngine()) {
                return this.flutterView.getAttachedFlutterEngine().getDartExecutor().getIsolateServiceId() != null && this.flutterView.getAttachedFlutterEngine().getDartExecutor().getIsolateServiceId().equals((Object)this.previousCompletedSplashIsolate);
            }
            throw new IllegalStateException("Cannot determine if splash has completed when no FlutterEngine is attached to our FlutterView. This question depends on an isolate ID to differentiate Flutter experiences.");
        }
        throw new IllegalStateException("Cannot determine if splash has completed when no FlutterView is set.");
    }

    private boolean isSplashScreenNeededNow() {
        FlutterView flutterView = this.flutterView;
        return flutterView != null && flutterView.isAttachedToFlutterEngine() && !this.flutterView.hasRenderedFirstFrame() && !this.hasSplashCompleted();
    }

    private boolean isSplashScreenTransitionNeededNow() {
        SplashScreen splashScreen;
        FlutterView flutterView = this.flutterView;
        return flutterView != null && flutterView.isAttachedToFlutterEngine() && (splashScreen = this.splashScreen) != null && splashScreen.doesSplashViewRememberItsTransition() && this.wasPreviousSplashTransitionInterrupted();
    }

    private void transitionToFlutter() {
        this.transitioningIsolateId = this.flutterView.getAttachedFlutterEngine().getDartExecutor().getIsolateServiceId();
        String string2 = TAG;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Transitioning splash screen to a Flutter UI. Isolate: ");
        stringBuilder.append(this.transitioningIsolateId);
        Log.v(string2, stringBuilder.toString());
        this.splashScreen.transitionToFlutter(this.onTransitionComplete);
    }

    private boolean wasPreviousSplashTransitionInterrupted() {
        FlutterView flutterView = this.flutterView;
        if (flutterView != null) {
            if (flutterView.isAttachedToFlutterEngine()) {
                return this.flutterView.hasRenderedFirstFrame() && !this.hasSplashCompleted();
            }
            throw new IllegalStateException("Cannot determine if previous splash transition was interrupted when no FlutterEngine is attached to our FlutterView. This question depends on an isolate ID to differentiate Flutter experiences.");
        }
        throw new IllegalStateException("Cannot determine if previous splash transition was interrupted when no FlutterView is set.");
    }

    public void displayFlutterViewWithSplash(FlutterView flutterView, SplashScreen splashScreen) {
        View view;
        FlutterView flutterView2 = this.flutterView;
        if (flutterView2 != null) {
            flutterView2.removeOnFirstFrameRenderedListener(this.flutterUiDisplayListener);
            this.removeView((View)this.flutterView);
        }
        if ((view = this.splashScreenView) != null) {
            this.removeView(view);
        }
        this.flutterView = flutterView;
        this.addView((View)flutterView);
        this.splashScreen = splashScreen;
        if (splashScreen != null) {
            if (FlutterSplashView.super.isSplashScreenNeededNow()) {
                Log.v(TAG, "Showing splash screen UI.");
                this.splashScreenView = splashScreen.createSplashView(this.getContext(), this.splashScreenState);
                this.addView(this.splashScreenView);
                flutterView.addOnFirstFrameRenderedListener(this.flutterUiDisplayListener);
                return;
            }
            if (FlutterSplashView.super.isSplashScreenTransitionNeededNow()) {
                Log.v(TAG, "Showing an immediate splash transition to Flutter due to previously interrupted transition.");
                this.splashScreenView = splashScreen.createSplashView(this.getContext(), this.splashScreenState);
                this.addView(this.splashScreenView);
                FlutterSplashView.super.transitionToFlutter();
                return;
            }
            if (!flutterView.isAttachedToFlutterEngine()) {
                Log.v(TAG, "FlutterView is not yet attached to a FlutterEngine. Showing nothing until a FlutterEngine is attached.");
                flutterView.addFlutterEngineAttachmentListener(this.flutterEngineAttachmentListener);
            }
        }
    }

    protected void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState)parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.previousCompletedSplashIsolate = savedState.previousCompletedSplashIsolate;
        this.splashScreenState = savedState.splashScreenState;
    }

    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.previousCompletedSplashIsolate = this.previousCompletedSplashIsolate;
        SplashScreen splashScreen = this.splashScreen;
        Bundle bundle = splashScreen != null ? splashScreen.saveSplashScreenState() : null;
        savedState.splashScreenState = bundle;
        return savedState;
    }

    @Keep
    public static class SavedState
    extends View.BaseSavedState {
        public static Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>(){

            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            public SavedState[] newArray(int n2) {
                return new SavedState[n2];
            }
        };
        private String previousCompletedSplashIsolate;
        private Bundle splashScreenState;

        SavedState(Parcel parcel) {
            super(parcel);
            this.previousCompletedSplashIsolate = parcel.readString();
            this.splashScreenState = parcel.readBundle(SavedState.class.getClassLoader());
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int n2) {
            super.writeToParcel(parcel, n2);
            parcel.writeString(this.previousCompletedSplashIsolate);
            parcel.writeBundle(this.splashScreenState);
        }

    }

}

