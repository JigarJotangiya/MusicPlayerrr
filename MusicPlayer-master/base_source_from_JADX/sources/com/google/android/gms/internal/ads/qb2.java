package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class qb2 implements rg2<Bundle> {

    /* renamed from: a */
    private final Bundle f21896a;

    /* synthetic */ qb2(Bundle bundle, pb2 pb2) {
        this.f21896a = bundle;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15742b(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!this.f21896a.isEmpty()) {
            bundle.putBundle("installed_adapter_data", this.f21896a);
        }
    }
}
