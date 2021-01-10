/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.util.Collection
 */
package i.i;

import i.i.i;
import i.k.b.d;
import java.util.Collection;

class j
extends i {
    public static <T> int a(Iterable<? extends T> iterable, int n2) {
        d.c(iterable, "$this$collectionSizeOrDefault");
        if (iterable instanceof Collection) {
            n2 = ((Collection)iterable).size();
        }
        return n2;
    }
}

