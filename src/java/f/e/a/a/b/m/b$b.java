/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.e.a.a.b.m.b
 *  f.e.a.a.b.m.b$c
 *  f.e.a.a.b.m.b$c$b
 *  java.lang.String
 *  java.util.Collection
 *  java.util.HashSet
 *  org.json.JSONObject
 */
package f.e.a.a.b.m;

import f.e.a.a.b.m.b;
import java.util.Collection;
import java.util.HashSet;
import org.json.JSONObject;

public abstract class b$b
extends b.c {
    protected final HashSet<String> c;
    protected final JSONObject d;
    protected final long e;

    public b$b(b.c.b b2, HashSet<String> hashSet, JSONObject jSONObject, long l2) {
        super(b2);
        this.c = new HashSet(hashSet);
        this.d = jSONObject;
        this.e = l2;
    }
}

