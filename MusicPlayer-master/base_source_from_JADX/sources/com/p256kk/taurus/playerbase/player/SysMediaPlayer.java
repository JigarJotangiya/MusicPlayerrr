package com.p256kk.taurus.playerbase.player;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.media.PlaybackParams;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.p256kk.taurus.playerbase.p258b.C6614a;
import com.p256kk.taurus.playerbase.p259c.C6618a;
import com.p256kk.taurus.playerbase.p259c.C6620c;
import com.p256kk.taurus.playerbase.p260d.C6621a;
import com.p256kk.taurus.playerbase.p261e.C6640b;
import java.util.HashMap;

/* renamed from: com.kk.taurus.playerbase.player.SysMediaPlayer */
public class SysMediaPlayer extends BaseInternalPlayer {
    private final int MEDIA_INFO_NETWORK_BANDWIDTH = 703;
    final String TAG = "SysMediaPlayer";
    /* access modifiers changed from: private */
    public long mBandWidth;
    private MediaPlayer.OnBufferingUpdateListener mBufferingUpdateListener = new C6708g();
    private MediaPlayer.OnCompletionListener mCompletionListener = new C6704c();
    private C6618a mDataSource;
    private MediaPlayer.OnErrorListener mErrorListener = new C6707f();
    private MediaPlayer.OnInfoListener mInfoListener = new C6705d();
    /* access modifiers changed from: private */
    public MediaPlayer mMediaPlayer;
    private MediaPlayer.OnSeekCompleteListener mOnSeekCompleteListener = new C6706e();
    MediaPlayer.OnPreparedListener mPreparedListener = new C6702a();
    MediaPlayer.OnVideoSizeChangedListener mSizeChangedListener = new C6703b();
    /* access modifiers changed from: private */
    public int mTargetState = Integer.MAX_VALUE;
    /* access modifiers changed from: private */
    public int mVideoHeight;
    /* access modifiers changed from: private */
    public int mVideoWidth;
    /* access modifiers changed from: private */
    public int startSeekPos;

    /* renamed from: com.kk.taurus.playerbase.player.SysMediaPlayer$a */
    class C6702a implements MediaPlayer.OnPreparedListener {
        C6702a() {
        }

        public void onPrepared(MediaPlayer mediaPlayer) {
            C6640b.m38216a("SysMediaPlayer", "onPrepared...");
            SysMediaPlayer.this.updateStatus(2);
            int unused = SysMediaPlayer.this.mVideoWidth = mediaPlayer.getVideoWidth();
            int unused2 = SysMediaPlayer.this.mVideoHeight = mediaPlayer.getVideoHeight();
            Bundle a = C6621a.m38175a();
            a.putInt("int_arg1", SysMediaPlayer.this.mVideoWidth);
            a.putInt("int_arg2", SysMediaPlayer.this.mVideoHeight);
            SysMediaPlayer.this.submitPlayerEvent(-99018, a);
            int access$200 = SysMediaPlayer.this.startSeekPos;
            if (access$200 > 0 && mediaPlayer.getDuration() > 0) {
                SysMediaPlayer.this.mMediaPlayer.seekTo(access$200);
                int unused3 = SysMediaPlayer.this.startSeekPos = 0;
            }
            C6640b.m38216a("SysMediaPlayer", "mTargetState = " + SysMediaPlayer.this.mTargetState);
            if (SysMediaPlayer.this.mTargetState == 3) {
                SysMediaPlayer.this.start();
            } else if (SysMediaPlayer.this.mTargetState == 4) {
                SysMediaPlayer.this.pause();
            } else if (SysMediaPlayer.this.mTargetState == 5 || SysMediaPlayer.this.mTargetState == 0) {
                SysMediaPlayer.this.reset();
            }
            SysMediaPlayer.this.attachTimedTextSource();
        }
    }

    /* renamed from: com.kk.taurus.playerbase.player.SysMediaPlayer$b */
    class C6703b implements MediaPlayer.OnVideoSizeChangedListener {
        C6703b() {
        }

