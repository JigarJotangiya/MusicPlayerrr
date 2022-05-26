package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class an0 implements Runnable {

    /* renamed from: g */
    final /* synthetic */ MediaPlayer f13994g;

    /* renamed from: h */
    final /* synthetic */ in0 f13995h;

    an0(in0 in0, MediaPlayer mediaPlayer) {
        this.f13995h = in0;
        this.f13994g = mediaPlayer;
    }

    public final void run() {
        in0.m25305L(this.f13995h, this.f13994g);
        if (this.f13995h.f18116x != null) {
            this.f13995h.f18116x.mo18676c();
        }
    }
}
