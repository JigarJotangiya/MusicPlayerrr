package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.eh */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5040eh {

    /* renamed from: a */
    public final long f15945a;

    /* renamed from: b */
    public final long f15946b;

    /* renamed from: c */
    public final long f15947c;

    /* renamed from: d */
    public final float f15948d;

    /* renamed from: e */
    public final float f15949e;

    static {
        C5112ge geVar = C5112ge.f17026a;
    }

    private C5040eh(C5113gf gfVar) {
        this.f15945a = -9223372036854775807L;
        this.f15946b = -9223372036854775807L;
        this.f15947c = -9223372036854775807L;
        this.f15948d = -3.4028235E38f;
        this.f15949e = -3.4028235E38f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5040eh)) {
            return false;
        }
        C5040eh ehVar = (C5040eh) obj;
        long j = ehVar.f15945a;
        long j2 = ehVar.f15946b;
        long j3 = ehVar.f15947c;
        float f = ehVar.f15948d;
        float f2 = ehVar.f15949e;
        return true;
    }

    public final int hashCode() {
        int i = (int) -9223372034707292159L;
        return (((((((i * 31) + i) * 31) + i) * 31) + Float.floatToIntBits(-3.4028235E38f)) * 31) + Float.floatToIntBits(-3.4028235E38f);
    }
}
