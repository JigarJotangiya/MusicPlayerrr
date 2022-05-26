package com.google.android.gms.internal.ads;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.C3024o1;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class j71 {

    /* renamed from: a */
    private final wt2 f18377a;

    /* renamed from: b */
    private final zzcjf f18378b;

    /* renamed from: c */
    private final ApplicationInfo f18379c;

    /* renamed from: d */
    private final String f18380d;

    /* renamed from: e */
    private final List<String> f18381e;

    /* renamed from: f */
    private final PackageInfo f18382f;

    /* renamed from: g */
    private final sr3<d93<String>> f18383g;

    /* renamed from: h */
    private final String f18384h;

    /* renamed from: i */
    private final vg2<Bundle> f18385i;

    public j71(wt2 wt2, zzcjf zzcjf, ApplicationInfo applicationInfo, String str, List<String> list, PackageInfo packageInfo, sr3<d93<String>> sr3, C3024o1 o1Var, String str2, vg2<Bundle> vg2) {
        this.f18377a = wt2;
        this.f18378b = zzcjf;
        this.f18379c = applicationInfo;
        this.f18380d = str;
        this.f18381e = list;
        this.f18382f = packageInfo;
        this.f18383g = sr3;
        this.f18384h = str2;
        this.f18385i = vg2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final /* synthetic */ zzcdq mo18554a(d93 d93) throws Exception {
        return new zzcdq((Bundle) d93.get(), this.f18378b, this.f18379c, this.f18380d, this.f18381e, this.f18382f, (String) this.f18383g.mo10679a().get(), this.f18384h, (zzffu) null, (String) null);
    }

    /* renamed from: b */
    public final d93<Bundle> mo18555b() {
        wt2 wt2 = this.f18377a;
        return ft2.m23962c(this.f18385i.mo21501a(new Bundle()), pt2.SIGNALS, wt2).mo19534a();
    }

    /* renamed from: c */
    public final d93<zzcdq> mo18556c() {
        d93<Bundle> b = mo18555b();
        return this.f18377a.mo19823a(pt2.REQUEST_PARCEL, b, this.f18383g.mo10679a()).mo17015a(new i71(this, b)).mo19534a();
    }
}