        public void onVideoSizeChanged(MediaPlayer mediaPlayer, int i, int i2) {
            int unused = SysMediaPlayer.this.mVideoWidth = mediaPlayer.getVideoWidth();
            int unused2 = SysMediaPlayer.this.mVideoHeight = mediaPlayer.getVideoHeight();
            Bundle a = C6621a.m38175a();
            a.putInt("int_arg1", SysMediaPlayer.this.mVideoWidth);
            a.putInt("int_arg2", SysMediaPlayer.this.mVideoHeight);
            SysMediaPlayer.this.submitPlayerEvent(-99017, a);
        }
    }

    /* renamed from: com.kk.taurus.playerbase.player.SysMediaPlayer$c */
    class C6704c implements MediaPlayer.OnCompletionListener {
        C6704c() {
        }

        public void onCompletion(MediaPlayer mediaPlayer) {
            SysMediaPlayer.this.updateStatus(6);
            int unused = SysMediaPlayer.this.mTargetState = 6;
            SysMediaPlayer.this.submitPlayerEvent(-99016, (Bundle) null);
            if (!SysMediaPlayer.this.isLooping()) {
                SysMediaPlayer.this.stop();
            }
        }
    }

    /* renamed from: com.kk.taurus.playerbase.player.SysMediaPlayer$d */
    class C6705d implements MediaPlayer.OnInfoListener {
        C6705d() {
        }

        public boolean onInfo(MediaPlayer mediaPlayer, int i, int i2) {
            if (i == 3) {
                C6640b.m38216a("SysMediaPlayer", "MEDIA_INFO_VIDEO_RENDERING_START");
                int unused = SysMediaPlayer.this.startSeekPos = 0;
                SysMediaPlayer.this.submitPlayerEvent(-99015, (Bundle) null);
                return true;
            } else if (i == 901) {
                C6640b.m38216a("SysMediaPlayer", "MEDIA_INFO_UNSUPPORTED_SUBTITLE:");
                SysMediaPlayer.this.submitPlayerEvent(-99029, (Bundle) null);
                return true;
            } else if (i != 902) {
                switch (i) {
                    case 700:
                        C6640b.m38216a("SysMediaPlayer", "MEDIA_INFO_VIDEO_TRACK_LAGGING:");
                        return true;
                    case 701:
                        C6640b.m38216a("SysMediaPlayer", "MEDIA_INFO_BUFFERING_START:" + i2);
                        Bundle a = C6621a.m38175a();
                        a.putLong("long_data", SysMediaPlayer.this.mBandWidth);
                        SysMediaPlayer.this.submitPlayerEvent(-99010, a);
                        return true;
                    case 702:
                        C6640b.m38216a("SysMediaPlayer", "MEDIA_INFO_BUFFERING_END:" + i2);
                        Bundle a2 = C6621a.m38175a();
                        a2.putLong("long_data", SysMediaPlayer.this.mBandWidth);
                        SysMediaPlayer.this.submitPlayerEvent(-99011, a2);
                        return true;
                    case 703:
                        C6640b.m38216a("SysMediaPlayer", "band_width : " + i2);
                        long unused2 = SysMediaPlayer.this.mBandWidth = (long) (i2 * 1000);
                        return true;
                    default:
                        switch (i) {
                            case 800:
                                C6640b.m38216a("SysMediaPlayer", "MEDIA_INFO_BAD_INTERLEAVING:");
                                SysMediaPlayer.this.submitPlayerEvent(-99025, (Bundle) null);
                                return true;
                            case 801:
                                C6640b.m38216a("SysMediaPlayer", "MEDIA_INFO_NOT_SEEKABLE:");
                                SysMediaPlayer.this.submitPlayerEvent(-99026, (Bundle) null);
                                return true;
                            case 802:
                                C6640b.m38216a("SysMediaPlayer", "MEDIA_INFO_METADATA_UPDATE:");
                                SysMediaPlayer.this.submitPlayerEvent(-99027, (Bundle) null);
                                return true;
                            default:
                                return true;
                        }
                }
            } else {
                C6640b.m38216a("SysMediaPlayer", "MEDIA_INFO_SUBTITLE_TIMED_OUT:");
                SysMediaPlayer.this.submitPlayerEvent(-99030, (Bundle) null);
                return true;
            }
        }
    }

