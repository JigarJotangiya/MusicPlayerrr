package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.fi */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5079fi {

    /* renamed from: a */
    public final int f16630a;

    /* renamed from: b */
    public final long[] f16631b;

    /* renamed from: c */
    public final int[] f16632c;

    /* renamed from: d */
    public final int f16633d;

    /* renamed from: e */
    public final long[] f16634e;

    /* renamed from: f */
    public final int[] f16635f;

    public C5079fi(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2) {
        int length = jArr2.length;
        boolean z = true;
        C5304ll.m26774c(iArr.length == length);
        int length2 = jArr.length;
        C5304ll.m26774c(length2 == length);
        C5304ll.m26774c(iArr2.length != length ? false : z);
        this.f16631b = jArr;
        this.f16632c = iArr;
        this.f16633d = i;
        this.f16634e = jArr2;
        this.f16635f = iArr2;
        this.f16630a = length2;
    }

    /* renamed from: a */
    public final int mo17534a(long j) {
        for (int c = C4934bm.m21433c(this.f16634e, j, true, false); c >= 0; c--) {
            if ((this.f16635f[c] & 1) != 0) {
                return c;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo17535b(long j) {
        for (int b = C4934bm.m21432b(this.f16634e, j, true, false); b < this.f16634e.length; b++) {
            if ((this.f16635f[b] & 1) != 0) {
                return b;
            }
        }
        return -1;
    }
}
