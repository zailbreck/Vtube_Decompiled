/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Build
 *  android.os.Build$VERSION
 *  f.d.a.b.a.b
 *  f.d.a.b.a.f
 *  f.d.a.b.a.g
 *  io.flutter.embedding.engine.plugins.FlutterPlugin
 *  io.flutter.embedding.engine.plugins.FlutterPlugin$FlutterPluginBinding
 *  io.flutter.plugin.common.BinaryMessenger
 *  io.flutter.plugin.common.MethodCall
 *  io.flutter.plugin.common.MethodChannel
 *  io.flutter.plugin.common.MethodChannel$MethodCallHandler
 *  io.flutter.plugin.common.MethodChannel$Result
 *  io.flutter.plugin.common.PluginRegistry
 *  io.flutter.plugin.common.PluginRegistry$Registrar
 *  io.flutter.plugins.pathprovider.PathProviderPlugin$UiThreadExecutor
 *  io.flutter.plugins.pathprovider.StorageDirectoryMapper
 *  io.flutter.plugins.pathprovider.a
 *  io.flutter.plugins.pathprovider.b
 *  io.flutter.plugins.pathprovider.c
 *  io.flutter.plugins.pathprovider.d
 *  io.flutter.plugins.pathprovider.e
 *  io.flutter.plugins.pathprovider.f
 *  io.flutter.plugins.pathprovider.g
 *  io.flutter.util.PathUtils
 *  java.io.File
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.List
 *  java.util.concurrent.Callable
 *  java.util.concurrent.Executor
 *  java.util.concurrent.Executors
 *  java.util.concurrent.ThreadFactory
 */
package io.flutter.plugins.pathprovider;

import android.content.Context;
import android.os.Build;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry;
import io.flutter.plugins.pathprovider.PathProviderPlugin;
import io.flutter.plugins.pathprovider.StorageDirectoryMapper;
import io.flutter.plugins.pathprovider.a;
import io.flutter.plugins.pathprovider.b;
import io.flutter.plugins.pathprovider.c;
import io.flutter.plugins.pathprovider.d;
import io.flutter.plugins.pathprovider.e;
import io.flutter.plugins.pathprovider.f;
import io.flutter.plugins.pathprovider.g;
import io.flutter.util.PathUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/*
 * Exception performing whole class analysis.
 */
