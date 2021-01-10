/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 */
package f.h.a.f;

import f.h.a.f.g;
import io.flutter.plugin.common.MethodChannel;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class c
extends f.h.a.f.a {
    final Map<String, Object> a;
    final a b;
    final boolean c;

    public c(Map<String, Object> map, boolean bl) {
        this.b = new g((c)this){
            Object a;
            String b;
            String c;
            Object d;

            @Override
            public void error(String string, String string2, Object object) {
                this.b = string;
                this.c = string2;
                this.d = object;
            }

            @Override
            public void success(Object object) {
                this.a = object;
            }
        };
        this.a = map;
        this.c = bl;
    }

    @Override
    public <T> T a(String string) {
        return (T)this.a.get((Object)string);
    }

    public void a(MethodChannel.Result result) {
        a a2 = this.b;
        result.error(a2.b, a2.c, a2.d);
    }

    public void a(List<Map<String, Object>> list) {
        if (!this.b()) {
            list.add(this.g());
        }
    }

    public void b(List<Map<String, Object>> list) {
        if (!this.b()) {
            list.add(this.h());
        }
    }

    @Override
    public boolean b() {
        return this.c;
    }

    @Override
    public g e() {
        return this.b;
    }

    public String f() {
        return (String)this.a.get((Object)"method");
    }

    public Map<String, Object> g() {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        hashMap2.put((Object)"code", (Object)this.b.b);
        hashMap2.put((Object)"message", (Object)this.b.c);
        hashMap2.put((Object)"data", this.b.d);
        hashMap.put((Object)"error", (Object)hashMap2);
        return hashMap;
    }

    public Map<String, Object> h() {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"result", this.b.a);
        return hashMap;
    }

}

