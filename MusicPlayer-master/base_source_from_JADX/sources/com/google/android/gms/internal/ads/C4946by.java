package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.p075y.C3128b;
import com.google.android.gms.ads.p075y.C3129c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.by */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
final class C4946by extends n70 {

    /* renamed from: g */
    final /* synthetic */ C4983cy f14731g;

    /* synthetic */ C4946by(C4983cy cyVar, C4909ay ayVar) {
        this.f14731g = cyVar;
    }

    /* renamed from: d5 */
    public final void mo16424d5(List<zzbtn> list) throws RemoteException {
        this.f14731g.f15366d = false;
        this.f14731g.f15367e = true;
        C3128b b = C4983cy.m22204o(list);
        ArrayList f = C4983cy.m22198d().f15363a;
        int size = f.size();
        for (int i = 0; i < size; i++) {
            ((C3129c) f.get(i)).mo11387a(b);
        }
        C4983cy.m22198d().f15363a.clear();
    }
}
