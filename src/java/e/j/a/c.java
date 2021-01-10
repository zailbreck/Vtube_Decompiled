/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.media.MediaFormat
 *  android.view.Surface
 *  androidx.media.AudioAttributesCompat
 *  androidx.media2.common.MediaItem
 *  androidx.media2.common.SubtitleData
 *  androidx.media2.player.exoplayer.c
 *  java.lang.Object
 *  java.util.List
 *  java.util.concurrent.Executor
 */
package e.j.a;

import android.content.Context;
import android.media.MediaFormat;
import android.view.Surface;
import androidx.media.AudioAttributesCompat;
import androidx.media2.common.MediaItem;
import androidx.media2.common.SubtitleData;
import e.j.a.d;
import e.j.a.e;
import e.j.a.f;
import java.util.List;
import java.util.concurrent.Executor;

public abstract class c {
    protected c() {
    }

    public static c a(Context context) {
        return new androidx.media2.player.exoplayer.c(context);
    }

    public abstract Object a(float var1);

    public abstract Object a(int var1);

    public Object a(long l2) {
        return this.a(l2, 0);
    }

    public abstract Object a(long var1, int var3);

    public abstract Object a(Surface var1);

    public abstract Object a(AudioAttributesCompat var1);

    public abstract Object a(e var1);

    public abstract void a(Executor var1, a var2);

    public abstract void a(Executor var1, b var2);

    public abstract boolean a(Object var1);

    public abstract int b(int var1);

    public abstract void b();

    public abstract AudioAttributesCompat c();

    public abstract Object c(int var1);

    public abstract long d();

    public abstract MediaItem e();

    public abstract long f();

    public abstract long g();

    public abstract e h();

    public abstract float i();

    public abstract Object j(MediaItem var1);

    public abstract List<c> j();

    public abstract int k();

    public abstract Object k(MediaItem var1);

    public abstract int l();

    public abstract Object m();

    public abstract Object n();

    public abstract Object o();

    public abstract void p();

    public abstract Object q();

    public static abstract class a {
    }

    public static abstract class b {
        public void a(c c2, MediaItem mediaItem, int n2, int n3) {
        }

        public void a(c c2, MediaItem mediaItem, int n2, SubtitleData subtitleData) {
        }

        public void a(c c2, MediaItem mediaItem, d d2) {
        }

        public void a(c c2, MediaItem mediaItem, f f2) {
        }

        public void b(c c2, MediaItem mediaItem, int n2, int n3) {
        }

        public void c(c c2, MediaItem mediaItem, int n2, int n3) {
        }

        public void d(c c2, MediaItem mediaItem, int n2, int n3) {
        }
    }

    public static abstract class c {
        public abstract MediaFormat a();

        public abstract int b();
    }

}

