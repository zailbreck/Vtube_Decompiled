/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.os.AsyncTask
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.Void
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ThreadPoolExecutor
 *  org.json.JSONObject
 */
package f.e.a.a.b.m;

import android.os.AsyncTask;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

public abstract class b$c
extends AsyncTask<Object, Void, String> {
    private a a;
    protected final b b;

    public b$c(b b2) {
        this.b = b2;
    }

    public void a(a a2) {
        this.a = a2;
    }

    protected void a(String string) {
        a a2 = this.a;
        if (a2 != null) {
            a2.a((b$c)this);
        }
    }

    public void a(ThreadPoolExecutor threadPoolExecutor) {
        this.executeOnExecutor((Executor)threadPoolExecutor, new Object[0]);
    }

    protected /* synthetic */ void onPostExecute(Object object) {
        this.a((String)object);
    }

    public static interface a {
        public void a(b$c var1);
    }

    public static interface b {
        public void a(JSONObject var1);

        public JSONObject b();
    }

}

