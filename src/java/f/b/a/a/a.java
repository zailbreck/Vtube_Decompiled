/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.util.Log
 *  com.android.billingclient.api.a
 *  com.android.billingclient.api.f
 *  com.android.billingclient.api.g
 *  com.android.billingclient.api.g$b
 *  com.android.billingclient.api.i
 *  com.android.billingclient.api.k
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.List
 *  org.json.JSONException
 */
package f.b.a.a;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.billingclient.api.f;
import com.android.billingclient.api.g;
import com.android.billingclient.api.i;
import com.android.billingclient.api.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import org.json.JSONException;

public final class a {
    public static int a = Runtime.getRuntime().availableProcessors();

    public static Bundle a(com.android.billingclient.api.a a2, String string) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", string);
        String string2 = a2.a();
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            bundle.putString("developerPayload", string2);
        }
        return bundle;
    }

    public static Bundle a(f f2, boolean bl, boolean bl2, String string) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", string);
        if (f2.d() != 0) {
            bundle.putInt("prorationMode", f2.d());
        }
        if (!TextUtils.isEmpty((CharSequence)f2.a())) {
            bundle.putString("accountId", f2.a());
        }
        if (f2.h()) {
            bundle.putBoolean("vr", true);
        }
        if (!TextUtils.isEmpty((CharSequence)f2.c())) {
            Object[] arrobject = new String[]{f2.c()};
            bundle.putStringArrayList("skusToReplace", new ArrayList((Collection)Arrays.asList((Object[])arrobject)));
        }
        if (!TextUtils.isEmpty((CharSequence)f2.b())) {
            bundle.putString("developerId", f2.b());
        }
        if (bl && bl2) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    public static Bundle a(i i2, boolean bl, String string) {
        Bundle bundle = new Bundle();
        if (bl) {
            bundle.putString("playBillingLibraryVersion", string);
        }
        String string2 = i2.a();
        if (bl && !TextUtils.isEmpty((CharSequence)string2)) {
            bundle.putString("developerPayload", string2);
        }
        return bundle;
    }

    public static Bundle a(boolean bl, boolean bl2, String string) {
        Bundle bundle = new Bundle();
        if (bl) {
            bundle.putString("playBillingLibraryVersion", string);
        }
        if (bl && bl2) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    public static g a(Intent intent, String string) {
        if (intent == null) {
            a.c("BillingHelper", "Got null intent!");
            g.b b2 = g.c();
            b2.a(6);
            b2.a("An internal error occurred.");
            return b2.a();
        }
        g.b b3 = g.c();
        b3.a(a.b(intent.getExtras(), string));
        b3.a(a.a(intent.getExtras(), string));
        return b3.a();
    }

    private static k a(String string, String string2) {
        if (string != null && string2 != null) {
            try {
                k k2 = new k(string, string2);
                return k2;
            }
            catch (JSONException jSONException) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Got JSONException while parsing purchase data: ");
                stringBuilder.append((Object)jSONException);
                a.c("BillingHelper", stringBuilder.toString());
                return null;
            }
        }
        a.c("BillingHelper", "Received a bad purchase data.");
        return null;
    }

    public static String a(Bundle bundle, String string) {
        if (bundle == null) {
            a.c(string, "Unexpected null bundle received!");
            return "";
        }
        Object object = bundle.get("DEBUG_MESSAGE");
        if (object == null) {
            a.b(string, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (object instanceof String) {
            return (String)object;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unexpected type for debug message: ");
        stringBuilder.append(object.getClass().getName());
        a.c(string, stringBuilder.toString());
        return "";
    }

    public static List<k> a(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        ArrayList arrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList arrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList3 = new ArrayList();
        if (arrayList != null && arrayList2 != null) {
            for (int i2 = 0; i2 < arrayList.size() && i2 < arrayList2.size(); ++i2) {
                k k2 = a.a((String)arrayList.get(i2), (String)arrayList2.get(i2));
                if (k2 == null) continue;
                arrayList3.add((Object)k2);
            }
        } else {
            a.c("BillingHelper", "Couldn't find purchase lists, trying to find single data.");
            k k3 = a.a(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (k3 == null) {
                a.c("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList3.add((Object)k3);
        }
        return arrayList3;
    }

    public static int b(Intent intent, String string) {
        return a.a(intent, string).b();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static int b(Bundle bundle, String string) {
        String string2;
        if (bundle == null) {
            string2 = "Unexpected null bundle received!";
        } else {
            Object object = bundle.get("RESPONSE_CODE");
            if (object == null) {
                a.b(string, "getResponseCodeFromBundle() got null response code, assuming OK");
                return 0;
            }
            if (object instanceof Integer) {
                return (Integer)object;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected type for bundle response code: ");
            stringBuilder.append(object.getClass().getName());
            string2 = stringBuilder.toString();
        }
        a.c(string, string2);
        return 6;
    }

    public static Bundle b(boolean bl, boolean bl2, String string) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", string);
        if (bl && bl2) {
            bundle.putBoolean("enablePendingPurchases", true);
        }
        return bundle;
    }

    public static void b(String string, String string2) {
        if (Log.isLoggable((String)string, (int)2)) {
            Log.v((String)string, (String)string2);
        }
    }

    public static void c(String string, String string2) {
        if (Log.isLoggable((String)string, (int)5)) {
            Log.w((String)string, (String)string2);
        }
    }
}

