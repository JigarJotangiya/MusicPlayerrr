package com.google.android.gms.internal.ads;

import android.media.MediaCodec;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class fz0 {

    /* renamed from: a */
    private final MediaCodec.CryptoInfo f16818a;

    /* renamed from: b */
    private final MediaCodec.CryptoInfo.Pattern f16819b = new MediaCodec.CryptoInfo.Pattern(0, 0);

    /* synthetic */ fz0(MediaCodec.CryptoInfo cryptoInfo, ey0 ey0) {
        this.f16818a = cryptoInfo;
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ void m24019a(fz0 fz0, int i, int i2) {
        fz0.f16819b.set(i, i2);
        fz0.f16818a.setPattern(fz0.f16819b);
    }
}
