/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  com.mintegral.msdk.video.module.MintegralVideoView
 *  com.mintegral.msdk.video.module.MintegralVideoView$f
 *  f.f.a.e.f.h
 *  f.f.a.r.b.j
 *  java.lang.Object
 *  java.lang.String
 *  java.lang.StringBuilder
 */
package f.f.a.r.b.a;

import com.mintegral.msdk.video.module.MintegralVideoView;
import f.f.a.e.f.h;
import f.f.a.r.b.j;

public class e
implements j {
    public void a(int n2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onVideoStatusNotify:");
        stringBuilder.append(n2);
        h.a((String)"js", (String)stringBuilder.toString());
    }

    public void a(int n2, int n3, int n4, int n5) {
        h.a((String)"js", (String)"showDataInfo");
    }

    public void a(int n2, String string) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onClick:");
        stringBuilder.append(n2);
        stringBuilder.append(",pt:");
        stringBuilder.append(string);
        h.a((String)"js", (String)stringBuilder.toString());
    }

    public void a(MintegralVideoView.f f2) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onProgressNotify:");
        stringBuilder.append(f2.toString());
        h.a((String)"js", (String)stringBuilder.toString());
    }

    public void a(Object object) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("onWebviewShow:");
        stringBuilder.append(object);
        h.a((String)"js", (String)stringBuilder.toString());
    }
}

