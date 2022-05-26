package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;

@TargetApi(24)
/* renamed from: com.google.android.gms.internal.ads.fg */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5077fg {

    /* renamed from: a */
    private final MediaCodec.CryptoInfo f16580a;

    /* renamed from: b */
    private final MediaCodec.CryptoInfo.Pattern f16581b = new MediaCodec.CryptoInfo.Pattern(0, 0);

    /* synthetic */ C5077fg(MediaCodec.CryptoInfo cryptoInfo, C5039eg egVar) {
        this.f16580a = cryptoInfo;
    }

    /* renamed from: a */
    static /* bridge */ /* synthetic */ void m23662a(C5077fg fgVar, int i, int i2) {
        fgVar.f16581b.set(0, 0);
        fgVar.f16580a.setPattern(fgVar.f16581b);
    }
}
