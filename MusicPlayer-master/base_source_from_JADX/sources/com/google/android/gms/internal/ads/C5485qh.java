package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.qh */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5485qh implements C5374nh {

    /* renamed from: a */
    private final C5600tl f21921a;

    /* renamed from: b */
    private final int f21922b;

    /* renamed from: c */
    private final int f21923c;

    /* renamed from: d */
    private int f21924d;

    /* renamed from: e */
    private int f21925e;

    public C5485qh(C5263kh khVar) {
        C5600tl tlVar = khVar.f18875P0;
        this.f21921a = tlVar;
        tlVar.mo21103v(12);
        this.f21923c = tlVar.mo21090i() & 255;
        this.f21922b = tlVar.mo21090i();
    }

    /* renamed from: a */
    public final int mo19729a() {
        int i = this.f21923c;
        if (i == 8) {
            return this.f21921a.mo21088g();
        }
        if (i == 16) {
            return this.f21921a.mo21091j();
        }
        int i2 = this.f21924d;
        this.f21924d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.f21925e & 15;
        }
        int g = this.f21921a.mo21088g();
        this.f21925e = g;
        return (g & 240) >> 4;
    }

    /* renamed from: b */
    public final boolean mo19730b() {
        return false;
    }

    public final int zza() {
        return this.f21922b;
    }
}
