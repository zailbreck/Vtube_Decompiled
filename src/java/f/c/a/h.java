/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  f.c.a.h$a
 *  f.c.a.h$b
 *  f.c.a.h$c
 *  io.flutter.plugin.common.EventChannel
 *  io.flutter.plugin.common.EventChannel$EventSink
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 */
package f.c.a;

import f.c.a.h;
import io.flutter.plugin.common.EventChannel;
import java.util.ArrayList;

/*
 * Exception performing whole class analysis.
 */
final class h
implements EventChannel.EventSink {
    private EventChannel.EventSink a;
    private final ArrayList<Object> b;
    private boolean c;

    h() {
        this.b = new ArrayList();
        this.c = false;
    }

    private void a() {
        if (this.a == null) {
            return;
        }
        for (Object object : this.b) {
            if (object instanceof b) {
                this.a.endOfStream();
                continue;
            }
            if (object instanceof c) {
                c c2 = object;
                this.a.error(c2.a, c2.b, c2.c);
                continue;
            }
            this.a.success(object);
        }
        this.b.clear();
    }

    private void a(Object object) {
        if (this.c) {
            return;
        }
        this.b.add(object);
    }

    public void a(EventChannel.EventSink eventSink) {
        this.a = eventSink;
        h.super.a();
    }

    public void endOfStream() {
        this.a((Object)new /* Unavailable Anonymous Inner Class!! */);
        this.a();
        this.c = true;
    }

    public void error(String string, String string2, Object object) {
        h.super.a((Object)new /* Unavailable Anonymous Inner Class!! */);
        h.super.a();
    }

    public void success(Object object) {
        h.super.a(object);
        h.super.a();
    }
}

