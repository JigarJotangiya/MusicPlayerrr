package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.bk */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C4932bk {

    /* renamed from: a */
    public final int f14501a = 1;

    /* renamed from: b */
    private final zzapg[] f14502b;

    /* renamed from: c */
    private int f14503c;

    public C4932bk(zzapg... zzapgArr) {
        this.f14502b = zzapgArr;
    }

    /* renamed from: a */
    public final int mo16251a(zzapg zzapg) {
        for (int i = 0; i <= 0; i++) {
            if (zzapg == this.f14502b[i]) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public final zzapg mo16252b(int i) {
        return this.f14502b[i];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C4932bk.class == obj.getClass() && Arrays.equals(this.f14502b, ((C4932bk) obj).f14502b);
    }

    public final int hashCode() {
        int i = this.f14503c;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f14502b) + 527;
        this.f14503c = hashCode;
        return hashCode;
    }
}
