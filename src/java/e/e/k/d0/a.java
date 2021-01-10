/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.text.style.ClickableSpan
 *  android.view.View
 *  java.lang.String
 */
package e.e.k.d0;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import e.e.k.d0.c;

public final class a
extends ClickableSpan {
    private final int b;
    private final c c;
    private final int d;

    public a(int n2, c c2, int n3) {
        this.b = n2;
        this.c = c2;
        this.d = n3;
    }

    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.b);
        this.c.a(this.d, bundle);
    }
}

