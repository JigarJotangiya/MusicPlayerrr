package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class e34 {

    /* renamed from: a */
    public final int f15852a;

    /* renamed from: b */
    public final boolean f15853b;

    public e34(int i, boolean z) {
        this.f15852a = i;
        this.f15853b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && e34.class == obj.getClass()) {
            e34 e34 = (e34) obj;
            return this.f15852a == e34.f15852a && this.f15853b == e34.f15853b;
        }
    }

    public final int hashCode() {
        return (this.f15852a * 31) + (this.f15853b ? 1 : 0);
    }
}
