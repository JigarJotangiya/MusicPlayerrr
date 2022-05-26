package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class kr2 implements Parcelable.Creator<zzffu> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (parcel.dataPosition() < F) {
            int z = C3313a.m14308z(parcel);
            switch (C3313a.m14304v(z)) {
                case 1:
                    i = C3313a.m14277B(parcel, z);
                    break;
                case 2:
                    i2 = C3313a.m14277B(parcel, z);
                    break;
                case 3:
                    i3 = C3313a.m14277B(parcel, z);
                    break;
                case 4:
                    i4 = C3313a.m14277B(parcel, z);
                    break;
                case 5:
                    str = C3313a.m14298p(parcel, z);
                    break;
                case 6:
                    i5 = C3313a.m14277B(parcel, z);
                    break;
                case 7:
                    i6 = C3313a.m14277B(parcel, z);
                    break;
                default:
                    C3313a.m14280E(parcel, z);
                    break;
            }
        }
        C3313a.m14303u(parcel, F);
        return new zzffu(i, i2, i3, i4, str, i5, i6);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzffu[i];
    }
}
