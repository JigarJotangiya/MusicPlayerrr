package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class sz3 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ MediaCodec f23660g;

    public /* synthetic */ sz3(MediaCodec mediaCodec) {
        this.f23660g = mediaCodec;
    }

    public final void run() {
        this.f23660g.start();
    }
}
