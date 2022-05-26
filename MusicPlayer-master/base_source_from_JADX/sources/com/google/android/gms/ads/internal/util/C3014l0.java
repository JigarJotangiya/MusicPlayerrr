package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.C4955c6;
import com.google.android.gms.internal.ads.C5695w5;
import com.google.android.gms.internal.ads.ul0;

/* renamed from: com.google.android.gms.ads.internal.util.l0 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C3014l0 implements C5695w5 {

    /* renamed from: a */
    final /* synthetic */ String f10042a;

    /* renamed from: b */
    final /* synthetic */ C3023o0 f10043b;

    C3014l0(C3032r0 r0Var, String str, C3023o0 o0Var) {
        this.f10042a = str;
        this.f10043b = o0Var;
    }

    /* renamed from: a */
    public final void mo11054a(C4955c6 c6Var) {
        String str = this.f10042a;
        String exc = c6Var.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(exc).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(exc);
        ul0.m31862g(sb.toString());
        this.f10043b.mo11064b(null);
    }
}
