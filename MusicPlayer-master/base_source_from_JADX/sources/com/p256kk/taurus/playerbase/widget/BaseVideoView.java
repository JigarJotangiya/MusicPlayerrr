package com.p256kk.taurus.playerbase.widget;

import android.content.Context;
import android.graphics.Rect;
import android.media.AudioManager;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p256kk.taurus.playerbase.AVPlayer;
import com.p256kk.taurus.playerbase.extension.NetworkEventProducer;
import com.p256kk.taurus.playerbase.p257a.C6606e;
import com.p256kk.taurus.playerbase.p258b.C6615b;
import com.p256kk.taurus.playerbase.p259c.C6618a;
import com.p256kk.taurus.playerbase.p260d.C6637d;
import com.p256kk.taurus.playerbase.p260d.C6638e;
import com.p256kk.taurus.playerbase.p261e.C6640b;
import com.p256kk.taurus.playerbase.p262f.C6657a;
import com.p256kk.taurus.playerbase.p263g.C6668j;
import com.p256kk.taurus.playerbase.p263g.C6673k;
import com.p256kk.taurus.playerbase.p263g.C6674l;
import com.p256kk.taurus.playerbase.p263g.C6676n;
import com.p256kk.taurus.playerbase.p265i.C6689a;
import com.p256kk.taurus.playerbase.p265i.C6690b;
import com.p256kk.taurus.playerbase.render.C6722a;
import com.p256kk.taurus.playerbase.render.C6723b;
import com.p256kk.taurus.playerbase.render.RenderSurfaceView;
import com.p256kk.taurus.playerbase.render.RenderTextureView;

/* renamed from: com.kk.taurus.playerbase.widget.BaseVideoView */
public class BaseVideoView extends FrameLayout implements C6689a {
    final String TAG;
    /* access modifiers changed from: private */
    public boolean isBuffering;
    private C6722a mAspectRatio;
    /* access modifiers changed from: private */
    public C6606e mEventAssistHandler;
    private C6637d mInternalErrorEventListener;
    private C6638e mInternalPlayerEventListener;
    /* access modifiers changed from: private */
    public C6674l mInternalPlayerStateGetter;
    private C6673k mInternalReceiverEventListener;
    private C6676n mInternalStateGetter;
    /* access modifiers changed from: private */
    public C6637d mOnErrorEventListener;
    /* access modifiers changed from: private */
    public C6638e mOnPlayerEventListener;
    /* access modifiers changed from: private */
    public C6673k mOnReceiverEventListener;
    /* access modifiers changed from: private */
    public AVPlayer mPlayer;
    /* access modifiers changed from: private */
    public C6723b mRender;
    private C6723b.C6724a mRenderCallback;
    /* access modifiers changed from: private */
    public C6723b.C6725b mRenderHolder;
    private int mRenderType;
    private C6689a mStyleSetter;
    /* access modifiers changed from: private */
    public C6734a mSuperContainer;
    /* access modifiers changed from: private */
    public int mVideoHeight;
    /* access modifiers changed from: private */
    public int mVideoRotation;
    /* access modifiers changed from: private */
    public int mVideoSarDen;
    /* access modifiers changed from: private */
    public int mVideoSarNum;
    /* access modifiers changed from: private */
    public int mVideoWidth;

    /* renamed from: com.kk.taurus.playerbase.widget.BaseVideoView$a */
    class C6728a implements C6673k {
        C6728a() {
        }

        /* renamed from: d */
        public void mo10237d(int i, Bundle bundle) {
            if (i == -66015) {
                BaseVideoView.this.mPlayer.setUseTimerProxy(true);
            } else if (i == -66016) {
                BaseVideoView.this.mPlayer.setUseTimerProxy(false);
            }
            if (BaseVideoView.this.mEventAssistHandler != null) {
                BaseVideoView.this.mEventAssistHandler.mo25843i(BaseVideoView.this, i, bundle);
            }
            if (BaseVideoView.this.mOnReceiverEventListener != null) {
                BaseVideoView.this.mOnReceiverEventListener.mo10237d(i, bundle);
            }
        }
    }

    /* renamed from: com.kk.taurus.playerbase.widget.BaseVideoView$b */
    class C6729b implements C6676n {
        C6729b() {
        }

        /* renamed from: r */
        public C6674l mo25879r() {
            return BaseVideoView.this.mInternalPlayerStateGetter;
        }
    }

