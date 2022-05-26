package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class gc2 implements rg2<Bundle> {

    /* renamed from: a */
    private final String f17014a;

    /* renamed from: b */
    private final int f17015b;

    public gc2(String str, int i) {
        this.f17014a = str;
        this.f17015b = i;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15742b(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!TextUtils.isEmpty(this.f17014a) && this.f17015b != -1) {
            Bundle a = fq2.m23777a(bundle, "pii");
            bundle.putBundle("pii", a);
            a.putString("pvid", this.f17014a);
            a.putInt("pvid_s", this.f17015b);
        }
    }
}
