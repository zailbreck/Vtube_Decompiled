/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.BitmapFactory
 *  android.graphics.BitmapFactory$Options
 *  android.util.Log
 *  java.io.File
 *  java.io.InputStream
 *  java.lang.CharSequence
 *  java.lang.Enum
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.List
 */
package m.a.a;

import android.graphics.BitmapFactory;
import android.util.Log;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import m.a.a.d;

final class a
extends Enum<a> {
    public static final /* enum */ a c = new a();
    private static List<String> d;
    private static final /* synthetic */ a[] e;
    private final byte[] b = new byte[]{-1, -40, -1};

    static {
        a[] arra = new a[]{c};
        e = arra;
        d = new ArrayList();
        d.add((Object)".jpg");
        d.add((Object)".jpeg");
        d.add((Object)".png");
        d.add((Object)".webp");
        d.add((Object)".gif");
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private int a(byte[] var1) {
        block17 : {
            block19 : {
                block15 : {
                    block18 : {
                        block14 : {
                            if (var1 == null) {
                                return 0;
                            }
                            var2_2 = 0;
                            while (var2_2 + 3 < var1.length) {
                                block16 : {
                                    var14_4 = var2_2 + 1;
                                    if ((255 & var1[var2_2]) != 255) break block16;
                                    var15_6 = 255 & var1[var14_4];
                                    if (var15_6 == 255) ** GOTO lbl-1000
                                    ++var14_4;
                                    if (var15_6 != 216 && var15_6 != 1) {
                                        if (var15_6 != 217 && var15_6 != 218) {
                                            var16_5 = a.super.a(var1, var14_4, 2, false);
                                            if (var16_5 >= 2 && (var17_3 = var14_4 + var16_5) <= var1.length) {
                                                if (var15_6 == 225 && var16_5 >= 8 && a.super.a(var1, var14_4 + 2, 4, false) == 1165519206 && a.super.a(var1, var14_4 + 6, 2, false) == 0) {
                                                    var2_2 = var14_4 + 8;
                                                    var3_7 = var16_5 - 8;
                                                    break block14;
                                                }
                                                var2_2 = var17_3;
                                                continue;
                                            }
                                            var4_8 = "Invalid length";
                                            break block15;
                                        }
                                    } else lbl-1000: // 2 sources:
                                    {
                                        var2_2 = var14_4;
                                        continue;
                                    }
                                }
                                var2_2 = var14_4;
                                break;
                            }
                            var3_7 = 0;
                        }
                        if (var3_7 <= 8) break block17;
                        var6_9 = a.super.a(var1, var2_2, 4, false);
                        if (var6_9 == 1229531648 || var6_9 == 1296891946) break block18;
                        var4_8 = "Invalid byte order";
                        break block15;
                    }
                    var7_10 = var6_9 == 1229531648;
                    var8_11 = 2 + a.super.a(var1, var2_2 + 4, 4, var7_10);
                    if (var8_11 >= 10 && var8_11 <= var3_7) break block19;
                    var4_8 = "Invalid offset";
                }
lbl41: // 3 sources:
                do {
                    Log.e((String)"Luban", (String)var4_8);
                    return 0;
                    break;
                } while (true);
            }
            var9_12 = var2_2 + var8_11;
            var10_13 = var3_7 - var8_11;
            var11_14 = a.super.a(var1, var9_12 - 2, 2, var7_10);
            do {
                block20 : {
                    var12_15 = var11_14 - 1;
                    if (var11_14 <= 0 || var10_13 < 12) break;
                    if (a.super.a(var1, var9_12, 2, var7_10) != 274) break block20;
                    var13_16 = a.super.a(var1, var9_12 + 8, 2, var7_10);
                    if (var13_16 == 1) return 0;
                    if (var13_16 == 3) return 180;
                    if (var13_16 == 6) return 90;
                    if (var13_16 == 8) return 270;
                    var4_8 = "Unsupported orientation";
                    ** GOTO lbl41
                }
                var9_12 += 12;
                var10_13 -= 12;
                var11_14 = var12_15;
            } while (true);
        }
        var4_8 = "Orientation not found";
        ** while (true)
    }

    private int a(byte[] arrby, int n2, int n3, boolean bl) {
        int n4;
        if (bl) {
            n2 += n3 - 1;
            n4 = -1;
        } else {
            n4 = 1;
        }
        int n5 = 0;
        do {
            int n6 = n3 - 1;
            if (n3 <= 0) break;
            n5 = n5 << 8 | 255 & arrby[n2];
            n2 += n4;
            n3 = n6;
        } while (true);
        return n5;
    }

    private boolean b(byte[] arrby) {
        if (arrby != null) {
            if (arrby.length < 3) {
                return false;
            }
            byte[] arrby2 = new byte[]{arrby[0], arrby[1], arrby[2]};
            return Arrays.equals((byte[])this.b, (byte[])arrby2);
        }
        return false;
    }

    /*
     * Exception decompiling
     */
    private byte[] c(InputStream var1) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl45 : ALOAD : trying to set 0 previously set to 1
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
        // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
        // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
        // org.benf.cfr.reader.entities.g.p(Method.java:396)
        // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
        // org.benf.cfr.reader.entities.d.b(ClassFile.java:792)
        // org.benf.cfr.reader.b.a(Driver.java:128)
        // org.benf.cfr.reader.a.a(CfrDriverImpl.java:63)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.decompileWithCFR(JavaExtractionWorker.kt:61)
        // com.njlabs.showjava.decompilers.JavaExtractionWorker.doWork(JavaExtractionWorker.kt:130)
        // com.njlabs.showjava.decompilers.BaseDecompiler.withAttempt(BaseDecompiler.kt:108)
        // com.njlabs.showjava.workers.DecompilerWorker$b.run(DecompilerWorker.kt:118)
        // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1133)
        // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:607)
        // java.lang.Thread.run(Thread.java:761)
        throw new IllegalStateException("Decompilation failed");
    }

    public static a valueOf(String string2) {
        return (a)Enum.valueOf(a.class, (String)string2);
    }

    public static a[] values() {
        return (a[])e.clone();
    }

    int a(InputStream inputStream) {
        return a.super.a(a.super.c(inputStream));
    }

    String a(d d2) {
        try {
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeStream((InputStream)d2.a(), null, (BitmapFactory.Options)options);
            String string2 = options.outMimeType.replace((CharSequence)"image/", (CharSequence)".");
            return string2;
        }
        catch (Exception exception) {
            return ".jpg";
        }
    }

    boolean a(int n2, String string2) {
        boolean bl = true;
        if (n2 > 0) {
            File file = new File(string2);
            if (file.exists() && file.length() > (long)(n2 << 10)) {
                return bl;
            }
            bl = false;
        }
        return bl;
    }

    boolean b(InputStream inputStream) {
        return a.super.b(a.super.c(inputStream));
    }
}

