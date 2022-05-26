package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* renamed from: com.google.android.gms.internal.ads.dq */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C5012dq {

    /* renamed from: a */
    C5629ud f15722a;

    /* renamed from: b */
    boolean f15723b;

    public C5012dq() {
    }

    public C5012dq(Context context) {
        C5503qz.m29790c(context);
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22476a3)).booleanValue()) {
            try {
                this.f15722a = (C5629ud) zl0.m34659b(context, "com.google.android.gms.ads.clearcut.DynamiteClearcutLogger", C5827zp.f26850a);
                C4865b.m20503f2(context);
                this.f15722a.mo20825K4(C4865b.m20503f2(context), "GMA_SDK");
                this.f15723b = true;
            } catch (RemoteException | yl0 | NullPointerException unused) {
                ul0.m31857b("Cannot dynamite load clearcut");
            }
        }
    }
}
