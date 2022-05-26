package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class xp0 implements Runnable {

    /* renamed from: g */
    final /* synthetic */ String f25917g;

    /* renamed from: h */
    final /* synthetic */ String f25918h;

    /* renamed from: i */
    final /* synthetic */ int f25919i;

    /* renamed from: j */
    final /* synthetic */ int f25920j;

    /* renamed from: k */
    final /* synthetic */ eq0 f25921k;

    xp0(eq0 eq0, String str, String str2, int i, int i2, boolean z) {
        this.f25921k = eq0;
        this.f25917g = str;
        this.f25918h = str2;
        this.f25919i = i;
        this.f25920j = i2;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f25917g);
        hashMap.put("cachedSrc", this.f25918h);
        hashMap.put("bytesLoaded", Integer.toString(this.f25919i));
        hashMap.put("totalBytes", Integer.toString(this.f25920j));
        hashMap.put("cacheReady", "0");
        eq0.m23083g(this.f25921k, "onPrecacheEvent", hashMap);
    }
}
