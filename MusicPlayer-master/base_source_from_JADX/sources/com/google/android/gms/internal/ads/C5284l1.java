package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.l1 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5284l1 {

    /* renamed from: a */
    public final C5173i1 f19135a;

    /* renamed from: b */
    public final int f19136b;

    /* renamed from: c */
    public final long[] f19137c;

    /* renamed from: d */
    public final int[] f19138d;

    /* renamed from: e */
    public final int f19139e;

    /* renamed from: f */
    public final long[] f19140f;

    /* renamed from: g */
    public final int[] f19141g;

    /* renamed from: h */
    public final long f19142h;

    public C5284l1(C5173i1 i1Var, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        int length = iArr.length;
        int length2 = jArr2.length;
        boolean z = true;
        gs1.m24486d(length == length2);
        int length3 = jArr.length;
        gs1.m24486d(length3 == length2);
        int length4 = iArr2.length;
        gs1.m24486d(length4 != length2 ? false : z);
        this.f19135a = i1Var;
        this.f19137c = jArr;
        this.f19138d = iArr;
        this.f19139e = i;
        this.f19140f = jArr2;
        this.f19141g = iArr2;
        this.f19142h = j;
        this.f19136b = length3;
        if (length4 > 0) {
            int i2 = length4 - 1;
            iArr2[i2] = iArr2[i2] | 536870912;
        }
    }

    /* renamed from: a */
    public final int mo19045a(long j) {
        for (int J = wy2.m33415J(this.f19140f, j, true, false); J >= 0; J--) {
            if ((this.f19141g[J] & 1) != 0) {
                return J;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final int mo19046b(long j) {
        for (int H = wy2.m33413H(this.f19140f, j, true, false); H < this.f19140f.length; H++) {
            if ((this.f19141g[H] & 1) != 0) {
                return H;
            }
        }
        return -1;
    }
}
