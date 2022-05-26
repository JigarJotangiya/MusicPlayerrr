package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ca4 {

    /* renamed from: a */
    public final int f14930a;

    /* renamed from: b */
    public final byte[] f14931b;

    /* renamed from: c */
    public final int f14932c;

    /* renamed from: d */
    public final int f14933d;

    public ca4(int i, byte[] bArr, int i2, int i3) {
        this.f14930a = i;
        this.f14931b = bArr;
        this.f14932c = i2;
        this.f14933d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ca4.class == obj.getClass()) {
            ca4 ca4 = (ca4) obj;
            return this.f14930a == ca4.f14930a && this.f14932c == ca4.f14932c && this.f14933d == ca4.f14933d && Arrays.equals(this.f14931b, ca4.f14931b);
        }
    }

    public final int hashCode() {
        return (((((this.f14930a * 31) + Arrays.hashCode(this.f14931b)) * 31) + this.f14932c) * 31) + this.f14933d;
    }
}
