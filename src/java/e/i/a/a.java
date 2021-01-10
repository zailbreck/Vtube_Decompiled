/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.BroadcastReceiver
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.Intent
 *  android.content.IntentFilter
 *  android.net.Uri
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.util.Log
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayList
 *  java.util.HashMap
 *  java.util.Set
 */
package e.i.a;

import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public final class a {
    private static final Object f = new Object();
    private static a g;
    private final Context a;
    private final HashMap<BroadcastReceiver, ArrayList<c>> b = new HashMap();
    private final HashMap<String, ArrayList<c>> c = new HashMap();
    private final ArrayList<b> d = new ArrayList();
    private final Handler e;

    private a(Context context) {
        this.a = context;
        this.e = new Handler(context.getMainLooper()){

            public void handleMessage(Message message) {
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                a.this.a();
            }
        };
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static a a(Context context) {
        Object object;
        Object object2 = object = f;
        synchronized (object2) {
            if (g != null) return g;
            g = new a(context.getApplicationContext());
            return g;
        }
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
    void a() {
        block4 : do {
            HashMap<BroadcastReceiver, ArrayList<c>> hashMap;
            HashMap<BroadcastReceiver, ArrayList<c>> hashMap2 = hashMap = this.b;
            // MONITORENTER : hashMap2
            int n2 = this.d.size();
            if (n2 <= 0) {
                // MONITOREXIT : hashMap2
                return;
            }
            Object[] arrobject = new b[n2];
            this.d.toArray(arrobject);
            this.d.clear();
            // MONITOREXIT : hashMap2
            int n3 = 0;
            do {
                if (n3 >= arrobject.length) continue block4;
                Object object = arrobject[n3];
                int n4 = ((b)object).b.size();
                for (int i2 = 0; i2 < n4; ++i2) {
                    c c2 = (c)((b)object).b.get(i2);
                    if (c2.d) continue;
                    c2.b.onReceive(this.a, ((b)object).a);
                }
                ++n3;
            } while (true);
            break;
        } while (true);
        {
            catch (Throwable throwable) {}
            {
                // MONITOREXIT : hashMap2
                throw throwable;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(BroadcastReceiver broadcastReceiver) {
        HashMap<BroadcastReceiver, ArrayList<c>> hashMap;
        HashMap<BroadcastReceiver, ArrayList<c>> hashMap2 = hashMap = this.b;
        synchronized (hashMap2) {
            ArrayList arrayList = (ArrayList)this.b.remove((Object)broadcastReceiver);
            if (arrayList == null) {
                return;
            }
            int n2 = arrayList.size() - 1;
            block3 : while (n2 >= 0) {
                c c2 = (c)arrayList.get(n2);
                c2.d = true;
                int n3 = 0;
                do {
                    block11 : {
                        String string;
                        ArrayList arrayList2;
                        block12 : {
                            block10 : {
                                if (n3 >= c2.a.countActions()) break block10;
                                string = c2.a.getAction(n3);
                                arrayList2 = (ArrayList)this.c.get((Object)string);
                                if (arrayList2 == null) break block11;
                                break block12;
                            }
                            --n2;
                            continue block3;
                        }
                        int n4 = arrayList2.size() - 1;
                        do {
                            if (n4 >= 0) {
                                c c3 = (c)arrayList2.get(n4);
                                if (c3.b == broadcastReceiver) {
                                    c3.d = true;
                                    arrayList2.remove(n4);
                                }
                            } else {
                                if (arrayList2.size() > 0) break;
                                this.c.remove((Object)string);
                                break;
                            }
                            --n4;
                        } while (true);
                    }
                    ++n3;
                } while (true);
                break;
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        HashMap<BroadcastReceiver, ArrayList<c>> hashMap;
        HashMap<BroadcastReceiver, ArrayList<c>> hashMap2 = hashMap = this.b;
        synchronized (hashMap2) {
            c c2 = new c(intentFilter, broadcastReceiver);
            ArrayList arrayList = (ArrayList)this.b.get((Object)broadcastReceiver);
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                this.b.put((Object)broadcastReceiver, (Object)arrayList);
            }
            arrayList.add((Object)c2);
            for (int i2 = 0; i2 < intentFilter.countActions(); ++i2) {
                String string = intentFilter.getAction(i2);
                ArrayList arrayList2 = (ArrayList)this.c.get((Object)string);
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList(1);
                    this.c.put((Object)string, (Object)arrayList2);
                }
                arrayList2.add((Object)c2);
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean a(Intent intent) {
        HashMap<BroadcastReceiver, ArrayList<c>> hashMap;
        HashMap<BroadcastReceiver, ArrayList<c>> hashMap2 = hashMap = this.b;
        synchronized (hashMap2) {
            ArrayList arrayList;
            String string = intent.getAction();
            String string2 = intent.resolveTypeIfNeeded(this.a.getContentResolver());
            Uri uri = intent.getData();
            String string3 = intent.getScheme();
            Set set = intent.getCategories();
            boolean bl = (8 & intent.getFlags()) != 0;
            if (bl) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Resolving type ");
                stringBuilder.append(string2);
                stringBuilder.append(" scheme ");
                stringBuilder.append(string3);
                stringBuilder.append(" of intent ");
                stringBuilder.append((Object)intent);
                Log.v((String)"LocalBroadcastManager", (String)stringBuilder.toString());
            }
            if ((arrayList = (ArrayList)this.c.get((Object)intent.getAction())) == null) return false;
            if (bl) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Action list: ");
                stringBuilder.append((Object)arrayList);
                Log.v((String)"LocalBroadcastManager", (String)stringBuilder.toString());
            }
            ArrayList arrayList2 = null;
            int n2 = 0;
            while (n2 < arrayList.size()) {
                String string4;
                int n3;
                ArrayList arrayList3;
                String string5;
                block15 : {
                    ArrayList arrayList4;
                    block16 : {
                        int n4;
                        block14 : {
                            block13 : {
                                c c2;
                                block12 : {
                                    c2 = (c)arrayList.get(n2);
                                    if (bl) {
                                        StringBuilder stringBuilder = new StringBuilder();
                                        stringBuilder.append("Matching against filter ");
                                        stringBuilder.append((Object)c2.a);
                                        Log.v((String)"LocalBroadcastManager", (String)stringBuilder.toString());
                                    }
                                    if (!c2.c) break block12;
                                    if (bl) {
                                        Log.v((String)"LocalBroadcastManager", (String)"  Filter's target already added");
                                    }
                                    break block13;
                                }
                                IntentFilter intentFilter = c2.a;
                                String string6 = string;
                                String string7 = string2;
                                string5 = string;
                                arrayList4 = arrayList2;
                                n3 = n2;
                                arrayList3 = arrayList;
                                string4 = string2;
                                n4 = intentFilter.match(string6, string7, string3, uri, set, "LocalBroadcastManager");
                                if (n4 < 0) break block14;
                                if (bl) {
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append("  Filter matched!  match=0x");
                                    stringBuilder.append(Integer.toHexString((int)n4));
                                    Log.v((String)"LocalBroadcastManager", (String)stringBuilder.toString());
                                }
                                arrayList2 = arrayList4 == null ? new ArrayList() : arrayList4;
                                arrayList2.add((Object)c2);
                                c2.c = true;
                                break block15;
                            }
                            n3 = n2;
                            arrayList3 = arrayList;
                            string5 = string;
                            string4 = string2;
                            arrayList4 = arrayList2;
                            break block16;
                        }
                        if (bl) {
                            String string8 = n4 != -4 ? (n4 != -3 ? (n4 != -2 ? (n4 != -1 ? "unknown reason" : "type") : "data") : "action") : "category";
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("  Filter did not match: ");
                            stringBuilder.append(string8);
                            Log.v((String)"LocalBroadcastManager", (String)stringBuilder.toString());
                        }
                    }
                    arrayList2 = arrayList4;
                }
                n2 = n3 + 1;
                string = string5;
                arrayList = arrayList3;
                string2 = string4;
            }
            ArrayList arrayList5 = arrayList2;
            if (arrayList5 == null) return false;
            for (int i2 = 0; i2 < arrayList5.size(); ++i2) {
                ((c)arrayList5.get((int)i2)).c = false;
            }
            this.d.add((Object)new b(intent, arrayList5));
            if (this.e.hasMessages(1)) return true;
            this.e.sendEmptyMessage(1);
            return true;
        }
    }

    private static final class b {
        final Intent a;
        final ArrayList<c> b;

        b(Intent intent, ArrayList<c> arrayList) {
            this.a = intent;
            this.b = arrayList;
        }
    }

    private static final class c {
        final IntentFilter a;
        final BroadcastReceiver b;
        boolean c;
        boolean d;

        c(IntentFilter intentFilter, BroadcastReceiver broadcastReceiver) {
            this.a = intentFilter;
            this.b = broadcastReceiver;
        }

        public String toString() {
            StringBuilder stringBuilder = new StringBuilder(128);
            stringBuilder.append("Receiver{");
            stringBuilder.append((Object)this.b);
            stringBuilder.append(" filter=");
            stringBuilder.append((Object)this.a);
            if (this.d) {
                stringBuilder.append(" DEAD");
            }
            stringBuilder.append("}");
            return stringBuilder.toString();
        }
    }

}

