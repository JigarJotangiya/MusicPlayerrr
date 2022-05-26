package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;

/* renamed from: com.google.android.gms.internal.ads.vn */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C5676vn implements ValueCallback<String> {

    /* renamed from: a */
    final /* synthetic */ C5713wn f24849a;

    C5676vn(C5713wn wnVar) {
        this.f24849a = wnVar;
    }

    /* renamed from: a */
    public final void onReceiveValue(String str) {
        C5713wn wnVar = this.f24849a;
        wnVar.f25467k.mo22260d(wnVar.f25464h, wnVar.f25465i, str, wnVar.f25466j);
    }
}