    /* renamed from: com.kk.taurus.playerbase.widget.BaseVideoView$c */
    class C6730c implements C6674l {
        C6730c() {
        }

        /* renamed from: a */
        public int mo25880a() {
            return BaseVideoView.this.mPlayer.getCurrentPosition();
        }

        /* renamed from: b */
        public int mo25881b() {
            return BaseVideoView.this.mPlayer.getDuration();
        }

        /* renamed from: c */
        public boolean mo25882c() {
            return BaseVideoView.this.isBuffering;
        }

        public int getState() {
            return BaseVideoView.this.mPlayer.getState();
        }
    }

    /* renamed from: com.kk.taurus.playerbase.widget.BaseVideoView$d */
    class C6731d implements C6638e {
        C6731d() {
        }

        /* renamed from: b */
        public void mo10238b(int i, Bundle bundle) {
            switch (i) {
                case -99018:
                    if (!(bundle == null || BaseVideoView.this.mRender == null)) {
                        int unused = BaseVideoView.this.mVideoWidth = bundle.getInt("int_arg1");
                        int unused2 = BaseVideoView.this.mVideoHeight = bundle.getInt("int_arg2");
                        BaseVideoView.this.mRender.mo26121d(BaseVideoView.this.mVideoWidth, BaseVideoView.this.mVideoHeight);
                    }
                    BaseVideoView baseVideoView = BaseVideoView.this;
                    baseVideoView.bindRenderHolder(baseVideoView.mRenderHolder);
                    break;
                case -99017:
                    if (bundle != null) {
                        int unused3 = BaseVideoView.this.mVideoWidth = bundle.getInt("int_arg1");
                        int unused4 = BaseVideoView.this.mVideoHeight = bundle.getInt("int_arg2");
                        int unused5 = BaseVideoView.this.mVideoSarNum = bundle.getInt("int_arg3");
                        int unused6 = BaseVideoView.this.mVideoSarDen = bundle.getInt("int_arg4");
                        C6640b.m38216a("BaseVideoView", "onVideoSizeChange : videoWidth = " + BaseVideoView.this.mVideoWidth + ", videoHeight = " + BaseVideoView.this.mVideoHeight + ", videoSarNum = " + BaseVideoView.this.mVideoSarNum + ", videoSarDen = " + BaseVideoView.this.mVideoSarDen);
                        if (BaseVideoView.this.mRender != null) {
                            BaseVideoView.this.mRender.mo26121d(BaseVideoView.this.mVideoWidth, BaseVideoView.this.mVideoHeight);
                            BaseVideoView.this.mRender.mo26119b(BaseVideoView.this.mVideoSarNum, BaseVideoView.this.mVideoSarDen);
                            break;
                        }
                    }
                    break;
                case -99011:
                    boolean unused7 = BaseVideoView.this.isBuffering = false;
                    break;
                case -99010:
                    boolean unused8 = BaseVideoView.this.isBuffering = true;
                    break;
                case 99020:
                    if (bundle != null) {
                        int unused9 = BaseVideoView.this.mVideoRotation = bundle.getInt("int_data");
                        C6640b.m38216a("BaseVideoView", "onVideoRotationChange : videoRotation = " + BaseVideoView.this.mVideoRotation);
                        if (BaseVideoView.this.mRender != null) {
                            BaseVideoView.this.mRender.setVideoRotation(BaseVideoView.this.mVideoRotation);
                            break;
                        }
                    }
                    break;
            }
            if (BaseVideoView.this.mOnPlayerEventListener != null) {
                BaseVideoView.this.mOnPlayerEventListener.mo10238b(i, bundle);
            }
            BaseVideoView.this.mSuperContainer.mo26192k(i, bundle);
        }
    }

    /* renamed from: com.kk.taurus.playerbase.widget.BaseVideoView$e */
    class C6732e implements C6637d {
        C6732e() {
        }

        /* renamed from: a */
        public void mo25832a(int i, Bundle bundle) {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("onError : code = ");
            sb.append(i);
            sb.append(", Message = ");
            if (bundle == null) {
                str = "no message";
            } else {
                str = bundle.toString();
            }
            sb.append(str);
            C6640b.m38217b("BaseVideoView", sb.toString());
            if (BaseVideoView.this.mOnErrorEventListener != null) {
                BaseVideoView.this.mOnErrorEventListener.mo25832a(i, bundle);
            }
            BaseVideoView.this.mSuperContainer.mo26191j(i, bundle);
        }
    }

