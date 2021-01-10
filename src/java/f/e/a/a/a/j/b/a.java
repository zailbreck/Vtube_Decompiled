/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.e.a.a.a.j.b.b
 *  f.e.a.a.a.j.b.b$b
 *  java.lang.String
 *  java.util.Collection
 *  java.util.HashSet
 *  org.json.JSONObject
 */
package f.e.a.a.a.j.b;

import f.e.a.a.a.j.b.b;
import java.util.Collection;
import java.util.HashSet;
import org.json.JSONObject;

public abstract class a
extends b {
    protected final HashSet<String> c;
    protected final JSONObject d;
    protected final double e;

    public a(b.b b2, HashSet<String> hashSet, JSONObject jSONObject, double d2) {
        super(b2);
        this.c = new HashSet(hashSet);
        this.d = jSONObject;
        this.e = d2;
    }
}

