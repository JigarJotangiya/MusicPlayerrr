package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.C3018m1;
import com.google.android.gms.ads.internal.util.C3024o1;
import com.google.android.gms.common.util.C3359d;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class cj0 {

    /* renamed from: a */
    private final C3359d f14988a;

    /* renamed from: b */
    private final C3024o1 f14989b;

    /* renamed from: c */
    private final ck0 f14990c;

    cj0(C3359d dVar, C3024o1 o1Var, ck0 ck0) {
        this.f14988a = dVar;
        this.f14989b = o1Var;
        this.f14990c = ck0;
    }

    /* renamed from: a */
    public final void mo16644a() {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22537i0)).booleanValue()) {
            this.f14990c.mo16672y();
        }
    }

    /* renamed from: b */
    public final void mo16645b(int i, long j) {
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22529h0)).booleanValue()) {
            if (j - this.f14989b.zze() < 0) {
                C3018m1.m13388k("Receiving npa decision in the past, ignoring.");
                return;
            }
            if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22537i0)).booleanValue()) {
                this.f14989b.mo11080Y(-1);
                this.f14989b.mo11085b0(j);
            } else {
                this.f14989b.mo11080Y(i);
                this.f14989b.mo11085b0(j);
            }
            mo16644a();
        }
    }
}
