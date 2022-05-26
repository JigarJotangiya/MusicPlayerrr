package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class dg2 implements rg2<Bundle> {

    /* renamed from: a */
    public final String f15607a;

    /* renamed from: b */
    public final String f15608b;

    /* renamed from: c */
    public final String f15609c;

    /* renamed from: d */
    public final String f15610d;

    /* renamed from: e */
    public final Long f15611e;

    public dg2(String str, String str2, String str3, String str4, Long l) {
        this.f15607a = str;
        this.f15608b = str2;
        this.f15609c = str3;
        this.f15610d = str4;
        this.f15611e = l;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15742b(Object obj) {
        Bundle bundle = (Bundle) obj;
        fq2.m23779c(bundle, "gmp_app_id", this.f15607a);
        fq2.m23779c(bundle, "fbs_aiid", this.f15608b);
        fq2.m23779c(bundle, "fbs_aeid", this.f15609c);
        fq2.m23779c(bundle, "apm_id_origin", this.f15610d);
        Long l = this.f15611e;
        if (l != null) {
            bundle.putLong("sai_timeout", l.longValue());
        }
    }
}
