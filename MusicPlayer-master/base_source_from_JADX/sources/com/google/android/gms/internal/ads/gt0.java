package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class gt0 {

    /* renamed from: a */
    private final int f17245a;

    /* renamed from: b */
    public final int f17246b;

    /* renamed from: c */
    public final int f17247c;

    private gt0(int i, int i2, int i3) {
        this.f17245a = i;
        this.f17247c = i2;
        this.f17246b = i3;
    }

    /* renamed from: a */
    public static gt0 m24492a() {
        return new gt0(0, 0, 0);
    }

    /* renamed from: b */
    public static gt0 m24493b(int i, int i2) {
        return new gt0(1, i, i2);
    }

    /* renamed from: c */
    public static gt0 m24494c(zzbfi zzbfi) {
        if (zzbfi.f27218j) {
            return new gt0(3, 0, 0);
        }
        if (zzbfi.f27223o) {
            return new gt0(2, 0, 0);
        }
        if (zzbfi.f27222n) {
            return m24492a();
        }
        return m24493b(zzbfi.f27220l, zzbfi.f27217i);
    }

    /* renamed from: d */
    public static gt0 m24495d() {
        return new gt0(5, 0, 0);
    }

    /* renamed from: e */
    public static gt0 m24496e() {
        return new gt0(4, 0, 0);
    }

    /* renamed from: f */
    public final boolean mo18017f() {
        return this.f17245a == 0;
    }

    /* renamed from: g */
    public final boolean mo18018g() {
        return this.f17245a == 2;
    }

    /* renamed from: h */
    public final boolean mo18019h() {
        return this.f17245a == 5;
    }

    /* renamed from: i */
    public final boolean mo18020i() {
        return this.f17245a == 3;
    }

    /* renamed from: j */
    public final boolean mo18021j() {
        return this.f17245a == 4;
    }
}
