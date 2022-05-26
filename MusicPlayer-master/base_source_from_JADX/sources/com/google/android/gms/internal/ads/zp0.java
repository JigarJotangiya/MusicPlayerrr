package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C2971s;
import java.util.HashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class zp0 implements Runnable {

    /* renamed from: g */
    final /* synthetic */ String f26851g;

    /* renamed from: h */
    final /* synthetic */ String f26852h;

    /* renamed from: i */
    final /* synthetic */ long f26853i;

    /* renamed from: j */
    final /* synthetic */ long f26854j;

    /* renamed from: k */
    final /* synthetic */ long f26855k;

    /* renamed from: l */
    final /* synthetic */ long f26856l;

    /* renamed from: m */
    final /* synthetic */ long f26857m;

    /* renamed from: n */
    final /* synthetic */ boolean f26858n;

    /* renamed from: o */
    final /* synthetic */ int f26859o;

    /* renamed from: p */
    final /* synthetic */ int f26860p;

    /* renamed from: q */
    final /* synthetic */ eq0 f26861q;

    zp0(eq0 eq0, String str, String str2, long j, long j2, long j3, long j4, long j5, boolean z, int i, int i2) {
        this.f26861q = eq0;
        this.f26851g = str;
        this.f26852h = str2;
        this.f26853i = j;
        this.f26854j = j2;
        this.f26855k = j3;
        this.f26856l = j4;
        this.f26857m = j5;
        this.f26858n = z;
        this.f26859o = i;
        this.f26860p = i2;
    }

    public final void run() {
        HashMap hashMap = new HashMap();
        hashMap.put("event", "precacheProgress");
        hashMap.put("src", this.f26851g);
        hashMap.put("cachedSrc", this.f26852h);
        hashMap.put("bufferedDuration", Long.toString(this.f26853i));
        hashMap.put("totalDuration", Long.toString(this.f26854j));
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22546j1)).booleanValue()) {
            hashMap.put("qoeLoadedBytes", Long.toString(this.f26855k));
            hashMap.put("qoeCachedBytes", Long.toString(this.f26856l));
            hashMap.put("totalBytes", Long.toString(this.f26857m));
            hashMap.put("reportTime", Long.toString(C2971s.m13198a().mo11988a()));
        }
        hashMap.put("cacheReady", true != this.f26858n ? "0" : "1");
        hashMap.put("playerCount", Integer.toString(this.f26859o));
        hashMap.put("playerPreparedCount", Integer.toString(this.f26860p));
        eq0.m23083g(this.f26861q, "onPrecacheEvent", hashMap);
    }
}
