package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class fx3 {

    /* renamed from: a */
    public final long f16798a;

    /* renamed from: b */
    public final bg0 f16799b;

    /* renamed from: c */
    public final int f16800c;

    /* renamed from: d */
    public final f24 f16801d;

    /* renamed from: e */
    public final long f16802e;

    /* renamed from: f */
    public final bg0 f16803f;

    /* renamed from: g */
    public final int f16804g;

    /* renamed from: h */
    public final f24 f16805h;

    /* renamed from: i */
    public final long f16806i;

    /* renamed from: j */
    public final long f16807j;

    public fx3(long j, bg0 bg0, int i, f24 f24, long j2, bg0 bg02, int i2, f24 f242, long j3, long j4) {
        this.f16798a = j;
        this.f16799b = bg0;
        this.f16800c = i;
        this.f16801d = f24;
        this.f16802e = j2;
        this.f16803f = bg02;
        this.f16804g = i2;
        this.f16805h = f242;
        this.f16806i = j3;
        this.f16807j = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && fx3.class == obj.getClass()) {
            fx3 fx3 = (fx3) obj;
            return this.f16798a == fx3.f16798a && this.f16800c == fx3.f16800c && this.f16802e == fx3.f16802e && this.f16804g == fx3.f16804g && this.f16806i == fx3.f16806i && this.f16807j == fx3.f16807j && q13.m29306a(this.f16799b, fx3.f16799b) && q13.m29306a(this.f16801d, fx3.f16801d) && q13.m29306a(this.f16803f, fx3.f16803f) && q13.m29306a(this.f16805h, fx3.f16805h);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.f16798a), this.f16799b, Integer.valueOf(this.f16800c), this.f16801d, Long.valueOf(this.f16802e), this.f16803f, Integer.valueOf(this.f16804g), this.f16805h, Long.valueOf(this.f16806i), Long.valueOf(this.f16807j)});
    }
}
