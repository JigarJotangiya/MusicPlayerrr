package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.AudioTimestamp;
import android.media.AudioTrack;

@TargetApi(19)
/* renamed from: com.google.android.gms.internal.ads.of */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5409of extends C5372nf {

    /* renamed from: j */
    private final AudioTimestamp f20986j = new AudioTimestamp();

    /* renamed from: k */
    private long f20987k;

    /* renamed from: l */
    private long f20988l;

    /* renamed from: m */
    private long f20989m;

    public C5409of() {
        super((C5335mf) null);
    }

    /* renamed from: c */
    public final long mo19716c() {
        return this.f20989m;
    }

    /* renamed from: d */
    public final long mo19717d() {
        return this.f20986j.nanoTime;
    }

    /* renamed from: g */
    public final void mo19720g(AudioTrack audioTrack, boolean z) {
        super.mo19720g(audioTrack, z);
        this.f20987k = 0;
        this.f20988l = 0;
        this.f20989m = 0;
    }

    /* renamed from: h */
    public final boolean mo19721h() {
        boolean timestamp = this.f20605a.getTimestamp(this.f20986j);
        if (timestamp) {
            long j = this.f20986j.framePosition;
            if (this.f20988l > j) {
                this.f20987k++;
            }
            this.f20988l = j;
            this.f20989m = j + (this.f20987k << 32);
        }
        return timestamp;
    }
}
