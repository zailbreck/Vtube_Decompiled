/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.PendingIntent
 *  android.content.ComponentName
 *  android.content.Intent
 *  android.os.Bundle
 *  android.os.IBinder
 *  android.os.Parcelable
 *  android.util.SparseArray
 *  androidx.core.app.d
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 */
package e.c.b;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.SparseArray;
import e.c.b.a;
import e.c.b.f;
import java.util.ArrayList;

public final class d {
    public final Intent a;

    d(Intent intent, Bundle bundle) {
        this.a = intent;
    }

    public static final class a {
        private final Intent a = new Intent("android.intent.action.VIEW");
        private final a.a b = new a.a();
        private ArrayList<Bundle> c;
        private Bundle d;
        private ArrayList<Bundle> e;
        private boolean f = true;
        private SparseArray<Bundle> g;

        public a(f f2) {
            if (f2 != null) {
                this.a(f2);
            }
        }

        private void a(IBinder iBinder, PendingIntent pendingIntent) {
            Bundle bundle = new Bundle();
            androidx.core.app.d.a((Bundle)bundle, (String)"android.support.customtabs.extra.SESSION", (IBinder)iBinder);
            if (pendingIntent != null) {
                bundle.putParcelable("android.support.customtabs.extra.SESSION_ID", (Parcelable)pendingIntent);
            }
            this.a.putExtras(bundle);
        }

        public a a() {
            this.a.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", true);
            return this;
        }

        public a a(int n2) {
            this.b.a(n2);
            return this;
        }

        public a a(f f2) {
            this.a.setPackage(f2.b().getPackageName());
            a.super.a(f2.a(), f2.c());
            return this;
        }

        public a a(String string, PendingIntent pendingIntent) {
            if (this.c == null) {
                this.c = new ArrayList();
            }
            Bundle bundle = new Bundle();
            bundle.putString("android.support.customtabs.customaction.MENU_ITEM_TITLE", string);
            bundle.putParcelable("android.support.customtabs.customaction.PENDING_INTENT", (Parcelable)pendingIntent);
            this.c.add((Object)bundle);
            return this;
        }

        public a a(boolean bl) {
            this.f = bl;
            return this;
        }

        public a b(boolean bl) {
            this.a.putExtra("android.support.customtabs.extra.TITLE_VISIBILITY", (int)bl);
            return this;
        }

        public d b() {
            ArrayList<Bundle> arrayList;
            ArrayList<Bundle> arrayList2;
            if (!this.a.hasExtra("android.support.customtabs.extra.SESSION")) {
                this.a((IBinder)null, (PendingIntent)null);
            }
            if ((arrayList2 = this.c) != null) {
                this.a.putParcelableArrayListExtra("android.support.customtabs.extra.MENU_ITEMS", arrayList2);
            }
            if ((arrayList = this.e) != null) {
                this.a.putParcelableArrayListExtra("android.support.customtabs.extra.TOOLBAR_ITEMS", arrayList);
            }
            this.a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.f);
            this.a.putExtras(this.b.a().a());
            if (this.g != null) {
                Bundle bundle = new Bundle();
                bundle.putSparseParcelableArray("androidx.browser.customtabs.extra.COLOR_SCHEME_PARAMS", this.g);
                this.a.putExtras(bundle);
            }
            return new d(this.a, this.d);
        }

        public a c() {
            this.a.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
            return this;
        }
    }

}

