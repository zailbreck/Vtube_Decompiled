/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.util.Log
 *  java.lang.Character
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package f.h.a;

import android.util.Log;
import f.h.a.e.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class d {
    private final String a;
    private final List<Object> b;

    public d(String string2, List<Object> arrayList) {
        this.a = string2;
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        this.b = arrayList;
    }

    private static String a(Object object) {
        if (object == null) {
            return null;
        }
        if (object instanceof byte[]) {
            ArrayList arrayList = new ArrayList();
            byte[] arrby = (byte[])object;
            int n2 = arrby.length;
            for (int i2 = 0; i2 < n2; ++i2) {
                arrayList.add((Object)arrby[i2]);
            }
            return arrayList.toString();
        }
        if (object instanceof Map) {
            return d.a((Map<Object, Object>)((Map)object)).toString();
        }
        return object.toString();
    }

    private static Map<String, Object> a(Map<Object, Object> map) {
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            Object object = entry.getValue();
            Map<String, Object> map2 = object instanceof Map ? d.a((Map<Object, Object>)((Map)object)) : d.a(object);
            hashMap.put((Object)d.a(entry.getKey()), map2);
        }
        return hashMap;
    }

    private String[] a(List<Object> list) {
        return (String[])d.super.c(list).toArray((Object[])new String[0]);
    }

    private static Object b(Object arrby) {
        if (arrby == null) {
            return null;
        }
        if (a.c) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("arg ");
            stringBuilder.append(arrby.getClass().getCanonicalName());
            stringBuilder.append(" ");
            stringBuilder.append(d.a(arrby));
            Log.d((String)"Sqflite", (String)stringBuilder.toString());
        }
        if (arrby instanceof List) {
            List list = (List)arrby;
            byte[] arrby2 = new byte[list.size()];
            for (int i2 = 0; i2 < list.size(); ++i2) {
                arrby2[i2] = (byte)((Integer)list.get(i2)).intValue();
            }
            arrby = arrby2;
        }
        if (a.c) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("arg ");
            stringBuilder.append(arrby.getClass().getCanonicalName());
            stringBuilder.append(" ");
            stringBuilder.append(d.a(arrby));
            Log.d((String)"Sqflite", (String)stringBuilder.toString());
        }
        return arrby;
    }

    private Object[] b(List<Object> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                arrayList.add(d.b(iterator.next()));
            }
        }
        return arrayList.toArray(new Object[0]);
    }

    private List<String> c(List<Object> list) {
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            Iterator iterator = list.iterator();
            while (iterator.hasNext()) {
                arrayList.add((Object)d.a(iterator.next()));
            }
        }
        return arrayList;
    }

    public String[] a() {
        return this.a(this.b);
    }

    public List<Object> b() {
        return this.b;
    }

    public String c() {
        return this.a;
    }

    public Object[] d() {
        return this.b(this.b);
    }

    public d e() {
        if (this.b.size() == 0) {
            return this;
        }
        StringBuilder stringBuilder = new StringBuilder();
        ArrayList arrayList = new ArrayList();
        int n2 = this.a.length();
        int n3 = 0;
        int n4 = 0;
        for (int i2 = 0; i2 < n2; ++i2) {
            char c2 = this.a.charAt(i2);
            if (c2 == '?') {
                int n5 = i2 + 1;
                if (n5 < n2 && Character.isDigit((char)this.a.charAt(n5))) {
                    return this;
                }
                ++n3;
                if (n4 >= this.b.size()) {
                    return this;
                }
                List<Object> list = this.b;
                int n6 = n4 + 1;
                Object object = list.get(n4);
                if (!(object instanceof Integer) && !(object instanceof Long)) {
                    arrayList.add(object);
                    n4 = n6;
                } else {
                    stringBuilder.append(object.toString());
                    n4 = n6;
                    continue;
                }
            }
            stringBuilder.append(c2);
        }
        if (n3 != this.b.size()) {
            return this;
        }
        return new d(stringBuilder.toString(), (List<Object>)arrayList);
    }

    public boolean equals(Object object) {
        if (object instanceof d) {
            d d2 = (d)object;
            String string2 = this.a;
            if (string2 != null ? !string2.equals((Object)d2.a) : d2.a != null) {
                return false;
            }
            if (this.b.size() != d2.b.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.b.size(); ++i2) {
                if (!(this.b.get(i2) instanceof byte[] && d2.b.get(i2) instanceof byte[] ? !Arrays.equals((byte[])((byte[])this.b.get(i2)), (byte[])((byte[])d2.b.get(i2))) : !this.b.get(i2).equals(d2.b.get(i2)))) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        String string2 = this.a;
        if (string2 != null) {
            return string2.hashCode();
        }
        return 0;
    }

    public String toString() {
        String string2;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.a);
        List<Object> list = this.b;
        if (list != null && !list.isEmpty()) {
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(" ");
            stringBuilder2.append(this.c(this.b));
            string2 = stringBuilder2.toString();
        } else {
            string2 = "";
        }
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }
}

