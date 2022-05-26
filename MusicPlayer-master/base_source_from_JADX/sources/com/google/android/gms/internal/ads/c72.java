package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class c72 implements yh1 {

    /* renamed from: a */
    public final /* synthetic */ n22 f14849a;

    public /* synthetic */ c72(n22 n22) {
        this.f14849a = n22;
    }

    /* renamed from: a */
    public final void mo15674a(boolean z, Context context, s81 s81) {
        n22 n22 = this.f14849a;
        try {
            ((kq2) n22.f20467b).mo18986x(z);
            ((kq2) n22.f20467b).mo18961B();
        } catch (zp2 e) {
            ul0.m31863h("Cannot show rewarded video.", e);
            throw new xh1(e.getCause());
        }
    }
}
