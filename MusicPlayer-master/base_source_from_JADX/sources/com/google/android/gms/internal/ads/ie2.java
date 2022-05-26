package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ie2 implements rg2<Bundle> {

    /* renamed from: a */
    public final Bundle f17967a;

    public ie2(Bundle bundle) {
        this.f17967a = bundle;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15742b(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle a = fq2.m23777a(bundle, "device");
        a.putBundle("android_mem_info", this.f17967a);
        bundle.putBundle("device", a);
    }
}
