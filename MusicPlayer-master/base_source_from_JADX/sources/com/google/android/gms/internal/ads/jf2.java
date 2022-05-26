package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class jf2 implements rg2<Bundle> {

    /* renamed from: a */
    private final String f18471a;

    /* renamed from: b */
    private final String f18472b;

    public jf2(String str, String str2) {
        this.f18471a = str;
        this.f18472b = str2;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo15742b(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22358J4)).booleanValue()) {
            bundle.putString("request_id", this.f18472b);
        } else {
            bundle.putString("request_id", this.f18471a);
        }
    }
}
