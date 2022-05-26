package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ez0 implements wy0 {

    /* renamed from: a */
    private final ew1 f16381a;

    ez0(ew1 ew1) {
        this.f16381a = ew1;
    }

    /* renamed from: a */
    public final void mo15988a(Map<String, String> map) {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22543i6)).booleanValue()) {
            String str = map.get("policy_violations");
            if (!TextUtils.isEmpty(str)) {
                this.f16381a.mo17372k(str);
            }
        }
    }
}
