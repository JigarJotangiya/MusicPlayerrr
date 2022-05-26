package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class cq0 implements Runnable {

    /* renamed from: g */
    final /* synthetic */ String f15127g;

    /* renamed from: h */
    final /* synthetic */ String f15128h;

    /* renamed from: i */
    final /* synthetic */ long f15129i;

    /* renamed from: j */
    final /* synthetic */ eq0 f15130j;

    cq0(eq0 eq0, String str, String str2, long j) {
        this.f15130j = eq0;
        this.f15127g = str;
        this.f15128h = str2;
        this.f15129i = j;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f15127g);
        hashMap.put("cachedSrc", this.f15128h);
        hashMap.put("totalDuration", Long.toString(this.f15129i));
        eq0.m23083g(this.f15130j, "onPrecacheEvent", hashMap);
    }
}
