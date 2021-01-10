/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.BroadcastReceiver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  android.widget.TextView
 *  f.f.a.e.b.d.b
 *  f.f.a.e.b.d.c
 *  f.f.a.e.f.l
 *  java.lang.CharSequence
 *  java.lang.Object
 *  java.lang.String
 */
package f.f.a.m;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import f.f.a.e.b.d.c;
import f.f.a.e.f.l;
import f.f.a.m.e;

public class e
extends Activity {
    private RelativeLayout b;
    private ImageView c;
    private Bitmap d;
    private String e;
    private c f = new c(this){
        final /* synthetic */ e b;
        {
            this.b = e2;
        }

        public void a(Bitmap bitmap, String string2) {
            if (e.a(this.b) != null && bitmap != null && !bitmap.isRecycled() && ((String)e.a(this.b).getTag()).equals((Object)string2)) {
                e.a(this.b).setImageBitmap(bitmap);
                e.a(this.b, bitmap);
            }
        }

        public void a(String string2, String string3) {
        }
    };
    BroadcastReceiver g = new BroadcastReceiver(){

        public void onReceive(Context context, Intent intent) {
            e.this.finish();
        }
    };
    private RelativeLayout h;

    static /* synthetic */ Bitmap a(e e2, Bitmap bitmap) {
        e2.d = bitmap;
        return bitmap;
    }

    private View a() {
        if (this.b == null) {
            this.b = new RelativeLayout((Context)this);
            this.h = new RelativeLayout((Context)this);
            int n2 = l.b((Context)this, (float)15.0f);
            this.h.setPadding(n2, n2, n2, n2);
            int n3 = this.getResources().getIdentifier("mintegral_native_bg_loading_camera", "drawable", this.getPackageName());
            this.h.setBackgroundResource(n3);
            TextView textView = new TextView((Context)this);
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(l.b((Context)this, (float)140.0f), l.b((Context)this, (float)31.5f));
            this.h.addView((View)textView, (ViewGroup.LayoutParams)layoutParams);
            this.c = new f.f.a.t.a((Context)this);
            this.c.setId(l.a());
            this.c.setTag((Object)this.e);
            if (!TextUtils.isEmpty((CharSequence)this.e)) {
                f.f.a.e.b.d.b.a((Context)this.getApplicationContext()).a(this.e, this.f);
            }
            int n4 = l.b((Context)this, (float)64.0f);
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(n4, n4);
            layoutParams2.addRule(13, -1);
            this.h.addView((View)this.c, (ViewGroup.LayoutParams)layoutParams2);
            TextView textView2 = new TextView((Context)this);
            textView2.setSingleLine();
            textView2.setTextColor(-1);
            textView2.setTextSize(16.0f);
            textView2.setText((CharSequence)"Relax while loading....");
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(3, this.c.getId());
            layoutParams3.addRule(14, -1);
            this.h.addView((View)textView2, (ViewGroup.LayoutParams)layoutParams3);
            this.b.addView((View)this.h, (ViewGroup.LayoutParams)new RelativeLayout.LayoutParams(-1, -1));
        }
        return this.b;
    }

    static /* synthetic */ ImageView a(e e2) {
        return e2.c;
    }

    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.getIntent().hasExtra("icon_url")) {
            this.e = this.getIntent().getStringExtra("icon_url");
        }
        this.setContentView(e.super.a());
    }

    protected void onDestroy() {
        ImageView imageView;
        BroadcastReceiver broadcastReceiver = this.g;
        if (broadcastReceiver != null) {
            this.unregisterReceiver(broadcastReceiver);
        }
        if ((imageView = this.c) != null) {
            imageView.setImageBitmap(null);
        }
        this.c = null;
        this.b = null;
        this.f = null;
        RelativeLayout relativeLayout = this.h;
        if (relativeLayout != null) {
            relativeLayout.setBackgroundDrawable(null);
        }
        this.h = null;
        Bitmap bitmap = this.d;
        if (bitmap != null && !bitmap.isRecycled()) {
            this.d = null;
        }
        super.onDestroy();
    }

    protected void onResume() {
        super.onResume();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("ExitApp");
        BroadcastReceiver broadcastReceiver = this.g;
        if (broadcastReceiver != null) {
            this.registerReceiver(broadcastReceiver, intentFilter);
        }
    }

}

