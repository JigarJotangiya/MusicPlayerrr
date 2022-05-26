package com.google.android.gms.internal.ads;

import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ff0 {

    /* renamed from: o */
    public static final Object f16561o = new Object();

    /* renamed from: p */
    private static final C5825zn f16562p;

    /* renamed from: a */
    public Object f16563a = f16561o;

    /* renamed from: b */
    public C5825zn f16564b = f16562p;

    /* renamed from: c */
    public long f16565c;

    /* renamed from: d */
    public long f16566d;

    /* renamed from: e */
    public long f16567e;

    /* renamed from: f */
    public boolean f16568f;

    /* renamed from: g */
    public boolean f16569g;
    @Deprecated

    /* renamed from: h */
    public boolean f16570h;

    /* renamed from: i */
    public C5040eh f16571i;

    /* renamed from: j */
    public boolean f16572j;

    /* renamed from: k */
    public long f16573k;

    /* renamed from: l */
    public long f16574l;

    /* renamed from: m */
    public int f16575m;

    /* renamed from: n */
    public int f16576n;

    static {
        C5767y3 y3Var = new C5767y3();
        y3Var.mo22158a("androidx.media3.common.Timeline");
        y3Var.mo22159b(Uri.EMPTY);
        f16562p = y3Var.mo22160c();
        he0 he0 = he0.f17654a;
    }

    /* renamed from: a */
    public final ff0 mo17524a(Object obj, C5825zn znVar, Object obj2, long j, long j2, long j3, boolean z, boolean z2, C5040eh ehVar, long j4, long j5, int i, int i2, long j6) {
        C5040eh ehVar2 = ehVar;
        this.f16563a = obj;
        this.f16564b = znVar != null ? znVar : f16562p;
        this.f16565c = -9223372036854775807L;
        this.f16566d = -9223372036854775807L;
        this.f16567e = -9223372036854775807L;
        this.f16568f = z;
        this.f16569g = z2;
        this.f16570h = ehVar2 != null;
        this.f16571i = ehVar2;
        this.f16573k = 0;
        this.f16574l = j5;
        this.f16575m = 0;
        this.f16576n = 0;
        this.f16572j = false;
        return this;
    }

    /* renamed from: b */
    public final boolean mo17525b() {
        gs1.m24488f(this.f16570h == (this.f16571i != null));
        return this.f16571i != null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ff0.class.equals(obj.getClass())) {
            ff0 ff0 = (ff0) obj;
            return wy2.m33453p(this.f16563a, ff0.f16563a) && wy2.m33453p(this.f16564b, ff0.f16564b) && wy2.m33453p((Object) null, (Object) null) && wy2.m33453p(this.f16571i, ff0.f16571i) && this.f16565c == ff0.f16565c && this.f16566d == ff0.f16566d && this.f16567e == ff0.f16567e && this.f16568f == ff0.f16568f && this.f16569g == ff0.f16569g && this.f16572j == ff0.f16572j && this.f16574l == ff0.f16574l && this.f16575m == ff0.f16575m && this.f16576n == ff0.f16576n;
        }
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.f16563a.hashCode() + 217) * 31) + this.f16564b.hashCode()) * 961;
        C5040eh ehVar = this.f16571i;
        if (ehVar == null) {
            i = 0;
        } else {
            i = ehVar.hashCode();
        }
        long j = this.f16565c;
        long j2 = this.f16566d;
        long j3 = this.f16567e;
        boolean z = this.f16568f;
        boolean z2 = this.f16569g;
        boolean z3 = this.f16572j;
        long j4 = this.f16574l;
        return (((((((((((((((((((hashCode + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31) + ((int) ((j3 >>> 32) ^ j3))) * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + (z3 ? 1 : 0)) * 961) + ((int) ((j4 >>> 32) ^ j4))) * 31) + this.f16575m) * 31) + this.f16576n) * 31;
    }
}
