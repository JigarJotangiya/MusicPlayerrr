package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class bm0 implements Parcelable.Creator<zzcjf> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < F) {
            int z3 = C3313a.m14308z(parcel);
            int v = C3313a.m14304v(z3);
            if (v == 2) {
                str = C3313a.m14298p(parcel, z3);
            } else if (v == 3) {
                i = C3313a.m14277B(parcel, z3);
            } else if (v == 4) {
                i2 = C3313a.m14277B(parcel, z3);
            } else if (v == 5) {
                z = C3313a.m14305w(parcel, z3);
            } else if (v != 6) {
                C3313a.m14280E(parcel, z3);
            } else {
                z2 = C3313a.m14305w(parcel, z3);
            }
        }
        C3313a.m14303u(parcel, F);
        return new zzcjf(str, i, i2, z, z2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzcjf[i];
    }
}
