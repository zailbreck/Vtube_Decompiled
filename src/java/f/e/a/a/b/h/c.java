/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  f.e.a.a.b.f.a
 *  f.e.a.a.b.h.a
 *  f.e.a.a.b.h.a$a
 *  f.e.a.a.b.j.b
 *  f.e.a.a.b.j.f
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.IdentityHashMap
 *  java.util.Iterator
 *  org.json.JSONObject
 */
package f.e.a.a.b.h;

import android.view.View;
import f.e.a.a.b.e.l;
import f.e.a.a.b.h.a;
import f.e.a.a.b.j.b;
import f.e.a.a.b.j.f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONObject;

public class c
implements a {
    private final a a;

    public c(a a2) {
        this.a = a2;
    }

    ArrayList<View> a() {
        ArrayList arrayList = new ArrayList();
        f.e.a.a.b.f.a a2 = f.e.a.a.b.f.a.d();
        if (a2 != null) {
            Collection collection = a2.b();
            IdentityHashMap identityHashMap = new IdentityHashMap(3 + 2 * collection.size());
            Iterator iterator = collection.iterator();
            while (iterator.hasNext()) {
                int n2;
                View view;
                View view2 = ((l)((Object)iterator.next())).f();
                if (view2 == null || !f.c((View)view2) || (view = view2.getRootView()) == null || identityHashMap.containsKey((Object)view)) continue;
                identityHashMap.put((Object)view, (Object)view);
                float f2 = f.a((View)view);
                for (n2 = arrayList.size(); n2 > 0 && f.a((View)((View)arrayList.get(n2 - 1))) > f2; --n2) {
                }
                arrayList.add(n2, (Object)view);
            }
        }
        return arrayList;
    }

    public JSONObject a(View view) {
        return b.a((int)0, (int)0, (int)0, (int)0);
    }

    public void a(View view, JSONObject jSONObject, a.a a2, boolean bl) {
        Iterator iterator = this.a().iterator();
        while (iterator.hasNext()) {
            a2.a((View)iterator.next(), this.a, jSONObject);
        }
    }
}

