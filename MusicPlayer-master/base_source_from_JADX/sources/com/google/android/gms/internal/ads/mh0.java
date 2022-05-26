package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class mh0 implements Parcelable.Creator<zzcen> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        zzbfd zzbfd = null;
        String str = null;
        while (parcel.dataPosition() < F) {
            int z = C3313a.m14308z(parcel);
            int v = C3313a.m14304v(z);
            if (v == 2) {
                zzbfd = (zzbfd) C3313a.m14297o(parcel, z, zzbfd.CREATOR);
            } else if (v != 3) {
                C3313a.m14280E(parcel, z);
            } else {
                str = C3313a.m14298p(parcel, z);
            }
        }
        C3313a.m14303u(parcel, F);
        return new zzcen(zzbfd, str);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcen[i];
    }
}
