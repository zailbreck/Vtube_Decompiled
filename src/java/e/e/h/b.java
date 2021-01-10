/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ContentResolver
 *  android.content.ContentUris
 *  android.content.Context
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.content.pm.PackageManager$NameNotFoundException
 *  android.content.pm.ProviderInfo
 *  android.content.pm.Signature
 *  android.content.res.Resources
 *  android.database.Cursor
 *  android.graphics.Typeface
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.CancellationSignal
 *  android.os.Handler
 *  java.lang.InterruptedException
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.nio.ByteBuffer
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Collections
 *  java.util.Comparator
 *  java.util.HashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.Callable
 */
package e.e.h;

import android.content.ContentResolver;
import android.content.ContentUris;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CancellationSignal;
import android.os.Handler;
import e.e.d.d.f;
import e.e.e.i;
import e.e.h.b;
import e.e.h.c;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;

public class b {
    static final e.d.e<String, Typeface> a = new e.d.e(16);
    private static final e.e.h.c b = new e.e.h.c("fonts", 10, 10000);
    static final Object c = new Object();
    static final e.d.g<String, ArrayList<c.d<g>>> d = new e.d.g();
    private static final Comparator<byte[]> e = new Comparator<byte[]>(){

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public int a(byte[] arrby, byte[] arrby2) {
            int n2;
            int n3;
            if (arrby.length != arrby2.length) {
                n2 = arrby.length;
                n3 = arrby2.length;
                do {
                    return n2 - n3;
                    break;
                } while (true);
            }
            for (int i2 = 0; i2 < arrby.length; ++i2) {
                if (arrby[i2] == arrby2[i2]) continue;
                n2 = arrby[i2];
                n3 = arrby2[i2];
                return n2 - n3;
            }
            return 0;
        }
    };

