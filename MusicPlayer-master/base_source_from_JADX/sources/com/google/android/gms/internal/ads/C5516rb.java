package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.rb */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5516rb extends C5107g9<Integer, Long> {

    /* renamed from: b */
    public Long f22815b;

    /* renamed from: c */
    public Long f22816c;

    public C5516rb(String str) {
        HashMap a = C5107g9.m24213a(str);
        if (a != null) {
            this.f22815b = (Long) a.get(0);
            this.f22816c = (Long) a.get(1);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final HashMap<Integer, Long> mo15748b() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.f22815b);
        hashMap.put(1, this.f22816c);
        return hashMap;
    }
}
