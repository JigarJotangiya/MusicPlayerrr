package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.o4 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5398o4 implements z94 {

    /* renamed from: a */
    private final C5287l4 f20891a;

    /* renamed from: b */
    private final int f20892b;

    /* renamed from: c */
    private final long f20893c;

    /* renamed from: d */
    private final long f20894d;

    /* renamed from: e */
    private final long f20895e;

    public C5398o4(C5287l4 l4Var, int i, long j, long j2) {
        this.f20891a = l4Var;
        this.f20892b = i;
        this.f20893c = j;
        long j3 = (j2 - j) / ((long) l4Var.f19194d);
        this.f20894d = j3;
        this.f20895e = m28277b(j3);
    }

    /* renamed from: b */
    private final long m28277b(long j) {
        return wy2.m33431Z(j * ((long) this.f20892b), 1000000, (long) this.f20891a.f19193c);
    }

    /* renamed from: c */
    public final x94 mo15607c(long j) {
        long U = wy2.m33426U((((long) this.f20891a.f19193c) * j) / (((long) this.f20892b) * 1000000), 0, this.f20894d - 1);
        long j2 = this.f20893c;
        int i = this.f20891a.f19194d;
        long b = m28277b(U);
        aa4 aa4 = new aa4(b, j2 + (((long) i) * U));
        if (b >= j || U == this.f20894d - 1) {
            return new x94(aa4, aa4);
        }
        long j3 = U + 1;
        return new x94(aa4, new aa4(m28277b(j3), this.f20893c + (j3 * ((long) this.f20891a.f19194d))));
    }

    /* renamed from: e */
    public final boolean mo15608e() {
        return true;
    }

    public final long zze() {
        return this.f20895e;
    }
}
