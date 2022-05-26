package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C2971s;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class dq2 {

    /* renamed from: a */
    private final bp2 f15730a;

    /* renamed from: b */
    private final ep2 f15731b;

    /* renamed from: c */
    private final y12 f15732c;

    /* renamed from: d */
    private final lv2 f15733d;

    public dq2(y12 y12, lv2 lv2, bp2 bp2, ep2 ep2) {
        this.f15730a = bp2;
        this.f15731b = ep2;
        this.f15732c = y12;
        this.f15733d = lv2;
    }

    /* renamed from: a */
    public final void mo16987a(List<String> list) {
        for (String b : list) {
            mo16988b(b, 2);
        }
    }

    /* renamed from: b */
    public final void mo16988b(String str, int i) {
        if (!this.f15730a.f14648g0) {
            this.f15733d.mo19285b(str);
            return;
        }
        this.f15732c.mo22137x(new a22(C2971s.m13198a().mo11988a(), this.f15731b.f16050b, str, i));
    }

    /* renamed from: c */
    public final void mo16989c(List<String> list, int i) {
        for (String b : list) {
            mo16988b(b, i);
        }
    }
}
