package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class eh0 extends C5481qd implements fh0 {
    public eh0() {
        super("com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d7 */
    public final boolean mo11115d7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i == 1) {
            String b = mo16633b();
            parcel2.writeNoException();
            parcel2.writeString(b);
        } else if (i != 2) {
            return false;
        } else {
            int a = mo16632a();
            parcel2.writeNoException();
            parcel2.writeInt(a);
        }
        return true;
    }
}
