package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class od0 {

    /* renamed from: a */
    public Object f20974a;

    /* renamed from: b */
    public Object f20975b;

    /* renamed from: c */
    public int f20976c;

    /* renamed from: d */
    public long f20977d;

    /* renamed from: e */
    public long f20978e;

    /* renamed from: f */
    public boolean f20979f;

    /* renamed from: g */
    private j31 f20980g = j31.f18339c;

    static {
        mc0 mc0 = mc0.f20011a;
    }

    /* renamed from: a */
    public final int mo19964a(int i) {
        return this.f20980g.mo18533a(i).f20591b;
    }

    /* renamed from: b */
    public final int mo19965b(long j) {
        long j2 = this.f20977d;
        if (j == Long.MIN_VALUE || j2 == -9223372036854775807L) {
            return -1;
        }
        int i = (j > j2 ? 1 : (j == j2 ? 0 : -1));
        return -1;
    }

    /* renamed from: c */
    public final int mo19966c(long j) {
        return -1;
    }

    /* renamed from: d */
    public final int mo19967d(int i) {
        return this.f20980g.mo18533a(i).mo19707a(-1);
    }

    /* renamed from: e */
    public final int mo19968e(int i, int i2) {
        return this.f20980g.mo18533a(i).mo19707a(i2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && od0.class.equals(obj.getClass())) {
            od0 od0 = (od0) obj;
            return wy2.m33453p(this.f20974a, od0.f20974a) && wy2.m33453p(this.f20975b, od0.f20975b) && this.f20976c == od0.f20976c && this.f20977d == od0.f20977d && this.f20979f == od0.f20979f && wy2.m33453p(this.f20980g, od0.f20980g);
        }
    }

    /* renamed from: f */
    public final long mo19970f(int i, int i2) {
        nd0 a = this.f20980g.mo18533a(i);
        if (a.f20591b != -1) {
            return a.f20594e[i2];
        }
        return -9223372036854775807L;
    }

    /* renamed from: g */
    public final long mo19971g(int i) {
        long j = this.f20980g.mo18533a(i).f20590a;
        return 0;
    }

    /* renamed from: h */
    public final long mo19972h() {
        long j = this.f20980g.f18341a;
        return 0;
    }

    public final int hashCode() {
        int i;
        Object obj = this.f20974a;
        int i2 = 0;
        if (obj == null) {
            i = 0;
        } else {
            i = obj.hashCode();
        }
        int i3 = (i + 217) * 31;
        Object obj2 = this.f20975b;
        if (obj2 != null) {
            i2 = obj2.hashCode();
        }
        int i4 = this.f20976c;
        long j = this.f20977d;
        return ((((((((i3 + i2) * 31) + i4) * 31) + ((int) ((j >>> 32) ^ j))) * 961) + (this.f20979f ? 1 : 0)) * 31) + this.f20980g.hashCode();
    }

    /* renamed from: i */
    public final long mo19974i(int i) {
        long j = this.f20980g.mo18533a(i).f20595f;
        return 0;
    }

    /* renamed from: j */
    public final od0 mo19975j(Object obj, Object obj2, int i, long j, long j2, j31 j31, boolean z) {
        this.f20974a = obj;
        this.f20975b = obj2;
        this.f20976c = 0;
        this.f20977d = j;
        this.f20978e = 0;
        this.f20980g = j31;
        this.f20979f = z;
        return this;
    }

    /* renamed from: k */
    public final boolean mo19976k(int i) {
        boolean z = this.f20980g.mo18533a(i).f20596g;
        return false;
    }
}
