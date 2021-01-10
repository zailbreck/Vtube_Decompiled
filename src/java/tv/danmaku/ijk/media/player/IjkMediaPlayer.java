/*
 * Decompiled with CFR 0.0.
 * 
 * Could not load the following classes:
 *  android.annotation.SuppressLint
 *  android.annotation.TargetApi
 *  android.content.ContentResolver
 *  android.content.Context
 *  android.content.res.AssetFileDescriptor
 *  android.graphics.Bitmap
 *  android.graphics.Bitmap$Config
 *  android.graphics.Matrix
 *  android.media.MediaCodecInfo
 *  android.media.MediaCodecList
 *  android.media.RingtoneManager
 *  android.net.Uri
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Looper
 *  android.os.Message
 *  android.os.ParcelFileDescriptor
 *  android.os.PowerManager
 *  android.os.PowerManager$WakeLock
 *  android.text.TextUtils
 *  android.view.Surface
 *  android.view.SurfaceHolder
 *  java.io.FileDescriptor
 *  java.io.FileNotFoundException
 *  java.io.IOException
 *  java.lang.CharSequence
 *  java.lang.Class
 *  java.lang.IllegalAccessException
 *  java.lang.IllegalStateException
 *  java.lang.NoSuchFieldException
 *  java.lang.Object
 *  java.lang.RuntimeException
 *  java.lang.SecurityException
 *  java.lang.String
 *  java.lang.StringBuilder
 *  java.lang.System
 *  java.lang.Throwable
 *  java.lang.ref.WeakReference
 *  java.lang.reflect.Field
 *  java.nio.Buffer
 *  java.nio.ByteBuffer
 *  java.security.InvalidParameterException
 *  java.util.ArrayList
 *  java.util.HashSet
 *  java.util.Iterator
 *  java.util.Locale
 *  java.util.Map
 *  java.util.Map$Entry
 *  java.util.Set
 *  tv.danmaku.ijk.media.player.IMediaPlayer
 *  tv.danmaku.ijk.media.player.IjkEventListener
 *  tv.danmaku.ijk.media.player.IjkLibLoader
 *  tv.danmaku.ijk.media.player.IjkMediaCodecInfo
 *  tv.danmaku.ijk.media.player.IjkMediaMeta
 *  tv.danmaku.ijk.media.player.IjkMediaMeta$IjkStreamMeta
 *  tv.danmaku.ijk.media.player.IjkMediaPlayer$EventHandler
 *  tv.danmaku.ijk.media.player.IjkMediaPlayer$OnControlMessageListener
 *  tv.danmaku.ijk.media.player.IjkMediaPlayer$OnMediaCodecSelectListener
 *  tv.danmaku.ijk.media.player.IjkMediaPlayer$OnNativeInvokeListener
 *  tv.danmaku.ijk.media.player.MediaInfo
 *  tv.danmaku.ijk.media.player.annotations.AccessedByNative
 *  tv.danmaku.ijk.media.player.annotations.CalledByNative
 *  tv.danmaku.ijk.media.player.misc.IAndroidIO
 *  tv.danmaku.ijk.media.player.misc.IMediaDataSource
 *  tv.danmaku.ijk.media.player.misc.ITrackInfo
 *  tv.danmaku.ijk.media.player.misc.MediaCodecSurface
 *  tv.danmaku.ijk.media.player.pragma.DebugLog
 */
package tv.danmaku.ijk.media.player;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.ParcelFileDescriptor;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import tv.danmaku.ijk.media.player.AbstractMediaPlayer;
import tv.danmaku.ijk.media.player.IMediaPlayer;
import tv.danmaku.ijk.media.player.IjkEventListener;
import tv.danmaku.ijk.media.player.IjkLibLoader;
import tv.danmaku.ijk.media.player.IjkMediaCodecInfo;
import tv.danmaku.ijk.media.player.IjkMediaMeta;
import tv.danmaku.ijk.media.player.IjkMediaPlayer;
import tv.danmaku.ijk.media.player.MediaInfo;
import tv.danmaku.ijk.media.player.annotations.AccessedByNative;
import tv.danmaku.ijk.media.player.annotations.CalledByNative;
import tv.danmaku.ijk.media.player.misc.IAndroidIO;
import tv.danmaku.ijk.media.player.misc.IMediaDataSource;
import tv.danmaku.ijk.media.player.misc.ITrackInfo;
import tv.danmaku.ijk.media.player.misc.IjkTrackInfo;
import tv.danmaku.ijk.media.player.misc.MediaCodecSurface;
import tv.danmaku.ijk.media.player.pragma.DebugLog;

/*
 * Exception performing whole class analysis.
 */
