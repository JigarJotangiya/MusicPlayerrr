package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.j3 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5212j3 extends p84 {
    public C5212j3(tv2 tv2, long j, long j2) {
        super(new k84(), new C5175i3(tv2, (C5138h3) null), j, 0, j + 1, 0, j2, 188, 1000);
    }

    /* renamed from: h */
    static /* bridge */ /* synthetic */ int m25497h(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }
}
