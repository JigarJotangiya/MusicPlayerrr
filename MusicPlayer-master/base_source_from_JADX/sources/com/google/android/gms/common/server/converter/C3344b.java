package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;
import java.util.ArrayList;

/* renamed from: com.google.android.gms.common.server.converter.b */
/* compiled from: com.google.android.gms:play-services-base@@17.6.0 */
public final class C3344b implements Parcelable.Creator<StringToIntConverter> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        int i = 0;
        ArrayList<zac> arrayList = null;
        while (parcel.dataPosition() < F) {
            int z = C3313a.m14308z(parcel);
            int v = C3313a.m14304v(z);
            if (v == 1) {
                i = C3313a.m14277B(parcel, z);
            } else if (v != 2) {
                C3313a.m14280E(parcel, z);
            } else {
                arrayList = C3313a.m14302t(parcel, z, zac.CREATOR);
            }
        }
        C3313a.m14303u(parcel, F);
        return new StringToIntConverter(i, arrayList);
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new StringToIntConverter[i];
    }
}
