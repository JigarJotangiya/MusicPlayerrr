package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class bh2 implements rg2<Bundle> {

    /* renamed from: a */
    public final String f14459a;

    /* renamed from: b */
    public final int f14460b;

    /* renamed from: c */
    public final int f14461c;

    /* renamed from: d */
    public final int f14462d;

    /* renamed from: e */
    public final boolean f14463e;

    /* renamed from: f */
    public final int f14464f;

    public bh2(String str, int i, int i2, int i3, boolean z, int i4) {
        this.f14459a = str;
        this.f14460b = i;
        this.f14461c = i2;
        this.f14462d = i3;
        this.f14463e = z;
        this.f14464f = i4;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15742b(Object obj) {
        Bundle bundle = (Bundle) obj;
        String str = this.f14459a;
        boolean z = true;
        fq2.m23783g(bundle, "carrier", str, !TextUtils.isEmpty(str));
        Integer valueOf = Integer.valueOf(this.f14460b);
        if (this.f14460b == -2) {
            z = false;
        }
        fq2.m23782f(bundle, "cnt", valueOf, z);
        bundle.putInt("gnt", this.f14461c);
        bundle.putInt("pt", this.f14462d);
        Bundle a = fq2.m23777a(bundle, "device");
        bundle.putBundle("device", a);
        Bundle a2 = fq2.m23777a(a, "network");
        a.putBundle("network", a2);
        a2.putInt("active_network_state", this.f14464f);
        a2.putBoolean("active_network_metered", this.f14463e);
    }
}
