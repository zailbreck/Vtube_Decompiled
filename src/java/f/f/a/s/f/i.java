/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.f.a.a
 *  f.f.a.e.b.c.c
 *  f.f.a.e.b.c.e
 *  f.f.a.e.f.f
 *  f.f.a.e.f.h
 *  f.f.a.e.f.t
 *  java.io.File
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package f.f.a.s.f;

import f.f.a.e.b.c.c;
import f.f.a.e.b.c.e;
import f.f.a.e.f.f;
import f.f.a.e.f.t;
import f.f.a.s.f.h;
import java.io.File;

public final class i {
    private String a;

    private i() {
        this.a = e.b((c)c.h);
    }

    /* synthetic */ i(h h2) {
    }

    public static i a() {
        return a.a;
    }

    public final String a(String string2) {
        block3 : {
            try {
                String string3 = f.f.a.e.f.a.a(t.a((String)string2));
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(this.a);
                stringBuilder.append("/");
                stringBuilder.append(string3);
                stringBuilder.append(".html");
                File file = new File(stringBuilder.toString());
                if (file.exists()) {
                    String string4 = f.a((File)file);
                    return string4;
                }
            }
            catch (Throwable throwable) {
                if (!f.f.a.a.a) break block3;
                throwable.printStackTrace();
            }
        }
        return null;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean a(String string2, byte[] arrby) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("saveResHtmlFile url:");
        stringBuilder.append(string2);
        f.f.a.e.f.h.b((String)"HTMLResourceManager", (String)stringBuilder.toString());
        if (arrby == null) return false;
        try {
            if (arrby.length <= 0) return false;
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(this.a);
            stringBuilder2.append("/");
            stringBuilder2.append(f.f.a.e.f.a.a(t.a((String)string2)));
            stringBuilder2.append(".html");
            String string3 = stringBuilder2.toString();
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("saveResHtmlFile folderName:");
            stringBuilder3.append(string3);
            f.f.a.e.f.h.b((String)"HTMLResourceManager", (String)stringBuilder3.toString());
            boolean bl = f.a((byte[])arrby, (File)new File(string3));
            if (!bl) return false;
            return true;
        }
        catch (Exception exception) {
            if (!f.f.a.a.a) return false;
            exception.printStackTrace();
        }
        return false;
    }

    private static final class a {
        public static i a = new i(null);
    }

}

