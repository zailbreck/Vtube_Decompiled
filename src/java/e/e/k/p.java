/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 *  java.lang.Object
 */
package e.e.k;

import android.view.View;
import android.view.ViewGroup;

public class p {
    private int a;
    private int b;

    public p(ViewGroup viewGroup) {
    }

    public int a() {
        return this.a | this.b;
    }

    public void a(View view, int n2) {
        if (n2 == 1) {
            this.b = 0;
            return;
        }
        this.a = 0;
    }

    public void a(View view, View view2, int n2) {
        this.a(view, view2, n2, 0);
    }

    public void a(View view, View view2, int n2, int n3) {
        if (n3 == 1) {
            this.b = n2;
            return;
        }
        this.a = n2;
    }
}

