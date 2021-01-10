/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.res.Resources
 *  android.graphics.Bitmap
 *  android.graphics.drawable.BitmapDrawable
 *  android.graphics.drawable.Drawable
 *  android.media.MediaFormat
 *  android.os.AsyncTask
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.view.Surface
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  androidx.media2.common.MediaItem
 *  androidx.media2.common.MediaMetadata
 *  androidx.media2.common.SessionPlayer
 *  androidx.media2.common.SessionPlayer$TrackInfo
 *  androidx.media2.common.SubtitleData
 *  androidx.media2.common.VideoSize
 *  androidx.media2.common.a
 *  androidx.media2.session.MediaController
 *  e.e.d.a
 *  e.j.b.a0$c
 *  e.j.b.a0$e
 *  e.j.b.b0
 *  e.j.b.b0$a
 *  e.j.b.h
 *  e.j.b.i
 *  e.j.b.j
 *  e.j.b.k
 *  e.j.b.k$b
 *  e.j.b.m
 *  e.j.b.o
 *  e.j.b.r
 *  e.j.b.s$a
 *  e.j.b.u
 *  e.j.b.u$c
 *  e.j.b.u$d
 *  e.j.b.u$f
 *  e.k.a.b
 *  e.k.a.b$d
 *  f.d.a.b.a.e
 *  java.lang.CharSequence
 *  java.lang.IllegalArgumentException
 *  java.lang.InterruptedException
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Throwable
 *  java.util.LinkedHashMap
 *  java.util.List
 *  java.util.Map
 *  java.util.concurrent.ExecutionException
 *  java.util.concurrent.Executor
 *  java.util.concurrent.TimeUnit
 *  java.util.concurrent.TimeoutException
 */
package e.j.b;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.media.MediaFormat;
import android.os.AsyncTask;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import androidx.media2.common.SessionPlayer;
import androidx.media2.common.SubtitleData;
import androidx.media2.common.VideoSize;
import androidx.media2.session.MediaController;
import e.j.b.a0;
import e.j.b.b0;
import e.j.b.g;
import e.j.b.h;
import e.j.b.i;
import e.j.b.j;
import e.j.b.k;
import e.j.b.m;
import e.j.b.o;
import e.j.b.r;
import e.j.b.s;
import e.j.b.t;
import e.j.b.u;
import e.j.b.v;
import e.j.b.y;
import e.j.b.z;
import e.k.a.b;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/*
 * Exception performing whole class analysis.
 */
