/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.webkit.URLUtil
 *  f.f.a.a
 *  f.f.a.e.b.f.a
 *  f.f.a.e.f.r
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Throwable
 */
package f.f.a.s.f;

import android.webkit.URLUtil;
import f.f.a.e.f.r;
import f.f.a.s.f.e;
import f.f.a.s.f.f;
import f.f.a.s.f.g;

public final class e {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static void a(String string2, g.e e2, boolean bl) {
        try {
            if (!r.a((String)string2) && URLUtil.isNetworkUrl((String)string2)) {
                f.b.a.a(new f.f.a.e.b.f.a(e2, string2, bl){
                    final /* synthetic */ g.e e;
                    final /* synthetic */ String f;
                    final /* synthetic */ boolean g;
                    {
                        this.e = e2;
                        this.f = string2;
                        this.g = bl;
                    }

                    /*
                     * Unable to fully structure code
                     * Enabled aggressive block sorting
                     * Enabled unnecessary exception pruning
                     * Enabled aggressive exception aggregation
                     * Lifted jumps to return sites
                     */
                    public final void a() {
                        block39 : {
                            block40 : {
                                block37 : {
                                    block35 : {
                                        block38 : {
                                            block36 : {
                                                block32 : {
                                                    block34 : {
                                                        block33 : {
                                                            var1_1 = false;
                                                            if (this.e != null) {
                                                                this.e.a();
                                                            }
                                                            var23_2 = (java.net.HttpURLConnection)new java.net.URL(this.f).openConnection();
                                                            var23_2.setReadTimeout(30000);
                                                            var23_2.setConnectTimeout(20000);
                                                            var24_3 = var23_2.getResponseCode();
                                                            var25_4 = new java.lang.StringBuilder();
                                                            var25_4.append("response code ");
                                                            var25_4.append(var24_3);
                                                            f.f.a.e.f.h.a((String)"DownLoadUtils", (String)var25_4.toString());
                                                            if (var24_3 != 200) break block32;
                                                            var3_5 = var23_2.getInputStream();
                                                            var28_6 = new byte[6144];
                                                            var5_7 = new java.io.ByteArrayOutputStream();
                                                            try {
                                                                while ((var29_8 = var3_5.read(var28_6)) != -1) {
                                                                    var5_7.write(var28_6, 0, var29_8);
                                                                }
                                                                if (var5_7.toByteArray() == null) break block33;
                                                                var4_9 = var5_7.toByteArray();
                                                            }
                                                            catch (java.lang.Exception var2_12) {
                                                                var4_9 = null;
                                                                var6_10 = null;
                                                                break block35;
                                                            }
                                                            try {
                                                                var6_10 = !this.g ? new String(var4_9) : null;
                                                                break block34;
                                                            }
                                                            catch (java.lang.Exception var2_11) {
                                                                var6_10 = null;
                                                                break block35;
                                                            }
                                                        }
                                                        var4_9 = null;
                                                        var6_10 = null;
                                                    }
                                                    var30_17 = true;
                                                    var11_18 = "";
                                                    break block36;
                                                    catch (Throwable var7_19) {
                                                        var5_7 = null;
                                                        break block37;
                                                    }
                                                    catch (java.lang.Exception var2_13) {
                                                        var4_9 = null;
                                                        break block38;
                                                    }
                                                }
                                                var31_23 = new java.lang.StringBuilder();
                                                var31_23.append("responseCode is ");
                                                var31_23.append(var24_3);
                                                var11_18 = var31_23.toString();
                                                var3_5 = null;
                                                var4_9 = null;
                                                var5_7 = null;
                                                var6_10 = null;
                                                var30_17 = false;
                                            }
                                            var23_2.disconnect();
                                            if (var3_5 == null) ** GOTO lbl65
                                            try {
                                                var3_5.close();
lbl65: // 2 sources:
                                                if (var5_7 != null) {
                                                    var5_7.close();
                                                }
                                                var1_1 = var30_17;
                                                break block39;
                                            }
                                            catch (java.lang.Exception var22_26) {}
                                            catch (java.lang.Exception var2_14) {
                                                break block35;
                                            }
                                            catch (Throwable var7_20) {
                                                var8_24 = null;
                                                var5_7 = null;
                                                break block40;
                                            }
                                            catch (java.lang.Exception var2_15) {
                                                var3_5 = null;
                                                var4_9 = null;
                                            }
                                        }
                                        var5_7 = null;
                                        var6_10 = null;
                                    }
                                    var11_18 = var2_16.getMessage();
                                    var12_25 = new java.lang.StringBuilder();
                                    var12_25.append("getStringFromUrl failed ");
                                    var12_25.append(var2_16.getLocalizedMessage());
                                    f.f.a.e.f.h.d((String)"DownLoadUtils", (String)var12_25.toString());
                                    if (var3_5 == null) ** GOTO lbl92
                                    var3_5.close();
lbl92: // 2 sources:
                                    var1_1 = false;
                                    if (var5_7 != null) {
                                        var5_7.close();
                                        var1_1 = false;
                                    }
                                    break block39;
                                    catch (Throwable var7_21) {
                                        // empty catch block
                                    }
                                }
                                var8_24 = var3_5;
                            }
                            if (var8_24 == null) ** GOTO lbl105
                            try {
                                var8_24.close();
lbl105: // 2 sources:
                                if (var5_7 == null) throw var7_22;
                                var5_7.close();
                                throw var7_22;
                            }
                            catch (java.lang.Exception var9_32) {}
                            var22_26.printStackTrace();
                            var11_18 = var22_26.getMessage();
                        }
                        if (!var1_1) ** GOTO lbl117
                        try {
                            if (this.g && var4_9 != null && var4_9.length > 0) {
                                this.e.a(null, var4_9, this.f);
                                return;
                            }
lbl117: // 3 sources:
                            if (var1_1 && r.b(var6_10) && var6_10.length() > 0 && var6_10.contains((java.lang.CharSequence)"<mintegralloadend></mintegralloadend>")) {
                                if (this.e == null) return;
                                this.e.a(var6_10, var4_9, this.f);
                                return;
                            }
                            if (this.e == null) return;
                            var15_27 = this.e;
                            var16_28 = new java.lang.StringBuilder();
                            var16_28.append("content write failed:");
                            var16_28.append(var11_18);
                            var15_27.b(var16_28.toString());
                            return;
                        }
                        catch (Throwable var19_29) {}
                        if (f.f.a.a.a) {
                            var19_29.printStackTrace();
                        }
                        if ((var20_30 = this.e) == null) return;
                        try {
                            var20_30.b(var19_29.getMessage());
                            return;
                        }
                        catch (java.lang.Exception var21_31) {
                            var21_31.printStackTrace();
                        }
                        return;
                        var9_32.printStackTrace();
                        var9_32.getMessage();
                        throw var7_22;
                    }

                    public final void b() {
                    }
                });
                return;
            }
            if (e2 == null) return;
        }
        catch (Throwable throwable) {
            if (!f.f.a.a.a) return;
            throwable.printStackTrace();
            return;
        }
        e2.b("url is error");
    }
}

