package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import com.google.android.gms.ads.C2899d0;
import com.google.android.gms.ads.internal.util.C3044v0;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class q32 implements t22<e21, kq2, i42> {

    /* renamed from: a */
    private final Context f21800a;

    /* renamed from: b */
    private final c31 f21801b;

    /* renamed from: c */
    private final Executor f21802c;

    public q32(Context context, c31 c31, Executor executor) {
        this.f21800a = context;
        this.f21801b = c31;
        this.f21802c = executor;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: android.view.View} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object mo17870a(com.google.android.gms.internal.ads.np2 r7, com.google.android.gms.internal.ads.bp2 r8, com.google.android.gms.internal.ads.n22 r9) throws com.google.android.gms.internal.ads.zp2, com.google.android.gms.internal.ads.e62 {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.iz<java.lang.Boolean> r0 = com.google.android.gms.internal.ads.C5503qz.f22494c5
            com.google.android.gms.internal.ads.oz r1 = com.google.android.gms.internal.ads.C5054ev.m23225c()
            java.lang.Object r0 = r1.mo20153b(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L_0x0077
            boolean r0 = r8.f14644e0
            if (r0 == 0) goto L_0x0077
            AdapterT r0 = r9.f20467b
            com.google.android.gms.internal.ads.kq2 r0 = (com.google.android.gms.internal.ads.kq2) r0
            com.google.android.gms.internal.ads.lb0 r0 = r0.mo18968f()
            if (r0 == 0) goto L_0x0067
            f.f.b.a.b.a r2 = r0.zze()     // Catch:{ RemoteException -> 0x0060 }
            java.lang.Object r2 = p159f.p243f.p245b.p246a.p248b.C4865b.m20502K0(r2)     // Catch:{ RemoteException -> 0x0060 }
            android.view.View r2 = (android.view.View) r2     // Catch:{ RemoteException -> 0x0060 }
            boolean r0 = r0.mo16588c()     // Catch:{ RemoteException -> 0x0060 }
            if (r2 == 0) goto L_0x0053
            if (r0 == 0) goto L_0x007f
            com.google.android.gms.internal.ads.d93 r0 = com.google.android.gms.internal.ads.s83.m30607i(r1)
            com.google.android.gms.internal.ads.p32 r3 = new com.google.android.gms.internal.ads.p32
            r3.<init>(r6, r2, r8)
            com.google.android.gms.internal.ads.e93 r2 = com.google.android.gms.internal.ads.hm0.f17712e
            com.google.android.gms.internal.ads.d93 r0 = com.google.android.gms.internal.ads.s83.m30612n(r0, r3, r2)
            java.lang.Object r0 = r0.get()     // Catch:{ InterruptedException -> 0x004c, ExecutionException -> 0x004a }
            r2 = r0
            android.view.View r2 = (android.view.View) r2     // Catch:{ InterruptedException -> 0x004c, ExecutionException -> 0x004a }
            goto L_0x007f
        L_0x004a:
            r7 = move-exception
            goto L_0x004d
        L_0x004c:
            r7 = move-exception
        L_0x004d:
            com.google.android.gms.internal.ads.zp2 r8 = new com.google.android.gms.internal.ads.zp2
            r8.<init>(r7)
            throw r8
        L_0x0053:
            com.google.android.gms.internal.ads.zp2 r7 = new com.google.android.gms.internal.ads.zp2
            java.lang.Exception r8 = new java.lang.Exception
            java.lang.String r9 = "BannerAdapterWrapper interscrollerView should not be null"
            r8.<init>(r9)
            r7.<init>(r8)
            throw r7
        L_0x0060:
            r7 = move-exception
            com.google.android.gms.internal.ads.zp2 r8 = new com.google.android.gms.internal.ads.zp2
            r8.<init>(r7)
            throw r8
        L_0x0067:
            java.lang.String r7 = "getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."
            com.google.android.gms.internal.ads.ul0.m31859d(r7)
            com.google.android.gms.internal.ads.zp2 r8 = new com.google.android.gms.internal.ads.zp2
            java.lang.Exception r9 = new java.lang.Exception
            r9.<init>(r7)
            r8.<init>(r9)
            throw r8
        L_0x0077:
            AdapterT r0 = r9.f20467b
            com.google.android.gms.internal.ads.kq2 r0 = (com.google.android.gms.internal.ads.kq2) r0
            android.view.View r2 = r0.mo18966d()
        L_0x007f:
            com.google.android.gms.internal.ads.c31 r0 = r6.f21801b
            com.google.android.gms.internal.ads.w41 r3 = new com.google.android.gms.internal.ads.w41
            java.lang.String r4 = r9.f20466a
            r3.<init>(r7, r8, r4)
            com.google.android.gms.internal.ads.m21 r7 = new com.google.android.gms.internal.ads.m21
            AdapterT r4 = r9.f20467b
            com.google.android.gms.internal.ads.kq2 r4 = (com.google.android.gms.internal.ads.kq2) r4
            com.google.android.gms.internal.ads.o32 r5 = new com.google.android.gms.internal.ads.o32
            r5.<init>(r4)
            java.util.List<com.google.android.gms.internal.ads.cp2> r8 = r8.f14667v
            r4 = 0
            java.lang.Object r8 = r8.get(r4)
            com.google.android.gms.internal.ads.cp2 r8 = (com.google.android.gms.internal.ads.cp2) r8
            r7.<init>(r2, r1, r5, r8)
            com.google.android.gms.internal.ads.f21 r7 = r0.mo16463a(r3, r7)
            com.google.android.gms.internal.ads.sf1 r8 = r7.mo17459i()
            r8.mo20839N0(r2)
            com.google.android.gms.internal.ads.e91 r8 = r7.mo15975c()
            com.google.android.gms.internal.ads.rz0 r0 = new com.google.android.gms.internal.ads.rz0
            AdapterT r1 = r9.f20467b
            com.google.android.gms.internal.ads.kq2 r1 = (com.google.android.gms.internal.ads.kq2) r1
            r0.<init>(r1)
            java.util.concurrent.Executor r1 = r6.f21802c
            r8.mo21251D0(r0, r1)
            ListenerT r8 = r9.f20468c
            com.google.android.gms.internal.ads.i42 r8 = (com.google.android.gms.internal.ads.i42) r8
            com.google.android.gms.internal.ads.r72 r9 = r7.mo15977g()
            r8.mo18292f7(r9)
            com.google.android.gms.internal.ads.e21 r7 = r7.mo17458h()
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.q32.mo17870a(com.google.android.gms.internal.ads.np2, com.google.android.gms.internal.ads.bp2, com.google.android.gms.internal.ads.n22):java.lang.Object");
    }

    /* renamed from: b */
    public final void mo17871b(np2 np2, bp2 bp2, n22<kq2, i42> n22) throws zp2 {
        zzbfi a;
        zzbfi zzbfi = np2.f20682a.f18953a.f24396e;
        if (zzbfi.f27228t) {
            a = new zzbfi(this.f21800a, C2899d0.m12943d(zzbfi.f27219k, zzbfi.f27216h));
        } else {
            if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22494c5)).booleanValue() || !bp2.f14644e0) {
                a = yp2.m34266a(this.f21800a, bp2.f14667v);
            } else {
                a = new zzbfi(this.f21800a, C2899d0.m12944e(zzbfi.f27219k, zzbfi.f27216h));
            }
        }
        zzbfi zzbfi2 = a;
        if (!((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22494c5)).booleanValue() || !bp2.f14644e0) {
            ((kq2) n22.f20467b).mo18977o(this.f21800a, zzbfi2, np2.f20682a.f18953a.f24395d, bp2.f14668w.toString(), C3044v0.m13485l(bp2.f14665t), (ib0) n22.f20468c);
        } else {
            ((kq2) n22.f20467b).mo18978p(this.f21800a, zzbfi2, np2.f20682a.f18953a.f24395d, bp2.f14668w.toString(), C3044v0.m13485l(bp2.f14665t), (ib0) n22.f20468c);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ d93 mo20389c(View view, bp2 bp2, Object obj) throws Exception {
        return s83.m30607i(v31.m32132a(this.f21800a, view, bp2));
    }
}
