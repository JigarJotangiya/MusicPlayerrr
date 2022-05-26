package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import p159f.p243f.p245b.p246a.p248b.C4863a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class e40 extends C5444pd implements g40 {
    e40(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IShouldDelayBannerRenderingListener");
    }

    /* renamed from: s0 */
    public final boolean mo17113s0(C4863a aVar) throws RemoteException {
        Parcel z = mo20259z();
        C5518rd.m30064f(z, aVar);
        Parcel C0 = mo20255C0(2, z);
        boolean g = C5518rd.m30065g(C0);
        C0.recycle();
        return g;
    }
}
