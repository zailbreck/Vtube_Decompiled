/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.Animator$AnimatorListener
 *  android.animation.AnimatorSet
 *  android.animation.AnimatorSet$Builder
 *  android.animation.TimeInterpolator
 *  android.animation.ValueAnimator
 *  android.animation.ValueAnimator$AnimatorUpdateListener
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 *  android.content.res.Resources
 *  android.graphics.drawable.ColorDrawable
 *  android.graphics.drawable.Drawable
 *  android.net.Uri
 *  android.os.IBinder
 *  android.util.AttributeSet
 *  android.util.Log
 *  android.util.SparseArray
 *  android.view.LayoutInflater
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$MeasureSpec
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.accessibility.AccessibilityManager
 *  android.view.animation.LinearInterpolator
 *  android.widget.AdapterView
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.BaseAdapter
 *  android.widget.ImageButton
 *  android.widget.ListAdapter
 *  android.widget.ListView
 *  android.widget.PopupWindow
 *  android.widget.PopupWindow$OnDismissListener
 *  android.widget.SeekBar
 *  android.widget.SeekBar$OnSeekBarChangeListener
 *  android.widget.TextView
 *  androidx.appcompat.app.c
 *  androidx.appcompat.app.c$a
 *  androidx.media2.common.MediaItem
 *  androidx.media2.common.MediaMetadata
 *  androidx.media2.common.SessionPlayer
 *  androidx.media2.common.SessionPlayer$TrackInfo
 *  androidx.media2.common.UriMediaItem
 *  androidx.media2.common.VideoSize
 *  androidx.media2.session.MediaController
 *  androidx.media2.session.SessionCommandGroup
 *  e.e.d.a
 *  e.j.b.a
 *  e.j.b.g$a
 *  e.j.b.g$a0
 *  e.j.b.g$b
 *  e.j.b.g$b0
 *  e.j.b.g$c
 *  e.j.b.g$c0
 *  e.j.b.g$d
 *  e.j.b.g$d0
 *  e.j.b.g$e
 *  e.j.b.g$e0
 *  e.j.b.g$f
 *  e.j.b.g$f0
 *  e.j.b.g$g
 *  e.j.b.g$g0$a
 *  e.j.b.g$h
 *  e.j.b.g$h0
 *  e.j.b.g$i
 *  e.j.b.g$i0
 *  e.j.b.g$j
 *  e.j.b.g$k
 *  e.j.b.g$l
 *  e.j.b.g$m
 *  e.j.b.g$n
 *  e.j.b.g$o
 *  e.j.b.g$p
 *  e.j.b.g$q
 *  e.j.b.g$r
 *  e.j.b.g$s
 *  e.j.b.g$t
 *  e.j.b.g$u
 *  e.j.b.g$v
 *  e.j.b.g$w
 *  e.j.b.g$x
 *  e.j.b.g$y
 *  e.j.b.g$z
 *  e.j.b.i
 *  e.j.b.k
 *  e.j.b.k$b
 *  e.j.b.l
 *  e.j.b.n
 *  e.j.b.o
 *  e.j.b.p
 *  e.j.b.q
 *  e.j.b.r
 *  e.j.b.x
 *  java.lang.Appendable
 *  java.lang.CharSequence
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.Math
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.Runnable
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.Formatter
 *  java.util.List
 *  java.util.Locale
 *  java.util.concurrent.Executor
 */
package e.j.b;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.IBinder;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.app.c;
import androidx.media2.common.MediaItem;
import androidx.media2.common.MediaMetadata;
import androidx.media2.common.SessionPlayer;
import androidx.media2.common.UriMediaItem;
import androidx.media2.common.VideoSize;
import androidx.media2.session.MediaController;
import androidx.media2.session.SessionCommandGroup;
import e.j.b.g;
import e.j.b.k;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Formatter;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;

/*
 * Exception performing whole class analysis.
 */
