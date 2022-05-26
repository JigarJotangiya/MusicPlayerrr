package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class f20 implements Parcelable.Creator<zzbnw> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        zzbkq zzbkq = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        boolean z3 = false;
        int i4 = 0;
        while (parcel.dataPosition() < F) {
            int z4 = C3313a.m14308z(parcel);
            switch (C3313a.m14304v(z4)) {
                case 1:
                    i = C3313a.m14277B(parcel, z4);
                    break;
                case 2:
                    z = C3313a.m14305w(parcel, z4);
                    break;
                case 3:
                    i2 = C3313a.m14277B(parcel, z4);
                    break;
                case 4:
                    z2 = C3313a.m14305w(parcel, z4);
                    break;
                case 5:
                    i3 = C3313a.m14277B(parcel, z4);
                    break;
                case 6:
                    zzbkq = (zzbkq) C3313a.m14297o(parcel, z4, zzbkq.CREATOR);
                    break;
                case 7:
                    z3 = C3313a.m14305w(parcel, z4);
                    break;
                case 8:
                    i4 = C3313a.m14277B(parcel, z4);
                    break;
                default:
                    C3313a.m14280E(parcel, z4);
                    break;
            }
        }
        C3313a.m14303u(parcel, F);
        return new zzbnw(i, z, i2, z2, i3, zzbkq, z3, i4);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbnw[i];
    }
}
