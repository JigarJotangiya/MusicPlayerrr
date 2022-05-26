package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;

/* renamed from: com.google.android.gms.internal.ads.hu */
/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class C5165hu implements Parcelable.Creator<zzbfo> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        int i = 0;
        while (parcel.dataPosition() < F) {
            int z = C3313a.m14308z(parcel);
            if (C3313a.m14304v(z) != 2) {
                C3313a.m14280E(parcel, z);
            } else {
                i = C3313a.m14277B(parcel, z);
            }
        }
        C3313a.m14303u(parcel, F);
        return new zzbfo(i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbfo[i];
    }
}
