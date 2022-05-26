package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.p0 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5431p0 implements C5320m0 {

    /* renamed from: a */
    private final no2 f21255a;

    /* renamed from: b */
    private final int f21256b;

    /* renamed from: c */
    private final int f21257c;

    /* renamed from: d */
    private int f21258d;

    /* renamed from: e */
    private int f21259e;

    public C5431p0(C5209j0 j0Var) {
        no2 no2 = j0Var.f18291b;
        this.f21255a = no2;
        no2.mo19779f(12);
        this.f21257c = no2.mo19795v() & 255;
        this.f21256b = no2.mo19795v();
    }

    /* renamed from: a */
    public final int mo19309a() {
        return this.f21256b;
    }

    /* renamed from: b */
    public final int mo19310b() {
        int i = this.f21257c;
        if (i == 8) {
            return this.f21255a.mo19792s();
        }
        if (i == 16) {
            return this.f21255a.mo19796w();
        }
        int i2 = this.f21258d;
        this.f21258d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.f21259e & 15;
        }
        int s = this.f21255a.mo19792s();
        this.f21259e = s;
        return (s & 240) >> 4;
    }

    public final int zza() {
        return -1;
    }
}
