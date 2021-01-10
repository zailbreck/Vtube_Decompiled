/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package f.f.a.e.b.a;

import android.text.TextUtils;
import f.f.a.e.e.a;
import f.f.a.e.f.h;
import f.f.a.e.f.r;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public class c {
    private static final String a = "c";
    public static Map<String, Long> b = new HashMap();
    public static Map<String, List<f.f.a.e.b.e.a>> c;
    public static Map<String, List<f.f.a.e.b.e.a>> d;
    public static Map<String, List<f.f.a.e.b.e.a>> e;
    public static Map<String, List<f.f.a.e.b.e.a>> f;
    public static Map<String, List<f.f.a.e.b.e.a>> g;
    public static Map<String, List<f.f.a.e.b.e.a>> h;
    public static Map<String, List<f.f.a.e.b.e.a>> i;
    public static Map<String, List<f.f.a.e.b.e.a>> j;

    static {
        new HashMap();
        c = new HashMap();
        d = new HashMap();
        e = new HashMap();
        f = new HashMap();
        g = new HashMap();
        h = new HashMap();
        i = new HashMap();
        j = new HashMap();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String a(String string, String string2) {
        List list;
        int n2;
        Map<String, List<f.f.a.e.b.e.a>> map;
        JSONArray jSONArray = new JSONArray();
        if (TextUtils.isEmpty((CharSequence)string2)) {
            if (c.containsKey((Object)string)) {
                map = c;
            } else if (d.containsKey((Object)string)) {
                map = d;
            } else if (e.containsKey((Object)string)) {
                map = e;
            } else if (f.containsKey((Object)string)) {
                map = f;
            } else if (g.containsKey((Object)string)) {
                map = g;
            } else if (h.containsKey((Object)string)) {
                map = h;
            } else if (i.containsKey((Object)string)) {
                map = i;
            } else {
                boolean bl = j.containsKey((Object)string);
                map = null;
                if (bl) {
                    map = j;
                }
            }
        } else {
            map = c.a(string2);
        }
        if (map == null) return jSONArray.toString();
        if (!r.b(string) || !map.containsKey((Object)string) || (list = (List)map.get((Object)string)) == null) return jSONArray.toString();
        try {
            if (list.size() <= 0) return jSONArray.toString();
            n2 = 0;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        do {
            if (n2 >= list.size()) return jSONArray.toString();
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("cid", (Object)((f.f.a.e.b.e.a)list.get(n2)).a());
            jSONObject.put("rid", (Object)((f.f.a.e.b.e.a)list.get(n2)).b());
            jSONArray.put((Object)jSONObject);
            ++n2;
        } while (true);
        return jSONArray.toString();
    }

    private static Map<String, List<f.f.a.e.b.e.a>> a(String string) {
        int n2;
        block20 : {
            switch (string.hashCode()) {
                default: {
                    break;
                }
                case 1844104930: {
                    if (!string.equals((Object)"interactive")) break;
                    n2 = 2;
                    break block20;
                }
                case 604727084: {
                    if (!string.equals((Object)"interstitial")) break;
                    n2 = 4;
                    break block20;
                }
                case 538816457: {
                    if (!string.equals((Object)"h5_native")) break;
                    n2 = 7;
                    break block20;
                }
                case -895866265: {
                    if (!string.equals((Object)"splash")) break;
                    n2 = 6;
                    break block20;
                }
                case -934326481: {
                    if (!string.equals((Object)"reward")) break;
                    n2 = 1;
                    break block20;
                }
                case -1052618729: {
                    if (!string.equals((Object)"native")) break;
                    n2 = 0;
                    break block20;
                }
                case -1396342996: {
                    if (!string.equals((Object)"banner")) break;
                    n2 = 5;
                    break block20;
                }
                case -1611837702: {
                    if (!string.equals((Object)"videofeeds")) break;
                    n2 = 3;
                    break block20;
                }
            }
            n2 = -1;
        }
        switch (n2) {
            default: {
                return null;
            }
            case 7: {
                return j;
            }
            case 6: {
                return i;
            }
            case 5: {
                return h;
            }
            case 4: {
                return g;
            }
            case 3: {
                return f;
            }
            case 2: {
                return e;
            }
            case 1: {
                return d;
            }
            case 0: 
        }
        return c;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(String string, a a2, String string2) {
        Map<String, List<f.f.a.e.b.e.a>> map = c.a(string2);
        if (a2 == null) return;
        if (map == null) return;
        try {
            if (TextUtils.isEmpty((CharSequence)a2.e())) return;
            f.f.a.e.b.e.a a3 = new f.f.a.e.b.e.a(a2.e(), a2.L0());
            if (!map.containsKey((Object)string)) {
                ArrayList arrayList = new ArrayList();
                arrayList.add((Object)a3);
                map.put((Object)string, (Object)arrayList);
                return;
            }
            List list = (List)map.get((Object)string);
            if (list != null && list.size() == 20) {
                list.remove(0);
            }
            if (list == null) return;
            list.add((Object)a3);
            return;
        }
        catch (Throwable throwable) {
            h.b(a, throwable.getMessage(), throwable);
        }
    }
}

