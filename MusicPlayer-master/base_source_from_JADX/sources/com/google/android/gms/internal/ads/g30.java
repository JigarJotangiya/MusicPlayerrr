package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class g30 {

    /* renamed from: a */
    private final h64 f16892a = new h64();

    /* renamed from: a */
    public final g30 mo17821a(int i) {
        this.f16892a.mo18093a(i);
        return this;
    }

    /* renamed from: b */
    public final g30 mo17822b(e50 e50) {
        h64 h64 = this.f16892a;
        i84 a = e50.f15866a;
        for (int i = 0; i < a.mo18308b(); i++) {
            h64.mo18093a(a.mo18307a(i));
        }
        return this;
    }

    /* renamed from: c */
    public final g30 mo17823c(int... iArr) {
        h64 h64 = this.f16892a;
        for (int a : iArr) {
            h64.mo18093a(a);
        }
        return this;
    }

    /* renamed from: d */
    public final g30 mo17824d(int i, boolean z) {
        h64 h64 = this.f16892a;
        if (z) {
            h64.mo18093a(i);
        }
        return this;
    }

    /* renamed from: e */
    public final e50 mo17825e() {
        return new e50(this.f16892a.mo18094b(), (h40) null);
    }
}
