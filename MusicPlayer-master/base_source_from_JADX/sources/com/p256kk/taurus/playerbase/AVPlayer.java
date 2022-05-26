package com.p256kk.taurus.playerbase;

import android.os.Bundle;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.p256kk.taurus.playerbase.p258b.C6615b;
import com.p256kk.taurus.playerbase.p258b.C6617d;
import com.p256kk.taurus.playerbase.p259c.C6618a;
import com.p256kk.taurus.playerbase.p259c.C6619b;
import com.p256kk.taurus.playerbase.p260d.C6621a;
import com.p256kk.taurus.playerbase.p260d.C6637d;
import com.p256kk.taurus.playerbase.p260d.C6638e;
import com.p256kk.taurus.playerbase.p261e.C6639a;
import com.p256kk.taurus.playerbase.p261e.C6640b;
import com.p256kk.taurus.playerbase.p262f.C6657a;
import com.p256kk.taurus.playerbase.p264h.C6683e;
import com.p256kk.taurus.playerbase.p264h.C6688i;
import com.p256kk.taurus.playerbase.player.BaseInternalPlayer;
import com.p256kk.taurus.playerbase.player.C6709a;
import com.p256kk.taurus.playerbase.player.C6710b;
import com.p256kk.taurus.playerbase.player.C6711c;
import com.p256kk.taurus.playerbase.player.C6713e;

/* renamed from: com.kk.taurus.playerbase.AVPlayer */
public final class AVPlayer implements C6709a {
    private final String TAG;
    private C6657a mDataProvider;
    private C6618a mDataSource;
    private int mDecoderPlanId;
    private C6711c mInternalBufferingListener;
    private C6637d mInternalErrorEventListener;
    /* access modifiers changed from: private */
    public BaseInternalPlayer mInternalPlayer;
    private C6638e mInternalPlayerEventListener;
    private C6657a.C6658a mInternalProviderListener;
    /* access modifiers changed from: private */
    public C6711c mOnBufferingListener;
    private C6713e.C6715b mOnCounterUpdateListener;
    private C6637d mOnErrorEventListener;
    private C6638e mOnPlayerEventListener;
    /* access modifiers changed from: private */
    public C6657a.C6658a mOnProviderListener;
    /* access modifiers changed from: private */
    public C6710b mRecordProxyPlayer;
    /* access modifiers changed from: private */
    public C6713e mTimerCounterProxy;
    /* access modifiers changed from: private */
    public float mVolumeLeft;
    /* access modifiers changed from: private */
    public float mVolumeRight;

    /* renamed from: com.kk.taurus.playerbase.AVPlayer$a */
    class C6596a implements C6683e {
        C6596a() {
        }

        /* renamed from: a */
        public int mo25829a() {
            return AVPlayer.this.getCurrentPosition();
        }

        public int getState() {
            return AVPlayer.this.getState();
        }
    }

    /* renamed from: com.kk.taurus.playerbase.AVPlayer$b */
    class C6597b implements C6713e.C6715b {
        C6597b() {
        }

        /* renamed from: a */
        public void mo25831a() {
            int currentPosition = AVPlayer.this.getCurrentPosition();
            int duration = AVPlayer.this.getDuration();
            int bufferPercentage = AVPlayer.this.getBufferPercentage();
            if (duration > 0 || AVPlayer.this.isLive()) {
                AVPlayer.this.onTimerUpdateEvent(currentPosition, duration, bufferPercentage);
            }
        }
    }

    /* renamed from: com.kk.taurus.playerbase.AVPlayer$c */
    class C6598c implements C6638e {
        C6598c() {
        }

        /* renamed from: b */
        public void mo10238b(int i, Bundle bundle) {
            AVPlayer.this.mTimerCounterProxy.mo26112g(i, bundle);
            if (i == -99018) {
                if (AVPlayer.this.mVolumeLeft >= 0.0f || AVPlayer.this.mVolumeRight >= 0.0f) {
                    AVPlayer.this.mInternalPlayer.setVolume(AVPlayer.this.mVolumeLeft, AVPlayer.this.mVolumeRight);
                }
            } else if (i == -99016) {
                int duration = AVPlayer.this.getDuration();
                int bufferPercentage = AVPlayer.this.getBufferPercentage();
                if (duration > 0 || AVPlayer.this.isLive()) {
                    AVPlayer.this.onTimerUpdateEvent(duration, duration, bufferPercentage);
                } else {
                    return;
                }
            }
            if (AVPlayer.this.isPlayRecordOpen()) {
                AVPlayer.this.mRecordProxyPlayer.mo26039b(i, bundle);
            }
            AVPlayer.this.callBackPlayEventListener(i, bundle);
        }
    }

