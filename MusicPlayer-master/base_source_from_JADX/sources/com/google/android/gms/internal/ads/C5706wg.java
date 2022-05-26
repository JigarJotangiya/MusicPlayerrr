package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.wg */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5706wg {

    /* renamed from: a */
    public final int f25383a = 1;

    /* renamed from: b */
    public final byte[] f25384b;

    public C5706wg(int i, byte[] bArr) {
        this.f25384b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && C5706wg.class == obj.getClass() && Arrays.equals(this.f25384b, ((C5706wg) obj).f25384b);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f25384b) + 31;
    }
}
