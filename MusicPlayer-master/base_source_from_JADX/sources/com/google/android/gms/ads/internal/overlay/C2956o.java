package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C2979b2;
import com.google.android.gms.common.util.C3369n;
import com.google.android.gms.internal.ads.C5497qt;
import com.google.android.gms.internal.ads.yf1;

/* renamed from: com.google.android.gms.ads.internal.overlay.o */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C2956o {
    /* renamed from: a */
    public static final void m13114a(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z) {
        if (adOverlayInfoParcel.f9860q == 4 && adOverlayInfoParcel.f9852i == null) {
            C5497qt qtVar = adOverlayInfoParcel.f9851h;
            if (qtVar != null) {
                qtVar.mo10632u0();
            }
            yf1 yf1 = adOverlayInfoParcel.f9849E;
            if (yf1 != null) {
                yf1.mo15729o();
            }
            Activity i = adOverlayInfoParcel.f9853j.mo17241i();
            zzc zzc = adOverlayInfoParcel.f9850g;
            if (!(zzc == null || !zzc.f9922p || i == null)) {
                context = i;
            }
            C2971s.m13207j();
            zzc zzc2 = adOverlayInfoParcel.f9850g;
            C2940a.m13081b(context, zzc2, adOverlayInfoParcel.f9858o, zzc2 != null ? zzc2.f9921o : null);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.f9862s.f27379j);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
        if (!C3369n.m14475g()) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        C2971s.m13214q();
        C2979b2.m13269q(context, intent);
    }
}
