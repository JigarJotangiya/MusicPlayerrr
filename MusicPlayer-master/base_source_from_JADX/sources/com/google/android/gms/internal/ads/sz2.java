package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class sz2 implements Parcelable.Creator<zzfny> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        String str = null;
        String str2 = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < F) {
            int z = C3313a.m14308z(parcel);
            int v = C3313a.m14304v(z);
            if (v == 1) {
                i = C3313a.m14277B(parcel, z);
            } else if (v == 2) {
                i2 = C3313a.m14277B(parcel, z);
            } else if (v == 3) {
                str = C3313a.m14298p(parcel, z);
            } else if (v == 4) {
                str2 = C3313a.m14298p(parcel, z);
            } else if (v != 5) {
                C3313a.m14280E(parcel, z);
            } else {
                i3 = C3313a.m14277B(parcel, z);
            }
        }
        C3313a.m14303u(parcel, F);
        return new zzfny(i, i2, i3, str, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzfny[i];
    }
}
