package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class ut3 {

    /* renamed from: a */
    public final f24 f24429a;

    /* renamed from: b */
    public final long f24430b;

    /* renamed from: c */
    public final long f24431c;

    /* renamed from: d */
    public final long f24432d;

    /* renamed from: e */
    public final long f24433e;

    /* renamed from: f */
    public final boolean f24434f;

    /* renamed from: g */
    public final boolean f24435g;

    /* renamed from: h */
    public final boolean f24436h;

    /* renamed from: i */
    public final boolean f24437i;

    ut3(f24 f24, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        gs1.m24486d(!z4 || z2);
        if (z3 && !z2) {
            z5 = false;
        }
        gs1.m24486d(z5);
        this.f24429a = f24;
        this.f24430b = j;
        this.f24431c = j2;
        this.f24432d = j3;
        this.f24433e = j4;
        this.f24434f = false;
        this.f24435g = z2;
        this.f24436h = z3;
        this.f24437i = z4;
    }

    /* renamed from: a */
    public final ut3 mo21361a(long j) {
        if (j == this.f24431c) {
            return this;
        }
        return new ut3(this.f24429a, this.f24430b, j, this.f24432d, this.f24433e, false, this.f24435g, this.f24436h, this.f24437i);
    }

    /* renamed from: b */
    public final ut3 mo21362b(long j) {
        if (j == this.f24430b) {
            return this;
        }
        return new ut3(this.f24429a, j, this.f24431c, this.f24432d, this.f24433e, false, this.f24435g, this.f24436h, this.f24437i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ut3.class == obj.getClass()) {
            ut3 ut3 = (ut3) obj;
            return this.f24430b == ut3.f24430b && this.f24431c == ut3.f24431c && this.f24432d == ut3.f24432d && this.f24433e == ut3.f24433e && this.f24435g == ut3.f24435g && this.f24436h == ut3.f24436h && this.f24437i == ut3.f24437i && wy2.m33453p(this.f24429a, ut3.f24429a);
        }
    }

    public final int hashCode() {
        return ((((((((((((((this.f24429a.hashCode() + 527) * 31) + ((int) this.f24430b)) * 31) + ((int) this.f24431c)) * 31) + ((int) this.f24432d)) * 31) + ((int) this.f24433e)) * 961) + (this.f24435g ? 1 : 0)) * 31) + (this.f24436h ? 1 : 0)) * 31) + (this.f24437i ? 1 : 0);
    }
}
