/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  java.io.BufferedReader
 *  java.io.InputStream
 *  java.io.InputStreamReader
 *  java.io.Reader
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.Long
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.regex.Matcher
 *  java.util.regex.Pattern
 */
package f.f.a.j;

import android.text.TextUtils;
import f.f.a.j.o;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class g {
    private static final Pattern d = Pattern.compile((String)"[R,r]ange:[ ]?bytes=(\\d*)-");
    private static final Pattern e = Pattern.compile((String)"GET /(.*) HTTP");
    public final String a;
    public final long b;
    public final boolean c;

    private g(String string) {
        o.a(string);
        Matcher matcher = d.matcher((CharSequence)string);
        long l2 = matcher.find() ? Long.parseLong((String)matcher.group(1)) : -1L;
        this.b = Math.max((long)0L, (long)l2);
        boolean bl = l2 >= 0L;
        this.c = bl;
        Matcher matcher2 = e.matcher((CharSequence)string);
        if (matcher2.find()) {
            this.a = matcher2.group(1);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid request `");
        stringBuilder.append(string);
        stringBuilder.append("`: url not found!");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public static g a(InputStream inputStream) {
        String string;
        BufferedReader bufferedReader = new BufferedReader((Reader)new InputStreamReader(inputStream, "UTF-8"));
        StringBuilder stringBuilder = new StringBuilder();
        while (!TextUtils.isEmpty((CharSequence)(string = bufferedReader.readLine()))) {
            stringBuilder.append(string);
            stringBuilder.append('\n');
        }
        return new g(stringBuilder.toString());
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("GetRequest{rangeOffset=");
        stringBuilder.append(this.b);
        stringBuilder.append(", partial=");
        stringBuilder.append(this.c);
        stringBuilder.append(", uri='");
        stringBuilder.append(this.a);
        stringBuilder.append('\'');
        stringBuilder.append('}');
        return stringBuilder.toString();
    }
}

