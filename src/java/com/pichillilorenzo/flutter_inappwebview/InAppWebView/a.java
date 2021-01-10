/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package com.pichillilorenzo.flutter_inappwebview.InAppWebView;

import f.g.a.l;
import java.util.Map;
import java.util.Set;

public class a
implements l<Object> {
    public Boolean a = false;

    public a a(Map<String, Object> map) {
        for (Map.Entry entry : map.entrySet()) {
            String string2 = (String)entry.getKey();
            Object object = entry.getValue();
            if (object == null) continue;
            int n2 = -1;
            if (string2.hashCode() == -1069507968 && string2.equals((Object)"hideDefaultSystemContextMenuItems")) {
                n2 = 0;
            }
            if (n2 != 0) continue;
            this.a = (Boolean)object;
        }
        return this;
    }
}

