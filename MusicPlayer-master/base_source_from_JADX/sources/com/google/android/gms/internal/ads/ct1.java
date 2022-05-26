package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.p068a0.p069a.C2876o;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class ct1 {

    /* renamed from: a */
    private final ConcurrentHashMap<String, String> f15146a;

    /* renamed from: b */
    private final jl0 f15147b;

    public ct1(mt1 mt1, jl0 jl0) {
        this.f15146a = new ConcurrentHashMap<>(mt1.f21140a);
        this.f15147b = jl0;
    }

    /* renamed from: a */
    public final Map<String, String> mo16745a() {
        return this.f15146a;
    }

    /* renamed from: b */
    public final void mo16746b(np2 np2) {
        if (np2.f20683b.f20120a.size() > 0) {
            switch (np2.f20683b.f20120a.get(0).f14637b) {
                case 1:
                    this.f15146a.put("ad_format", "banner");
                    break;
                case 2:
                    this.f15146a.put("ad_format", "interstitial");
                    break;
                case 3:
                    this.f15146a.put("ad_format", "native_express");
                    break;
                case 4:
                    this.f15146a.put("ad_format", "native_advanced");
                    break;
                case 5:
                    this.f15146a.put("ad_format", "rewarded");
                    break;
                case 6:
                    this.f15146a.put("ad_format", "app_open_ad");
                    this.f15146a.put("as", true != this.f15147b.mo18660i() ? "0" : "1");
                    break;
                default:
                    this.f15146a.put("ad_format", "unknown");
                    break;
            }
        }
        if (!TextUtils.isEmpty(np2.f20683b.f20121b.f16050b)) {
            this.f15146a.put("gqi", np2.f20683b.f20121b.f16050b);
        }
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22386N4)).booleanValue()) {
            boolean d = C2876o.m12914d(np2);
            this.f15146a.put("scar", String.valueOf(d));
            if (d) {
                String b = C2876o.m12912b(np2);
                if (!TextUtils.isEmpty(b)) {
                    this.f15146a.put("ragent", b);
                }
                String a = C2876o.m12911a(np2);
                if (!TextUtils.isEmpty(a)) {
                    this.f15146a.put("rtype", a);
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo16747c(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.f15146a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.f15146a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
    }
}
