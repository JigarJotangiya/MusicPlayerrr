package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ph */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5448ph implements C5374nh {

    /* renamed from: a */
    private final int f21407a;

    /* renamed from: b */
    private final int f21408b;

    /* renamed from: c */
    private final C5600tl f21409c;

    public C5448ph(C5263kh khVar) {
        C5600tl tlVar = khVar.f18875P0;
        this.f21409c = tlVar;
        tlVar.mo21103v(12);
        this.f21407a = tlVar.mo21090i();
        this.f21408b = tlVar.mo21090i();
    }

    /* renamed from: a */
    public final int mo19729a() {
        int i = this.f21407a;
        return i == 0 ? this.f21409c.mo21090i() : i;
    }

    /* renamed from: b */
    public final boolean mo19730b() {
        return this.f21407a != 0;
    }

    public final int zza() {
        return this.f21408b;
    }
}
