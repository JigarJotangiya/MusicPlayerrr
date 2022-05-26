package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.d93;
import com.google.android.gms.internal.ads.km0;
import com.google.android.gms.internal.ads.tl0;
import com.google.android.gms.internal.ads.ul0;

/* renamed from: com.google.android.gms.ads.internal.util.l1 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C3015l1 {
    /* renamed from: a */
    public static void m13383a(Context context) {
        if (tl0.m31313k(context) && !tl0.m31315m()) {
            d93<?> b = new C3050x0(context).mo10973b();
            ul0.m31861f("Updating ad debug logging enablement.");
            km0.m26271a(b, "AdDebugLogUpdater.updateEnablement");
        }
    }
}
