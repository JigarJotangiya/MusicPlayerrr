package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;

/* renamed from: com.google.android.gms.internal.ads.xy */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C5761xy implements Parcelable.Creator<zzbkq> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < F) {
            int z4 = C3313a.m14308z(parcel);
            int v = C3313a.m14304v(z4);
            if (v == 2) {
                z = C3313a.m14305w(parcel, z4);
            } else if (v == 3) {
                z2 = C3313a.m14305w(parcel, z4);
            } else if (v != 4) {
                C3313a.m14280E(parcel, z4);
            } else {
                z3 = C3313a.m14305w(parcel, z4);
            }
        }
        C3313a.m14303u(parcel, F);
        return new zzbkq(z, z2, z3);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbkq[i];
    }
}
