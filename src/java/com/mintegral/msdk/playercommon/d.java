/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.media.MediaPlayer
 *  android.media.MediaPlayer$OnBufferingUpdateListener
 *  android.media.MediaPlayer$OnCompletionListener
 *  android.media.MediaPlayer$OnErrorListener
 *  android.media.MediaPlayer$OnInfoListener
 *  android.media.MediaPlayer$OnPreparedListener
 *  android.media.MediaPlayer$OnSeekCompleteListener
 *  android.media.PlaybackParams
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Handler
 *  android.os.Looper
 *  android.os.Message
 *  android.text.TextUtils
 *  android.view.SurfaceHolder
 *  android.view.View
 *  java.lang.CharSequence
 *  java.lang.Exception
 *  java.lang.Math
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.Thread
 *  java.lang.Throwable
 *  java.util.Timer
 *  java.util.TimerTask
 */
package com.mintegral.msdk.playercommon;

import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import android.view.View;
import java.util.Timer;
import java.util.TimerTask;

public final class d
implements MediaPlayer.OnBufferingUpdateListener,
MediaPlayer.OnCompletionListener,
MediaPlayer.OnErrorListener,
MediaPlayer.OnInfoListener,
MediaPlayer.OnPreparedListener {
    private boolean a = false;
    private boolean b = false;
    private boolean c = false;
    private boolean d = false;
    private boolean e = false;
    private boolean f = true;
    private SurfaceHolder g;
    private int h = 5;
    private int i;
    private Timer j;
    private Timer k;
    private com.mintegral.msdk.playercommon.e l;
    private com.mintegral.msdk.playercommon.e m;
    private Object n = new Object();
    private String o;
    private MediaPlayer p;
    private View q;
    private View r;
    private boolean s;
    private boolean t = false;
    private final Handler u = new Handler(this, Looper.getMainLooper()){

        public final void handleMessage(Message message) {
            super.handleMessage(message);
        }
    };
    private com.mintegral.msdk.playercommon.c v;

    static /* synthetic */ int a(d d2, int n2) {
        d2.i = n2;
        return n2;
    }

    static /* synthetic */ void a(d d2, final int n2, final int n3) {
        try {
            if (d2.u != null) {
                d2.u.post(new Runnable(){

                    public final void run() {
                        if (d.this.l != null) {
                            d.this.l.a(n2, n3);
                        }
                        if (d.this.m != null) {
                            d.this.m.a(n2, n3);
                        }
                    }
                });
                return;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    static /* synthetic */ void a(d d2, final String string) {
        try {
            if (d2.u != null) {
                d2.u.post(new Runnable(){

                    public final void run() {
                        if (d.this.l != null) {
                            d.this.l.c(string);
                        }
                        if (d.this.m != null) {
                            d.this.m.c(string);
                        }
                    }
                });
                return;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void a(final String string) {
        if (!this.e) {
            f.f.a.e.f.h.d("VideoFeedsPlayer", "\u4e0d\u9700\u8981\u7f13\u51b2\u8d85\u65f6\u529f\u80fd");
            return;
        }
        d.super.q();
        this.k = new Timer();
        this.k.schedule(new TimerTask(){

            public final void run() {
                try {
                    if (!d.this.c || d.this.d) {
                        f.f.a.e.f.h.d("VideoFeedsPlayer", "\u7f13\u51b2\u8d85\u65f6");
                        d.a(d.this, string);
                        return;
                    }
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                }
            }
        }, (long)(1000 * this.h));
    }

    static /* synthetic */ boolean a(d d2, boolean bl) {
        d2.a = bl;
        return bl;
    }

    static /* synthetic */ void b(d d2, final int n2) {
        try {
            if (d2.u != null) {
                d2.u.post(new Runnable(){

                    public final void run() {
                        if (d.this.l != null) {
                            d.this.l.a(n2);
                        }
                        if (d.this.m != null) {
                            d.this.m.a(n2);
                        }
                    }
                });
                return;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void b(final String string) {
        try {
            if (this.u != null) {
                this.u.post(new Runnable(){

                    public final void run() {
                        if (d.this.l != null) {
                            d.this.l.b(string);
                        }
                        if (d.this.m != null) {
                            d.this.m.b(string);
                        }
                    }
                });
                return;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void c(final String string) {
        try {
            if (this.u != null) {
                this.u.post(new Runnable(){

                    public final void run() {
                        if (d.this.m != null) {
                            d.this.m.a(string);
                        }
                        if (d.this.l != null) {
                            d.this.l.a(string);
                        }
                    }
                });
                return;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    static /* synthetic */ void i(d d2) {
        try {
            d2.p();
            d2.j = new Timer();
            o o2 = new o(d2, null);
            d2.j.schedule((TimerTask)o2, 0L, 1000L);
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    private void p() {
        try {
            if (this.j != null) {
                this.j.cancel();
                return;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void q() {
        try {
            if (this.k != null) {
                this.k.cancel();
                return;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private void r() {
        try {
            if (this.u == null) {
                return;
            }
            this.u.post(new Runnable(){

                public final void run() {
                    if (d.this.q != null) {
                        d.this.q.setVisibility(8);
                    }
                    if (d.this.r != null) {
                        d.this.r.setVisibility(8);
                    }
                }
            });
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    private void s() {
        try {
            if (this.u != null) {
                this.u.post(new Runnable(){

                    public final void run() {
                        if (d.this.l != null) {
                            d.this.l.b();
                        }
                        if (d.this.m != null) {
                            d.this.m.b();
                        }
                    }
                });
                return;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public final void a() {
        try {
            if (this.u == null) {
                return;
            }
            this.u.post(new Runnable(){

                public final void run() {
                    if (d.this.r != null) {
                        d.this.r.setVisibility(0);
                    }
                }
            });
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public final void a(float f2) {
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                if (this.p.isPlaying()) {
                    this.p.setPlaybackParams(this.p.getPlaybackParams().setSpeed(f2));
                    return;
                }
                this.p.setPlaybackParams(this.p.getPlaybackParams().setSpeed(f2));
                this.p.pause();
                return;
            }
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    public final void a(int n2) {
        if (n2 > 0) {
            this.h = n2;
        }
        this.e = true;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("mIsNeedBufferingTimeout:");
        stringBuilder.append(this.e);
        stringBuilder.append("  mMaxBufferTime:");
        stringBuilder.append(this.h);
        f.f.a.e.f.h.b("VideoFeedsPlayer", stringBuilder.toString());
    }

    public final void a(SurfaceHolder surfaceHolder) {
        try {
            if (this.p != null) {
                this.p.setDisplay(surfaceHolder);
                return;
            }
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final void a(String string, int n2) {
        try {
            Object object;
            Object object2 = object = this.n;
            // MONITORENTER : object2
        }
        catch (Exception exception) {
            exception.printStackTrace();
            this.g();
            d.super.r();
            d.super.b("mediaplayer cannot play");
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\u8fdb\u6765\u64ad\u653e currentionPosition:");
        stringBuilder.append(this.i);
        f.f.a.e.f.h.d("VideoFeedsPlayer", stringBuilder.toString());
        if (n2 > 0) {
            this.i = n2;
        }
        if (TextUtils.isEmpty((CharSequence)string)) {
            d.super.b("play url is null");
            // MONITOREXIT : object2
            return;
        }
        this.o = string;
        this.c = false;
        this.f = true;
        this.a();
        // MONITOREXIT : object2
        this.f();
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("mPlayUrl:");
        stringBuilder2.append(this.o);
        f.f.a.e.f.h.b("VideoFeedsPlayer", stringBuilder2.toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(boolean bl) {
        StringBuilder stringBuilder;
        String string;
        try {
            this.f = bl;
            stringBuilder = new StringBuilder();
            stringBuilder.append("isFrontDesk:");
            string = bl ? "\u8bbe\u7f6e\u5728\u524d\u53f0" : "\u8bbe\u7f6e\u5728\u540e\u53f0";
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
        stringBuilder.append(string);
        f.f.a.e.f.h.d("VideoFeedsPlayer", stringBuilder.toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final boolean a(String string, View view, com.mintegral.msdk.playercommon.e e2) {
        try {
            Object object;
            Object object2 = object = this.n;
            synchronized (object2) {
                if (this.p != null) break block7;
            }
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            d.super.b(throwable.toString());
            return false;
        }
        {
            block9 : {
                MediaPlayer mediaPlayer;
                block10 : {
                    block7 : {
                        block8 : {
                            this.v = com.mintegral.msdk.playercommon.b.a(string);
                            com.mintegral.msdk.playercommon.b.b(string);
                            if (this.v == null) break block8;
                            this.p = this.v.b();
                            break block9;
                        }
                        mediaPlayer = this.p = new MediaPlayer();
                        break block10;
                    }
                    this.p.release();
                    mediaPlayer = this.p = new MediaPlayer();
                }
                mediaPlayer.reset();
            }
            if (view == null) {
                f.f.a.e.f.h.b("VideoFeedsPlayer", "loadingView\u4e3a\u7a7a");
                d.super.b("MediaPlayer init error");
                return false;
            }
            TextUtils.isEmpty((CharSequence)string);
            this.l = e2;
            this.q = view;
            this.p.setOnCompletionListener((MediaPlayer.OnCompletionListener)this);
            this.p.setOnErrorListener((MediaPlayer.OnErrorListener)this);
            if (this.v == null) {
                this.p.setOnPreparedListener((MediaPlayer.OnPreparedListener)this);
            }
            this.p.setOnInfoListener((MediaPlayer.OnInfoListener)this);
            this.p.setOnBufferingUpdateListener((MediaPlayer.OnBufferingUpdateListener)this);
            return true;
        }
    }

    /*
     * Exception decompiling
     */
    public final void b() {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.ConfusedCFRException: Underrun type stack
        // org.benf.cfr.reader.b.a.c.e.a(StackSim.java:35)
        // org.benf.cfr.reader.b.b.af.a(OperationFactoryPop.java:20)
        // org.benf.cfr.reader.b.b.e.a(JVMInstr.java:315)
        // org.benf.cfr.reader.b.a.a.g.a(Op02WithProcessedDataAndRefs.java:195)
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

    public final void b(final int n2) {
        try {
            this.i = n2;
            if (!this.c) {
                f.f.a.e.f.h.a("VideoFeedsPlayer", "seekTo return mHasPrepare false");
                return;
            }
            if (this.p != null) {
                this.p.seekTo(n2);
                this.p.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener(){

                    /*
                     * Enabled aggressive block sorting
                     * Enabled unnecessary exception pruning
                     * Enabled aggressive exception aggregation
                     */
                    public final void onSeekComplete(MediaPlayer mediaPlayer) {
                        try {
                            boolean bl = d.this.p.isPlaying();
                            if (!bl) {
                                d.this.p.start();
                                f.f.a.e.f.h.b("VideoFeedsPlayer", "seekTo start");
                            }
                            d.this.b = true;
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("==================seekTo \u6307\u5b9a\u8fdb\u5ea6 curposition:");
                            stringBuilder.append(n2);
                            f.f.a.e.f.h.b("VideoFeedsPlayer", stringBuilder.toString());
                            return;
                        }
                        catch (Throwable throwable) {
                            throwable.printStackTrace();
                            return;
                        }
                    }
                });
                return;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public final void c() {
        try {
            if (this.c) {
                return;
            }
            if (this.p != null) {
                this.p.prepare();
                this.c = true;
                this.b = false;
                return;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public final void d() {
        try {
            if (!this.c) {
                return;
            }
            if (this.p != null && this.p.isPlaying()) {
                this.r();
                this.p.stop();
                this.c = false;
                this.b = false;
                this.a = true;
                return;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void e() {
        try {
            boolean bl = this.c;
            if (!bl) {
                f.f.a.e.f.h.b("VideoFeedsPlayer", "!mHasPrepare");
                return;
            }
            if (this.p == null) return;
            if (this.p.isPlaying()) return;
            this.a();
            this.p.start();
            this.b = true;
            f.f.a.e.f.h.b("VideoFeedsPlayer", "start");
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void f() {
        try {
            f.f.a.e.f.h.b("VideoFeedsPlayer", "setDataSource");
            if (this.p == null) return;
            {
                com.mintegral.msdk.playercommon.c c2;
                if (this.v == null) {
                    this.p.reset();
                    this.p.setDataSource(this.o);
                }
                if (this.g != null) {
                    this.p.setDisplay(this.g);
                }
                if ((c2 = this.v) == null) {
                    this.c = false;
                    this.p.prepareAsync();
                } else {
                    boolean bl = this.v.a();
                    if (bl) {
                        f.f.a.e.f.h.a("test_media_player", "\u64ad\u653e\u5668\u5df2\u7ecf\u521d\u59cb\u5316\u6210\u529f\uff1a ");
                        this.onPrepared(this.p);
                        return;
                    }
                    f.f.a.e.f.h.a("test_media_player", "\u64ad\u653e\u5668\u6ca1\u6709\u521d\u59cb\u5316\u6210\u529f");
                    this.c = false;
                    this.v.a(this);
                }
                this.a("mediaplayer prepare timeout");
                return;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
            this.r();
            this.b("illegal video address");
            this.c("illegal video address");
        }
    }

    public final void g() {
        try {
            f.f.a.e.f.h.b("VideoFeedsPlayer", "release");
            this.p();
            this.q();
            if (this.p != null) {
                this.d();
                new Thread(new Runnable(){

                    public final void run() {
                        try {
                            f.f.a.e.f.h.b("VideoFeedsPlayer", "MediaPlayer release in sub thread");
                            d.this.p.stop();
                            d.this.p.reset();
                            d.this.p.release();
                            d.this.p = null;
                            return;
                        }
                        catch (Exception exception) {
                            exception.printStackTrace();
                            return;
                        }
                    }
                }).start();
                this.m = null;
                this.l = null;
            }
            this.r();
            return;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return;
        }
    }

    public final void h() {
        try {
            if (this.p == null) {
                return;
            }
            this.p.setVolume(0.0f, 0.0f);
            this.s = true;
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public final void i() {
        try {
            if (this.p == null) {
                return;
            }
            this.p.setVolume(1.0f, 1.0f);
            this.s = false;
            return;
        }
        catch (Exception exception) {
            exception.printStackTrace();
            return;
        }
    }

    public final int j() {
        return this.i;
    }

    public final boolean k() {
        try {
            boolean bl;
            if (this.p != null && (bl = this.p.isPlaying())) {
                return true;
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        return false;
    }

    public final boolean l() {
        return this.c;
    }

    public final boolean m() {
        return this.a;
    }

    public final boolean n() {
        return this.s;
    }

    public final int o() {
        MediaPlayer mediaPlayer = this.p;
        if (mediaPlayer != null) {
            mediaPlayer.getDuration();
        }
        return 0;
    }

    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int n2) {
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final void onCompletion(MediaPlayer var1) {
        this.a = true;
        this.b = false;
        this.i = 0;
        d.super.r();
        {
            catch (Exception var2_3) {
                var2_3.printStackTrace();
                return;
            }
        }
        try {
            if (this.u != null) {
                this.u.post(new Runnable(){

                    public final void run() {
                        if (d.this.l != null) {
                            d.this.l.a();
                        }
                        if (d.this.m != null) {
                            d.this.m.a();
                        }
                    }
                });
            }
            ** GOTO lbl16
        }
        catch (Exception var3_2) {
            var3_2.printStackTrace();
lbl16: // 2 sources:
            f.f.a.e.f.h.b("VideoFeedsPlayer", "======onCompletion");
            return;
        }
    }

    public final boolean onError(MediaPlayer mediaPlayer, int n2, int n3) {
        block3 : {
            try {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("onError what: ");
                stringBuilder.append(n2);
                stringBuilder.append(" extra: ");
                stringBuilder.append(n3);
                f.f.a.e.f.h.d("VideoFeedsPlayer", stringBuilder.toString());
                d.super.r();
                if (this.f || !"MIX 3".equalsIgnoreCase(f.f.a.e.f.d.m()) || !f.f.a.e.f.d.n().equalsIgnoreCase("Xiaomi")) break block3;
                return true;
            }
            catch (Exception exception) {
                exception.printStackTrace();
                return true;
            }
        }
        this.c = false;
        d.super.b("unknow error");
        return true;
    }

    public final boolean onInfo(MediaPlayer mediaPlayer, int n2, int n3) {
        block4 : {
            block5 : {
                try {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("onInfo what:");
                    stringBuilder.append(n2);
                    f.f.a.e.f.h.d("VideoFeedsPlayer", stringBuilder.toString());
                    if (n2 == 701) break block4;
                    if (n2 == 702) break block5;
                    return false;
                }
                catch (Exception exception) {
                    exception.printStackTrace();
                    return false;
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("BUFFERING_END:");
            stringBuilder.append(n2);
            f.f.a.e.f.h.d("VideoFeedsPlayer", stringBuilder.toString());
            this.d = false;
            d.super.r();
            d.super.s();
            return false;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("BUFFERING_START:");
        stringBuilder.append(n2);
        f.f.a.e.f.h.d("VideoFeedsPlayer", stringBuilder.toString());
        this.d = true;
        this.a();
        d.super.a("play buffering tiemout");
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onPrepared(MediaPlayer mediaPlayer) {
        try {
            f.f.a.e.f.h.b("VideoFeedsPlayer", "\u8fdb\u6765\u4e86 onprepar listener");
            if (mediaPlayer != null && mediaPlayer.isPlaying()) {
                f.f.a.e.f.h.b("VideoFeedsPlayer", "onprepare \u6b63\u5728\u64ad\u653e");
                return;
            }
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("onPrepared:");
            stringBuilder.append(this.c);
            f.f.a.e.f.h.b("VideoFeedsPlayer", stringBuilder.toString());
            if (this.f) {
                this.p.seekTo(this.i);
                this.p.setOnSeekCompleteListener(new MediaPlayer.OnSeekCompleteListener(){

                    /*
                     * Enabled aggressive block sorting
                     * Enabled unnecessary exception pruning
                     * Enabled aggressive exception aggregation
                     */
                    public final void onSeekComplete(MediaPlayer mediaPlayer) {
                        try {
                            if (!d.this.f) return;
                            d.this.r();
                            d.this.c = true;
                            MediaPlayer mediaPlayer2 = d.this.p;
                            if (mediaPlayer2 != null) {
                                d.this.b = true;
                                if (!d.this.t) {
                                    d.b(d.this, d.this.p.getDuration() / 1000);
                                    StringBuilder stringBuilder = new StringBuilder();
                                    stringBuilder.append("onPlayStarted()\uff0cgetCurrentPosition:");
                                    stringBuilder.append(d.this.p.getCurrentPosition());
                                    f.f.a.e.f.h.b("VideoFeedsPlayer", stringBuilder.toString());
                                    d.this.t = true;
                                }
                                d.this.p.start();
                            }
                            d.this.s();
                            d.i(d.this);
                            StringBuilder stringBuilder = new StringBuilder();
                            stringBuilder.append("onprepare mCurrentPosition:");
                            stringBuilder.append(d.this.i);
                            stringBuilder.append(" onprepare \u5f00\u59cb\u64ad\u653e mHasPrepare\uff1a");
                            stringBuilder.append(d.this.c);
                            f.f.a.e.f.h.b("VideoFeedsPlayer", stringBuilder.toString());
                            return;
                        }
                        catch (Throwable throwable) {
                            throwable.printStackTrace();
                        }
                    }
                });
                return;
            }
            f.f.a.e.f.h.b("VideoFeedsPlayer", "\u6b64\u65f6\u5728\u540e\u53f0 \u4e0d\u505a\u5904\u7406");
            return;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return;
        }
    }

    private final class o
    extends TimerTask {
        final /* synthetic */ d b;

        private o(d d2) {
            this.b = d2;
        }

        /* synthetic */ o(d d2, g g2) {
            super(d2);
        }

        /*
         * Unable to fully structure code
         * Enabled aggressive block sorting
         * Enabled unnecessary exception pruning
         * Enabled aggressive exception aggregation
         * Lifted jumps to return sites
         */
        public final void run() {
            block5 : {
                block4 : {
                    if (d.a(this.b) == null) return;
                    if (d.a(this.b).isPlaying() == false) return;
                    d.a(this.b, d.a(this.b).getCurrentPosition());
                    var3_1 = (float)d.b(this.b) / 1000.0f;
                    var4_2 = d.b(this.b) % 1000;
                    var5_3 = Math.round((float)var3_1);
                    var6_4 = new StringBuilder();
                    var6_4.append("currentPosition:");
                    var6_4.append(var5_3);
                    var6_4.append(" mCurrentPosition:");
                    var6_4.append(d.b(this.b));
                    f.f.a.e.f.h.b("VideoFeedsPlayer", var6_4.toString());
                    if (d.a(this.b) == null || d.a(this.b).getDuration() <= 0) break block4;
                    var11_5 = d.a(this.b).getDuration() / 1000;
                    if (var4_2 > 0.0f && var4_2 < 500.0f) {
                        ++var5_3;
                    }
                    break block5;
                }
                var11_5 = 0;
            }
            if (var5_3 < 0 || var11_5 <= 0 || var5_3 >= var11_5 + 1) ** GOTO lbl25
            try {
                d.a(this.b, var5_3, var11_5);
lbl25: // 2 sources:
                d.a(this.b, false);
                if (d.c(this.b) != false) return;
                d.d(this.b);
                return;
            }
            catch (Exception var1_6) {
                var1_6.printStackTrace();
            }
        }
    }

}

