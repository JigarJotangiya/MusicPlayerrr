package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.C2890b;
import com.google.android.gms.ads.p070b0.C2893c;
import p159f.p243f.p245b.p246a.p248b.C4863a;
import p159f.p243f.p245b.p246a.p248b.C4865b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class pf0 {

    /* renamed from: d */
    private static ok0 f21395d;

    /* renamed from: a */
    private final Context f21396a;

    /* renamed from: b */
    private final C2890b f21397b;

    /* renamed from: c */
    private final C5686vx f21398c;

    public pf0(Context context, C2890b bVar, C5686vx vxVar) {
        this.f21396a = context;
        this.f21397b = bVar;
        this.f21398c = vxVar;
    }

    /* renamed from: a */
    public static ok0 m29001a(Context context) {
        ok0 ok0;
        synchronized (pf0.class) {
            if (f21395d == null) {
                f21395d = C4980cv.m22122a().mo15972n(context, new za0());
            }
            ok0 = f21395d;
        }
        return ok0;
    }

    /* renamed from: b */
    public final void mo20263b(C2893c cVar) {
        zzbfd zzbfd;
        ok0 a = m29001a(this.f21396a);
        if (a == null) {
            cVar.mo10699a("Internal Error, query info generator is null.");
            return;
        }
        C4863a f2 = C4865b.m20503f2(this.f21396a);
        C5686vx vxVar = this.f21398c;
        if (vxVar == null) {
            zzbfd = new C4905au().mo15950a();
        } else {
            zzbfd = C5016du.f15749a.mo17016a(this.f21396a, vxVar);
        }
        try {
            a.mo10683T1(f2, new zzchx((String) null, this.f21397b.name(), (zzbfi) null, zzbfd), new of0(this, cVar));
        } catch (RemoteException unused) {
            cVar.mo10699a("Internal Error.");
        }
    }
}
