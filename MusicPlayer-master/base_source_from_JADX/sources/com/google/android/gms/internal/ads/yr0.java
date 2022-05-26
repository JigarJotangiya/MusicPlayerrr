package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.TrafficStats;
import com.google.android.gms.ads.internal.C2925a;
import com.google.android.gms.ads.internal.C2935k;
import com.google.android.gms.ads.internal.C2971s;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class yr0 implements e23 {

    /* renamed from: g */
    public final /* synthetic */ Context f26494g;

    /* renamed from: h */
    public final /* synthetic */ gt0 f26495h;

    /* renamed from: i */
    public final /* synthetic */ String f26496i;

    /* renamed from: j */
    public final /* synthetic */ boolean f26497j;

    /* renamed from: k */
    public final /* synthetic */ boolean f26498k;

    /* renamed from: l */
    public final /* synthetic */ C5737xa f26499l;

    /* renamed from: m */
    public final /* synthetic */ q00 f26500m;

    /* renamed from: n */
    public final /* synthetic */ zzcjf f26501n;

    /* renamed from: o */
    public final /* synthetic */ C2935k f26502o;

    /* renamed from: p */
    public final /* synthetic */ C2925a f26503p;

    /* renamed from: q */
    public final /* synthetic */ C5790yp f26504q;

    /* renamed from: r */
    public final /* synthetic */ bp2 f26505r;

    /* renamed from: s */
    public final /* synthetic */ ep2 f26506s;

    public /* synthetic */ yr0(Context context, gt0 gt0, String str, boolean z, boolean z2, C5737xa xaVar, q00 q00, zzcjf zzcjf, f00 f00, C2935k kVar, C2925a aVar, C5790yp ypVar, bp2 bp2, ep2 ep2) {
        this.f26494g = context;
        this.f26495h = gt0;
        this.f26496i = str;
        this.f26497j = z;
        this.f26498k = z2;
        this.f26499l = xaVar;
        this.f26500m = q00;
        this.f26501n = zzcjf;
        this.f26502o = kVar;
        this.f26503p = aVar;
        this.f26504q = ypVar;
        this.f26505r = bp2;
        this.f26506s = ep2;
    }

    public final Object zza() {
        Context context = this.f26494g;
        gt0 gt0 = this.f26495h;
        String str = this.f26496i;
        boolean z = this.f26497j;
        boolean z2 = this.f26498k;
        C5737xa xaVar = this.f26499l;
        q00 q00 = this.f26500m;
        zzcjf zzcjf = this.f26501n;
        C2935k kVar = this.f26502o;
        C2925a aVar = this.f26503p;
        C5790yp ypVar = this.f26504q;
        bp2 bp2 = this.f26505r;
        ep2 ep2 = this.f26506s;
        try {
            TrafficStats.setThreadStatsTag(264);
            int i = js0.f18577g0;
            fs0 fs0 = new fs0(new js0(new ft0(context), gt0, str, z, z2, xaVar, q00, zzcjf, (f00) null, kVar, aVar, ypVar, bp2, ep2));
            fs0.setWebViewClient(C2971s.m13215r().mo11024n(fs0, ypVar, z2));
            fs0.setWebChromeClient(new or0(fs0));
            return fs0;
        } finally {
            TrafficStats.clearThreadStatsTag();
        }
    }
}
