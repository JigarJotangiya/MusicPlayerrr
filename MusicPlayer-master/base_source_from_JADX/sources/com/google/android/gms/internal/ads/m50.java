package com.google.android.gms.internal.ads;

import java.util.Map;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class m50 implements y50<pr0> {
    m50() {
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo15685a(Object obj, Map map) {
        JSONObject zza;
        pr0 pr0 = (pr0) obj;
        e20 U = pr0.mo17678U();
        if (U == null || (zza = U.zza()) == null) {
            pr0.mo16881r("nativeAdViewSignalsReady", new JSONObject());
        } else {
            pr0.mo16881r("nativeAdViewSignalsReady", zza);
        }
    }
}
