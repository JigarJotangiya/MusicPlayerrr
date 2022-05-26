package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class l84 {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final long f19249a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final long f19250b;

    /* renamed from: c */
    private final long f19251c;

    /* renamed from: d */
    private long f19252d = 0;

    /* renamed from: e */
    private long f19253e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public long f19254f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public long f19255g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public long f19256h;

    protected l84(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
        this.f19249a = j;
        long j8 = j2;
        this.f19250b = j8;
        long j9 = j4;
        this.f19253e = j9;
        long j10 = j5;
        this.f19254f = j10;
        long j11 = j6;
        this.f19255g = j11;
        long j12 = j7;
        this.f19251c = j12;
        this.f19256h = m26584f(j8, 0, j9, j10, j11, j12);
    }

    /* renamed from: f */
    protected static long m26584f(long j, long j2, long j3, long j4, long j5, long j6) {
        if (j4 + 1 >= j5 || 1 + j2 >= j3) {
            return j4;
        }
        long j7 = (long) (((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2))));
        return wy2.m33426U(((j4 + j7) - j6) - (j7 / 20), j4, -1 + j5);
    }

    /* renamed from: g */
    static /* bridge */ /* synthetic */ void m26585g(l84 l84, long j, long j2) {
        l84.f19253e = j;
        l84.f19255g = j2;
        l84.m26587i();
    }

    /* renamed from: h */
    static /* bridge */ /* synthetic */ void m26586h(l84 l84, long j, long j2) {
        l84.f19252d = j;
        l84.f19254f = j2;
        l84.m26587i();
    }

    /* renamed from: i */
    private final void m26587i() {
        this.f19256h = m26584f(this.f19250b, this.f19252d, this.f19253e, this.f19254f, this.f19255g, this.f19251c);
    }
}