    /* renamed from: com.kk.taurus.playerbase.widget.BaseVideoView$f */
    class C6733f implements C6723b.C6724a {
        C6733f() {
        }

        /* renamed from: a */
        public void mo25884a(C6723b.C6725b bVar) {
            C6640b.m38216a("BaseVideoView", "onSurfaceDestroy...");
            C6723b.C6725b unused = BaseVideoView.this.mRenderHolder = null;
        }

        /* renamed from: b */
        public void mo25885b(C6723b.C6725b bVar, int i, int i2, int i3) {
        }

        /* renamed from: c */
        public void mo25886c(C6723b.C6725b bVar, int i, int i2) {
            C6640b.m38216a("BaseVideoView", "onSurfaceCreated : width = " + i + ", height = " + i2);
            C6723b.C6725b unused = BaseVideoView.this.mRenderHolder = bVar;
            BaseVideoView baseVideoView = BaseVideoView.this;
            baseVideoView.bindRenderHolder(baseVideoView.mRenderHolder);
        }
    }

    public BaseVideoView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* access modifiers changed from: private */
    public void bindRenderHolder(C6723b.C6725b bVar) {
        if (bVar != null) {
            bVar.mo26130a(this.mPlayer);
        }
    }

    private AVPlayer createPlayer() {
        return new AVPlayer();
    }

    private void init(Context context, AttributeSet attributeSet, int i) {
        AVPlayer createPlayer = createPlayer();
        this.mPlayer = createPlayer;
        createPlayer.setOnPlayerEventListener(this.mInternalPlayerEventListener);
        this.mPlayer.setOnErrorEventListener(this.mInternalErrorEventListener);
        this.mStyleSetter = new C6690b(this);
        C6734a onCreateSuperContainer = onCreateSuperContainer(context);
        this.mSuperContainer = onCreateSuperContainer;
        onCreateSuperContainer.setStateGetter(this.mInternalStateGetter);
        this.mSuperContainer.setOnReceiverEventListener(this.mInternalReceiverEventListener);
        addView(this.mSuperContainer, new ViewGroup.LayoutParams(-1, -1));
    }