    /* renamed from: com.kk.taurus.playerbase.AVPlayer$d */
    class C6599d implements C6637d {
        C6599d() {
        }

        /* renamed from: a */
        public void mo25832a(int i, Bundle bundle) {
            AVPlayer.this.mTimerCounterProxy.mo26111f(i, bundle);
            if (AVPlayer.this.isPlayRecordOpen()) {
                AVPlayer.this.mRecordProxyPlayer.mo26038a(i, bundle);
            }
            AVPlayer.this.callBackErrorEventListener(i, bundle);
        }
    }

    /* renamed from: com.kk.taurus.playerbase.AVPlayer$e */
    class C6600e implements C6711c {
        C6600e() {
        }

        /* renamed from: a */
        public void mo25833a(int i, Bundle bundle) {
            if (AVPlayer.this.mOnBufferingListener != null) {
                AVPlayer.this.mOnBufferingListener.mo25833a(i, bundle);
            }
        }
    }

    /* renamed from: com.kk.taurus.playerbase.AVPlayer$f */
    class C6601f implements C6657a.C6658a {
        C6601f(AVPlayer aVPlayer) {
        }
    }

    public AVPlayer() {
        this(C6615b.m38159b());
    }

    /* access modifiers changed from: private */
    public void callBackErrorEventListener(int i, Bundle bundle) {
        C6639a.m38214a(i, bundle);
        C6637d dVar = this.mOnErrorEventListener;
        if (dVar != null) {
            dVar.mo25832a(i, bundle);
        }
    }

    /* access modifiers changed from: private */
    public void callBackPlayEventListener(int i, Bundle bundle) {
        C6639a.m38215b(i, bundle);
        C6638e eVar = this.mOnPlayerEventListener;
        if (eVar != null) {
            eVar.mo10238b(i, bundle);
        }
    }

    private void handleRecordProxy() {
        if (C6615b.m38163f()) {
            this.mRecordProxyPlayer = new C6688i(new C6596a());
        }
    }

    private void initListener() {
        this.mTimerCounterProxy.mo26114j(this.mOnCounterUpdateListener);
        BaseInternalPlayer baseInternalPlayer = this.mInternalPlayer;
        if (baseInternalPlayer != null) {
            baseInternalPlayer.setOnPlayerEventListener(this.mInternalPlayerEventListener);
            this.mInternalPlayer.setOnErrorEventListener(this.mInternalErrorEventListener);
            this.mInternalPlayer.setOnBufferingListener(this.mInternalBufferingListener);
        }
    }

    /* access modifiers changed from: private */
    public void interPlayerSetDataSource(C6618a aVar) {
        if (isPlayerAvailable()) {
            if (isPlayRecordOpen()) {
                this.mRecordProxyPlayer.mo26043f(aVar);
            }
            this.mInternalPlayer.setDataSource(aVar);
        }
    }

    /* access modifiers changed from: private */
    public void internalPlayerStart(int i) {
        if (isPlayerAvailable()) {
            this.mInternalPlayer.start(i);
        }
    }

    private boolean isPlayerAvailable() {
        return this.mInternalPlayer != null;
    }

    private void loadInternalPlayer(int i) {
        this.mDecoderPlanId = i;
        destroy();
        BaseInternalPlayer d = C6617d.m38171d(i);
        this.mInternalPlayer = d;
        if (d != null) {
            C6619b c = C6615b.m38160c(this.mDecoderPlanId);
            if (c != null) {
                C6640b.m38216a("AVPlayer", "=============================");
                C6640b.m38216a("AVPlayer", "DecoderPlanInfo : planId      = " + c.mo25914c());
                C6640b.m38216a("AVPlayer", "DecoderPlanInfo : classPath   = " + c.mo25912a());
                C6640b.m38216a("AVPlayer", "DecoderPlanInfo : desc        = " + c.mo25913b());
                C6640b.m38216a("AVPlayer", "=============================");
                return;
            }
            return;
        }
        throw new RuntimeException("init decoder instance failure, please check your configuration, maybe your config classpath not found.");
    }

