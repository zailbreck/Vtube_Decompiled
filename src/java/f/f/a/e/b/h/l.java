/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Comparable
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.concurrent.ConcurrentHashMap
 */
package f.f.a.e.b.h;

import f.f.a.e.b.h.c;
import f.f.a.e.b.h.g;
import f.f.a.e.b.h.o;
import java.util.concurrent.ConcurrentHashMap;

public abstract class l<T>
implements Comparable<l<T>> {
    private static final String h = l.class.getSimpleName();
    private final int b;
    private final String c;
    protected ConcurrentHashMap<String, String> d = new ConcurrentHashMap();
    private Integer e;
    private boolean f = false;
    private o g;

    public l(int n2, String string, g<T> g2) {
        this.c = string;
        this.b = n2;
        this.g = new c();
    }

    public int a() {
        return 2;
    }

    public final l<?> a(o o2) {
        this.g = o2;
        return this;
    }

    public final void a(String string, String string2) {
        this.d.remove((Object)string);
        this.d.put((Object)string, (Object)string2);
    }

    public /* synthetic */ int compareTo(Object object) {
        int n2;
        l l2 = (l)object;
        int n3 = this.a();
        if (n3 == (n2 = l2.a())) {
            return this.e - l2.e;
        }
        return n2 - n3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        String string = this.f ? "[X] " : "[ ] ";
        stringBuilder.append(string);
        stringBuilder.append(this.c);
        stringBuilder.append(" ");
        stringBuilder.append(this.a());
        stringBuilder.append(" ");
        stringBuilder.append((Object)this.e);
        return stringBuilder.toString();
    }
}

