package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.db */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C4997db extends C5107g9<Integer, Long> {

    /* renamed from: b */
    public long f15566b = -1;

    /* renamed from: c */
    public long f15567c = -1;

    public C4997db(String str) {
        HashMap a = C5107g9.m24213a(str);
        if (a != null) {
            this.f15566b = ((Long) a.get(0)).longValue();
            this.f15567c = ((Long) a.get(1)).longValue();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final HashMap<Integer, Long> mo15748b() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, Long.valueOf(this.f15566b));
        hashMap.put(1, Long.valueOf(this.f15567c));
        return hashMap;
    }
}
