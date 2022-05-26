package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class me2 implements rg2<Bundle> {

    /* renamed from: a */
    public final ap2 f20030a;

    public me2(ap2 ap2) {
        this.f20030a = ap2;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15742b(Object obj) {
        Bundle bundle = (Bundle) obj;
        ap2 ap2 = this.f20030a;
        if (ap2 != null) {
            bundle.putBoolean("render_in_browser", ap2.mo15922d());
            bundle.putBoolean("disable_ml", this.f20030a.mo15921c());
        }
    }
}
