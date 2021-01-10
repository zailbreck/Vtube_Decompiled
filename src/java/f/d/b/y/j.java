/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.IllegalArgumentException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.text.DateFormat
 *  java.text.SimpleDateFormat
 *  java.util.Locale
 */
package f.d.b.y;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

public class j {
    private static String a(int n2) {
        if (n2 != 0) {
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 == 3) {
                        return "M/d/yy";
                    }
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unknown DateFormat style: ");
                    stringBuilder.append(n2);
                    throw new IllegalArgumentException(stringBuilder.toString());
                }
                return "MMM d, yyyy";
            }
            return "MMMM d, yyyy";
        }
        return "EEEE, MMMM d, yyyy";
    }

    public static DateFormat a(int n2, int n3) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(j.a(n2));
        stringBuilder.append(" ");
        stringBuilder.append(j.b(n3));
        return new SimpleDateFormat(stringBuilder.toString(), Locale.US);
    }

    private static String b(int n2) {
        if (n2 != 0 && n2 != 1) {
            if (n2 != 2) {
                if (n2 == 3) {
                    return "h:mm a";
                }
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unknown DateFormat style: ");
                stringBuilder.append(n2);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            return "h:mm:ss a";
        }
        return "h:mm:ss a z";
    }
}

