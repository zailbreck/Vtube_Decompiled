/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.ContentValues
 *  android.content.Context
 *  android.content.Intent
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.Toast
 *  androidx.fragment.app.Fragment
 *  androidx.fragment.app.Fragment$e
 *  java.io.Serializable
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package com.mintegral.msdk.activity;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.mintegral.msdk.activity.MTGCommonActivity;
import f.f.a.e.d.e;
import f.f.a.e.d.h;
import f.f.a.e.g.a;
import f.f.a.f.c;
import f.f.a.h.b;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

public class MTGCommonActivity
extends Activity {
    String b = "";
    private f.f.a.e.e.a c;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void onCreate(Bundle bundle) {
        String string = this.getIntent().getStringExtra("intent_flag");
        String string2 = this.getIntent().getStringExtra("intent_jsonobject");
        if (!TextUtils.isEmpty((CharSequence)string) && string.equals((Object)"shortcuts") && !TextUtils.isEmpty((CharSequence)string2)) {
            super.onCreate(bundle);
            try {
                this.c = f.f.a.e.e.a.b(new JSONObject(string2));
            }
            catch (JSONException jSONException) {
                jSONException.printStackTrace();
            }
            try {
                f.f.a.e.e.a a2;
                f.f.a.f.a a3 = c.b().a(f.f.a.e.c.a.i().f());
                if (a3 == null) {
                    a3 = c.b().a();
                }
                if ((a2 = e.a(h.a((Context)this)).b(this.c.e(), a3.E())) != null && !TextUtils.isEmpty((CharSequence)this.c.Y()) && !TextUtils.isEmpty((CharSequence)a3.E()) && a2.b0() == 0) {
                    f.f.a.g.b.a((Context)this, this.c, a3.E(), this.c.Y(), false, true);
                }
                this.c.o(1);
                ContentValues contentValues = new ContentValues();
                contentValues.put("is_click", Integer.valueOf((int)1));
                e.a(h.a((Context)this)).a(this.c.e(), contentValues);
                LinearLayout linearLayout = new LinearLayout((Context)this);
                linearLayout.setLayoutParams((ViewGroup.LayoutParams)new LinearLayout.LayoutParams(-1, -1));
                this.setContentView((View)linearLayout);
                b.a((Context)this).a(a3);
                b.a((Context)this).b(this.c, (Activity)this);
                return;
            }
            catch (Exception exception) {
                this.finish();
                exception.printStackTrace();
                return;
            }
        }
        if (f.f.a.a.f) {
            this.getWindow().addFlags(4718592);
        }
        if (f.f.a.e.c.a.i().e() == null) {
            f.f.a.e.c.a.i().a(this.getApplicationContext());
        }
        super.onCreate(bundle);
        this.requestWindowFeature(1);
        try {
            super.onCreate(bundle);
            this.b = this.getIntent().getStringExtra("url");
            if (!TextUtils.isEmpty((CharSequence)this.b)) {
                this.c = (f.f.a.e.e.a)this.getIntent().getSerializableExtra("mvcommon");
                String string3 = this.b;
                f.f.a.e.g.a a4 = new f.f.a.e.g.a((Context)this, this.c);
                a4.a(string3);
                a4.setListener(new a.f((MTGCommonActivity)this){
                    final /* synthetic */ MTGCommonActivity a;
                    {
                        this.a = mTGCommonActivity;
                    }

                    public final void a() {
                        this.a.finish();
                    }

                    public final void a(android.webkit.WebView webView, String string, android.graphics.Bitmap bitmap) {
                    }

                    public final boolean a(android.webkit.WebView webView, String string) {
                        if (f.f.a.e.f.k$d.a(string) && f.f.a.e.f.k$d.a((Context)this.a, string, null)) {
                            this.a.finish();
                        }
                        return false;
                    }
                });
                this.setContentView((View)a4);
                return;
            }
            Toast.makeText((Context)this, (CharSequence)"Error: no data", (int)0).show();
            return;
        }
        catch (Fragment.e e2) {
            this.finish();
            return;
        }
    }

    public void setTheme(int n2) {
        String string = this.getIntent().getStringExtra("intent_flag");
        if (!TextUtils.isEmpty((CharSequence)string) && string.equals((Object)"shortcuts")) {
            super.setTheme(16973840);
        }
    }
}

