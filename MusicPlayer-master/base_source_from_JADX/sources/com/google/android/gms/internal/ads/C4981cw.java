package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.ads.cw */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class C4981cw extends C5481qd implements C5018dw {
    /* renamed from: e7 */
    public static C5018dw m22191e7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdMetadataListener");
        return queryLocalInterface instanceof C5018dw ? (C5018dw) queryLocalInterface : new C4944bw(iBinder);
    }
}
