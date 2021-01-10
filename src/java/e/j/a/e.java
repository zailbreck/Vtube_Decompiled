/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.media.PlaybackParams
 *  android.os.Build
 *  android.os.Build$VERSION
 *  java.lang.Float
 *  java.lang.IllegalArgumentException
 *  java.lang.IllegalStateException
 *  java.lang.Integer
 *  java.lang.NullPointerException
 *  java.lang.Object
 *  java.lang.String
 */
package e.j.a;

import android.media.PlaybackParams;
import android.os.Build;

public final class e {
    private Integer a;
    private Float b;
    private Float c;
    private PlaybackParams d;

    e(PlaybackParams playbackParams) {
        this.d = playbackParams;
    }

    e(Integer n2, Float f2, Float f3) {
        this.a = n2;
        this.b = f2;
        this.c = f3;
    }

    public Integer a() {
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                Integer n2 = this.d.getAudioFallbackMode();
                return n2;
            }
            catch (IllegalStateException illegalStateException) {
                return null;
            }
        }
        return this.a;
    }

    public Float b() {
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                Float f2 = Float.valueOf((float)this.d.getPitch());
                return f2;
            }
            catch (IllegalStateException illegalStateException) {
                return null;
            }
        }
        return this.b;
    }

    public PlaybackParams c() {
        if (Build.VERSION.SDK_INT >= 23) {
            return this.d;
        }
        return null;
    }

    public Float d() {
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                Float f2 = Float.valueOf((float)this.d.getSpeed());
                return f2;
            }
            catch (IllegalStateException illegalStateException) {
                return null;
            }
        }
        return this.c;
    }

    public static final class a {
        private Integer a;
        private Float b;
        private Float c;
        private PlaybackParams d;

        public a() {
            if (Build.VERSION.SDK_INT >= 23) {
                this.d = new PlaybackParams();
            }
        }

        public a(e e2) {
            if (e2 != null) {
                if (Build.VERSION.SDK_INT >= 23) {
                    this.d = e2.c();
                    return;
                }
                this.a = e2.a();
                this.b = e2.b();
                this.c = e2.d();
                return;
            }
            throw new NullPointerException("playbakcParams shouldn't be null");
        }

        public a a(float f2) {
            if (f2 != 0.0f) {
                if (!(f2 < 0.0f)) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        this.d.setPitch(f2);
                        return this;
                    }
                    this.b = Float.valueOf((float)f2);
                    return this;
                }
                throw new IllegalArgumentException("pitch must not be negative");
            }
            throw new IllegalArgumentException("0 pitch is not allowed");
        }

        public a a(int n2) {
            if (Build.VERSION.SDK_INT >= 23) {
                this.d.setAudioFallbackMode(n2);
                return this;
            }
            this.a = n2;
            return this;
        }

        public e a() {
            if (Build.VERSION.SDK_INT >= 23) {
                return new e(this.d);
            }
            return new e(this.a, this.b, this.c);
        }

        public a b(float f2) {
            if (f2 != 0.0f) {
                if (!(f2 < 0.0f)) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        this.d.setSpeed(f2);
                        return this;
                    }
                    this.c = Float.valueOf((float)f2);
                    return this;
                }
                throw new IllegalArgumentException("negative speed is not supported");
            }
            throw new IllegalArgumentException("0 speed is not allowed");
        }
    }

}