public class PathProviderPlugin
implements FlutterPlugin,
MethodChannel.MethodCallHandler {
    private MethodChannel channel;
    private Context context;
    private final Executor executor;
    private final Executor uiThreadExecutor;

    public PathProviderPlugin() {
        this.uiThreadExecutor = new /* Unavailable Anonymous Inner Class!! */;
        f.d.a.b.a.g g2 = new f.d.a.b.a.g();
        g2.a("path-provider-background-%d");
        g2.a(5);
        this.executor = Executors.newSingleThreadExecutor((ThreadFactory)g2.a());
    }

    static /* synthetic */ void a(f.d.a.b.a.f f2, Callable callable) {
        try {
            f2.a(callable.call());
            return;
        }
        catch (Throwable throwable) {
            f2.a(throwable);
            return;
        }
    }

    private <T> void executeInBackground(Callable<T> callable, final MethodChannel.Result result) {
        f.d.a.b.a.f f2 = f.d.a.b.a.f.g();
        f.d.a.b.a.c.a(f2, new f.d.a.b.a.b<T>(){

            public void onFailure(Throwable throwable) {
                result.error(throwable.getClass().getName(), throwable.getMessage(), null);
            }

            public void onSuccess(T t2) {
                result.success(t2);
            }
        }, this.uiThreadExecutor);
        this.executor.execute((Runnable)new f(f2, callable));
    }

    private String getApplicationSupportDirectory() {
        return PathUtils.getFilesDir((Context)this.context);
    }

    private String getPathProviderApplicationDocumentsDirectory() {
        return PathUtils.getDataDirectory((Context)this.context);
    }

    private List<String> getPathProviderExternalCacheDirectories() {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 19) {
            for (File file : this.context.getExternalCacheDirs()) {
                if (file == null) continue;
                arrayList.add((Object)file.getAbsolutePath());
            }
        } else {
            File file = this.context.getExternalCacheDir();
            if (file != null) {
                arrayList.add((Object)file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    private List<String> getPathProviderExternalStorageDirectories(String string) {
        ArrayList arrayList = new ArrayList();
        if (Build.VERSION.SDK_INT >= 19) {
            for (File file : this.context.getExternalFilesDirs(string)) {
                if (file == null) continue;
                arrayList.add((Object)file.getAbsolutePath());
            }
        } else {
            File file = this.context.getExternalFilesDir(string);
            if (file != null) {
                arrayList.add((Object)file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    private String getPathProviderStorageDirectory() {
        File file = this.context.getExternalFilesDir(null);
        if (file == null) {
            return null;
        }
        return file.getAbsolutePath();
    }

    private String getPathProviderTemporaryDirectory() {
        return this.context.getCacheDir().getPath();
    }

    public static void registerWith(PluginRegistry.Registrar registrar) {
        PathProviderPlugin pathProviderPlugin = new PathProviderPlugin();
        pathProviderPlugin.channel = new MethodChannel(registrar.messenger(), "plugins.flutter.io/path_provider");
        pathProviderPlugin.context = registrar.context();
        pathProviderPlugin.channel.setMethodCallHandler((MethodChannel.MethodCallHandler)pathProviderPlugin);
    }

    public /* synthetic */ String a() {
        return this.getPathProviderTemporaryDirectory();
    }

    public /* synthetic */ List a(String string) {
        return PathProviderPlugin.super.getPathProviderExternalStorageDirectories(string);
    }

    public /* synthetic */ String b() {
        return this.getPathProviderApplicationDocumentsDirectory();
    }

    public /* synthetic */ String c() {
        return this.getPathProviderStorageDirectory();
    }

    public /* synthetic */ List d() {
        return this.getPathProviderExternalCacheDirectories();
    }

    public /* synthetic */ String e() {
        return this.getApplicationSupportDirectory();
    }

    public void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.channel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "plugins.flutter.io/path_provider");
        this.context = flutterPluginBinding.getApplicationContext();
        this.channel.setMethodCallHandler((MethodChannel.MethodCallHandler)this);
    }

    public void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.channel.setMethodCallHandler(null);
        this.channel = null;
    }

    /*
     * Enabled aggressive block sorting
     */
    public void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        int n2;
        b b2;
        block18 : {
            String string = methodCall.method;
            switch (string.hashCode()) {
                default: {
                    break;
                }
                case 1711844626: {
                    if (!string.equals((Object)"getTemporaryDirectory")) break;
                    n2 = 0;
                    break block18;
                }
                case 1252916648: {
                    if (!string.equals((Object)"getStorageDirectory")) break;
                    n2 = 2;
                    break block18;
                }
                case 1200320591: {
                    if (!string.equals((Object)"getApplicationDocumentsDirectory")) break;
                    n2 = 1;
                    break block18;
                }
                case 299667825: {
                    if (!string.equals((Object)"getExternalStorageDirectories")) break;
                    n2 = 4;
                    break block18;
                }
                case -1208689078: {
                    if (!string.equals((Object)"getExternalCacheDirectories")) break;
                    n2 = 3;
                    break block18;
                }
                case -1832373352: {
                    if (!string.equals((Object)"getApplicationSupportDirectory")) break;
                    n2 = 5;
                    break block18;
                }
            }
            n2 = -1;
        }
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        if (n2 == 4) {
                            PathProviderPlugin.super.executeInBackground((Callable<T>)new c((PathProviderPlugin)this, StorageDirectoryMapper.androidType((Integer)((Integer)methodCall.argument("type")))), result);
                            return;
                        }
                        if (n2 != 5) {
                            result.notImplemented();
                            return;
                        }
                        b2 = new g((PathProviderPlugin)this);
                    } else {
                        b2 = new a((PathProviderPlugin)this);
                    }
                } else {
                    b2 = new d((PathProviderPlugin)this);
                }
            } else {
                b2 = new e((PathProviderPlugin)this);
            }
        } else {
            b2 = new b((PathProviderPlugin)this);
        }
        PathProviderPlugin.super.executeInBackground((Callable<T>)b2, result);
    }

}

