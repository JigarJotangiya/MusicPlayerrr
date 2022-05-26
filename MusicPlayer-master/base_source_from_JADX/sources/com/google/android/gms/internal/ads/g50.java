package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.C2974a1;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class g50 implements y50 {

    /* renamed from: a */
    public static final /* synthetic */ g50 f16951a = new g50();

    private /* synthetic */ g50() {
    }

    /* renamed from: a */
    public final void mo15685a(Object obj, Map map) {
        rs0 rs0 = (rs0) obj;
        y50<pr0> y50 = x50.f25661a;
        String str = (String) map.get("u");
        if (str == null) {
            ul0.m31862g("URL missing from httpTrack GMSG.");
        } else {
            new C2974a1(rs0.getContext(), ((zs0) rs0).zzp().f27376g, str).mo10973b();
        }
    }
}
