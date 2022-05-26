package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.p1 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5432p1 implements C5654v1 {

    /* renamed from: a */
    private final n94 f21276a;

    /* renamed from: b */
    private final m94 f21277b;

    /* renamed from: c */
    private long f21278c = -1;

    /* renamed from: d */
    private long f21279d = -1;

    public C5432p1(n94 n94, m94 m94) {
        this.f21276a = n94;
        this.f21277b = m94;
    }

    /* renamed from: a */
    public final void mo20173a(long j) {
        this.f21278c = j;
    }

    /* renamed from: b */
    public final long mo15644b(z84 z84) {
        long j = this.f21279d;
        if (j < 0) {
            return -1;
        }
        this.f21279d = -1;
        return -(j + 2);
    }

    /* renamed from: c */
    public final void mo15645c(long j) {
        long[] jArr = this.f21277b.f19813a;
        this.f21279d = jArr[wy2.m33415J(jArr, j, true, true)];
    }

    public final z94 zze() {
        gs1.m24488f(this.f21278c != -1);
        return new l94(this.f21276a, this.f21278c);
    }
}
