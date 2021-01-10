/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.io.InputStream
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package f.a.a.a.a.j;

import f.a.a.a.a.h.g.c;
import java.io.InputStream;
import java.util.Map;

abstract class d {
    private Map<String, String> a = new c();
    private InputStream b;
    private long c;
    private String d;

    d() {
    }

    public void a() {
        InputStream inputStream = this.b;
        if (inputStream != null) {
            inputStream.close();
            this.b = null;
        }
    }

    public void a(long l2) {
        this.c = l2;
    }

    public void a(InputStream inputStream) {
        this.b = inputStream;
    }

    public void a(String string, String string2) {
        this.a.put((Object)string, (Object)string2);
    }

    public void a(Map<String, String> map) {
        Map<String, String> map2;
        if (this.a == null) {
            this.a = new c();
        }
        if ((map2 = this.a) != null && map2.size() > 0) {
            this.a.clear();
        }
        this.a.putAll(map);
    }

    public InputStream b() {
        return this.b;
    }

    public long c() {
        return this.c;
    }

    public Map<String, String> d() {
        return this.a;
    }

    public String e() {
        return this.d;
    }
}

