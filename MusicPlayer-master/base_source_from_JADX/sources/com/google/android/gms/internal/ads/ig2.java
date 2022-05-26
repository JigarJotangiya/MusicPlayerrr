package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ig2 implements rg2<Bundle> {

    /* renamed from: a */
    public final boolean f17986a;

    /* renamed from: b */
    public final boolean f17987b;

    /* renamed from: c */
    public final String f17988c;

    /* renamed from: d */
    public final boolean f17989d;

    /* renamed from: e */
    public final int f17990e;

    /* renamed from: f */
    public final int f17991f;

    /* renamed from: g */
    public final int f17992g;

    public ig2(boolean z, boolean z2, String str, boolean z3, int i, int i2, int i3) {
        this.f17986a = z;
        this.f17987b = z2;
        this.f17988c = str;
        this.f17989d = z3;
        this.f17990e = i;
        this.f17991f = i2;
        this.f17992g = i3;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15742b(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("js", this.f17988c);
        bundle.putBoolean("is_nonagon", true);
        bundle.putString("extra_caps", (String) C5054ev.m23225c().mo20153b(C5503qz.f22475a2));
        bundle.putInt("target_api", this.f17990e);
        bundle.putInt("dv", this.f17991f);
        bundle.putInt("lv", this.f17992g);
        Bundle a = fq2.m23777a(bundle, "sdk_env");
        a.putBoolean("mf", f10.f16401a.mo20989e().booleanValue());
        a.putBoolean("instant_app", this.f17986a);
        a.putBoolean("lite", this.f17987b);
        a.putBoolean("is_privileged_process", this.f17989d);
        bundle.putBundle("sdk_env", a);
        Bundle a2 = fq2.m23777a(a, "build_meta");
        a2.putString("cl", "428884702");
        a2.putString("rapid_rc", "dev");
        a2.putString("rapid_rollup", "HEAD");
        a.putBundle("build_meta", a2);
    }
}
