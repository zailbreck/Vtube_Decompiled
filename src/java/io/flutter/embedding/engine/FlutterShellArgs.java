/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  java.lang.Integer
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.util.ArrayList
 *  java.util.Arrays
 *  java.util.Collection
 *  java.util.HashSet
 *  java.util.List
 *  java.util.Set
 */
package io.flutter.embedding.engine;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FlutterShellArgs {
    public static final String ARG_CACHE_SKSL = "--cache-sksl";
    public static final String ARG_DART_FLAGS = "--dart-flags";
    public static final String ARG_DISABLE_SERVICE_AUTH_CODES = "--disable-service-auth-codes";
    public static final String ARG_DUMP_SHADER_SKP_ON_SHADER_COMPILATION = "--dump-skp-on-shader-compilation";
    public static final String ARG_ENABLE_DART_PROFILING = "--enable-dart-profiling";
    public static final String ARG_ENABLE_SOFTWARE_RENDERING = "--enable-software-rendering";
    public static final String ARG_ENDLESS_TRACE_BUFFER = "--endless-trace-buffer";
    public static final String ARG_KEY_CACHE_SKSL = "cache-sksl";
    public static final String ARG_KEY_DART_FLAGS = "dart-flags";
    public static final String ARG_KEY_DISABLE_SERVICE_AUTH_CODES = "disable-service-auth-codes";
    public static final String ARG_KEY_DUMP_SHADER_SKP_ON_SHADER_COMPILATION = "dump-skp-on-shader-compilation";
    public static final String ARG_KEY_ENABLE_DART_PROFILING = "enable-dart-profiling";
    public static final String ARG_KEY_ENABLE_SOFTWARE_RENDERING = "enable-software-rendering";
    public static final String ARG_KEY_ENDLESS_TRACE_BUFFER = "endless-trace-buffer";
    public static final String ARG_KEY_OBSERVATORY_PORT = "observatory-port";
    public static final String ARG_KEY_SKIA_DETERMINISTIC_RENDERING = "skia-deterministic-rendering";
    public static final String ARG_KEY_START_PAUSED = "start-paused";
    public static final String ARG_KEY_TRACE_SKIA = "trace-skia";
    public static final String ARG_KEY_TRACE_STARTUP = "trace-startup";
    public static final String ARG_KEY_USE_TEST_FONTS = "use-test-fonts";
    public static final String ARG_KEY_VERBOSE_LOGGING = "verbose-logging";
    public static final String ARG_OBSERVATORY_PORT = "--observatory-port=";
    public static final String ARG_SKIA_DETERMINISTIC_RENDERING = "--skia-deterministic-rendering";
    public static final String ARG_START_PAUSED = "--start-paused";
    public static final String ARG_TRACE_SKIA = "--trace-skia";
    public static final String ARG_TRACE_STARTUP = "--trace-startup";
    public static final String ARG_USE_TEST_FONTS = "--use-test-fonts";
    public static final String ARG_VERBOSE_LOGGING = "--verbose-logging";
    private Set<String> args;

    public FlutterShellArgs(List<String> list) {
        this.args = new HashSet(list);
    }

    public FlutterShellArgs(Set<String> set) {
        this.args = new HashSet(set);
    }

    public FlutterShellArgs(String[] arrstring) {
        this.args = new HashSet((Collection)Arrays.asList((Object[])arrstring));
    }

    public static FlutterShellArgs fromIntent(Intent intent) {
        int n2;
        ArrayList arrayList = new ArrayList();
        if (intent.getBooleanExtra(ARG_KEY_TRACE_STARTUP, false)) {
            arrayList.add((Object)ARG_TRACE_STARTUP);
        }
        if (intent.getBooleanExtra(ARG_KEY_START_PAUSED, false)) {
            arrayList.add((Object)ARG_START_PAUSED);
        }
        if ((n2 = intent.getIntExtra(ARG_KEY_OBSERVATORY_PORT, 0)) > 0) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append(ARG_OBSERVATORY_PORT);
            stringBuilder.append(Integer.toString((int)n2));
            arrayList.add((Object)stringBuilder.toString());
        }
        if (intent.getBooleanExtra(ARG_KEY_DISABLE_SERVICE_AUTH_CODES, false)) {
            arrayList.add((Object)ARG_DISABLE_SERVICE_AUTH_CODES);
        }
        if (intent.getBooleanExtra(ARG_KEY_ENDLESS_TRACE_BUFFER, false)) {
            arrayList.add((Object)ARG_ENDLESS_TRACE_BUFFER);
        }
        if (intent.getBooleanExtra(ARG_KEY_USE_TEST_FONTS, false)) {
            arrayList.add((Object)ARG_USE_TEST_FONTS);
        }
        if (intent.getBooleanExtra(ARG_KEY_ENABLE_DART_PROFILING, false)) {
            arrayList.add((Object)ARG_ENABLE_DART_PROFILING);
        }
        if (intent.getBooleanExtra(ARG_KEY_ENABLE_SOFTWARE_RENDERING, false)) {
            arrayList.add((Object)ARG_ENABLE_SOFTWARE_RENDERING);
        }
        if (intent.getBooleanExtra(ARG_KEY_SKIA_DETERMINISTIC_RENDERING, false)) {
            arrayList.add((Object)ARG_SKIA_DETERMINISTIC_RENDERING);
        }
        if (intent.getBooleanExtra(ARG_KEY_TRACE_SKIA, false)) {
            arrayList.add((Object)ARG_TRACE_SKIA);
        }
        if (intent.getBooleanExtra(ARG_KEY_DUMP_SHADER_SKP_ON_SHADER_COMPILATION, false)) {
            arrayList.add((Object)ARG_DUMP_SHADER_SKP_ON_SHADER_COMPILATION);
        }
        if (intent.getBooleanExtra(ARG_KEY_CACHE_SKSL, false)) {
            arrayList.add((Object)ARG_CACHE_SKSL);
        }
        if (intent.getBooleanExtra(ARG_KEY_VERBOSE_LOGGING, false)) {
            arrayList.add((Object)ARG_VERBOSE_LOGGING);
        }
        if (intent.hasExtra(ARG_KEY_DART_FLAGS)) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("--dart-flags=");
            stringBuilder.append(intent.getStringExtra(ARG_KEY_DART_FLAGS));
            arrayList.add((Object)stringBuilder.toString());
        }
        return new FlutterShellArgs((List<String>)arrayList);
    }

    public void add(String string2) {
        this.args.add((Object)string2);
    }

    public void remove(String string2) {
        this.args.remove((Object)string2);
    }

    public String[] toArray() {
        Object[] arrobject = new String[this.args.size()];
        return (String[])this.args.toArray(arrobject);
    }
}

