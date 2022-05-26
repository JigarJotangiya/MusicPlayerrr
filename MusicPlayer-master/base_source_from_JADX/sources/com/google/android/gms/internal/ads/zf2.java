package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class zf2 implements rg2<Bundle> {

    /* renamed from: a */
    private final String f26755a;

    public zf2(String str) {
        this.f26755a = str;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15742b(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!TextUtils.isEmpty(this.f26755a)) {
            bundle.putString("query_info", this.f26755a);
        }
    }
}
