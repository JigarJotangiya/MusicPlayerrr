package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class h50 implements y50 {

    /* renamed from: a */
    public static final /* synthetic */ h50 f17533a = new h50();

    private /* synthetic */ h50() {
    }

    /* renamed from: a */
    public final void mo15685a(Object obj, Map map) {
        ys0 ys0 = (ys0) obj;
        y50<pr0> y50 = x50.f25661a;
        String str = (String) map.get("tx");
        String str2 = (String) map.get("ty");
        String str3 = (String) map.get("td");
        try {
            int parseInt = Integer.parseInt(str);
            int parseInt2 = Integer.parseInt(str2);
            int parseInt3 = Integer.parseInt(str3);
            C5737xa J = ys0.mo17662J();
            if (J != null) {
                J.mo21999c().mo10841c(parseInt, parseInt2, parseInt3);
            }
        } catch (NumberFormatException unused) {
            ul0.m31862g("Could not parse touch parameters from gmsg.");
        }
    }
}
