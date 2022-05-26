package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* renamed from: com.google.android.gms.internal.ads.lf */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5298lf extends Thread {

    /* renamed from: g */
    final /* synthetic */ AudioTrack f19340g;

    /* renamed from: h */
    final /* synthetic */ C5668vf f19341h;

    C5298lf(C5668vf vfVar, AudioTrack audioTrack) {
        this.f19341h = vfVar;
        this.f19340g = audioTrack;
    }

    public final void run() {
        try {
            this.f19340g.flush();
            this.f19340g.release();
        } finally {
            this.f19341h.f24734e.open();
        }
    }
}
