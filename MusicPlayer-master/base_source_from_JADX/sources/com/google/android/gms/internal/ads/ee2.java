package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ee2 implements rg2<Bundle> {

    /* renamed from: a */
    private final String f15936a;

    /* renamed from: b */
    private final boolean f15937b;

    /* renamed from: c */
    private final boolean f15938c;

    public ee2(String str, boolean z, boolean z2) {
        this.f15936a = str;
        this.f15937b = z;
        this.f15938c = z2;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15742b(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!this.f15936a.isEmpty()) {
            bundle.putString("inspector_extras", this.f15936a);
        }
        bundle.putInt("test_mode", this.f15937b ? 1 : 0);
        bundle.putInt("linked_device", this.f15938c ? 1 : 0);
    }
}
