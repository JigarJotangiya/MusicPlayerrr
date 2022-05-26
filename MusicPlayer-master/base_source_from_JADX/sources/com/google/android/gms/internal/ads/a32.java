package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C2956o;
import com.google.android.gms.ads.internal.overlay.C2958q;
import com.google.android.gms.ads.internal.overlay.C2966y;
import com.google.android.gms.ads.internal.zzj;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class a32 implements yh1 {

    /* renamed from: a */
    private final zzcjf f13762a;

    /* renamed from: b */
    private final d93<p11> f13763b;

    /* renamed from: c */
    private final bp2 f13764c;

    /* renamed from: d */
    private final pr0 f13765d;

    /* renamed from: e */
    private final up2 f13766e;

    /* renamed from: f */
    private final b60 f13767f;

    /* renamed from: g */
    private final boolean f13768g;

    a32(zzcjf zzcjf, d93<p11> d93, bp2 bp2, pr0 pr0, up2 up2, boolean z, b60 b60) {
        this.f13762a = zzcjf;
        this.f13763b = d93;
        this.f13764c = bp2;
        this.f13765d = pr0;
        this.f13766e = up2;
        this.f13768g = z;
        this.f13767f = b60;
    }

    /* renamed from: a */
    public final void mo15674a(boolean z, Context context, s81 s81) {
        int i;
        p11 p11 = (p11) s83.m30615q(this.f13763b);
        this.f13765d.mo17719z0(true);
        zzj zzj = new zzj(this.f13768g ? this.f13767f.mo16082e(true) : true, true, this.f13768g ? this.f13767f.mo16081d() : false, this.f13768g ? this.f13767f.mo16078a() : 0.0f, -1, z, this.f13764c.f14620L, false);
        if (s81 != null) {
            s81.mo20807N0();
        }
        C2971s.m13208k();
        mh1 i2 = p11.mo20175i();
        pr0 pr0 = this.f13765d;
        int i3 = this.f13764c.f14622N;
        if (i3 == -1) {
            zzbfo zzbfo = this.f13766e.f24401j;
            if (zzbfo != null) {
                int i4 = zzbfo.f27238g;
                if (i4 == 1) {
                    i = 7;
                } else if (i4 == 2) {
                    i = 6;
                }
                zzcjf zzcjf = this.f13762a;
                bp2 bp2 = this.f13764c;
                String str = bp2.f14611C;
                gp2 gp2 = bp2.f14665t;
                AdOverlayInfoParcel adOverlayInfoParcel = r4;
                AdOverlayInfoParcel adOverlayInfoParcel2 = new AdOverlayInfoParcel((C5497qt) null, (C2958q) i2, (C2966y) null, pr0, i, zzcjf, str, zzj, gp2.f17224b, gp2.f17223a, this.f13766e.f24397f, s81);
                C2956o.m13114a(context, adOverlayInfoParcel, true);
            }
            ul0.m31857b("Error setting app open orientation; no targeting orientation available.");
            i3 = this.f13764c.f14622N;
        }
        i = i3;
        zzcjf zzcjf2 = this.f13762a;
        bp2 bp22 = this.f13764c;
        String str2 = bp22.f14611C;
        gp2 gp22 = bp22.f14665t;
        AdOverlayInfoParcel adOverlayInfoParcel3 = adOverlayInfoParcel2;
        AdOverlayInfoParcel adOverlayInfoParcel22 = new AdOverlayInfoParcel((C5497qt) null, (C2958q) i2, (C2966y) null, pr0, i, zzcjf2, str2, zzj, gp22.f17224b, gp22.f17223a, this.f13766e.f24397f, s81);
        C2956o.m13114a(context, adOverlayInfoParcel3, true);
    }
}
