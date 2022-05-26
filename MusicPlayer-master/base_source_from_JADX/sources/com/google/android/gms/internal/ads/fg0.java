package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@20.6.0 */
public final class fg0 implements Parcelable.Creator<zzcde> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        boolean z = false;
        ArrayList<String> arrayList = null;
        while (parcel.dataPosition() < F) {
            int z2 = C3313a.m14308z(parcel);
            int v = C3313a.m14304v(z2);
            if (v == 2) {
                z = C3313a.m14305w(parcel, z2);
            } else if (v != 3) {
                C3313a.m14280E(parcel, z2);
            } else {
                arrayList = C3313a.m14300r(parcel, z2);
            }
        }
        C3313a.m14303u(parcel, F);
        return new zzcde(z, arrayList);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcde[i];
    }
}