public class g
extends e.j.b.i {
    static final boolean U0;
    boolean A;
    ValueAnimator A0;
    boolean B;
    ValueAnimator B0;
    boolean C;
    final Runnable C0;
    boolean D;
    final Runnable D0;
    private SparseArray<View> E;
    private final Runnable E0;
    private View F;
    Runnable F0;
    private TextView G;
    final Runnable G0;
    ViewGroup H;
    private final SeekBar.OnSeekBarChangeListener H0;
    private View I;
    private final View.OnClickListener I0;
    private View J;
    private final View.OnClickListener J0;
    private View K;
    private final View.OnClickListener K0;
    ViewGroup L;
    private final View.OnClickListener L0;
    ImageButton M;
    private final View.OnClickListener M0;
    private ViewGroup N;
    private final View.OnClickListener N0;
    SeekBar O;
    private final View.OnClickListener O0;
    private View P;
    private final View.OnClickListener P0;
    private ViewGroup Q;
    private final View.OnClickListener Q0;
    private View R;
    private final View.OnClickListener R0;
    private ViewGroup S;
    private final AdapterView.OnItemClickListener S0;
    private TextView T;
    private PopupWindow.OnDismissListener T0;
    TextView U;
    private TextView V;
    private StringBuilder W;
    private Formatter a0;
    ViewGroup b0;
    private boolean c;
    ViewGroup c0;
    Resources d;
    ImageButton d0;
    e.j.b.k e;
    ImageButton e0;
    f0 f;
    private TextView f0;
    private AccessibilityManager g;
    private ListView g0;
    private int h;
    private PopupWindow h0;
    private int i;
    h0 i0;
    private int j;
    i0 j0;
    private int k;
    private List<String> k0;
    int l;
    List<String> l0;
    int m;
    private List<Integer> m0;
    int n;
    List<String> n0;
    int o;
    int o0;
    int p;
    List<SessionPlayer.TrackInfo> p0;
    int q;
    List<SessionPlayer.TrackInfo> q0;
    long r;
    List<String> r0;
    long s;
    List<String> s0;
    long t;
    List<Integer> t0;
    long u;
    int u0;
    boolean v;
    AnimatorSet v0;
    boolean w;
    AnimatorSet w0;
    boolean x;
    AnimatorSet x0;
    boolean y;
    AnimatorSet y0;
    boolean z;
    AnimatorSet z0;

    static {
        U0 = Log.isLoggable((String)"MediaControlView", (int)3);
    }

    public g(Context context) {
        super(context, null);
    }

    public g(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public g(Context context, AttributeSet attributeSet, int n2) {
        super(context, attributeSet, n2);
        this.c = false;
        this.p = -1;
        this.E = new SparseArray();
        this.p0 = new ArrayList();
        this.q0 = new ArrayList();
        this.C0 = new e((g)this);
        this.D0 = new f((g)this);
        this.E0 = new g((g)this);
        this.F0 = new h((g)this);
        this.G0 = new i((g)this);
        this.H0 = new j((g)this);
        this.I0 = new l((g)this);
        this.J0 = new m((g)this);
        this.K0 = new n((g)this);
        this.L0 = new o((g)this);
        this.M0 = new p((g)this);
        this.N0 = new q((g)this);
        this.O0 = new r((g)this);
        this.P0 = new s((g)this);
        this.Q0 = new t((g)this);
        this.R0 = new u((g)this);
        this.S0 = new w((g)this);
        this.T0 = new x((g)this);
        this.d = context.getResources();
        ViewGroup.inflate((Context)context, (int)e.j.b.q.media_controller, (ViewGroup)this);
        g.super.m();
        this.s = 2000L;
        this.g = (AccessibilityManager)context.getSystemService("accessibility");
    }

    static View a(Context context, int n2) {
        return ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(n2, null);
    }

    private void a(View view, int n2, int n3) {
        view.layout(n2, n3, n2 + view.getMeasuredWidth(), n3 + view.getMeasuredHeight());
    }

    private View c(int n2) {
        ImageButton imageButton;
        ImageButton imageButton2;
        ImageButton imageButton3;
        ImageButton imageButton4;
        View view = this.findViewById(n2);
        ImageButton imageButton5 = (ImageButton)view.findViewById(e.j.b.p.pause);
        if (imageButton5 != null) {
            imageButton5.setOnClickListener(this.I0);
        }
        if ((imageButton = (ImageButton)view.findViewById(e.j.b.p.ffwd)) != null) {
            imageButton.setOnClickListener(this.K0);
        }
        if ((imageButton2 = (ImageButton)view.findViewById(e.j.b.p.rew)) != null) {
            imageButton2.setOnClickListener(this.J0);
        }
        if ((imageButton3 = (ImageButton)view.findViewById(e.j.b.p.next)) != null) {
            imageButton3.setOnClickListener(this.L0);
        }
        if ((imageButton4 = (ImageButton)view.findViewById(e.j.b.p.prev)) != null) {
            imageButton4.setOnClickListener(this.M0);
        }
        return view;
    }

    private void d(int n2) {
        block1 : {
            Drawable drawable;
            int n3;
            block2 : {
                block0 : {
                    if (n2 == 0 || n2 == 1) break block0;
                    if (n2 != 2) break block1;
                    drawable = this.O.getThumb();
                    n3 = 0;
                    break block2;
                }
                drawable = this.O.getThumb();
                n3 = 10000;
            }
            drawable.setLevel(n3);
        }
        this.b(this.x);
    }

    private boolean k() {
        if (this.o0 > 0) {
            return true;
        }
        VideoSize videoSize = this.e.t();
        if (videoSize.e() > 0 && videoSize.f() > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("video track count is zero, but it renders video. size: ");
            stringBuilder.append((Object)videoSize);
            Log.w((String)"MediaControlView", (String)stringBuilder.toString());
            return true;
        }
        return false;
    }

    private void l() {
        if (!this.h()) {
            if (this.q == 3) {
                return;
            }
            this.removeCallbacks(this.F0);
            this.removeCallbacks(this.G0);
            this.post(this.E0);
        }
    }

    private void m() {
        this.F = this.findViewById(e.j.b.p.title_bar);
        this.G = (TextView)this.findViewById(e.j.b.p.title_text);
        this.findViewById(e.j.b.p.ad_external_link);
        this.H = (ViewGroup)this.findViewById(e.j.b.p.center_view);
        this.I = this.findViewById(e.j.b.p.center_view_background);
        this.J = this.c(e.j.b.p.embedded_transport_controls);
        this.K = this.c(e.j.b.p.minimal_transport_controls);
        this.L = (ViewGroup)this.findViewById(e.j.b.p.minimal_fullscreen_view);
        this.M = (ImageButton)this.findViewById(e.j.b.p.minimal_fullscreen);
        this.M.setOnClickListener(this.O0);
        this.N = (ViewGroup)this.findViewById(e.j.b.p.progress_bar);
        this.O = (SeekBar)this.findViewById(e.j.b.p.progress);
        this.O.setOnSeekBarChangeListener(this.H0);
        this.O.setMax(1000);
        this.t = -1L;
        this.u = -1L;
        this.P = this.findViewById(e.j.b.p.bottom_bar_background);
        this.Q = (ViewGroup)this.findViewById(e.j.b.p.bottom_bar_left);
        this.R = this.c(e.j.b.p.full_transport_controls);
        this.S = (ViewGroup)this.findViewById(e.j.b.p.time);
        this.T = (TextView)this.findViewById(e.j.b.p.time_end);
        this.U = (TextView)this.findViewById(e.j.b.p.time_current);
        this.V = (TextView)this.findViewById(e.j.b.p.ad_skip_time);
        this.W = new StringBuilder();
        this.a0 = new Formatter((Appendable)this.W, Locale.getDefault());
        this.b0 = (ViewGroup)this.findViewById(e.j.b.p.basic_controls);
        this.c0 = (ViewGroup)this.findViewById(e.j.b.p.extra_controls);
        this.d0 = (ImageButton)this.findViewById(e.j.b.p.subtitle);
        this.d0.setOnClickListener(this.N0);
        this.e0 = (ImageButton)this.findViewById(e.j.b.p.fullscreen);
        this.e0.setOnClickListener(this.O0);
        ((ImageButton)this.findViewById(e.j.b.p.overflow_show)).setOnClickListener(this.P0);
        ((ImageButton)this.findViewById(e.j.b.p.overflow_hide)).setOnClickListener(this.Q0);
        ((ImageButton)this.findViewById(e.j.b.p.settings)).setOnClickListener(this.R0);
        this.f0 = (TextView)this.findViewById(e.j.b.p.ad_remaining);
        this.n();
        this.g0 = (ListView)g.a(this.getContext(), e.j.b.q.settings_list);
        this.i0 = new /* Unavailable Anonymous Inner Class!! */;
        this.j0 = new /* Unavailable Anonymous Inner Class!! */;
        this.g0.setAdapter((ListAdapter)this.i0);
        this.g0.setChoiceMode(1);
        this.g0.setOnItemClickListener(this.S0);
        this.E.append(0, (Object)this.J);
        this.E.append(1, (Object)this.R);
        this.E.append(2, (Object)this.K);
        this.h = this.d.getDimensionPixelSize(e.j.b.n.mcv2_embedded_settings_width);
        this.i = this.d.getDimensionPixelSize(e.j.b.n.mcv2_full_settings_width);
        this.j = this.d.getDimensionPixelSize(e.j.b.n.mcv2_settings_height);
        this.k = -1 * this.d.getDimensionPixelSize(e.j.b.n.mcv2_settings_offset);
        this.h0 = new PopupWindow((View)this.g0, this.h, -2, true);
        this.h0.setBackgroundDrawable((Drawable)new ColorDrawable());
        this.h0.setOnDismissListener(this.T0);
        float f2 = this.d.getDimension(e.j.b.n.mcv2_title_bar_height);
        float f3 = this.d.getDimension(e.j.b.n.mcv2_custom_progress_thumb_size);
        float f4 = this.d.getDimension(e.j.b.n.mcv2_bottom_bar_height);
        View[] arrview = new View[]{this.P, this.Q, this.S, this.b0, this.c0, this.N};
        ValueAnimator valueAnimator = ValueAnimator.ofFloat((float[])new float[]{1.0f, 0.0f});
        valueAnimator.setInterpolator((TimeInterpolator)new LinearInterpolator());
        valueAnimator.addUpdateListener((ValueAnimator.AnimatorUpdateListener)new k(this));
        valueAnimator.addListener((Animator.AnimatorListener)new v(this));
        ValueAnimator valueAnimator2 = ValueAnimator.ofFloat((float[])new float[]{0.0f, 1.0f});
        valueAnimator2.setInterpolator((TimeInterpolator)new LinearInterpolator());
        valueAnimator2.addUpdateListener((ValueAnimator.AnimatorUpdateListener)new y(this));
        valueAnimator2.addListener((Animator.AnimatorListener)new z(this));
        this.v0 = new AnimatorSet();
        AnimatorSet.Builder builder = this.v0.play((Animator)valueAnimator);
        float f5 = -f2;
        builder.with((Animator)e.j.b.a.a((float)0.0f, (float)f5, (View)this.F)).with((Animator)e.j.b.a.a((float)0.0f, (float)f4, (View[])arrview));
        this.v0.setDuration(250L);
        this.v0.addListener((Animator.AnimatorListener)new a0(this));
        float f6 = f3 + f4;
        this.w0 = e.j.b.a.a((float)f4, (float)f6, (View[])arrview);
        this.w0.setDuration(250L);
        this.w0.addListener((Animator.AnimatorListener)new b0(this));
        this.x0 = new AnimatorSet();
        this.x0.play((Animator)valueAnimator).with((Animator)e.j.b.a.a((float)0.0f, (float)f5, (View)this.F)).with((Animator)e.j.b.a.a((float)0.0f, (float)f6, (View[])arrview));
        this.x0.setDuration(250L);
        this.x0.addListener((Animator.AnimatorListener)new c0(this));
        this.y0 = new AnimatorSet();
        this.y0.play((Animator)valueAnimator2).with((Animator)e.j.b.a.a((float)f5, (float)0.0f, (View)this.F)).with((Animator)e.j.b.a.a((float)f4, (float)0.0f, (View[])arrview));
        this.y0.setDuration(250L);
        this.y0.addListener((Animator.AnimatorListener)new d0(this));
        this.z0 = new AnimatorSet();
        this.z0.play((Animator)valueAnimator2).with((Animator)e.j.b.a.a((float)f5, (float)0.0f, (View)this.F)).with((Animator)e.j.b.a.a((float)f6, (float)0.0f, (View[])arrview));
        this.z0.setDuration(250L);
        this.z0.addListener((Animator.AnimatorListener)new e0(this));
        this.A0 = ValueAnimator.ofFloat((float[])new float[]{0.0f, 1.0f});
        this.A0.setDuration(250L);
        this.A0.addUpdateListener((ValueAnimator.AnimatorUpdateListener)new a(this));
        this.A0.addListener((Animator.AnimatorListener)new b(this));
        this.B0 = ValueAnimator.ofFloat((float[])new float[]{1.0f, 0.0f});
        this.B0.setDuration(250L);
        this.B0.addUpdateListener((ValueAnimator.AnimatorUpdateListener)new c(this));
        this.B0.addListener((Animator.AnimatorListener)new d(this));
    }

    private void n() {
        this.k0 = new ArrayList();
        this.k0.add((Object)this.d.getString(e.j.b.r.MediaControlView_audio_track_text));
        this.k0.add((Object)this.d.getString(e.j.b.r.MediaControlView_playback_speed_text));
        this.l0 = new ArrayList();
        this.l0.add((Object)this.d.getString(e.j.b.r.MediaControlView_audio_track_none_text));
        String string = this.d.getString(e.j.b.r.MediaControlView_playback_speed_normal);
        this.l0.add((Object)string);
        this.l0.add((Object)"");
        this.m0 = new ArrayList();
        this.m0.add((Object)e.j.b.o.ic_audiotrack);
        this.m0.add((Object)e.j.b.o.ic_speed);
        this.r0 = new ArrayList();
        this.r0.add((Object)this.d.getString(e.j.b.r.MediaControlView_audio_track_none_text));
        this.s0 = new ArrayList((Collection)Arrays.asList((Object[])this.d.getStringArray(e.j.b.l.MediaControlView_playback_speeds)));
        this.s0.add(3, (Object)string);
        this.o = 3;
        this.t0 = new ArrayList();
        int[] arrn = this.d.getIntArray(e.j.b.l.speed_multiplied_by_100);
        for (int i2 = 0; i2 < arrn.length; ++i2) {
            this.t0.add((Object)arrn[i2]);
        }
        this.u0 = -1;
    }

    private boolean o() {
        return !this.k() && this.p0.size() > 0;
    }

    private void p() {
        if (this.q == 3) {
            return;
        }
        this.removeCallbacks(this.F0);
        this.removeCallbacks(this.G0);
        this.post(this.D0);
    }

    ImageButton a(int n2) {
        ImageButton imageButton = this.a(1, n2);
        if (imageButton != null) {
            return imageButton;
        }
        throw new IllegalArgumentException("Couldn't find a view that has the given id");
    }

    ImageButton a(int n2, int n3) {
        View view = (View)this.E.get(n2);
        if (view == null) {
            return null;
        }
        return (ImageButton)view.findViewById(n3);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    String a(long l2) {
        Formatter formatter;
        long l3 = l2 / 1000L;
        long l4 = l3 % 60L;
        long l5 = l3 / 60L % 60L;
        long l6 = l3 / 3600L;
        this.W.setLength(0);
        if (l6 > 0L) {
            Formatter formatter2 = this.a0;
            Object[] arrobject = new Object[]{l6, l5, l4};
            formatter = formatter2.format("%d:%02d:%02d", arrobject);
            do {
                return formatter.toString();
                break;
            } while (true);
        }
        Formatter formatter3 = this.a0;
        Object[] arrobject = new Object[]{l5, l4};
        formatter = formatter3.format("%02d:%02d", arrobject);
        return formatter.toString();
    }

    void a(float f2) {
        int n2 = -1 * (int)(f2 * (float)this.c0.getWidth());
        this.c0.setTranslationX((float)n2);
        ViewGroup viewGroup = this.S;
        float f3 = 1.0f - f2;
        viewGroup.setAlpha(f3);
        this.b0.setAlpha(f3);
        int n3 = -1 * (int)(f2 * (float)this.a(e.j.b.p.pause).getLeft());
        this.R.setTranslationX((float)n3);
        this.a(e.j.b.p.ffwd).setAlpha(f3);
    }

    void a(int n2, String string) {
        this.o = n2;
        this.l0.set(1, (Object)string);
        this.j0.a(this.s0);
        this.j0.b(this.o);
    }

    void a(long l2, boolean bl) {
        this.c();
        long l3 = this.r;
        int n2 = l3 <= 0L ? 0 : (int)(1000L * l2 / l3);
        this.O.setProgress(n2);
        this.U.setText((CharSequence)this.a(l2));
        if (this.t == -1L) {
            this.t = l2;
            if (bl) {
                this.e.a(this.t);
                return;
            }
        } else {
            this.u = l2;
        }
    }

    void a(BaseAdapter baseAdapter) {
        this.g0.setAdapter((ListAdapter)baseAdapter);
        int n2 = this.p == 0 ? this.h : this.i;
        this.h0.setWidth(n2);
        int n3 = this.getMeasuredHeight() + 2 * this.k;
        int n4 = baseAdapter.getCount() * this.j;
        if (n4 >= n3) {
            n4 = n3;
        }
        this.h0.setHeight(n4);
        this.B = false;
        this.h0.dismiss();
        if (n4 > 0) {
            PopupWindow popupWindow = this.h0;
            int n5 = this.k;
            popupWindow.showAsDropDown((View)this, n5, n5 - n4, 85);
            this.B = true;
        }
    }

    void a(MediaItem mediaItem) {
        if (mediaItem == null) {
            this.O.setProgress(0);
            this.U.setText((CharSequence)this.d.getString(e.j.b.r.MediaControlView_time_placeholder));
            this.T.setText((CharSequence)this.d.getString(e.j.b.r.MediaControlView_time_placeholder));
            return;
        }
        this.c();
        long l2 = this.e.n();
        if (l2 > 0L) {
            this.r = l2;
            this.g();
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    void a(e.j.b.k k2, List<SessionPlayer.TrackInfo> list) {
        this.o0 = 0;
        this.p0 = new ArrayList();
        this.q0 = new ArrayList();
        this.n = 0;
        this.m = -1;
        SessionPlayer.TrackInfo trackInfo = k2.a(2);
        SessionPlayer.TrackInfo trackInfo2 = k2.a(4);
        for (int i2 = 0; i2 < list.size(); ++i2) {
            List<SessionPlayer.TrackInfo> list2;
            int n2 = ((SessionPlayer.TrackInfo)list.get(i2)).k();
            if (n2 == 1) {
                this.o0 = 1 + this.o0;
                continue;
            }
            if (n2 == 2) {
                if (((SessionPlayer.TrackInfo)list.get(i2)).equals((Object)trackInfo)) {
                    this.n = this.p0.size();
                }
                list2 = this.p0;
            } else {
                if (n2 != 4) continue;
                if (((SessionPlayer.TrackInfo)list.get(i2)).equals((Object)trackInfo2)) {
                    this.m = this.q0.size();
                }
                list2 = this.q0;
            }
            list2.add(list.get(i2));
        }
        this.r0 = new ArrayList();
        if (this.p0.isEmpty()) {
            this.r0.add((Object)this.d.getString(e.j.b.r.MediaControlView_audio_track_none_text));
        } else {
            int n3 = 0;
            while (n3 < this.p0.size()) {
                List<String> list3 = this.r0;
                Resources resources = this.d;
                int n4 = e.j.b.r.MediaControlView_audio_track_number_text;
                Object[] arrobject = new Object[]{++n3};
                list3.add((Object)resources.getString(n4, arrobject));
            }
        }
        this.l0.set(0, this.r0.get(this.n));
        this.n0 = new ArrayList();
        if (this.q0.isEmpty()) {
            if (g.super.o()) {
                this.d0.setVisibility(8);
                return;
            }
            this.d0.setVisibility(0);
            this.d0.setAlpha(0.5f);
            this.d0.setEnabled(false);
            return;
        }
        this.n0.add((Object)this.d.getString(e.j.b.r.MediaControlView_subtitle_off_text));
        int n5 = 0;
        do {
            String string;
            if (n5 >= this.q0.size()) {
                this.d0.setVisibility(0);
                this.d0.setAlpha(1.0f);
                this.d0.setEnabled(true);
                return;
            }
            String string2 = ((SessionPlayer.TrackInfo)this.q0.get(n5)).i().getISO3Language();
            if (string2.equals((Object)"und")) {
                Resources resources = this.d;
                int n6 = e.j.b.r.MediaControlView_subtitle_track_number_text;
                Object[] arrobject = new Object[]{n5 + 1};
                string = resources.getString(n6, arrobject);
            } else {
                Resources resources = this.d;
                int n7 = e.j.b.r.MediaControlView_subtitle_track_number_and_lang_text;
                Object[] arrobject = new Object[]{n5 + 1, string2};
                string = resources.getString(n7, arrobject);
            }
            this.n0.add((Object)string);
            ++n5;
        } while (true);
    }

    void a(Runnable runnable, long l2) {
        if (l2 != -1L) {
            this.postDelayed(runnable, l2);
        }
    }

    void a(boolean bl) {
        super.a(bl);
        if (this.e == null) {
            return;
        }
        if (bl) {
            this.removeCallbacks(this.C0);
            this.post(this.C0);
            return;
        }
        this.removeCallbacks(this.C0);
    }

    void b() {
        this.B = true;
        this.h0.dismiss();
    }

    /*
     * Enabled aggressive block sorting
     */
    void b(int n2) {
        Drawable drawable;
        Resources resources;
        int n3;
        ImageButton imageButton = this.a(this.p, e.j.b.p.pause);
        if (imageButton == null) {
            return;
        }
        if (n2 == 0) {
            drawable = this.d.getDrawable(e.j.b.o.ic_pause_circle_filled);
            resources = this.d;
            n3 = e.j.b.r.mcv2_pause_button_desc;
        } else if (n2 == 1) {
            drawable = this.d.getDrawable(e.j.b.o.ic_play_circle_filled);
            resources = this.d;
            n3 = e.j.b.r.mcv2_play_button_desc;
        } else {
            if (n2 != 2) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("unknown type ");
                stringBuilder.append(n2);
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
                throw illegalArgumentException;
            }
            drawable = this.d.getDrawable(e.j.b.o.ic_replay_circle_filled);
            resources = this.d;
            n3 = e.j.b.r.mcv2_replay_button_desc;
        }
        String string = resources.getString(n3);
        imageButton.setImageDrawable(drawable);
        imageButton.setContentDescription((CharSequence)string);
    }

    void b(int n2, int n3) {
        int n4 = this.E.size();
        for (int i2 = 0; i2 < n4; ++i2) {
            ImageButton imageButton;
            int n5 = this.E.keyAt(i2);
            ImageButton imageButton2 = this.a(n5, e.j.b.p.prev);
            if (imageButton2 != null) {
                if (n2 > -1) {
                    imageButton2.setAlpha(1.0f);
                    imageButton2.setEnabled(true);
                } else {
                    imageButton2.setAlpha(0.5f);
                    imageButton2.setEnabled(false);
                }
            }
            if ((imageButton = this.a(n5, e.j.b.p.next)) == null) continue;
            if (n3 > -1) {
                imageButton.setAlpha(1.0f);
                imageButton.setEnabled(true);
                continue;
            }
            imageButton.setAlpha(0.5f);
            imageButton.setEnabled(false);
        }
    }

    void b(MediaItem mediaItem) {
        CharSequence charSequence;
        if (mediaItem == null) {
            this.G.setText(null);
            return;
        }
        if (!g.super.o()) {
            CharSequence charSequence2 = this.e.r();
            if (charSequence2 == null) {
                charSequence2 = this.d.getString(e.j.b.r.mcv2_non_music_title_unknown_text);
            }
            this.G.setText((CharSequence)charSequence2.toString());
            return;
        }
        CharSequence charSequence3 = this.e.r();
        if (charSequence3 == null) {
            charSequence3 = this.d.getString(e.j.b.r.mcv2_music_title_unknown_text);
        }
        if ((charSequence = this.e.j()) == null) {
            charSequence = this.d.getString(e.j.b.r.mcv2_music_artist_unknown_text);
        }
        TextView textView = this.G;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(charSequence3.toString());
        stringBuilder.append(" - ");
        stringBuilder.append(charSequence.toString());
        textView.setText((CharSequence)stringBuilder.toString());
    }

    void b(boolean bl) {
        ImageButton imageButton = this.a(this.p, e.j.b.p.ffwd);
        if (bl) {
            this.x = true;
            this.b(2);
            if (imageButton != null) {
                imageButton.setAlpha(0.5f);
                imageButton.setEnabled(false);
                return;
            }
        } else {
            this.x = false;
            e.j.b.k k2 = this.e;
            if (k2 != null && k2.v()) {
                this.b(0);
            } else {
                this.b(1);
            }
            if (imageButton != null) {
                imageButton.setAlpha(1.0f);
                imageButton.setEnabled(true);
            }
        }
    }

    void c() {
        if (this.e != null) {
            return;
        }
        throw new IllegalStateException("mPlayer must not be null");
    }

    boolean d() {
        this.c();
        MediaItem mediaItem = this.e.l();
        if (!(mediaItem instanceof UriMediaItem)) {
            return false;
        }
        return e.j.b.x.a((Uri)((UriMediaItem)mediaItem).k());
    }

    void e() {
        this.t0.remove(this.u0);
        this.s0.remove(this.u0);
        this.u0 = -1;
    }

    void f() {
        this.removeCallbacks(this.F0);
        this.removeCallbacks(this.G0);
        this.a(this.F0, this.s);
    }

    long g() {
        TextView textView;
        TextView textView2;
        long l2;
        long l3;
        this.c();
        long l4 = this.e.m();
        long l5 = this.r;
        if (l4 > l5) {
            l4 = l5;
        }
        int n2 = (l2 = this.r) > (l3 = 0L) ? (int)(l4 * 1000L / l2) : 0;
        SeekBar seekBar = this.O;
        if (seekBar != null && l4 != this.r) {
            seekBar.setProgress(n2);
            long l6 = this.e.k() LCMP l3;
            SeekBar seekBar2 = this.O;
            int n3 = l6 < 0 ? 1000 : 10 * (int)this.e.k();
            seekBar2.setSecondaryProgress(n3);
        }
        if ((textView = this.T) != null) {
            textView.setText((CharSequence)this.a(this.r));
        }
        if ((textView2 = this.U) != null) {
            textView2.setText((CharSequence)this.a(l4));
        }
        if (this.A) {
            TextView textView3 = this.V;
            if (textView3 != null) {
                long l7 = l4 LCMP 5000L;
                int n4 = textView3.getVisibility();
                if (l7 <= 0) {
                    if (n4 == 8) {
                        this.V.setVisibility(0);
                    }
                    Resources resources = this.d;
                    int n5 = e.j.b.r.MediaControlView_ad_skip_wait_time;
                    Object[] arrobject = new Object[]{1L + (5000L - l4) / 1000L};
                    String string = resources.getString(n5, arrobject);
                    this.V.setText((CharSequence)string);
                } else if (n4 == 0) {
                    this.V.setVisibility(8);
                    this.a(e.j.b.p.next).setEnabled(true);
                    this.a(e.j.b.p.next).clearColorFilter();
                }
            }
            if (this.f0 != null) {
                long l8 = this.r;
                if (l8 - l4 >= l3) {
                    l3 = l8 - l4;
                }
                Resources resources = this.d;
                int n6 = e.j.b.r.MediaControlView_ad_remaining_time;
                Object[] arrobject = new Object[]{this.a(l3)};
                String string = resources.getString(n6, arrobject);
                this.f0.setText((CharSequence)string);
            }
        }
        return l4;
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.media2.widget.MediaControlView";
    }

    long getLatestSeekPosition() {
        this.c();
        long l2 = this.u;
        if (l2 != -1L) {
            return l2;
        }
        long l3 = this.t;
        if (l3 != -1L) {
            return l3;
        }
        return this.e.m();
    }

    boolean h() {
        boolean bl = this.o();
        int n2 = 1;
        if (!(bl && this.p == n2 || this.g.isTouchExplorationEnabled() || this.e.p() == 3)) {
            if (this.e.p() == 0) {
                return n2;
            }
            n2 = 0;
        }
        return n2;
    }

    /*
     * Enabled aggressive block sorting
     */
    void i() {
        int n2;
        this.c();
        if (this.e.v()) {
            this.e.w();
            n2 = 1;
        } else {
            if (this.x) {
                this.e.a(0L);
            }
            this.e.x();
            n2 = 0;
        }
        this.b(n2);
    }

    void j() {
        int n2;
        this.c();
        boolean bl = this.e.b();
        boolean bl2 = this.e.c();
        boolean bl3 = this.e.d();
        boolean bl4 = this.e.h();
        boolean bl5 = this.e.g();
        int n3 = this.E.size();
        int n4 = 0;
        do {
            ImageButton imageButton;
            ImageButton imageButton2;
            ImageButton imageButton3;
            ImageButton imageButton4;
            n2 = 8;
            if (n4 >= n3) break;
            int n5 = this.E.keyAt(n4);
            ImageButton imageButton5 = this.a(n5, e.j.b.p.pause);
            if (imageButton5 != null) {
                int n6 = bl ? 0 : 8;
                imageButton5.setVisibility(n6);
            }
            if ((imageButton2 = this.a(n5, e.j.b.p.rew)) != null) {
                int n7 = bl2 ? 0 : 8;
                imageButton2.setVisibility(n7);
            }
            if ((imageButton = this.a(n5, e.j.b.p.ffwd)) != null) {
                int n8 = bl3 ? 0 : 8;
                imageButton.setVisibility(n8);
            }
            if ((imageButton3 = this.a(n5, e.j.b.p.prev)) != null) {
                int n9 = bl4 ? 0 : 8;
                imageButton3.setVisibility(n9);
            }
            if ((imageButton4 = this.a(n5, e.j.b.p.next)) != null) {
                if (bl5) {
                    n2 = 0;
                }
                imageButton4.setVisibility(n2);
            }
            ++n4;
        } while (true);
        if (this.e.e()) {
            this.z = true;
            this.O.setEnabled(true);
        }
        if (this.e.f()) {
            this.d0.setVisibility(0);
            return;
        }
        this.d0.setVisibility(n2);
    }

    protected void onAttachedToWindow() {
        ViewGroup.super.onAttachedToWindow();
        e.j.b.k k2 = this.e;
        if (k2 != null) {
            k2.a();
        }
    }

    protected void onDetachedFromWindow() {
        ViewGroup.super.onDetachedFromWindow();
        e.j.b.k k2 = this.e;
        if (k2 != null) {
            k2.i();
        }
    }

    protected void onLayout(boolean bl, int n2, int n3, int n4, int n5) {
        int n6 = n4 - n2 - this.getPaddingLeft() - this.getPaddingRight();
        int n7 = n5 - n3 - this.getPaddingTop() - this.getPaddingBottom();
        int n8 = this.Q.getMeasuredWidth() + this.S.getMeasuredWidth() + this.b0.getMeasuredWidth();
        int n9 = this.F.getMeasuredHeight() + this.N.getMeasuredHeight() + this.P.getMeasuredHeight();
        int n10 = this.S.getMeasuredWidth() + this.b0.getMeasuredWidth();
        int n11 = this.F.getMeasuredHeight() + this.J.getMeasuredHeight() + this.N.getMeasuredHeight() + this.P.getMeasuredHeight();
        int n12 = !(this.A || n8 <= n6 && n9 <= n7) ? (n10 <= n6 && n11 <= n7 ? 0 : 2) : 1;
        if (this.p != n12) {
            this.p = n12;
            this.d(n12);
        }
        View view = this.F;
        int n13 = 4;
        int n14 = n12 != 2 ? 0 : 4;
        view.setVisibility(n14);
        View view2 = this.I;
        int n15 = n12 != 1 ? 0 : 4;
        view2.setVisibility(n15);
        View view3 = this.J;
        int n16 = n12 == 0 ? 0 : 4;
        view3.setVisibility(n16);
        View view4 = this.K;
        int n17 = n12 == 2 ? 0 : 4;
        view4.setVisibility(n17);
        View view5 = this.P;
        int n18 = n12 != 2 ? 0 : 4;
        view5.setVisibility(n18);
        ViewGroup viewGroup = this.Q;
        int n19 = n12 == 1 ? 0 : 4;
        viewGroup.setVisibility(n19);
        ViewGroup viewGroup2 = this.S;
        int n20 = n12 != 2 ? 0 : 4;
        viewGroup2.setVisibility(n20);
        ViewGroup viewGroup3 = this.b0;
        int n21 = n12 != 2 ? 0 : 4;
        viewGroup3.setVisibility(n21);
        ImageButton imageButton = this.M;
        if (n12 == 2) {
            n13 = 0;
        }
        imageButton.setVisibility(n13);
        int n22 = this.getPaddingLeft();
        int n23 = n6 + n22;
        int n24 = this.getPaddingTop();
        int n25 = n7 + n24;
        this.a(this.F, n22, n24);
        this.a((View)this.H, n22, n24);
        View view6 = this.P;
        this.a(view6, n22, n25 - view6.getMeasuredHeight());
        ViewGroup viewGroup4 = this.Q;
        this.a((View)viewGroup4, n22, n25 - viewGroup4.getMeasuredHeight());
        ViewGroup viewGroup5 = this.S;
        int n26 = n12 == 1 ? n23 - this.b0.getMeasuredWidth() - this.S.getMeasuredWidth() : n22;
        this.a((View)viewGroup5, n26, n25 - this.S.getMeasuredHeight());
        ViewGroup viewGroup6 = this.b0;
        this.a((View)viewGroup6, n23 - viewGroup6.getMeasuredWidth(), n25 - this.b0.getMeasuredHeight());
        ViewGroup viewGroup7 = this.c0;
        this.a((View)viewGroup7, n23, n25 - viewGroup7.getMeasuredHeight());
        ViewGroup viewGroup8 = this.N;
        int n27 = n12 == 2 ? n25 - viewGroup8.getMeasuredHeight() : n25 - viewGroup8.getMeasuredHeight() - this.d.getDimensionPixelSize(e.j.b.n.mcv2_custom_progress_margin_bottom);
        this.a((View)viewGroup8, n22, n27);
        ViewGroup viewGroup9 = this.L;
        this.a((View)viewGroup9, n22, n25 - viewGroup9.getMeasuredHeight());
    }

    protected void onMeasure(int n2, int n3) {
        int n4;
        int n5;
        int n6 = ViewGroup.resolveSize((int)this.getSuggestedMinimumWidth(), (int)n2);
        int n7 = ViewGroup.resolveSize((int)this.getSuggestedMinimumHeight(), (int)n3);
        int n8 = n6 - this.getPaddingLeft() - this.getPaddingRight();
        int n9 = n7 - this.getPaddingTop() - this.getPaddingBottom();
        if (n8 < 0) {
            n5 = 16777216;
            n4 = 0;
        } else {
            n4 = n8;
            n5 = 0;
        }
        if (n9 < 0) {
            n5 |= 256;
            n9 = 0;
        }
        int n10 = this.getChildCount();
        int n11 = n5;
        for (int i2 = 0; i2 < n10; ++i2) {
            View view = this.getChildAt(i2);
            if (view.getVisibility() == 8) continue;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            int n12 = layoutParams.width;
            int n13 = n12 == -1 ? View.MeasureSpec.makeMeasureSpec((int)n4, (int)1073741824) : (n12 == -2 ? View.MeasureSpec.makeMeasureSpec((int)n4, (int)0) : View.MeasureSpec.makeMeasureSpec((int)n12, (int)1073741824));
            int n14 = layoutParams.height;
            int n15 = n14 == -1 ? View.MeasureSpec.makeMeasureSpec((int)n9, (int)1073741824) : (n14 == -2 ? View.MeasureSpec.makeMeasureSpec((int)n9, (int)0) : View.MeasureSpec.makeMeasureSpec((int)n14, (int)1073741824));
            view.measure(n13, n15);
            n11 |= view.getMeasuredState();
        }
        this.setMeasuredDimension(ViewGroup.resolveSizeAndState((int)n6, (int)n2, (int)n11), ViewGroup.resolveSizeAndState((int)n7, (int)n3, (int)(n11 << 16)));
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.e == null) {
            return ViewGroup.super.onTouchEvent(motionEvent);
        }
        if (!(motionEvent.getAction() != 1 || g.super.o() && this.p == 1)) {
            if (this.q == 0) {
                g.super.l();
                return true;
            }
            g.super.p();
        }
        return true;
    }

    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (this.e == null) {
            return ViewGroup.super.onTrackballEvent(motionEvent);
        }
        if (!(motionEvent.getAction() != 1 || g.super.o() && this.p == 1)) {
            if (this.q == 0) {
                g.super.l();
                return true;
            }
            g.super.p();
        }
        return true;
    }

    void setAttachedToVideoView(boolean bl) {
        this.c = bl;
    }

    void setDelayedAnimationInterval(long l2) {
        this.s = l2;
    }

    public void setMediaController(MediaController mediaController) {
        if (mediaController != null) {
            if (!this.c) {
                this.setMediaControllerInternal(mediaController);
                return;
            }
            throw new IllegalStateException("It's attached to VideoView. Use VideoView's method.");
        }
        throw new NullPointerException("controller must not be null");
    }

    void setMediaControllerInternal(MediaController mediaController) {
        e.j.b.k k2 = this.e;
        if (k2 != null) {
            k2.i();
        }
        this.e = new e.j.b.k(mediaController, e.e.d.a.b((Context)this.getContext()), (k.b)(g)this.new g0());
        if (this.isAttachedToWindow()) {
            this.e.a();
        }
    }

    public void setOnFullScreenListener(f0 f02) {
        ImageButton imageButton;
        int n2;
        if (f02 == null) {
            this.f = null;
            imageButton = this.e0;
            n2 = 8;
        } else {
            this.f = f02;
            imageButton = this.e0;
            n2 = 0;
        }
        imageButton.setVisibility(n2);
    }

    public void setPlayer(SessionPlayer sessionPlayer) {
        if (sessionPlayer != null) {
            if (!this.c) {
                this.setPlayerInternal(sessionPlayer);
                return;
            }
            throw new IllegalStateException("It's attached to VideoView. Use VideoView's method.");
        }
        throw new NullPointerException("player must not be null");
    }

    void setPlayerInternal(SessionPlayer sessionPlayer) {
        e.j.b.k k2 = this.e;
        if (k2 != null) {
            k2.i();
        }
        this.e = new e.j.b.k(sessionPlayer, e.e.d.a.b((Context)this.getContext()), (k.b)(g)this.new g0());
        if (this.isAttachedToWindow()) {
            this.e.a();
        }
    }

    class g0
    extends k.b {
        g0() {
        }

        public void a(e.j.b.k k2) {
            if (k2 != g.this.e) {
                return;
            }
            if (g.U0) {
                Log.d((String)"MediaControlView", (String)"onPlaybackCompleted()");
            }
            g.this.b(true);
            g.this.O.setProgress(1000);
            g g2 = g.this;
            g2.U.setText((CharSequence)g2.a(g2.r));
        }

        public void a(e.j.b.k k2, float f2) {
            int n2;
            if (k2 != g.this.e) {
                return;
            }
            int n3 = Math.round((float)(f2 * 100.0f));
            g g2 = g.this;
            if (g2.u0 != -1) {
                g2.e();
            }
            boolean bl = g.this.t0.contains((Object)n3);
            if (bl) {
                for (n2 = 0; n2 < g.this.t0.size(); ++n2) {
                    if (n3 != (Integer)g.this.t0.get(n2)) continue;
                    g g3 = g.this;
                    g3.a(n2, (String)g3.s0.get(n2));
                    return;
                }
            } else {
                Resources resources = g.this.d;
                int n4 = e.j.b.r.MediaControlView_custom_playback_speed_text;
                Object[] arrobject = new Object[]{Float.valueOf((float)((float)n3 / 100.0f))};
                String string = resources.getString(n4, arrobject);
                while (n2 < g.this.t0.size()) {
                    if (n3 < (Integer)g.this.t0.get(n2)) {
                        g.this.t0.add(n2, (Object)n3);
                        g.this.s0.add(n2, (Object)string);
                        g.this.a(n2, string);
                        break;
                    }
                    if (n2 == g.this.t0.size() - 1 && n3 > (Integer)g.this.t0.get(n2)) {
                        g.this.t0.add((Object)n3);
                        g.this.s0.add((Object)string);
                        g.this.a(n2 + 1, string);
                    }
                    ++n2;
                }
                g g4 = g.this;
                g4.u0 = g4.o;
            }
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public void a(e.j.b.k k2, int n2) {
            if (k2 != g.this.e) {
                return;
            }
            if (g.U0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("onPlayerStateChanged(state: ");
                stringBuilder.append(n2);
                stringBuilder.append(")");
                Log.d((String)"MediaControlView", (String)stringBuilder.toString());
            }
            g.this.a(k2.l());
            if (n2 != 1) {
                if (n2 != 2) {
                    if (n2 != 3) {
                        return;
                    }
                    g.this.b(1);
                    g g2 = g.this;
                    g2.removeCallbacks(g2.C0);
                    if (g.this.getWindowToken() == null) return;
                    c.a a2 = new c.a(g.this.getContext());
                    a2.a(e.j.b.r.mcv2_playback_error_text);
                    a2.b(e.j.b.r.mcv2_error_dialog_button, (DialogInterface.OnClickListener)new a((g0)this));
                    a2.a(true);
                    a2.c();
                    return;
                }
                g g3 = g.this;
                g3.removeCallbacks(g3.C0);
                g g4 = g.this;
                g4.post(g4.C0);
                g.this.f();
                g.this.b(false);
                return;
            }
            g.this.b(1);
            g g5 = g.this;
            g5.removeCallbacks(g5.C0);
            g g6 = g.this;
            g6.removeCallbacks(g6.F0);
            g g7 = g.this;
            g7.removeCallbacks(g7.G0);
            g g8 = g.this;
            g8.post(g8.D0);
        }

        public void a(e.j.b.k k2, long l2) {
            long l3;
            if (k2 != g.this.e) {
                return;
            }
            if (g.U0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("onSeekCompleted(): ");
                stringBuilder.append(l2);
                Log.d((String)"MediaControlView", (String)stringBuilder.toString());
            }
            int n2 = (l3 = g.this.r) <= 0L ? 0 : (int)(1000L * l2 / l3);
            g.this.O.setProgress(n2);
            g g2 = g.this;
            g2.U.setText((CharSequence)g2.a(l2));
            g g3 = g.this;
            long l4 = g3.u;
            if (l4 != -1L) {
                g3.t = l4;
                k2.a(l4);
                g.this.u = -1L;
                return;
            }
            g3.t = -1L;
            if (!g3.v) {
                g3.removeCallbacks(g3.C0);
                g g4 = g.this;
                g4.removeCallbacks(g4.F0);
                g g5 = g.this;
                g5.post(g5.C0);
                g g6 = g.this;
                g6.a(g6.F0, g6.s);
            }
        }

        public void a(e.j.b.k k2, MediaItem mediaItem) {
            if (k2 != g.this.e) {
                return;
            }
            if (g.U0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("onCurrentMediaItemChanged(): ");
                stringBuilder.append((Object)mediaItem);
                Log.d((String)"MediaControlView", (String)stringBuilder.toString());
            }
            g.this.a(mediaItem);
            g.this.b(mediaItem);
            g.this.b(k2.q(), k2.o());
        }

        void a(e.j.b.k k2, MediaItem mediaItem, VideoSize videoSize) {
            List list;
            if (k2 != g.this.e) {
                return;
            }
            if (g.U0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("onVideoSizeChanged(): ");
                stringBuilder.append((Object)videoSize);
                Log.d((String)"MediaControlView", (String)stringBuilder.toString());
            }
            if (g.this.o0 == 0 && videoSize.e() > 0 && videoSize.f() > 0 && (list = k2.s()) != null) {
                g.this.a(k2, (List<SessionPlayer.TrackInfo>)list);
            }
        }

        void a(e.j.b.k k2, SessionPlayer.TrackInfo trackInfo) {
            if (k2 != g.this.e) {
                return;
            }
            if (g.U0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("onTrackDeselected(): ");
                stringBuilder.append((Object)trackInfo);
                Log.d((String)"MediaControlView", (String)stringBuilder.toString());
            }
            if (trackInfo.k() == 4) {
                for (int i2 = 0; i2 < g.this.q0.size(); ++i2) {
                    if (!((SessionPlayer.TrackInfo)g.this.q0.get(i2)).equals((Object)trackInfo)) continue;
                    g g2 = g.this;
                    g2.m = -1;
                    if (g2.l == 2) {
                        g2.j0.b(1 + g2.m);
                    }
                    g g3 = g.this;
                    g3.d0.setImageDrawable(g3.d.getDrawable(e.j.b.o.ic_subtitle_off));
                    g g4 = g.this;
                    g4.d0.setContentDescription((CharSequence)g4.d.getString(e.j.b.r.mcv2_cc_is_off));
                    return;
                }
            }
        }

        public void a(e.j.b.k k2, SessionCommandGroup sessionCommandGroup) {
            g g2 = g.this;
            if (k2 != g2.e) {
                return;
            }
            g2.j();
        }

        void a(e.j.b.k k2, List<SessionPlayer.TrackInfo> list) {
            if (k2 != g.this.e) {
                return;
            }
            if (g.U0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("onTrackInfoChanged(): ");
                stringBuilder.append(list);
                Log.d((String)"MediaControlView", (String)stringBuilder.toString());
            }
            g.this.a(k2, list);
            g.this.a(k2.l());
            g.this.b(k2.l());
        }

        void a(e.j.b.k k2, List<MediaItem> list, MediaMetadata mediaMetadata) {
            if (k2 != g.this.e) {
                return;
            }
            if (g.U0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("onPlaylistChanged(): list: ");
                stringBuilder.append(list);
                stringBuilder.append(", metadata: ");
                stringBuilder.append((Object)mediaMetadata);
                Log.d((String)"MediaControlView", (String)stringBuilder.toString());
            }
            g.this.b(k2.q(), k2.o());
        }

        void b(e.j.b.k k2, SessionPlayer.TrackInfo trackInfo) {
            block6 : {
                block5 : {
                    if (k2 != g.this.e) {
                        return;
                    }
                    if (g.U0) {
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder.append("onTrackSelected(): ");
                        stringBuilder.append((Object)trackInfo);
                        Log.d((String)"MediaControlView", (String)stringBuilder.toString());
                    }
                    int n2 = trackInfo.k();
                    if (n2 != 4) break block5;
                    for (int i2 = 0; i2 < g.this.q0.size(); ++i2) {
                        if (!((SessionPlayer.TrackInfo)g.this.q0.get(i2)).equals((Object)trackInfo)) continue;
                        g g2 = g.this;
                        g2.m = i2;
                        if (g2.l == 2) {
                            g2.j0.b(1 + g2.m);
                        }
                        g g3 = g.this;
                        g3.d0.setImageDrawable(g3.d.getDrawable(e.j.b.o.ic_subtitle_on));
                        g g4 = g.this;
                        g4.d0.setContentDescription((CharSequence)g4.d.getString(e.j.b.r.mcv2_cc_is_on));
                        return;
                    }
                    break block6;
                }
                if (trackInfo.k() != 2) break block6;
                for (int i3 = 0; i3 < g.this.p0.size(); ++i3) {
                    if (!((SessionPlayer.TrackInfo)g.this.p0.get(i3)).equals((Object)trackInfo)) continue;
                    g g5 = g.this;
                    g5.n = i3;
                    g5.l0.set(0, (Object)g5.j0.a(g5.n));
                    return;
                }
            }
        }
    }

}

