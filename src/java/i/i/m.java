/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Comparable
 *  java.util.Collections
 *  java.util.List
 */
package i.i;

import i.i.l;
import i.k.b.d;
import java.util.Collections;
import java.util.List;

class m
extends l {
    public static <T extends Comparable<? super T>> void a(List<T> list) {
        d.c(list, "$this$sort");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }
}

