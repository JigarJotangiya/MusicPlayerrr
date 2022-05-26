package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class d44 {

    /* renamed from: a */
    public final long f15504a;

    /* renamed from: b */
    public final long f15505b;

    public d44(long j, long j2) {
        this.f15504a = j;
        this.f15505b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d44)) {
            return false;
        }
        d44 d44 = (d44) obj;
        return this.f15504a == d44.f15504a && this.f15505b == d44.f15505b;
    }

    public final int hashCode() {
        return (((int) this.f15504a) * 31) + ((int) this.f15505b);
    }
}
