package com.google.android.gms.internal.ads;

import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.ads.pb */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class C5442pb extends C5107g9<Integer, Object> {

    /* renamed from: b */
    public Long f21382b;

    /* renamed from: c */
    public Boolean f21383c;

    /* renamed from: d */
    public Boolean f21384d;

    public C5442pb(String str) {
        HashMap a = C5107g9.m24213a(str);
        if (a != null) {
            this.f21382b = (Long) a.get(0);
            this.f21383c = (Boolean) a.get(1);
            this.f21384d = (Boolean) a.get(2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final HashMap<Integer, Object> mo15748b() {
        HashMap<Integer, Object> hashMap = new HashMap<>();
        hashMap.put(0, this.f21382b);
        hashMap.put(1, this.f21383c);
        hashMap.put(2, this.f21384d);
        return hashMap;
    }
}
