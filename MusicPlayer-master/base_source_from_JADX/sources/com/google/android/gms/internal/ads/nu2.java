package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class nu2 implements gu2 {

    /* renamed from: a */
    private final ru2 f20730a;

    /* renamed from: b */
    private final pu2 f20731b;

    /* renamed from: c */
    private final du2 f20732c;

    public nu2(du2 du2, ru2 ru2, pu2 pu2, byte[] bArr) {
        this.f20732c = du2;
        this.f20730a = ru2;
        this.f20731b = pu2;
    }

    /* renamed from: a */
    public final void mo18029a(fu2 fu2) {
        this.f20732c.mo17018b(mo18030b(fu2));
    }

    /* renamed from: b */
    public final String mo18030b(fu2 fu2) {
        ru2 ru2 = this.f20730a;
        Map<String, String> j = fu2.mo17745j();
        this.f20731b.mo20320a(j);
        return ru2.mo20742a(j);
    }
}
