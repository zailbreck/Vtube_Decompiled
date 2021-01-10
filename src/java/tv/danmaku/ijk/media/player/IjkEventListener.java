/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  java.lang.Object
 */
package tv.danmaku.ijk.media.player;

import tv.danmaku.ijk.media.player.IjkMediaPlayer;

public interface IjkEventListener {
    public static final int ACCURATE_SEEK_COMPLETE = 900;
    public static final int AUDIO_DECODED_START = 405;
    public static final int AUDIO_RENDERING_START = 403;
    public static final int AUDIO_SEEK_RENDERING_START = 411;
    public static final int BUFFERING_BYTES_UPDATE = 503;
    public static final int BUFFERING_END = 501;
    public static final int BUFFERING_START = 500;
    public static final int BUFFERING_TIME_UPDATE = 504;
    public static final int BUFFERING_UPDATE = 502;
    public static final int COMPLETED = 300;
    public static final int COMPONENT_OPEN = 409;
    public static final int CURRENT_POSITION_UPDATE = 510;
    public static final int ERROR = 100;
    public static final int FIND_STREAM_INFO = 408;
    public static final int FLUSH = 0;
    public static final int GET_IMG_STATE = 1000;
    public static final int OPEN_INPUT = 407;
    public static final int PLAYBACK_STATE_CHANGED = 700;
    public static final int PREPARED = 200;
    public static final int SAR_CHANGED = 401;
    public static final int SEEK_COMPLETE = 600;
    public static final int TIMED_TEXT = 800;
    public static final int VIDEO_DECODED_START = 406;
    public static final int VIDEO_RENDERING_START = 402;
    public static final int VIDEO_ROTATION_CHANGED = 404;
    public static final int VIDEO_SEEK_RENDERING_START = 410;
    public static final int VIDEO_SIZE_CHANGED = 400;

    public void onEvent(IjkMediaPlayer var1, int var2, int var3, int var4, Object var5);
}

