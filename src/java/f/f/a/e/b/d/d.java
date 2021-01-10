/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  f.f.a.a
 *  f.f.a.e.b.d.d$a
 *  f.f.a.e.b.d.d$b
 *  f.f.a.e.b.f.a
 *  f.f.a.e.b.h.g
 *  f.f.a.e.b.h.k.a
 *  f.f.a.e.f.h
 *  java.io.File
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.OutOfMemoryError
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package f.f.a.e.b.d;

import android.text.TextUtils;
import f.f.a.e.b.d.d;
import f.f.a.e.b.h.g;
import f.f.a.e.f.h;
import java.io.File;

public final class d
extends f.f.a.e.b.f.a {
    private String e;
    private String f;
    private boolean g = false;
    private b h;

    public d(String string, String string2, String string3) {
        this.e = string2;
        this.f = string3;
    }

    static /* synthetic */ String a(d d2) {
        return d2.e;
    }

    static /* synthetic */ void a(d d2, String string, String string2) {
        d2.a(string, string2);
    }

    private void a(String string, String string2) {
        b b2 = this.h;
        if (b2 != null) {
            b2.b(string, string2);
        }
    }

    static /* synthetic */ String b(d d2) {
        return d2.f;
    }

    private void e() {
        try {
            File file = new File(this.f);
            if (!file.exists()) {
                file.mkdirs();
            }
            if (file.exists()) {
                file.delete();
            }
            f.f.a.e.b.h.k.a.a((File)file, (String)this.e, (g)new a(this, file));
        }
        catch (OutOfMemoryError outOfMemoryError) {
            this.a(this.e, outOfMemoryError.getMessage());
            return;
        }
        catch (Exception exception) {
            this.a(this.e, exception.getMessage());
            if (f.f.a.a.a) {
                exception.printStackTrace();
            }
            return;
        }
        throw null;
    }

    public final void a() {
        if (!this.g) {
            if (TextUtils.isEmpty((CharSequence)this.f)) {
                this.a(this.e, "save path is null.");
                return;
            }
            File file = new File(this.f);
            if (file.exists() && file.length() > 0L) {
                this.d();
                return;
            }
        }
        this.e();
    }

    public final void a(b b2) {
        this.h = b2;
    }

    public final void a(boolean bl) {
        this.g = bl;
    }

    public final void b() {
    }

    protected final void d() {
        if (new File(this.f).exists()) {
            String string = this.e;
            String string2 = this.f;
            b b2 = this.h;
            if (b2 != null) {
                b2.a(string, string2);
                return;
            }
        } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("load image faild.because file[");
            stringBuilder.append(this.f);
            stringBuilder.append("] is not exist!");
            String string = stringBuilder.toString();
            h.a((String)"ImageWorker", (String)string);
            this.a(this.e, string);
        }
    }
}

