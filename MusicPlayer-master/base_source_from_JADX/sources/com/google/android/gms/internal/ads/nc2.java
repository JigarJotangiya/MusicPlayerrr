package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class nc2 implements rg2<Bundle> {

    /* renamed from: a */
    public final int f20582a;

    /* renamed from: b */
    public final boolean f20583b;

    /* renamed from: c */
    public final boolean f20584c;

    /* renamed from: d */
    public final int f20585d;

    /* renamed from: e */
    public final int f20586e;

    /* renamed from: f */
    public final int f20587f;

    /* renamed from: g */
    public final float f20588g;

    /* renamed from: h */
    public final boolean f20589h;

    public nc2(int i, boolean z, boolean z2, int i2, int i3, int i4, float f, boolean z3) {
        this.f20582a = i;
        this.f20583b = z;
        this.f20584c = z2;
        this.f20585d = i2;
        this.f20586e = i3;
        this.f20587f = i4;
        this.f20588g = f;
        this.f20589h = z3;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15742b(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putInt("am", this.f20582a);
        bundle.putBoolean("ma", this.f20583b);
        bundle.putBoolean("sp", this.f20584c);
        bundle.putInt("muv", this.f20585d);
        bundle.putInt("rm", this.f20586e);
        bundle.putInt("riv", this.f20587f);
        bundle.putFloat("android_app_volume", this.f20588g);
        bundle.putBoolean("android_app_muted", this.f20589h);
    }
}
