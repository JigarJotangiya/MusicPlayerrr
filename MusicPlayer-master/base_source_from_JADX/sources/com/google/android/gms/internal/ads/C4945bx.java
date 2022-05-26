package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.bx */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class C4945bx extends C5481qd implements C4982cx {
    public C4945bx() {
        super("com.google.android.gms.ads.internal.client.IOnAdInspectorClosedListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d7 */
    public final boolean mo11115d7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        if (i != 1) {
            return false;
        }
        mo11145O1((zzbew) C5518rd.m30059a(parcel, zzbew.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}
