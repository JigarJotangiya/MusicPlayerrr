package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zd2 implements rg2<Bundle> {

    /* renamed from: a */
    private final Boolean f26743a;

    public zd2(Boolean bool) {
        this.f26743a = bool;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15742b(Object obj) {
        Bundle bundle = (Bundle) obj;
        Boolean bool = this.f26743a;
        if (bool != null) {
            bundle.putBoolean("hw_accel", bool.booleanValue());
        }
    }
}
