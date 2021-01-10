/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.Thread
 *  java.util.concurrent.Executors
 *  java.util.concurrent.ThreadFactory
 */
package f.a.a.a.a.j;

import f.a.a.a.a.j.e;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class c {
    static {
        Executors.newFixedThreadPool((int)5, (ThreadFactory)new ThreadFactory(){

            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, "oss-android-extensionapi-thread");
            }
        });
    }

    public c(e e2) {
    }

}

