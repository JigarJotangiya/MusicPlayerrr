package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.C4880a5;
import com.google.android.gms.internal.ads.C5695w5;
import com.google.android.gms.internal.ads.C5732x5;
import com.google.android.gms.internal.ads.C5770y6;
import com.google.android.gms.internal.ads.tl0;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.ads.internal.util.m0 */
/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class C3017m0 extends C5770y6 {

    /* renamed from: u */
    final /* synthetic */ byte[] f10046u;

    /* renamed from: v */
    final /* synthetic */ Map f10047v;

    /* renamed from: w */
    final /* synthetic */ tl0 f10048w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C3017m0(C3032r0 r0Var, int i, String str, C5732x5 x5Var, C5695w5 w5Var, byte[] bArr, Map map, tl0 tl0) {
        super(i, str, x5Var, w5Var);
        this.f10046u = bArr;
        this.f10047v = map;
        this.f10048w = tl0;
    }

    /* renamed from: E */
    public final byte[] mo11056E() throws C4880a5 {
        byte[] bArr = this.f10046u;
        if (bArr == null) {
            return null;
        }
        return bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: G */
    public final void mo11057G(String str) {
        this.f10048w.mo21109g(str);
        super.mo11057G(str);
    }

    /* renamed from: s */
    public final Map<String, String> mo11058s() throws C4880a5 {
        Map<String, String> map = this.f10047v;
        return map == null ? Collections.emptyMap() : map;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final /* bridge */ /* synthetic */ void mo11059v(Object obj) {
        mo11057G((String) obj);
    }
}
