package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class qf0 implements Parcelable.Creator<zzcco> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        IBinder iBinder = null;
        IBinder iBinder2 = null;
        while (parcel.dataPosition() < F) {
            int z = C3313a.m14308z(parcel);
            int v = C3313a.m14304v(z);
            if (v == 1) {
                iBinder = C3313a.m14276A(parcel, z);
            } else if (v != 2) {
                C3313a.m14280E(parcel, z);
            } else {
                iBinder2 = C3313a.m14276A(parcel, z);
            }
        }
        C3313a.m14303u(parcel, F);
        return new zzcco(iBinder, iBinder2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcco[i];
    }
}
