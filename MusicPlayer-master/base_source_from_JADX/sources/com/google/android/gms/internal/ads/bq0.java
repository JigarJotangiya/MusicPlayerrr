package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class bq0 implements Runnable {

    /* renamed from: g */
    final /* synthetic */ String f14672g;

    /* renamed from: h */
    final /* synthetic */ String f14673h;

    /* renamed from: i */
    final /* synthetic */ int f14674i;

    /* renamed from: j */
    final /* synthetic */ eq0 f14675j;

    bq0(eq0 eq0, String str, String str2, int i) {
        this.f14675j = eq0;
        this.f14672g = str;
        this.f14673h = str2;
        this.f14674i = i;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheComplete");
        hashMap.put("src", this.f14672g);
        hashMap.put("cachedSrc", this.f14673h);
        hashMap.put("totalBytes", Integer.toString(this.f14674i));
        eq0.m23083g(this.f14675j, "onPrecacheEvent", hashMap);
    }
}
