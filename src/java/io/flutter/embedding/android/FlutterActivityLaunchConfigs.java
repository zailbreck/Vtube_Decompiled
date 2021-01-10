/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Enum
 *  java.lang.Object
 *  java.lang.String
 */
package io.flutter.embedding.android;

public class FlutterActivityLaunchConfigs {
    static final String DART_ENTRYPOINT_META_DATA_KEY = "io.flutter.Entrypoint";
    static final String DEFAULT_BACKGROUND_MODE = BackgroundMode.opaque.name();
    static final String DEFAULT_DART_ENTRYPOINT = "main";
    static final String DEFAULT_INITIAL_ROUTE = "/";
    static final String EXTRA_BACKGROUND_MODE = "background_mode";
    static final String EXTRA_CACHED_ENGINE_ID = "cached_engine_id";
    static final String EXTRA_DESTROY_ENGINE_WITH_ACTIVITY = "destroy_engine_with_activity";
    static final String EXTRA_INITIAL_ROUTE = "route";
    static final String INITIAL_ROUTE_META_DATA_KEY = "io.flutter.InitialRoute";
    static final String NORMAL_THEME_META_DATA_KEY = "io.flutter.embedding.android.NormalTheme";
    static final String SPLASH_SCREEN_META_DATA_KEY = "io.flutter.embedding.android.SplashScreenDrawable";

    private FlutterActivityLaunchConfigs() {
    }

    public static final class BackgroundMode
    extends Enum<BackgroundMode> {
        private static final /* synthetic */ BackgroundMode[] $VALUES;
        public static final /* enum */ BackgroundMode opaque = new BackgroundMode();
        public static final /* enum */ BackgroundMode transparent = new BackgroundMode();

        static {
            BackgroundMode[] arrbackgroundMode = new BackgroundMode[]{opaque, transparent};
            $VALUES = arrbackgroundMode;
        }

        public static BackgroundMode valueOf(String string2) {
            return (BackgroundMode)Enum.valueOf(BackgroundMode.class, (String)string2);
        }

        public static BackgroundMode[] values() {
            return (BackgroundMode[])$VALUES.clone();
        }
    }

}

