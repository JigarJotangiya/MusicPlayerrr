package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class aq0 implements Runnable {

    /* renamed from: g */
    final /* synthetic */ String f14040g;

    /* renamed from: h */
    final /* synthetic */ String f14041h;

    /* renamed from: i */
    final /* synthetic */ int f14042i;

    /* renamed from: j */
    final /* synthetic */ int f14043j;

    /* renamed from: k */
    final /* synthetic */ long f14044k;

    /* renamed from: l */
    final /* synthetic */ long f14045l;

    /* renamed from: m */
    final /* synthetic */ boolean f14046m;

    /* renamed from: n */
    final /* synthetic */ int f14047n;

    /* renamed from: o */
    final /* synthetic */ int f14048o;

    /* renamed from: p */
    final /* synthetic */ eq0 f14049p;

    aq0(eq0 eq0, String str, String str2, int i, int i2, long j, long j2, boolean z, int i3, int i4) {
        this.f14049p = eq0;
        this.f14040g = str;
        this.f14041h = str2;
        this.f14042i = i;
        this.f14043j = i2;
        this.f14044k = j;
        this.f14045l = j2;
        this.f14046m = z;
        this.f14047n = i3;
        this.f14048o = i4;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f14040g);
        hashMap.put("cachedSrc", this.f14041h);
        hashMap.put("bytesLoaded", Integer.toString(this.f14042i));
        hashMap.put("totalBytes", Integer.toString(this.f14043j));
        hashMap.put("bufferedDuration", Long.toString(this.f14044k));
        hashMap.put("totalDuration", Long.toString(this.f14045l));
        hashMap.put("cacheReady", true != this.f14046m ? "0" : "1");
        hashMap.put("playerCount", Integer.toString(this.f14047n));
        hashMap.put("playerPreparedCount", Integer.toString(this.f14048o));
        eq0.m23083g(this.f14049p, "onPrecacheEvent", hashMap);
    }
}
