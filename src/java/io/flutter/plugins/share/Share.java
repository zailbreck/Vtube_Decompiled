/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.Intent
 *  android.content.pm.ActivityInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.ResolveInfo
 *  android.net.Uri
 *  android.os.Parcelable
 *  e.e.d.b
 *  java.io.File
 *  java.io.FileInputStream
 *  java.io.FileOutputStream
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.Iterator
 *  java.util.List
 */
package io.flutter.plugins.share;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Parcelable;
import e.e.d.b;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Share {
    private Activity activity;
    private Context context;

    Share(Context context, Activity activity) {
        this.context = context;
        this.activity = activity;
    }

    private void clearExternalShareFolder() {
        File file = this.getExternalShareFolder();
        if (file.exists()) {
            File[] arrfile = file.listFiles();
            int n2 = arrfile.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                arrfile[i2].delete();
            }
            file.delete();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static void copy(File file, File file2) {
        FileInputStream fileInputStream = new FileInputStream(file);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            int n2;
            byte[] arrby = new byte[1024];
            while ((n2 = fileInputStream.read(arrby)) > 0) {
                fileOutputStream.write(arrby, 0, n2);
            }
        }
        catch (Throwable throwable) {
            fileOutputStream.close();
            throw throwable;
        }
        try {
            fileOutputStream.close();
            return;
        }
        finally {
            fileInputStream.close();
        }
    }

    private File copyToExternalShareFolder(File file) {
        File file2 = Share.super.getExternalShareFolder();
        if (!file2.exists()) {
            file2.mkdirs();
        }
        File file3 = new File(file2, file.getName());
        Share.copy(file, file3);
        return file3;
    }

    /*
     * Exception decompiling
     */
    private boolean fileIsOnExternal(File var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Underrun type stack
        // org.benf.cfr.reader.b.a.c.e.a(StackSim.java:35)
        // org.benf.cfr.reader.b.b.af.a(OperationFactoryPop.java:20)
        // org.benf.cfr.reader.b.b.e.a(JVMInstr.java:315)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:195)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1133)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:607)
        // java.lang.Thread.run(Thread.java:761)
        throw new IllegalStateException("Decompilation failed");
    }

    private Context getContext() {
        Activity activity = this.activity;
        if (activity != null) {
            return activity;
        }
        Context context = this.context;
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Both context and activity are null");
    }

    private File getExternalShareFolder() {
        return new File(this.getContext().getExternalCacheDir(), "share");
    }

    private String getMimeTypeBase(String string2) {
        if (string2 != null && string2.contains((CharSequence)"/")) {
            return string2.substring(0, string2.indexOf("/"));
        }
        return "*";
    }

    private ArrayList<Uri> getUrisForPaths(List<String> list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            File file = new File((String)iterator.next());
            if (!Share.super.fileIsOnExternal(file)) {
                file = Share.super.copyToExternalShareFolder(file);
            }
            Context context = Share.super.getContext();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(Share.super.getContext().getPackageName());
            stringBuilder.append(".flutter.share_provider");
            arrayList.add((Object)b.getUriForFile((Context)context, (String)stringBuilder.toString(), (File)file));
        }
        return arrayList;
    }

    private String reduceMimeTypes(List<String> list) {
        int n2;
        int n3 = list.size();
        if (n3 > (n2 = 1)) {
            String string2 = (String)list.get(0);
            while (n2 < list.size()) {
                String string3 = (String)list.get(n2);
                if (!string2.equals((Object)string3)) {
                    if (Share.super.getMimeTypeBase(string3).equals((Object)Share.super.getMimeTypeBase(string2))) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append(Share.super.getMimeTypeBase(string3));
                        stringBuilder.append("/*");
                        string2 = stringBuilder.toString();
                    } else {
                        return "*/*";
                    }
                }
                ++n2;
            }
            return string2;
        }
        if (list.size() == n2) {
            return (String)list.get(0);
        }
        return "*/*";
    }

    private void startActivity(Intent intent) {
        Activity activity = this.activity;
        if (activity != null) {
            activity.startActivity(intent);
            return;
        }
        if (this.context != null) {
            intent.addFlags(268435456);
            this.context.startActivity(intent);
            return;
        }
        throw new IllegalStateException("Both context and activity are null");
    }

    void setActivity(Activity activity) {
        this.activity = activity;
    }

    void share(String string2, String string3) {
        if (string2 != null && !string2.isEmpty()) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.TEXT", string2);
            intent.putExtra("android.intent.extra.SUBJECT", string3);
            intent.setType("text/plain");
            Share.super.startActivity(Intent.createChooser((Intent)intent, null));
            return;
        }
        throw new IllegalArgumentException("Non-empty text expected");
    }

    void shareFiles(List<String> list, List<String> list2, String string2, String string3) {
        IllegalArgumentException illegalArgumentException;
        if (list != null && !list.isEmpty()) {
            String string4;
            Share.super.clearExternalShareFolder();
            ArrayList<Uri> arrayList = Share.super.getUrisForPaths(list);
            Intent intent = new Intent();
            if (arrayList.isEmpty()) {
                this.share(string2, string3);
                return;
            }
            if (arrayList.size() == 1) {
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.STREAM", (Parcelable)arrayList.get(0));
                string4 = !list2.isEmpty() && list2.get(0) != null ? (String)list2.get(0) : "*/*";
            } else {
                intent.setAction("android.intent.action.SEND_MULTIPLE");
                intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                string4 = Share.super.reduceMimeTypes(list2);
            }
            intent.setType(string4);
            if (string2 != null) {
                intent.putExtra("android.intent.extra.TEXT", string2);
            }
            if (string3 != null) {
                intent.putExtra("android.intent.extra.SUBJECT", string3);
            }
            intent.addFlags(1);
            Intent intent2 = Intent.createChooser((Intent)intent, null);
            Iterator iterator = Share.super.getContext().getPackageManager().queryIntentActivities(intent2, 65536).iterator();
            while (iterator.hasNext()) {
                String string5 = ((ResolveInfo)iterator.next()).activityInfo.packageName;
                for (Uri uri : arrayList) {
                    Share.super.getContext().grantUriPermission(string5, uri, 3);
                }
            }
            Share.super.startActivity(intent2);
            return;
        }
        illegalArgumentException = new IllegalArgumentException("Non-empty path expected");
        throw illegalArgumentException;
    }
}

