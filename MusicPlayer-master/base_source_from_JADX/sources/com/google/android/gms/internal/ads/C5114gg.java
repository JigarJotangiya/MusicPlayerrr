package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.media.MediaCodec;

/* renamed from: com.google.android.gms.internal.ads.gg */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5114gg {

    /* renamed from: a */
    public byte[] f17035a;

    /* renamed from: b */
    public byte[] f17036b;

    /* renamed from: c */
    public int f17037c;

    /* renamed from: d */
    public int[] f17038d;

    /* renamed from: e */
    public int[] f17039e;

    /* renamed from: f */
    public int f17040f;

    /* renamed from: g */
    private final MediaCodec.CryptoInfo f17041g;

    /* renamed from: h */
    private final C5077fg f17042h;

    public C5114gg() {
        int i = C4934bm.f14552a;
        C5077fg fgVar = null;
        MediaCodec.CryptoInfo cryptoInfo = i >= 16 ? new MediaCodec.CryptoInfo() : null;
        this.f17041g = cryptoInfo;
        this.f17042h = i >= 24 ? new C5077fg(cryptoInfo, (C5039eg) null) : fgVar;
    }

    @TargetApi(16)
    /* renamed from: a */
    public final MediaCodec.CryptoInfo mo17904a() {
        return this.f17041g;
    }

    /* renamed from: b */
    public final void mo17905b(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2) {
        this.f17040f = i;
        this.f17038d = iArr;
        this.f17039e = iArr2;
        this.f17036b = bArr;
        this.f17035a = bArr2;
        this.f17037c = 1;
        int i3 = C4934bm.f14552a;
        if (i3 >= 16) {
            MediaCodec.CryptoInfo cryptoInfo = this.f17041g;
            cryptoInfo.numSubSamples = i;
            cryptoInfo.numBytesOfClearData = iArr;
            cryptoInfo.numBytesOfEncryptedData = iArr2;
            cryptoInfo.key = bArr;
            cryptoInfo.iv = bArr2;
            cryptoInfo.mode = 1;
            if (i3 >= 24) {
                C5077fg.m23662a(this.f17042h, 0, 0);
            }
        }
    }
}