    /* access modifiers changed from: private */
    public void onTimerUpdateEvent(int i, int i2, int i3) {
        Bundle a = C6621a.m38175a();
        a.putInt("int_arg1", i);
        a.putInt("int_arg2", i2);
        a.putInt("int_arg3", i3);
        callBackPlayEventListener(-99019, a);
    }

    private void resetListener() {
        this.mTimerCounterProxy.mo26114j((C6713e.C6715b) null);
        BaseInternalPlayer baseInternalPlayer = this.mInternalPlayer;
        if (baseInternalPlayer != null) {
            baseInternalPlayer.setOnPlayerEventListener((C6638e) null);
            this.mInternalPlayer.setOnErrorEventListener((C6637d) null);
            this.mInternalPlayer.setOnBufferingListener((C6711c) null);
        }
    }

    private boolean useProvider() {
        return this.mDataProvider != null;
    }

    public void destroy() {
        if (isPlayRecordOpen()) {
            this.mRecordProxyPlayer.mo26041d();
        }
        if (useProvider()) {
            this.mDataProvider.destroy();
        }
        if (isPlayerAvailable()) {
            this.mInternalPlayer.destroy();
        }
        C6713e eVar = this.mTimerCounterProxy;
        if (eVar != null) {
            eVar.mo26110d();
        }
        resetListener();
    }

    public int getAudioSessionId() {
        if (isPlayerAvailable()) {
            return this.mInternalPlayer.getAudioSessionId();
        }
        return 0;
    }

    public int getBufferPercentage() {
        if (isPlayerAvailable()) {
            return this.mInternalPlayer.getBufferPercentage();
        }
        return 0;
    }

    public int getCurrentPosition() {
        if (isPlayerAvailable()) {
            return this.mInternalPlayer.getCurrentPosition();
        }
        return 0;
    }

