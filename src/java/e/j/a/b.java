/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.MediaFormat
 *  android.util.Log
 *  android.view.Surface
 *  androidx.media.AudioAttributesCompat
 *  androidx.media2.common.FileMediaItem
 *  androidx.media2.common.MediaItem
 *  androidx.media2.common.SessionPlayer
 *  androidx.media2.common.SessionPlayer$TrackInfo
 *  androidx.media2.common.SessionPlayer$a
 *  androidx.media2.common.SessionPlayer$b
 *  androidx.media2.common.VideoSize
 *  e.d.a
 *  e.e.j.d
 *  e.j.a.a
 *  e.j.a.b$a
 *  e.j.a.b$a0
 *  e.j.a.b$b
 *  e.j.a.b$b0
 *  e.j.a.b$c
 *  e.j.a.b$c0
 *  e.j.a.b$d
 *  e.j.a.b$d0
 *  e.j.a.b$e
 *  e.j.a.b$e0
 *  e.j.a.b$f
 *  e.j.a.b$g
 *  e.j.a.b$g0
 *  e.j.a.b$h
 *  e.j.a.b$h0
 *  e.j.a.b$i
 *  e.j.a.b$j
 *  e.j.a.b$j0
 *  e.j.a.b$k0
 *  e.j.a.b$m
 *  e.j.a.b$n
 *  e.j.a.b$u
 *  e.j.a.b$v
 *  e.j.a.b$w
 *  e.j.a.b$x
 *  e.j.a.b$y
 *  e.j.a.b$z
 *  e.j.a.c
 *  e.j.a.c$a
 *  e.j.a.c$b
 *  e.j.a.c$c
 *  e.j.a.d
 *  e.j.a.e
 *  e.j.a.e$a
 *  e.j.a.f
 *  e.j.a.g
 *  e.j.a.i.b
 *  f.d.a.b.a.e
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.ArrayDeque
 *  java.util.ArrayList
 *  java.util.Collections
 *  java.util.HashMap
 *  java.util.Iterator
 *  java.util.List
 *  java.util.Map
 *  java.util.Objects
 *  java.util.concurrent.Executor
 *  java.util.concurrent.ExecutorService
 *  java.util.concurrent.Executors
 */
package e.j.a;

import android.content.Context;
import android.media.MediaFormat;
import android.util.Log;
import android.view.Surface;
import androidx.media.AudioAttributesCompat;
import androidx.media2.common.FileMediaItem;
import androidx.media2.common.MediaItem;
import androidx.media2.common.SessionPlayer;
import androidx.media2.common.VideoSize;
import e.j.a.b;
import e.j.a.c;
import e.j.a.e;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*
 * Exception performing whole class analysis.
 */
