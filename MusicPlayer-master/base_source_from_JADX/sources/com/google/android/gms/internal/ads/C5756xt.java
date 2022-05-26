package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4865b;
import p159f.p243f.p245b.p246a.p248b.C4866c;

/* renamed from: com.google.android.gms.internal.ads.xt */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C5756xt extends C4866c<C5721wv> {
    public C5756xt() {
        super("com.google.android.gms.ads.AdLoaderBuilderCreatorImpl");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo11842a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilderCreator");
        return queryLocalInterface instanceof C5721wv ? (C5721wv) queryLocalInterface : new C5721wv(iBinder);
    }

    /* renamed from: c */
    public final C5684vv mo22071c(Context context, String str, cb0 cb0) {
        try {
            IBinder l3 = ((C5721wv) mo15605b(context)).mo21923l3(C4865b.m20503f2(context), str, cb0, 214106000);
            if (l3 == null) {
                return null;
            }
            IInterface queryLocalInterface = l3.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
            return queryLocalInterface instanceof C5684vv ? (C5684vv) queryLocalInterface : new C5610tv(l3);
        } catch (RemoteException | C4866c.C4867a e) {
            ul0.m31863h("Could not create remote builder for AdLoader.", e);
            return null;
        }
    }
}
