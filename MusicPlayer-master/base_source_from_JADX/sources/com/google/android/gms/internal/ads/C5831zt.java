package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4865b;
import p159f.p243f.p245b.p246a.p248b.C4866c;

/* renamed from: com.google.android.gms.internal.ads.zt */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C5831zt extends C4866c<C4907aw> {

    /* renamed from: c */
    private wf0 f26902c;

    public C5831zt() {
        super("com.google.android.gms.ads.AdManagerCreatorImpl");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo11842a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManagerCreator");
        return queryLocalInterface instanceof C4907aw ? (C4907aw) queryLocalInterface : new C4907aw(iBinder);
    }

    /* renamed from: c */
    public final C5833zv mo22429c(Context context, zzbfi zzbfi, String str, cb0 cb0, int i) {
        C5503qz.m29790c(context);
        if (((Boolean) C5054ev.m23225c().mo20153b(C5503qz.f22663x6)).booleanValue()) {
            try {
                IBinder l3 = ((C4907aw) zl0.m34659b(context, "com.google.android.gms.ads.ChimeraAdManagerCreatorImpl", C5794yt.f26513a)).mo15974l3(C4865b.m20503f2(context), zzbfi, str, cb0, 214106000, i);
                if (l3 == null) {
                    return null;
                }
                IInterface queryLocalInterface = l3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return queryLocalInterface instanceof C5833zv ? (C5833zv) queryLocalInterface : new C5758xv(l3);
            } catch (RemoteException | yl0 | NullPointerException e) {
                wf0 c = uf0.m31800c(context);
                this.f26902c = c;
                c.mo21260b(e, "AdManagerCreator.newAdManagerByDynamiteLoader");
                ul0.m31864i("#007 Could not call remote method.", e);
                return null;
            }
        } else {
            try {
                IBinder l32 = ((C4907aw) mo15605b(context)).mo15974l3(C4865b.m20503f2(context), zzbfi, str, cb0, 214106000, i);
                if (l32 == null) {
                    return null;
                }
                IInterface queryLocalInterface2 = l32.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdManager");
                return queryLocalInterface2 instanceof C5833zv ? (C5833zv) queryLocalInterface2 : new C5758xv(l32);
            } catch (RemoteException | C4866c.C4867a e2) {
                ul0.m31858c("Could not create remote AdManager.", e2);
                return null;
            }
        }
    }
}
