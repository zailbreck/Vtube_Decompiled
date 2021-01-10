/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.TargetApi
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.View
 *  android.view.ViewGroup
 *  f.e.a.a.a.f.a
 *  f.e.a.a.a.f.a$a
 *  f.e.a.a.a.g.b
 *  java.lang.Float
 *  java.lang.Object
 *  java.util.ArrayList
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Set
 *  org.json.JSONObject
 */
package f.e.a.a.a.f;

import android.annotation.TargetApi;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import f.e.a.a.a.f.a;
import f.e.a.a.a.g.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

public class d
implements a {
    private final int[] a = new int[2];

    private void a(ViewGroup viewGroup, JSONObject jSONObject, a.a a2) {
        for (int i2 = 0; i2 < viewGroup.getChildCount(); ++i2) {
            a2.a(viewGroup.getChildAt(i2), (a)this, jSONObject);
        }
    }

    @TargetApi(value=21)
    private void b(ViewGroup viewGroup, JSONObject jSONObject, a.a a2) {
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < viewGroup.getChildCount(); ++i2) {
            View view = viewGroup.getChildAt(i2);
            ArrayList arrayList = (ArrayList)hashMap.get((Object)Float.valueOf((float)view.getZ()));
            if (arrayList == null) {
                arrayList = new ArrayList();
                hashMap.put((Object)Float.valueOf((float)view.getZ()), (Object)arrayList);
            }
            arrayList.add((Object)view);
        }
        ArrayList arrayList = new ArrayList((Collection)hashMap.keySet());
        Collections.sort((List)arrayList);
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Iterator iterator2 = ((ArrayList)hashMap.get((Object)((Float)iterator.next()))).iterator();
            while (iterator2.hasNext()) {
                a2.a((View)iterator2.next(), (a)this, jSONObject);
            }
        }
    }

    public JSONObject a(View view) {
        int n2 = view.getWidth();
        int n3 = view.getHeight();
        view.getLocationOnScreen(this.a);
        int[] arrn = this.a;
        return b.a((int)arrn[0], (int)arrn[1], (int)n2, (int)n3);
    }

    public void a(View view, JSONObject jSONObject, a.a a2, boolean bl) {
        if (!(view instanceof ViewGroup)) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup)view;
        if (bl && Build.VERSION.SDK_INT >= 21) {
            d.super.b(viewGroup, jSONObject, a2);
            return;
        }
        d.super.a(viewGroup, jSONObject, a2);
    }
}

