/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  androidx.lifecycle.h
 *  androidx.lifecycle.s
 *  androidx.lifecycle.t
 *  java.io.FileDescriptor
 *  java.io.PrintWriter
 *  java.lang.Deprecated
 *  java.lang.Object
 *  java.lang.String
 */
package e.h.a;

import androidx.lifecycle.h;
import androidx.lifecycle.s;
import androidx.lifecycle.t;
import e.h.a.b;
import java.io.FileDescriptor;
import java.io.PrintWriter;

public abstract class a {
    public static <T extends h & t> a a(T t2) {
        return new b(t2, ((t)t2).getViewModelStore());
    }

    public abstract void a();

    @Deprecated
    public abstract void a(String var1, FileDescriptor var2, PrintWriter var3, String[] var4);
}

