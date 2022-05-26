package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C2956o;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class rd0 implements Runnable {

    /* renamed from: g */
    final /* synthetic */ AdOverlayInfoParcel f22822g;

    /* renamed from: h */
    final /* synthetic */ zzcaf f22823h;

    rd0(zzcaf zzcaf, AdOverlayInfoParcel adOverlayInfoParcel) {
        this.f22823h = zzcaf;
        this.f22822g = adOverlayInfoParcel;
    }

    public final void run() {
        C2971s.m13208k();
        C2956o.m13114a(this.f22823h.f27280a, this.f22822g, true);
    }
}
