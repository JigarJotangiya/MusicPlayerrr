package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class e04 {

    /* renamed from: a */
    public final int f15816a = 0;

    /* renamed from: b */
    public final int f15817b;

    /* renamed from: c */
    public final int f15818c;

    static {
        ez3 ez3 = ez3.f16386a;
    }

    public e04(int i, int i2, int i3) {
        this.f15817b = i2;
        this.f15818c = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e04)) {
            return false;
        }
        e04 e04 = (e04) obj;
        int i = e04.f15816a;
        return this.f15817b == e04.f15817b && this.f15818c == e04.f15818c;
    }

    public final int hashCode() {
        return ((this.f15817b + 16337) * 31) + this.f15818c;
    }
}
