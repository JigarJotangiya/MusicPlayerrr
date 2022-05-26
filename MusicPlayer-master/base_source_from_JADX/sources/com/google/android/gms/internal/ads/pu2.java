package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.util.C2979b2;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class pu2 {

    /* renamed from: a */
    private final Context f21524a;

    /* renamed from: b */
    private final String f21525b;

    /* renamed from: c */
    private final String f21526c;

    public pu2(Context context, zzcjf zzcjf) {
        this.f21524a = context;
        this.f21525b = context.getPackageName();
        this.f21526c = zzcjf.f27376g;
    }

    /* renamed from: a */
    public final void mo20320a(Map<String, String> map) {
        map.put("s", "gmob_sdk");
        map.put("v", "3");
        map.put("os", Build.VERSION.RELEASE);
        map.put("api_v", Build.VERSION.SDK);
        C2971s.m13214q();
        map.put("device", C2979b2.m13256f0());
        map.put("app", this.f21525b);
        C2971s.m13214q();
        map.put("is_lite_sdk", true != C2979b2.m13261i(this.f21524a) ? "0" : "1");
        List<String> b = C5503qz.m29789b();
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22343H4)).booleanValue()) {
            b.addAll(C2971s.m13213p().mo17562h().mo11088d().mo15850d());
        }
        map.put("e", TextUtils.join(",", b));
        map.put("sdkVersion", this.f21526c);
    }
}
