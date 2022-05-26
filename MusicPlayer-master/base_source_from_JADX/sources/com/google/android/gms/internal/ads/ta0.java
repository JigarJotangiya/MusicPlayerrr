package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4865b;
import p159f.p243f.p245b.p246a.p299d.p300a.C7450a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final /* synthetic */ class ta0 implements Runnable {

    /* renamed from: g */
    public final /* synthetic */ Context f23805g;

    /* renamed from: h */
    public final /* synthetic */ String f23806h;

    public /* synthetic */ ta0(va0 va0, Context context, String str) {
        this.f23805g = context;
        this.f23806h = str;
    }

    public final void run() {
        Context context = this.f23805g;
        String str = this.f23806h;
        C5503qz.m29790c(context);
        Bundle bundle = new Bundle();
        bundle.putBoolean("measurementEnabled", ((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22465Z)).booleanValue());
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22521g0)).booleanValue()) {
            bundle.putString("ad_storage", "denied");
            bundle.putString("analytics_storage", "denied");
        }
        try {
            ((lt0) zl0.m34659b(context, "com.google.android.gms.ads.measurement.DynamiteMeasurementManager", sa0.f23395a)).mo18733W6(C4865b.m20503f2(context), new ra0(C7450a.m41840k(context, "FA-Ads", "am", str, bundle)));
        } catch (RemoteException | yl0 | NullPointerException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }
}
