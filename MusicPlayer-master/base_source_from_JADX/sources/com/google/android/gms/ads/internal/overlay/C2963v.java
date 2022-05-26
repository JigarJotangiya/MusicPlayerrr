package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.os.Bundle;
import com.google.android.gms.ads.internal.util.C3018m1;

/* renamed from: com.google.android.gms.ads.internal.overlay.v */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C2963v extends C2955n {
    public C2963v(Activity activity) {
        super(activity);
    }

    /* renamed from: U4 */
    public final void mo10872U4(Bundle bundle) {
        C3018m1.m13388k("AdOverlayParcel is null or does not contain valid overlay type.");
        this.f9901z = 4;
        this.f9882g.finish();
    }
}
