package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.C3313a;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.6.0 */
public final class r70 implements Parcelable.Creator<zzbtx> {
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int F = C3313a.m14281F(parcel);
        String str = null;
        Bundle bundle = null;
        while (parcel.dataPosition() < F) {
            int z = C3313a.m14308z(parcel);
            int v = C3313a.m14304v(z);
            if (v == 1) {
                str = C3313a.m14298p(parcel, z);
            } else if (v != 2) {
                C3313a.m14280E(parcel, z);
            } else {
                bundle = C3313a.m14288f(parcel, z);
            }
        }
        C3313a.m14303u(parcel, F);
        return new zzbtx(str, bundle);
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new zzbtx[i];
    }
}
