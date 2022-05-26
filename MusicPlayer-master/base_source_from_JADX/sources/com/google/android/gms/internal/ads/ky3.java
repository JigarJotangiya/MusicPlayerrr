package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ky3 extends Thread {

    /* renamed from: g */
    final /* synthetic */ AudioTrack f19112g;

    /* renamed from: h */
    final /* synthetic */ vy3 f19113h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ky3(vy3 vy3, String str, AudioTrack audioTrack) {
        super("ExoPlayer:AudioTrackReleaseThread");
        this.f19113h = vy3;
        this.f19112g = audioTrack;
    }

    public final void run() {
        try {
            this.f19112g.flush();
            this.f19112g.release();
        } finally {
            this.f19113h.f25078e.open();
        }
    }
}
