package com.google.android.gms.common.data;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;

/* renamed from: com.google.android.gms.common.data.a */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C3240a implements Parcelable.Creator<BitmapTeleporter> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        int i = 0;
        ParcelFileDescriptor parcelFileDescriptor = null;
        int i2 = 0;
        while (parcel.dataPosition() < F) {
            int z = C3313a.m14308z(parcel);
            int v = C3313a.m14304v(z);
            if (v == 1) {
                i = C3313a.m14277B(parcel, z);
            } else if (v == 2) {
                parcelFileDescriptor = (ParcelFileDescriptor) C3313a.m14297o(parcel, z, ParcelFileDescriptor.CREATOR);
            } else if (v != 3) {
                C3313a.m14280E(parcel, z);
            } else {
                i2 = C3313a.m14277B(parcel, z);
            }
        }
        C3313a.m14303u(parcel, F);
        return new BitmapTeleporter(i, parcelFileDescriptor, i2);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new BitmapTeleporter[i];
    }
}
