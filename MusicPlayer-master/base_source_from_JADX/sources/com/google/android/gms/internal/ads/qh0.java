package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class qh0 implements Parcelable.Creator<zzces> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < F) {
            int z = C3313a.m14308z(parcel);
            int v = C3313a.m14304v(z);
            if (v == 2) {
                str = C3313a.m14298p(parcel, z);
            } else if (v != 3) {
                C3313a.m14280E(parcel, z);
            } else {
                i = C3313a.m14277B(parcel, z);
            }
        }
        C3313a.m14303u(parcel, F);
        return new zzces(str, i);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzces[i];
    }
}
