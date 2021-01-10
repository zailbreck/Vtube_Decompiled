/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Boolean
 *  java.lang.Object
 *  java.lang.String
 *  java.util.HashMap
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package com.pichillilorenzo.flutter_inappwebview.InAppBrowser;

import com.pichillilorenzo.flutter_inappwebview.InAppBrowser.InAppBrowserActivity;
import f.g.a.l;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class a
implements l<InAppBrowserActivity> {
    public Boolean a;
    public Boolean b;
    public String c;
    public String d;
    public Boolean e;
    public Boolean f;
    public Boolean g;
    public Boolean h;

    public a() {
        Boolean bl;
        Boolean bl2;
        this.a = bl2 = Boolean.valueOf((boolean)false);
        this.b = bl = Boolean.valueOf((boolean)true);
        this.c = "";
        this.d = "";
        this.e = bl2;
        this.f = bl2;
        this.g = bl;
        this.h = bl;
    }

    public a a(Map<String, Object> map) {
        block20 : for (Map.Entry entry : map.entrySet()) {
            String string2 = (String)entry.getKey();
            Object object = entry.getValue();
            if (object == null) continue;
            int n2 = -1;
            switch (string2.hashCode()) {
                default: {
                    break;
                }
                case 2111633307: {
                    if (!string2.equals((Object)"toolbarTopBackgroundColor")) break;
                    n2 = 2;
                    break;
                }
                case 1131509414: {
                    if (!string2.equals((Object)"progressBar")) break;
                    n2 = 7;
                    break;
                }
                case 406250502: {
                    if (!string2.equals((Object)"hideUrlBar")) break;
                    n2 = 4;
                    break;
                }
                case 90270825: {
                    if (!string2.equals((Object)"closeOnCannotGoBack")) break;
                    n2 = 6;
                    break;
                }
                case 58574810: {
                    if (!string2.equals((Object)"toolbarTop")) break;
                    n2 = 1;
                    break;
                }
                case -118493506: {
                    if (!string2.equals((Object)"toolbarTopFixedTitle")) break;
                    n2 = 3;
                    break;
                }
                case -1217487446: {
                    if (!string2.equals((Object)"hidden")) break;
                    n2 = 0;
                    break;
                }
                case -1307803139: {
                    if (!string2.equals((Object)"hideTitleBar")) break;
                    n2 = 5;
                }
            }
            switch (n2) {
                default: {
                    continue block20;
                }
                case 7: {
                    this.h = (Boolean)object;
                    continue block20;
                }
                case 6: {
                    this.g = (Boolean)object;
                    continue block20;
                }
                case 5: {
                    this.f = (Boolean)object;
                    continue block20;
                }
                case 4: {
                    this.e = (Boolean)object;
                    continue block20;
                }
                case 3: {
                    this.d = (String)object;
                    continue block20;
                }
                case 2: {
                    this.c = (String)object;
                    continue block20;
                }
                case 1: {
                    this.b = (Boolean)object;
                    continue block20;
                }
                case 0: 
            }
            this.a = (Boolean)object;
        }
        return this;
    }

    public Map<String, Object> a() {
        HashMap hashMap = new HashMap();
        hashMap.put((Object)"hidden", (Object)this.a);
        hashMap.put((Object)"toolbarTop", (Object)this.b);
        hashMap.put((Object)"toolbarTopBackgroundColor", (Object)this.c);
        hashMap.put((Object)"toolbarTopFixedTitle", (Object)this.d);
        hashMap.put((Object)"hideUrlBar", (Object)this.e);
        hashMap.put((Object)"hideTitleBar", (Object)this.f);
        hashMap.put((Object)"closeOnCannotGoBack", (Object)this.g);
        hashMap.put((Object)"progressBar", (Object)this.h);
        return hashMap;
    }

    public Map<String, Object> a(InAppBrowserActivity inAppBrowserActivity) {
        return this.a();
    }
}

