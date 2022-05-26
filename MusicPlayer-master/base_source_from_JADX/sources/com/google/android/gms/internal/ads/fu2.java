package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.p068a0.p069a.C2876o;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class fu2 {

    /* renamed from: a */
    private final HashMap<String, String> f16761a;

    /* renamed from: b */
    private final mu2 f16762b = new mu2(C2971s.m13198a());

    private fu2() {
        HashMap<String, String> hashMap = new HashMap<>();
        this.f16761a = hashMap;
        hashMap.put("new_csi", "1");
    }

    /* renamed from: b */
    public static fu2 m23966b(String str) {
        fu2 fu2 = new fu2();
        fu2.f16761a.put("action", str);
        return fu2;
    }

    /* renamed from: c */
    public static fu2 m23967c(String str) {
        fu2 fu2 = new fu2();
        fu2.f16761a.put("request_id", str);
        return fu2;
    }

    /* renamed from: a */
    public final fu2 mo17738a(String str, String str2) {
        this.f16761a.put(str, str2);
        return this;
    }

    /* renamed from: d */
    public final fu2 mo17739d(String str) {
        this.f16762b.mo19548b(str);
        return this;
    }

    /* renamed from: e */
    public final fu2 mo17740e(String str, String str2) {
        this.f16762b.mo19549c(str, str2);
        return this;
    }

    /* renamed from: f */
    public final fu2 mo17741f(bp2 bp2) {
        this.f16761a.put("aai", bp2.f14669x);
        return this;
    }

    /* renamed from: g */
    public final fu2 mo17742g(ep2 ep2) {
        if (!TextUtils.isEmpty(ep2.f16050b)) {
            this.f16761a.put("gqi", ep2.f16050b);
        }
        return this;
    }

    /* renamed from: h */
    public final fu2 mo17743h(np2 np2, jl0 jl0) {
        mp2 mp2 = np2.f20683b;
        mo17742g(mp2.f20121b);
        if (!mp2.f20120a.isEmpty()) {
            switch (mp2.f20120a.get(0).f14637b) {
                case 1:
                    this.f16761a.put("ad_format", "banner");
                    break;
                case 2:
                    this.f16761a.put("ad_format", "interstitial");
                    break;
                case 3:
                    this.f16761a.put("ad_format", "native_express");
                    break;
                case 4:
                    this.f16761a.put("ad_format", "native_advanced");
                    break;
                case 5:
                    this.f16761a.put("ad_format", "rewarded");
                    break;
                case 6:
                    this.f16761a.put("ad_format", "app_open_ad");
                    if (jl0 != null) {
                        this.f16761a.put("as", true != jl0.mo18660i() ? "0" : "1");
                        break;
                    }
                    break;
                default:
                    this.f16761a.put("ad_format", "unknown");
                    break;
            }
        }
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22386N4)).booleanValue()) {
            boolean d = C2876o.m12914d(np2);
            this.f16761a.put("scar", String.valueOf(d));
            if (d) {
                String b = C2876o.m12912b(np2);
                if (!TextUtils.isEmpty(b)) {
                    this.f16761a.put("ragent", b);
                }
                String a = C2876o.m12911a(np2);
                if (!TextUtils.isEmpty(a)) {
                    this.f16761a.put("rtype", a);
                }
            }
        }
        return this;
    }

    /* renamed from: i */
    public final fu2 mo17744i(Bundle bundle) {
        if (bundle.containsKey("cnt")) {
            this.f16761a.put("network_coarse", Integer.toString(bundle.getInt("cnt")));
        }
        if (bundle.containsKey("gnt")) {
            this.f16761a.put("network_fine", Integer.toString(bundle.getInt("gnt")));
        }
        return this;
    }

    /* renamed from: j */
    public final Map<String, String> mo17745j() {
        HashMap hashMap = new HashMap(this.f16761a);
        for (lu2 next : this.f16762b.mo19547a()) {
            hashMap.put(next.f19530a, next.f19531b);
        }
        return hashMap;
    }
}
