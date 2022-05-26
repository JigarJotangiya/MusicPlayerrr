package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class gf0 extends C5481qd implements hf0 {
    /* renamed from: e7 */
    public static hf0 m24310e7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.purchase.client.IInAppPurchaseListener");
        return queryLocalInterface instanceof hf0 ? (hf0) queryLocalInterface : new ef0(iBinder);
    }
}
