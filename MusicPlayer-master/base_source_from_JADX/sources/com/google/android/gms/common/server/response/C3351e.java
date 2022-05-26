package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;

/* renamed from: com.google.android.gms.common.server.response.e */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C3351e implements Parcelable.Creator<SafeParcelResponse> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        Parcel parcel2 = null;
        zan zan = null;
        int i = 0;
        while (parcel.dataPosition() < F) {
            int z = C3313a.m14308z(parcel);
            int v = C3313a.m14304v(z);
            if (v == 1) {
                i = C3313a.m14277B(parcel, z);
            } else if (v == 2) {
                parcel2 = C3313a.m14295m(parcel, z);
            } else if (v != 3) {
                C3313a.m14280E(parcel, z);
            } else {
                zan = (zan) C3313a.m14297o(parcel, z, zan.CREATOR);
            }
        }
        C3313a.m14303u(parcel, F);
        return new SafeParcelResponse(i, parcel2, zan);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new SafeParcelResponse[i];
    }
}
