package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class cw0 {

    /* renamed from: e */
    public static final cw0 f15354e = new cw0(0, 0, 0, 1.0f);

    /* renamed from: a */
    public final int f15355a;

    /* renamed from: b */
    public final int f15356b;

    /* renamed from: c */
    public final int f15357c;

    /* renamed from: d */
    public final float f15358d;

    static {
        bv0 bv0 = bv0.f14709a;
    }

    public cw0(int i, int i2, int i3, float f) {
        this.f15355a = i;
        this.f15356b = i2;
        this.f15357c = i3;
        this.f15358d = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof cw0) {
            cw0 cw0 = (cw0) obj;
            return this.f15355a == cw0.f15355a && this.f15356b == cw0.f15356b && this.f15357c == cw0.f15357c && this.f15358d == cw0.f15358d;
        }
    }

    public final int hashCode() {
        return ((((((this.f15355a + 217) * 31) + this.f15356b) * 31) + this.f15357c) * 31) + Float.floatToRawIntBits(this.f15358d);
    }
}
