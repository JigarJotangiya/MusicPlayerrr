package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class id2 implements rg2<Bundle> {

    /* renamed from: a */
    private final String f17958a;

    /* renamed from: b */
    private final String f17959b;

    /* renamed from: c */
    private final Bundle f17960c;

    /* synthetic */ id2(String str, String str2, Bundle bundle, hd2 hd2) {
        this.f17958a = str;
        this.f17959b = str2;
        this.f17960c = bundle;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15742b(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("consent_string", this.f17958a);
        bundle.putString("fc_consent", this.f17959b);
        bundle.putBundle("iab_consent_info", this.f17960c);
    }
}
