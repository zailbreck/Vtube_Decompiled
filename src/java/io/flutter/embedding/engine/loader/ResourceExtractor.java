/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.res.AssetManager
 *  android.os.AsyncTask
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.io.File
 *  java.io.FilenameFilter
 *  java.io.InputStream
 *  java.io.OutputStream
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Void
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.concurrent.CancellationException
 *  java.util.concurrent.ExecutionException
 *  java.util.concurrent.Executor
 */
package io.flutter.embedding.engine.loader;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.os.AsyncTask;
import android.os.Build;
import java.io.File;
import java.io.FilenameFilter;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

class ResourceExtractor {
    private static final String[] SUPPORTED_ABIS = ResourceExtractor.getSupportedAbis();
    private static final String TAG = "ResourceExtractor";
    private static final String TIMESTAMP_PREFIX = "res_timestamp-";
    private final AssetManager mAssetManager;
    private final String mDataDirPath;
    private ExtractTask mExtractTask;
    private final PackageManager mPackageManager;
    private final String mPackageName;
    private final HashSet<String> mResources;

    ResourceExtractor(String string2, String string3, PackageManager packageManager, AssetManager assetManager) {
        this.mDataDirPath = string2;
        this.mPackageName = string3;
        this.mPackageManager = packageManager;
        this.mAssetManager = assetManager;
        this.mResources = new HashSet();
    }

    static /* synthetic */ String access$000(File file, PackageManager packageManager, String string2) {
        return ResourceExtractor.checkTimestamp(file, packageManager, string2);
    }

    static /* synthetic */ void access$100(String string2, HashSet hashSet) {
        ResourceExtractor.deleteFiles(string2, (HashSet<String>)hashSet);
    }

    static /* synthetic */ void access$200(InputStream inputStream, OutputStream outputStream) {
        ResourceExtractor.copy(inputStream, outputStream);
    }

    private static String checkTimestamp(File file, PackageManager packageManager, String string2) {
        PackageInfo packageInfo;
        block5 : {
            try {
                packageInfo = packageManager.getPackageInfo(string2, 0);
                if (packageInfo != null) break block5;
                return TIMESTAMP_PREFIX;
            }
            catch (PackageManager.NameNotFoundException nameNotFoundException) {
                return TIMESTAMP_PREFIX;
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(TIMESTAMP_PREFIX);
        stringBuilder.append(ResourceExtractor.getVersionCode(packageInfo));
        stringBuilder.append("-");
        stringBuilder.append(packageInfo.lastUpdateTime);
        String string3 = stringBuilder.toString();
        String[] arrstring = ResourceExtractor.getExistingTimestamps(file);
        if (arrstring == null) {
            return string3;
        }
        arrstring.length;
        if (arrstring.length == 1) {
            if (!string3.equals((Object)arrstring[0])) {
                return string3;
            }
            return null;
        }
        return string3;
    }

    private static void copy(InputStream inputStream, OutputStream outputStream) {
        int n2;
        byte[] arrby = new byte[16384];
        while ((n2 = inputStream.read(arrby)) >= 0) {
            outputStream.write(arrby, 0, n2);
        }
    }

    private static void deleteFiles(String string2, HashSet<String> hashSet) {
        File file = new File(string2);
        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()) {
            File file2 = new File(file, (String)iterator.next());
            if (!file2.exists()) continue;
            file2.delete();
        }
        String[] arrstring = ResourceExtractor.getExistingTimestamps(file);
        if (arrstring == null) {
            return;
        }
        int n2 = arrstring.length;
        for (int i2 = 0; i2 < n2; ++i2) {
            new File(file, arrstring[i2]).delete();
        }
    }

    private static String[] getExistingTimestamps(File file) {
        return file.list(new FilenameFilter(){

            public boolean accept(File file, String string2) {
                return string2.startsWith(ResourceExtractor.TIMESTAMP_PREFIX);
            }
        });
    }

    private static String[] getSupportedAbis() {
        if (Build.VERSION.SDK_INT >= 21) {
            return Build.SUPPORTED_ABIS;
        }
        Object[] arrobject = new String[]{Build.CPU_ABI, Build.CPU_ABI2};
        ArrayList arrayList = new ArrayList((Collection)Arrays.asList((Object[])arrobject));
        arrayList.removeAll((Collection)Arrays.asList((Object[])new String[]{null, ""}));
        return (String[])arrayList.toArray((Object[])new String[0]);
    }

    static long getVersionCode(PackageInfo packageInfo) {
        if (Build.VERSION.SDK_INT >= 28) {
            return packageInfo.getLongVersionCode();
        }
        return packageInfo.versionCode;
    }

    ResourceExtractor addResource(String string2) {
        this.mResources.add((Object)string2);
        return this;
    }

    ResourceExtractor addResources(Collection<String> collection) {
        this.mResources.addAll(collection);
        return this;
    }

    ResourceExtractor start() {
        ExtractTask extractTask;
        this.mExtractTask = extractTask = new ExtractTask(this.mDataDirPath, this.mResources, this.mPackageName, this.mPackageManager, this.mAssetManager);
        this.mExtractTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
        return this;
    }

    void waitForCompletion() {
        ExtractTask extractTask = this.mExtractTask;
        if (extractTask == null) {
            return;
        }
        try {
            extractTask.get();
            return;
        }
        catch (InterruptedException | CancellationException | ExecutionException throwable) {
            ResourceExtractor.deleteFiles(this.mDataDirPath, this.mResources);
            return;
        }
    }

    private static class ExtractTask
    extends AsyncTask<Void, Void, Void> {
        private final AssetManager mAssetManager;
        private final String mDataDirPath;
        private final PackageManager mPackageManager;
        private final String mPackageName;
        private final HashSet<String> mResources;

        ExtractTask(String string2, HashSet<String> hashSet, String string3, PackageManager packageManager, AssetManager assetManager) {
            this.mDataDirPath = string2;
            this.mResources = hashSet;
            this.mAssetManager = assetManager;
            this.mPackageName = string3;
            this.mPackageManager = packageManager;
        }

        /*
         * Exception decompiling
         */
        private boolean extractAPK(File var1) {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl5 : ALOAD_2 : trying to set 1 previously set to 0
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
            // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
            // org.benf.cfr.reader.entities.g.p(Method.java:396)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
            // org.benf.cfr.reader.entities.d.c(ClassFile.java:773)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:870)
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

        /*
         * Exception decompiling
         */
        protected /* varargs */ Void doInBackground(Void ... var1) {
            // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
            // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl44 : ACONST_NULL : trying to set 0 previously set to 1
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
            // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
            // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
            // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
            // org.benf.cfr.reader.entities.g.p(Method.java:396)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
            // org.benf.cfr.reader.entities.d.c(ClassFile.java:773)
            // org.benf.cfr.reader.entities.d.e(ClassFile.java:870)
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
    }

}

