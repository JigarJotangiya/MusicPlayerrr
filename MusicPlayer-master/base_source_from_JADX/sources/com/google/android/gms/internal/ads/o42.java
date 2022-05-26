package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C2971s;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.C2956o;
import com.google.android.gms.ads.internal.overlay.C2958q;
import com.google.android.gms.ads.internal.overlay.C2966y;
import com.google.android.gms.ads.internal.util.C2979b2;
import com.google.android.gms.ads.internal.zzj;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
final class o42 implements yh1 {

    /* renamed from: a */
    private final Context f20897a;

    /* renamed from: b */
    private final zzcjf f20898b;

    /* renamed from: c */
    private final d93<sg1> f20899c;

    /* renamed from: d */
    private final bp2 f20900d;

    /* renamed from: e */
    private final pr0 f20901e;

    /* renamed from: f */
    private final up2 f20902f;

    /* renamed from: g */
    private final b60 f20903g;

    /* renamed from: h */
    private final boolean f20904h;

    o42(Context context, zzcjf zzcjf, d93<sg1> d93, bp2 bp2, pr0 pr0, up2 up2, boolean z, b60 b60) {
        this.f20897a = context;
        this.f20898b = zzcjf;
        this.f20899c = d93;
        this.f20900d = bp2;
        this.f20901e = pr0;
        this.f20902f = up2;
        this.f20903g = b60;
        this.f20904h = z;
    }

    /* renamed from: a */
    public final void mo15674a(boolean z, Context context, s81 s81) {
        sg1 sg1 = (sg1) s83.m30615q(this.f20899c);
        this.f20901e.mo17719z0(true);
        boolean e = this.f20904h ? this.f20903g.mo16082e(false) : false;
        C2971s.m13214q();
        zzj zzj = new zzj(e, C2979b2.m13265m(this.f20897a), this.f20904h ? this.f20903g.mo16081d() : false, this.f20904h ? this.f20903g.mo16078a() : 0.0f, -1, z, this.f20900d.f14620L, false);
        if (s81 != null) {
            s81.mo20807N0();
        }
        C2971s.m13208k();
        mh1 j = sg1.mo19289j();
        pr0 pr0 = this.f20901e;
        bp2 bp2 = this.f20900d;
        int i = bp2.f14622N;
        zzcjf zzcjf = this.f20898b;
        String str = bp2.f14611C;
        gp2 gp2 = bp2.f14665t;
        AdOverlayInfoParcel adOverlayInfoParcel = r4;
        AdOverlayInfoParcel adOverlayInfoParcel2 = new AdOverlayInfoParcel((C5497qt) null, (C2958q) j, (C2966y) null, pr0, i, zzcjf, str, zzj, gp2.f17224b, gp2.f17223a, this.f20902f.f24397f, s81);
        C2956o.m13114a(context, adOverlayInfoParcel, true);
    }
}
