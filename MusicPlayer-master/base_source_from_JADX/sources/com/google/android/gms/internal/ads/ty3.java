package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ty3 extends AudioTrack.StreamEventCallback {

    /* renamed from: a */
    final /* synthetic */ uy3 f24062a;

    ty3(uy3 uy3, vy3 vy3) {
        this.f24062a = uy3;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        gs1.m24488f(audioTrack == this.f24062a.f24519c.f25087n);
        if (this.f24062a.f24519c.f25084k != null && this.f24062a.f24519c.f25067G) {
            this.f24062a.f24519c.f25084k.mo22308a();
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        gs1.m24488f(audioTrack == this.f24062a.f24519c.f25087n);
        if (this.f24062a.f24519c.f25084k != null && this.f24062a.f24519c.f25067G) {
            this.f24062a.f24519c.f25084k.mo22308a();
        }
    }
}
