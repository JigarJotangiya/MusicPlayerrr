package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class uk0 {

    /* renamed from: a */
    private int f24350a;

    /* renamed from: b */
    private final h44[] f24351b;

    public uk0(h44[] h44Arr, byte... bArr) {
        this.f24351b = h44Arr;
        int length = h44Arr.length;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || uk0.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f24351b, ((uk0) obj).f24351b);
    }

    public final int hashCode() {
        int i = this.f24350a;
        if (i != 0) {
            return i;
        }
        int hashCode = Arrays.hashCode(this.f24351b) + 527;
        this.f24350a = hashCode;
        return hashCode;
    }
}
