package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class s80 {

    /* renamed from: a */
    public final Object f23364a;

    /* renamed from: b */
    public final int f23365b;

    /* renamed from: c */
    public final C5825zn f23366c;

    /* renamed from: d */
    public final Object f23367d;

    /* renamed from: e */
    public final int f23368e;

    /* renamed from: f */
    public final long f23369f;

    /* renamed from: g */
    public final long f23370g;

    /* renamed from: h */
    public final int f23371h;

    /* renamed from: i */
    public final int f23372i;

    static {
        s70 s70 = s70.f23359a;
    }

    public s80(Object obj, int i, C5825zn znVar, Object obj2, int i2, long j, long j2, int i3, int i4) {
        this.f23364a = obj;
        this.f23365b = i;
        this.f23366c = znVar;
        this.f23367d = obj2;
        this.f23368e = i2;
        this.f23369f = j;
        this.f23370g = j2;
        this.f23371h = i3;
        this.f23372i = i4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && s80.class == obj.getClass()) {
            s80 s80 = (s80) obj;
            return this.f23365b == s80.f23365b && this.f23368e == s80.f23368e && this.f23369f == s80.f23369f && this.f23370g == s80.f23370g && this.f23371h == s80.f23371h && this.f23372i == s80.f23372i && q13.m29306a(this.f23364a, s80.f23364a) && q13.m29306a(this.f23367d, s80.f23367d) && q13.m29306a(this.f23366c, s80.f23366c);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f23364a, Integer.valueOf(this.f23365b), this.f23366c, this.f23367d, Integer.valueOf(this.f23368e), Integer.valueOf(this.f23365b), Long.valueOf(this.f23369f), Long.valueOf(this.f23370g), Integer.valueOf(this.f23371h), Integer.valueOf(this.f23372i)});
    }
}
