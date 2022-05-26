package com.google.android.gms.internal.ads;

import android.media.AudioTrack;
import android.os.Handler;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class uy3 {

    /* renamed from: a */
    private final Handler f24517a = new Handler();

    /* renamed from: b */
    private final AudioTrack.StreamEventCallback f24518b;

    /* renamed from: c */
    final /* synthetic */ vy3 f24519c;

    public uy3(vy3 vy3) {
        this.f24519c = vy3;
        this.f24518b = new ty3(this, vy3);
    }

    /* renamed from: a */
    public final void mo21399a(AudioTrack audioTrack) {
        audioTrack.registerStreamEventCallback(new sy3(this.f24517a), this.f24518b);
    }

    /* renamed from: b */
    public final void mo21400b(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f24518b);
        this.f24517a.removeCallbacksAndMessages((Object) null);
    }
}
