package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C2925a;
import com.google.android.gms.ads.internal.C2935k;
import com.google.android.gms.ads.internal.C2971s;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final /* synthetic */ class zr0 implements x73 {

    /* renamed from: a */
    public final /* synthetic */ Context f26884a;

    /* renamed from: b */
    public final /* synthetic */ C5737xa f26885b;

    /* renamed from: c */
    public final /* synthetic */ zzcjf f26886c;

    /* renamed from: d */
    public final /* synthetic */ C2925a f26887d;

    /* renamed from: e */
    public final /* synthetic */ String f26888e;

    public /* synthetic */ zr0(Context context, C5737xa xaVar, zzcjf zzcjf, C2925a aVar, String str) {
        this.f26884a = context;
        this.f26885b = xaVar;
        this.f26886c = zzcjf;
        this.f26887d = aVar;
        this.f26888e = str;
    }

    public final d93 zza() {
        Context context = this.f26884a;
        C5737xa xaVar = this.f26885b;
        zzcjf zzcjf = this.f26886c;
        C2925a aVar = this.f26887d;
        String str = this.f26888e;
        C2971s.m13197A();
        pr0 a = cs0.m22106a(context, gt0.m24492a(), BuildConfig.FLAVOR, false, false, xaVar, (q00) null, zzcjf, (f00) null, (C2935k) null, aVar, C5790yp.m34259a(), (bp2) null, (ep2) null);
        lm0 f = lm0.m26780f(a);
        a.mo17673Q0().mo17300d1(new xr0(f));
        a.loadUrl(str);
        return f;
    }
}
