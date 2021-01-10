/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.view.Surface
 *  androidx.media2.common.MediaItem
 *  androidx.media2.common.MediaMetadata
 *  androidx.media2.common.SessionPlayer
 *  androidx.media2.common.SessionPlayer$TrackInfo
 *  androidx.media2.common.SessionPlayer$a
 *  androidx.media2.common.SubtitleData
 *  androidx.media2.common.VideoSize
 *  androidx.media2.common.a
 *  androidx.media2.session.MediaController
 *  androidx.media2.session.MediaController$a
 *  androidx.media2.session.SessionCommandGroup
 *  androidx.media2.session.SessionCommandGroup$a
 *  java.lang.CharSequence
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.List
 *  java.util.concurrent.Executor
 */
package e.j.b;

import android.view.Surface;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import androidx.media2.common.SessionPlayer;
import androidx.media2.common.SubtitleData;
import androidx.media2.common.VideoSize;
import androidx.media2.session.MediaController;
import androidx.media2.session.SessionCommandGroup;
import f.d.a.b.a.e;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

class k {
    final MediaController a;
    final SessionPlayer b;
    private final Executor c;
    final b d;
    private final a e;
    private final c f;
    private boolean g;
    int h = 0;
    SessionCommandGroup i;
    MediaMetadata j;
    private final SessionCommandGroup k;

    k(SessionPlayer sessionPlayer, Executor executor, b b2) {
        if (sessionPlayer != null) {
            if (executor != null) {
                if (b2 != null) {
                    this.b = sessionPlayer;
                    this.c = executor;
                    this.d = b2;
                    this.f = new SessionPlayer.a(){

                        public void onCurrentMediaItemChanged(SessionPlayer sessionPlayer, MediaItem mediaItem) {
                            k k2 = k.this;
                            MediaMetadata mediaMetadata = mediaItem == null ? null : mediaItem.i();
                            k2.j = mediaMetadata;
                            k k3 = k.this;
                            k3.d.a(k3, mediaItem);
                        }

                        public void onPlaybackCompleted(SessionPlayer sessionPlayer) {
                            k k2 = k.this;
                            k2.d.a(k2);
                        }

                        public void onPlaybackSpeedChanged(SessionPlayer sessionPlayer, float f2) {
                            k k2 = k.this;
                            k2.d.a(k2, f2);
                        }

                        public void onPlayerStateChanged(SessionPlayer sessionPlayer, int n2) {
                            k k2 = k.this;
                            if (k2.h == n2) {
                                return;
                            }
                            k2.h = n2;
                            k2.d.a(k2, n2);
                        }

                        public void onPlaylistChanged(SessionPlayer sessionPlayer, List<MediaItem> list, MediaMetadata mediaMetadata) {
                            k k2 = k.this;
                            k2.d.a(k2, list, mediaMetadata);
                        }

                        public void onSeekCompleted(SessionPlayer sessionPlayer, long l2) {
                            k k2 = k.this;
                            k2.d.a(k2, l2);
                        }

                        public void onSubtitleData(SessionPlayer sessionPlayer, MediaItem mediaItem, SessionPlayer.TrackInfo trackInfo, SubtitleData subtitleData) {
                            k k2 = k.this;
                            k2.d.a(k2, mediaItem, trackInfo, subtitleData);
                        }

                        public void onTrackDeselected(SessionPlayer sessionPlayer, SessionPlayer.TrackInfo trackInfo) {
                            k k2 = k.this;
                            k2.d.a(k2, trackInfo);
                        }

                        public void onTrackInfoChanged(SessionPlayer sessionPlayer, List<SessionPlayer.TrackInfo> list) {
                            k k2 = k.this;
                            k2.d.a(k2, list);
                        }

                        public void onTrackSelected(SessionPlayer sessionPlayer, SessionPlayer.TrackInfo trackInfo) {
                            k k2 = k.this;
                            k2.d.b(k2, trackInfo);
                        }

                        public void onVideoSizeChangedInternal(SessionPlayer sessionPlayer, MediaItem mediaItem, VideoSize videoSize) {
                            k k2 = k.this;
                            k2.d.a(k2, mediaItem, videoSize);
                        }
                    };
                    this.a = null;
                    this.e = null;
                    SessionCommandGroup.a a2 = new SessionCommandGroup.a();
                    a2.e(1);
                    this.k = a2.a();
                    return;
                }
                throw new NullPointerException("callback must not be null");
            }
            throw new NullPointerException("executor must not be null");
        }
        throw new NullPointerException("player must not be null");
    }

