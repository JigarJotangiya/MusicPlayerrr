package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.graphics.Bitmap;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C2977b0;
import com.google.android.gms.ads.internal.util.C2979b2;
import com.google.android.gms.ads.internal.util.C2992f;
import com.google.android.gms.ads.internal.zzj;

/* renamed from: com.google.android.gms.ads.internal.overlay.m */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C2954m extends C2977b0 {

    /* renamed from: c */
    final /* synthetic */ C2955n f9880c;

    /* synthetic */ C2954m(C2955n nVar, C2953l lVar) {
        this.f9880c = nVar;
    }

    /* renamed from: a */
    public final void mo10867a() {
        Bitmap a = C2971s.m13219v().mo11146a(Integer.valueOf(this.f9880c.f9883h.f9864u.f10142l));
        if (a != null) {
            C2992f r = C2971s.m13215r();
            C2955n nVar = this.f9880c;
            Activity activity = nVar.f9882g;
            zzj zzj = nVar.f9883h.f9864u;
            C2979b2.f9980i.post(new C2952k(this, r.mo11011c(activity, a, zzj.f10140j, zzj.f10141k)));
        }
    }
}
