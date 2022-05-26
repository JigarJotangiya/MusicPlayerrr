package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4865b;
import p159f.p243f.p245b.p246a.p248b.C4866c;

/* renamed from: com.google.android.gms.internal.ads.gy */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C5132gy extends C4866c<C5574sw> {
    public C5132gy() {
        super("com.google.android.gms.ads.MobileAdsSettingManagerCreatorImpl");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo11842a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManagerCreator");
        return queryLocalInterface instanceof C5574sw ? (C5574sw) queryLocalInterface : new C5574sw(iBinder);
    }

    /* renamed from: c */
    public final C5537rw mo18045c(Context context) {
        try {
            IBinder l3 = ((C5574sw) mo15605b(context)).mo20973l3(C4865b.m20503f2(context), 214106000);
            if (l3 == null) {
                return null;
            }
            IInterface queryLocalInterface = l3.queryLocalInterface("com.google.android.gms.ads.internal.client.IMobileAdsSettingManager");
            return queryLocalInterface instanceof C5537rw ? (C5537rw) queryLocalInterface : new C5426ow(l3);
        } catch (RemoteException | C4866c.C4867a e) {
            ul0.m31863h("Could not get remote MobileAdsSettingManager.", e);
            return null;
        }
    }
}
