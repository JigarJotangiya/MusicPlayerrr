package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class rr2 {

    /* renamed from: a */
    private final HashMap<hr2, qr2<?, ?>> f22963a = new HashMap<>();

    /* renamed from: a */
    public final <R extends n71<AdT>, AdT extends g41> qr2<R, AdT> mo20737a(hr2 hr2, Context context, zq2 zq2, xr2<R, AdT> xr2) {
        qr2<R, AdT> qr2 = this.f22963a.get(hr2);
        if (qr2 != null) {
            return qr2;
        }
        er2 er2 = new er2(zzffu.m34971Y(hr2, context));
        qr2<R, AdT> qr22 = new qr2<>(er2, new zr2(er2, zq2, xr2));
        this.f22963a.put(hr2, qr22);
        return qr22;
    }
}
