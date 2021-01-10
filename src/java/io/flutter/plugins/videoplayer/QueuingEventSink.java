/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  io.flutter.plugin.common.EventChannel
 *  io.flutter.plugin.common.EventChannel$EventSink
 *  io.flutter.plugins.videoplayer.QueuingEventSink$1
 *  io.flutter.plugins.videoplayer.QueuingEventSink$EndOfStreamEvent
 *  io.flutter.plugins.videoplayer.QueuingEventSink$ErrorEvent
 *  java.lang.Object
 *  java.lang.String
 *  java.util.ArrayList
 */
package io.flutter.plugins.videoplayer;

import io.flutter.plugin.common.EventChannel;
import io.flutter.plugins.videoplayer.QueuingEventSink;
import java.util.ArrayList;

/*
 * Exception performing whole class analysis.
 */
final class QueuingEventSink
implements EventChannel.EventSink {
    private EventChannel.EventSink delegate;
    private boolean done;
    private ArrayList<Object> eventQueue;

    QueuingEventSink() {
        this.eventQueue = new ArrayList();
        this.done = false;
    }

    private void enqueue(Object object) {
        if (this.done) {
            return;
        }
        this.eventQueue.add(object);
    }

    private void maybeFlush() {
        if (this.delegate == null) {
            return;
        }
        for (Object object : this.eventQueue) {
            if (object instanceof EndOfStreamEvent) {
                this.delegate.endOfStream();
                continue;
            }
            if (object instanceof ErrorEvent) {
                ErrorEvent errorEvent = object;
                this.delegate.error(errorEvent.code, errorEvent.message, errorEvent.details);
                continue;
            }
            this.delegate.success(object);
        }
        this.eventQueue.clear();
    }

    public void endOfStream() {
        this.enqueue((Object)new /* Unavailable Anonymous Inner Class!! */);
        this.maybeFlush();
        this.done = true;
    }

    public void error(String string, String string2, Object object) {
        QueuingEventSink.super.enqueue((Object)new /* Unavailable Anonymous Inner Class!! */);
        QueuingEventSink.super.maybeFlush();
    }

    public void setDelegate(EventChannel.EventSink eventSink) {
        this.delegate = eventSink;
        QueuingEventSink.super.maybeFlush();
    }

    public void success(Object object) {
        QueuingEventSink.super.enqueue(object);
        QueuingEventSink.super.maybeFlush();
    }
}

