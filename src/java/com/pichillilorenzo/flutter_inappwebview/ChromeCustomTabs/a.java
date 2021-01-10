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
package com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs;

import com.pichillilorenzo.flutter_inappwebview.ChromeCustomTabs.ChromeCustomTabsActivity;
import f.g.a.l;
import java.util.Map;
import java.util.Set;

public class a
implements l<ChromeCustomTabsActivity> {
    public Boolean a;
    public Boolean b;
    public String c;
    public Boolean d;
    public Boolean e;
    public String f;
    public Boolean g;

    public a() {
        Boolean bl;
        Boolean bl2;
        this.a = bl2 = Boolean.valueOf((boolean)true);
        this.b = bl2;
        this.c = "";
        this.d = bl = Boolean.valueOf((boolean)false);
        this.e = bl;
        this.g = bl;
    }

    public a a(Map<String, Object> map) {
        block18 : for (Map.Entry entry : map.entrySet()) {
            String string2 = (String)entry.getKey();
            Object object = entry.getValue();
            if (object == null) continue;
            int n2 = -1;
            switch (string2.hashCode()) {
                default: {
                    break;
                }
                case 2126240217: {
                    if (!string2.equals((Object)"keepAliveEnabled")) break;
                    n2 = 6;
                    break;
                }
                case 908759025: {
                    if (!string2.equals((Object)"packageName")) break;
                    n2 = 5;
                    break;
                }
                case 472764366: {
                    if (!string2.equals((Object)"instantAppsEnabled")) break;
                    n2 = 4;
                    break;
                }
                case 137483238: {
                    if (!string2.equals((Object)"enableUrlBarHiding")) break;
                    n2 = 3;
                    break;
                }
                case -227713574: {
                    if (!string2.equals((Object)"toolbarBackgroundColor")) break;
                    n2 = 2;
                    break;
                }
                case -1913803429: {
                    if (!string2.equals((Object)"showTitle")) break;
                    n2 = 1;
                    break;
                }
                case -2112880751: {
                    if (!string2.equals((Object)"addDefaultShareMenuItem")) break;
                    n2 = 0;
                }
            }
            switch (n2) {
                default: {
                    continue block18;
                }
                case 6: {
                    this.g = (boolean)((Boolean)object);
                    continue block18;
                }
                case 5: {
                    this.f = (String)object;
                    continue block18;
                }
                case 4: {
                    this.e = (boolean)((Boolean)object);
                    continue block18;
                }
                case 3: {
                    this.d = (boolean)((Boolean)object);
                    continue block18;
                }
                case 2: {
                    this.c = (String)object;
                    continue block18;
                }
                case 1: {
                    this.b = (boolean)((Boolean)object);
                    continue block18;
                }
                case 0: 
            }
            this.a = (boolean)((Boolean)object);
        }
        return this;
    }
}

