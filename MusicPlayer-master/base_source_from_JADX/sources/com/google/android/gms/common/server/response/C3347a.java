package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;
import com.google.android.gms.common.server.converter.zaa;
import com.google.android.gms.common.server.response.FastJsonResponse;

/* renamed from: com.google.android.gms.common.server.response.a */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C3347a implements Parcelable.Creator<FastJsonResponse.Field> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        String str = null;
        String str2 = null;
        zaa zaa = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        int i4 = 0;
        while (parcel.dataPosition() < F) {
            int z3 = C3313a.m14308z(parcel);
            switch (C3313a.m14304v(z3)) {
                case 1:
                    i = C3313a.m14277B(parcel, z3);
                    break;
                case 2:
                    i2 = C3313a.m14277B(parcel, z3);
                    break;
                case 3:
                    z = C3313a.m14305w(parcel, z3);
                    break;
                case 4:
                    i3 = C3313a.m14277B(parcel, z3);
                    break;
                case 5:
                    z2 = C3313a.m14305w(parcel, z3);
                    break;
                case 6:
                    str = C3313a.m14298p(parcel, z3);
                    break;
                case 7:
                    i4 = C3313a.m14277B(parcel, z3);
                    break;
                case 8:
                    str2 = C3313a.m14298p(parcel, z3);
                    break;
                case 9:
                    zaa = (zaa) C3313a.m14297o(parcel, z3, zaa.CREATOR);
                    break;
                default:
                    C3313a.m14280E(parcel, z3);
                    break;
            }
        }
        C3313a.m14303u(parcel, F);
        return new FastJsonResponse.Field(i, i2, z, i3, z2, str, i4, str2, zaa);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new FastJsonResponse.Field[i];
    }
}
