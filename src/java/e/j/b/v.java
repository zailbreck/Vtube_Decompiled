/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.media.MediaFormat
 *  android.os.Handler
 *  android.util.Log
 *  android.util.LongSparseArray
 *  androidx.media2.common.SubtitleData
 *  e.j.b.h
 *  e.j.b.h$a
 *  e.j.b.v$a
 *  e.j.b.v$b
 *  e.j.b.v$c
 *  e.j.b.v$d
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 */
package e.j.b;

import android.media.MediaFormat;
import android.os.Handler;
import android.util.Log;
import android.util.LongSparseArray;
import androidx.media2.common.SubtitleData;
import e.j.b.h;
import e.j.b.v;
import java.util.ArrayList;

/*
 * Exception performing whole class analysis.
 */
abstract class v
implements h.a {
    private final LongSparseArray<d> a;
    private final LongSparseArray<d> b;
    private b c;
    final ArrayList<a> d;
    protected boolean e;
    public boolean f;
    private MediaFormat g;
    protected h h;

    v(MediaFormat mediaFormat) {
        this.a = new LongSparseArray();
        this.b = new LongSparseArray();
        this.d = new ArrayList();
        this.f = false;
        new Handler();
        this.g = mediaFormat;
        this.c = new /* Unavailable Anonymous Inner Class!! */;
        this.a();
    }

    private void a(int n2) {
        d d2 = this.a.valueAt(n2);
        while (d2 != null) {
            a a2 = d2.a;
            while (a2 != null) {
                this.c.a(a2);
                a a3 = a2.d;
                a2.d = null;
                a2 = a3;
            }
            this.b.remove(d2.e);
            d d3 = d2.b;
            d2.c = null;
            d2.b = null;
            d2 = d3;
        }
        this.a.removeAt(n2);
    }

    protected void a() {
        v v2 = this;
        synchronized (v2) {
            if (this.f) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Clearing ");
                stringBuilder.append(this.d.size());
                stringBuilder.append(" active cues");
                Log.v((String)"SubtitleTrack", (String)stringBuilder.toString());
            }
            this.d.clear();
            return;
        }
    }

    public void a(long l2, long l3) {
        d d2;
        if (l2 != 0L && l2 != -1L && (d2 = this.b.get(l2)) != null) {
            d2.d = l3;
            d2.a(this.a);
        }
    }

    public void a(SubtitleData subtitleData) {
        long l2 = 1L + subtitleData.g();
        this.a(subtitleData.e(), true, l2);
        this.a(l2, (subtitleData.g() + subtitleData.f()) / 1000L);
    }

    public void a(h h2) {
        void var4_2 = this;
        synchronized (var4_2) {
            block6 : {
                h h3 = this.h;
                if (h3 != h2) break block6;
                return;
            }
            if (this.h != null) {
                this.h.b((h.a)this);
            }
            this.h = h2;
            if (this.h != null) {
                this.h.a((h.a)this);
            }
            return;
        }
    }

    protected abstract void a(byte[] var1, boolean var2, long var3);

    public final MediaFormat b() {
        return this.g;
    }

    public abstract c c();

    public int d() {
        if (this.c() == null) {
            return 3;
        }
        return 4;
    }

    public void e() {
        c c2;
        if (!this.e) {
            return;
        }
        h h2 = this.h;
        if (h2 != null) {
            h2.b((h.a)this);
        }
        if ((c2 = this.c()) != null) {
            c2.setVisible(false);
        }
        this.e = false;
    }

    public void f() {
        h h2;
        if (this.e) {
            return;
        }
        this.e = true;
        c c2 = this.c();
        if (c2 != null) {
            c2.setVisible(true);
        }
        if ((h2 = this.h) != null) {
            h2.a((h.a)this);
        }
    }

    protected void finalize() {
        for (int i2 = -1 + this.a.size(); i2 >= 0; --i2) {
            this.a(i2);
        }
        super.finalize();
    }
}

