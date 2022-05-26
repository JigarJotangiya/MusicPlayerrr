package com.google.ads.mediation;

import com.google.android.gms.ads.C2894c;
import com.google.android.gms.ads.C3060l;
import com.google.android.gms.ads.admanager.C2889b;
import com.google.android.gms.ads.mediation.C3078i;
import com.google.android.gms.internal.ads.C5497qt;

/* renamed from: com.google.ads.mediation.h */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C2847h extends C2894c implements C2889b, C5497qt {

    /* renamed from: g */
    final AbstractAdViewAdapter f9660g;

    /* renamed from: h */
    final C3078i f9661h;

    public C2847h(AbstractAdViewAdapter abstractAdViewAdapter, C3078i iVar) {
        this.f9660g = abstractAdViewAdapter;
        this.f9661h = iVar;
    }

    /* renamed from: c */
    public final void mo10627c(String str, String str2) {
        this.f9661h.mo11207q(this.f9660g, str, str2);
    }

    /* renamed from: e */
    public final void mo10628e() {
        this.f9661h.mo11202a(this.f9660g);
    }

    /* renamed from: g */
    public final void mo10629g(C3060l lVar) {
        this.f9661h.mo11203e(this.f9660g, lVar);
    }

    /* renamed from: n */
    public final void mo10630n() {
        this.f9661h.mo11205i(this.f9660g);
    }

    /* renamed from: o */
    public final void mo10631o() {
        this.f9661h.mo11206n(this.f9660g);
    }

    /* renamed from: u0 */
    public final void mo10632u0() {
        this.f9661h.mo11204g(this.f9660g);
    }
}