public final class IjkMediaPlayer
extends AbstractMediaPlayer {
    public static final int FFP_PROPV_DECODER_AVCODEC = 1;
    public static final int FFP_PROPV_DECODER_MEDIACODEC = 2;
    public static final int FFP_PROPV_DECODER_UNKNOWN = 0;
    public static final int FFP_PROPV_DECODER_VIDEOTOOLBOX = 3;
    public static final int FFP_PROP_FLOAT_DROP_FRAME_RATE = 10007;
    public static final int FFP_PROP_FLOAT_PLAYBACK_RATE = 10003;
    public static final int FFP_PROP_INT64_AMC_GLES_OES_VOUT = 59600;
    public static final int FFP_PROP_INT64_ASYNC_STATISTIC_BUF_BACKWARDS = 20201;
    public static final int FFP_PROP_INT64_ASYNC_STATISTIC_BUF_CAPACITY = 20203;
    public static final int FFP_PROP_INT64_ASYNC_STATISTIC_BUF_FORWARDS = 20202;
    public static final int FFP_PROP_INT64_AUDIO_CACHED_BYTES = 20008;
    public static final int FFP_PROP_INT64_AUDIO_CACHED_DURATION = 20006;
    public static final int FFP_PROP_INT64_AUDIO_CACHED_PACKETS = 20010;
    public static final int FFP_PROP_INT64_AUDIO_DECODER = 20004;
    public static final int FFP_PROP_INT64_BIT_RATE = 20100;
    public static final int FFP_PROP_INT64_CACHE_STATISTIC_COUNT_BYTES = 20208;
    public static final int FFP_PROP_INT64_CACHE_STATISTIC_FILE_FORWARDS = 20206;
    public static final int FFP_PROP_INT64_CACHE_STATISTIC_FILE_POS = 20207;
    public static final int FFP_PROP_INT64_CACHE_STATISTIC_PHYSICAL_POS = 20205;
    public static final int FFP_PROP_INT64_IMMEDIATE_RECONNECT = 20211;
    public static final int FFP_PROP_INT64_LATEST_SEEK_LOAD_DURATION = 20300;
    public static final int FFP_PROP_INT64_LOGICAL_FILE_SIZE = 20209;
    public static final int FFP_PROP_INT64_SELECTED_AUDIO_STREAM = 20002;
    public static final int FFP_PROP_INT64_SELECTED_TIMEDTEXT_STREAM = 20011;
    public static final int FFP_PROP_INT64_SELECTED_VIDEO_STREAM = 20001;
    public static final int FFP_PROP_INT64_SHARE_CACHE_DATA = 20210;
    public static final int FFP_PROP_INT64_TCP_SPEED = 20200;
    public static final int FFP_PROP_INT64_TRAFFIC_STATISTIC_BYTE_COUNT = 20204;
    public static final int FFP_PROP_INT64_VIDEO_CACHED_BYTES = 20007;
    public static final int FFP_PROP_INT64_VIDEO_CACHED_DURATION = 20005;
    public static final int FFP_PROP_INT64_VIDEO_CACHED_PACKETS = 20009;
    public static final int FFP_PROP_INT64_VIDEO_DECODER = 20003;
    public static final int IJK_LOG_DEBUG = 3;
    public static final int IJK_LOG_DEFAULT = 1;
    public static final int IJK_LOG_ERROR = 6;
    public static final int IJK_LOG_FATAL = 7;
    public static final int IJK_LOG_INFO = 4;
    public static final int IJK_LOG_SILENT = 8;
    public static final int IJK_LOG_UNKNOWN = 0;
    public static final int IJK_LOG_VERBOSE = 2;
    public static final int IJK_LOG_WARN = 5;
    public static final int IJK_MSG_ACCURATE_SEEK_COMPLETE = 900;
    public static final int IJK_MSG_AUDIO_DECODED_START = 405;
    public static final int IJK_MSG_AUDIO_RENDERING_START = 403;
    public static final int IJK_MSG_AUDIO_SEEK_RENDERING_START = 411;
    public static final int IJK_MSG_BUFFERING_END = 501;
    public static final int IJK_MSG_BUFFERING_START = 500;
    public static final int IJK_MSG_BUFFERING_UPDATE = 502;
    public static final int IJK_MSG_COMPLETED = 300;
    public static final int IJK_MSG_COMPONENT_OPEN = 409;
    public static final int IJK_MSG_CURRENT_POSITION_UPDATE = 510;
    public static final int IJK_MSG_ERROR = 100;
    public static final int IJK_MSG_FIND_STREAM_INFO = 408;
    public static final int IJK_MSG_NOP = 0;
    public static final int IJK_MSG_OPEN_INPUT = 407;
    public static final int IJK_MSG_PREPARED = 200;
    public static final int IJK_MSG_SAR_CHANGED = 401;
    public static final int IJK_MSG_SEEK_COMPLETE = 600;
    public static final int IJK_MSG_TIMED_TEXT = 800;
    public static final int IJK_MSG_VIDEO_DECODED_START = 406;
    public static final int IJK_MSG_VIDEO_RENDERING_START = 402;
    public static final int IJK_MSG_VIDEO_ROTATION_CHANGED = 404;
    public static final int IJK_MSG_VIDEO_SEEK_RENDERING_START = 410;
    public static final int IJK_MSG_VIDEO_SIZE_CHANGED = 400;
    public static final int IJK_MSG_VIDEO_SNAP_SHOT = 480;
    public static final int OPT_CATEGORY_CODEC = 2;
    public static final int OPT_CATEGORY_FORMAT = 1;
    public static final int OPT_CATEGORY_PLAYER = 4;
    public static final int OPT_CATEGORY_SWS = 3;
    public static final int PROP_FLOAT_VIDEO_DECODE_FRAMES_PER_SECOND = 10001;
    public static final int PROP_FLOAT_VIDEO_OUTPUT_FRAMES_PER_SECOND = 10002;
    public static final int SDL_FCC_RV16 = 909203026;
    public static final int SDL_FCC_RV32 = 842225234;
    public static final int SDL_FCC_YV12 = 842094169;
    public static final String TAG = "tv.danmaku.ijk.media.player.IjkMediaPlayer";
    public static volatile boolean mIsLibLoaded;
    public static volatile boolean mIsNativeInitialized;
    public static final IjkLibLoader sLocalLibLoader;
    public String mDataSource;
    public EventHandler mEventHandler;
    public Set<IjkEventListener> mEventListeners;
    @AccessedByNative
    public int mListenerContext;
    public MediaCodecSurface mMediaCodecSurface;
    @AccessedByNative
    public long mNativeAndroidIO;
    @AccessedByNative
    public long mNativeMediaDataSource;
    @AccessedByNative
    public long mNativeMediaPlayer;
    @AccessedByNative
    public int mNativeSurfaceTexture;
    public OnControlMessageListener mOnControlMessageListener;
    public OnMediaCodecSelectListener mOnMediaCodecSelectListener;
    public OnNativeInvokeListener mOnNativeInvokeListener;
    public boolean mScreenOnWhilePlaying;
    public boolean mStayAwake;
    public SurfaceHolder mSurfaceHolder;
    public int mVideoHeight;
    public int mVideoSarDen;
    public int mVideoSarNum;
    public int mVideoWidth;
    public PowerManager.WakeLock mWakeLock;

    public static {
        sLocalLibLoader = new IjkLibLoader(){

            public void loadLibrary(String string) {
                System.loadLibrary((String)string);
            }
        };
        mIsLibLoaded = false;
        mIsNativeInitialized = false;
    }

    public IjkMediaPlayer() {
        this(sLocalLibLoader);
    }

    public IjkMediaPlayer(IjkLibLoader ijkLibLoader) {
        this.mWakeLock = null;
        this.mEventListeners = new HashSet();
        IjkMediaPlayer.super.initPlayer(ijkLibLoader);
    }

    private native String _getAudioCodecInfo();

    public static native String _getColorFormatName(int var0);

    private native int _getLoopCount();

    private native Bundle _getMediaMeta();

    private native float _getPropertyFloat(int var1, float var2);

    private native long _getPropertyLong(int var1, long var2);

    private native String _getVideoCodecInfo();

    private native void _pause();

    private native void _prepareAsync();

    private native void _release();

    private native void _reset();

    private native void _setAndroidIOCallback(IAndroidIO var1);

    private native void _setDataSource(String var1, String[] var2, String[] var3);

    private native void _setDataSource(IMediaDataSource var1);

    private native void _setDataSourceFd(int var1);

    private native void _setFrameAtTime(String var1, long var2, long var4, int var6, int var7);

    private native void _setLoopCount(int var1);

    private native void _setMediaCodecSurface(MediaCodecSurface var1);

    private native void _setOption(int var1, String var2, long var3);

    private native void _setOption(int var1, String var2, String var3);

    private native void _setPropertyFloat(int var1, float var2);

    private native void _setPropertyLong(int var1, long var2);

    private native void _setStreamSelected(int var1, boolean var2);

    private native void _setVideoSurface(Surface var1);

    private native void _snapShot();

    private native void _start();

    private native void _stop();

    public static /* synthetic */ long access$000(IjkMediaPlayer ijkMediaPlayer) {
        return ijkMediaPlayer.mNativeMediaPlayer;
    }

    public static /* synthetic */ Set access$200(IjkMediaPlayer ijkMediaPlayer) {
        return ijkMediaPlayer.mEventListeners;
    }

    public static /* synthetic */ void access$300(IjkMediaPlayer ijkMediaPlayer, boolean bl) {
        ijkMediaPlayer.stayAwake(bl);
    }

    public static /* synthetic */ int access$400(IjkMediaPlayer ijkMediaPlayer) {
        return ijkMediaPlayer.mVideoWidth;
    }

    public static /* synthetic */ int access$402(IjkMediaPlayer ijkMediaPlayer, int n2) {
        ijkMediaPlayer.mVideoWidth = n2;
        return n2;
    }

    public static /* synthetic */ int access$500(IjkMediaPlayer ijkMediaPlayer) {
        return ijkMediaPlayer.mVideoHeight;
    }

    public static /* synthetic */ int access$502(IjkMediaPlayer ijkMediaPlayer, int n2) {
        ijkMediaPlayer.mVideoHeight = n2;
        return n2;
    }

    public static /* synthetic */ int access$600(IjkMediaPlayer ijkMediaPlayer) {
        return ijkMediaPlayer.mVideoSarNum;
    }

    public static /* synthetic */ int access$602(IjkMediaPlayer ijkMediaPlayer, int n2) {
        ijkMediaPlayer.mVideoSarNum = n2;
        return n2;
    }

    public static /* synthetic */ int access$700(IjkMediaPlayer ijkMediaPlayer) {
        return ijkMediaPlayer.mVideoSarDen;
    }

    public static /* synthetic */ int access$702(IjkMediaPlayer ijkMediaPlayer, int n2) {
        ijkMediaPlayer.mVideoSarDen = n2;
        return n2;
    }

    public static String getColorFormatName(int n2) {
        return IjkMediaPlayer._getColorFormatName(n2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void initNativeOnce() {
        Class<IjkMediaPlayer> class_ = IjkMediaPlayer.class;
        synchronized (IjkMediaPlayer.class) {
            if (!mIsNativeInitialized) {
                IjkMediaPlayer.native_init();
                mIsNativeInitialized = true;
            }
            // ** MonitorExit[var1] (shouldn't be in output)
            return;
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private void initPlayer(IjkLibLoader var1) {
        block2 : {
            IjkMediaPlayer.loadLibrariesOnce(var1);
            IjkMediaPlayer.initNativeOnce();
            var2_2 = Looper.myLooper();
            if (var2_2 == null) break block2;
            var3_3 = new /* Unavailable Anonymous Inner Class!! */;
            ** GOTO lbl11
        }
        var4_4 = Looper.getMainLooper();
        if (var4_4 != null) {
            var3_3 = new /* Unavailable Anonymous Inner Class!! */;
lbl11: // 2 sources:
            this.mEventHandler = var3_3;
        } else {
            this.mEventHandler = null;
        }
        IjkMediaPlayer.super.native_setup((Object)new WeakReference((Object)this));
    }

    private boolean isAmcUsingGlesRender() {
        return this._getPropertyLong(59600, 0L) > 0L;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void loadLibrariesOnce(IjkLibLoader ijkLibLoader) {
        Class<IjkMediaPlayer> class_ = IjkMediaPlayer.class;
        synchronized (IjkMediaPlayer.class) {
            if (!mIsLibLoaded) {
                if (ijkLibLoader == null) {
                    ijkLibLoader = sLocalLibLoader;
                }
                ijkLibLoader.loadLibrary("ijkffmpeg");
                ijkLibLoader.loadLibrary("ijksdl");
                ijkLibLoader.loadLibrary("ijkplayer");
                mIsLibLoaded = true;
            }
            // ** MonitorExit[var2_1] (shouldn't be in output)
            return;
        }
    }

    private native void native_finalize();

    public static native void native_init();

    private native void native_message_loop(Object var1);

    public static native void native_profileBegin(String var0);

    public static native void native_profileEnd();

    public static native void native_setLogLevel(int var0);

    private native void native_setup(Object var1);

    @CalledByNative
    public static boolean onNativeInvoke(Object object, int n2, Bundle bundle) {
        String string = TAG;
        Object[] arrobject = new Object[]{n2};
        DebugLog.ifmt((String)string, (String)"onNativeInvoke %d", (Object[])arrobject);
        if (object != null && object instanceof WeakReference) {
            IjkMediaPlayer ijkMediaPlayer = (IjkMediaPlayer)((WeakReference)object).get();
            if (ijkMediaPlayer != null) {
                OnNativeInvokeListener onNativeInvokeListener = ijkMediaPlayer.mOnNativeInvokeListener;
                if (onNativeInvokeListener != null && onNativeInvokeListener.onNativeInvoke(n2, bundle)) {
                    return true;
                }
                if (n2 != 131079) {
                    return false;
                }
                OnControlMessageListener onControlMessageListener = ijkMediaPlayer.mOnControlMessageListener;
                if (onControlMessageListener == null) {
                    return false;
                }
                int n3 = bundle.getInt("segment_index", -1);
                if (n3 >= 0) {
                    String string2 = onControlMessageListener.onControlResolveSegmentUrl(n3);
                    if (string2 != null) {
                        bundle.putString("url", string2);
                        return true;
                    }
                    throw new RuntimeException((Throwable)new IOException("onNativeInvoke() = <NULL newUrl>"));
                }
                throw new InvalidParameterException("onNativeInvoke(invalid segment index)");
            }
            throw new IllegalStateException("<null weakPlayer>.onNativeInvoke()");
        }
        throw new IllegalStateException("<null weakThiz>.onNativeInvoke()");
    }

    @CalledByNative
    public static String onSelectCodec(Object object, String string, int n2, int n3) {
        if (object != null) {
            if (!(object instanceof WeakReference)) {
                return null;
            }
            IjkMediaPlayer ijkMediaPlayer = (IjkMediaPlayer)((WeakReference)object).get();
            if (ijkMediaPlayer == null) {
                return null;
            }
            OnMediaCodecSelectListener onMediaCodecSelectListener = ijkMediaPlayer.mOnMediaCodecSelectListener;
            if (onMediaCodecSelectListener == null) {
                onMediaCodecSelectListener = DefaultMediaCodecSelector.sInstance;
            }
            return onMediaCodecSelectListener.onMediaCodecSelect((IMediaPlayer)ijkMediaPlayer, string, n2, n3);
        }
        return null;
    }

    @CalledByNative
    public static void postEventFromNative(Object object, int n2, int n3, int n4, Object object2) {
        EventHandler eventHandler;
        if (object == null) {
            return;
        }
        IjkMediaPlayer ijkMediaPlayer = (IjkMediaPlayer)((WeakReference)object).get();
        if (ijkMediaPlayer == null) {
            return;
        }
        if (n2 == 480) {
            ByteBuffer byteBuffer = (ByteBuffer)object2;
            Matrix matrix = new Matrix();
            matrix.postScale(1.0f, -1.0f, (float)n3 / 2.0f, (float)n4 / 2.0f);
            Bitmap bitmap = Bitmap.createBitmap((int)n3, (int)n4, (Bitmap.Config)Bitmap.Config.ARGB_8888);
            bitmap.copyPixelsFromBuffer((Buffer)byteBuffer);
            object2 = Bitmap.createBitmap((Bitmap)bitmap, (int)0, (int)0, (int)n3, (int)n4, (Matrix)matrix, (boolean)true);
        }
        if ((eventHandler = ijkMediaPlayer.mEventHandler) != null) {
            Message message = eventHandler.obtainMessage(n2, n3, n4, object2);
            ijkMediaPlayer.mEventHandler.sendMessage(message);
        }
    }

    private void setDataSource(FileDescriptor fileDescriptor, long l2, long l3) {
        this.setDataSource(fileDescriptor);
    }

    public static void setLogLevel(int n2) {
        DebugLog.setLogLevel((int)n2);
        IjkMediaPlayer.native_setLogLevel(n2);
    }

    @SuppressLint(value={"Wakelock"})
    private void stayAwake(boolean bl) {
        PowerManager.WakeLock wakeLock = this.mWakeLock;
        if (wakeLock != null) {
            if (bl && !wakeLock.isHeld()) {
                this.mWakeLock.acquire();
            } else if (!bl && this.mWakeLock.isHeld()) {
                this.mWakeLock.release();
            }
        }
        this.mStayAwake = bl;
        IjkMediaPlayer.super.updateSurfaceScreenOn();
    }

    private void updateSurfaceScreenOn() {
        SurfaceHolder surfaceHolder = this.mSurfaceHolder;
        if (surfaceHolder != null) {
            boolean bl = this.mScreenOnWhilePlaying && this.mStayAwake;
            surfaceHolder.setKeepScreenOn(bl);
        }
    }

    public final void addIjkEventListener(IjkEventListener ijkEventListener) {
        this.mEventListeners.add((Object)ijkEventListener);
    }

    public void deselectTrack(int n2) {
        IjkMediaPlayer.super._setStreamSelected(n2, false);
    }

    public void finalize() {
        Object.super.finalize();
        this.native_finalize();
    }

    public long getAsyncStatisticBufBackwards() {
        return this._getPropertyLong(20201, 0L);
    }

    public long getAsyncStatisticBufCapacity() {
        return this._getPropertyLong(20203, 0L);
    }

    public long getAsyncStatisticBufForwards() {
        return this._getPropertyLong(20202, 0L);
    }

    public long getAudioCachedBytes() {
        return this._getPropertyLong(20008, 0L);
    }

    public long getAudioCachedDuration() {
        return this._getPropertyLong(20006, 0L);
    }

    public long getAudioCachedPackets() {
        return this._getPropertyLong(20010, 0L);
    }

    public native int getAudioSessionId();

    public long getBitRate() {
        return this._getPropertyLong(20100, 0L);
    }

    public long getCacheStatisticCountBytes() {
        return this._getPropertyLong(20208, 0L);
    }

    public long getCacheStatisticFileForwards() {
        return this._getPropertyLong(20206, 0L);
    }

    public long getCacheStatisticFilePos() {
        return this._getPropertyLong(20207, 0L);
    }

    public long getCacheStatisticPhysicalPos() {
        return this._getPropertyLong(20205, 0L);
    }

    public native long getCurrentPosition();

    public String getDataSource() {
        return this.mDataSource;
    }

    public float getDropFrameRate() {
        return this._getPropertyFloat(10007, 0.0f);
    }

    public native long getDuration();

    public long getFileSize() {
        return this._getPropertyLong(20209, 0L);
    }

    public int getLoopCount() {
        return this._getLoopCount();
    }

    public MediaInfo getMediaInfo() {
        String string;
        MediaInfo mediaInfo = new MediaInfo();
        mediaInfo.mMediaPlayerName = "ijkplayer";
        String string2 = this._getVideoCodecInfo();
        if (!TextUtils.isEmpty((CharSequence)string2)) {
            String[] arrstring = string2.split(",");
            if (arrstring.length >= 2) {
                mediaInfo.mVideoDecoder = arrstring[0];
                mediaInfo.mVideoDecoderImpl = arrstring[1];
            } else if (arrstring.length >= 1) {
                mediaInfo.mVideoDecoder = arrstring[0];
                mediaInfo.mVideoDecoderImpl = "";
            }
        }
        if (!TextUtils.isEmpty((CharSequence)(string = this._getAudioCodecInfo()))) {
            String[] arrstring = string.split(",");
            if (arrstring.length >= 2) {
                mediaInfo.mAudioDecoder = arrstring[0];
                mediaInfo.mAudioDecoderImpl = arrstring[1];
            } else if (arrstring.length >= 1) {
                mediaInfo.mAudioDecoder = arrstring[0];
                mediaInfo.mAudioDecoderImpl = "";
            }
        }
        try {
            mediaInfo.mMeta = IjkMediaMeta.parse((Bundle)this._getMediaMeta());
            return mediaInfo;
        }
        catch (Throwable throwable) {
            throwable.printStackTrace();
            return mediaInfo;
        }
    }

    public Bundle getMediaMeta() {
        return this._getMediaMeta();
    }

    public long getSeekLoadDuration() {
        return this._getPropertyLong(20300, 0L);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public int getSelectedTrack(int n2) {
        int n3;
        if (n2 != 1) {
            if (n2 != 2) {
                if (n2 != 3) {
                    return -1;
                }
                n3 = 20011;
                do {
                    return (int)IjkMediaPlayer.super._getPropertyLong(n3, -1L);
                    break;
                } while (true);
            }
            n3 = 20002;
            return (int)IjkMediaPlayer.super._getPropertyLong(n3, -1L);
        }
        n3 = 20001;
        return (int)IjkMediaPlayer.super._getPropertyLong(n3, -1L);
    }

    public float getSpeed(float f2) {
        return IjkMediaPlayer.super._getPropertyFloat(10003, 0.0f);
    }

    public long getTcpSpeed() {
        return this._getPropertyLong(20200, 0L);
    }

    /*
     * Enabled aggressive block sorting
     */
    public IjkTrackInfo[] getTrackInfo() {
        Bundle bundle = this.getMediaMeta();
        if (bundle == null) {
            return null;
        }
        IjkMediaMeta ijkMediaMeta = IjkMediaMeta.parse((Bundle)bundle);
        if (ijkMediaMeta == null) {
            return null;
        }
        if (ijkMediaMeta.mStreams == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator iterator = ijkMediaMeta.mStreams.iterator();
        do {
            IjkTrackInfo ijkTrackInfo;
            block11 : {
                int n2;
                block9 : {
                    IjkMediaMeta.IjkStreamMeta ijkStreamMeta;
                    block10 : {
                        block8 : {
                            if (!iterator.hasNext()) {
                                return (IjkTrackInfo[])arrayList.toArray((Object[])new IjkTrackInfo[arrayList.size()]);
                            }
                            ijkStreamMeta = (IjkMediaMeta.IjkStreamMeta)iterator.next();
                            ijkTrackInfo = new IjkTrackInfo(ijkStreamMeta);
                            if (!ijkStreamMeta.mType.equalsIgnoreCase("video")) break block8;
                            n2 = 1;
                            break block9;
                        }
                        if (!ijkStreamMeta.mType.equalsIgnoreCase("audio")) break block10;
                        n2 = 2;
                        break block9;
                    }
                    if (!ijkStreamMeta.mType.equalsIgnoreCase("timedtext")) break block11;
                    n2 = 3;
                }
                ijkTrackInfo.setTrackType(n2);
            }
            arrayList.add((Object)ijkTrackInfo);
        } while (true);
    }

    public long getTrafficStatisticByteCount() {
        return this._getPropertyLong(20204, 0L);
    }

    public long getVideoCachedBytes() {
        return this._getPropertyLong(20007, 0L);
    }

    public long getVideoCachedDuration() {
        return this._getPropertyLong(20005, 0L);
    }

    public long getVideoCachedPackets() {
        return this._getPropertyLong(20009, 0L);
    }

    public float getVideoDecodeFramesPerSecond() {
        return this._getPropertyFloat(10001, 0.0f);
    }

    public int getVideoDecoder() {
        return (int)this._getPropertyLong(20003, 0L);
    }

    public int getVideoHeight() {
        return this.mVideoHeight;
    }

    public float getVideoOutputFramesPerSecond() {
        return this._getPropertyFloat(10002, 0.0f);
    }

    public int getVideoSarDen() {
        return this.mVideoSarDen;
    }

    public int getVideoSarNum() {
        return this.mVideoSarNum;
    }

    public int getVideoWidth() {
        return this.mVideoWidth;
    }

    public void httphookReconnect() {
        this._setPropertyLong(20211, 1L);
    }

    public boolean isLooping() {
        return this._getLoopCount() != 1;
    }

    public boolean isPlayable() {
        return true;
    }

    public native boolean isPlaying();

    public void pause() {
        this.stayAwake(false);
        this._pause();
    }

    public void prepareAsync() {
        this._prepareAsync();
    }

    public void release() {
        this.stayAwake(false);
        this.updateSurfaceScreenOn();
        this.resetListeners();
        this._release();
    }

    public final void removeIjkEventListener(IjkEventListener ijkEventListener) {
        this.mEventListeners.remove((Object)ijkEventListener);
    }

    public void reset() {
        this.stayAwake(false);
        this._reset();
        this.mEventHandler.removeCallbacksAndMessages(null);
        this.mVideoWidth = 0;
        this.mVideoHeight = 0;
        if (this.isAmcUsingGlesRender()) {
            MediaCodecSurface mediaCodecSurface;
            this.mMediaCodecSurface = mediaCodecSurface = new MediaCodecSurface();
            this._setMediaCodecSurface(mediaCodecSurface);
        }
    }

    @Override
    public void resetListeners() {
        super.resetListeners();
        this.mOnMediaCodecSelectListener = null;
    }

    public native void seekTo(long var1);

    public void selectTrack(int n2) {
        IjkMediaPlayer.super._setStreamSelected(n2, true);
    }

    public void setAmcGlesRender() {
        this._setPropertyLong(59600, 1L);
    }

    public void setAndroidIOCallback(IAndroidIO iAndroidIO) {
        IjkMediaPlayer.super._setAndroidIOCallback(iAndroidIO);
    }

    public void setAudioStreamType(int n2) {
    }

    public void setCacheShare(int n2) {
        IjkMediaPlayer.super._setPropertyLong(20210, n2);
    }

    public void setDataSource(Context context, Uri uri) {
        this.setDataSource(context, uri, null);
    }

    @TargetApi(value=14)
    public void setDataSource(Context context, Uri uri, Map<String, String> map) {
        block18 : {
            AssetFileDescriptor assetFileDescriptor;
            block19 : {
                block17 : {
                    block16 : {
                        block15 : {
                            block13 : {
                                block14 : {
                                    String string = uri.getScheme();
                                    if ("file".equals((Object)string)) {
                                        this.setDataSource(uri.getPath());
                                        return;
                                    }
                                    if ("content".equals((Object)string) && "settings".equals((Object)uri.getAuthority()) && (uri = RingtoneManager.getActualDefaultRingtoneUri((Context)context, (int)RingtoneManager.getDefaultType((Uri)uri))) == null) {
                                        throw new FileNotFoundException("Failed to resolve default ringtone");
                                    }
                                    assetFileDescriptor = null;
                                    assetFileDescriptor = context.getContentResolver().openAssetFileDescriptor(uri, "r");
                                    if (assetFileDescriptor != null) break block13;
                                    if (assetFileDescriptor == null) break block14;
                                    assetFileDescriptor.close();
                                }
                                return;
                            }
                            try {
                                if (assetFileDescriptor.getDeclaredLength() < 0L) {
                                    this.setDataSource(assetFileDescriptor.getFileDescriptor());
                                    break block15;
                                }
                                IjkMediaPlayer.super.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getDeclaredLength());
                            }
                            catch (IOException throwable) {
                                break block16;
                            }
                            catch (SecurityException throwable) {
                                break block17;
                            }
                            catch (Throwable throwable) {
                                if (assetFileDescriptor != null) {
                                    assetFileDescriptor.close();
                                }
                                throw throwable;
                            }
                        }
                        assetFileDescriptor.close();
                        return;
                    }
                    if (assetFileDescriptor == null) break block18;
                    break block19;
                }
                if (assetFileDescriptor == null) break block18;
            }
            assetFileDescriptor.close();
        }
        DebugLog.d((String)TAG, (String)"Couldn't open file on client side, trying server side");
        this.setDataSource(uri.toString(), map);
    }

    @TargetApi(value=13)
    public void setDataSource(FileDescriptor fileDescriptor) {
        if (Build.VERSION.SDK_INT < 12) {
            int n2;
            try {
                Field field = fileDescriptor.getClass().getDeclaredField("descriptor");
                field.setAccessible(true);
                n2 = field.getInt((Object)fileDescriptor);
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new RuntimeException((Throwable)illegalAccessException);
            }
            catch (NoSuchFieldException noSuchFieldException) {
                throw new RuntimeException((Throwable)noSuchFieldException);
            }
            IjkMediaPlayer.super._setDataSourceFd(n2);
            return;
        }
        ParcelFileDescriptor parcelFileDescriptor = ParcelFileDescriptor.dup((FileDescriptor)fileDescriptor);
        try {
            IjkMediaPlayer.super._setDataSourceFd(parcelFileDescriptor.getFd());
            return;
        }
        finally {
            parcelFileDescriptor.close();
        }
    }

    public void setDataSource(String string) {
        this.mDataSource = string;
        IjkMediaPlayer.super._setDataSource(string, null, null);
    }

    public void setDataSource(String string, Map<String, String> map) {
        if (map != null && !map.isEmpty()) {
            StringBuilder stringBuilder = new StringBuilder();
            for (Map.Entry entry : map.entrySet()) {
                stringBuilder.append((String)entry.getKey());
                stringBuilder.append(":");
                if (!TextUtils.isEmpty((CharSequence)((String)entry.getValue()))) {
                    stringBuilder.append((String)entry.getValue());
                }
                stringBuilder.append("\r\n");
            }
            this.setOption(1, "headers", stringBuilder.toString());
            this.setOption(1, "protocol_whitelist", "async,cache,crypto,file,http,https,ijkhttphook,ijkinject,ijklivehook,ijklongurl,ijksegment,ijktcphook,pipe,rtp,tcp,tls,udp,ijkurlhook,data");
        }
        this.setDataSource(string);
    }

    @Override
    public void setDataSource(IMediaDataSource iMediaDataSource) {
        IjkMediaPlayer.super._setDataSource(iMediaDataSource);
    }

    public void setDisplay(SurfaceHolder surfaceHolder) {
        this.mSurfaceHolder = surfaceHolder;
        Surface surface = surfaceHolder != null ? surfaceHolder.getSurface() : null;
        if (surface == null) {
            if (this.mMediaCodecSurface != null) {
                this.mMediaCodecSurface = null;
            }
        } else if (this.mMediaCodecSurface == null && IjkMediaPlayer.super.isAmcUsingGlesRender()) {
            MediaCodecSurface mediaCodecSurface;
            this.mMediaCodecSurface = mediaCodecSurface = new MediaCodecSurface();
            IjkMediaPlayer.super._setMediaCodecSurface(mediaCodecSurface);
        }
        IjkMediaPlayer.super._setVideoSurface(surface);
        IjkMediaPlayer.super.updateSurfaceScreenOn();
    }

    public void setKeepInBackground(boolean bl) {
    }

    public void setLogEnabled(boolean bl) {
    }

    public void setLoopCount(int n2) {
        this.setOption(4, "loop", n2);
        IjkMediaPlayer.super._setLoopCount(n2);
    }

    public void setLooping(boolean bl) {
        int n2 = bl ^ true;
        this.setOption(4, "loop", n2);
        IjkMediaPlayer.super._setLoopCount(n2);
    }

    public void setOnControlMessageListener(OnControlMessageListener onControlMessageListener) {
        this.mOnControlMessageListener = onControlMessageListener;
    }

    public void setOnMediaCodecSelectListener(OnMediaCodecSelectListener onMediaCodecSelectListener) {
        this.mOnMediaCodecSelectListener = onMediaCodecSelectListener;
    }

    public void setOnNativeInvokeListener(OnNativeInvokeListener onNativeInvokeListener) {
        this.mOnNativeInvokeListener = onNativeInvokeListener;
    }

    public void setOption(int n2, String string, long l2) {
        IjkMediaPlayer.super._setOption(n2, string, l2);
    }

    public void setOption(int n2, String string, String string2) {
        IjkMediaPlayer.super._setOption(n2, string, string2);
    }

    public void setScreenOnWhilePlaying(boolean bl) {
        if (this.mScreenOnWhilePlaying != bl) {
            if (bl && this.mSurfaceHolder == null) {
                DebugLog.w((String)TAG, (String)"setScreenOnWhilePlaying(true) is ineffective without a SurfaceHolder");
            }
            this.mScreenOnWhilePlaying = bl;
            IjkMediaPlayer.super.updateSurfaceScreenOn();
        }
    }

    public void setSpeed(float f2) {
        IjkMediaPlayer.super._setPropertyFloat(10003, f2);
    }

    public void setSurface(Surface surface) {
        if (this.mScreenOnWhilePlaying && surface != null) {
            DebugLog.w((String)TAG, (String)"setScreenOnWhilePlaying(true) is ineffective for Surface");
        }
        MediaCodecSurface mediaCodecSurface = this.mMediaCodecSurface;
        if (surface == null) {
            if (mediaCodecSurface != null) {
                this.mMediaCodecSurface = null;
            }
        } else if (mediaCodecSurface == null && IjkMediaPlayer.super.isAmcUsingGlesRender()) {
            MediaCodecSurface mediaCodecSurface2;
            this.mMediaCodecSurface = mediaCodecSurface2 = new MediaCodecSurface();
            IjkMediaPlayer.super._setMediaCodecSurface(mediaCodecSurface2);
        }
        this.mSurfaceHolder = null;
        IjkMediaPlayer.super._setVideoSurface(surface);
        IjkMediaPlayer.super.updateSurfaceScreenOn();
    }

    public native void setVolume(float var1, float var2);

    @SuppressLint(value={"Wakelock"})
    public void setWakeMode(Context context, int n2) {
        boolean bl;
        PowerManager.WakeLock wakeLock;
        PowerManager.WakeLock wakeLock2 = this.mWakeLock;
        if (wakeLock2 != null) {
            if (wakeLock2.isHeld()) {
                bl = true;
                this.mWakeLock.release();
            } else {
                bl = false;
            }
            this.mWakeLock = null;
        } else {
            bl = false;
        }
        this.mWakeLock = wakeLock = ((PowerManager)context.getSystemService("power")).newWakeLock(n2 | 536870912, IjkMediaPlayer.class.getName());
        wakeLock.setReferenceCounted(false);
        if (bl) {
            this.mWakeLock.acquire();
        }
    }

    public void snapShot() {
        this._snapShot();
    }

    public void start() {
        this.stayAwake(true);
        this._start();
    }

    public void stop() {
        this.stayAwake(false);
        this._stop();
    }

    public static class DefaultMediaCodecSelector
    implements OnMediaCodecSelectListener {
        public static final DefaultMediaCodecSelector sInstance = new DefaultMediaCodecSelector();

        @TargetApi(value=16)
        public String onMediaCodecSelect(IMediaPlayer iMediaPlayer, String string, int n2, int n3) {
            if (Build.VERSION.SDK_INT < 16) {
                return null;
            }
            if (TextUtils.isEmpty((CharSequence)string)) {
                return null;
            }
            String string2 = TAG;
            Locale locale = Locale.US;
            Object[] arrobject = new Object[]{string, n2, n3};
            DebugLog.i((String)string2, (String)String.format((Locale)locale, (String)"onSelectCodec: mime=%s, profile=%d, level=%d", (Object[])arrobject));
            ArrayList arrayList = new ArrayList();
            int n4 = MediaCodecList.getCodecCount();
            for (int i2 = 0; i2 < n4; ++i2) {
                String[] arrstring;
                MediaCodecInfo mediaCodecInfo = MediaCodecList.getCodecInfoAt((int)i2);
                String string3 = TAG;
                Locale locale2 = Locale.US;
                Object[] arrobject2 = new Object[]{mediaCodecInfo.getName()};
                DebugLog.d((String)string3, (String)String.format((Locale)locale2, (String)"  found codec: %s", (Object[])arrobject2));
                if (mediaCodecInfo.isEncoder() || (arrstring = mediaCodecInfo.getSupportedTypes()) == null) continue;
                int n5 = arrstring.length;
                for (int i3 = 0; i3 < n5; ++i3) {
                    IjkMediaCodecInfo ijkMediaCodecInfo;
                    String string4 = arrstring[i3];
                    if (TextUtils.isEmpty((CharSequence)string4)) continue;
                    DebugLog.d((String)TAG, (String)String.format((Locale)Locale.US, (String)"    mime: %s", (Object[])new Object[]{string4}));
                    if (!string4.equalsIgnoreCase(string) || (ijkMediaCodecInfo = IjkMediaCodecInfo.setupCandidate((MediaCodecInfo)mediaCodecInfo, (String)string)) == null) continue;
                    arrayList.add((Object)ijkMediaCodecInfo);
                    String string5 = TAG;
                    Locale locale3 = Locale.US;
                    Object[] arrobject3 = new Object[]{mediaCodecInfo.getName(), ijkMediaCodecInfo.mRank};
                    DebugLog.i((String)string5, (String)String.format((Locale)locale3, (String)"candidate codec: %s rank=%d", (Object[])arrobject3));
                    ijkMediaCodecInfo.dumpProfileLevels(string);
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            IjkMediaCodecInfo ijkMediaCodecInfo = (IjkMediaCodecInfo)arrayList.get(0);
            for (IjkMediaCodecInfo ijkMediaCodecInfo2 : arrayList) {
                if (ijkMediaCodecInfo2.mRank <= ijkMediaCodecInfo.mRank) continue;
                ijkMediaCodecInfo = ijkMediaCodecInfo2;
            }
            if (ijkMediaCodecInfo.mRank < 600) {
                String string6 = TAG;
                Locale locale4 = Locale.US;
                Object[] arrobject4 = new Object[]{ijkMediaCodecInfo.mCodecInfo.getName()};
                DebugLog.w((String)string6, (String)String.format((Locale)locale4, (String)"unaccetable codec: %s", (Object[])arrobject4));
                return null;
            }
            String string7 = TAG;
            Locale locale5 = Locale.US;
            Object[] arrobject5 = new Object[]{ijkMediaCodecInfo.mCodecInfo.getName(), ijkMediaCodecInfo.mRank};
            DebugLog.i((String)string7, (String)String.format((Locale)locale5, (String)"selected codec: %s rank=%d", (Object[])arrobject5));
            return ijkMediaCodecInfo.mCodecInfo.getName();
        }
    }

}

