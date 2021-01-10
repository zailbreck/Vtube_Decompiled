/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  f.e.a.a.a.e.a
 *  f.e.a.a.a.g.b
 *  f.e.a.a.a.i.a
 *  f.e.a.a.a.j.b.b
 *  f.e.a.a.a.j.b.b$b
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collection
 *  java.util.HashSet
 *  org.json.JSONObject
 */
package f.e.a.a.a.j.b;

import android.text.TextUtils;
import f.e.a.a.a.d.i;
import f.e.a.a.a.j.b.a;
import f.e.a.a.a.j.b.b;
import java.util.Collection;
import java.util.HashSet;
import org.json.JSONObject;

public class f
extends a {
    public f(b.b b2, HashSet<String> hashSet, JSONObject jSONObject, double d2) {
        super(b2, hashSet, jSONObject, d2);
    }

    private void b(String string) {
        f.e.a.a.a.e.a a2 = f.e.a.a.a.e.a.d();
        if (a2 != null) {
            for (i i2 : a2.a()) {
                if (!this.c.contains((Object)i2.k())) continue;
                i2.l().a(string, this.e);
            }
        }
    }

    protected /* varargs */ String a(Object ... arrobject) {
        if (f.e.a.a.a.g.b.b((JSONObject)this.d, (JSONObject)this.b.b())) {
            return null;
        }
        this.b.a(this.d);
        return this.d.toString();
    }

    protected void a(String string) {
        if (!TextUtils.isEmpty((CharSequence)string)) {
            f.super.b(string);
        }
        b.super.a(string);
    }

    protected /* synthetic */ Object doInBackground(Object[] arrobject) {
        return this.a(arrobject);
    }

    protected /* synthetic */ void onPostExecute(Object object) {
        this.a((String)object);
    }
}

