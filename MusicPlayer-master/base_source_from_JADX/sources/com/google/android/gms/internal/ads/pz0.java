package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class pz0 implements wy0 {

    /* renamed from: a */
    private final ew1 f21765a;

    pz0(ew1 ew1) {
        this.f21765a = ew1;
    }

    /* renamed from: a */
    public final void mo15988a(Map<String, String> map) {
        String str = map.get("test_mode_enabled");
        if (!TextUtils.isEmpty(str)) {
            this.f21765a.mo17373l(str.equals("true"));
        }
    }
}
