/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  java.io.File
 *  java.lang.Object
 *  java.lang.Runtime
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.LinkedHashMap
 *  java.util.LinkedList
 *  java.util.List
 */
package f.f.a.e.b.d;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import f.f.a.e.b.d.b;
import f.f.a.e.b.d.c;
import f.f.a.e.b.d.d;
import f.f.a.e.f.h;
import f.f.a.e.f.k;
import f.f.a.e.f.l;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;

public final class b {
    private static b e;
    private f.f.a.e.b.f.b a;
    private f.f.a.e.b.a.b<String, Bitmap> b;
    private LinkedHashMap<String, List<c>> c = new LinkedHashMap();
    private Handler d;

    private b(Context context) {
        this.d = new Handler(Looper.getMainLooper()){

            /*
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             */
            public final void handleMessage(Message message) {
                try {
                    LinkedHashMap linkedHashMap;
                    String string;
                    int n2 = message.what;
                    if (n2 == 1) {
                        string = message.getData().getString("message_key");
                        Bitmap bitmap = f.f.a.e.b.d.a.a(message.getData().getString("message_bitmap"));
                        b.this.a(string, bitmap);
                        LinkedList linkedList = (LinkedList)b.this.c.get((Object)string);
                        if (linkedList != null) {
                            for (c c2 : linkedList) {
                                if (c2 == null) continue;
                                c2.a(bitmap, string);
                            }
                        }
                        linkedHashMap = b.this.c;
                    } else {
                        if (message.what != 2) return;
                        string = message.getData().getString("message_key");
                        String string2 = message.getData().getString("message_message");
                        LinkedList linkedList = (LinkedList)b.this.c.get((Object)string);
                        if (linkedList != null) {
                            for (c c3 : linkedList) {
                                if (c3 == null) continue;
                                c3.a(string2, string);
                            }
                        }
                        linkedHashMap = b.this.c;
                    }
                    linkedHashMap.remove((Object)string);
                    return;
                }
                catch (Throwable throwable) {
                    throwable.printStackTrace();
                }
            }
        };
        this.a = new f.f.a.e.b.f.b(context);
        this.b = new f.f.a.e.b.a.a((int)Runtime.getRuntime().maxMemory() / 5);
    }

    public static b a(Context context) {
        if (e == null) {
            e = new b(context);
        }
        return e;
    }

    private d a(String string, String string2, String string3, boolean bl, boolean bl2) {
        d.b b2 = new d.b(this){
            final /* synthetic */ b a;
            {
                this.a = b2;
            }

            public final void a(String string, String string2) {
                Message message = b.b(this.a).obtainMessage();
                message.what = 1;
                Bundle bundle = new Bundle();
                bundle.putString("message_key", string);
                bundle.putString("message_bitmap", string2);
                message.setData(bundle);
                b.b(this.a).sendMessage(message);
            }

            public final void b(String string, String string2) {
                Message message = b.b(this.a).obtainMessage();
                message.what = 2;
                Bundle bundle = new Bundle();
                bundle.putString("message_key", string);
                bundle.putString("message_message", string2);
                message.setData(bundle);
                b.b(this.a).sendMessage(message);
            }
        };
        d d2 = new d(string, string2, string3);
        d2.a(bl);
        d2.a(b2);
        return d2;
    }

    private void a(String string, String string2, String string3, boolean bl, boolean bl2, c c2) {
        if (!this.c.containsKey((Object)string2)) {
            LinkedList linkedList = new LinkedList();
            linkedList.add((Object)c2);
            this.c.put((Object)string2, (Object)linkedList);
            d d2 = this.a(string, string2, string3, bl, bl2);
            this.a.a(d2);
            return;
        }
        LinkedList linkedList = (LinkedList)this.c.get((Object)string2);
        if (linkedList != null && !linkedList.contains((Object)c2)) {
            linkedList.add((Object)c2);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("loading:");
        stringBuilder.append(string2);
        h.a("ImageLoader", stringBuilder.toString());
    }

    static /* synthetic */ Handler b(b b2) {
        return b2.d;
    }

    public static void b() {
        e.a();
    }

    private Bitmap c(String string) {
        return this.b.a(string);
    }

    public final Bitmap a(String string) {
        Bitmap bitmap;
        if (l.a(string)) {
            return null;
        }
        String string2 = k.a(string);
        File file = new File(string2);
        if (b.super.c(string) != null) {
            return b.super.c(string);
        }
        if (file.exists() && (bitmap = f.f.a.e.b.d.a.a(string2)) != null) {
            this.a(string, bitmap);
            return bitmap;
        }
        return null;
    }

    public final void a() {
        f.f.a.e.b.a.b<String, Bitmap> b2 = this.b;
        if (b2 != null) {
            b2.a();
        }
    }

    public final void a(String string, Bitmap bitmap) {
        if (b.super.c(string) == null && bitmap != null) {
            this.b.a(string, bitmap);
        }
    }

    public final void a(String string, c c2) {
        String string2 = k.a(string);
        if (!l.a(string) && !l.a(string)) {
            boolean bl;
            if (l.a(string2)) {
                return;
            }
            File file = new File(string2);
            Bitmap bitmap = b.super.c(string);
            if (bitmap != null && !bitmap.isRecycled()) {
                c2.a(bitmap, string);
                return;
            }
            if (file.exists()) {
                Bitmap bitmap2 = f.f.a.e.b.d.a.a(string2);
                if (bitmap2 != null && !bitmap2.isRecycled()) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("url image [");
                    stringBuilder.append(string);
                    stringBuilder.append("] is downloaded, save by file [");
                    stringBuilder.append(string2);
                    stringBuilder.append("]");
                    h.a("ImageLoader", stringBuilder.toString());
                    this.a(string, bitmap2);
                    c2.a(bitmap2, string);
                    return;
                }
                bl = true;
            } else {
                bl = false;
            }
            b.super.a(string, string, string2, bl, false, c2);
        }
    }

    public final boolean b(String string) {
        if (l.a(string)) {
            return false;
        }
        File file = new File(k.a(string));
        if (b.super.c(string) != null) {
            return true;
        }
        return file.exists();
    }

}

