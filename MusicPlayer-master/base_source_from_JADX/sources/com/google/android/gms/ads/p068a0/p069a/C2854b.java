package com.google.android.gms.ads.p068a0.p069a;

import android.util.Pair;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.a0.a.b */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C2854b extends LinkedHashMap<String, Pair<Long, String>> {
    final /* synthetic */ C2873l zza;

    C2854b(C2873l lVar) {
        this.zza = lVar;
    }

    /* access modifiers changed from: protected */
    public final boolean removeEldestEntry(Map.Entry<String, Pair<Long, String>> entry) {
        return size() > this.zza.f9744a;
    }
}
