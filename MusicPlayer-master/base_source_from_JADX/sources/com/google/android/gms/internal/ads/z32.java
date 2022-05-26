package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C2956o;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class z32 implements yh1 {

    /* renamed from: a */
    public final /* synthetic */ mm0 f26655a;

    public /* synthetic */ z32(mm0 mm0) {
        this.f26655a = mm0;
    }

    /* renamed from: a */
    public final void mo15674a(boolean z, Context context, s81 s81) {
        mm0 mm0 = this.f26655a;
        try {
            C2971s.m13208k();
            C2956o.m13114a(context, (AdOverlayInfoParcel) mm0.get(), true);
        } catch (Exception unused) {
        }
    }
}
