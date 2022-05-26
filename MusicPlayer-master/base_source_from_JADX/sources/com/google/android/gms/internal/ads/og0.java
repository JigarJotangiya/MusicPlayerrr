package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class og0 implements Parcelable.Creator<zzcdo> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        ParcelFileDescriptor parcelFileDescriptor = null;
        while (parcel.dataPosition() < F) {
            int z = C3313a.m14308z(parcel);
            if (C3313a.m14304v(z) != 2) {
                C3313a.m14280E(parcel, z);
            } else {
                parcelFileDescriptor = (ParcelFileDescriptor) C3313a.m14297o(parcel, z, ParcelFileDescriptor.CREATOR);
            }
        }
        C3313a.m14303u(parcel, F);
        return new zzcdo(parcelFileDescriptor);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcdo[i];
    }
}
