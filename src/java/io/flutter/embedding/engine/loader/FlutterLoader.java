/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.pm.ApplicationInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.SystemClock
 *  android.util.Log
 *  android.view.WindowManager
 *  io.flutter.util.PathUtils
 *  io.flutter.view.VsyncWaiter
 *  java.io.File
 *  java.lang.Exception
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.RuntimeException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 */
package io.flutter.embedding.engine.loader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.WindowManager;
import io.flutter.embedding.engine.FlutterJNI;
import io.flutter.embedding.engine.loader.ResourceCleaner;
import io.flutter.embedding.engine.loader.ResourceExtractor;
import io.flutter.util.PathUtils;
import io.flutter.view.VsyncWaiter;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class FlutterLoader {
    private static final String AOT_SHARED_LIBRARY_NAME = "aot-shared-library-name";
    private static final String DEFAULT_AOT_SHARED_LIBRARY_NAME = "libapp.so";
    private static final String DEFAULT_FLUTTER_ASSETS_DIR = "flutter_assets";
    private static final String DEFAULT_ISOLATE_SNAPSHOT_DATA = "isolate_snapshot_data";
    private static final String DEFAULT_KERNEL_BLOB = "kernel_blob.bin";
    private static final String DEFAULT_LIBRARY = "libflutter.so";
    private static final String DEFAULT_VM_SNAPSHOT_DATA = "vm_snapshot_data";
    private static final String FLUTTER_ASSETS_DIR_KEY = "flutter-assets-dir";
    private static final String ISOLATE_SNAPSHOT_DATA_KEY = "isolate-snapshot-data";
    private static final String PUBLIC_AOT_SHARED_LIBRARY_NAME;
    private static final String PUBLIC_FLUTTER_ASSETS_DIR_KEY;
    private static final String PUBLIC_ISOLATE_SNAPSHOT_DATA_KEY;
    private static final String PUBLIC_VM_SNAPSHOT_DATA_KEY;
    private static final String SNAPSHOT_ASSET_PATH_KEY = "snapshot-asset-path";
    private static final String TAG = "FlutterLoader";
    private static final String VM_SNAPSHOT_DATA_KEY = "vm-snapshot-data";
    private static FlutterLoader instance;
    private String aotSharedLibraryName = "libapp.so";
    private String flutterAssetsDir = "flutter_assets";
    private boolean initialized = false;
    private String isolateSnapshotData = "isolate_snapshot_data";
    private ResourceExtractor resourceExtractor;
    private Settings settings;
    private String vmSnapshotData = "vm_snapshot_data";

    static {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(FlutterLoader.class.getName());
        stringBuilder.append('.');
        stringBuilder.append(AOT_SHARED_LIBRARY_NAME);
        PUBLIC_AOT_SHARED_LIBRARY_NAME = stringBuilder.toString();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(FlutterLoader.class.getName());
        stringBuilder2.append('.');
        stringBuilder2.append(VM_SNAPSHOT_DATA_KEY);
        PUBLIC_VM_SNAPSHOT_DATA_KEY = stringBuilder2.toString();
        StringBuilder stringBuilder3 = new StringBuilder();
        stringBuilder3.append(FlutterLoader.class.getName());
        stringBuilder3.append('.');
        stringBuilder3.append(ISOLATE_SNAPSHOT_DATA_KEY);
        PUBLIC_ISOLATE_SNAPSHOT_DATA_KEY = stringBuilder3.toString();
        StringBuilder stringBuilder4 = new StringBuilder();
        stringBuilder4.append(FlutterLoader.class.getName());
        stringBuilder4.append('.');
        stringBuilder4.append(FLUTTER_ASSETS_DIR_KEY);
        PUBLIC_FLUTTER_ASSETS_DIR_KEY = stringBuilder4.toString();
    }

    private String fullAssetPathFrom(String string2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.flutterAssetsDir);
        stringBuilder.append(File.separator);
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }

    private ApplicationInfo getApplicationInfo(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            return applicationInfo;
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            throw new RuntimeException((Throwable)nameNotFoundException);
        }
    }

    public static FlutterLoader getInstance() {
        if (instance == null) {
            instance = new FlutterLoader();
        }
        return instance;
    }

    private void initConfig(Context context) {
        Bundle bundle = FlutterLoader.super.getApplicationInfo((Context)context).metaData;
        if (bundle == null) {
            return;
        }
        this.aotSharedLibraryName = bundle.getString(PUBLIC_AOT_SHARED_LIBRARY_NAME, DEFAULT_AOT_SHARED_LIBRARY_NAME);
        this.flutterAssetsDir = bundle.getString(PUBLIC_FLUTTER_ASSETS_DIR_KEY, DEFAULT_FLUTTER_ASSETS_DIR);
        this.vmSnapshotData = bundle.getString(PUBLIC_VM_SNAPSHOT_DATA_KEY, DEFAULT_VM_SNAPSHOT_DATA);
        this.isolateSnapshotData = bundle.getString(PUBLIC_ISOLATE_SNAPSHOT_DATA_KEY, DEFAULT_ISOLATE_SNAPSHOT_DATA);
    }

    private void initResources(Context context) {
        new ResourceCleaner(context).start();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void ensureInitializationComplete(Context context, String[] arrstring) {
        if (this.initialized) {
            return;
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
        }
        if (this.settings == null) {
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        try {
            if (this.resourceExtractor != null) {
                this.resourceExtractor.waitForCompletion();
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add((Object)"--icu-symbol-prefix=_binary_icudtl_dat");
            ApplicationInfo applicationInfo = FlutterLoader.super.getApplicationInfo(context);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("--icu-native-lib-path=");
            stringBuilder.append(applicationInfo.nativeLibraryDir);
            stringBuilder.append(File.separator);
            stringBuilder.append(DEFAULT_LIBRARY);
            arrayList.add((Object)stringBuilder.toString());
            if (arrstring != null) {
                Collections.addAll((Collection)arrayList, (Object[])arrstring);
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("--aot-shared-library-name=");
            stringBuilder2.append(this.aotSharedLibraryName);
            arrayList.add((Object)stringBuilder2.toString());
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("--aot-shared-library-name=");
            stringBuilder3.append(applicationInfo.nativeLibraryDir);
            stringBuilder3.append(File.separator);
            stringBuilder3.append(this.aotSharedLibraryName);
            arrayList.add((Object)stringBuilder3.toString());
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append("--cache-dir-path=");
            stringBuilder4.append(PathUtils.getCacheDirectory((Context)context));
            arrayList.add((Object)stringBuilder4.toString());
            if (this.settings.getLogTag() != null) {
                StringBuilder stringBuilder5 = new StringBuilder();
                stringBuilder5.append("--log-tag=");
                stringBuilder5.append(this.settings.getLogTag());
                arrayList.add((Object)stringBuilder5.toString());
            }
            String string2 = PathUtils.getFilesDir((Context)context);
            String string3 = PathUtils.getCacheDirectory((Context)context);
            FlutterJNI.nativeInit(context, (String[])arrayList.toArray((Object[])new String[0]), null, string2, string3);
            this.initialized = true;
            return;
        }
        catch (Exception exception) {
            Log.e((String)TAG, (String)"Flutter initialization failed.", (Throwable)exception);
            throw new RuntimeException((Throwable)exception);
        }
    }

    public void ensureInitializationCompleteAsync(final Context context, final String[] arrstring, final Handler handler, final Runnable runnable) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            if (this.settings != null) {
                if (this.initialized) {
                    handler.post(runnable);
                    return;
                }
                Runnable runnable2 = new Runnable(){

                    public void run() {
                        if (FlutterLoader.this.resourceExtractor != null) {
                            FlutterLoader.this.resourceExtractor.waitForCompletion();
                        }
                        new Handler(Looper.getMainLooper()).post(new Runnable(){

                            public void run() {
                                1 var1_1 = 1.this;
                                var1_1.FlutterLoader.this.ensureInitializationComplete(var1_1.context.getApplicationContext(), arrstring);
                                1 var2_2 = 1.this;
                                var2_2.handler.post(var2_2.runnable);
                            }
                        });
                    }

                };
                new Thread(runnable2).start();
                return;
            }
            throw new IllegalStateException("ensureInitializationComplete must be called after startInitialization");
        }
        throw new IllegalStateException("ensureInitializationComplete must be called on the main thread");
    }

    public String findAppBundlePath() {
        return this.flutterAssetsDir;
    }

    public String getLookupKeyForAsset(String string2) {
        return FlutterLoader.super.fullAssetPathFrom(string2);
    }

    public String getLookupKeyForAsset(String string2, String string3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("packages");
        stringBuilder.append(File.separator);
        stringBuilder.append(string3);
        stringBuilder.append(File.separator);
        stringBuilder.append(string2);
        return this.getLookupKeyForAsset(stringBuilder.toString());
    }

    public void startInitialization(Context context) {
        this.startInitialization(context, new Settings());
    }

    public void startInitialization(Context context, Settings settings) {
        if (this.settings != null) {
            return;
        }
        if (Looper.myLooper() == Looper.getMainLooper()) {
            Context context2 = context.getApplicationContext();
            this.settings = settings;
            long l2 = SystemClock.uptimeMillis();
            FlutterLoader.super.initConfig(context2);
            FlutterLoader.super.initResources(context2);
            System.loadLibrary((String)"flutter");
            VsyncWaiter.getInstance((WindowManager)((WindowManager)context2.getSystemService("window"))).init();
            FlutterJNI.nativeRecordStartTimestamp(SystemClock.uptimeMillis() - l2);
            return;
        }
        throw new IllegalStateException("startInitialization must be called on the main thread");
    }

    public static class Settings {
        private String logTag;

        public String getLogTag() {
            return this.logTag;
        }

        public void setLogTag(String string2) {
            this.logTag = string2;
        }
    }

}

