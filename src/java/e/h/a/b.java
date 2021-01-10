/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.util.Log
 *  androidx.lifecycle.LiveData
 *  androidx.lifecycle.h
 *  androidx.lifecycle.m
 *  androidx.lifecycle.n
 *  androidx.lifecycle.q
 *  androidx.lifecycle.r
 *  androidx.lifecycle.r$a
 *  androidx.lifecycle.s
 *  e.d.h
 *  e.e.j.a
 *  e.h.a.a
 *  e.h.b.a
 *  e.h.b.a$a
 *  java.io.FileDescriptor
 *  java.io.PrintWriter
 *  java.lang.Class
 *  java.lang.Deprecated
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 */
package e.h.a;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.h;
import androidx.lifecycle.m;
import androidx.lifecycle.n;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import androidx.lifecycle.s;
import e.h.b.a;
import java.io.FileDescriptor;
import java.io.PrintWriter;

class b
extends e.h.a.a {
    static boolean c;
    private final h a;
    private final c b;

    b(h h2, s s2) {
        this.a = h2;
        this.b = c.a(s2);
    }

    public void a() {
        this.b.c();
    }

    @Deprecated
    public void a(String string2, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] arrstring) {
        this.b.a(string2, fileDescriptor, printWriter, arrstring);
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(128);
        stringBuilder.append("LoaderManager{");
        stringBuilder.append(Integer.toHexString((int)System.identityHashCode((Object)((Object)this))));
        stringBuilder.append(" in ");
        e.e.j.a.a((Object)this.a, (StringBuilder)stringBuilder);
        stringBuilder.append("}}");
        return stringBuilder.toString();
    }

    static class b<D>
    implements n<D> {
    }

    static class c
    extends q {
        private static final r.a c = new r.a(){

            public <T extends q> T a(Class<T> class_) {
                return (T)((Object)new c());
            }
        };
        private e.d.h<e.h.a.b$a> b = new e.d.h();

        c() {
        }

        static c a(s s2) {
            return (c)new r(s2, c).a(c.class);
        }

        public void a(String string2, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] arrstring) {
            if (this.b.b() > 0) {
                printWriter.print(string2);
                printWriter.println("Loaders:");
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(string2);
                stringBuilder.append("    ");
                String string3 = stringBuilder.toString();
                if (this.b.b() <= 0) {
                    return;
                }
                e.h.a.b$a a2 = (Object)this.b.e(0);
                printWriter.print(string2);
                printWriter.print("  #");
                printWriter.print(this.b.c(0));
                printWriter.print(": ");
                printWriter.println(a2.toString());
                a2.a(string3, fileDescriptor, printWriter, arrstring);
                throw null;
            }
        }

        protected void b() {
            super.b();
            if (this.b.b() <= 0) {
                this.b.a();
                return;
            }
            ((Object)this.b.e(0)).a(true);
            throw null;
        }

        void c() {
            int n2 = this.b.b();
            for (int i2 = 0; i2 < n2; ++i2) {
                ((Object)this.b.e(i2)).c();
            }
        }

    }

}

