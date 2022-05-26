package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class kh0 extends C5481qd implements lh0 {
    /* renamed from: e7 */
    public static lh0 m26227e7(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
        return queryLocalInterface instanceof lh0 ? (lh0) queryLocalInterface : new jh0(iBinder);
    }
}
