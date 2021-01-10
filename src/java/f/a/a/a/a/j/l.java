/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.util.Xml
 *  j.a0
 *  j.b0
 *  java.io.ByteArrayInputStream
 *  java.io.IOException
 *  java.io.InputStream
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Long
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.text.ParseException
 *  java.util.Iterator
 *  java.util.Map
 *  java.util.Set
 *  java.util.zip.Checksum
 *  org.xmlpull.v1.XmlPullParser
 *  org.xmlpull.v1.XmlPullParserException
 */
package f.a.a.a.a.j;

import android.text.TextUtils;
import android.util.Xml;
import f.a.a.a.a.f;
import f.a.a.a.a.h.d;
import f.a.a.a.a.j.i;
import f.a.a.a.a.j.j;
import f.a.a.a.a.k.c;
import f.a.a.a.a.k.e;
import f.a.a.a.a.k.h;
import j.a0;
import j.b0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.ParseException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.zip.Checksum;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class l {
    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public static f a(j var0_1, boolean var1) {
        block19 : {
            block18 : {
                var2_2 = var0_1.h();
                var3_3 = var0_1.g().b("x-oss-request-id");
                var4_4 = null;
                if (var1) break block18;
                try {
                    var14_5 = var0_1.g().a().p();
                    var15_6 = new StringBuilder();
                    var15_6.append("errorMessage  \uff1a  \n ");
                    var15_6.append(var14_5);
                    d.a(var15_6.toString());
                    var18_7 = new ByteArrayInputStream(var14_5.getBytes());
                    var19_8 = Xml.newPullParser();
                    var19_8.setInput((InputStream)var18_7, "utf-8");
                    var20_9 = var19_8.getEventType();
                    var21_10 = null;
                    var22_11 = null;
                    var8_12 = null;
                    var23_13 = null;
                    var10_14 = null;
                    ** GOTO lbl53
                }
                catch (XmlPullParserException var13_20) {
                    throw new f.a.a.a.a.b(var13_20);
                }
                catch (IOException var12_21) {
                    throw new f.a.a.a.a.b(var12_21);
                }
            }
            var5_16 = var3_3;
            var6_19 = null;
            var7_15 = null;
            var8_12 = null;
            var9_18 = null;
            var10_14 = null;
            break block19;
            {
                if ("Code".equals((Object)var19_8.getName())) {
                    var21_10 = var19_8.nextText();
                } else if ("Message".equals((Object)var19_8.getName())) {
                    var22_11 = var19_8.nextText();
                } else if ("RequestId".equals((Object)var19_8.getName())) {
                    var3_3 = var19_8.nextText();
                } else if ("HostId".equals((Object)var19_8.getName())) {
                    var8_12 = var19_8.nextText();
                } else if ("PartNumber".equals((Object)var19_8.getName())) {
                    var23_13 = var19_8.nextText();
                } else if ("PartEtag".equals((Object)var19_8.getName())) {
                    var10_14 = var19_8.nextText();
                }
                do {
                    if ((var20_9 = var19_8.next()) == 4) {
                        var20_9 = var19_8.next();
                    }
lbl53: // 4 sources:
                    if (var20_9 == 1) break block3;
                    if (var20_9 == 2) continue block3;
                } while (true);
            }
            var7_15 = var21_10;
            var4_4 = var22_11;
            var5_16 = var3_3;
            var24_17 = var23_13;
            var9_18 = var14_5;
            var6_19 = var24_17;
        }
        var11_22 = new f(var2_2, var4_4, var7_15, var5_16, var8_12, var9_18);
        if (!TextUtils.isEmpty(var10_14)) {
            var11_22.a(var10_14);
        }
        if (TextUtils.isEmpty(var6_19) != false) return var11_22;
        var11_22.b(var6_19);
        return var11_22;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static f.a.a.a.a.k.f a(Map<String, String> map) {
        try {
            f.a.a.a.a.k.f f2 = new f.a.a.a.a.k.f();
            Iterator iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                String string = (String)iterator.next();
                if (string.indexOf("x-oss-meta-") >= 0) {
                    f2.a(string, (String)map.get((Object)string));
                    continue;
                }
                if (!string.equalsIgnoreCase("Last-Modified") && !string.equalsIgnoreCase("Date")) {
                    Object object = string.equalsIgnoreCase("Content-Length") ? Long.valueOf((String)((String)map.get((Object)string))) : (string.equalsIgnoreCase("ETag") ? l.a((String)map.get((Object)string)) : map.get((Object)string));
                    f2.a(string, object);
                    continue;
                }
                try {
                    f2.a(string, (Object)f.a.a.a.a.h.g.d.a((String)map.get((Object)string)));
                }
                catch (ParseException parseException) {
                    throw new IOException(parseException.getMessage(), (Throwable)parseException);
                }
            }
            return f2;
        }
        catch (Exception exception) {
            IOException iOException = new IOException(exception.getMessage(), (Throwable)exception);
            throw iOException;
        }
    }

    public static String a(String string) {
        if (string == null) {
            return null;
        }
        String string2 = string.trim();
        if (string2.startsWith("\"")) {
            string2 = string2.substring(1);
        }
        if (string2.endsWith("\"")) {
            string2 = string2.substring(0, string2.length() - 1);
        }
        return string2;
    }

}

