/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  f.f.a.e.b.a.b
 *  java.lang.Class
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.Iterator
 *  java.util.LinkedHashMap
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 */
package f.f.a.e.b.a;

import android.graphics.Bitmap;
import f.f.a.e.b.a.b;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public final class a
implements b<String, Bitmap> {
    private final LinkedHashMap<String, Bitmap> a;
    private final int b;
    private int c;

    public a(int n2) {
        if (n2 > 0) {
            this.b = n2;
            this.a = new LinkedHashMap(0, 0.75f, true);
            return;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Bitmap a(String string) {
        if (string == null) {
            throw new NullPointerException("key == null");
        }
        void var4_2 = this;
        synchronized (var4_2) {
            Bitmap bitmap = (Bitmap)this.a.get((Object)string);
            if (bitmap != null && !bitmap.isRecycled()) {
                return bitmap;
            }
            return null;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    private void a(int var1) {
        do {
            block12 : {
                block11 : {
                    var11_3 = this;
                    // MONITORENTER : var11_3
                    if (this.c < 0 || this.a.isEmpty() && this.c != 0) ** GOTO lbl29
                    if (this.c <= var1) break block11;
                    if (this.a.isEmpty()) {
                        return;
                    }
                    var6_6 = (Map.Entry)this.a.entrySet().iterator().next();
                    if (var6_6 != null) break block12;
                }
                // MONITOREXIT : var11_3
                return;
            }
            var7_5 = (String)var6_6.getKey();
            var8_2 = (Bitmap)var6_6.getValue();
            {
                catch (Throwable var2_8) {
                    // MONITOREXIT : var11_3
                    throw var2_8;
                }
            }
            try {
                var10_4 = a.super.b(var7_5, var8_2);
                ((Bitmap)this.a.remove((Object)var7_5)).recycle();
                this.c -= var10_4;
                ** GOTO lbl-1000
            }
            catch (Throwable v0) {
                // MONITOREXIT : var11_3
                continue;
lbl29: // 1 sources:
                var3_7 = new StringBuilder();
                var3_7.append(this.getClass().getName());
                var3_7.append(".sizeOf() is reporting inconsistent results!");
                throw new IllegalStateException(var3_7.toString());
            }
            break;
        } while (true);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private boolean a(String string, Bitmap bitmap) {
        if (string != null && bitmap != null) {
            void var5_3 = this;
            synchronized (var5_3) {
                this.c += a.super.b(string, bitmap);
                Bitmap bitmap2 = (Bitmap)this.a.put((Object)string, (Object)bitmap);
                if (bitmap2 != null) {
                    this.c -= a.super.b(string, bitmap2);
                }
            }
            a.super.a(this.b);
            return true;
        }
        throw new NullPointerException("key == null || value == null");
    }

    private int b(String string, Bitmap bitmap) {
        return bitmap.getRowBytes() * bitmap.getHeight();
    }

    public final void a() {
        this.a(-1);
    }

    public final String toString() {
        a a2 = this;
        synchronized (a2) {
            Object[] arrobject = new Object[]{this.b};
            String string = String.format((String)"LruCache[maxSize=%d]", (Object[])arrobject);
            return string;
        }
    }
}

