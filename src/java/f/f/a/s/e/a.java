/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.Window
 *  android.widget.Button
 *  android.widget.TextView
 *  f.f.a.e.b.b
 *  f.f.a.e.c.a
 *  f.f.a.e.f.h
 *  f.f.a.e.f.o
 *  f.f.a.e.f.q
 *  f.f.a.f.a
 *  f.f.a.f.c
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.Locale
 */
package f.f.a.s.e;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import f.f.a.e.f.h;
import f.f.a.e.f.o;
import f.f.a.e.f.q;
import f.f.a.f.c;
import java.util.Locale;

public class a
extends Dialog {
    private f.f.a.s.e.b b;
    private TextView c;
    private TextView d;
    private Button e;
    private Button f;

    public a(Context context, final f.f.a.s.e.b b2) {
        Button button;
        Button button2;
        super(context);
        this.requestWindowFeature(1);
        View view = LayoutInflater.from((Context)context).inflate(o.a((Context)context, (String)"mintegral_video_common_alertview", (String)"layout"), null);
        this.b = b2;
        if (view != null) {
            this.setContentView(view);
            try {
                this.c = (TextView)view.findViewById(o.a((Context)context, (String)"mintegral_video_common_alertview_titleview", (String)"id"));
            }
            catch (Exception exception) {
                h.a((String)"MTGAlertDialog", (String)exception.getMessage());
            }
            try {
                this.d = (TextView)view.findViewById(o.a((Context)context, (String)"mintegral_video_common_alertview_contentview", (String)"id"));
                this.e = (Button)view.findViewById(o.a((Context)context, (String)"mintegral_video_common_alertview_confirm_button", (String)"id"));
                this.f = (Button)view.findViewById(o.a((Context)context, (String)"mintegral_video_common_alertview_cancel_button", (String)"id"));
            }
            catch (Exception exception) {
                h.a((String)"MTGAlertDialog", (String)exception.getMessage());
            }
        }
        if ((button2 = this.f) != null) {
            button2.setOnClickListener(new View.OnClickListener(){

                public final void onClick(View view) {
                    f.f.a.s.e.b b22 = b2;
                    if (b22 != null) {
                        b22.a();
                    }
                    a.this.cancel();
                    a.this.a();
                }
            });
        }
        if ((button = this.e) != null) {
            button.setOnClickListener(new View.OnClickListener(){

                public final void onClick(View view) {
                    f.f.a.s.e.b b22 = b2;
                    if (b22 != null) {
                        b22.b();
                    }
                    a.this.cancel();
                    a.this.a();
                }
            });
        }
        this.setCanceledOnTouchOutside(false);
        this.setCancelable(false);
        Window window = this.getWindow();
        if (window != null) {
            window.setFlags(1024, 1024);
            window.setBackgroundDrawable((Drawable)new ColorDrawable(0));
            window.setLayout(-1, -1);
            window.setGravity(17);
        }
    }

    private void a(String string2, String string3, String string4, String string5) {
        this.e(string2);
        this.d(string3);
        this.c(string4);
        this.b(string5);
    }

    public void a() {
        if (this.b != null) {
            this.b = null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(int n2, String string2) {
        try {
            Context context = this.getContext();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Mintegral_ConfirmTitle");
            stringBuilder.append(string2);
            String string3 = q.b((Context)context, (String)stringBuilder.toString(), (Object)"").toString();
            Context context2 = this.getContext();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Mintegral_ConfirmContent");
            stringBuilder2.append(string2);
            String string4 = q.b((Context)context2, (String)stringBuilder2.toString(), (Object)"").toString();
            Context context3 = this.getContext();
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("Mintegral_CancelText");
            stringBuilder3.append(string2);
            String string5 = q.b((Context)context3, (String)stringBuilder3.toString(), (Object)"").toString();
            Context context4 = this.getContext();
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append("Mintegral_ConfirmText");
            stringBuilder4.append(string2);
            String string6 = q.b((Context)context4, (String)stringBuilder4.toString(), (Object)"").toString();
            if (TextUtils.isEmpty((CharSequence)string3) && TextUtils.isEmpty((CharSequence)string4) && TextUtils.isEmpty((CharSequence)string5) && TextUtils.isEmpty((CharSequence)string6)) {
                String string7;
                String string8 = Locale.getDefault().getLanguage();
                if (!TextUtils.isEmpty((CharSequence)string8) && string8.equals((Object)"zh")) {
                    String string9 = n2 == f.f.a.e.b.b.m ? "\u786e\u8ba4\u5173\u95ed\uff1f" : "\u63d0\u793a";
                    this.e(string9);
                    String string10 = n2 == f.f.a.e.b.b.m ? "\u5982\u679c\u4f60\u9009\u62e9\u7ee7\u7eed\uff0c\u7ed3\u675f\u540e\u5c06\u4f1a\u83b7\u5f97\u5956\u52b1\u3002\u786e\u8ba4\u5173\u95ed\u5417\uff1f" : "\u5982\u679c\u4f60\u9009\u62e9\u7ee7\u7eed\uff0c\u7ed3\u675f\u540e\u5c06\u4f1a\u83b7\u5f97\u5956\u52b1\u3002\u662f\u5426\u7ee7\u7eed\uff1f";
                    this.d(string10);
                    String string11 = n2 == f.f.a.e.b.b.m ? "\u786e\u8ba4\u5173\u95ed" : "\u53d6\u6d88";
                    this.c(string11);
                    string7 = "\u7ee7\u7eed";
                } else {
                    String string12 = n2 == f.f.a.e.b.b.m ? "Confirm" : "Tips";
                    this.e(string12);
                    String string13 = n2 == f.f.a.e.b.b.m ? "If you choose to continue, you will receive a reward after the end. Confirm closed?" : "If you choose to continue, you will receive a reward after the end. Whether to continue?";
                    this.d(string13);
                    String string14 = n2 == f.f.a.e.b.b.m ? "Close" : "Cancel";
                    this.c(string14);
                    string7 = "Continue";
                }
                this.b(string7);
                return;
            }
            a.super.a(string3, string4, string5, string6);
            return;
        }
        catch (Exception exception) {
            h.a((String)"MTGAlertDialog", (String)exception.getMessage());
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(String string2) {
        try {
            Context context = this.getContext();
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Mintegral_ConfirmTitle");
            stringBuilder.append(string2);
            String string3 = q.b((Context)context, (String)stringBuilder.toString(), (Object)"").toString();
            Context context2 = this.getContext();
            StringBuilder stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Mintegral_ConfirmContent");
            stringBuilder2.append(string2);
            String string4 = q.b((Context)context2, (String)stringBuilder2.toString(), (Object)"").toString();
            Context context3 = this.getContext();
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("Mintegral_CancelText");
            stringBuilder3.append(string2);
            String string5 = q.b((Context)context3, (String)stringBuilder3.toString(), (Object)"").toString();
            Context context4 = this.getContext();
            StringBuilder stringBuilder4 = new StringBuilder();
            stringBuilder4.append("Mintegral_ConfirmText");
            stringBuilder4.append(string2);
            String string6 = q.b((Context)context4, (String)stringBuilder4.toString(), (Object)"").toString();
            f.f.a.f.a a2 = c.b().a(f.f.a.e.c.a.i().f());
            boolean bl = TextUtils.isEmpty((CharSequence)string3);
            if (bl && TextUtils.isEmpty((CharSequence)string4) && TextUtils.isEmpty((CharSequence)string5) && TextUtils.isEmpty((CharSequence)string6)) {
                if (a2 != null) {
                    a.super.a(a2.n(), a2.o(), a2.p(), a2.q());
                    return;
                }
                String string7 = Locale.getDefault().getLanguage();
                if (!TextUtils.isEmpty((CharSequence)string7) && string7.equals((Object)"zh")) {
                    this.e("\u786e\u8ba4\u5173\u95ed\uff1f");
                    this.d("\u5173\u95ed\u540e\u60a8\u5c06\u4e0d\u4f1a\u83b7\u5f97\u4efb\u4f55\u5956\u52b1\u5662~ ");
                    this.c("\u786e\u8ba4\u5173\u95ed");
                    this.b("\u7ee7\u7eed\u89c2\u770b");
                    return;
                }
                this.e("Confirm to close? ");
                this.d("You will not be rewarded after closing the window");
                this.c("Close it");
                this.b("Continue");
                return;
            }
            String string8 = Locale.getDefault().getLanguage();
            if (TextUtils.isEmpty((CharSequence)string3)) {
                if (a2 != null) {
                    string3 = a2.n();
                } else if (!TextUtils.isEmpty((CharSequence)string8) && string8.equals((Object)"zh")) {
                    this.e("\u786e\u8ba4\u5173\u95ed\uff1f");
                } else {
                    this.e("Confirm to close? ");
                }
            }
            if (TextUtils.isEmpty((CharSequence)string4)) {
                if (a2 != null) {
                    string4 = a2.o();
                } else if (!TextUtils.isEmpty((CharSequence)string8) && string8.equals((Object)"zh")) {
                    this.d("\u5173\u95ed\u540e\u60a8\u5c06\u4e0d\u4f1a\u83b7\u5f97\u4efb\u4f55\u5956\u52b1\u5662~ ");
                } else {
                    this.d("You will not be rewarded after closing the window");
                }
            }
            if (TextUtils.isEmpty((CharSequence)string6)) {
                if (a2 != null) {
                    string6 = a2.p();
                } else if (!TextUtils.isEmpty((CharSequence)string8) && string8.equals((Object)"zh")) {
                    this.c("\u786e\u8ba4\u5173\u95ed");
                } else {
                    this.c("Close it");
                }
            }
            if (TextUtils.isEmpty((CharSequence)string5)) {
                if (a2 != null) {
                    string5 = a2.q();
                } else if (!TextUtils.isEmpty((CharSequence)string8) && string8.equals((Object)"zh")) {
                    this.b("\u7ee7\u7eed\u89c2\u770b");
                } else {
                    this.b("Continue");
                }
            }
            a.super.a(string3, string4, string6, string5);
            return;
        }
        catch (Exception exception) {
            h.a((String)"MTGAlertDialog", (String)exception.getMessage());
            return;
        }
    }

    public void b(String string2) {
        Button button = this.f;
        if (button != null) {
            button.setText((CharSequence)string2);
        }
    }

    public void c(String string2) {
        Button button = this.e;
        if (button != null) {
            button.setText((CharSequence)string2);
        }
    }

    public void d(String string2) {
        TextView textView = this.d;
        if (textView != null) {
            textView.setText((CharSequence)string2);
        }
    }

    public void e(String string2) {
        TextView textView = this.c;
        if (textView != null) {
            textView.setText((CharSequence)string2);
        }
    }

}

