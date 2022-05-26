package coocent.musiclibrary.music.p290h;

import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import java.io.IOException;
import p159f.p166c.p181e.p182a.p183a.p189f.C4430a;
import p159f.p166c.p181e.p182a.p190b.p197l.C4477c;
import p369i.p387z.p389d.C8594l;

/* renamed from: coocent.musiclibrary.music.h.a */
/* compiled from: CooPlayer.kt */
public final class C7367a implements MediaPlayer.OnPreparedListener, MediaPlayer.OnCompletionListener, MediaPlayer.OnErrorListener, MediaPlayer.OnSeekCompleteListener, C4430a.C4431a {

    /* renamed from: g */
    private Context f32437g;

    /* renamed from: h */
    private C7368b f32438h;

    /* renamed from: i */
    private boolean f32439i;

    /* renamed from: j */
    private MediaPlayer f32440j;

    /* renamed from: k */
    private int f32441k = -1;

    public C7367a(Context context, C7368b bVar) {
        C8594l.m46771e(context, "context");
        C8594l.m46771e(bVar, "listener");
        this.f32437g = context;
        this.f32438h = bVar;
        MediaPlayer mediaPlayer = new MediaPlayer();
        this.f32440j = mediaPlayer;
        mediaPlayer.setAudioStreamType(3);
        this.f32440j.setOnPreparedListener(this);
        this.f32440j.setOnCompletionListener(this);
        this.f32440j.setOnErrorListener(this);
        this.f32440j.setOnSeekCompleteListener(this);
        m41600n(0);
        C4477c.m19654x0(this);
    }

    /* renamed from: n */
    private final void m41600n(int i) {
        this.f32438h.mo27111h(i);
        this.f32441k = i;
    }

    /* renamed from: a */
    public void mo15009a() {
        mo28140p(1.0f);
        if (!mo28130i() && this.f32439i) {
            mo28133l(false);
            this.f32439i = false;
        }
    }

    /* renamed from: b */
    public void mo15010b() {
        if (mo28130i()) {
            this.f32439i = true;
            mo28132k();
        }
    }

    /* renamed from: c */
    public void mo15011c() {
        this.f32439i = mo28130i();
        mo28140p(0.2f);
    }

    /* renamed from: d */
    public void mo15012d() {
        if (mo28130i()) {
            mo28132k();
        } else {
            this.f32439i = false;
        }
    }

    /* renamed from: e */
    public final int mo28126e() {
        return this.f32440j.getAudioSessionId();
    }

    /* renamed from: f */
    public final double mo28127f() {
        return ((double) this.f32440j.getCurrentPosition()) / ((double) 1000);
    }

    /* renamed from: g */
    public final MediaPlayer mo28128g() {
        return this.f32440j;
    }

    /* renamed from: h */
    public final boolean mo28129h() {
        return this.f32441k == 3;
    }

    /* renamed from: i */
    public final boolean mo28130i() {
        return this.f32440j.isPlaying();
    }

    /* renamed from: j */
    public final boolean mo28131j() {
        return this.f32441k == 4;
    }

    /* renamed from: k */
    public final void mo28132k() {
        this.f32440j.pause();
        m41600n(3);
    }

    /* renamed from: l */
    public final void mo28133l(boolean z) {
        C4477c.m19628k0(this.f32437g);
        this.f32440j.start();
        m41600n(z ? 7 : 2);
    }

    /* renamed from: m */
    public final void mo28134m(long j) {
        this.f32440j.seekTo(((int) j) * 1000);
    }

    /* renamed from: o */
    public final void mo28135o(Uri uri) {
        C8594l.m46771e(uri, "uri");
        this.f32440j.reset();
        try {
            String uri2 = uri.toString();
            C8594l.m46770d(uri2, "uri.toString()");
            if (C8436o.m46525s(uri2, "content://", false, 2, (Object) null)) {
                this.f32440j.setDataSource(this.f32437g, uri);
            } else {
                this.f32440j.setDataSource(uri.toString());
            }
            this.f32440j.prepare();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onCompletion(MediaPlayer mediaPlayer) {
        C8594l.m46771e(mediaPlayer, "mediaPlayer");
        m41600n(5);
        this.f32438h.mo27120q();
    }

    public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
        C8594l.m46771e(mediaPlayer, "mediaPlayer");
        m41600n(6);
        this.f32438h.mo27114k();
        return true;
    }

    public void onPrepared(MediaPlayer mediaPlayer) {
        C8594l.m46771e(mediaPlayer, "mediaPlayer");
        m41600n(mediaPlayer.isPlaying() ? 2 : 1);
        this.f32438h.mo27123u();
    }

    public void onSeekComplete(MediaPlayer mediaPlayer) {
        C8594l.m46771e(mediaPlayer, "mediaPlayer");
    }

    /* renamed from: p */
    public final void mo28140p(float f) {
        this.f32440j.setVolume(f, f);
    }

    /* renamed from: q */
    public final void mo28141q() {
        this.f32440j.stop();
        this.f32440j.reset();
        m41600n(4);
    }
}
