package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.SystemClock;

/* renamed from: com.google.android.gms.internal.ads.nf */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
class C5372nf {

    /* renamed from: a */
    protected AudioTrack f20605a;

    /* renamed from: b */
    private boolean f20606b;

    /* renamed from: c */
    private int f20607c;

    /* renamed from: d */
    private long f20608d;

    /* renamed from: e */
    private long f20609e;

    /* renamed from: f */
    private long f20610f;

    /* renamed from: g */
    private long f20611g;

    /* renamed from: h */
    private long f20612h;

    /* renamed from: i */
    private long f20613i;

    /* synthetic */ C5372nf(C5335mf mfVar) {
    }

    /* renamed from: a */
    public final long mo19714a() {
        if (this.f20611g != -9223372036854775807L) {
            return Math.min(this.f20613i, this.f20612h + ((((SystemClock.elapsedRealtime() * 1000) - this.f20611g) * ((long) this.f20607c)) / 1000000));
        }
        int playState = this.f20605a.getPlayState();
        if (playState == 1) {
            return 0;
        }
        long playbackHeadPosition = ((long) this.f20605a.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f20606b) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f20610f = this.f20608d;
            }
            playbackHeadPosition += this.f20610f;
        }
        if (this.f20608d > playbackHeadPosition) {
            this.f20609e++;
        }
        this.f20608d = playbackHeadPosition;
        return playbackHeadPosition + (this.f20609e << 32);
    }

    /* renamed from: b */
    public final long mo19715b() {
        return (mo19714a() * 1000000) / ((long) this.f20607c);
    }

    /* renamed from: c */
    public long mo19716c() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: d */
    public long mo19717d() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: e */
    public final void mo19718e(long j) {
        this.f20612h = mo19714a();
        this.f20611g = SystemClock.elapsedRealtime() * 1000;
        this.f20613i = j;
        this.f20605a.stop();
    }

    /* renamed from: f */
    public final void mo19719f() {
        if (this.f20611g == -9223372036854775807L) {
            this.f20605a.pause();
        }
    }

    /* renamed from: g */
    public void mo19720g(AudioTrack audioTrack, boolean z) {
        this.f20605a = audioTrack;
        this.f20606b = z;
        this.f20611g = -9223372036854775807L;
        this.f20608d = 0;
        this.f20609e = 0;
        this.f20610f = 0;
        if (audioTrack != null) {
            this.f20607c = audioTrack.getSampleRate();
        }
    }

    /* renamed from: h */
    public boolean mo19721h() {
        return false;
    }
}
