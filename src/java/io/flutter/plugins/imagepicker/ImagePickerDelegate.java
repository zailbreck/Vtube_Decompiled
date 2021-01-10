/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ActivityInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.ResolveInfo
 *  android.media.MediaScannerConnection
 *  android.media.MediaScannerConnection$OnScanCompletedListener
 *  android.net.Uri
 *  android.os.Parcelable
 *  androidx.core.app.a
 *  e.e.d.a
 *  e.e.d.b
 *  io.flutter.plugin.common.MethodCall
 *  io.flutter.plugin.common.MethodChannel
 *  io.flutter.plugin.common.MethodChannel$Result
 *  io.flutter.plugin.common.PluginRegistry
 *  io.flutter.plugin.common.PluginRegistry$ActivityResultListener
 *  io.flutter.plugin.common.PluginRegistry$RequestPermissionsResultListener
 *  io.flutter.plugins.imagepicker.FileUtils
 *  io.flutter.plugins.imagepicker.ImagePickerCache
 *  io.flutter.plugins.imagepicker.ImagePickerDelegate$3$1
 *  io.flutter.plugins.imagepicker.ImagePickerDelegate$FileUriResolver
 *  io.flutter.plugins.imagepicker.ImagePickerDelegate$IntentResolver
 *  io.flutter.plugins.imagepicker.ImagePickerDelegate$OnPathReadyListener
 *  io.flutter.plugins.imagepicker.ImagePickerDelegate$PermissionManager
 *  io.flutter.plugins.imagepicker.ImagePickerUtils
 *  io.flutter.plugins.imagepicker.ImageResizer
 *  java.io.File
 *  java.io.IOException
 *  java.lang.Double
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.List
 *  java.util.Map
 *  java.util.UUID
 */
