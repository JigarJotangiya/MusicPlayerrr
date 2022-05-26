package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class i70 implements Parcelable.Creator<zzbtn> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        boolean z = false;
        String str = null;
        String str2 = null;
        int i = 0;
        while (parcel.dataPosition() < F) {
            int z2 = C3313a.m14308z(parcel);
            int v = C3313a.m14304v(z2);
            if (v == 1) {
                str = C3313a.m14298p(parcel, z2);
            } else if (v == 2) {
                z = C3313a.m14305w(parcel, z2);
            } else if (v == 3) {
                i = C3313a.m14277B(parcel, z2);
            } else if (v != 4) {
                C3313a.m14280E(parcel, z2);
            } else {
                str2 = C3313a.m14298p(parcel, z2);
            }
        }
        C3313a.m14303u(parcel, F);
        return new zzbtn(str, z, i, str2);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbtn[i];
    }
}