    k(MediaController mediaController, Executor executor, b b2) {
        if (mediaController != null) {
            if (executor != null) {
                if (b2 != null) {
                    this.a = mediaController;
                    this.c = executor;
                    this.d = b2;
                    this.e = new MediaController.a((k)this){};
                    this.b = null;
                    this.f = null;
                    this.k = null;
                    return;
                }
                throw new NullPointerException("callback must not be null");
            }
            throw new NullPointerException("executor must not be null");
        }
        throw new NullPointerException("controller must not be null");
    }

    private SessionCommandGroup B() {
        MediaController mediaController = this.a;
        if (mediaController == null) {
            if (this.b != null) {
                return this.k;
            }
            return null;
        }
        mediaController.a();
        throw null;
    }

    private float C() {
        MediaController mediaController = this.a;
        if (mediaController == null) {
            SessionPlayer sessionPlayer = this.b;
            if (sessionPlayer != null) {
                return sessionPlayer.q();
            }
            return 1.0f;
        }
        mediaController.q();
        throw null;
    }

    private void D() {
        MediaItem mediaItem;
        this.d.a(this, this.C());
        List<SessionPlayer.TrackInfo> list = this.s();
        if (list != null) {
            this.d.a(this, list);
        }
        if ((mediaItem = this.l()) != null) {
            this.d.a(this, mediaItem, this.t());
        }
    }

    void A() {
        boolean bl;
        int n2 = this.p();
        int n3 = this.h;
        boolean bl2 = true;
        if (n3 != n2) {
            this.h = n2;
            bl = true;
        } else {
            bl = false;
        }
        SessionCommandGroup sessionCommandGroup = this.B();
        if (this.i != sessionCommandGroup) {
            this.i = sessionCommandGroup;
        } else {
            bl2 = false;
        }
        MediaItem mediaItem = this.l();
        MediaMetadata mediaMetadata = mediaItem == null ? null : mediaItem.i();
        this.j = mediaMetadata;
        if (bl) {
            this.d.a(this, n2);
        }
        if (sessionCommandGroup != null && bl2) {
            this.d.a(this, sessionCommandGroup);
        }
        this.d.a(this, mediaItem);
        this.D();
    }

    SessionPlayer.TrackInfo a(int n2) {
        MediaController mediaController = this.a;
        if (mediaController == null) {
            SessionPlayer sessionPlayer = this.b;
            if (sessionPlayer != null) {
                return sessionPlayer.a(n2);
            }
            return null;
        }
        mediaController.a(n2);
        throw null;
    }

    e<? extends androidx.media2.common.a> a(Surface surface) {
        MediaController mediaController = this.a;
        if (mediaController == null) {
            SessionPlayer sessionPlayer = this.b;
            if (sessionPlayer != null) {
                return sessionPlayer.a(surface);
            }
            return null;
        }
        mediaController.a(surface);
        throw null;
    }

    void a() {
        if (this.g) {
            return;
        }
        MediaController mediaController = this.a;
        if (mediaController == null) {
            SessionPlayer sessionPlayer = this.b;
            if (sessionPlayer != null) {
                sessionPlayer.a(this.c, (SessionPlayer.a)this.f);
            }
            this.A();
            this.g = true;
            return;
        }
        mediaController.a(this.c, (MediaController.a)this.e);
        throw null;
    }

    void a(float f2) {
        MediaController mediaController = this.a;
        if (mediaController == null) {
            SessionPlayer sessionPlayer = this.b;
            if (sessionPlayer != null) {
                sessionPlayer.a(f2);
            }
            return;
        }
        mediaController.a(f2);
        throw null;
    }

