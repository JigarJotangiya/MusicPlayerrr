package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class n50 implements y50<pr0> {
    n50() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo15685a(Object obj, Map map) {
        JSONObject a;
        pr0 pr0 = (pr0) obj;
        e20 U = pr0.mo17678U();
        if (U == null || (a = U.mo15856a()) == null) {
            pr0.mo16881r("nativeClickMetaReady", new JSONObject());
        } else {
            pr0.mo16881r("nativeClickMetaReady", a);
        }
    }
}
