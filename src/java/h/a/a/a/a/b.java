/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.PorterDuff
 *  android.graphics.PorterDuff$Mode
 *  android.graphics.drawable.Drawable
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 *  android.widget.Toast
 *  h.a.a.a.a.b$a
 *  h.a.a.a.a.c
 *  h.a.a.a.a.d
 *  h.a.a.a.a.e
 *  i.f
 *  i.k.b.d
 *  io.flutter.plugin.common.MethodCall
 *  io.flutter.plugin.common.MethodChannel
 *  io.flutter.plugin.common.MethodChannel$MethodCallHandler
 *  io.flutter.plugin.common.MethodChannel$Result
 *  java.lang.CharSequence
 *  java.lang.Number
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 */
package h.a.a.a.a;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;
import h.a.a.a.a.b;
import h.a.a.a.a.c;
import h.a.a.a.a.d;
import h.a.a.a.a.e;
import i.f;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;

public final class b
implements MethodChannel.MethodCallHandler {
    private Toast b;
    private Context c;

    public b(Context context) {
        i.k.b.d.d((Object)context, (String)"context");
        this.c = context;
    }

    public static final /* synthetic */ Toast a(b b2) {
        Toast toast = b2.b;
        if (toast != null) {
            return toast;
        }
        i.k.b.d.e((String)"mToast");
        throw null;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    public void onMethodCall(MethodCall var1, MethodChannel.Result var2_2) {
        block23 : {
            block25 : {
                block27 : {
                    block26 : {
                        block24 : {
                            i.k.b.d.d((Object)var1, (String)"call");
                            i.k.b.d.d((Object)var2_2, (String)"result");
                            var3_3 = var1.method;
                            if (var3_3 == null) break block23;
                            var4_4 = var3_3.hashCode();
                            if (var4_4 == -1913642710) break block24;
                            if (var4_4 != -1367724422 || !var3_3.equals((Object)"cancel")) break block23;
                            var26_5 = this.b;
                            if (var26_5 == null) {
                                i.k.b.d.e((String)"mToast");
                                throw null;
                            }
                            var26_5.cancel();
                            break block25;
                        }
                        if (!var3_3.equals((Object)"showToast")) break block23;
                        var5_6 = String.valueOf((Object)var1.argument("msg"));
                        var6_7 = String.valueOf((Object)var1.argument("length"));
                        var7_8 = String.valueOf((Object)var1.argument("gravity"));
                        var8_9 = (Number)var1.argument("bgcolor");
                        var9_10 = (Number)var1.argument("textcolor");
                        var10_11 = (Number)var1.argument("fontSize");
                        var11_12 = var7_8.hashCode();
                        if (var11_12 == -1364013995) break block26;
                        if (var11_12 != 115029 || !var7_8.equals((Object)"top")) ** GOTO lbl-1000
                        var12_13 = 48;
                        break block27;
                    }
                    if (var7_8.equals((Object)"center")) {
                        var12_13 = 17;
                    } else lbl-1000: // 2 sources:
                    {
                        var12_13 = 80;
                    }
                }
                var13_14 = i.k.b.d.a((Object)var6_7, (Object)"long");
                if (var8_9 == null && var9_10 == null && var10_11 == null) {
                    var25_15 = Toast.makeText((Context)this.c, (CharSequence)var5_6, (int)var13_14);
                    i.k.b.d.a((Object)var25_15, (String)"Toast.makeText(context, mMessage, mDuration)");
                    this.b = var25_15;
                } else {
                    var14_16 = this.c.getSystemService("layout_inflater");
                    if (var14_16 == null) throw new f("null cannot be cast to non-null type android.view.LayoutInflater");
                    var15_17 = ((LayoutInflater)var14_16).inflate(e.toast_custom, null);
                    var16_18 = (TextView)var15_17.findViewById(d.text);
                    i.k.b.d.a((Object)var16_18, (String)"text");
                    var16_18.setText((CharSequence)var5_6);
                    if (Build.VERSION.SDK_INT >= 21) {
                        var17_19 = this.c.getDrawable(c.corner);
                        if (var17_19 == null) {
                            i.k.b.d.a();
                            throw null;
                        }
                        var18_20 = "context.getDrawable(R.drawable.corner)!!";
                    } else {
                        var17_19 = this.c.getResources().getDrawable(c.corner);
                        var18_20 = "context.resources.getDrawable(R.drawable.corner)";
                    }
                    i.k.b.d.a((Object)var17_19, (String)var18_20);
                    if (var8_9 != null) {
                        var17_19.setColorFilter(var8_9.intValue(), PorterDuff.Mode.SRC);
                    }
                    var16_18.setBackground(var17_19);
                    if (var10_11 != null) {
                        var16_18.setTextSize(var10_11.floatValue());
                    }
                    if (var9_10 != null) {
                        var16_18.setTextColor(var9_10.intValue());
                    }
                    if ((var19_21 = (this.b = new Toast(this.c))) == null) {
                        i.k.b.d.e((String)"mToast");
                        throw null;
                    }
                    var19_21.setDuration(var13_14);
                    var20_22 = this.b;
                    if (var20_22 == null) {
                        i.k.b.d.e((String)"mToast");
                        throw null;
                    }
                    var20_22.setView(var15_17);
                }
                if (var12_13 != 17) {
                    var24_23 = this.b;
                    if (var12_13 != 48) {
                        if (var24_23 == null) {
                            i.k.b.d.e((String)"mToast");
                            throw null;
                        }
                    } else if (var24_23 == null) {
                        i.k.b.d.e((String)"mToast");
                        throw null;
                    }
                    var24_23.setGravity(var12_13, 0, 100);
                } else {
                    var21_24 = this.b;
                    if (var21_24 == null) {
                        i.k.b.d.e((String)"mToast");
                        throw null;
                    }
                    var21_24.setGravity(var12_13, 0, 0);
                }
                var22_25 = this.c;
                if (var22_25 instanceof Activity) {
                    if (var22_25 == null) throw new f("null cannot be cast to non-null type android.app.Activity");
                    ((Activity)var22_25).runOnUiThread((Runnable)new a((b)this));
                } else {
                    var23_26 = this.b;
                    if (var23_26 == null) {
                        i.k.b.d.e((String)"mToast");
                        throw null;
                    }
                    var23_26.show();
                }
            }
            var2_2.success((Object)true);
            return;
        }
        var2_2.notImplemented();
    }
}

