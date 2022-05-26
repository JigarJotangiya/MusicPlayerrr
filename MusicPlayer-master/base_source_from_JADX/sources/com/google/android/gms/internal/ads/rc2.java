package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class rc2 implements rg2<Bundle> {

    /* renamed from: a */
    public final double f22819a;

    /* renamed from: b */
    public final boolean f22820b;

    public rc2(double d, boolean z) {
        this.f22819a = d;
        this.f22820b = z;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15742b(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle a = fq2.m23777a(bundle, "device");
        bundle.putBundle("device", a);
        Bundle a2 = fq2.m23777a(a, "battery");
        a.putBundle("battery", a2);
        a2.putBoolean("is_charging", this.f22820b);
        a2.putDouble("battery_level", this.f22819a);
    }
}
