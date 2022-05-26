package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class c62 {

    /* renamed from: a */
    private final gq2 f14843a;

    /* renamed from: b */
    private final yq1 f14844b;

    /* renamed from: c */
    private final gt1 f14845c;

    /* renamed from: d */
    private final gu2 f14846d;

    public c62(gq2 gq2, yq1 yq1, gt1 gt1, gu2 gu2) {
        this.f14843a = gq2;
        this.f14844b = yq1;
        this.f14845c = gt1;
        this.f14846d = gu2;
    }

    /* renamed from: a */
    public final void mo16505a(ep2 ep2, bp2 bp2, int i, o22 o22, long j) {
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22352I5)).booleanValue()) {
            fu2 b = fu2.m23966b("adapter_status");
            b.mo17742g(ep2);
            b.mo17741f(bp2);
            b.mo17738a("adapter_l", String.valueOf(j));
            b.mo17738a("sc", Integer.toString(i));
            if (o22 != null) {
                b.mo17738a("arec", Integer.toString(o22.zzb().f27186g));
                String a = this.f14843a.mo18005a(o22.getMessage());
                if (a != null) {
                    b.mo17738a("areec", a);
                }
            }
            xq1 b2 = this.f14844b.mo22276b(bp2.f14666u);
            if (b2 != null) {
                b.mo17738a("ancn", b2.f25929a);
                zzcab zzcab = b2.f25930b;
                if (zzcab != null) {
                    b.mo17738a("adapter_v", zzcab.toString());
                }
                zzcab zzcab2 = b2.f25931c;
                if (zzcab2 != null) {
                    b.mo17738a("adapter_sv", zzcab2.toString());
                }
            }
            this.f14846d.mo18029a(b);
            return;
        }
        ft1 a2 = this.f14845c.mo18022a();
        a2.mo17732d(ep2);
        a2.mo17731c(bp2);
        a2.mo17730b("action", "adapter_status");
        a2.mo17730b("adapter_l", String.valueOf(j));
        a2.mo17730b("sc", Integer.toString(i));
        if (o22 != null) {
            a2.mo17730b("arec", Integer.toString(o22.zzb().f27186g));
            String a3 = this.f14843a.mo18005a(o22.getMessage());
            if (a3 != null) {
                a2.mo17730b("areec", a3);
            }
        }
        xq1 b3 = this.f14844b.mo22276b(bp2.f14666u);
        if (b3 != null) {
            a2.mo17730b("ancn", b3.f25929a);
            zzcab zzcab3 = b3.f25930b;
            if (zzcab3 != null) {
                a2.mo17730b("adapter_v", zzcab3.toString());
            }
            zzcab zzcab4 = b3.f25931c;
            if (zzcab4 != null) {
                a2.mo17730b("adapter_sv", zzcab4.toString());
            }
        }
        a2.mo17734f();
    }
}
