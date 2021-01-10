/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.ComponentName
 *  android.content.Context
 *  android.content.Intent
 *  android.content.ServiceConnection
 *  android.os.IBinder
 *  android.os.RemoteException
 *  f.f.a.e.f.h
 *  java.lang.Exception
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 */
package f.f.a.l;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import f.f.a.e.f.h;
import f.f.a.l.a;
import f.f.a.l.c;

public final class b {
    private Context a;
    private ServiceConnection b;
    private f.f.a.l.a c;
    private c d;

    public b(Context context) {
        this.a = context;
    }

    static /* synthetic */ f.f.a.l.a a(b b2) {
        return b2.c;
    }

    static /* synthetic */ c b(b b2) {
        return b2.d;
    }

    static /* synthetic */ void c(b b2) {
        h.b((String)"OaidAidlUtil", (String)"unbindService");
        Context context = b2.a;
        if (context == null) {
            h.d((String)"OaidAidlUtil", (String)"context is null");
            return;
        }
        ServiceConnection serviceConnection = b2.b;
        if (serviceConnection != null) {
            context.unbindService(serviceConnection);
            b2.c = null;
            b2.a = null;
            b2.d = null;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void a(c var1) {
        if (var1 != null) ** GOTO lbl5
        try {
            h.d((String)"OaidAidlUtil", (String)"callback is null");
            return;
lbl5: // 1 sources:
            this.d = var1;
            h.a((String)"OaidAidlUtil", (String)"bindService");
            if (this.a == null) {
                h.d((String)"OaidAidlUtil", (String)"context is null");
                return;
            }
            this.b = new b((b)this, null);
            var3_2 = new Intent("com.uodis.opendevice.OPENIDS_SERVICE");
            var3_2.setPackage("com.huawei.hwid");
            var5_3 = this.a.bindService(var3_2, this.b, 1);
            var6_4 = new StringBuilder();
            var6_4.append("bindService result: ");
            var6_4.append(var5_3);
            h.b((String)"OaidAidlUtil", (String)var6_4.toString());
            return;
        }
        catch (Throwable var2_5) {
            h.d((String)"OaidAidlUtil", (String)var2_5.getMessage());
            return;
        }
    }

    private final class b
    implements ServiceConnection {
        final /* synthetic */ b a;

        private b(b b2) {
            this.a = b2;
        }

        /* synthetic */ b(b b2, a a2) {
            super(b2);
        }

        /*
         * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        public final void onServiceConnected(ComponentName var1, IBinder var2_2) {
            block6 : {
                h.b((String)"OaidAidlUtil", (String)"onServiceConnected");
                b.a(this.a, a.a.a(var2_2));
                if (b.a(this.a) == null) return;
                if (b.b(this.a) == null) break block6;
                b.b(this.a).a(b.a(this.a).b(), b.a(this.a).a());
            }
lbl8: // 4 sources:
            do {
                b.c(this.a);
                return;
                break;
            } while (true);
            {
                catch (Throwable var7_3) {
                }
                catch (Exception var8_4) {}
                {
                    block7 : {
                        h.d((String)"OaidAidlUtil", (String)"getChannelInfo Excepition");
                        if (b.b(this.a) == null) ** GOTO lbl8
                        var5_5 = b.b(this.a);
                        var6_6 = var8_4.getMessage();
                        break block7;
                        catch (RemoteException var4_7) {
                            h.d((String)"OaidAidlUtil", (String)"getChannelInfo RemoteException");
                            if (b.b(this.a) == null) ** GOTO lbl8
                            var5_5 = b.b(this.a);
                            var6_6 = var4_7.getMessage();
                        }
                    }
                    var5_5.b(var6_6);
                    ** continue;
                }
            }
            b.c(this.a);
            throw var7_3;
        }

        public final void onServiceDisconnected(ComponentName componentName) {
            h.b((String)"OaidAidlUtil", (String)"onServiceDisconnected");
            this.a.c = null;
        }
    }

}

