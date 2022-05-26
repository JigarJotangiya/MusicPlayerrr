package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class fi1 implements j41<o41> {

    /* renamed from: a */
    private final Map<String, k22<o41>> f16636a;

    /* renamed from: b */
    private final Map<String, k22<vj1>> f16637b;

    /* renamed from: c */
    private final Map<String, b52<vj1>> f16638c;

    /* renamed from: d */
    private final ms3<j41<e21>> f16639d;

    /* renamed from: e */
    private final mk1 f16640e;

    fi1(Map<String, k22<o41>> map, Map<String, k22<vj1>> map2, Map<String, b52<vj1>> map3, ms3<j41<e21>> ms3, mk1 mk1) {
        this.f16636a = map;
        this.f16637b = map2;
        this.f16638c = map3;
        this.f16639d = ms3;
        this.f16640e = mk1;
    }

    /* renamed from: a */
    public final k22<o41> mo17537a(int i, String str) {
        k22 a;
        k22<o41> k22 = this.f16636a.get(str);
        if (k22 != null) {
            return k22;
        }
        if (i != 1) {
            if (i != 4) {
                return null;
            }
            b52 b52 = this.f16638c.get(str);
            if (b52 != null) {
                return new l22(b52, n41.f20508a);
            }
            k22 k222 = this.f16637b.get(str);
            if (k222 == null) {
                return null;
            }
            return o41.m28282a(k222);
        } else if (this.f16640e.mo19405e() == null || (a = this.f16639d.mo10679a().mo17537a(i, str)) == null) {
            return null;
        } else {
            return o41.m28282a(a);
        }
    }
}
