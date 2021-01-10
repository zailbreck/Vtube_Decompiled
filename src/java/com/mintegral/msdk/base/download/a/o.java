/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Process
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.concurrent.ThreadFactory
 */
package com.mintegral.msdk.base.download.a;

import android.os.Process;
import java.util.concurrent.ThreadFactory;

public final class o
implements ThreadFactory {
    private final int b;

    o(int n2) {
        this.b = n2;
    }

    public final Thread newThread(final Runnable runnable) {
        Thread thread = new Thread(new Runnable(){

            public final void run() {
                try {
                    Process.setThreadPriority((int)o.this.b);
                }
                catch (Throwable throwable) {}
                runnable.run();
            }
        });
        thread.setName("mtg_download_thread");
        return thread;
    }

}

