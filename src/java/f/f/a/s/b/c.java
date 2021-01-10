/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.List
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package f.f.a.s.b;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

public final class c {
    private int a;
    private List<Integer> b;

    private c(int n2, List<Integer> list) {
        this.a = n2;
        this.b = list;
    }

    public static c a(JSONObject jSONObject) {
        ArrayList arrayList;
        c c2;
        int n2;
        block7 : {
            Object[] arrobject = new Integer[]{1, 2, 3, 4};
            c2 = new c(1, (List<Integer>)Arrays.asList((Object[])arrobject));
            if (jSONObject == null) {
                return c2;
            }
            n2 = jSONObject.optInt("type");
            arrayList = new ArrayList();
            JSONArray jSONArray = jSONObject.optJSONArray("value");
            if (jSONArray == null) break block7;
            int n3 = jSONArray.length();
            int n4 = 0;
            if (n3 <= 0) break block7;
            do {
                if (n4 >= jSONArray.length()) break;
                arrayList.add((Object)jSONArray.optInt(n4));
                ++n4;
            } while (true);
        }
        try {
            c c3 = new c(n2, (List<Integer>)arrayList);
            return c3;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return c2;
        }
    }

    public final int a() {
        return this.a;
    }

    public final List<Integer> b() {
        return this.b;
    }
}

