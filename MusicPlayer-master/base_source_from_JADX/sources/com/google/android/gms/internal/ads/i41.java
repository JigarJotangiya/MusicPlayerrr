package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class i41<AdT> implements j41<AdT> {

    /* renamed from: a */
    private final Map<String, k22<AdT>> f17882a;

    i41(Map<String, k22<AdT>> map) {
        this.f17882a = map;
    }

    /* renamed from: a */
    public final k22<AdT> mo17537a(int i, String str) {
        return this.f17882a.get(str);
    }
}
