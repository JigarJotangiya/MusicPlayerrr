package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.C2955n;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class p50 implements y50<pr0> {
    p50() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo15685a(Object obj, Map map) {
        pr0 pr0 = (pr0) obj;
        if (pr0.mo17655E() != null) {
            pr0.mo17655E().zza();
        }
        C2955n M = pr0.mo17667M();
        if (M != null) {
            M.mo10874a();
            return;
        }
        C2955n q = pr0.mo17704q();
        if (q != null) {
            q.mo10874a();
        } else {
            ul0.m31862g("A GMSG tried to close something that wasn't an overlay.");
        }
    }
}
