package com.google.android.play.core.assetpacks;

/* renamed from: com.google.android.play.core.assetpacks.p0 */
/* compiled from: com.google.android.play:core@@1.10.2 */
final class C6400p0 {
    /* renamed from: a */
    static int m37765a(byte[] bArr, int i) {
        return ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
    }

    /* renamed from: b */
    static long m37766b(byte[] bArr, int i) {
        return ((long) ((m37765a(bArr, i + 2) << 16) | m37765a(bArr, i))) & 4294967295L;
    }
}
