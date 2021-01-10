/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Environment
 *  java.io.File
 *  java.lang.Object
 *  java.lang.String
 */
package com.kuqicc.future.b.b;

import android.content.Context;
import android.os.Environment;
import com.kuqicc.future.MainActivity;
import com.kuqicc.future.b.b.b;
import com.kuqicc.future.b.b.c;
import h.b.i;
import h.b.j;
import java.io.File;
import m.a.a.e;
import m.a.a.f;

public class c {
    public static i<File> a(String string) {
        return i.a(new b(string));
    }

    static /* synthetic */ void a(String string, j j2) {
        e.b b2 = e.c((Context)MainActivity.a());
        b2.a(string);
        b2.a(100);
        b2.b(Environment.getExternalStoragePublicDirectory((String)Environment.DIRECTORY_PICTURES).getAbsolutePath());
        b2.a(com.kuqicc.future.b.b.a.a);
        b2.a(new f(j2){
            final /* synthetic */ j a;
            {
                this.a = j2;
            }

            public void a(File file) {
                this.a.onSuccess(file);
            }

            public void a(java.lang.Throwable throwable) {
                this.a.a(throwable);
            }

            public void onStart() {
            }
        });
        b2.a();
    }

    static /* synthetic */ boolean b(String string) {
        return true ^ string.toLowerCase().endsWith(".gif");
    }
}

