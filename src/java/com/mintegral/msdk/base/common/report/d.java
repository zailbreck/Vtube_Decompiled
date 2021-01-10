/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  java.io.File
 *  java.lang.Boolean
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.net.URLEncoder
 */
package com.mintegral.msdk.base.common.report;

import android.content.Context;
import android.text.TextUtils;
import com.mintegral.msdk.base.common.report.d;
import com.mintegral.msdk.base.common.report.e$b;
import com.mintegral.msdk.base.common.report.e$c;
import f.f.a.e.e.l;
import f.f.a.e.f.s;
import java.io.File;
import java.net.URLEncoder;

public class d {
    public static final String b = "d";
    private Context a;

    public d(Context context) {
        this.a = context.getApplicationContext();
    }

    public d(Context context, int n2) {
        this.a = context;
    }

    static /* synthetic */ Context a(d d2) {
        return d2.a;
    }

    private void c(String string) {
        try {
            e$b e$b = new e$b(this.a);
            f.f.a.e.b.h.k.c c2 = com.mintegral.msdk.base.common.report.e.a(string, this.a, "");
            e$b.b(0, f.f.a.e.b.h.j.d.a().b, c2, new e$c((d)this){

                public final void a(String string) {
                    String string2 = d.b;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("reportPB success data:");
                    stringBuilder.append(string);
                    f.f.a.e.f.h.b(string2, stringBuilder.toString());
                }

                public final void b(String string) {
                    String string2 = d.b;
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("reportPB onFailed msg:");
                    stringBuilder.append(string);
                    f.f.a.e.f.h.b(string2, stringBuilder.toString());
                }
            });
            return;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return;
        }
    }

    public final void a(int n2, int n3, String string, String string2) {
        try {
            e$b e$b = new e$b(this.a);
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("key");
            stringBuilder.append("=");
            stringBuilder.append(URLEncoder.encode((String)"2000058", (String)"utf-8"));
            stringBuilder.append("&");
            stringBuilder.append("appid");
            stringBuilder.append("=");
            stringBuilder.append(URLEncoder.encode((String)f.f.a.e.c.a.i().f(), (String)"utf-8"));
            stringBuilder.append("&");
            stringBuilder.append("dl_service");
            stringBuilder.append("=");
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append(s.b);
            stringBuilder2.append("");
            stringBuilder.append(URLEncoder.encode((String)stringBuilder2.toString(), (String)"utf-8"));
            stringBuilder.append("&");
            stringBuilder.append("dl_type");
            stringBuilder.append("=");
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(n2);
            stringBuilder3.append("");
            stringBuilder.append(URLEncoder.encode((String)stringBuilder3.toString(), (String)"utf-8"));
            stringBuilder.append("&");
            stringBuilder.append("dl_link_type");
            stringBuilder.append("=");
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append(n3);
            stringBuilder4.append("");
            stringBuilder.append(URLEncoder.encode((String)stringBuilder4.toString(), (String)"utf-8"));
            stringBuilder.append("&");
            stringBuilder.append("rid_n");
            stringBuilder.append("=");
            stringBuilder.append(URLEncoder.encode((String)string, (String)"utf-8"));
            stringBuilder.append("&");
            stringBuilder.append("cid");
            stringBuilder.append("=");
            stringBuilder.append(URLEncoder.encode((String)string2, (String)"utf-8"));
            stringBuilder.append("&");
            stringBuilder.append("dl_v4");
            stringBuilder.append("=");
            StringBuilder stringBuilder5 = new StringBuilder();
            stringBuilder5.append(s.e);
            stringBuilder5.append("");
            stringBuilder.append(URLEncoder.encode((String)stringBuilder5.toString(), (String)"utf-8"));
            stringBuilder.append("&");
            stringBuilder.append("dl_pkg");
            stringBuilder.append("=");
            StringBuilder stringBuilder6 = new StringBuilder();
            stringBuilder6.append(s.a);
            stringBuilder6.append("");
            stringBuilder.append(URLEncoder.encode((String)stringBuilder6.toString(), (String)"utf-8"));
            stringBuilder.append("&");
            stringBuilder.append("dl_i_p");
            stringBuilder.append("=");
            StringBuilder stringBuilder7 = new StringBuilder();
            stringBuilder7.append(s.c);
            stringBuilder7.append("");
            stringBuilder.append(URLEncoder.encode((String)stringBuilder7.toString(), (String)"utf-8"));
            stringBuilder.append("&");
            stringBuilder.append("dl_fp");
            stringBuilder.append("=");
            StringBuilder stringBuilder8 = new StringBuilder();
            stringBuilder8.append(s.d);
            stringBuilder8.append("");
            stringBuilder.append(URLEncoder.encode((String)stringBuilder8.toString(), (String)"utf-8"));
            stringBuilder.append("&");
            stringBuilder.append("tgt_v");
            stringBuilder.append("=");
            StringBuilder stringBuilder9 = new StringBuilder();
            stringBuilder9.append(f.f.a.e.f.d.t(this.a));
            stringBuilder9.append("");
            stringBuilder.append(URLEncoder.encode((String)stringBuilder9.toString(), (String)"utf-8"));
            stringBuilder.append("&");
            stringBuilder.append("app_v_n");
            stringBuilder.append("=");
            StringBuilder stringBuilder10 = new StringBuilder();
            stringBuilder10.append(f.f.a.e.f.d.s(this.a));
            stringBuilder10.append("");
            stringBuilder.append(URLEncoder.encode((String)stringBuilder10.toString(), (String)"utf-8"));
            stringBuilder.append("&");
            stringBuilder.append("app_v_c");
            stringBuilder.append("=");
            StringBuilder stringBuilder11 = new StringBuilder();
            stringBuilder11.append(f.f.a.e.f.d.r(this.a));
            stringBuilder11.append("");
            stringBuilder.append(URLEncoder.encode((String)stringBuilder11.toString(), (String)"utf-8"));
            if (com.mintegral.msdk.base.common.report.a.b().a()) {
                com.mintegral.msdk.base.common.report.a.b().a(stringBuilder.toString());
                return;
            }
            f.f.a.e.b.h.k.c c2 = com.mintegral.msdk.base.common.report.e.a(stringBuilder.toString(), this.a, "");
            e$b.b(0, f.f.a.e.b.h.j.d.a().b, c2, new e$c((d)this){

                public final void a(String string) {
                    f.f.a.e.f.h.a("", "reportDownloadMethod REPORT SUCCESS");
                }

                public final void b(String string) {
                    f.f.a.e.f.h.a("", "reportDownloadMethod REPORT FAILED");
                }
            });
            return;
        }
        catch (Exception exception) {
            if (f.f.a.a.a) {
                exception.printStackTrace();
            }
            return;
        }
    }

    public final void a(l l2) {
        e$b e$b = new e$b(this.a);
        f.f.a.e.b.h.k.c c2 = com.mintegral.msdk.base.common.report.e.a(this.a, l2);
        e$b.b(0, f.f.a.e.b.h.j.d.a().b, c2, new e$c((d)this, l2){
            final /* synthetic */ l g;
            final /* synthetic */ d h;
            {
                this.h = d2;
                this.g = l2;
            }

            /*
             * Exception decompiling
             */
            public final void a(}
        java.lang.IllegalStateException: Parameters not created
        
        