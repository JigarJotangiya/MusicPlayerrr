package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class xb2 implements rg2<Bundle> {

    /* renamed from: a */
    private final zzbfo f25745a;

    /* renamed from: b */
    private final zzcjf f25746b;

    /* renamed from: c */
    private final boolean f25747c;

    public xb2(zzbfo zzbfo, zzcjf zzcjf, boolean z) {
        this.f25745a = zzbfo;
        this.f25746b = zzcjf;
        this.f25747c = z;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15742b(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (this.f25746b.f27378i >= ((Integer) C5054ev.m23225c().mo20153b(C5503qz.f22564l3)).intValue()) {
            bundle.putString("app_open_version", "2");
        }
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22572m3)).booleanValue()) {
            bundle.putBoolean("app_switched", this.f25747c);
        }
        zzbfo zzbfo = this.f25745a;
        if (zzbfo != null) {
            int i = zzbfo.f27238g;
            if (i == 1) {
                bundle.putString("avo", "p");
            } else if (i == 2) {
                bundle.putString("avo", "l");
            }
        }
    }
}