    private void releaseAudioFocus() {
        C6640b.m38216a("BaseVideoView", "<<releaseAudioFocus>>");
        AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.abandonAudioFocus((AudioManager.OnAudioFocusChangeListener) null);
        }
    }

    private void releaseRender() {
        C6723b bVar = this.mRender;
        if (bVar != null) {
            bVar.mo26118a();
            this.mRender = null;
        }
    }

    private void requestAudioFocus() {
        C6640b.m38216a("BaseVideoView", ">>requestAudioFocus<<");
        AudioManager audioManager = (AudioManager) getContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.requestAudioFocus((AudioManager.OnAudioFocusChangeListener) null, 3, 1);
        }
    }

    public void clearShapeStyle() {
        this.mStyleSetter.clearShapeStyle();
    }

    public int getAudioSessionId() {
        return this.mPlayer.getAudioSessionId();
    }

    public int getBufferPercentage() {
        return this.mPlayer.getBufferPercentage();
    }

    public int getCurrentPosition() {
        return this.mPlayer.getCurrentPosition();
    }

    public int getDuration() {
        return this.mPlayer.getDuration();
    }

    public C6723b getRender() {
        return this.mRender;
    }

    public int getState() {
        return this.mPlayer.getState();
    }

    public final C6734a getSuperContainer() {
        return this.mSuperContainer;
    }

    public boolean isInPlaybackState() {
        int state = getState();
        return (state == -2 || state == -1 || state == 0 || state == 1 || state == 5) ? false : true;
    }

    public boolean isPlaying() {
        return this.mPlayer.isPlaying();
    }

    /* access modifiers changed from: protected */
    public C6734a onCreateSuperContainer(Context context) {
        C6734a aVar = new C6734a(context);
        if (C6615b.m38164g()) {
            aVar.mo26188f(new NetworkEventProducer(context));
        }
        return aVar;
    }

    public void option(int i, Bundle bundle) {
        this.mPlayer.option(i, bundle);
    }

    public void pause() {
        this.mPlayer.pause();
    }

    public void rePlay(int i) {
        this.mPlayer.rePlay(i);
    }

    public void resume() {
        this.mPlayer.resume();
    }

    public void seekTo(int i) {
        this.mPlayer.seekTo(i);
    }

    public void setAspectRatio(C6722a aVar) {
        this.mAspectRatio = aVar;
        C6723b bVar = this.mRender;
        if (bVar != null) {
            bVar.mo26120c(aVar);
        }
    }

    public void setDataProvider(C6657a aVar) {
        this.mPlayer.setDataProvider(aVar);
    }

    public void setDataSource(C6618a aVar) {
        requestAudioFocus();
        releaseRender();
        setRenderType(this.mRenderType);
        this.mPlayer.setDataSource(aVar);
    }

    public void setElevationShadow(float f) {
        this.mStyleSetter.setElevationShadow(f);
    }

    public void setEventHandler(C6606e eVar) {
    }

    public void setLooping(boolean z) {
        this.mPlayer.setLooping(z);
    }

    public void setOnErrorEventListener(C6637d dVar) {
        this.mOnErrorEventListener = dVar;
    }

    public void setOnPlayerEventListener(C6638e eVar) {
        this.mOnPlayerEventListener = eVar;
    }

    public void setOnProviderListener(C6657a.C6658a aVar) {
        this.mPlayer.setOnProviderListener(aVar);
    }

    public void setOnReceiverEventListener(C6673k kVar) {
        this.mOnReceiverEventListener = kVar;
    }

    public void setOvalRectShape() {
        this.mStyleSetter.setOvalRectShape();
    }

    public void setReceiverGroup(C6668j jVar) {
        this.mSuperContainer.setReceiverGroup(jVar);
    }

    public void setRenderType(int i) {
        C6723b bVar;
        if ((this.mRenderType != i) || (bVar = this.mRender) == null || bVar.mo26122e()) {
            releaseRender();
            if (i != 1) {
                this.mRenderType = 0;
                RenderTextureView renderTextureView = new RenderTextureView(getContext());
                this.mRender = renderTextureView;
                renderTextureView.setTakeOverSurfaceTexture(true);
            } else {
                this.mRenderType = 1;
                this.mRender = new RenderSurfaceView(getContext());
            }
            this.mRenderHolder = null;
            this.mPlayer.setSurface((Surface) null);
            this.mRender.mo26120c(this.mAspectRatio);
            this.mRender.setRenderCallback(this.mRenderCallback);
            this.mRender.mo26121d(this.mVideoWidth, this.mVideoHeight);
            this.mRender.mo26119b(this.mVideoSarNum, this.mVideoSarDen);
            this.mRender.setVideoRotation(this.mVideoRotation);
            this.mSuperContainer.setRenderView(this.mRender.getRenderView());
        }
    }

    public void setRoundRectShape(float f) {
        this.mStyleSetter.setRoundRectShape(f);
    }

    public void setSpeed(float f) {
        this.mPlayer.setSpeed(f);
    }

    public void setVolume(float f, float f2) {
        this.mPlayer.setVolume(f, f2);
    }

    public void start() {
        this.mPlayer.start();
    }

    public void stop() {
        this.mPlayer.stop();
    }

    public void stopPlayback() {
        C6640b.m38217b("BaseVideoView", "stopPlayback release.");
        releaseAudioFocus();
        this.mPlayer.destroy();
        this.mRenderHolder = null;
        releaseRender();
        this.mSuperContainer.mo26190h();
    }

    public final boolean switchDecoder(int i) {
        boolean switchDecoder = this.mPlayer.switchDecoder(i);
        if (switchDecoder) {
            releaseRender();
        }
        return switchDecoder;
    }

    public void updateRender() {
        releaseRender();
        setRenderType(this.mRenderType);
    }

    public BaseVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public void setElevationShadow(int i, float f) {
        this.mStyleSetter.setElevationShadow(i, f);
    }

    public void setOvalRectShape(Rect rect) {
        this.mStyleSetter.setOvalRectShape(rect);
    }

    public void setRoundRectShape(Rect rect, float f) {
        this.mStyleSetter.setRoundRectShape(rect, f);
    }

    public void start(int i) {
        this.mPlayer.start(i);
    }

    public BaseVideoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.TAG = "BaseVideoView";
        this.mRenderType = 0;
        this.mAspectRatio = C6722a.AspectRatio_FIT_PARENT;
        this.mInternalReceiverEventListener = new C6728a();
        this.mInternalStateGetter = new C6729b();
        this.mInternalPlayerStateGetter = new C6730c();
        this.mInternalPlayerEventListener = new C6731d();
        this.mInternalErrorEventListener = new C6732e();
        this.mRenderCallback = new C6733f();
        init(context, attributeSet, i);
    }
}
