/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.File
 *  java.lang.Object
 *  java.util.Comparator
 */
package f.f.a.j.a;

import f.f.a.j.a.d;
import java.io.File;
import java.util.Comparator;

final class e
implements Comparator<File> {
    private e() {
    }

    /* synthetic */ e(d d2) {
    }

    public final /* synthetic */ int compare(Object object, Object object2) {
        long l2;
        File file = (File)object;
        File file2 = (File)object2;
        long l3 = file.lastModified();
        if (l3 < (l2 = file2.lastModified())) {
            return -1;
        }
        return l3 != l2;
    }
}

