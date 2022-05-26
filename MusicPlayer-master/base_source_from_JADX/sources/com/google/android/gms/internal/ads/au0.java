package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class au0 {

    /* renamed from: b */
    public static final au0 f14078b = new au0(g43.zzo());

    /* renamed from: a */
    private final g43<bt0> f14079a;

    static {
        zq0 zq0 = zq0.f26881a;
    }

    public au0(List<bt0> list) {
        this.f14079a = g43.zzm(list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || au0.class != obj.getClass()) {
            return false;
        }
        return this.f14079a.equals(((au0) obj).f14079a);
    }

    public final int hashCode() {
        return this.f14079a.hashCode();
    }
}
