/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.app.Application
 *  android.app.Application$ActivityLifecycleCallbacks
 *  android.os.Environment
 *  io.flutter.plugin.common.BinaryMessenger
 *  io.flutter.plugin.common.MethodCall
 *  io.flutter.plugin.common.MethodChannel
 *  io.flutter.plugin.common.MethodChannel$MethodCallHandler
 *  io.flutter.plugin.common.MethodChannel$Result
 *  io.flutter.plugin.common.PluginRegistry
 *  io.flutter.plugin.common.PluginRegistry$ActivityResultListener
 *  io.flutter.plugin.common.PluginRegistry$Registrar
 *  io.flutter.plugin.common.PluginRegistry$RequestPermissionsResultListener
 *  io.flutter.plugins.imagepicker.ExifDataCopier
 *  io.flutter.plugins.imagepicker.ImagePickerCache
 *  io.flutter.plugins.imagepicker.ImagePickerPlugin$1
 *  io.flutter.plugins.imagepicker.ImageResizer
 *  java.io.File
 *  java.lang.IllegalArgumentException
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package io.flutter.plugins.imagepicker;

import android.app.Activity;
import android.app.Application;
import android.os.Environment;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.imagepicker.ExifDataCopier;
import io.flutter.plugins.imagepicker.ImagePickerCache;
import io.flutter.plugins.imagepicker.ImagePickerDelegate;
import io.flutter.plugins.imagepicker.ImagePickerPlugin;
import io.flutter.plugins.imagepicker.ImageResizer;
import java.io.File;

public class ImagePickerPlugin
implements MethodChannel.MethodCallHandler {
    private static final String CHANNEL = "plugins.flutter.io/image_picker";
    static final String METHOD_CALL_IMAGE = "pickImage";
    private static final String METHOD_CALL_RETRIEVE = "retrieve";
    static final String METHOD_CALL_VIDEO = "pickVideo";
    private static final int SOURCE_CAMERA = 0;
    private static final int SOURCE_GALLERY = 1;
    private Application.ActivityLifecycleCallbacks activityLifecycleCallbacks;
    private ImagePickerDelegate delegate;
    private final PluginRegistry.Registrar registrar;

    ImagePickerPlugin(PluginRegistry.Registrar registrar, ImagePickerDelegate imagePickerDelegate) {
        this.registrar = registrar;
        this.delegate = imagePickerDelegate;
        this.activityLifecycleCallbacks = new 1((ImagePickerPlugin)this, registrar, imagePickerDelegate);
        PluginRegistry.Registrar registrar2 = this.registrar;
        if (registrar2 != null && registrar2.activity() != null && this.registrar.activity().getApplication() != null) {
            this.registrar.activity().getApplication().registerActivityLifecycleCallbacks(this.activityLifecycleCallbacks);
        }
    }

    public static void registerWith(PluginRegistry.Registrar registrar) {
        if (registrar.activity() == null) {
            return;
        }
        ImagePickerCache.setUpWithActivity((Activity)registrar.activity());
        MethodChannel methodChannel = new MethodChannel(registrar.messenger(), CHANNEL);
        File file = registrar.activity().getExternalFilesDir(Environment.DIRECTORY_PICTURES);
        ImageResizer imageResizer = new ImageResizer(file, new ExifDataCopier());
        ImagePickerDelegate imagePickerDelegate = new ImagePickerDelegate(registrar.activity(), file, imageResizer);
        registrar.addActivityResultListener((PluginRegistry.ActivityResultListener)imagePickerDelegate);
        registrar.addRequestPermissionsResultListener((PluginRegistry.RequestPermissionsResultListener)imagePickerDelegate);
        methodChannel.setMethodCallHandler((MethodChannel.MethodCallHandler)new ImagePickerPlugin(registrar, imagePickerDelegate));
    }

    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        if (this.registrar.activity() == null) {
            result.error("no_activity", "image_picker plugin requires a foreground activity.", null);
            return;
        }
        String string = methodCall.method;
        int n2 = -1;
        int n3 = string.hashCode();
        if (n3 != -1457314374) {
            if (n3 != -1445424934) {
                if (n3 == -310034372 && string.equals((Object)METHOD_CALL_RETRIEVE)) {
                    n2 = 2;
                }
            } else if (string.equals((Object)METHOD_CALL_VIDEO)) {
                n2 = 1;
            }
        } else if (string.equals((Object)METHOD_CALL_IMAGE)) {
            n2 = 0;
        }
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 == 2) {
                    this.delegate.retrieveLostImage(result);
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown method ");
                stringBuilder.append(methodCall.method);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            int n4 = (Integer)methodCall.argument("source");
            if (n4 != 0) {
                if (n4 == 1) {
                    this.delegate.chooseVideoFromGallery(methodCall, result);
                    return;
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Invalid video source: ");
                stringBuilder.append(n4);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            this.delegate.takeVideoWithCamera(methodCall, result);
            return;
        }
        int n5 = (Integer)methodCall.argument("source");
        if (n5 != 0) {
            if (n5 == 1) {
                this.delegate.chooseImageFromGallery(methodCall, result);
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Invalid image source: ");
            stringBuilder.append(n5);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        this.delegate.takeImageWithCamera(methodCall, result);
    }
}

