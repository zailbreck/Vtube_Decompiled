/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 */
package e.c.b;

import android.os.Bundle;

public final class a {
    public final Integer a;
    public final Integer b;
    public final Integer c;

    a(Integer n2, Integer n3, Integer n4) {
        this.a = n2;
        this.b = n3;
        this.c = n4;
    }

    Bundle a() {
        Integer n2;
        Integer n3;
        Bundle bundle = new Bundle();
        Integer n4 = this.a;
        if (n4 != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", n4.intValue());
        }
        if ((n2 = this.b) != null) {
            bundle.putInt("android.support.customtabs.extra.SECONDARY_TOOLBAR_COLOR", n2.intValue());
        }
        if ((n3 = this.c) != null) {
            bundle.putInt("androidx.browser.customtabs.extra.NAVIGATION_BAR_COLOR", n3.intValue());
        }
        return bundle;
    }

    public static final class a {
        private Integer a;
        private Integer b;
        private Integer c;

        public a a(int n2) {
            this.a = n2 | -16777216;
            return this;
        }

        public a a() {
            return new a(this.a, this.b, this.c);
        }
    }

}