    void a(long l2) {
        MediaController mediaController = this.a;
        if (mediaController == null) {
            SessionPlayer sessionPlayer = this.b;
            if (sessionPlayer != null) {
                sessionPlayer.f(l2);
            }
            return;
        }
        mediaController.f(l2);
        throw null;
    }

    void a(SessionPlayer.TrackInfo trackInfo) {
        MediaController mediaController = this.a;
        if (mediaController == null) {
            SessionPlayer sessionPlayer = this.b;
            if (sessionPlayer != null) {
                sessionPlayer.a(trackInfo);
            }
            return;
        }
        mediaController.a(trackInfo);
        throw null;
    }

    void b(SessionPlayer.TrackInfo trackInfo) {
        MediaController mediaController = this.a;
        if (mediaController == null) {
            SessionPlayer sessionPlayer = this.b;
            if (sessionPlayer != null) {
                sessionPlayer.b(trackInfo);
            }
            return;
        }
        mediaController.b(trackInfo);
        throw null;
    }

    boolean b() {
        SessionCommandGroup sessionCommandGroup = this.i;
        return sessionCommandGroup != null && sessionCommandGroup.a(10001);
    }

    boolean c() {
        SessionCommandGroup sessionCommandGroup = this.i;
        return sessionCommandGroup != null && sessionCommandGroup.a(40001);
    }

    boolean d() {
        SessionCommandGroup sessionCommandGroup = this.i;
        return sessionCommandGroup != null && sessionCommandGroup.a(40000);
    }

    boolean e() {
        SessionCommandGroup sessionCommandGroup = this.i;
        return sessionCommandGroup != null && sessionCommandGroup.a(10003);
    }

    boolean f() {
        SessionCommandGroup sessionCommandGroup = this.i;
        return sessionCommandGroup != null && sessionCommandGroup.a(11001) && this.i.a(11002);
    }

    boolean g() {
        SessionCommandGroup sessionCommandGroup = this.i;
        return sessionCommandGroup != null && sessionCommandGroup.a(10009);
    }

    boolean h() {
        SessionCommandGroup sessionCommandGroup = this.i;
        return sessionCommandGroup != null && sessionCommandGroup.a(10008);
    }

    void i() {
        if (!this.g) {
            return;
        }
        MediaController mediaController = this.a;
        if (mediaController == null) {
            SessionPlayer sessionPlayer = this.b;
            if (sessionPlayer != null) {
                sessionPlayer.a((SessionPlayer.a)this.f);
            }
            this.g = false;
            return;
        }
        mediaController.a((MediaController.a)this.e);
        throw null;
    }

    CharSequence j() {
        MediaMetadata mediaMetadata = this.j;
        if (mediaMetadata != null && mediaMetadata.a("android.media.metadata.ARTIST")) {
            return this.j.e("android.media.metadata.ARTIST");
        }
        return null;
    }

    long k() {
        if (this.h == 0) {
            return 0L;
        }
        long l2 = this.n();
        if (l2 == 0L) {
            return 0L;
        }
        MediaController mediaController = this.a;
        if (mediaController == null) {
            SessionPlayer sessionPlayer = this.b;
            long l3 = sessionPlayer != null ? sessionPlayer.a() : 0L;
            if (l3 < 0L) {
                return 0L;
            }
            return l3 * 100L / l2;
        }
        mediaController.b();
        throw null;
    }

    MediaItem l() {
        MediaController mediaController = this.a;
        if (mediaController == null) {
            SessionPlayer sessionPlayer = this.b;
            if (sessionPlayer != null) {
                return sessionPlayer.m();
            }
            return null;
        }
        mediaController.m();
        throw null;
    }

    long m() {
        if (this.h == 0) {
            return 0L;
        }
        MediaController mediaController = this.a;
        if (mediaController == null) {
            SessionPlayer sessionPlayer = this.b;
            long l2 = sessionPlayer != null ? sessionPlayer.n() : 0L;
            if (l2 < 0L) {
                return 0L;
            }
            return l2;
        }
        mediaController.n();
        throw null;
    }

    long n() {
        if (this.h == 0) {
            return 0L;
        }
        MediaController mediaController = this.a;
        if (mediaController == null) {
            SessionPlayer sessionPlayer = this.b;
            long l2 = sessionPlayer != null ? sessionPlayer.o() : 0L;
            if (l2 < 0L) {
                return 0L;
            }
            return l2;
        }
        mediaController.o();
        throw null;
    }

