/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.io.File
 *  java.io.UnsupportedEncodingException
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.net.URLEncoder
 *  java.util.Iterator
 *  java.util.LinkedHashMap
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package f.f.a.e.b.h.k;

import android.text.TextUtils;
import f.f.a.e.b.h.e.a;
import f.f.a.e.f.h;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class c {
    private static final String c = "c";
    private Map<String, String> a = new LinkedHashMap();
    private Map<String, a> b = new LinkedHashMap();

    public final String a() {
        StringBuilder stringBuilder = new StringBuilder();
        try {
            for (Map.Entry entry : this.a.entrySet()) {
                if (stringBuilder.length() > 0) {
                    stringBuilder.append('&');
                }
                stringBuilder.append(URLEncoder.encode((String)((String)entry.getKey()), (String)"UTF-8"));
                stringBuilder.append("=");
                stringBuilder.append(URLEncoder.encode((String)((String)entry.getValue()), (String)"UTF-8"));
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return stringBuilder.toString();
    }

    public final void a(String string) {
        this.a.remove((Object)string);
        this.b.remove((Object)string);
    }

    public final void a(String string, String string2) {
        if (string2 == null) {
            h.d(c, "add() value is null!");
        }
        if (!TextUtils.isEmpty((CharSequence)string) && string2 != null) {
            this.a.put((Object)string, (Object)string2);
        }
    }

    public final Map<String, String> b() {
        return this.a;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder(28);
        try {
            boolean bl;
            Iterator iterator = this.a.entrySet().iterator();
            while (bl = iterator.hasNext()) {
                Map.Entry entry = (Map.Entry)iterator.next();
                if (stringBuilder.length() > 0) {
                    stringBuilder.append('&');
                }
                stringBuilder.append(URLEncoder.encode((String)((String)entry.getKey()), (String)"UTF-8"));
                stringBuilder.append('=');
                stringBuilder.append(URLEncoder.encode((String)((String)entry.getValue()), (String)"UTF-8"));
            }
            for (Map.Entry entry : this.b.entrySet()) {
                if (stringBuilder.length() > 0) {
                    stringBuilder.append('&');
                }
                stringBuilder.append(URLEncoder.encode((String)((String)entry.getKey()), (String)"UTF-8"));
                stringBuilder.append('=');
                StringBuilder stringBuilder2 = new StringBuilder();
                stringBuilder2.append("FILE_NAME_");
                stringBuilder2.append(((a)entry.getValue()).a().getName());
                stringBuilder.append(URLEncoder.encode((String)stringBuilder2.toString(), (String)"UTF-8"));
            }
            return stringBuilder.toString();
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            h.d(c, unsupportedEncodingException.getMessage());
        }
        return stringBuilder.toString();
    }
}

