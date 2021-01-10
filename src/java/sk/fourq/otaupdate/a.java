/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.app.Activity
 *  android.app.DownloadManager
 *  android.app.DownloadManager$Request
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.net.Uri
 *  android.os.Environment
 *  android.os.Handler
 *  android.os.Looper
 *  android.util.Log
 *  androidx.core.app.a
 *  e.e.d.a
 *  java.io.File
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.Iterator
 *  java.util.Map
 *  org.json.JSONException
 *  org.json.JSONObject
 *  sk.fourq.otaupdate.a$a
 *  sk.fourq.otaupdate.a$b
 *  sk.fourq.otaupdate.a$c
 *  sk.fourq.otaupdate.a$d
 */
package sk.fourq.otaupdate;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.EventChannel;
import io.flutter.plugin.common.PluginRegistry;
import java.io.File;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import sk.fourq.otaupdate.a;

@TargetApi(value=23)
public class a
implements EventChannel.StreamHandler,
PluginRegistry.RequestPermissionsResultListener {
    private final PluginRegistry.Registrar b;
    private EventChannel.EventSink c;
    private String d;
    private JSONObject e;
    private String f;
    private String g;
    private String h = "sk.fourq.ota_update.provider";
    private Handler i;
    private Context j;

    private a(PluginRegistry.Registrar registrar) {
        this.b = registrar;
        Object object = registrar.activity() != null ? registrar.activity() : registrar.context();
        this.j = object;
        this.i = new a((a)this, this.j.getMainLooper());
    }

    static /* synthetic */ EventChannel.EventSink a(a a2) {
        return a2.c;
    }

    static /* synthetic */ EventChannel.EventSink a(a a2, EventChannel.EventSink eventSink) {
        a2.c = eventSink;
        return eventSink;
    }

    private void a() {
        try {
            if (this.f == null) {
                this.f = "ota_update.apk";
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append((Object)Environment.getExternalStoragePublicDirectory((String)Environment.DIRECTORY_DOWNLOADS));
            stringBuilder.append("/");
            stringBuilder.append(this.f);
            String string = stringBuilder.toString();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("file://");
            stringBuilder2.append(string);
            Uri uri = Uri.parse((String)stringBuilder2.toString());
            File file = new File(string);
            if (file.exists() && !file.delete()) {
                Log.e((String)"FLUTTER OTA", (String)"ERROR: unable to delete old apk file before starting OTA");
            }
            Log.d((String)"FLUTTER OTA", (String)"OTA UPDATE ON STARTING DOWNLOAD");
            DownloadManager.Request request = new DownloadManager.Request(Uri.parse((String)this.d));
            if (this.e != null) {
                Iterator iterator = this.e.keys();
                while (iterator.hasNext()) {
                    String string2 = (String)iterator.next();
                    request.addRequestHeader(string2, this.e.getString(string2));
                }
            }
            request.setNotificationVisibility(0);
            request.setDestinationUri(uri);
            DownloadManager downloadManager = (DownloadManager)this.j.getSystemService("download");
            long l2 = downloadManager.enqueue(request);
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("OTA UPDATE DOWNLOAD STARTED ");
            stringBuilder3.append(l2);
            Log.d((String)"FLUTTER OTA", (String)stringBuilder3.toString());
            this.a(l2, downloadManager);
            this.j.registerReceiver((BroadcastReceiver)new b(this, string, uri), new IntentFilter("android.intent.action.DOWNLOAD_COMPLETE"));
            return;
        }
        catch (Exception exception) {
            EventChannel.EventSink eventSink = this.c;
            if (eventSink != null) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("");
                stringBuilder.append(d.f.ordinal());
                eventSink.error(stringBuilder.toString(), exception.getMessage(), null);
                this.c = null;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ERROR: ");
            stringBuilder.append(exception.getMessage());
            Log.e((String)"FLUTTER OTA", (String)stringBuilder.toString(), (Throwable)exception);
            return;
        }
    }

    private void a(long l2, DownloadManager downloadManager) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("OTA UPDATE TRACK DOWNLOAD STARTED ");
        stringBuilder.append(l2);
        Log.d((String)"FLUTTER OTA", (String)stringBuilder.toString());
        new Thread((Runnable)new c((a)this, l2, downloadManager)).start();
    }

    public static void a(PluginRegistry.Registrar registrar) {
        a a2 = new a(registrar);
        new EventChannel(registrar.messenger(), "sk.fourq.ota_update").setStreamHandler(a2);
        registrar.addRequestPermissionsResultListener(a2);
    }

    private void a(d d2, String string) {
        EventChannel.EventSink eventSink = this.c;
        if (eventSink != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(d2.ordinal());
            eventSink.error(stringBuilder.toString(), string, null);
            this.c = null;
        }
    }

    static /* synthetic */ void a(a a2, d d2, String string) {
        a2.a(d2, string);
    }

    static /* synthetic */ Context b(a a2) {
        return a2.j;
    }

    static /* synthetic */ String c(a a2) {
        return a2.g;
    }

    static /* synthetic */ String d(a a2) {
        return a2.h;
    }

    static /* synthetic */ Handler e(a a2) {
        return a2.i;
    }

    @Override
    public void onCancel(Object object) {
        this.c = null;
    }

    @Override
    public void onListen(Object object, EventChannel.EventSink eventSink) {
        Object object2;
        String string;
        EventChannel.EventSink eventSink2 = this.c;
        if (eventSink2 != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(d.d.ordinal());
            eventSink2.error(stringBuilder.toString(), "Method call was cancelled. One method call is already running", null);
        }
        Log.d((String)"FLUTTER OTA", (String)"OTA UPDATE ON LISTEN");
        this.c = eventSink;
        Map map = (Map)object;
        this.d = map.get((Object)"url").toString();
        try {
            String string2 = map.get((Object)"headers").toString();
            if (!string2.isEmpty()) {
                this.e = new JSONObject(string2);
            }
        }
        catch (JSONException jSONException) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("ERROR: ");
            stringBuilder.append(jSONException.getMessage());
            Log.e((String)"FLUTTER OTA", (String)stringBuilder.toString(), (Throwable)jSONException);
        }
        if (map.containsKey((Object)"filename") && map.get((Object)"filename") != null) {
            this.f = map.get((Object)"filename").toString();
        }
        if (map.containsKey((Object)"checksum") && map.get((Object)"checksum") != null) {
            this.g = map.get((Object)"checksum").toString();
        }
        if ((object2 = map.get((Object)"androidProviderAuthority")) != null) {
            string = object2.toString();
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(this.j.getPackageName());
            stringBuilder.append(".ota_update_provider");
            string = stringBuilder.toString();
        }
        this.h = string;
        if (e.e.d.a.a((Context)this.b.context(), (String)"android.permission.WRITE_EXTERNAL_STORAGE") == 0) {
            a.super.a();
            return;
        }
        String[] arrstring = new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"};
        androidx.core.app.a.a((Activity)this.b.activity(), (String[])arrstring, (int)0);
    }

    @Override
    public boolean onRequestPermissionsResult(int n2, String[] arrstring, int[] arrn) {
        if (n2 == 0 && arrn.length > 0) {
            int n3 = arrn.length;
            for (int i2 = 0; i2 < n3; ++i2) {
                if (arrn[i2] == 0) continue;
                EventChannel.EventSink eventSink = this.c;
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("");
                stringBuilder.append(d.e.ordinal());
                eventSink.error(stringBuilder.toString(), null, null);
                this.c = null;
                return false;
            }
            a.super.a();
            return true;
        }
        EventChannel.EventSink eventSink = this.c;
        if (eventSink != null) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("");
            stringBuilder.append(d.e.ordinal());
            eventSink.error(stringBuilder.toString(), null, null);
            this.c = null;
        }
        return false;
    }
}