public class a0
extends s {
    static final boolean s;
    e c;
    b0 d;
    b0 e;
    z f;
    y g;
    k h;
    g i;
    j j;
    s.a k;
    int l;
    int m;
    Map<SessionPlayer.TrackInfo, v> n;
    u o;
    SessionPlayer.TrackInfo p;
    t q;
    private final b0.a r;

    static {
        s = Log.isLoggable((String)"VideoView", (int)3);
    }

    public a0(Context context) {
        super(context, null);
    }

    public a0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public a0(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        this.r = new b0.a((a0)this){
            final /* synthetic */ a0 a;
            {
                this.a = a02;
            }

            public void a(View view) {
                if (a0.s) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("onSurfaceDestroyed(). ");
                    stringBuilder.append(view.toString());
                    Log.d((String)"VideoView", (String)stringBuilder.toString());
                }
            }

            public void a(View view, int n2, int n3) {
                if (a0.s) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("onSurfaceCreated(), width/height: ");
                    stringBuilder.append(n2);
                    stringBuilder.append("/");
                    stringBuilder.append(n3);
                    stringBuilder.append(", ");
                    stringBuilder.append(view.toString());
                    Log.d((String)"VideoView", (String)stringBuilder.toString());
                }
                a0 a02 = this.a;
                if (view == a02.e && a02.a()) {
                    a0 a03 = this.a;
                    a03.e.a(a03.h);
                }
            }

            public void a(b0 b02) {
                b0 b03;
                if (b02 != this.a.e) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("onSurfaceTakeOverDone(). view is not targetView. ignore.: ");
                    stringBuilder.append((Object)b02);
                    Log.w((String)"VideoView", (String)stringBuilder.toString());
                    return;
                }
                if (a0.s) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("onSurfaceTakeOverDone(). Now current view is: ");
                    stringBuilder.append((Object)b02);
                    Log.d((String)"VideoView", (String)stringBuilder.toString());
                }
                if (b02 != (b03 = this.a.d)) {
                    ((View)b03).setVisibility(8);
                    a0 a02 = this.a;
                    a02.d = b02;
                    e e2 = a02.c;
                    if (e2 != null) {
                        e2.a((View)a02, b02.a());
                    }
                }
            }

            public void b(View view, int n2, int n3) {
                if (a0.s) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("onSurfaceChanged(). width/height: ");
                    stringBuilder.append(n2);
                    stringBuilder.append("/");
                    stringBuilder.append(n3);
                    stringBuilder.append(", ");
                    stringBuilder.append(view.toString());
                    Log.d((String)"VideoView", (String)stringBuilder.toString());
                }
            }
        };
        a0.super.a(context, attributeSet);
    }

    private Drawable a(MediaMetadata mediaMetadata, Drawable drawable) {
        Bitmap bitmap = mediaMetadata != null && mediaMetadata.a("android.media.metadata.ALBUM_ART") ? mediaMetadata.b("android.media.metadata.ALBUM_ART") : null;
        if (bitmap != null) {
            e.k.a.b.a(bitmap).a(new b.d((a0)this){
                final /* synthetic */ a0 a;
                {
                    this.a = a02;
                }

                public void a(e.k.a.b b2) {
                    int n2 = b2.a(0);
                    this.a.j.setBackgroundColor(n2);
                }
            });
            return new BitmapDrawable(this.getResources(), bitmap);
        }
        this.j.setBackgroundColor(this.getResources().getColor(m.music_view_default_background));
        return drawable;
    }

    private String a(MediaMetadata mediaMetadata, String string, String string2) {
        String string3 = mediaMetadata == null ? string2 : mediaMetadata.d(string);
        if (string3 == null) {
            string3 = string2;
        }
        return string3;
    }

    /*
     * Enabled aggressive block sorting
     */
    private void a(Context context, AttributeSet attributeSet) {
        block8 : {
            b0 b02;
            block7 : {
                int n2;
                block6 : {
                    this.p = null;
                    this.setFocusable(true);
                    this.setFocusableInTouchMode(true);
                    this.requestFocus();
                    this.f = new z(context);
                    this.g = new y(context);
                    this.f.a(this.r);
                    this.g.a(this.r);
                    this.addView((View)this.f);
                    this.addView((View)this.g);
                    this.k = new /* Unavailable Anonymous Inner Class!! */;
                    this.k.a = true;
                    this.q = new t(context);
                    this.q.setBackgroundColor(0);
                    this.addView((View)this.q, (ViewGroup.LayoutParams)this.k);
                    this.o = new u(context, null, new u.d((a0)this){
                        final /* synthetic */ a0 a;
                        {
                            this.a = a02;
                        }

                        public void a(v v2) {
                            SessionPlayer.TrackInfo trackInfo;
                            block3 : {
                                java.util.Map$Entry entry;
                                if (v2 == null) {
                                    a0 a02 = this.a;
                                    a02.p = null;
                                    a02.q.setVisibility(8);
                                    return;
                                }
                                java.util.Iterator iterator = this.a.n.entrySet().iterator();
                                do {
                                    boolean bl = iterator.hasNext();
                                    trackInfo = null;
                                    if (!bl) break block3;
                                } while ((entry = (java.util.Map$Entry)iterator.next()).getValue() != v2);
                                trackInfo = (SessionPlayer.TrackInfo)entry.getKey();
                            }
                            if (trackInfo != null) {
                                a0 a03 = this.a;
                                a03.p = trackInfo;
                                a03.q.setVisibility(0);
                            }
                        }
                    });
                    this.o.a((u.f)new e.j.b.c(context));
                    this.o.a((u.f)new e.j.b.e(context));
                    this.o.a((u.c)this.q);
                    this.j = new j(context);
                    this.j.setVisibility(8);
                    this.addView((View)this.j, (ViewGroup.LayoutParams)this.k);
                    boolean bl = attributeSet == null || attributeSet.getAttributeBooleanValue("http://schemas.android.com/apk/res-auto", "enableControlView", true);
                    if (bl) {
                        this.i = new g(context);
                        this.i.setAttachedToVideoView(true);
                        this.addView((View)this.i, (ViewGroup.LayoutParams)this.k);
                    }
                    if ((n2 = attributeSet == null ? 0 : attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res-auto", "viewType", 0)) != 0) break block6;
                    if (s) {
                        Log.d((String)"VideoView", (String)"viewType attribute is surfaceView.");
                    }
                    this.f.setVisibility(8);
                    this.g.setVisibility(0);
                    b02 = this.g;
                    break block7;
                }
                if (n2 != 1) break block8;
                if (s) {
                    Log.d((String)"VideoView", (String)"viewType attribute is textureView.");
                }
                this.f.setVisibility(0);
                this.g.setVisibility(8);
                b02 = this.f;
            }
            this.d = b02;
        }
        this.e = this.d;
    }

    void a(MediaItem mediaItem) {
        boolean bl = mediaItem != null && this.c();
        if (bl) {
            this.j.setVisibility(0);
            MediaMetadata mediaMetadata = mediaItem.i();
            Resources resources = this.getResources();
            Drawable drawable = a0.super.a(mediaMetadata, resources.getDrawable(o.ic_default_album_image));
            String string = a0.super.a(mediaMetadata, "android.media.metadata.TITLE", resources.getString(r.mcv2_music_title_unknown_text));
            String string2 = a0.super.a(mediaMetadata, "android.media.metadata.ARTIST", resources.getString(r.mcv2_music_artist_unknown_text));
            this.j.a(drawable);
            this.j.b(string);
            this.j.a(string2);
            return;
        }
        this.j.setVisibility(8);
        this.j.a(null);
        this.j.b(null);
        this.j.a(null);
    }

    void a(k k2, List<SessionPlayer.TrackInfo> list) {
        this.n = new LinkedHashMap();
        this.l = 0;
        this.m = 0;
        for (int i2 = 0; i2 < list.size(); ++i2) {
            v v2;
            SessionPlayer.TrackInfo trackInfo = (SessionPlayer.TrackInfo)list.get(i2);
            int n2 = ((SessionPlayer.TrackInfo)list.get(i2)).k();
            if (n2 == 1) {
                this.l = 1 + this.l;
                continue;
            }
            if (n2 == 2) {
                this.m = 1 + this.m;
                continue;
            }
            if (n2 != 4 || (v2 = this.o.a(trackInfo.g())) == null) continue;
            this.n.put((Object)trackInfo, (Object)v2);
        }
        this.p = k2.a(4);
    }

    void a(boolean bl) {
        i.super.a(bl);
        k k2 = this.h;
        if (k2 == null) {
            return;
        }
        if (bl) {
            this.e.a(k2);
            return;
        }
        if (k2 != null && !k2.u()) {
            this.e();
            return;
        }
        Log.w((String)"VideoView", (String)"Surface is being destroyed, but player will not be informed as the associated media controller is disconnected.");
    }

    boolean b() {
        if (this.l > 0) {
            return true;
        }
        VideoSize videoSize = this.h.t();
        if (videoSize.e() > 0 && videoSize.f() > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("video track count is zero, but it renders video. size: ");
            stringBuilder.append(videoSize.f());
            stringBuilder.append("/");
            stringBuilder.append(videoSize.e());
            Log.w((String)"VideoView", (String)stringBuilder.toString());
            return true;
        }
        return false;
    }

    boolean c() {
        return !this.b() && this.m > 0;
    }

    boolean d() {
        k k2 = this.h;
        return k2 != null && k2.p() != 3 && this.h.p() != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    void e() {
        void var1_6;
        int n2 = ((androidx.media2.common.a)this.h.a(null).get(100L, TimeUnit.MILLISECONDS)).e();
        if (n2 == 0) return;
        try {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("calling setSurface(null) was not successful. ResultCode: ");
            stringBuilder.append(n2);
            Log.e((String)"VideoView", (String)stringBuilder.toString());
            return;
        }
        catch (TimeoutException timeoutException) {
        }
        catch (InterruptedException interruptedException) {
        }
        catch (ExecutionException executionException) {
            // empty catch block
        }
        Log.e((String)"VideoView", (String)"calling setSurface(null) was not successful.", (Throwable)var1_6);
    }

    void f() {
        f.d.a.b.a.e e2 = this.h.a(null);
        e2.a((Runnable)new c(this, e2), e.e.d.a.b((Context)this.getContext()));
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.media2.widget.VideoView";
    }

    public g getMediaControlView() {
        return this.i;
    }

    public int getViewType() {
        return this.d.a();
    }

    protected void onAttachedToWindow() {
        ViewGroup.super.onAttachedToWindow();
        k k2 = this.h;
        if (k2 != null) {
            k2.a();
        }
    }

    protected void onDetachedFromWindow() {
        ViewGroup.super.onDetachedFromWindow();
        k k2 = this.h;
        if (k2 != null) {
            k2.i();
        }
    }

    public void setMediaController(MediaController mediaController) {
        if (mediaController != null) {
            k k2 = this.h;
            if (k2 != null) {
                k2.i();
            }
            this.h = new k(mediaController, e.e.d.a.b((Context)this.getContext()), new k.b(){

                /*
                 * Exception decompiling
                 */
                private boolean b(k var1) {
                    // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
                    // org.benf.cfr.reader.util.ConfusedCFRException: Invalid stack depths @ lbl39 : ICONST_1 : trying to set 0 previously set to 1
                    // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:203)
                    // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:1489)
                    // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:308)
                    // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:182)
                    // org.benf.cfr.reader.b.f.a(CodeAnalyser.java:127)
                    // org.benf.cfr.reader.entities.attributes.f.c(AttributeCode.java:96)
                    // org.benf.cfr.reader.entities.g.p(Method.java:396)
                    // org.benf.cfr.reader.entities.d.e(ClassFile.java:890)
                    // org.benf.cfr.reader.entities.d.c(ClassFile.java:773)
                    // org.benf.cfr.reader.entities.d.e(ClassFile.java:870)
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

                void a(k k2, int n2) {
                    if (a0.s) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("onPlayerStateChanged(): state: ");
                        stringBuilder.append(n2);
                        Log.d((String)"VideoView", (String)stringBuilder.toString());
                    }
                    f.super.b(k2);
                }

                void a(k k2, MediaItem mediaItem) {
                    if (a0.s) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("onCurrentMediaItemChanged(): MediaItem: ");
                        stringBuilder.append((Object)mediaItem);
                        Log.d((String)"VideoView", (String)stringBuilder.toString());
                    }
                    if (f.super.b(k2)) {
                        return;
                    }
                    a0.this.a(mediaItem);
                }

                void a(k k2, MediaItem mediaItem, SessionPlayer.TrackInfo trackInfo, SubtitleData subtitleData) {
                    if (a0.s) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("onSubtitleData(): TrackInfo: ");
                        stringBuilder.append((Object)trackInfo);
                        stringBuilder.append(", getCurrentPosition: ");
                        stringBuilder.append(k2.m());
                        stringBuilder.append(", getStartTimeUs(): ");
                        stringBuilder.append(subtitleData.g());
                        stringBuilder.append(", diff: ");
                        stringBuilder.append(subtitleData.g() / 1000L - k2.m());
                        stringBuilder.append("ms, getDurationUs(): ");
                        stringBuilder.append(subtitleData.f());
                        Log.d((String)"VideoView", (String)stringBuilder.toString());
                    }
                    if (f.super.b(k2)) {
                        return;
                    }
                    if (!trackInfo.equals((Object)a0.this.p)) {
                        return;
                    }
                    v v2 = (v)a0.this.n.get((Object)trackInfo);
                    if (v2 != null) {
                        v2.a(subtitleData);
                    }
                }

                void a(k k2, MediaItem mediaItem, VideoSize videoSize) {
                    List list;
                    if (a0.s) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("onVideoSizeChanged(): size: ");
                        stringBuilder.append((Object)videoSize);
                        Log.d((String)"VideoView", (String)stringBuilder.toString());
                    }
                    if (f.super.b(k2)) {
                        return;
                    }
                    if (a0.this.l == 0 && videoSize.e() > 0 && videoSize.f() > 0 && a0.this.d() && (list = k2.s()) != null) {
                        a0.this.a(k2, (List<SessionPlayer.TrackInfo>)list);
                    }
                    a0.this.f.forceLayout();
                    a0.this.g.forceLayout();
                    a0.this.requestLayout();
                }

                void a(k k2, SessionPlayer.TrackInfo trackInfo) {
                    if (a0.s) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("onTrackDeselected(): deselected track: ");
                        stringBuilder.append((Object)trackInfo);
                        Log.d((String)"VideoView", (String)stringBuilder.toString());
                    }
                    if (f.super.b(k2)) {
                        return;
                    }
                    if ((v)a0.this.n.get((Object)trackInfo) != null) {
                        a0.this.o.b(null);
                    }
                }

                void a(k k2, List<SessionPlayer.TrackInfo> list) {
                    if (a0.s) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("onTrackInfoChanged(): tracks: ");
                        stringBuilder.append(list);
                        Log.d((String)"VideoView", (String)stringBuilder.toString());
                    }
                    if (f.super.b(k2)) {
                        return;
                    }
                    a0.this.a(k2, list);
                    a0.this.a(k2.l());
                }

                void b(k k2, SessionPlayer.TrackInfo trackInfo) {
                    if (a0.s) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("onTrackSelected(): selected track: ");
                        stringBuilder.append((Object)trackInfo);
                        Log.d((String)"VideoView", (String)stringBuilder.toString());
                    }
                    if (f.super.b(k2)) {
                        return;
                    }
                    v v2 = (v)a0.this.n.get((Object)trackInfo);
                    if (v2 != null) {
                        a0.this.o.b(v2);
                    }
                }
            });
            if (this.isAttachedToWindow()) {
                this.h.a();
            }
            if (this.a()) {
                this.e.a(this.h);
            } else {
                this.f();
            }
            g g2 = this.i;
            if (g2 != null) {
                g2.setMediaControllerInternal(mediaController);
            }
            return;
        }
        throw new NullPointerException("controller must not be null");
    }

    public void setOnViewTypeChangedListener(e e2) {
        this.c = e2;
    }

    public void setPlayer(SessionPlayer sessionPlayer) {
        if (sessionPlayer != null) {
            k k2 = this.h;
            if (k2 != null) {
                k2.i();
            }
            this.h = new k(sessionPlayer, e.e.d.a.b((Context)this.getContext()), new /* invalid duplicate definition of identical inner class */);
            if (this.isAttachedToWindow()) {
                this.h.a();
            }
            if (this.a()) {
                this.e.a(this.h);
            } else {
                this.f();
            }
            g g2 = this.i;
            if (g2 != null) {
                g2.setPlayerInternal(sessionPlayer);
            }
            return;
        }
        throw new NullPointerException("player must not be null");
    }

    public void setViewType(int n2) {
        block7 : {
            b0 b02;
            block6 : {
                block5 : {
                    if (n2 == this.e.a()) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("setViewType with the same type (");
                        stringBuilder.append(n2);
                        stringBuilder.append(") is ignored.");
                        Log.d((String)"VideoView", (String)stringBuilder.toString());
                        return;
                    }
                    if (n2 != 1) break block5;
                    Log.d((String)"VideoView", (String)"switching to TextureView");
                    b02 = this.f;
                    break block6;
                }
                if (n2 != 0) break block7;
                Log.d((String)"VideoView", (String)"switching to SurfaceView");
                b02 = this.g;
            }
            this.e = b02;
            if (this.a()) {
                b02.a(this.h);
            }
            b02.setVisibility(0);
            this.requestLayout();
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown view type: ");
        stringBuilder.append(n2);
        throw new IllegalArgumentException(stringBuilder.toString());
    }

}