    public int getDuration() {
        if (isPlayerAvailable()) {
            return this.mInternalPlayer.getDuration();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public int getRecord(C6618a aVar) {
        if (isPlayRecordOpen() && aVar != null) {
            return this.mRecordProxyPlayer.mo26040c(aVar);
        }
        C6618a aVar2 = this.mDataSource;
        if (aVar2 != null) {
            return aVar2.getStartPos();
        }
        return 0;
    }

    public int getState() {
        if (isPlayerAvailable()) {
            return this.mInternalPlayer.getState();
        }
        return 0;
    }

    public int getVideoHeight() {
        if (isPlayerAvailable()) {
            return this.mInternalPlayer.getVideoHeight();
        }
        return 0;
    }

    public int getVideoWidth() {
        if (isPlayerAvailable()) {
            return this.mInternalPlayer.getVideoWidth();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    public boolean isLive() {
        C6618a aVar = this.mDataSource;
        return aVar != null && aVar.isLive();
    }

    /* access modifiers changed from: package-private */
    public boolean isPlayRecordOpen() {
        return C6615b.m38163f() && this.mRecordProxyPlayer != null;
    }

    public boolean isPlaying() {
        if (isPlayerAvailable()) {
            return this.mInternalPlayer.isPlaying();
        }
        return false;
    }

    public void option(int i, Bundle bundle) {
        this.mInternalPlayer.option(i, bundle);
    }

    public void pause() {
        if (isPlayerAvailable()) {
            this.mInternalPlayer.pause();
        }
    }

    public void rePlay(int i) {
        C6618a aVar;
        C6618a aVar2;
        if (!useProvider() && (aVar2 = this.mDataSource) != null) {
            interPlayerSetDataSource(aVar2);
            internalPlayerStart(i);
        } else if (useProvider() && (aVar = this.mDataSource) != null) {
            aVar.setStartPos(i);
            this.mDataProvider.mo25959b(this.mDataSource);
        }
    }

    public void reset() {
        if (isPlayRecordOpen()) {
            this.mRecordProxyPlayer.mo26042e();
        }
        if (useProvider()) {
            this.mDataProvider.cancel();
        }
        if (isPlayerAvailable()) {
            this.mInternalPlayer.reset();
        }
    }

    public void resume() {
        if (isPlayerAvailable()) {
            this.mInternalPlayer.resume();
        }
    }

    public void seekTo(int i) {
        if (isPlayerAvailable()) {
            this.mInternalPlayer.seekTo(i);
        }
    }

    public void setDataProvider(C6657a aVar) {
        C6657a aVar2 = this.mDataProvider;
        if (aVar2 != null) {
            aVar2.destroy();
        }
        this.mDataProvider = aVar;
        if (aVar != null) {
            aVar.mo25958a(this.mInternalProviderListener);
        }
    }

    public void setDataSource(C6618a aVar) {
        this.mTimerCounterProxy.mo26113i(C6615b.m38161d());
        this.mDataSource = aVar;
        initListener();
        if (!useProvider()) {
            interPlayerSetDataSource(aVar);
        }
    }

    public void setDisplay(SurfaceHolder surfaceHolder) {
        if (isPlayerAvailable()) {
            this.mInternalPlayer.setDisplay(surfaceHolder);
        }
    }

    public void setLooping(boolean z) {
        if (isPlayerAvailable()) {
            this.mInternalPlayer.setLooping(z);
        }
    }

    public void setOnBufferingListener(C6711c cVar) {
        this.mOnBufferingListener = cVar;
    }

    public void setOnErrorEventListener(C6637d dVar) {
        this.mOnErrorEventListener = dVar;
    }

    public void setOnPlayerEventListener(C6638e eVar) {
        this.mOnPlayerEventListener = eVar;
    }

    public void setOnProviderListener(C6657a.C6658a aVar) {
        this.mOnProviderListener = aVar;
    }

    public void setSpeed(float f) {
        if (isPlayerAvailable()) {
            this.mInternalPlayer.setSpeed(f);
        }
    }

    public void setSurface(Surface surface) {
        if (isPlayerAvailable()) {
            this.mInternalPlayer.setSurface(surface);
        }
    }

    public void setUseTimerProxy(boolean z) {
        this.mTimerCounterProxy.mo26115k(z);
    }

    public void setVolume(float f, float f2) {
        this.mVolumeLeft = f;
        this.mVolumeRight = f2;
        if (isPlayerAvailable()) {
            this.mInternalPlayer.setVolume(f, f2);
        }
    }

    public void start() {
        int record = getRecord(this.mDataSource);
        if (useProvider()) {
            this.mDataSource.setStartPos(record);
            this.mDataProvider.mo25959b(this.mDataSource);
            return;
        }
        internalPlayerStart(record);
    }

    public void stop() {
        if (isPlayRecordOpen()) {
            this.mRecordProxyPlayer.mo26044g();
        }
        if (useProvider()) {
            this.mDataProvider.cancel();
        }
        if (isPlayerAvailable()) {
            this.mInternalPlayer.stop();
        }
    }

    public boolean switchDecoder(int i) {
        if (this.mDecoderPlanId == i) {
            C6640b.m38217b(AVPlayer.class.getSimpleName(), "@@Your incoming planId is the same as the current use planId@@");
            return false;
        } else if (C6615b.m38162e(i)) {
            loadInternalPlayer(i);
            return true;
        } else {
            throw new IllegalArgumentException("Illegal plan id = " + i + ", please check your config!");
        }
    }

    public AVPlayer(int i) {
        this.TAG = "AVPlayer";
        this.mVolumeLeft = -1.0f;
        this.mVolumeRight = -1.0f;
        this.mOnCounterUpdateListener = new C6597b();
        this.mInternalPlayerEventListener = new C6598c();
        this.mInternalErrorEventListener = new C6599d();
        this.mInternalBufferingListener = new C6600e();
        this.mInternalProviderListener = new C6601f(this);
        handleRecordProxy();
        this.mTimerCounterProxy = new C6713e(C6615b.m38161d());
        loadInternalPlayer(i);
    }

    public void start(int i) {
        if (useProvider()) {
            this.mDataSource.setStartPos(i);
            this.mDataProvider.mo25959b(this.mDataSource);
            return;
        }
        internalPlayerStart(i);
    }
}
