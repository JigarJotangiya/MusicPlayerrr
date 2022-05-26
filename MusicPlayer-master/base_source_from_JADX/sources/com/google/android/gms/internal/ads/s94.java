package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class s94 implements z94 {

    /* renamed from: a */
    private final long[] f23386a;

    /* renamed from: b */
    private final long[] f23387b;

    /* renamed from: c */
    private final long f23388c;

    /* renamed from: d */
    private final boolean f23389d;

    public s94(long[] jArr, long[] jArr2, long j) {
        int length = jArr.length;
        int length2 = jArr2.length;
        gs1.m24486d(length == length2);
        boolean z = length2 > 0;
        this.f23389d = z;
        if (!z || jArr2[0] <= 0) {
            this.f23386a = jArr;
            this.f23387b = jArr2;
        } else {
            int i = length2 + 1;
            long[] jArr3 = new long[i];
            this.f23386a = jArr3;
            long[] jArr4 = new long[i];
            this.f23387b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        }
        this.f23388c = j;
    }

    /* renamed from: c */
    public final x94 mo15607c(long j) {
        if (!this.f23389d) {
            aa4 aa4 = aa4.f13831c;
            return new x94(aa4, aa4);
        }
        int J = wy2.m33415J(this.f23387b, j, true, true);
        long[] jArr = this.f23387b;
        aa4 aa42 = new aa4(jArr[J], this.f23386a[J]);
        if (aa42.f13832a == j || J == jArr.length - 1) {
            return new x94(aa42, aa42);
        }
        int i = J + 1;
        return new x94(aa42, new aa4(jArr[i], this.f23386a[i]));
    }

    /* renamed from: e */
    public final boolean mo15608e() {
        return this.f23389d;
    }

    public final long zze() {
        return this.f23388c;
    }
}
