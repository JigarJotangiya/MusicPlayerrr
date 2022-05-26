package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class bt0 {

    /* renamed from: a */
    private final xh0 f14694a;

    /* renamed from: b */
    private final int[] f14695b;

    /* renamed from: c */
    private final int f14696c;

    /* renamed from: d */
    private final boolean[] f14697d;

    static {
        as0 as0 = as0.f14057a;
    }

    public bt0(xh0 xh0, int[] iArr, int i, boolean[] zArr) {
        int i2 = xh0.f25828a;
        this.f14694a = xh0;
        this.f14695b = (int[]) iArr.clone();
        this.f14696c = i;
        this.f14697d = (boolean[]) zArr.clone();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && bt0.class == obj.getClass()) {
            bt0 bt0 = (bt0) obj;
            return this.f14696c == bt0.f14696c && this.f14694a.equals(bt0.f14694a) && Arrays.equals(this.f14695b, bt0.f14695b) && Arrays.equals(this.f14697d, bt0.f14697d);
        }
    }

    public final int hashCode() {
        return (((((this.f14694a.hashCode() * 31) + Arrays.hashCode(this.f14695b)) * 31) + this.f14696c) * 31) + Arrays.hashCode(this.f14697d);
    }
}
