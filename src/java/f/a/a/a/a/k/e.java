/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 */
package f.a.a.a.a.k;

import java.util.Map;

public class e {
    private int a;
    private Map<String, String> b;
    private String c;
    private Long d;
    private Long e;

    public Long a() {
        return this.d;
    }

    public void a(int n2) {
        this.a = n2;
    }

    public void a(Long l2) {
        if (l2 != null && l2 != 0L) {
            this.d = l2;
        }
    }

    public void a(String string) {
        this.c = string;
    }

    public void a(Map<String, String> map) {
        this.b = map;
    }

    public String b() {
        return this.c;
    }

    public void b(Long l2) {
        if (l2 != null && l2 != 0L) {
            this.e = l2;
        }
    }

    public Map<String, String> c() {
        return this.b;
    }

    public Long d() {
        return this.e;
    }

    public String toString() {
        Object[] arrobject = new Object[]{super.toString(), this.a, this.b.toString(), this.c};
        return String.format((String)"OSSResult<%s>: \nstatusCode:%d,\nresponseHeader:%s,\nrequestId:%s", (Object[])arrobject);
    }
}