    public static ProviderInfo a(PackageManager packageManager, e.e.h.a a2, Resources resources) {
        PackageManager.NameNotFoundException nameNotFoundException;
        String string = a2.d();
        ProviderInfo providerInfo = packageManager.resolveContentProvider(string, 0);
        if (providerInfo != null) {
            if (providerInfo.packageName.equals((Object)a2.e())) {
                List<byte[]> list = b.a(packageManager.getPackageInfo((String)providerInfo.packageName, (int)64).signatures);
                Collections.sort(list, e);
                List<List<byte[]>> list2 = b.a(a2, resources);
                for (int i2 = 0; i2 < list2.size(); ++i2) {
                    ArrayList arrayList = new ArrayList((Collection)list2.get(i2));
                    Collections.sort((List)arrayList, e);
                    if (!b.a(list, (List<byte[]>)arrayList)) continue;
                    return providerInfo;
                }
                return null;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Found content provider ");
            stringBuilder.append(string);
            stringBuilder.append(", but package was not ");
            stringBuilder.append(a2.e());
            throw new PackageManager.NameNotFoundException(stringBuilder.toString());
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("No package found for authority: ");
        stringBuilder.append(string);
        nameNotFoundException = new PackageManager.NameNotFoundException(stringBuilder.toString());
        throw nameNotFoundException;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Typeface a(final Context context, final e.e.h.a a2, f.a a3, Handler handler, boolean bl, int n2, final int n3) {
        Object object;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(a2.c());
        stringBuilder.append("-");
        stringBuilder.append(n3);
        final String string = stringBuilder.toString();
        Typeface typeface = a.get(string);
        if (typeface != null) {
            if (a3 == null) return typeface;
            a3.a(typeface);
            return typeface;
        }
        if (bl && n2 == -1) {
            g g2 = b.a(context, a2, n3);
            if (a3 == null) return g2.a;
            int n4 = g2.b;
            if (n4 == 0) {
                a3.a(g2.a, handler);
                return g2.a;
            }
            a3.a(n4, handler);
            return g2.a;
        }
        Callable<g> callable = new Callable<g>(){

            public g call() {
                g g2 = b.a(context, a2, n3);
                Typeface typeface = g2.a;
                if (typeface != null) {
                    b.a.put(string, typeface);
                }
                return g2;
            }
        };
        Typeface typeface2 = null;
        if (bl) {
            try {
                return b.b.a(callable, (int)n2).a;
            }
            catch (InterruptedException interruptedException) {}
            return typeface2;
        }
        c.d<g> d2 = a3 == null ? null : new c.d<g>(a3, handler){
            final /* synthetic */ f.a a;
            final /* synthetic */ Handler b;
            {
                this.a = a2;
                this.b = handler;
            }

            /*
             * Enabled aggressive block sorting
             */
            public void a(g g2) {
                int n2;
                f.a a2;
                if (g2 == null) {
                    a2 = this.a;
                    n2 = 1;
                } else {
                    n2 = g2.b;
                    if (n2 == 0) {
                        this.a.a(g2.a, this.b);
                        return;
                    }
                    a2 = this.a;
                }
                a2.a(n2, this.b);
            }
        };
        Object object2 = object = c;
        synchronized (object2) {
            ArrayList<c.d<g>> arrayList = d.get(string);
            if (arrayList != null) {
                if (d2 == null) return null;
                arrayList.add((Object)d2);
                return null;
            }
            if (d2 != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add((Object)d2);
                d.put(string, (ArrayList<c.d<g>>)arrayList2);
            }
        }
        b.a(callable, new c.d<g>(string){
            final /* synthetic */ String a;
            {
                this.a = string;
            }

            /*
             * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
             * Loose catch block
             * Enabled aggressive block sorting
             * Enabled unnecessary exception pruning
             * Enabled aggressive exception aggregation
             * Converted monitor instructions to comments
             * Lifted jumps to return sites
             */
            public void a(g g2) {
                Object object;
                Object object2 = object = b.c;
                // MONITORENTER : object2
                ArrayList<c.d<g>> arrayList = b.d.get(this.a);
                if (arrayList == null) {
                    // MONITOREXIT : object2
                    return;
                }
                b.d.remove(this.a);
                // MONITOREXIT : object2
                int n2 = 0;
                while (n2 < arrayList.size()) {
                    ((c.d)arrayList.get(n2)).a(g2);
                    ++n2;
                }
                return;
                {
                    catch (Throwable throwable) {}
                    {
                        // MONITOREXIT : object2
                        throw throwable;
                    }
                }
            }
        });
        return null;
    }

    public static e a(Context context, CancellationSignal cancellationSignal, e.e.h.a a2) {
        ProviderInfo providerInfo = b.a(context.getPackageManager(), a2, context.getResources());
        if (providerInfo == null) {
            return new e(1, null);
        }
        return new e(0, b.a(context, a2, providerInfo.authority, cancellationSignal));
    }

    static g a(Context context, e.e.h.a a2, int n2) {
        e e2;
        try {
            e2 = b.a(context, null, a2);
        }
        catch (PackageManager.NameNotFoundException nameNotFoundException) {
            return new g(null, -1);
        }
        int n3 = e2.b();
        int n4 = -3;
        if (n3 == 0) {
            Typeface typeface = e.e.e.c.a(context, null, e2.a(), n2);
            if (typeface != null) {
                n4 = 0;
            }
            return new g(typeface, n4);
        }
        if (e2.b() == 1) {
            n4 = -2;
        }
        return new g(null, n4);
    }

    private static List<List<byte[]>> a(e.e.h.a a2, Resources resources) {
        if (a2.a() != null) {
            return a2.a();
        }
        return e.e.d.d.c.a(resources, a2.b());
    }

    private static List<byte[]> a(Signature[] arrsignature) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < arrsignature.length; ++i2) {
            arrayList.add((Object)arrsignature[i2].toByteArray());
        }
        return arrayList;
    }

    public static Map<Uri, ByteBuffer> a(Context context, f[] arrf, CancellationSignal cancellationSignal) {
        HashMap hashMap = new HashMap();
        for (f f2 : arrf) {
            Uri uri;
            if (f2.a() != 0 || hashMap.containsKey((Object)(uri = f2.c()))) continue;
            hashMap.put((Object)uri, (Object)i.a(context, cancellationSignal, uri));
        }
        return Collections.unmodifiableMap((Map)hashMap);
    }

    private static boolean a(List<byte[]> list, List<byte[]> list2) {
        if (list.size() != list2.size()) {
            return false;
        }
        for (int i2 = 0; i2 < list.size(); ++i2) {
            if (Arrays.equals((byte[])((byte[])list.get(i2)), (byte[])((byte[])list2.get(i2)))) continue;
            return false;
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static f[] a(Context context, e.e.h.a a2, String string, CancellationSignal cancellationSignal) {
        ArrayList arrayList = new ArrayList();
        Uri uri = new Uri.Builder().scheme("content").authority(string).build();
        Uri uri2 = new Uri.Builder().scheme("content").authority(string).appendPath("file").build();
        Cursor cursor = null;
        try {
            int n2 = Build.VERSION.SDK_INT;
            cursor = null;
            if (n2 > 16) {
                ContentResolver contentResolver = context.getContentResolver();
                String[] arrstring = new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                String[] arrstring2 = new String[]{a2.f()};
                cursor = contentResolver.query(uri, arrstring, "query = ?", arrstring2, null, cancellationSignal);
            } else {
                ContentResolver contentResolver = context.getContentResolver();
                String[] arrstring = new String[]{"_id", "file_id", "font_ttc_index", "font_variation_settings", "font_weight", "font_italic", "result_code"};
                String[] arrstring3 = new String[]{a2.f()};
                cursor = contentResolver.query(uri, arrstring, "query = ?", arrstring3, null);
            }
            if (cursor != null && cursor.getCount() > 0) {
                int n3 = cursor.getColumnIndex("result_code");
                ArrayList arrayList2 = new ArrayList();
                int n4 = cursor.getColumnIndex("_id");
                int n5 = cursor.getColumnIndex("file_id");
                int n6 = cursor.getColumnIndex("font_ttc_index");
                int n7 = cursor.getColumnIndex("font_weight");
                int n8 = cursor.getColumnIndex("font_italic");
                while (cursor.moveToNext()) {
                    int n9 = n3 != -1 ? cursor.getInt(n3) : 0;
                    int n10 = n6 != -1 ? cursor.getInt(n6) : 0;
                    Uri uri3 = n5 == -1 ? ContentUris.withAppendedId((Uri)uri, (long)cursor.getLong(n4)) : ContentUris.withAppendedId((Uri)uri2, (long)cursor.getLong(n5));
                    Uri uri4 = uri3;
                    int n11 = n7 != -1 ? cursor.getInt(n7) : 400;
                    boolean bl = n8 != -1 && cursor.getInt(n8) == 1;
                    f f2 = new f(uri4, n10, n11, bl, n9);
                    arrayList2.add((Object)f2);
                }
                arrayList = arrayList2;
            }
            if (cursor == null) return (f[])arrayList.toArray((Object[])new f[0]);
        }
        catch (Throwable throwable) {
            if (cursor == null) throw throwable;
            cursor.close();
            throw throwable;
        }
        cursor.close();
        return (f[])arrayList.toArray((Object[])new f[0]);
    }

    public static class e {
        private final int a;
        private final f[] b;

        public e(int n2, f[] arrf) {
            this.a = n2;
            this.b = arrf;
        }

        public f[] a() {
            return this.b;
        }

        public int b() {
            return this.a;
        }
    }

    public static class f {
        private final Uri a;
        private final int b;
        private final int c;
        private final boolean d;
        private final int e;

        public f(Uri uri, int n2, int n3, boolean bl, int n4) {
            e.e.j.e.a(uri);
            this.a = uri;
            this.b = n2;
            this.c = n3;
            this.d = bl;
            this.e = n4;
        }

        public int a() {
            return this.e;
        }

        public int b() {
            return this.b;
        }

        public Uri c() {
            return this.a;
        }

        public int d() {
            return this.c;
        }

        public boolean e() {
            return this.d;
        }
    }

    private static final class g {
        final Typeface a;
        final int b;

        g(Typeface typeface, int n2) {
            this.a = typeface;
            this.b = n2;
        }
    }

}