public final class b
extends SessionPlayer {
    static e.d.a<Integer, Integer> u;
    static e.d.a<Integer, Integer> v;
    static e.d.a<Integer, Integer> w;
    static e.d.a<Integer, Integer> x;
    static e.d.a<Integer, Integer> y;
    e.j.a.c d;
    ExecutorService e;
    final ArrayDeque<g0> f;
    final ArrayDeque<h0<? super SessionPlayer.b>> g;
    private final Object h;
    private int i;
    private Map<MediaItem, Integer> j;
    private boolean k;
    final e.j.a.a l;
    final Object m;
    c0 n;
    ArrayList<MediaItem> o;
    int p;
    int q;
    MediaItem r;
    MediaItem s;
    private boolean t;

    static {
        e.a a2 = new e.a();
        a2.b(1.0f);
        a2.a(1.0f);
        Integer n2 = 0;
        a2.a(0);
        a2.a();
        u = new e.d.a();
        u.put((Object)n2, (Object)n2);
        u.put((Object)Integer.MIN_VALUE, (Object)-1);
        e.d.a<Integer, Integer> a3 = u;
        Integer n3 = 1;
        a3.put((Object)n3, (Object)-2);
        e.d.a<Integer, Integer> a4 = u;
        Integer n4 = 2;
        a4.put((Object)n4, (Object)-3);
        e.d.a<Integer, Integer> a5 = u;
        Integer n5 = 3;
        a5.put((Object)n5, (Object)-4);
        e.d.a<Integer, Integer> a6 = u;
        Integer n6 = 4;
        a6.put((Object)n6, (Object)-5);
        e.d.a<Integer, Integer> a7 = u;
        Integer n7 = 5;
        a7.put((Object)n7, (Object)n3);
        v = new e.d.a();
        v.put((Object)n3, (Object)n3);
        e.d.a<Integer, Integer> a8 = v;
        Integer n8 = -1004;
        a8.put((Object)n8, (Object)n8);
        v.put((Object)-1007, (Object)-1007);
        v.put((Object)-1010, (Object)-1010);
        v.put((Object)-110, (Object)-110);
        w = new e.d.a();
        w.put((Object)n5, (Object)n5);
        w.put((Object)700, (Object)700);
        w.put((Object)704, (Object)704);
        w.put((Object)800, (Object)800);
        w.put((Object)801, (Object)801);
        w.put((Object)802, (Object)802);
        w.put((Object)804, (Object)804);
        w.put((Object)805, (Object)805);
        x = new e.d.a();
        x.put((Object)n2, (Object)n2);
        x.put((Object)n3, (Object)n3);
        x.put((Object)n4, (Object)n4);
        x.put((Object)n5, (Object)n5);
        y = new e.d.a();
        y.put((Object)n2, (Object)n2);
        y.put((Object)n3, (Object)-1001);
        y.put((Object)n4, (Object)-1003);
        y.put((Object)n5, (Object)-1003);
        y.put((Object)n6, (Object)n8);
        y.put((Object)n7, (Object)-1005);
    }

    public b(Context context) {
        this.f = new ArrayDeque();
        this.g = new ArrayDeque();
        this.h = new Object();
        this.j = new HashMap();
        this.m = new Object();
        this.n = new /* Unavailable Anonymous Inner Class!! */;
        this.o = new ArrayList();
        if (context != null) {
            this.i = 0;
            this.d = e.j.a.c.a((Context)context);
            this.e = Executors.newFixedThreadPool((int)1);
            this.d.a((Executor)this.e, (c.b)new /* Unavailable Anonymous Inner Class!! */);
            this.d.a((Executor)this.e, (c.a)new f0((b)this));
            this.q = -2;
            this.l = new e.j.a.a(context, (b)this);
            return;
        }
        throw new NullPointerException("context shouldn't be null");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private void I() {
        ArrayDeque<h0<? super SessionPlayer.b>> arrayDeque;
        ArrayDeque<h0<? super SessionPlayer.b>> arrayDeque2 = arrayDeque = this.g;
        synchronized (arrayDeque2) {
            h0 h02;
            Iterator iterator = this.g.iterator();
            while (iterator.hasNext() && ((h02 = iterator.next()).isCancelled() || h02.e())) {
                this.g.removeFirst();
            }
            while (iterator.hasNext()) {
                h0 h03 = iterator.next();
                if (!h03.i) {
                    return;
                }
                h03.e();
            }
            return;
        }
    }

    private k0 c(SessionPlayer.TrackInfo trackInfo) {
        if (trackInfo == null) {
            return null;
        }
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private e.j.a.i.b<SessionPlayer.b> c(MediaItem mediaItem) {
        ArrayDeque<g0> arrayDeque;
        Object object;
        e.j.a.i.b b2 = e.j.a.i.b.d();
        ArrayDeque<g0> arrayDeque2 = arrayDeque = this.f;
        synchronized (arrayDeque2) {
            this.a(19, b2, this.d.j(mediaItem));
        }
        Object object2 = object = this.m;
        synchronized (object2) {
            this.t = true;
            return b2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public AudioAttributesCompat A() {
        Object object;
        Object object2 = object = this.h;
        synchronized (object2) {
            if (this.k) {
                return null;
            }
        }
        try {
            return this.d.c();
        }
        catch (IllegalStateException illegalStateException) {
            return null;
        }
    }

    public e.j.a.a B() {
        return this.l;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public float C() {
        Object object;
        Object object2 = object = this.h;
        synchronized (object2) {
            if (this.k) {
                return 1.0f;
            }
            return this.d.i();
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
    public List<k0> D() {
        Object object;
        Object object2 = object = this.h;
        // MONITORENTER : object2
        if (this.k) {
            List list = Collections.emptyList();
            // MONITOREXIT : object2
            return list;
        }
        // MONITOREXIT : object2
        List list = this.d.j();
        MediaItem mediaItem = this.d.e();
        ArrayList arrayList = new ArrayList();
        int n2 = 0;
        while (n2 < list.size()) {
            c.c c2 = (c.c)list.get(n2);
            arrayList.add((Object)new /* Unavailable Anonymous Inner Class!! */);
            ++n2;
        }
        return arrayList;
        {
            catch (Throwable throwable) {}
            {
                // MONITOREXIT : object2
                throw throwable;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public f.d.a.b.a.e<SessionPlayer.b> E() {
        Object object;
        Object object2 = object = this.h;
        synchronized (object2) {
            if (this.k) {
                return this.z();
            }
        }
        v v2 = new v(this, (Executor)this.e);
        this.a(v2);
        return v2;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public void F() {
        ArrayDeque<g0> arrayDeque;
        ArrayDeque<h0<? super SessionPlayer.b>> arrayDeque2;
        ArrayDeque<g0> arrayDeque3 = arrayDeque = this.f;
        // MONITORENTER : arrayDeque3
        Iterator iterator = this.f.iterator();
        while (iterator.hasNext()) {
            (iterator.next()).b.cancel(true);
        }
        this.f.clear();
        // MONITOREXIT : arrayDeque3
        ArrayDeque<h0<? super SessionPlayer.b>> arrayDeque4 = arrayDeque2 = this.g;
        Iterator iterator2 = this.g.iterator();
        do {
            if (!iterator2.hasNext()) {
                Object object;
                Object object2;
                this.g.clear();
                // MONITOREXIT : arrayDeque4
                Object object3 = object = this.h;
                // MONITORENTER : object3
                this.i = 0;
                this.j.clear();
                // MONITOREXIT : object3
                Object object4 = object2 = this.m;
                // MONITORENTER : object4
                this.n.a();
                this.o.clear();
                this.r = null;
                this.s = null;
                this.q = -1;
                this.t = false;
                // MONITOREXIT : object4
                this.l.d();
                this.d.p();
                return;
            }
            h0 h02 = iterator2.next();
            if (!h02.j || h02.isDone() || h02.isCancelled()) continue;
            h02.cancel(true);
        } while (true);
        finally {
            // MONITORENTER : arrayDeque4
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    e.j.a.i.b<SessionPlayer.b> G() {
        ArrayDeque<g0> arrayDeque;
        e.j.a.i.b b2 = e.j.a.i.b.d();
        ArrayDeque<g0> arrayDeque2 = arrayDeque = this.f;
        synchronized (arrayDeque2) {
            this.a(29, b2, this.d.q());
            return b2;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    e.e.j.d<MediaItem, MediaItem> H() {
        block7 : {
            var1_1 = this.q;
            if (var1_1 < 0) {
                if (this.r == null && this.s == null) {
                    return null;
                }
                this.r = null;
                this.s = null;
                return new e.e.j.d(null, null);
            }
            if (!Objects.equals((Object)this.r, (Object)this.o.get(var1_1))) {
                this.r = var2_2 = (MediaItem)this.o.get(this.q);
            } else {
                var2_2 = null;
            }
            var3_3 = 1 + this.q;
            if (var3_3 >= this.o.size()) {
                var5_4 = this.p;
                var3_3 = var5_4 != 2 && var5_4 != 3 ? -1 : 0;
            }
            if (var3_3 != -1) break block7;
            this.s = null;
            ** GOTO lbl-1000
        }
        if (!Objects.equals((Object)this.s, (Object)this.o.get(var3_3))) {
            this.s = var4_5 = (MediaItem)this.o.get(var3_3);
        } else lbl-1000: // 2 sources:
        {
            var4_5 = null;
        }
        if (var2_2 != null) return new e.e.j.d((Object)var2_2, var4_5);
        if (var4_5 != null) return new e.e.j.d((Object)var2_2, var4_5);
        return null;
    }

    /*
     * Exception decompiling
     */
    public long a() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl27.1 : LDC2_W : trying to set 1 previously set to 0
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

    public SessionPlayer.TrackInfo a(int n2) {
        return this.a(this.d(n2));
    }

    SessionPlayer.TrackInfo a(k0 k02) {
        if (k02 == null) {
            return null;
        }
        return new SessionPlayer.TrackInfo(k02.b(), k02.c(), k02.d(), k02.a());
    }

    e.j.a.i.b<SessionPlayer.b> a(int n2, MediaItem mediaItem) {
        e.j.a.i.b b2 = e.j.a.i.b.d();
        if (mediaItem == null) {
            mediaItem = this.d.e();
        }
        b2.a((Object)new SessionPlayer.b(n2, mediaItem));
        return b2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public f.d.a.b.a.e<SessionPlayer.b> a(float f2) {
        Object object;
        Object object2 = object = this.h;
        synchronized (object2) {
            if (this.k) {
                return this.z();
            }
        }
        x x2 = new x((b)this, (Executor)this.e, f2);
        this.a(x2);
        return x2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public f.d.a.b.a.e<SessionPlayer.b> a(long l2, int n2) {
        Object object;
        Object object2 = object = this.h;
        synchronized (object2) {
            if (this.k) {
                return this.z();
            }
        }
        g g2 = new g((b)this, (Executor)this.e, true, n2, l2);
        this.a(g2);
        return g2;
    }

    public f.d.a.b.a.e<SessionPlayer.b> a(Surface surface) {
        return this.b(surface);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public f.d.a.b.a.e<SessionPlayer.b> a(AudioAttributesCompat audioAttributesCompat) {
        Object object;
        if (audioAttributesCompat == null) {
            throw new NullPointerException("attr shouldn't be null");
        }
        Object object2 = object = this.h;
        synchronized (object2) {
            if (this.k) {
                return this.z();
            }
        }
        y y2 = new y((b)this, (Executor)this.e, audioAttributesCompat);
        this.a(y2);
        return y2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public f.d.a.b.a.e<SessionPlayer.b> a(MediaItem mediaItem) {
        Object object;
        if (mediaItem == null) {
            throw new NullPointerException("item shouldn't be null");
        }
        if (mediaItem instanceof FileMediaItem && ((FileMediaItem)mediaItem).p()) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("File descriptor is closed. ");
            stringBuilder.append((Object)mediaItem);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
        Object object2 = object = this.h;
        synchronized (object2) {
            if (this.k) {
                return this.z();
            }
        }
        z z2 = new z((b)this, (Executor)this.e, mediaItem);
        this.a(z2);
        return z2;
    }

    public f.d.a.b.a.e<SessionPlayer.b> a(SessionPlayer.TrackInfo trackInfo) {
        return this.b(b.super.c(trackInfo));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public f.d.a.b.a.e<SessionPlayer.b> a(e.j.a.e e2) {
        Object object;
        if (e2 == null) {
            throw new NullPointerException("params shouldn't be null");
        }
        Object object2 = object = this.h;
        synchronized (object2) {
            if (this.k) {
                return this.z();
            }
        }
        f f2 = new f((b)this, (Executor)this.e, e2);
        this.a(f2);
        return f2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    List<e.j.a.i.b<SessionPlayer.b>> a(MediaItem mediaItem, MediaItem mediaItem2) {
        boolean bl;
        e.j.a.i.b<SessionPlayer.b> b2;
        Object object;
        if (mediaItem == null) {
            throw new NullPointerException("curItem shouldn't be null");
        }
        Object object2 = object = this.m;
        synchronized (object2) {
            bl = this.t;
        }
        ArrayList arrayList = new ArrayList();
        if (bl) {
            arrayList.add(this.b(mediaItem));
            b2 = this.G();
        } else {
            b2 = b.super.c(mediaItem);
        }
        arrayList.add(b2);
        if (mediaItem2 != null) {
            arrayList.add(this.b(mediaItem2));
        }
        return arrayList;
    }

    void a(int n2, e.j.a.i.b b2, k0 k02, Object object) {
        g0 g02 = new /* Unavailable Anonymous Inner Class!! */;
        this.f.add((Object)g02);
        this.a(g02, b2, object);
    }

    void a(int n2, e.j.a.i.b b2, Object object) {
        g0 g02 = new /* Unavailable Anonymous Inner Class!! */;
        this.f.add((Object)g02);
        this.a(g02, b2, object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    void a(final MediaItem mediaItem, final int n2) {
        Object object;
        Object object2 = object = this.h;
        // MONITORENTER : object2
        Integer n3 = (Integer)this.j.put((Object)mediaItem, (Object)n2);
        // MONITOREXIT : object2
        if (n3 != null) {
            if (n3 == n2) return;
        }
        this.a(new j0(){

            public void a(SessionPlayer.a a2) {
                a2.onBufferingStateChanged((SessionPlayer)b.this, mediaItem, n2);
            }
        });
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
    void a(d0 d02) {
        Object object;
        Object object2 = object = this.h;
        // MONITORENTER : object2
        if (this.k) {
            // MONITOREXIT : object2
            return;
        }
        // MONITOREXIT : object2
        Iterator iterator = this.b().iterator();
        while (iterator.hasNext()) {
            e.e.j.d d2 = (e.e.j.d)iterator.next();
            Object object3 = d2.a;
            if (!(object3 instanceof i0)) continue;
            i0 i02 = (i0)((Object)object3);
            ((Executor)d2.b).execute((Runnable)new n((b)this, d02, i02));
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

    void a(g0 g02, e.j.a.i.b b2, Object object) {
        b2.a((Runnable)new d((b)this, b2, object, g02), (Executor)this.e);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void a(h0 h02) {
        ArrayDeque<h0<? super SessionPlayer.b>> arrayDeque;
        ArrayDeque<h0<? super SessionPlayer.b>> arrayDeque2 = arrayDeque = this.g;
        synchronized (arrayDeque2) {
            this.g.add((Object)h02);
            b.super.I();
            return;
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
    void a(j0 j02) {
        Object object;
        Object object2 = object = this.h;
        // MONITORENTER : object2
        if (this.k) {
            // MONITOREXIT : object2
            return;
        }
        // MONITOREXIT : object2
        Iterator iterator = this.b().iterator();
        while (iterator.hasNext()) {
            e.e.j.d d2 = (e.e.j.d)iterator.next();
            SessionPlayer.a a2 = (SessionPlayer.a)d2.a;
            ((Executor)d2.b).execute((Runnable)new m((b)this, j02, a2));
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

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    void a(e.j.a.c var1_1, final MediaItem var2_4, int var3_3, int var4) {
        block13 : {
            block19 : {
                block14 : {
                    block20 : {
                        block15 : {
                            block16 : {
                                block17 : {
                                    block18 : {
                                        block12 : {
                                            var29_6 = var5_5 = this.f;
                                            // MONITORENTER : var29_6
                                            var7_7 = this.f.pollFirst();
                                            // MONITOREXIT : var29_6
                                            if (var7_7 != null) break block12;
                                            {
                                                catch (Throwable var6_19) {}
                                                {
                                                    // MONITOREXIT : var29_6
                                                    throw var6_19;
                                                }
                                            }
                                            var8_8 = new StringBuilder();
                                            var8_8.append("No matching call type for ");
                                            var8_8.append(var3_3);
                                            var8_8.append(". Possibly because of reset().");
                                            Log.i((String)"MediaPlayer", (String)var8_8.toString());
                                            return;
                                        }
                                        var13_9 = var7_7.c;
                                        if (var3_3 != var7_7.a) {
                                            var14_10 = new StringBuilder();
                                            var14_10.append("Call type does not match. expeced:");
                                            var14_10.append(var7_7.a);
                                            var14_10.append(" actual:");
                                            var14_10.append(var3_3);
                                            Log.w((String)"MediaPlayer", (String)var14_10.toString());
                                            var4 = Integer.MIN_VALUE;
                                        }
                                        if (var4 != 0) break block13;
                                        if (var3_3 == 2) break block14;
                                        if (var3_3 == 19) break block15;
                                        if (var3_3 == 24) break block16;
                                        if (var3_3 == 4) break block17;
                                        if (var3_3 == 5) break block18;
                                        if (var3_3 == 6) break block17;
                                        switch (var3_3) {
                                            default: {
                                                ** break;
                                            }
                                            case 16: {
                                                var27_11 /* !! */  = new j0(this.d.c()){
                                                    final /* synthetic */ AudioAttributesCompat a;
                                                    {
                                                        this.a = audioAttributesCompat;
                                                    }

                                                    public void a(SessionPlayer.a a2) {
                                                        a2.onAudioAttributesChanged((SessionPlayer)b.this, this.a);
                                                    }
                                                };
                                                break block19;
                                            }
                                            case 15: {
                                                var27_11 /* !! */  = new j0(){

                                                    public void a(SessionPlayer.a a2) {
                                                        b b2 = b.this;
                                                        a2.onTrackSelected((SessionPlayer)b2, b2.a(var13_9));
                                                    }
                                                };
                                                break block19;
                                            }
                                            case 14: {
                                                var28_12 /* !! */  = new j0(this.n()){
                                                    final /* synthetic */ long a;
                                                    {
                                                        this.a = l2;
                                                    }

                                                    public void a(SessionPlayer.a a2) {
                                                        a2.onSeekCompleted((SessionPlayer)b.this, this.a);
                                                    }
                                                };
                                                break;
                                            }
                                        }
                                        break block20;
                                    }
                                    this.f(2);
                                    break block13;
                                }
                                this.f(1);
                                break block13;
                            }
                            var27_11 /* !! */  = new j0(this.d.h().d().floatValue()){
                                final /* synthetic */ float a;
                                {
                                    this.a = f2;
                                }

                                public void a(SessionPlayer.a a2) {
                                    a2.onPlaybackSpeedChanged((SessionPlayer)b.this, this.a);
                                }
                            };
                            break block19;
                        }
                        var28_12 /* !! */  = new j0(){

                            public void a(SessionPlayer.a a2) {
                                a2.onCurrentMediaItemChanged((SessionPlayer)b.this, var2_4);
                            }
                        };
                    }
                    this.a(var28_12 /* !! */ );
                    ** break;
lbl60: // 2 sources:
                    break block13;
                }
                var27_11 /* !! */  = new j0(){

                    public void a(SessionPlayer.a a2) {
                        b b2 = b.this;
                        a2.onTrackDeselected((SessionPlayer)b2, b2.a(var13_9));
                    }
                };
            }
            this.a(var27_11 /* !! */ );
        }
        if (var3_3 != 1001) {
            var25_13 = b.u.containsKey((Object)var4) != false ? (Integer)b.u.get((Object)var4) : -1;
            var26_14 = var25_13;
            var22_15 = var7_7.b;
            var23_16 = new SessionPlayer.b(var26_14.intValue(), var2_4);
        } else {
            var20_17 = b.y.containsKey((Object)var4) != false ? (Integer)b.y.get((Object)var4) : -1003;
            var21_18 = var20_17;
            var22_15 = var7_7.b;
            var23_16 = new /* Unavailable Anonymous Inner Class!! */;
        }
        var22_15.a((Object)var23_16);
        b.super.I();
    }

    public void a(Executor executor, i0 i02) {
        super.a(executor, (SessionPlayer.a)i02);
    }

    e.j.a.i.b<SessionPlayer.b> b(int n2) {
        return this.a(n2, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    e.j.a.i.b<SessionPlayer.b> b(MediaItem mediaItem) {
        ArrayDeque<g0> arrayDeque;
        e.j.a.i.b b2 = e.j.a.i.b.d();
        ArrayDeque<g0> arrayDeque2 = arrayDeque = this.f;
        synchronized (arrayDeque2) {
            this.a(22, b2, this.d.k(mediaItem));
            return b2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public f.d.a.b.a.e<SessionPlayer.b> b(float f2) {
        Object object;
        if (f2 < 0.0f) throw new IllegalArgumentException("volume should be between 0.0 and 1.0");
        if (f2 > 1.0f) throw new IllegalArgumentException("volume should be between 0.0 and 1.0");
        Object object2 = object = this.h;
        synchronized (object2) {
            if (this.k) {
                return this.z();
            }
        }
        e e2 = new e((b)this, (Executor)this.e, f2);
        this.a(e2);
        return e2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public f.d.a.b.a.e<SessionPlayer.b> b(Surface surface) {
        Object object;
        Object object2 = object = this.h;
        synchronized (object2) {
            if (this.k) {
                return this.z();
            }
        }
        c c2 = new c((b)this, (Executor)this.e, surface);
        this.a(c2);
        return c2;
    }

    public f.d.a.b.a.e<SessionPlayer.b> b(SessionPlayer.TrackInfo trackInfo) {
        return this.c(b.super.c(trackInfo));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public f.d.a.b.a.e<SessionPlayer.b> b(k0 k02) {
        Object object;
        if (k02 == null) {
            throw new NullPointerException("trackInfo shouldn't be null");
        }
        Object object2 = object = this.h;
        synchronized (object2) {
            if (this.k) {
                return this.z();
            }
        }
        int n2 = k02.b();
        i i2 = new i((b)this, (Executor)this.e, n2, k02);
        this.a(i2);
        return i2;
    }

    List<e.j.a.i.b<SessionPlayer.b>> b(int n2, MediaItem mediaItem) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.a(n2, mediaItem));
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    e.j.a.i.b<SessionPlayer.b> c(float f2) {
        ArrayDeque<g0> arrayDeque;
        e.j.a.i.b b2 = e.j.a.i.b.d();
        ArrayDeque<g0> arrayDeque2 = arrayDeque = this.f;
        synchronized (arrayDeque2) {
            this.a(26, b2, this.d.a(f2));
            return b2;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public f.d.a.b.a.e<SessionPlayer.b> c(k0 k02) {
        Object object;
        if (k02 == null) {
            throw new NullPointerException("trackInfo shouldn't be null");
        }
        Object object2 = object = this.h;
        synchronized (object2) {
            if (this.k) {
                return this.z();
            }
        }
        int n2 = k02.b();
        h h2 = new h((b)this, (Executor)this.e, n2, k02);
        this.a(h2);
        return h2;
    }

    List<e.j.a.i.b<SessionPlayer.b>> c(int n2) {
        return this.b(n2, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void close() {
        Object object;
        Object object2 = object = this.h;
        synchronized (object2) {
            if (!this.k) {
                this.k = true;
                this.F();
                this.l.a();
                this.d.b();
                this.e.shutdown();
            }
            return;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public k0 d(int n2) {
        Object object;
        Object object2 = object = this.h;
        synchronized (object2) {
            if (this.k) {
                return null;
            }
        }
        int n3 = this.d.b(n2);
        if (n3 < 0) {
            return null;
        }
        return this.e(n3);
    }

    k0 e(int n2) {
        c.c c2 = (c.c)this.d.j().get(n2);
        return new /* Unavailable Anonymous Inner Class!! */;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public f.d.a.b.a.e<SessionPlayer.b> f(long l2) {
        Object object;
        Object object2 = object = this.h;
        synchronized (object2) {
            if (this.k) {
                return this.z();
            }
        }
        w w2 = new w((b)this, (Executor)this.e, true, l2);
        this.a(w2);
        return w2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    void f(final int n2) {
        Object object;
        boolean bl;
        Object object2 = object = this.h;
        synchronized (object2) {
            if (this.i == n2) return;
            this.i = n2;
            bl = true;
        }
        if (!bl) return;
        this.a(new j0(){

            public void a(SessionPlayer.a a2) {
                a2.onPlayerStateChanged((SessionPlayer)b.this, n2);
            }
        });
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public MediaItem m() {
        Object object;
        Object object2 = object = this.h;
        synchronized (object2) {
            if (this.k) {
                return null;
            }
            return this.d.e();
        }
    }

    /*
     * Exception decompiling
     */
    public long n() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl27.1 : LDC2_W : trying to set 1 previously set to 0
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

    /*
     * Exception decompiling
     */
    public long o() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl27.1 : LDC2_W : trying to set 1 previously set to 0
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int p() {
        Object object;
        Object object2;
        Object object3 = object = this.h;
        synchronized (object3) {
            if (this.k) {
                return -1;
            }
        }
        Object object4 = object2 = this.m;
        synchronized (object4) {
            if (this.q < 0) {
                return -1;
            }
            int n2 = 1 + this.q;
            if (n2 < this.o.size()) {
                return this.n.a(this.o.get(n2));
            }
            if (this.p == 2) return this.n.a(this.o.get(0));
            if (this.p == 3) return this.n.a(this.o.get(0));
            return -1;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public float q() {
        Object object;
        Object object2 = object = this.h;
        synchronized (object2) {
            if (this.k) {
                return 1.0f;
            }
        }
        try {
            return this.d.h().d().floatValue();
        }
        catch (IllegalStateException illegalStateException) {
            return 1.0f;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int r() {
        Object object;
        Object object2 = object = this.h;
        synchronized (object2) {
            return this.i;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int s() {
        Object object;
        Object object2;
        Object object3 = object = this.h;
        synchronized (object3) {
            if (this.k) {
                return -1;
            }
        }
        Object object4 = object2 = this.m;
        synchronized (object4) {
            if (this.q < 0) {
                return -1;
            }
            int n2 = -1 + this.q;
            if (n2 >= 0) {
                return this.n.a(this.o.get(n2));
            }
            if (this.p == 2) return this.n.a(this.o.get(-1 + this.o.size()));
            if (this.p == 3) return this.n.a(this.o.get(-1 + this.o.size()));
            return -1;
        }
    }

    public List<SessionPlayer.TrackInfo> t() {
        List<k0> list = this.D();
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); ++i2) {
            arrayList.add((Object)this.a(list.get(i2)));
        }
        return arrayList;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public VideoSize u() {
        Object object;
        Object object2 = object = this.h;
        synchronized (object2) {
            if (!this.k) return new VideoSize(this.d.l(), this.d.k());
            return new VideoSize(0, 0);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public f.d.a.b.a.e<SessionPlayer.b> v() {
        Object object;
        Object object2 = object = this.h;
        synchronized (object2) {
            if (this.k) {
                return this.z();
            }
        }
        u u2 = new u(this, (Executor)this.e);
        this.a(u2);
        return u2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public f.d.a.b.a.e<SessionPlayer.b> w() {
        Object object;
        Object object2 = object = this.h;
        synchronized (object2) {
            if (this.k) {
                return this.z();
            }
        }
        j j2 = new j(this, (Executor)this.e);
        this.a(j2);
        return j2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public f.d.a.b.a.e<SessionPlayer.b> x() {
        Object object;
        Object object2 = object = this.h;
        synchronized (object2) {
            if (this.k) {
                return this.z();
            }
        }
        b b2 = new b(this, (Executor)this.e);
        this.a(b2);
        return b2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public f.d.a.b.a.e<SessionPlayer.b> y() {
        Object object;
        Object object2 = object = this.h;
        synchronized (object2) {
            if (this.k) {
                return this.z();
            }
        }
        a a2 = new a(this, (Executor)this.e);
        this.a(a2);
        return a2;
    }

    e.j.a.i.b<SessionPlayer.b> z() {
        e.j.a.i.b b2 = e.j.a.i.b.d();
        b2.a((Object)new SessionPlayer.b(-2, null));
        return b2;
    }

    class f0
    extends c.a {
        f0(b b2) {
        }
    }

    public static abstract class i0
    extends SessionPlayer.a {
        public void onDrmInfo(b b2, MediaItem mediaItem, a0 a02) {
        }

        public void onError(b b2, MediaItem mediaItem, int n2, int n3) {
        }

        public void onInfo(b b2, MediaItem mediaItem, int n2, int n3) {
        }

        public void onMediaTimeDiscontinuity(b b2, MediaItem mediaItem, e.j.a.d d2) {
        }

        public void onTimedMetaDataAvailable(b b2, MediaItem mediaItem, e.j.a.f f2) {
        }

        public void onVideoSizeChanged(b b2, MediaItem mediaItem, e.j.a.g g2) {
        }

        public void onVideoSizeChangedInternal(SessionPlayer sessionPlayer, MediaItem mediaItem, VideoSize videoSize) {
            if (sessionPlayer instanceof b) {
                e.j.a.g g2 = new e.j.a.g(videoSize);
                this.onVideoSizeChanged((b)sessionPlayer, mediaItem, g2);
                return;
            }
            throw new IllegalArgumentException("player must be MediaPlayer");
        }
    }

}

