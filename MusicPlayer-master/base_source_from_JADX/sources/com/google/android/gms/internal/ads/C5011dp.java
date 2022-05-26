package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.p072v.C3118a;

/* renamed from: com.google.android.gms.internal.ads.dp */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C5011dp {

    /* renamed from: a */
    private C5833zv f15712a;

    /* renamed from: b */
    private final Context f15713b;

    /* renamed from: c */
    private final String f15714c;

    /* renamed from: d */
    private final C5686vx f15715d;

    /* renamed from: e */
    private final int f15716e;

    /* renamed from: f */
    private final C3118a.C3119a f15717f;

    /* renamed from: g */
    private final za0 f15718g = new za0();

    /* renamed from: h */
    private final C5016du f15719h;

    public C5011dp(Context context, String str, C5686vx vxVar, int i, C3118a.C3119a aVar) {
        this.f15713b = context;
        this.f15714c = str;
        this.f15715d = vxVar;
        this.f15716e = i;
        this.f15717f = aVar;
        this.f15719h = C5016du.f15749a;
    }

    /* renamed from: a */
    public final void mo16982a() {
        try {
            this.f15712a = C4980cv.m22122a().mo15966d(this.f15713b, zzbfi.m34949m0(), this.f15714c, this.f15718g);
            zzbfo zzbfo = new zzbfo(this.f15716e);
            C5833zv zvVar = this.f15712a;
            if (zvVar != null) {
                zvVar.mo10939X5(zzbfo);
                this.f15712a.mo10954n6(new C5418oo(this.f15717f, this.f15714c));
                this.f15712a.mo10934O5(this.f15719h.mo17016a(this.f15713b, this.f15715d));
            }
        } catch (RemoteException e) {
            ul0.m31864i("#007 Could not call remote method.", e);
        }
    }
}
