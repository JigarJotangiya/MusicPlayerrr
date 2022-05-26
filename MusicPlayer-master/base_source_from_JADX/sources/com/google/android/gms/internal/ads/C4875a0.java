package com.google.android.gms.internal.ads;

import android.util.Pair;

/* renamed from: com.google.android.gms.internal.ads.a0 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C4875a0 implements C5060f0 {

    /* renamed from: a */
    private final long[] f13690a;

    /* renamed from: b */
    private final long[] f13691b;

    /* renamed from: c */
    private final long f13692c;

    private C4875a0(long[] jArr, long[] jArr2, long j) {
        this.f13690a = jArr;
        this.f13691b = jArr2;
        this.f13692c = j == -9223372036854775807L ? bw3.m21569c(jArr2[jArr2.length - 1]) : j;
    }

    /* renamed from: b */
    public static C4875a0 m20506b(long j, zzzy zzzy, long j2) {
        int length = zzzy.f27476k.length;
        int i = length + 1;
        long[] jArr = new long[i];
        long[] jArr2 = new long[i];
        jArr[0] = j;
        long j3 = 0;
        jArr2[0] = 0;
        for (int i2 = 1; i2 <= length; i2++) {
            int i3 = i2 - 1;
            j += (long) (zzzy.f27474i + zzzy.f27476k[i3]);
            j3 += (long) (zzzy.f27475j + zzzy.f27477l[i3]);
            jArr[i2] = j;
            jArr2[i2] = j3;
        }
        return new C4875a0(jArr, jArr2, j2);
    }

    /* renamed from: d */
    private static Pair<Long, Long> m20507d(long j, long[] jArr, long[] jArr2) {
        int J = wy2.m33415J(jArr, j, true, true);
        long j2 = jArr[J];
        long j3 = jArr2[J];
        int i = J + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j2), Long.valueOf(j3));
        }
        long j4 = jArr[i];
        return Pair.create(Long.valueOf(j), Long.valueOf(((long) ((j4 == j2 ? 0.0d : (((double) j) - ((double) j2)) / ((double) (j4 - j2))) * ((double) (jArr2[i] - j3)))) + j3));
    }

    /* renamed from: a */
    public final long mo15606a() {
        return -1;
    }

    /* renamed from: c */
    public final x94 mo15607c(long j) {
        Pair<Long, Long> d = m20507d(bw3.m21570d(wy2.m33426U(j, 0, this.f13692c)), this.f13691b, this.f13690a);
        aa4 aa4 = new aa4(bw3.m21569c(((Long) d.first).longValue()), ((Long) d.second).longValue());
        return new x94(aa4, aa4);
    }

    /* renamed from: e */
    public final boolean mo15608e() {
        return true;
    }

    /* renamed from: g */
    public final long mo15609g(long j) {
        return bw3.m21569c(((Long) m20507d(j, this.f13690a, this.f13691b).second).longValue());
    }

    public final long zze() {
        return this.f13692c;
    }
}
