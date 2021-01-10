/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.AsyncTask
 *  android.os.Handler
 *  java.io.File
 *  java.io.FilenameFilter
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Void
 *  java.util.concurrent.Executor
 */
package io.flutter.embedding.engine.loader;

import android.content.Context;
import android.os.AsyncTask;
import android.os.Handler;
import java.io.File;
import java.io.FilenameFilter;
import java.util.concurrent.Executor;

class ResourceCleaner {
    private static final long DELAY_MS = 5000L;
    private static final String TAG = "ResourceCleaner";
    private final Context mContext;

    ResourceCleaner(Context context) {
        this.mContext = context;
    }

    void start() {
        File file = this.mContext.getCacheDir();
        if (file == null) {
            return;
        }
        final CleanTask cleanTask = new CleanTask(file.listFiles(new FilenameFilter(){

            public boolean accept(File file, String string2) {
                return string2.startsWith(".org.chromium.Chromium.");
            }
        }));
        if (!cleanTask.hasFilesToDelete()) {
            return;
        }
        new Handler().postDelayed(new Runnable(){

            public void run() {
                cleanTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, (Object[])new Void[0]);
            }
        }, 5000L);
    }

    private static class CleanTask
    extends AsyncTask<Void, Void, Void> {
        private final File[] mFilesToDelete;

        CleanTask(File[] arrfile) {
            this.mFilesToDelete = arrfile;
        }

        private void deleteRecursively(File file) {
            if (file.isDirectory()) {
                File[] arrfile = file.listFiles();
                int n2 = arrfile.length;
                for (int i2 = 0; i2 < n2; ++i2) {
                    CleanTask.super.deleteRecursively(arrfile[i2]);
                }
            }
            file.delete();
        }

        protected /* varargs */ Void doInBackground(Void ... arrvoid) {
            for (File file : this.mFilesToDelete) {
                if (!file.exists()) continue;
                CleanTask.super.deleteRecursively(file);
            }
            return null;
        }

        boolean hasFilesToDelete() {
            File[] arrfile = this.mFilesToDelete;
            return arrfile != null && arrfile.length > 0;
        }
    }

}

