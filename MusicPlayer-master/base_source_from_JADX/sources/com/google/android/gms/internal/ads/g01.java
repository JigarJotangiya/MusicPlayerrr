package com.google.android.gms.internal.ads;

import android.media.MediaCodec;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class g01 {

    /* renamed from: a */
    public byte[] f16837a;

    /* renamed from: b */
    public byte[] f16838b;

    /* renamed from: c */
    public int f16839c;

    /* renamed from: d */
    public int[] f16840d;

    /* renamed from: e */
    public int[] f16841e;

    /* renamed from: f */
    public int f16842f;

    /* renamed from: g */
    public int f16843g;

    /* renamed from: h */
    public int f16844h;

    /* renamed from: i */
    private final MediaCodec.CryptoInfo f16845i;

    /* renamed from: j */
    private final fz0 f16846j;

    public g01() {
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f16845i = cryptoInfo;
        this.f16846j = wy2.f25579a >= 24 ? new fz0(cryptoInfo, (ey0) null) : null;
    }

    /* renamed from: a */
    public final MediaCodec.CryptoInfo mo17790a() {
        return this.f16845i;
    }

    /* renamed from: b */
    public final void mo17791b(int i) {
        if (i != 0) {
            if (this.f16840d == null) {
                int[] iArr = new int[1];
                this.f16840d = iArr;
                this.f16845i.numBytesOfClearData = iArr;
            }
            int[] iArr2 = this.f16840d;
            iArr2[0] = iArr2[0] + i;
        }
    }

    /* renamed from: c */
    public final void mo17792c(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f16842f = i;
        this.f16840d = iArr;
        this.f16841e = iArr2;
        this.f16838b = bArr;
        this.f16837a = bArr2;
        this.f16839c = i2;
        this.f16843g = i3;
        this.f16844h = i4;
        MediaCodec.CryptoInfo cryptoInfo = this.f16845i;
        cryptoInfo.numSubSamples = i;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i2;
        if (wy2.f25579a >= 24) {
            fz0 fz0 = this.f16846j;
            Objects.requireNonNull(fz0);
            fz0.m24019a(fz0, i3, i4);
        }
    }
}
