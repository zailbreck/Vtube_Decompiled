/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 *  java.lang.String
 *  java.util.concurrent.ConcurrentHashMap
 */
package com.mintegral.msdk.playercommon;

import com.mintegral.msdk.playercommon.c;
import java.util.concurrent.ConcurrentHashMap;

public final class b {
    private static final ConcurrentHashMap<String, c> a = new ConcurrentHashMap();

    public static c a(String string) {
        return (c)a.get((Object)string);
    }

    public static void a(String string, c c2) {
        a.put((Object)string, (Object)c2);
    }

    public static void b(String string) {
        a.remove((Object)string);
    }
}

