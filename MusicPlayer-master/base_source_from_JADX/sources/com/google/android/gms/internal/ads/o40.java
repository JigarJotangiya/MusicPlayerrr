package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.widget.FrameLayout;
import p159f.p243f.p245b.p246a.p248b.C4865b;
import p159f.p243f.p245b.p246a.p248b.C4866c;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class o40 extends C4866c<x20> {
    public o40() {
        super("com.google.android.gms.ads.NativeAdViewDelegateCreatorImpl");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* synthetic */ Object mo11842a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegateCreator");
        return queryLocalInterface instanceof x20 ? (x20) queryLocalInterface : new v20(iBinder);
    }

    /* renamed from: c */
    public final u20 mo19896c(Context context, FrameLayout frameLayout, FrameLayout frameLayout2) {
        try {
            IBinder P5 = ((x20) mo15605b(context)).mo21412P5(C4865b.m20503f2(context), C4865b.m20503f2(frameLayout), C4865b.m20503f2(frameLayout2), 214106000);
            if (P5 == null) {
                return null;
            }
            IInterface queryLocalInterface = P5.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
            return queryLocalInterface instanceof u20 ? (u20) queryLocalInterface : new s20(P5);
        } catch (RemoteException | C4866c.C4867a e) {
            ul0.m31863h("Could not create remote NativeAdViewDelegate.", e);
            return null;
        }
    }
}
