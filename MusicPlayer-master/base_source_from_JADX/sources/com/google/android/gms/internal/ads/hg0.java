package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public abstract class hg0 extends C5481qd implements ig0 {
    public hg0() {
        super("com.google.android.gms.ads.internal.request.IAdRequestService");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d7 */
    public final boolean mo11115d7(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
        mg0 mg0 = null;
        if (i == 1) {
            zzcdc zzcdc = (zzcdc) C5518rd.m30059a(parcel, zzcdc.CREATOR);
            parcel2.writeNoException();
            C5518rd.m30063e(parcel2, (Parcelable) null);
        } else if (i == 2) {
            zzcdc zzcdc2 = (zzcdc) C5518rd.m30059a(parcel, zzcdc.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.request.IAdResponseListener");
                if (queryLocalInterface instanceof jg0) {
                    jg0 jg0 = (jg0) queryLocalInterface;
                }
            }
            parcel2.writeNoException();
        } else if (i == 4) {
            zzcdq zzcdq = (zzcdq) C5518rd.m30059a(parcel, zzcdq.CREATOR);
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            if (readStrongBinder2 != null) {
                IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                mg0 = queryLocalInterface2 instanceof mg0 ? (mg0) queryLocalInterface2 : new kg0(readStrongBinder2);
            }
            mo17908c3(zzcdq, mg0);
            parcel2.writeNoException();
        } else if (i == 5) {
            zzcdq zzcdq2 = (zzcdq) C5518rd.m30059a(parcel, zzcdq.CREATOR);
            IBinder readStrongBinder3 = parcel.readStrongBinder();
            if (readStrongBinder3 != null) {
                IInterface queryLocalInterface3 = readStrongBinder3.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                mg0 = queryLocalInterface3 instanceof mg0 ? (mg0) queryLocalInterface3 : new kg0(readStrongBinder3);
            }
            mo17906L0(zzcdq2, mg0);
            parcel2.writeNoException();
        } else if (i == 6) {
            zzcdq zzcdq3 = (zzcdq) C5518rd.m30059a(parcel, zzcdq.CREATOR);
            IBinder readStrongBinder4 = parcel.readStrongBinder();
            if (readStrongBinder4 != null) {
                IInterface queryLocalInterface4 = readStrongBinder4.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                mg0 = queryLocalInterface4 instanceof mg0 ? (mg0) queryLocalInterface4 : new kg0(readStrongBinder4);
            }
            mo17909v1(zzcdq3, mg0);
            parcel2.writeNoException();
        } else if (i != 7) {
            return false;
        } else {
            String readString = parcel.readString();
            IBinder readStrongBinder5 = parcel.readStrongBinder();
            if (readStrongBinder5 != null) {
                IInterface queryLocalInterface5 = readStrongBinder5.queryLocalInterface("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
                mg0 = queryLocalInterface5 instanceof mg0 ? (mg0) queryLocalInterface5 : new kg0(readStrongBinder5);
            }
            mo17907O0(readString, mg0);
            parcel2.writeNoException();
        }
        return true;
    }
}
