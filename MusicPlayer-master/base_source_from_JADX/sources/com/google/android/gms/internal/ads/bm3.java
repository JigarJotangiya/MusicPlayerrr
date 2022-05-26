package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class bm3 {

    /* renamed from: a */
    private final Object f14567a;

    /* renamed from: b */
    private final int f14568b;

    bm3(Object obj, int i) {
        this.f14567a = obj;
        this.f14568b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof bm3)) {
            return false;
        }
        bm3 bm3 = (bm3) obj;
        if (this.f14567a == bm3.f14567a && this.f14568b == bm3.f14568b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f14567a) * 65535) + this.f14568b;
    }
}
