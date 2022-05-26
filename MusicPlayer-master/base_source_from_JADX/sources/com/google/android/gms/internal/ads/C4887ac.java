package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.ac */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C4887ac extends C5107g9<Integer, Long> {

    /* renamed from: b */
    public Long f13841b;

    /* renamed from: c */
    public Long f13842c;

    /* renamed from: d */
    public Long f13843d;

    /* renamed from: e */
    public Long f13844e;

    public C4887ac(String str) {
        HashMap a = C5107g9.m24213a(str);
        if (a != null) {
            this.f13841b = (Long) a.get(0);
            this.f13842c = (Long) a.get(1);
            this.f13843d = (Long) a.get(2);
            this.f13844e = (Long) a.get(3);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final HashMap<Integer, Long> mo15748b() {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        hashMap.put(0, this.f13841b);
        hashMap.put(1, this.f13842c);
        hashMap.put(2, this.f13843d);
        hashMap.put(3, this.f13844e);
        return hashMap;
    }
}
