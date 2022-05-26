package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class x60 implements Parcelable.Creator<zzbta> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        String str = null;
        String[] strArr = null;
        String[] strArr2 = null;
        while (parcel.dataPosition() < F) {
            int z = C3313a.m14308z(parcel);
            int v = C3313a.m14304v(z);
            if (v == 1) {
                str = C3313a.m14298p(parcel, z);
            } else if (v == 2) {
                strArr = C3313a.m14299q(parcel, z);
            } else if (v != 3) {
                C3313a.m14280E(parcel, z);
            } else {
                strArr2 = C3313a.m14299q(parcel, z);
            }
        }
        C3313a.m14303u(parcel, F);
        return new zzbta(str, strArr, strArr2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbta[i];
    }
}
