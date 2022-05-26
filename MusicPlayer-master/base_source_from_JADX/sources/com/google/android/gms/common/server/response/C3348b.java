package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* renamed from: com.google.android.gms.common.server.response.b */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C3348b implements Parcelable.Creator<zam> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        String str = null;
        FastJsonResponse.Field field = null;
        int i = 0;
        while (parcel.dataPosition() < F) {
            int z = C3313a.m14308z(parcel);
            int v = C3313a.m14304v(z);
            if (v == 1) {
                i = C3313a.m14277B(parcel, z);
            } else if (v == 2) {
                str = C3313a.m14298p(parcel, z);
            } else if (v != 3) {
                C3313a.m14280E(parcel, z);
            } else {
                field = (FastJsonResponse.Field) C3313a.m14297o(parcel, z, FastJsonResponse.Field.CREATOR);
            }
        }
        C3313a.m14303u(parcel, F);
        return new zam(i, str, field);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zam[i];
    }
}
