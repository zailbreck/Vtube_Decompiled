/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Object
 */
package com.mintegral.msdk.base.common.report;

public class d$l {
    private static d$l a;

    private d$l() {
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static d$l a() {
        if (a != null) return a;
        Class<d$l> class_ = d$l.class;
        synchronized (d$l.class) {
            if (a != null) return a;
            a = new d$l();
            // ** MonitorExit[var1] (shouldn't be in output)
            return a;
        }
    }
}

