package com.p256kk.taurus.playerbase.player;

import android.os.Bundle;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.p256kk.taurus.playerbase.p259c.C6618a;
import com.p256kk.taurus.playerbase.p260d.C6621a;
import com.p256kk.taurus.playerbase.p260d.C6637d;
import com.p256kk.taurus.playerbase.p260d.C6638e;

/* renamed from: com.kk.taurus.playerbase.player.BaseInternalPlayer */
public abstract class BaseInternalPlayer implements C6709a {
    private int mBufferPercentage;
    private int mCurrentState = 0;
    private boolean mLooping;
    private C6711c mOnBufferingListener;
    private C6637d mOnErrorEventListener;
    private C6638e mOnPlayerEventListener;

    public abstract /* synthetic */ void destroy();

    public abstract /* synthetic */ int getAudioSessionId();

    public int getBufferPercentage() {
        return this.mBufferPercentage;
    }

    public abstract /* synthetic */ int getCurrentPosition();

    public abstract /* synthetic */ int getDuration();

    public final int getState() {
        return this.mCurrentState;
    }

    public abstract /* synthetic */ int getVideoHeight();

    public abstract /* synthetic */ int getVideoWidth();

    public boolean isLooping() {
        return this.mLooping;
    }

    public abstract /* synthetic */ boolean isPlaying();

    public void option(int i, Bundle bundle) {
    }

    public abstract /* synthetic */ void pause();

    public abstract /* synthetic */ void reset();

    public abstract /* synthetic */ void resume();

    public abstract /* synthetic */ void seekTo(int i);

    public abstract /* synthetic */ void setDataSource(C6618a aVar);

    public abstract /* synthetic */ void setDisplay(SurfaceHolder surfaceHolder);

    public void setLooping(boolean z) {
        this.mLooping = z;
    }

    public final void setOnBufferingListener(C6711c cVar) {
        this.mOnBufferingListener = cVar;
    }

    public final void setOnErrorEventListener(C6637d dVar) {
        this.mOnErrorEventListener = dVar;
    }

    public final void setOnPlayerEventListener(C6638e eVar) {
        this.mOnPlayerEventListener = eVar;
    }

    public abstract /* synthetic */ void setSpeed(float f);

    public abstract /* synthetic */ void setSurface(Surface surface);

    public abstract /* synthetic */ void setVolume(float f, float f2);

    public abstract /* synthetic */ void start();

    public abstract /* synthetic */ void start(int i);

    public abstract /* synthetic */ void stop();

    /* access modifiers changed from: protected */
    public final void submitBufferingUpdate(int i, Bundle bundle) {
        this.mBufferPercentage = i;
        C6711c cVar = this.mOnBufferingListener;
        if (cVar != null) {
            cVar.mo25833a(i, bundle);
        }
    }

    /* access modifiers changed from: protected */
    public final void submitErrorEvent(int i, Bundle bundle) {
        C6637d dVar = this.mOnErrorEventListener;
        if (dVar != null) {
            dVar.mo25832a(i, bundle);
        }
    }

    /* access modifiers changed from: protected */
    public final void submitPlayerEvent(int i, Bundle bundle) {
        C6638e eVar = this.mOnPlayerEventListener;
        if (eVar != null) {
            eVar.mo10238b(i, bundle);
        }
    }

    /* access modifiers changed from: protected */
    public final void updateStatus(int i) {
        this.mCurrentState = i;
        Bundle a = C6621a.m38175a();
        a.putInt("int_data", i);
        submitPlayerEvent(-99031, a);
    }
}