package io.flutter.plugins.imagepicker;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Parcelable;
import androidx.core.app.a;
import e.e.d.b;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.imagepicker.FileUtils;
import io.flutter.plugins.imagepicker.ImagePickerCache;
import io.flutter.plugins.imagepicker.ImagePickerDelegate;
import io.flutter.plugins.imagepicker.ImagePickerUtils;
import io.flutter.plugins.imagepicker.ImageResizer;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class ImagePickerDelegate
implements PluginRegistry.ActivityResultListener,
PluginRegistry.RequestPermissionsResultListener {
    static final int REQUEST_CAMERA_IMAGE_PERMISSION = 2345;
    static final int REQUEST_CAMERA_VIDEO_PERMISSION = 2355;
    static final int REQUEST_CODE_CHOOSE_IMAGE_FROM_GALLERY = 2342;
    static final int REQUEST_CODE_CHOOSE_VIDEO_FROM_GALLERY = 2352;
    static final int REQUEST_CODE_TAKE_IMAGE_WITH_CAMERA = 2343;
    static final int REQUEST_CODE_TAKE_VIDEO_WITH_CAMERA = 2353;
    static final int REQUEST_EXTERNAL_IMAGE_STORAGE_PERMISSION = 2344;
    static final int REQUEST_EXTERNAL_VIDEO_STORAGE_PERMISSION = 2354;
    private final Activity activity;
    private final File externalFilesDirectory;
    final String fileProviderName;
    private final FileUriResolver fileUriResolver;
    private final FileUtils fileUtils;
    private final ImageResizer imageResizer;
    private final IntentResolver intentResolver;
    private MethodCall methodCall;
    private Uri pendingCameraMediaUri;
    private MethodChannel.Result pendingResult;
    private final PermissionManager permissionManager;

    public ImagePickerDelegate(Activity activity, File file, ImageResizer imageResizer) {
        super(activity, file, imageResizer, null, null, new PermissionManager(){

            public void askForPermission(String string, int n2) {
                a.a((Activity)Activity.this, (String[])new String[]{string}, (int)n2);
            }

            public boolean isPermissionGranted(String string) {
                return e.e.d.a.a((Context)Activity.this, (String)string) == 0;
            }

            public boolean needRequestCameraPermission() {
                return ImagePickerUtils.needRequestCameraPermission((Context)Activity.this);
            }
        }, new IntentResolver(){

            public boolean resolveActivity(Intent intent) {
                return intent.resolveActivity(Activity.this.getPackageManager()) != null;
            }
        }, new FileUriResolver(){

            public void getFullImagePath(Uri uri, OnPathReadyListener onPathReadyListener) {
                Activity activity = Activity.this;
                String[] arrstring = new String[1];
                String string = uri != null ? uri.getPath() : "";
                arrstring[0] = string;
                MediaScannerConnection.scanFile((Context)activity, (String[])arrstring, null, (MediaScannerConnection.OnScanCompletedListener)new 1(this, onPathReadyListener));
            }

            public Uri resolveFileProviderUriForFile(String string, File file) {
                return b.getUriForFile((Context)Activity.this, (String)string, (File)file);
            }
        }, new FileUtils());
    }

    ImagePickerDelegate(Activity activity, File file, ImageResizer imageResizer, MethodChannel.Result result, MethodCall methodCall, PermissionManager permissionManager, IntentResolver intentResolver, FileUriResolver fileUriResolver, FileUtils fileUtils) {
        this.activity = activity;
        this.externalFilesDirectory = file;
        this.imageResizer = imageResizer;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(activity.getPackageName());
        stringBuilder.append(".flutter.image_provider");
        this.fileProviderName = stringBuilder.toString();
        this.pendingResult = result;
        this.methodCall = methodCall;
        this.permissionManager = permissionManager;
        this.intentResolver = intentResolver;
        this.fileUriResolver = fileUriResolver;
        this.fileUtils = fileUtils;
    }

    private void clearMethodCallAndResult() {
        this.methodCall = null;
        this.pendingResult = null;
    }

    private File createTemporaryWritableFile(String string) {
        String string2 = UUID.randomUUID().toString();
        try {
            File file = File.createTempFile((String)string2, (String)string, (File)this.externalFilesDirectory);
            return file;
        }
        catch (IOException iOException) {
            throw new RuntimeException((Throwable)iOException);
        }
    }

    private File createTemporaryWritableImageFile() {
        return this.createTemporaryWritableFile(".jpg");
    }

    private File createTemporaryWritableVideoFile() {
        return this.createTemporaryWritableFile(".mp4");
    }

    private void finishWithAlreadyActiveError(MethodChannel.Result result) {
        result.error("already_active", "Image picker is already active", null);
    }

    private void finishWithError(String string, String string2) {
        MethodChannel.Result result = this.pendingResult;
        if (result == null) {
            ImagePickerCache.saveResult(null, (String)string, (String)string2);
            return;
        }
        result.error(string, string2, null);
        ImagePickerDelegate.super.clearMethodCallAndResult();
    }

    private void finishWithSuccess(String string) {
        MethodChannel.Result result = this.pendingResult;
        if (result == null) {
            ImagePickerCache.saveResult((String)string, null, null);
            return;
        }
        result.success((Object)string);
        ImagePickerDelegate.super.clearMethodCallAndResult();
    }

    private void grantUriPermissions(Intent intent, Uri uri) {
        for (ResolveInfo resolveInfo : this.activity.getPackageManager().queryIntentActivities(intent, 65536)) {
            this.activity.grantUriPermission(resolveInfo.activityInfo.packageName, uri, 3);
        }
    }

    private void handleCaptureImageResult(int n2) {
        if (n2 == -1) {
            FileUriResolver fileUriResolver = this.fileUriResolver;
            Uri uri = this.pendingCameraMediaUri;
            if (uri == null) {
                uri = Uri.parse((String)ImagePickerCache.retrievePendingCameraMediaUriPath());
            }
            fileUriResolver.getFullImagePath(uri, new OnPathReadyListener(){

                public void onPathReady(String string) {
                    ImagePickerDelegate.this.handleImageResult(string, true);
                }
            });
            return;
        }
        ImagePickerDelegate.super.finishWithSuccess(null);
    }

    private void handleCaptureVideoResult(int n2) {
        if (n2 == -1) {
            FileUriResolver fileUriResolver = this.fileUriResolver;
            Uri uri = this.pendingCameraMediaUri;
            if (uri == null) {
                uri = Uri.parse((String)ImagePickerCache.retrievePendingCameraMediaUriPath());
            }
            fileUriResolver.getFullImagePath(uri, new OnPathReadyListener(){

                public void onPathReady(String string) {
                    ImagePickerDelegate.this.handleVideoResult(string);
                }
            });
            return;
        }
        ImagePickerDelegate.super.finishWithSuccess(null);
    }

    private void handleChooseImageResult(int n2, Intent intent) {
        if (n2 == -1 && intent != null) {
            ImagePickerDelegate.super.handleImageResult(this.fileUtils.getPathFromUri((Context)this.activity, intent.getData()), false);
            return;
        }
        ImagePickerDelegate.super.finishWithSuccess(null);
    }

    private void handleChooseVideoResult(int n2, Intent intent) {
        if (n2 == -1 && intent != null) {
            ImagePickerDelegate.super.handleVideoResult(this.fileUtils.getPathFromUri((Context)this.activity, intent.getData()));
            return;
        }
        ImagePickerDelegate.super.finishWithSuccess(null);
    }

    private void handleImageResult(String string, boolean bl) {
        MethodCall methodCall = this.methodCall;
        if (methodCall != null) {
            Double d2 = (Double)methodCall.argument("maxWidth");
            Double d3 = (Double)this.methodCall.argument("maxHeight");
            String string2 = this.imageResizer.resizeImageIfNeeded(string, d2, d3);
            ImagePickerDelegate.super.finishWithSuccess(string2);
            if (!string2.equals((Object)string) && bl) {
                new File(string).delete();
                return;
            }
        } else {
            ImagePickerDelegate.super.finishWithSuccess(string);
        }
    }

    private void handleVideoResult(String string) {
        ImagePickerDelegate.super.finishWithSuccess(string);
    }

    private void launchPickImageFromGalleryIntent() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("image/*");
        this.activity.startActivityForResult(intent, 2342);
    }

    private void launchPickVideoFromGalleryIntent() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("video/*");
        this.activity.startActivityForResult(intent, 2352);
    }

    private void launchTakeImageWithCameraIntent() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (!this.intentResolver.resolveActivity(intent)) {
            this.finishWithError("no_available_camera", "No cameras available for taking pictures.");
            return;
        }
        File file = this.createTemporaryWritableImageFile();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("file:");
        stringBuilder.append(file.getAbsolutePath());
        this.pendingCameraMediaUri = Uri.parse((String)stringBuilder.toString());
        Uri uri = this.fileUriResolver.resolveFileProviderUriForFile(this.fileProviderName, file);
        intent.putExtra("output", (Parcelable)uri);
        this.grantUriPermissions(intent, uri);
        this.activity.startActivityForResult(intent, 2343);
    }

    private void launchTakeVideoWithCameraIntent() {
        Intent intent = new Intent("android.media.action.VIDEO_CAPTURE");
        if (!this.intentResolver.resolveActivity(intent)) {
            this.finishWithError("no_available_camera", "No cameras available for taking pictures.");
            return;
        }
        File file = this.createTemporaryWritableVideoFile();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("file:");
        stringBuilder.append(file.getAbsolutePath());
        this.pendingCameraMediaUri = Uri.parse((String)stringBuilder.toString());
        Uri uri = this.fileUriResolver.resolveFileProviderUriForFile(this.fileProviderName, file);
        intent.putExtra("output", (Parcelable)uri);
        this.grantUriPermissions(intent, uri);
        this.activity.startActivityForResult(intent, 2353);
    }

    private boolean needRequestCameraPermission() {
        PermissionManager permissionManager = this.permissionManager;
        if (permissionManager == null) {
            return false;
        }
        return permissionManager.needRequestCameraPermission();
    }

    private boolean setPendingMethodCallAndResult(MethodCall methodCall, MethodChannel.Result result) {
        if (this.pendingResult != null) {
            return false;
        }
        this.methodCall = methodCall;
        this.pendingResult = result;
        ImagePickerCache.clear();
        return true;
    }

    public void chooseImageFromGallery(MethodCall methodCall, MethodChannel.Result result) {
        if (!ImagePickerDelegate.super.setPendingMethodCallAndResult(methodCall, result)) {
            ImagePickerDelegate.super.finishWithAlreadyActiveError(result);
            return;
        }
        if (!this.permissionManager.isPermissionGranted("android.permission.READ_EXTERNAL_STORAGE")) {
            this.permissionManager.askForPermission("android.permission.READ_EXTERNAL_STORAGE", 2344);
            return;
        }
        ImagePickerDelegate.super.launchPickImageFromGalleryIntent();
    }

    public void chooseVideoFromGallery(MethodCall methodCall, MethodChannel.Result result) {
        if (!ImagePickerDelegate.super.setPendingMethodCallAndResult(methodCall, result)) {
            ImagePickerDelegate.super.finishWithAlreadyActiveError(result);
            return;
        }
        if (!this.permissionManager.isPermissionGranted("android.permission.READ_EXTERNAL_STORAGE")) {
            this.permissionManager.askForPermission("android.permission.READ_EXTERNAL_STORAGE", 2354);
            return;
        }
        ImagePickerDelegate.super.launchPickVideoFromGalleryIntent();
    }

    public boolean onActivityResult(int n2, int n3, Intent intent) {
        if (n2 != 2342) {
            if (n2 != 2343) {
                if (n2 != 2352) {
                    if (n2 != 2353) {
                        return false;
                    }
                    ImagePickerDelegate.super.handleCaptureVideoResult(n3);
                } else {
                    ImagePickerDelegate.super.handleChooseVideoResult(n3, intent);
                }
            } else {
                ImagePickerDelegate.super.handleCaptureImageResult(n3);
            }
        } else {
            ImagePickerDelegate.super.handleChooseImageResult(n3, intent);
        }
        return true;
    }

    public boolean onRequestPermissionsResult(int n2, String[] arrstring, int[] arrn) {
        boolean bl = arrn.length > 0 && arrn[0] == 0;
        if (n2 != 2344) {
            if (n2 != 2345) {
                if (n2 != 2354) {
                    if (n2 != 2355) {
                        return false;
                    }
                    if (bl) {
                        ImagePickerDelegate.super.launchTakeVideoWithCameraIntent();
                    }
                } else if (bl) {
                    ImagePickerDelegate.super.launchPickVideoFromGalleryIntent();
                }
            } else if (bl) {
                ImagePickerDelegate.super.launchTakeImageWithCameraIntent();
            }
        } else if (bl) {
            ImagePickerDelegate.super.launchPickImageFromGalleryIntent();
        }
        if (!bl) {
            ImagePickerDelegate.super.finishWithSuccess(null);
        }
        return true;
    }

    void retrieveLostImage(MethodChannel.Result result) {
        Map map = ImagePickerCache.getCacheMap();
        String string = (String)map.get((Object)"path");
        if (string != null) {
            Double d2 = (Double)map.get((Object)"maxWidth");
            Double d3 = (Double)map.get((Object)"maxHeight");
            map.put((Object)"path", (Object)this.imageResizer.resizeImageIfNeeded(string, d2, d3));
        }
        if (map.isEmpty()) {
            map = null;
        }
        result.success((Object)map);
        ImagePickerCache.clear();
    }

    void saveStateBeforeResult() {
        MethodCall methodCall = this.methodCall;
        if (methodCall == null) {
            return;
        }
        ImagePickerCache.saveTypeWithMethodCallName((String)methodCall.method);
        ImagePickerCache.saveDemensionWithMethodCall((MethodCall)this.methodCall);
        Uri uri = this.pendingCameraMediaUri;
        if (uri != null) {
            ImagePickerCache.savePendingCameraMediaUriPath((Uri)uri);
        }
    }

    public void takeImageWithCamera(MethodCall methodCall, MethodChannel.Result result) {
        if (!ImagePickerDelegate.super.setPendingMethodCallAndResult(methodCall, result)) {
            ImagePickerDelegate.super.finishWithAlreadyActiveError(result);
            return;
        }
        if (ImagePickerDelegate.super.needRequestCameraPermission() && !this.permissionManager.isPermissionGranted("android.permission.CAMERA")) {
            this.permissionManager.askForPermission("android.permission.CAMERA", 2345);
            return;
        }
        ImagePickerDelegate.super.launchTakeImageWithCameraIntent();
    }

    public void takeVideoWithCamera(MethodCall methodCall, MethodChannel.Result result) {
        if (!ImagePickerDelegate.super.setPendingMethodCallAndResult(methodCall, result)) {
            ImagePickerDelegate.super.finishWithAlreadyActiveError(result);
            return;
        }
        if (ImagePickerDelegate.super.needRequestCameraPermission() && !this.permissionManager.isPermissionGranted("android.permission.CAMERA")) {
            this.permissionManager.askForPermission("android.permission.CAMERA", 2355);
            return;
        }
        ImagePickerDelegate.super.launchTakeVideoWithCameraIntent();
    }

}

