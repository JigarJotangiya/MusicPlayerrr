package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.kv */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public abstract class C5277kv extends C5481qd implements C5314lv {
    public C5277kv() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d7 */
    public final boolean mo11115d7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        switch (i) {
            case 1:
                mo18747f();
                break;
            case 2:
                mo18751y(parcel.readInt());
                break;
            case 3:
                break;
            case 4:
                mo18748g();
                break;
            case 5:
                mo18749h();
                break;
            case 6:
                mo18744b();
                break;
            case 7:
                mo18745d();
                break;
            case 8:
                mo18750r((zzbew) C5518rd.m30059a(parcel, zzbew.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