    /* renamed from: com.kk.taurus.playerbase.player.SysMediaPlayer$e */
    class C6706e implements MediaPlayer.OnSeekCompleteListener {
        C6706e() {
        }

        public void onSeekComplete(MediaPlayer mediaPlayer) {
            C6640b.m38216a("SysMediaPlayer", "EVENT_CODE_SEEK_COMPLETE");
            SysMediaPlayer.this.submitPlayerEvent(-99014, (Bundle) null);
        }
    }

    /* renamed from: com.kk.taurus.playerbase.player.SysMediaPlayer$f */
    class C6707f implements MediaPlayer.OnErrorListener {
        C6707f() {
        }

        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            C6640b.m38216a("SysMediaPlayer", "Error: " + i + "," + i2);
            SysMediaPlayer.this.updateStatus(-1);
            int unused = SysMediaPlayer.this.mTargetState = -1;
            SysMediaPlayer.this.submitErrorEvent(i != -1010 ? i != -1007 ? i != -1004 ? i != -110 ? i != 1 ? i != 100 ? i != 200 ? -88011 : -88014 : -88013 : -88012 : -88018 : -88015 : -88016 : -88017, C6621a.m38175a());
            return true;
        }
    }

    /* renamed from: com.kk.taurus.playerbase.player.SysMediaPlayer$g */
    class C6708g implements MediaPlayer.OnBufferingUpdateListener {
        C6708g() {
        }

        public void onBufferingUpdate(MediaPlayer mediaPlayer, int i) {
            SysMediaPlayer.this.submitBufferingUpdate(i, (Bundle) null);
        }
    }

    public SysMediaPlayer() {
        init();
    }

    /* access modifiers changed from: private */
    public void attachTimedTextSource() {
        C6620c timedTextSource = this.mDataSource.getTimedTextSource();
        if (timedTextSource != null) {
            try {
                if (Build.VERSION.SDK_INT >= 16) {
                    this.mMediaPlayer.addTimedTextSource(timedTextSource.getPath(), timedTextSource.getMimeType());
                    MediaPlayer.TrackInfo[] trackInfo = this.mMediaPlayer.getTrackInfo();
                    if (trackInfo != null && trackInfo.length > 0) {
                        for (int i = 0; i < trackInfo.length; i++) {
                            if (trackInfo[i].getTrackType() == 3) {
                                this.mMediaPlayer.selectTrack(i);
                                return;
                            }
                        }
                        return;
                    }
                    return;
                }
                C6640b.m38217b("SysMediaPlayer", "not support setting timed text source !");
            } catch (Exception e) {
                C6640b.m38217b("SysMediaPlayer", "addTimedTextSource error !");
                e.printStackTrace();
            }
        }
    }

    private boolean available() {
        return this.mMediaPlayer != null;
    }

    private void handleException(Exception exc) {
        if (exc != null) {
            exc.printStackTrace();
        }
        reset();
    }

    private void init() {
        this.mMediaPlayer = new MediaPlayer();
    }

    private void resetListener() {
        MediaPlayer mediaPlayer = this.mMediaPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.setOnPreparedListener((MediaPlayer.OnPreparedListener) null);
            this.mMediaPlayer.setOnVideoSizeChangedListener((MediaPlayer.OnVideoSizeChangedListener) null);
            this.mMediaPlayer.setOnCompletionListener((MediaPlayer.OnCompletionListener) null);
            this.mMediaPlayer.setOnErrorListener((MediaPlayer.OnErrorListener) null);
            this.mMediaPlayer.setOnInfoListener((MediaPlayer.OnInfoListener) null);
            this.mMediaPlayer.setOnBufferingUpdateListener((MediaPlayer.OnBufferingUpdateListener) null);
        }
    }

    public void destroy() {
        if (available()) {
            updateStatus(-2);
            resetListener();
            this.mMediaPlayer.release();
            submitPlayerEvent(-99009, (Bundle) null);
        }
    }

    public int getAudioSessionId() {
        if (available()) {
            return this.mMediaPlayer.getAudioSessionId();
        }
        return 0;
    }

    public int getCurrentPosition() {
        if (!available()) {
            return 0;
        }
        if (getState() == 2 || getState() == 3 || getState() == 4 || getState() == 6) {
            return this.mMediaPlayer.getCurrentPosition();
        }
        return 0;
    }

    public int getDuration() {
        if (!available() || getState() == -1 || getState() == 1 || getState() == 0) {
            return 0;
        }
        return this.mMediaPlayer.getDuration();
    }

    public int getVideoHeight() {
        if (available()) {
            return this.mMediaPlayer.getVideoHeight();
        }
        return 0;
    }

    public int getVideoWidth() {
        if (available()) {
            return this.mMediaPlayer.getVideoWidth();
        }
        return 0;
    }

    public boolean isPlaying() {
        if (!available() || getState() == -1) {
            return false;
        }
        return this.mMediaPlayer.isPlaying();
    }

    public void pause() {
        try {
            int state = getState();
            if (!(!available() || state == -2 || state == -1 || state == 0 || state == 1 || state == 4 || state == 5)) {
                this.mMediaPlayer.pause();
                updateStatus(4);
                submitPlayerEvent(-99005, (Bundle) null);
            }
        } catch (Exception e) {
            handleException(e);
        }
        this.mTargetState = 4;
    }

    public void reset() {
        if (available()) {
            this.mMediaPlayer.reset();
            updateStatus(0);
            submitPlayerEvent(-99008, (Bundle) null);
        }
        this.mTargetState = 0;
    }

    public void resume() {
        try {
            if (available() && getState() == 4) {
                this.mMediaPlayer.start();
                updateStatus(3);
                submitPlayerEvent(-99006, (Bundle) null);
            }
        } catch (Exception e) {
            handleException(e);
        }
        this.mTargetState = 3;
    }

    public void seekTo(int i) {
        if (!available()) {
            return;
        }
        if (getState() == 2 || getState() == 3 || getState() == 4 || getState() == 6) {
            this.mMediaPlayer.seekTo(i);
            Bundle a = C6621a.m38175a();
            a.putInt("int_data", i);
            submitPlayerEvent(-99013, a);
        }
    }

    public void setDataSource(C6618a aVar) {
        try {
            if (this.mMediaPlayer == null) {
                this.mMediaPlayer = new MediaPlayer();
            } else {
                stop();
                reset();
                resetListener();
            }
            this.mTargetState = Integer.MAX_VALUE;
            this.mMediaPlayer.setOnPreparedListener(this.mPreparedListener);
            this.mMediaPlayer.setOnVideoSizeChangedListener(this.mSizeChangedListener);
            this.mMediaPlayer.setOnCompletionListener(this.mCompletionListener);
            this.mMediaPlayer.setOnErrorListener(this.mErrorListener);
            this.mMediaPlayer.setOnInfoListener(this.mInfoListener);
            this.mMediaPlayer.setOnSeekCompleteListener(this.mOnSeekCompleteListener);
            this.mMediaPlayer.setOnBufferingUpdateListener(this.mBufferingUpdateListener);
            updateStatus(1);
            this.mDataSource = aVar;
            Context b = C6614a.m38157b();
            String data = aVar.getData();
            Uri uri = aVar.getUri();
            String assetsPath = aVar.getAssetsPath();
            HashMap<String, String> extra = aVar.getExtra();
            int rawId = aVar.getRawId();
            if (data != null) {
                this.mMediaPlayer.setDataSource(data);
            } else if (uri != null) {
                if (extra == null) {
                    this.mMediaPlayer.setDataSource(b, uri);
                } else {
                    this.mMediaPlayer.setDataSource(b, uri, extra);
                }
            } else if (!TextUtils.isEmpty(assetsPath)) {
                AssetFileDescriptor assetsFileDescriptor = C6618a.getAssetsFileDescriptor(b, aVar.getAssetsPath());
                if (assetsFileDescriptor != null) {
                    if (Build.VERSION.SDK_INT >= 24) {
                        this.mMediaPlayer.setDataSource(assetsFileDescriptor);
                    } else {
                        this.mMediaPlayer.setDataSource(assetsFileDescriptor.getFileDescriptor(), assetsFileDescriptor.getStartOffset(), assetsFileDescriptor.getLength());
                    }
                }
            } else if (rawId > 0) {
                this.mMediaPlayer.setDataSource(b, C6618a.buildRawPath(b.getPackageName(), rawId));
            }
            this.mMediaPlayer.setAudioStreamType(3);
            this.mMediaPlayer.setScreenOnWhilePlaying(true);
            this.mMediaPlayer.prepareAsync();
            this.mMediaPlayer.setLooping(isLooping());
            Bundle a = C6621a.m38175a();
            a.putSerializable("serializable_data", aVar);
            submitPlayerEvent(-99001, a);
        } catch (Exception e) {
            e.printStackTrace();
            updateStatus(-1);
            this.mTargetState = -1;
        }
    }

    public void setDisplay(SurfaceHolder surfaceHolder) {
        try {
            if (available()) {
                this.mMediaPlayer.setDisplay(surfaceHolder);
                submitPlayerEvent(-99002, (Bundle) null);
            }
        } catch (Exception e) {
            handleException(e);
        }
    }

    public void setLooping(boolean z) {
        super.setLooping(z);
        this.mMediaPlayer.setLooping(z);
    }

    public void setSpeed(float f) {
        try {
            if (!available() || Build.VERSION.SDK_INT < 23) {
                C6640b.m38217b("SysMediaPlayer", "not support play speed setting.");
                return;
            }
            PlaybackParams playbackParams = this.mMediaPlayer.getPlaybackParams();
            playbackParams.setSpeed(f);
            this.mMediaPlayer.setPlaybackParams(playbackParams);
            if (f <= 0.0f) {
                pause();
            } else if (f > 0.0f && getState() == 4) {
                resume();
            }
        } catch (Exception unused) {
            C6640b.m38217b("SysMediaPlayer", "IllegalStateException， if the internal player engine has not been initialized or has been released.");
        }
    }

    public void setSurface(Surface surface) {
        try {
            if (available()) {
                this.mMediaPlayer.setSurface(surface);
                submitPlayerEvent(-99003, (Bundle) null);
            }
        } catch (Exception e) {
            handleException(e);
        }
    }

    public void setVolume(float f, float f2) {
        if (available()) {
            this.mMediaPlayer.setVolume(f, f2);
        }
    }

    public void start() {
        try {
            if (available() && (getState() == 2 || getState() == 4 || getState() == 6)) {
                this.mMediaPlayer.start();
                updateStatus(3);
                submitPlayerEvent(-99004, (Bundle) null);
            }
        } catch (Exception e) {
            handleException(e);
        }
        this.mTargetState = 3;
    }

    public void stop() {
        try {
            if (available() && (getState() == 2 || getState() == 3 || getState() == 4 || getState() == 6)) {
                this.mMediaPlayer.stop();
                updateStatus(5);
                submitPlayerEvent(-99007, (Bundle) null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.mTargetState = 5;
    }

    public void start(int i) {
        if (getState() == 2 && i > 0) {
            start();
            this.mMediaPlayer.seekTo(i);
        } else if (available()) {
            if (i > 0) {
                this.startSeekPos = i;
            }
            start();
        }
    }
}
