package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;

/* renamed from: com.google.android.gms.common.server.converter.a */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C3343a implements Parcelable.Creator<zaa> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        int i = 0;
        StringToIntConverter stringToIntConverter = null;
        while (parcel.dataPosition() < F) {
            int z = C3313a.m14308z(parcel);
            int v = C3313a.m14304v(z);
            if (v == 1) {
                i = C3313a.m14277B(parcel, z);
            } else if (v != 2) {
                C3313a.m14280E(parcel, z);
            } else {
                stringToIntConverter = (StringToIntConverter) C3313a.m14297o(parcel, z, StringToIntConverter.CREATOR);
            }
        }
        C3313a.m14303u(parcel, F);
        return new zaa(i, stringToIntConverter);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zaa[i];
    }
}