    int o() {
        MediaController mediaController = this.a;
        if (mediaController == null) {
            SessionPlayer sessionPlayer = this.b;
            if (sessionPlayer != null) {
                return sessionPlayer.p();
            }
            return -1;
        }
        mediaController.p();
        throw null;
    }

    int p() {
        MediaController mediaController = this.a;
        if (mediaController == null) {
            SessionPlayer sessionPlayer = this.b;
            if (sessionPlayer != null) {
                return sessionPlayer.r();
            }
            return 0;
        }
        mediaController.r();
        throw null;
    }

    int q() {
        MediaController mediaController = this.a;
        if (mediaController == null) {
            SessionPlayer sessionPlayer = this.b;
            if (sessionPlayer != null) {
                return sessionPlayer.s();
            }
            return -1;
        }
        mediaController.s();
        throw null;
    }

    CharSequence r() {
        MediaMetadata mediaMetadata = this.j;
        if (mediaMetadata != null && mediaMetadata.a("android.media.metadata.TITLE")) {
            return this.j.e("android.media.metadata.TITLE");
        }
        return null;
    }

    List<SessionPlayer.TrackInfo> s() {
        MediaController mediaController = this.a;
        if (mediaController == null) {
            SessionPlayer sessionPlayer = this.b;
            if (sessionPlayer != null) {
                return sessionPlayer.t();
            }
            return Collections.emptyList();
        }
        mediaController.t();
        throw null;
    }

    VideoSize t() {
        MediaController mediaController = this.a;
        if (mediaController == null) {
            SessionPlayer sessionPlayer = this.b;
            if (sessionPlayer != null) {
                return sessionPlayer.u();
            }
            return new VideoSize(0, 0);
        }
        mediaController.u();
        throw null;
    }

    boolean u() {
        MediaController mediaController = this.a;
        if (mediaController == null) {
            return false;
        }
        mediaController.v();
        throw null;
    }

    boolean v() {
        return this.h == 2;
    }

    void w() {
        MediaController mediaController = this.a;
        if (mediaController == null) {
            SessionPlayer sessionPlayer = this.b;
            if (sessionPlayer != null) {
                sessionPlayer.v();
            }
            return;
        }
        mediaController.w();
        throw null;
    }

    void x() {
        MediaController mediaController = this.a;
        if (mediaController == null) {
            SessionPlayer sessionPlayer = this.b;
            if (sessionPlayer != null) {
                sessionPlayer.w();
            }
            return;
        }
        mediaController.x();
        throw null;
    }

    void y() {
        MediaController mediaController = this.a;
        if (mediaController == null) {
            SessionPlayer sessionPlayer = this.b;
            if (sessionPlayer != null) {
                sessionPlayer.x();
            }
            return;
        }
        mediaController.y();
        throw null;
    }

    void z() {
        MediaController mediaController = this.a;
        if (mediaController == null) {
            SessionPlayer sessionPlayer = this.b;
            if (sessionPlayer != null) {
                sessionPlayer.y();
            }
            return;
        }
        mediaController.z();
        throw null;
    }

    static abstract class b {
        b() {
        }

        void a(k k2) {
        }

        void a(k k2, float f2) {
        }

        abstract void a(k var1, int var2);

        void a(k k2, long l2) {
        }

        abstract void a(k var1, MediaItem var2);

        void a(k k2, MediaItem mediaItem, SessionPlayer.TrackInfo trackInfo, SubtitleData subtitleData) {
        }

        abstract void a(k var1, MediaItem var2, VideoSize var3);

        abstract void a(k var1, SessionPlayer.TrackInfo var2);

        void a(k k2, SessionCommandGroup sessionCommandGroup) {
        }

        abstract void a(k var1, List<SessionPlayer.TrackInfo> var2);

        void a(k k2, List<MediaItem> list, MediaMetadata mediaMetadata) {
        }

        abstract void b(k var1, SessionPlayer.TrackInfo var2);
    }

}

