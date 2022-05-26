package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class rn1 implements C5824zm {

    /* renamed from: g */
    public final /* synthetic */ pr0 f22935g;

    public /* synthetic */ rn1(pr0 pr0) {
        this.f22935g = pr0;
    }

    /* renamed from: H0 */
    public final void mo16484H0(C5749xm xmVar) {
        pr0 pr0 = this.f22935g;
        HashMap hashMap = new HashMap();
        hashMap.put("isVisible", true != xmVar.f25884j ? "0" : "1");
        pr0.mo16880n0("onAdVisibilityChanged", hashMap);
    }
}
