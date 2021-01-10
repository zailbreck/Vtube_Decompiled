/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Appendable
 *  java.lang.CharSequence
 *  java.lang.Iterable
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Iterator
 */
package i.m;

import i.m.f;
import i.m.g;
import i.m.h;
import i.n.d;
import java.util.Iterator;

class g
extends f {
    public static <T, R> i.m.a<R> a(i.m.a<? extends T> a2, i.k.a.a<? super T, ? extends R> a3) {
        i.k.b.d.c(a2, "$this$map");
        i.k.b.d.c(a3, "transform");
        return new h<T, R>(a2, a3);
    }

    public static final <T, A extends Appendable> A a(i.m.a<? extends T> a2, A a3, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int n2, CharSequence charSequence4, i.k.a.a<? super T, ? extends CharSequence> a4) {
        i.k.b.d.c(a2, "$this$joinTo");
        i.k.b.d.c(a3, "buffer");
        i.k.b.d.c((Object)charSequence, "separator");
        i.k.b.d.c((Object)charSequence2, "prefix");
        i.k.b.d.c((Object)charSequence3, "postfix");
        i.k.b.d.c((Object)charSequence4, "truncated");
        a3.append(charSequence2);
        Iterator<? extends T> iterator = a2.iterator();
        int n3 = 0;
        while (iterator.hasNext()) {
            Object object = iterator.next();
            if (++n3 > 1) {
                a3.append(charSequence);
            }
            if (n2 >= 0 && n3 > n2) break;
            d.a(a3, object, a4);
        }
        if (n2 >= 0 && n3 > n2) {
            a3.append(charSequence4);
        }
        a3.append(charSequence3);
        return a3;
    }

    public static <T> Iterable<T> a(i.m.a<? extends T> a2) {
        i.k.b.d.c(a2, "$this$asIterable");
        return new Iterable<T>(a2){
            final /* synthetic */ i.m.a b;
            {
                this.b = a2;
            }

            public Iterator<T> iterator() {
                return this.b.iterator();
            }
        };
    }

    public static final <T> String a(i.m.a<? extends T> a2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int n2, CharSequence charSequence4, i.k.a.a<? super T, ? extends CharSequence> a3) {
        i.k.b.d.c(a2, "$this$joinToString");
        i.k.b.d.c((Object)charSequence, "separator");
        i.k.b.d.c((Object)charSequence2, "prefix");
        i.k.b.d.c((Object)charSequence3, "postfix");
        i.k.b.d.c((Object)charSequence4, "truncated");
        StringBuilder stringBuilder = new StringBuilder();
        g.a(a2, stringBuilder, charSequence, charSequence2, charSequence3, n2, charSequence4, a3);
        String string = stringBuilder.toString();
        i.k.b.d.b(string, "joinTo(StringBuilder(), \u2026ed, transform).toString()");
        return string;
    }

    public static /* synthetic */ String a(i.m.a a2, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int n2, CharSequence charSequence4, i.k.a.a a3, int n3, Object object) {
        if ((n3 & 1) != 0) {
            charSequence = ", ";
        }
        int n4 = n3 & 2;
        String string = "";
        String string2 = n4 != 0 ? string : charSequence2;
        if ((n3 & 4) == 0) {
            string = charSequence3;
        }
        int n5 = (n3 & 8) != 0 ? -1 : n2;
        if ((n3 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        if ((n3 & 32) != 0) {
            a3 = null;
        }
        i.k.a.a a4 = a3;
        return g.a(a2, charSequence, string2, string, n5, charSequence5, a4);
    }
}

